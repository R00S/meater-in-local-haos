package Oa;

import Hb.AbstractC1082f0;
import Hb.G0;
import Hb.M0;
import Hb.Q0;
import Hb.U;
import Hb.X;
import Hb.v0;
import Hb.y0;
import Oa.p;
import Ra.C1705s;
import Ra.C1711y;
import Ra.H;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1700m;
import Ra.N;
import Ra.V;
import Ra.Z;
import Ra.a0;
import Ra.b0;
import Ta.a;
import Ta.c;
import Ua.F;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.model.TemperatureLog;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.C4597i;
import xb.C5087e;

/* compiled from: KotlinBuiltIns.java */
/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: g, reason: collision with root package name */
    public static final qb.f f13319g = qb.f.w("<built-ins module>");

    /* renamed from: a, reason: collision with root package name */
    private F f13320a;

    /* renamed from: b, reason: collision with root package name */
    private Gb.i<F> f13321b;

    /* renamed from: c, reason: collision with root package name */
    private final Gb.i<e> f13322c;

    /* renamed from: d, reason: collision with root package name */
    private final Gb.i<Collection<V>> f13323d;

    /* renamed from: e, reason: collision with root package name */
    private final Gb.g<qb.f, InterfaceC1692e> f13324e;

    /* renamed from: f, reason: collision with root package name */
    private final Gb.n f13325f;

    /* compiled from: KotlinBuiltIns.java */
    class a implements Ba.a<Collection<V>> {
        a() {
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<V> invoke() {
            return Arrays.asList(j.this.r().G(p.f13366A), j.this.r().G(p.f13368C), j.this.r().G(p.f13369D), j.this.r().G(p.f13367B));
        }
    }

    /* compiled from: KotlinBuiltIns.java */
    class b implements Ba.a<e> {
        b() {
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e invoke() {
            EnumMap enumMap = new EnumMap(m.class);
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            for (m mVar : m.values()) {
                AbstractC1082f0 abstractC1082f0Q = j.this.q(mVar.v().j());
                AbstractC1082f0 abstractC1082f0Q2 = j.this.q(mVar.t().j());
                enumMap.put((EnumMap) mVar, (m) abstractC1082f0Q2);
                map.put(abstractC1082f0Q, abstractC1082f0Q2);
                map2.put(abstractC1082f0Q2, abstractC1082f0Q);
            }
            return new e(enumMap, map, map2, null);
        }
    }

    /* compiled from: KotlinBuiltIns.java */
    class c implements Ba.l<qb.f, InterfaceC1692e> {
        c() {
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC1692e invoke(qb.f fVar) {
            InterfaceC1695h interfaceC1695hG = j.this.s().g(fVar, Za.d.f19628E);
            if (interfaceC1695hG == null) {
                throw new AssertionError("Built-in class " + p.f13366A.c(fVar) + " is not found");
            }
            if (interfaceC1695hG instanceof InterfaceC1692e) {
                return (InterfaceC1692e) interfaceC1695hG;
            }
            throw new AssertionError("Must be a class descriptor " + fVar + ", but was " + interfaceC1695hG);
        }
    }

    /* compiled from: KotlinBuiltIns.java */
    class d implements Ba.a<Void> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ F f13329B;

        d(F f10) {
            this.f13329B = f10;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void invoke() {
            if (j.this.f13320a == null) {
                j.this.f13320a = this.f13329B;
                return null;
            }
            throw new AssertionError("Built-ins module is already set: " + j.this.f13320a + " (attempting to reset to " + this.f13329B + ")");
        }
    }

    /* compiled from: KotlinBuiltIns.java */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        public final Map<m, AbstractC1082f0> f13331a;

        /* renamed from: b, reason: collision with root package name */
        public final Map<U, AbstractC1082f0> f13332b;

        /* renamed from: c, reason: collision with root package name */
        public final Map<AbstractC1082f0, AbstractC1082f0> f13333c;

        /* synthetic */ e(Map map, Map map2, Map map3, a aVar) {
            this(map, map2, map3);
        }

        private static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i10 != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private e(Map<m, AbstractC1082f0> map, Map<U, AbstractC1082f0> map2, Map<AbstractC1082f0, AbstractC1082f0> map3) {
            if (map == null) {
                a(0);
            }
            if (map2 == null) {
                a(1);
            }
            if (map3 == null) {
                a(2);
            }
            this.f13331a = map;
            this.f13332b = map2;
            this.f13333c = map3;
        }
    }

    protected j(Gb.n nVar) {
        if (nVar == null) {
            a(0);
        }
        this.f13325f = nVar;
        this.f13323d = nVar.g(new a());
        this.f13322c = nVar.g(new b());
        this.f13324e = nVar.h(new c());
    }

    private static U A(U u10, H h10) {
        qb.b bVarN;
        qb.b bVarA;
        InterfaceC1692e interfaceC1692eB;
        if (u10 == null) {
            a(72);
        }
        if (h10 == null) {
            a(73);
        }
        InterfaceC1695h interfaceC1695hT = u10.O0().t();
        if (interfaceC1695hT == null) {
            return null;
        }
        t tVar = t.f13511a;
        if (!tVar.b(interfaceC1695hT.getName()) || (bVarN = C5087e.n(interfaceC1695hT)) == null || (bVarA = tVar.a(bVarN)) == null || (interfaceC1692eB = C1711y.b(h10, bVarA)) == null) {
            return null;
        }
        return interfaceC1692eB.u();
    }

    public static boolean A0(U u10) {
        if (u10 == null) {
            a(130);
        }
        return i0(u10, p.a.f13417I0.j());
    }

    public static boolean B0(InterfaceC1700m interfaceC1700m) {
        if (interfaceC1700m == null) {
            a(10);
        }
        while (interfaceC1700m != null) {
            if (interfaceC1700m instanceof N) {
                return ((N) interfaceC1700m).f().i(p.f13399z);
            }
            interfaceC1700m = interfaceC1700m.c();
        }
        return false;
    }

    public static boolean C0(U u10) {
        if (u10 == null) {
            a(143);
        }
        return m0(u10, p.a.f13451f);
    }

    public static boolean D0(U u10) {
        if (u10 == null) {
            a(133);
        }
        return x0(u10) || A0(u10) || y0(u10) || z0(u10);
    }

    public static m N(U u10) {
        if (u10 == null) {
            a(93);
        }
        InterfaceC1695h interfaceC1695hT = u10.O0().t();
        if (interfaceC1695hT == null) {
            return null;
        }
        return P(interfaceC1695hT);
    }

    public static m P(InterfaceC1700m interfaceC1700m) {
        if (interfaceC1700m == null) {
            a(78);
        }
        if (p.a.f13425M0.contains(interfaceC1700m.getName())) {
            return p.a.f13429O0.get(C4597i.m(interfaceC1700m));
        }
        return null;
    }

    private InterfaceC1692e Q(m mVar) {
        if (mVar == null) {
            a(16);
        }
        return p(mVar.v().j());
    }

    public static m S(InterfaceC1700m interfaceC1700m) {
        if (interfaceC1700m == null) {
            a(77);
        }
        if (p.a.f13423L0.contains(interfaceC1700m.getName())) {
            return p.a.f13427N0.get(C4597i.m(interfaceC1700m));
        }
        return null;
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                i11 = 2;
                break;
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 73:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case 77:
            case 78:
            case Temperature.MAX_TEMPERATURE_FOR_ESTIMATE /* 90 */:
            case 97:
            case 104:
            case 108:
            case 109:
            case 144:
            case 147:
            case 148:
            case 150:
            case 158:
            case 159:
            case 160:
            case 161:
                objArr[0] = "descriptor";
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case Temperature.MAX_INTERNAL_PROBE /* 99 */:
            case 101:
            case 103:
            case Temperature.MAX_INTERNAL_SECOND_GEN_PROBE /* 105 */:
            case 107:
            case ModuleDescriptor.MODULE_VERSION /* 136 */:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 54:
            case 89:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 98:
            case 100:
            case 106:
            case 110:
            case 111:
            case 112:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case TemperatureLog.MAX_TEMPERATURE_HISTORY_SAMPLES /* 120 */:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 145:
            case 146:
            case 149:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 163:
                objArr[0] = "type";
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case 68:
                objArr[0] = "arrayType";
                break;
            case 72:
                objArr[0] = "notNullArrayType";
                break;
            case 74:
                objArr[0] = "primitiveType";
                break;
            case 76:
                objArr[0] = "kotlinType";
                break;
            case 79:
            case 83:
                objArr[0] = "projectionType";
                break;
            case 80:
            case 84:
            case 86:
                objArr[0] = "argument";
                break;
            case 81:
                objArr[0] = "annotations";
                break;
            case 102:
                objArr[0] = "typeConstructor";
                break;
            case 113:
                objArr[0] = "classDescriptor";
                break;
            case 162:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKType";
                break;
            case 23:
                objArr[1] = "getKCallable";
                break;
            case 24:
                objArr[1] = "getKProperty";
                break;
            case 25:
                objArr[1] = "getKProperty0";
                break;
            case 26:
                objArr[1] = "getKProperty1";
                break;
            case 27:
                objArr[1] = "getKProperty2";
                break;
            case 28:
                objArr[1] = "getKMutableProperty0";
                break;
            case 29:
                objArr[1] = "getKMutableProperty1";
                break;
            case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
                objArr[1] = "getKMutableProperty2";
                break;
            case 31:
                objArr[1] = "getIterator";
                break;
            case 32:
                objArr[1] = "getIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterable";
                break;
            case 34:
                objArr[1] = "getMutableIterator";
                break;
            case 35:
                objArr[1] = "getCollection";
                break;
            case 36:
                objArr[1] = "getMutableCollection";
                break;
            case 37:
                objArr[1] = "getList";
                break;
            case 38:
                objArr[1] = "getMutableList";
                break;
            case 39:
                objArr[1] = "getSet";
                break;
            case 40:
                objArr[1] = "getMutableSet";
                break;
            case 41:
                objArr[1] = "getMap";
                break;
            case 42:
                objArr[1] = "getMutableMap";
                break;
            case 43:
                objArr[1] = "getMapEntry";
                break;
            case 44:
                objArr[1] = "getMutableMapEntry";
                break;
            case 45:
                objArr[1] = "getListIterator";
                break;
            case 46:
                objArr[1] = "getMutableListIterator";
                break;
            case 48:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 49:
                objArr[1] = "getNothingType";
                break;
            case 50:
                objArr[1] = "getNullableNothingType";
                break;
            case 51:
                objArr[1] = "getAnyType";
                break;
            case 52:
                objArr[1] = "getNullableAnyType";
                break;
            case 53:
                objArr[1] = "getDefaultBound";
                break;
            case 55:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 56:
                objArr[1] = "getNumberType";
                break;
            case 57:
                objArr[1] = "getByteType";
                break;
            case 58:
                objArr[1] = "getShortType";
                break;
            case 59:
                objArr[1] = "getIntType";
                break;
            case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
                objArr[1] = "getLongType";
                break;
            case 61:
                objArr[1] = "getFloatType";
                break;
            case 62:
                objArr[1] = "getDoubleType";
                break;
            case 63:
                objArr[1] = "getCharType";
                break;
            case 64:
                objArr[1] = "getBooleanType";
                break;
            case 65:
                objArr[1] = "getUnitType";
                break;
            case 66:
                objArr[1] = "getStringType";
                break;
            case 67:
                objArr[1] = "getIterableType";
                break;
            case 69:
            case 70:
            case 71:
                objArr[1] = "getArrayElementType";
                break;
            case 75:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 82:
            case 85:
                objArr[1] = "getArrayType";
                break;
            case 87:
                objArr[1] = "getEnumType";
                break;
            case 88:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 72:
            case 73:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 74:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 76:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 77:
            case 94:
                objArr[2] = "getPrimitiveType";
                break;
            case 78:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
                objArr[2] = "getArrayType";
                break;
            case 86:
                objArr[2] = "getEnumType";
                break;
            case 89:
                objArr[2] = "isArray";
                break;
            case Temperature.MAX_TEMPERATURE_FOR_ESTIMATE /* 90 */:
            case 91:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 92:
                objArr[2] = "isPrimitiveArray";
                break;
            case 93:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 95:
                objArr[2] = "isPrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 97:
                objArr[2] = "isPrimitiveClass";
                break;
            case 98:
            case Temperature.MAX_INTERNAL_PROBE /* 99 */:
            case 100:
            case 101:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 102:
            case 103:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 104:
            case Temperature.MAX_INTERNAL_SECOND_GEN_PROBE /* 105 */:
                objArr[2] = "classFqNameEquals";
                break;
            case 106:
            case 107:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 108:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 109:
            case 110:
                objArr[2] = "isAny";
                break;
            case 111:
            case 113:
                objArr[2] = "isBoolean";
                break;
            case 112:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 114:
                objArr[2] = "isNumber";
                break;
            case 115:
                objArr[2] = "isChar";
                break;
            case 116:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 117:
                objArr[2] = "isInt";
                break;
            case 118:
                objArr[2] = "isByte";
                break;
            case 119:
                objArr[2] = "isLong";
                break;
            case TemperatureLog.MAX_TEMPERATURE_HISTORY_SAMPLES /* 120 */:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 121:
                objArr[2] = "isShort";
                break;
            case 122:
                objArr[2] = "isFloat";
                break;
            case 123:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 124:
                objArr[2] = "isDouble";
                break;
            case 125:
                objArr[2] = "isUByte";
                break;
            case 126:
                objArr[2] = "isUShort";
                break;
            case 127:
                objArr[2] = "isUInt";
                break;
            case 128:
                objArr[2] = "isULong";
                break;
            case 129:
                objArr[2] = "isUByteArray";
                break;
            case 130:
                objArr[2] = "isUShortArray";
                break;
            case 131:
                objArr[2] = "isUIntArray";
                break;
            case 132:
                objArr[2] = "isULongArray";
                break;
            case 133:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 134:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 135:
            case ModuleDescriptor.MODULE_VERSION /* 136 */:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 137:
                objArr[2] = "isNothing";
                break;
            case 138:
                objArr[2] = "isNullableNothing";
                break;
            case 139:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 140:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 141:
                objArr[2] = "isNullableAny";
                break;
            case 142:
                objArr[2] = "isDefaultBound";
                break;
            case 143:
                objArr[2] = "isUnit";
                break;
            case 144:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 145:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 146:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 147:
                objArr[2] = "isMemberOfAny";
                break;
            case 148:
            case 149:
                objArr[2] = "isEnum";
                break;
            case 150:
            case 151:
                objArr[2] = "isComparable";
                break;
            case 152:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 153:
                objArr[2] = "isListOrNullableList";
                break;
            case 154:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 155:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 156:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 157:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 158:
                objArr[2] = "isThrowable";
                break;
            case 159:
                objArr[2] = "isKClass";
                break;
            case 160:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 161:
                objArr[2] = "isCloneable";
                break;
            case 162:
                objArr[2] = "isDeprecated";
                break;
            case 163:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case Temperature.MAX_AMBIENT_BLOCK /* 60 */:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                throw new IllegalStateException(str2);
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static boolean a0(InterfaceC1692e interfaceC1692e) {
        if (interfaceC1692e == null) {
            a(109);
        }
        return e(interfaceC1692e, p.a.f13443b);
    }

    public static boolean b0(U u10) {
        if (u10 == null) {
            a(140);
        }
        return h0(u10, p.a.f13443b);
    }

    public static boolean c0(U u10) {
        if (u10 == null) {
            a(89);
        }
        return h0(u10, p.a.f13457i);
    }

    public static boolean d0(U u10) {
        if (u10 == null) {
            a(91);
        }
        return c0(u10) || q0(u10);
    }

    private static boolean e(InterfaceC1695h interfaceC1695h, qb.d dVar) {
        if (interfaceC1695h == null) {
            a(104);
        }
        if (dVar == null) {
            a(Temperature.MAX_INTERNAL_SECOND_GEN_PROBE);
        }
        return interfaceC1695h.getName().equals(dVar.i()) && dVar.equals(C4597i.m(interfaceC1695h));
    }

    public static boolean e0(InterfaceC1692e interfaceC1692e) {
        if (interfaceC1692e == null) {
            a(90);
        }
        return e(interfaceC1692e, p.a.f13457i) || P(interfaceC1692e) != null;
    }

    public static boolean f0(U u10) {
        if (u10 == null) {
            a(111);
        }
        return i0(u10, p.a.f13459j);
    }

    public static boolean g0(InterfaceC1700m interfaceC1700m) {
        if (interfaceC1700m == null) {
            a(9);
        }
        return C4597i.r(interfaceC1700m, Oa.c.class, false) != null;
    }

    private static boolean h0(U u10, qb.d dVar) {
        if (u10 == null) {
            a(98);
        }
        if (dVar == null) {
            a(99);
        }
        return w0(u10.O0(), dVar);
    }

    private static boolean i0(U u10, qb.d dVar) {
        if (u10 == null) {
            a(135);
        }
        if (dVar == null) {
            a(ModuleDescriptor.MODULE_VERSION);
        }
        return h0(u10, dVar) && !u10.P0();
    }

    public static boolean j0(U u10) {
        if (u10 == null) {
            a(142);
        }
        return p0(u10);
    }

    public static boolean k0(InterfaceC1700m interfaceC1700m) {
        if (interfaceC1700m == null) {
            a(162);
        }
        if (interfaceC1700m.L0().getAnnotations().P(p.a.f13489y)) {
            return true;
        }
        if (!(interfaceC1700m instanceof Z)) {
            return false;
        }
        Z z10 = (Z) interfaceC1700m;
        boolean zH0 = z10.h0();
        a0 a0VarE = z10.e();
        b0 b0VarH = z10.h();
        if (a0VarE != null && k0(a0VarE)) {
            if (!zH0) {
                return true;
            }
            if (b0VarH != null && k0(b0VarH)) {
                return true;
            }
        }
        return false;
    }

    public static boolean l0(InterfaceC1692e interfaceC1692e) {
        if (interfaceC1692e == null) {
            a(159);
        }
        return e(interfaceC1692e, p.a.f13464l0);
    }

    private static boolean m0(U u10, qb.d dVar) {
        if (u10 == null) {
            a(106);
        }
        if (dVar == null) {
            a(107);
        }
        return !u10.P0() && h0(u10, dVar);
    }

    public static boolean n0(U u10) {
        if (u10 == null) {
            a(137);
        }
        return o0(u10) && !M0.l(u10);
    }

    public static boolean o0(U u10) {
        if (u10 == null) {
            a(139);
        }
        return h0(u10, p.a.f13445c);
    }

    private InterfaceC1692e p(String str) {
        if (str == null) {
            a(14);
        }
        InterfaceC1692e interfaceC1692eInvoke = this.f13324e.invoke(qb.f.t(str));
        if (interfaceC1692eInvoke == null) {
            a(15);
        }
        return interfaceC1692eInvoke;
    }

    public static boolean p0(U u10) {
        if (u10 == null) {
            a(141);
        }
        return b0(u10) && u10.P0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC1082f0 q(String str) {
        if (str == null) {
            a(47);
        }
        AbstractC1082f0 abstractC1082f0U = p(str).u();
        if (abstractC1082f0U == null) {
            a(48);
        }
        return abstractC1082f0U;
    }

    public static boolean q0(U u10) {
        if (u10 == null) {
            a(92);
        }
        InterfaceC1695h interfaceC1695hT = u10.O0().t();
        return (interfaceC1695hT == null || P(interfaceC1695hT) == null) ? false : true;
    }

    public static boolean r0(InterfaceC1692e interfaceC1692e) {
        if (interfaceC1692e == null) {
            a(97);
        }
        return S(interfaceC1692e) != null;
    }

    public static boolean s0(U u10) {
        if (u10 == null) {
            a(95);
        }
        return !u10.P0() && t0(u10);
    }

    public static boolean t0(U u10) {
        if (u10 == null) {
            a(96);
        }
        InterfaceC1695h interfaceC1695hT = u10.O0().t();
        return (interfaceC1695hT instanceof InterfaceC1692e) && r0((InterfaceC1692e) interfaceC1695hT);
    }

    public static boolean u0(InterfaceC1692e interfaceC1692e) {
        if (interfaceC1692e == null) {
            a(108);
        }
        return e(interfaceC1692e, p.a.f13443b) || e(interfaceC1692e, p.a.f13445c);
    }

    public static boolean v0(U u10) {
        return u10 != null && m0(u10, p.a.f13455h);
    }

    public static boolean w0(y0 y0Var, qb.d dVar) {
        if (y0Var == null) {
            a(102);
        }
        if (dVar == null) {
            a(103);
        }
        InterfaceC1695h interfaceC1695hT = y0Var.t();
        return (interfaceC1695hT instanceof InterfaceC1692e) && e(interfaceC1695hT, dVar);
    }

    public static boolean x0(U u10) {
        if (u10 == null) {
            a(129);
        }
        return i0(u10, p.a.f13415H0.j());
    }

    public static boolean y0(U u10) {
        if (u10 == null) {
            a(131);
        }
        return i0(u10, p.a.f13419J0.j());
    }

    public static boolean z0(U u10) {
        if (u10 == null) {
            a(132);
        }
        return i0(u10, p.a.f13421K0.j());
    }

    public AbstractC1082f0 B() {
        AbstractC1082f0 abstractC1082f0R = R(m.f13343M);
        if (abstractC1082f0R == null) {
            a(61);
        }
        return abstractC1082f0R;
    }

    public InterfaceC1692e C(int i10) {
        return p(p.b(i10));
    }

    public AbstractC1082f0 D() {
        AbstractC1082f0 abstractC1082f0R = R(m.f13342L);
        if (abstractC1082f0R == null) {
            a(59);
        }
        return abstractC1082f0R;
    }

    public InterfaceC1692e E() {
        InterfaceC1692e interfaceC1692eO = o(p.a.f13464l0.l());
        if (interfaceC1692eO == null) {
            a(21);
        }
        return interfaceC1692eO;
    }

    public void E0(F f10) {
        if (f10 == null) {
            a(1);
        }
        this.f13325f.c(new d(f10));
    }

    public AbstractC1082f0 F() {
        AbstractC1082f0 abstractC1082f0R = R(m.f13344N);
        if (abstractC1082f0R == null) {
            a(60);
        }
        return abstractC1082f0R;
    }

    public InterfaceC1692e G() {
        return p("Nothing");
    }

    public AbstractC1082f0 H() {
        AbstractC1082f0 abstractC1082f0U = G().u();
        if (abstractC1082f0U == null) {
            a(49);
        }
        return abstractC1082f0U;
    }

    public AbstractC1082f0 I() {
        AbstractC1082f0 abstractC1082f0V0 = i().S0(true);
        if (abstractC1082f0V0 == null) {
            a(52);
        }
        return abstractC1082f0V0;
    }

    public AbstractC1082f0 J() {
        AbstractC1082f0 abstractC1082f0V0 = H().S0(true);
        if (abstractC1082f0V0 == null) {
            a(50);
        }
        return abstractC1082f0V0;
    }

    public InterfaceC1692e K() {
        return p("Number");
    }

    public AbstractC1082f0 L() {
        AbstractC1082f0 abstractC1082f0U = K().u();
        if (abstractC1082f0U == null) {
            a(56);
        }
        return abstractC1082f0U;
    }

    protected Ta.c M() {
        c.b bVar = c.b.f16661a;
        if (bVar == null) {
            a(4);
        }
        return bVar;
    }

    public AbstractC1082f0 O(m mVar) {
        if (mVar == null) {
            a(74);
        }
        AbstractC1082f0 abstractC1082f0 = this.f13322c.invoke().f13331a.get(mVar);
        if (abstractC1082f0 == null) {
            a(75);
        }
        return abstractC1082f0;
    }

    public AbstractC1082f0 R(m mVar) {
        if (mVar == null) {
            a(54);
        }
        AbstractC1082f0 abstractC1082f0U = Q(mVar).u();
        if (abstractC1082f0U == null) {
            a(55);
        }
        return abstractC1082f0U;
    }

    public AbstractC1082f0 T() {
        AbstractC1082f0 abstractC1082f0R = R(m.f13341K);
        if (abstractC1082f0R == null) {
            a(58);
        }
        return abstractC1082f0R;
    }

    protected Gb.n U() {
        Gb.n nVar = this.f13325f;
        if (nVar == null) {
            a(6);
        }
        return nVar;
    }

    public InterfaceC1692e V() {
        return p("String");
    }

    public AbstractC1082f0 W() {
        AbstractC1082f0 abstractC1082f0U = V().u();
        if (abstractC1082f0U == null) {
            a(66);
        }
        return abstractC1082f0U;
    }

    public InterfaceC1692e X(int i10) {
        InterfaceC1692e interfaceC1692eO = o(p.f13392s.c(qb.f.t(p.d(i10))));
        if (interfaceC1692eO == null) {
            a(18);
        }
        return interfaceC1692eO;
    }

    public InterfaceC1692e Y() {
        return p("Unit");
    }

    public AbstractC1082f0 Z() {
        AbstractC1082f0 abstractC1082f0U = Y().u();
        if (abstractC1082f0U == null) {
            a(65);
        }
        return abstractC1082f0U;
    }

    protected void f(boolean z10) {
        F f10 = new F(f13319g, this.f13325f, this, null);
        this.f13320a = f10;
        f10.P0(Oa.b.f13311a.c().a(this.f13325f, this.f13320a, v(), M(), g(), z10));
        F f11 = this.f13320a;
        f11.X0(f11);
    }

    protected Ta.a g() {
        a.C0255a c0255a = a.C0255a.f16659a;
        if (c0255a == null) {
            a(3);
        }
        return c0255a;
    }

    public InterfaceC1692e h() {
        return p("Any");
    }

    public AbstractC1082f0 i() {
        AbstractC1082f0 abstractC1082f0U = h().u();
        if (abstractC1082f0U == null) {
            a(51);
        }
        return abstractC1082f0U;
    }

    public InterfaceC1692e j() {
        return p("Array");
    }

    public U k(U u10) {
        U uA;
        if (u10 == null) {
            a(68);
        }
        if (c0(u10)) {
            if (u10.M0().size() != 1) {
                throw new IllegalStateException();
            }
            U uA2 = u10.M0().get(0).a();
            if (uA2 == null) {
                a(69);
            }
            return uA2;
        }
        U uN = M0.n(u10);
        AbstractC1082f0 abstractC1082f0 = this.f13322c.invoke().f13333c.get(uN);
        if (abstractC1082f0 != null) {
            return abstractC1082f0;
        }
        H h10 = C4597i.h(uN);
        if (h10 != null && (uA = A(uN, h10)) != null) {
            return uA;
        }
        throw new IllegalStateException("not array: " + u10);
    }

    public AbstractC1082f0 l(Q0 q02, U u10) {
        if (q02 == null) {
            a(83);
        }
        if (u10 == null) {
            a(84);
        }
        AbstractC1082f0 abstractC1082f0M = m(q02, u10, Sa.h.f15630e.b());
        if (abstractC1082f0M == null) {
            a(85);
        }
        return abstractC1082f0M;
    }

    public AbstractC1082f0 m(Q0 q02, U u10, Sa.h hVar) {
        if (q02 == null) {
            a(79);
        }
        if (u10 == null) {
            a(80);
        }
        if (hVar == null) {
            a(81);
        }
        AbstractC1082f0 abstractC1082f0H = X.h(v0.b(hVar), j(), Collections.singletonList(new G0(q02, u10)));
        if (abstractC1082f0H == null) {
            a(82);
        }
        return abstractC1082f0H;
    }

    public AbstractC1082f0 n() {
        AbstractC1082f0 abstractC1082f0R = R(m.f13338H);
        if (abstractC1082f0R == null) {
            a(64);
        }
        return abstractC1082f0R;
    }

    public InterfaceC1692e o(qb.c cVar) {
        if (cVar == null) {
            a(12);
        }
        InterfaceC1692e interfaceC1692eD = C1705s.d(r(), cVar, Za.d.f19628E);
        if (interfaceC1692eD == null) {
            a(13);
        }
        return interfaceC1692eD;
    }

    public F r() {
        if (this.f13320a == null) {
            this.f13320a = this.f13321b.invoke();
        }
        F f10 = this.f13320a;
        if (f10 == null) {
            a(7);
        }
        return f10;
    }

    public Ab.k s() {
        Ab.k kVarS = r().G(p.f13366A).s();
        if (kVarS == null) {
            a(11);
        }
        return kVarS;
    }

    public AbstractC1082f0 t() {
        AbstractC1082f0 abstractC1082f0R = R(m.f13340J);
        if (abstractC1082f0R == null) {
            a(57);
        }
        return abstractC1082f0R;
    }

    public AbstractC1082f0 u() {
        AbstractC1082f0 abstractC1082f0R = R(m.f13339I);
        if (abstractC1082f0R == null) {
            a(63);
        }
        return abstractC1082f0R;
    }

    protected Iterable<Ta.b> v() {
        List listSingletonList = Collections.singletonList(new Pa.a(this.f13325f, r()));
        if (listSingletonList == null) {
            a(5);
        }
        return listSingletonList;
    }

    public InterfaceC1692e w() {
        InterfaceC1692e interfaceC1692eO = o(p.a.f13438X);
        if (interfaceC1692eO == null) {
            a(35);
        }
        return interfaceC1692eO;
    }

    public InterfaceC1692e x() {
        return p("Comparable");
    }

    public AbstractC1082f0 y() {
        AbstractC1082f0 abstractC1082f0I = I();
        if (abstractC1082f0I == null) {
            a(53);
        }
        return abstractC1082f0I;
    }

    public AbstractC1082f0 z() {
        AbstractC1082f0 abstractC1082f0R = R(m.f13345O);
        if (abstractC1082f0R == null) {
            a(62);
        }
        return abstractC1082f0R;
    }
}
