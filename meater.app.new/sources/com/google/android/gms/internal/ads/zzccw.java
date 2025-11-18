package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;

/* loaded from: classes2.dex */
public final class zzccw extends VideoController.VideoLifecycleCallbacks {

    /* renamed from: a */
    private final zzbyt f24088a;

    public zzccw(zzbyt zzbytVar) {
        this.f24088a = zzbytVar;
    }

    /* renamed from: a */
    private static zzaau m18673a(zzbyt zzbytVar) {
        zzaar zzaarVarM18545m = zzbytVar.m18545m();
        if (zzaarVarM18545m == null) {
            return null;
        }
        try {
            return zzaarVarM18545m.mo16196a5();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        zzaau zzaauVarM18673a = m18673a(this.f24088a);
        if (zzaauVarM18673a == null) {
            return;
        }
        try {
            zzaauVarM18673a.mo16203n0();
        } catch (RemoteException e2) {
            zzbad.m17348d("Unable to call onVideoEnd()", e2);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        zzaau zzaauVarM18673a = m18673a(this.f24088a);
        if (zzaauVarM18673a == null) {
            return;
        }
        try {
            zzaauVarM18673a.onVideoPause();
        } catch (RemoteException e2) {
            zzbad.m17348d("Unable to call onVideoEnd()", e2);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        zzaau zzaauVarM18673a = m18673a(this.f24088a);
        if (zzaauVarM18673a == null) {
            return;
        }
        try {
            zzaauVarM18673a.onVideoStart();
        } catch (RemoteException e2) {
            zzbad.m17348d("Unable to call onVideoEnd()", e2);
        }
    }
}
