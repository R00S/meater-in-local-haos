package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.signin.internal.SignInClientImpl;

/* loaded from: classes2.dex */
public final class zaa {

    /* renamed from: a */
    private static final Api.ClientKey<SignInClientImpl> f29488a;

    /* renamed from: b */
    @ShowFirstParty
    private static final Api.ClientKey<SignInClientImpl> f29489b;

    /* renamed from: c */
    public static final Api.AbstractClientBuilder<SignInClientImpl, SignInOptions> f29490c;

    /* renamed from: d */
    private static final Api.AbstractClientBuilder<SignInClientImpl, Object> f29491d;

    /* renamed from: e */
    private static final Scope f29492e;

    /* renamed from: f */
    private static final Scope f29493f;

    /* renamed from: g */
    public static final Api<SignInOptions> f29494g;

    /* renamed from: h */
    private static final Api<Object> f29495h;

    static {
        Api.ClientKey<SignInClientImpl> clientKey = new Api.ClientKey<>();
        f29488a = clientKey;
        Api.ClientKey<SignInClientImpl> clientKey2 = new Api.ClientKey<>();
        f29489b = clientKey2;
        C7889a c7889a = new C7889a();
        f29490c = c7889a;
        C7890b c7890b = new C7890b();
        f29491d = c7890b;
        f29492e = new Scope("profile");
        f29493f = new Scope("email");
        f29494g = new Api<>("SignIn.API", c7889a, clientKey);
        f29495h = new Api<>("SignIn.INTERNAL_API", c7890b, clientKey2);
    }
}
