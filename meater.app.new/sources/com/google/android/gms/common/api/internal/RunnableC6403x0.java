package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.common.api.internal.x0 */
/* loaded from: classes2.dex */
final class RunnableC6403x0 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ LifecycleCallback f17470f;

    /* renamed from: g */
    final /* synthetic */ String f17471g;

    /* renamed from: h */
    final /* synthetic */ zzb f17472h;

    RunnableC6403x0(zzb zzbVar, LifecycleCallback lifecycleCallback, String str) {
        this.f17472h = zzbVar;
        this.f17470f = lifecycleCallback;
        this.f17471g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzb zzbVar = this.f17472h;
        if (zzbVar.f17631h > 0) {
            this.f17470f.mo14034e(zzbVar.f17632i != null ? zzbVar.f17632i.getBundle(this.f17471g) : null);
        }
        if (this.f17472h.f17631h >= 2) {
            this.f17470f.mo14038i();
        }
        if (this.f17472h.f17631h >= 3) {
            this.f17470f.mo14036g();
        }
        if (this.f17472h.f17631h >= 4) {
            this.f17470f.mo14039j();
        }
        if (this.f17472h.f17631h >= 5) {
            this.f17470f.mo14035f();
        }
    }
}
