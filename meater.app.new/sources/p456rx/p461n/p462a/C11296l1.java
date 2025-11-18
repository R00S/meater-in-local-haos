package p456rx.p461n.p462a;

import p456rx.AbstractC11244i;
import p456rx.AbstractC11245j;
import p456rx.p461n.p463b.C11335c;

/* compiled from: SingleLiftObservableOperator.java */
/* renamed from: rx.n.a.l1 */
/* loaded from: classes3.dex */
final class C11296l1<T> extends AbstractC11244i<T> {

    /* renamed from: g */
    final AbstractC11245j<? super T> f42411g;

    C11296l1(AbstractC11245j<? super T> abstractC11245j) {
        this.f42411g = abstractC11245j;
    }

    @Override // p456rx.AbstractC11244i
    /* renamed from: c */
    public void mo29130c(T t) {
        this.f42411g.setProducer(new C11335c(this.f42411g, t));
    }

    @Override // p456rx.AbstractC11244i
    public void onError(Throwable th) {
        this.f42411g.onError(th);
    }
}
