package com.google.android.gms.internal.measurement;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.o2 */
/* loaded from: classes2.dex */
final class C7560o2<K> implements Map.Entry<K, Object> {

    /* renamed from: f */
    private Map.Entry<K, zzfp> f27863f;

    private C7560o2(Map.Entry<K, zzfp> entry) {
        this.f27863f = entry;
    }

    /* renamed from: a */
    public final zzfp m21265a() {
        return this.f27863f.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f27863f.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f27863f.getValue() == null) {
            return null;
        }
        return zzfp.m22304e();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzgo) {
            return this.f27863f.getValue().m22307a((zzgo) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
