package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzabv extends zzatu {
    @Override // com.google.android.gms.internal.ads.zzatt
    /* renamed from: G5 */
    public final void mo16375G5(zzaao zzaaoVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    /* renamed from: K2 */
    public final void mo16376K2(zzaue zzaueVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    /* renamed from: L5 */
    public final void mo16377L5(zzatw zzatwVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    /* renamed from: O6 */
    public final zzatq mo16378O6() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    /* renamed from: W1 */
    public final void mo16379W1(zzxz zzxzVar, final zzaub zzaubVar) throws RemoteException {
        zzbad.m17351g("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzazt.f22735a.post(new Runnable(zzaubVar) { // from class: com.google.android.gms.internal.ads.i

            /* renamed from: f */
            private final zzaub f19252f;

            {
                this.f19252f = zzaubVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzaub zzaubVar2 = this.f19252f;
                if (zzaubVar2 != null) {
                    try {
                        zzaubVar2.mo16950R4(1);
                    } catch (RemoteException e2) {
                        zzbad.m17350f("#007 Could not call remote method.", e2);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    /* renamed from: e7 */
    public final void mo16380e7(IObjectWrapper iObjectWrapper, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    /* renamed from: f5 */
    public final void mo16381f5(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final Bundle getAdMetadata() throws RemoteException {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final String getMediationAdapterClassName() throws RemoteException {
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final boolean isLoaded() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    /* renamed from: m2 */
    public final void mo16382m2(zzaum zzaumVar) {
    }
}
