package m8;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import l8.C3918k;

/* compiled from: CompactHashMap.java */
/* renamed from: m8.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C3996k<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: K, reason: collision with root package name */
    private static final Object f45340K = new Object();

    /* renamed from: B, reason: collision with root package name */
    private transient Object f45341B;

    /* renamed from: C, reason: collision with root package name */
    transient int[] f45342C;

    /* renamed from: D, reason: collision with root package name */
    transient Object[] f45343D;

    /* renamed from: E, reason: collision with root package name */
    transient Object[] f45344E;

    /* renamed from: F, reason: collision with root package name */
    private transient int f45345F;

    /* renamed from: G, reason: collision with root package name */
    private transient int f45346G;

    /* renamed from: H, reason: collision with root package name */
    private transient Set<K> f45347H;

    /* renamed from: I, reason: collision with root package name */
    private transient Set<Map.Entry<K, V>> f45348I;

    /* renamed from: J, reason: collision with root package name */
    private transient Collection<V> f45349J;

    /* compiled from: CompactHashMap.java */
    /* renamed from: m8.k$a */
    class a extends C3996k<K, V>.e<K> {
        a() {
            super(C3996k.this, null);
        }

        @Override // m8.C3996k.e
        K d(int i10) {
            return (K) C3996k.this.L(i10);
        }
    }

    /* compiled from: CompactHashMap.java */
    /* renamed from: m8.k$b */
    class b extends C3996k<K, V>.e<Map.Entry<K, V>> {
        b() {
            super(C3996k.this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // m8.C3996k.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> d(int i10) {
            return new g(i10);
        }
    }

    /* compiled from: CompactHashMap.java */
    /* renamed from: m8.k$c */
    class c extends C3996k<K, V>.e<V> {
        c() {
            super(C3996k.this, null);
        }

        @Override // m8.C3996k.e
        V d(int i10) {
            return (V) C3996k.this.b0(i10);
        }
    }

    /* compiled from: CompactHashMap.java */
    /* renamed from: m8.k$d */
    class d extends AbstractSet<Map.Entry<K, V>> {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C3996k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map<K, V> mapB = C3996k.this.B();
            if (mapB != null) {
                return mapB.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int I10 = C3996k.this.I(entry.getKey());
            return I10 != -1 && C3918k.a(C3996k.this.b0(I10), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return C3996k.this.D();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> mapB = C3996k.this.B();
            if (mapB != null) {
                return mapB.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (C3996k.this.O()) {
                return false;
            }
            int iG = C3996k.this.G();
            int iF = C3997l.f(entry.getKey(), entry.getValue(), iG, C3996k.this.S(), C3996k.this.Q(), C3996k.this.R(), C3996k.this.T());
            if (iF == -1) {
                return false;
            }
            C3996k.this.N(iF, iG);
            C3996k.g(C3996k.this);
            C3996k.this.H();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C3996k.this.size();
        }
    }

    /* compiled from: CompactHashMap.java */
    /* renamed from: m8.k$f */
    class f extends AbstractSet<K> {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C3996k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C3996k.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return C3996k.this.M();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> mapB = C3996k.this.B();
            return mapB != null ? mapB.keySet().remove(obj) : C3996k.this.P(obj) != C3996k.f45340K;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C3996k.this.size();
        }
    }

    /* compiled from: CompactHashMap.java */
    /* renamed from: m8.k$g */
    final class g extends AbstractC3990e<K, V> {

        /* renamed from: B, reason: collision with root package name */
        private final K f45359B;

        /* renamed from: C, reason: collision with root package name */
        private int f45360C;

        g(int i10) {
            this.f45359B = (K) C3996k.this.L(i10);
            this.f45360C = i10;
        }

        private void a() {
            int i10 = this.f45360C;
            if (i10 == -1 || i10 >= C3996k.this.size() || !C3918k.a(this.f45359B, C3996k.this.L(this.f45360C))) {
                this.f45360C = C3996k.this.I(this.f45359B);
            }
        }

        @Override // m8.AbstractC3990e, java.util.Map.Entry
        public K getKey() {
            return this.f45359B;
        }

        @Override // m8.AbstractC3990e, java.util.Map.Entry
        public V getValue() {
            Map<K, V> mapB = C3996k.this.B();
            if (mapB != null) {
                return (V) S.a(mapB.get(this.f45359B));
            }
            a();
            int i10 = this.f45360C;
            return i10 == -1 ? (V) S.b() : (V) C3996k.this.b0(i10);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            Map<K, V> mapB = C3996k.this.B();
            if (mapB != null) {
                return (V) S.a(mapB.put(this.f45359B, v10));
            }
            a();
            int i10 = this.f45360C;
            if (i10 == -1) {
                C3996k.this.put(this.f45359B, v10);
                return (V) S.b();
            }
            V v11 = (V) C3996k.this.b0(i10);
            C3996k.this.a0(this.f45360C, v10);
            return v11;
        }
    }

    /* compiled from: CompactHashMap.java */
    /* renamed from: m8.k$h */
    class h extends AbstractCollection<V> {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C3996k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return C3996k.this.c0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return C3996k.this.size();
        }
    }

    C3996k(int i10) {
        J(i10);
    }

    public static <K, V> C3996k<K, V> A(int i10) {
        return new C3996k<>(i10);
    }

    private int C(int i10) {
        return Q()[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int G() {
        return (1 << (this.f45345F & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int I(Object obj) {
        if (O()) {
            return -1;
        }
        int iC = C4006v.c(obj);
        int iG = G();
        int iH = C3997l.h(S(), iC & iG);
        if (iH == 0) {
            return -1;
        }
        int iB = C3997l.b(iC, iG);
        do {
            int i10 = iH - 1;
            int iC2 = C(i10);
            if (C3997l.b(iC2, iG) == iB && C3918k.a(obj, L(i10))) {
                return i10;
            }
            iH = C3997l.c(iC2, iG);
        } while (iH != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public K L(int i10) {
        return (K) R()[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object P(Object obj) {
        if (O()) {
            return f45340K;
        }
        int iG = G();
        int iF = C3997l.f(obj, null, iG, S(), Q(), R(), null);
        if (iF == -1) {
            return f45340K;
        }
        V vB0 = b0(iF);
        N(iF, iG);
        this.f45346G--;
        H();
        return vB0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] Q() {
        int[] iArr = this.f45342C;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] R() {
        Object[] objArr = this.f45343D;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object S() {
        Object obj = this.f45341B;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] T() {
        Object[] objArr = this.f45344E;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private void V(int i10) {
        int iMin;
        int length = Q().length;
        if (i10 <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        U(iMin);
    }

    private int W(int i10, int i11, int i12, int i13) {
        Object objA = C3997l.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            C3997l.i(objA, i12 & i14, i13 + 1);
        }
        Object objS = S();
        int[] iArrQ = Q();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iH = C3997l.h(objS, i15);
            while (iH != 0) {
                int i16 = iH - 1;
                int i17 = iArrQ[i16];
                int iB = C3997l.b(i17, i10) | i15;
                int i18 = iB & i14;
                int iH2 = C3997l.h(objA, i18);
                C3997l.i(objA, i18, iH);
                iArrQ[i16] = C3997l.d(iB, iH2, i14);
                iH = C3997l.c(i17, i10);
            }
        }
        this.f45341B = objA;
        Y(i14);
        return i14;
    }

    private void X(int i10, int i11) {
        Q()[i10] = i11;
    }

    private void Y(int i10) {
        this.f45345F = C3997l.d(this.f45345F, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    private void Z(int i10, K k10) {
        R()[i10] = k10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(int i10, V v10) {
        T()[i10] = v10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V b0(int i10) {
        return (V) T()[i10];
    }

    static /* synthetic */ int g(C3996k c3996k) {
        int i10 = c3996k.f45346G;
        c3996k.f45346G = i10 - 1;
        return i10;
    }

    Map<K, V> B() {
        Object obj = this.f45341B;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    Iterator<Map.Entry<K, V>> D() {
        Map<K, V> mapB = B();
        return mapB != null ? mapB.entrySet().iterator() : new b();
    }

    int E() {
        return isEmpty() ? -1 : 0;
    }

    int F(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f45346G) {
            return i11;
        }
        return -1;
    }

    void H() {
        this.f45345F += 32;
    }

    void J(int i10) {
        l8.m.e(i10 >= 0, "Expected size must be >= 0");
        this.f45345F = p8.f.e(i10, 1, 1073741823);
    }

    void K(int i10, K k10, V v10, int i11, int i12) {
        X(i10, C3997l.d(i11, 0, i12));
        Z(i10, k10);
        a0(i10, v10);
    }

    Iterator<K> M() {
        Map<K, V> mapB = B();
        return mapB != null ? mapB.keySet().iterator() : new a();
    }

    void N(int i10, int i11) {
        Object objS = S();
        int[] iArrQ = Q();
        Object[] objArrR = R();
        Object[] objArrT = T();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrR[i10] = null;
            objArrT[i10] = null;
            iArrQ[i10] = 0;
            return;
        }
        Object obj = objArrR[i12];
        objArrR[i10] = obj;
        objArrT[i10] = objArrT[i12];
        objArrR[i12] = null;
        objArrT[i12] = null;
        iArrQ[i10] = iArrQ[i12];
        iArrQ[i12] = 0;
        int iC = C4006v.c(obj) & i11;
        int iH = C3997l.h(objS, iC);
        if (iH == size) {
            C3997l.i(objS, iC, i10 + 1);
            return;
        }
        while (true) {
            int i13 = iH - 1;
            int i14 = iArrQ[i13];
            int iC2 = C3997l.c(i14, i11);
            if (iC2 == size) {
                iArrQ[i13] = C3997l.d(i14, i10 + 1, i11);
                return;
            }
            iH = iC2;
        }
    }

    boolean O() {
        return this.f45341B == null;
    }

    void U(int i10) {
        this.f45342C = Arrays.copyOf(Q(), i10);
        this.f45343D = Arrays.copyOf(R(), i10);
        this.f45344E = Arrays.copyOf(T(), i10);
    }

    Iterator<V> c0() {
        Map<K, V> mapB = B();
        return mapB != null ? mapB.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (O()) {
            return;
        }
        H();
        Map<K, V> mapB = B();
        if (mapB != null) {
            this.f45345F = p8.f.e(size(), 3, 1073741823);
            mapB.clear();
            this.f45341B = null;
            this.f45346G = 0;
            return;
        }
        Arrays.fill(R(), 0, this.f45346G, (Object) null);
        Arrays.fill(T(), 0, this.f45346G, (Object) null);
        C3997l.g(S());
        Arrays.fill(Q(), 0, this.f45346G, 0);
        this.f45346G = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map<K, V> mapB = B();
        return mapB != null ? mapB.containsKey(obj) : I(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map<K, V> mapB = B();
        if (mapB != null) {
            return mapB.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f45346G; i10++) {
            if (C3918k.a(obj, b0(i10))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f45348I;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setW = w();
        this.f45348I = setW;
        return setW;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Map<K, V> mapB = B();
        if (mapB != null) {
            return mapB.get(obj);
        }
        int I10 = I(obj);
        if (I10 == -1) {
            return null;
        }
        p(I10);
        return b0(I10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f45347H;
        if (set != null) {
            return set;
        }
        Set<K> setY = y();
        this.f45347H = setY;
        return setY;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        int iW;
        int i10;
        if (O()) {
            s();
        }
        Map<K, V> mapB = B();
        if (mapB != null) {
            return mapB.put(k10, v10);
        }
        int[] iArrQ = Q();
        Object[] objArrR = R();
        Object[] objArrT = T();
        int i11 = this.f45346G;
        int i12 = i11 + 1;
        int iC = C4006v.c(k10);
        int iG = G();
        int i13 = iC & iG;
        int iH = C3997l.h(S(), i13);
        if (iH != 0) {
            int iB = C3997l.b(iC, iG);
            int i14 = 0;
            while (true) {
                int i15 = iH - 1;
                int i16 = iArrQ[i15];
                if (C3997l.b(i16, iG) == iB && C3918k.a(k10, objArrR[i15])) {
                    V v11 = (V) objArrT[i15];
                    objArrT[i15] = v10;
                    p(i15);
                    return v11;
                }
                int iC2 = C3997l.c(i16, iG);
                i14++;
                if (iC2 != 0) {
                    iH = iC2;
                } else {
                    if (i14 >= 9) {
                        return u().put(k10, v10);
                    }
                    if (i12 > iG) {
                        iW = W(iG, C3997l.e(iG), iC, i11);
                    } else {
                        iArrQ[i15] = C3997l.d(i16, i12, iG);
                    }
                }
            }
            i10 = iG;
        } else if (i12 > iG) {
            iW = W(iG, C3997l.e(iG), iC, i11);
            i10 = iW;
        } else {
            C3997l.i(S(), i13, i12);
            i10 = iG;
        }
        V(i12);
        K(i11, k10, v10, iC, i10);
        this.f45346G = i12;
        H();
        return null;
    }

    int q(int i10, int i11) {
        return i10 - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Map<K, V> mapB = B();
        if (mapB != null) {
            return mapB.remove(obj);
        }
        V v10 = (V) P(obj);
        if (v10 == f45340K) {
            return null;
        }
        return v10;
    }

    int s() {
        l8.m.r(O(), "Arrays already allocated");
        int i10 = this.f45345F;
        int iJ = C3997l.j(i10);
        this.f45341B = C3997l.a(iJ);
        Y(iJ - 1);
        this.f45342C = new int[i10];
        this.f45343D = new Object[i10];
        this.f45344E = new Object[i10];
        return i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> mapB = B();
        return mapB != null ? mapB.size() : this.f45346G;
    }

    Map<K, V> u() {
        Map<K, V> mapX = x(G() + 1);
        int iE = E();
        while (iE >= 0) {
            mapX.put(L(iE), b0(iE));
            iE = F(iE);
        }
        this.f45341B = mapX;
        this.f45342C = null;
        this.f45343D = null;
        this.f45344E = null;
        H();
        return mapX;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f45349J;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionZ = z();
        this.f45349J = collectionZ;
        return collectionZ;
    }

    Set<Map.Entry<K, V>> w() {
        return new d();
    }

    Map<K, V> x(int i10) {
        return new LinkedHashMap(i10, 1.0f);
    }

    Set<K> y() {
        return new f();
    }

    Collection<V> z() {
        return new h();
    }

    /* compiled from: CompactHashMap.java */
    /* renamed from: m8.k$e */
    private abstract class e<T> implements Iterator<T> {

        /* renamed from: B, reason: collision with root package name */
        int f45354B;

        /* renamed from: C, reason: collision with root package name */
        int f45355C;

        /* renamed from: D, reason: collision with root package name */
        int f45356D;

        private e() {
            this.f45354B = C3996k.this.f45345F;
            this.f45355C = C3996k.this.E();
            this.f45356D = -1;
        }

        private void b() {
            if (C3996k.this.f45345F != this.f45354B) {
                throw new ConcurrentModificationException();
            }
        }

        abstract T d(int i10);

        void e() {
            this.f45354B += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f45355C >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            b();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f45355C;
            this.f45356D = i10;
            T tD = d(i10);
            this.f45355C = C3996k.this.F(this.f45355C);
            return tD;
        }

        @Override // java.util.Iterator
        public void remove() {
            b();
            C3994i.c(this.f45356D >= 0);
            e();
            C3996k c3996k = C3996k.this;
            c3996k.remove(c3996k.L(this.f45356D));
            this.f45355C = C3996k.this.q(this.f45355C, this.f45356D);
            this.f45356D = -1;
        }

        /* synthetic */ e(C3996k c3996k, a aVar) {
            this();
        }
    }

    void p(int i10) {
    }
}
