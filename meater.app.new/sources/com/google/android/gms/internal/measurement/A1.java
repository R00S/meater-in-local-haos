package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class A1 {

    /* renamed from: a, reason: collision with root package name */
    private final E f33568a;

    /* renamed from: b, reason: collision with root package name */
    final Z2 f33569b;

    /* renamed from: c, reason: collision with root package name */
    final Z2 f33570c;

    /* renamed from: d, reason: collision with root package name */
    private final X4 f33571d;

    public A1() {
        E e10 = new E();
        this.f33568a = e10;
        Z2 z22 = new Z2(null, e10);
        this.f33570c = z22;
        this.f33569b = z22.d();
        X4 x42 = new X4();
        this.f33571d = x42;
        z22.h("require", new D7(x42));
        x42.b("internal.platform", new Callable() { // from class: com.google.android.gms.internal.measurement.e1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C7();
            }
        });
        z22.h("runtime.counter", new C2511k(Double.valueOf(0.0d)));
    }

    public final InterfaceC2574s a(Z2 z22, Q2... q2Arr) {
        InterfaceC2574s interfaceC2574sA = InterfaceC2574s.f34292p;
        for (Q2 q22 : q2Arr) {
            interfaceC2574sA = C2432a4.a(q22);
            Y1.b(this.f33570c);
            if ((interfaceC2574sA instanceof C2598v) || (interfaceC2574sA instanceof C2582t)) {
                interfaceC2574sA = this.f33568a.a(z22, interfaceC2574sA);
            }
        }
        return interfaceC2574sA;
    }

    public final void b(String str, Callable<? extends AbstractC2535n> callable) {
        this.f33571d.b(str, callable);
    }
}
