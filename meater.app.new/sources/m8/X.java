package m8;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import m8.AbstractC4010z;

/* compiled from: RegularImmutableMap.java */
/* loaded from: classes2.dex */
final class X<K, V> extends AbstractC4010z<K, V> {

    /* renamed from: I, reason: collision with root package name */
    static final AbstractC4010z<Object, Object> f45249I = new X(null, new Object[0], 0);

    /* renamed from: F, reason: collision with root package name */
    private final transient Object f45250F;

    /* renamed from: G, reason: collision with root package name */
    final transient Object[] f45251G;

    /* renamed from: H, reason: collision with root package name */
    private final transient int f45252H;

    /* compiled from: RegularImmutableMap.java */
    static class a<K, V> extends AbstractC3979B<Map.Entry<K, V>> {

        /* renamed from: D, reason: collision with root package name */
        private final transient AbstractC4010z<K, V> f45253D;

        /* renamed from: E, reason: collision with root package name */
        private final transient Object[] f45254E;

        /* renamed from: F, reason: collision with root package name */
        private final transient int f45255F;

        /* renamed from: G, reason: collision with root package name */
        private final transient int f45256G;

        /* compiled from: RegularImmutableMap.java */
        /* renamed from: m8.X$a$a, reason: collision with other inner class name */
        class C0610a extends AbstractC4009y<Map.Entry<K, V>> {
            C0610a() {
            }

            @Override // java.util.List
            /* renamed from: T, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> get(int i10) {
                l8.m.j(i10, a.this.f45256G);
                int i11 = i10 * 2;
                Object obj = a.this.f45254E[a.this.f45255F + i11];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f45254E[i11 + (a.this.f45255F ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // m8.AbstractC4007w
            public boolean r() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f45256G;
            }
        }

        a(AbstractC4010z<K, V> abstractC4010z, Object[] objArr, int i10, int i11) {
            this.f45253D = abstractC4010z;
            this.f45254E = objArr;
            this.f45255F = i10;
            this.f45256G = i11;
        }

        @Override // m8.AbstractC3979B
        AbstractC4009y<Map.Entry<K, V>> G() {
            return new C0610a();
        }

        @Override // m8.AbstractC4007w, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f45253D.get(key));
        }

        @Override // m8.AbstractC4007w
        int f(Object[] objArr, int i10) {
            return c().f(objArr, i10);
        }

        @Override // m8.AbstractC4007w
        boolean r() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f45256G;
        }

        @Override // m8.AbstractC3979B, m8.AbstractC4007w, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: v */
        public j0<Map.Entry<K, V>> iterator() {
            return c().iterator();
        }
    }

    /* compiled from: RegularImmutableMap.java */
    static final class b<K> extends AbstractC3979B<K> {

        /* renamed from: D, reason: collision with root package name */
        private final transient AbstractC4010z<K, ?> f45258D;

        /* renamed from: E, reason: collision with root package name */
        private final transient AbstractC4009y<K> f45259E;

        b(AbstractC4010z<K, ?> abstractC4010z, AbstractC4009y<K> abstractC4009y) {
            this.f45258D = abstractC4010z;
            this.f45259E = abstractC4009y;
        }

        @Override // m8.AbstractC3979B, m8.AbstractC4007w
        public AbstractC4009y<K> c() {
            return this.f45259E;
        }

        @Override // m8.AbstractC4007w, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f45258D.get(obj) != null;
        }

        @Override // m8.AbstractC4007w
        int f(Object[] objArr, int i10) {
            return c().f(objArr, i10);
        }

        @Override // m8.AbstractC4007w
        boolean r() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f45258D.size();
        }

        @Override // m8.AbstractC3979B, m8.AbstractC4007w, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: v */
        public j0<K> iterator() {
            return c().iterator();
        }
    }

    /* compiled from: RegularImmutableMap.java */
    static final class c extends AbstractC4009y<Object> {

        /* renamed from: D, reason: collision with root package name */
        private final transient Object[] f45260D;

        /* renamed from: E, reason: collision with root package name */
        private final transient int f45261E;

        /* renamed from: F, reason: collision with root package name */
        private final transient int f45262F;

        c(Object[] objArr, int i10, int i11) {
            this.f45260D = objArr;
            this.f45261E = i10;
            this.f45262F = i11;
        }

        @Override // java.util.List
        public Object get(int i10) {
            l8.m.j(i10, this.f45262F);
            Object obj = this.f45260D[(i10 * 2) + this.f45261E];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // m8.AbstractC4007w
        boolean r() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f45262F;
        }
    }

    private X(Object obj, Object[] objArr, int i10) {
        this.f45250F = obj;
        this.f45251G = objArr;
        this.f45252H = i10;
    }

    static <K, V> X<K, V> n(int i10, Object[] objArr, AbstractC4010z.a<K, V> aVar) {
        if (i10 == 0) {
            return (X) f45249I;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            C3994i.a(obj, obj2);
            return new X<>(null, objArr, 1);
        }
        l8.m.n(i10, objArr.length >> 1);
        Object objO = o(objArr, i10, AbstractC3979B.z(i10), 0);
        if (objO instanceof Object[]) {
            Object[] objArr2 = (Object[]) objO;
            AbstractC4010z.a.C0613a c0613a = (AbstractC4010z.a.C0613a) objArr2[2];
            if (aVar == null) {
                throw c0613a.a();
            }
            aVar.f45392e = c0613a;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objO = obj3;
            i10 = iIntValue;
        }
        return new X<>(objO, objArr, i10);
    }

    private static Object o(Object[] objArr, int i10, int i11, int i12) {
        AbstractC4010z.a.C0613a c0613a = null;
        if (i10 == 1) {
            Object obj = objArr[i12];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i12 ^ 1];
            Objects.requireNonNull(obj2);
            C3994i.a(obj, obj2);
            return null;
        }
        int i13 = i11 - 1;
        int i14 = -1;
        if (i11 <= 128) {
            byte[] bArr = new byte[i11];
            Arrays.fill(bArr, (byte) -1);
            int i15 = 0;
            for (int i16 = 0; i16 < i10; i16++) {
                int i17 = (i16 * 2) + i12;
                int i18 = (i15 * 2) + i12;
                Object obj3 = objArr[i17];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i17 ^ 1];
                Objects.requireNonNull(obj4);
                C3994i.a(obj3, obj4);
                int iB = C4006v.b(obj3.hashCode());
                while (true) {
                    int i19 = iB & i13;
                    int i20 = bArr[i19] & 255;
                    if (i20 == 255) {
                        bArr[i19] = (byte) i18;
                        if (i15 < i16) {
                            objArr[i18] = obj3;
                            objArr[i18 ^ 1] = obj4;
                        }
                        i15++;
                    } else {
                        if (obj3.equals(objArr[i20])) {
                            int i21 = i20 ^ 1;
                            Object obj5 = objArr[i21];
                            Objects.requireNonNull(obj5);
                            c0613a = new AbstractC4010z.a.C0613a(obj3, obj4, obj5);
                            objArr[i21] = obj4;
                            break;
                        }
                        iB = i19 + 1;
                    }
                }
            }
            return i15 == i10 ? bArr : new Object[]{bArr, Integer.valueOf(i15), c0613a};
        }
        if (i11 <= 32768) {
            short[] sArr = new short[i11];
            Arrays.fill(sArr, (short) -1);
            int i22 = 0;
            for (int i23 = 0; i23 < i10; i23++) {
                int i24 = (i23 * 2) + i12;
                int i25 = (i22 * 2) + i12;
                Object obj6 = objArr[i24];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i24 ^ 1];
                Objects.requireNonNull(obj7);
                C3994i.a(obj6, obj7);
                int iB2 = C4006v.b(obj6.hashCode());
                while (true) {
                    int i26 = iB2 & i13;
                    int i27 = sArr[i26] & 65535;
                    if (i27 == 65535) {
                        sArr[i26] = (short) i25;
                        if (i22 < i23) {
                            objArr[i25] = obj6;
                            objArr[i25 ^ 1] = obj7;
                        }
                        i22++;
                    } else {
                        if (obj6.equals(objArr[i27])) {
                            int i28 = i27 ^ 1;
                            Object obj8 = objArr[i28];
                            Objects.requireNonNull(obj8);
                            c0613a = new AbstractC4010z.a.C0613a(obj6, obj7, obj8);
                            objArr[i28] = obj7;
                            break;
                        }
                        iB2 = i26 + 1;
                    }
                }
            }
            return i22 == i10 ? sArr : new Object[]{sArr, Integer.valueOf(i22), c0613a};
        }
        int[] iArr = new int[i11];
        Arrays.fill(iArr, -1);
        int i29 = 0;
        int i30 = 0;
        while (i29 < i10) {
            int i31 = (i29 * 2) + i12;
            int i32 = (i30 * 2) + i12;
            Object obj9 = objArr[i31];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i31 ^ 1];
            Objects.requireNonNull(obj10);
            C3994i.a(obj9, obj10);
            int iB3 = C4006v.b(obj9.hashCode());
            while (true) {
                int i33 = iB3 & i13;
                int i34 = iArr[i33];
                if (i34 == i14) {
                    iArr[i33] = i32;
                    if (i30 < i29) {
                        objArr[i32] = obj9;
                        objArr[i32 ^ 1] = obj10;
                    }
                    i30++;
                } else {
                    if (obj9.equals(objArr[i34])) {
                        int i35 = i34 ^ 1;
                        Object obj11 = objArr[i35];
                        Objects.requireNonNull(obj11);
                        c0613a = new AbstractC4010z.a.C0613a(obj9, obj10, obj11);
                        objArr[i35] = obj10;
                        break;
                    }
                    iB3 = i33 + 1;
                    i14 = -1;
                }
            }
            i29++;
            i14 = -1;
        }
        return i30 == i10 ? iArr : new Object[]{iArr, Integer.valueOf(i30), c0613a};
    }

    static Object p(Object obj, Object[] objArr, int i10, int i11, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i10 == 1) {
            Object obj3 = objArr[i11];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i11 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iB = C4006v.b(obj2.hashCode());
            while (true) {
                int i12 = iB & length;
                int i13 = bArr[i12] & 255;
                if (i13 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i13])) {
                    return objArr[i13 ^ 1];
                }
                iB = i12 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iB2 = C4006v.b(obj2.hashCode());
            while (true) {
                int i14 = iB2 & length2;
                int i15 = sArr[i14] & 65535;
                if (i15 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i15])) {
                    return objArr[i15 ^ 1];
                }
                iB2 = i14 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iB3 = C4006v.b(obj2.hashCode());
            while (true) {
                int i16 = iB3 & length3;
                int i17 = iArr[i16];
                if (i17 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i17])) {
                    return objArr[i17 ^ 1];
                }
                iB3 = i16 + 1;
            }
        }
    }

    @Override // m8.AbstractC4010z
    AbstractC3979B<Map.Entry<K, V>> d() {
        return new a(this, this.f45251G, 0, this.f45252H);
    }

    @Override // m8.AbstractC4010z
    AbstractC3979B<K> g() {
        return new b(this, new c(this.f45251G, 0, this.f45252H));
    }

    @Override // m8.AbstractC4010z, java.util.Map
    public V get(Object obj) {
        V v10 = (V) p(this.f45250F, this.f45251G, this.f45252H, 0, obj);
        if (v10 == null) {
            return null;
        }
        return v10;
    }

    @Override // m8.AbstractC4010z
    AbstractC4007w<V> h() {
        return new c(this.f45251G, 1, this.f45252H);
    }

    @Override // m8.AbstractC4010z
    boolean j() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f45252H;
    }
}
