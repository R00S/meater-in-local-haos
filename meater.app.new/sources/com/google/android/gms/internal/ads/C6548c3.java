package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.internal.ads.c3 */
/* loaded from: classes2.dex */
final class C6548c3 implements MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> {

    /* renamed from: a */
    private final /* synthetic */ zzaop f18390a;

    /* renamed from: b */
    private final /* synthetic */ zzamv f18391b;

    C6548c3(zzapc zzapcVar, zzaop zzaopVar, zzamv zzamvVar) {
        this.f18390a = zzaopVar;
        this.f18391b = zzamvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final MediationNativeAdCallback onSuccess(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        try {
            this.f18390a.mo15555E4(new zzaoi(unifiedNativeAdMapper));
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
        return new C6622e3(this.f18391b);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        try {
            this.f18390a.mo15556p(str);
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }
}
