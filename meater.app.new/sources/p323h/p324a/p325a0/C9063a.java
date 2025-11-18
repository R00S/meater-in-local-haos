package p323h.p324a.p325a0;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import java.util.concurrent.Callable;
import p323h.p324a.AbstractC9064b;
import p323h.p324a.AbstractC9071h;
import p323h.p324a.AbstractC9073j;
import p323h.p324a.AbstractC9076m;
import p323h.p324a.AbstractC9081r;
import p323h.p324a.AbstractC9082s;
import p323h.p324a.InterfaceC9067d;
import p323h.p324a.InterfaceC9074k;
import p323h.p324a.InterfaceC9080q;
import p323h.p324a.InterfaceC9084u;
import p323h.p324a.p328y.InterfaceC9094b;
import p323h.p324a.p328y.InterfaceC9097e;
import p323h.p324a.p328y.InterfaceC9098f;
import p323h.p324a.p329z.p331b.C9108b;
import p323h.p324a.p329z.p344j.C9178c;
import p355k.p356a.InterfaceC9729b;

/* compiled from: RxJavaPlugins.java */
/* renamed from: h.a.a0.a */
/* loaded from: classes2.dex */
public final class C9063a {

    /* renamed from: a */
    static volatile InterfaceC9097e<? super Throwable> f34904a;

    /* renamed from: b */
    static volatile InterfaceC9098f<? super Runnable, ? extends Runnable> f34905b;

    /* renamed from: c */
    static volatile InterfaceC9098f<? super Callable<AbstractC9081r>, ? extends AbstractC9081r> f34906c;

    /* renamed from: d */
    static volatile InterfaceC9098f<? super Callable<AbstractC9081r>, ? extends AbstractC9081r> f34907d;

    /* renamed from: e */
    static volatile InterfaceC9098f<? super Callable<AbstractC9081r>, ? extends AbstractC9081r> f34908e;

    /* renamed from: f */
    static volatile InterfaceC9098f<? super Callable<AbstractC9081r>, ? extends AbstractC9081r> f34909f;

    /* renamed from: g */
    static volatile InterfaceC9098f<? super AbstractC9081r, ? extends AbstractC9081r> f34910g;

    /* renamed from: h */
    static volatile InterfaceC9098f<? super AbstractC9081r, ? extends AbstractC9081r> f34911h;

    /* renamed from: i */
    static volatile InterfaceC9098f<? super AbstractC9071h, ? extends AbstractC9071h> f34912i;

    /* renamed from: j */
    static volatile InterfaceC9098f<? super AbstractC9076m, ? extends AbstractC9076m> f34913j;

    /* renamed from: k */
    static volatile InterfaceC9098f<? super AbstractC9073j, ? extends AbstractC9073j> f34914k;

    /* renamed from: l */
    static volatile InterfaceC9098f<? super AbstractC9082s, ? extends AbstractC9082s> f34915l;

    /* renamed from: m */
    static volatile InterfaceC9098f<? super AbstractC9064b, ? extends AbstractC9064b> f34916m;

    /* renamed from: n */
    static volatile InterfaceC9094b<? super AbstractC9071h, ? super InterfaceC9729b, ? extends InterfaceC9729b> f34917n;

    /* renamed from: o */
    static volatile InterfaceC9094b<? super AbstractC9073j, ? super InterfaceC9074k, ? extends InterfaceC9074k> f34918o;

    /* renamed from: p */
    static volatile InterfaceC9094b<? super AbstractC9076m, ? super InterfaceC9080q, ? extends InterfaceC9080q> f34919p;

    /* renamed from: q */
    static volatile InterfaceC9094b<? super AbstractC9082s, ? super InterfaceC9084u, ? extends InterfaceC9084u> f34920q;

    /* renamed from: r */
    static volatile InterfaceC9094b<? super AbstractC9064b, ? super InterfaceC9067d, ? extends InterfaceC9067d> f34921r;

    /* renamed from: a */
    static <T, U, R> R m29133a(InterfaceC9094b<T, U, R> interfaceC9094b, T t, U u) {
        try {
            return interfaceC9094b.m29247a(t, u);
        } catch (Throwable th) {
            throw C9178c.m29391c(th);
        }
    }

    /* renamed from: b */
    static <T, R> R m29134b(InterfaceC9098f<T, R> interfaceC9098f, T t) {
        try {
            return interfaceC9098f.mo4660a(t);
        } catch (Throwable th) {
            throw C9178c.m29391c(th);
        }
    }

    /* renamed from: c */
    static AbstractC9081r m29135c(InterfaceC9098f<? super Callable<AbstractC9081r>, ? extends AbstractC9081r> interfaceC9098f, Callable<AbstractC9081r> callable) {
        return (AbstractC9081r) C9108b.m29271c(m29134b(interfaceC9098f, callable), "Scheduler Callable result can't be null");
    }

    /* renamed from: d */
    static AbstractC9081r m29136d(Callable<AbstractC9081r> callable) {
        try {
            return (AbstractC9081r) C9108b.m29271c(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw C9178c.m29391c(th);
        }
    }

    /* renamed from: e */
    public static AbstractC9081r m29137e(Callable<AbstractC9081r> callable) {
        C9108b.m29271c(callable, "Scheduler Callable can't be null");
        InterfaceC9098f<? super Callable<AbstractC9081r>, ? extends AbstractC9081r> interfaceC9098f = f34906c;
        return interfaceC9098f == null ? m29136d(callable) : m29135c(interfaceC9098f, callable);
    }

    /* renamed from: f */
    public static AbstractC9081r m29138f(Callable<AbstractC9081r> callable) {
        C9108b.m29271c(callable, "Scheduler Callable can't be null");
        InterfaceC9098f<? super Callable<AbstractC9081r>, ? extends AbstractC9081r> interfaceC9098f = f34908e;
        return interfaceC9098f == null ? m29136d(callable) : m29135c(interfaceC9098f, callable);
    }

    /* renamed from: g */
    public static AbstractC9081r m29139g(Callable<AbstractC9081r> callable) {
        C9108b.m29271c(callable, "Scheduler Callable can't be null");
        InterfaceC9098f<? super Callable<AbstractC9081r>, ? extends AbstractC9081r> interfaceC9098f = f34909f;
        return interfaceC9098f == null ? m29136d(callable) : m29135c(interfaceC9098f, callable);
    }

    /* renamed from: h */
    public static AbstractC9081r m29140h(Callable<AbstractC9081r> callable) {
        C9108b.m29271c(callable, "Scheduler Callable can't be null");
        InterfaceC9098f<? super Callable<AbstractC9081r>, ? extends AbstractC9081r> interfaceC9098f = f34907d;
        return interfaceC9098f == null ? m29136d(callable) : m29135c(interfaceC9098f, callable);
    }

    /* renamed from: i */
    static boolean m29141i(Throwable th) {
        return (th instanceof OnErrorNotImplementedException) || (th instanceof MissingBackpressureException) || (th instanceof IllegalStateException) || (th instanceof NullPointerException) || (th instanceof IllegalArgumentException) || (th instanceof CompositeException);
    }

    /* renamed from: j */
    public static AbstractC9064b m29142j(AbstractC9064b abstractC9064b) {
        InterfaceC9098f<? super AbstractC9064b, ? extends AbstractC9064b> interfaceC9098f = f34916m;
        return interfaceC9098f != null ? (AbstractC9064b) m29134b(interfaceC9098f, abstractC9064b) : abstractC9064b;
    }

    /* renamed from: k */
    public static <T> AbstractC9071h<T> m29143k(AbstractC9071h<T> abstractC9071h) {
        InterfaceC9098f<? super AbstractC9071h, ? extends AbstractC9071h> interfaceC9098f = f34912i;
        return interfaceC9098f != null ? (AbstractC9071h) m29134b(interfaceC9098f, abstractC9071h) : abstractC9071h;
    }

    /* renamed from: l */
    public static <T> AbstractC9073j<T> m29144l(AbstractC9073j<T> abstractC9073j) {
        InterfaceC9098f<? super AbstractC9073j, ? extends AbstractC9073j> interfaceC9098f = f34914k;
        return interfaceC9098f != null ? (AbstractC9073j) m29134b(interfaceC9098f, abstractC9073j) : abstractC9073j;
    }

    /* renamed from: m */
    public static <T> AbstractC9076m<T> m29145m(AbstractC9076m<T> abstractC9076m) {
        InterfaceC9098f<? super AbstractC9076m, ? extends AbstractC9076m> interfaceC9098f = f34913j;
        return interfaceC9098f != null ? (AbstractC9076m) m29134b(interfaceC9098f, abstractC9076m) : abstractC9076m;
    }

    /* renamed from: n */
    public static <T> AbstractC9082s<T> m29146n(AbstractC9082s<T> abstractC9082s) {
        InterfaceC9098f<? super AbstractC9082s, ? extends AbstractC9082s> interfaceC9098f = f34915l;
        return interfaceC9098f != null ? (AbstractC9082s) m29134b(interfaceC9098f, abstractC9082s) : abstractC9082s;
    }

    /* renamed from: o */
    public static void m29147o(Throwable th) {
        InterfaceC9097e<? super Throwable> interfaceC9097e = f34904a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!m29141i(th)) {
            th = new UndeliverableException(th);
        }
        if (interfaceC9097e != null) {
            try {
                interfaceC9097e.mo7420a(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                m29156x(th2);
            }
        }
        th.printStackTrace();
        m29156x(th);
    }

    /* renamed from: p */
    public static AbstractC9081r m29148p(AbstractC9081r abstractC9081r) {
        InterfaceC9098f<? super AbstractC9081r, ? extends AbstractC9081r> interfaceC9098f = f34911h;
        return interfaceC9098f == null ? abstractC9081r : (AbstractC9081r) m29134b(interfaceC9098f, abstractC9081r);
    }

    /* renamed from: q */
    public static Runnable m29149q(Runnable runnable) {
        C9108b.m29271c(runnable, "run is null");
        InterfaceC9098f<? super Runnable, ? extends Runnable> interfaceC9098f = f34905b;
        return interfaceC9098f == null ? runnable : (Runnable) m29134b(interfaceC9098f, runnable);
    }

    /* renamed from: r */
    public static AbstractC9081r m29150r(AbstractC9081r abstractC9081r) {
        InterfaceC9098f<? super AbstractC9081r, ? extends AbstractC9081r> interfaceC9098f = f34910g;
        return interfaceC9098f == null ? abstractC9081r : (AbstractC9081r) m29134b(interfaceC9098f, abstractC9081r);
    }

    /* renamed from: s */
    public static InterfaceC9067d m29151s(AbstractC9064b abstractC9064b, InterfaceC9067d interfaceC9067d) {
        InterfaceC9094b<? super AbstractC9064b, ? super InterfaceC9067d, ? extends InterfaceC9067d> interfaceC9094b = f34921r;
        return interfaceC9094b != null ? (InterfaceC9067d) m29133a(interfaceC9094b, abstractC9064b, interfaceC9067d) : interfaceC9067d;
    }

    /* renamed from: t */
    public static <T> InterfaceC9074k<? super T> m29152t(AbstractC9073j<T> abstractC9073j, InterfaceC9074k<? super T> interfaceC9074k) {
        InterfaceC9094b<? super AbstractC9073j, ? super InterfaceC9074k, ? extends InterfaceC9074k> interfaceC9094b = f34918o;
        return interfaceC9094b != null ? (InterfaceC9074k) m29133a(interfaceC9094b, abstractC9073j, interfaceC9074k) : interfaceC9074k;
    }

    /* renamed from: u */
    public static <T> InterfaceC9080q<? super T> m29153u(AbstractC9076m<T> abstractC9076m, InterfaceC9080q<? super T> interfaceC9080q) {
        InterfaceC9094b<? super AbstractC9076m, ? super InterfaceC9080q, ? extends InterfaceC9080q> interfaceC9094b = f34919p;
        return interfaceC9094b != null ? (InterfaceC9080q) m29133a(interfaceC9094b, abstractC9076m, interfaceC9080q) : interfaceC9080q;
    }

    /* renamed from: v */
    public static <T> InterfaceC9084u<? super T> m29154v(AbstractC9082s<T> abstractC9082s, InterfaceC9084u<? super T> interfaceC9084u) {
        InterfaceC9094b<? super AbstractC9082s, ? super InterfaceC9084u, ? extends InterfaceC9084u> interfaceC9094b = f34920q;
        return interfaceC9094b != null ? (InterfaceC9084u) m29133a(interfaceC9094b, abstractC9082s, interfaceC9084u) : interfaceC9084u;
    }

    /* renamed from: w */
    public static <T> InterfaceC9729b<? super T> m29155w(AbstractC9071h<T> abstractC9071h, InterfaceC9729b<? super T> interfaceC9729b) {
        InterfaceC9094b<? super AbstractC9071h, ? super InterfaceC9729b, ? extends InterfaceC9729b> interfaceC9094b = f34917n;
        return interfaceC9094b != null ? (InterfaceC9729b) m29133a(interfaceC9094b, abstractC9071h, interfaceC9729b) : interfaceC9729b;
    }

    /* renamed from: x */
    static void m29156x(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
