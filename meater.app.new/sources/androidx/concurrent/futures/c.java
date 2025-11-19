package androidx.concurrent.futures;

import com.google.common.util.concurrent.f;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: CallbackToFutureAdapter.java */
/* loaded from: classes.dex */
public final class c {

    /* compiled from: CallbackToFutureAdapter.java */
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        Object f23787a;

        /* renamed from: b, reason: collision with root package name */
        d<T> f23788b;

        /* renamed from: c, reason: collision with root package name */
        private androidx.concurrent.futures.d<Void> f23789c = androidx.concurrent.futures.d.H();

        /* renamed from: d, reason: collision with root package name */
        private boolean f23790d;

        a() {
        }

        private void d() {
            this.f23787a = null;
            this.f23788b = null;
            this.f23789c = null;
        }

        void a() {
            this.f23787a = null;
            this.f23788b = null;
            this.f23789c.D(null);
        }

        public boolean b(T t10) {
            this.f23790d = true;
            d<T> dVar = this.f23788b;
            boolean z10 = dVar != null && dVar.b(t10);
            if (z10) {
                d();
            }
            return z10;
        }

        public boolean c() {
            this.f23790d = true;
            d<T> dVar = this.f23788b;
            boolean z10 = dVar != null && dVar.a(true);
            if (z10) {
                d();
            }
            return z10;
        }

        public boolean e(Throwable th) {
            this.f23790d = true;
            d<T> dVar = this.f23788b;
            boolean z10 = dVar != null && dVar.d(th);
            if (z10) {
                d();
            }
            return z10;
        }

        protected void finalize() {
            androidx.concurrent.futures.d<Void> dVar;
            d<T> dVar2 = this.f23788b;
            if (dVar2 != null && !dVar2.isDone()) {
                dVar2.d(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f23787a));
            }
            if (this.f23790d || (dVar = this.f23789c) == null) {
                return;
            }
            dVar.D(null);
        }
    }

    /* compiled from: CallbackToFutureAdapter.java */
    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* compiled from: CallbackToFutureAdapter.java */
    /* renamed from: androidx.concurrent.futures.c$c, reason: collision with other inner class name */
    public interface InterfaceC0345c<T> {
        Object a(a<T> aVar);
    }

    /* compiled from: CallbackToFutureAdapter.java */
    private static final class d<T> implements f<T> {

        /* renamed from: B, reason: collision with root package name */
        final WeakReference<a<T>> f23791B;

        /* renamed from: C, reason: collision with root package name */
        private final androidx.concurrent.futures.a<T> f23792C = new a();

        /* compiled from: CallbackToFutureAdapter.java */
        class a extends androidx.concurrent.futures.a<T> {
            a() {
            }

            @Override // androidx.concurrent.futures.a
            protected String A() {
                a<T> aVar = d.this.f23791B.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f23787a + "]";
            }
        }

        d(a<T> aVar) {
            this.f23791B = new WeakReference<>(aVar);
        }

        boolean a(boolean z10) {
            return this.f23792C.cancel(z10);
        }

        boolean b(T t10) {
            return this.f23792C.D(t10);
        }

        @Override // com.google.common.util.concurrent.f
        public void c(Runnable runnable, Executor executor) {
            this.f23792C.c(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            a<T> aVar = this.f23791B.get();
            boolean zCancel = this.f23792C.cancel(z10);
            if (zCancel && aVar != null) {
                aVar.a();
            }
            return zCancel;
        }

        boolean d(Throwable th) {
            return this.f23792C.E(th);
        }

        @Override // java.util.concurrent.Future
        public T get() {
            return this.f23792C.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f23792C.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f23792C.isDone();
        }

        public String toString() {
            return this.f23792C.toString();
        }

        @Override // java.util.concurrent.Future
        public T get(long j10, TimeUnit timeUnit) {
            return this.f23792C.get(j10, timeUnit);
        }
    }

    public static <T> f<T> a(InterfaceC0345c<T> interfaceC0345c) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.f23788b = dVar;
        aVar.f23787a = interfaceC0345c.getClass();
        try {
            Object objA = interfaceC0345c.a(aVar);
            if (objA != null) {
                aVar.f23787a = objA;
            }
        } catch (Exception e10) {
            dVar.d(e10);
        }
        return dVar;
    }
}
