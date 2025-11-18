package p456rx;

import p456rx.p461n.p466e.C11363l;

/* compiled from: Subscriber.java */
/* renamed from: rx.j */
/* loaded from: classes3.dex */
public abstract class AbstractC11245j<T> implements InterfaceC11241f<T>, InterfaceC11246k {
    private static final long NOT_SET = Long.MIN_VALUE;
    private InterfaceC11242g producer;
    private long requested;
    private final AbstractC11245j<?> subscriber;
    private final C11363l subscriptions;

    protected AbstractC11245j() {
        this(null, false);
    }

    private void addToRequested(long j2) {
        long j3 = this.requested;
        if (j3 == NOT_SET) {
            this.requested = j2;
            return;
        }
        long j4 = j3 + j2;
        if (j4 < 0) {
            this.requested = Long.MAX_VALUE;
        } else {
            this.requested = j4;
        }
    }

    public final void add(InterfaceC11246k interfaceC11246k) {
        this.subscriptions.m40464a(interfaceC11246k);
    }

    @Override // p456rx.InterfaceC11246k
    public final boolean isUnsubscribed() {
        return this.subscriptions.isUnsubscribed();
    }

    public void onStart() {
    }

    protected final void request(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException("number requested cannot be negative: " + j2);
        }
        synchronized (this) {
            InterfaceC11242g interfaceC11242g = this.producer;
            if (interfaceC11242g != null) {
                interfaceC11242g.request(j2);
            } else {
                addToRequested(j2);
            }
        }
    }

    public void setProducer(InterfaceC11242g interfaceC11242g) {
        long j2;
        AbstractC11245j<?> abstractC11245j;
        boolean z;
        synchronized (this) {
            j2 = this.requested;
            this.producer = interfaceC11242g;
            abstractC11245j = this.subscriber;
            z = abstractC11245j != null && j2 == NOT_SET;
        }
        if (z) {
            abstractC11245j.setProducer(interfaceC11242g);
        } else if (j2 == NOT_SET) {
            interfaceC11242g.request(Long.MAX_VALUE);
        } else {
            interfaceC11242g.request(j2);
        }
    }

    @Override // p456rx.InterfaceC11246k
    public final void unsubscribe() {
        this.subscriptions.unsubscribe();
    }

    protected AbstractC11245j(AbstractC11245j<?> abstractC11245j) {
        this(abstractC11245j, true);
    }

    protected AbstractC11245j(AbstractC11245j<?> abstractC11245j, boolean z) {
        this.requested = NOT_SET;
        this.subscriber = abstractC11245j;
        this.subscriptions = (!z || abstractC11245j == null) ? new C11363l() : abstractC11245j.subscriptions;
    }
}
