package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class F extends A {
    protected F() {
        this.f33564a.add(Z.APPLY);
        this.f33564a.add(Z.BLOCK);
        this.f33564a.add(Z.BREAK);
        this.f33564a.add(Z.CASE);
        this.f33564a.add(Z.DEFAULT);
        this.f33564a.add(Z.CONTINUE);
        this.f33564a.add(Z.DEFINE_FUNCTION);
        this.f33564a.add(Z.FN);
        this.f33564a.add(Z.IF);
        this.f33564a.add(Z.QUOTE);
        this.f33564a.add(Z.RETURN);
        this.f33564a.add(Z.SWITCH);
        this.f33564a.add(Z.TERNARY);
    }

    private static InterfaceC2574s c(Z2 z22, List<InterfaceC2574s> list) {
        Y1.j(Z.FN, 2, list);
        InterfaceC2574s interfaceC2574sB = z22.b(list.get(0));
        InterfaceC2574s interfaceC2574sB2 = z22.b(list.get(1));
        if (!(interfaceC2574sB2 instanceof C2479g)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", interfaceC2574sB2.getClass().getCanonicalName()));
        }
        List<InterfaceC2574s> listI = ((C2479g) interfaceC2574sB2).I();
        List<InterfaceC2574s> arrayList = new ArrayList<>();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new C2582t(interfaceC2574sB.i(), listI, arrayList, z22);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC2574s b(String str, Z2 z22, List<InterfaceC2574s> list) {
        int i10 = 0;
        switch (I.f33777a[Y1.c(str).ordinal()]) {
            case 1:
                Y1.f(Z.APPLY, 3, list);
                InterfaceC2574s interfaceC2574sB = z22.b(list.get(0));
                String strI = z22.b(list.get(1)).i();
                InterfaceC2574s interfaceC2574sB2 = z22.b(list.get(2));
                if (!(interfaceC2574sB2 instanceof C2479g)) {
                    throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", interfaceC2574sB2.getClass().getCanonicalName()));
                }
                if (strI.isEmpty()) {
                    throw new IllegalArgumentException("Function name for apply is undefined");
                }
                return interfaceC2574sB.v(strI, z22, ((C2479g) interfaceC2574sB2).I());
            case 2:
                return z22.d().a(new C2479g(list));
            case 3:
                Y1.f(Z.BREAK, 0, list);
                return InterfaceC2574s.f34295s;
            case 4:
            case 5:
                if (!list.isEmpty()) {
                    InterfaceC2574s interfaceC2574sB3 = z22.b(list.get(0));
                    if (interfaceC2574sB3 instanceof C2479g) {
                        return z22.a((C2479g) interfaceC2574sB3);
                    }
                }
                return InterfaceC2574s.f34292p;
            case 6:
                Y1.f(Z.BREAK, 0, list);
                return InterfaceC2574s.f34294r;
            case 7:
                Y1.j(Z.DEFINE_FUNCTION, 2, list);
                C2582t c2582t = (C2582t) c(z22, list);
                if (c2582t.b() == null) {
                    z22.h("", c2582t);
                } else {
                    z22.h(c2582t.b(), c2582t);
                }
                return c2582t;
            case 8:
                return c(z22, list);
            case 9:
                Y1.j(Z.IF, 2, list);
                InterfaceC2574s interfaceC2574sB4 = z22.b(list.get(0));
                InterfaceC2574s interfaceC2574sB5 = z22.b(list.get(1));
                InterfaceC2574s interfaceC2574sB6 = list.size() > 2 ? z22.b(list.get(2)) : null;
                InterfaceC2574s interfaceC2574s = InterfaceC2574s.f34292p;
                InterfaceC2574s interfaceC2574sA = interfaceC2574sB4.f().booleanValue() ? z22.a((C2479g) interfaceC2574sB5) : interfaceC2574sB6 != null ? z22.a((C2479g) interfaceC2574sB6) : interfaceC2574s;
                return interfaceC2574sA instanceof C2519l ? interfaceC2574sA : interfaceC2574s;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return new C2479g(list);
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (list.isEmpty()) {
                    return InterfaceC2574s.f34296t;
                }
                Y1.f(Z.RETURN, 1, list);
                return new C2519l("return", z22.b(list.get(0)));
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                Y1.f(Z.SWITCH, 3, list);
                InterfaceC2574s interfaceC2574sB7 = z22.b(list.get(0));
                InterfaceC2574s interfaceC2574sB8 = z22.b(list.get(1));
                InterfaceC2574s interfaceC2574sB9 = z22.b(list.get(2));
                if (!(interfaceC2574sB8 instanceof C2479g)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(interfaceC2574sB9 instanceof C2479g)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                C2479g c2479g = (C2479g) interfaceC2574sB8;
                C2479g c2479g2 = (C2479g) interfaceC2574sB9;
                boolean z10 = false;
                while (true) {
                    if (i10 < c2479g.B()) {
                        if (z10 || interfaceC2574sB7.equals(z22.b(c2479g.y(i10)))) {
                            InterfaceC2574s interfaceC2574sB10 = z22.b(c2479g2.y(i10));
                            if (!(interfaceC2574sB10 instanceof C2519l)) {
                                z10 = true;
                            } else if (!((C2519l) interfaceC2574sB10).b().equals("break")) {
                                return interfaceC2574sB10;
                            }
                        }
                        i10++;
                    } else if (c2479g.B() + 1 == c2479g2.B()) {
                        InterfaceC2574s interfaceC2574sB11 = z22.b(c2479g2.y(c2479g.B()));
                        if (interfaceC2574sB11 instanceof C2519l) {
                            String strB = ((C2519l) interfaceC2574sB11).b();
                            if (strB.equals("return") || strB.equals("continue")) {
                                return interfaceC2574sB11;
                            }
                        }
                    }
                }
                return InterfaceC2574s.f34292p;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                Y1.f(Z.TERNARY, 3, list);
                return z22.b(list.get(0)).f().booleanValue() ? z22.b(list.get(1)) : z22.b(list.get(2));
            default:
                return super.a(str);
        }
    }
}
