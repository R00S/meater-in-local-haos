package p323h.p324a.p326b0;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p323h.p324a.AbstractC9081r;
import p323h.p324a.p325a0.C9063a;
import p323h.p324a.p329z.p341g.C9161b;
import p323h.p324a.p329z.p341g.C9163d;
import p323h.p324a.p329z.p341g.C9164e;
import p323h.p324a.p329z.p341g.C9165f;
import p323h.p324a.p329z.p341g.C9171l;
import p323h.p324a.p329z.p341g.C9172m;

/* compiled from: Schedulers.java */
/* renamed from: h.a.b0.a */
/* loaded from: classes2.dex */
public final class C9065a {

    /* renamed from: a */
    static final AbstractC9081r f34922a = C9063a.m29140h(new h());

    /* renamed from: b */
    static final AbstractC9081r f34923b = C9063a.m29137e(new b());

    /* renamed from: c */
    static final AbstractC9081r f34924c = C9063a.m29138f(new c());

    /* renamed from: d */
    static final AbstractC9081r f34925d = C9172m.m29374d();

    /* renamed from: e */
    static final AbstractC9081r f34926e = C9063a.m29139g(new f());

    /* compiled from: Schedulers.java */
    /* renamed from: h.a.b0.a$a */
    static final class a {

        /* renamed from: a */
        static final AbstractC9081r f34927a = new C9161b();
    }

    /* compiled from: Schedulers.java */
    /* renamed from: h.a.b0.a$b */
    static final class b implements Callable<AbstractC9081r> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC9081r call() throws Exception {
            return a.f34927a;
        }
    }

    /* compiled from: Schedulers.java */
    /* renamed from: h.a.b0.a$c */
    static final class c implements Callable<AbstractC9081r> {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC9081r call() throws Exception {
            return d.f34928a;
        }
    }

    /* compiled from: Schedulers.java */
    /* renamed from: h.a.b0.a$d */
    static final class d {

        /* renamed from: a */
        static final AbstractC9081r f34928a = new C9164e();
    }

    /* compiled from: Schedulers.java */
    /* renamed from: h.a.b0.a$e */
    static final class e {

        /* renamed from: a */
        static final AbstractC9081r f34929a = new C9165f();
    }

    /* compiled from: Schedulers.java */
    /* renamed from: h.a.b0.a$f */
    static final class f implements Callable<AbstractC9081r> {
        f() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC9081r call() throws Exception {
            return e.f34929a;
        }
    }

    /* compiled from: Schedulers.java */
    /* renamed from: h.a.b0.a$g */
    static final class g {

        /* renamed from: a */
        static final AbstractC9081r f34930a = new C9171l();
    }

    /* compiled from: Schedulers.java */
    /* renamed from: h.a.b0.a$h */
    static final class h implements Callable<AbstractC9081r> {
        h() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC9081r call() throws Exception {
            return g.f34930a;
        }
    }

    /* renamed from: a */
    public static AbstractC9081r m29162a(Executor executor) {
        return new C9163d(executor, false);
    }

    /* renamed from: b */
    public static AbstractC9081r m29163b() {
        return C9063a.m29148p(f34924c);
    }

    /* renamed from: c */
    public static AbstractC9081r m29164c() {
        return C9063a.m29150r(f34922a);
    }
}
