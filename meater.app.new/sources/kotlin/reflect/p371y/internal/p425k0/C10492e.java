package kotlin.reflect.p371y.internal.p425k0;

import java.io.Serializable;

/* compiled from: MapEntry.java */
/* renamed from: kotlin.f0.y.e.k0.e */
/* loaded from: classes3.dex */
final class C10492e<K, V> implements Serializable {

    /* renamed from: f */
    public final K f40518f;

    /* renamed from: g */
    public final V f40519g;

    public C10492e(K k2, V v) {
        this.f40518f = k2;
        this.f40519g = v;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10492e)) {
            return false;
        }
        C10492e c10492e = (C10492e) obj;
        K k2 = this.f40518f;
        if (k2 == null) {
            if (c10492e.f40518f != null) {
                return false;
            }
        } else if (!k2.equals(c10492e.f40518f)) {
            return false;
        }
        V v = this.f40519g;
        V v2 = c10492e.f40519g;
        if (v == null) {
            if (v2 != null) {
                return false;
            }
        } else if (!v.equals(v2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        K k2 = this.f40518f;
        int iHashCode = k2 == null ? 0 : k2.hashCode();
        V v = this.f40519g;
        return iHashCode ^ (v != null ? v.hashCode() : 0);
    }

    public String toString() {
        return this.f40518f + "=" + this.f40519g;
    }
}
