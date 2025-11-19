package android.view;

import android.view.AbstractC2106m;
import java.util.Iterator;
import java.util.Map;
import p.C4189b;

/* compiled from: LiveData.java */
/* loaded from: classes.dex */
public abstract class B<T> {

    /* renamed from: k, reason: collision with root package name */
    static final Object f25847k = new Object();

    /* renamed from: a, reason: collision with root package name */
    final Object f25848a;

    /* renamed from: b, reason: collision with root package name */
    private C4189b<E<? super T>, B<T>.d> f25849b;

    /* renamed from: c, reason: collision with root package name */
    int f25850c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f25851d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f25852e;

    /* renamed from: f, reason: collision with root package name */
    volatile Object f25853f;

    /* renamed from: g, reason: collision with root package name */
    private int f25854g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f25855h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f25856i;

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f25857j;

    /* compiled from: LiveData.java */
    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (B.this.f25848a) {
                obj = B.this.f25853f;
                B.this.f25853f = B.f25847k;
            }
            B.this.o(obj);
        }
    }

    /* compiled from: LiveData.java */
    private class b extends B<T>.d {
        b(E<? super T> e10) {
            super(e10);
        }

        @Override // androidx.lifecycle.B.d
        boolean g() {
            return true;
        }
    }

    /* compiled from: LiveData.java */
    class c extends B<T>.d implements InterfaceC2111s {

        /* renamed from: F, reason: collision with root package name */
        final InterfaceC2114v f25860F;

        c(InterfaceC2114v interfaceC2114v, E<? super T> e10) {
            super(e10);
            this.f25860F = interfaceC2114v;
        }

        @Override // androidx.lifecycle.B.d
        void b() {
            this.f25860F.getLifecycle().d(this);
        }

        @Override // androidx.lifecycle.B.d
        boolean c(InterfaceC2114v interfaceC2114v) {
            return this.f25860F == interfaceC2114v;
        }

        @Override // android.view.InterfaceC2111s
        public void f(InterfaceC2114v interfaceC2114v, AbstractC2106m.a aVar) {
            AbstractC2106m.b bVarB = this.f25860F.getLifecycle().b();
            if (bVarB == AbstractC2106m.b.DESTROYED) {
                B.this.m(this.f25862B);
                return;
            }
            AbstractC2106m.b bVar = null;
            while (bVar != bVarB) {
                a(g());
                bVar = bVarB;
                bVarB = this.f25860F.getLifecycle().b();
            }
        }

        @Override // androidx.lifecycle.B.d
        boolean g() {
            return this.f25860F.getLifecycle().b().j(AbstractC2106m.b.STARTED);
        }
    }

    public B(T t10) {
        this.f25848a = new Object();
        this.f25849b = new C4189b<>();
        this.f25850c = 0;
        this.f25853f = f25847k;
        this.f25857j = new a();
        this.f25852e = t10;
        this.f25854g = 0;
    }

    static void a(String str) {
        if (o.c.h().c()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void c(B<T>.d dVar) {
        if (dVar.f25863C) {
            if (!dVar.g()) {
                dVar.a(false);
                return;
            }
            int i10 = dVar.f25864D;
            int i11 = this.f25854g;
            if (i10 >= i11) {
                return;
            }
            dVar.f25864D = i11;
            dVar.f25862B.b((Object) this.f25852e);
        }
    }

    void b(int i10) {
        int i11 = this.f25850c;
        this.f25850c = i10 + i11;
        if (this.f25851d) {
            return;
        }
        this.f25851d = true;
        while (true) {
            try {
                int i12 = this.f25850c;
                if (i11 == i12) {
                    this.f25851d = false;
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    j();
                } else if (z11) {
                    k();
                }
                i11 = i12;
            } catch (Throwable th) {
                this.f25851d = false;
                throw th;
            }
        }
    }

    void d(B<T>.d dVar) {
        if (this.f25855h) {
            this.f25856i = true;
            return;
        }
        this.f25855h = true;
        do {
            this.f25856i = false;
            if (dVar != null) {
                c(dVar);
                dVar = null;
            } else {
                C4189b<E<? super T>, B<T>.d>.d dVarH = this.f25849b.h();
                while (dVarH.hasNext()) {
                    c((d) dVarH.next().getValue());
                    if (this.f25856i) {
                        break;
                    }
                }
            }
        } while (this.f25856i);
        this.f25855h = false;
    }

    public T e() {
        T t10 = (T) this.f25852e;
        if (t10 != f25847k) {
            return t10;
        }
        return null;
    }

    public boolean f() {
        return this.f25850c > 0;
    }

    public boolean g() {
        return this.f25852e != f25847k;
    }

    public void h(InterfaceC2114v interfaceC2114v, E<? super T> e10) {
        a("observe");
        if (interfaceC2114v.getLifecycle().b() == AbstractC2106m.b.DESTROYED) {
            return;
        }
        c cVar = new c(interfaceC2114v, e10);
        B<T>.d dVarR = this.f25849b.r(e10, cVar);
        if (dVarR != null && !dVarR.c(interfaceC2114v)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVarR != null) {
            return;
        }
        interfaceC2114v.getLifecycle().a(cVar);
    }

    public void i(E<? super T> e10) {
        a("observeForever");
        b bVar = new b(e10);
        B<T>.d dVarR = this.f25849b.r(e10, bVar);
        if (dVarR instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVarR != null) {
            return;
        }
        bVar.a(true);
    }

    protected void l(T t10) {
        boolean z10;
        synchronized (this.f25848a) {
            z10 = this.f25853f == f25847k;
            this.f25853f = t10;
        }
        if (z10) {
            o.c.h().d(this.f25857j);
        }
    }

    public void m(E<? super T> e10) {
        a("removeObserver");
        B<T>.d dVarV = this.f25849b.v(e10);
        if (dVarV == null) {
            return;
        }
        dVarV.b();
        dVarV.a(false);
    }

    public void n(InterfaceC2114v interfaceC2114v) {
        a("removeObservers");
        Iterator<Map.Entry<E<? super T>, B<T>.d>> it = this.f25849b.iterator();
        while (it.hasNext()) {
            Map.Entry<E<? super T>, B<T>.d> next = it.next();
            if (next.getValue().c(interfaceC2114v)) {
                m(next.getKey());
            }
        }
    }

    protected void o(T t10) {
        a("setValue");
        this.f25854g++;
        this.f25852e = t10;
        d(null);
    }

    public B() {
        this.f25848a = new Object();
        this.f25849b = new C4189b<>();
        this.f25850c = 0;
        Object obj = f25847k;
        this.f25853f = obj;
        this.f25857j = new a();
        this.f25852e = obj;
        this.f25854g = -1;
    }

    /* compiled from: LiveData.java */
    private abstract class d {

        /* renamed from: B, reason: collision with root package name */
        final E<? super T> f25862B;

        /* renamed from: C, reason: collision with root package name */
        boolean f25863C;

        /* renamed from: D, reason: collision with root package name */
        int f25864D = -1;

        d(E<? super T> e10) {
            this.f25862B = e10;
        }

        void a(boolean z10) {
            if (z10 == this.f25863C) {
                return;
            }
            this.f25863C = z10;
            B.this.b(z10 ? 1 : -1);
            if (this.f25863C) {
                B.this.d(this);
            }
        }

        boolean c(InterfaceC2114v interfaceC2114v) {
            return false;
        }

        abstract boolean g();

        void b() {
        }
    }

    protected void j() {
    }

    protected void k() {
    }
}
