package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.AdMetadataListener;

/* loaded from: classes2.dex */
public final class zzcpx extends AdMetadataListener {

    /* renamed from: a */
    private zzzp f24900a;

    /* renamed from: a */
    public final synchronized void m18925a(zzzp zzzpVar) {
        this.f24900a = zzzpVar;
    }

    @Override // com.google.android.gms.ads.reward.AdMetadataListener
    public final synchronized void onAdMetadataChanged() {
        zzzp zzzpVar = this.f24900a;
        if (zzzpVar != null) {
            try {
                zzzpVar.onAdMetadataChanged();
            } catch (RemoteException e2) {
                zzbad.m17348d("Remote Exception at onAdMetadataChanged.", e2);
            }
        }
    }
}
