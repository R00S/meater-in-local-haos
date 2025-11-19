package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class X extends A {
    protected X() {
        this.f33564a.add(Z.ASSIGN);
        this.f33564a.add(Z.CONST);
        this.f33564a.add(Z.CREATE_ARRAY);
        this.f33564a.add(Z.CREATE_OBJECT);
        this.f33564a.add(Z.EXPRESSION_LIST);
        this.f33564a.add(Z.GET);
        this.f33564a.add(Z.GET_INDEX);
        this.f33564a.add(Z.GET_PROPERTY);
        this.f33564a.add(Z.NULL);
        this.f33564a.add(Z.SET_PROPERTY);
        this.f33564a.add(Z.TYPEOF);
        this.f33564a.add(Z.UNDEFINED);
        this.f33564a.add(Z.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC2574s b(String str, Z2 z22, List<InterfaceC2574s> list) {
        String str2;
        int i10 = 0;
        switch (W.f33920a[Y1.c(str).ordinal()]) {
            case 1:
                Y1.f(Z.ASSIGN, 2, list);
                InterfaceC2574s interfaceC2574sB = z22.b(list.get(0));
                if (!(interfaceC2574sB instanceof C2590u)) {
                    throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", interfaceC2574sB.getClass().getCanonicalName()));
                }
                if (!z22.g(interfaceC2574sB.i())) {
                    throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", interfaceC2574sB.i()));
                }
                InterfaceC2574s interfaceC2574sB2 = z22.b(list.get(1));
                z22.h(interfaceC2574sB.i(), interfaceC2574sB2);
                return interfaceC2574sB2;
            case 2:
                Y1.j(Z.CONST, 2, list);
                if (list.size() % 2 != 0) {
                    throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
                }
                while (i10 < list.size() - 1) {
                    InterfaceC2574s interfaceC2574sB3 = z22.b(list.get(i10));
                    if (!(interfaceC2574sB3 instanceof C2590u)) {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", interfaceC2574sB3.getClass().getCanonicalName()));
                    }
                    z22.f(interfaceC2574sB3.i(), z22.b(list.get(i10 + 1)));
                    i10 += 2;
                }
                return InterfaceC2574s.f34292p;
            case 3:
                if (list.isEmpty()) {
                    return new C2479g();
                }
                C2479g c2479g = new C2479g();
                Iterator<InterfaceC2574s> it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC2574s interfaceC2574sB4 = z22.b(it.next());
                    if (interfaceC2574sB4 instanceof C2519l) {
                        throw new IllegalStateException("Failed to evaluate array element");
                    }
                    c2479g.F(i10, interfaceC2574sB4);
                    i10++;
                }
                return c2479g;
            case 4:
                if (list.isEmpty()) {
                    return new r();
                }
                if (list.size() % 2 != 0) {
                    throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
                }
                r rVar = new r();
                while (i10 < list.size() - 1) {
                    InterfaceC2574s interfaceC2574sB5 = z22.b(list.get(i10));
                    InterfaceC2574s interfaceC2574sB6 = z22.b(list.get(i10 + 1));
                    if ((interfaceC2574sB5 instanceof C2519l) || (interfaceC2574sB6 instanceof C2519l)) {
                        throw new IllegalStateException("Failed to evaluate map entry");
                    }
                    rVar.w(interfaceC2574sB5.i(), interfaceC2574sB6);
                    i10 += 2;
                }
                return rVar;
            case 5:
                Y1.j(Z.EXPRESSION_LIST, 1, list);
                InterfaceC2574s interfaceC2574sB7 = InterfaceC2574s.f34292p;
                while (i10 < list.size()) {
                    interfaceC2574sB7 = z22.b(list.get(i10));
                    if (interfaceC2574sB7 instanceof C2519l) {
                        throw new IllegalStateException("ControlValue cannot be in an expression list");
                    }
                    i10++;
                }
                return interfaceC2574sB7;
            case 6:
                Y1.f(Z.GET, 1, list);
                InterfaceC2574s interfaceC2574sB8 = z22.b(list.get(0));
                if (interfaceC2574sB8 instanceof C2590u) {
                    return z22.c(interfaceC2574sB8.i());
                }
                throw new IllegalArgumentException(String.format("Expected string for get var. got %s", interfaceC2574sB8.getClass().getCanonicalName()));
            case 7:
            case 8:
                Y1.f(Z.GET_PROPERTY, 2, list);
                InterfaceC2574s interfaceC2574sB9 = z22.b(list.get(0));
                InterfaceC2574s interfaceC2574sB10 = z22.b(list.get(1));
                if ((interfaceC2574sB9 instanceof C2479g) && Y1.l(interfaceC2574sB10)) {
                    return ((C2479g) interfaceC2574sB9).y(interfaceC2574sB10.h().intValue());
                }
                if (interfaceC2574sB9 instanceof InterfaceC2527m) {
                    return ((InterfaceC2527m) interfaceC2574sB9).c(interfaceC2574sB10.i());
                }
                if (interfaceC2574sB9 instanceof C2590u) {
                    if ("length".equals(interfaceC2574sB10.i())) {
                        return new C2511k(Double.valueOf(interfaceC2574sB9.i().length()));
                    }
                    if (Y1.l(interfaceC2574sB10) && interfaceC2574sB10.h().doubleValue() < interfaceC2574sB9.i().length()) {
                        return new C2590u(String.valueOf(interfaceC2574sB9.i().charAt(interfaceC2574sB10.h().intValue())));
                    }
                }
                return InterfaceC2574s.f34292p;
            case 9:
                Y1.f(Z.NULL, 0, list);
                return InterfaceC2574s.f34293q;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                Y1.f(Z.SET_PROPERTY, 3, list);
                InterfaceC2574s interfaceC2574sB11 = z22.b(list.get(0));
                InterfaceC2574s interfaceC2574sB12 = z22.b(list.get(1));
                InterfaceC2574s interfaceC2574sB13 = z22.b(list.get(2));
                if (interfaceC2574sB11 == InterfaceC2574s.f34292p || interfaceC2574sB11 == InterfaceC2574s.f34293q) {
                    throw new IllegalStateException(String.format("Can't set property %s of %s", interfaceC2574sB12.i(), interfaceC2574sB11.i()));
                }
                if ((interfaceC2574sB11 instanceof C2479g) && (interfaceC2574sB12 instanceof C2511k)) {
                    ((C2479g) interfaceC2574sB11).F(interfaceC2574sB12.h().intValue(), interfaceC2574sB13);
                } else if (interfaceC2574sB11 instanceof InterfaceC2527m) {
                    ((InterfaceC2527m) interfaceC2574sB11).w(interfaceC2574sB12.i(), interfaceC2574sB13);
                }
                return interfaceC2574sB13;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                Y1.f(Z.TYPEOF, 1, list);
                InterfaceC2574s interfaceC2574sB14 = z22.b(list.get(0));
                if (interfaceC2574sB14 instanceof C2630z) {
                    str2 = "undefined";
                } else if (interfaceC2574sB14 instanceof C2487h) {
                    str2 = "boolean";
                } else if (interfaceC2574sB14 instanceof C2511k) {
                    str2 = "number";
                } else if (interfaceC2574sB14 instanceof C2590u) {
                    str2 = "string";
                } else if (interfaceC2574sB14 instanceof C2582t) {
                    str2 = "function";
                } else {
                    if ((interfaceC2574sB14 instanceof C2598v) || (interfaceC2574sB14 instanceof C2519l)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", interfaceC2574sB14));
                    }
                    str2 = "object";
                }
                return new C2590u(str2);
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                Y1.f(Z.UNDEFINED, 0, list);
                return InterfaceC2574s.f34292p;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                Y1.j(Z.VAR, 1, list);
                Iterator<InterfaceC2574s> it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC2574s interfaceC2574sB15 = z22.b(it2.next());
                    if (!(interfaceC2574sB15 instanceof C2590u)) {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", interfaceC2574sB15.getClass().getCanonicalName()));
                    }
                    z22.e(interfaceC2574sB15.i(), InterfaceC2574s.f34292p);
                }
                return InterfaceC2574s.f34292p;
            default:
                return super.a(str);
        }
    }
}
