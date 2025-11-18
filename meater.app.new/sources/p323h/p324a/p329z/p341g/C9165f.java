package p323h.p324a.p329z.p341g;

import java.util.concurrent.ThreadFactory;
import p323h.p324a.AbstractC9081r;

/* compiled from: NewThreadScheduler.java */
/* renamed from: h.a.z.g.f */
/* loaded from: classes2.dex */
public final class C9165f extends AbstractC9081r {

    /* renamed from: b */
    private static final ThreadFactoryC9167h f35236b = new ThreadFactoryC9167h("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: c */
    final ThreadFactory f35237c;

    public C9165f() {
        this(f35236b);
    }

    @Override // p323h.p324a.AbstractC9081r
    /* renamed from: a */
    public AbstractC9081r.b mo29220a() {
        return new C9166g(this.f35237c);
    }

    public C9165f(ThreadFactory threadFactory) {
        this.f35237c = threadFactory;
    }
}
