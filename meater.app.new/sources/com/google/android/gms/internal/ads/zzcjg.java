package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcjg implements zzbro, zzbsr {

    /* renamed from: f */
    private static final Object f24387f = new Object();

    /* renamed from: g */
    private static int f24388g;

    /* renamed from: h */
    private final zzcjm f24389h;

    public zzcjg(zzcjm zzcjmVar) {
        this.f24389h = zzcjmVar;
    }

    /* renamed from: a */
    private static void m18817a() {
        synchronized (f24387f) {
            f24388g++;
        }
    }

    /* renamed from: b */
    private static boolean m18818b() {
        boolean z;
        synchronized (f24387f) {
            z = f24388g < ((Integer) zzyt.m20848e().m16421c(zzacu.f21761b5)).intValue();
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzbro
    public final void onAdFailedToLoad(int i2) {
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21754a5)).booleanValue() && m18818b()) {
            this.f24389h.m18840g(false);
            m18817a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void onAdLoaded() {
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21754a5)).booleanValue() && m18818b()) {
            this.f24389h.m18840g(true);
            m18817a();
        }
    }
}
