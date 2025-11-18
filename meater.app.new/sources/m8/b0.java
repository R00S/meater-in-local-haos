package m8;

import java.io.Serializable;

/* compiled from: ReverseOrdering.java */
/* loaded from: classes2.dex */
final class b0<T> extends U<T> implements Serializable {

    /* renamed from: B, reason: collision with root package name */
    final U<? super T> f45282B;

    b0(U<? super T> u10) {
        this.f45282B = (U) l8.m.l(u10);
    }

    @Override // m8.U, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f45282B.compare(t11, t10);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            return this.f45282B.equals(((b0) obj).f45282B);
        }
        return false;
    }

    @Override // m8.U
    public <S extends T> U<S> g() {
        return this.f45282B;
    }

    public int hashCode() {
        return -this.f45282B.hashCode();
    }

    public String toString() {
        return this.f45282B + ".reverse()";
    }
}
