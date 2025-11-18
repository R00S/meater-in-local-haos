package Rb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;

/* compiled from: collections.kt */
/* loaded from: classes3.dex */
public final class a {
    public static final <T> void a(Collection<T> collection, T t10) {
        C3862t.g(collection, "<this>");
        if (t10 != null) {
            collection.add(t10);
        }
    }

    private static final int b(int i10) {
        if (i10 < 3) {
            return 3;
        }
        return i10 + (i10 / 3) + 1;
    }

    public static final <T> List<T> c(ArrayList<T> arrayList) {
        C3862t.g(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return r.m();
        }
        if (size == 1) {
            return r.e(r.j0(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static final <K> Map<K, Integer> d(Iterable<? extends K> iterable) {
        C3862t.g(iterable, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends K> it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i10));
            i10++;
        }
        return linkedHashMap;
    }

    public static final <K, V> HashMap<K, V> e(int i10) {
        return new HashMap<>(b(i10));
    }

    public static final <E> HashSet<E> f(int i10) {
        return new HashSet<>(b(i10));
    }

    public static final <E> LinkedHashSet<E> g(int i10) {
        return new LinkedHashSet<>(b(i10));
    }
}
