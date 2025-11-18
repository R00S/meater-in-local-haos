package com.flurry.sdk;

import android.annotation.SuppressLint;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import okhttp3.HttpUrl;

/* renamed from: com.flurry.sdk.b7 */
/* loaded from: classes2.dex */
public final class C6009b7<ObjectType> {

    /* renamed from: a */
    private InterfaceC6180v1<ObjectType> f15695a;

    /* renamed from: com.flurry.sdk.b7$a */
    public enum a {
        NONE(HttpUrl.FRAGMENT_ENCODE_SET),
        CRYPTO_ALGO_PADDING_7("AES/CBC/PKCS7Padding"),
        CRYPTO_ALGO_PADDING_5("AES/CBC/PKCS5Padding");


        /* renamed from: j */
        String f15700j;

        a(String str) {
            this.f15700j = str;
        }

        /* renamed from: g */
        public static a m12978g(int i2) {
            for (a aVar : values()) {
                if (aVar.ordinal() == i2) {
                    return aVar;
                }
            }
            return NONE;
        }
    }

    public C6009b7(InterfaceC6180v1<ObjectType> interfaceC6180v1) {
        this.f15695a = interfaceC6180v1;
    }

    /* renamed from: a */
    public final ObjectType m12976a(byte[] bArr, Key key, IvParameterSpec ivParameterSpec, a aVar) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, InvalidAlgorithmParameterException {
        if (bArr == null || key == null || aVar == null) {
            C6021d1.m13030c(5, "FlurryCrypto", "Cannot decrypt, invalid params.");
            return null;
        }
        try {
            Cipher cipher = Cipher.getInstance(aVar.f15700j);
            cipher.init(2, key, ivParameterSpec);
            return this.f15695a.mo13096b(new ByteArrayInputStream(cipher.doFinal(bArr)));
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e2) {
            C6021d1.m13030c(5, "FlurryCrypto", "Error in decrypt " + e2.getMessage());
            return null;
        }
    }

    @SuppressLint({"TrulyRandom"})
    /* renamed from: b */
    public final byte[] m12977b(ObjectType objecttype, Key key, IvParameterSpec ivParameterSpec, a aVar) throws NoSuchPaddingException, NoSuchAlgorithmException, IOException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (objecttype == null || key == null || aVar == null) {
            C6021d1.m13030c(5, "FlurryCrypto", "Cannot encrypt, invalid params.");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f15695a.mo13095a(byteArrayOutputStream, objecttype);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            Cipher cipher = Cipher.getInstance(aVar.f15700j);
            cipher.init(1, key, ivParameterSpec);
            return cipher.doFinal(byteArray);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e2) {
            C6021d1.m13030c(5, "FlurryCrypto", "Error in encrypt " + e2.getMessage());
            return null;
        }
    }
}
