package com.google.android.gms.ads.mediation;

/* loaded from: classes2.dex */
public interface MediationAdLoadCallback<MediationAdT, MediationAdCallbackT> {
    void onFailure(String str);

    MediationAdCallbackT onSuccess(MediationAdT mediationadt);
}
