package p456rx.p461n.p462a;

import java.util.concurrent.atomic.AtomicInteger;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.InterfaceC11246k;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p469o.AbstractC11400b;
import p456rx.p470p.C11406f;

/* compiled from: OnSubscribeAutoConnect.java */
/* renamed from: rx.n.a.i */
/* loaded from: classes3.dex */
public final class C11285i<T> extends AtomicInteger implements C11234e.a<T> {

    /* renamed from: f */
    final AbstractC11400b<? extends T> f42324f;

    /* renamed from: g */
    final int f42325g;

    /* renamed from: h */
    final InterfaceC11253b<? super InterfaceC11246k> f42326h;

    public C11285i(AbstractC11400b<? extends T> abstractC11400b, int i2, InterfaceC11253b<? super InterfaceC11246k> interfaceC11253b) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("numberOfSubscribers > 0 required");
        }
        this.f42324f = abstractC11400b;
        this.f42325g = i2;
        this.f42326h = interfaceC11253b;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super T> abstractC11245j) {
        this.f42324f.m40089c1(C11406f.m40561c(abstractC11245j));
        if (incrementAndGet() == this.f42325g) {
            this.f42324f.mo40336i1(this.f42326h);
        }
    }
}
