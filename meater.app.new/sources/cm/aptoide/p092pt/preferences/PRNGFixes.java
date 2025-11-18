package cm.aptoide.p092pt.preferences;

import android.os.Build;
import android.os.Process;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import java.security.Security;

/* loaded from: classes.dex */
public final class PRNGFixes {
    private static final byte[] BUILD_FINGERPRINT_AND_DEVICE_SERIAL = getBuildFingerprintAndDeviceSerial();
    private static final String TAG = "cm.aptoide.pt.preferences.PRNGFixes";
    private static final int VERSION_CODE_JELLY_BEAN = 16;
    private static final int VERSION_CODE_JELLY_BEAN_MR2 = 18;

    public static class LinuxPRNGSecureRandom extends SecureRandomSpi {
        private static final File URANDOM_FILE = new File("/dev/urandom");
        private static final Object sLock = new Object();
        private static DataInputStream sUrandomIn;
        private static OutputStream sUrandomOut;
        private boolean mSeeded;

        private DataInputStream getUrandomInputStream() {
            DataInputStream dataInputStream;
            synchronized (sLock) {
                if (sUrandomIn == null) {
                    try {
                        sUrandomIn = new DataInputStream(new FileInputStream(URANDOM_FILE));
                    } catch (IOException e2) {
                        throw new SecurityException("Failed to open " + URANDOM_FILE + " for reading", e2);
                    }
                }
                dataInputStream = sUrandomIn;
            }
            return dataInputStream;
        }

        private OutputStream getUrandomOutputStream() throws IOException {
            OutputStream outputStream;
            synchronized (sLock) {
                if (sUrandomOut == null) {
                    sUrandomOut = new FileOutputStream(URANDOM_FILE);
                }
                outputStream = sUrandomOut;
            }
            return outputStream;
        }

        @Override // java.security.SecureRandomSpi
        protected byte[] engineGenerateSeed(int i2) {
            byte[] bArr = new byte[i2];
            engineNextBytes(bArr);
            return bArr;
        }

        @Override // java.security.SecureRandomSpi
        protected void engineNextBytes(byte[] bArr) {
            DataInputStream urandomInputStream;
            if (!this.mSeeded) {
                engineSetSeed(PRNGFixes.generateSeed());
            }
            try {
                synchronized (sLock) {
                    urandomInputStream = getUrandomInputStream();
                }
                synchronized (urandomInputStream) {
                    urandomInputStream.readFully(bArr);
                }
            } catch (IOException e2) {
                throw new SecurityException("Failed to read from " + URANDOM_FILE, e2);
            }
        }

        @Override // java.security.SecureRandomSpi
        protected void engineSetSeed(byte[] bArr) {
            OutputStream urandomOutputStream;
            try {
                synchronized (sLock) {
                    urandomOutputStream = getUrandomOutputStream();
                }
                urandomOutputStream.write(bArr);
                urandomOutputStream.flush();
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.mSeeded = true;
                throw th;
            }
            this.mSeeded = true;
        }
    }

    private static class LinuxPRNGSecureRandomProvider extends Provider {
        public LinuxPRNGSecureRandomProvider() {
            super("LinuxPRNG", 1.0d, "A Linux-specific random number provider that uses /dev/urandom");
            put("SecureRandom.SHA1PRNG", LinuxPRNGSecureRandom.class.getName());
            put("SecureRandom.SHA1PRNG ImplementedIn", "Software");
        }
    }

    private PRNGFixes() {
    }

    public static void apply() throws Exception {
        applyOpenSSLFix();
        installLinuxPRNGSecureRandom();
    }

    private static void applyOpenSSLFix() throws IllegalAccessException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 16 || i2 > 18) {
            return;
        }
        try {
            Class.forName("org.apache.harmony.xnet.provider.jsse.NativeCrypto").getMethod("RAND_seed", byte[].class).invoke(null, generateSeed());
            int iIntValue = ((Integer) Class.forName("org.apache.harmony.xnet.provider.jsse.NativeCrypto").getMethod("RAND_load_file", String.class, Long.TYPE).invoke(null, "/dev/urandom", 1024)).intValue();
            if (iIntValue == 1024) {
                return;
            }
            throw new IOException("Unexpected number of bytes read from Linux PRNG: " + iIntValue);
        } catch (Exception e2) {
            throw new SecurityException("Failed to seed OpenSSL PRNG", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] generateSeed() throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeLong(System.currentTimeMillis());
            dataOutputStream.writeLong(System.nanoTime());
            dataOutputStream.writeInt(Process.myPid());
            dataOutputStream.writeInt(Process.myUid());
            dataOutputStream.write(BUILD_FINGERPRINT_AND_DEVICE_SERIAL);
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            throw new SecurityException("Failed to generate seed", e2);
        }
    }

    private static byte[] getBuildFingerprintAndDeviceSerial() {
        StringBuilder sb = new StringBuilder();
        String str = Build.FINGERPRINT;
        if (str != null) {
            sb.append(str);
        }
        String deviceSerialNumber = getDeviceSerialNumber();
        if (deviceSerialNumber != null) {
            sb.append(deviceSerialNumber);
        }
        try {
            return sb.toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 encoding not supported");
        }
    }

    private static String getDeviceSerialNumber() {
        try {
            return (String) Build.class.getField("SERIAL").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void installLinuxPRNGSecureRandom() throws NoSuchAlgorithmException, SecurityException {
        if (Build.VERSION.SDK_INT > 18) {
            return;
        }
        Provider[] providers = Security.getProviders("SecureRandom.SHA1PRNG");
        if (providers == null || providers.length < 1 || !LinuxPRNGSecureRandomProvider.class.equals(providers[0].getClass())) {
            Security.insertProviderAt(new LinuxPRNGSecureRandomProvider(), 1);
        }
        SecureRandom secureRandom = new SecureRandom();
        if (!LinuxPRNGSecureRandomProvider.class.equals(secureRandom.getProvider().getClass())) {
            throw new SecurityException("new SecureRandom() backed by wrong Provider: " + secureRandom.getProvider().getClass());
        }
        try {
            SecureRandom secureRandom2 = SecureRandom.getInstance("SHA1PRNG");
            if (LinuxPRNGSecureRandomProvider.class.equals(secureRandom2.getProvider().getClass())) {
                return;
            }
            throw new SecurityException("SecureRandom.getInstance(\"SHA1PRNG\") backed by wrong Provider: " + secureRandom2.getProvider().getClass());
        } catch (NoSuchAlgorithmException e2) {
            throw new SecurityException("SHA1PRNG not available", e2);
        }
    }
}
