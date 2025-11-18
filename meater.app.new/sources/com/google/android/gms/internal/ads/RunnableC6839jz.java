package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jz */
/* loaded from: classes2.dex */
final class RunnableC6839jz implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ int f19506f;

    /* renamed from: g */
    private final /* synthetic */ int f19507g;

    /* renamed from: h */
    private final /* synthetic */ float f19508h;

    /* renamed from: i */
    private final /* synthetic */ zzhd f19509i;

    RunnableC6839jz(zzhd zzhdVar, int i2, int i3, float f2) {
        this.f19509i = zzhdVar;
        this.f19506f = i2;
        this.f19507g = i3;
        this.f19508h = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19509i.f26175H.mo15394e(this.f19506f, this.f19507g, this.f19508h);
    }
}
