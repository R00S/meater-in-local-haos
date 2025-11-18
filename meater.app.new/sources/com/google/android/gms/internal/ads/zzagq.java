package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzagq extends zzafv {

    /* renamed from: f */
    private final OnPublisherAdViewLoadedListener f22012f;

    public zzagq(OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener) {
        this.f22012f = onPublisherAdViewLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzafu
    /* renamed from: h1 */
    public final void mo16522h1(zzzk zzzkVar, IObjectWrapper iObjectWrapper) {
        if (zzzkVar == null || iObjectWrapper == null) {
            return;
        }
        PublisherAdView publisherAdView = new PublisherAdView((Context) ObjectWrapper.m14709k0(iObjectWrapper));
        try {
            if (zzzkVar.mo16363x5() instanceof zzxv) {
                zzxv zzxvVar = (zzxv) zzzkVar.mo16363x5();
                publisherAdView.setAdListener(zzxvVar != null ? zzxvVar.m20814h7() : null);
            }
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
        try {
            if (zzzkVar.mo16346I4() instanceof zzyf) {
                zzyf zzyfVar = (zzyf) zzzkVar.mo16346I4();
                publisherAdView.setAppEventListener(zzyfVar != null ? zzyfVar.m20826i7() : null);
            }
        } catch (RemoteException e3) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e3);
        }
        zzazt.f22735a.post(new RunnableC7321x(this, publisherAdView, zzzkVar));
    }
}
