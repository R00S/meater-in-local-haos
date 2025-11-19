package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class H {
    private static C2479g a(C2479g c2479g, Z2 z22, AbstractC2535n abstractC2535n) {
        return b(c2479g, z22, abstractC2535n, null, null);
    }

    private static C2479g b(C2479g c2479g, Z2 z22, AbstractC2535n abstractC2535n, Boolean bool, Boolean bool2) {
        C2479g c2479g2 = new C2479g();
        Iterator<Integer> itH = c2479g.H();
        while (itH.hasNext()) {
            int iIntValue = itH.next().intValue();
            if (c2479g.G(iIntValue)) {
                InterfaceC2574s interfaceC2574sA = abstractC2535n.a(z22, Arrays.asList(c2479g.y(iIntValue), new C2511k(Double.valueOf(iIntValue)), c2479g));
                if (interfaceC2574sA.f().equals(bool)) {
                    return c2479g2;
                }
                if (bool2 == null || interfaceC2574sA.f().equals(bool2)) {
                    c2479g2.F(iIntValue, interfaceC2574sA);
                }
            }
        }
        return c2479g2;
    }

    private static InterfaceC2574s c(C2479g c2479g, Z2 z22, List<InterfaceC2574s> list, boolean z10) {
        InterfaceC2574s interfaceC2574sA;
        Y1.k("reduce", 1, list);
        Y1.n("reduce", 2, list);
        InterfaceC2574s interfaceC2574sB = z22.b(list.get(0));
        if (!(interfaceC2574sB instanceof AbstractC2535n)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            interfaceC2574sA = z22.b(list.get(1));
            if (interfaceC2574sA instanceof C2519l) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (c2479g.B() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            interfaceC2574sA = null;
        }
        AbstractC2535n abstractC2535n = (AbstractC2535n) interfaceC2574sB;
        int iB = c2479g.B();
        int i10 = z10 ? 0 : iB - 1;
        int i11 = z10 ? iB - 1 : 0;
        int i12 = z10 ? 1 : -1;
        if (interfaceC2574sA == null) {
            interfaceC2574sA = c2479g.y(i10);
            i10 += i12;
        }
        while ((i11 - i10) * i12 >= 0) {
            if (c2479g.G(i10)) {
                interfaceC2574sA = abstractC2535n.a(z22, Arrays.asList(interfaceC2574sA, c2479g.y(i10), new C2511k(Double.valueOf(i10)), c2479g));
                if (interfaceC2574sA instanceof C2519l) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i10 += i12;
            } else {
                i10 += i12;
            }
        }
        return interfaceC2574sA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static InterfaceC2574s d(String str, C2479g c2479g, Z2 z22, List<InterfaceC2574s> list) {
        String str2;
        char c10;
        double d10;
        String strI;
        AbstractC2535n abstractC2535n;
        int i10;
        Z2 z23;
        Double d11;
        double dA;
        str.hashCode();
        Double dValueOf = Double.valueOf(-1.0d);
        switch (str.hashCode()) {
            case -1776922004:
                str2 = "toString";
                if (str.equals(str2)) {
                    c10 = 0;
                    break;
                } else {
                    c10 = 65535;
                    break;
                }
            case -1354795244:
                if (str.equals("concat")) {
                    str2 = "toString";
                    c10 = 1;
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    c10 = 2;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    str2 = "toString";
                    c10 = 3;
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -895859076:
                if (str.equals("splice")) {
                    c10 = 4;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    c10 = 5;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c10 = 6;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    c10 = 7;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 107868:
                if (str.equals("map")) {
                    c10 = '\b';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 111185:
                if (str.equals("pop")) {
                    c10 = '\t';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3267882:
                if (str.equals("join")) {
                    c10 = '\n';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3452698:
                if (str.equals("push")) {
                    c10 = 11;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3536116:
                if (str.equals("some")) {
                    c10 = '\f';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3536286:
                if (str.equals("sort")) {
                    c10 = '\r';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 96891675:
                if (str.equals("every")) {
                    c10 = 14;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c10 = 15;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c10 = 16;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c10 = 17;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c10 = 18;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c10 = 19;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            default:
                str2 = "toString";
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                Y1.g(str2, 0, list);
                return new C2590u(c2479g.toString());
            case 1:
                C2479g c2479g2 = (C2479g) c2479g.d();
                if (!list.isEmpty()) {
                    Iterator<InterfaceC2574s> it = list.iterator();
                    while (it.hasNext()) {
                        InterfaceC2574s interfaceC2574sB = z22.b(it.next());
                        if (interfaceC2574sB instanceof C2519l) {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                        int iB = c2479g2.B();
                        if (interfaceC2574sB instanceof C2479g) {
                            C2479g c2479g3 = (C2479g) interfaceC2574sB;
                            Iterator<Integer> itH = c2479g3.H();
                            while (itH.hasNext()) {
                                Integer next = itH.next();
                                c2479g2.F(next.intValue() + iB, c2479g3.y(next.intValue()));
                            }
                        } else {
                            c2479g2.F(iB, interfaceC2574sB);
                        }
                    }
                }
                return c2479g2;
            case 2:
                Y1.g("filter", 1, list);
                InterfaceC2574s interfaceC2574sB2 = z22.b(list.get(0));
                if (!(interfaceC2574sB2 instanceof C2582t)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (c2479g.x() == 0) {
                    return new C2479g();
                }
                C2479g c2479g4 = (C2479g) c2479g.d();
                C2479g c2479gB = b(c2479g, z22, (C2582t) interfaceC2574sB2, null, Boolean.TRUE);
                C2479g c2479g5 = new C2479g();
                Iterator<Integer> itH2 = c2479gB.H();
                while (itH2.hasNext()) {
                    c2479g5.A(c2479g4.y(itH2.next().intValue()));
                }
                return c2479g5;
            case 3:
                return c(c2479g, z22, list, true);
            case 4:
                if (list.isEmpty()) {
                    return new C2479g();
                }
                int iA = (int) Y1.a(z22.b(list.get(0)).h().doubleValue());
                if (iA < 0) {
                    iA = Math.max(0, iA + c2479g.B());
                } else if (iA > c2479g.B()) {
                    iA = c2479g.B();
                }
                int iB2 = c2479g.B();
                C2479g c2479g6 = new C2479g();
                if (list.size() <= 1) {
                    while (iA < iB2) {
                        c2479g6.A(c2479g.y(iA));
                        c2479g.F(iA, null);
                        iA++;
                    }
                    return c2479g6;
                }
                int iMax = Math.max(0, (int) Y1.a(z22.b(list.get(1)).h().doubleValue()));
                if (iMax > 0) {
                    for (int i11 = iA; i11 < Math.min(iB2, iA + iMax); i11++) {
                        c2479g6.A(c2479g.y(iA));
                        c2479g.E(iA);
                    }
                }
                if (list.size() > 2) {
                    for (int i12 = 2; i12 < list.size(); i12++) {
                        InterfaceC2574s interfaceC2574sB3 = z22.b(list.get(i12));
                        if (interfaceC2574sB3 instanceof C2519l) {
                            throw new IllegalArgumentException("Failed to parse elements to add");
                        }
                        c2479g.z((iA + i12) - 2, interfaceC2574sB3);
                    }
                }
                return c2479g6;
            case 5:
                Y1.g("forEach", 1, list);
                InterfaceC2574s interfaceC2574sB4 = z22.b(list.get(0));
                if (!(interfaceC2574sB4 instanceof C2582t)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (c2479g.x() == 0) {
                    return InterfaceC2574s.f34292p;
                }
                a(c2479g, z22, (C2582t) interfaceC2574sB4);
                return InterfaceC2574s.f34292p;
            case 6:
                Y1.n("lastIndexOf", 2, list);
                InterfaceC2574s interfaceC2574sB5 = InterfaceC2574s.f34292p;
                if (!list.isEmpty()) {
                    interfaceC2574sB5 = z22.b(list.get(0));
                }
                double dB = c2479g.B() - 1;
                if (list.size() > 1) {
                    InterfaceC2574s interfaceC2574sB6 = z22.b(list.get(1));
                    dB = Double.isNaN(interfaceC2574sB6.h().doubleValue()) ? c2479g.B() - 1 : Y1.a(interfaceC2574sB6.h().doubleValue());
                    d10 = 0.0d;
                    if (dB < 0.0d) {
                        dB += c2479g.B();
                    }
                } else {
                    d10 = 0.0d;
                }
                if (dB < d10) {
                    return new C2511k(dValueOf);
                }
                for (int iMin = (int) Math.min(c2479g.B(), dB); iMin >= 0; iMin--) {
                    if (c2479g.G(iMin) && Y1.h(c2479g.y(iMin), interfaceC2574sB5)) {
                        return new C2511k(Double.valueOf(iMin));
                    }
                }
                return new C2511k(dValueOf);
            case 7:
                if (!list.isEmpty()) {
                    C2479g c2479g7 = new C2479g();
                    Iterator<InterfaceC2574s> it2 = list.iterator();
                    while (it2.hasNext()) {
                        InterfaceC2574s interfaceC2574sB7 = z22.b(it2.next());
                        if (interfaceC2574sB7 instanceof C2519l) {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                        c2479g7.A(interfaceC2574sB7);
                    }
                    int iB3 = c2479g7.B();
                    Iterator<Integer> itH3 = c2479g.H();
                    while (itH3.hasNext()) {
                        Integer next2 = itH3.next();
                        c2479g7.F(next2.intValue() + iB3, c2479g.y(next2.intValue()));
                    }
                    c2479g.J();
                    Iterator<Integer> itH4 = c2479g7.H();
                    while (itH4.hasNext()) {
                        Integer next3 = itH4.next();
                        c2479g.F(next3.intValue(), c2479g7.y(next3.intValue()));
                    }
                }
                return new C2511k(Double.valueOf(c2479g.B()));
            case '\b':
                Y1.g("map", 1, list);
                InterfaceC2574s interfaceC2574sB8 = z22.b(list.get(0));
                if (interfaceC2574sB8 instanceof C2582t) {
                    return c2479g.B() == 0 ? new C2479g() : a(c2479g, z22, (C2582t) interfaceC2574sB8);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\t':
                Y1.g("pop", 0, list);
                int iB4 = c2479g.B();
                if (iB4 == 0) {
                    return InterfaceC2574s.f34292p;
                }
                int i13 = iB4 - 1;
                InterfaceC2574s interfaceC2574sY = c2479g.y(i13);
                c2479g.E(i13);
                return interfaceC2574sY;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                Y1.n("join", 1, list);
                if (c2479g.B() == 0) {
                    return InterfaceC2574s.f34299w;
                }
                if (list.isEmpty()) {
                    strI = ",";
                } else {
                    InterfaceC2574s interfaceC2574sB9 = z22.b(list.get(0));
                    strI = ((interfaceC2574sB9 instanceof C2559q) || (interfaceC2574sB9 instanceof C2630z)) ? "" : interfaceC2574sB9.i();
                }
                return new C2590u(c2479g.D(strI));
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (!list.isEmpty()) {
                    Iterator<InterfaceC2574s> it3 = list.iterator();
                    while (it3.hasNext()) {
                        c2479g.A(z22.b(it3.next()));
                    }
                }
                return new C2511k(Double.valueOf(c2479g.B()));
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                Y1.g("some", 1, list);
                InterfaceC2574s interfaceC2574sB10 = z22.b(list.get(0));
                if (!(interfaceC2574sB10 instanceof AbstractC2535n)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (c2479g.B() != 0) {
                    AbstractC2535n abstractC2535n2 = (AbstractC2535n) interfaceC2574sB10;
                    Iterator<Integer> itH5 = c2479g.H();
                    while (itH5.hasNext()) {
                        int iIntValue = itH5.next().intValue();
                        if (c2479g.G(iIntValue) && abstractC2535n2.a(z22, Arrays.asList(c2479g.y(iIntValue), new C2511k(Double.valueOf(iIntValue)), c2479g)).f().booleanValue()) {
                            return InterfaceC2574s.f34297u;
                        }
                    }
                }
                return InterfaceC2574s.f34298v;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                Y1.n("sort", 1, list);
                if (c2479g.B() >= 2) {
                    List<InterfaceC2574s> listI = c2479g.I();
                    if (list.isEmpty()) {
                        abstractC2535n = null;
                    } else {
                        InterfaceC2574s interfaceC2574sB11 = z22.b(list.get(0));
                        if (!(interfaceC2574sB11 instanceof AbstractC2535n)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        abstractC2535n = (AbstractC2535n) interfaceC2574sB11;
                    }
                    Collections.sort(listI, new K(abstractC2535n, z22));
                    c2479g.J();
                    Iterator<InterfaceC2574s> it4 = listI.iterator();
                    int i14 = 0;
                    while (it4.hasNext()) {
                        c2479g.F(i14, it4.next());
                        i14++;
                    }
                }
                return c2479g;
            case 14:
                Y1.g("every", 1, list);
                InterfaceC2574s interfaceC2574sB12 = z22.b(list.get(0));
                if (interfaceC2574sB12 instanceof C2582t) {
                    return (c2479g.B() == 0 || b(c2479g, z22, (C2582t) interfaceC2574sB12, Boolean.FALSE, Boolean.TRUE).B() == c2479g.B()) ? InterfaceC2574s.f34297u : InterfaceC2574s.f34298v;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 15:
                Y1.g("shift", 0, list);
                if (c2479g.B() == 0) {
                    return InterfaceC2574s.f34292p;
                }
                InterfaceC2574s interfaceC2574sY2 = c2479g.y(0);
                c2479g.E(0);
                return interfaceC2574sY2;
            case 16:
                Y1.n("slice", 2, list);
                if (list.isEmpty()) {
                    return c2479g.d();
                }
                double dB2 = c2479g.B();
                double dA2 = Y1.a(z22.b(list.get(0)).h().doubleValue());
                double dMax = dA2 < 0.0d ? Math.max(dA2 + dB2, 0.0d) : Math.min(dA2, dB2);
                if (list.size() == 2) {
                    double dA3 = Y1.a(z22.b(list.get(1)).h().doubleValue());
                    dB2 = dA3 < 0.0d ? Math.max(dB2 + dA3, 0.0d) : Math.min(dB2, dA3);
                }
                C2479g c2479g8 = new C2479g();
                for (int i15 = (int) dMax; i15 < dB2; i15++) {
                    c2479g8.A(c2479g.y(i15));
                }
                return c2479g8;
            case 17:
                return c(c2479g, z22, list, false);
            case 18:
                Y1.g("reverse", 0, list);
                int iB5 = c2479g.B();
                if (iB5 != 0) {
                    int i16 = 0;
                    while (i16 < iB5 / 2) {
                        if (c2479g.G(i16)) {
                            InterfaceC2574s interfaceC2574sY3 = c2479g.y(i16);
                            c2479g.F(i16, null);
                            i10 = 1;
                            int i17 = (iB5 - 1) - i16;
                            if (c2479g.G(i17)) {
                                c2479g.F(i16, c2479g.y(i17));
                            }
                            c2479g.F(i17, interfaceC2574sY3);
                        } else {
                            i10 = 1;
                        }
                        i16 += i10;
                    }
                }
                return c2479g;
            case 19:
                Y1.n("indexOf", 2, list);
                InterfaceC2574s interfaceC2574sB13 = InterfaceC2574s.f34292p;
                if (list.isEmpty()) {
                    z23 = z22;
                } else {
                    z23 = z22;
                    interfaceC2574sB13 = z23.b(list.get(0));
                }
                if (list.size() > 1) {
                    dA = Y1.a(z23.b(list.get(1)).h().doubleValue());
                    if (dA >= c2479g.B()) {
                        return new C2511k(dValueOf);
                    }
                    d11 = dValueOf;
                    if (dA < 0.0d) {
                        dA += c2479g.B();
                    }
                } else {
                    d11 = dValueOf;
                    dA = 0.0d;
                }
                Iterator<Integer> itH6 = c2479g.H();
                while (itH6.hasNext()) {
                    int iIntValue2 = itH6.next().intValue();
                    double d12 = iIntValue2;
                    if (d12 >= dA && Y1.h(c2479g.y(iIntValue2), interfaceC2574sB13)) {
                        return new C2511k(Double.valueOf(d12));
                    }
                }
                return new C2511k(d11);
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }
}
