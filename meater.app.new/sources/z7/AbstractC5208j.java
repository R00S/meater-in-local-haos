package z7;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* renamed from: z7.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5208j<TResult> {
    public AbstractC5208j<TResult> a(Executor executor, InterfaceC5202d interfaceC5202d) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public AbstractC5208j<TResult> b(Executor executor, InterfaceC5203e<TResult> interfaceC5203e) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public AbstractC5208j<TResult> c(InterfaceC5203e<TResult> interfaceC5203e) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract AbstractC5208j<TResult> d(Executor executor, InterfaceC5204f interfaceC5204f);

    public abstract AbstractC5208j<TResult> e(InterfaceC5204f interfaceC5204f);

    public abstract AbstractC5208j<TResult> f(Executor executor, InterfaceC5205g<? super TResult> interfaceC5205g);

    public abstract AbstractC5208j<TResult> g(InterfaceC5205g<? super TResult> interfaceC5205g);

    public <TContinuationResult> AbstractC5208j<TContinuationResult> h(Executor executor, InterfaceC5201c<TResult, TContinuationResult> interfaceC5201c) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> AbstractC5208j<TContinuationResult> i(Executor executor, InterfaceC5201c<TResult, AbstractC5208j<TContinuationResult>> interfaceC5201c) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception j();

    public abstract TResult k();

    public abstract <X extends Throwable> TResult l(Class<X> cls);

    public abstract boolean m();

    public abstract boolean n();

    public abstract boolean o();

    public <TContinuationResult> AbstractC5208j<TContinuationResult> p(Executor executor, InterfaceC5207i<TResult, TContinuationResult> interfaceC5207i) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public <TContinuationResult> AbstractC5208j<TContinuationResult> q(InterfaceC5207i<TResult, TContinuationResult> interfaceC5207i) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
