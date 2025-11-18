package com.google.ads.mediation;

import com.google.ads.mediation.MediationServerParameters;

@Deprecated
/* renamed from: com.google.ads.mediation.b */
/* loaded from: classes2.dex */
public interface InterfaceC6226b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS extends MediationServerParameters> {
    void destroy();

    Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    Class<SERVER_PARAMETERS> getServerParametersType();
}
