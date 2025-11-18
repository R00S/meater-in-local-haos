package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

@zzard
/* loaded from: classes2.dex */
public final class zzabz extends zzaap {

    /* renamed from: f */
    private final OnAdMetadataChangedListener f21571f;

    public zzabz(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.f21571f = onAdMetadataChangedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void onAdMetadataChanged() throws RemoteException {
        OnAdMetadataChangedListener onAdMetadataChangedListener = this.f21571f;
        if (onAdMetadataChangedListener != null) {
            onAdMetadataChangedListener.onAdMetadataChanged();
        }
    }
}
