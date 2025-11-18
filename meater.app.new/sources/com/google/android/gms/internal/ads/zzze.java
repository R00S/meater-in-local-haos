package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzze extends zzfm implements zzzc {
    zzze(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    /* renamed from: F5 */
    public final void mo15083F5(zzxz zzxzVar, int i2) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19950d(parcelM19944H, zzxzVar);
        parcelM19944H.writeInt(i2);
        m19946k0(5, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    /* renamed from: c0 */
    public final String mo15084c0() throws RemoteException {
        Parcel parcelM19945P = m19945P(4, m19944H());
        String string = parcelM19945P.readString();
        parcelM19945P.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    /* renamed from: j2 */
    public final void mo15085j2(zzxz zzxzVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19950d(parcelM19944H, zzxzVar);
        m19946k0(1, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    /* renamed from: p0 */
    public final boolean mo15086p0() throws RemoteException {
        Parcel parcelM19945P = m19945P(3, m19944H());
        boolean zM19951e = zzfo.m19951e(parcelM19945P);
        parcelM19945P.recycle();
        return zM19951e;
    }
}
