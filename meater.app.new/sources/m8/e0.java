package m8;

/* compiled from: SingletonImmutableSet.java */
/* loaded from: classes2.dex */
final class e0<E> extends AbstractC3979B<E> {

    /* renamed from: D, reason: collision with root package name */
    final transient E f45327D;

    e0(E e10) {
        this.f45327D = (E) l8.m.l(e10);
    }

    @Override // m8.AbstractC3979B, m8.AbstractC4007w
    public AbstractC4009y<E> c() {
        return AbstractC4009y.H(this.f45327D);
    }

    @Override // m8.AbstractC4007w, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f45327D.equals(obj);
    }

    @Override // m8.AbstractC4007w
    int f(Object[] objArr, int i10) {
        objArr[i10] = this.f45327D;
        return i10 + 1;
    }

    @Override // m8.AbstractC3979B, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f45327D.hashCode();
    }

    @Override // m8.AbstractC4007w
    boolean r() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f45327D.toString() + ']';
    }

    @Override // m8.AbstractC3979B, m8.AbstractC4007w, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: v */
    public j0<E> iterator() {
        return C3983F.r(this.f45327D);
    }
}
