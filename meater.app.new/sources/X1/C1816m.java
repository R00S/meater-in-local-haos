package X1;

import U1.q;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: ListenerSet.java */
/* renamed from: X1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1816m<T> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1807d f18665a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1813j f18666b;

    /* renamed from: c, reason: collision with root package name */
    private final b<T> f18667c;

    /* renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet<c<T>> f18668d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayDeque<Runnable> f18669e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque<Runnable> f18670f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f18671g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f18672h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f18673i;

    /* compiled from: ListenerSet.java */
    /* renamed from: X1.m$a */
    public interface a<T> {
        void invoke(T t10);
    }

    /* compiled from: ListenerSet.java */
    /* renamed from: X1.m$b */
    public interface b<T> {
        void a(T t10, U1.q qVar);
    }

    /* compiled from: ListenerSet.java */
    /* renamed from: X1.m$c */
    private static final class c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f18674a;

        /* renamed from: b, reason: collision with root package name */
        private q.b f18675b = new q.b();

        /* renamed from: c, reason: collision with root package name */
        private boolean f18676c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f18677d;

        public c(T t10) {
            this.f18674a = t10;
        }

        public void a(int i10, a<T> aVar) {
            if (this.f18677d) {
                return;
            }
            if (i10 != -1) {
                this.f18675b.a(i10);
            }
            this.f18676c = true;
            aVar.invoke(this.f18674a);
        }

        public void b(b<T> bVar) {
            if (this.f18677d || !this.f18676c) {
                return;
            }
            U1.q qVarE = this.f18675b.e();
            this.f18675b = new q.b();
            this.f18676c = false;
            bVar.a(this.f18674a, qVarE);
        }

        public void c(b<T> bVar) {
            this.f18677d = true;
            if (this.f18676c) {
                this.f18676c = false;
                bVar.a(this.f18674a, this.f18675b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f18674a.equals(((c) obj).f18674a);
        }

        public int hashCode() {
            return this.f18674a.hashCode();
        }
    }

    public C1816m(Looper looper, InterfaceC1807d interfaceC1807d, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, interfaceC1807d, bVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(Message message) {
        Iterator<c<T>> it = this.f18668d.iterator();
        while (it.hasNext()) {
            it.next().b(this.f18667c);
            if (this.f18666b.e(1)) {
                break;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i10, aVar);
        }
    }

    private void m() {
        if (this.f18673i) {
            C1804a.g(Thread.currentThread() == this.f18666b.k().getThread());
        }
    }

    public void c(T t10) {
        C1804a.e(t10);
        synchronized (this.f18671g) {
            try {
                if (this.f18672h) {
                    return;
                }
                this.f18668d.add(new c<>(t10));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C1816m<T> d(Looper looper, InterfaceC1807d interfaceC1807d, b<T> bVar) {
        return new C1816m<>(this.f18668d, looper, interfaceC1807d, bVar, this.f18673i);
    }

    public C1816m<T> e(Looper looper, b<T> bVar) {
        return d(looper, this.f18665a, bVar);
    }

    public void f() {
        m();
        if (this.f18670f.isEmpty()) {
            return;
        }
        if (!this.f18666b.e(1)) {
            InterfaceC1813j interfaceC1813j = this.f18666b;
            interfaceC1813j.b(interfaceC1813j.d(1));
        }
        boolean zIsEmpty = this.f18669e.isEmpty();
        this.f18669e.addAll(this.f18670f);
        this.f18670f.clear();
        if (zIsEmpty) {
            while (!this.f18669e.isEmpty()) {
                this.f18669e.peekFirst().run();
                this.f18669e.removeFirst();
            }
        }
    }

    public void i(final int i10, final a<T> aVar) {
        m();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f18668d);
        this.f18670f.add(new Runnable() { // from class: X1.l
            @Override // java.lang.Runnable
            public final void run() {
                C1816m.h(copyOnWriteArraySet, i10, aVar);
            }
        });
    }

    public void j() {
        m();
        synchronized (this.f18671g) {
            this.f18672h = true;
        }
        Iterator<c<T>> it = this.f18668d.iterator();
        while (it.hasNext()) {
            it.next().c(this.f18667c);
        }
        this.f18668d.clear();
    }

    public void k(T t10) {
        m();
        Iterator<c<T>> it = this.f18668d.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            if (next.f18674a.equals(t10)) {
                next.c(this.f18667c);
                this.f18668d.remove(next);
            }
        }
    }

    public void l(int i10, a<T> aVar) {
        i(i10, aVar);
        f();
    }

    private C1816m(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, InterfaceC1807d interfaceC1807d, b<T> bVar, boolean z10) {
        this.f18665a = interfaceC1807d;
        this.f18668d = copyOnWriteArraySet;
        this.f18667c = bVar;
        this.f18671g = new Object();
        this.f18669e = new ArrayDeque<>();
        this.f18670f = new ArrayDeque<>();
        this.f18666b = interfaceC1807d.e(looper, new Handler.Callback() { // from class: X1.k
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f18661B.g(message);
            }
        });
        this.f18673i = z10;
    }
}
