package ab;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jb.C3762F;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4170o;
import va.C4929b;
import va.InterfaceC4928a;
import yb.EnumC5149e;

/* compiled from: SpecialGenericSignatures.kt */
/* renamed from: ab.U, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1939U {

    /* renamed from: a, reason: collision with root package name */
    public static final a f20204a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final List<a.C0288a> f20205b;

    /* renamed from: c, reason: collision with root package name */
    private static final List<String> f20206c;

    /* renamed from: d, reason: collision with root package name */
    private static final List<String> f20207d;

    /* renamed from: e, reason: collision with root package name */
    private static final Map<a.C0288a, c> f20208e;

    /* renamed from: f, reason: collision with root package name */
    private static final Map<String, c> f20209f;

    /* renamed from: g, reason: collision with root package name */
    private static final Set<qb.f> f20210g;

    /* renamed from: h, reason: collision with root package name */
    private static final Set<String> f20211h;

    /* renamed from: i, reason: collision with root package name */
    private static final a.C0288a f20212i;

    /* renamed from: j, reason: collision with root package name */
    private static final Map<a.C0288a, qb.f> f20213j;

    /* renamed from: k, reason: collision with root package name */
    private static final Map<String, qb.f> f20214k;

    /* renamed from: l, reason: collision with root package name */
    private static final Set<String> f20215l;

    /* renamed from: m, reason: collision with root package name */
    private static final Set<qb.f> f20216m;

    /* renamed from: n, reason: collision with root package name */
    private static final Map<qb.f, qb.f> f20217n;

    /* compiled from: SpecialGenericSignatures.kt */
    /* renamed from: ab.U$a */
    public static final class a {

        /* compiled from: SpecialGenericSignatures.kt */
        /* renamed from: ab.U$a$a, reason: collision with other inner class name */
        public static final class C0288a {

            /* renamed from: a, reason: collision with root package name */
            private final String f20218a;

            /* renamed from: b, reason: collision with root package name */
            private final qb.f f20219b;

            /* renamed from: c, reason: collision with root package name */
            private final String f20220c;

            /* renamed from: d, reason: collision with root package name */
            private final String f20221d;

            /* renamed from: e, reason: collision with root package name */
            private final String f20222e;

            public C0288a(String classInternalName, qb.f name, String parameters, String returnType) {
                C3862t.g(classInternalName, "classInternalName");
                C3862t.g(name, "name");
                C3862t.g(parameters, "parameters");
                C3862t.g(returnType, "returnType");
                this.f20218a = classInternalName;
                this.f20219b = name;
                this.f20220c = parameters;
                this.f20221d = returnType;
                this.f20222e = C3762F.f43573a.l(classInternalName, name + '(' + parameters + ')' + returnType);
            }

            public static /* synthetic */ C0288a b(C0288a c0288a, String str, qb.f fVar, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = c0288a.f20218a;
                }
                if ((i10 & 2) != 0) {
                    fVar = c0288a.f20219b;
                }
                if ((i10 & 4) != 0) {
                    str2 = c0288a.f20220c;
                }
                if ((i10 & 8) != 0) {
                    str3 = c0288a.f20221d;
                }
                return c0288a.a(str, fVar, str2, str3);
            }

            public final C0288a a(String classInternalName, qb.f name, String parameters, String returnType) {
                C3862t.g(classInternalName, "classInternalName");
                C3862t.g(name, "name");
                C3862t.g(parameters, "parameters");
                C3862t.g(returnType, "returnType");
                return new C0288a(classInternalName, name, parameters, returnType);
            }

            public final qb.f c() {
                return this.f20219b;
            }

            public final String d() {
                return this.f20222e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0288a)) {
                    return false;
                }
                C0288a c0288a = (C0288a) obj;
                return C3862t.b(this.f20218a, c0288a.f20218a) && C3862t.b(this.f20219b, c0288a.f20219b) && C3862t.b(this.f20220c, c0288a.f20220c) && C3862t.b(this.f20221d, c0288a.f20221d);
            }

            public int hashCode() {
                return (((((this.f20218a.hashCode() * 31) + this.f20219b.hashCode()) * 31) + this.f20220c.hashCode()) * 31) + this.f20221d.hashCode();
            }

            public String toString() {
                return "NameAndSignature(classInternalName=" + this.f20218a + ", name=" + this.f20219b + ", parameters=" + this.f20220c + ", returnType=" + this.f20221d + ')';
            }
        }

        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C0288a m(String str, String str2, String str3, String str4) {
            qb.f fVarT = qb.f.t(str2);
            C3862t.f(fVarT, "identifier(...)");
            return new C0288a(str, fVarT, str3, str4);
        }

        public final qb.f b(qb.f name) {
            C3862t.g(name, "name");
            return f().get(name);
        }

        public final List<String> c() {
            return C1939U.f20206c;
        }

        public final Set<qb.f> d() {
            return C1939U.f20210g;
        }

        public final Set<String> e() {
            return C1939U.f20211h;
        }

        public final Map<qb.f, qb.f> f() {
            return C1939U.f20217n;
        }

        public final Set<qb.f> g() {
            return C1939U.f20216m;
        }

        public final C0288a h() {
            return C1939U.f20212i;
        }

        public final Map<String, c> i() {
            return C1939U.f20209f;
        }

        public final Map<String, qb.f> j() {
            return C1939U.f20214k;
        }

        public final boolean k(qb.f fVar) {
            C3862t.g(fVar, "<this>");
            return g().contains(fVar);
        }

        public final b l(String builtinSignature) {
            C3862t.g(builtinSignature, "builtinSignature");
            return c().contains(builtinSignature) ? b.f20223D : ((c) kotlin.collections.M.i(i(), builtinSignature)) == c.f20230C ? b.f20225F : b.f20224E;
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SpecialGenericSignatures.kt */
    /* renamed from: ab.U$b */
    public static final class b {

        /* renamed from: D, reason: collision with root package name */
        public static final b f20223D = new b("ONE_COLLECTION_PARAMETER", 0, "Ljava/util/Collection<+Ljava/lang/Object;>;", false);

        /* renamed from: E, reason: collision with root package name */
        public static final b f20224E = new b("OBJECT_PARAMETER_NON_GENERIC", 1, null, true);

        /* renamed from: F, reason: collision with root package name */
        public static final b f20225F = new b("OBJECT_PARAMETER_GENERIC", 2, "Ljava/lang/Object;", true);

        /* renamed from: G, reason: collision with root package name */
        private static final /* synthetic */ b[] f20226G;

        /* renamed from: H, reason: collision with root package name */
        private static final /* synthetic */ InterfaceC4928a f20227H;

        /* renamed from: B, reason: collision with root package name */
        private final String f20228B;

        /* renamed from: C, reason: collision with root package name */
        private final boolean f20229C;

        static {
            b[] bVarArrC = c();
            f20226G = bVarArrC;
            f20227H = C4929b.a(bVarArrC);
        }

        private b(String str, int i10, String str2, boolean z10) {
            this.f20228B = str2;
            this.f20229C = z10;
        }

        private static final /* synthetic */ b[] c() {
            return new b[]{f20223D, f20224E, f20225F};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f20226G.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SpecialGenericSignatures.kt */
    /* renamed from: ab.U$c */
    public static final class c {

        /* renamed from: C, reason: collision with root package name */
        public static final c f20230C = new c("NULL", 0, null);

        /* renamed from: D, reason: collision with root package name */
        public static final c f20231D = new c("INDEX", 1, -1);

        /* renamed from: E, reason: collision with root package name */
        public static final c f20232E = new c("FALSE", 2, Boolean.FALSE);

        /* renamed from: F, reason: collision with root package name */
        public static final c f20233F = new a("MAP_GET_OR_DEFAULT", 3);

        /* renamed from: G, reason: collision with root package name */
        private static final /* synthetic */ c[] f20234G;

        /* renamed from: H, reason: collision with root package name */
        private static final /* synthetic */ InterfaceC4928a f20235H;

        /* renamed from: B, reason: collision with root package name */
        private final Object f20236B;

        /* compiled from: SpecialGenericSignatures.kt */
        /* renamed from: ab.U$c$a */
        static final class a extends c {
            /* JADX WARN: Illegal instructions before constructor call */
            a(String str, int i10) {
                C3854k c3854k = null;
                super(str, i10, c3854k, c3854k);
            }
        }

        static {
            c[] cVarArrC = c();
            f20234G = cVarArrC;
            f20235H = C4929b.a(cVarArrC);
        }

        public /* synthetic */ c(String str, int i10, Object obj, C3854k c3854k) {
            this(str, i10, obj);
        }

        private static final /* synthetic */ c[] c() {
            return new c[]{f20230C, f20231D, f20232E, f20233F};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f20234G.clone();
        }

        private c(String str, int i10, Object obj) {
            this.f20236B = obj;
        }
    }

    static {
        Set<String> setG = kotlin.collections.V.g("containsAll", "removeAll", "retainAll");
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(setG, 10));
        for (String str : setG) {
            a aVar = f20204a;
            String strP = EnumC5149e.BOOLEAN.p();
            C3862t.f(strP, "getDesc(...)");
            arrayList.add(aVar.m("java/util/Collection", str, "Ljava/util/Collection;", strP));
        }
        f20205b = arrayList;
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(kotlin.collections.r.x(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((a.C0288a) it.next()).d());
        }
        f20206c = arrayList3;
        List<a.C0288a> list = f20205b;
        ArrayList arrayList4 = new ArrayList(kotlin.collections.r.x(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((a.C0288a) it2.next()).c().j());
        }
        f20207d = arrayList4;
        C3762F c3762f = C3762F.f43573a;
        a aVar2 = f20204a;
        String strI = c3762f.i("Collection");
        EnumC5149e enumC5149e = EnumC5149e.BOOLEAN;
        String strP2 = enumC5149e.p();
        C3862t.f(strP2, "getDesc(...)");
        a.C0288a c0288aM = aVar2.m(strI, "contains", "Ljava/lang/Object;", strP2);
        c cVar = c.f20232E;
        C4170o c4170oA = oa.v.a(c0288aM, cVar);
        String strI2 = c3762f.i("Collection");
        String strP3 = enumC5149e.p();
        C3862t.f(strP3, "getDesc(...)");
        C4170o c4170oA2 = oa.v.a(aVar2.m(strI2, "remove", "Ljava/lang/Object;", strP3), cVar);
        String strI3 = c3762f.i("Map");
        String strP4 = enumC5149e.p();
        C3862t.f(strP4, "getDesc(...)");
        C4170o c4170oA3 = oa.v.a(aVar2.m(strI3, "containsKey", "Ljava/lang/Object;", strP4), cVar);
        String strI4 = c3762f.i("Map");
        String strP5 = enumC5149e.p();
        C3862t.f(strP5, "getDesc(...)");
        C4170o c4170oA4 = oa.v.a(aVar2.m(strI4, "containsValue", "Ljava/lang/Object;", strP5), cVar);
        String strI5 = c3762f.i("Map");
        String strP6 = enumC5149e.p();
        C3862t.f(strP6, "getDesc(...)");
        C4170o c4170oA5 = oa.v.a(aVar2.m(strI5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", strP6), cVar);
        C4170o c4170oA6 = oa.v.a(aVar2.m(c3762f.i("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), c.f20233F);
        a.C0288a c0288aM2 = aVar2.m(c3762f.i("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        c cVar2 = c.f20230C;
        C4170o c4170oA7 = oa.v.a(c0288aM2, cVar2);
        C4170o c4170oA8 = oa.v.a(aVar2.m(c3762f.i("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), cVar2);
        String strI6 = c3762f.i("List");
        EnumC5149e enumC5149e2 = EnumC5149e.INT;
        String strP7 = enumC5149e2.p();
        C3862t.f(strP7, "getDesc(...)");
        a.C0288a c0288aM3 = aVar2.m(strI6, "indexOf", "Ljava/lang/Object;", strP7);
        c cVar3 = c.f20231D;
        C4170o c4170oA9 = oa.v.a(c0288aM3, cVar3);
        String strI7 = c3762f.i("List");
        String strP8 = enumC5149e2.p();
        C3862t.f(strP8, "getDesc(...)");
        Map<a.C0288a, c> mapK = kotlin.collections.M.k(c4170oA, c4170oA2, c4170oA3, c4170oA4, c4170oA5, c4170oA6, c4170oA7, c4170oA8, c4170oA9, oa.v.a(aVar2.m(strI7, "lastIndexOf", "Ljava/lang/Object;", strP8), cVar3));
        f20208e = mapK;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.M.d(mapK.size()));
        Iterator<T> it3 = mapK.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            linkedHashMap.put(((a.C0288a) entry.getKey()).d(), entry.getValue());
        }
        f20209f = linkedHashMap;
        Set setJ = kotlin.collections.V.j(f20208e.keySet(), f20205b);
        ArrayList arrayList5 = new ArrayList(kotlin.collections.r.x(setJ, 10));
        Iterator it4 = setJ.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((a.C0288a) it4.next()).c());
        }
        f20210g = kotlin.collections.r.b1(arrayList5);
        ArrayList arrayList6 = new ArrayList(kotlin.collections.r.x(setJ, 10));
        Iterator it5 = setJ.iterator();
        while (it5.hasNext()) {
            arrayList6.add(((a.C0288a) it5.next()).d());
        }
        f20211h = kotlin.collections.r.b1(arrayList6);
        a aVar3 = f20204a;
        EnumC5149e enumC5149e3 = EnumC5149e.INT;
        String strP9 = enumC5149e3.p();
        C3862t.f(strP9, "getDesc(...)");
        a.C0288a c0288aM4 = aVar3.m("java/util/List", "removeAt", strP9, "Ljava/lang/Object;");
        f20212i = c0288aM4;
        C3762F c3762f2 = C3762F.f43573a;
        String strH = c3762f2.h("Number");
        String strP10 = EnumC5149e.BYTE.p();
        C3862t.f(strP10, "getDesc(...)");
        C4170o c4170oA10 = oa.v.a(aVar3.m(strH, "toByte", "", strP10), qb.f.t("byteValue"));
        String strH2 = c3762f2.h("Number");
        String strP11 = EnumC5149e.SHORT.p();
        C3862t.f(strP11, "getDesc(...)");
        C4170o c4170oA11 = oa.v.a(aVar3.m(strH2, "toShort", "", strP11), qb.f.t("shortValue"));
        String strH3 = c3762f2.h("Number");
        String strP12 = enumC5149e3.p();
        C3862t.f(strP12, "getDesc(...)");
        C4170o c4170oA12 = oa.v.a(aVar3.m(strH3, "toInt", "", strP12), qb.f.t("intValue"));
        String strH4 = c3762f2.h("Number");
        String strP13 = EnumC5149e.LONG.p();
        C3862t.f(strP13, "getDesc(...)");
        C4170o c4170oA13 = oa.v.a(aVar3.m(strH4, "toLong", "", strP13), qb.f.t("longValue"));
        String strH5 = c3762f2.h("Number");
        String strP14 = EnumC5149e.FLOAT.p();
        C3862t.f(strP14, "getDesc(...)");
        C4170o c4170oA14 = oa.v.a(aVar3.m(strH5, "toFloat", "", strP14), qb.f.t("floatValue"));
        String strH6 = c3762f2.h("Number");
        String strP15 = EnumC5149e.DOUBLE.p();
        C3862t.f(strP15, "getDesc(...)");
        C4170o c4170oA15 = oa.v.a(aVar3.m(strH6, "toDouble", "", strP15), qb.f.t("doubleValue"));
        C4170o c4170oA16 = oa.v.a(c0288aM4, qb.f.t("remove"));
        String strH7 = c3762f2.h("CharSequence");
        String strP16 = enumC5149e3.p();
        C3862t.f(strP16, "getDesc(...)");
        String strP17 = EnumC5149e.CHAR.p();
        C3862t.f(strP17, "getDesc(...)");
        Map<a.C0288a, qb.f> mapK2 = kotlin.collections.M.k(c4170oA10, c4170oA11, c4170oA12, c4170oA13, c4170oA14, c4170oA15, c4170oA16, oa.v.a(aVar3.m(strH7, "get", strP16, strP17), qb.f.t("charAt")));
        f20213j = mapK2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(kotlin.collections.M.d(mapK2.size()));
        Iterator<T> it6 = mapK2.entrySet().iterator();
        while (it6.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it6.next();
            linkedHashMap2.put(((a.C0288a) entry2.getKey()).d(), entry2.getValue());
        }
        f20214k = linkedHashMap2;
        Map<a.C0288a, qb.f> map = f20213j;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<a.C0288a, qb.f> entry3 : map.entrySet()) {
            linkedHashSet.add(a.C0288a.b(entry3.getKey(), null, entry3.getValue(), null, null, 13, null).d());
        }
        f20215l = linkedHashSet;
        Set<a.C0288a> setKeySet = f20213j.keySet();
        HashSet hashSet = new HashSet();
        Iterator<T> it7 = setKeySet.iterator();
        while (it7.hasNext()) {
            hashSet.add(((a.C0288a) it7.next()).c());
        }
        f20216m = hashSet;
        Set<Map.Entry<a.C0288a, qb.f>> setEntrySet = f20213j.entrySet();
        ArrayList<C4170o> arrayList7 = new ArrayList(kotlin.collections.r.x(setEntrySet, 10));
        Iterator<T> it8 = setEntrySet.iterator();
        while (it8.hasNext()) {
            Map.Entry entry4 = (Map.Entry) it8.next();
            arrayList7.add(new C4170o(((a.C0288a) entry4.getKey()).c(), entry4.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(Ha.g.d(kotlin.collections.M.d(kotlin.collections.r.x(arrayList7, 10)), 16));
        for (C4170o c4170o : arrayList7) {
            linkedHashMap3.put((qb.f) c4170o.d(), (qb.f) c4170o.c());
        }
        f20217n = linkedHashMap3;
    }
}
