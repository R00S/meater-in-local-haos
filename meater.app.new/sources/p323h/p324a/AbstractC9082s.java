package p323h.p324a;

import io.reactivex.exceptions.C9240a;
import p323h.p324a.p325a0.C9063a;
import p323h.p324a.p328y.InterfaceC9098f;
import p323h.p324a.p329z.p331b.C9108b;
import p323h.p324a.p329z.p332c.InterfaceC9109a;
import p323h.p324a.p329z.p334e.p335a.C9120c;
import p323h.p324a.p329z.p334e.p339e.C9151a;
import p323h.p324a.p329z.p334e.p339e.C9152b;
import p323h.p324a.p329z.p334e.p339e.C9153c;
import p323h.p324a.p329z.p334e.p339e.C9154d;
import p323h.p324a.p329z.p334e.p339e.C9155e;
import p323h.p324a.p329z.p334e.p339e.C9156f;

/* compiled from: Single.java */
/* renamed from: h.a.s */
/* loaded from: classes2.dex */
public abstract class AbstractC9082s<T> implements InterfaceC9086w<T> {
    /* renamed from: c */
    public static <T> AbstractC9082s<T> m29226c(InterfaceC9085v<T> interfaceC9085v) {
        C9108b.m29271c(interfaceC9085v, "source is null");
        return C9063a.m29146n(new C9151a(interfaceC9085v));
    }

    /* renamed from: f */
    public static <T> AbstractC9082s<T> m29227f(T t) {
        C9108b.m29271c(t, "item is null");
        return C9063a.m29146n(new C9153c(t));
    }

    @Override // p323h.p324a.InterfaceC9086w
    /* renamed from: b */
    public final void mo29228b(InterfaceC9084u<? super T> interfaceC9084u) {
        C9108b.m29271c(interfaceC9084u, "observer is null");
        InterfaceC9084u<? super T> interfaceC9084uM29154v = C9063a.m29154v(this, interfaceC9084u);
        C9108b.m29271c(interfaceC9084uM29154v, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            mo29129h(interfaceC9084uM29154v);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            C9240a.m30000a(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: d */
    public final <R> AbstractC9082s<R> m29229d(InterfaceC9098f<? super T, ? extends InterfaceC9086w<? extends R>> interfaceC9098f) {
        C9108b.m29271c(interfaceC9098f, "mapper is null");
        return C9063a.m29146n(new C9152b(this, interfaceC9098f));
    }

    /* renamed from: e */
    public final AbstractC9064b m29230e() {
        return C9063a.m29142j(new C9120c(this));
    }

    /* renamed from: g */
    public final <R> AbstractC9082s<R> m29231g(InterfaceC9098f<? super T, ? extends R> interfaceC9098f) {
        C9108b.m29271c(interfaceC9098f, "mapper is null");
        return C9063a.m29146n(new C9154d(this, interfaceC9098f));
    }

    /* renamed from: h */
    protected abstract void mo29129h(InterfaceC9084u<? super T> interfaceC9084u);

    /* renamed from: i */
    public final AbstractC9082s<T> m29232i(AbstractC9081r abstractC9081r) {
        C9108b.m29271c(abstractC9081r, "scheduler is null");
        return C9063a.m29146n(new C9155e(this, abstractC9081r));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public final AbstractC9076m<T> m29233j() {
        return this instanceof InterfaceC9109a ? ((InterfaceC9109a) this).mo29273a() : C9063a.m29145m(new C9156f(this));
    }
}
