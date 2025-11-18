package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class S extends A {
    protected S() {
        this.f33564a.add(Z.ADD);
        this.f33564a.add(Z.DIVIDE);
        this.f33564a.add(Z.MODULUS);
        this.f33564a.add(Z.MULTIPLY);
        this.f33564a.add(Z.NEGATE);
        this.f33564a.add(Z.POST_DECREMENT);
        this.f33564a.add(Z.POST_INCREMENT);
        this.f33564a.add(Z.PRE_DECREMENT);
        this.f33564a.add(Z.PRE_INCREMENT);
        this.f33564a.add(Z.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC2574s b(String str, Z2 z22, List<InterfaceC2574s> list) {
        switch (V.f33903a[Y1.c(str).ordinal()]) {
            case 1:
                Y1.f(Z.ADD, 2, list);
                InterfaceC2574s interfaceC2574sB = z22.b(list.get(0));
                InterfaceC2574s interfaceC2574sB2 = z22.b(list.get(1));
                if (!(interfaceC2574sB instanceof InterfaceC2527m) && !(interfaceC2574sB instanceof C2590u) && !(interfaceC2574sB2 instanceof InterfaceC2527m) && !(interfaceC2574sB2 instanceof C2590u)) {
                    return new C2511k(Double.valueOf(interfaceC2574sB.h().doubleValue() + interfaceC2574sB2.h().doubleValue()));
                }
                return new C2590u(interfaceC2574sB.i() + interfaceC2574sB2.i());
            case 2:
                Y1.f(Z.DIVIDE, 2, list);
                return new C2511k(Double.valueOf(z22.b(list.get(0)).h().doubleValue() / z22.b(list.get(1)).h().doubleValue()));
            case 3:
                Y1.f(Z.MODULUS, 2, list);
                return new C2511k(Double.valueOf(z22.b(list.get(0)).h().doubleValue() % z22.b(list.get(1)).h().doubleValue()));
            case 4:
                Y1.f(Z.MULTIPLY, 2, list);
                return new C2511k(Double.valueOf(z22.b(list.get(0)).h().doubleValue() * z22.b(list.get(1)).h().doubleValue()));
            case 5:
                Y1.f(Z.NEGATE, 1, list);
                return new C2511k(Double.valueOf(z22.b(list.get(0)).h().doubleValue() * (-1.0d)));
            case 6:
            case 7:
                Y1.g(str, 2, list);
                InterfaceC2574s interfaceC2574sB3 = z22.b(list.get(0));
                z22.b(list.get(1));
                return interfaceC2574sB3;
            case 8:
            case 9:
                Y1.g(str, 1, list);
                return z22.b(list.get(0));
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                Y1.f(Z.SUBTRACT, 2, list);
                return new C2511k(Double.valueOf(z22.b(list.get(0)).h().doubleValue() + new C2511k(Double.valueOf(z22.b(list.get(1)).h().doubleValue() * (-1.0d))).h().doubleValue()));
            default:
                return super.a(str);
        }
    }
}
