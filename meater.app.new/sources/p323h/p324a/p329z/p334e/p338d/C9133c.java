package p323h.p324a.p329z.p334e.p338d;

import io.reactivex.exceptions.C9240a;
import io.reactivex.exceptions.CompositeException;
import p323h.p324a.InterfaceC9079p;
import p323h.p324a.InterfaceC9080q;
import p323h.p324a.p325a0.C9063a;
import p323h.p324a.p327x.InterfaceC9089c;
import p323h.p324a.p328y.InterfaceC9093a;
import p323h.p324a.p328y.InterfaceC9097e;
import p323h.p324a.p329z.p330a.EnumC9103c;

/* compiled from: ObservableDoOnEach.java */
/* renamed from: h.a.z.e.d.c */
/* loaded from: classes2.dex */
public final class C9133c<T> extends AbstractC9131a<T, T> {

    /* renamed from: g */
    final InterfaceC9097e<? super T> f35012g;

    /* renamed from: h */
    final InterfaceC9097e<? super Throwable> f35013h;

    /* renamed from: i */
    final InterfaceC9093a f35014i;

    /* renamed from: j */
    final InterfaceC9093a f35015j;

    /* compiled from: ObservableDoOnEach.java */
    /* renamed from: h.a.z.e.d.c$a */
    static final class a<T> implements InterfaceC9080q<T>, InterfaceC9089c {

        /* renamed from: f */
        final InterfaceC9080q<? super T> f35016f;

        /* renamed from: g */
        final InterfaceC9097e<? super T> f35017g;

        /* renamed from: h */
        final InterfaceC9097e<? super Throwable> f35018h;

        /* renamed from: i */
        final InterfaceC9093a f35019i;

        /* renamed from: j */
        final InterfaceC9093a f35020j;

        /* renamed from: k */
        InterfaceC9089c f35021k;

        /* renamed from: l */
        boolean f35022l;

        a(InterfaceC9080q<? super T> interfaceC9080q, InterfaceC9097e<? super T> interfaceC9097e, InterfaceC9097e<? super Throwable> interfaceC9097e2, InterfaceC9093a interfaceC9093a, InterfaceC9093a interfaceC9093a2) {
            this.f35016f = interfaceC9080q;
            this.f35017g = interfaceC9097e;
            this.f35018h = interfaceC9097e2;
            this.f35019i = interfaceC9093a;
            this.f35020j = interfaceC9093a2;
        }

        @Override // p323h.p324a.InterfaceC9080q
        /* renamed from: a */
        public void mo29218a() {
            if (this.f35022l) {
                return;
            }
            try {
                this.f35019i.run();
                this.f35022l = true;
                this.f35016f.mo29218a();
                try {
                    this.f35020j.run();
                } catch (Throwable th) {
                    C9240a.m30000a(th);
                    C9063a.m29147o(th);
                }
            } catch (Throwable th2) {
                C9240a.m30000a(th2);
                onError(th2);
            }
        }

        @Override // p323h.p324a.InterfaceC9080q
        /* renamed from: b */
        public void mo29219b(InterfaceC9089c interfaceC9089c) {
            if (EnumC9103c.m29249D(this.f35021k, interfaceC9089c)) {
                this.f35021k = interfaceC9089c;
                this.f35016f.mo29219b(this);
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: k */
        public void mo29115k() {
            this.f35021k.mo29115k();
        }

        @Override // p323h.p324a.InterfaceC9080q
        public void onError(Throwable th) {
            if (this.f35022l) {
                C9063a.m29147o(th);
                return;
            }
            this.f35022l = true;
            try {
                this.f35018h.mo7420a(th);
            } catch (Throwable th2) {
                C9240a.m30000a(th2);
                th = new CompositeException(th, th2);
            }
            this.f35016f.onError(th);
            try {
                this.f35020j.run();
            } catch (Throwable th3) {
                C9240a.m30000a(th3);
                C9063a.m29147o(th3);
            }
        }

        @Override // p323h.p324a.InterfaceC9080q
        public void onNext(T t) {
            if (this.f35022l) {
                return;
            }
            try {
                this.f35017g.mo7420a(t);
                this.f35016f.onNext(t);
            } catch (Throwable th) {
                C9240a.m30000a(th);
                this.f35021k.mo29115k();
                onError(th);
            }
        }

        @Override // p323h.p324a.p327x.InterfaceC9089c
        /* renamed from: q */
        public boolean mo29116q() {
            return this.f35021k.mo29116q();
        }
    }

    public C9133c(InterfaceC9079p<T> interfaceC9079p, InterfaceC9097e<? super T> interfaceC9097e, InterfaceC9097e<? super Throwable> interfaceC9097e2, InterfaceC9093a interfaceC9093a, InterfaceC9093a interfaceC9093a2) {
        super(interfaceC9079p);
        this.f35012g = interfaceC9097e;
        this.f35013h = interfaceC9097e2;
        this.f35014i = interfaceC9093a;
        this.f35015j = interfaceC9093a2;
    }

    @Override // p323h.p324a.AbstractC9076m
    /* renamed from: x */
    public void mo29214x(InterfaceC9080q<? super T> interfaceC9080q) {
        this.f35009f.mo29199a(new a(interfaceC9080q, this.f35012g, this.f35013h, this.f35014i, this.f35015j));
    }
}
