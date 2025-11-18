package p323h.p324a;

import io.reactivex.exceptions.C9240a;
import java.util.List;
import java.util.concurrent.Callable;
import p323h.p324a.p325a0.C9063a;
import p323h.p324a.p328y.InterfaceC9093a;
import p323h.p324a.p328y.InterfaceC9097e;
import p323h.p324a.p328y.InterfaceC9098f;
import p323h.p324a.p329z.p331b.C9107a;
import p323h.p324a.p329z.p331b.C9108b;
import p323h.p324a.p329z.p332c.InterfaceCallableC9112d;
import p323h.p324a.p329z.p334e.p336b.C9123b;
import p323h.p324a.p329z.p334e.p336b.C9126e;
import p323h.p324a.p329z.p334e.p338d.C9132b;
import p323h.p324a.p329z.p334e.p338d.C9133c;
import p323h.p324a.p329z.p334e.p338d.C9134d;
import p323h.p324a.p329z.p334e.p338d.C9135e;
import p323h.p324a.p329z.p334e.p338d.C9136f;
import p323h.p324a.p329z.p334e.p338d.C9138h;
import p323h.p324a.p329z.p334e.p338d.C9139i;
import p323h.p324a.p329z.p334e.p338d.C9140j;
import p323h.p324a.p329z.p334e.p338d.C9141k;
import p323h.p324a.p329z.p334e.p338d.C9142l;
import p323h.p324a.p329z.p334e.p338d.C9143m;
import p323h.p324a.p329z.p334e.p338d.C9144n;
import p323h.p324a.p329z.p334e.p338d.C9145o;
import p323h.p324a.p329z.p334e.p338d.C9146p;
import p323h.p324a.p329z.p334e.p338d.C9147q;
import p323h.p324a.p329z.p334e.p338d.C9149s;
import p323h.p324a.p329z.p334e.p338d.C9150t;

/* compiled from: Observable.java */
/* renamed from: h.a.m */
/* loaded from: classes2.dex */
public abstract class AbstractC9076m<T> implements InterfaceC9079p<T> {

    /* compiled from: Observable.java */
    /* renamed from: h.a.m$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f34932a;

        static {
            int[] iArr = new int[EnumC9062a.values().length];
            f34932a = iArr;
            try {
                iArr[EnumC9062a.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34932a[EnumC9062a.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34932a[EnumC9062a.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34932a[EnumC9062a.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: D */
    public static <T> AbstractC9076m<T> m29187D(InterfaceC9079p<T> interfaceC9079p) {
        C9108b.m29271c(interfaceC9079p, "source is null");
        return interfaceC9079p instanceof AbstractC9076m ? C9063a.m29145m((AbstractC9076m) interfaceC9079p) : C9063a.m29145m(new C9142l(interfaceC9079p));
    }

    /* renamed from: b */
    public static int m29188b() {
        return AbstractC9071h.m29172c();
    }

    /* renamed from: c */
    public static <T> AbstractC9076m<T> m29189c(InterfaceC9078o<T> interfaceC9078o) {
        C9108b.m29271c(interfaceC9078o, "source is null");
        return C9063a.m29145m(new C9132b(interfaceC9078o));
    }

    /* renamed from: d */
    private AbstractC9076m<T> m29190d(InterfaceC9097e<? super T> interfaceC9097e, InterfaceC9097e<? super Throwable> interfaceC9097e2, InterfaceC9093a interfaceC9093a, InterfaceC9093a interfaceC9093a2) {
        C9108b.m29271c(interfaceC9097e, "onNext is null");
        C9108b.m29271c(interfaceC9097e2, "onError is null");
        C9108b.m29271c(interfaceC9093a, "onComplete is null");
        C9108b.m29271c(interfaceC9093a2, "onAfterTerminate is null");
        return C9063a.m29145m(new C9133c(this, interfaceC9097e, interfaceC9097e2, interfaceC9093a, interfaceC9093a2));
    }

    /* renamed from: g */
    public static <T> AbstractC9076m<T> m29191g() {
        return C9063a.m29145m(C9134d.f35023f);
    }

    /* renamed from: h */
    public static <T> AbstractC9076m<T> m29192h(Throwable th) {
        C9108b.m29271c(th, "exception is null");
        return m29193i(C9107a.m29264c(th));
    }

    /* renamed from: i */
    public static <T> AbstractC9076m<T> m29193i(Callable<? extends Throwable> callable) {
        C9108b.m29271c(callable, "errorSupplier is null");
        return C9063a.m29145m(new C9135e(callable));
    }

    /* renamed from: s */
    public static <T> AbstractC9076m<T> m29194s(Iterable<? extends T> iterable) {
        C9108b.m29271c(iterable, "source is null");
        return C9063a.m29145m(new C9141k(iterable));
    }

    /* renamed from: t */
    public static <T> AbstractC9076m<T> m29195t(T t) {
        C9108b.m29271c(t, "item is null");
        return C9063a.m29145m(new C9143m(t));
    }

    /* renamed from: A */
    public final AbstractC9082s<List<T>> m29196A() {
        return m29197B(16);
    }

    /* renamed from: B */
    public final AbstractC9082s<List<T>> m29197B(int i2) {
        C9108b.m29272d(i2, "capacityHint");
        return C9063a.m29146n(new C9149s(this, i2));
    }

    /* renamed from: C */
    public final AbstractC9076m<T> m29198C(AbstractC9081r abstractC9081r) {
        C9108b.m29271c(abstractC9081r, "scheduler is null");
        return C9063a.m29145m(new C9150t(this, abstractC9081r));
    }

    @Override // p323h.p324a.InterfaceC9079p
    /* renamed from: a */
    public final void mo29199a(InterfaceC9080q<? super T> interfaceC9080q) {
        C9108b.m29271c(interfaceC9080q, "observer is null");
        try {
            InterfaceC9080q<? super T> interfaceC9080qM29153u = C9063a.m29153u(this, interfaceC9080q);
            C9108b.m29271c(interfaceC9080qM29153u, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo29214x(interfaceC9080qM29153u);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            C9240a.m30000a(th);
            C9063a.m29147o(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: e */
    public final AbstractC9076m<T> m29200e(InterfaceC9097e<? super Throwable> interfaceC9097e) {
        InterfaceC9097e<? super T> interfaceC9097eM29263b = C9107a.m29263b();
        InterfaceC9093a interfaceC9093a = C9107a.f34948c;
        return m29190d(interfaceC9097eM29263b, interfaceC9097e, interfaceC9093a, interfaceC9093a);
    }

    /* renamed from: f */
    public final AbstractC9076m<T> m29201f(InterfaceC9097e<? super T> interfaceC9097e) {
        InterfaceC9097e<? super Throwable> interfaceC9097eM29263b = C9107a.m29263b();
        InterfaceC9093a interfaceC9093a = C9107a.f34948c;
        return m29190d(interfaceC9097e, interfaceC9097eM29263b, interfaceC9093a, interfaceC9093a);
    }

    /* renamed from: j */
    public final <R> AbstractC9076m<R> m29202j(InterfaceC9098f<? super T, ? extends InterfaceC9079p<? extends R>> interfaceC9098f) {
        return m29203k(interfaceC9098f, false);
    }

    /* renamed from: k */
    public final <R> AbstractC9076m<R> m29203k(InterfaceC9098f<? super T, ? extends InterfaceC9079p<? extends R>> interfaceC9098f, boolean z) {
        return m29204l(interfaceC9098f, z, Integer.MAX_VALUE);
    }

    /* renamed from: l */
    public final <R> AbstractC9076m<R> m29204l(InterfaceC9098f<? super T, ? extends InterfaceC9079p<? extends R>> interfaceC9098f, boolean z, int i2) {
        return m29205m(interfaceC9098f, z, i2, m29188b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public final <R> AbstractC9076m<R> m29205m(InterfaceC9098f<? super T, ? extends InterfaceC9079p<? extends R>> interfaceC9098f, boolean z, int i2, int i3) {
        C9108b.m29271c(interfaceC9098f, "mapper is null");
        C9108b.m29272d(i2, "maxConcurrency");
        C9108b.m29272d(i3, "bufferSize");
        if (!(this instanceof InterfaceCallableC9112d)) {
            return C9063a.m29145m(new C9136f(this, interfaceC9098f, z, i2, i3));
        }
        Object objCall = ((InterfaceCallableC9112d) this).call();
        return objCall == null ? m29191g() : C9146p.m29309a(objCall, interfaceC9098f);
    }

    /* renamed from: n */
    public final AbstractC9064b m29206n(InterfaceC9098f<? super T, ? extends InterfaceC9069f> interfaceC9098f) {
        return m29207o(interfaceC9098f, false);
    }

    /* renamed from: o */
    public final AbstractC9064b m29207o(InterfaceC9098f<? super T, ? extends InterfaceC9069f> interfaceC9098f, boolean z) {
        C9108b.m29271c(interfaceC9098f, "mapper is null");
        return C9063a.m29142j(new C9138h(this, interfaceC9098f, z));
    }

    /* renamed from: p */
    public final <U> AbstractC9076m<U> m29208p(InterfaceC9098f<? super T, ? extends Iterable<? extends U>> interfaceC9098f) {
        C9108b.m29271c(interfaceC9098f, "mapper is null");
        return C9063a.m29145m(new C9140j(this, interfaceC9098f));
    }

    /* renamed from: q */
    public final <R> AbstractC9076m<R> m29209q(InterfaceC9098f<? super T, ? extends InterfaceC9075l<? extends R>> interfaceC9098f) {
        return m29210r(interfaceC9098f, false);
    }

    /* renamed from: r */
    public final <R> AbstractC9076m<R> m29210r(InterfaceC9098f<? super T, ? extends InterfaceC9075l<? extends R>> interfaceC9098f, boolean z) {
        C9108b.m29271c(interfaceC9098f, "mapper is null");
        return C9063a.m29145m(new C9139i(this, interfaceC9098f, z));
    }

    /* renamed from: u */
    public final AbstractC9076m<T> m29211u(AbstractC9081r abstractC9081r) {
        return m29212v(abstractC9081r, false, m29188b());
    }

    /* renamed from: v */
    public final AbstractC9076m<T> m29212v(AbstractC9081r abstractC9081r, boolean z, int i2) {
        C9108b.m29271c(abstractC9081r, "scheduler is null");
        C9108b.m29272d(i2, "bufferSize");
        return C9063a.m29145m(new C9144n(this, abstractC9081r, z, i2));
    }

    /* renamed from: w */
    public final AbstractC9076m<T> m29213w(InterfaceC9098f<? super Throwable, ? extends T> interfaceC9098f) {
        C9108b.m29271c(interfaceC9098f, "valueSupplier is null");
        return C9063a.m29145m(new C9145o(this, interfaceC9098f));
    }

    /* renamed from: x */
    protected abstract void mo29214x(InterfaceC9080q<? super T> interfaceC9080q);

    /* renamed from: y */
    public final AbstractC9076m<T> m29215y(AbstractC9081r abstractC9081r) {
        C9108b.m29271c(abstractC9081r, "scheduler is null");
        return C9063a.m29145m(new C9147q(this, abstractC9081r));
    }

    /* renamed from: z */
    public final AbstractC9071h<T> m29216z(EnumC9062a enumC9062a) {
        C9123b c9123b = new C9123b(this);
        int i2 = a.f34932a[enumC9062a.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? c9123b.m29174d() : C9063a.m29143k(new C9126e(c9123b)) : c9123b : c9123b.m29177g() : c9123b.m29176f();
    }
}
