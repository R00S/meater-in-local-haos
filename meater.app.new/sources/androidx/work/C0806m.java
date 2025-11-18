package androidx.work;

import androidx.work.impl.utils.p017o.C0798c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.C10775u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job;
import p241e.p254e.p288c.p289a.p290a.InterfaceFutureC8955a;

/* compiled from: ListenableFuture.kt */
/* renamed from: androidx.work.m */
/* loaded from: classes.dex */
public final class C0806m<R> implements InterfaceFutureC8955a<R> {

    /* renamed from: f */
    private final Job f4970f;

    /* renamed from: g */
    private final C0798c<R> f4971g;

    /* compiled from: ListenableFuture.kt */
    /* renamed from: androidx.work.m$a */
    static final class a extends Lambda implements Function1<Throwable, C10775u> {

        /* renamed from: f */
        final /* synthetic */ C0806m<R> f4972f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C0806m<R> c0806m) {
            super(1);
            this.f4972f = c0806m;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C10775u invoke(Throwable th) {
            invoke2(th);
            return C10775u.f41439a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (th == null) {
                if (!((C0806m) this.f4972f).f4971g.isDone()) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } else {
                if (th instanceof CancellationException) {
                    ((C0806m) this.f4972f).f4971g.cancel(true);
                    return;
                }
                C0798c c0798c = ((C0806m) this.f4972f).f4971g;
                Throwable cause = th.getCause();
                if (cause != null) {
                    th = cause;
                }
                c0798c.mo5194r(th);
            }
        }
    }

    public C0806m(Job job, C0798c<R> c0798c) {
        C9801m.m32346f(job, "job");
        C9801m.m32346f(c0798c, "underlying");
        this.f4970f = job;
        this.f4971g = c0798c;
        job.mo39360m(new a(this));
    }

    /* renamed from: b */
    public final void m5220b(R r) {
        this.f4971g.mo5193q(r);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f4971g.cancel(z);
    }

    @Override // p241e.p254e.p288c.p289a.p290a.InterfaceFutureC8955a
    /* renamed from: g */
    public void mo5190g(Runnable runnable, Executor executor) {
        this.f4971g.mo5190g(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public R get() {
        return this.f4971g.get();
    }

    @Override // java.util.concurrent.Future
    public R get(long j2, TimeUnit timeUnit) {
        return this.f4971g.get(j2, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f4971g.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f4971g.isDone();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0806m(Job job, C0798c c0798c, int i2, C9789g c9789g) {
        if ((i2 & 2) != 0) {
            c0798c = C0798c.m5203u();
            C9801m.m32345e(c0798c, "create()");
        }
        this(job, c0798c);
    }
}
