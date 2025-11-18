package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.internal.g */
/* loaded from: classes2.dex */
final class C6424g implements PendingResult.StatusListener {

    /* renamed from: a */
    private final /* synthetic */ PendingResult f17812a;

    /* renamed from: b */
    private final /* synthetic */ TaskCompletionSource f17813b;

    /* renamed from: c */
    private final /* synthetic */ PendingResultUtil.ResultConverter f17814c;

    /* renamed from: d */
    private final /* synthetic */ PendingResultUtil.zaa f17815d;

    C6424g(PendingResult pendingResult, TaskCompletionSource taskCompletionSource, PendingResultUtil.ResultConverter resultConverter, PendingResultUtil.zaa zaaVar) {
        this.f17812a = pendingResult;
        this.f17813b = taskCompletionSource;
        this.f17814c = resultConverter;
        this.f17815d = zaaVar;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    /* renamed from: a */
    public final void mo13901a(Status status) {
        if (!status.m13915e0()) {
            this.f17813b.m23655b(this.f17815d.mo14361a(status));
        } else {
            this.f17813b.m23656c(this.f17814c.mo13664a(this.f17812a.mo13897c(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
