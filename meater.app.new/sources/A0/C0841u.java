package A0;

import b0.i;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3853j;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: HitTestResult.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u000f\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002IJB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0015\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0004J\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u0004J\u001d\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\u001b\u0010\u001aJ\u0018\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u000b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0018\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010\rJ\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*H\u0096\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b-\u0010(J\u0015\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020.2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b/\u00101J%\u00104\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u00102\u001a\u00020#2\u0006\u00103\u001a\u00020#H\u0016¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0005¢\u0006\u0004\b6\u0010\u0004R\u001e\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u000108078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010-R$\u0010C\u001a\u00020#2\u0006\u0010A\u001a\u00020#8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0017\u0010-\u001a\u0004\b9\u0010BR\"\u0010H\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010D\u001a\u0004\bE\u0010\r\"\u0004\bF\u0010G\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006K"}, d2 = {"LA0/u;", "", "Lb0/i$c;", "<init>", "()V", "Loa/F;", "J", "LA0/q;", "y", "()J", "x", "", "D", "()Z", "c", "", "distanceFromEdge", "isInLayer", "H", "(FZ)Z", "node", "Lkotlin/Function0;", "childHitTest", "E", "(Lb0/i$c;ZLBa/a;)V", "F", "(Lb0/i$c;FZLBa/a;)V", "K", "element", "w", "(Lb0/i$c;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "z", "(I)Lb0/i$c;", "G", "(Lb0/i$c;)I", "isEmpty", "", "iterator", "()Ljava/util/Iterator;", "I", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "clear", "", "", "B", "[Ljava/lang/Object;", "values", "", "C", "[J", "distanceFromEdgeAndInLayer", "hitDepth", "<set-?>", "()I", "size", "Z", "A", "setShouldSharePointerInputWithSibling", "(Z)V", "shouldSharePointerInputWithSibling", "a", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0841u implements List<i.c>, Ca.a {

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private Object[] values = new Object[16];

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private long[] distanceFromEdgeAndInLayer = new long[16];

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private int hitDepth = -1;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private boolean shouldSharePointerInputWithSibling = true;

    /* compiled from: HitTestResult.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u0010\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ%\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0014\u0010*\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010&¨\u0006+"}, d2 = {"LA0/u$b;", "", "Lb0/i$c;", "", "minIndex", "maxIndex", "<init>", "(LA0/u;II)V", "element", "", "c", "(Lb0/i$c;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "h", "(I)Lb0/i$c;", "j", "(Lb0/i$c;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "w", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "B", "I", "getMinIndex", "()I", "C", "getMaxIndex", "i", "size", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A0.u$b */
    private final class b implements List<i.c>, Ca.a {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final int minIndex;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private final int maxIndex;

        public b(int i10, int i11) {
            this.minIndex = i10;
            this.maxIndex = i11;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i10, i.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends i.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean c(i.c element) {
            return indexOf(element) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof i.c) {
                return c((i.c) obj);
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains((i.c) it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public i.c get(int index) {
            Object obj = C0841u.this.values[index + this.minIndex];
            C3862t.e(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (i.c) obj;
        }

        public int i() {
            return this.maxIndex - this.minIndex;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof i.c) {
                return j((i.c) obj);
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<i.c> iterator() {
            C0841u c0841u = C0841u.this;
            int i10 = this.minIndex;
            return c0841u.new a(i10, i10, this.maxIndex);
        }

        public int j(i.c element) {
            int i10 = this.minIndex;
            int i11 = this.maxIndex;
            if (i10 > i11) {
                return -1;
            }
            while (!C3862t.b(C0841u.this.values[i10], element)) {
                if (i10 == i11) {
                    return -1;
                }
                i10++;
            }
            return i10 - this.minIndex;
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof i.c) {
                return w((i.c) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator<i.c> listIterator() {
            C0841u c0841u = C0841u.this;
            int i10 = this.minIndex;
            return c0841u.new a(i10, i10, this.maxIndex);
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ i.c remove(int i10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator<i.c> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ i.c set(int i10, i.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return i();
        }

        @Override // java.util.List
        public void sort(Comparator<? super i.c> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public List<i.c> subList(int fromIndex, int toIndex) {
            C0841u c0841u = C0841u.this;
            int i10 = this.minIndex;
            return c0841u.new b(fromIndex + i10, i10 + toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return C3853j.a(this);
        }

        public int w(i.c element) {
            int i10 = this.maxIndex;
            int i11 = this.minIndex;
            if (i11 > i10) {
                return -1;
            }
            while (!C3862t.b(C0841u.this.values[i10], element)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.minIndex;
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends i.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public ListIterator<i.c> listIterator(int index) {
            C0841u c0841u = C0841u.this;
            int i10 = this.minIndex;
            return c0841u.new a(index + i10, i10, this.maxIndex);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) C3853j.b(this, tArr);
        }
    }

    private final void J() {
        int i10 = this.hitDepth + 1;
        int iO = kotlin.collections.r.o(this);
        if (i10 <= iO) {
            while (true) {
                this.values[i10] = null;
                if (i10 == iO) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.size = this.hitDepth + 1;
    }

    private final void x() {
        int i10 = this.hitDepth;
        Object[] objArr = this.values;
        if (i10 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
            C3862t.f(objArrCopyOf, "copyOf(this, newSize)");
            this.values = objArrCopyOf;
            long[] jArrCopyOf = Arrays.copyOf(this.distanceFromEdgeAndInLayer, length);
            C3862t.f(jArrCopyOf, "copyOf(this, newSize)");
            this.distanceFromEdgeAndInLayer = jArrCopyOf;
        }
    }

    private final long y() {
        long jA = C0842v.a(Float.POSITIVE_INFINITY, false);
        int i10 = this.hitDepth + 1;
        int iO = kotlin.collections.r.o(this);
        if (i10 <= iO) {
            while (true) {
                long jB = C0838q.b(this.distanceFromEdgeAndInLayer[i10]);
                if (C0838q.a(jB, jA) < 0) {
                    jA = jB;
                }
                if (C0838q.c(jA) < 0.0f && C0838q.d(jA)) {
                    return jA;
                }
                if (i10 == iO) {
                    break;
                }
                i10++;
            }
        }
        return jA;
    }

    /* renamed from: A, reason: from getter */
    public final boolean getShouldSharePointerInputWithSibling() {
        return this.shouldSharePointerInputWithSibling;
    }

    /* renamed from: B, reason: from getter */
    public int getSize() {
        return this.size;
    }

    public final boolean D() {
        long jY = y();
        return C0838q.c(jY) < 0.0f && C0838q.d(jY);
    }

    public final void E(i.c node, boolean isInLayer, Ba.a<C4153F> childHitTest) {
        F(node, -1.0f, isInLayer, childHitTest);
        AbstractC0823c0 coordinator = node.getCoordinator();
        if (coordinator == null || coordinator.Z2()) {
            return;
        }
        this.shouldSharePointerInputWithSibling = false;
    }

    public final void F(i.c node, float distanceFromEdge, boolean isInLayer, Ba.a<C4153F> childHitTest) {
        int i10 = this.hitDepth;
        this.hitDepth = i10 + 1;
        x();
        Object[] objArr = this.values;
        int i11 = this.hitDepth;
        objArr[i11] = node;
        this.distanceFromEdgeAndInLayer[i11] = C0842v.a(distanceFromEdge, isInLayer);
        J();
        childHitTest.invoke();
        this.hitDepth = i10;
    }

    public int G(i.c element) {
        int iO = kotlin.collections.r.o(this);
        if (iO < 0) {
            return -1;
        }
        int i10 = 0;
        while (!C3862t.b(this.values[i10], element)) {
            if (i10 == iO) {
                return -1;
            }
            i10++;
        }
        return i10;
    }

    public final boolean H(float distanceFromEdge, boolean isInLayer) {
        if (this.hitDepth == kotlin.collections.r.o(this)) {
            return true;
        }
        return C0838q.a(y(), C0842v.a(distanceFromEdge, isInLayer)) > 0;
    }

    public int I(i.c element) {
        for (int iO = kotlin.collections.r.o(this); -1 < iO; iO--) {
            if (C3862t.b(this.values[iO], element)) {
                return iO;
            }
        }
        return -1;
    }

    public final void K(i.c node, float distanceFromEdge, boolean isInLayer, Ba.a<C4153F> childHitTest) {
        if (this.hitDepth == kotlin.collections.r.o(this)) {
            F(node, distanceFromEdge, isInLayer, childHitTest);
            if (this.hitDepth + 1 == kotlin.collections.r.o(this)) {
                J();
                return;
            }
            return;
        }
        long jY = y();
        int i10 = this.hitDepth;
        this.hitDepth = kotlin.collections.r.o(this);
        F(node, distanceFromEdge, isInLayer, childHitTest);
        if (this.hitDepth + 1 < kotlin.collections.r.o(this) && C0838q.a(jY, y()) > 0) {
            int i11 = this.hitDepth + 1;
            int i12 = i10 + 1;
            Object[] objArr = this.values;
            C3831l.l(objArr, objArr, i12, i11, size());
            long[] jArr = this.distanceFromEdgeAndInLayer;
            C3831l.k(jArr, jArr, i12, i11, size());
            this.hitDepth = ((size() + i10) - this.hitDepth) - 1;
        }
        J();
        this.hitDepth = i10;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, i.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends i.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void c() {
        this.hitDepth = size() - 1;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.hitDepth = -1;
        J();
        this.shouldSharePointerInputWithSibling = true;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i.c) {
            return w((i.c) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains((i.c) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof i.c) {
            return G((i.c) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<i.c> iterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof i.c) {
            return I((i.c) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<i.c> listIterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ i.c remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<i.c> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ i.c set(int i10, i.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super i.c> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<i.c> subList(int fromIndex, int toIndex) {
        return new b(fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return C3853j.a(this);
    }

    public boolean w(i.c element) {
        return indexOf(element) != -1;
    }

    @Override // java.util.List
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public i.c get(int index) {
        Object obj = this.values[index];
        C3862t.e(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (i.c) obj;
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends i.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator<i.c> listIterator(int index) {
        return new a(this, index, 0, 0, 6, null);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) C3853j.b(this, tArr);
    }

    /* compiled from: HitTestResult.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0010R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"LA0/u$a;", "", "Lb0/i$c;", "", "index", "minIndex", "maxIndex", "<init>", "(LA0/u;III)V", "", "hasNext", "()Z", "hasPrevious", "b", "()Lb0/i$c;", "nextIndex", "()I", "d", "previousIndex", "B", "I", "getIndex", "setIndex", "(I)V", "C", "getMinIndex", "D", "getMaxIndex", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A0.u$a */
    private final class a implements ListIterator<i.c>, Ca.a {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private final int minIndex;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private final int maxIndex;

        public a(int i10, int i11, int i12) {
            this.index = i10;
            this.minIndex = i11;
            this.maxIndex = i12;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(i.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i.c next() {
            Object[] objArr = C0841u.this.values;
            int i10 = this.index;
            this.index = i10 + 1;
            Object obj = objArr[i10];
            C3862t.e(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (i.c) obj;
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public i.c previous() {
            Object[] objArr = C0841u.this.values;
            int i10 = this.index - 1;
            this.index = i10;
            Object obj = objArr[i10];
            C3862t.e(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (i.c) obj;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.maxIndex;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > this.minIndex;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index - this.minIndex;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.index - this.minIndex) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(i.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ a(C0841u c0841u, int i10, int i11, int i12, int i13, C3854k c3854k) {
            this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? c0841u.size() : i12);
        }
    }
}
