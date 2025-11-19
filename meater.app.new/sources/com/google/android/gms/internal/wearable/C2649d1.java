package com.google.android.gms.internal.wearable;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: com.google.android.gms.internal.wearable.d1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2649d1 implements Map.Entry, Comparable {

    /* renamed from: B, reason: collision with root package name */
    private final Comparable f34557B;

    /* renamed from: C, reason: collision with root package name */
    private Object f34558C;

    /* renamed from: D, reason: collision with root package name */
    final /* synthetic */ C2661h1 f34559D;

    C2649d1(C2661h1 c2661h1, Comparable comparable, Object obj) {
        this.f34559D = c2661h1;
        this.f34557B = comparable;
        this.f34558C = obj;
    }

    private static final boolean j(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final Comparable c() {
        return this.f34557B;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f34557B.compareTo(((C2649d1) obj).f34557B);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return j(this.f34557B, entry.getKey()) && j(this.f34558C, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f34557B;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f34558C;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f34557B;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f34558C;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f34559D.q();
        Object obj2 = this.f34558C;
        this.f34558C = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f34557B) + "=" + String.valueOf(this.f34558C);
    }
}
