package p323h.p324a;

import io.reactivex.exceptions.C9240a;
import java.util.concurrent.Callable;
import p323h.p324a.p325a0.C9063a;
import p323h.p324a.p329z.p331b.C9108b;
import p323h.p324a.p329z.p334e.p337c.C9128a;
import p323h.p324a.p329z.p334e.p337c.C9130c;
import p323h.p324a.p329z.p334e.p337c.CallableC9129b;

/* compiled from: Maybe.java */
/* renamed from: h.a.j */
/* loaded from: classes2.dex */
public abstract class AbstractC9073j<T> implements InterfaceC9075l<T> {
    /* renamed from: b */
    public static <T> AbstractC9073j<T> m29180b() {
        return C9063a.m29144l(C9128a.f35006f);
    }

    /* renamed from: c */
    public static <T> AbstractC9073j<T> m29181c(Callable<? extends T> callable) {
        C9108b.m29271c(callable, "callable is null");
        return C9063a.m29144l(new CallableC9129b(callable));
    }

    /* renamed from: d */
    public static <T> AbstractC9073j<T> m29182d(T t) {
        C9108b.m29271c(t, "item is null");
        return C9063a.m29144l(new C9130c(t));
    }

    @Override // p323h.p324a.InterfaceC9075l
    /* renamed from: a */
    public final void mo29183a(InterfaceC9074k<? super T> interfaceC9074k) {
        C9108b.m29271c(interfaceC9074k, "observer is null");
        InterfaceC9074k<? super T> interfaceC9074kM29152t = C9063a.m29152t(this, interfaceC9074k);
        C9108b.m29271c(interfaceC9074kM29152t, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            mo29184e(interfaceC9074kM29152t);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            C9240a.m30000a(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: e */
    protected abstract void mo29184e(InterfaceC9074k<? super T> interfaceC9074k);
}
