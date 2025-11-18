package m8;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: ComparatorOrdering.java */
/* renamed from: m8.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3998m<T> extends U<T> implements Serializable {

    /* renamed from: B, reason: collision with root package name */
    final Comparator<T> f45363B;

    C3998m(Comparator<T> comparator) {
        this.f45363B = (Comparator) l8.m.l(comparator);
    }

    @Override // m8.U, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f45363B.compare(t10, t11);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3998m) {
            return this.f45363B.equals(((C3998m) obj).f45363B);
        }
        return false;
    }

    public int hashCode() {
        return this.f45363B.hashCode();
    }

    public String toString() {
        return this.f45363B.toString();
    }
}
