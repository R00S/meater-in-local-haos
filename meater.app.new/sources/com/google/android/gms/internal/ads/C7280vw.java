package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.google.android.gms.internal.ads.vw */
/* loaded from: classes2.dex */
final class C7280vw<K, V> implements Comparable<C7280vw>, Map.Entry<K, V> {

    /* renamed from: f */
    /* JADX INFO: Incorrect field signature: TK; */
    private final Comparable f20757f;

    /* renamed from: g */
    private V f20758g;

    /* renamed from: h */
    private final /* synthetic */ C7021ow f20759h;

    C7280vw(C7021ow c7021ow, Map.Entry<K, V> entry) {
        this(c7021ow, (Comparable) entry.getKey(), entry.getValue());
    }

    /* renamed from: g */
    private static boolean m15967g(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(C7280vw c7280vw) {
        return ((Comparable) getKey()).compareTo((Comparable) c7280vw.getKey());
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
        return m15967g(this.f20757f, entry.getKey()) && m15967g(this.f20758g, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f20757f;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f20758g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f20757f;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        V v = this.f20758g;
        return iHashCode ^ (v != null ? v.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.f20759h.m15697k();
        V v2 = this.f20758g;
        this.f20758g = v;
        return v2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f20757f);
        String strValueOf2 = String.valueOf(this.f20758g);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    C7280vw(C7021ow c7021ow, K k2, V v) {
        this.f20759h = c7021ow;
        this.f20757f = k2;
        this.f20758g = v;
    }
}
