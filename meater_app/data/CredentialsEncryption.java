package com.apptionlabs.meater_app.data;

import android.util.Base64;
import com.apptionlabs.meater_app.model.MEATERCloudAccount;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: /tmp/meat/meat/classes.dex */
public class CredentialsEncryption {
    private static String decrypt(byte[] bArr, SecretKey secretKey) {
        try {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(2, secretKey);
            return new String(cipher.doFinal(bArr), StandardCharsets.UTF_8);
        } catch (Exception e10) {
            Log.error("CredentialsEncryption", android.util.Log.getStackTraceString(e10));
            return null;
        }
    }

    public static String decryptToken(String str) {
        byte[] decode;
        if (str == null || (decode = Base64.decode(str, 0)) == null) {
            return null;
        }
        byte[] copyOfRange = Arrays.copyOfRange(decode, 16, 48);
        return decrypt(Arrays.copyOfRange(decode, 64, decode.length - 16), new SecretKeySpec(copyOfRange, 0, copyOfRange.length, "AES"));
    }

    public static void decryptTokenForAccount(MEATERCloudAccount mEATERCloudAccount) {
        String decryptToken = decryptToken(mEATERCloudAccount.password);
        if (decryptToken == null) {
            return;
        }
        mEATERCloudAccount.password = decryptToken;
        if (decryptToken.startsWith("==google-token==")) {
            mEATERCloudAccount.type = MEATERCloudAccount.AccountType.Google;
            mEATERCloudAccount.password = mEATERCloudAccount.password.substring(16);
        } else if (mEATERCloudAccount.password.startsWith("==facebook-token==")) {
            mEATERCloudAccount.type = MEATERCloudAccount.AccountType.Facebook;
            mEATERCloudAccount.password = mEATERCloudAccount.password.substring(18);
        } else {
            mEATERCloudAccount.type = MEATERCloudAccount.AccountType.EmailAndPassword;
        }
    }

    private static byte[] encrypt(String str, SecretKey secretKey) {
        try {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(1, secretKey);
            return cipher.doFinal(str.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e10) {
            Log.error("CredentialsEncryption", android.util.Log.getStackTraceString(e10));
            return null;
        }
    }

    public static String encryptToken(String str) {
        if (str == null) {
            return str;
        }
        SecretKey generateKey = generateKey();
        byte[] encrypt = encrypt(str, generateKey);
        byte[] bArr = new byte[16];
        new Random().nextBytes(bArr);
        new Random().nextBytes(bArr);
        byte[] bArr2 = new byte[16];
        new Random().nextBytes(bArr2);
        byte[] encoded = generateKey.getEncoded();
        byte[] bArr3 = new byte[encoded.length + 32 + encrypt.length + 16];
        System.arraycopy(bArr, 0, bArr3, 0, 16);
        System.arraycopy(encoded, 0, bArr3, 16, encoded.length);
        System.arraycopy(new byte[16], 0, bArr3, encoded.length + 16, 16);
        System.arraycopy(encrypt, 0, bArr3, encoded.length + 32, encrypt.length);
        System.arraycopy(bArr2, 0, bArr3, encoded.length + 32 + encrypt.length, 16);
        return Base64.encodeToString(bArr3, 0);
    }

    public static String encryptTokenForAccount(MEATERCloudAccount mEATERCloudAccount) {
        String str = mEATERCloudAccount.password;
        MEATERCloudAccount.AccountType accountType = mEATERCloudAccount.type;
        if (accountType == MEATERCloudAccount.AccountType.Google) {
            str = "==google-token==" + mEATERCloudAccount.password;
        } else if (accountType == MEATERCloudAccount.AccountType.Facebook) {
            str = "==facebook-token==" + mEATERCloudAccount.password;
        }
        return encryptToken(str);
    }

    private static SecretKey generateKey() {
        try {
            SecureRandom secureRandom = new SecureRandom();
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(256, secureRandom);
            return keyGenerator.generateKey();
        } catch (Exception e10) {
            Log.error("CredentialsEncryption", android.util.Log.getStackTraceString(e10));
            return null;
        }
    }
}
