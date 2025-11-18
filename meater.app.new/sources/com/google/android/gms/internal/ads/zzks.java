package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class zzks implements zzlo, zzlp {

    /* renamed from: a */
    private final int f26431a;

    /* renamed from: b */
    private zzlq f26432b;

    /* renamed from: c */
    private int f26433c;

    /* renamed from: d */
    private int f26434d;

    /* renamed from: e */
    private zzqw f26435e;

    /* renamed from: f */
    private long f26436f;

    /* renamed from: g */
    private boolean f26437g = true;

    /* renamed from: h */
    private boolean f26438h;

    public zzks(int i2) {
        this.f26431a = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    /* renamed from: D */
    public final void mo20163D(int i2) {
        this.f26433c = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzlo, com.google.android.gms.internal.ads.zzlp
    /* renamed from: E */
    public final int mo20164E() {
        return this.f26431a;
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    /* renamed from: F */
    public final void mo20165F(zzlq zzlqVar, zzlh[] zzlhVarArr, zzqw zzqwVar, long j2, boolean z, long j3) throws zzku {
        zzsk.m20481e(this.f26434d == 0);
        this.f26432b = zzlqVar;
        this.f26434d = 1;
        mo20186o(z);
        mo20174P(zzlhVarArr, zzqwVar, j3);
        mo20183l(j2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    /* renamed from: G */
    public final zzlp mo20166G() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    /* renamed from: H */
    public zzso mo20167H() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    /* renamed from: I */
    public final void mo20168I() throws IOException {
        this.f26435e.mo15100a();
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    /* renamed from: J */
    public final void mo20169J() {
        this.f26438h = true;
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    /* renamed from: K */
    public final boolean mo20170K() {
        return this.f26438h;
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    /* renamed from: L */
    public final void mo20171L() {
        zzsk.m20481e(this.f26434d == 1);
        this.f26434d = 0;
        this.f26435e = null;
        this.f26438h = false;
        mo20185n();
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    /* renamed from: M */
    public final void mo20172M(long j2) throws zzku {
        this.f26438h = false;
        this.f26437g = false;
        mo20183l(j2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    /* renamed from: N */
    public final zzqw mo20173N() {
        return this.f26435e;
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    /* renamed from: P */
    public final void mo20174P(zzlh[] zzlhVarArr, zzqw zzqwVar, long j2) throws zzku {
        zzsk.m20481e(!this.f26438h);
        this.f26435e = zzqwVar;
        this.f26437g = false;
        this.f26436f = j2;
        mo20182k(zzlhVarArr, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    /* renamed from: Q */
    public final boolean mo20175Q() {
        return this.f26437g;
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    /* renamed from: a */
    public int mo20176a() throws zzku {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzkx
    /* renamed from: f */
    public void mo20177f(int i2, Object obj) throws zzku {
    }

    /* renamed from: g */
    protected final int m20178g() {
        return this.f26433c;
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final int getState() {
        return this.f26434d;
    }

    /* renamed from: h */
    protected void mo20179h() throws zzku {
    }

    /* renamed from: i */
    protected void mo20180i() throws zzku {
    }

    /* renamed from: j */
    protected final int m20181j(zzlj zzljVar, zznd zzndVar, boolean z) {
        int iMo15102c = this.f26435e.mo15102c(zzljVar, zzndVar, z);
        if (iMo15102c == -4) {
            if (zzndVar.m20297f()) {
                this.f26437g = true;
                return this.f26438h ? -4 : -3;
            }
            zzndVar.f26631d += this.f26436f;
        } else if (iMo15102c == -5) {
            zzlh zzlhVar = zzljVar.f26486a;
            long j2 = zzlhVar.f26460B;
            if (j2 != Long.MAX_VALUE) {
                zzljVar.f26486a = zzlhVar.m20208l(j2 + this.f26436f);
            }
        }
        return iMo15102c;
    }

    /* renamed from: k */
    protected void mo20182k(zzlh[] zzlhVarArr, long j2) throws zzku {
    }

    /* renamed from: l */
    protected void mo20183l(long j2, boolean z) throws zzku {
    }

    /* renamed from: m */
    protected final void m20184m(long j2) {
        this.f26435e.mo15101b(j2 - this.f26436f);
    }

    /* renamed from: n */
    protected void mo20185n() {
    }

    /* renamed from: o */
    protected void mo20186o(boolean z) throws zzku {
    }

    /* renamed from: p */
    protected final zzlq m20187p() {
        return this.f26432b;
    }

    /* renamed from: q */
    protected final boolean m20188q() {
        return this.f26437g ? this.f26438h : this.f26435e.mo15099B();
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final void start() throws zzku {
        zzsk.m20481e(this.f26434d == 1);
        this.f26434d = 2;
        mo20179h();
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final void stop() throws zzku {
        zzsk.m20481e(this.f26434d == 2);
        this.f26434d = 1;
        mo20180i();
    }
}
