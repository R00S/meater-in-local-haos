package com.apptionlabs.meater_app.data;

import ih.o;
import ih.u;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nh.d;
import oh.b;
import rk.j0;
import vh.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AsyncTaskCoroutine.kt */
@f(c = "com.apptionlabs.meater_app.data.AsyncTaskCoroutine$callAsync$3", f = "AsyncTaskCoroutine.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"I", "O", "Lrk/j0;", "Lih/u;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class AsyncTaskCoroutine$callAsync$3 extends l implements p<j0, d<? super u>, Object> {
    int label;
    final /* synthetic */ AsyncTaskCoroutine<I, O> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTaskCoroutine$callAsync$3(AsyncTaskCoroutine<I, O> asyncTaskCoroutine, d<? super AsyncTaskCoroutine$callAsync$3> dVar) {
        super(2, dVar);
        this.this$0 = asyncTaskCoroutine;
    }

    public final d<u> create(Object obj, d<?> dVar) {
        return new AsyncTaskCoroutine$callAsync$3(this.this$0, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        b.c();
        if (this.label == 0) {
            o.b(obj);
            AsyncTaskCoroutine<I, O> asyncTaskCoroutine = this.this$0;
            asyncTaskCoroutine.onPostExecute(asyncTaskCoroutine.getResult());
            return u.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(j0 j0Var, d<? super u> dVar) {
        return create(j0Var, dVar).invokeSuspend(u.a);
    }
}
