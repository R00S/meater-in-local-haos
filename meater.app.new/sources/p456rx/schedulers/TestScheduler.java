package p456rx.schedulers;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import p456rx.AbstractC11243h;
import p456rx.InterfaceC11246k;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p461n.p464c.C11344i;
import p456rx.p474t.C11425a;
import p456rx.p474t.C11429e;

/* loaded from: classes3.dex */
public class TestScheduler extends AbstractC11243h {

    /* renamed from: a */
    static long f43071a;

    /* renamed from: b */
    final Queue<C11424c> f43072b = new PriorityQueue(11, new C11422a());

    /* renamed from: c */
    long f43073c;

    /* renamed from: rx.schedulers.TestScheduler$a */
    static final class C11422a implements Comparator<C11424c> {
        C11422a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C11424c c11424c, C11424c c11424c2) {
            long j2 = c11424c.f43080a;
            long j3 = c11424c2.f43080a;
            if (j2 == j3) {
                if (c11424c.f43083d < c11424c2.f43083d) {
                    return -1;
                }
                return c11424c.f43083d > c11424c2.f43083d ? 1 : 0;
            }
            if (j2 < j3) {
                return -1;
            }
            return j2 > j3 ? 1 : 0;
        }
    }

    /* renamed from: rx.schedulers.TestScheduler$b */
    final class C11423b extends AbstractC11243h.a implements C11344i.b {

        /* renamed from: f */
        private final C11425a f43074f = new C11425a();

        /* renamed from: rx.schedulers.TestScheduler$b$a */
        class a implements InterfaceC11252a {

            /* renamed from: f */
            final /* synthetic */ C11424c f43076f;

            a(C11424c c11424c) {
                this.f43076f = c11424c;
            }

            @Override // p456rx.p460m.InterfaceC11252a
            public void call() {
                TestScheduler.this.f43072b.remove(this.f43076f);
            }
        }

        /* renamed from: rx.schedulers.TestScheduler$b$b */
        class b implements InterfaceC11252a {

            /* renamed from: f */
            final /* synthetic */ C11424c f43078f;

            b(C11424c c11424c) {
                this.f43078f = c11424c;
            }

            @Override // p456rx.p460m.InterfaceC11252a
            public void call() {
                TestScheduler.this.f43072b.remove(this.f43078f);
            }
        }

        C11423b() {
        }

        @Override // p456rx.p461n.p464c.C11344i.b
        /* renamed from: a */
        public long mo40401a() {
            return TestScheduler.this.f43073c;
        }

        @Override // p456rx.AbstractC11243h.a
        /* renamed from: b */
        public long mo40145b() {
            return TestScheduler.this.now();
        }

        @Override // p456rx.AbstractC11243h.a
        /* renamed from: c */
        public InterfaceC11246k mo40146c(InterfaceC11252a interfaceC11252a) {
            C11424c c11424c = new C11424c(this, 0L, interfaceC11252a);
            TestScheduler.this.f43072b.add(c11424c);
            return C11429e.m40674a(new b(c11424c));
        }

        @Override // p456rx.AbstractC11243h.a
        /* renamed from: d */
        public InterfaceC11246k mo40147d(InterfaceC11252a interfaceC11252a, long j2, TimeUnit timeUnit) {
            C11424c c11424c = new C11424c(this, TestScheduler.this.f43073c + timeUnit.toNanos(j2), interfaceC11252a);
            TestScheduler.this.f43072b.add(c11424c);
            return C11429e.m40674a(new a(c11424c));
        }

        @Override // p456rx.AbstractC11243h.a
        /* renamed from: e */
        public InterfaceC11246k mo40148e(InterfaceC11252a interfaceC11252a, long j2, long j3, TimeUnit timeUnit) {
            return C11344i.m40400a(this, interfaceC11252a, j2, j3, timeUnit, this);
        }

        @Override // p456rx.InterfaceC11246k
        public boolean isUnsubscribed() {
            return this.f43074f.isUnsubscribed();
        }

        @Override // p456rx.InterfaceC11246k
        public void unsubscribe() {
            this.f43074f.unsubscribe();
        }
    }

    /* renamed from: rx.schedulers.TestScheduler$c */
    static final class C11424c {

        /* renamed from: a */
        final long f43080a;

        /* renamed from: b */
        final InterfaceC11252a f43081b;

        /* renamed from: c */
        final AbstractC11243h.a f43082c;

        /* renamed from: d */
        private final long f43083d;

        C11424c(AbstractC11243h.a aVar, long j2, InterfaceC11252a interfaceC11252a) {
            long j3 = TestScheduler.f43071a;
            TestScheduler.f43071a = 1 + j3;
            this.f43083d = j3;
            this.f43080a = j2;
            this.f43081b = interfaceC11252a;
            this.f43082c = aVar;
        }

        public String toString() {
            return String.format("TimedAction(time = %d, action = %s)", Long.valueOf(this.f43080a), this.f43081b.toString());
        }
    }

    /* renamed from: a */
    private void m40661a(long j2) {
        while (!this.f43072b.isEmpty()) {
            C11424c c11424cPeek = this.f43072b.peek();
            long j3 = c11424cPeek.f43080a;
            if (j3 > j2) {
                break;
            }
            if (j3 == 0) {
                j3 = this.f43073c;
            }
            this.f43073c = j3;
            this.f43072b.remove();
            if (!c11424cPeek.f43082c.isUnsubscribed()) {
                c11424cPeek.f43081b.call();
            }
        }
        this.f43073c = j2;
    }

    public void advanceTimeBy(long j2, TimeUnit timeUnit) {
        advanceTimeTo(this.f43073c + timeUnit.toNanos(j2), TimeUnit.NANOSECONDS);
    }

    public void advanceTimeTo(long j2, TimeUnit timeUnit) {
        m40661a(timeUnit.toNanos(j2));
    }

    @Override // p456rx.AbstractC11243h
    public AbstractC11243h.a createWorker() {
        return new C11423b();
    }

    @Override // p456rx.AbstractC11243h
    public long now() {
        return TimeUnit.NANOSECONDS.toMillis(this.f43073c);
    }

    public void triggerActions() {
        m40661a(this.f43073c);
    }
}
