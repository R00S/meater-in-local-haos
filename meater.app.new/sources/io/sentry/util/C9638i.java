package io.sentry.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: CollectionUtils.java */
@ApiStatus.Internal
/* renamed from: io.sentry.util.i */
/* loaded from: classes2.dex */
public final class C9638i {
    /* renamed from: a */
    public static <T> List<T> m31766a(List<T> list) {
        if (list != null) {
            return new ArrayList(list);
        }
        return null;
    }

    /* renamed from: b */
    public static <K, V> Map<K, V> m31767b(Map<K, V> map) {
        if (map == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    /* renamed from: c */
    public static <K, V> Map<K, V> m31768c(Map<K, V> map) {
        if (map != null) {
            return new HashMap(map);
        }
        return null;
    }

    /* renamed from: d */
    public static int m31769d(Iterable<?> iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        int i2 = 0;
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }
}
