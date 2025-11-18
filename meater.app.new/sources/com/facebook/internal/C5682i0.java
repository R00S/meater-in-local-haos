package com.facebook.internal;

import com.facebook.C5641a0;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.C9801m;

/* compiled from: LockOnGetVariable.kt */
/* renamed from: com.facebook.internal.i0 */
/* loaded from: classes2.dex */
public final class C5682i0<T> {

    /* renamed from: a */
    private T f14426a;

    /* renamed from: b */
    private CountDownLatch f14427b;

    public C5682i0(final Callable<T> callable) {
        C9801m.m32346f(callable, "callable");
        this.f14427b = new CountDownLatch(1);
        C5641a0 c5641a0 = C5641a0.f14199a;
        C5641a0.m11292k().execute(new FutureTask(new Callable() { // from class: com.facebook.internal.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C5682i0.m11443a(this.f14424f, callable);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final Void m11443a(C5682i0 c5682i0, Callable callable) {
        C9801m.m32346f(c5682i0, "this$0");
        C9801m.m32346f(callable, "$callable");
        try {
            c5682i0.f14426a = (T) callable.call();
        } finally {
            CountDownLatch countDownLatch = c5682i0.f14427b;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }
}
