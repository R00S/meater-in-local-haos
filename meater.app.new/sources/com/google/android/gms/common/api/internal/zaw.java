package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;

/* loaded from: classes2.dex */
public final class zaw<O extends Api.ApiOptions> extends GoogleApi<O> {

    /* renamed from: j */
    private final Api.Client f17607j;

    /* renamed from: k */
    private final zaq f17608k;

    /* renamed from: l */
    private final ClientSettings f17609l;

    /* renamed from: m */
    private final Api.AbstractClientBuilder<? extends zad, SignInOptions> f17610m;

    public zaw(Context context, Api<O> api, Looper looper, Api.Client client, zaq zaqVar, ClientSettings clientSettings, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder) {
        super(context, api, looper);
        this.f17607j = client;
        this.f17608k = zaqVar;
        this.f17609l = clientSettings;
        this.f17610m = abstractClientBuilder;
        this.f17256i.m13967g(this);
    }

    @Override // com.google.android.gms.common.api.GoogleApi
    /* renamed from: i */
    public final Api.Client mo13859i(Looper looper, GoogleApiManager.zaa<O> zaaVar) {
        this.f17608k.m14220a(zaaVar);
        return this.f17607j;
    }

    @Override // com.google.android.gms.common.api.GoogleApi
    /* renamed from: k */
    public final zace mo13860k(Context context, Handler handler) {
        return new zace(context, handler, this.f17609l, this.f17610m);
    }

    /* renamed from: m */
    public final Api.Client m14221m() {
        return this.f17607j;
    }
}
