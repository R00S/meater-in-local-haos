package p456rx;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p456rx.exceptions.C11240a;
import p456rx.exceptions.OnErrorFailedException;
import p456rx.p460m.C11254c;
import p456rx.p460m.C11260i;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p460m.InterfaceC11257f;
import p456rx.p460m.InterfaceC11258g;
import p456rx.p460m.InterfaceC11259h;
import p456rx.p460m.InterfaceCallableC11255d;
import p456rx.p461n.p462a.C11262a0;
import p456rx.p461n.p462a.C11263a1;
import p456rx.p461n.p462a.C11265b0;
import p456rx.p461n.p462a.C11266b1;
import p456rx.p461n.p462a.C11268c0;
import p456rx.p461n.p462a.C11269c1;
import p456rx.p461n.p462a.C11271d0;
import p456rx.p461n.p462a.C11272d1;
import p456rx.p461n.p462a.C11274e0;
import p456rx.p461n.p462a.C11275e1;
import p456rx.p461n.p462a.C11277f0;
import p456rx.p461n.p462a.C11278f1;
import p456rx.p461n.p462a.C11280g0;
import p456rx.p461n.p462a.C11281g1;
import p456rx.p461n.p462a.C11286i0;
import p456rx.p461n.p462a.C11288j;
import p456rx.p461n.p462a.C11289j0;
import p456rx.p461n.p462a.C11291k;
import p456rx.p461n.p462a.C11292k0;
import p456rx.p461n.p462a.C11294l;
import p456rx.p461n.p462a.C11295l0;
import p456rx.p461n.p462a.C11297m;
import p456rx.p461n.p462a.C11298m0;
import p456rx.p461n.p462a.C11300n;
import p456rx.p461n.p462a.C11301n0;
import p456rx.p461n.p462a.C11303o;
import p456rx.p461n.p462a.C11304o0;
import p456rx.p461n.p462a.C11306p;
import p456rx.p461n.p462a.C11307p0;
import p456rx.p461n.p462a.C11309q;
import p456rx.p461n.p462a.C11310q0;
import p456rx.p461n.p462a.C11312r;
import p456rx.p461n.p462a.C11313r0;
import p456rx.p461n.p462a.C11315s;
import p456rx.p461n.p462a.C11316s0;
import p456rx.p461n.p462a.C11318t;
import p456rx.p461n.p462a.C11319t0;
import p456rx.p461n.p462a.C11321u;
import p456rx.p461n.p462a.C11322u0;
import p456rx.p461n.p462a.C11323v;
import p456rx.p461n.p462a.C11324v0;
import p456rx.p461n.p462a.C11325w;
import p456rx.p461n.p462a.C11326w0;
import p456rx.p461n.p462a.C11327x;
import p456rx.p461n.p462a.C11328x0;
import p456rx.p461n.p462a.C11329y;
import p456rx.p461n.p462a.C11330y0;
import p456rx.p461n.p462a.C11332z0;
import p456rx.p461n.p462a.EnumC11279g;
import p456rx.p461n.p466e.C11352a;
import p456rx.p461n.p466e.C11353b;
import p456rx.p461n.p466e.C11359h;
import p456rx.p461n.p466e.C11361j;
import p456rx.p461n.p466e.C11364m;
import p456rx.p461n.p466e.EnumC11357f;
import p456rx.p469o.AbstractC11400b;
import p456rx.p469o.C11399a;
import p456rx.p470p.C11403c;
import p456rx.p471q.C11409c;
import p456rx.p474t.C11429e;
import p456rx.schedulers.Schedulers;

/* compiled from: Observable.java */
/* renamed from: rx.e */
/* loaded from: classes.dex */
public class C11234e<T> {

    /* renamed from: f */
    final a<T> f42129f;

    /* compiled from: Observable.java */
    /* renamed from: rx.e$a */
    /* loaded from: classes3.dex */
    public interface a<T> extends InterfaceC11253b<AbstractC11245j<? super T>> {
    }

    /* compiled from: Observable.java */
    /* renamed from: rx.e$b */
    /* loaded from: classes3.dex */
    public interface b<R, T> extends InterfaceC11256e<AbstractC11245j<? super R>, AbstractC11245j<? super T>> {
    }

    /* compiled from: Observable.java */
    /* renamed from: rx.e$c */
    public interface c<T, R> extends InterfaceC11256e<C11234e<T>, C11234e<R>> {
    }

    protected C11234e(a<T> aVar) {
        this.f42129f = aVar;
    }

    /* renamed from: B */
    public static <T> C11234e<T> m40016B() {
        return EnumC11279g.m40207k();
    }

    /* renamed from: C */
    public static <T> C11234e<T> m40017C(Throwable th) {
        return m40035b1(new C11271d0(th));
    }

    /* renamed from: F0 */
    static <T> InterfaceC11246k m40018F0(AbstractC11245j<? super T> abstractC11245j, C11234e<T> c11234e) {
        if (abstractC11245j == null) {
            throw new IllegalArgumentException("subscriber can not be null");
        }
        if (c11234e.f42129f == null) {
            throw new IllegalStateException("onSubscribe function can not be null.");
        }
        abstractC11245j.onStart();
        if (!(abstractC11245j instanceof C11403c)) {
            abstractC11245j = new C11403c(abstractC11245j);
        }
        try {
            C11409c.m40584p(c11234e, c11234e.f42129f).call(abstractC11245j);
            return C11409c.m40583o(abstractC11245j);
        } catch (Throwable th) {
            C11240a.m40140e(th);
            if (abstractC11245j.isUnsubscribed()) {
                C11409c.m40578j(C11409c.m40581m(th));
            } else {
                try {
                    abstractC11245j.onError(C11409c.m40581m(th));
                } catch (Throwable th2) {
                    C11240a.m40140e(th2);
                    OnErrorFailedException onErrorFailedException = new OnErrorFailedException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th2);
                    C11409c.m40581m(onErrorFailedException);
                    throw onErrorFailedException;
                }
            }
            return C11429e.m40676c();
        }
    }

    /* renamed from: M0 */
    public static <T> C11234e<T> m40019M0(C11234e<? extends C11234e<? extends T>> c11234e) {
        return (C11234e<T>) c11234e.m40080W(C11263a1.m40167b(false));
    }

    /* renamed from: N */
    public static <T> C11234e<T> m40020N(Iterable<? extends T> iterable) {
        return m40035b1(new C11321u(iterable));
    }

    /* renamed from: O */
    public static <T> C11234e<T> m40021O(T[] tArr) {
        int length = tArr.length;
        return length == 0 ? m40016B() : length == 1 ? m40025S(tArr[0]) : m40035b1(new C11315s(tArr));
    }

    /* renamed from: P */
    public static <T> C11234e<T> m40022P(Callable<? extends T> callable) {
        return m40035b1(new C11318t(callable));
    }

    /* renamed from: Q */
    public static C11234e<Long> m40023Q(long j2, long j3, TimeUnit timeUnit) {
        return m40024R(j2, j3, timeUnit, Schedulers.computation());
    }

    /* renamed from: R */
    public static C11234e<Long> m40024R(long j2, long j3, TimeUnit timeUnit, AbstractC11243h abstractC11243h) {
        return m40035b1(new C11280g0(j2, j3, timeUnit, abstractC11243h));
    }

    /* renamed from: S */
    public static <T> C11234e<T> m40025S(T t) {
        return C11361j.m40446f1(t);
    }

    /* renamed from: T */
    public static <T> C11234e<T> m40026T(T t, T t2) {
        return m40021O(new Object[]{t, t2});
    }

    /* renamed from: U */
    public static <T> C11234e<T> m40027U(T t, T t2, T t3) {
        return m40021O(new Object[]{t, t2, t3});
    }

    /* renamed from: U0 */
    public static C11234e<Long> m40028U0(long j2, TimeUnit timeUnit) {
        return m40030V0(j2, timeUnit, Schedulers.computation());
    }

    /* renamed from: V */
    public static <T> C11234e<T> m40029V(T t, T t2, T t3, T t4, T t5, T t6, T t7) {
        return m40021O(new Object[]{t, t2, t3, t4, t5, t6, t7});
    }

    /* renamed from: V0 */
    public static C11234e<Long> m40030V0(long j2, TimeUnit timeUnit, AbstractC11243h abstractC11243h) {
        return m40035b1(new C11277f0(j2, timeUnit, abstractC11243h));
    }

    /* renamed from: Y */
    public static <T> C11234e<T> m40031Y(Iterable<? extends C11234e<? extends T>> iterable) {
        return m40032Z(m40020N(iterable));
    }

    /* renamed from: Z */
    public static <T> C11234e<T> m40032Z(C11234e<? extends C11234e<? extends T>> c11234e) {
        return c11234e.getClass() == C11361j.class ? ((C11361j) c11234e).m40449i1(C11364m.m40467b()) : (C11234e<T>) c11234e.m40080W(C11310q0.m40280b(false));
    }

    /* renamed from: a0 */
    public static <T> C11234e<T> m40033a0(C11234e<? extends T> c11234e, C11234e<? extends T> c11234e2) {
        return m40039d0(new C11234e[]{c11234e, c11234e2});
    }

    /* renamed from: b0 */
    public static <T> C11234e<T> m40034b0(C11234e<? extends T> c11234e, C11234e<? extends T> c11234e2, C11234e<? extends T> c11234e3) {
        return m40039d0(new C11234e[]{c11234e, c11234e2, c11234e3});
    }

    /* renamed from: b1 */
    public static <T> C11234e<T> m40035b1(a<T> aVar) {
        return new C11234e<>(C11409c.m40576h(aVar));
    }

    /* renamed from: c */
    public static <T, R> C11234e<R> m40036c(List<? extends C11234e<? extends T>> list, InterfaceC11259h<? extends R> interfaceC11259h) {
        return m40035b1(new C11288j(list, interfaceC11259h));
    }

    /* renamed from: c0 */
    public static <T> C11234e<T> m40037c0(C11234e<? extends T> c11234e, C11234e<? extends T> c11234e2, C11234e<? extends T> c11234e3, C11234e<? extends T> c11234e4) {
        return m40039d0(new C11234e[]{c11234e, c11234e2, c11234e3, c11234e4});
    }

    /* renamed from: d */
    public static <T1, T2, T3, R> C11234e<R> m40038d(C11234e<? extends T1> c11234e, C11234e<? extends T2> c11234e2, C11234e<? extends T3> c11234e3, InterfaceC11258g<? super T1, ? super T2, ? super T3, ? extends R> interfaceC11258g) {
        return m40036c(Arrays.asList(c11234e, c11234e2, c11234e3), C11260i.m40160b(interfaceC11258g));
    }

    /* renamed from: d0 */
    public static <T> C11234e<T> m40039d0(C11234e<? extends T>[] c11234eArr) {
        return m40032Z(m40021O(c11234eArr));
    }

    /* renamed from: d1 */
    public static <T1, T2, R> C11234e<R> m40040d1(C11234e<? extends T1> c11234e, C11234e<? extends T2> c11234e2, InterfaceC11257f<? super T1, ? super T2, ? extends R> interfaceC11257f) {
        return m40025S(new C11234e[]{c11234e, c11234e2}).m40080W(new C11281g1(interfaceC11257f));
    }

    /* renamed from: e */
    public static <T1, T2, R> C11234e<R> m40041e(C11234e<? extends T1> c11234e, C11234e<? extends T2> c11234e2, InterfaceC11257f<? super T1, ? super T2, ? extends R> interfaceC11257f) {
        return m40036c(Arrays.asList(c11234e, c11234e2), C11260i.m40159a(interfaceC11257f));
    }

    /* renamed from: e0 */
    public static <T> C11234e<T> m40042e0(C11234e<? extends C11234e<? extends T>> c11234e) {
        return (C11234e<T>) c11234e.m40080W(C11310q0.m40280b(true));
    }

    /* renamed from: f0 */
    public static <T> C11234e<T> m40043f0(C11234e<? extends T> c11234e, C11234e<? extends T> c11234e2) {
        return m40042e0(m40026T(c11234e, c11234e2));
    }

    /* renamed from: g */
    public static <T> C11234e<T> m40044g(C11234e<? extends C11234e<? extends T>> c11234e) {
        return (C11234e<T>) c11234e.m40092i(C11364m.m40467b());
    }

    /* renamed from: g0 */
    public static <T> C11234e<T> m40045g0(C11234e<? extends T> c11234e, C11234e<? extends T> c11234e2, C11234e<? extends T> c11234e3) {
        return m40042e0(m40027U(c11234e, c11234e2, c11234e3));
    }

    /* renamed from: h */
    public static <T> C11234e<T> m40046h(C11234e<? extends T> c11234e, C11234e<? extends T> c11234e2) {
        return m40044g(m40026T(c11234e, c11234e2));
    }

    /* renamed from: h0 */
    public static <T> C11234e<T> m40047h0(C11234e<? extends T> c11234e, C11234e<? extends T> c11234e2, C11234e<? extends T> c11234e3, C11234e<? extends T> c11234e4, C11234e<? extends T> c11234e5, C11234e<? extends T> c11234e6, C11234e<? extends T> c11234e7) {
        return m40042e0(m40029V(c11234e, c11234e2, c11234e3, c11234e4, c11234e5, c11234e6, c11234e7));
    }

    @Deprecated
    /* renamed from: l */
    public static <T> C11234e<T> m40048l(a<T> aVar) {
        return new C11234e<>(C11409c.m40576h(aVar));
    }

    /* renamed from: p */
    public static <T> C11234e<T> m40049p(InterfaceCallableC11255d<C11234e<T>> interfaceCallableC11255d) {
        return m40035b1(new C11294l(interfaceCallableC11255d));
    }

    /* renamed from: r0 */
    public static C11234e<Integer> m40050r0(int i2, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("Count can not be negative");
        }
        if (i3 == 0) {
            return m40016B();
        }
        if (i2 <= (Integer.MAX_VALUE - i3) + 1) {
            return i3 == 1 ? m40025S(Integer.valueOf(i2)) : m40035b1(new C11327x(i2, (i3 - 1) + i2));
        }
        throw new IllegalArgumentException("start + count can not exceed Integer.MAX_VALUE");
    }

    /* renamed from: A */
    public final C11234e<T> m40051A(InterfaceC11252a interfaceC11252a) {
        return (C11234e<T>) m40080W(new C11304o0(interfaceC11252a));
    }

    /* renamed from: A0 */
    public final C11234e<T> m40052A0(long j2, TimeUnit timeUnit, AbstractC11243h abstractC11243h) {
        return m40035b1(new C11265b0(this, j2, timeUnit, abstractC11243h));
    }

    /* renamed from: B0 */
    public final C11234e<T> m40053B0(InterfaceC11256e<? super T, Boolean> interfaceC11256e) {
        return (C11234e<T>) m40080W(new C11330y0(C11330y0.m40362b(interfaceC11256e)));
    }

    /* renamed from: C0 */
    public final C11234e<T> m40054C0(T t) {
        return m40046h(m40025S(t), this);
    }

    /* renamed from: D */
    public final C11234e<T> m40055D(InterfaceC11256e<? super T, Boolean> interfaceC11256e) {
        return m40035b1(new C11303o(this, interfaceC11256e));
    }

    /* renamed from: D0 */
    public final InterfaceC11246k m40056D0() {
        return m40058E0(new C11353b(C11254c.m40157a(), EnumC11357f.f42878l, C11254c.m40157a()));
    }

    /* renamed from: E */
    public final C11234e<T> m40057E() {
        return m40073N0(1).m40120x0();
    }

    /* renamed from: E0 */
    public final InterfaceC11246k m40058E0(AbstractC11245j<? super T> abstractC11245j) {
        return m40018F0(abstractC11245j, this);
    }

    /* renamed from: F */
    public final C11234e<T> m40059F(InterfaceC11256e<? super T, Boolean> interfaceC11256e) {
        return m40074O0(interfaceC11256e).m40120x0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: G */
    public final <R> C11234e<R> m40060G(InterfaceC11256e<? super T, ? extends C11234e<? extends R>> interfaceC11256e) {
        return getClass() == C11361j.class ? ((C11361j) this).m40449i1(interfaceC11256e) : m40032Z(m40082X(interfaceC11256e));
    }

    /* renamed from: G0 */
    public final InterfaceC11246k m40061G0(InterfaceC11253b<? super T> interfaceC11253b) {
        if (interfaceC11253b != null) {
            return m40058E0(new C11353b(interfaceC11253b, EnumC11357f.f42878l, C11254c.m40157a()));
        }
        throw new IllegalArgumentException("onNext can not be null");
    }

    /* renamed from: H */
    public final C11234e<T> m40062H(InterfaceC11256e<? super T, ? extends C11231b> interfaceC11256e) {
        return m40064I(interfaceC11256e, false, Integer.MAX_VALUE);
    }

    /* renamed from: H0 */
    public final InterfaceC11246k m40063H0(InterfaceC11253b<? super T> interfaceC11253b, InterfaceC11253b<Throwable> interfaceC11253b2) {
        if (interfaceC11253b == null) {
            throw new IllegalArgumentException("onNext can not be null");
        }
        if (interfaceC11253b2 != null) {
            return m40058E0(new C11353b(interfaceC11253b, interfaceC11253b2, C11254c.m40157a()));
        }
        throw new IllegalArgumentException("onError can not be null");
    }

    /* renamed from: I */
    public final C11234e<T> m40064I(InterfaceC11256e<? super T, ? extends C11231b> interfaceC11256e, boolean z, int i2) {
        return m40035b1(new C11306p(this, interfaceC11256e, z, i2));
    }

    /* renamed from: I0 */
    public final C11234e<T> m40065I0(AbstractC11243h abstractC11243h) {
        return m40067J0(abstractC11243h, true);
    }

    /* renamed from: J */
    public final <R> C11234e<R> m40066J(InterfaceC11256e<? super T, ? extends Iterable<? extends R>> interfaceC11256e) {
        return m40068K(interfaceC11256e, C11359h.f42884f);
    }

    /* renamed from: J0 */
    public final C11234e<T> m40067J0(AbstractC11243h abstractC11243h, boolean z) {
        return this instanceof C11361j ? ((C11361j) this).m40450j1(abstractC11243h) : m40035b1(new C11332z0(this, abstractC11243h, z));
    }

    /* renamed from: K */
    public final <R> C11234e<R> m40068K(InterfaceC11256e<? super T, ? extends Iterable<? extends R>> interfaceC11256e, int i2) {
        return C11312r.m40303b(this, interfaceC11256e, i2);
    }

    /* renamed from: K0 */
    public final C11234e<T> m40069K0(C11234e<? extends T> c11234e) {
        if (c11234e != null) {
            return m40035b1(new C11268c0(this, c11234e));
        }
        throw new NullPointerException("alternate is null");
    }

    /* renamed from: L */
    public final <R> C11234e<R> m40070L(InterfaceC11256e<? super T, ? extends Single<? extends R>> interfaceC11256e) {
        return m40072M(interfaceC11256e, false, Integer.MAX_VALUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: L0 */
    public final <R> C11234e<R> m40071L0(InterfaceC11256e<? super T, ? extends C11234e<? extends R>> interfaceC11256e) {
        return m40019M0(m40082X(interfaceC11256e));
    }

    /* renamed from: M */
    public final <R> C11234e<R> m40072M(InterfaceC11256e<? super T, ? extends Single<? extends R>> interfaceC11256e, boolean z, int i2) {
        return m40035b1(new C11309q(this, interfaceC11256e, z, i2));
    }

    /* renamed from: N0 */
    public final C11234e<T> m40073N0(int i2) {
        return (C11234e<T>) m40080W(new C11266b1(i2));
    }

    /* renamed from: O0 */
    public final C11234e<T> m40074O0(InterfaceC11256e<? super T, Boolean> interfaceC11256e) {
        return m40055D(interfaceC11256e).m40073N0(1);
    }

    /* renamed from: P0 */
    public final <E> C11234e<T> m40075P0(C11234e<? extends E> c11234e) {
        return (C11234e<T>) m40080W(new C11269c1(c11234e));
    }

    /* renamed from: Q0 */
    public final C11234e<T> m40076Q0(InterfaceC11256e<? super T, Boolean> interfaceC11256e) {
        return (C11234e<T>) m40080W(new C11272d1(interfaceC11256e));
    }

    /* renamed from: R0 */
    public final C11234e<T> m40077R0(long j2, TimeUnit timeUnit) {
        return m40114u0(j2, timeUnit);
    }

    /* renamed from: S0 */
    public final C11234e<T> m40078S0(long j2, TimeUnit timeUnit, C11234e<? extends T> c11234e) {
        return m40079T0(j2, timeUnit, c11234e, Schedulers.computation());
    }

    /* renamed from: T0 */
    public final C11234e<T> m40079T0(long j2, TimeUnit timeUnit, C11234e<? extends T> c11234e, AbstractC11243h abstractC11243h) {
        return m40035b1(new C11274e0(this, j2, timeUnit, abstractC11243h, c11234e));
    }

    /* renamed from: W */
    public final <R> C11234e<R> m40080W(b<? extends R, ? super T> bVar) {
        return m40035b1(new C11323v(this.f42129f, bVar));
    }

    /* renamed from: W0 */
    public final C11399a<T> m40081W0() {
        return C11399a.m40550c(this);
    }

    /* renamed from: X */
    public final <R> C11234e<R> m40082X(InterfaceC11256e<? super T, ? extends R> interfaceC11256e) {
        return m40035b1(new C11325w(this, interfaceC11256e));
    }

    /* renamed from: X0 */
    public C11231b m40083X0() {
        return C11231b.m39954v(this);
    }

    /* renamed from: Y0 */
    public final C11234e<List<T>> m40084Y0() {
        return (C11234e<List<T>>) m40080W(C11275e1.m40201b());
    }

    /* renamed from: Z0 */
    public Single<T> m40085Z0() {
        return new Single<>(C11262a0.m40165b(this));
    }

    /* renamed from: a */
    public final C11234e<T> m40086a() {
        return (C11234e<T>) m40080W(C11286i0.m40225b());
    }

    /* renamed from: a1 */
    public final C11234e<List<T>> m40087a1(InterfaceC11257f<? super T, ? super T, Integer> interfaceC11257f) {
        return (C11234e<List<T>>) m40080W(new C11278f1(interfaceC11257f, 10));
    }

    /* renamed from: b */
    public final <R> C11234e<R> m40088b(Class<R> cls) {
        return m40080W(new C11289j0(cls));
    }

    /* renamed from: c1 */
    public final InterfaceC11246k m40089c1(AbstractC11245j<? super T> abstractC11245j) {
        try {
            abstractC11245j.onStart();
            C11409c.m40584p(this, this.f42129f).call(abstractC11245j);
            return C11409c.m40583o(abstractC11245j);
        } catch (Throwable th) {
            C11240a.m40140e(th);
            try {
                abstractC11245j.onError(C11409c.m40581m(th));
                return C11429e.m40676c();
            } catch (Throwable th2) {
                C11240a.m40140e(th2);
                OnErrorFailedException onErrorFailedException = new OnErrorFailedException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th2);
                C11409c.m40581m(onErrorFailedException);
                throw onErrorFailedException;
            }
        }
    }

    /* renamed from: e1 */
    public final <T2, R> C11234e<R> m40090e1(C11234e<? extends T2> c11234e, InterfaceC11257f<? super T, ? super T2, ? extends R> interfaceC11257f) {
        return m40040d1(this, c11234e, interfaceC11257f);
    }

    /* renamed from: f */
    public <R> C11234e<R> m40091f(c<? super T, ? extends R> cVar) {
        return (C11234e) cVar.call(this);
    }

    /* renamed from: i */
    public final <R> C11234e<R> m40092i(InterfaceC11256e<? super T, ? extends C11234e<? extends R>> interfaceC11256e) {
        return this instanceof C11361j ? ((C11361j) this).m40449i1(interfaceC11256e) : m40035b1(new C11291k(this, interfaceC11256e, 2, 0));
    }

    /* renamed from: i0 */
    public final C11234e<T> m40093i0(C11234e<? extends T> c11234e) {
        return m40033a0(this, c11234e);
    }

    /* renamed from: j */
    public final <R> C11234e<R> m40094j(InterfaceC11256e<? super T, ? extends C11234e<? extends R>> interfaceC11256e) {
        return m40096k(interfaceC11256e, C11359h.f42884f);
    }

    /* renamed from: j0 */
    public final C11234e<T> m40095j0(AbstractC11243h abstractC11243h) {
        return m40097k0(abstractC11243h, C11359h.f42884f);
    }

    /* renamed from: k */
    public final <R> C11234e<R> m40096k(InterfaceC11256e<? super T, ? extends C11234e<? extends R>> interfaceC11256e, int i2) {
        if (i2 >= 1) {
            return m40080W(new C11307p0(interfaceC11256e, i2, Integer.MAX_VALUE));
        }
        throw new IllegalArgumentException("capacityHint > 0 required but it was " + i2);
    }

    /* renamed from: k0 */
    public final C11234e<T> m40097k0(AbstractC11243h abstractC11243h, int i2) {
        return m40098l0(abstractC11243h, false, i2);
    }

    /* renamed from: l0 */
    public final C11234e<T> m40098l0(AbstractC11243h abstractC11243h, boolean z, int i2) {
        return this instanceof C11361j ? ((C11361j) this).m40450j1(abstractC11243h) : (C11234e<T>) m40080W(new C11313r0(abstractC11243h, z, i2));
    }

    /* renamed from: m */
    public final C11234e<T> m40099m(long j2, TimeUnit timeUnit) {
        return m40101n(j2, timeUnit, Schedulers.computation());
    }

    /* renamed from: m0 */
    public final C11234e<T> m40100m0() {
        return (C11234e<T>) m40080W(C11316s0.m40318b());
    }

    /* renamed from: n */
    public final C11234e<T> m40101n(long j2, TimeUnit timeUnit, AbstractC11243h abstractC11243h) {
        return (C11234e<T>) m40080W(new C11292k0(j2, timeUnit, abstractC11243h));
    }

    /* renamed from: n0 */
    public final C11234e<T> m40102n0(C11234e<? extends T> c11234e) {
        return (C11234e<T>) m40080W(C11319t0.m40326b(c11234e));
    }

    /* renamed from: o */
    public final C11234e<T> m40103o(T t) {
        return m40069K0(m40025S(t));
    }

    /* renamed from: o0 */
    public final C11234e<T> m40104o0(InterfaceC11256e<? super Throwable, ? extends C11234e<? extends T>> interfaceC11256e) {
        return (C11234e<T>) m40080W(new C11319t0(interfaceC11256e));
    }

    /* renamed from: p0 */
    public final C11234e<T> m40105p0(InterfaceC11256e<? super Throwable, ? extends T> interfaceC11256e) {
        return (C11234e<T>) m40080W(C11319t0.m40327c(interfaceC11256e));
    }

    /* renamed from: q */
    public final C11234e<T> m40106q(long j2, TimeUnit timeUnit) {
        return m40108r(j2, timeUnit, Schedulers.computation());
    }

    /* renamed from: q0 */
    public final AbstractC11400b<T> m40107q0() {
        return C11322u0.m40335k1(this);
    }

    /* renamed from: r */
    public final C11234e<T> m40108r(long j2, TimeUnit timeUnit, AbstractC11243h abstractC11243h) {
        return (C11234e<T>) m40080W(new C11295l0(j2, timeUnit, abstractC11243h));
    }

    /* renamed from: s */
    public final <U> C11234e<T> m40109s(C11234e<U> c11234e) {
        c11234e.getClass();
        return m40035b1(new C11297m(this, c11234e));
    }

    /* renamed from: s0 */
    public final C11234e<T> m40110s0() {
        return C11329y.m40354b(this);
    }

    /* renamed from: t */
    public final C11234e<T> m40111t() {
        return (C11234e<T>) m40080W(C11298m0.m40255d());
    }

    /* renamed from: t0 */
    public final C11234e<T> m40112t0(InterfaceC11256e<? super C11234e<? extends Throwable>, ? extends C11234e<?>> interfaceC11256e) {
        return C11329y.m40355c(this, EnumC11357f.m40424g(interfaceC11256e));
    }

    /* renamed from: u */
    public final <U> C11234e<T> m40113u(InterfaceC11256e<? super T, ? extends U> interfaceC11256e) {
        return (C11234e<T>) m40080W(new C11298m0(interfaceC11256e));
    }

    /* renamed from: u0 */
    public final C11234e<T> m40114u0(long j2, TimeUnit timeUnit) {
        return m40116v0(j2, timeUnit, Schedulers.computation());
    }

    /* renamed from: v */
    public final C11234e<T> m40115v(InterfaceC11252a interfaceC11252a) {
        return m40035b1(new C11300n(this, new C11352a(C11254c.m40157a(), C11254c.m40157a(), interfaceC11252a)));
    }

    /* renamed from: v0 */
    public final C11234e<T> m40116v0(long j2, TimeUnit timeUnit, AbstractC11243h abstractC11243h) {
        return (C11234e<T>) m40080W(new C11324v0(j2, timeUnit, abstractC11243h));
    }

    /* renamed from: w */
    public final C11234e<T> m40117w(InterfaceC11253b<? super Throwable> interfaceC11253b) {
        return m40035b1(new C11300n(this, new C11352a(C11254c.m40157a(), interfaceC11253b, C11254c.m40157a())));
    }

    /* renamed from: w0 */
    public final C11234e<T> m40118w0() {
        return m40107q0().m40555j1();
    }

    /* renamed from: x */
    public final C11234e<T> m40119x(InterfaceC11253b<? super T> interfaceC11253b) {
        return m40035b1(new C11300n(this, new C11352a(interfaceC11253b, C11254c.m40157a(), C11254c.m40157a())));
    }

    /* renamed from: x0 */
    public final C11234e<T> m40120x0() {
        return (C11234e<T>) m40080W(C11326w0.m40348b());
    }

    /* renamed from: y */
    public final C11234e<T> m40121y(InterfaceC11252a interfaceC11252a) {
        return (C11234e<T>) m40080W(new C11301n0(interfaceC11252a));
    }

    /* renamed from: y0 */
    public final C11234e<T> m40122y0(int i2) {
        return (C11234e<T>) m40080W(new C11328x0(i2));
    }

    /* renamed from: z */
    public final C11234e<T> m40123z(InterfaceC11252a interfaceC11252a) {
        return m40035b1(new C11300n(this, new C11352a(C11254c.m40157a(), C11254c.m40158b(interfaceC11252a), interfaceC11252a)));
    }

    /* renamed from: z0 */
    public final C11234e<T> m40124z0(long j2, TimeUnit timeUnit) {
        return m40052A0(j2, timeUnit, Schedulers.computation());
    }
}
