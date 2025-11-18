package p456rx.p461n.p462a;

import java.util.concurrent.Callable;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.exceptions.C11240a;
import p456rx.p461n.p463b.C11334b;

/* compiled from: OnSubscribeFromCallable.java */
/* renamed from: rx.n.a.t */
/* loaded from: classes3.dex */
public final class C11318t<T> implements C11234e.a<T> {

    /* renamed from: f */
    private final Callable<? extends T> f42604f;

    public C11318t(Callable<? extends T> callable) {
        this.f42604f = callable;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super T> abstractC11245j) {
        C11334b c11334b = new C11334b(abstractC11245j);
        abstractC11245j.setProducer(c11334b);
        try {
            c11334b.m40377b(this.f42604f.call());
        } catch (Throwable th) {
            C11240a.m40141f(th, abstractC11245j);
        }
    }
}
