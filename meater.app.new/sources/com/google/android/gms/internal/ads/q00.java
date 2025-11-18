package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes2.dex */
final class q00 {

    /* renamed from: a */
    public final zzqj f20344a;

    /* renamed from: b */
    public final Object f20345b;

    /* renamed from: c */
    public final int f20346c;

    /* renamed from: d */
    public final zzqw[] f20347d;

    /* renamed from: e */
    private final boolean[] f20348e;

    /* renamed from: f */
    public final long f20349f;

    /* renamed from: g */
    public int f20350g;

    /* renamed from: h */
    public long f20351h;

    /* renamed from: i */
    public boolean f20352i;

    /* renamed from: j */
    public boolean f20353j;

    /* renamed from: k */
    public boolean f20354k;

    /* renamed from: l */
    public q00 f20355l;

    /* renamed from: m */
    public zzrr f20356m;

    /* renamed from: n */
    private final zzlo[] f20357n;

    /* renamed from: o */
    private final zzlp[] f20358o;

    /* renamed from: p */
    private final zzrp f20359p;

    /* renamed from: q */
    private final zzll f20360q;

    /* renamed from: r */
    private final zzql f20361r;

    /* renamed from: s */
    private zzrr f20362s;

    public q00(zzlo[] zzloVarArr, zzlp[] zzlpVarArr, long j2, zzrp zzrpVar, zzll zzllVar, zzql zzqlVar, Object obj, int i2, int i3, boolean z, long j3) {
        this.f20357n = zzloVarArr;
        this.f20358o = zzlpVarArr;
        this.f20349f = j2;
        this.f20359p = zzrpVar;
        this.f20360q = zzllVar;
        this.f20361r = zzqlVar;
        this.f20345b = zzsk.m20480d(obj);
        this.f20346c = i2;
        this.f20350g = i3;
        this.f20352i = z;
        this.f20351h = j3;
        this.f20347d = new zzqw[zzloVarArr.length];
        this.f20348e = new boolean[zzloVarArr.length];
        this.f20344a = zzqlVar.mo20390b(i3, zzllVar.mo17569b());
    }

    /* renamed from: a */
    public final void m15790a() {
        try {
            this.f20361r.mo20391c(this.f20344a);
        } catch (RuntimeException e2) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e2);
        }
    }

    /* renamed from: b */
    public final long m15791b(long j2, boolean z, boolean[] zArr) {
        zzro zzroVar = this.f20356m.f26937b;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= zzroVar.f26932a) {
                break;
            }
            boolean[] zArr2 = this.f20348e;
            if (z || !this.f20356m.m20452a(this.f20362s, i2)) {
                z2 = false;
            }
            zArr2[i2] = z2;
            i2++;
        }
        long jMo15126c = this.f20344a.mo15126c(zzroVar.m20449b(), this.f20348e, this.f20347d, zArr, j2);
        this.f20362s = this.f20356m;
        this.f20354k = false;
        int i3 = 0;
        while (true) {
            zzqw[] zzqwVarArr = this.f20347d;
            if (i3 >= zzqwVarArr.length) {
                this.f20360q.mo17574g(this.f20357n, this.f20356m.f26936a, zzroVar);
                return jMo15126c;
            }
            if (zzqwVarArr[i3] != null) {
                zzsk.m20481e(zzroVar.m20448a(i3) != null);
                this.f20354k = true;
            } else {
                zzsk.m20481e(zzroVar.m20448a(i3) == null);
            }
            i3++;
        }
    }

    /* renamed from: c */
    public final void m15792c(int i2, boolean z) {
        this.f20350g = i2;
        this.f20352i = z;
    }

    /* renamed from: d */
    public final long m15793d(long j2, boolean z) {
        return m15791b(j2, false, new boolean[this.f20357n.length]);
    }

    /* renamed from: e */
    public final long m15794e() {
        return this.f20349f - this.f20351h;
    }

    /* renamed from: f */
    public final boolean m15795f() {
        if (this.f20353j) {
            return !this.f20354k || this.f20344a.mo15135r() == Long.MIN_VALUE;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m15796g() throws zzku {
        boolean z;
        zzrr zzrrVarMo20445b = this.f20359p.mo20445b(this.f20358o, this.f20344a.mo15134l());
        zzrr zzrrVar = this.f20362s;
        if (zzrrVar == null) {
            z = false;
            break;
        }
        for (int i2 = 0; i2 < zzrrVarMo20445b.f26937b.f26932a; i2++) {
            if (!zzrrVarMo20445b.m20452a(zzrrVar, i2)) {
                z = false;
                break;
            }
        }
        z = true;
        if (z) {
            return false;
        }
        this.f20356m = zzrrVarMo20445b;
        return true;
    }
}
