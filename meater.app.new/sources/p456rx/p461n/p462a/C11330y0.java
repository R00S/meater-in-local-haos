package p456rx.p461n.p462a;

import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.exceptions.C11240a;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p460m.InterfaceC11257f;

/* compiled from: OperatorSkipWhile.java */
/* renamed from: rx.n.a.y0 */
/* loaded from: classes3.dex */
public final class C11330y0<T> implements C11234e.b<T, T> {

    /* renamed from: f */
    final InterfaceC11257f<? super T, Integer, Boolean> f42697f;

    /* compiled from: OperatorSkipWhile.java */
    /* renamed from: rx.n.a.y0$a */
    class a extends AbstractC11245j<T> {

        /* renamed from: f */
        boolean f42698f;

        /* renamed from: g */
        int f42699g;

        /* renamed from: h */
        final /* synthetic */ AbstractC11245j f42700h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC11245j abstractC11245j, AbstractC11245j abstractC11245j2) {
            super(abstractC11245j);
            this.f42700h = abstractC11245j2;
            this.f42698f = true;
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            this.f42700h.onCompleted();
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            this.f42700h.onError(th);
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            if (!this.f42698f) {
                this.f42700h.onNext(t);
                return;
            }
            try {
                InterfaceC11257f<? super T, Integer, Boolean> interfaceC11257f = C11330y0.this.f42697f;
                int i2 = this.f42699g;
                this.f42699g = i2 + 1;
                if (interfaceC11257f.mo6865a(t, Integer.valueOf(i2)).booleanValue()) {
                    request(1L);
                } else {
                    this.f42698f = false;
                    this.f42700h.onNext(t);
                }
            } catch (Throwable th) {
                C11240a.m40142g(th, this.f42700h, t);
            }
        }
    }

    /* compiled from: OperatorSkipWhile.java */
    /* renamed from: rx.n.a.y0$b */
    static class b implements InterfaceC11257f<T, Integer, Boolean> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC11256e f42702f;

        b(InterfaceC11256e interfaceC11256e) {
            this.f42702f = interfaceC11256e;
        }

        @Override // p456rx.p460m.InterfaceC11257f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean mo6865a(T t, Integer num) {
            return (Boolean) this.f42702f.call(t);
        }
    }

    public C11330y0(InterfaceC11257f<? super T, Integer, Boolean> interfaceC11257f) {
        this.f42697f = interfaceC11257f;
    }

    /* renamed from: b */
    public static <T> InterfaceC11257f<T, Integer, Boolean> m40362b(InterfaceC11256e<? super T, Boolean> interfaceC11256e) {
        return new b(interfaceC11256e);
    }

    @Override // p456rx.p460m.InterfaceC11256e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11245j<? super T> call(AbstractC11245j<? super T> abstractC11245j) {
        return new a(abstractC11245j, abstractC11245j);
    }
}
