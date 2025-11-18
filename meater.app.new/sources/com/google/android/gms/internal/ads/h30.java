package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class h30 {

    /* renamed from: i */
    private int f19045i;

    /* renamed from: j */
    private int f19046j;

    /* renamed from: k */
    private int f19047k;

    /* renamed from: l */
    private int f19048l;

    /* renamed from: q */
    private zzlh f19053q;

    /* renamed from: a */
    private int f19037a = 1000;

    /* renamed from: b */
    private int[] f19038b = new int[1000];

    /* renamed from: c */
    private long[] f19039c = new long[1000];

    /* renamed from: f */
    private long[] f19042f = new long[1000];

    /* renamed from: e */
    private int[] f19041e = new int[1000];

    /* renamed from: d */
    private int[] f19040d = new int[1000];

    /* renamed from: g */
    private zznx[] f19043g = new zznx[1000];

    /* renamed from: h */
    private zzlh[] f19044h = new zzlh[1000];

    /* renamed from: m */
    private long f19049m = Long.MIN_VALUE;

    /* renamed from: n */
    private long f19050n = Long.MIN_VALUE;

    /* renamed from: p */
    private boolean f19052p = true;

    /* renamed from: o */
    private boolean f19051o = true;

    /* renamed from: a */
    public final synchronized int m15248a(zzlj zzljVar, zznd zzndVar, boolean z, boolean z2, zzlh zzlhVar, zzqs zzqsVar) {
        if (!m15257j()) {
            if (z2) {
                zzndVar.m20293b(4);
                return -4;
            }
            zzlh zzlhVar2 = this.f19053q;
            if (zzlhVar2 == null || (!z && zzlhVar2 == zzlhVar)) {
                return -3;
            }
            zzljVar.f26486a = zzlhVar2;
            return -5;
        }
        if (!z) {
            zzlh[] zzlhVarArr = this.f19044h;
            int i2 = this.f19047k;
            if (zzlhVarArr[i2] == zzlhVar) {
                if (zzndVar.f26630c == null) {
                    return -3;
                }
                zzndVar.f26631d = this.f19042f[i2];
                zzndVar.m20293b(this.f19041e[i2]);
                int[] iArr = this.f19040d;
                int i3 = this.f19047k;
                zzqsVar.f26851a = iArr[i3];
                zzqsVar.f26852b = this.f19039c[i3];
                zzqsVar.f26854d = this.f19043g[i3];
                this.f19049m = Math.max(this.f19049m, zzndVar.f26631d);
                int i4 = this.f19045i - 1;
                this.f19045i = i4;
                int i5 = this.f19047k + 1;
                this.f19047k = i5;
                this.f19046j++;
                if (i5 == this.f19037a) {
                    this.f19047k = 0;
                }
                zzqsVar.f26853c = i4 > 0 ? this.f19039c[this.f19047k] : zzqsVar.f26852b + zzqsVar.f26851a;
                return -4;
            }
        }
        zzljVar.f26486a = this.f19044h[this.f19047k];
        return -5;
    }

    /* renamed from: b */
    public final synchronized void m15249b(long j2, int i2, long j3, int i3, zznx zznxVar) {
        if (this.f19051o) {
            if ((i2 & 1) == 0) {
                return;
            } else {
                this.f19051o = false;
            }
        }
        zzsk.m20481e(!this.f19052p);
        m15250c(j2);
        long[] jArr = this.f19042f;
        int i4 = this.f19048l;
        jArr[i4] = j2;
        long[] jArr2 = this.f19039c;
        jArr2[i4] = j3;
        this.f19040d[i4] = i3;
        this.f19041e[i4] = i2;
        this.f19043g[i4] = zznxVar;
        this.f19044h[i4] = this.f19053q;
        this.f19038b[i4] = 0;
        int i5 = this.f19045i + 1;
        this.f19045i = i5;
        int i6 = this.f19037a;
        if (i5 != i6) {
            int i7 = i4 + 1;
            this.f19048l = i7;
            if (i7 == i6) {
                this.f19048l = 0;
            }
            return;
        }
        int i8 = i6 + 1000;
        int[] iArr = new int[i8];
        long[] jArr3 = new long[i8];
        long[] jArr4 = new long[i8];
        int[] iArr2 = new int[i8];
        int[] iArr3 = new int[i8];
        zznx[] zznxVarArr = new zznx[i8];
        zzlh[] zzlhVarArr = new zzlh[i8];
        int i9 = this.f19047k;
        int i10 = i6 - i9;
        System.arraycopy(jArr2, i9, jArr3, 0, i10);
        System.arraycopy(this.f19042f, this.f19047k, jArr4, 0, i10);
        System.arraycopy(this.f19041e, this.f19047k, iArr2, 0, i10);
        System.arraycopy(this.f19040d, this.f19047k, iArr3, 0, i10);
        System.arraycopy(this.f19043g, this.f19047k, zznxVarArr, 0, i10);
        System.arraycopy(this.f19044h, this.f19047k, zzlhVarArr, 0, i10);
        System.arraycopy(this.f19038b, this.f19047k, iArr, 0, i10);
        int i11 = this.f19047k;
        System.arraycopy(this.f19039c, 0, jArr3, i10, i11);
        System.arraycopy(this.f19042f, 0, jArr4, i10, i11);
        System.arraycopy(this.f19041e, 0, iArr2, i10, i11);
        System.arraycopy(this.f19040d, 0, iArr3, i10, i11);
        System.arraycopy(this.f19043g, 0, zznxVarArr, i10, i11);
        System.arraycopy(this.f19044h, 0, zzlhVarArr, i10, i11);
        System.arraycopy(this.f19038b, 0, iArr, i10, i11);
        this.f19039c = jArr3;
        this.f19042f = jArr4;
        this.f19041e = iArr2;
        this.f19040d = iArr3;
        this.f19043g = zznxVarArr;
        this.f19044h = zzlhVarArr;
        this.f19038b = iArr;
        this.f19047k = 0;
        int i12 = this.f19037a;
        this.f19048l = i12;
        this.f19045i = i12;
        this.f19037a = i8;
    }

    /* renamed from: c */
    public final synchronized void m15250c(long j2) {
        this.f19050n = Math.max(this.f19050n, j2);
    }

    /* renamed from: d */
    public final synchronized long m15251d(long j2, boolean z) {
        if (m15257j()) {
            long[] jArr = this.f19042f;
            int i2 = this.f19047k;
            if (j2 >= jArr[i2]) {
                if (j2 > this.f19050n && !z) {
                    return -1L;
                }
                int i3 = 0;
                int i4 = -1;
                while (i2 != this.f19048l && this.f19042f[i2] <= j2) {
                    if ((this.f19041e[i2] & 1) != 0) {
                        i4 = i3;
                    }
                    i2 = (i2 + 1) % this.f19037a;
                    i3++;
                }
                if (i4 == -1) {
                    return -1L;
                }
                int i5 = (this.f19047k + i4) % this.f19037a;
                this.f19047k = i5;
                this.f19046j += i4;
                this.f19045i -= i4;
                return this.f19039c[i5];
            }
        }
        return -1L;
    }

    /* renamed from: e */
    public final synchronized boolean m15252e(zzlh zzlhVar) {
        if (zzlhVar == null) {
            this.f19052p = true;
            return false;
        }
        this.f19052p = false;
        if (zzsy.m20543g(zzlhVar, this.f19053q)) {
            return false;
        }
        this.f19053q = zzlhVar;
        return true;
    }

    /* renamed from: f */
    public final synchronized long m15253f() {
        return Math.max(this.f19049m, this.f19050n);
    }

    /* renamed from: g */
    public final void m15254g() {
        this.f19046j = 0;
        this.f19047k = 0;
        this.f19048l = 0;
        this.f19045i = 0;
        this.f19051o = true;
    }

    /* renamed from: h */
    public final void m15255h() {
        this.f19049m = Long.MIN_VALUE;
        this.f19050n = Long.MIN_VALUE;
    }

    /* renamed from: i */
    public final int m15256i() {
        return this.f19046j + this.f19045i;
    }

    /* renamed from: j */
    public final synchronized boolean m15257j() {
        return this.f19045i != 0;
    }

    /* renamed from: k */
    public final synchronized zzlh m15258k() {
        if (this.f19052p) {
            return null;
        }
        return this.f19053q;
    }

    /* renamed from: l */
    public final synchronized long m15259l() {
        if (!m15257j()) {
            return -1L;
        }
        int i2 = this.f19047k;
        int i3 = this.f19045i;
        int i4 = this.f19037a;
        int i5 = ((i2 + i3) - 1) % i4;
        this.f19047k = (i2 + i3) % i4;
        this.f19046j += i3;
        this.f19045i = 0;
        return this.f19039c[i5] + this.f19040d[i5];
    }
}
