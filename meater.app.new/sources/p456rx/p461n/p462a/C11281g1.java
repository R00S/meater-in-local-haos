package p456rx.p461n.p462a;

import java.util.concurrent.atomic.AtomicLong;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.InterfaceC11241f;
import p456rx.InterfaceC11242g;
import p456rx.exceptions.C11240a;
import p456rx.exceptions.MissingBackpressureException;
import p456rx.p460m.C11260i;
import p456rx.p460m.InterfaceC11257f;
import p456rx.p460m.InterfaceC11259h;
import p456rx.p461n.p466e.C11359h;
import p456rx.p474t.C11426b;

/* compiled from: OperatorZip.java */
/* renamed from: rx.n.a.g1 */
/* loaded from: classes3.dex */
public final class C11281g1<R> implements C11234e.b<R, C11234e<?>[]> {

    /* renamed from: f */
    final InterfaceC11259h<? extends R> f42292f;

    /* compiled from: OperatorZip.java */
    /* renamed from: rx.n.a.g1$a */
    static final class a<R> extends AtomicLong {

        /* renamed from: f */
        static final int f42293f;

        /* renamed from: g */
        final InterfaceC11241f<? super R> f42294g;

        /* renamed from: h */
        private final InterfaceC11259h<? extends R> f42295h;

        /* renamed from: i */
        private final C11426b f42296i;

        /* renamed from: j */
        int f42297j;

        /* renamed from: k */
        private volatile Object[] f42298k;

        /* renamed from: l */
        private AtomicLong f42299l;

        /* compiled from: OperatorZip.java */
        /* renamed from: rx.n.a.g1$a$a, reason: collision with other inner class name */
        final class C11597a extends AbstractC11245j {

            /* renamed from: f */
            final C11359h f42300f = C11359h.m40436a();

            C11597a() {
            }

            /* renamed from: c */
            public void m40213c(long j2) {
                request(j2);
            }

            @Override // p456rx.InterfaceC11241f
            public void onCompleted() {
                this.f42300f.m40441f();
                a.this.m40212b();
            }

            @Override // p456rx.InterfaceC11241f
            public void onError(Throwable th) {
                a.this.f42294g.onError(th);
            }

            @Override // p456rx.InterfaceC11241f
            public void onNext(Object obj) {
                try {
                    this.f42300f.m40442g(obj);
                } catch (MissingBackpressureException e2) {
                    onError(e2);
                }
                a.this.m40212b();
            }

            @Override // p456rx.AbstractC11245j
            public void onStart() {
                request(C11359h.f42884f);
            }
        }

        static {
            double d2 = C11359h.f42884f;
            Double.isNaN(d2);
            f42293f = (int) (d2 * 0.7d);
        }

        public a(AbstractC11245j<? super R> abstractC11245j, InterfaceC11259h<? extends R> interfaceC11259h) {
            C11426b c11426b = new C11426b();
            this.f42296i = c11426b;
            this.f42294g = abstractC11245j;
            this.f42295h = interfaceC11259h;
            abstractC11245j.add(c11426b);
        }

        /* renamed from: a */
        public void m40211a(C11234e[] c11234eArr, AtomicLong atomicLong) {
            Object[] objArr = new Object[c11234eArr.length];
            for (int i2 = 0; i2 < c11234eArr.length; i2++) {
                C11597a c11597a = new C11597a();
                objArr[i2] = c11597a;
                this.f42296i.m40667a(c11597a);
            }
            this.f42299l = atomicLong;
            this.f42298k = objArr;
            for (int i3 = 0; i3 < c11234eArr.length; i3++) {
                c11234eArr[i3].m40089c1((C11597a) objArr[i3]);
            }
        }

        /* renamed from: b */
        void m40212b() {
            Object[] objArr = this.f42298k;
            if (objArr == null || getAndIncrement() != 0) {
                return;
            }
            int length = objArr.length;
            InterfaceC11241f<? super R> interfaceC11241f = this.f42294g;
            AtomicLong atomicLong = this.f42299l;
            while (true) {
                Object[] objArr2 = new Object[length];
                boolean z = true;
                for (int i2 = 0; i2 < length; i2++) {
                    C11359h c11359h = ((C11597a) objArr[i2]).f42300f;
                    Object objM40443h = c11359h.m40443h();
                    if (objM40443h == null) {
                        z = false;
                    } else {
                        if (c11359h.m40439d(objM40443h)) {
                            interfaceC11241f.onCompleted();
                            this.f42296i.unsubscribe();
                            return;
                        }
                        objArr2[i2] = c11359h.m40438c(objM40443h);
                    }
                }
                if (z && atomicLong.get() > 0) {
                    try {
                        interfaceC11241f.onNext(this.f42295h.call(objArr2));
                        atomicLong.decrementAndGet();
                        this.f42297j++;
                        for (Object obj : objArr) {
                            C11359h c11359h2 = ((C11597a) obj).f42300f;
                            c11359h2.m40444i();
                            if (c11359h2.m40439d(c11359h2.m40443h())) {
                                interfaceC11241f.onCompleted();
                                this.f42296i.unsubscribe();
                                return;
                            }
                        }
                        if (this.f42297j > f42293f) {
                            for (Object obj2 : objArr) {
                                ((C11597a) obj2).m40213c(this.f42297j);
                            }
                            this.f42297j = 0;
                        }
                    } catch (Throwable th) {
                        C11240a.m40142g(th, interfaceC11241f, objArr2);
                        return;
                    }
                } else if (decrementAndGet() <= 0) {
                    return;
                }
            }
        }
    }

    /* compiled from: OperatorZip.java */
    /* renamed from: rx.n.a.g1$b */
    static final class b<R> extends AtomicLong implements InterfaceC11242g {

        /* renamed from: f */
        final a<R> f42302f;

        public b(a<R> aVar) {
            this.f42302f = aVar;
        }

        @Override // p456rx.InterfaceC11242g
        public void request(long j2) {
            C11261a.m40162b(this, j2);
            this.f42302f.m40212b();
        }
    }

    /* compiled from: OperatorZip.java */
    /* renamed from: rx.n.a.g1$c */
    final class c extends AbstractC11245j<C11234e[]> {

        /* renamed from: f */
        final AbstractC11245j<? super R> f42303f;

        /* renamed from: g */
        final a<R> f42304g;

        /* renamed from: h */
        final b<R> f42305h;

        /* renamed from: i */
        boolean f42306i;

        public c(AbstractC11245j<? super R> abstractC11245j, a<R> aVar, b<R> bVar) {
            this.f42303f = abstractC11245j;
            this.f42304g = aVar;
            this.f42305h = bVar;
        }

        @Override // p456rx.InterfaceC11241f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(C11234e[] c11234eArr) {
            if (c11234eArr == null || c11234eArr.length == 0) {
                this.f42303f.onCompleted();
            } else {
                this.f42306i = true;
                this.f42304g.m40211a(c11234eArr, this.f42305h);
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            if (this.f42306i) {
                return;
            }
            this.f42303f.onCompleted();
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            this.f42303f.onError(th);
        }
    }

    public C11281g1(InterfaceC11257f interfaceC11257f) {
        this.f42292f = C11260i.m40159a(interfaceC11257f);
    }

    @Override // p456rx.p460m.InterfaceC11256e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11245j<? super C11234e[]> call(AbstractC11245j<? super R> abstractC11245j) {
        a aVar = new a(abstractC11245j, this.f42292f);
        b bVar = new b(aVar);
        c cVar = new c(abstractC11245j, aVar, bVar);
        abstractC11245j.add(cVar);
        abstractC11245j.setProducer(bVar);
        return cVar;
    }
}
