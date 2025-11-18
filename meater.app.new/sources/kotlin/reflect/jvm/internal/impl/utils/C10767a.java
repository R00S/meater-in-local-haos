package kotlin.reflect.jvm.internal.impl.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10813s;
import kotlin.collections.C10815t;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9801m;

/* compiled from: collections.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.utils.a */
/* loaded from: classes3.dex */
public final class C10767a {
    /* renamed from: a */
    public static final <T> void m38508a(Collection<T> collection, T t) {
        C9801m.m32346f(collection, "<this>");
        if (t != null) {
            collection.add(t);
        }
    }

    /* renamed from: b */
    private static final int m38509b(int i2) {
        if (i2 < 3) {
            return 3;
        }
        return i2 + (i2 / 3) + 1;
    }

    /* renamed from: c */
    public static final <T> List<T> m38510c(ArrayList<T> arrayList) {
        C9801m.m32346f(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return C10817u.m38888j();
        }
        if (size == 1) {
            return C10815t.m38883e(C10813s.m38830U(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* renamed from: d */
    public static final <K> Map<K, Integer> m38511d(Iterable<? extends K> iterable) {
        C9801m.m32346f(iterable, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends K> it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i2));
            i2++;
        }
        return linkedHashMap;
    }

    /* renamed from: e */
    public static final <K, V> HashMap<K, V> m38512e(int i2) {
        return new HashMap<>(m38509b(i2));
    }

    /* renamed from: f */
    public static final <E> HashSet<E> m38513f(int i2) {
        return new HashSet<>(m38509b(i2));
    }

    /* renamed from: g */
    public static final <E> LinkedHashSet<E> m38514g(int i2) {
        return new LinkedHashSet<>(m38509b(i2));
    }
}
