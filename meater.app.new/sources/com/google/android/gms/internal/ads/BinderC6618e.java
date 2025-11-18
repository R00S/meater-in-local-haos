package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.e */
/* loaded from: classes2.dex */
final class BinderC6618e extends zzzd {

    /* renamed from: f */
    final /* synthetic */ zzabl f18709f;

    private BinderC6618e(zzabl zzablVar) {
        this.f18709f = zzablVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    /* renamed from: F5 */
    public final void mo15083F5(zzxz zzxzVar, int i2) throws RemoteException {
        zzbad.m17351g("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzazt.f22735a.post(new RunnableC6655f(this));
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    /* renamed from: c0 */
    public final String mo15084c0() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final String getMediationAdapterClassName() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    /* renamed from: j2 */
    public final void mo15085j2(zzxz zzxzVar) throws RemoteException {
        mo15083F5(zzxzVar, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    /* renamed from: p0 */
    public final boolean mo15086p0() throws RemoteException {
        return false;
    }
}
