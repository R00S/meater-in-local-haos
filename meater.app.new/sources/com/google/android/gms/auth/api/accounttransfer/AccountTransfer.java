package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.Api;

/* loaded from: classes2.dex */
public final class AccountTransfer {

    /* renamed from: a */
    private static final Api.ClientKey<com.google.android.gms.internal.auth.zzu> f16917a;

    /* renamed from: b */
    private static final Api.AbstractClientBuilder<com.google.android.gms.internal.auth.zzu, zzn> f16918b;

    /* renamed from: c */
    private static final Api<zzn> f16919c;

    /* renamed from: d */
    @Deprecated
    private static final zzb f16920d;

    /* renamed from: e */
    private static final zzq f16921e;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.auth.api.accounttransfer.zzb, com.google.android.gms.internal.auth.zzt] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.auth.api.accounttransfer.zzq, com.google.android.gms.internal.auth.zzt] */
    static {
        Api.ClientKey<com.google.android.gms.internal.auth.zzu> clientKey = new Api.ClientKey<>();
        f16917a = clientKey;
        C6305a c6305a = new C6305a();
        f16918b = c6305a;
        f16919c = new Api<>("AccountTransfer.ACCOUNT_TRANSFER_API", c6305a, clientKey);
        f16920d = new com.google.android.gms.internal.auth.zzt();
        f16921e = new com.google.android.gms.internal.auth.zzt();
    }

    private AccountTransfer() {
    }
}
