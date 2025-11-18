package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* loaded from: classes2.dex */
public interface zabd {
    /* renamed from: H */
    void mo14119H(int i2);

    /* renamed from: P */
    void mo14120P(Bundle bundle);

    /* renamed from: a */
    void mo14121a();

    /* renamed from: d */
    void mo14123d();

    boolean disconnect();

    /* renamed from: k0 */
    void mo14124k0(ConnectionResult connectionResult, Api<?> api, boolean z);

    /* renamed from: l0 */
    <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo14125l0(T t);

    /* renamed from: m0 */
    <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T mo14126m0(T t);
}
