package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzajd extends zzfm implements zzajc {
    zzajd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzajc
    /* renamed from: c7 */
    public final void mo16595c7() throws RemoteException {
        m19946k0(1, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzajc
    /* renamed from: i2 */
    public final void mo16596i2(int i2) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeInt(i2);
        m19946k0(2, parcelM19944H);
    }
}
