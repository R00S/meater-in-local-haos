package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.z3 */
/* loaded from: classes2.dex */
final class C7627z3<K, V> implements Comparable<C7627z3>, Map.Entry<K, V> {

    /* renamed from: f */
    /* JADX INFO: Incorrect field signature: TK; */
    private final Comparable f27948f;

    /* renamed from: g */
    private V f27949g;

    /* renamed from: h */
    private final /* synthetic */ C7597u3 f27950h;

    C7627z3(C7597u3 c7597u3, Map.Entry<K, V> entry) {
        this(c7597u3, (Comparable) entry.getKey(), entry.getValue());
    }

    /* renamed from: g */
    private static boolean m21487g(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(C7627z3 c7627z3) {
        return ((Comparable) getKey()).compareTo((Comparable) c7627z3.getKey());
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
        return m21487g(this.f27948f, entry.getKey()) && m21487g(this.f27949g, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f27948f;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f27949g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f27948f;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        V v = this.f27949g;
        return iHashCode ^ (v != null ? v.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.f27950h.m21426q();
        V v2 = this.f27949g;
        this.f27949g = v;
        return v2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f27948f);
        String strValueOf2 = String.valueOf(this.f27949g);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    C7627z3(C7597u3 c7597u3, K k2, V v) {
        this.f27950h = c7597u3;
        this.f27948f = k2;
        this.f27949g = v;
    }
}
