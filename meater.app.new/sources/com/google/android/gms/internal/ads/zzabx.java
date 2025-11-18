package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzabx extends zzasx {

    /* renamed from: f */
    private zzatb f21570f;

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: M6 */
    public final void mo16384M6(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: T4 */
    public final void mo16385T4(zzasu zzasuVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: T5 */
    public final void mo16386T5(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: d2 */
    public final void mo16387d2(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void destroy() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: g5 */
    public final void mo16388g5(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final Bundle getAdMetadata() throws RemoteException {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final String getMediationAdapterClassName() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: h0 */
    public final void mo16389h0(zzatb zzatbVar) throws RemoteException {
        this.f21570f = zzatbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: i4 */
    public final void mo16390i4(zzath zzathVar) throws RemoteException {
        zzbad.m17351g("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzazt.f22735a.post(new RunnableC6803j(this));
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final boolean isLoaded() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void pause() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void resume() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: s0 */
    public final void mo16391s0(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void setCustomData(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void setImmersiveMode(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void setUserId(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void show() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: z0 */
    public final void mo16392z0(zzzp zzzpVar) throws RemoteException {
    }
}
