package p456rx.p470p;

import p456rx.InterfaceC11232c;
import p456rx.InterfaceC11246k;
import p456rx.exceptions.C11240a;
import p456rx.exceptions.CompositeException;
import p456rx.exceptions.OnCompletedFailedException;
import p456rx.exceptions.OnErrorFailedException;
import p456rx.p471q.C11409c;

/* compiled from: SafeCompletableSubscriber.java */
/* renamed from: rx.p.b */
/* loaded from: classes3.dex */
public final class C11402b implements InterfaceC11232c, InterfaceC11246k {

    /* renamed from: f */
    final InterfaceC11232c f42987f;

    /* renamed from: g */
    InterfaceC11246k f42988g;

    /* renamed from: h */
    boolean f42989h;

    public C11402b(InterfaceC11232c interfaceC11232c) {
        this.f42987f = interfaceC11232c;
    }

    @Override // p456rx.InterfaceC11232c
    /* renamed from: a */
    public void mo29114a(InterfaceC11246k interfaceC11246k) {
        this.f42988g = interfaceC11246k;
        try {
            this.f42987f.mo29114a(this);
        } catch (Throwable th) {
            C11240a.m40140e(th);
            interfaceC11246k.unsubscribe();
            onError(th);
        }
    }

    @Override // p456rx.InterfaceC11246k
    public boolean isUnsubscribed() {
        return this.f42989h || this.f42988g.isUnsubscribed();
    }

    @Override // p456rx.InterfaceC11232c
    public void onCompleted() {
        if (this.f42989h) {
            return;
        }
        this.f42989h = true;
        try {
            this.f42987f.onCompleted();
        } catch (Throwable th) {
            C11240a.m40140e(th);
            throw new OnCompletedFailedException(th);
        }
    }

    @Override // p456rx.InterfaceC11232c
    public void onError(Throwable th) {
        if (this.f42989h) {
            C11409c.m40578j(th);
            return;
        }
        this.f42989h = true;
        try {
            this.f42987f.onError(th);
        } catch (Throwable th2) {
            C11240a.m40140e(th2);
            throw new OnErrorFailedException(new CompositeException(th, th2));
        }
    }

    @Override // p456rx.InterfaceC11246k
    public void unsubscribe() {
        this.f42988g.unsubscribe();
    }
}
