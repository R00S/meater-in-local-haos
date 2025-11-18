package p323h.p324a.p329z.p334e.p335a;

import p323h.p324a.AbstractC9064b;
import p323h.p324a.InterfaceC9067d;
import p323h.p324a.InterfaceC9084u;
import p323h.p324a.InterfaceC9086w;
import p323h.p324a.p327x.InterfaceC9089c;

/* compiled from: CompletableFromSingle.java */
/* renamed from: h.a.z.e.a.c */
/* loaded from: classes2.dex */
public final class C9120c<T> extends AbstractC9064b {

    /* renamed from: a */
    final InterfaceC9086w<T> f34966a;

    /* compiled from: CompletableFromSingle.java */
    /* renamed from: h.a.z.e.a.c$a */
    static final class a<T> implements InterfaceC9084u<T> {

        /* renamed from: f */
        final InterfaceC9067d f34967f;

        a(InterfaceC9067d interfaceC9067d) {
            this.f34967f = interfaceC9067d;
        }

        @Override // p323h.p324a.InterfaceC9084u
        /* renamed from: b */
        public void mo29132b(InterfaceC9089c interfaceC9089c) {
            this.f34967f.mo29119b(interfaceC9089c);
        }

        @Override // p323h.p324a.InterfaceC9084u
        public void onError(Throwable th) {
            this.f34967f.onError(th);
        }

        @Override // p323h.p324a.InterfaceC9084u
        public void onSuccess(T t) {
            this.f34967f.mo29118a();
        }
    }

    public C9120c(InterfaceC9086w<T> interfaceC9086w) {
        this.f34966a = interfaceC9086w;
    }

    @Override // p323h.p324a.AbstractC9064b
    /* renamed from: e */
    protected void mo29113e(InterfaceC9067d interfaceC9067d) {
        this.f34966a.mo29228b(new a(interfaceC9067d));
    }
}
