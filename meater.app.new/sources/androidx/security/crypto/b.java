package androidx.security.crypto;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* compiled from: MasterKey.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f29308a;

    /* renamed from: b, reason: collision with root package name */
    private final KeyGenParameterSpec f29309b;

    /* compiled from: MasterKey.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29310a;

        static {
            int[] iArr = new int[c.values().length];
            f29310a = iArr;
            try {
                iArr[c.AES256_GCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: MasterKey.java */
    /* renamed from: androidx.security.crypto.b$b, reason: collision with other inner class name */
    public static final class C0404b {

        /* renamed from: a, reason: collision with root package name */
        final String f29311a;

        /* renamed from: b, reason: collision with root package name */
        KeyGenParameterSpec f29312b;

        /* renamed from: c, reason: collision with root package name */
        c f29313c;

        /* renamed from: d, reason: collision with root package name */
        boolean f29314d;

        /* renamed from: e, reason: collision with root package name */
        int f29315e;

        /* renamed from: f, reason: collision with root package name */
        boolean f29316f;

        /* renamed from: g, reason: collision with root package name */
        final Context f29317g;

        /* compiled from: MasterKey.java */
        /* renamed from: androidx.security.crypto.b$b$a */
        static class a {

            /* compiled from: MasterKey.java */
            /* renamed from: androidx.security.crypto.b$b$a$a, reason: collision with other inner class name */
            static class C0405a {
                static void a(KeyGenParameterSpec.Builder builder) {
                    builder.setIsStrongBoxBacked(true);
                }
            }

            /* compiled from: MasterKey.java */
            /* renamed from: androidx.security.crypto.b$b$a$b, reason: collision with other inner class name */
            static class C0406b {
                static void a(KeyGenParameterSpec.Builder builder, int i10, int i11) {
                    builder.setUserAuthenticationParameters(i10, i11);
                }
            }

            static b a(C0404b c0404b) {
                c cVar = c0404b.f29313c;
                if (cVar == null && c0404b.f29312b == null) {
                    throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
                }
                if (cVar == c.AES256_GCM) {
                    KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(c0404b.f29311a, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256);
                    if (c0404b.f29314d) {
                        keySize.setUserAuthenticationRequired(true);
                        if (Build.VERSION.SDK_INT >= 30) {
                            C0406b.a(keySize, c0404b.f29315e, 3);
                        } else {
                            keySize.setUserAuthenticationValidityDurationSeconds(c0404b.f29315e);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 28 && c0404b.f29316f && c0404b.f29317g.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                        C0405a.a(keySize);
                    }
                    c0404b.f29312b = keySize.build();
                }
                KeyGenParameterSpec keyGenParameterSpec = c0404b.f29312b;
                if (keyGenParameterSpec != null) {
                    return new b(e.c(keyGenParameterSpec), c0404b.f29312b);
                }
                throw new NullPointerException("KeyGenParameterSpec was null after build() check");
            }

            static String b(KeyGenParameterSpec keyGenParameterSpec) {
                return keyGenParameterSpec.getKeystoreAlias();
            }
        }

        public C0404b(Context context, String str) {
            this.f29317g = context.getApplicationContext();
            this.f29311a = str;
        }

        public b a() {
            return a.a(this);
        }

        public C0404b b(c cVar) {
            if (a.f29310a[cVar.ordinal()] == 1) {
                if (this.f29312b != null) {
                    throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
                }
                this.f29313c = cVar;
                return this;
            }
            throw new IllegalArgumentException("Unsupported scheme: " + cVar);
        }
    }

    /* compiled from: MasterKey.java */
    public enum c {
        AES256_GCM
    }

    b(String str, Object obj) {
        this.f29308a = str;
        this.f29309b = (KeyGenParameterSpec) obj;
    }

    String a() {
        return this.f29308a;
    }

    public boolean b() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.containsAlias(this.f29308a);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }

    public String toString() {
        return "MasterKey{keyAlias=" + this.f29308a + ", isKeyStoreBacked=" + b() + "}";
    }
}
