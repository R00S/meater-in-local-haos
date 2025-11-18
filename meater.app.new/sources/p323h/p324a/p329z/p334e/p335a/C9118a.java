package p323h.p324a.p329z.p334e.p335a;

import io.reactivex.exceptions.C9240a;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.AbstractC9064b;
import p323h.p324a.InterfaceC9066c;
import p323h.p324a.InterfaceC9067d;
import p323h.p324a.InterfaceC9068e;
import p323h.p324a.p325a0.C9063a;
import p323h.p324a.p327x.InterfaceC9089c;
import p323h.p324a.p328y.InterfaceC9096d;
import p323h.p324a.p329z.p330a.C9101a;
import p323h.p324a.p329z.p330a.EnumC9103c;

/* compiled from: CompletableCreate.java */
/* renamed from: h.a.z.e.a.a */
/* loaded from: classes2.dex */
public final class C9118a extends AbstractC9064b {

    /* renamed from: a */
    final InterfaceC9068e f34963a;

    /* compiled from: CompletableCreate.java */
    /* renamed from: h.a.z.e.a.a$a */
    static final class a extends AtomicReference<InterfaceC9089c> implements InterfaceC9066c, InterfaceC9089c {

        /* renamed from: f */
        final InterfaceC9067d f34964f;

        a(InterfaceC9067d interfaceC9067d) {
            this.f34964f = interfaceC9067d;
        }

        @Override // p323h.p324a.InterfaceC9066c
        /* renamed from: a */
        public void mo29169a() {
            InterfaceC9089c andSet;
            InterfaceC9089c interfaceC9089c = get();
            EnumC9103c enumC9103c = EnumC9103c.DISPOSED;
            if (interfaceC9089c == enumC9103c || (andSet = getAndSet(enumC9103c)) == enumC9103c) {
                return;
            }
            try {
                this.f34964f.mo29118a();
            } finally {
                if (andSet != null) {
                    andSet.mo29115k();
                }
            }
        }

        @Override // p323h.p324a.InterfaceC9066c
        /* renamed from: b */
        public void mo29170b(InterfaceC9096d interfaceC9096d) {
            m29276d(new C9101a(interfaceC9096d));
        }

        @Override // p323h.p324a.InterfaceC9066c
        /* renamed from: c */
        public boolean mo29171c(Throwable th) {
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
                this.f34964f.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.mo29115k();
                }
            }
        }

        /* renamed from: d */
        public void m29276d(InterfaceC9089c interfaceC9089c) {
            EnumC9103c.m29254y(this, interfaceC9089c);
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: k */
        public void mo29115k() {
            EnumC9103c.m29250g(this);
        }

        @Override // p323h.p324a.InterfaceC9066c
        public void onError(Throwable th) {
            if (mo29171c(th)) {
                return;
            }
            C9063a.m29147o(th);
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

    public C9118a(InterfaceC9068e interfaceC9068e) {
        this.f34963a = interfaceC9068e;
    }

    @Override // p323h.p324a.AbstractC9064b
    /* renamed from: e */
    protected void mo29113e(InterfaceC9067d interfaceC9067d) {
        a aVar = new a(interfaceC9067d);
        interfaceC9067d.mo29119b(aVar);
        try {
            this.f34963a.mo7421a(aVar);
        } catch (Throwable th) {
            C9240a.m30000a(th);
            aVar.onError(th);
        }
    }
}
