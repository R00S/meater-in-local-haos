package p456rx.p461n.p462a;

import p456rx.AbstractC11244i;
import p456rx.Single;
import p456rx.exceptions.C11240a;
import p456rx.p460m.InterfaceC11252a;

/* compiled from: SingleDoOnSubscribe.java */
/* renamed from: rx.n.a.i1 */
/* loaded from: classes3.dex */
public final class C11287i1<T> implements Single.InterfaceC11229j<T> {

    /* renamed from: f */
    final Single.InterfaceC11229j<T> f42328f;

    /* renamed from: g */
    final InterfaceC11252a f42329g;

    public C11287i1(Single.InterfaceC11229j<T> interfaceC11229j, InterfaceC11252a interfaceC11252a) {
        this.f42328f = interfaceC11229j;
        this.f42329g = interfaceC11252a;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11244i<? super T> abstractC11244i) {
        try {
            this.f42329g.call();
            this.f42328f.call(abstractC11244i);
        } catch (Throwable th) {
            C11240a.m40140e(th);
            abstractC11244i.onError(th);
        }
    }
}
