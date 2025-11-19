package Db;

import Hb.AbstractC1082f0;
import Ra.C1711y;
import Ra.InterfaceC1691d;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.h0;
import Ra.t0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C3862t;
import lb.C3922b;
import nb.C4076b;
import nb.InterfaceC4077c;
import oa.C4170o;
import tb.C4597i;
import vb.AbstractC4943g;
import vb.C4932B;
import vb.C4933C;
import vb.C4934D;
import vb.C4935E;
import vb.C4937a;
import vb.C4938b;
import vb.C4939c;
import vb.C4940d;
import vb.C4941e;
import vb.C4945i;

/* compiled from: AnnotationDeserializer.kt */
/* renamed from: Db.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1001g {

    /* renamed from: a, reason: collision with root package name */
    private final Ra.H f3675a;

    /* renamed from: b, reason: collision with root package name */
    private final Ra.M f3676b;

    /* compiled from: AnnotationDeserializer.kt */
    /* renamed from: Db.g$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3677a;

        static {
            int[] iArr = new int[C3922b.C0595b.c.EnumC0598c.values().length];
            try {
                iArr[C3922b.C0595b.c.EnumC0598c.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C3922b.C0595b.c.EnumC0598c.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C3922b.C0595b.c.EnumC0598c.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C3922b.C0595b.c.EnumC0598c.INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C3922b.C0595b.c.EnumC0598c.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C3922b.C0595b.c.EnumC0598c.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C3922b.C0595b.c.EnumC0598c.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[C3922b.C0595b.c.EnumC0598c.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[C3922b.C0595b.c.EnumC0598c.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[C3922b.C0595b.c.EnumC0598c.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[C3922b.C0595b.c.EnumC0598c.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[C3922b.C0595b.c.EnumC0598c.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[C3922b.C0595b.c.EnumC0598c.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f3677a = iArr;
        }
    }

    public C1001g(Ra.H module, Ra.M notFoundClasses) {
        C3862t.g(module, "module");
        C3862t.g(notFoundClasses, "notFoundClasses");
        this.f3675a = module;
        this.f3676b = notFoundClasses;
    }

    private final boolean b(AbstractC4943g<?> abstractC4943g, Hb.U u10, C3922b.C0595b.c cVar) {
        C3922b.C0595b.c.EnumC0598c enumC0598cT = cVar.T();
        int i10 = enumC0598cT == null ? -1 : a.f3677a[enumC0598cT.ordinal()];
        if (i10 == 10) {
            InterfaceC1695h interfaceC1695hT = u10.O0().t();
            InterfaceC1692e interfaceC1692e = interfaceC1695hT instanceof InterfaceC1692e ? (InterfaceC1692e) interfaceC1695hT : null;
            if (interfaceC1692e != null && !Oa.j.l0(interfaceC1692e)) {
                return false;
            }
        } else {
            if (i10 != 13) {
                return C3862t.b(abstractC4943g.a(this.f3675a), u10);
            }
            if (!(abstractC4943g instanceof C4938b) || ((C4938b) abstractC4943g).b().size() != cVar.K().size()) {
                throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + abstractC4943g).toString());
            }
            Hb.U uK = c().k(u10);
            C3862t.f(uK, "getArrayElementType(...)");
            C4938b c4938b = (C4938b) abstractC4943g;
            Iterable iterableN = kotlin.collections.r.n(c4938b.b());
            if (!(iterableN instanceof Collection) || !((Collection) iterableN).isEmpty()) {
                Iterator it = iterableN.iterator();
                while (it.hasNext()) {
                    int iB = ((kotlin.collections.J) it).b();
                    AbstractC4943g<?> abstractC4943g2 = c4938b.b().get(iB);
                    C3922b.C0595b.c cVarI = cVar.I(iB);
                    C3862t.f(cVarI, "getArrayElement(...)");
                    if (!b(abstractC4943g2, uK, cVarI)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private final Oa.j c() {
        return this.f3675a.q();
    }

    private final C4170o<qb.f, AbstractC4943g<?>> d(C3922b.C0595b c0595b, Map<qb.f, ? extends t0> map, InterfaceC4077c interfaceC4077c) {
        t0 t0Var = map.get(L.b(interfaceC4077c, c0595b.x()));
        if (t0Var == null) {
            return null;
        }
        qb.f fVarB = L.b(interfaceC4077c, c0595b.x());
        Hb.U uA = t0Var.a();
        C3862t.f(uA, "getType(...)");
        C3922b.C0595b.c cVarY = c0595b.y();
        C3862t.f(cVarY, "getValue(...)");
        return new C4170o<>(fVarB, g(uA, cVarY, interfaceC4077c));
    }

    private final InterfaceC1692e e(qb.b bVar) {
        return C1711y.d(this.f3675a, bVar, this.f3676b);
    }

    private final AbstractC4943g<?> g(Hb.U u10, C3922b.C0595b.c cVar, InterfaceC4077c interfaceC4077c) {
        AbstractC4943g<?> abstractC4943gF = f(u10, cVar, interfaceC4077c);
        if (!b(abstractC4943gF, u10, cVar)) {
            abstractC4943gF = null;
        }
        if (abstractC4943gF != null) {
            return abstractC4943gF;
        }
        return vb.l.f51604b.a("Unexpected argument value: actual type " + cVar.T() + " != expected type " + u10);
    }

    public final Sa.c a(C3922b proto, InterfaceC4077c nameResolver) {
        C3862t.g(proto, "proto");
        C3862t.g(nameResolver, "nameResolver");
        InterfaceC1692e interfaceC1692eE = e(L.a(nameResolver, proto.B()));
        Map mapH = kotlin.collections.M.h();
        if (proto.y() != 0 && !Jb.l.m(interfaceC1692eE) && C4597i.t(interfaceC1692eE)) {
            Collection<InterfaceC1691d> collectionN = interfaceC1692eE.n();
            C3862t.f(collectionN, "getConstructors(...)");
            InterfaceC1691d interfaceC1691d = (InterfaceC1691d) kotlin.collections.r.K0(collectionN);
            if (interfaceC1691d != null) {
                List<t0> listK = interfaceC1691d.k();
                C3862t.f(listK, "getValueParameters(...)");
                List<t0> list = listK;
                LinkedHashMap linkedHashMap = new LinkedHashMap(Ha.g.d(kotlin.collections.M.d(kotlin.collections.r.x(list, 10)), 16));
                for (Object obj : list) {
                    linkedHashMap.put(((t0) obj).getName(), obj);
                }
                List<C3922b.C0595b> listZ = proto.z();
                C3862t.f(listZ, "getArgumentList(...)");
                ArrayList arrayList = new ArrayList();
                for (C3922b.C0595b c0595b : listZ) {
                    C3862t.d(c0595b);
                    C4170o<qb.f, AbstractC4943g<?>> c4170oD = d(c0595b, linkedHashMap, nameResolver);
                    if (c4170oD != null) {
                        arrayList.add(c4170oD);
                    }
                }
                mapH = kotlin.collections.M.p(arrayList);
            }
        }
        return new Sa.d(interfaceC1692eE.u(), mapH, h0.f15158a);
    }

    public final AbstractC4943g<?> f(Hb.U expectedType, C3922b.C0595b.c value, InterfaceC4077c nameResolver) {
        AbstractC4943g<?> c4940d;
        C3862t.g(expectedType, "expectedType");
        C3862t.g(value, "value");
        C3862t.g(nameResolver, "nameResolver");
        Boolean boolD = C4076b.f45812P.d(value.P());
        C3862t.f(boolD, "get(...)");
        boolean zBooleanValue = boolD.booleanValue();
        C3922b.C0595b.c.EnumC0598c enumC0598cT = value.T();
        switch (enumC0598cT == null ? -1 : a.f3677a[enumC0598cT.ordinal()]) {
            case 1:
                byte bR = (byte) value.R();
                if (zBooleanValue) {
                    c4940d = new C4932B(bR);
                    break;
                } else {
                    c4940d = new C4940d(bR);
                    break;
                }
            case 2:
                return new C4941e((char) value.R());
            case 3:
                short sR = (short) value.R();
                if (zBooleanValue) {
                    c4940d = new C4935E(sR);
                    break;
                } else {
                    c4940d = new vb.x(sR);
                    break;
                }
            case 4:
                int iR = (int) value.R();
                if (zBooleanValue) {
                    c4940d = new C4933C(iR);
                    break;
                } else {
                    c4940d = new vb.n(iR);
                    break;
                }
            case 5:
                long jR = value.R();
                return zBooleanValue ? new C4934D(jR) : new vb.u(jR);
            case 6:
                return new vb.m(value.Q());
            case 7:
                return new vb.j(value.N());
            case 8:
                return new C4939c(value.R() != 0);
            case 9:
                return new vb.y(nameResolver.getString(value.S()));
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return new vb.t(L.a(nameResolver, value.L()), value.H());
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return new vb.k(L.a(nameResolver, value.L()), L.b(nameResolver, value.O()));
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                C3922b c3922bG = value.G();
                C3862t.f(c3922bG, "getAnnotation(...)");
                return new C4937a(a(c3922bG, nameResolver));
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                C4945i c4945i = C4945i.f51601a;
                List<C3922b.C0595b.c> listK = value.K();
                C3862t.f(listK, "getArrayElementList(...)");
                List<C3922b.C0595b.c> list = listK;
                ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
                for (C3922b.C0595b.c cVar : list) {
                    AbstractC1082f0 abstractC1082f0I = c().i();
                    C3862t.f(abstractC1082f0I, "getAnyType(...)");
                    C3862t.d(cVar);
                    arrayList.add(f(abstractC1082f0I, cVar, nameResolver));
                }
                return c4945i.b(arrayList, expectedType);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.T() + " (expected " + expectedType + ')').toString());
        }
        return c4940d;
    }
}
