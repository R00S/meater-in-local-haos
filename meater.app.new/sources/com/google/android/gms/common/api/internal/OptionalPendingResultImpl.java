package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import java.util.concurrent.TimeUnit;

@KeepForSdk
/* loaded from: classes2.dex */
public final class OptionalPendingResultImpl<R extends Result> extends OptionalPendingResult<R> {

    /* renamed from: a */
    private final BasePendingResult<R> f17381a;

    @Override // com.google.android.gms.common.api.PendingResult
    /* renamed from: b */
    public final void mo13896b(PendingResult.StatusListener statusListener) {
        this.f17381a.mo13896b(statusListener);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    /* renamed from: c */
    public final R mo13897c(long j2, TimeUnit timeUnit) {
        return this.f17381a.mo13897c(j2, timeUnit);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    /* renamed from: d */
    public final void mo13846d() {
        this.f17381a.mo13846d();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    /* renamed from: e */
    public final boolean mo13898e() {
        return this.f17381a.mo13898e();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    /* renamed from: f */
    public final void mo13899f(ResultCallback<? super R> resultCallback) {
        this.f17381a.mo13899f(resultCallback);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    /* renamed from: g */
    public final Integer mo13900g() {
        return this.f17381a.mo13900g();
    }
}
