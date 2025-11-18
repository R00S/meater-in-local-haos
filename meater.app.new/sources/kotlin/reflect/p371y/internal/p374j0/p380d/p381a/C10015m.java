package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C10773s;
import kotlin.collections.C10810q0;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10166i;

/* compiled from: FakePureImplementationsProvider.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.m */
/* loaded from: classes2.dex */
public final class C10015m {

    /* renamed from: a */
    public static final C10015m f38191a;

    /* renamed from: b */
    private static final Map<C10159b, C10159b> f38192b;

    /* renamed from: c */
    private static final Map<C10160c, C10160c> f38193c;

    static {
        C10015m c10015m = new C10015m();
        f38191a = c10015m;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f38192b = linkedHashMap;
        C10166i c10166i = C10166i.f39305a;
        c10015m.m33566c(c10166i.m35471j(), c10015m.m33565a("java.util.ArrayList", "java.util.LinkedList"));
        c10015m.m33566c(c10166i.m35473l(), c10015m.m33565a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        c10015m.m33566c(c10166i.m35472k(), c10015m.m33565a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        C10159b c10159bM35408m = C10159b.m35408m(new C10160c("java.util.function.Function"));
        C9801m.m32345e(c10159bM35408m, "topLevel(FqName(\"java.util.function.Function\"))");
        c10015m.m33566c(c10159bM35408m, c10015m.m33565a("java.util.function.UnaryOperator"));
        C10159b c10159bM35408m2 = C10159b.m35408m(new C10160c("java.util.function.BiFunction"));
        C9801m.m32345e(c10159bM35408m2, "topLevel(FqName(\"java.util.function.BiFunction\"))");
        c10015m.m33566c(c10159bM35408m2, c10015m.m33565a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(C10773s.m38547a(((C10159b) entry.getKey()).m35409b(), ((C10159b) entry.getValue()).m35409b()));
        }
        f38193c = C10810q0.m38805q(arrayList);
    }

    private C10015m() {
    }

    /* renamed from: a */
    private final List<C10159b> m33565a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C10159b.m35408m(new C10160c(str)));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    private final void m33566c(C10159b c10159b, List<C10159b> list) {
        Map<C10159b, C10159b> map = f38192b;
        for (Object obj : list) {
            map.put(obj, c10159b);
        }
    }

    /* renamed from: b */
    public final C10160c m33567b(C10160c c10160c) {
        C9801m.m32346f(c10160c, "classFqName");
        return f38193c.get(c10160c);
    }
}
