package p456rx.p461n.p462a;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import p456rx.C11231b;
import p456rx.InterfaceC11232c;
import p456rx.InterfaceC11246k;
import p456rx.p474t.C11426b;

/* compiled from: CompletableOnSubscribeMergeDelayErrorArray.java */
/* renamed from: rx.n.a.f */
/* loaded from: classes3.dex */
public final class C11276f implements C11231b.w {

    /* renamed from: f */
    final C11231b[] f42260f;

    /* compiled from: CompletableOnSubscribeMergeDelayErrorArray.java */
    /* renamed from: rx.n.a.f$a */
    class a implements InterfaceC11232c {

        /* renamed from: f */
        final /* synthetic */ C11426b f42261f;

        /* renamed from: g */
        final /* synthetic */ Queue f42262g;

        /* renamed from: h */
        final /* synthetic */ AtomicInteger f42263h;

        /* renamed from: i */
        final /* synthetic */ InterfaceC11232c f42264i;

        a(C11426b c11426b, Queue queue, AtomicInteger atomicInteger, InterfaceC11232c interfaceC11232c) {
            this.f42261f = c11426b;
            this.f42262g = queue;
            this.f42263h = atomicInteger;
            this.f42264i = interfaceC11232c;
        }

        @Override // p456rx.InterfaceC11232c
        /* renamed from: a */
        public void mo29114a(InterfaceC11246k interfaceC11246k) {
            this.f42261f.m40667a(interfaceC11246k);
        }

        /* renamed from: b */
        void m40204b() {
            if (this.f42263h.decrementAndGet() == 0) {
                if (this.f42262g.isEmpty()) {
                    this.f42264i.onCompleted();
                } else {
                    this.f42264i.onError(C11273e.m40197a(this.f42262g));
                }
            }
        }

        @Override // p456rx.InterfaceC11232c
        public void onCompleted() {
            m40204b();
        }

        @Override // p456rx.InterfaceC11232c
        public void onError(Throwable th) {
            this.f42262g.offer(th);
            m40204b();
        }
    }

    public C11276f(C11231b[] c11231bArr) {
        this.f42260f = c11231bArr;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(InterfaceC11232c interfaceC11232c) {
        C11426b c11426b = new C11426b();
        AtomicInteger atomicInteger = new AtomicInteger(this.f42260f.length + 1);
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        interfaceC11232c.mo29114a(c11426b);
        for (C11231b c11231b : this.f42260f) {
            if (c11426b.isUnsubscribed()) {
                return;
            }
            if (c11231b == null) {
                concurrentLinkedQueue.offer(new NullPointerException("A completable source is null"));
                atomicInteger.decrementAndGet();
            } else {
                c11231b.m39971P(new a(c11426b, concurrentLinkedQueue, atomicInteger, interfaceC11232c));
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            if (concurrentLinkedQueue.isEmpty()) {
                interfaceC11232c.onCompleted();
            } else {
                interfaceC11232c.onError(C11273e.m40197a(concurrentLinkedQueue));
            }
        }
    }
}
