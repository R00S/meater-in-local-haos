package com.google.android.gms.auth.api.phone;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.internal.p476authapiphone.zzi;

/* loaded from: classes2.dex */
public abstract class SmsRetrieverClient extends GoogleApi<Api.ApiOptions.NoOptions> implements SmsRetrieverApi {

    /* renamed from: j */
    private static final Api.ClientKey<zzi> f16998j;

    /* renamed from: k */
    private static final Api.AbstractClientBuilder<zzi, Api.ApiOptions.NoOptions> f16999k;

    /* renamed from: l */
    private static final Api<Api.ApiOptions.NoOptions> f17000l;

    static {
        Api.ClientKey<zzi> clientKey = new Api.ClientKey<>();
        f16998j = clientKey;
        C6312a c6312a = new C6312a();
        f16999k = c6312a;
        f17000l = new Api<>("SmsRetriever.API", c6312a, clientKey);
    }
}
