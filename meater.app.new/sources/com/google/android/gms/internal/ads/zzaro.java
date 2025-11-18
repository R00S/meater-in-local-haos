package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzaro extends zzfm implements zzarm {
    zzaro(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    /* renamed from: I5 */
    public final void mo16892I5(zzarx zzarxVar, zzarr zzarrVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19950d(parcelM19944H, zzarxVar);
        zzfo.m19949c(parcelM19944H, zzarrVar);
        m19946k0(4, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    /* renamed from: X6 */
    public final void mo16894X6(zzarx zzarxVar, zzarr zzarrVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19950d(parcelM19944H, zzarxVar);
        zzfo.m19949c(parcelM19944H, zzarrVar);
        m19946k0(5, parcelM19944H);
    }
}
