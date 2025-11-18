package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.AdMetadataListener;

/* loaded from: classes2.dex */
public final class zzcpz extends AdMetadataListener {

    /* renamed from: a */
    private zzaao f24902a;

    /* renamed from: a */
    public final synchronized void m18928a(zzaao zzaaoVar) {
        this.f24902a = zzaaoVar;
    }

    @Override // com.google.android.gms.ads.reward.AdMetadataListener
    public final synchronized void onAdMetadataChanged() {
        zzaao zzaaoVar = this.f24902a;
        if (zzaaoVar != null) {
            try {
                zzaaoVar.onAdMetadataChanged();
            } catch (RemoteException e2) {
                zzbad.m17350f("#007 Could not call remote method.", e2);
            }
        }
    }
}
