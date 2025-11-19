package m8;

import java.util.Objects;

/* compiled from: RegularImmutableList.java */
/* loaded from: classes2.dex */
class W<E> extends AbstractC4009y<E> {

    /* renamed from: F, reason: collision with root package name */
    static final AbstractC4009y<Object> f45246F = new W(new Object[0], 0);

    /* renamed from: D, reason: collision with root package name */
    final transient Object[] f45247D;

    /* renamed from: E, reason: collision with root package name */
    private final transient int f45248E;

    W(Object[] objArr, int i10) {
        this.f45247D = objArr;
        this.f45248E = i10;
    }

    @Override // m8.AbstractC4009y, m8.AbstractC4007w
    int f(Object[] objArr, int i10) {
        System.arraycopy(this.f45247D, 0, objArr, i10, this.f45248E);
        return i10 + this.f45248E;
    }

    @Override // java.util.List
    public E get(int i10) {
        l8.m.j(i10, this.f45248E);
        E e10 = (E) this.f45247D[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    @Override // m8.AbstractC4007w
    Object[] h() {
        return this.f45247D;
    }

    @Override // m8.AbstractC4007w
    int i() {
        return this.f45248E;
    }

    @Override // m8.AbstractC4007w
    int j() {
        return 0;
    }

    @Override // m8.AbstractC4007w
    boolean r() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f45248E;
    }
}
