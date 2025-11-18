package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.internal.ads.z2 */
/* loaded from: classes2.dex */
final class C7398z2 implements MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> {

    /* renamed from: a */
    private final /* synthetic */ zzaoj f21354a;

    /* renamed from: b */
    private final /* synthetic */ zzamv f21355b;

    C7398z2(zzapc zzapcVar, zzaoj zzaojVar, zzamv zzamvVar) {
        this.f21354a = zzaojVar;
        this.f21355b = zzamvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final MediationBannerAdCallback onSuccess(MediationBannerAd mediationBannerAd) {
        try {
            this.f21354a.mo15687c1(ObjectWrapper.m14708E0(mediationBannerAd.getView()));
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
        return new C6622e3(this.f21355b);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        try {
            this.f21354a.mo15688p(str);
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }
}
