package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;

@zzard
/* loaded from: classes2.dex */
public final class zzvj extends zzva {

    /* renamed from: c */
    private MessageDigest f27212c;

    /* renamed from: d */
    private final int f27213d;

    /* renamed from: e */
    private final int f27214e;

    public zzvj(int i2) {
        int i3 = i2 / 8;
        this.f27213d = i2 % 8 > 0 ? i3 + 1 : i3;
        this.f27214e = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzva
    /* renamed from: a */
    public final byte[] mo20649a(String str) {
        synchronized (this.f27203b) {
            MessageDigest messageDigestM20650b = m20650b();
            this.f27212c = messageDigestM20650b;
            if (messageDigestM20650b == null) {
                return new byte[0];
            }
            messageDigestM20650b.reset();
            this.f27212c.update(str.getBytes(Charset.forName("UTF-8")));
            byte[] bArrDigest = this.f27212c.digest();
            int length = bArrDigest.length;
            int length2 = this.f27213d;
            if (length <= length2) {
                length2 = bArrDigest.length;
            }
            byte[] bArr = new byte[length2];
            System.arraycopy(bArrDigest, 0, bArr, 0, length2);
            if (this.f27214e % 8 > 0) {
                long j2 = 0;
                for (int i2 = 0; i2 < length2; i2++) {
                    if (i2 > 0) {
                        j2 <<= 8;
                    }
                    j2 += bArr[i2] & 255;
                }
                long j3 = j2 >>> (8 - (this.f27214e % 8));
                for (int i3 = this.f27213d - 1; i3 >= 0; i3--) {
                    bArr[i3] = (byte) (255 & j3);
                    j3 >>>= 8;
                }
            }
            return bArr;
        }
    }
}
