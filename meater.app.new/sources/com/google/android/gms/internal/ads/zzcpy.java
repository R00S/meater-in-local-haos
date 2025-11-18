package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.AppEventListener;

/* loaded from: classes2.dex */
public final class zzcpy implements AppEventListener {

    /* renamed from: f */
    private zzzs f24901f;

    /* renamed from: a */
    public final synchronized zzzs m18926a() {
        return this.f24901f;
    }

    /* renamed from: b */
    public final synchronized void m18927b(zzzs zzzsVar) {
        this.f24901f = zzzsVar;
    }

    @Override // com.google.android.gms.ads.doubleclick.AppEventListener
    public final synchronized void onAppEvent(String str, String str2) {
        zzzs zzzsVar = this.f24901f;
        if (zzzsVar != null) {
            try {
                zzzsVar.onAppEvent(str, str2);
            } catch (RemoteException e2) {
                zzbad.m17348d("Remote Exception at onAppEvent.", e2);
            }
        }
    }
}
