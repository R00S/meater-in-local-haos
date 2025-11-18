package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* loaded from: classes2.dex */
public final class zabp<O extends Api.ApiOptions> extends zaag {

    /* renamed from: c */
    private final GoogleApi<O> f17549c;

    public zabp(GoogleApi<O> googleApi) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f17549c = googleApi;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: j */
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T mo13874j(T t) {
        return (T) this.f17549c.m13853c(t);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: k */
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo13875k(T t) {
        return (T) this.f17549c.m13854d(t);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: n */
    public final Context mo13877n() {
        return this.f17549c.m13856f();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: o */
    public final Looper mo13878o() {
        return this.f17549c.m13858h();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    /* renamed from: v */
    public final void mo13885v(zacm zacmVar) {
    }
}
