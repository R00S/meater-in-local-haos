package p456rx.p461n.p462a;

import java.util.Arrays;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.InterfaceC11241f;
import p456rx.exceptions.C11240a;
import p456rx.exceptions.CompositeException;
import p456rx.p471q.C11409c;

/* compiled from: OnSubscribeDoOnEach.java */
/* renamed from: rx.n.a.n */
/* loaded from: classes3.dex */
public class C11300n<T> implements C11234e.a<T> {

    /* renamed from: f */
    private final InterfaceC11241f<? super T> f42431f;

    /* renamed from: g */
    private final C11234e<T> f42432g;

    /* compiled from: OnSubscribeDoOnEach.java */
    /* renamed from: rx.n.a.n$a */
    private static final class a<T> extends AbstractC11245j<T> {

        /* renamed from: f */
        private final AbstractC11245j<? super T> f42433f;

        /* renamed from: g */
        private final InterfaceC11241f<? super T> f42434g;

        /* renamed from: h */
        private boolean f42435h;

        a(AbstractC11245j<? super T> abstractC11245j, InterfaceC11241f<? super T> interfaceC11241f) {
            super(abstractC11245j);
            this.f42433f = abstractC11245j;
            this.f42434g = interfaceC11241f;
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            if (this.f42435h) {
                return;
            }
            try {
                this.f42434g.onCompleted();
                this.f42435h = true;
                this.f42433f.onCompleted();
            } catch (Throwable th) {
                C11240a.m40141f(th, this);
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            if (this.f42435h) {
                C11409c.m40578j(th);
                return;
            }
            this.f42435h = true;
            try {
                this.f42434g.onError(th);
                this.f42433f.onError(th);
            } catch (Throwable th2) {
                C11240a.m40140e(th2);
                this.f42433f.onError(new CompositeException(Arrays.asList(th, th2)));
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            if (this.f42435h) {
                return;
            }
            try {
                this.f42434g.onNext(t);
                this.f42433f.onNext(t);
            } catch (Throwable th) {
                C11240a.m40142g(th, this, t);
            }
        }
    }

    public C11300n(C11234e<T> c11234e, InterfaceC11241f<? super T> interfaceC11241f) {
        this.f42432g = c11234e;
        this.f42431f = interfaceC11241f;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11245j<? super T> abstractC11245j) {
        this.f42432g.m40089c1(new a(abstractC11245j, this.f42431f));
    }
}
