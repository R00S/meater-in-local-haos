package p456rx.p461n.p462a;

import java.util.concurrent.atomic.AtomicLong;
import p000.C0000a;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.InterfaceC11242g;

/* compiled from: OnSubscribeFromArray.java */
/* renamed from: rx.n.a.s */
/* loaded from: classes3.dex */
public final class C11315s<T> implements C11234e.a<T> {

    /* renamed from: f */
    final T[] f42580f;

    /* compiled from: OnSubscribeFromArray.java */
    /* renamed from: rx.n.a.s$a */
    static final class a<T> extends AtomicLong implements InterfaceC11242g {

        /* renamed from: f */
        final AbstractC11245j<? super T> f42581f;

        /* renamed from: g */
        final T[] f42582g;

        /* renamed from: h */
        int f42583h;

        public a(AbstractC11245j<? super T> abstractC11245j, T[] tArr) {
            this.f42581f = abstractC11245j;
            this.f42582g = tArr;
        }

        /* renamed from: a */
        void m40316a() {
            AbstractC11245j<? super T> abstractC11245j = this.f42581f;
            for (C0000a c0000a : this.f42582g) {
                if (abstractC11245j.isUnsubscribed()) {
                    return;
                }
                abstractC11245j.onNext(c0000a);
            }
            if (abstractC11245j.isUnsubscribed()) {
                return;
            }
            abstractC11245j.onCompleted();
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
        
            r10.f42583h = r3;
            r11 = addAndGet(r6);
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void m40317b(long r11) {
            /*
                r10 = this;
                rx.j<? super T> r0 = r10.f42581f
                T[] r1 = r10.f42582g
                int r2 = r1.length
                int r3 = r10.f42583h
                r4 = 0
            L9:
                r6 = r4
            La:
                int r8 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r8 == 0) goto L2f
                if (r3 == r2) goto L2f
                boolean r8 = r0.isUnsubscribed()
                if (r8 == 0) goto L17
                return
            L17:
                r8 = r1[r3]
                r0.onNext(r8)
                int r3 = r3 + 1
                if (r3 != r2) goto L2a
                boolean r11 = r0.isUnsubscribed()
                if (r11 != 0) goto L29
                r0.onCompleted()
            L29:
                return
            L2a:
                r8 = 1
                long r11 = r11 - r8
                long r6 = r6 - r8
                goto La
            L2f:
                long r11 = r10.get()
                long r11 = r11 + r6
                int r8 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r8 != 0) goto La
                r10.f42583h = r3
                long r11 = r10.addAndGet(r6)
                int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r6 != 0) goto L9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p456rx.p461n.p462a.C11315s.a.m40317b(long):void");
        }

        @Override // p456rx.InterfaceC11242g
        public void request(long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j2);
            }
            if (j2 == Long.MAX_VALUE) {
                if (C11261a.m40162b(this, j2) == 0) {
                    m40316a();
                }
            } else {
                if (j2 == 0 || C11261a.m40162b(this, j2) != 0) {
                    return;
                }
                m40317b(j2);
            }
        }
    }

    public C11315s(T[] tArr) {
        this.f42580f = tArr;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super T> abstractC11245j) {
        abstractC11245j.setProducer(new a(abstractC11245j, this.f42580f));
    }
}
