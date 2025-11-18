package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC2913x;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.r0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: ExtensionSchemaLite.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2907q extends AbstractC2906p<AbstractC2913x.d> {

    /* compiled from: ExtensionSchemaLite.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.q$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37919a;

        static {
            int[] iArr = new int[r0.b.values().length];
            f37919a = iArr;
            try {
                iArr[r0.b.f37927D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37919a[r0.b.f37928E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37919a[r0.b.f37929F.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37919a[r0.b.f37930G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37919a[r0.b.f37931H.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37919a[r0.b.f37932I.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37919a[r0.b.f37933J.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37919a[r0.b.f37934K.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37919a[r0.b.f37939P.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f37919a[r0.b.f37941R.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f37919a[r0.b.f37942S.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f37919a[r0.b.f37943T.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f37919a[r0.b.f37944U.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f37919a[r0.b.f37940Q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f37919a[r0.b.f37938O.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f37919a[r0.b.f37935L.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f37919a[r0.b.f37936M.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f37919a[r0.b.f37937N.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    C2907q() {
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2906p
    int a(Map.Entry<?, ?> entry) {
        return ((AbstractC2913x.d) entry.getKey()).e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2906p
    Object b(C2905o c2905o, P p10, int i10) {
        return c2905o.a(p10, i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2906p
    C2909t<AbstractC2913x.d> c(Object obj) {
        return ((AbstractC2913x.c) obj).extensions;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2906p
    C2909t<AbstractC2913x.d> d(Object obj) {
        return ((AbstractC2913x.c) obj).X();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2906p
    boolean e(P p10) {
        return p10 instanceof AbstractC2913x.c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2906p
    void f(Object obj) {
        c(obj).t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2906p
    <UT, UB> UB g(Object obj, e0 e0Var, Object obj2, C2905o c2905o, C2909t<AbstractC2913x.d> c2909t, UB ub2, l0<UT, UB> l0Var) {
        Object objValueOf;
        Object objI;
        ArrayList arrayList;
        AbstractC2913x.e eVar = (AbstractC2913x.e) obj2;
        int iC = eVar.c();
        if (eVar.f38048b.isRepeated() && eVar.f38048b.isPacked()) {
            switch (a.f37919a[eVar.a().ordinal()]) {
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
                    ub2 = (UB) h0.z(obj, iC, arrayList, eVar.f38048b.j(), ub2, l0Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f38048b.g());
            }
            c2909t.x(eVar.f38048b, arrayList);
        } else {
            if (eVar.a() != r0.b.f37940Q) {
                switch (a.f37919a[eVar.a().ordinal()]) {
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
                            Object objI2 = c2909t.i(eVar.f38048b);
                            if (objI2 instanceof AbstractC2913x) {
                                f0 f0VarD = b0.a().d(objI2);
                                if (!((AbstractC2913x) objI2).H()) {
                                    Object objF = f0VarD.f();
                                    f0VarD.a(objF, objI2);
                                    c2909t.x(eVar.f38048b, objF);
                                    objI2 = objF;
                                }
                                e0Var.L(objI2, f0VarD, c2905o);
                                return ub2;
                            }
                        }
                        objValueOf = e0Var.M(eVar.b().getClass(), c2905o);
                        break;
                    case 18:
                        if (!eVar.d()) {
                            Object objI3 = c2909t.i(eVar.f38048b);
                            if (objI3 instanceof AbstractC2913x) {
                                f0 f0VarD2 = b0.a().d(objI3);
                                if (!((AbstractC2913x) objI3).H()) {
                                    Object objF2 = f0VarD2.f();
                                    f0VarD2.a(objF2, objI3);
                                    c2909t.x(eVar.f38048b, objF2);
                                    objI3 = objF2;
                                }
                                e0Var.J(objI3, f0VarD2, c2905o);
                                return ub2;
                            }
                        }
                        objValueOf = e0Var.N(eVar.b().getClass(), c2905o);
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                int iB = e0Var.B();
                if (eVar.f38048b.j().a(iB) == null) {
                    return (UB) h0.L(obj, iC, iB, ub2, l0Var);
                }
                objValueOf = Integer.valueOf(iB);
            }
            if (eVar.d()) {
                c2909t.a(eVar.f38048b, objValueOf);
            } else {
                int i10 = a.f37919a[eVar.a().ordinal()];
                if ((i10 == 17 || i10 == 18) && (objI = c2909t.i(eVar.f38048b)) != null) {
                    objValueOf = C2915z.h(objI, objValueOf);
                }
                c2909t.x(eVar.f38048b, objValueOf);
            }
        }
        return ub2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2906p
    void h(e0 e0Var, Object obj, C2905o c2905o, C2909t<AbstractC2913x.d> c2909t) {
        AbstractC2913x.e eVar = (AbstractC2913x.e) obj;
        c2909t.x(eVar.f38048b, e0Var.N(eVar.b().getClass(), c2905o));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2906p
    void i(AbstractC2898h abstractC2898h, Object obj, C2905o c2905o, C2909t<AbstractC2913x.d> c2909t) {
        AbstractC2913x.e eVar = (AbstractC2913x.e) obj;
        P.a aVarG = eVar.b().g();
        AbstractC2899i abstractC2899iB = abstractC2898h.B();
        aVarG.f0(abstractC2899iB, c2905o);
        c2909t.x(eVar.f38048b, aVarG.j());
        abstractC2899iB.a(0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2906p
    void j(s0 s0Var, Map.Entry<?, ?> entry) {
        AbstractC2913x.d dVar = (AbstractC2913x.d) entry.getKey();
        if (!dVar.isRepeated()) {
            switch (a.f37919a[dVar.g().ordinal()]) {
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
                    s0Var.O(dVar.e(), (AbstractC2898h) entry.getValue());
                    break;
                case 16:
                    s0Var.k(dVar.e(), (String) entry.getValue());
                    break;
                case 17:
                    s0Var.L(dVar.e(), entry.getValue(), b0.a().c(entry.getValue().getClass()));
                    break;
                case 18:
                    s0Var.J(dVar.e(), entry.getValue(), b0.a().c(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f37919a[dVar.g().ordinal()]) {
            case 1:
                h0.P(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case 2:
                h0.T(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case 3:
                h0.W(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case 4:
                h0.e0(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case 5:
                h0.V(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case 6:
                h0.S(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case 7:
                h0.R(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case 8:
                h0.N(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case 9:
                h0.d0(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                h0.Y(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                h0.Z(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                h0.a0(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                h0.b0(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case 14:
                h0.V(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case 15:
                h0.O(dVar.e(), (List) entry.getValue(), s0Var);
                break;
            case 16:
                h0.c0(dVar.e(), (List) entry.getValue(), s0Var);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    h0.U(dVar.e(), (List) entry.getValue(), s0Var, b0.a().c(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    h0.X(dVar.e(), (List) entry.getValue(), s0Var, b0.a().c(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
