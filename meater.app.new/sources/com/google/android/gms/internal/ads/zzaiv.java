package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzaiv extends zzfm implements zzait {
    zzaiv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzait
    /* renamed from: u0 */
    public final void mo16591u0(List<zzaio> list) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeTypedList(list);
        m19946k0(1, parcelM19944H);
    }
}
