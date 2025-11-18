package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.internal.ads.b3 */
/* loaded from: classes2.dex */
final class C6511b3 implements MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> {

    /* renamed from: a */
    private final /* synthetic */ zzaos f18238a;

    /* renamed from: b */
    private final /* synthetic */ zzamv f18239b;

    /* renamed from: c */
    private final /* synthetic */ zzapc f18240c;

    C6511b3(zzapc zzapcVar, zzaos zzaosVar, zzamv zzamvVar) {
        this.f18240c = zzapcVar;
        this.f18238a = zzaosVar;
        this.f18239b = zzamvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final MediationRewardedAdCallback onSuccess(MediationRewardedAd mediationRewardedAd) {
        try {
            this.f18240c.f22216h = mediationRewardedAd;
            this.f18238a.mo15903K0();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
        return new C6622e3(this.f18239b);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        try {
            this.f18238a.mo15904p(str);
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }
}
