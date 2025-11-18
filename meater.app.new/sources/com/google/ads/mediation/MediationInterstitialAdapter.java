package com.google.ads.mediation;

import android.app.Activity;
import com.google.ads.mediation.InterfaceC6234e;
import com.google.ads.mediation.MediationServerParameters;

@Deprecated
/* loaded from: classes2.dex */
public interface MediationInterstitialAdapter<ADDITIONAL_PARAMETERS extends InterfaceC6234e, SERVER_PARAMETERS extends MediationServerParameters> extends InterfaceC6226b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    @Override // com.google.ads.mediation.InterfaceC6226b
    /* synthetic */ void destroy();

    @Override // com.google.ads.mediation.InterfaceC6226b
    /* synthetic */ Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    @Override // com.google.ads.mediation.InterfaceC6226b
    /* synthetic */ Class<SERVER_PARAMETERS> getServerParametersType();

    void requestInterstitialAd(InterfaceC6233d interfaceC6233d, Activity activity, SERVER_PARAMETERS server_parameters, C6225a c6225a, ADDITIONAL_PARAMETERS additional_parameters);

    void showInterstitial();
}
