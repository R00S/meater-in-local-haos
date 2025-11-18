package p323h.p324a.p329z.p331b;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import p323h.p324a.p325a0.C9063a;
import p323h.p324a.p328y.InterfaceC9093a;
import p323h.p324a.p328y.InterfaceC9097e;
import p323h.p324a.p328y.InterfaceC9098f;
import p323h.p324a.p328y.InterfaceC9099g;
import p323h.p324a.p328y.InterfaceC9100h;
import p355k.p356a.InterfaceC9730c;

/* compiled from: Functions.java */
/* renamed from: h.a.z.b.a */
/* loaded from: classes2.dex */
public final class C9107a {

    /* renamed from: a */
    static final InterfaceC9098f<Object, Object> f34946a = new h();

    /* renamed from: b */
    public static final Runnable f34947b = new e();

    /* renamed from: c */
    public static final InterfaceC9093a f34948c = new b();

    /* renamed from: d */
    static final InterfaceC9097e<Object> f34949d = new c();

    /* renamed from: e */
    public static final InterfaceC9097e<Throwable> f34950e = new f();

    /* renamed from: f */
    public static final InterfaceC9097e<Throwable> f34951f = new m();

    /* renamed from: g */
    public static final InterfaceC9099g f34952g = new d();

    /* renamed from: h */
    static final InterfaceC9100h<Object> f34953h = new n();

    /* renamed from: i */
    static final InterfaceC9100h<Object> f34954i = new g();

    /* renamed from: j */
    static final Callable<Object> f34955j = new l();

    /* renamed from: k */
    static final Comparator<Object> f34956k = new k();

    /* renamed from: l */
    public static final InterfaceC9097e<InterfaceC9730c> f34957l = new j();

    /* compiled from: Functions.java */
    /* renamed from: h.a.z.b.a$a */
    static final class a<T> implements Callable<List<T>> {

        /* renamed from: f */
        final int f34958f;

        a(int i2) {
            this.f34958f = i2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> call() throws Exception {
            return new ArrayList(this.f34958f);
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: h.a.z.b.a$b */
    static final class b implements InterfaceC9093a {
        b() {
        }

        @Override // p323h.p324a.p328y.InterfaceC9093a
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: h.a.z.b.a$c */
    static final class c implements InterfaceC9097e<Object> {
        c() {
        }

        @Override // p323h.p324a.p328y.InterfaceC9097e
        /* renamed from: a */
        public void mo7420a(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: h.a.z.b.a$d */
    static final class d implements InterfaceC9099g {
        d() {
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: h.a.z.b.a$e */
    static final class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: h.a.z.b.a$f */
    static final class f implements InterfaceC9097e<Throwable> {
        f() {
        }

        @Override // p323h.p324a.p328y.InterfaceC9097e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo7420a(Throwable th) {
            C9063a.m29147o(th);
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: h.a.z.b.a$g */
    static final class g implements InterfaceC9100h<Object> {
        g() {
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: h.a.z.b.a$h */
    static final class h implements InterfaceC9098f<Object, Object> {
        h() {
        }

        @Override // p323h.p324a.p328y.InterfaceC9098f
        /* renamed from: a */
        public Object mo4660a(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: h.a.z.b.a$i */
    static final class i<T, U> implements Callable<U>, InterfaceC9098f<T, U> {

        /* renamed from: f */
        final U f34959f;

        i(U u) {
            this.f34959f = u;
        }

        @Override // p323h.p324a.p328y.InterfaceC9098f
        /* renamed from: a */
        public U mo4660a(T t) throws Exception {
            return this.f34959f;
        }

        @Override // java.util.concurrent.Callable
        public U call() throws Exception {
            return this.f34959f;
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: h.a.z.b.a$j */
    static final class j implements InterfaceC9097e<InterfaceC9730c> {
        j() {
        }

        @Override // p323h.p324a.p328y.InterfaceC9097e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo7420a(InterfaceC9730c interfaceC9730c) throws Exception {
            interfaceC9730c.request(Long.MAX_VALUE);
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: h.a.z.b.a$k */
    static final class k implements Comparator<Object> {
        k() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: h.a.z.b.a$l */
    static final class l implements Callable<Object> {
        l() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return null;
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: h.a.z.b.a$m */
    static final class m implements InterfaceC9097e<Throwable> {
        m() {
        }

        @Override // p323h.p324a.p328y.InterfaceC9097e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo7420a(Throwable th) {
            C9063a.m29147o(new OnErrorNotImplementedException(th));
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: h.a.z.b.a$n */
    static final class n implements InterfaceC9100h<Object> {
        n() {
        }
    }

    /* renamed from: a */
    public static <T> Callable<List<T>> m29262a(int i2) {
        return new a(i2);
    }

    /* renamed from: b */
    public static <T> InterfaceC9097e<T> m29263b() {
        return (InterfaceC9097e<T>) f34949d;
    }

    /* renamed from: c */
    public static <T> Callable<T> m29264c(T t) {
        return new i(t);
    }
}
