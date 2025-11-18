package p456rx.p461n.p466e.p468o;

import p456rx.p461n.p466e.p467n.C11367c;

/* compiled from: BaseLinkedQueue.java */
/* renamed from: rx.n.e.o.b */
/* loaded from: classes3.dex */
abstract class AbstractC11374b<E> extends AbstractC11376d<E> {

    /* renamed from: g */
    protected static final long f42962g = C11398z.m40547a(AbstractC11374b.class, "consumerNode");
    protected C11367c<E> consumerNode;

    AbstractC11374b() {
    }

    /* renamed from: f */
    protected final C11367c<E> m40523f() {
        return this.consumerNode;
    }

    /* renamed from: g */
    protected final C11367c<E> m40524g() {
        return (C11367c) C11398z.f42976a.getObjectVolatile(this, f42962g);
    }

    /* renamed from: h */
    protected final void m40525h(C11367c<E> c11367c) {
        this.consumerNode = c11367c;
    }
}
