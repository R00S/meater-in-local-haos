package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzamr extends zzfm implements zzamp {
    zzamr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzamp
    /* renamed from: N6 */
    public final boolean mo16692N6(String str) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeString(str);
        Parcel parcelM19945P = m19945P(2, parcelM19944H);
        boolean zM19951e = zzfo.m19951e(parcelM19945P);
        parcelM19945P.recycle();
        return zM19951e;
    }

    @Override // com.google.android.gms.internal.ads.zzamp
    /* renamed from: P2 */
    public final zzaov mo16693P2(String str) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeString(str);
        Parcel parcelM19945P = m19945P(3, parcelM19944H);
        zzaov zzaovVarM16821h7 = zzaow.m16821h7(parcelM19945P.readStrongBinder());
        parcelM19945P.recycle();
        return zzaovVarM16821h7;
    }

    @Override // com.google.android.gms.internal.ads.zzamp
    /* renamed from: l6 */
    public final zzams mo16695l6(String str) throws RemoteException {
        zzams zzamuVar;
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeString(str);
        Parcel parcelM19945P = m19945P(1, parcelM19944H);
        IBinder strongBinder = parcelM19945P.readStrongBinder();
        if (strongBinder == null) {
            zzamuVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzamuVar = iInterfaceQueryLocalInterface instanceof zzams ? (zzams) iInterfaceQueryLocalInterface : new zzamu(strongBinder);
        }
        parcelM19945P.recycle();
        return zzamuVar;
    }
}
