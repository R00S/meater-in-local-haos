package p456rx.p474t;

import p456rx.InterfaceC11246k;
import p456rx.p461n.p465d.C11350a;

/* compiled from: SerialSubscription.java */
/* renamed from: rx.t.d */
/* loaded from: classes3.dex */
public final class C11428d implements InterfaceC11246k {

    /* renamed from: f */
    final C11350a f43089f = new C11350a();

    /* renamed from: a */
    public InterfaceC11246k m40672a() {
        return this.f43089f.m40414a();
    }

    /* renamed from: b */
    public void m40673b(InterfaceC11246k interfaceC11246k) {
        if (interfaceC11246k == null) {
            throw new IllegalArgumentException("Subscription can not be null");
        }
        this.f43089f.m40416c(interfaceC11246k);
    }

    @Override // p456rx.InterfaceC11246k
    public boolean isUnsubscribed() {
        return this.f43089f.isUnsubscribed();
    }

    @Override // p456rx.InterfaceC11246k
    public void unsubscribe() {
        this.f43089f.unsubscribe();
    }
}
