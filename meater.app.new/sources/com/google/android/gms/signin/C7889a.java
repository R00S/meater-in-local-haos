package com.google.android.gms.signin;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.internal.SignInClientImpl;

/* renamed from: com.google.android.gms.signin.a */
/* loaded from: classes2.dex */
final class C7889a extends Api.AbstractClientBuilder<SignInClientImpl, SignInOptions> {
    C7889a() {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    /* renamed from: c */
    public final /* synthetic */ Api.Client mo13600c(Context context, Looper looper, ClientSettings clientSettings, SignInOptions signInOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        SignInOptions signInOptions2 = signInOptions;
        if (signInOptions2 == null) {
            signInOptions2 = SignInOptions.f29467f;
        }
        return new SignInClientImpl(context, looper, true, clientSettings, signInOptions2, connectionCallbacks, onConnectionFailedListener);
    }
}
