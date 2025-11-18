package p323h.p324a.p329z.p334e.p339e;

import io.reactivex.exceptions.C9240a;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.AbstractC9082s;
import p323h.p324a.InterfaceC9083t;
import p323h.p324a.InterfaceC9084u;
import p323h.p324a.InterfaceC9085v;
import p323h.p324a.p325a0.C9063a;
import p323h.p324a.p327x.InterfaceC9089c;
import p323h.p324a.p328y.InterfaceC9096d;
import p323h.p324a.p329z.p330a.C9101a;
import p323h.p324a.p329z.p330a.EnumC9103c;

/* compiled from: SingleCreate.java */
/* renamed from: h.a.z.e.e.a */
/* loaded from: classes2.dex */
public final class C9151a<T> extends AbstractC9082s<T> {

    /* renamed from: a */
    final InterfaceC9085v<T> f35139a;

    /* compiled from: SingleCreate.java */
    /* renamed from: h.a.z.e.e.a$a */
    static final class a<T> extends AtomicReference<InterfaceC9089c> implements InterfaceC9083t<T>, InterfaceC9089c {

        /* renamed from: f */
        final InterfaceC9084u<? super T> f35140f;

        a(InterfaceC9084u<? super T> interfaceC9084u) {
            this.f35140f = interfaceC9084u;
        }

        /* renamed from: a */
        public void m29312a(Throwable th) {
            if (mo29235c(th)) {
                return;
            }
            C9063a.m29147o(th);
        }

        @Override // p323h.p324a.InterfaceC9083t
        /* renamed from: b */
        public void mo29234b(InterfaceC9096d interfaceC9096d) {
            m29313d(new C9101a(interfaceC9096d));
        }

        @Override // p323h.p324a.InterfaceC9083t
        /* renamed from: c */
        public boolean mo29235c(Throwable th) {
            InterfaceC9089c andSet;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            InterfaceC9089c interfaceC9089c = get();
            EnumC9103c enumC9103c = EnumC9103c.DISPOSED;
            if (interfaceC9089c == enumC9103c || (andSet = getAndSet(enumC9103c)) == enumC9103c) {
                return false;
            }
            try {
                this.f35140f.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.mo29115k();
                }
            }
        }

        /* renamed from: d */
        public void m29313d(InterfaceC9089c interfaceC9089c) {
            EnumC9103c.m29254y(this, interfaceC9089c);
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: k */
        public void mo29115k() {
            EnumC9103c.m29250g(this);
        }

        @Override // p323h.p324a.InterfaceC9083t
        public void onSuccess(T t) {
            InterfaceC9089c andSet;
            InterfaceC9089c interfaceC9089c = get();
            EnumC9103c enumC9103c = EnumC9103c.DISPOSED;
            if (interfaceC9089c == enumC9103c || (andSet = getAndSet(enumC9103c)) == enumC9103c) {
                return;
            }
            try {
                if (t == null) {
                    this.f35140f.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.f35140f.onSuccess(t);
                }
                if (andSet != null) {
                    andSet.mo29115k();
                }
            } catch (Throwable th) {
                if (andSet != null) {
                    andSet.mo29115k();
                }
                throw th;
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: q */
        public boolean mo29116q() {
            return EnumC9103c.m29251u(get());
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }
    }

    public C9151a(InterfaceC9085v<T> interfaceC9085v) {
        this.f35139a = interfaceC9085v;
    }

    @Override // p323h.p324a.AbstractC9082s
    /* renamed from: h */
    protected void mo29129h(InterfaceC9084u<? super T> interfaceC9084u) {
        a aVar = new a(interfaceC9084u);
        interfaceC9084u.mo29132b(aVar);
        try {
            this.f35139a.mo4662a(aVar);
        } catch (Throwable th) {
            C9240a.m30000a(th);
            aVar.m29312a(th);
        }
    }
}
