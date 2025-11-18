package p456rx.p461n.p462a;

import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.InterfaceC11242g;
import p456rx.exceptions.C11240a;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p461n.p463b.C11333a;
import p456rx.p471q.C11409c;
import p456rx.p474t.C11428d;

/* compiled from: OperatorOnErrorResumeNextViaFunction.java */
/* renamed from: rx.n.a.t0 */
/* loaded from: classes3.dex */
public final class C11319t0<T> implements C11234e.b<T, T> {

    /* renamed from: f */
    final InterfaceC11256e<? super Throwable, ? extends C11234e<? extends T>> f42605f;

    /* compiled from: OperatorOnErrorResumeNextViaFunction.java */
    /* renamed from: rx.n.a.t0$a */
    static class a implements InterfaceC11256e<Throwable, C11234e<? extends T>> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC11256e f42606f;

        a(InterfaceC11256e interfaceC11256e) {
            this.f42606f = interfaceC11256e;
        }

        @Override // p456rx.p460m.InterfaceC11256e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C11234e<? extends T> call(Throwable th) {
            return C11234e.m40025S(this.f42606f.call(th));
        }
    }

    /* compiled from: OperatorOnErrorResumeNextViaFunction.java */
    /* renamed from: rx.n.a.t0$b */
    static class b implements InterfaceC11256e<Throwable, C11234e<? extends T>> {

        /* renamed from: f */
        final /* synthetic */ C11234e f42607f;

        b(C11234e c11234e) {
            this.f42607f = c11234e;
        }

        @Override // p456rx.p460m.InterfaceC11256e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C11234e<? extends T> call(Throwable th) {
            return this.f42607f;
        }
    }

    /* compiled from: OperatorOnErrorResumeNextViaFunction.java */
    /* renamed from: rx.n.a.t0$c */
    class c extends AbstractC11245j<T> {

        /* renamed from: f */
        private boolean f42608f;

        /* renamed from: g */
        long f42609g;

        /* renamed from: h */
        final /* synthetic */ AbstractC11245j f42610h;

        /* renamed from: i */
        final /* synthetic */ C11333a f42611i;

        /* renamed from: j */
        final /* synthetic */ C11428d f42612j;

        /* compiled from: OperatorOnErrorResumeNextViaFunction.java */
        /* renamed from: rx.n.a.t0$c$a */
        class a extends AbstractC11245j<T> {
            a() {
            }

            @Override // p456rx.InterfaceC11241f
            public void onCompleted() {
                c.this.f42610h.onCompleted();
            }

            @Override // p456rx.InterfaceC11241f
            public void onError(Throwable th) {
                c.this.f42610h.onError(th);
            }

            @Override // p456rx.InterfaceC11241f
            public void onNext(T t) {
                c.this.f42610h.onNext(t);
            }

            @Override // p456rx.AbstractC11245j
            public void setProducer(InterfaceC11242g interfaceC11242g) {
                c.this.f42611i.m40375c(interfaceC11242g);
            }
        }

        c(AbstractC11245j abstractC11245j, C11333a c11333a, C11428d c11428d) {
            this.f42610h = abstractC11245j;
            this.f42611i = c11333a;
            this.f42612j = c11428d;
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            if (this.f42608f) {
                return;
            }
            this.f42608f = true;
            this.f42610h.onCompleted();
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            if (this.f42608f) {
                C11240a.m40140e(th);
                C11409c.m40578j(th);
                return;
            }
            this.f42608f = true;
            try {
                unsubscribe();
                a aVar = new a();
                this.f42612j.m40673b(aVar);
                long j2 = this.f42609g;
                if (j2 != 0) {
                    this.f42611i.m40374b(j2);
                }
                C11319t0.this.f42605f.call(th).m40089c1(aVar);
            } catch (Throwable th2) {
                C11240a.m40141f(th2, this.f42610h);
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            if (this.f42608f) {
                return;
            }
            this.f42609g++;
            this.f42610h.onNext(t);
        }

        @Override // p456rx.AbstractC11245j
        public void setProducer(InterfaceC11242g interfaceC11242g) {
            this.f42611i.m40375c(interfaceC11242g);
        }
    }

    public C11319t0(InterfaceC11256e<? super Throwable, ? extends C11234e<? extends T>> interfaceC11256e) {
        this.f42605f = interfaceC11256e;
    }

    /* renamed from: b */
    public static <T> C11319t0<T> m40326b(C11234e<? extends T> c11234e) {
        return new C11319t0<>(new b(c11234e));
    }

    /* renamed from: c */
    public static <T> C11319t0<T> m40327c(InterfaceC11256e<? super Throwable, ? extends T> interfaceC11256e) {
        return new C11319t0<>(new a(interfaceC11256e));
    }

    @Override // p456rx.p460m.InterfaceC11256e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11245j<? super T> call(AbstractC11245j<? super T> abstractC11245j) {
        C11333a c11333a = new C11333a();
        C11428d c11428d = new C11428d();
        c cVar = new c(abstractC11245j, c11333a, c11428d);
        c11428d.m40673b(cVar);
        abstractC11245j.add(c11428d);
        abstractC11245j.setProducer(c11333a);
        return cVar;
    }
}
