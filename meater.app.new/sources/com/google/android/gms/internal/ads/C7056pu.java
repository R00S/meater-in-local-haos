package com.google.android.gms.internal.ads;

import java.io.IOException;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.internal.ads.pu */
/* loaded from: classes2.dex */
final class C7056pu extends zzdnd {

    /* renamed from: f */
    private final byte[] f20323f;

    /* renamed from: g */
    private final boolean f20324g;

    /* renamed from: h */
    private int f20325h;

    /* renamed from: i */
    private int f20326i;

    /* renamed from: j */
    private int f20327j;

    /* renamed from: k */
    private int f20328k;

    /* renamed from: l */
    private int f20329l;

    /* renamed from: m */
    private int f20330m;

    private C7056pu(byte[] bArr, int i2, int i3, boolean z) {
        super();
        this.f20330m = Integer.MAX_VALUE;
        this.f20323f = bArr;
        this.f20325h = i3 + i2;
        this.f20327j = i2;
        this.f20328k = i2;
        this.f20324g = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        if (r2[r3] >= 0) goto L32;
     */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int m15752C() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f20327j
            int r1 = r5.f20325h
            if (r1 == r0) goto L6b
            byte[] r2 = r5.f20323f
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L11
            r5.f20327j = r3
            return r0
        L11:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6b
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L22
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L68
        L22:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L2f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2d:
            r1 = r3
            goto L68
        L2f:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L68
        L3d:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6b
        L68:
            r5.f20327j = r1
            return r0
        L6b:
            long r0 = r5.mo15778s()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7056pu.m15752C():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b0, code lost:
    
        if (r2[r0] >= 0) goto L28;
     */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long m15753D() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7056pu.m15753D():long");
    }

    /* renamed from: E */
    private final int m15754E() throws IOException {
        int i2 = this.f20327j;
        if (this.f20325h - i2 < 4) {
            throw zzdok.m19750a();
        }
        byte[] bArr = this.f20323f;
        this.f20327j = i2 + 4;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    /* renamed from: F */
    private final long m15755F() throws IOException {
        int i2 = this.f20327j;
        if (this.f20325h - i2 < 8) {
            throw zzdok.m19750a();
        }
        byte[] bArr = this.f20323f;
        this.f20327j = i2 + 8;
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    /* renamed from: G */
    private final void m15756G() {
        int i2 = this.f20325h + this.f20326i;
        this.f20325h = i2;
        int i3 = i2 - this.f20328k;
        int i4 = this.f20330m;
        if (i3 <= i4) {
            this.f20326i = 0;
            return;
        }
        int i5 = i3 - i4;
        this.f20326i = i5;
        this.f20325h = i2 - i5;
    }

    /* renamed from: H */
    private final byte m15757H() throws IOException {
        int i2 = this.f20327j;
        if (i2 == this.f20325h) {
            throw zzdok.m19750a();
        }
        byte[] bArr = this.f20323f;
        this.f20327j = i2 + 1;
        return bArr[i2];
    }

    /* renamed from: I */
    private final void m15758I(int i2) throws IOException {
        if (i2 >= 0) {
            int i3 = this.f20325h;
            int i4 = this.f20327j;
            if (i2 <= i3 - i4) {
                this.f20327j = i4 + i2;
                return;
            }
        }
        if (i2 >= 0) {
            throw zzdok.m19750a();
        }
        throw zzdok.m19751b();
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    /* renamed from: A */
    public final void mo15759A(int i2) {
        this.f20330m = i2;
        m15756G();
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    /* renamed from: a */
    public final double mo15760a() throws IOException {
        return Double.longBitsToDouble(m15755F());
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    /* renamed from: b */
    public final float mo15761b() throws IOException {
        return Float.intBitsToFloat(m15754E());
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    /* renamed from: c */
    public final String mo15762c() throws IOException {
        int iM15752C = m15752C();
        if (iM15752C > 0 && iM15752C <= this.f20325h - this.f20327j) {
            String str = new String(this.f20323f, this.f20327j, iM15752C, zzdod.f25772a);
            this.f20327j += iM15752C;
            return str;
        }
        if (iM15752C == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (iM15752C < 0) {
            throw zzdok.m19751b();
        }
        throw zzdok.m19750a();
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    /* renamed from: d */
    public final int mo15763d() throws IOException {
        if (mo15779t()) {
            this.f20329l = 0;
            return 0;
        }
        int iM15752C = m15752C();
        this.f20329l = iM15752C;
        if ((iM15752C >>> 3) != 0) {
            return iM15752C;
        }
        throw zzdok.m19753d();
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    /* renamed from: e */
    public final long mo15764e() throws IOException {
        return m15753D();
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    /* renamed from: f */
    public final long mo15765f() throws IOException {
        return m15753D();
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    /* renamed from: g */
    public final int mo15766g() throws IOException {
        return m15752C();
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    /* renamed from: h */
    public final long mo15767h() throws IOException {
        return m15755F();
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    /* renamed from: i */
    public final int mo15768i() throws IOException {
        return m15754E();
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    /* renamed from: j */
    public final boolean mo15769j() throws IOException {
        return m15753D() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    /* renamed from: k */
    public final String mo15770k() throws IOException {
        int iM15752C = m15752C();
        if (iM15752C > 0) {
            int i2 = this.f20325h;
            int i3 = this.f20327j;
            if (iM15752C <= i2 - i3) {
                String strM15386m = C6837jx.m15386m(this.f20323f, i3, iM15752C);
                this.f20327j += iM15752C;
                return strM15386m;
            }
        }
        if (iM15752C == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (iM15752C <= 0) {
            throw zzdok.m19751b();
        }
        throw zzdok.m19750a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    @Override // com.google.android.gms.internal.ads.zzdnd
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzdmr mo15771l() throws java.io.IOException {
        /*
            r3 = this;
            int r0 = r3.m15752C()
            if (r0 <= 0) goto L19
            int r1 = r3.f20325h
            int r2 = r3.f20327j
            int r1 = r1 - r2
            if (r0 > r1) goto L19
            byte[] r1 = r3.f20323f
            com.google.android.gms.internal.ads.zzdmr r1 = com.google.android.gms.internal.ads.zzdmr.m19595A(r1, r2, r0)
            int r2 = r3.f20327j
            int r2 = r2 + r0
            r3.f20327j = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            com.google.android.gms.internal.ads.zzdmr r0 = com.google.android.gms.internal.ads.zzdmr.f25661f
            return r0
        L1e:
            if (r0 <= 0) goto L31
            int r1 = r3.f20325h
            int r2 = r3.f20327j
            int r1 = r1 - r2
            if (r0 > r1) goto L31
            int r0 = r0 + r2
            r3.f20327j = r0
            byte[] r1 = r3.f20323f
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r2, r0)
            goto L37
        L31:
            if (r0 > 0) goto L41
            if (r0 != 0) goto L3c
            byte[] r0 = com.google.android.gms.internal.ads.zzdod.f25774c
        L37:
            com.google.android.gms.internal.ads.zzdmr r0 = com.google.android.gms.internal.ads.zzdmr.m19597i(r0)
            return r0
        L3c:
            com.google.android.gms.internal.ads.zzdok r0 = com.google.android.gms.internal.ads.zzdok.m19751b()
            throw r0
        L41:
            com.google.android.gms.internal.ads.zzdok r0 = com.google.android.gms.internal.ads.zzdok.m19750a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7056pu.mo15771l():com.google.android.gms.internal.ads.zzdmr");
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    /* renamed from: m */
    public final int mo15772m() throws IOException {
        return m15752C();
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    /* renamed from: n */
    public final int mo15773n() throws IOException {
        return m15752C();
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    /* renamed from: o */
    public final int mo15774o() throws IOException {
        return m15754E();
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    /* renamed from: p */
    public final long mo15775p() throws IOException {
        return m15755F();
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    /* renamed from: q */
    public final int mo15776q() throws IOException {
        return zzdnd.m19606B(m15752C());
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    /* renamed from: r */
    public final long mo15777r() throws IOException {
        return zzdnd.m19608w(m15753D());
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    /* renamed from: s */
    final long mo15778s() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            j2 |= (r3 & 127) << i2;
            if ((m15757H() & 128) == 0) {
                return j2;
            }
        }
        throw zzdok.m19752c();
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    /* renamed from: t */
    public final boolean mo15779t() throws IOException {
        return this.f20327j == this.f20325h;
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    /* renamed from: u */
    public final int mo15780u() {
        return this.f20327j - this.f20328k;
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    /* renamed from: x */
    public final void mo15781x(int i2) throws zzdok {
        if (this.f20329l != i2) {
            throw zzdok.m19754e();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    /* renamed from: y */
    public final boolean mo15782y(int i2) throws IOException {
        int iMo15763d;
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 == 0) {
            if (this.f20325h - this.f20327j < 10) {
                while (i4 < 10) {
                    if (m15757H() < 0) {
                        i4++;
                    }
                }
                throw zzdok.m19752c();
            }
            while (i4 < 10) {
                byte[] bArr = this.f20323f;
                int i5 = this.f20327j;
                this.f20327j = i5 + 1;
                if (bArr[i5] < 0) {
                    i4++;
                }
            }
            throw zzdok.m19752c();
            return true;
        }
        if (i3 == 1) {
            m15758I(8);
            return true;
        }
        if (i3 == 2) {
            m15758I(m15752C());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw zzdok.m19755f();
            }
            m15758I(4);
            return true;
        }
        do {
            iMo15763d = mo15763d();
            if (iMo15763d == 0) {
                break;
            }
        } while (mo15782y(iMo15763d));
        mo15781x(((i2 >>> 3) << 3) | 4);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdnd
    /* renamed from: z */
    public final int mo15783z(int i2) throws zzdok {
        if (i2 < 0) {
            throw zzdok.m19751b();
        }
        int iMo15780u = i2 + mo15780u();
        int i3 = this.f20330m;
        if (iMo15780u > i3) {
            throw zzdok.m19750a();
        }
        this.f20330m = iMo15780u;
        m15756G();
        return i3;
    }
}
