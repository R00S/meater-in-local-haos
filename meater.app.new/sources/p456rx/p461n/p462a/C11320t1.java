package p456rx.p461n.p462a;

import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.Single;

/* compiled from: SingleToObservable.java */
/* renamed from: rx.n.a.t1 */
/* loaded from: classes3.dex */
public final class C11320t1<T> implements C11234e.a<T> {

    /* renamed from: f */
    final Single.InterfaceC11229j<T> f42615f;

    public C11320t1(Single.InterfaceC11229j<T> interfaceC11229j) {
        this.f42615f = interfaceC11229j;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super T> abstractC11245j) {
        C11296l1 c11296l1 = new C11296l1(abstractC11245j);
        abstractC11245j.add(c11296l1);
        this.f42615f.call(c11296l1);
    }
}
