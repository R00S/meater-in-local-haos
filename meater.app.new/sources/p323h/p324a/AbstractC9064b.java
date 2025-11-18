package p323h.p324a;

import io.reactivex.exceptions.C9240a;
import java.util.concurrent.Callable;
import p323h.p324a.p325a0.C9063a;
import p323h.p324a.p329z.p331b.C9108b;
import p323h.p324a.p329z.p334e.p335a.C9118a;
import p323h.p324a.p329z.p334e.p335a.C9119b;
import p323h.p324a.p329z.p334e.p335a.C9121d;

/* compiled from: Completable.java */
/* renamed from: h.a.b */
/* loaded from: classes2.dex */
public abstract class AbstractC9064b implements InterfaceC9069f {
    /* renamed from: c */
    public static AbstractC9064b m29157c(InterfaceC9068e interfaceC9068e) {
        C9108b.m29271c(interfaceC9068e, "source is null");
        return C9063a.m29142j(new C9118a(interfaceC9068e));
    }

    /* renamed from: d */
    public static AbstractC9064b m29158d(Callable<?> callable) {
        C9108b.m29271c(callable, "callable is null");
        return C9063a.m29142j(new C9119b(callable));
    }

    /* renamed from: g */
    private static NullPointerException m29159g(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    @Override // p323h.p324a.InterfaceC9069f
    /* renamed from: b */
    public final void mo29160b(InterfaceC9067d interfaceC9067d) {
        C9108b.m29271c(interfaceC9067d, "observer is null");
        try {
            InterfaceC9067d interfaceC9067dM29151s = C9063a.m29151s(this, interfaceC9067d);
            C9108b.m29271c(interfaceC9067dM29151s, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo29113e(interfaceC9067dM29151s);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            C9240a.m30000a(th);
            C9063a.m29147o(th);
            throw m29159g(th);
        }
    }

    /* renamed from: e */
    protected abstract void mo29113e(InterfaceC9067d interfaceC9067d);

    /* renamed from: f */
    public final AbstractC9064b m29161f(AbstractC9081r abstractC9081r) {
        C9108b.m29271c(abstractC9081r, "scheduler is null");
        return C9063a.m29142j(new C9121d(this, abstractC9081r));
    }
}
