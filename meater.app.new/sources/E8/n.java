package E8;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import w8.C5009b;

/* compiled from: PrfHmacJce.java */
/* loaded from: classes2.dex */
public final class n implements C8.a {

    /* renamed from: e, reason: collision with root package name */
    public static final C5009b.EnumC0751b f4127e = C5009b.EnumC0751b.f51986C;

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal<Mac> f4128a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4129b;

    /* renamed from: c, reason: collision with root package name */
    private final Key f4130c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4131d;

    /* compiled from: PrfHmacJce.java */
    class a extends ThreadLocal<Mac> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Mac initialValue() throws InvalidKeyException {
            try {
                Mac macA = i.f4113c.a(n.this.f4129b);
                macA.init(n.this.f4130c);
                return macA;
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public n(String str, Key key) throws GeneralSecurityException {
        a aVar = new a();
        this.f4128a = aVar;
        if (!f4127e.c()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f4129b = str;
        this.f4130c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.hashCode();
        switch (str) {
            case "HMACSHA1":
                this.f4131d = 20;
                break;
            case "HMACSHA224":
                this.f4131d = 28;
                break;
            case "HMACSHA256":
                this.f4131d = 32;
                break;
            case "HMACSHA384":
                this.f4131d = 48;
                break;
            case "HMACSHA512":
                this.f4131d = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
        }
        aVar.get();
    }

    @Override // C8.a
    public byte[] a(byte[] bArr, int i10) throws IllegalStateException, InvalidAlgorithmParameterException {
        if (i10 > this.f4131d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.f4128a.get().update(bArr);
        return Arrays.copyOf(this.f4128a.get().doFinal(), i10);
    }
}
