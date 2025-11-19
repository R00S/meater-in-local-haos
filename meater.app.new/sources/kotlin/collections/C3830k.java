package kotlin.collections;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ArrayDeque.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\r\b\u0007\u0018\u0000 \u0001*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001TB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007B\u0017\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0005\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0012J%\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u001f\u0010 \u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010!\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\u0007J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00028\u0000¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b'\u0010&J\r\u0010(\u001a\u00028\u0000¢\u0006\u0004\b(\u0010&J\u000f\u0010)\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b)\u0010&J\u0015\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00028\u0000¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\f2\u0006\u0010*\u001a\u00028\u0000¢\u0006\u0004\b-\u0010,J\r\u0010.\u001a\u00028\u0000¢\u0006\u0004\b.\u0010&J\u000f\u0010\u0001\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0001\u0010&J\r\u0010/\u001a\u00028\u0000¢\u0006\u0004\b/\u0010&J\u0017\u00100\u001a\u00020\"2\u0006\u0010*\u001a\u00028\u0000H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00100\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00028\u0000H\u0016¢\u0006\u0004\b0\u00102J\u001d\u00103\u001a\u00020\"2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b3\u00104J%\u00103\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b3\u00105J\u0018\u00106\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b6\u00107J \u00108\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b8\u00109J\u0018\u0010:\u001a\u00020\"2\u0006\u0010*\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b:\u00101J\u0017\u0010;\u001a\u00020\u00032\u0006\u0010*\u001a\u00028\u0000H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00032\u0006\u0010*\u001a\u00028\u0000H\u0016¢\u0006\u0004\b=\u0010<J\u0017\u0010>\u001a\u00020\"2\u0006\u0010*\u001a\u00028\u0000H\u0016¢\u0006\u0004\b>\u00101J\u0017\u0010?\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b?\u00107J\u001d\u0010@\u001a\u00020\"2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b@\u00104J\u001d\u0010A\u001a\u00020\"2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\bA\u00104J\u000f\u0010B\u001a\u00020\fH\u0016¢\u0006\u0004\bB\u0010\u0007J)\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00010D\"\u0004\b\u0001\u0010C2\f\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00010DH\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010H0DH\u0016¢\u0006\u0004\bF\u0010IJ\u001f\u0010J\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003H\u0014¢\u0006\u0004\bJ\u0010\u001cR\u0016\u0010L\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010KR\u001e\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010H0D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR$\u0010S\u001a\u00020\u00032\u0006\u0010P\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b!\u0010K\u001a\u0004\bQ\u0010R¨\u0006U"}, d2 = {"Lkotlin/collections/k;", "E", "Lkotlin/collections/f;", "", "initialCapacity", "<init>", "(I)V", "()V", "", "elements", "(Ljava/util/Collection;)V", "minCapacity", "Loa/F;", "j", "newCapacity", "h", "index", "B", "(I)I", "z", "x", "i", "internalIndex", "c", "(ILjava/util/Collection;)V", "fromIndex", "toIndex", "F", "(II)V", "G", "internalFromIndex", "internalToIndex", "A", "D", "", "isEmpty", "()Z", "first", "()Ljava/lang/Object;", "w", "last", "y", "element", "addFirst", "(Ljava/lang/Object;)V", "addLast", "removeFirst", "removeLast", "add", "(Ljava/lang/Object;)Z", "(ILjava/lang/Object;)V", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "get", "(I)Ljava/lang/Object;", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "contains", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "remove", "removeAt", "removeAll", "retainAll", "clear", "T", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "removeRange", "I", "head", "C", "[Ljava/lang/Object;", "elementData", "<set-?>", "getSize", "()I", "size", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.collections.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3830k<E> extends AbstractC3825f<E> {

    /* renamed from: F, reason: collision with root package name */
    private static final Object[] f43955F = new Object[0];

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private int head;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private Object[] elementData;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private int size;

    public C3830k(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = f43955F;
        } else {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Illegal Capacity: " + i10);
            }
            objArr = new Object[i10];
        }
        this.elementData = objArr;
    }

    private final void A(int internalFromIndex, int internalToIndex) {
        if (internalFromIndex < internalToIndex) {
            C3831l.u(this.elementData, null, internalFromIndex, internalToIndex);
            return;
        }
        Object[] objArr = this.elementData;
        C3831l.u(objArr, null, internalFromIndex, objArr.length);
        C3831l.u(this.elementData, null, 0, internalToIndex);
    }

    private final int B(int index) {
        Object[] objArr = this.elementData;
        return index >= objArr.length ? index - objArr.length : index;
    }

    private final void D() {
        ((AbstractList) this).modCount++;
    }

    private final void F(int fromIndex, int toIndex) {
        int iB = B(this.head + (fromIndex - 1));
        int iB2 = B(this.head + (toIndex - 1));
        while (fromIndex > 0) {
            int i10 = iB + 1;
            int iMin = Math.min(fromIndex, Math.min(i10, iB2 + 1));
            Object[] objArr = this.elementData;
            int i11 = iB2 - iMin;
            int i12 = iB - iMin;
            C3831l.l(objArr, objArr, i11 + 1, i12 + 1, i10);
            iB = z(i12);
            iB2 = z(i11);
            fromIndex -= iMin;
        }
    }

    private final void G(int fromIndex, int toIndex) {
        int iB = B(this.head + toIndex);
        int iB2 = B(this.head + fromIndex);
        int size = size();
        while (true) {
            size -= toIndex;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.elementData;
            toIndex = Math.min(size, Math.min(objArr.length - iB, objArr.length - iB2));
            Object[] objArr2 = this.elementData;
            int i10 = iB + toIndex;
            C3831l.l(objArr2, objArr2, iB2, iB, i10);
            iB = B(i10);
            iB2 = B(iB2 + toIndex);
        }
    }

    private final void c(int internalIndex, Collection<? extends E> elements) {
        Iterator<? extends E> it = elements.iterator();
        int length = this.elementData.length;
        while (internalIndex < length && it.hasNext()) {
            this.elementData[internalIndex] = it.next();
            internalIndex++;
        }
        int i10 = this.head;
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            this.elementData[i11] = it.next();
        }
        this.size = size() + elements.size();
    }

    private final void h(int newCapacity) {
        Object[] objArr = new Object[newCapacity];
        Object[] objArr2 = this.elementData;
        C3831l.l(objArr2, objArr, 0, this.head, objArr2.length);
        Object[] objArr3 = this.elementData;
        int length = objArr3.length;
        int i10 = this.head;
        C3831l.l(objArr3, objArr, length - i10, 0, i10);
        this.head = 0;
        this.elementData = objArr;
    }

    private final int i(int index) {
        return index == 0 ? C3831l.c0(this.elementData) : index - 1;
    }

    private final void j(int minCapacity) {
        if (minCapacity < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.elementData;
        if (minCapacity <= objArr.length) {
            return;
        }
        if (objArr == f43955F) {
            this.elementData = new Object[Ha.g.d(minCapacity, 10)];
        } else {
            h(AbstractC3822c.INSTANCE.e(objArr.length, minCapacity));
        }
    }

    private final int x(int index) {
        if (index == C3831l.c0(this.elementData)) {
            return 0;
        }
        return index + 1;
    }

    private final int z(int index) {
        return index < 0 ? index + this.elementData.length : index;
    }

    public final E E() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        addLast(element);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        C3862t.g(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        D();
        j(size() + elements.size());
        c(B(this.head + size()), elements);
        return true;
    }

    public final void addFirst(E element) {
        D();
        j(size() + 1);
        int i10 = i(this.head);
        this.head = i10;
        this.elementData[i10] = element;
        this.size = size() + 1;
    }

    public final void addLast(E element) {
        D();
        j(size() + 1);
        this.elementData[B(this.head + size())] = element;
        this.size = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            D();
            A(this.head, B(this.head + size()));
        }
        this.head = 0;
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[this.head];
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        AbstractC3822c.INSTANCE.b(index, size());
        return (E) this.elementData[B(this.head + index)];
    }

    @Override // kotlin.collections.AbstractC3825f
    public int getSize() {
        return this.size;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        int i10;
        int iB = B(this.head + size());
        int length = this.head;
        if (length < iB) {
            while (length < iB) {
                if (C3862t.b(element, this.elementData[length])) {
                    i10 = this.head;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iB) {
            return -1;
        }
        int length2 = this.elementData.length;
        while (true) {
            if (length >= length2) {
                for (int i11 = 0; i11 < iB; i11++) {
                    if (C3862t.b(element, this.elementData[i11])) {
                        length = i11 + this.elementData.length;
                        i10 = this.head;
                    }
                }
                return -1;
            }
            if (C3862t.b(element, this.elementData[length])) {
                i10 = this.head;
                break;
            }
            length++;
        }
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[B(this.head + r.o(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        int iC0;
        int i10;
        int iB = B(this.head + size());
        int i11 = this.head;
        if (i11 < iB) {
            iC0 = iB - 1;
            if (i11 <= iC0) {
                while (!C3862t.b(element, this.elementData[iC0])) {
                    if (iC0 != i11) {
                        iC0--;
                    }
                }
                i10 = this.head;
                return iC0 - i10;
            }
            return -1;
        }
        if (i11 > iB) {
            int i12 = iB - 1;
            while (true) {
                if (-1 >= i12) {
                    iC0 = C3831l.c0(this.elementData);
                    int i13 = this.head;
                    if (i13 <= iC0) {
                        while (!C3862t.b(element, this.elementData[iC0])) {
                            if (iC0 != i13) {
                                iC0--;
                            }
                        }
                        i10 = this.head;
                    }
                } else {
                    if (C3862t.b(element, this.elementData[i12])) {
                        iC0 = i12 + this.elementData.length;
                        i10 = this.head;
                        break;
                    }
                    i12--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        int iB;
        C3862t.g(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int iB2 = B(this.head + size());
            int i10 = this.head;
            if (i10 < iB2) {
                iB = i10;
                while (i10 < iB2) {
                    Object obj = this.elementData[i10];
                    if (elements.contains(obj)) {
                        z10 = true;
                    } else {
                        this.elementData[iB] = obj;
                        iB++;
                    }
                    i10++;
                }
                C3831l.u(this.elementData, null, iB, iB2);
            } else {
                int length = this.elementData.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.elementData[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iB = B(i11);
                for (int i12 = 0; i12 < iB2; i12++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.elementData[iB] = obj3;
                        iB = x(iB);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                D();
                this.size = z(iB - this.head);
            }
        }
        return z10;
    }

    @Override // kotlin.collections.AbstractC3825f
    public E removeAt(int index) {
        AbstractC3822c.INSTANCE.b(index, size());
        if (index == r.o(this)) {
            return removeLast();
        }
        if (index == 0) {
            return removeFirst();
        }
        D();
        int iB = B(this.head + index);
        E e10 = (E) this.elementData[iB];
        if (index < (size() >> 1)) {
            int i10 = this.head;
            if (iB >= i10) {
                Object[] objArr = this.elementData;
                C3831l.l(objArr, objArr, i10 + 1, i10, iB);
            } else {
                Object[] objArr2 = this.elementData;
                C3831l.l(objArr2, objArr2, 1, 0, iB);
                Object[] objArr3 = this.elementData;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i11 = this.head;
                C3831l.l(objArr3, objArr3, i11 + 1, i11, objArr3.length - 1);
            }
            Object[] objArr4 = this.elementData;
            int i12 = this.head;
            objArr4[i12] = null;
            this.head = x(i12);
        } else {
            int iB2 = B(this.head + r.o(this));
            if (iB <= iB2) {
                Object[] objArr5 = this.elementData;
                C3831l.l(objArr5, objArr5, iB, iB + 1, iB2 + 1);
            } else {
                Object[] objArr6 = this.elementData;
                C3831l.l(objArr6, objArr6, iB, iB + 1, objArr6.length);
                Object[] objArr7 = this.elementData;
                objArr7[objArr7.length - 1] = objArr7[0];
                C3831l.l(objArr7, objArr7, 0, 1, iB2 + 1);
            }
            this.elementData[iB2] = null;
        }
        this.size = size() - 1;
        return e10;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        D();
        Object[] objArr = this.elementData;
        int i10 = this.head;
        E e10 = (E) objArr[i10];
        objArr[i10] = null;
        this.head = x(i10);
        this.size = size() - 1;
        return e10;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        D();
        int iB = B(this.head + r.o(this));
        Object[] objArr = this.elementData;
        E e10 = (E) objArr[iB];
        objArr[iB] = null;
        this.size = size() - 1;
        return e10;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int fromIndex, int toIndex) {
        AbstractC3822c.INSTANCE.d(fromIndex, toIndex, size());
        int i10 = toIndex - fromIndex;
        if (i10 == 0) {
            return;
        }
        if (i10 == size()) {
            clear();
            return;
        }
        if (i10 == 1) {
            remove(fromIndex);
            return;
        }
        D();
        if (fromIndex < size() - toIndex) {
            F(fromIndex, toIndex);
            int iB = B(this.head + i10);
            A(this.head, iB);
            this.head = iB;
        } else {
            G(fromIndex, toIndex);
            int iB2 = B(this.head + size());
            A(z(iB2 - i10), iB2);
        }
        this.size = size() - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        int iB;
        C3862t.g(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int iB2 = B(this.head + size());
            int i10 = this.head;
            if (i10 < iB2) {
                iB = i10;
                while (i10 < iB2) {
                    Object obj = this.elementData[i10];
                    if (elements.contains(obj)) {
                        this.elementData[iB] = obj;
                        iB++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                C3831l.u(this.elementData, null, iB, iB2);
            } else {
                int length = this.elementData.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.elementData[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iB = B(i11);
                for (int i12 = 0; i12 < iB2; i12++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.elementData[iB] = obj3;
                        iB = x(iB);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                D();
                this.size = z(iB - this.head);
            }
        }
        return z10;
    }

    @Override // kotlin.collections.AbstractC3825f, java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        AbstractC3822c.INSTANCE.b(index, size());
        int iB = B(this.head + index);
        Object[] objArr = this.elementData;
        E e10 = (E) objArr[iB];
        objArr[iB] = element;
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        C3862t.g(array, "array");
        if (array.length < size()) {
            array = (T[]) C3832m.a(array, size());
        }
        int iB = B(this.head + size());
        int i10 = this.head;
        if (i10 < iB) {
            C3831l.p(this.elementData, array, 0, i10, iB, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.elementData;
            C3831l.l(objArr, array, 0, this.head, objArr.length);
            Object[] objArr2 = this.elementData;
            C3831l.l(objArr2, array, objArr2.length - this.head, 0, iB);
        }
        return (T[]) r.f(size(), array);
    }

    public final E w() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[this.head];
    }

    public final E y() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[B(this.head + r.o(this))];
    }

    @Override // kotlin.collections.AbstractC3825f, java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        AbstractC3822c.INSTANCE.c(index, size());
        if (index == size()) {
            addLast(element);
            return;
        }
        if (index == 0) {
            addFirst(element);
            return;
        }
        D();
        j(size() + 1);
        int iB = B(this.head + index);
        if (index < ((size() + 1) >> 1)) {
            int i10 = i(iB);
            int i11 = i(this.head);
            int i12 = this.head;
            if (i10 >= i12) {
                Object[] objArr = this.elementData;
                objArr[i11] = objArr[i12];
                C3831l.l(objArr, objArr, i12, i12 + 1, i10 + 1);
            } else {
                Object[] objArr2 = this.elementData;
                C3831l.l(objArr2, objArr2, i12 - 1, i12, objArr2.length);
                Object[] objArr3 = this.elementData;
                objArr3[objArr3.length - 1] = objArr3[0];
                C3831l.l(objArr3, objArr3, 0, 1, i10 + 1);
            }
            this.elementData[i10] = element;
            this.head = i11;
        } else {
            int iB2 = B(this.head + size());
            if (iB < iB2) {
                Object[] objArr4 = this.elementData;
                C3831l.l(objArr4, objArr4, iB + 1, iB, iB2);
            } else {
                Object[] objArr5 = this.elementData;
                C3831l.l(objArr5, objArr5, 1, 0, iB2);
                Object[] objArr6 = this.elementData;
                objArr6[0] = objArr6[objArr6.length - 1];
                C3831l.l(objArr6, objArr6, iB + 1, iB, objArr6.length - 1);
            }
            this.elementData[iB] = element;
        }
        this.size = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends E> elements) {
        C3862t.g(elements, "elements");
        AbstractC3822c.INSTANCE.c(index, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (index == size()) {
            return addAll(elements);
        }
        D();
        j(size() + elements.size());
        int iB = B(this.head + size());
        int iB2 = B(this.head + index);
        int size = elements.size();
        if (index < ((size() + 1) >> 1)) {
            int i10 = this.head;
            int length = i10 - size;
            if (iB2 < i10) {
                Object[] objArr = this.elementData;
                C3831l.l(objArr, objArr, length, i10, objArr.length);
                if (size >= iB2) {
                    Object[] objArr2 = this.elementData;
                    C3831l.l(objArr2, objArr2, objArr2.length - size, 0, iB2);
                } else {
                    Object[] objArr3 = this.elementData;
                    C3831l.l(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.elementData;
                    C3831l.l(objArr4, objArr4, 0, size, iB2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.elementData;
                C3831l.l(objArr5, objArr5, length, i10, iB2);
            } else {
                Object[] objArr6 = this.elementData;
                length += objArr6.length;
                int i11 = iB2 - i10;
                int length2 = objArr6.length - length;
                if (length2 >= i11) {
                    C3831l.l(objArr6, objArr6, length, i10, iB2);
                } else {
                    C3831l.l(objArr6, objArr6, length, i10, i10 + length2);
                    Object[] objArr7 = this.elementData;
                    C3831l.l(objArr7, objArr7, 0, this.head + length2, iB2);
                }
            }
            this.head = length;
            c(z(iB2 - size), elements);
        } else {
            int i12 = iB2 + size;
            if (iB2 < iB) {
                int i13 = size + iB;
                Object[] objArr8 = this.elementData;
                if (i13 <= objArr8.length) {
                    C3831l.l(objArr8, objArr8, i12, iB2, iB);
                } else if (i12 >= objArr8.length) {
                    C3831l.l(objArr8, objArr8, i12 - objArr8.length, iB2, iB);
                } else {
                    int length3 = iB - (i13 - objArr8.length);
                    C3831l.l(objArr8, objArr8, 0, length3, iB);
                    Object[] objArr9 = this.elementData;
                    C3831l.l(objArr9, objArr9, i12, iB2, length3);
                }
            } else {
                Object[] objArr10 = this.elementData;
                C3831l.l(objArr10, objArr10, size, 0, iB);
                Object[] objArr11 = this.elementData;
                if (i12 >= objArr11.length) {
                    C3831l.l(objArr11, objArr11, i12 - objArr11.length, iB2, objArr11.length);
                } else {
                    C3831l.l(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.elementData;
                    C3831l.l(objArr12, objArr12, i12, iB2, objArr12.length - size);
                }
            }
            c(iB2, elements);
        }
        return true;
    }

    public C3830k() {
        this.elementData = f43955F;
    }

    public C3830k(Collection<? extends E> elements) {
        C3862t.g(elements, "elements");
        Object[] array = elements.toArray(new Object[0]);
        this.elementData = array;
        this.size = array.length;
        if (array.length == 0) {
            this.elementData = f43955F;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
