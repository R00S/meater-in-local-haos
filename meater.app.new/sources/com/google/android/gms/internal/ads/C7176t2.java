package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.internal.ads.t2 */
/* loaded from: classes2.dex */
final class C7176t2 implements InitializationCompleteCallback {

    /* renamed from: a */
    private final /* synthetic */ zzaiq f20550a;

    C7176t2(zzanl zzanlVar, zzaiq zzaiqVar) {
        this.f20550a = zzaiqVar;
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(String str) {
        try {
            this.f20550a.onInitializationFailed(str);
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        try {
            this.f20550a.onInitializationSucceeded();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }
}
