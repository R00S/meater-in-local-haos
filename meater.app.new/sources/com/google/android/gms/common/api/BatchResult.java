package com.google.android.gms.common.api;

/* loaded from: classes2.dex */
public final class BatchResult implements Result {

    /* renamed from: f */
    private final Status f17244f;

    /* renamed from: g */
    private final PendingResult<?>[] f17245g;

    BatchResult(Status status, PendingResult<?>[] pendingResultArr) {
        this.f17244f = status;
        this.f17245g = pendingResultArr;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f17244f;
    }
}
