package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* loaded from: classes2.dex */
public final class zzdll implements zzdby {

    /* renamed from: a */
    private Mac f25648a;

    /* renamed from: b */
    private final int f25649b;

    /* renamed from: c */
    private final String f25650c;

    /* renamed from: d */
    private final Key f25651d;

    public zzdll(String str, Key key, int i2) throws GeneralSecurityException {
        if (i2 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        str.hashCode();
        switch (str) {
            case "HMACSHA1":
                if (i2 > 20) {
                    throw new InvalidAlgorithmParameterException("tag size too big");
                }
                break;
            case "HMACSHA256":
                if (i2 > 32) {
                    throw new InvalidAlgorithmParameterException("tag size too big");
                }
                break;
            case "HMACSHA512":
                if (i2 > 64) {
                    throw new InvalidAlgorithmParameterException("tag size too big");
                }
                break;
            default:
                throw new NoSuchAlgorithmException(str.length() != 0 ? "unknown Hmac algorithm: ".concat(str) : new String("unknown Hmac algorithm: "));
        }
        this.f25650c = str;
        this.f25649b = i2;
        this.f25651d = key;
        Mac macM19569b = zzdkx.f25632d.m19569b(str);
        this.f25648a = macM19569b;
        macM19569b.init(key);
    }

    @Override // com.google.android.gms.internal.ads.zzdby
    /* renamed from: a */
    public final byte[] mo19193a(byte[] bArr) throws IllegalStateException, GeneralSecurityException {
        Mac macM19569b;
        try {
            macM19569b = (Mac) this.f25648a.clone();
        } catch (CloneNotSupportedException unused) {
            macM19569b = zzdkx.f25632d.m19569b(this.f25650c);
            macM19569b.init(this.f25651d);
        }
        macM19569b.update(bArr);
        byte[] bArr2 = new byte[this.f25649b];
        System.arraycopy(macM19569b.doFinal(), 0, bArr2, 0, this.f25649b);
        return bArr2;
    }
}
