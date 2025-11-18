package p456rx.p461n.p462a;

import java.util.concurrent.TimeUnit;
import p456rx.AbstractC11243h;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.exceptions.C11240a;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p470p.C11405e;
import p456rx.p474t.C11428d;

/* compiled from: OperatorDebounceWithTime.java */
/* renamed from: rx.n.a.k0 */
/* loaded from: classes3.dex */
public final class C11292k0<T> implements C11234e.b<T, T> {

    /* renamed from: f */
    final long f42378f;

    /* renamed from: g */
    final TimeUnit f42379g;

    /* renamed from: h */
    final AbstractC11243h f42380h;

    /* compiled from: OperatorDebounceWithTime.java */
    /* renamed from: rx.n.a.k0$a */
    class a extends AbstractC11245j<T> {

        /* renamed from: f */
        final b<T> f42381f;

        /* renamed from: g */
        final AbstractC11245j<?> f42382g;

        /* renamed from: h */
        final /* synthetic */ C11428d f42383h;

        /* renamed from: i */
        final /* synthetic */ AbstractC11243h.a f42384i;

        /* renamed from: j */
        final /* synthetic */ C11405e f42385j;

        /* compiled from: OperatorDebounceWithTime.java */
        /* renamed from: rx.n.a.k0$a$a, reason: collision with other inner class name */
        class C11598a implements InterfaceC11252a {

            /* renamed from: f */
            final /* synthetic */ int f42387f;

            C11598a(int i2) {
                this.f42387f = i2;
            }

            @Override // p456rx.p460m.InterfaceC11252a
            public void call() {
                a aVar = a.this;
                aVar.f42381f.m40248b(this.f42387f, aVar.f42385j, aVar.f42382g);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC11245j abstractC11245j, C11428d c11428d, AbstractC11243h.a aVar, C11405e c11405e) {
            super(abstractC11245j);
            this.f42383h = c11428d;
            this.f42384i = aVar;
            this.f42385j = c11405e;
            this.f42381f = new b<>();
            this.f42382g = this;
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            this.f42381f.m40249c(this.f42385j, this);
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            this.f42385j.onError(th);
            unsubscribe();
            this.f42381f.m40247a();
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            int iM40250d = this.f42381f.m40250d(t);
            C11428d c11428d = this.f42383h;
            AbstractC11243h.a aVar = this.f42384i;
            C11598a c11598a = new C11598a(iM40250d);
            C11292k0 c11292k0 = C11292k0.this;
            c11428d.m40673b(aVar.mo40147d(c11598a, c11292k0.f42378f, c11292k0.f42379g));
        }

        @Override // p456rx.AbstractC11245j
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* compiled from: OperatorDebounceWithTime.java */
    /* renamed from: rx.n.a.k0$b */
    static final class b<T> {

        /* renamed from: a */
        int f42389a;

        /* renamed from: b */
        T f42390b;

        /* renamed from: c */
        boolean f42391c;

        /* renamed from: d */
        boolean f42392d;

        /* renamed from: e */
        boolean f42393e;

        b() {
        }

        /* renamed from: a */
        public synchronized void m40247a() {
            this.f42389a++;
            this.f42390b = null;
            this.f42391c = false;
        }

        /* renamed from: b */
        public void m40248b(int i2, AbstractC11245j<T> abstractC11245j, AbstractC11245j<?> abstractC11245j2) {
            synchronized (this) {
                if (!this.f42393e && this.f42391c && i2 == this.f42389a) {
                    T t = this.f42390b;
                    this.f42390b = null;
                    this.f42391c = false;
                    this.f42393e = true;
                    try {
                        abstractC11245j.onNext(t);
                        synchronized (this) {
                            if (this.f42392d) {
                                abstractC11245j.onCompleted();
                            } else {
                                this.f42393e = false;
                            }
                        }
                    } catch (Throwable th) {
                        C11240a.m40142g(th, abstractC11245j2, t);
                    }
                }
            }
        }

        /* renamed from: c */
        public void m40249c(AbstractC11245j<T> abstractC11245j, AbstractC11245j<?> abstractC11245j2) {
            synchronized (this) {
                if (this.f42393e) {
                    this.f42392d = true;
                    return;
                }
                T t = this.f42390b;
                boolean z = this.f42391c;
                this.f42390b = null;
                this.f42391c = false;
                this.f42393e = true;
                if (z) {
                    try {
                        abstractC11245j.onNext(t);
                    } catch (Throwable th) {
                        C11240a.m40142g(th, abstractC11245j2, t);
                        return;
                    }
                }
                abstractC11245j.onCompleted();
            }
        }

        /* renamed from: d */
        public synchronized int m40250d(T t) {
            int i2;
            this.f42390b = t;
            this.f42391c = true;
            i2 = this.f42389a + 1;
            this.f42389a = i2;
            return i2;
        }
    }

    public C11292k0(long j2, TimeUnit timeUnit, AbstractC11243h abstractC11243h) {
        this.f42378f = j2;
        this.f42379g = timeUnit;
        this.f42380h = abstractC11243h;
    }

    @Override // p456rx.p460m.InterfaceC11256e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11245j<? super T> call(AbstractC11245j<? super T> abstractC11245j) {
        AbstractC11243h.a aVarCreateWorker = this.f42380h.createWorker();
        C11405e c11405e = new C11405e(abstractC11245j);
        C11428d c11428d = new C11428d();
        c11405e.add(aVarCreateWorker);
        c11405e.add(c11428d);
        return new a(abstractC11245j, c11428d, aVarCreateWorker, c11405e);
    }
}
