package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public class zzic implements zzip {

    /* renamed from: a */
    private final C7135rz f26258a;

    /* renamed from: b */
    private final zzhm f26259b = new zzhm(0);

    /* renamed from: c */
    private boolean f26260c = true;

    /* renamed from: d */
    private long f26261d = Long.MIN_VALUE;

    /* renamed from: e */
    private long f26262e = Long.MIN_VALUE;

    /* renamed from: f */
    private volatile long f26263f = Long.MIN_VALUE;

    /* renamed from: g */
    private volatile zzhj f26264g;

    public zzic(zzjl zzjlVar) {
        this.f26258a = new C7135rz(zzjlVar);
    }

    /* renamed from: m */
    private final boolean m20063m() {
        boolean zM15830f = this.f26258a.m15830f(this.f26259b);
        if (this.f26260c) {
            while (zM15830f && !this.f26259b.m20029b()) {
                this.f26258a.m15833j();
                zM15830f = this.f26258a.m15830f(this.f26259b);
            }
        }
        if (!zM15830f) {
            return false;
        }
        long j2 = this.f26262e;
        return j2 == Long.MIN_VALUE || this.f26259b.f26210e < j2;
    }

    @Override // com.google.android.gms.internal.ads.zzip
    /* renamed from: a */
    public final int mo20064a(zzie zzieVar, int i2) throws InterruptedException, IOException {
        return this.f26258a.m15828d(zzieVar, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzip
    /* renamed from: b */
    public final void mo20065b(zzhj zzhjVar) {
        this.f26264g = zzhjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzip
    /* renamed from: c */
    public final void mo20066c(zzkm zzkmVar, int i2) {
        this.f26258a.m15829e(zzkmVar, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzip
    /* renamed from: d */
    public void mo15814d(long j2, int i2, int i3, int i4, byte[] bArr) {
        this.f26263f = Math.max(this.f26263f, j2);
        C7135rz c7135rz = this.f26258a;
        c7135rz.m15827b(j2, i2, (c7135rz.m15834k() - i3) - i4, i3, bArr);
    }

    /* renamed from: e */
    public final void m20067e() {
        this.f26258a.m15826a();
        this.f26260c = true;
        this.f26261d = Long.MIN_VALUE;
        this.f26262e = Long.MIN_VALUE;
        this.f26263f = Long.MIN_VALUE;
    }

    /* renamed from: f */
    public final boolean m20068f() {
        return !m20063m();
    }

    /* renamed from: g */
    public final boolean m20069g(zzhm zzhmVar) {
        if (!m20063m()) {
            return false;
        }
        this.f26258a.m15831g(zzhmVar);
        this.f26260c = false;
        this.f26261d = zzhmVar.f26210e;
        return true;
    }

    /* renamed from: h */
    public final void m20070h(long j2) {
        while (this.f26258a.m15830f(this.f26259b) && this.f26259b.f26210e < j2) {
            this.f26258a.m15833j();
            this.f26260c = true;
        }
        this.f26261d = Long.MIN_VALUE;
    }

    /* renamed from: i */
    public final boolean m20071i(long j2) {
        return this.f26258a.m15832h(j2);
    }

    /* renamed from: j */
    public final boolean m20072j() {
        return this.f26264g != null;
    }

    /* renamed from: k */
    public final zzhj m20073k() {
        return this.f26264g;
    }

    /* renamed from: l */
    public final long m20074l() {
        return this.f26263f;
    }
}
