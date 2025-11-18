package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.internal.ads.a3 */
/* loaded from: classes2.dex */
final class C6474a3 implements MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> {

    /* renamed from: a */
    private final /* synthetic */ zzaom f18073a;

    /* renamed from: b */
    private final /* synthetic */ zzamv f18074b;

    /* renamed from: c */
    private final /* synthetic */ zzapc f18075c;

    C6474a3(zzapc zzapcVar, zzaom zzaomVar, zzamv zzamvVar) {
        this.f18075c = zzapcVar;
        this.f18073a = zzaomVar;
        this.f18074b = zzamvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final MediationInterstitialAdCallback onSuccess(MediationInterstitialAd mediationInterstitialAd) {
        try {
            this.f18075c.f22215g = mediationInterstitialAd;
            this.f18073a.mo15110K0();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
        return new C6622e3(this.f18074b);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        try {
            this.f18073a.mo15111p(str);
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }
}
