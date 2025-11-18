package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: com.google.android.gms.tasks.x */
/* loaded from: classes2.dex */
final class C7917x<TResult> extends Task<TResult> {

    /* renamed from: a */
    private final Object f29565a = new Object();

    /* renamed from: b */
    private final C7914u f29566b = new C7914u();

    /* renamed from: c */
    private boolean f29567c;

    /* renamed from: d */
    private volatile boolean f29568d;

    /* renamed from: e */
    private Object f29569e;

    /* renamed from: f */
    private Exception f29570f;

    C7917x() {
    }

    /* renamed from: v */
    private final void m23688v() {
        Preconditions.m14376o(this.f29567c, "Task is not yet complete");
    }

    /* renamed from: w */
    private final void m23689w() {
        if (this.f29568d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: x */
    private final void m23690x() {
        if (this.f29567c) {
            throw DuplicateTaskCompletionException.m23635a(this);
        }
    }

    /* renamed from: y */
    private final void m23691y() {
        synchronized (this.f29565a) {
            if (this.f29567c) {
                this.f29566b.m23687b(this);
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: a */
    public final Task<TResult> mo23638a(Executor executor, OnCanceledListener onCanceledListener) {
        this.f29566b.m23686a(new C7904j(executor, onCanceledListener));
        m23691y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: b */
    public final Task<TResult> mo23639b(OnCompleteListener<TResult> onCompleteListener) {
        this.f29566b.m23686a(new C7906l(TaskExecutors.f29515a, onCompleteListener));
        m23691y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: c */
    public final Task<TResult> mo23640c(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        this.f29566b.m23686a(new C7906l(executor, onCompleteListener));
        m23691y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: d */
    public final Task<TResult> mo23641d(Executor executor, OnFailureListener onFailureListener) {
        this.f29566b.m23686a(new C7908n(executor, onFailureListener));
        m23691y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: e */
    public final Task<TResult> mo23642e(Executor executor, OnSuccessListener<? super TResult> onSuccessListener) {
        this.f29566b.m23686a(new C7910p(executor, onSuccessListener));
        m23691y();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: f */
    public final <TContinuationResult> Task<TContinuationResult> mo23643f(Continuation<TResult, TContinuationResult> continuation) {
        return mo23644g(TaskExecutors.f29515a, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: g */
    public final <TContinuationResult> Task<TContinuationResult> mo23644g(Executor executor, Continuation<TResult, TContinuationResult> continuation) {
        C7917x c7917x = new C7917x();
        this.f29566b.m23686a(new C7900f(executor, continuation, c7917x));
        m23691y();
        return c7917x;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: h */
    public final <TContinuationResult> Task<TContinuationResult> mo23645h(Executor executor, Continuation<TResult, Task<TContinuationResult>> continuation) {
        C7917x c7917x = new C7917x();
        this.f29566b.m23686a(new C7902h(executor, continuation, c7917x));
        m23691y();
        return c7917x;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: i */
    public final Exception mo23646i() {
        Exception exc;
        synchronized (this.f29565a) {
            exc = this.f29570f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: j */
    public final TResult mo23647j() {
        TResult tresult;
        synchronized (this.f29565a) {
            m23688v();
            m23689w();
            Exception exc = this.f29570f;
            if (exc != null) {
                throw new RuntimeExecutionException(exc);
            }
            tresult = (TResult) this.f29569e;
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: k */
    public final <X extends Throwable> TResult mo23648k(Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f29565a) {
            m23688v();
            m23689w();
            if (cls.isInstance(this.f29570f)) {
                throw cls.cast(this.f29570f);
            }
            Exception exc = this.f29570f;
            if (exc != null) {
                throw new RuntimeExecutionException(exc);
            }
            tresult = (TResult) this.f29569e;
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: l */
    public final boolean mo23649l() {
        return this.f29568d;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: m */
    public final boolean mo23650m() {
        boolean z;
        synchronized (this.f29565a) {
            z = this.f29567c;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: n */
    public final boolean mo23651n() {
        boolean z;
        synchronized (this.f29565a) {
            z = false;
            if (this.f29567c && !this.f29568d && this.f29570f == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: o */
    public final <TContinuationResult> Task<TContinuationResult> mo23652o(SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        Executor executor = TaskExecutors.f29515a;
        C7917x c7917x = new C7917x();
        this.f29566b.m23686a(new C7912s(executor, successContinuation, c7917x));
        m23691y();
        return c7917x;
    }

    @Override // com.google.android.gms.tasks.Task
    /* renamed from: p */
    public final <TContinuationResult> Task<TContinuationResult> mo23653p(Executor executor, SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        C7917x c7917x = new C7917x();
        this.f29566b.m23686a(new C7912s(executor, successContinuation, c7917x));
        m23691y();
        return c7917x;
    }

    /* renamed from: q */
    public final void m23692q(Exception exc) {
        Preconditions.m14373l(exc, "Exception must not be null");
        synchronized (this.f29565a) {
            m23690x();
            this.f29567c = true;
            this.f29570f = exc;
        }
        this.f29566b.m23687b(this);
    }

    /* renamed from: r */
    public final void m23693r(Object obj) {
        synchronized (this.f29565a) {
            m23690x();
            this.f29567c = true;
            this.f29569e = obj;
        }
        this.f29566b.m23687b(this);
    }

    /* renamed from: s */
    public final boolean m23694s() {
        synchronized (this.f29565a) {
            if (this.f29567c) {
                return false;
            }
            this.f29567c = true;
            this.f29568d = true;
            this.f29566b.m23687b(this);
            return true;
        }
    }

    /* renamed from: t */
    public final boolean m23695t(Exception exc) {
        Preconditions.m14373l(exc, "Exception must not be null");
        synchronized (this.f29565a) {
            if (this.f29567c) {
                return false;
            }
            this.f29567c = true;
            this.f29570f = exc;
            this.f29566b.m23687b(this);
            return true;
        }
    }

    /* renamed from: u */
    public final boolean m23696u(Object obj) {
        synchronized (this.f29565a) {
            if (this.f29567c) {
                return false;
            }
            this.f29567c = true;
            this.f29569e = obj;
            this.f29566b.m23687b(this);
            return true;
        }
    }
}
