package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p024c.p041e.C0867a;
import p024c.p041e.C0868b;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m14610a() {
        return Collections.emptyList();
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: b */
    public static <T> List<T> m14611b(T t) {
        return Collections.singletonList(t);
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: c */
    public static <T> List<T> m14612c(T... tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : m14611b(tArr[0]) : m14610a();
    }

    @KeepForSdk
    /* renamed from: d */
    public static <K, V> Map<K, V> m14613d(K k2, V v, K k3, V v2, K k4, V v3) {
        Map mapM14617h = m14617h(3, false);
        mapM14617h.put(k2, v);
        mapM14617h.put(k3, v2);
        mapM14617h.put(k4, v3);
        return Collections.unmodifiableMap(mapM14617h);
    }

    @KeepForSdk
    /* renamed from: e */
    public static <K, V> Map<K, V> m14614e(K[] kArr, V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            throw new IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + length2);
        }
        if (length == 0) {
            return Collections.emptyMap();
        }
        if (length == 1) {
            return Collections.singletonMap(kArr[0], vArr[0]);
        }
        Map mapM14617h = m14617h(length, false);
        for (int i2 = 0; i2 < kArr.length; i2++) {
            mapM14617h.put(kArr[i2], vArr[i2]);
        }
        return Collections.unmodifiableMap(mapM14617h);
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: f */
    public static <T> Set<T> m14615f(T t, T t2, T t3) {
        Set setM14618i = m14618i(3, false);
        setM14618i.add(t);
        setM14618i.add(t2);
        setM14618i.add(t3);
        return Collections.unmodifiableSet(setM14618i);
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: g */
    public static <T> Set<T> m14616g(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t = tArr[0];
            T t2 = tArr[1];
            Set setM14618i = m14618i(2, false);
            setM14618i.add(t);
            setM14618i.add(t2);
            return Collections.unmodifiableSet(setM14618i);
        }
        if (length == 3) {
            return m14615f(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set setM14618i2 = m14618i(length, false);
            Collections.addAll(setM14618i2, tArr);
            return Collections.unmodifiableSet(setM14618i2);
        }
        T t3 = tArr[0];
        T t4 = tArr[1];
        T t5 = tArr[2];
        T t6 = tArr[3];
        Set setM14618i3 = m14618i(4, false);
        setM14618i3.add(t3);
        setM14618i3.add(t4);
        setM14618i3.add(t5);
        setM14618i3.add(t6);
        return Collections.unmodifiableSet(setM14618i3);
    }

    /* renamed from: h */
    private static Map m14617h(int i2, boolean z) {
        return i2 <= 256 ? new C0867a(i2) : new HashMap(i2, 1.0f);
    }

    /* renamed from: i */
    private static Set m14618i(int i2, boolean z) {
        return i2 <= (true != z ? 256 : 128) ? new C0868b(i2) : new HashSet(i2, true != z ? 1.0f : 0.75f);
    }
}
