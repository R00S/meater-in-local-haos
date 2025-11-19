package kotlin.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4170o;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Maps.kt */
@Metadata(d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0012\u001a%\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001aQ\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\t\u001aa\u0010\f\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u000f\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u000e\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aI\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\u00112\u001a\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005¢\u0006\u0004\b\u0013\u0010\u0014\u001aG\u0010\u0016\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\u00112\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0015¢\u0006\u0004\b\u0016\u0010\u0017\u001a;\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0015¢\u0006\u0004\b\u0018\u0010\u0019\u001aQ\u0010\u001c\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\u001a*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\u0011*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u00152\u0006\u0010\u001b\u001a\u00028\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001aS\u0010\u001e\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\u001a*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\u0011*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u00052\u0006\u0010\u001b\u001a\u00028\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a9\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\b \u0010!\u001a9\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\b\"\u0010!\u001aP\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0014\u0010#\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\u0002¢\u0006\u0004\b$\u0010%\u001a7\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0000¢\u0006\u0004\b&\u0010!¨\u0006'"}, d2 = {"K", "V", "", "h", "()Ljava/util/Map;", "", "Loa/o;", "pairs", "k", "([Loa/o;)Ljava/util/Map;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "j", "([Loa/o;)Ljava/util/HashMap;", "key", "i", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "", "Loa/F;", "o", "(Ljava/util/Map;[Loa/o;)V", "", "n", "(Ljava/util/Map;Ljava/lang/Iterable;)V", "p", "(Ljava/lang/Iterable;)Ljava/util/Map;", "M", "destination", "q", "(Ljava/lang/Iterable;Ljava/util/Map;)Ljava/util/Map;", "s", "([Loa/o;Ljava/util/Map;)Ljava/util/Map;", "r", "(Ljava/util/Map;)Ljava/util/Map;", "t", "map", "m", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "l", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
/* loaded from: classes2.dex */
public class P extends O {
    public static <K, V> Map<K, V> h() {
        E e10 = E.f43927B;
        C3862t.e(e10, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return e10;
    }

    public static <K, V> V i(Map<K, ? extends V> map, K k10) {
        C3862t.g(map, "<this>");
        return (V) N.a(map, k10);
    }

    public static <K, V> HashMap<K, V> j(C4170o<? extends K, ? extends V>... pairs) {
        C3862t.g(pairs, "pairs");
        HashMap<K, V> map = new HashMap<>(M.d(pairs.length));
        o(map, pairs);
        return map;
    }

    public static <K, V> Map<K, V> k(C4170o<? extends K, ? extends V>... pairs) {
        C3862t.g(pairs, "pairs");
        return pairs.length > 0 ? s(pairs, new LinkedHashMap(M.d(pairs.length))) : M.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> l(Map<K, ? extends V> map) {
        C3862t.g(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : O.f(map) : M.h();
    }

    public static <K, V> Map<K, V> m(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        C3862t.g(map, "<this>");
        C3862t.g(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final <K, V> void n(Map<? super K, ? super V> map, Iterable<? extends C4170o<? extends K, ? extends V>> pairs) {
        C3862t.g(map, "<this>");
        C3862t.g(pairs, "pairs");
        for (C4170o<? extends K, ? extends V> c4170o : pairs) {
            map.put(c4170o.a(), c4170o.b());
        }
    }

    public static final <K, V> void o(Map<? super K, ? super V> map, C4170o<? extends K, ? extends V>[] pairs) {
        C3862t.g(map, "<this>");
        C3862t.g(pairs, "pairs");
        for (C4170o<? extends K, ? extends V> c4170o : pairs) {
            map.put(c4170o.a(), c4170o.b());
        }
    }

    public static <K, V> Map<K, V> p(Iterable<? extends C4170o<? extends K, ? extends V>> iterable) {
        C3862t.g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return l(q(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return M.h();
        }
        if (size != 1) {
            return q(iterable, new LinkedHashMap(M.d(collection.size())));
        }
        return M.e(iterable instanceof List ? (C4170o<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M q(Iterable<? extends C4170o<? extends K, ? extends V>> iterable, M destination) {
        C3862t.g(iterable, "<this>");
        C3862t.g(destination, "destination");
        n(destination, iterable);
        return destination;
    }

    public static <K, V> Map<K, V> r(Map<? extends K, ? extends V> map) {
        C3862t.g(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? M.t(map) : O.f(map) : M.h();
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M s(C4170o<? extends K, ? extends V>[] c4170oArr, M destination) {
        C3862t.g(c4170oArr, "<this>");
        C3862t.g(destination, "destination");
        o(destination, c4170oArr);
        return destination;
    }

    public static <K, V> Map<K, V> t(Map<? extends K, ? extends V> map) {
        C3862t.g(map, "<this>");
        return new LinkedHashMap(map);
    }
}
