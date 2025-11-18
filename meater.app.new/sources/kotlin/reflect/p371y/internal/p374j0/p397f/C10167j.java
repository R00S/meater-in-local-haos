package kotlin.reflect.p371y.internal.p374j0.p397f;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.C10773s;
import kotlin.Pair;
import kotlin.collections.C10808p0;
import kotlin.collections.C10819v;
import kotlin.jvm.internal.C9801m;
import kotlin.ranges.C9848l;

/* compiled from: StandardClassIds.kt */
/* renamed from: kotlin.f0.y.e.j0.f.j */
/* loaded from: classes3.dex */
public final class C10167j {

    /* renamed from: a */
    private static final C10160c f39356a;

    /* renamed from: b */
    private static final C10160c f39357b;

    static {
        C10160c c10160c = new C10160c("java.lang");
        f39356a = c10160c;
        C10160c c10160cM35421c = c10160c.m35421c(C10163f.m35454x("annotation"));
        C9801m.m32345e(c10160cM35421c, "JAVA_LANG_PACKAGE.child(…identifier(\"annotation\"))");
        f39357b = c10160cM35421c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final C10159b m35483j(String str) {
        return new C10159b(C10166i.f39305a.m35463b(), C10163f.m35454x(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final C10159b m35484k(String str) {
        return new C10159b(C10166i.f39305a.m35466e(), C10163f.m35454x(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final C10159b m35485l(String str) {
        return new C10159b(C10166i.f39305a.m35464c(), C10163f.m35454x(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final C10159b m35486m(String str) {
        return new C10159b(C10166i.f39305a.m35465d(), C10163f.m35454x(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public static final <K, V> Map<V, K> m35487n(Map<K, ? extends V> map) {
        Set<Map.Entry<K, ? extends V>> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C9848l.m32419b(C10808p0.m38793e(C10819v.m38911u(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pairM38547a = C10773s.m38547a(entry.getValue(), entry.getKey());
            linkedHashMap.put(pairM38547a.m37648c(), pairM38547a.m37649d());
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final C10159b m35488o(C10163f c10163f) {
        C10166i c10166i = C10166i.f39305a;
        return new C10159b(c10166i.m35462a().m35413h(), C10163f.m35454x(c10163f.m35457u() + c10166i.m35462a().m35415j().m35457u()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final C10159b m35489p(String str) {
        return new C10159b(C10166i.f39305a.m35467f(), C10163f.m35454x(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final C10159b m35490q(String str) {
        return new C10159b(C10166i.f39305a.m35468g(), C10163f.m35454x(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final C10159b m35491r(C10159b c10159b) {
        return new C10159b(C10166i.f39305a.m35466e(), C10163f.m35454x('U' + c10159b.m35415j().m35457u()));
    }
}
