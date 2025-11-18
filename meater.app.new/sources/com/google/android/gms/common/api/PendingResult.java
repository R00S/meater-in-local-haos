package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import java.util.concurrent.TimeUnit;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class PendingResult<R extends Result> {

    @KeepForSdk
    public interface StatusListener {
        @KeepForSdk
        /* renamed from: a */
        void mo13901a(Status status);
    }

    @KeepForSdk
    /* renamed from: b */
    public void mo13896b(StatusListener statusListener) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public abstract R mo13897c(long j2, TimeUnit timeUnit);

    /* renamed from: d */
    public abstract void mo13846d();

    /* renamed from: e */
    public abstract boolean mo13898e();

    /* renamed from: f */
    public abstract void mo13899f(ResultCallback<? super R> resultCallback);

    /* renamed from: g */
    public Integer mo13900g() {
        throw new UnsupportedOperationException();
    }
}
