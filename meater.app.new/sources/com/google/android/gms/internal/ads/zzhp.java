package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class zzhp implements zzgf {

    /* renamed from: a */
    private int f26214a;

    /* renamed from: a */
    final void m20030a() throws zzgd {
        zzkh.m20129d(this.f26214a == 2);
        this.f26214a = 1;
        mo19992u();
    }

    /* renamed from: b */
    protected abstract long mo20006b();

    /* renamed from: c */
    protected final int m20031c() {
        return this.f26214a;
    }

    /* renamed from: d */
    protected abstract boolean mo19984d();

    /* renamed from: e */
    protected void mo19985e() throws zzgd {
    }

    @Override // com.google.android.gms.internal.ads.zzgf
    /* renamed from: f */
    public void mo19966f(int i2, Object obj) throws zzgd {
    }

    /* renamed from: g */
    protected void mo19986g() throws zzgd {
    }

    /* renamed from: h */
    final void m20032h() throws zzgd {
        int i2 = this.f26214a;
        zzkh.m20129d((i2 == 2 || i2 == 3 || i2 == -2) ? false : true);
        this.f26214a = -2;
        mo20010v();
    }

    /* renamed from: i */
    protected abstract void mo19987i(long j2) throws zzgd;

    /* renamed from: j */
    final void m20033j() throws zzgd {
        zzkh.m20129d(this.f26214a == 2);
        this.f26214a = 3;
        mo19985e();
    }

    /* renamed from: k */
    final void m20034k() throws zzgd {
        zzkh.m20129d(this.f26214a == 3);
        this.f26214a = 2;
        mo19986g();
    }

    /* renamed from: l */
    protected abstract void mo20007l(long j2, long j3) throws zzgd;

    /* renamed from: m */
    protected void mo19988m(long j2, boolean z) throws zzgd {
    }

    /* renamed from: n */
    final void m20035n(long j2, boolean z) throws zzgd {
        zzkh.m20129d(this.f26214a == 1);
        this.f26214a = 2;
        mo19988m(j2, z);
    }

    /* renamed from: o */
    protected abstract int mo20008o(long j2) throws zzgd;

    /* renamed from: p */
    final int m20036p(long j2) throws zzgd {
        zzkh.m20129d(this.f26214a == 0);
        int iMo20008o = mo20008o(j2);
        this.f26214a = iMo20008o;
        zzkh.m20129d(iMo20008o == 0 || iMo20008o == 1 || iMo20008o == -1);
        return this.f26214a;
    }

    /* renamed from: q */
    protected abstract long mo20009q();

    /* renamed from: r */
    protected boolean mo19989r() {
        return false;
    }

    /* renamed from: s */
    protected abstract boolean mo19990s();

    /* renamed from: t */
    protected abstract long mo19991t();

    /* renamed from: u */
    protected void mo19992u() throws zzgd {
    }

    /* renamed from: v */
    protected void mo20010v() throws zzgd {
    }
}
