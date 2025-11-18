package S;

import java.util.Arrays;
import java.util.ListIterator;
import kotlin.C1489A0;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3862t;

/* compiled from: PersistentVector.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJE\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012JA\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JI\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ=\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!J5\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010#JA\u0010%\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001bH\u0002¢\u0006\u0004\b%\u0010&J?\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001bH\u0002¢\u0006\u0004\b'\u0010&J\u001f\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010)JA\u0010\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0001\u0010+J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b,\u0010-J%\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b,\u0010.J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u00100J)\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020201H\u0016¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0016¢\u0006\u0004\b7\u00108J\u001d\u0010:\u001a\b\u0012\u0004\u0012\u00028\u0000092\u0006\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b:\u0010;J\u0018\u0010<\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b<\u0010=J%\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b>\u0010.R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010?R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bB\u0010\u000eR\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010A¨\u0006C"}, d2 = {"LS/e;", "E", "LR/e;", "LS/b;", "", "", "root", "tail", "", "size", "rootShift", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;II)V", "D", "()I", "filledTail", "newTail", "y", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)LS/e;", "shift", "z", "([Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "tailIndex", "element", "j", "([Ljava/lang/Object;ILjava/lang/Object;)LS/e;", "index", "LS/d;", "elementCarry", "i", "([Ljava/lang/Object;IILjava/lang/Object;LS/d;)[Ljava/lang/Object;", "rootSize", "B", "([Ljava/lang/Object;III)LR/e;", "x", "([Ljava/lang/Object;II)LR/e;", "tailCarry", "w", "([Ljava/lang/Object;IILS/d;)[Ljava/lang/Object;", "A", "c", "(I)[Ljava/lang/Object;", "e", "([Ljava/lang/Object;IILjava/lang/Object;)[Ljava/lang/Object;", "add", "(Ljava/lang/Object;)LR/e;", "(ILjava/lang/Object;)LR/e;", "o0", "(I)LR/e;", "Lkotlin/Function1;", "", "predicate", "z1", "(LBa/l;)LR/e;", "LS/f;", "h", "()LS/f;", "", "listIterator", "(I)Ljava/util/ListIterator;", "get", "(I)Ljava/lang/Object;", "set", "[Ljava/lang/Object;", "C", "I", "getSize", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e<E> extends b<E> implements R.e<E> {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Object[] root;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final Object[] tail;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final int rootShift;

    public e(Object[] objArr, Object[] objArr2, int i10, int i11) {
        this.root = objArr;
        this.tail = objArr2;
        this.size = i10;
        this.rootShift = i11;
        if (!(size() > 32)) {
            C1489A0.a("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        V.a.a(size() - l.d(size()) <= Ha.g.g(objArr2.length, 32));
    }

    private final Object[] A(Object[] root, int shift, int index, d tailCarry) {
        Object[] objArrCopyOf;
        int iA = l.a(index, shift);
        if (shift == 0) {
            if (iA == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(root, 32);
                C3862t.f(objArrCopyOf, "copyOf(this, newSize)");
            }
            C3831l.l(root, objArrCopyOf, iA, iA + 1, 32);
            objArrCopyOf[31] = tailCarry.getValue();
            tailCarry.b(root[iA]);
            return objArrCopyOf;
        }
        int iA2 = root[31] == null ? l.a(D() - 1, shift) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(root, 32);
        C3862t.f(objArrCopyOf2, "copyOf(this, newSize)");
        int i10 = shift - 5;
        int i11 = iA + 1;
        if (i11 <= iA2) {
            while (true) {
                Object obj = objArrCopyOf2[iA2];
                C3862t.e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iA2] = A((Object[]) obj, i10, 0, tailCarry);
                if (iA2 == i11) {
                    break;
                }
                iA2--;
            }
        }
        Object obj2 = objArrCopyOf2[iA];
        C3862t.e(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iA] = A((Object[]) obj2, i10, index, tailCarry);
        return objArrCopyOf2;
    }

    private final R.e<E> B(Object[] root, int rootSize, int shift, int index) {
        int size = size() - rootSize;
        V.a.a(index < size);
        if (size == 1) {
            return x(root, rootSize, shift);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        C3862t.f(objArrCopyOf, "copyOf(this, newSize)");
        int i10 = size - 1;
        if (index < i10) {
            C3831l.l(this.tail, objArrCopyOf, index, index + 1, size);
        }
        objArrCopyOf[i10] = null;
        return new e(root, objArrCopyOf, (rootSize + size) - 1, shift);
    }

    private final int D() {
        return l.d(size());
    }

    private final Object[] E(Object[] root, int shift, int index, Object e10) {
        int iA = l.a(index, shift);
        Object[] objArrCopyOf = Arrays.copyOf(root, 32);
        C3862t.f(objArrCopyOf, "copyOf(this, newSize)");
        if (shift == 0) {
            objArrCopyOf[iA] = e10;
        } else {
            Object obj = objArrCopyOf[iA];
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf[iA] = E((Object[]) obj, shift - 5, index, e10);
        }
        return objArrCopyOf;
    }

    private final Object[] c(int index) {
        if (D() <= index) {
            return this.tail;
        }
        Object[] objArr = this.root;
        for (int i10 = this.rootShift; i10 > 0; i10 -= 5) {
            Object[] objArr2 = objArr[l.a(index, i10)];
            C3862t.e(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] i(Object[] root, int shift, int index, Object element, d elementCarry) {
        Object[] objArrCopyOf;
        int iA = l.a(index, shift);
        if (shift == 0) {
            if (iA == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(root, 32);
                C3862t.f(objArrCopyOf, "copyOf(this, newSize)");
            }
            C3831l.l(root, objArrCopyOf, iA + 1, iA, 31);
            elementCarry.b(root[31]);
            objArrCopyOf[iA] = element;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(root, 32);
        C3862t.f(objArrCopyOf2, "copyOf(this, newSize)");
        int i10 = shift - 5;
        Object obj = root[iA];
        String str = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
        C3862t.e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iA] = i((Object[]) obj, i10, index, element, elementCarry);
        int i11 = iA + 1;
        while (i11 < 32 && objArrCopyOf2[i11] != null) {
            Object obj2 = root[i11];
            C3862t.e(obj2, str);
            Object[] objArr = objArrCopyOf2;
            objArr[i11] = i((Object[]) obj2, i10, 0, elementCarry.getValue(), elementCarry);
            i11++;
            objArrCopyOf2 = objArr;
            str = str;
        }
        return objArrCopyOf2;
    }

    private final e<E> j(Object[] root, int tailIndex, Object element) {
        int size = size() - D();
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        C3862t.f(objArrCopyOf, "copyOf(this, newSize)");
        if (size < 32) {
            C3831l.l(this.tail, objArrCopyOf, tailIndex + 1, tailIndex, size);
            objArrCopyOf[tailIndex] = element;
            return new e<>(root, objArrCopyOf, size() + 1, this.rootShift);
        }
        Object[] objArr = this.tail;
        Object obj = objArr[31];
        C3831l.l(objArr, objArrCopyOf, tailIndex + 1, tailIndex, size - 1);
        objArrCopyOf[tailIndex] = element;
        return y(root, objArrCopyOf, l.c(obj));
    }

    private final Object[] w(Object[] root, int shift, int index, d tailCarry) {
        Object[] objArrW;
        int iA = l.a(index, shift);
        if (shift == 5) {
            tailCarry.b(root[iA]);
            objArrW = null;
        } else {
            Object obj = root[iA];
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrW = w((Object[]) obj, shift - 5, index, tailCarry);
        }
        if (objArrW == null && iA == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(root, 32);
        C3862t.f(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[iA] = objArrW;
        return objArrCopyOf;
    }

    private final R.e<E> x(Object[] root, int rootSize, int shift) {
        if (shift == 0) {
            if (root.length == 33) {
                root = Arrays.copyOf(root, 32);
                C3862t.f(root, "copyOf(this, newSize)");
            }
            return new j(root);
        }
        d dVar = new d(null);
        Object[] objArrW = w(root, shift, rootSize - 1, dVar);
        C3862t.d(objArrW);
        Object value = dVar.getValue();
        C3862t.e(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        if (objArrW[1] != null) {
            return new e(objArrW, objArr, rootSize, shift);
        }
        Object obj = objArrW[0];
        C3862t.e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new e((Object[]) obj, objArr, rootSize, shift - 5);
    }

    private final e<E> y(Object[] root, Object[] filledTail, Object[] newTail) {
        int size = size() >> 5;
        int i10 = this.rootShift;
        if (size <= (1 << i10)) {
            return new e<>(z(root, i10, filledTail), newTail, size() + 1, this.rootShift);
        }
        Object[] objArrC = l.c(root);
        int i11 = this.rootShift + 5;
        return new e<>(z(objArrC, i11, filledTail), newTail, size() + 1, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object[] z(java.lang.Object[] r4, int r5, java.lang.Object[] r6) {
        /*
            r3 = this;
            int r0 = r3.size()
            int r0 = r0 + (-1)
            int r0 = S.l.a(r0, r5)
            r1 = 32
            if (r4 == 0) goto L19
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r2 = "copyOf(this, newSize)"
            kotlin.jvm.internal.C3862t.f(r4, r2)
            if (r4 != 0) goto L1b
        L19:
            java.lang.Object[] r4 = new java.lang.Object[r1]
        L1b:
            r1 = 5
            if (r5 != r1) goto L21
            r4[r0] = r6
            goto L2c
        L21:
            r2 = r4[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r5 = r5 - r1
            java.lang.Object[] r5 = r3.z(r2, r5, r6)
            r4[r0] = r5
        L2c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: S.e.z(java.lang.Object[], int, java.lang.Object[]):java.lang.Object[]");
    }

    @Override // java.util.Collection, java.util.List, R.e
    public R.e<E> add(E element) {
        int size = size() - D();
        if (size >= 32) {
            return y(this.root, this.tail, l.c(element));
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        C3862t.f(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[size] = element;
        return new e(this.root, objArrCopyOf, size() + 1, this.rootShift);
    }

    @Override // kotlin.collections.AbstractC3822c, java.util.List
    public E get(int index) {
        V.d.a(index, size());
        return (E) c(index)[index & 31];
    }

    @Override // kotlin.collections.AbstractC3822c, kotlin.collections.AbstractC3820a
    public int getSize() {
        return this.size;
    }

    @Override // R.e
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public f<E> t() {
        return new f<>(this, this.root, this.tail, this.rootShift);
    }

    @Override // kotlin.collections.AbstractC3822c, java.util.List
    public ListIterator<E> listIterator(int index) {
        V.d.b(index, size());
        return new g(this.root, this.tail, index, size(), (this.rootShift / 5) + 1);
    }

    @Override // R.e
    public R.e<E> o0(int index) {
        V.d.a(index, size());
        int iD = D();
        return index >= iD ? B(this.root, iD, this.rootShift, index - iD) : B(A(this.root, this.rootShift, index, new d(this.tail[0])), iD, this.rootShift, 0);
    }

    @Override // kotlin.collections.AbstractC3822c, java.util.List, R.e
    public R.e<E> set(int index, E element) {
        V.d.a(index, size());
        if (D() > index) {
            return new e(E(this.root, this.rootShift, index, element), this.tail, size(), this.rootShift);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        C3862t.f(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[index & 31] = element;
        return new e(this.root, objArrCopyOf, size(), this.rootShift);
    }

    @Override // R.e
    public R.e<E> z1(Ba.l<? super E, Boolean> predicate) {
        f<E> fVarT = t();
        fVarT.V(predicate);
        return fVarT.e();
    }

    @Override // java.util.List, R.e
    public R.e<E> add(int index, E element) {
        V.d.b(index, size());
        if (index == size()) {
            return add((e<E>) element);
        }
        int iD = D();
        if (index >= iD) {
            return j(this.root, index - iD, element);
        }
        d dVar = new d(null);
        return j(i(this.root, this.rootShift, index, element, dVar), 0, dVar.getValue());
    }
}
