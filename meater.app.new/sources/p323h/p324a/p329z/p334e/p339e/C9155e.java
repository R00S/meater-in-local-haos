package p323h.p324a.p329z.p334e.p339e;

import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.AbstractC9081r;
import p323h.p324a.AbstractC9082s;
import p323h.p324a.InterfaceC9084u;
import p323h.p324a.InterfaceC9086w;
import p323h.p324a.p327x.InterfaceC9089c;
import p323h.p324a.p329z.p330a.C9106f;
import p323h.p324a.p329z.p330a.EnumC9103c;

/* compiled from: SingleSubscribeOn.java */
/* renamed from: h.a.z.e.e.e */
/* loaded from: classes2.dex */
public final class C9155e<T> extends AbstractC9082s<T> {

    /* renamed from: a */
    final InterfaceC9086w<? extends T> f35152a;

    /* renamed from: b */
    final AbstractC9081r f35153b;

    /* compiled from: SingleSubscribeOn.java */
    /* renamed from: h.a.z.e.e.e$a */
    static final class a<T> extends AtomicReference<InterfaceC9089c> implements InterfaceC9084u<T>, InterfaceC9089c, Runnable {

        /* renamed from: f */
        final InterfaceC9084u<? super T> f35154f;

        /* renamed from: g */
        final C9106f f35155g = new C9106f();

        /* renamed from: h */
        final InterfaceC9086w<? extends T> f35156h;

        a(InterfaceC9084u<? super T> interfaceC9084u, InterfaceC9086w<? extends T> interfaceC9086w) {
            this.f35154f = interfaceC9084u;
            this.f35156h = interfaceC9086w;
        }

        @Override // p323h.p324a.InterfaceC9084u
        /* renamed from: b */
        public void mo29132b(InterfaceC9089c interfaceC9089c) {
            EnumC9103c.m29248A(this, interfaceC9089c);
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: k */
        public void mo29115k() {
            EnumC9103c.m29250g(this);
            this.f35155g.mo29115k();
        }

        @Override // p323h.p324a.InterfaceC9084u
        public void onError(Throwable th) {
            this.f35154f.onError(th);
        }

        @Override // p323h.p324a.InterfaceC9084u
        public void onSuccess(T t) {
            this.f35154f.onSuccess(t);
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: q */
        public boolean mo29116q() {
            return EnumC9103c.m29251u(get());
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35156h.mo29228b(this);
        }
    }

    public C9155e(InterfaceC9086w<? extends T> interfaceC9086w, AbstractC9081r abstractC9081r) {
        this.f35152a = interfaceC9086w;
        this.f35153b = abstractC9081r;
    }

    @Override // p323h.p324a.AbstractC9082s
    /* renamed from: h */
    protected void mo29129h(InterfaceC9084u<? super T> interfaceC9084u) {
        a aVar = new a(interfaceC9084u, this.f35152a);
        interfaceC9084u.mo29132b(aVar);
        aVar.f35155g.m29261a(this.f35153b.mo29221b(aVar));
    }
}
