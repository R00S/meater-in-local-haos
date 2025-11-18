package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzdtk<K, V> implements zzdti<Map<K, V>> {

    /* renamed from: a */
    private static final zzdtu<Map<Object, Object>> f25989a = zzdtj.m19869a(Collections.emptyMap());

    /* renamed from: b */
    private final Map<K, zzdtu<V>> f25990b;

    private zzdtk(Map<K, zzdtu<V>> map) {
        this.f25990b = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public static <K, V> zzdtm<K, V> m19870a(int i2) {
        return new zzdtm<>(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        LinkedHashMap linkedHashMapM19864c = zzdtf.m19864c(this.f25990b.size());
        for (Map.Entry<K, zzdtu<V>> entry : this.f25990b.entrySet()) {
            linkedHashMapM19864c.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(linkedHashMapM19864c);
    }
}
