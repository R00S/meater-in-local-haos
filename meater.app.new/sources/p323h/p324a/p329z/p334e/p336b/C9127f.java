package p323h.p324a.p329z.p334e.p336b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.AbstractC9071h;
import p323h.p324a.InterfaceC9072i;
import p323h.p324a.p329z.p343i.EnumC9175b;
import p323h.p324a.p329z.p344j.C9177b;
import p355k.p356a.InterfaceC9729b;
import p355k.p356a.InterfaceC9730c;

/* compiled from: FlowableOnBackpressureLatest.java */
/* renamed from: h.a.z.e.b.f */
/* loaded from: classes2.dex */
public final class C9127f<T> extends AbstractC9122a<T, T> {

    /* compiled from: FlowableOnBackpressureLatest.java */
    /* renamed from: h.a.z.e.b.f$a */
    static final class a<T> extends AtomicInteger implements InterfaceC9072i<T>, InterfaceC9730c {

        /* renamed from: f */
        final InterfaceC9729b<? super T> f34999f;

        /* renamed from: g */
        InterfaceC9730c f35000g;

        /* renamed from: h */
        volatile boolean f35001h;

        /* renamed from: i */
        Throwable f35002i;

        /* renamed from: j */
        volatile boolean f35003j;

        /* renamed from: k */
        final AtomicLong f35004k = new AtomicLong();

        /* renamed from: l */
        final AtomicReference<T> f35005l = new AtomicReference<>();

        a(InterfaceC9729b<? super T> interfaceC9729b) {
            this.f34999f = interfaceC9729b;
        }

        @Override // p355k.p356a.InterfaceC9729b
        /* renamed from: a */
        public void mo29121a() {
            this.f35001h = true;
            m29280d();
        }

        @Override // p355k.p356a.InterfaceC9729b
        /* renamed from: b */
        public void mo29122b(InterfaceC9730c interfaceC9730c) {
            if (EnumC9175b.m29383y(this.f35000g, interfaceC9730c)) {
                this.f35000g = interfaceC9730c;
                this.f34999f.mo29122b(this);
                interfaceC9730c.request(Long.MAX_VALUE);
            }
        }

        /* renamed from: c */
        boolean m29279c(boolean z, boolean z2, InterfaceC9729b<?> interfaceC9729b, AtomicReference<T> atomicReference) {
            if (this.f35003j) {
                atomicReference.lazySet(null);
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.f35002i;
            if (th != null) {
                atomicReference.lazySet(null);
                interfaceC9729b.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            interfaceC9729b.mo29121a();
            return true;
        }

        @Override // p355k.p356a.InterfaceC9730c
        public void cancel() {
            if (this.f35003j) {
                return;
            }
            this.f35003j = true;
            this.f35000g.cancel();
            if (getAndIncrement() == 0) {
                this.f35005l.lazySet(null);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
        
            if (r7 != r1.get()) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
        
            r9 = r13.f35001h;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
        
            if (r2.get() != null) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
        
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
        
            if (m29279c(r9, r11, r0, r2) == false) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
        
            if (r7 == 0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
        
            p323h.p324a.p329z.p344j.C9177b.m29388c(r1, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
        
            r4 = addAndGet(-r4);
         */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void m29280d() {
            /*
                r13 = this;
                int r0 = r13.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                k.a.b<? super T> r0 = r13.f34999f
                java.util.concurrent.atomic.AtomicLong r1 = r13.f35004k
                java.util.concurrent.atomic.AtomicReference<T> r2 = r13.f35005l
                r3 = 1
                r4 = 1
            Lf:
                r5 = 0
                r7 = r5
            L12:
                long r9 = r1.get()
                r11 = 0
                int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r12 == 0) goto L38
                boolean r9 = r13.f35001h
                r10 = 0
                java.lang.Object r10 = r2.getAndSet(r10)
                if (r10 != 0) goto L26
                r12 = 1
                goto L27
            L26:
                r12 = 0
            L27:
                boolean r9 = r13.m29279c(r9, r12, r0, r2)
                if (r9 == 0) goto L2e
                return
            L2e:
                if (r12 == 0) goto L31
                goto L38
            L31:
                r0.onNext(r10)
                r9 = 1
                long r7 = r7 + r9
                goto L12
            L38:
                long r9 = r1.get()
                int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r12 != 0) goto L50
                boolean r9 = r13.f35001h
                java.lang.Object r10 = r2.get()
                if (r10 != 0) goto L49
                r11 = 1
            L49:
                boolean r9 = r13.m29279c(r9, r11, r0, r2)
                if (r9 == 0) goto L50
                return
            L50:
                int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r9 == 0) goto L57
                p323h.p324a.p329z.p344j.C9177b.m29388c(r1, r7)
            L57:
                int r4 = -r4
                int r4 = r13.addAndGet(r4)
                if (r4 != 0) goto Lf
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p323h.p324a.p329z.p334e.p336b.C9127f.a.m29280d():void");
        }

        @Override // p355k.p356a.InterfaceC9729b
        public void onError(Throwable th) {
            this.f35002i = th;
            this.f35001h = true;
            m29280d();
        }

        @Override // p355k.p356a.InterfaceC9729b
        public void onNext(T t) {
            this.f35005l.lazySet(t);
            m29280d();
        }

        @Override // p355k.p356a.InterfaceC9730c
        public void request(long j2) {
            if (EnumC9175b.m29382x(j2)) {
                C9177b.m29386a(this.f35004k, j2);
                m29280d();
            }
        }
    }

    public C9127f(AbstractC9071h<T> abstractC9071h) {
        super(abstractC9071h);
    }

    @Override // p323h.p324a.AbstractC9071h
    /* renamed from: i */
    protected void mo29179i(InterfaceC9729b<? super T> interfaceC9729b) {
        this.f34973b.m29178h(new a(interfaceC9729b));
    }
}
