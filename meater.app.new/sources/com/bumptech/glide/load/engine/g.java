package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.h;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m6.C3972g;
import m6.InterfaceC3969d;
import m6.InterfaceC3970e;
import m6.InterfaceC3975j;
import m6.InterfaceC3976k;
import o6.AbstractC4137a;
import o6.InterfaceC4139c;
import p6.InterfaceC4237b;
import q6.InterfaceC4316a;
import s6.o;
import u6.C4684j;

/* compiled from: DecodeHelper.java */
/* loaded from: classes2.dex */
final class g<Transcode> {

    /* renamed from: a, reason: collision with root package name */
    private final List<o.a<?>> f33095a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<InterfaceC3970e> f33096b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.d f33097c;

    /* renamed from: d, reason: collision with root package name */
    private Object f33098d;

    /* renamed from: e, reason: collision with root package name */
    private int f33099e;

    /* renamed from: f, reason: collision with root package name */
    private int f33100f;

    /* renamed from: g, reason: collision with root package name */
    private Class<?> f33101g;

    /* renamed from: h, reason: collision with root package name */
    private h.e f33102h;

    /* renamed from: i, reason: collision with root package name */
    private C3972g f33103i;

    /* renamed from: j, reason: collision with root package name */
    private Map<Class<?>, InterfaceC3976k<?>> f33104j;

    /* renamed from: k, reason: collision with root package name */
    private Class<Transcode> f33105k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f33106l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f33107m;

    /* renamed from: n, reason: collision with root package name */
    private InterfaceC3970e f33108n;

    /* renamed from: o, reason: collision with root package name */
    private com.bumptech.glide.g f33109o;

    /* renamed from: p, reason: collision with root package name */
    private AbstractC4137a f33110p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f33111q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f33112r;

    g() {
    }

    void a() {
        this.f33097c = null;
        this.f33098d = null;
        this.f33108n = null;
        this.f33101g = null;
        this.f33105k = null;
        this.f33103i = null;
        this.f33109o = null;
        this.f33104j = null;
        this.f33110p = null;
        this.f33095a.clear();
        this.f33106l = false;
        this.f33096b.clear();
        this.f33107m = false;
    }

    InterfaceC4237b b() {
        return this.f33097c.b();
    }

    List<InterfaceC3970e> c() {
        if (!this.f33107m) {
            this.f33107m = true;
            this.f33096b.clear();
            List<o.a<?>> listG = g();
            int size = listG.size();
            for (int i10 = 0; i10 < size; i10++) {
                o.a<?> aVar = listG.get(i10);
                if (!this.f33096b.contains(aVar.f49347a)) {
                    this.f33096b.add(aVar.f49347a);
                }
                for (int i11 = 0; i11 < aVar.f49348b.size(); i11++) {
                    if (!this.f33096b.contains(aVar.f49348b.get(i11))) {
                        this.f33096b.add(aVar.f49348b.get(i11));
                    }
                }
            }
        }
        return this.f33096b;
    }

    InterfaceC4316a d() {
        return this.f33102h.a();
    }

    AbstractC4137a e() {
        return this.f33110p;
    }

    int f() {
        return this.f33100f;
    }

    List<o.a<?>> g() {
        if (!this.f33106l) {
            this.f33106l = true;
            this.f33095a.clear();
            List listI = this.f33097c.i().i(this.f33098d);
            int size = listI.size();
            for (int i10 = 0; i10 < size; i10++) {
                o.a<?> aVarB = ((s6.o) listI.get(i10)).b(this.f33098d, this.f33099e, this.f33100f, this.f33103i);
                if (aVarB != null) {
                    this.f33095a.add(aVarB);
                }
            }
        }
        return this.f33095a;
    }

    <Data> q<Data, ?, Transcode> h(Class<Data> cls) {
        return this.f33097c.i().h(cls, this.f33101g, this.f33105k);
    }

    Class<?> i() {
        return this.f33098d.getClass();
    }

    List<s6.o<File, ?>> j(File file) {
        return this.f33097c.i().i(file);
    }

    C3972g k() {
        return this.f33103i;
    }

    com.bumptech.glide.g l() {
        return this.f33109o;
    }

    List<Class<?>> m() {
        return this.f33097c.i().j(this.f33098d.getClass(), this.f33101g, this.f33105k);
    }

    <Z> InterfaceC3975j<Z> n(InterfaceC4139c<Z> interfaceC4139c) {
        return this.f33097c.i().k(interfaceC4139c);
    }

    <T> com.bumptech.glide.load.data.e<T> o(T t10) {
        return this.f33097c.i().l(t10);
    }

    InterfaceC3970e p() {
        return this.f33108n;
    }

    <X> InterfaceC3969d<X> q(X x10) {
        return this.f33097c.i().m(x10);
    }

    Class<?> r() {
        return this.f33105k;
    }

    <Z> InterfaceC3976k<Z> s(Class<Z> cls) {
        InterfaceC3976k<Z> interfaceC3976k = (InterfaceC3976k) this.f33104j.get(cls);
        if (interfaceC3976k == null) {
            Iterator<Map.Entry<Class<?>, InterfaceC3976k<?>>> it = this.f33104j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, InterfaceC3976k<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    interfaceC3976k = (InterfaceC3976k) next.getValue();
                    break;
                }
            }
        }
        if (interfaceC3976k != null) {
            return interfaceC3976k;
        }
        if (!this.f33104j.isEmpty() || !this.f33111q) {
            return C4684j.c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    int t() {
        return this.f33099e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean u(Class<?> cls) {
        return h(cls) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    <R> void v(com.bumptech.glide.d dVar, Object obj, InterfaceC3970e interfaceC3970e, int i10, int i11, AbstractC4137a abstractC4137a, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, C3972g c3972g, Map<Class<?>, InterfaceC3976k<?>> map, boolean z10, boolean z11, h.e eVar) {
        this.f33097c = dVar;
        this.f33098d = obj;
        this.f33108n = interfaceC3970e;
        this.f33099e = i10;
        this.f33100f = i11;
        this.f33110p = abstractC4137a;
        this.f33101g = cls;
        this.f33102h = eVar;
        this.f33105k = cls2;
        this.f33109o = gVar;
        this.f33103i = c3972g;
        this.f33104j = map;
        this.f33111q = z10;
        this.f33112r = z11;
    }

    boolean w(InterfaceC4139c<?> interfaceC4139c) {
        return this.f33097c.i().n(interfaceC4139c);
    }

    boolean x() {
        return this.f33112r;
    }

    boolean y(InterfaceC3970e interfaceC3970e) {
        List<o.a<?>> listG = g();
        int size = listG.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (listG.get(i10).f49347a.equals(interfaceC3970e)) {
                return true;
            }
        }
        return false;
    }
}
