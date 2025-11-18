package p456rx;

import p456rx.p461n.p466e.C11363l;

/* compiled from: SingleSubscriber.java */
/* renamed from: rx.i */
/* loaded from: classes3.dex */
public abstract class AbstractC11244i<T> implements InterfaceC11246k {

    /* renamed from: f */
    private final C11363l f42137f = new C11363l();

    /* renamed from: b */
    public final void m40149b(InterfaceC11246k interfaceC11246k) {
        this.f42137f.m40464a(interfaceC11246k);
    }

    /* renamed from: c */
    public abstract void mo29130c(T t);

    @Override // p456rx.InterfaceC11246k
    public final boolean isUnsubscribed() {
        return this.f42137f.isUnsubscribed();
    }

    public abstract void onError(Throwable th);

    @Override // p456rx.InterfaceC11246k
    public final void unsubscribe() {
        this.f42137f.unsubscribe();
    }
}
