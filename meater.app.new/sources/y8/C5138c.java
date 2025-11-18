package y8;

import E8.p;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import r8.InterfaceC4363a;
import r8.r;

/* compiled from: AndroidKeystoreKmsClient.java */
/* renamed from: y8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5138c implements r {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f53232c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final String f53233d = "c";

    /* renamed from: a, reason: collision with root package name */
    private final String f53234a;

    /* renamed from: b, reason: collision with root package name */
    private KeyStore f53235b;

    /* compiled from: AndroidKeystoreKmsClient.java */
    /* renamed from: y8.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        String f53236a = null;

        /* renamed from: b, reason: collision with root package name */
        KeyStore f53237b;

        public a() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
            this.f53237b = null;
            if (!C5138c.g()) {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f53237b = keyStore;
                keyStore.load(null);
            } catch (IOException | GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public C5138c() {
        this(new a());
    }

    static boolean d(String str) {
        C5138c c5138c = new C5138c();
        synchronized (f53232c) {
            try {
                if (c5138c.f(str)) {
                    return false;
                }
                e(str);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static void e(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        String strB = E8.r.b("android-keystore://", str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(strB, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g() {
        return true;
    }

    private static void h() throws InterruptedException {
        try {
            Thread.sleep((int) (Math.random() * 40.0d));
        } catch (InterruptedException unused) {
        }
    }

    private static InterfaceC4363a i(InterfaceC4363a interfaceC4363a) throws KeyStoreException {
        byte[] bArrC = p.c(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(bArrC, interfaceC4363a.b(interfaceC4363a.a(bArrC, bArr), bArr))) {
            return interfaceC4363a;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    @Override // r8.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean a(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r2.f53234a     // Catch: java.lang.Throwable -> Le
            r1 = 1
            if (r0 == 0) goto L10
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L10
            monitor-exit(r2)
            return r1
        Le:
            r3 = move-exception
            goto L26
        L10:
            java.lang.String r0 = r2.f53234a     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L23
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = r3.toLowerCase(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = "android-keystore://"
            boolean r3 = r3.startsWith(r0)     // Catch: java.lang.Throwable -> Le
            if (r3 == 0) goto L23
            goto L24
        L23:
            r1 = 0
        L24:
            monitor-exit(r2)
            return r1
        L26:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.C5138c.a(java.lang.String):boolean");
    }

    @Override // r8.r
    public synchronized InterfaceC4363a b(String str) {
        try {
            String str2 = this.f53234a;
            if (str2 != null && !str2.equals(str)) {
                throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.f53234a, str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return i(new C5137b(E8.r.b("android-keystore://", str), this.f53235b));
    }

    synchronized boolean f(String str) {
        String strB;
        strB = E8.r.b("android-keystore://", str);
        try {
        } catch (NullPointerException unused) {
            Log.w(f53233d, "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                h();
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f53235b = keyStore;
                keyStore.load(null);
                return this.f53235b.containsAlias(strB);
            } catch (IOException e10) {
                throw new GeneralSecurityException(e10);
            }
        }
        return this.f53235b.containsAlias(strB);
    }

    private C5138c(a aVar) {
        this.f53234a = aVar.f53236a;
        this.f53235b = aVar.f53237b;
    }
}
