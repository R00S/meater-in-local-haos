package y8;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import r8.InterfaceC4363a;

/* compiled from: AndroidKeystoreAesGcm.java */
/* renamed from: y8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5137b implements InterfaceC4363a {

    /* renamed from: b, reason: collision with root package name */
    private static final String f53230b = "b";

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f53231a;

    C5137b(String str, KeyStore keyStore) throws InvalidKeyException {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.f53231a = secretKey;
        if (secretKey != null) {
            return;
        }
        throw new InvalidKeyException("Keystore cannot load the key with ID: " + str);
    }

    private byte[] c(byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, this.f53231a, gCMParameterSpec);
        cipher.updateAAD(bArr2);
        return cipher.doFinal(bArr, 12, bArr.length - 12);
    }

    private byte[] d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, this.f53231a);
        cipher.updateAAD(bArr2);
        cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
        System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
        return bArr3;
    }

    private static void e() throws InterruptedException {
        try {
            Thread.sleep((int) (Math.random() * 100.0d));
        } catch (InterruptedException unused) {
        }
    }

    @Override // r8.InterfaceC4363a
    public byte[] a(byte[] bArr, byte[] bArr2) throws InterruptedException {
        try {
            return d(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e10) {
            Log.w(f53230b, "encountered a potentially transient KeyStore error, will wait and retry", e10);
            e();
            return d(bArr, bArr2);
        }
    }

    @Override // r8.InterfaceC4363a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, InterruptedException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        try {
            return c(bArr, bArr2);
        } catch (ProviderException e10) {
            e = e10;
            Log.w(f53230b, "encountered a potentially transient KeyStore error, will wait and retry", e);
            e();
            return c(bArr, bArr2);
        } catch (AEADBadTagException e11) {
            throw e11;
        } catch (GeneralSecurityException e12) {
            e = e12;
            Log.w(f53230b, "encountered a potentially transient KeyStore error, will wait and retry", e);
            e();
            return c(bArr, bArr2);
        }
    }
}
