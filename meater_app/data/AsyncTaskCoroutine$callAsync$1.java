package com.apptionlabs.meater_app.data;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AsyncTaskCoroutine.kt */
@f(c = "com.apptionlabs.meater_app.data.AsyncTaskCoroutine", f = "AsyncTaskCoroutine.kt", l = {27}, m = "callAsync")
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: /tmp/meat/meat/classes.dex */
public final class AsyncTaskCoroutine$callAsync$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AsyncTaskCoroutine<I, O> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTaskCoroutine$callAsync$1(AsyncTaskCoroutine<I, O> asyncTaskCoroutine, nh.d<? super AsyncTaskCoroutine$callAsync$1> dVar) {
        super(dVar);
        this.this$0 = asyncTaskCoroutine;
    }

    public final Object invokeSuspend(Object obj) {
        Object callAsync;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        callAsync = this.this$0.callAsync(null, this);
        return callAsync;
    }
}
