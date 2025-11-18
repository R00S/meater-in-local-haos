package com.google.protobuf;

import com.google.protobuf.AbstractC2962w;
import com.google.protobuf.P;
import com.google.protobuf.r0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: ExtensionSchemaLite.java */
/* renamed from: com.google.protobuf.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2956p extends AbstractC2955o<AbstractC2962w.d> {

    /* compiled from: ExtensionSchemaLite.java */
    /* renamed from: com.google.protobuf.p$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39325a;

        static {
            int[] iArr = new int[r0.b.values().length];
            f39325a = iArr;
            try {
                iArr[r0.b.f39357D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39325a[r0.b.f39358E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39325a[r0.b.f39359F.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39325a[r0.b.f39360G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39325a[r0.b.f39361H.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39325a[r0.b.f39362I.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f39325a[r0.b.f39363J.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f39325a[r0.b.f39364K.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f39325a[r0.b.f39369P.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f39325a[r0.b.f39371R.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f39325a[r0.b.f39372S.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f39325a[r0.b.f39373T.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f39325a[r0.b.f39374U.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f39325a[r0.b.f39370Q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f39325a[r0.b.f39368O.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f39325a[r0.b.f39365L.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f39325a[r0.b.f39366M.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f39325a[r0.b.f39367N.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    C2956p() {
    }

    @Override // com.google.protobuf.AbstractC2955o
    int a(Map.Entry<?, ?> entry) {
        return ((AbstractC2962w.d) entry.getKey()).e();
    }

    @Override // com.google.protobuf.AbstractC2955o
    Object b(C2954n c2954n, P p10, int i10) {
        return c2954n.a(p10, i10);
    }

    @Override // com.google.protobuf.AbstractC2955o
    C2958s<AbstractC2962w.d> c(Object obj) {
        return ((AbstractC2962w.c) obj).extensions;
    }

    @Override // com.google.protobuf.AbstractC2955o
    C2958s<AbstractC2962w.d> d(Object obj) {
        return ((AbstractC2962w.c) obj).a0();
    }

    @Override // com.google.protobuf.AbstractC2955o
    boolean e(P p10) {
        return p10 instanceof AbstractC2962w.c;
    }

    @Override // com.google.protobuf.AbstractC2955o
    void f(Object obj) {
        c(obj).u();
    }

    @Override // com.google.protobuf.AbstractC2955o
    <UT, UB> UB g(Object obj, e0 e0Var, Object obj2, C2954n c2954n, C2958s<AbstractC2962w.d> c2958s, UB ub2, l0<UT, UB> l0Var) {
        Object objValueOf;
        Object objI;
        ArrayList arrayList;
        AbstractC2962w.e eVar = (AbstractC2962w.e) obj2;
        int iC = eVar.c();
        if (eVar.f39478b.isRepeated() && eVar.f39478b.isPacked()) {
            switch (a.f39325a[eVar.a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    e0Var.F(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    e0Var.A(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    e0Var.m(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    e0Var.k(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    e0Var.o(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    e0Var.I(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    e0Var.r(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    e0Var.u(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    e0Var.g(arrayList);
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    arrayList = new ArrayList();
                    e0Var.e(arrayList);
                    break;
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    arrayList = new ArrayList();
                    e0Var.n(arrayList);
                    break;
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    arrayList = new ArrayList();
                    e0Var.b(arrayList);
                    break;
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    arrayList = new ArrayList();
                    e0Var.f(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    e0Var.p(arrayList);
                    ub2 = (UB) h0.z(obj, iC, arrayList, eVar.f39478b.j(), ub2, l0Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f39478b.g());
            }
            c2958s.y(eVar.f39478b, arrayList);
        } else {
            if (eVar.a() != r0.b.f39370Q) {
                switch (a.f39325a[eVar.a().ordinal()]) {
                    case 1:
                        objValueOf = Double.valueOf(e0Var.readDouble());
                        break;
                    case 2:
                        objValueOf = Float.valueOf(e0Var.readFloat());
                        break;
                    case 3:
                        objValueOf = Long.valueOf(e0Var.G());
                        break;
                    case 4:
                        objValueOf = Long.valueOf(e0Var.c());
                        break;
                    case 5:
                        objValueOf = Integer.valueOf(e0Var.B());
                        break;
                    case 6:
                        objValueOf = Long.valueOf(e0Var.d());
                        break;
                    case 7:
                        objValueOf = Integer.valueOf(e0Var.h());
                        break;
                    case 8:
                        objValueOf = Boolean.valueOf(e0Var.i());
                        break;
                    case 9:
                        objValueOf = Integer.valueOf(e0Var.l());
                        break;
                    case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        objValueOf = Integer.valueOf(e0Var.D());
                        break;
                    case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        objValueOf = Long.valueOf(e0Var.j());
                        break;
                    case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        objValueOf = Integer.valueOf(e0Var.s());
                        break;
                    case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        objValueOf = Long.valueOf(e0Var.t());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        objValueOf = e0Var.z();
                        break;
                    case 16:
                        objValueOf = e0Var.v();
                        break;
                    case 17:
                        if (!eVar.d()) {
                            Object objI2 = c2958s.i(eVar.f39478b);
                            if (objI2 instanceof AbstractC2962w) {
                                f0 f0VarD = b0.a().d(objI2);
                                if (!((AbstractC2962w) objI2).O()) {
                                    Object objF = f0VarD.f();
                                    f0VarD.a(objF, objI2);
                                    c2958s.y(eVar.f39478b, objF);
                                    objI2 = objF;
                                }
                                e0Var.L(objI2, f0VarD, c2954n);
                                return ub2;
                            }
                        }
                        objValueOf = e0Var.N(eVar.b().getClass(), c2954n);
                        break;
                    case 18:
                        if (!eVar.d()) {
                            Object objI3 = c2958s.i(eVar.f39478b);
                            if (objI3 instanceof AbstractC2962w) {
                                f0 f0VarD2 = b0.a().d(objI3);
                                if (!((AbstractC2962w) objI3).O()) {
                                    Object objF2 = f0VarD2.f();
                                    f0VarD2.a(objF2, objI3);
                                    c2958s.y(eVar.f39478b, objF2);
                                    objI3 = objF2;
                                }
                                e0Var.O(objI3, f0VarD2, c2954n);
                                return ub2;
                            }
                        }
                        objValueOf = e0Var.K(eVar.b().getClass(), c2954n);
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                int iB = e0Var.B();
                if (eVar.f39478b.j().a(iB) == null) {
                    return (UB) h0.J(obj, iC, iB, ub2, l0Var);
                }
                objValueOf = Integer.valueOf(iB);
            }
            if (eVar.d()) {
                c2958s.a(eVar.f39478b, objValueOf);
            } else {
                int i10 = a.f39325a[eVar.a().ordinal()];
                if ((i10 == 17 || i10 == 18) && (objI = c2958s.i(eVar.f39478b)) != null) {
                    objValueOf = C2964y.h(objI, objValueOf);
                }
                c2958s.y(eVar.f39478b, objValueOf);
            }
        }
        return ub2;
    }

    @Override // com.google.protobuf.AbstractC2955o
    void h(e0 e0Var, Object obj, C2954n c2954n, C2958s<AbstractC2962w.d> c2958s) {
        AbstractC2962w.e eVar = (AbstractC2962w.e) obj;
        c2958s.y(eVar.f39478b, e0Var.K(eVar.b().getClass(), c2954n));
    }

    @Override // com.google.protobuf.AbstractC2955o
    void i(AbstractC2947g abstractC2947g, Object obj, C2954n c2954n, C2958s<AbstractC2962w.d> c2958s) {
        AbstractC2962w.e eVar = (AbstractC2962w.e) obj;
        P.a aVarG = eVar.b().g();
        AbstractC2948h abstractC2948hZ = abstractC2947g.z();
        aVarG.U0(abstractC2948hZ, c2954n);
        c2958s.y(eVar.f39478b, aVarG.j());
        abstractC2948hZ.a(0);
    }

    @Override // com.google.protobuf.AbstractC2955o
    void j(s0 s0Var, Map.Entry<?, ?> entry) {
        AbstractC2962w.d dVar = (AbstractC2962w.d) entry.getKey();
        if (!dVar.isRepeated()) {
            switch (a.f39325a[dVar.g().ordinal()]) {
                case 1:
                    s0Var.e(dVar.e(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    s0Var.A(dVar.e(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    s0Var.n(dVar.e(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    s0Var.l(dVar.e(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    s0Var.r(dVar.e(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    s0Var.h(dVar.e(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    s0Var.d(dVar.e(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    s0Var.o(dVar.e(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    s0Var.b(dVar.e(), ((Integer) entry.getValue()).intValue());
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    s0Var.p(dVar.e(), ((Integer) entry.getValue()).intValue());
                    break;
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    s0Var.u(dVar.e(), ((Long) entry.getValue()).longValue());
                    break;
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    s0Var.H(dVar.e(), ((Integer) entry.getValue()).intValue());
                    break;
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    s0Var.z(dVar.e(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    s0Var.r(dVar.e(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    s0Var.N(dVar.e(), (AbstractC2947g) entry.getValue());
                    break;
                case 16:
                    s0Var.k(dVar.e(), (String) entry.getValue());
                    break;
                case 17:
                    s0Var.M(dVar.e(), entry.getValue(), b0.a().c(entry.getValue().getClass()));
                    break;
                case 18:
                    s0Var.L(dVar.e(), entry.getValue(), b0.a().c(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f39325a[dVar.g().ordinal()]) {
            case 1:
                h0.O(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case 2:
                h0.S(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case 3:
                h0.V(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case 4:
                h0.d0(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case 5:
                h0.U(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case 6:
                h0.R(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case 7:
                h0.Q(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case 8:
                h0.M(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case 9:
                h0.c0(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                h0.X(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                h0.Y(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                h0.Z(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                h0.a0(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case 14:
                h0.U(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case 15:
                h0.N(dVar.e(), (List) entry.getValue(), s0Var);
                break;
            case 16:
                h0.b0(dVar.e(), (List) entry.getValue(), s0Var);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    h0.T(dVar.e(), (List) entry.getValue(), s0Var, b0.a().c(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    h0.W(dVar.e(), (List) entry.getValue(), s0Var, b0.a().c(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
