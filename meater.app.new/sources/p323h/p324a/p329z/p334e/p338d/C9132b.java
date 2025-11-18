package p323h.p324a.p329z.p334e.p338d;

import io.reactivex.exceptions.C9240a;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.AbstractC9076m;
import p323h.p324a.InterfaceC9077n;
import p323h.p324a.InterfaceC9078o;
import p323h.p324a.InterfaceC9080q;
import p323h.p324a.p325a0.C9063a;
import p323h.p324a.p327x.InterfaceC9089c;
import p323h.p324a.p329z.p330a.EnumC9103c;

/* compiled from: ObservableCreate.java */
/* renamed from: h.a.z.e.d.b */
/* loaded from: classes2.dex */
public final class C9132b<T> extends AbstractC9076m<T> {

    /* renamed from: f */
    final InterfaceC9078o<T> f35010f;

    /* compiled from: ObservableCreate.java */
    /* renamed from: h.a.z.e.d.b$a */
    static final class a<T> extends AtomicReference<InterfaceC9089c> implements InterfaceC9077n<T>, InterfaceC9089c {

        /* renamed from: f */
        final InterfaceC9080q<? super T> f35011f;

        a(InterfaceC9080q<? super T> interfaceC9080q) {
            this.f35011f = interfaceC9080q;
        }

        @Override // p323h.p324a.InterfaceC9077n
        /* renamed from: a */
        public void mo29217a(InterfaceC9089c interfaceC9089c) {
            EnumC9103c.m29254y(this, interfaceC9089c);
        }

        /* renamed from: b */
        public void m29281b(Throwable th) {
            if (m29282c(th)) {
                return;
            }
            C9063a.m29147o(th);
        }

        /* renamed from: c */
        public boolean m29282c(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (mo29116q()) {
                return false;
            }
            try {
                this.f35011f.onError(th);
                mo29115k();
                return true;
            } catch (Throwable th2) {
                mo29115k();
                throw th2;
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: k */
        public void mo29115k() {
            EnumC9103c.m29250g(this);
        }

        @Override // p323h.p324a.InterfaceC9070g
        public void onNext(T t) {
            if (t == null) {
                m29281b(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                if (mo29116q()) {
                    return;
                }
                this.f35011f.onNext(t);
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

    public C9132b(InterfaceC9078o<T> interfaceC9078o) {
        this.f35010f = interfaceC9078o;
    }

    @Override // p323h.p324a.AbstractC9076m
    /* renamed from: x */
    protected void mo29214x(InterfaceC9080q<? super T> interfaceC9080q) {
        a aVar = new a(interfaceC9080q);
        interfaceC9080q.mo29219b(aVar);
        try {
            this.f35010f.mo4659a(aVar);
        } catch (Throwable th) {
            C9240a.m30000a(th);
            aVar.m29281b(th);
        }
    }
}
