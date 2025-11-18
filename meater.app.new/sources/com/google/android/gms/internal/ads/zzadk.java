package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.doubleclick.CustomRenderedAd;
import com.google.android.gms.dynamic.ObjectWrapper;

@zzard
/* loaded from: classes2.dex */
public final class zzadk implements CustomRenderedAd {

    /* renamed from: a */
    private final zzadl f21939a;

    public zzadk(zzadl zzadlVar) {
        this.f21939a = zzadlVar;
    }

    @Override // com.google.android.gms.ads.doubleclick.CustomRenderedAd
    public final String getBaseUrl() {
        try {
            return this.f21939a.mo16454M5();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.doubleclick.CustomRenderedAd
    public final String getContent() {
        try {
            return this.f21939a.getContent();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.doubleclick.CustomRenderedAd
    public final void onAdRendered(View view) {
        try {
            this.f21939a.mo16455z1(view != null ? ObjectWrapper.m14708E0(view) : null);
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.doubleclick.CustomRenderedAd
    public final void recordClick() {
        try {
            this.f21939a.recordClick();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.doubleclick.CustomRenderedAd
    public final void recordImpression() {
        try {
            this.f21939a.recordImpression();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }
}
