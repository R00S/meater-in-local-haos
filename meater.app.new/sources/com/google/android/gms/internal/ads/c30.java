package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes2.dex */
final class c30 implements zzsh {

    /* renamed from: a */
    private final Uri f18392a;

    /* renamed from: b */
    private final zzrv f18393b;

    /* renamed from: c */
    private final d30 f18394c;

    /* renamed from: d */
    private final zzsm f18395d;

    /* renamed from: f */
    private volatile boolean f18397f;

    /* renamed from: h */
    private long f18399h;

    /* renamed from: j */
    private final /* synthetic */ x20 f18401j;

    /* renamed from: e */
    private final zznt f18396e = new zznt();

    /* renamed from: g */
    private boolean f18398g = true;

    /* renamed from: i */
    private long f18400i = -1;

    public c30(x20 x20Var, Uri uri, zzrv zzrvVar, d30 d30Var, zzsm zzsmVar) {
        this.f18401j = x20Var;
        this.f18392a = (Uri) zzsk.m20480d(uri);
        this.f18393b = (zzrv) zzsk.m20480d(zzrvVar);
        this.f18394c = (d30) zzsk.m20480d(d30Var);
        this.f18395d = zzsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsh
    /* renamed from: a */
    public final boolean mo14959a() {
        return this.f18397f;
    }

    @Override // com.google.android.gms.internal.ads.zzsh
    /* renamed from: b */
    public final void mo14960b() {
        this.f18397f = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsh
    /* renamed from: c */
    public final void mo14961c() throws Throwable {
        int iMo20330d = 0;
        while (iMo20330d == 0 && !this.f18397f) {
            zznm zznmVar = null;
            try {
                long position = this.f18396e.f26658a;
                long jMo15549a = this.f18393b.mo15549a(new zzry(this.f18392a, position, -1L, this.f18401j.f20920m));
                this.f18400i = jMo15549a;
                if (jMo15549a != -1) {
                    this.f18400i = jMo15549a + position;
                }
                zznm zznmVar2 = new zznm(this.f18393b, position, this.f18400i);
                try {
                    zznn zznnVarM15026b = this.f18394c.m15026b(zznmVar2, this.f18393b.mo15548I0());
                    if (this.f18398g) {
                        zznnVarM15026b.mo20333h(position, this.f18399h);
                        this.f18398g = false;
                    }
                    while (iMo20330d == 0 && !this.f18397f) {
                        this.f18395d.m20488a();
                        iMo20330d = zznnVarM15026b.mo20330d(zznmVar2, this.f18396e);
                        if (zznmVar2.getPosition() > this.f18401j.f20921n + position) {
                            position = zznmVar2.getPosition();
                            this.f18395d.m20490c();
                            this.f18401j.f20927t.post(this.f18401j.f20926s);
                        }
                    }
                    if (iMo20330d == 1) {
                        iMo20330d = 0;
                    } else {
                        this.f18396e.f26658a = zznmVar2.getPosition();
                    }
                    zzsy.m20541e(this.f18393b);
                } catch (Throwable th) {
                    th = th;
                    zznmVar = zznmVar2;
                    if (iMo20330d != 1 && zznmVar != null) {
                        this.f18396e.f26658a = zznmVar.getPosition();
                    }
                    zzsy.m20541e(this.f18393b);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* renamed from: e */
    public final void m14962e(long j2, long j3) {
        this.f18396e.f26658a = j2;
        this.f18399h = j3;
        this.f18398g = true;
    }
}
