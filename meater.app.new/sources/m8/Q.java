package m8;

import java.io.Serializable;

/* compiled from: NaturalOrdering.java */
/* loaded from: classes2.dex */
final class Q extends U<Comparable<?>> implements Serializable {

    /* renamed from: B, reason: collision with root package name */
    static final Q f45245B = new Q();

    private Q() {
    }

    @Override // m8.U
    public <S extends Comparable<?>> U<S> g() {
        return a0.f45274B;
    }

    @Override // m8.U, java.util.Comparator
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        l8.m.l(comparable);
        l8.m.l(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
