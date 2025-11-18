package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zaav implements zabd {

    /* renamed from: a */
    private final zabe f17506a;

    public zaav(zabe zabeVar) {
        this.f17506a = zabeVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    /* renamed from: H */
    public final void mo14119H(int i2) {
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    /* renamed from: P */
    public final void mo14120P(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    /* renamed from: a */
    public final void mo14121a() {
        this.f17506a.m14178i();
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    /* renamed from: d */
    public final void mo14123d() {
        Iterator<Api.Client> it = this.f17506a.f17538k.values().iterator();
        while (it.hasNext()) {
            it.next().disconnect();
        }
        this.f17506a.f17546s.f17522q = Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final boolean disconnect() {
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    /* renamed from: k0 */
    public final void mo14124k0(ConnectionResult connectionResult, Api<?> api, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    /* renamed from: l0 */
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo14125l0(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    /* renamed from: m0 */
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T mo14126m0(T t) {
        this.f17506a.f17546s.f17514i.add(t);
        return t;
    }
}
