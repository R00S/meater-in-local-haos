package Q;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.collections.r;
import kotlin.jvm.internal.C3853j;
import kotlin.jvm.internal.C3862t;

/* compiled from: MutableVector.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0003\u0010N\fB!\b\u0001\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u000f¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\"\u0010\rJ\u001b\u0010#\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b#\u0010\u001cJ\u0015\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00028\u0000¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u000b¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u000b¢\u0006\u0004\b-\u0010,J\r\u0010.\u001a\u00028\u0000¢\u0006\u0004\b.\u0010(J\u0015\u0010/\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b/\u0010*J\u0015\u00100\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b0\u0010\rJ\u001b\u00101\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b1\u0010\u001cJ\u0015\u00102\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b2\u00103J\u001d\u00106\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0006¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u0006H\u0001¢\u0006\u0004\b9\u0010&J\u001b\u0010:\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b:\u0010\u001cJ \u0010;\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b;\u0010<J%\u0010@\u001a\u00020\u000f2\u0016\u0010?\u001a\u0012\u0012\u0004\u0012\u00028\u00000=j\b\u0012\u0004\u0012\u00028\u0000`>¢\u0006\u0004\b@\u0010AR0\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b0\u0010B\u0012\u0004\bG\u0010!\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001e\u0010J\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR$\u0010\u0007\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b1\u00109\u001a\u0004\bL\u0010M¨\u0006O"}, d2 = {"LQ/b;", "T", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "content", "", "size", "<init>", "([Ljava/lang/Object;I)V", "element", "", "c", "(Ljava/lang/Object;)Z", "index", "Loa/F;", "a", "(ILjava/lang/Object;)V", "", "elements", "h", "(ILjava/util/List;)Z", "e", "(ILQ/b;)Z", "", "f", "(ILjava/util/Collection;)Z", "i", "(Ljava/util/Collection;)Z", "", "j", "()Ljava/util/List;", "l", "()V", "m", "o", "capacity", "p", "(I)V", "r", "()Ljava/lang/Object;", "w", "(Ljava/lang/Object;)I", "x", "()Z", "y", "z", "A", "B", "D", "E", "(I)Ljava/lang/Object;", "start", "end", "F", "(II)V", "newSize", "I", "G", "H", "(ILjava/lang/Object;)Ljava/lang/Object;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "J", "(Ljava/util/Comparator;)V", "[Ljava/lang/Object;", "t", "()[Ljava/lang/Object;", "setContent", "([Ljava/lang/Object;)V", "getContent$annotations", "C", "Ljava/util/List;", "list", "<set-?>", "v", "()I", "b", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b<T> implements RandomAccess {

    /* renamed from: E, reason: collision with root package name */
    public static final int f14177E = 8;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private T[] content;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private List<T> list;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* compiled from: MutableVector.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0013\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\nJ\u001f\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001dJ%\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\u001e\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u000eJ\u000f\u0010 \u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010%J\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b&\u0010\nJ\u001d\u0010'\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b'\u0010\u000eJ\u0017\u0010(\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b(\u0010\u0012J\u001d\u0010)\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b)\u0010\u000eJ \u0010*\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b*\u0010+J%\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000fH\u0016¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"LQ/b$a;", "T", "", "LQ/b;", "vector", "<init>", "(LQ/b;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "Loa/F;", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "h", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "B", "LQ/b;", "c", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a<T> implements List<T>, Ca.d {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final b<T> vector;

        public a(b<T> bVar) {
            this.vector = bVar;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T element) {
            return this.vector.c(element);
        }

        @Override // java.util.List
        public boolean addAll(int index, Collection<? extends T> elements) {
            return this.vector.f(index, elements);
        }

        public int c() {
            return this.vector.getSize();
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.vector.l();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            return this.vector.m(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            return this.vector.o(elements);
        }

        @Override // java.util.List
        public T get(int index) {
            Q.c.c(this, index);
            return this.vector.t()[index];
        }

        public T h(int index) {
            Q.c.c(this, index);
            return this.vector.E(index);
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            return this.vector.w(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.vector.x();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            return this.vector.A(element);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i10) {
            return h(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            return this.vector.D(elements);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            return this.vector.G(elements);
        }

        @Override // java.util.List
        public T set(int index, T element) {
            Q.c.c(this, index);
            return this.vector.H(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return c();
        }

        @Override // java.util.List
        public List<T> subList(int fromIndex, int toIndex) {
            Q.c.d(this, fromIndex, toIndex);
            return new C0210b(this, fromIndex, toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return C3853j.a(this);
        }

        @Override // java.util.List
        public void add(int index, T element) {
            this.vector.a(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            return this.vector.i(elements);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int index) {
            return new c(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            return this.vector.B(element);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) C3853j.b(this, tArr);
        }
    }

    /* compiled from: MutableVector.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0016\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u0015J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\fJ\u001f\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ%\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u001f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u001f\u0010\u0010J\u000f\u0010!\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#H\u0016¢\u0006\u0004\b$\u0010%J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#2\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010&J\u0017\u0010'\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b'\u0010\fJ\u001d\u0010(\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b(\u0010\u0010J\u0017\u0010)\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010\u0013J\u001d\u0010*\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b*\u0010\u0010J \u0010+\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b+\u0010,J%\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u00100R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0014\u00108\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"LQ/b$b;", "T", "", "list", "", "start", "end", "<init>", "(Ljava/util/List;II)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "Loa/F;", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "h", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "B", "Ljava/util/List;", "C", "I", "D", "c", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: Q.b$b, reason: collision with other inner class name */
    private static final class C0210b<T> implements List<T>, Ca.d {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final List<T> list;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private final int start;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private int end;

        public C0210b(List<T> list, int i10, int i11) {
            this.list = list;
            this.start = i10;
            this.end = i11;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T element) {
            List<T> list = this.list;
            int i10 = this.end;
            this.end = i10 + 1;
            list.add(i10, element);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int index, Collection<? extends T> elements) {
            this.list.addAll(index + this.start, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }

        public int c() {
            return this.end - this.start;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i10 = this.end - 1;
            int i11 = this.start;
            if (i11 <= i10) {
                while (true) {
                    this.list.remove(i10);
                    if (i10 == i11) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            int i10 = this.end;
            for (int i11 = this.start; i11 < i10; i11++) {
                if (C3862t.b(this.list.get(i11), element)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int index) {
            Q.c.c(this, index);
            return this.list.get(index + this.start);
        }

        public T h(int index) {
            Q.c.c(this, index);
            this.end--;
            return this.list.remove(index + this.start);
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            int i10 = this.end;
            for (int i11 = this.start; i11 < i10; i11++) {
                if (C3862t.b(this.list.get(i11), element)) {
                    return i11 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.end == this.start;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            int i10 = this.end - 1;
            int i11 = this.start;
            if (i11 > i10) {
                return -1;
            }
            while (!C3862t.b(this.list.get(i10), element)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.start;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i10) {
            return h(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            int i10 = this.end;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i10 != this.end;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            int i10 = this.end;
            int i11 = i10 - 1;
            int i12 = this.start;
            if (i12 <= i11) {
                while (true) {
                    if (!elements.contains(this.list.get(i11))) {
                        this.list.remove(i11);
                        this.end--;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            return i10 != this.end;
        }

        @Override // java.util.List
        public T set(int index, T element) {
            Q.c.c(this, index);
            return this.list.set(index + this.start, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return c();
        }

        @Override // java.util.List
        public List<T> subList(int fromIndex, int toIndex) {
            Q.c.d(this, fromIndex, toIndex);
            return new C0210b(this, fromIndex, toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return C3853j.a(this);
        }

        @Override // java.util.List
        public void add(int index, T element) {
            this.list.add(index + this.start, element);
            this.end++;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int index) {
            return new c(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            int i10 = this.end;
            for (int i11 = this.start; i11 < i10; i11++) {
                if (C3862t.b(this.list.get(i11), element)) {
                    this.list.remove(i11);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) C3853j.b(this, tArr);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            this.list.addAll(this.end, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }
    }

    /* compiled from: MutableVector.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LQ/b$c;", "T", "", "", "list", "", "index", "<init>", "(Ljava/util/List;I)V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "Loa/F;", "remove", "()V", "hasPrevious", "nextIndex", "()I", "previous", "previousIndex", "element", "add", "(Ljava/lang/Object;)V", "set", "B", "Ljava/util/List;", "C", "I", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c<T> implements ListIterator<T>, Ca.a {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final List<T> list;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private int index;

        public c(List<T> list, int i10) {
            this.list = list;
            this.index = i10;
        }

        @Override // java.util.ListIterator
        public void add(T element) {
            this.list.add(this.index, element);
            this.index++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.list.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i10 = this.index;
            this.index = i10 + 1;
            return list.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i10 = this.index - 1;
            this.index = i10;
            return this.list.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i10 = this.index - 1;
            this.index = i10;
            this.list.remove(i10);
        }

        @Override // java.util.ListIterator
        public void set(T element) {
            this.list.set(this.index, element);
        }
    }

    public b(T[] tArr, int i10) {
        this.content = tArr;
        this.size = i10;
    }

    public final int A(T element) {
        int i10 = this.size;
        if (i10 <= 0) {
            return -1;
        }
        int i11 = i10 - 1;
        T[] tArr = this.content;
        while (!C3862t.b(element, tArr[i11])) {
            i11--;
            if (i11 < 0) {
                return -1;
            }
        }
        return i11;
    }

    public final boolean B(T element) {
        int iW = w(element);
        if (iW < 0) {
            return false;
        }
        E(iW);
        return true;
    }

    public final boolean D(Collection<? extends T> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        int i10 = this.size;
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            B(it.next());
        }
        return i10 != this.size;
    }

    public final T E(int index) {
        T[] tArr = this.content;
        T t10 = tArr[index];
        if (index != getSize() - 1) {
            C3831l.l(tArr, tArr, index, index + 1, this.size);
        }
        int i10 = this.size - 1;
        this.size = i10;
        tArr[i10] = null;
        return t10;
    }

    public final void F(int start, int end) {
        if (end > start) {
            int i10 = this.size;
            if (end < i10) {
                T[] tArr = this.content;
                C3831l.l(tArr, tArr, start, end, i10);
            }
            int i11 = this.size - (end - start);
            int size = getSize() - 1;
            if (i11 <= size) {
                int i12 = i11;
                while (true) {
                    this.content[i12] = null;
                    if (i12 == size) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.size = i11;
        }
    }

    public final boolean G(Collection<? extends T> elements) {
        int i10 = this.size;
        for (int size = getSize() - 1; -1 < size; size--) {
            if (!elements.contains(t()[size])) {
                E(size);
            }
        }
        return i10 != this.size;
    }

    public final T H(int index, T element) {
        T[] tArr = this.content;
        T t10 = tArr[index];
        tArr[index] = element;
        return t10;
    }

    public final void I(int newSize) {
        this.size = newSize;
    }

    public final void J(Comparator<T> comparator) {
        C3831l.I(this.content, comparator, 0, this.size);
    }

    public final void a(int index, T element) {
        p(this.size + 1);
        T[] tArr = this.content;
        int i10 = this.size;
        if (index != i10) {
            C3831l.l(tArr, tArr, index + 1, index, i10);
        }
        tArr[index] = element;
        this.size++;
    }

    public final boolean c(T element) {
        p(this.size + 1);
        T[] tArr = this.content;
        int i10 = this.size;
        tArr[i10] = element;
        this.size = i10 + 1;
        return true;
    }

    public final boolean e(int index, b<T> elements) {
        if (elements.x()) {
            return false;
        }
        p(this.size + elements.size);
        T[] tArr = this.content;
        int i10 = this.size;
        if (index != i10) {
            C3831l.l(tArr, tArr, elements.size + index, index, i10);
        }
        C3831l.l(elements.content, tArr, index, 0, elements.size);
        this.size += elements.size;
        return true;
    }

    public final boolean f(int index, Collection<? extends T> elements) {
        int i10 = 0;
        if (elements.isEmpty()) {
            return false;
        }
        p(this.size + elements.size());
        T[] tArr = this.content;
        if (index != this.size) {
            C3831l.l(tArr, tArr, elements.size() + index, index, this.size);
        }
        for (T t10 : elements) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                r.w();
            }
            tArr[i10 + index] = t10;
            i10 = i11;
        }
        this.size += elements.size();
        return true;
    }

    public final boolean h(int index, List<? extends T> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        p(this.size + elements.size());
        T[] tArr = this.content;
        if (index != this.size) {
            C3831l.l(tArr, tArr, elements.size() + index, index, this.size);
        }
        int size = elements.size();
        for (int i10 = 0; i10 < size; i10++) {
            tArr[index + i10] = elements.get(i10);
        }
        this.size += elements.size();
        return true;
    }

    public final boolean i(Collection<? extends T> elements) {
        return f(this.size, elements);
    }

    public final List<T> j() {
        List<T> list = this.list;
        if (list != null) {
            return list;
        }
        a aVar = new a(this);
        this.list = aVar;
        return aVar;
    }

    public final void l() {
        T[] tArr = this.content;
        int size = getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                this.size = 0;
                return;
            }
            tArr[size] = null;
        }
    }

    public final boolean m(T element) {
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i10 = 0; !C3862t.b(t()[i10], element); i10++) {
                if (i10 != size) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean o(Collection<? extends T> elements) {
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!m(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void p(int capacity) {
        T[] tArr = this.content;
        if (tArr.length < capacity) {
            T[] tArr2 = (T[]) Arrays.copyOf(tArr, Math.max(capacity, tArr.length * 2));
            C3862t.f(tArr2, "copyOf(this, newSize)");
            this.content = tArr2;
        }
    }

    public final T r() {
        if (x()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return t()[0];
    }

    public final T[] t() {
        return this.content;
    }

    /* renamed from: v, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final int w(T element) {
        int i10 = this.size;
        if (i10 <= 0) {
            return -1;
        }
        T[] tArr = this.content;
        int i11 = 0;
        while (!C3862t.b(element, tArr[i11])) {
            i11++;
            if (i11 >= i10) {
                return -1;
            }
        }
        return i11;
    }

    public final boolean x() {
        return this.size == 0;
    }

    public final boolean y() {
        return this.size != 0;
    }

    public final T z() {
        if (x()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return t()[getSize() - 1];
    }
}
