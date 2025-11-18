package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class D extends A {
    public D() {
        this.f33564a.add(Z.EQUALS);
        this.f33564a.add(Z.GREATER_THAN);
        this.f33564a.add(Z.GREATER_THAN_EQUALS);
        this.f33564a.add(Z.IDENTITY_EQUALS);
        this.f33564a.add(Z.IDENTITY_NOT_EQUALS);
        this.f33564a.add(Z.LESS_THAN);
        this.f33564a.add(Z.LESS_THAN_EQUALS);
        this.f33564a.add(Z.NOT_EQUALS);
    }

    private static boolean c(InterfaceC2574s interfaceC2574s, InterfaceC2574s interfaceC2574s2) {
        InterfaceC2574s c2511k;
        InterfaceC2574s c2511k2;
        while (!interfaceC2574s.getClass().equals(interfaceC2574s2.getClass())) {
            if (((interfaceC2574s instanceof C2630z) || (interfaceC2574s instanceof C2559q)) && ((interfaceC2574s2 instanceof C2630z) || (interfaceC2574s2 instanceof C2559q))) {
                return true;
            }
            boolean z10 = interfaceC2574s instanceof C2511k;
            if (z10 && (interfaceC2574s2 instanceof C2590u)) {
                c2511k2 = new C2511k(interfaceC2574s2.h());
            } else {
                boolean z11 = interfaceC2574s instanceof C2590u;
                if (z11 && (interfaceC2574s2 instanceof C2511k)) {
                    c2511k = new C2511k(interfaceC2574s.h());
                } else if (interfaceC2574s instanceof C2487h) {
                    c2511k = new C2511k(interfaceC2574s.h());
                } else if (interfaceC2574s2 instanceof C2487h) {
                    c2511k2 = new C2511k(interfaceC2574s2.h());
                } else if ((z11 || z10) && (interfaceC2574s2 instanceof InterfaceC2527m)) {
                    c2511k2 = new C2590u(interfaceC2574s2.i());
                } else {
                    if (!(interfaceC2574s instanceof InterfaceC2527m) || (!(interfaceC2574s2 instanceof C2590u) && !(interfaceC2574s2 instanceof C2511k))) {
                        return false;
                    }
                    c2511k = new C2590u(interfaceC2574s.i());
                }
                interfaceC2574s = c2511k;
            }
            interfaceC2574s2 = c2511k2;
        }
        if ((interfaceC2574s instanceof C2630z) || (interfaceC2574s instanceof C2559q)) {
            return true;
        }
        return interfaceC2574s instanceof C2511k ? (Double.isNaN(interfaceC2574s.h().doubleValue()) || Double.isNaN(interfaceC2574s2.h().doubleValue()) || interfaceC2574s.h().doubleValue() != interfaceC2574s2.h().doubleValue()) ? false : true : interfaceC2574s instanceof C2590u ? interfaceC2574s.i().equals(interfaceC2574s2.i()) : interfaceC2574s instanceof C2487h ? interfaceC2574s.f().equals(interfaceC2574s2.f()) : interfaceC2574s == interfaceC2574s2;
    }

    private static boolean d(InterfaceC2574s interfaceC2574s, InterfaceC2574s interfaceC2574s2) {
        if (interfaceC2574s instanceof InterfaceC2527m) {
            interfaceC2574s = new C2590u(interfaceC2574s.i());
        }
        if (interfaceC2574s2 instanceof InterfaceC2527m) {
            interfaceC2574s2 = new C2590u(interfaceC2574s2.i());
        }
        if ((interfaceC2574s instanceof C2590u) && (interfaceC2574s2 instanceof C2590u)) {
            return interfaceC2574s.i().compareTo(interfaceC2574s2.i()) < 0;
        }
        double dDoubleValue = interfaceC2574s.h().doubleValue();
        double dDoubleValue2 = interfaceC2574s2.h().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == -0.0d) || ((dDoubleValue == -0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    private static boolean e(InterfaceC2574s interfaceC2574s, InterfaceC2574s interfaceC2574s2) {
        if (interfaceC2574s instanceof InterfaceC2527m) {
            interfaceC2574s = new C2590u(interfaceC2574s.i());
        }
        if (interfaceC2574s2 instanceof InterfaceC2527m) {
            interfaceC2574s2 = new C2590u(interfaceC2574s2.i());
        }
        return (((interfaceC2574s instanceof C2590u) && (interfaceC2574s2 instanceof C2590u)) || !(Double.isNaN(interfaceC2574s.h().doubleValue()) || Double.isNaN(interfaceC2574s2.h().doubleValue()))) && !d(interfaceC2574s2, interfaceC2574s);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    @Override // com.google.android.gms.internal.measurement.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.InterfaceC2574s b(java.lang.String r4, com.google.android.gms.internal.measurement.Z2 r5, java.util.List<com.google.android.gms.internal.measurement.InterfaceC2574s> r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.measurement.Z r0 = com.google.android.gms.internal.measurement.Y1.c(r4)
            r1 = 2
            com.google.android.gms.internal.measurement.Y1.f(r0, r1, r6)
            r0 = 0
            java.lang.Object r0 = r6.get(r0)
            com.google.android.gms.internal.measurement.s r0 = (com.google.android.gms.internal.measurement.InterfaceC2574s) r0
            com.google.android.gms.internal.measurement.s r0 = r5.b(r0)
            r1 = 1
            java.lang.Object r6 = r6.get(r1)
            com.google.android.gms.internal.measurement.s r6 = (com.google.android.gms.internal.measurement.InterfaceC2574s) r6
            com.google.android.gms.internal.measurement.s r5 = r5.b(r6)
            int[] r6 = com.google.android.gms.internal.measurement.G.f33742a
            com.google.android.gms.internal.measurement.Z r2 = com.google.android.gms.internal.measurement.Y1.c(r4)
            int r2 = r2.ordinal()
            r6 = r6[r2]
            switch(r6) {
                case 1: goto L56;
                case 2: goto L51;
                case 3: goto L4c;
                case 4: goto L47;
                case 5: goto L42;
                case 6: goto L3d;
                case 7: goto L38;
                case 8: goto L32;
                default: goto L2d;
            }
        L2d:
            com.google.android.gms.internal.measurement.s r4 = super.a(r4)
            return r4
        L32:
            boolean r4 = c(r0, r5)
        L36:
            r4 = r4 ^ r1
            goto L5a
        L38:
            boolean r4 = e(r0, r5)
            goto L5a
        L3d:
            boolean r4 = d(r0, r5)
            goto L5a
        L42:
            boolean r4 = com.google.android.gms.internal.measurement.Y1.h(r0, r5)
            goto L36
        L47:
            boolean r4 = com.google.android.gms.internal.measurement.Y1.h(r0, r5)
            goto L5a
        L4c:
            boolean r4 = e(r5, r0)
            goto L5a
        L51:
            boolean r4 = d(r5, r0)
            goto L5a
        L56:
            boolean r4 = c(r0, r5)
        L5a:
            if (r4 == 0) goto L5f
            com.google.android.gms.internal.measurement.s r4 = com.google.android.gms.internal.measurement.InterfaceC2574s.f34297u
            return r4
        L5f:
            com.google.android.gms.internal.measurement.s r4 = com.google.android.gms.internal.measurement.InterfaceC2574s.f34298v
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.D.b(java.lang.String, com.google.android.gms.internal.measurement.Z2, java.util.List):com.google.android.gms.internal.measurement.s");
    }
}
