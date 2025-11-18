package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;

/* loaded from: classes2.dex */
public class AccountTransferClient extends GoogleApi<zzn> {

    /* renamed from: j */
    private static final Api.ClientKey<com.google.android.gms.internal.auth.zzu> f16922j;

    /* renamed from: k */
    private static final Api.AbstractClientBuilder<com.google.android.gms.internal.auth.zzu, zzn> f16923k;

    /* renamed from: l */
    private static final Api<zzn> f16924l;

    static {
        Api.ClientKey<com.google.android.gms.internal.auth.zzu> clientKey = new Api.ClientKey<>();
        f16922j = clientKey;
        C6306b c6306b = new C6306b();
        f16923k = c6306b;
        f16924l = new Api<>("AccountTransfer.ACCOUNT_TRANSFER_API", c6306b, clientKey);
    }
}
