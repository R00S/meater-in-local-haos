package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.iv */
/* loaded from: classes2.dex */
final class C6798iv<K> implements Map.Entry<K, Object> {

    /* renamed from: f */
    private Map.Entry<K, zzdon> f19399f;

    private C6798iv(Map.Entry<K, zzdon> entry) {
        this.f19399f = entry;
    }

    /* renamed from: a */
    public final zzdon m15352a() {
        return this.f19399f.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f19399f.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f19399f.getValue() == null) {
            return null;
        }
        return zzdon.m19760e();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzdpk) {
            return this.f19399f.getValue().m19764d((zzdpk) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
