package com.flurry.sdk;

import android.annotation.TargetApi;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.KeyGenerator;

/* renamed from: com.flurry.sdk.k */
/* loaded from: classes2.dex */
public final class C6083k {

    /* renamed from: a */
    private KeyStore f16039a;

    @TargetApi(23)
    C6083k() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.f16039a = keyStore;
            keyStore.load(null);
            KeyStore keyStore2 = this.f16039a;
            if (keyStore2 == null || keyStore2.containsAlias("fl.install.id.sec.key")) {
                return;
            }
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder("fl.install.id.sec.key", 3).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding").setRandomizedEncryptionRequired(false).setDigests("SHA-256", "SHA-512").build());
            keyGenerator.generateKey();
        } catch (IOException e2) {
            e = e2;
            C6021d1.m13031d(5, "KeystoreProvider", "Error while generating Key" + e.getMessage(), e);
        } catch (NullPointerException e3) {
            e = e3;
            C6021d1.m13031d(5, "KeystoreProvider", "Error while generating Key" + e.getMessage(), e);
        } catch (InvalidAlgorithmParameterException e4) {
            e = e4;
            C6021d1.m13031d(5, "KeystoreProvider", "Error while generating Key" + e.getMessage(), e);
        } catch (KeyStoreException e5) {
            e = e5;
            C6021d1.m13031d(5, "KeystoreProvider", "Error while generating Key" + e.getMessage(), e);
        } catch (NoSuchAlgorithmException e6) {
            e = e6;
            C6021d1.m13031d(5, "KeystoreProvider", "Error while generating Key" + e.getMessage(), e);
        } catch (NoSuchProviderException e7) {
            e = e7;
            C6021d1.m13031d(5, "KeystoreProvider", "Error while generating Key" + e.getMessage(), e);
        } catch (CertificateException e8) {
            e = e8;
            C6021d1.m13031d(5, "KeystoreProvider", "Error while generating Key" + e.getMessage(), e);
        } catch (Exception e9) {
            C6021d1.m13031d(5, "KeystoreProvider", "Unknown Error while generating Key" + e9.getMessage(), e9);
        }
    }

    /* renamed from: a */
    public final Key m13140a() {
        KeyStore keyStore;
        if (Build.VERSION.SDK_INT < 23 || (keyStore = this.f16039a) == null) {
            return null;
        }
        try {
            return keyStore.getKey("fl.install.id.sec.key", null);
        } catch (KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException unused) {
            C6021d1.m13030c(6, "KeystoreProvider", "Error in getting key.");
            return null;
        }
    }
}
