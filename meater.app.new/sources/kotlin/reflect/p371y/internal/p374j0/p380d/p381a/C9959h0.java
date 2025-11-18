package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import cm.aptoide.p092pt.database.room.RoomInstalled;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C10773s;
import kotlin.Pair;
import kotlin.collections.C10782c0;
import kotlin.collections.C10804n0;
import kotlin.collections.C10808p0;
import kotlin.collections.C10810q0;
import kotlin.collections.C10819v;
import kotlin.collections.C10822w0;
import kotlin.collections.C10824x0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.ranges.C9848l;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10108x;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.EnumC10240e;
import okhttp3.HttpUrl;

/* compiled from: SpecialGenericSignatures.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.h0 */
/* loaded from: classes2.dex */
public class C9959h0 {

    /* renamed from: a */
    public static final a f37865a = new a(null);

    /* renamed from: b */
    private static final List<a.C11543a> f37866b;

    /* renamed from: c */
    private static final List<String> f37867c;

    /* renamed from: d */
    private static final List<String> f37868d;

    /* renamed from: e */
    private static final Map<a.C11543a, c> f37869e;

    /* renamed from: f */
    private static final Map<String, c> f37870f;

    /* renamed from: g */
    private static final Set<C10163f> f37871g;

    /* renamed from: h */
    private static final Set<String> f37872h;

    /* renamed from: i */
    private static final a.C11543a f37873i;

    /* renamed from: j */
    private static final Map<a.C11543a, C10163f> f37874j;

    /* renamed from: k */
    private static final Map<String, C10163f> f37875k;

    /* renamed from: l */
    private static final List<C10163f> f37876l;

    /* renamed from: m */
    private static final Map<C10163f, C10163f> f37877m;

    /* compiled from: SpecialGenericSignatures.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.h0$a */
    public static final class a {

        /* compiled from: SpecialGenericSignatures.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.a.h0$a$a, reason: collision with other inner class name */
        public static final class C11543a {

            /* renamed from: a */
            private final C10163f f37878a;

            /* renamed from: b */
            private final String f37879b;

            public C11543a(C10163f c10163f, String str) {
                C9801m.m32346f(c10163f, "name");
                C9801m.m32346f(str, RoomInstalled.SIGNATURE);
                this.f37878a = c10163f;
                this.f37879b = str;
            }

            /* renamed from: a */
            public final C10163f m33136a() {
                return this.f37878a;
            }

            /* renamed from: b */
            public final String m33137b() {
                return this.f37879b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C11543a)) {
                    return false;
                }
                C11543a c11543a = (C11543a) obj;
                return C9801m.m32341a(this.f37878a, c11543a.f37878a) && C9801m.m32341a(this.f37879b, c11543a.f37879b);
            }

            public int hashCode() {
                return (this.f37878a.hashCode() * 31) + this.f37879b.hashCode();
            }

            public String toString() {
                return "NameAndSignature(name=" + this.f37878a + ", signature=" + this.f37879b + ')';
            }
        }

        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public final C11543a m33124m(String str, String str2, String str3, String str4) {
            C10163f c10163fM35454x = C10163f.m35454x(str2);
            C9801m.m32345e(c10163fM35454x, "identifier(name)");
            return new C11543a(c10163fM35454x, C10108x.f38488a.m34055k(str, str2 + '(' + str3 + ')' + str4));
        }

        /* renamed from: b */
        public final C10163f m33125b(C10163f c10163f) {
            C9801m.m32346f(c10163f, "name");
            return m33129f().get(c10163f);
        }

        /* renamed from: c */
        public final List<String> m33126c() {
            return C9959h0.f37867c;
        }

        /* renamed from: d */
        public final Set<C10163f> m33127d() {
            return C9959h0.f37871g;
        }

        /* renamed from: e */
        public final Set<String> m33128e() {
            return C9959h0.f37872h;
        }

        /* renamed from: f */
        public final Map<C10163f, C10163f> m33129f() {
            return C9959h0.f37877m;
        }

        /* renamed from: g */
        public final List<C10163f> m33130g() {
            return C9959h0.f37876l;
        }

        /* renamed from: h */
        public final C11543a m33131h() {
            return C9959h0.f37873i;
        }

        /* renamed from: i */
        public final Map<String, c> m33132i() {
            return C9959h0.f37870f;
        }

        /* renamed from: j */
        public final Map<String, C10163f> m33133j() {
            return C9959h0.f37875k;
        }

        /* renamed from: k */
        public final boolean m33134k(C10163f c10163f) {
            C9801m.m32346f(c10163f, "<this>");
            return m33130g().contains(c10163f);
        }

        /* renamed from: l */
        public final b m33135l(String str) {
            C9801m.m32346f(str, "builtinSignature");
            return m33126c().contains(str) ? b.ONE_COLLECTION_PARAMETER : ((c) C10804n0.m38779j(m33132i(), str)) == c.f37886f ? b.OBJECT_PARAMETER_GENERIC : b.OBJECT_PARAMETER_NON_GENERIC;
        }
    }

    /* compiled from: SpecialGenericSignatures.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.h0$b */
    public enum b {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);


        /* renamed from: j */
        private final String f37884j;

        /* renamed from: k */
        private final boolean f37885k;

        b(String str, boolean z) {
            this.f37884j = str;
            this.f37885k = z;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SpecialGenericSignatures.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.h0$c */
    public static final class c {

        /* renamed from: f */
        public static final c f37886f = new c("NULL", 0, null);

        /* renamed from: g */
        public static final c f37887g = new c("INDEX", 1, -1);

        /* renamed from: h */
        public static final c f37888h = new c("FALSE", 2, Boolean.FALSE);

        /* renamed from: i */
        public static final c f37889i = new a("MAP_GET_OR_DEFAULT", 3);

        /* renamed from: j */
        private static final /* synthetic */ c[] f37890j = m33139g();

        /* renamed from: k */
        private final Object f37891k;

        /* compiled from: SpecialGenericSignatures.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.a.h0$c$a */
        static final class a extends c {
            /* JADX WARN: Illegal instructions before constructor call */
            a(String str, int i2) {
                C9789g c9789g = null;
                super(str, i2, c9789g, c9789g);
            }
        }

        private c(String str, int i2, Object obj) {
            this.f37891k = obj;
        }

        public /* synthetic */ c(String str, int i2, Object obj, C9789g c9789g) {
            this(str, i2, obj);
        }

        /* renamed from: g */
        private static final /* synthetic */ c[] m33139g() {
            return new c[]{f37886f, f37887g, f37888h, f37889i};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f37890j.clone();
        }
    }

    static {
        Set<String> setM38922i = C10822w0.m38922i("containsAll", "removeAll", "retainAll");
        ArrayList arrayList = new ArrayList(C10819v.m38911u(setM38922i, 10));
        for (String str : setM38922i) {
            a aVar = f37865a;
            String strM36116u = EnumC10240e.BOOLEAN.m36116u();
            C9801m.m32345e(strM36116u, "BOOLEAN.desc");
            arrayList.add(aVar.m33124m("java/util/Collection", str, "Ljava/util/Collection;", strM36116u));
        }
        f37866b = arrayList;
        ArrayList arrayList2 = new ArrayList(C10819v.m38911u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((a.C11543a) it.next()).m33137b());
        }
        f37867c = arrayList2;
        List<a.C11543a> list = f37866b;
        ArrayList arrayList3 = new ArrayList(C10819v.m38911u(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((a.C11543a) it2.next()).m33136a().m35455k());
        }
        f37868d = arrayList3;
        C10108x c10108x = C10108x.f38488a;
        a aVar2 = f37865a;
        String strM34053i = c10108x.m34053i("Collection");
        EnumC10240e enumC10240e = EnumC10240e.BOOLEAN;
        String strM36116u2 = enumC10240e.m36116u();
        C9801m.m32345e(strM36116u2, "BOOLEAN.desc");
        a.C11543a c11543aM33124m = aVar2.m33124m(strM34053i, "contains", "Ljava/lang/Object;", strM36116u2);
        c cVar = c.f37888h;
        String strM34053i2 = c10108x.m34053i("Collection");
        String strM36116u3 = enumC10240e.m36116u();
        C9801m.m32345e(strM36116u3, "BOOLEAN.desc");
        String strM34053i3 = c10108x.m34053i("Map");
        String strM36116u4 = enumC10240e.m36116u();
        C9801m.m32345e(strM36116u4, "BOOLEAN.desc");
        String strM34053i4 = c10108x.m34053i("Map");
        String strM36116u5 = enumC10240e.m36116u();
        C9801m.m32345e(strM36116u5, "BOOLEAN.desc");
        String strM34053i5 = c10108x.m34053i("Map");
        String strM36116u6 = enumC10240e.m36116u();
        C9801m.m32345e(strM36116u6, "BOOLEAN.desc");
        a.C11543a c11543aM33124m2 = aVar2.m33124m(c10108x.m34053i("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        c cVar2 = c.f37886f;
        String strM34053i6 = c10108x.m34053i("List");
        EnumC10240e enumC10240e2 = EnumC10240e.INT;
        String strM36116u7 = enumC10240e2.m36116u();
        C9801m.m32345e(strM36116u7, "INT.desc");
        a.C11543a c11543aM33124m3 = aVar2.m33124m(strM34053i6, "indexOf", "Ljava/lang/Object;", strM36116u7);
        c cVar3 = c.f37887g;
        String strM34053i7 = c10108x.m34053i("List");
        String strM36116u8 = enumC10240e2.m36116u();
        C9801m.m32345e(strM36116u8, "INT.desc");
        Map<a.C11543a, c> mapM38800l = C10810q0.m38800l(C10773s.m38547a(c11543aM33124m, cVar), C10773s.m38547a(aVar2.m33124m(strM34053i2, "remove", "Ljava/lang/Object;", strM36116u3), cVar), C10773s.m38547a(aVar2.m33124m(strM34053i3, "containsKey", "Ljava/lang/Object;", strM36116u4), cVar), C10773s.m38547a(aVar2.m33124m(strM34053i4, "containsValue", "Ljava/lang/Object;", strM36116u5), cVar), C10773s.m38547a(aVar2.m33124m(strM34053i5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", strM36116u6), cVar), C10773s.m38547a(aVar2.m33124m(c10108x.m34053i("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), c.f37889i), C10773s.m38547a(c11543aM33124m2, cVar2), C10773s.m38547a(aVar2.m33124m(c10108x.m34053i("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), cVar2), C10773s.m38547a(c11543aM33124m3, cVar3), C10773s.m38547a(aVar2.m33124m(strM34053i7, "lastIndexOf", "Ljava/lang/Object;", strM36116u8), cVar3));
        f37869e = mapM38800l;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C10808p0.m38793e(mapM38800l.size()));
        Iterator<T> it3 = mapM38800l.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            linkedHashMap.put(((a.C11543a) entry.getKey()).m33137b(), entry.getValue());
        }
        f37870f = linkedHashMap;
        Set setM38925l = C10824x0.m38925l(f37869e.keySet(), f37866b);
        ArrayList arrayList4 = new ArrayList(C10819v.m38911u(setM38925l, 10));
        Iterator it4 = setM38925l.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((a.C11543a) it4.next()).m33136a());
        }
        f37871g = C10782c0.m38574I0(arrayList4);
        ArrayList arrayList5 = new ArrayList(C10819v.m38911u(setM38925l, 10));
        Iterator it5 = setM38925l.iterator();
        while (it5.hasNext()) {
            arrayList5.add(((a.C11543a) it5.next()).m33137b());
        }
        f37872h = C10782c0.m38574I0(arrayList5);
        a aVar3 = f37865a;
        EnumC10240e enumC10240e3 = EnumC10240e.INT;
        String strM36116u9 = enumC10240e3.m36116u();
        C9801m.m32345e(strM36116u9, "INT.desc");
        a.C11543a c11543aM33124m4 = aVar3.m33124m("java/util/List", "removeAt", strM36116u9, "Ljava/lang/Object;");
        f37873i = c11543aM33124m4;
        C10108x c10108x2 = C10108x.f38488a;
        String strM34052h = c10108x2.m34052h("Number");
        String strM36116u10 = EnumC10240e.BYTE.m36116u();
        C9801m.m32345e(strM36116u10, "BYTE.desc");
        String strM34052h2 = c10108x2.m34052h("Number");
        String strM36116u11 = EnumC10240e.SHORT.m36116u();
        C9801m.m32345e(strM36116u11, "SHORT.desc");
        String strM34052h3 = c10108x2.m34052h("Number");
        String strM36116u12 = enumC10240e3.m36116u();
        C9801m.m32345e(strM36116u12, "INT.desc");
        String strM34052h4 = c10108x2.m34052h("Number");
        String strM36116u13 = EnumC10240e.LONG.m36116u();
        C9801m.m32345e(strM36116u13, "LONG.desc");
        String strM34052h5 = c10108x2.m34052h("Number");
        String strM36116u14 = EnumC10240e.FLOAT.m36116u();
        C9801m.m32345e(strM36116u14, "FLOAT.desc");
        String strM34052h6 = c10108x2.m34052h("Number");
        String strM36116u15 = EnumC10240e.DOUBLE.m36116u();
        C9801m.m32345e(strM36116u15, "DOUBLE.desc");
        String strM34052h7 = c10108x2.m34052h("CharSequence");
        String strM36116u16 = enumC10240e3.m36116u();
        C9801m.m32345e(strM36116u16, "INT.desc");
        String strM36116u17 = EnumC10240e.CHAR.m36116u();
        C9801m.m32345e(strM36116u17, "CHAR.desc");
        Map<a.C11543a, C10163f> mapM38800l2 = C10810q0.m38800l(C10773s.m38547a(aVar3.m33124m(strM34052h, "toByte", HttpUrl.FRAGMENT_ENCODE_SET, strM36116u10), C10163f.m35454x("byteValue")), C10773s.m38547a(aVar3.m33124m(strM34052h2, "toShort", HttpUrl.FRAGMENT_ENCODE_SET, strM36116u11), C10163f.m35454x("shortValue")), C10773s.m38547a(aVar3.m33124m(strM34052h3, "toInt", HttpUrl.FRAGMENT_ENCODE_SET, strM36116u12), C10163f.m35454x("intValue")), C10773s.m38547a(aVar3.m33124m(strM34052h4, "toLong", HttpUrl.FRAGMENT_ENCODE_SET, strM36116u13), C10163f.m35454x("longValue")), C10773s.m38547a(aVar3.m33124m(strM34052h5, "toFloat", HttpUrl.FRAGMENT_ENCODE_SET, strM36116u14), C10163f.m35454x("floatValue")), C10773s.m38547a(aVar3.m33124m(strM34052h6, "toDouble", HttpUrl.FRAGMENT_ENCODE_SET, strM36116u15), C10163f.m35454x("doubleValue")), C10773s.m38547a(c11543aM33124m4, C10163f.m35454x("remove")), C10773s.m38547a(aVar3.m33124m(strM34052h7, "get", strM36116u16, strM36116u17), C10163f.m35454x("charAt")));
        f37874j = mapM38800l2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C10808p0.m38793e(mapM38800l2.size()));
        Iterator<T> it6 = mapM38800l2.entrySet().iterator();
        while (it6.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it6.next();
            linkedHashMap2.put(((a.C11543a) entry2.getKey()).m33137b(), entry2.getValue());
        }
        f37875k = linkedHashMap2;
        Set<a.C11543a> setKeySet = f37874j.keySet();
        ArrayList arrayList6 = new ArrayList(C10819v.m38911u(setKeySet, 10));
        Iterator<T> it7 = setKeySet.iterator();
        while (it7.hasNext()) {
            arrayList6.add(((a.C11543a) it7.next()).m33136a());
        }
        f37876l = arrayList6;
        Set<Map.Entry<a.C11543a, C10163f>> setEntrySet = f37874j.entrySet();
        ArrayList<Pair> arrayList7 = new ArrayList(C10819v.m38911u(setEntrySet, 10));
        Iterator<T> it8 = setEntrySet.iterator();
        while (it8.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it8.next();
            arrayList7.add(new Pair(((a.C11543a) entry3.getKey()).m33136a(), entry3.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C9848l.m32419b(C10808p0.m38793e(C10819v.m38911u(arrayList7, 10)), 16));
        for (Pair pair : arrayList7) {
            linkedHashMap3.put((C10163f) pair.m37649d(), (C10163f) pair.m37648c());
        }
        f37877m = linkedHashMap3;
    }
}
