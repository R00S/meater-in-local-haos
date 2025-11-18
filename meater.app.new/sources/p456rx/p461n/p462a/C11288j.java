package p456rx.p461n.p462a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.InterfaceC11242g;
import p456rx.InterfaceC11246k;
import p456rx.exceptions.CompositeException;
import p456rx.p460m.InterfaceC11259h;
import p456rx.p461n.p466e.C11359h;
import p456rx.p461n.p466e.p467n.C11371g;
import p456rx.p471q.C11409c;

/* compiled from: OnSubscribeCombineLatest.java */
/* renamed from: rx.n.a.j */
/* loaded from: classes3.dex */
public final class C11288j<T, R> implements C11234e.a<R> {

    /* renamed from: f */
    final C11234e<? extends T>[] f42330f;

    /* renamed from: g */
    final Iterable<? extends C11234e<? extends T>> f42331g;

    /* renamed from: h */
    final InterfaceC11259h<? extends R> f42332h;

    /* renamed from: i */
    final int f42333i;

    /* renamed from: j */
    final boolean f42334j;

    /* compiled from: OnSubscribeCombineLatest.java */
    /* renamed from: rx.n.a.j$a */
    static final class a<T, R> extends AbstractC11245j<T> {

        /* renamed from: f */
        final b<T, R> f42335f;

        /* renamed from: g */
        final int f42336g;

        /* renamed from: h */
        boolean f42337h;

        public a(b<T, R> bVar, int i2) {
            this.f42335f = bVar;
            this.f42336g = i2;
            request(bVar.f42342j);
        }

        /* renamed from: c */
        public void m40229c(long j2) {
            request(j2);
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            if (this.f42337h) {
                return;
            }
            this.f42337h = true;
            this.f42335f.m40232c(null, this.f42336g);
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            if (this.f42337h) {
                C11409c.m40578j(th);
                return;
            }
            this.f42335f.m40234e(th);
            this.f42337h = true;
            this.f42335f.m40232c(null, this.f42336g);
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            if (this.f42337h) {
                return;
            }
            this.f42335f.m40232c(C11282h.m40221g(t), this.f42336g);
        }
    }

    /* compiled from: OnSubscribeCombineLatest.java */
    /* renamed from: rx.n.a.j$b */
    static final class b<T, R> extends AtomicInteger implements InterfaceC11242g, InterfaceC11246k {

        /* renamed from: f */
        static final Object f42338f = new Object();

        /* renamed from: g */
        final AbstractC11245j<? super R> f42339g;

        /* renamed from: h */
        final InterfaceC11259h<? extends R> f42340h;

        /* renamed from: i */
        final a<T, R>[] f42341i;

        /* renamed from: j */
        final int f42342j;

        /* renamed from: k */
        final Object[] f42343k;

        /* renamed from: l */
        final C11371g<Object> f42344l;

        /* renamed from: m */
        final boolean f42345m;

        /* renamed from: n */
        volatile boolean f42346n;

        /* renamed from: o */
        volatile boolean f42347o;

        /* renamed from: p */
        final AtomicLong f42348p;

        /* renamed from: q */
        final AtomicReference<Throwable> f42349q;

        /* renamed from: r */
        int f42350r;

        /* renamed from: s */
        int f42351s;

        public b(AbstractC11245j<? super R> abstractC11245j, InterfaceC11259h<? extends R> interfaceC11259h, int i2, int i3, boolean z) {
            this.f42339g = abstractC11245j;
            this.f42340h = interfaceC11259h;
            this.f42342j = i3;
            this.f42345m = z;
            Object[] objArr = new Object[i2];
            this.f42343k = objArr;
            Arrays.fill(objArr, f42338f);
            this.f42341i = new a[i2];
            this.f42344l = new C11371g<>(i3);
            this.f42348p = new AtomicLong();
            this.f42349q = new AtomicReference<>();
        }

        /* renamed from: a */
        void m40230a(Queue<?> queue) {
            queue.clear();
            for (a<T, R> aVar : this.f42341i) {
                aVar.unsubscribe();
            }
        }

        /* renamed from: b */
        boolean m40231b(boolean z, boolean z2, AbstractC11245j<?> abstractC11245j, Queue<?> queue, boolean z3) {
            if (this.f42346n) {
                m40230a(queue);
                return true;
            }
            if (!z) {
                return false;
            }
            if (z3) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.f42349q.get();
                if (th != null) {
                    abstractC11245j.onError(th);
                } else {
                    abstractC11245j.onCompleted();
                }
                return true;
            }
            Throwable th2 = this.f42349q.get();
            if (th2 != null) {
                m40230a(queue);
                abstractC11245j.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            abstractC11245j.onCompleted();
            return true;
        }

        /* renamed from: c */
        void m40232c(Object obj, int i2) {
            boolean z;
            a<T, R> aVar = this.f42341i[i2];
            synchronized (this) {
                Object[] objArr = this.f42343k;
                int length = objArr.length;
                Object obj2 = objArr[i2];
                int i3 = this.f42350r;
                Object obj3 = f42338f;
                if (obj2 == obj3) {
                    i3++;
                    this.f42350r = i3;
                }
                int i4 = this.f42351s;
                if (obj == null) {
                    i4++;
                    this.f42351s = i4;
                } else {
                    objArr[i2] = C11282h.m40219e(obj);
                }
                boolean z2 = false;
                z = i3 == length;
                if (i4 == length || (obj == null && obj2 == obj3)) {
                    z2 = true;
                }
                if (z2) {
                    this.f42347o = true;
                } else if (obj != null && z) {
                    this.f42344l.m40505u(aVar, this.f42343k.clone());
                } else if (obj == null && this.f42349q.get() != null && (obj2 == obj3 || !this.f42345m)) {
                    this.f42347o = true;
                }
            }
            if (z || obj == null) {
                m40233d();
            } else {
                aVar.m40229c(1L);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
        
            if (r3 == 0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
        
            if (r13 == Long.MAX_VALUE) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
        
            p456rx.p461n.p462a.C11261a.m40163c(r10, r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
        
            r12 = addAndGet(-r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00a6, code lost:
        
            if (r12 != 0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00a8, code lost:
        
            return;
         */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void m40233d() {
            /*
                r19 = this;
                r7 = r19
                int r0 = r19.getAndIncrement()
                if (r0 == 0) goto L9
                return
            L9:
                rx.n.e.n.g<java.lang.Object> r8 = r7.f42344l
                rx.j<? super R> r9 = r7.f42339g
                boolean r0 = r7.f42345m
                java.util.concurrent.atomic.AtomicLong r10 = r7.f42348p
                r11 = 1
                r12 = 1
            L13:
                boolean r2 = r7.f42347o
                boolean r3 = r8.isEmpty()
                r1 = r19
                r4 = r9
                r5 = r8
                r6 = r0
                boolean r1 = r1.m40231b(r2, r3, r4, r5, r6)
                if (r1 == 0) goto L25
                return
            L25:
                long r13 = r10.get()
                r5 = 0
            L2b:
                int r1 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
                if (r1 == 0) goto L8e
                boolean r2 = r7.f42347o
                java.lang.Object r1 = r8.peek()
                r4 = r1
                rx.n.a.j$a r4 = (p456rx.p461n.p462a.C11288j.a) r4
                if (r4 != 0) goto L3d
                r16 = 1
                goto L40
            L3d:
                r1 = 0
                r16 = 0
            L40:
                r1 = r19
                r3 = r16
                r15 = r4
                r4 = r9
                r17 = r5
                r5 = r8
                r6 = r0
                boolean r1 = r1.m40231b(r2, r3, r4, r5, r6)
                if (r1 == 0) goto L51
                return
            L51:
                if (r16 == 0) goto L56
                r3 = r17
                goto L8f
            L56:
                r8.poll()
                java.lang.Object r1 = r8.poll()
                java.lang.Object[] r1 = (java.lang.Object[]) r1
                if (r1 != 0) goto L71
                r7.f42346n = r11
                r7.m40230a(r8)
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Broken queue?! Sender received but not the array."
                r0.<init>(r1)
                r9.onError(r0)
                return
            L71:
                rx.m.h<? extends R> r2 = r7.f42340h     // Catch: java.lang.Throwable -> L84
                java.lang.Object r1 = r2.call(r1)     // Catch: java.lang.Throwable -> L84
                r9.onNext(r1)
                r1 = 1
                r15.m40229c(r1)
                r3 = r17
                long r5 = r3 + r1
                goto L2b
            L84:
                r0 = move-exception
                r7.f42346n = r11
                r7.m40230a(r8)
                r9.onError(r0)
                return
            L8e:
                r3 = r5
            L8f:
                r1 = 0
                int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r5 == 0) goto La1
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
                if (r5 == 0) goto La1
                p456rx.p461n.p462a.C11261a.m40163c(r10, r3)
            La1:
                int r1 = -r12
                int r12 = r7.addAndGet(r1)
                if (r12 != 0) goto L13
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p456rx.p461n.p462a.C11288j.b.m40233d():void");
        }

        /* renamed from: e */
        void m40234e(Throwable th) {
            Throwable th2;
            Throwable compositeException;
            AtomicReference<Throwable> atomicReference = this.f42349q;
            do {
                th2 = atomicReference.get();
                if (th2 == null) {
                    compositeException = th;
                } else if (th2 instanceof CompositeException) {
                    ArrayList arrayList = new ArrayList(((CompositeException) th2).m40129b());
                    arrayList.add(th);
                    compositeException = new CompositeException(arrayList);
                } else {
                    compositeException = new CompositeException(Arrays.asList(th2, th));
                }
            } while (!atomicReference.compareAndSet(th2, compositeException));
        }

        /* renamed from: f */
        public void m40235f(C11234e<? extends T>[] c11234eArr) {
            a<T, R>[] aVarArr = this.f42341i;
            int length = aVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                aVarArr[i2] = new a<>(this, i2);
            }
            lazySet(0);
            this.f42339g.add(this);
            this.f42339g.setProducer(this);
            for (int i3 = 0; i3 < length && !this.f42346n; i3++) {
                c11234eArr[i3].m40058E0(aVarArr[i3]);
            }
        }

        @Override // p456rx.InterfaceC11246k
        public boolean isUnsubscribed() {
            return this.f42346n;
        }

        @Override // p456rx.InterfaceC11242g
        public void request(long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException("n >= required but it was " + j2);
            }
            if (j2 != 0) {
                C11261a.m40162b(this.f42348p, j2);
                m40233d();
            }
        }

        @Override // p456rx.InterfaceC11246k
        public void unsubscribe() {
            if (this.f42346n) {
                return;
            }
            this.f42346n = true;
            if (getAndIncrement() == 0) {
                m40230a(this.f42344l);
            }
        }
    }

    public C11288j(Iterable<? extends C11234e<? extends T>> iterable, InterfaceC11259h<? extends R> interfaceC11259h) {
        this(null, iterable, interfaceC11259h, C11359h.f42884f, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void call(p456rx.AbstractC11245j<? super R> r9) {
        /*
            r8 = this;
            rx.e<? extends T>[] r0 = r8.f42330f
            if (r0 != 0) goto L45
            java.lang.Iterable<? extends rx.e<? extends T>> r0 = r8.f42331g
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L1a
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            rx.e[] r1 = new p456rx.C11234e[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            rx.e[] r0 = (p456rx.C11234e[]) r0
            int r1 = r0.length
            goto L46
        L1a:
            r1 = 8
            rx.e[] r1 = new p456rx.C11234e[r1]
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = 0
        L24:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L42
            java.lang.Object r4 = r0.next()
            rx.e r4 = (p456rx.C11234e) r4
            int r5 = r1.length
            if (r3 != r5) goto L3c
            int r5 = r3 >> 2
            int r5 = r5 + r3
            rx.e[] r5 = new p456rx.C11234e[r5]
            java.lang.System.arraycopy(r1, r2, r5, r2, r3)
            r1 = r5
        L3c:
            int r5 = r3 + 1
            r1[r3] = r4
            r3 = r5
            goto L24
        L42:
            r0 = r1
            r4 = r3
            goto L47
        L45:
            int r1 = r0.length
        L46:
            r4 = r1
        L47:
            if (r4 != 0) goto L4d
            r9.onCompleted()
            return
        L4d:
            rx.n.a.j$b r7 = new rx.n.a.j$b
            rx.m.h<? extends R> r3 = r8.f42332h
            int r5 = r8.f42333i
            boolean r6 = r8.f42334j
            r1 = r7
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r7.m40235f(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p456rx.p461n.p462a.C11288j.call(rx.j):void");
    }

    public C11288j(C11234e<? extends T>[] c11234eArr, Iterable<? extends C11234e<? extends T>> iterable, InterfaceC11259h<? extends R> interfaceC11259h, int i2, boolean z) {
        this.f42330f = c11234eArr;
        this.f42331g = iterable;
        this.f42332h = interfaceC11259h;
        this.f42333i = i2;
        this.f42334j = z;
    }
}
