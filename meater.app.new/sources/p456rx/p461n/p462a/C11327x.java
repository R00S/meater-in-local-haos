package p456rx.p461n.p462a;

import java.util.concurrent.atomic.AtomicLong;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.InterfaceC11242g;

/* compiled from: OnSubscribeRange.java */
/* renamed from: rx.n.a.x */
/* loaded from: classes3.dex */
public final class C11327x implements C11234e.a<Integer> {

    /* renamed from: f */
    private final int f42656f;

    /* renamed from: g */
    private final int f42657g;

    /* compiled from: OnSubscribeRange.java */
    /* renamed from: rx.n.a.x$a */
    static final class a extends AtomicLong implements InterfaceC11242g {

        /* renamed from: f */
        private final AbstractC11245j<? super Integer> f42658f;

        /* renamed from: g */
        private final int f42659g;

        /* renamed from: h */
        private long f42660h;

        a(AbstractC11245j<? super Integer> abstractC11245j, int i2, int i3) {
            this.f42658f = abstractC11245j;
            this.f42660h = i2;
            this.f42659g = i3;
        }

        /* renamed from: a */
        void m40351a() {
            long j2 = this.f42659g + 1;
            AbstractC11245j<? super Integer> abstractC11245j = this.f42658f;
            for (long j3 = this.f42660h; j3 != j2; j3++) {
                if (abstractC11245j.isUnsubscribed()) {
                    return;
                }
                abstractC11245j.onNext(Integer.valueOf((int) j3));
            }
            if (abstractC11245j.isUnsubscribed()) {
                return;
            }
            abstractC11245j.onCompleted();
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
        
            r12.f42660h = r4;
            r13 = addAndGet(-r9);
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void m40352b(long r13) {
            /*
                r12 = this;
                int r0 = r12.f42659g
                long r0 = (long) r0
                r2 = 1
                long r0 = r0 + r2
                long r4 = r12.f42660h
                rx.j<? super java.lang.Integer> r6 = r12.f42658f
                r7 = 0
            Lc:
                r9 = r7
            Ld:
                int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
                if (r11 == 0) goto L27
                int r11 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r11 == 0) goto L27
                boolean r11 = r6.isUnsubscribed()
                if (r11 == 0) goto L1c
                return
            L1c:
                int r11 = (int) r4
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r6.onNext(r11)
                long r4 = r4 + r2
                long r9 = r9 + r2
                goto Ld
            L27:
                boolean r13 = r6.isUnsubscribed()
                if (r13 == 0) goto L2e
                return
            L2e:
                int r13 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r13 != 0) goto L36
                r6.onCompleted()
                return
            L36:
                long r13 = r12.get()
                int r11 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
                if (r11 != 0) goto Ld
                r12.f42660h = r4
                long r13 = -r9
                long r13 = r12.addAndGet(r13)
                int r9 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
                if (r9 != 0) goto Lc
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p456rx.p461n.p462a.C11327x.a.m40352b(long):void");
        }

        @Override // p456rx.InterfaceC11242g
        public void request(long j2) {
            if (get() == Long.MAX_VALUE) {
                return;
            }
            if (j2 == Long.MAX_VALUE && compareAndSet(0L, Long.MAX_VALUE)) {
                m40351a();
            } else {
                if (j2 <= 0 || C11261a.m40162b(this, j2) != 0) {
                    return;
                }
                m40352b(j2);
            }
        }
    }

    public C11327x(int i2, int i3) {
        this.f42656f = i2;
        this.f42657g = i3;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super Integer> abstractC11245j) {
        abstractC11245j.setProducer(new a(abstractC11245j, this.f42656f, this.f42657g));
    }
}
