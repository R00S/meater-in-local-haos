package p456rx.p461n.p462a;

import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.InterfaceC11242g;

/* compiled from: OperatorSkip.java */
/* renamed from: rx.n.a.x0 */
/* loaded from: classes3.dex */
public final class C11328x0<T> implements C11234e.b<T, T> {

    /* renamed from: f */
    final int f42661f;

    /* compiled from: OperatorSkip.java */
    /* renamed from: rx.n.a.x0$a */
    class a extends AbstractC11245j<T> {

        /* renamed from: f */
        int f42662f;

        /* renamed from: g */
        final /* synthetic */ AbstractC11245j f42663g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC11245j abstractC11245j, AbstractC11245j abstractC11245j2) {
            super(abstractC11245j);
            this.f42663g = abstractC11245j2;
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            this.f42663g.onCompleted();
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            this.f42663g.onError(th);
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            int i2 = this.f42662f;
            if (i2 >= C11328x0.this.f42661f) {
                this.f42663g.onNext(t);
            } else {
                this.f42662f = i2 + 1;
            }
        }

        @Override // p456rx.AbstractC11245j
        public void setProducer(InterfaceC11242g interfaceC11242g) {
            this.f42663g.setProducer(interfaceC11242g);
            interfaceC11242g.request(C11328x0.this.f42661f);
        }
    }

    public C11328x0(int i2) {
        if (i2 >= 0) {
            this.f42661f = i2;
            return;
        }
        throw new IllegalArgumentException("n >= 0 required but it was " + i2);
    }

    @Override // p456rx.p460m.InterfaceC11256e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11245j<? super T> call(AbstractC11245j<? super T> abstractC11245j) {
        return new a(abstractC11245j, abstractC11245j);
    }
}
