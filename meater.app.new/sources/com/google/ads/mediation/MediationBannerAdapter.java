package com.google.ads.mediation;

import android.app.Activity;
import android.view.View;
import com.google.ads.mediation.InterfaceC6234e;
import com.google.ads.mediation.MediationServerParameters;
import p241e.p254e.p255a.C8783c;

@Deprecated
/* loaded from: classes2.dex */
public interface MediationBannerAdapter<ADDITIONAL_PARAMETERS extends InterfaceC6234e, SERVER_PARAMETERS extends MediationServerParameters> extends InterfaceC6226b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    @Override // com.google.ads.mediation.InterfaceC6226b
    /* synthetic */ void destroy();

    @Override // com.google.ads.mediation.InterfaceC6226b
    /* synthetic */ Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    View getBannerView();

    @Override // com.google.ads.mediation.InterfaceC6226b
    /* synthetic */ Class<SERVER_PARAMETERS> getServerParametersType();

    void requestBannerAd(InterfaceC6227c interfaceC6227c, Activity activity, SERVER_PARAMETERS server_parameters, C8783c c8783c, C6225a c6225a, ADDITIONAL_PARAMETERS additional_parameters);
}
