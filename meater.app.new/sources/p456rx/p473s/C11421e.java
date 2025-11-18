package p456rx.p473s;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.InterfaceC11241f;
import p456rx.p460m.C11254c;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p461n.p462a.C11282h;
import p456rx.p474t.C11429e;

/* compiled from: SubjectSubscriptionManager.java */
/* renamed from: rx.s.e */
/* loaded from: classes3.dex */
final class C11421e<T> extends AtomicReference<b<T>> implements C11234e.a<T> {

    /* renamed from: f */
    volatile Object f43050f;

    /* renamed from: g */
    boolean f43051g;

    /* renamed from: h */
    InterfaceC11253b<c<T>> f43052h;

    /* renamed from: i */
    InterfaceC11253b<c<T>> f43053i;

    /* renamed from: j */
    InterfaceC11253b<c<T>> f43054j;

    /* compiled from: SubjectSubscriptionManager.java */
    /* renamed from: rx.s.e$a */
    class a implements InterfaceC11252a {

        /* renamed from: f */
        final /* synthetic */ c f43055f;

        a(c cVar) {
            this.f43055f = cVar;
        }

        @Override // p456rx.p460m.InterfaceC11252a
        public void call() {
            C11421e.this.m40648f(this.f43055f);
        }
    }

    /* compiled from: SubjectSubscriptionManager.java */
    /* renamed from: rx.s.e$b */
    protected static final class b<T> {

        /* renamed from: a */
        static final c[] f43057a;

        /* renamed from: b */
        static final b f43058b;

        /* renamed from: c */
        static final b f43059c;

        /* renamed from: d */
        final boolean f43060d;

        /* renamed from: e */
        final c[] f43061e;

        static {
            c[] cVarArr = new c[0];
            f43057a = cVarArr;
            f43058b = new b(true, cVarArr);
            f43059c = new b(false, cVarArr);
        }

        public b(boolean z, c[] cVarArr) {
            this.f43060d = z;
            this.f43061e = cVarArr;
        }

        /* renamed from: a */
        public b m40651a(c cVar) {
            c[] cVarArr = this.f43061e;
            int length = cVarArr.length;
            c[] cVarArr2 = new c[length + 1];
            System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
            cVarArr2[length] = cVar;
            return new b(this.f43060d, cVarArr2);
        }

        /* renamed from: b */
        public b m40652b(c cVar) {
            c[] cVarArr = this.f43061e;
            int length = cVarArr.length;
            if (length == 1 && cVarArr[0] == cVar) {
                return f43059c;
            }
            if (length == 0) {
                return this;
            }
            int i2 = length - 1;
            c[] cVarArr2 = new c[i2];
            int i3 = 0;
            for (c cVar2 : cVarArr) {
                if (cVar2 != cVar) {
                    if (i3 == i2) {
                        return this;
                    }
                    cVarArr2[i3] = cVar2;
                    i3++;
                }
            }
            if (i3 == 0) {
                return f43059c;
            }
            if (i3 < i2) {
                c[] cVarArr3 = new c[i3];
                System.arraycopy(cVarArr2, 0, cVarArr3, 0, i3);
                cVarArr2 = cVarArr3;
            }
            return new b(this.f43060d, cVarArr2);
        }
    }

    /* compiled from: SubjectSubscriptionManager.java */
    /* renamed from: rx.s.e$c */
    protected static final class c<T> implements InterfaceC11241f<T> {

        /* renamed from: f */
        final AbstractC11245j<? super T> f43062f;

        /* renamed from: g */
        boolean f43063g = true;

        /* renamed from: h */
        boolean f43064h;

        /* renamed from: i */
        List<Object> f43065i;

        /* renamed from: j */
        boolean f43066j;

        public c(AbstractC11245j<? super T> abstractC11245j) {
            this.f43062f = abstractC11245j;
        }

        /* renamed from: a */
        void m40653a(Object obj) {
            if (obj != null) {
                C11282h.m40215a(this.f43062f, obj);
            }
        }

        /* renamed from: b */
        void m40654b(Object obj) {
            synchronized (this) {
                if (this.f43063g && !this.f43064h) {
                    this.f43063g = false;
                    this.f43064h = obj != null;
                    if (obj != null) {
                        m40655c(null, obj);
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x001c A[Catch: all -> 0x0017, TryCatch #2 {all -> 0x0017, blocks: (B:5:0x0005, B:6:0x0009, B:8:0x000f, B:12:0x001c, B:13:0x0020), top: B:43:0x0005 }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0021 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void m40655c(java.util.List<java.lang.Object> r5, java.lang.Object r6) throws java.lang.Throwable {
            /*
                r4 = this;
                r0 = 1
                r1 = 1
            L2:
                r2 = 0
                if (r5 == 0) goto L1a
                java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L17
            L9:
                boolean r3 = r5.hasNext()     // Catch: java.lang.Throwable -> L17
                if (r3 == 0) goto L1a
                java.lang.Object r3 = r5.next()     // Catch: java.lang.Throwable -> L17
                r4.m40653a(r3)     // Catch: java.lang.Throwable -> L17
                goto L9
            L17:
                r5 = move-exception
                r0 = 0
                goto L36
            L1a:
                if (r1 == 0) goto L20
                r4.m40653a(r6)     // Catch: java.lang.Throwable -> L17
                r1 = 0
            L20:
                monitor-enter(r4)     // Catch: java.lang.Throwable -> L17
                java.util.List<java.lang.Object> r5 = r4.f43065i     // Catch: java.lang.Throwable -> L2e
                r3 = 0
                r4.f43065i = r3     // Catch: java.lang.Throwable -> L2e
                if (r5 != 0) goto L2c
                r4.f43064h = r2     // Catch: java.lang.Throwable -> L2e
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L34
                return
            L2c:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L2e
                goto L2
            L2e:
                r5 = move-exception
                r0 = 0
            L30:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L34
                throw r5     // Catch: java.lang.Throwable -> L32
            L32:
                r5 = move-exception
                goto L36
            L34:
                r5 = move-exception
                goto L30
            L36:
                if (r0 != 0) goto L40
                monitor-enter(r4)
                r4.f43064h = r2     // Catch: java.lang.Throwable -> L3d
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L3d
                goto L40
            L3d:
                r5 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L3d
                throw r5
            L40:
                goto L42
            L41:
                throw r5
            L42:
                goto L41
            */
            throw new UnsupportedOperationException("Method not decompiled: p456rx.p473s.C11421e.c.m40655c(java.util.List, java.lang.Object):void");
        }

        /* renamed from: d */
        void m40656d(Object obj) {
            if (!this.f43066j) {
                synchronized (this) {
                    this.f43063g = false;
                    if (this.f43064h) {
                        if (this.f43065i == null) {
                            this.f43065i = new ArrayList();
                        }
                        this.f43065i.add(obj);
                        return;
                    }
                    this.f43066j = true;
                }
            }
            C11282h.m40215a(this.f43062f, obj);
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            this.f43062f.onCompleted();
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            this.f43062f.onError(th);
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            this.f43062f.onNext(t);
        }
    }

    public C11421e() {
        super(b.f43059c);
        this.f43051g = true;
        this.f43052h = C11254c.m40157a();
        this.f43053i = C11254c.m40157a();
        this.f43054j = C11254c.m40157a();
    }

    /* renamed from: a */
    boolean m40643a(c<T> cVar) {
        b<T> bVar;
        do {
            bVar = get();
            if (bVar.f43060d) {
                this.f43054j.call(cVar);
                return false;
            }
        } while (!compareAndSet(bVar, bVar.m40651a(cVar)));
        this.f43053i.call(cVar);
        return true;
    }

    /* renamed from: b */
    void m40644b(AbstractC11245j<? super T> abstractC11245j, c<T> cVar) {
        abstractC11245j.add(C11429e.m40674a(new a(cVar)));
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super T> abstractC11245j) {
        c<T> cVar = new c<>(abstractC11245j);
        m40644b(abstractC11245j, cVar);
        this.f43052h.call(cVar);
        if (!abstractC11245j.isUnsubscribed() && m40643a(cVar) && abstractC11245j.isUnsubscribed()) {
            m40648f(cVar);
        }
    }

    /* renamed from: d */
    Object m40646d() {
        return this.f43050f;
    }

    /* renamed from: e */
    c<T>[] m40647e(Object obj) {
        m40649g(obj);
        return get().f43061e;
    }

    /* renamed from: f */
    void m40648f(c<T> cVar) {
        b<T> bVar;
        b<T> bVarM40652b;
        do {
            bVar = get();
            if (bVar.f43060d || (bVarM40652b = bVar.m40652b(cVar)) == bVar) {
                return;
            }
        } while (!compareAndSet(bVar, bVarM40652b));
    }

    /* renamed from: g */
    void m40649g(Object obj) {
        this.f43050f = obj;
    }

    /* renamed from: h */
    c<T>[] m40650h(Object obj) {
        m40649g(obj);
        this.f43051g = false;
        return get().f43060d ? b.f43057a : getAndSet(b.f43058b).f43061e;
    }
}
