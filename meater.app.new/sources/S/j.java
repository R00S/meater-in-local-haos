package S;

import R.e;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: SmallPersistentVector.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010*\n\u0002\b\f\b\u0000\u0018\u0000 .*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001/B\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u001bJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b#\u0010\"J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$2\u0006\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b'\u0010(J%\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010\u001bR\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\n\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"LS/j;", "E", "LR/c;", "LS/b;", "", "", "buffer", "<init>", "([Ljava/lang/Object;)V", "", "size", "h", "(I)[Ljava/lang/Object;", "element", "LR/e;", "add", "(Ljava/lang/Object;)LR/e;", "", "elements", "addAll", "(Ljava/util/Collection;)LR/e;", "Lkotlin/Function1;", "", "predicate", "z1", "(LBa/l;)LR/e;", "index", "(ILjava/lang/Object;)LR/e;", "o0", "(I)LR/e;", "LR/e$a;", "t", "()LR/e$a;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "listIterator", "(I)Ljava/util/ListIterator;", "get", "(I)Ljava/lang/Object;", "set", "B", "[Ljava/lang/Object;", "getSize", "()I", "C", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j<E> extends b<E> implements R.c<E> {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: D, reason: collision with root package name */
    public static final int f15254D = 8;

    /* renamed from: E, reason: collision with root package name */
    private static final j f15255E = new j(new Object[0]);

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Object[] buffer;

    /* compiled from: SmallPersistentVector.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LS/j$a;", "", "<init>", "()V", "LS/j;", "", "EMPTY", "LS/j;", "a", "()LS/j;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: S.j$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final j a() {
            return j.f15255E;
        }

        private Companion() {
        }
    }

    public j(Object[] objArr) {
        this.buffer = objArr;
        V.a.a(objArr.length <= 32);
    }

    private final Object[] h(int size) {
        return new Object[size];
    }

    @Override // java.util.Collection, java.util.List, R.e
    public R.e<E> add(E element) {
        if (size() >= 32) {
            return new e(this.buffer, l.c(element), size() + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() + 1);
        C3862t.f(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[size()] = element;
        return new j(objArrCopyOf);
    }

    @Override // S.b, java.util.Collection, java.util.List, R.e
    public R.e<E> addAll(Collection<? extends E> elements) {
        if (size() + elements.size() > 32) {
            e.a<E> aVarT = t();
            aVarT.addAll(elements);
            return aVarT.e();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() + elements.size());
        C3862t.f(objArrCopyOf, "copyOf(this, newSize)");
        int size = size();
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            objArrCopyOf[size] = it.next();
            size++;
        }
        return new j(objArrCopyOf);
    }

    @Override // kotlin.collections.AbstractC3822c, java.util.List
    public E get(int index) {
        V.d.a(index, size());
        return (E) this.buffer[index];
    }

    @Override // kotlin.collections.AbstractC3822c, kotlin.collections.AbstractC3820a
    public int getSize() {
        return this.buffer.length;
    }

    @Override // kotlin.collections.AbstractC3822c, java.util.List
    public int indexOf(Object element) {
        return C3831l.i0(this.buffer, element);
    }

    @Override // kotlin.collections.AbstractC3822c, java.util.List
    public int lastIndexOf(Object element) {
        return C3831l.q0(this.buffer, element);
    }

    @Override // kotlin.collections.AbstractC3822c, java.util.List
    public ListIterator<E> listIterator(int index) {
        V.d.b(index, size());
        return new c(this.buffer, index, size());
    }

    @Override // R.e
    public R.e<E> o0(int index) {
        V.d.a(index, size());
        if (size() == 1) {
            return f15255E;
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() - 1);
        C3862t.f(objArrCopyOf, "copyOf(this, newSize)");
        C3831l.l(this.buffer, objArrCopyOf, index, index + 1, size());
        return new j(objArrCopyOf);
    }

    @Override // kotlin.collections.AbstractC3822c, java.util.List, R.e
    public R.e<E> set(int index, E element) {
        V.d.a(index, size());
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        C3862t.f(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[index] = element;
        return new j(objArrCopyOf);
    }

    @Override // R.e
    public e.a<E> t() {
        return new f(this, null, this.buffer, 0);
    }

    @Override // R.e
    public R.e<E> z1(Ba.l<? super E, Boolean> predicate) {
        Object[] objArrCopyOf = this.buffer;
        int size = size();
        int size2 = size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size2; i10++) {
            Object obj = this.buffer[i10];
            if (predicate.invoke(obj).booleanValue()) {
                if (!z10) {
                    Object[] objArr = this.buffer;
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    C3862t.f(objArrCopyOf, "copyOf(this, size)");
                    z10 = true;
                    size = i10;
                }
            } else if (z10) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        return size == size() ? this : size == 0 ? f15255E : new j(C3831l.r(objArrCopyOf, 0, size));
    }

    @Override // java.util.List, R.e
    public R.e<E> add(int index, E element) {
        V.d.b(index, size());
        if (index == size()) {
            return add((j<E>) element);
        }
        if (size() < 32) {
            Object[] objArrH = h(size() + 1);
            C3831l.p(this.buffer, objArrH, 0, 0, index, 6, null);
            C3831l.l(this.buffer, objArrH, index + 1, index, size());
            objArrH[index] = element;
            return new j(objArrH);
        }
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        C3862t.f(objArrCopyOf, "copyOf(this, size)");
        C3831l.l(this.buffer, objArrCopyOf, index + 1, index, size() - 1);
        objArrCopyOf[index] = element;
        return new e(objArrCopyOf, l.c(this.buffer[31]), size() + 1, 0);
    }
}
