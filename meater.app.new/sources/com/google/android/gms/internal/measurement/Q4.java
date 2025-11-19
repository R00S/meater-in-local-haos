package com.google.android.gms.internal.measurement;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
final class Q4<K> implements Map.Entry<K, Object> {

    /* renamed from: B, reason: collision with root package name */
    private Map.Entry<K, N4> f33852B;

    public final N4 a() {
        return this.f33852B.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f33852B.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f33852B.getValue() == null) {
            return null;
        }
        throw new NoSuchMethodError();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof InterfaceC2517k5) {
            return this.f33852B.getValue().b((InterfaceC2517k5) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    private Q4(Map.Entry<K, N4> entry) {
        this.f33852B = entry;
    }
}
