package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ez */
/* loaded from: classes2.dex */
final class RunnableC6654ez implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f18840f;

    /* renamed from: g */
    private final /* synthetic */ long f18841g;

    /* renamed from: h */
    private final /* synthetic */ long f18842h;

    /* renamed from: i */
    private final /* synthetic */ zzgr f18843i;

    RunnableC6654ez(zzgr zzgrVar, String str, long j2, long j3) {
        this.f18843i = zzgrVar;
        this.f18840f = str;
        this.f18841g = j2;
        this.f18842h = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18843i.f26148j.mo14750c(this.f18840f, this.f18841g, this.f18842h);
    }
}
