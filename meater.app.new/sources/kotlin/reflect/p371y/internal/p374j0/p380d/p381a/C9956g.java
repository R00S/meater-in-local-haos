package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C10773s;
import kotlin.Pair;
import kotlin.collections.C10782c0;
import kotlin.collections.C10808p0;
import kotlin.collections.C10810q0;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9917k;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10161d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;

/* compiled from: BuiltinSpecialProperties.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.g */
/* loaded from: classes2.dex */
public final class C9956g {

    /* renamed from: a */
    public static final C9956g f37857a = new C9956g();

    /* renamed from: b */
    private static final Map<C10160c, C10163f> f37858b;

    /* renamed from: c */
    private static final Map<C10163f, List<C10163f>> f37859c;

    /* renamed from: d */
    private static final Set<C10160c> f37860d;

    /* renamed from: e */
    private static final Set<C10163f> f37861e;

    static {
        C10161d c10161d = C9917k.a.f37596s;
        C10160c c10160c = C9917k.a.f37558Y;
        Map<C10160c, C10163f> mapM38800l = C10810q0.m38800l(C10773s.m38547a(C9958h.m33114d(c10161d, "name"), C10163f.m35454x("name")), C10773s.m38547a(C9958h.m33114d(c10161d, "ordinal"), C10163f.m35454x("ordinal")), C10773s.m38547a(C9958h.m33113c(C9917k.a.f37554U, "size"), C10163f.m35454x("size")), C10773s.m38547a(C9958h.m33113c(c10160c, "size"), C10163f.m35454x("size")), C10773s.m38547a(C9958h.m33114d(C9917k.a.f37572g, "length"), C10163f.m35454x("length")), C10773s.m38547a(C9958h.m33113c(c10160c, "keys"), C10163f.m35454x("keySet")), C10773s.m38547a(C9958h.m33113c(c10160c, "values"), C10163f.m35454x("values")), C10773s.m38547a(C9958h.m33113c(c10160c, "entries"), C10163f.m35454x("entrySet")));
        f37858b = mapM38800l;
        Set<Map.Entry<C10160c, C10163f>> setEntrySet = mapM38800l.entrySet();
        ArrayList<Pair> arrayList = new ArrayList(C10819v.m38911u(setEntrySet, 10));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new Pair(((C10160c) entry.getKey()).m35425g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : arrayList) {
            C10163f c10163f = (C10163f) pair.m37649d();
            Object arrayList2 = linkedHashMap.get(c10163f);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(c10163f, arrayList2);
            }
            ((List) arrayList2).add((C10163f) pair.m37648c());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C10808p0.m38793e(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), C10782c0.m38579L((Iterable) entry2.getValue()));
        }
        f37859c = linkedHashMap2;
        Set<C10160c> setKeySet = f37858b.keySet();
        f37860d = setKeySet;
        ArrayList arrayList3 = new ArrayList(C10819v.m38911u(setKeySet, 10));
        Iterator<T> it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((C10160c) it2.next()).m35425g());
        }
        f37861e = C10782c0.m38574I0(arrayList3);
    }

    private C9956g() {
    }

    /* renamed from: a */
    public final Map<C10160c, C10163f> m33096a() {
        return f37858b;
    }

    /* renamed from: b */
    public final List<C10163f> m33097b(C10163f c10163f) {
        C9801m.m32346f(c10163f, "name1");
        List<C10163f> list = f37859c.get(c10163f);
        return list == null ? C10817u.m38888j() : list;
    }

    /* renamed from: c */
    public final Set<C10160c> m33098c() {
        return f37860d;
    }

    /* renamed from: d */
    public final Set<C10163f> m33099d() {
        return f37861e;
    }
}
