package com.google.android.gms.internal.ads;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.ads.pz */
/* loaded from: classes2.dex */
final class C7061pz implements zzkc {

    /* renamed from: a */
    private final Uri f20334a;

    /* renamed from: b */
    private final zzjp f20335b;

    /* renamed from: c */
    private final zzid f20336c;

    /* renamed from: d */
    private final zzjr f20337d;

    /* renamed from: e */
    private final int f20338e;

    /* renamed from: f */
    private final zzij f20339f;

    /* renamed from: g */
    private volatile boolean f20340g;

    /* renamed from: h */
    private boolean f20341h;

    public C7061pz(Uri uri, zzjp zzjpVar, zzid zzidVar, zzjr zzjrVar, int i2, long j2) {
        this.f20334a = (Uri) zzkh.m20128c(uri);
        this.f20335b = (zzjp) zzkh.m20128c(zzjpVar);
        this.f20336c = (zzid) zzkh.m20128c(zzidVar);
        this.f20337d = (zzjr) zzkh.m20128c(zzjrVar);
        this.f20338e = i2;
        zzij zzijVar = new zzij();
        this.f20339f = zzijVar;
        zzijVar.f26298a = j2;
        this.f20341h = true;
    }

    @Override // com.google.android.gms.internal.ads.zzkc
    /* renamed from: a */
    public final boolean mo15786a() {
        return this.f20340g;
    }

    @Override // com.google.android.gms.internal.ads.zzkc
    /* renamed from: b */
    public final void mo15787b() {
        this.f20340g = true;
    }

    @Override // com.google.android.gms.internal.ads.zzkc
    /* renamed from: c */
    public final void mo15788c() throws Throwable {
        if (this.f20341h) {
            this.f20336c.mo20077e();
            this.f20341h = false;
        }
        int iMo20075c = 0;
        while (iMo20075c == 0 && !this.f20340g) {
            zzib zzibVar = null;
            try {
                long j2 = this.f20339f.f26298a;
                long jMo14852a = this.f20335b.mo14852a(new zzjq(this.f20334a, j2, -1L, null));
                if (jMo14852a != -1) {
                    jMo14852a += j2;
                }
                zzib zzibVar2 = new zzib(this.f20335b, j2, jMo14852a);
                while (iMo20075c == 0) {
                    try {
                        if (this.f20340g) {
                            break;
                        }
                        this.f20337d.m20109d(this.f20338e);
                        iMo20075c = this.f20336c.mo20075c(zzibVar2, this.f20339f);
                    } catch (Throwable th) {
                        th = th;
                        zzibVar = zzibVar2;
                        if (iMo20075c != 1 && zzibVar != null) {
                            this.f20339f.f26298a = zzibVar.getPosition();
                        }
                        this.f20335b.close();
                        throw th;
                    }
                }
                if (iMo20075c == 1) {
                    iMo20075c = 0;
                } else {
                    this.f20339f.f26298a = zzibVar2.getPosition();
                }
                this.f20335b.close();
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
