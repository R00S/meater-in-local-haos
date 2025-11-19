package com.bumptech.glide;

import A6.o;
import android.content.Context;
import com.bumptech.glide.b;
import com.bumptech.glide.e;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p6.C4240e;
import p6.InterfaceC4237b;
import p6.InterfaceC4239d;
import q6.InterfaceC4316a;
import q6.i;
import r6.ExecutorServiceC4354a;
import s.C4391a;

/* compiled from: GlideBuilder.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.load.engine.j f32937c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC4239d f32938d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC4237b f32939e;

    /* renamed from: f, reason: collision with root package name */
    private q6.h f32940f;

    /* renamed from: g, reason: collision with root package name */
    private ExecutorServiceC4354a f32941g;

    /* renamed from: h, reason: collision with root package name */
    private ExecutorServiceC4354a f32942h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC4316a.InterfaceC0669a f32943i;

    /* renamed from: j, reason: collision with root package name */
    private q6.i f32944j;

    /* renamed from: k, reason: collision with root package name */
    private A6.c f32945k;

    /* renamed from: n, reason: collision with root package name */
    private o.b f32948n;

    /* renamed from: o, reason: collision with root package name */
    private ExecutorServiceC4354a f32949o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f32950p;

    /* renamed from: q, reason: collision with root package name */
    private List<D6.f<Object>> f32951q;

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, l<?, ?>> f32935a = new C4391a();

    /* renamed from: b, reason: collision with root package name */
    private final e.a f32936b = new e.a();

    /* renamed from: l, reason: collision with root package name */
    private int f32946l = 4;

    /* renamed from: m, reason: collision with root package name */
    private b.a f32947m = new a();

    /* compiled from: GlideBuilder.java */
    class a implements b.a {
        a() {
        }

        @Override // com.bumptech.glide.b.a
        public D6.g e() {
            return new D6.g();
        }
    }

    /* compiled from: GlideBuilder.java */
    static final class b {
        b() {
        }
    }

    /* compiled from: GlideBuilder.java */
    /* renamed from: com.bumptech.glide.c$c, reason: collision with other inner class name */
    public static final class C0452c {
    }

    com.bumptech.glide.b a(Context context, List<B6.b> list, B6.a aVar) {
        if (this.f32941g == null) {
            this.f32941g = ExecutorServiceC4354a.i();
        }
        if (this.f32942h == null) {
            this.f32942h = ExecutorServiceC4354a.g();
        }
        if (this.f32949o == null) {
            this.f32949o = ExecutorServiceC4354a.e();
        }
        if (this.f32944j == null) {
            this.f32944j = new i.a(context).a();
        }
        if (this.f32945k == null) {
            this.f32945k = new A6.e();
        }
        if (this.f32938d == null) {
            int iB = this.f32944j.b();
            if (iB > 0) {
                this.f32938d = new p6.j(iB);
            } else {
                this.f32938d = new C4240e();
            }
        }
        if (this.f32939e == null) {
            this.f32939e = new p6.i(this.f32944j.a());
        }
        if (this.f32940f == null) {
            this.f32940f = new q6.g(this.f32944j.d());
        }
        if (this.f32943i == null) {
            this.f32943i = new q6.f(context);
        }
        if (this.f32937c == null) {
            this.f32937c = new com.bumptech.glide.load.engine.j(this.f32940f, this.f32943i, this.f32942h, this.f32941g, ExecutorServiceC4354a.k(), this.f32949o, this.f32950p);
        }
        List<D6.f<Object>> list2 = this.f32951q;
        if (list2 == null) {
            this.f32951q = Collections.emptyList();
        } else {
            this.f32951q = Collections.unmodifiableList(list2);
        }
        return new com.bumptech.glide.b(context, this.f32937c, this.f32940f, this.f32938d, this.f32939e, new o(this.f32948n), this.f32945k, this.f32946l, this.f32947m, this.f32935a, this.f32951q, list, aVar, this.f32936b.b());
    }

    void b(o.b bVar) {
        this.f32948n = bVar;
    }
}
