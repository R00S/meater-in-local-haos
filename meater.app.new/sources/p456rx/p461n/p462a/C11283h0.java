package p456rx.p461n.p462a;

import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.exceptions.C11240a;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p461n.p463b.C11334b;
import p456rx.p471q.C11409c;

/* compiled from: OperatorAny.java */
/* renamed from: rx.n.a.h0 */
/* loaded from: classes3.dex */
public final class C11283h0<T> implements C11234e.b<Boolean, T> {

    /* renamed from: f */
    final InterfaceC11256e<? super T, Boolean> f42311f;

    /* renamed from: g */
    final boolean f42312g;

    /* compiled from: OperatorAny.java */
    /* renamed from: rx.n.a.h0$a */
    class a extends AbstractC11245j<T> {

        /* renamed from: f */
        boolean f42313f;

        /* renamed from: g */
        boolean f42314g;

        /* renamed from: h */
        final /* synthetic */ C11334b f42315h;

        /* renamed from: i */
        final /* synthetic */ AbstractC11245j f42316i;

        a(C11334b c11334b, AbstractC11245j abstractC11245j) {
            this.f42315h = c11334b;
            this.f42316i = abstractC11245j;
        }

        @Override // p456rx.InterfaceC11241f
        public void onCompleted() {
            if (this.f42314g) {
                return;
            }
            this.f42314g = true;
            if (this.f42313f) {
                this.f42315h.m40377b(Boolean.FALSE);
            } else {
                this.f42315h.m40377b(Boolean.valueOf(C11283h0.this.f42312g));
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onError(Throwable th) {
            if (this.f42314g) {
                C11409c.m40578j(th);
            } else {
                this.f42314g = true;
                this.f42316i.onError(th);
            }
        }

        @Override // p456rx.InterfaceC11241f
        public void onNext(T t) {
            if (this.f42314g) {
                return;
            }
            this.f42313f = true;
            try {
                if (C11283h0.this.f42311f.call(t).booleanValue()) {
                    this.f42314g = true;
                    this.f42315h.m40377b(Boolean.valueOf(true ^ C11283h0.this.f42312g));
                    unsubscribe();
                }
            } catch (Throwable th) {
                C11240a.m40142g(th, this, t);
            }
        }
    }

    public C11283h0(InterfaceC11256e<? super T, Boolean> interfaceC11256e, boolean z) {
        this.f42311f = interfaceC11256e;
        this.f42312g = z;
    }

    @Override // p456rx.p460m.InterfaceC11256e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11245j<? super T> call(AbstractC11245j<? super Boolean> abstractC11245j) {
        C11334b c11334b = new C11334b(abstractC11245j);
        a aVar = new a(c11334b, abstractC11245j);
        abstractC11245j.add(aVar);
        abstractC11245j.setProducer(c11334b);
        return aVar;
    }
}
