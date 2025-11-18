package p456rx.p461n.p466e.p468o;

import p456rx.p461n.p466e.p467n.C11367c;

/* compiled from: BaseLinkedQueue.java */
/* renamed from: rx.n.e.o.e */
/* loaded from: classes3.dex */
abstract class AbstractC11377e<E> extends AbstractC11375c<E> {

    /* renamed from: f */
    protected static final long f42963f = C11398z.m40547a(AbstractC11377e.class, "producerNode");
    protected C11367c<E> producerNode;

    AbstractC11377e() {
    }

    /* renamed from: c */
    protected final C11367c<E> m40526c() {
        return (C11367c) C11398z.f42976a.getObjectVolatile(this, f42963f);
    }
}
