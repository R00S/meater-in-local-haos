package m8;

import java.io.Serializable;

/* compiled from: ReverseNaturalOrdering.java */
/* loaded from: classes2.dex */
final class a0 extends U<Comparable<?>> implements Serializable {

    /* renamed from: B, reason: collision with root package name */
    static final a0 f45274B = new a0();

    private a0() {
    }

    @Override // m8.U
    public <S extends Comparable<?>> U<S> g() {
        return U.d();
    }

    @Override // m8.U, java.util.Comparator
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        l8.m.l(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
