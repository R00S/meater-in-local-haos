package com.google.android.gms.auth.api;

import android.os.Bundle;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zzf;
import com.google.android.gms.auth.api.signin.internal.zzg;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.p475authapi.zzi;
import com.google.android.gms.internal.p475authapi.zzr;

/* loaded from: classes2.dex */
public final class Auth {

    /* renamed from: a */
    public static final Api.ClientKey<zzr> f16897a;

    /* renamed from: b */
    public static final Api.ClientKey<zzg> f16898b;

    /* renamed from: c */
    private static final Api.AbstractClientBuilder<zzr, AuthCredentialsOptions> f16899c;

    /* renamed from: d */
    private static final Api.AbstractClientBuilder<zzg, GoogleSignInOptions> f16900d;

    /* renamed from: e */
    @KeepForSdk
    @Deprecated
    public static final Api<AuthProxyOptions> f16901e;

    /* renamed from: f */
    public static final Api<AuthCredentialsOptions> f16902f;

    /* renamed from: g */
    public static final Api<GoogleSignInOptions> f16903g;

    /* renamed from: h */
    @KeepForSdk
    @Deprecated
    public static final ProxyApi f16904h;

    /* renamed from: i */
    public static final CredentialsApi f16905i;

    /* renamed from: j */
    public static final GoogleSignInApi f16906j;

    @Deprecated
    public static class AuthCredentialsOptions implements Api.ApiOptions.Optional {

        /* renamed from: f */
        private static final AuthCredentialsOptions f16907f = new Builder().mo13606a();

        /* renamed from: g */
        private final String f16908g = null;

        /* renamed from: h */
        private final boolean f16909h;

        @Deprecated
        public static class Builder {

            /* renamed from: a */
            protected Boolean f16910a = Boolean.FALSE;

            /* renamed from: a */
            public AuthCredentialsOptions mo13606a() {
                return new AuthCredentialsOptions(this);
            }
        }

        public AuthCredentialsOptions(Builder builder) {
            this.f16909h = builder.f16910a.booleanValue();
        }

        /* renamed from: a */
        public final Bundle m13605a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", null);
            bundle.putBoolean("force_save_dialog", this.f16909h);
            return bundle;
        }
    }

    static {
        Api.ClientKey<zzr> clientKey = new Api.ClientKey<>();
        f16897a = clientKey;
        Api.ClientKey<zzg> clientKey2 = new Api.ClientKey<>();
        f16898b = clientKey2;
        C6307b c6307b = new C6307b();
        f16899c = c6307b;
        C6308c c6308c = new C6308c();
        f16900d = c6308c;
        f16901e = AuthProxy.f16913c;
        f16902f = new Api<>("Auth.CREDENTIALS_API", c6307b, clientKey);
        f16903g = new Api<>("Auth.GOOGLE_SIGN_IN_API", c6308c, clientKey2);
        f16904h = AuthProxy.f16914d;
        f16905i = new zzi();
        f16906j = new zzf();
    }

    private Auth() {
    }
}
