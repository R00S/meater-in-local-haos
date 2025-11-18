package cm.aptoide.p092pt.preferences.secure;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class SecureCoderDecoder {
    private static final String AES_KEY_ALG = "AES";
    private static final String BACKUP_PBE_KEY_ALG = "PBEWithMD5AndDES";
    private static final int ITERATIONS = 2000;
    private static final int KEY_SIZE = 256;
    private static final String PRIMARY_PBE_KEY_ALG = "PBKDF2WithHmacSHA1";
    private static final String PROVIDER = "BC";
    private static final String TAG = "SecureCoderDecoder";
    private byte[] sKey;

    public static class Builder {
        private Context context;
        private SharedPreferences defaultSharedPreferences;

        public Builder(Context context, SharedPreferences sharedPreferences) {
            this.context = context;
            this.defaultSharedPreferences = sharedPreferences;
        }

        public SecureCoderDecoder create() {
            try {
                String strGenerateAesKeyName = SecureCoderDecoder.generateAesKeyName(this.context);
                String string = this.defaultSharedPreferences.getString(strGenerateAesKeyName, null);
                if (string == null) {
                    string = SecureCoderDecoder.generateAesKeyValue();
                    this.defaultSharedPreferences.edit().putString(strGenerateAesKeyName, string).commit();
                }
                return new SecureCoderDecoder(SecureCoderDecoder.decode(string));
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    public SecureCoderDecoder(byte[] bArr) {
        this.sKey = bArr;
    }

    static byte[] decode(String str) {
        return Base64.decode(str, 3);
    }

    private static String encode(byte[] bArr) {
        return Base64.encodeToString(bArr, 3);
    }

    static String generateAesKeyName(Context context) throws InvalidKeySpecException, NoSuchAlgorithmException, NoSuchProviderException {
        SecretKey secretKeyGeneratePBEKey;
        char[] charArray = context.getPackageName().toCharArray();
        byte[] bytes = getDeviceSerialNumber(context).getBytes();
        try {
            secretKeyGeneratePBEKey = generatePBEKey(charArray, bytes, PRIMARY_PBE_KEY_ALG, ITERATIONS, KEY_SIZE);
        } catch (NoSuchAlgorithmException unused) {
            secretKeyGeneratePBEKey = generatePBEKey(charArray, bytes, BACKUP_PBE_KEY_ALG, ITERATIONS, KEY_SIZE);
        }
        return encode(secretKeyGeneratePBEKey.getEncoded());
    }

    static String generateAesKeyValue() throws NoSuchAlgorithmException {
        SecureRandom secureRandom = new SecureRandom();
        KeyGenerator keyGenerator = KeyGenerator.getInstance(AES_KEY_ALG);
        try {
            keyGenerator.init(KEY_SIZE, secureRandom);
        } catch (Exception unused) {
            try {
                keyGenerator.init(192, secureRandom);
            } catch (Exception unused2) {
                keyGenerator.init(128, secureRandom);
            }
        }
        return encode(keyGenerator.generateKey().getEncoded());
    }

    static SecretKey generatePBEKey(char[] cArr, byte[] bArr, String str, int i2, int i3) throws InvalidKeySpecException, NoSuchAlgorithmException, NoSuchProviderException {
        if (i2 == 0) {
            i2 = 1000;
        }
        return SecretKeyFactory.getInstance(str, PROVIDER).generateSecret(new PBEKeySpec(cArr, bArr, i2, i3));
    }

    static String getDeviceSerialNumber(Context context) {
        try {
            String str = (String) Build.class.getField("SERIAL").get(null);
            return TextUtils.isEmpty(str) ? Settings.Secure.getString(context.getContentResolver(), "android_id") : str;
        } catch (Exception unused) {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        }
    }

    public String decrypt(String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException {
        if (str == null || str.length() == 0) {
            return str;
        }
        try {
            Cipher cipher = Cipher.getInstance(AES_KEY_ALG, PROVIDER);
            cipher.init(2, new SecretKeySpec(this.sKey, AES_KEY_ALG));
            return new String(cipher.doFinal(decode(str)), "UTF-8");
        } catch (Exception unused) {
            return null;
        }
    }

    public String encrypt(String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException {
        if (str == null || str.length() == 0) {
            return str;
        }
        try {
            Cipher cipher = Cipher.getInstance(AES_KEY_ALG, PROVIDER);
            cipher.init(1, new SecretKeySpec(this.sKey, AES_KEY_ALG));
            return encode(cipher.doFinal(str.getBytes("UTF-8")));
        } catch (Exception unused) {
            return null;
        }
    }
}
