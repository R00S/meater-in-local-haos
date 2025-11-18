package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class L extends A {
    protected L() {
        this.f33564a.add(Z.FOR_IN);
        this.f33564a.add(Z.FOR_IN_CONST);
        this.f33564a.add(Z.FOR_IN_LET);
        this.f33564a.add(Z.FOR_LET);
        this.f33564a.add(Z.FOR_OF);
        this.f33564a.add(Z.FOR_OF_CONST);
        this.f33564a.add(Z.FOR_OF_LET);
        this.f33564a.add(Z.WHILE);
    }

    private static InterfaceC2574s c(P p10, InterfaceC2574s interfaceC2574s, InterfaceC2574s interfaceC2574s2) {
        return d(p10, interfaceC2574s.j(), interfaceC2574s2);
    }

    private static InterfaceC2574s d(P p10, Iterator<InterfaceC2574s> it, InterfaceC2574s interfaceC2574s) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC2574s interfaceC2574sA = p10.a(it.next()).a((C2479g) interfaceC2574s);
                if (interfaceC2574sA instanceof C2519l) {
                    C2519l c2519l = (C2519l) interfaceC2574sA;
                    if ("break".equals(c2519l.b())) {
                        return InterfaceC2574s.f34292p;
                    }
                    if ("return".equals(c2519l.b())) {
                        return c2519l;
                    }
                }
            }
        }
        return InterfaceC2574s.f34292p;
    }

    private static InterfaceC2574s e(P p10, InterfaceC2574s interfaceC2574s, InterfaceC2574s interfaceC2574s2) {
        if (interfaceC2574s instanceof Iterable) {
            return d(p10, ((Iterable) interfaceC2574s).iterator(), interfaceC2574s2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.InterfaceC2574s b(java.lang.String r11, com.google.android.gms.internal.measurement.Z2 r12, java.util.List<com.google.android.gms.internal.measurement.InterfaceC2574s> r13) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.L.b(java.lang.String, com.google.android.gms.internal.measurement.Z2, java.util.List):com.google.android.gms.internal.measurement.s");
    }
}
