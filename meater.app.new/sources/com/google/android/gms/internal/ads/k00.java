package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class k00 implements Runnable {

    /* renamed from: f */
    private final zzr f19510f;

    /* renamed from: g */
    private final zzy f19511g;

    /* renamed from: h */
    private final Runnable f19512h;

    public k00(zzr zzrVar, zzy zzyVar, Runnable runnable) {
        this.f19510f = zzrVar;
        this.f19511g = zzyVar;
        this.f19512h = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19510f.m20431u();
        zzy zzyVar = this.f19511g;
        zzaf zzafVar = zzyVar.f27425c;
        if (zzafVar == null) {
            this.f19510f.mo16035F(zzyVar.f27423a);
        } else {
            this.f19510f.m20417H(zzafVar);
        }
        if (this.f19511g.f27426d) {
            this.f19510f.m20418I("intermediate-response");
        } else {
            this.f19510f.m20419J("done");
        }
        Runnable runnable = this.f19512h;
        if (runnable != null) {
            runnable.run();
        }
    }
}
