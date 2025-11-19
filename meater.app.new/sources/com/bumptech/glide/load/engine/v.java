package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.f;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import m6.EnumC3966a;
import m6.InterfaceC3969d;
import m6.InterfaceC3970e;
import o6.AbstractC4137a;
import q6.InterfaceC4316a;
import s6.o;

/* compiled from: SourceGenerator.java */
/* loaded from: classes2.dex */
class v implements f, f.a {

    /* renamed from: B, reason: collision with root package name */
    private final g<?> f33279B;

    /* renamed from: C, reason: collision with root package name */
    private final f.a f33280C;

    /* renamed from: D, reason: collision with root package name */
    private volatile int f33281D;

    /* renamed from: E, reason: collision with root package name */
    private volatile c f33282E;

    /* renamed from: F, reason: collision with root package name */
    private volatile Object f33283F;

    /* renamed from: G, reason: collision with root package name */
    private volatile o.a<?> f33284G;

    /* renamed from: H, reason: collision with root package name */
    private volatile d f33285H;

    /* compiled from: SourceGenerator.java */
    class a implements d.a<Object> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ o.a f33286B;

        a(o.a aVar) {
            this.f33286B = aVar;
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            if (v.this.e(this.f33286B)) {
                v.this.g(this.f33286B, exc);
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(Object obj) {
            if (v.this.e(this.f33286B)) {
                v.this.f(this.f33286B, obj);
            }
        }
    }

    v(g<?> gVar, f.a aVar) {
        this.f33279B = gVar;
        this.f33280C = aVar;
    }

    private boolean b(Object obj) throws Throwable {
        long jB = H6.g.b();
        boolean z10 = false;
        try {
            com.bumptech.glide.load.data.e<T> eVarO = this.f33279B.o(obj);
            Object objA = eVarO.a();
            InterfaceC3969d<X> interfaceC3969dQ = this.f33279B.q(objA);
            e eVar = new e(interfaceC3969dQ, objA, this.f33279B.k());
            d dVar = new d(this.f33284G.f49347a, this.f33279B.p());
            InterfaceC4316a interfaceC4316aD = this.f33279B.d();
            interfaceC4316aD.a(dVar, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + dVar + ", data: " + obj + ", encoder: " + interfaceC3969dQ + ", duration: " + H6.g.a(jB));
            }
            if (interfaceC4316aD.b(dVar) != null) {
                this.f33285H = dVar;
                this.f33282E = new c(Collections.singletonList(this.f33284G.f49347a), this.f33279B, this);
                this.f33284G.f49349c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f33285H + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f33280C.c(this.f33284G.f49347a, eVarO.a(), this.f33284G.f49349c, this.f33284G.f49349c.d(), this.f33284G.f49347a);
                return false;
            } catch (Throwable th) {
                th = th;
                z10 = true;
                if (!z10) {
                    this.f33284G.f49349c.b();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean d() {
        return this.f33281D < this.f33279B.g().size();
    }

    private void h(o.a<?> aVar) {
        this.f33284G.f49349c.e(this.f33279B.l(), new a(aVar));
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean a() {
        if (this.f33283F != null) {
            Object obj = this.f33283F;
            this.f33283F = null;
            try {
                if (!b(obj)) {
                    return true;
                }
            } catch (IOException e10) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e10);
                }
            }
        }
        if (this.f33282E != null && this.f33282E.a()) {
            return true;
        }
        this.f33282E = null;
        this.f33284G = null;
        boolean z10 = false;
        while (!z10 && d()) {
            List<o.a<?>> listG = this.f33279B.g();
            int i10 = this.f33281D;
            this.f33281D = i10 + 1;
            this.f33284G = listG.get(i10);
            if (this.f33284G != null && (this.f33279B.e().c(this.f33284G.f49349c.d()) || this.f33279B.u(this.f33284G.f49349c.a()))) {
                h(this.f33284G);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void c(InterfaceC3970e interfaceC3970e, Object obj, com.bumptech.glide.load.data.d<?> dVar, EnumC3966a enumC3966a, InterfaceC3970e interfaceC3970e2) {
        this.f33280C.c(interfaceC3970e, obj, dVar, this.f33284G.f49349c.d(), interfaceC3970e);
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        o.a<?> aVar = this.f33284G;
        if (aVar != null) {
            aVar.f49349c.cancel();
        }
    }

    boolean e(o.a<?> aVar) {
        o.a<?> aVar2 = this.f33284G;
        return aVar2 != null && aVar2 == aVar;
    }

    void f(o.a<?> aVar, Object obj) {
        AbstractC4137a abstractC4137aE = this.f33279B.e();
        if (obj != null && abstractC4137aE.c(aVar.f49349c.d())) {
            this.f33283F = obj;
            this.f33280C.j();
        } else {
            f.a aVar2 = this.f33280C;
            InterfaceC3970e interfaceC3970e = aVar.f49347a;
            com.bumptech.glide.load.data.d<?> dVar = aVar.f49349c;
            aVar2.c(interfaceC3970e, obj, dVar, dVar.d(), this.f33285H);
        }
    }

    void g(o.a<?> aVar, Exception exc) {
        f.a aVar2 = this.f33280C;
        d dVar = this.f33285H;
        com.bumptech.glide.load.data.d<?> dVar2 = aVar.f49349c;
        aVar2.n(dVar, exc, dVar2, dVar2.d());
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void j() {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void n(InterfaceC3970e interfaceC3970e, Exception exc, com.bumptech.glide.load.data.d<?> dVar, EnumC3966a enumC3966a) {
        this.f33280C.n(interfaceC3970e, exc, dVar, this.f33284G.f49349c.d());
    }
}
