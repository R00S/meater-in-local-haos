package p456rx.p461n.p462a;

import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.exceptions.C11240a;
import p456rx.p460m.InterfaceCallableC11255d;
import p456rx.p470p.C11406f;

/* compiled from: OnSubscribeDefer.java */
/* renamed from: rx.n.a.l */
/* loaded from: classes3.dex */
public final class C11294l<T> implements C11234e.a<T> {

    /* renamed from: f */
    final InterfaceCallableC11255d<? extends C11234e<? extends T>> f42398f;

    public C11294l(InterfaceCallableC11255d<? extends C11234e<? extends T>> interfaceCallableC11255d) {
        this.f42398f = interfaceCallableC11255d;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super T> abstractC11245j) {
        try {
            this.f42398f.call().m40089c1(C11406f.m40561c(abstractC11245j));
        } catch (Throwable th) {
            C11240a.m40141f(th, abstractC11245j);
        }
    }
}
