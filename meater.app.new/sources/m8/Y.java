package m8;

/* compiled from: RegularImmutableSet.java */
/* loaded from: classes2.dex */
final class Y<E> extends AbstractC3979B<E> {

    /* renamed from: I, reason: collision with root package name */
    private static final Object[] f45263I;

    /* renamed from: J, reason: collision with root package name */
    static final Y<Object> f45264J;

    /* renamed from: D, reason: collision with root package name */
    final transient Object[] f45265D;

    /* renamed from: E, reason: collision with root package name */
    private final transient int f45266E;

    /* renamed from: F, reason: collision with root package name */
    final transient Object[] f45267F;

    /* renamed from: G, reason: collision with root package name */
    private final transient int f45268G;

    /* renamed from: H, reason: collision with root package name */
    private final transient int f45269H;

    static {
        Object[] objArr = new Object[0];
        f45263I = objArr;
        f45264J = new Y<>(objArr, 0, objArr, 0, 0);
    }

    Y(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f45265D = objArr;
        this.f45266E = i10;
        this.f45267F = objArr2;
        this.f45268G = i11;
        this.f45269H = i12;
    }

    @Override // m8.AbstractC3979B
    AbstractC4009y<E> G() {
        return AbstractC4009y.x(this.f45265D, this.f45269H);
    }

    @Override // m8.AbstractC3979B
    boolean H() {
        return true;
    }

    @Override // m8.AbstractC4007w, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        Object[] objArr = this.f45267F;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iC = C4006v.c(obj);
        while (true) {
            int i10 = iC & this.f45268G;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iC = i10 + 1;
        }
    }

    @Override // m8.AbstractC4007w
    int f(Object[] objArr, int i10) {
        System.arraycopy(this.f45265D, 0, objArr, i10, this.f45269H);
        return i10 + this.f45269H;
    }

    @Override // m8.AbstractC4007w
    Object[] h() {
        return this.f45265D;
    }

    @Override // m8.AbstractC3979B, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f45266E;
    }

    @Override // m8.AbstractC4007w
    int i() {
        return this.f45269H;
    }

    @Override // m8.AbstractC4007w
    int j() {
        return 0;
    }

    @Override // m8.AbstractC4007w
    boolean r() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f45269H;
    }

    @Override // m8.AbstractC3979B, m8.AbstractC4007w, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: v */
    public j0<E> iterator() {
        return c().iterator();
    }
}
