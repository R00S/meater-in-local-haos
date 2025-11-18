package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzaoo extends zzfm implements zzaom {
    zzaoo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaom
    /* renamed from: K0 */
    public final void mo15110K0() throws RemoteException {
        m19946k0(2, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzaom
    /* renamed from: p */
    public final void mo15111p(String str) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeString(str);
        m19946k0(3, parcelM19944H);
    }
}
