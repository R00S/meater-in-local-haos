package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.common.api.internal.y0 */
/* loaded from: classes2.dex */
final class RunnableC6405y0 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ LifecycleCallback f17474f;

    /* renamed from: g */
    final /* synthetic */ String f17475g;

    /* renamed from: h */
    final /* synthetic */ zzd f17476h;

    RunnableC6405y0(zzd zzdVar, LifecycleCallback lifecycleCallback, String str) {
        this.f17476h = zzdVar;
        this.f17474f = lifecycleCallback;
        this.f17475g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzd zzdVar = this.f17476h;
        if (zzdVar.f17635h > 0) {
            this.f17474f.mo14034e(zzdVar.f17636i != null ? zzdVar.f17636i.getBundle(this.f17475g) : null);
        }
        if (this.f17476h.f17635h >= 2) {
            this.f17474f.mo14038i();
        }
        if (this.f17476h.f17635h >= 3) {
            this.f17474f.mo14036g();
        }
        if (this.f17476h.f17635h >= 4) {
            this.f17474f.mo14039j();
        }
        if (this.f17476h.f17635h >= 5) {
            this.f17474f.mo14035f();
        }
    }
}
