package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzyy extends zzfm implements zzyw {
    zzyy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzyw
    public final void onAdClicked() throws RemoteException {
        m19946k0(1, m19944H());
    }
}
