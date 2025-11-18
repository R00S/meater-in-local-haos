package io.sentry;

import io.sentry.util.C9646q;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: Stack.java */
/* renamed from: io.sentry.k5 */
/* loaded from: classes2.dex */
final class C9500k5 {

    /* renamed from: a */
    private final Deque<a> f36409a;

    /* renamed from: b */
    private final InterfaceC9670w1 f36410b;

    public C9500k5(InterfaceC9670w1 interfaceC9670w1, a aVar) {
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        this.f36409a = linkedBlockingDeque;
        this.f36410b = (InterfaceC9670w1) C9646q.m31802c(interfaceC9670w1, "logger is required");
        linkedBlockingDeque.push((a) C9646q.m31802c(aVar, "rootStackItem is required"));
    }

    /* renamed from: a */
    a m30923a() {
        return this.f36409a.peek();
    }

    /* renamed from: b */
    void m30924b(a aVar) {
        this.f36409a.push(aVar);
    }

    /* compiled from: Stack.java */
    /* renamed from: io.sentry.k5$a */
    static final class a {

        /* renamed from: a */
        private final C9680x4 f36411a;

        /* renamed from: b */
        private volatile InterfaceC9245a2 f36412b;

        /* renamed from: c */
        private volatile C9586s3 f36413c;

        a(C9680x4 c9680x4, InterfaceC9245a2 interfaceC9245a2, C9586s3 c9586s3) {
            this.f36412b = (InterfaceC9245a2) C9646q.m31802c(interfaceC9245a2, "ISentryClient is required.");
            this.f36413c = (C9586s3) C9646q.m31802c(c9586s3, "Scope is required.");
            this.f36411a = (C9680x4) C9646q.m31802c(c9680x4, "Options is required");
        }

        /* renamed from: a */
        public InterfaceC9245a2 m30925a() {
            return this.f36412b;
        }

        /* renamed from: b */
        public C9680x4 m30926b() {
            return this.f36411a;
        }

        /* renamed from: c */
        public C9586s3 m30927c() {
            return this.f36413c;
        }

        a(a aVar) {
            this.f36411a = aVar.f36411a;
            this.f36412b = aVar.f36412b;
            this.f36413c = new C9586s3(aVar.f36413c);
        }
    }

    public C9500k5(C9500k5 c9500k5) {
        this(c9500k5.f36410b, new a(c9500k5.f36409a.getLast()));
        Iterator<a> itDescendingIterator = c9500k5.f36409a.descendingIterator();
        if (itDescendingIterator.hasNext()) {
            itDescendingIterator.next();
        }
        while (itDescendingIterator.hasNext()) {
            m30924b(new a(itDescendingIterator.next()));
        }
    }
}
