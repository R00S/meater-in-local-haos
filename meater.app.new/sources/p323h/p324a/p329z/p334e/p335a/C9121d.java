package p323h.p324a.p329z.p334e.p335a;

import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.AbstractC9064b;
import p323h.p324a.AbstractC9081r;
import p323h.p324a.InterfaceC9067d;
import p323h.p324a.InterfaceC9069f;
import p323h.p324a.p327x.InterfaceC9089c;
import p323h.p324a.p329z.p330a.C9106f;
import p323h.p324a.p329z.p330a.EnumC9103c;

/* compiled from: CompletableSubscribeOn.java */
/* renamed from: h.a.z.e.a.d */
/* loaded from: classes2.dex */
public final class C9121d extends AbstractC9064b {

    /* renamed from: a */
    final InterfaceC9069f f34968a;

    /* renamed from: b */
    final AbstractC9081r f34969b;

    /* compiled from: CompletableSubscribeOn.java */
    /* renamed from: h.a.z.e.a.d$a */
    static final class a extends AtomicReference<InterfaceC9089c> implements InterfaceC9067d, InterfaceC9089c, Runnable {

        /* renamed from: f */
        final InterfaceC9067d f34970f;

        /* renamed from: g */
        final C9106f f34971g = new C9106f();

        /* renamed from: h */
        final InterfaceC9069f f34972h;

        a(InterfaceC9067d interfaceC9067d, InterfaceC9069f interfaceC9069f) {
            this.f34970f = interfaceC9067d;
            this.f34972h = interfaceC9069f;
        }

        @Override // p323h.p324a.InterfaceC9067d
        /* renamed from: a */
        public void mo29118a() {
            this.f34970f.mo29118a();
        }

        @Override // p323h.p324a.InterfaceC9067d
        /* renamed from: b */
        public void mo29119b(InterfaceC9089c interfaceC9089c) {
            EnumC9103c.m29248A(this, interfaceC9089c);
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: k */
        public void mo29115k() {
            EnumC9103c.m29250g(this);
            this.f34971g.mo29115k();
        }

        @Override // p323h.p324a.InterfaceC9067d
        public void onError(Throwable th) {
            this.f34970f.onError(th);
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: q */
        public boolean mo29116q() {
            return EnumC9103c.m29251u(get());
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34972h.mo29160b(this);
        }
    }

    public C9121d(InterfaceC9069f interfaceC9069f, AbstractC9081r abstractC9081r) {
        this.f34968a = interfaceC9069f;
        this.f34969b = abstractC9081r;
    }

    @Override // p323h.p324a.AbstractC9064b
    /* renamed from: e */
    protected void mo29113e(InterfaceC9067d interfaceC9067d) {
        a aVar = new a(interfaceC9067d, this.f34968a);
        interfaceC9067d.mo29119b(aVar);
        aVar.f34971g.m29261a(this.f34969b.mo29221b(aVar));
    }
}
