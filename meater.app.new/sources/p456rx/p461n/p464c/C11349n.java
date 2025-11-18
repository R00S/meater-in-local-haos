package p456rx.p461n.p464c;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p456rx.AbstractC11243h;
import p456rx.InterfaceC11246k;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p474t.C11425a;
import p456rx.p474t.C11429e;

/* compiled from: TrampolineScheduler.java */
/* renamed from: rx.n.c.n */
/* loaded from: classes3.dex */
public final class C11349n extends AbstractC11243h {

    /* renamed from: a */
    public static final C11349n f42848a = new C11349n();

    /* compiled from: TrampolineScheduler.java */
    /* renamed from: rx.n.c.n$a */
    static final class a extends AbstractC11243h.a implements InterfaceC11246k {

        /* renamed from: f */
        final AtomicInteger f42849f = new AtomicInteger();

        /* renamed from: g */
        final PriorityBlockingQueue<b> f42850g = new PriorityBlockingQueue<>();

        /* renamed from: h */
        private final C11425a f42851h = new C11425a();

        /* renamed from: i */
        private final AtomicInteger f42852i = new AtomicInteger();

        /* compiled from: TrampolineScheduler.java */
        /* renamed from: rx.n.c.n$a$a, reason: collision with other inner class name */
        class C11612a implements InterfaceC11252a {

            /* renamed from: f */
            final /* synthetic */ b f42853f;

            C11612a(b bVar) {
                this.f42853f = bVar;
            }

            @Override // p456rx.p460m.InterfaceC11252a
            public void call() {
                a.this.f42850g.remove(this.f42853f);
            }
        }

        a() {
        }

        /* renamed from: f */
        private InterfaceC11246k m40412f(InterfaceC11252a interfaceC11252a, long j2) {
            if (this.f42851h.isUnsubscribed()) {
                return C11429e.m40676c();
            }
            b bVar = new b(interfaceC11252a, Long.valueOf(j2), this.f42849f.incrementAndGet());
            this.f42850g.add(bVar);
            if (this.f42852i.getAndIncrement() != 0) {
                return C11429e.m40674a(new C11612a(bVar));
            }
            do {
                b bVarPoll = this.f42850g.poll();
                if (bVarPoll != null) {
                    bVarPoll.f42855f.call();
                }
            } while (this.f42852i.decrementAndGet() > 0);
            return C11429e.m40676c();
        }

        @Override // p456rx.AbstractC11243h.a
        /* renamed from: c */
        public InterfaceC11246k mo40146c(InterfaceC11252a interfaceC11252a) {
            return m40412f(interfaceC11252a, mo40145b());
        }

        @Override // p456rx.AbstractC11243h.a
        /* renamed from: d */
        public InterfaceC11246k mo40147d(InterfaceC11252a interfaceC11252a, long j2, TimeUnit timeUnit) {
            long jMo40145b = mo40145b() + timeUnit.toMillis(j2);
            return m40412f(new C11348m(interfaceC11252a, this, jMo40145b), jMo40145b);
        }

        @Override // p456rx.InterfaceC11246k
        public boolean isUnsubscribed() {
            return this.f42851h.isUnsubscribed();
        }

        @Override // p456rx.InterfaceC11246k
        public void unsubscribe() {
            this.f42851h.unsubscribe();
        }
    }

    /* compiled from: TrampolineScheduler.java */
    /* renamed from: rx.n.c.n$b */
    static final class b implements Comparable<b> {

        /* renamed from: f */
        final InterfaceC11252a f42855f;

        /* renamed from: g */
        final Long f42856g;

        /* renamed from: h */
        final int f42857h;

        b(InterfaceC11252a interfaceC11252a, Long l, int i2) {
            this.f42855f = interfaceC11252a;
            this.f42856g = l;
            this.f42857h = i2;
        }

        @Override // java.lang.Comparable
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int iCompareTo = this.f42856g.compareTo(bVar.f42856g);
            return iCompareTo == 0 ? C11349n.m40411a(this.f42857h, bVar.f42857h) : iCompareTo;
        }
    }

    private C11349n() {
    }

    /* renamed from: a */
    static int m40411a(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    @Override // p456rx.AbstractC11243h
    public AbstractC11243h.a createWorker() {
        return new a();
    }
}
