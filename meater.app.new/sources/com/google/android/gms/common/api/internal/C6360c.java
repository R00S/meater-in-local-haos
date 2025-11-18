package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Add missing generic type declarations: [TResult] */
/* renamed from: com.google.android.gms.common.api.internal.c */
/* loaded from: classes2.dex */
final class C6360c<TResult> implements OnCompleteListener<TResult> {

    /* renamed from: a */
    private final /* synthetic */ TaskCompletionSource f17397a;

    /* renamed from: b */
    private final /* synthetic */ zaab f17398b;

    C6360c(zaab zaabVar, TaskCompletionSource taskCompletionSource) {
        this.f17398b = zaabVar;
        this.f17397a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    /* renamed from: a */
    public final void mo7019a(Task<TResult> task) {
        this.f17398b.f17479b.remove(this.f17397a);
    }
}
