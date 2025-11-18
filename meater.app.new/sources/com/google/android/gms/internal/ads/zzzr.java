package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzzr extends zzfm implements zzzp {
    zzzr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdMetadataListener");
    }

    @Override // com.google.android.gms.internal.ads.zzzp
    public final void onAdMetadataChanged() throws RemoteException {
        m19946k0(1, m19944H());
    }
}
