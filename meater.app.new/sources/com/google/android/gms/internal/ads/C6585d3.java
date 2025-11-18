package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.internal.ads.d3 */
/* loaded from: classes2.dex */
final class C6585d3 implements SignalCallbacks {

    /* renamed from: a */
    private final /* synthetic */ zzaoy f18483a;

    C6585d3(zzapc zzapcVar, zzaoy zzaoyVar) {
        this.f18483a = zzaoyVar;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(String str) {
        try {
            this.f18483a.onFailure(str);
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onSuccess(String str) {
        try {
            this.f18483a.mo16822R2(str);
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }
}
