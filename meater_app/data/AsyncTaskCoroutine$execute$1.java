package com.apptionlabs.meater_app.data;

import ih.o;
import ih.u;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nh.d;
import oh.b;
import rk.j0;
import vh.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AsyncTaskCoroutine.kt */
@f(c = "com.apptionlabs.meater_app.data.AsyncTaskCoroutine$execute$1", f = "AsyncTaskCoroutine.kt", l = {19}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"T", "I", "O", "Lrk/j0;", "Lih/u;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class AsyncTaskCoroutine$execute$1 extends l implements p<j0, d<? super u>, Object> {
    final /* synthetic */ I[] $input;
    int label;
    final /* synthetic */ AsyncTaskCoroutine<I, O> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTaskCoroutine$execute$1(AsyncTaskCoroutine<I, O> asyncTaskCoroutine, I[] iArr, d<? super AsyncTaskCoroutine$execute$1> dVar) {
        super(2, dVar);
        this.this$0 = asyncTaskCoroutine;
        this.$input = iArr;
    }

    public final d<u> create(Object obj, d<?> dVar) {
        return new AsyncTaskCoroutine$execute$1(this.this$0, this.$input, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object callAsync;
        Object c10 = b.c();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                o.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            o.b(obj);
            this.this$0.onPreExecute();
            AsyncTaskCoroutine<I, O> asyncTaskCoroutine = this.this$0;
            I[] iArr = this.$input;
            Object[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.label = 1;
            callAsync = asyncTaskCoroutine.callAsync(copyOf, this);
            if (callAsync == c10) {
                return c10;
            }
        }
        return u.a;
    }

    public final Object invoke(j0 j0Var, d<? super u> dVar) {
        return create(j0Var, dVar).invokeSuspend(u.a);
    }
}
