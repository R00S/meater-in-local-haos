package z7;

import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import g7.C3445p;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
final class N<TResult> extends AbstractC5208j<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f53810a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final J f53811b = new J();

    /* renamed from: c, reason: collision with root package name */
    private boolean f53812c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f53813d;

    /* renamed from: e, reason: collision with root package name */
    private Object f53814e;

    /* renamed from: f, reason: collision with root package name */
    private Exception f53815f;

    N() {
    }

    private final void w() {
        C3445p.o(this.f53812c, "Task is not yet complete");
    }

    private final void x() {
        if (this.f53813d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void y() {
        if (this.f53812c) {
            throw DuplicateTaskCompletionException.a(this);
        }
    }

    private final void z() {
        synchronized (this.f53810a) {
            try {
                if (this.f53812c) {
                    this.f53811b.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z7.AbstractC5208j
    public final AbstractC5208j<TResult> a(Executor executor, InterfaceC5202d interfaceC5202d) {
        this.f53811b.a(new z(executor, interfaceC5202d));
        z();
        return this;
    }

    @Override // z7.AbstractC5208j
    public final AbstractC5208j<TResult> b(Executor executor, InterfaceC5203e<TResult> interfaceC5203e) {
        this.f53811b.a(new B(executor, interfaceC5203e));
        z();
        return this;
    }

    @Override // z7.AbstractC5208j
    public final AbstractC5208j<TResult> c(InterfaceC5203e<TResult> interfaceC5203e) {
        this.f53811b.a(new B(C5210l.f53820a, interfaceC5203e));
        z();
        return this;
    }

    @Override // z7.AbstractC5208j
    public final AbstractC5208j<TResult> d(Executor executor, InterfaceC5204f interfaceC5204f) {
        this.f53811b.a(new D(executor, interfaceC5204f));
        z();
        return this;
    }

    @Override // z7.AbstractC5208j
    public final AbstractC5208j<TResult> e(InterfaceC5204f interfaceC5204f) {
        d(C5210l.f53820a, interfaceC5204f);
        return this;
    }

    @Override // z7.AbstractC5208j
    public final AbstractC5208j<TResult> f(Executor executor, InterfaceC5205g<? super TResult> interfaceC5205g) {
        this.f53811b.a(new F(executor, interfaceC5205g));
        z();
        return this;
    }

    @Override // z7.AbstractC5208j
    public final AbstractC5208j<TResult> g(InterfaceC5205g<? super TResult> interfaceC5205g) {
        f(C5210l.f53820a, interfaceC5205g);
        return this;
    }

    @Override // z7.AbstractC5208j
    public final <TContinuationResult> AbstractC5208j<TContinuationResult> h(Executor executor, InterfaceC5201c<TResult, TContinuationResult> interfaceC5201c) {
        N n10 = new N();
        this.f53811b.a(new v(executor, interfaceC5201c, n10));
        z();
        return n10;
    }

    @Override // z7.AbstractC5208j
    public final <TContinuationResult> AbstractC5208j<TContinuationResult> i(Executor executor, InterfaceC5201c<TResult, AbstractC5208j<TContinuationResult>> interfaceC5201c) {
        N n10 = new N();
        this.f53811b.a(new x(executor, interfaceC5201c, n10));
        z();
        return n10;
    }

    @Override // z7.AbstractC5208j
    public final Exception j() {
        Exception exc;
        synchronized (this.f53810a) {
            exc = this.f53815f;
        }
        return exc;
    }

    @Override // z7.AbstractC5208j
    public final TResult k() {
        TResult tresult;
        synchronized (this.f53810a) {
            try {
                w();
                x();
                Exception exc = this.f53815f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                tresult = (TResult) this.f53814e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tresult;
    }

    @Override // z7.AbstractC5208j
    public final <X extends Throwable> TResult l(Class<X> cls) {
        TResult tresult;
        synchronized (this.f53810a) {
            try {
                w();
                x();
                if (cls.isInstance(this.f53815f)) {
                    throw cls.cast(this.f53815f);
                }
                Exception exc = this.f53815f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                tresult = (TResult) this.f53814e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tresult;
    }

    @Override // z7.AbstractC5208j
    public final boolean m() {
        return this.f53813d;
    }

    @Override // z7.AbstractC5208j
    public final boolean n() {
        boolean z10;
        synchronized (this.f53810a) {
            z10 = this.f53812c;
        }
        return z10;
    }

    @Override // z7.AbstractC5208j
    public final boolean o() {
        boolean z10;
        synchronized (this.f53810a) {
            try {
                z10 = false;
                if (this.f53812c && !this.f53813d && this.f53815f == null) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    @Override // z7.AbstractC5208j
    public final <TContinuationResult> AbstractC5208j<TContinuationResult> p(Executor executor, InterfaceC5207i<TResult, TContinuationResult> interfaceC5207i) {
        N n10 = new N();
        this.f53811b.a(new H(executor, interfaceC5207i, n10));
        z();
        return n10;
    }

    @Override // z7.AbstractC5208j
    public final <TContinuationResult> AbstractC5208j<TContinuationResult> q(InterfaceC5207i<TResult, TContinuationResult> interfaceC5207i) {
        Executor executor = C5210l.f53820a;
        N n10 = new N();
        this.f53811b.a(new H(executor, interfaceC5207i, n10));
        z();
        return n10;
    }

    public final void r(Exception exc) {
        C3445p.l(exc, "Exception must not be null");
        synchronized (this.f53810a) {
            y();
            this.f53812c = true;
            this.f53815f = exc;
        }
        this.f53811b.b(this);
    }

    public final void s(Object obj) {
        synchronized (this.f53810a) {
            y();
            this.f53812c = true;
            this.f53814e = obj;
        }
        this.f53811b.b(this);
    }

    public final boolean t() {
        synchronized (this.f53810a) {
            try {
                if (this.f53812c) {
                    return false;
                }
                this.f53812c = true;
                this.f53813d = true;
                this.f53811b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean u(Exception exc) {
        C3445p.l(exc, "Exception must not be null");
        synchronized (this.f53810a) {
            try {
                if (this.f53812c) {
                    return false;
                }
                this.f53812c = true;
                this.f53815f = exc;
                this.f53811b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean v(Object obj) {
        synchronized (this.f53810a) {
            try {
                if (this.f53812c) {
                    return false;
                }
                this.f53812c = true;
                this.f53814e = obj;
                this.f53811b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
