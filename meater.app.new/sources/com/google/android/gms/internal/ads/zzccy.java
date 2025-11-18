package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzccy implements zzbrx {

    /* renamed from: f */
    private final zzams f24090f;

    public zzccy(zzams zzamsVar) {
        this.f24090f = zzamsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrx
    /* renamed from: j */
    public final void mo16103j(Context context) {
        try {
            this.f24090f.destroy();
        } catch (RemoteException e2) {
            zzbad.m17348d("Nonagon: Can't invoke onDestroy for rewarded video.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrx
    /* renamed from: k */
    public final void mo16104k(Context context) {
        try {
            this.f24090f.resume();
            if (context != null) {
                this.f24090f.mo16713w0(ObjectWrapper.m14708E0(context));
            }
        } catch (RemoteException e2) {
            zzbad.m17348d("Nonagon: Can't invoke onResume for rewarded video.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrx
    /* renamed from: r */
    public final void mo16105r(Context context) {
        try {
            this.f24090f.pause();
        } catch (RemoteException e2) {
            zzbad.m17348d("Nonagon: Can't invoke onPause for rewarded video.", e2);
        }
    }
}
