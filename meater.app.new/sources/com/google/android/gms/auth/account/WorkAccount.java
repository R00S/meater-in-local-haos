package com.google.android.gms.auth.account;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzh;
import com.google.android.gms.internal.auth.zzr;

/* loaded from: classes2.dex */
public class WorkAccount {

    /* renamed from: a */
    private static final Api.ClientKey<zzr> f16893a;

    /* renamed from: b */
    private static final Api.AbstractClientBuilder<zzr, Api.ApiOptions.NoOptions> f16894b;

    /* renamed from: c */
    public static final Api<Api.ApiOptions.NoOptions> f16895c;

    /* renamed from: d */
    @Deprecated
    public static final WorkAccountApi f16896d;

    static {
        Api.ClientKey<zzr> clientKey = new Api.ClientKey<>();
        f16893a = clientKey;
        C6302a c6302a = new C6302a();
        f16894b = c6302a;
        f16895c = new Api<>("WorkAccount.API", c6302a, clientKey);
        f16896d = new zzh();
    }

    private WorkAccount() {
    }
}
