package p456rx.p461n.p464c;

import java.util.concurrent.ThreadFactory;
import p456rx.AbstractC11243h;

/* compiled from: NewThreadScheduler.java */
/* renamed from: rx.n.c.g */
/* loaded from: classes3.dex */
public final class C11342g extends AbstractC11243h {

    /* renamed from: a */
    private final ThreadFactory f42798a;

    public C11342g(ThreadFactory threadFactory) {
        this.f42798a = threadFactory;
    }

    @Override // p456rx.AbstractC11243h
    public AbstractC11243h.a createWorker() {
        return new C11343h(this.f42798a);
    }
}
