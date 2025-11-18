package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zztg {

    /* renamed from: a */
    public final List<byte[]> f27048a;

    /* renamed from: b */
    public final int f27049b;

    private zztg(List<byte[]> list, int i2) {
        this.f27048a = list;
        this.f27049b = i2;
    }

    /* renamed from: a */
    public static zztg m20559a(zzst zzstVar) throws zzlm {
        try {
            zzstVar.m20511l(21);
            int iM20506g = zzstVar.m20506g() & 3;
            int iM20506g2 = zzstVar.m20506g();
            int iM20501b = zzstVar.m20501b();
            int i2 = 0;
            for (int i3 = 0; i3 < iM20506g2; i3++) {
                zzstVar.m20511l(1);
                int iM20507h = zzstVar.m20507h();
                for (int i4 = 0; i4 < iM20507h; i4++) {
                    int iM20507h2 = zzstVar.m20507h();
                    i2 += iM20507h2 + 4;
                    zzstVar.m20511l(iM20507h2);
                }
            }
            zzstVar.m20510k(iM20501b);
            byte[] bArr = new byte[i2];
            int i5 = 0;
            for (int i6 = 0; i6 < iM20506g2; i6++) {
                zzstVar.m20511l(1);
                int iM20507h3 = zzstVar.m20507h();
                for (int i7 = 0; i7 < iM20507h3; i7++) {
                    int iM20507h4 = zzstVar.m20507h();
                    byte[] bArr2 = zzsq.f26995a;
                    System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
                    int length = i5 + bArr2.length;
                    System.arraycopy(zzstVar.f27013a, zzstVar.m20501b(), bArr, length, iM20507h4);
                    i5 = length + iM20507h4;
                    zzstVar.m20511l(iM20507h4);
                }
            }
            return new zztg(i2 == 0 ? null : Collections.singletonList(bArr), iM20506g + 1);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new zzlm("Error parsing HEVC config", e2);
        }
    }
}
