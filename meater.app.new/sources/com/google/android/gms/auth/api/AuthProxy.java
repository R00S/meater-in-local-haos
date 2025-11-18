package com.google.android.gms.auth.api;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzak;
import com.google.android.gms.internal.auth.zzar;

@KeepForSdk
/* loaded from: classes2.dex */
public final class AuthProxy {

    /* renamed from: a */
    private static final Api.ClientKey<zzak> f16911a;

    /* renamed from: b */
    private static final Api.AbstractClientBuilder<zzak, AuthProxyOptions> f16912b;

    /* renamed from: c */
    @KeepForSdk
    public static final Api<AuthProxyOptions> f16913c;

    /* renamed from: d */
    @KeepForSdk
    public static final ProxyApi f16914d;

    static {
        Api.ClientKey<zzak> clientKey = new Api.ClientKey<>();
        f16911a = clientKey;
        C6304a c6304a = new C6304a();
        f16912b = c6304a;
        f16913c = new Api<>("Auth.PROXY_API", c6304a, clientKey);
        f16914d = new zzar();
    }
}
