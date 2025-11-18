package com.google.android.gms.internal.measurement;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
final class K5 implements Comparable, Map.Entry {

    /* renamed from: B, reason: collision with root package name */
    private final Comparable f33803B;

    /* renamed from: C, reason: collision with root package name */
    private Object f33804C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ G5 f33805D;

    K5(G5 g52, Map.Entry entry) {
        this(g52, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((K5) obj).getKey());
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
        return c(this.f33803B, entry.getKey()) && c(this.f33804C, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f33803B;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f33804C;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f33803B;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f33804C;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f33805D.u();
        Object obj2 = this.f33804C;
        this.f33804C = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f33803B) + "=" + String.valueOf(this.f33804C);
    }

    K5(G5 g52, Comparable comparable, Object obj) {
        this.f33805D = g52;
        this.f33803B = comparable;
        this.f33804C = obj;
    }
}
