package Rb;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.AbstractC3827h;
import kotlin.collections.C3831l;
import kotlin.collections.V;
import kotlin.jvm.internal.C3846c;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.W;

/* compiled from: SmartSet.kt */
/* loaded from: classes3.dex */
public final class l<T> extends AbstractC3827h<T> {

    /* renamed from: D, reason: collision with root package name */
    public static final b f15221D = new b(null);

    /* renamed from: B, reason: collision with root package name */
    private Object f15222B;

    /* renamed from: C, reason: collision with root package name */
    private int f15223C;

    /* compiled from: SmartSet.kt */
    private static final class a<T> implements Iterator<T>, Ca.a {

        /* renamed from: B, reason: collision with root package name */
        private final Iterator<T> f15224B;

        public a(T[] array) {
            C3862t.g(array, "array");
            this.f15224B = C3846c.a(array);
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f15224B.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f15224B.next();
        }
    }

    /* compiled from: SmartSet.kt */
    public static final class b {
        public /* synthetic */ b(C3854k c3854k) {
            this();
        }

        public final <T> l<T> a() {
            return new l<>(null);
        }

        public final <T> l<T> b(Collection<? extends T> set) {
            C3862t.g(set, "set");
            l<T> lVar = new l<>(null);
            lVar.addAll(set);
            return lVar;
        }

        private b() {
        }
    }

    /* compiled from: SmartSet.kt */
    private static final class c<T> implements Iterator<T>, Ca.a {

        /* renamed from: B, reason: collision with root package name */
        private final T f15225B;

        /* renamed from: C, reason: collision with root package name */
        private boolean f15226C = true;

        public c(T t10) {
            this.f15225B = t10;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f15226C;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f15226C) {
                throw new NoSuchElementException();
            }
            this.f15226C = false;
            return this.f15225B;
        }
    }

    public /* synthetic */ l(C3854k c3854k) {
        this();
    }

    public static final <T> l<T> h() {
        return f15221D.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t10) {
        Object[] objArr;
        if (size() == 0) {
            this.f15222B = t10;
        } else if (size() == 1) {
            if (C3862t.b(this.f15222B, t10)) {
                return false;
            }
            this.f15222B = new Object[]{this.f15222B, t10};
        } else if (size() < 5) {
            Object obj = this.f15222B;
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr2 = (Object[]) obj;
            if (C3831l.S(objArr2, t10)) {
                return false;
            }
            if (size() == 4) {
                ?? E10 = V.e(Arrays.copyOf(objArr2, objArr2.length));
                E10.add(t10);
                objArr = E10;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, size() + 1);
                C3862t.f(objArrCopyOf, "copyOf(...)");
                objArrCopyOf[objArrCopyOf.length - 1] = t10;
                objArr = objArrCopyOf;
            }
            this.f15222B = objArr;
        } else {
            Object obj2 = this.f15222B;
            C3862t.e(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!W.e(obj2).add(t10)) {
                return false;
            }
        }
        i(size() + 1);
        return true;
    }

    @Override // kotlin.collections.AbstractC3827h
    public int c() {
        return this.f15223C;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f15222B = null;
        i(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return C3862t.b(this.f15222B, obj);
        }
        if (size() < 5) {
            Object obj2 = this.f15222B;
            C3862t.e(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return C3831l.S((Object[]) obj2, obj);
        }
        Object obj3 = this.f15222B;
        C3862t.e(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    public void i(int i10) {
        this.f15223C = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.emptySet().iterator();
        }
        if (size() == 1) {
            return new c(this.f15222B);
        }
        if (size() < 5) {
            Object obj = this.f15222B;
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new a((Object[]) obj);
        }
        Object obj2 = this.f15222B;
        C3862t.e(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return W.e(obj2).iterator();
    }

    private l() {
    }
}
