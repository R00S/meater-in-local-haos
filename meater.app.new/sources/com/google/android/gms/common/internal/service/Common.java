package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;

/* loaded from: classes2.dex */
public final class Common {

    /* renamed from: a */
    @KeepForSdk
    public static final Api.ClientKey<zai> f17837a;

    /* renamed from: b */
    private static final Api.AbstractClientBuilder<zai, Api.ApiOptions.NoOptions> f17838b;

    /* renamed from: c */
    @KeepForSdk
    public static final Api<Api.ApiOptions.NoOptions> f17839c;

    /* renamed from: d */
    public static final zac f17840d;

    static {
        Api.ClientKey<zai> clientKey = new Api.ClientKey<>();
        f17837a = clientKey;
        C6433a c6433a = new C6433a();
        f17838b = c6433a;
        f17839c = new Api<>("Common.API", c6433a, clientKey);
        f17840d = new zad();
    }
}
