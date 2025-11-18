package p456rx.p461n.p462a;

import p456rx.AbstractC11244i;
import p456rx.Single;
import p456rx.exceptions.C11240a;
import p456rx.p460m.InterfaceC11256e;

/* compiled from: SingleOperatorOnErrorResumeNext.java */
/* renamed from: rx.n.a.q1 */
/* loaded from: classes3.dex */
public final class C11311q1<T> implements Single.InterfaceC11229j<T> {

    /* renamed from: f */
    private final Single<? extends T> f42537f;

    /* renamed from: g */
    final InterfaceC11256e<Throwable, ? extends Single<? extends T>> f42538g;

    /* compiled from: SingleOperatorOnErrorResumeNext.java */
    /* renamed from: rx.n.a.q1$a */
    class a extends AbstractC11244i<T> {

        /* renamed from: g */
        final /* synthetic */ AbstractC11244i f42539g;

        a(AbstractC11244i abstractC11244i) {
            this.f42539g = abstractC11244i;
        }

        @Override // p456rx.AbstractC11244i
        /* renamed from: c */
        public void mo29130c(T t) {
            this.f42539g.mo29130c(t);
        }

        @Override // p456rx.AbstractC11244i
        public void onError(Throwable th) {
            try {
                C11311q1.this.f42538g.call(th).m39928t(this.f42539g);
            } catch (Throwable th2) {
                C11240a.m40143h(th2, this.f42539g);
            }
        }
    }

    private C11311q1(Single<? extends T> single, InterfaceC11256e<Throwable, ? extends Single<? extends T>> interfaceC11256e) {
        if (single == null) {
            throw new NullPointerException("originalSingle must not be null");
        }
        if (interfaceC11256e == null) {
            throw new NullPointerException("resumeFunctionInCaseOfError must not be null");
        }
        this.f42537f = single;
        this.f42538g = interfaceC11256e;
    }

    /* renamed from: b */
    public static <T> C11311q1<T> m40301b(Single<? extends T> single, InterfaceC11256e<Throwable, ? extends Single<? extends T>> interfaceC11256e) {
        return new C11311q1<>(single, interfaceC11256e);
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11244i<? super T> abstractC11244i) {
        a aVar = new a(abstractC11244i);
        abstractC11244i.m40149b(aVar);
        this.f42537f.m39928t(aVar);
    }
}
