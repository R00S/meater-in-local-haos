package p456rx.p461n.p462a;

import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.exceptions.C11240a;
import p456rx.p471q.C11409c;

/* compiled from: OnSubscribeLift.java */
/* renamed from: rx.n.a.v */
/* loaded from: classes3.dex */
public final class C11323v<T, R> implements C11234e.a<R> {

    /* renamed from: f */
    final C11234e.a<T> f42634f;

    /* renamed from: g */
    final C11234e.b<? extends R, ? super T> f42635g;

    public C11323v(C11234e.a<T> aVar, C11234e.b<? extends R, ? super T> bVar) {
        this.f42634f = aVar;
        this.f42635g = bVar;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super R> abstractC11245j) {
        try {
            AbstractC11245j<? super T> abstractC11245jCall = C11409c.m40582n(this.f42635g).call(abstractC11245j);
            try {
                abstractC11245jCall.onStart();
                this.f42634f.call(abstractC11245jCall);
            } catch (Throwable th) {
                C11240a.m40140e(th);
                abstractC11245jCall.onError(th);
            }
        } catch (Throwable th2) {
            C11240a.m40140e(th2);
            abstractC11245j.onError(th2);
        }
    }
}
