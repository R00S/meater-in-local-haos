package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jn */
/* loaded from: classes2.dex */
final class C6827jn implements zzbsr {

    /* renamed from: f */
    private zzbsr f19493f;

    /* renamed from: g */
    private final /* synthetic */ zzcqj f19494g;

    public C6827jn(zzcqj zzcqjVar, zzbsr zzbsrVar) {
        this.f19494g = zzcqjVar;
        this.f19493f = zzbsrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void onAdLoaded() {
        this.f19494g.m18946m7();
        this.f19493f.onAdLoaded();
        this.f19494g.m18947n7();
    }
}
