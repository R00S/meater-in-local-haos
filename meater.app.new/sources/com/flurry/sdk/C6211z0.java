package com.flurry.sdk;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.flurry.sdk.z0 */
/* loaded from: classes2.dex */
public final class C6211z0<K, V> {

    /* renamed from: a */
    public final Map<K, List<V>> f16533a = new HashMap();

    /* renamed from: b */
    private int f16534b;

    /* renamed from: a */
    public final Collection<Map.Entry<K, V>> m13380a() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<K, List<V>> entry : this.f16533a.entrySet()) {
            Iterator<V> it = entry.getValue().iterator();
            while (it.hasNext()) {
                arrayList.add(new AbstractMap.SimpleImmutableEntry(entry.getKey(), it.next()));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final List<V> m13381b(K k2, boolean z) {
        List<V> list = this.f16533a.get(k2);
        if (!z || list != null) {
            return list;
        }
        ArrayList arrayList = this.f16534b > 0 ? new ArrayList(this.f16534b) : new ArrayList();
        this.f16533a.put(k2, arrayList);
        return arrayList;
    }

    /* renamed from: c */
    public final void m13382c(K k2, V v) {
        if (k2 == null) {
            return;
        }
        m13381b(k2, true).add(v);
    }
}
