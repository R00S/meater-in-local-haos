package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzaqi extends zzfm implements zzaqg {
    zzaqi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onActivityResult(int i2, int i3, Intent intent) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeInt(i2);
        parcelM19944H.writeInt(i3);
        zzfo.m19950d(parcelM19944H, intent);
        m19946k0(12, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onCreate(Bundle bundle) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19950d(parcelM19944H, bundle);
        m19946k0(1, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onDestroy() throws RemoteException {
        m19946k0(8, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onPause() throws RemoteException {
        m19946k0(5, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onRestart() throws RemoteException {
        m19946k0(2, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onResume() throws RemoteException {
        m19946k0(4, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19950d(parcelM19944H, bundle);
        Parcel parcelM19945P = m19945P(6, parcelM19944H);
        if (parcelM19945P.readInt() != 0) {
            bundle.readFromParcel(parcelM19945P);
        }
        parcelM19945P.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onStart() throws RemoteException {
        m19946k0(3, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onStop() throws RemoteException {
        m19946k0(7, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void zzac(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        m19946k0(13, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void zzdd() throws RemoteException {
        m19946k0(9, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final boolean zztg() throws RemoteException {
        Parcel parcelM19945P = m19945P(11, m19944H());
        boolean zM19951e = zzfo.m19951e(parcelM19945P);
        parcelM19945P.recycle();
        return zM19951e;
    }
}
