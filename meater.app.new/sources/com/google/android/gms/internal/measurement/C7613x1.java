package com.google.android.gms.internal.measurement;

import java.io.IOException;
import okhttp3.HttpUrl;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.x1 */
/* loaded from: classes2.dex */
final class C7613x1 extends zzeg {

    /* renamed from: f */
    private final byte[] f27926f;

    /* renamed from: g */
    private final boolean f27927g;

    /* renamed from: h */
    private int f27928h;

    /* renamed from: i */
    private int f27929i;

    /* renamed from: j */
    private int f27930j;

    /* renamed from: k */
    private int f27931k;

    /* renamed from: l */
    private int f27932l;

    /* renamed from: m */
    private int f27933m;

    private C7613x1(byte[] bArr, int i2, int i3, boolean z) {
        super();
        this.f27933m = Integer.MAX_VALUE;
        this.f27926f = bArr;
        this.f27928h = i3 + i2;
        this.f27930j = i2;
        this.f27931k = i2;
        this.f27927g = z;
    }

    /* renamed from: C */
    private final byte m21443C() throws IOException {
        int i2 = this.f27930j;
        if (i2 == this.f27928h) {
            throw zzfo.m22296a();
        }
        byte[] bArr = this.f27926f;
        this.f27930j = i2 + 1;
        return bArr[i2];
    }

    /* renamed from: D */
    private final void m21444D(int i2) throws IOException {
        if (i2 >= 0) {
            int i3 = this.f27928h;
            int i4 = this.f27930j;
            if (i2 <= i3 - i4) {
                this.f27930j = i4 + i2;
                return;
            }
        }
        if (i2 >= 0) {
            throw zzfo.m22296a();
        }
        throw zzfo.m22297b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        if (r2[r3] >= 0) goto L32;
     */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int m21445E() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f27930j
            int r1 = r5.f27928h
            if (r1 == r0) goto L6b
            byte[] r2 = r5.f27926f
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L11
            r5.f27930j = r3
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
            r5.f27930j = r1
            return r0
        L6b:
            long r0 = r5.mo21474z()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7613x1.m21445E():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b0, code lost:
    
        if (r2[r0] >= 0) goto L28;
     */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long m21446F() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7613x1.m21446F():long");
    }

    /* renamed from: G */
    private final int m21447G() throws IOException {
        int i2 = this.f27930j;
        if (this.f27928h - i2 < 4) {
            throw zzfo.m22296a();
        }
        byte[] bArr = this.f27926f;
        this.f27930j = i2 + 4;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    /* renamed from: H */
    private final long m21448H() throws IOException {
        int i2 = this.f27930j;
        if (this.f27928h - i2 < 8) {
            throw zzfo.m22296a();
        }
        byte[] bArr = this.f27926f;
        this.f27930j = i2 + 8;
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    /* renamed from: I */
    private final void m21449I() {
        int i2 = this.f27928h + this.f27929i;
        this.f27928h = i2;
        int i3 = i2 - this.f27931k;
        int i4 = this.f27933m;
        if (i3 <= i4) {
            this.f27929i = 0;
            return;
        }
        int i5 = i3 - i4;
        this.f27929i = i5;
        this.f27928h = i2 - i5;
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    /* renamed from: A */
    public final boolean mo21450A() throws IOException {
        return this.f27930j == this.f27928h;
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    /* renamed from: B */
    public final int mo21451B() {
        return this.f27930j - this.f27931k;
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    /* renamed from: a */
    public final int mo21452a() throws IOException {
        if (mo21450A()) {
            this.f27932l = 0;
            return 0;
        }
        int iM21445E = m21445E();
        this.f27932l = iM21445E;
        if ((iM21445E >>> 3) != 0) {
            return iM21445E;
        }
        throw zzfo.m22299d();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    /* renamed from: d */
    public final void mo21453d(int i2) throws zzfo {
        if (this.f27932l != i2) {
            throw zzfo.m22300e();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    /* renamed from: e */
    public final double mo21454e() throws IOException {
        return Double.longBitsToDouble(m21448H());
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    /* renamed from: f */
    public final boolean mo21455f(int i2) throws IOException {
        int iMo21452a;
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 == 0) {
            if (this.f27928h - this.f27930j < 10) {
                while (i4 < 10) {
                    if (m21443C() < 0) {
                        i4++;
                    }
                }
                throw zzfo.m22298c();
            }
            while (i4 < 10) {
                byte[] bArr = this.f27926f;
                int i5 = this.f27930j;
                this.f27930j = i5 + 1;
                if (bArr[i5] < 0) {
                    i4++;
                }
            }
            throw zzfo.m22298c();
            return true;
        }
        if (i3 == 1) {
            m21444D(8);
            return true;
        }
        if (i3 == 2) {
            m21444D(m21445E());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw zzfo.m22301f();
            }
            m21444D(4);
            return true;
        }
        do {
            iMo21452a = mo21452a();
            if (iMo21452a == 0) {
                break;
            }
        } while (mo21455f(iMo21452a));
        mo21453d(((i2 >>> 3) << 3) | 4);
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    /* renamed from: g */
    public final float mo21456g() throws IOException {
        return Float.intBitsToFloat(m21447G());
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    /* renamed from: h */
    public final int mo21457h(int i2) throws zzfo {
        if (i2 < 0) {
            throw zzfo.m22297b();
        }
        int iMo21451B = i2 + mo21451B();
        int i3 = this.f27933m;
        if (iMo21451B > i3) {
            throw zzfo.m22296a();
        }
        this.f27933m = iMo21451B;
        m21449I();
        return i3;
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    /* renamed from: i */
    public final long mo21458i() throws IOException {
        return m21446F();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    /* renamed from: j */
    public final void mo21459j(int i2) {
        this.f27933m = i2;
        m21449I();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    /* renamed from: l */
    public final long mo21460l() throws IOException {
        return m21446F();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    /* renamed from: m */
    public final int mo21461m() throws IOException {
        return m21445E();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    /* renamed from: n */
    public final long mo21462n() throws IOException {
        return m21448H();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    /* renamed from: o */
    public final int mo21463o() throws IOException {
        return m21447G();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    /* renamed from: p */
    public final boolean mo21464p() throws IOException {
        return m21446F() != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    /* renamed from: q */
    public final String mo21465q() throws IOException {
        int iM21445E = m21445E();
        if (iM21445E > 0 && iM21445E <= this.f27928h - this.f27930j) {
            String str = new String(this.f27926f, this.f27930j, iM21445E, zzff.f28137a);
            this.f27930j += iM21445E;
            return str;
        }
        if (iM21445E == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (iM21445E < 0) {
            throw zzfo.m22297b();
        }
        throw zzfo.m22296a();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    /* renamed from: r */
    public final String mo21466r() throws IOException {
        int iM21445E = m21445E();
        if (iM21445E > 0) {
            int i2 = this.f27928h;
            int i3 = this.f27930j;
            if (iM21445E <= i2 - i3) {
                String strM21257k = C7556n4.m21257k(this.f27926f, i3, iM21445E);
                this.f27930j += iM21445E;
                return strM21257k;
            }
        }
        if (iM21445E == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (iM21445E <= 0) {
            throw zzfo.m22297b();
        }
        throw zzfo.m22296a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    @Override // com.google.android.gms.internal.measurement.zzeg
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.zzdu mo21467s() throws java.io.IOException {
        /*
            r3 = this;
            int r0 = r3.m21445E()
            if (r0 <= 0) goto L19
            int r1 = r3.f27928h
            int r2 = r3.f27930j
            int r1 = r1 - r2
            if (r0 > r1) goto L19
            byte[] r1 = r3.f27926f
            com.google.android.gms.internal.measurement.zzdu r1 = com.google.android.gms.internal.measurement.zzdu.m22152q(r1, r2, r0)
            int r2 = r3.f27930j
            int r2 = r2 + r0
            r3.f27930j = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            com.google.android.gms.internal.measurement.zzdu r0 = com.google.android.gms.internal.measurement.zzdu.f28037f
            return r0
        L1e:
            if (r0 <= 0) goto L31
            int r1 = r3.f27928h
            int r2 = r3.f27930j
            int r1 = r1 - r2
            if (r0 > r1) goto L31
            int r0 = r0 + r2
            r3.f27930j = r0
            byte[] r1 = r3.f27926f
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r2, r0)
            goto L37
        L31:
            if (r0 > 0) goto L41
            if (r0 != 0) goto L3c
            byte[] r0 = com.google.android.gms.internal.measurement.zzff.f28139c
        L37:
            com.google.android.gms.internal.measurement.zzdu r0 = com.google.android.gms.internal.measurement.zzdu.m22151o(r0)
            return r0
        L3c:
            com.google.android.gms.internal.measurement.zzfo r0 = com.google.android.gms.internal.measurement.zzfo.m22297b()
            throw r0
        L41:
            com.google.android.gms.internal.measurement.zzfo r0 = com.google.android.gms.internal.measurement.zzfo.m22296a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7613x1.mo21467s():com.google.android.gms.internal.measurement.zzdu");
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    /* renamed from: t */
    public final int mo21468t() throws IOException {
        return m21445E();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    /* renamed from: u */
    public final int mo21469u() throws IOException {
        return m21445E();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    /* renamed from: v */
    public final int mo21470v() throws IOException {
        return m21447G();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    /* renamed from: w */
    public final long mo21471w() throws IOException {
        return m21448H();
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    /* renamed from: x */
    public final int mo21472x() throws IOException {
        return zzeg.m22161k(m21445E());
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    /* renamed from: y */
    public final long mo21473y() throws IOException {
        return zzeg.m22159b(m21446F());
    }

    @Override // com.google.android.gms.internal.measurement.zzeg
    /* renamed from: z */
    final long mo21474z() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            j2 |= (r3 & 127) << i2;
            if ((m21443C() & 128) == 0) {
                return j2;
            }
        }
        throw zzfo.m22298c();
    }
}
