package p456rx.p461n.p462a;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.InterfaceC11242g;
import p456rx.exceptions.C11240a;
import p456rx.exceptions.CompositeException;
import p456rx.exceptions.MissingBackpressureException;
import p456rx.exceptions.OnErrorThrowable;
import p456rx.p461n.p466e.C11359h;
import p456rx.p461n.p466e.C11361j;
import p456rx.p461n.p466e.p467n.C11369e;
import p456rx.p461n.p466e.p467n.C11370f;
import p456rx.p461n.p466e.p467n.C11372h;
import p456rx.p461n.p466e.p468o.C11382j;
import p456rx.p461n.p466e.p468o.C11391s;
import p456rx.p461n.p466e.p468o.C11398z;
import p456rx.p474t.C11426b;

/* compiled from: OperatorMerge.java */
/* renamed from: rx.n.a.q0 */
/* loaded from: classes3.dex */
public final class C11310q0<T> implements C11234e.b<T, C11234e<? extends T>> {

    /* renamed from: f */
    final boolean f42508f;

    /* renamed from: g */
    final int f42509g;

    /* compiled from: OperatorMerge.java */
    /* renamed from: rx.n.a.q0$a */
    static final class a {

        /* renamed from: a */
        static final C11310q0<Object> f42510a = new C11310q0<>(true, Integer.MAX_VALUE);
    }

    /* compiled from: OperatorMerge.java */
    /* renamed from: rx.n.a.q0$b */
    static final class b {

        /* renamed from: a */
        static final C11310q0<Object> f42511a = new C11310q0<>(false, Integer.MAX_VALUE);
    }

    /* compiled from: OperatorMerge.java */
    /* renamed from: rx.n.a.q0$c */
    static final class c<T> extends AbstractC11245j<T> {

        /* renamed from: f */
        static final int f42512f = C11359h.f42884f / 4;

        /* renamed from: g */
        final e<T> f42513g;

        /* renamed from: h */
        final long f42514h;

        /* renamed from: i */
        volatile boolean f42515i;

        /* renamed from: j */
        volatile C11359h f42516j;

        /* renamed from: k */
        int f42517k;

        public c(e<T> eVar, long j2) {
            this.f42513g = eVar;
            this.f42514h = j2;
        }

        /* renamed from: c */
        public void m40282c(long j2) {
            int i2 = this.f42517k - ((int) j2);
            if (i2 > f42512f) {
                this.f42517k = i2;
                return;
            }
            int i3 = C11359h.f42884f;
            this.f42517k = i3;
            int i4 = i3 - i2;
            if (i4 > 0) {
                request(i4);
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() throws Throwable {
            this.f42515i = true;
            this.f42513g.m40287e();
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) throws Throwable {
            this.f42513g.m40293k().offer(th);
            this.f42515i = true;
            this.f42513g.m40287e();
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) throws Throwable {
            this.f42513g.m40300s(this, t);
        }

        @Override // p456rx.AbstractC11245j
        public void onStart() {
            int i2 = C11359h.f42884f;
            this.f42517k = i2;
            request(i2);
        }
    }

    /* compiled from: OperatorMerge.java */
    /* renamed from: rx.n.a.q0$d */
    static final class d<T> extends AtomicLong implements InterfaceC11242g {

        /* renamed from: f */
        final e<T> f42518f;

        public d(e<T> eVar) {
            this.f42518f = eVar;
        }

        /* renamed from: a */
        public long m40283a(int i2) {
            return addAndGet(-i2);
        }

        @Override // p456rx.InterfaceC11242g
        public void request(long j2) throws Throwable {
            if (j2 <= 0) {
                if (j2 < 0) {
                    throw new IllegalArgumentException("n >= 0 required");
                }
            } else {
                if (get() == Long.MAX_VALUE) {
                    return;
                }
                C11261a.m40162b(this, j2);
                this.f42518f.m40287e();
            }
        }
    }

    /* compiled from: OperatorMerge.java */
    /* renamed from: rx.n.a.q0$e */
    static final class e<T> extends AbstractC11245j<C11234e<? extends T>> {

        /* renamed from: f */
        static final c<?>[] f42519f = new c[0];

        /* renamed from: g */
        final AbstractC11245j<? super T> f42520g;

        /* renamed from: h */
        final boolean f42521h;

        /* renamed from: i */
        final int f42522i;

        /* renamed from: j */
        d<T> f42523j;

        /* renamed from: k */
        volatile Queue<Object> f42524k;

        /* renamed from: l */
        volatile C11426b f42525l;

        /* renamed from: m */
        volatile ConcurrentLinkedQueue<Throwable> f42526m;

        /* renamed from: n */
        volatile boolean f42527n;

        /* renamed from: o */
        boolean f42528o;

        /* renamed from: p */
        boolean f42529p;

        /* renamed from: q */
        final Object f42530q = new Object();

        /* renamed from: r */
        volatile c<?>[] f42531r = f42519f;

        /* renamed from: s */
        long f42532s;

        /* renamed from: t */
        long f42533t;

        /* renamed from: u */
        int f42534u;

        /* renamed from: v */
        final int f42535v;

        /* renamed from: w */
        int f42536w;

        public e(AbstractC11245j<? super T> abstractC11245j, boolean z, int i2) {
            this.f42520g = abstractC11245j;
            this.f42521h = z;
            this.f42522i = i2;
            if (i2 == Integer.MAX_VALUE) {
                this.f42535v = Integer.MAX_VALUE;
                request(Long.MAX_VALUE);
            } else {
                this.f42535v = Math.max(1, i2 >> 1);
                request(i2);
            }
        }

        /* renamed from: p */
        private void m40284p() {
            ArrayList arrayList = new ArrayList(this.f42526m);
            if (arrayList.size() == 1) {
                this.f42520g.onError((Throwable) arrayList.get(0));
            } else {
                this.f42520g.onError(new CompositeException(arrayList));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        void m40285c(c<T> cVar) {
            m40292j().m40667a(cVar);
            synchronized (this.f42530q) {
                c<?>[] cVarArr = this.f42531r;
                int length = cVarArr.length;
                c<?>[] cVarArr2 = new c[length + 1];
                System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                cVarArr2[length] = cVar;
                this.f42531r = cVarArr2;
            }
        }

        /* renamed from: d */
        boolean m40286d() {
            if (this.f42520g.isUnsubscribed()) {
                return true;
            }
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = this.f42526m;
            if (this.f42521h || concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
                return false;
            }
            try {
                m40284p();
                return true;
            } finally {
                unsubscribe();
            }
        }

        /* renamed from: e */
        void m40287e() throws Throwable {
            synchronized (this) {
                if (this.f42528o) {
                    this.f42529p = true;
                } else {
                    this.f42528o = true;
                    m40289g();
                }
            }
        }

        /* renamed from: f */
        void m40288f() {
            int i2 = this.f42536w + 1;
            if (i2 != this.f42535v) {
                this.f42536w = i2;
            } else {
                this.f42536w = 0;
                m40298q(i2);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
        
            if (r7 <= 0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0073, code lost:
        
            if (r10 == false) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
        
            r16 = Long.MAX_VALUE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0078, code lost:
        
            r16 = r22.f42523j.m40283a(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0080, code lost:
        
            if (r16 == 0) goto L199;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0082, code lost:
        
            if (r0 != null) goto L45;
         */
        /* JADX WARN: Removed duplicated region for block: B:160:0x019d  */
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void m40289g() throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 424
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p456rx.p461n.p462a.C11310q0.e.m40289g():void");
        }

        /* renamed from: h */
        protected void m40290h(T t, long j2) throws Throwable {
            boolean z = true;
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                try {
                    this.f42520g.onNext(t);
                } catch (Throwable th2) {
                    if (!this.f42521h) {
                        C11240a.m40140e(th2);
                        unsubscribe();
                        onError(th2);
                        return;
                    }
                    m40293k().offer(th2);
                }
                if (j2 != Long.MAX_VALUE) {
                    this.f42523j.m40283a(1);
                }
                int i2 = this.f42536w + 1;
                if (i2 == this.f42535v) {
                    this.f42536w = 0;
                    m40298q(i2);
                } else {
                    this.f42536w = i2;
                }
                synchronized (this) {
                    if (!this.f42529p) {
                        this.f42528o = false;
                    } else {
                        this.f42529p = false;
                        m40289g();
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                z = false;
                if (!z) {
                    synchronized (this) {
                        this.f42528o = false;
                    }
                }
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x004a  */
        /* renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        protected void m40291i(p456rx.p461n.p462a.C11310q0.c<T> r5, T r6, long r7) throws java.lang.Throwable {
            /*
                r4 = this;
                r0 = 1
                r1 = 0
                rx.j<? super T> r2 = r4.f42520g     // Catch: java.lang.Throwable -> L8
                r2.onNext(r6)     // Catch: java.lang.Throwable -> L8
                goto L20
            L8:
                r6 = move-exception
                boolean r2 = r4.f42521h     // Catch: java.lang.Throwable -> L46
                if (r2 != 0) goto L19
                p456rx.exceptions.C11240a.m40140e(r6)     // Catch: java.lang.Throwable -> L46
                r5.unsubscribe()     // Catch: java.lang.Throwable -> L17
                r5.onError(r6)     // Catch: java.lang.Throwable -> L17
                return
            L17:
                r5 = move-exception
                goto L48
            L19:
                java.util.Queue r2 = r4.m40293k()     // Catch: java.lang.Throwable -> L46
                r2.offer(r6)     // Catch: java.lang.Throwable -> L46
            L20:
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r6 == 0) goto L2e
                rx.n.a.q0$d<T> r6 = r4.f42523j     // Catch: java.lang.Throwable -> L46
                r6.m40283a(r0)     // Catch: java.lang.Throwable -> L46
            L2e:
                r6 = 1
                r5.m40282c(r6)     // Catch: java.lang.Throwable -> L46
                monitor-enter(r4)     // Catch: java.lang.Throwable -> L46
                boolean r5 = r4.f42529p     // Catch: java.lang.Throwable -> L43
                if (r5 != 0) goto L3c
                r4.f42528o = r1     // Catch: java.lang.Throwable -> L43
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L43
                return
            L3c:
                r4.f42529p = r1     // Catch: java.lang.Throwable -> L43
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L43
                r4.m40289g()
                return
            L43:
                r5 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L43
                throw r5     // Catch: java.lang.Throwable -> L17
            L46:
                r5 = move-exception
                r0 = 0
            L48:
                if (r0 != 0) goto L52
                monitor-enter(r4)
                r4.f42528o = r1     // Catch: java.lang.Throwable -> L4f
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L4f
                goto L52
            L4f:
                r5 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L4f
                throw r5
            L52:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p456rx.p461n.p462a.C11310q0.e.m40291i(rx.n.a.q0$c, java.lang.Object, long):void");
        }

        /* renamed from: j */
        C11426b m40292j() {
            C11426b c11426b;
            C11426b c11426b2 = this.f42525l;
            if (c11426b2 != null) {
                return c11426b2;
            }
            boolean z = false;
            synchronized (this) {
                c11426b = this.f42525l;
                if (c11426b == null) {
                    C11426b c11426b3 = new C11426b();
                    this.f42525l = c11426b3;
                    c11426b = c11426b3;
                    z = true;
                }
            }
            if (z) {
                add(c11426b);
            }
            return c11426b;
        }

        /* renamed from: k */
        Queue<Throwable> m40293k() {
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = this.f42526m;
            if (concurrentLinkedQueue == null) {
                synchronized (this) {
                    concurrentLinkedQueue = this.f42526m;
                    if (concurrentLinkedQueue == null) {
                        concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
                        this.f42526m = concurrentLinkedQueue;
                    }
                }
            }
            return concurrentLinkedQueue;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p456rx.InterfaceC11241f
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void onNext(C11234e<? extends T> c11234e) throws Throwable {
            if (c11234e == null) {
                return;
            }
            if (c11234e == C11234e.m40016B()) {
                m40288f();
                return;
            }
            if (c11234e instanceof C11361j) {
                m40299r(((C11361j) c11234e).m40448h1());
                return;
            }
            long j2 = this.f42532s;
            this.f42532s = 1 + j2;
            c cVar = new c(this, j2);
            m40285c(cVar);
            c11234e.m40089c1(cVar);
            m40287e();
        }

        /* renamed from: m */
        protected void m40295m(T t) throws Throwable {
            Queue<Object> c11391s = this.f42524k;
            if (c11391s == null) {
                int i2 = this.f42522i;
                if (i2 == Integer.MAX_VALUE) {
                    c11391s = new C11372h<>(C11359h.f42884f);
                } else {
                    c11391s = C11382j.m40535a(i2) ? C11398z.m40548b() ? new C11391s<>(i2) : new C11369e<>(i2) : new C11370f<>(i2);
                }
                this.f42524k = c11391s;
            }
            if (c11391s.offer(C11282h.m40221g(t))) {
                return;
            }
            unsubscribe();
            onError(OnErrorThrowable.m40132a(new MissingBackpressureException(), t));
        }

        /* renamed from: n */
        protected void m40296n(c<T> cVar, T t) throws Throwable {
            C11359h c11359hM40437b = cVar.f42516j;
            if (c11359hM40437b == null) {
                c11359hM40437b = C11359h.m40437b();
                cVar.add(c11359hM40437b);
                cVar.f42516j = c11359hM40437b;
            }
            try {
                c11359hM40437b.m40442g(C11282h.m40221g(t));
            } catch (IllegalStateException e2) {
                if (cVar.isUnsubscribed()) {
                    return;
                }
                cVar.unsubscribe();
                cVar.onError(e2);
            } catch (MissingBackpressureException e3) {
                cVar.unsubscribe();
                cVar.onError(e3);
            }
        }

        /* renamed from: o */
        void m40297o(c<T> cVar) {
            C11359h c11359h = cVar.f42516j;
            if (c11359h != null) {
                c11359h.m40445j();
            }
            this.f42525l.m40670d(cVar);
            synchronized (this.f42530q) {
                c<?>[] cVarArr = this.f42531r;
                int length = cVarArr.length;
                int i2 = -1;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    if (cVar.equals(cVarArr[i3])) {
                        i2 = i3;
                        break;
                    }
                    i3++;
                }
                if (i2 < 0) {
                    return;
                }
                if (length == 1) {
                    this.f42531r = f42519f;
                    return;
                }
                c<?>[] cVarArr2 = new c[length - 1];
                System.arraycopy(cVarArr, 0, cVarArr2, 0, i2);
                System.arraycopy(cVarArr, i2 + 1, cVarArr2, i2, (length - i2) - 1);
                this.f42531r = cVarArr2;
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() throws Throwable {
            this.f42527n = true;
            m40287e();
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) throws Throwable {
            m40293k().offer(th);
            this.f42527n = true;
            m40287e();
        }

        /* renamed from: q */
        public void m40298q(long j2) {
            request(j2);
        }

        /* renamed from: r */
        void m40299r(T t) throws Throwable {
            long j2 = this.f42523j.get();
            boolean z = false;
            if (j2 != 0) {
                synchronized (this) {
                    j2 = this.f42523j.get();
                    if (!this.f42528o && j2 != 0) {
                        this.f42528o = true;
                        z = true;
                    }
                }
            }
            if (!z) {
                m40295m(t);
                m40287e();
                return;
            }
            Queue<Object> queue = this.f42524k;
            if (queue == null || queue.isEmpty()) {
                m40290h(t, j2);
            } else {
                m40295m(t);
                m40289g();
            }
        }

        /* renamed from: s */
        void m40300s(c<T> cVar, T t) throws Throwable {
            long j2 = this.f42523j.get();
            boolean z = false;
            if (j2 != 0) {
                synchronized (this) {
                    j2 = this.f42523j.get();
                    if (!this.f42528o && j2 != 0) {
                        this.f42528o = true;
                        z = true;
                    }
                }
            }
            if (!z) {
                m40296n(cVar, t);
                m40287e();
                return;
            }
            C11359h c11359h = cVar.f42516j;
            if (c11359h == null || c11359h.m40440e()) {
                m40291i(cVar, t, j2);
            } else {
                m40296n(cVar, t);
                m40289g();
            }
        }
    }

    C11310q0(boolean z, int i2) {
        this.f42508f = z;
        this.f42509g = i2;
    }

    /* renamed from: b */
    public static <T> C11310q0<T> m40280b(boolean z) {
        return z ? (C11310q0<T>) a.f42510a : (C11310q0<T>) b.f42511a;
    }

    @Override // p456rx.p460m.InterfaceC11256e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11245j<C11234e<? extends T>> call(AbstractC11245j<? super T> abstractC11245j) {
        e eVar = new e(abstractC11245j, this.f42508f, this.f42509g);
        d<T> dVar = new d<>(eVar);
        eVar.f42523j = dVar;
        abstractC11245j.add(eVar);
        abstractC11245j.setProducer(dVar);
        return eVar;
    }
}
