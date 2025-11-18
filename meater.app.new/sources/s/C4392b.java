package s;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import t.C4532a;

/* compiled from: ArraySet.jvm.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0014\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001GB\u0013\b\u0007\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0007J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u0010J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u0010J\u0015\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0017J\u0015\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u001d\"\u0004\b\u0001\u0010 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u001d¢\u0006\u0004\b\u001e\u0010\"J\u001a\u0010$\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b$\u0010\u0010J\u000f\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*H\u0096\u0002¢\u0006\u0004\b+\u0010,J\u001d\u0010/\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b1\u00100J\u001d\u00102\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b2\u00100J\u001d\u00103\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b3\u00100R\"\u0010:\u001a\u0002048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R*\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010\u001f\"\u0004\b>\u0010?R\"\u0010D\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010&\"\u0004\bC\u0010\u0007R\u0014\u0010F\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010&¨\u0006H"}, d2 = {"Ls/b;", "E", "", "", "", "capacity", "<init>", "(I)V", "Loa/F;", "clear", "()V", "minimumCapacity", "c", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "key", "indexOf", "(Ljava/lang/Object;)I", "index", "B", "(I)Ljava/lang/Object;", "isEmpty", "()Z", "add", "remove", "x", "", "toArray", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "iterator", "()Ljava/util/Iterator;", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "addAll", "removeAll", "retainAll", "", "[I", "i", "()[I", "z", "([I)V", "hashes", "C", "[Ljava/lang/Object;", "h", "y", "([Ljava/lang/Object;)V", "D", "I", "w", "A", "_size", "j", "size", "a", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4392b<E> implements Collection<E>, Set<E>, Ca.b, Ca.f {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private int[] hashes;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private Object[] array;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private int _size;

    /* compiled from: ArraySet.jvm.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ls/b$a;", "Ls/j;", "<init>", "(Ls/b;)V", "", "index", "b", "(I)Ljava/lang/Object;", "Loa/F;", "d", "(I)V", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: s.b$a */
    private final class a extends AbstractC4400j<E> {
        public a() {
            super(C4392b.this.w());
        }

        @Override // s.AbstractC4400j
        protected E b(int index) {
            return C4392b.this.B(index);
        }

        @Override // s.AbstractC4400j
        protected void d(int index) {
            C4392b.this.x(index);
        }
    }

    public C4392b() {
        this(0, 1, null);
    }

    public final void A(int i10) {
        this._size = i10;
    }

    public final E B(int index) {
        return (E) getArray()[index];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E element) {
        int i10;
        int iC;
        int iW = w();
        if (element == null) {
            iC = C4394d.d(this);
            i10 = 0;
        } else {
            int iHashCode = element.hashCode();
            i10 = iHashCode;
            iC = C4394d.c(this, element, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i11 = ~iC;
        if (iW >= getHashes().length) {
            int i12 = 8;
            if (iW >= 8) {
                i12 = (iW >> 1) + iW;
            } else if (iW < 4) {
                i12 = 4;
            }
            int[] hashes = getHashes();
            Object[] array = getArray();
            C4394d.a(this, i12);
            if (iW != w()) {
                throw new ConcurrentModificationException();
            }
            if (!(getHashes().length == 0)) {
                C3831l.o(hashes, getHashes(), 0, 0, hashes.length, 6, null);
                C3831l.p(array, getArray(), 0, 0, array.length, 6, null);
            }
        }
        if (i11 < iW) {
            int i13 = i11 + 1;
            C3831l.j(getHashes(), getHashes(), i13, i11, iW);
            C3831l.l(getArray(), getArray(), i13, i11, iW);
        }
        if (iW != w() || i11 >= getHashes().length) {
            throw new ConcurrentModificationException();
        }
        getHashes()[i11] = i10;
        getArray()[i11] = element;
        A(w() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> elements) {
        C3862t.g(elements, "elements");
        c(w() + elements.size());
        Iterator<? extends E> it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final void c(int minimumCapacity) {
        int iW = w();
        if (getHashes().length < minimumCapacity) {
            int[] hashes = getHashes();
            Object[] array = getArray();
            C4394d.a(this, minimumCapacity);
            if (w() > 0) {
                C3831l.o(hashes, getHashes(), 0, 0, w(), 6, null);
                C3831l.p(array, getArray(), 0, 0, w(), 6, null);
            }
        }
        if (w() != iW) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (w() != 0) {
            z(C4532a.f49713a);
            y(C4532a.f49715c);
            A(0);
        }
        if (w() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object element) {
        return indexOf(element) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> elements) {
        C3862t.g(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof Set) && size() == ((Set) other).size()) {
            try {
                int iW = w();
                for (int i10 = 0; i10 < iW; i10++) {
                    if (((Set) other).contains(B(i10))) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: h, reason: from getter */
    public final Object[] getArray() {
        return this.array;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] hashes = getHashes();
        int iW = w();
        int i10 = 0;
        for (int i11 = 0; i11 < iW; i11++) {
            i10 += hashes[i11];
        }
        return i10;
    }

    /* renamed from: i, reason: from getter */
    public final int[] getHashes() {
        return this.hashes;
    }

    public final int indexOf(Object key) {
        return key == null ? C4394d.d(this) : C4394d.c(this, key, key.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return w() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new a();
    }

    /* renamed from: j, reason: from getter */
    public int get_size() {
        return this._size;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf < 0) {
            return false;
        }
        x(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        C3862t.g(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        C3862t.g(elements, "elements");
        boolean z10 = false;
        for (int iW = w() - 1; -1 < iW; iW--) {
            if (!kotlin.collections.r.a0(elements, getArray()[iW])) {
                x(iW);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return get_size();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return C3831l.r(this.array, 0, this._size);
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(w() * 14);
        sb2.append('{');
        int iW = w();
        for (int i10 = 0; i10 < iW; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            E eB = B(i10);
            if (eB != this) {
                sb2.append(eB);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public final int w() {
        return this._size;
    }

    public final E x(int index) {
        int iW = w();
        E e10 = (E) getArray()[index];
        if (iW <= 1) {
            clear();
        } else {
            int i10 = iW - 1;
            if (getHashes().length <= 8 || w() >= getHashes().length / 3) {
                if (index < i10) {
                    int i11 = index + 1;
                    C3831l.j(getHashes(), getHashes(), index, i11, iW);
                    C3831l.l(getArray(), getArray(), index, i11, iW);
                }
                getArray()[i10] = null;
            } else {
                int iW2 = w() > 8 ? w() + (w() >> 1) : 8;
                int[] hashes = getHashes();
                Object[] array = getArray();
                C4394d.a(this, iW2);
                if (index > 0) {
                    C3831l.o(hashes, getHashes(), 0, 0, index, 6, null);
                    C3831l.p(array, getArray(), 0, 0, index, 6, null);
                }
                if (index < i10) {
                    int i12 = index + 1;
                    C3831l.j(hashes, getHashes(), index, i12, iW);
                    C3831l.l(array, getArray(), index, i12, iW);
                }
            }
            if (iW != w()) {
                throw new ConcurrentModificationException();
            }
            A(i10);
        }
        return e10;
    }

    public final void y(Object[] objArr) {
        C3862t.g(objArr, "<set-?>");
        this.array = objArr;
    }

    public final void z(int[] iArr) {
        C3862t.g(iArr, "<set-?>");
        this.hashes = iArr;
    }

    public C4392b(int i10) {
        this.hashes = C4532a.f49713a;
        this.array = C4532a.f49715c;
        if (i10 > 0) {
            C4394d.a(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] array) {
        C3862t.g(array, "array");
        T[] result = (T[]) C4393c.a(array, this._size);
        C3831l.l(this.array, result, 0, 0, this._size);
        C3862t.f(result, "result");
        return result;
    }

    public /* synthetic */ C4392b(int i10, int i11, C3854k c3854k) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
