package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzdtf {
    /* renamed from: a */
    public static <T> List<T> m19862a(int i2) {
        return i2 == 0 ? Collections.emptyList() : new ArrayList(i2);
    }

    /* renamed from: b */
    static <T> HashSet<T> m19863b(int i2) {
        return new HashSet<>(m19865d(i2));
    }

    /* renamed from: c */
    public static <K, V> LinkedHashMap<K, V> m19864c(int i2) {
        return new LinkedHashMap<>(m19865d(i2));
    }

    /* renamed from: d */
    private static int m19865d(int i2) {
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
