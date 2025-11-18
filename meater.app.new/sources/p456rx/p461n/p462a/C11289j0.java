package p456rx.p461n.p462a;

import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.InterfaceC11242g;
import p456rx.exceptions.C11240a;
import p456rx.exceptions.OnErrorThrowable;
import p456rx.p471q.C11409c;

/* compiled from: OperatorCast.java */
/* renamed from: rx.n.a.j0 */
/* loaded from: classes3.dex */
public class C11289j0<T, R> implements C11234e.b<R, T> {

    /* renamed from: f */
    final Class<R> f42352f;

    /* compiled from: OperatorCast.java */
    /* renamed from: rx.n.a.j0$a */
    static final class a<T, R> extends AbstractC11245j<T> {

        /* renamed from: f */
        final AbstractC11245j<? super R> f42353f;

        /* renamed from: g */
        final Class<R> f42354g;

        /* renamed from: h */
        boolean f42355h;

        public a(AbstractC11245j<? super R> abstractC11245j, Class<R> cls) {
            this.f42353f = abstractC11245j;
            this.f42354g = cls;
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            if (this.f42355h) {
                return;
            }
            this.f42353f.onCompleted();
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            if (this.f42355h) {
                C11409c.m40578j(th);
            } else {
                this.f42355h = true;
                this.f42353f.onError(th);
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            try {
                this.f42353f.onNext(this.f42354g.cast(t));
            } catch (Throwable th) {
                C11240a.m40140e(th);
                unsubscribe();
                onError(OnErrorThrowable.m40132a(th, t));
            }
        }

        @Override // p456rx.AbstractC11245j
        public void setProducer(InterfaceC11242g interfaceC11242g) {
            this.f42353f.setProducer(interfaceC11242g);
        }
    }

    public C11289j0(Class<R> cls) {
        this.f42352f = cls;
    }

    @Override // p456rx.p460m.InterfaceC11256e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11245j<? super T> call(AbstractC11245j<? super R> abstractC11245j) {
        a aVar = new a(abstractC11245j, this.f42352f);
        abstractC11245j.add(aVar);
        return aVar;
    }
}
