package Rb;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: SmartList.java */
/* loaded from: classes3.dex */
public class k<E> extends AbstractList<E> implements RandomAccess {

    /* renamed from: B, reason: collision with root package name */
    private int f15215B;

    /* renamed from: C, reason: collision with root package name */
    private Object f15216C;

    /* compiled from: SmartList.java */
    private static class b<T> implements Iterator<T> {

        /* renamed from: B, reason: collision with root package name */
        private static final b f15217B = new b();

        private b() {
        }

        public static <T> b<T> b() {
            return f15217B;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new IllegalStateException();
        }
    }

    /* compiled from: SmartList.java */
    private class c extends d<E> {

        /* renamed from: C, reason: collision with root package name */
        private final int f15218C;

        public c() {
            super();
            this.f15218C = ((AbstractList) k.this).modCount;
        }

        @Override // Rb.k.d
        protected void b() {
            if (((AbstractList) k.this).modCount == this.f15218C) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) k.this).modCount + "; expected: " + this.f15218C);
        }

        @Override // Rb.k.d
        protected E d() {
            return (E) k.this.f15216C;
        }

        @Override // java.util.Iterator
        public void remove() {
            b();
            k.this.clear();
        }
    }

    /* compiled from: SmartList.java */
    private static abstract class d<T> implements Iterator<T> {

        /* renamed from: B, reason: collision with root package name */
        private boolean f15220B;

        private d() {
        }

        protected abstract void b();

        protected abstract T d();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f15220B;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f15220B) {
                throw new NoSuchElementException();
            }
            this.f15220B = true;
            b();
            return d();
        }
    }

    private static /* synthetic */ void c(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i10 == 2 || i10 == 3) {
            objArr[1] = "iterator";
        } else if (i10 == 5 || i10 == 6 || i10 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        int i10 = this.f15215B;
        if (i10 == 0) {
            this.f15216C = e10;
        } else if (i10 == 1) {
            this.f15216C = new Object[]{this.f15216C, e10};
        } else {
            Object[] objArr = (Object[]) this.f15216C;
            int length = objArr.length;
            if (i10 >= length) {
                int i11 = ((length * 3) / 2) + 1;
                int i12 = i10 + 1;
                if (i11 < i12) {
                    i11 = i12;
                }
                Object[] objArr2 = new Object[i11];
                this.f15216C = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f15215B] = e10;
        }
        this.f15215B++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f15216C = null;
        this.f15215B = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f15215B)) {
            return i11 == 1 ? (E) this.f15216C : (E) ((Object[]) this.f15216C)[i10];
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f15215B);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        int i10 = this.f15215B;
        if (i10 == 0) {
            b bVarB = b.b();
            if (bVarB == null) {
                c(2);
            }
            return bVarB;
        }
        if (i10 == 1) {
            return new c();
        }
        Iterator<E> it = super.iterator();
        if (it == null) {
            c(3);
        }
        return it;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i10) {
        int i11;
        E e10;
        if (i10 < 0 || i10 >= (i11 = this.f15215B)) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f15215B);
        }
        if (i11 == 1) {
            e10 = (E) this.f15216C;
            this.f15216C = null;
        } else {
            Object[] objArr = (Object[]) this.f15216C;
            Object obj = objArr[i10];
            if (i11 == 2) {
                this.f15216C = objArr[1 - i10];
            } else {
                int i12 = (i11 - i10) - 1;
                if (i12 > 0) {
                    System.arraycopy(objArr, i10 + 1, objArr, i10, i12);
                }
                objArr[this.f15215B - 1] = null;
            }
            e10 = (E) obj;
        }
        this.f15215B--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f15215B)) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f15215B);
        }
        if (i11 == 1) {
            E e11 = (E) this.f15216C;
            this.f15216C = e10;
            return e11;
        }
        Object[] objArr = (Object[]) this.f15216C;
        E e12 = (E) objArr[i10];
        objArr[i10] = e10;
        return e12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f15215B;
    }

    @Override // java.util.List
    public void sort(Comparator<? super E> comparator) {
        int i10 = this.f15215B;
        if (i10 >= 2) {
            Arrays.sort((Object[]) this.f15216C, 0, i10, comparator);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        if (tArr == 0) {
            c(4);
        }
        int length = tArr.length;
        int i10 = this.f15215B;
        if (i10 == 1) {
            if (length == 0) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.f15216C;
                return tArr2;
            }
            tArr[0] = this.f15216C;
        } else {
            if (length < i10) {
                T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.f15216C, i10, tArr.getClass());
                if (tArr3 == null) {
                    c(6);
                }
                return tArr3;
            }
            if (i10 != 0) {
                System.arraycopy(this.f15216C, 0, tArr, 0, i10);
            }
        }
        int i11 = this.f15215B;
        if (length > i11) {
            tArr[i11] = 0;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        if (i10 >= 0 && i10 <= (i11 = this.f15215B)) {
            if (i11 == 0) {
                this.f15216C = e10;
            } else if (i11 == 1 && i10 == 0) {
                this.f15216C = new Object[]{e10, this.f15216C};
            } else {
                Object[] objArr = new Object[i11 + 1];
                if (i11 == 1) {
                    objArr[0] = this.f15216C;
                } else {
                    Object[] objArr2 = (Object[]) this.f15216C;
                    System.arraycopy(objArr2, 0, objArr, 0, i10);
                    System.arraycopy(objArr2, i10, objArr, i10 + 1, this.f15215B - i10);
                }
                objArr[i10] = e10;
                this.f15216C = objArr;
            }
            this.f15215B++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f15215B);
    }
}
