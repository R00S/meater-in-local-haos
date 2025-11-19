package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private final A1 f33675a;

    /* renamed from: b, reason: collision with root package name */
    private Z2 f33676b;

    /* renamed from: c, reason: collision with root package name */
    private C2454d f33677c;

    /* renamed from: d, reason: collision with root package name */
    private final C2436b f33678d;

    public C() {
        this(new A1());
    }

    public static /* synthetic */ AbstractC2535n b(C c10) {
        return new C2627y4(c10.f33677c);
    }

    public static /* synthetic */ AbstractC2535n f(C c10) {
        return new A7(c10.f33678d);
    }

    public final C2454d a() {
        return this.f33677c;
    }

    public final void c(P2 p22) throws zzc {
        AbstractC2535n abstractC2535n;
        try {
            this.f33676b = this.f33675a.f33569b.d();
            if (this.f33675a.a(this.f33676b, (Q2[]) p22.M().toArray(new Q2[0])) instanceof C2519l) {
                throw new IllegalStateException("Program loading failed");
            }
            for (O2 o22 : p22.K().M()) {
                List<Q2> listM = o22.M();
                String strL = o22.L();
                Iterator<Q2> it = listM.iterator();
                while (it.hasNext()) {
                    InterfaceC2574s interfaceC2574sA = this.f33675a.a(this.f33676b, it.next());
                    if (!(interfaceC2574sA instanceof r)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    Z2 z22 = this.f33676b;
                    if (z22.g(strL)) {
                        InterfaceC2574s interfaceC2574sC = z22.c(strL);
                        if (!(interfaceC2574sC instanceof AbstractC2535n)) {
                            throw new IllegalStateException("Invalid function name: " + strL);
                        }
                        abstractC2535n = (AbstractC2535n) interfaceC2574sC;
                    } else {
                        abstractC2535n = null;
                    }
                    if (abstractC2535n == null) {
                        throw new IllegalStateException("Rule function is undefined: " + strL);
                    }
                    abstractC2535n.a(this.f33676b, Collections.singletonList(interfaceC2574sA));
                }
            }
        } catch (Throwable th) {
            throw new zzc(th);
        }
    }

    public final void d(String str, Callable<? extends AbstractC2535n> callable) {
        this.f33675a.b(str, callable);
    }

    public final boolean e(C2463e c2463e) {
        try {
            this.f33677c.b(c2463e);
            this.f33675a.f33570c.h("runtime.counter", new C2511k(Double.valueOf(0.0d)));
            this.f33678d.b(this.f33676b.d(), this.f33677c);
            if (h()) {
                return true;
            }
            return g();
        } catch (Throwable th) {
            throw new zzc(th);
        }
    }

    public final boolean g() {
        return !this.f33677c.f().isEmpty();
    }

    public final boolean h() {
        return !this.f33677c.d().equals(this.f33677c.a());
    }

    private C(A1 a12) {
        this.f33675a = a12;
        this.f33676b = a12.f33569b.d();
        this.f33677c = new C2454d();
        this.f33678d = new C2436b();
        a12.b("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C.f(this.f34042a);
            }
        });
        a12.b("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.D0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C.b(this.f33689a);
            }
        });
    }
}
