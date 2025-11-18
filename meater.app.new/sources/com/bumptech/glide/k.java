package com.bumptech.glide;

import A6.b;
import A6.p;
import A6.q;
import A6.s;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o6.AbstractC4137a;
import y6.C5131c;

/* compiled from: RequestManager.java */
/* loaded from: classes2.dex */
public class k implements ComponentCallbacks2, A6.l {

    /* renamed from: N, reason: collision with root package name */
    private static final D6.g f32998N = D6.g.u0(Bitmap.class).S();

    /* renamed from: O, reason: collision with root package name */
    private static final D6.g f32999O = D6.g.u0(C5131c.class).S();

    /* renamed from: P, reason: collision with root package name */
    private static final D6.g f33000P = D6.g.w0(AbstractC4137a.f46570c).b0(g.LOW).l0(true);

    /* renamed from: B, reason: collision with root package name */
    protected final com.bumptech.glide.b f33001B;

    /* renamed from: C, reason: collision with root package name */
    protected final Context f33002C;

    /* renamed from: D, reason: collision with root package name */
    final A6.j f33003D;

    /* renamed from: E, reason: collision with root package name */
    private final q f33004E;

    /* renamed from: F, reason: collision with root package name */
    private final p f33005F;

    /* renamed from: G, reason: collision with root package name */
    private final s f33006G;

    /* renamed from: H, reason: collision with root package name */
    private final Runnable f33007H;

    /* renamed from: I, reason: collision with root package name */
    private final A6.b f33008I;

    /* renamed from: J, reason: collision with root package name */
    private final CopyOnWriteArrayList<D6.f<Object>> f33009J;

    /* renamed from: K, reason: collision with root package name */
    private D6.g f33010K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f33011L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f33012M;

    /* compiled from: RequestManager.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVar = k.this;
            kVar.f33003D.a(kVar);
        }
    }

    /* compiled from: RequestManager.java */
    private class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private final q f33014a;

        b(q qVar) {
            this.f33014a = qVar;
        }

        @Override // A6.b.a
        public void a(boolean z10) {
            if (z10) {
                synchronized (k.this) {
                    this.f33014a.e();
                }
            }
        }
    }

    public k(com.bumptech.glide.b bVar, A6.j jVar, p pVar, Context context) {
        this(bVar, jVar, pVar, new q(), bVar.g(), context);
    }

    private void E(E6.i<?> iVar) {
        boolean zD = D(iVar);
        D6.d dVarI = iVar.i();
        if (zD || this.f33001B.p(iVar) || dVarI == null) {
            return;
        }
        iVar.d(null);
        dVarI.clear();
    }

    private synchronized void p() {
        try {
            Iterator<E6.i<?>> it = this.f33006G.m().iterator();
            while (it.hasNext()) {
                o(it.next());
            }
            this.f33006G.l();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized k A(D6.g gVar) {
        B(gVar);
        return this;
    }

    protected synchronized void B(D6.g gVar) {
        this.f33010K = gVar.clone().c();
    }

    synchronized void C(E6.i<?> iVar, D6.d dVar) {
        this.f33006G.n(iVar);
        this.f33004E.g(dVar);
    }

    synchronized boolean D(E6.i<?> iVar) {
        D6.d dVarI = iVar.i();
        if (dVarI == null) {
            return true;
        }
        if (!this.f33004E.a(dVarI)) {
            return false;
        }
        this.f33006G.o(iVar);
        iVar.d(null);
        return true;
    }

    @Override // A6.l
    public synchronized void a() {
        try {
            this.f33006G.a();
            if (this.f33012M) {
                p();
            } else {
                y();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // A6.l
    public synchronized void b() {
        z();
        this.f33006G.b();
    }

    @Override // A6.l
    public synchronized void e() {
        this.f33006G.e();
        p();
        this.f33004E.b();
        this.f33003D.b(this);
        this.f33003D.b(this.f33008I);
        H6.l.v(this.f33007H);
        this.f33001B.s(this);
    }

    public <ResourceType> j<ResourceType> l(Class<ResourceType> cls) {
        return new j<>(this.f33001B, this, cls, this.f33002C);
    }

    public j<Bitmap> m() {
        return l(Bitmap.class).b(f32998N);
    }

    public j<Drawable> n() {
        return l(Drawable.class);
    }

    public void o(E6.i<?> iVar) {
        if (iVar == null) {
            return;
        }
        E(iVar);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (i10 == 60 && this.f33011L) {
            x();
        }
    }

    List<D6.f<Object>> q() {
        return this.f33009J;
    }

    synchronized D6.g r() {
        return this.f33010K;
    }

    <T> l<?, T> s(Class<T> cls) {
        return this.f33001B.i().e(cls);
    }

    public j<Drawable> t(Uri uri) {
        return n().K0(uri);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f33004E + ", treeNode=" + this.f33005F + "}";
    }

    public j<Drawable> u(Integer num) {
        return n().L0(num);
    }

    public j<Drawable> v(String str) {
        return n().N0(str);
    }

    public synchronized void w() {
        this.f33004E.c();
    }

    public synchronized void x() {
        w();
        Iterator<k> it = this.f33005F.a().iterator();
        while (it.hasNext()) {
            it.next().w();
        }
    }

    public synchronized void y() {
        this.f33004E.d();
    }

    public synchronized void z() {
        this.f33004E.f();
    }

    k(com.bumptech.glide.b bVar, A6.j jVar, p pVar, q qVar, A6.c cVar, Context context) {
        this.f33006G = new s();
        a aVar = new a();
        this.f33007H = aVar;
        this.f33001B = bVar;
        this.f33003D = jVar;
        this.f33005F = pVar;
        this.f33004E = qVar;
        this.f33002C = context;
        A6.b bVarA = cVar.a(context.getApplicationContext(), new b(qVar));
        this.f33008I = bVarA;
        bVar.o(this);
        if (H6.l.q()) {
            H6.l.u(aVar);
        } else {
            jVar.a(this);
        }
        jVar.a(bVarA);
        this.f33009J = new CopyOnWriteArrayList<>(bVar.i().c());
        B(bVar.i().d());
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }
}
