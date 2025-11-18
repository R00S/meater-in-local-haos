package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes2.dex */
public final class Batch extends BasePendingResult<BatchResult> {

    /* renamed from: q */
    private final PendingResult<?>[] f17243q;

    public static final class Builder {
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.PendingResult
    /* renamed from: d */
    public final void mo13846d() {
        super.mo13846d();
        for (PendingResult<?> pendingResult : this.f17243q) {
            pendingResult.mo13846d();
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final BatchResult mo13718h(Status status) {
        return new BatchResult(status, this.f17243q);
    }
}
