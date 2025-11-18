package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.a8 */
/* loaded from: classes2.dex */
final class RunnableC6479a8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ boolean f18094f;

    /* renamed from: g */
    private final /* synthetic */ zzbcq f18095g;

    RunnableC6479a8(zzbcq zzbcqVar, boolean z) {
        this.f18095g = zzbcqVar;
        this.f18094f = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18095g.m17439x("windowVisibilityChanged", "isVisible", String.valueOf(this.f18094f));
    }
}
