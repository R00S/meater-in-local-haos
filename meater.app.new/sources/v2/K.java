package v2;

/* compiled from: SeekPoint.java */
/* loaded from: classes.dex */
public final class K {

    /* renamed from: c, reason: collision with root package name */
    public static final K f51053c = new K(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f51054a;

    /* renamed from: b, reason: collision with root package name */
    public final long f51055b;

    public K(long j10, long j11) {
        this.f51054a = j10;
        this.f51055b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || K.class != obj.getClass()) {
            return false;
        }
        K k10 = (K) obj;
        return this.f51054a == k10.f51054a && this.f51055b == k10.f51055b;
    }

    public int hashCode() {
        return (((int) this.f51054a) * 31) + ((int) this.f51055b);
    }

    public String toString() {
        return "[timeUs=" + this.f51054a + ", position=" + this.f51055b + "]";
    }
}
