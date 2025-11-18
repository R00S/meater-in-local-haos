package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.PublisherAdView;

/* renamed from: com.google.android.gms.internal.ads.x */
/* loaded from: classes2.dex */
final class RunnableC7321x implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ PublisherAdView f20886f;

    /* renamed from: g */
    private final /* synthetic */ zzzk f20887g;

    /* renamed from: h */
    private final /* synthetic */ zzagq f20888h;

    RunnableC7321x(zzagq zzagqVar, PublisherAdView publisherAdView, zzzk zzzkVar) {
        this.f20888h = zzagqVar;
        this.f20886f = publisherAdView;
        this.f20887g = zzzkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f20886f.zza(this.f20887g)) {
            this.f20888h.f22012f.onPublisherAdViewLoaded(this.f20886f);
        } else {
            zzbad.m17353i("Could not bind.");
        }
    }
}
