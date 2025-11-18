package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class A7 extends AbstractC2535n {

    /* renamed from: D, reason: collision with root package name */
    private C2436b f33660D;

    public A7(C2436b c2436b) {
        super("internal.registerCallback");
        this.f33660D = c2436b;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2535n
    public final InterfaceC2574s a(Z2 z22, List<InterfaceC2574s> list) {
        Y1.g(this.f34216B, 3, list);
        String strI = z22.b(list.get(0)).i();
        InterfaceC2574s interfaceC2574sB = z22.b(list.get(1));
        if (!(interfaceC2574sB instanceof C2582t)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        InterfaceC2574s interfaceC2574sB2 = z22.b(list.get(2));
        if (!(interfaceC2574sB2 instanceof r)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        r rVar = (r) interfaceC2574sB2;
        if (!rVar.r("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.f33660D.c(strI, rVar.r("priority") ? Y1.i(rVar.c("priority").h().doubleValue()) : 1000, (C2582t) interfaceC2574sB, rVar.c("type").i());
        return InterfaceC2574s.f34292p;
    }
}
