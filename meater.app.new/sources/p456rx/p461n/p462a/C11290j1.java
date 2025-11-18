package p456rx.p461n.p462a;

import java.util.concurrent.Callable;
import p456rx.AbstractC11244i;
import p456rx.Single;
import p456rx.exceptions.C11240a;

/* compiled from: SingleFromCallable.java */
/* renamed from: rx.n.a.j1 */
/* loaded from: classes3.dex */
public final class C11290j1<T> implements Single.InterfaceC11229j<T> {

    /* renamed from: f */
    final Callable<? extends T> f42356f;

    public C11290j1(Callable<? extends T> callable) {
        this.f42356f = callable;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11244i<? super T> abstractC11244i) {
        try {
            abstractC11244i.mo29130c(this.f42356f.call());
        } catch (Throwable th) {
            C11240a.m40140e(th);
            abstractC11244i.onError(th);
        }
    }
}
