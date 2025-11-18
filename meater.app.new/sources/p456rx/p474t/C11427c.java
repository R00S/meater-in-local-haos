package p456rx.p474t;

import p456rx.InterfaceC11246k;
import p456rx.p461n.p465d.C11350a;

/* compiled from: MultipleAssignmentSubscription.java */
/* renamed from: rx.t.c */
/* loaded from: classes3.dex */
public final class C11427c implements InterfaceC11246k {

    /* renamed from: f */
    final C11350a f43088f = new C11350a();

    /* renamed from: a */
    public void m40671a(InterfaceC11246k interfaceC11246k) {
        if (interfaceC11246k == null) {
            throw new IllegalArgumentException("Subscription can not be null");
        }
        this.f43088f.m40415b(interfaceC11246k);
    }

    @Override // p456rx.InterfaceC11246k
    public boolean isUnsubscribed() {
        return this.f43088f.isUnsubscribed();
    }

    @Override // p456rx.InterfaceC11246k
    public void unsubscribe() {
        this.f43088f.unsubscribe();
    }
}
