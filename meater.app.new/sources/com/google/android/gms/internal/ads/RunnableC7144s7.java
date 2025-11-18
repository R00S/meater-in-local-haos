package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.s7 */
/* loaded from: classes2.dex */
final class RunnableC7144s7 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ int f20507f;

    /* renamed from: g */
    private final /* synthetic */ int f20508g;

    /* renamed from: h */
    private final /* synthetic */ zzbcd f20509h;

    RunnableC7144s7(zzbcd zzbcdVar, int i2, int i3) {
        this.f20509h = zzbcdVar;
        this.f20507f = i2;
        this.f20508g = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f20509h.f22785w != null) {
            this.f20509h.f22785w.mo17419d(this.f20507f, this.f20508g);
        }
    }
}
