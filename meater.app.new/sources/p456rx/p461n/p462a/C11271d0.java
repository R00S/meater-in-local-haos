package p456rx.p461n.p462a;

import p456rx.AbstractC11245j;
import p456rx.C11234e;

/* compiled from: OnSubscribeThrow.java */
/* renamed from: rx.n.a.d0 */
/* loaded from: classes3.dex */
public final class C11271d0<T> implements C11234e.a<T> {

    /* renamed from: f */
    private final Throwable f42228f;

    public C11271d0(Throwable th) {
        this.f42228f = th;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super T> abstractC11245j) {
        abstractC11245j.onError(this.f42228f);
    }
}
