package p456rx.p461n.p462a;

import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p470p.C11406f;

/* compiled from: OperatorDoOnSubscribe.java */
/* renamed from: rx.n.a.n0 */
/* loaded from: classes3.dex */
public class C11301n0<T> implements C11234e.b<T, T> {

    /* renamed from: f */
    private final InterfaceC11252a f42436f;

    public C11301n0(InterfaceC11252a interfaceC11252a) {
        this.f42436f = interfaceC11252a;
    }

    @Override // p456rx.p460m.InterfaceC11256e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11245j<? super T> call(AbstractC11245j<? super T> abstractC11245j) {
        this.f42436f.call();
        return C11406f.m40561c(abstractC11245j);
    }
}
