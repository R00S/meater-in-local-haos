package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

/* loaded from: classes2.dex */
public abstract class ResultTransform<R extends Result, S extends Result> {
    /* renamed from: a */
    public Status m13910a(Status status) {
        return status;
    }

    /* renamed from: b */
    public abstract PendingResult<S> m13911b(R r);
}
