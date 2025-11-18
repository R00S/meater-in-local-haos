package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.internal.ads.s2 */
/* loaded from: classes2.dex */
final class C7139s2 implements MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> {

    /* renamed from: a */
    private final /* synthetic */ zzamv f20492a;

    /* renamed from: b */
    private final /* synthetic */ Adapter f20493b;

    /* renamed from: c */
    private final /* synthetic */ zzanl f20494c;

    C7139s2(zzanl zzanlVar, zzamv zzamvVar, Adapter adapter) {
        this.f20494c = zzanlVar;
        this.f20492a = zzamvVar;
        this.f20493b = adapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final MediationRewardedAdCallback onSuccess(MediationRewardedAd mediationRewardedAd) {
        try {
            this.f20494c.f22189j = mediationRewardedAd;
            this.f20492a.onAdLoaded();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
        return new zzauo(this.f20492a);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        try {
            String canonicalName = this.f20493b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(str).length());
            sb.append(canonicalName);
            sb.append("failed to loaded medation ad: ");
            sb.append(str);
            zzbad.m17349e(sb.toString());
            this.f20492a.onAdFailedToLoad(0);
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }
}
