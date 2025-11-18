package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fn */
/* loaded from: classes2.dex */
final class C6679fn implements zzbsr {

    /* renamed from: f */
    private zzbsr f18908f;

    /* renamed from: g */
    private final /* synthetic */ zzcqf f18909g;

    public C6679fn(zzcqf zzcqfVar, zzbsr zzbsrVar) {
        this.f18909g = zzcqfVar;
        this.f18908f = zzbsrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void onAdLoaded() {
        this.f18909g.m18940l7();
        this.f18908f.onAdLoaded();
        this.f18909g.m18941m7();
    }
}
