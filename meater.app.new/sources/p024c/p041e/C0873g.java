package p024c.p041e;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: SimpleArrayMap.java */
/* renamed from: c.e.g */
/* loaded from: classes.dex */
public class C0873g<K, V> {

    /* renamed from: f */
    static Object[] f5752f;

    /* renamed from: g */
    static int f5753g;

    /* renamed from: h */
    static Object[] f5754h;

    /* renamed from: i */
    static int f5755i;

    /* renamed from: j */
    int[] f5756j;

    /* renamed from: k */
    Object[] f5757k;

    /* renamed from: l */
    int f5758l;

    public C0873g() {
        this.f5756j = C0869c.f5721a;
        this.f5757k = C0869c.f5723c;
        this.f5758l = 0;
    }

    /* renamed from: a */
    private void m5465a(int i2) {
        if (i2 == 8) {
            synchronized (C0873g.class) {
                Object[] objArr = f5754h;
                if (objArr != null) {
                    this.f5757k = objArr;
                    f5754h = (Object[]) objArr[0];
                    this.f5756j = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f5755i--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (C0873g.class) {
                Object[] objArr2 = f5752f;
                if (objArr2 != null) {
                    this.f5757k = objArr2;
                    f5752f = (Object[]) objArr2[0];
                    this.f5756j = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f5753g--;
                    return;
                }
            }
        }
        this.f5756j = new int[i2];
        this.f5757k = new Object[i2 << 1];
    }

    /* renamed from: b */
    private static int m5466b(int[] iArr, int i2, int i3) {
        try {
            return C0869c.m5428a(iArr, i2, i3);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: d */
    private static void m5467d(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (C0873g.class) {
                if (f5755i < 10) {
                    objArr[0] = f5754h;
                    objArr[1] = iArr;
                    for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f5754h = objArr;
                    f5755i++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0873g.class) {
                if (f5753g < 10) {
                    objArr[0] = f5752f;
                    objArr[1] = iArr;
                    for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f5752f = objArr;
                    f5753g++;
                }
            }
        }
    }

    /* renamed from: c */
    public void m5468c(int i2) {
        int i3 = this.f5758l;
        int[] iArr = this.f5756j;
        if (iArr.length < i2) {
            Object[] objArr = this.f5757k;
            m5465a(i2);
            if (this.f5758l > 0) {
                System.arraycopy(iArr, 0, this.f5756j, 0, i3);
                System.arraycopy(objArr, 0, this.f5757k, 0, i3 << 1);
            }
            m5467d(iArr, objArr, i3);
        }
        if (this.f5758l != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i2 = this.f5758l;
        if (i2 > 0) {
            int[] iArr = this.f5756j;
            Object[] objArr = this.f5757k;
            this.f5756j = C0869c.f5721a;
            this.f5757k = C0869c.f5723c;
            this.f5758l = 0;
            m5467d(iArr, objArr, i2);
        }
        if (this.f5758l > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m5470f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m5472i(obj) >= 0;
    }

    /* renamed from: e */
    int m5469e(Object obj, int i2) {
        int i3 = this.f5758l;
        if (i3 == 0) {
            return -1;
        }
        int iM5466b = m5466b(this.f5756j, i3, i2);
        if (iM5466b < 0 || obj.equals(this.f5757k[iM5466b << 1])) {
            return iM5466b;
        }
        int i4 = iM5466b + 1;
        while (i4 < i3 && this.f5756j[i4] == i2) {
            if (obj.equals(this.f5757k[i4 << 1])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iM5466b - 1; i5 >= 0 && this.f5756j[i5] == i2; i5--) {
            if (obj.equals(this.f5757k[i5 << 1])) {
                return i5;
            }
        }
        return i4 ^ (-1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0873g) {
            C0873g c0873g = (C0873g) obj;
            if (size() != c0873g.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f5758l; i2++) {
                try {
                    K kM5473j = m5473j(i2);
                    V vM5477n = m5477n(i2);
                    Object obj2 = c0873g.get(kM5473j);
                    if (vM5477n == null) {
                        if (obj2 != null || !c0873g.containsKey(kM5473j)) {
                            return false;
                        }
                    } else if (!vM5477n.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f5758l; i3++) {
                try {
                    K kM5473j2 = m5473j(i3);
                    V vM5477n2 = m5477n(i3);
                    Object obj3 = map.get(kM5473j2);
                    if (vM5477n2 == null) {
                        if (obj3 != null || !map.containsKey(kM5473j2)) {
                            return false;
                        }
                    } else if (!vM5477n2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m5470f(Object obj) {
        return obj == null ? m5471h() : m5469e(obj, obj.hashCode());
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int iM5470f = m5470f(obj);
        return iM5470f >= 0 ? (V) this.f5757k[(iM5470f << 1) + 1] : v;
    }

    /* renamed from: h */
    int m5471h() {
        int i2 = this.f5758l;
        if (i2 == 0) {
            return -1;
        }
        int iM5466b = m5466b(this.f5756j, i2, 0);
        if (iM5466b < 0 || this.f5757k[iM5466b << 1] == null) {
            return iM5466b;
        }
        int i3 = iM5466b + 1;
        while (i3 < i2 && this.f5756j[i3] == 0) {
            if (this.f5757k[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM5466b - 1; i4 >= 0 && this.f5756j[i4] == 0; i4--) {
            if (this.f5757k[i4 << 1] == null) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    public int hashCode() {
        int[] iArr = this.f5756j;
        Object[] objArr = this.f5757k;
        int i2 = this.f5758l;
        int i3 = 1;
        int i4 = 0;
        int iHashCode = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return iHashCode;
    }

    /* renamed from: i */
    int m5472i(Object obj) {
        int i2 = this.f5758l * 2;
        Object[] objArr = this.f5757k;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f5758l <= 0;
    }

    /* renamed from: j */
    public K m5473j(int i2) {
        return (K) this.f5757k[i2 << 1];
    }

    /* renamed from: k */
    public void mo5474k(C0873g<? extends K, ? extends V> c0873g) {
        int i2 = c0873g.f5758l;
        m5468c(this.f5758l + i2);
        if (this.f5758l != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                put(c0873g.m5473j(i3), c0873g.m5477n(i3));
            }
        } else if (i2 > 0) {
            System.arraycopy(c0873g.f5756j, 0, this.f5756j, 0, i2);
            System.arraycopy(c0873g.f5757k, 0, this.f5757k, 0, i2 << 1);
            this.f5758l = i2;
        }
    }

    /* renamed from: l */
    public V mo5475l(int i2) {
        Object[] objArr = this.f5757k;
        int i3 = i2 << 1;
        V v = (V) objArr[i3 + 1];
        int i4 = this.f5758l;
        int i5 = 0;
        if (i4 <= 1) {
            m5467d(this.f5756j, objArr, i4);
            this.f5756j = C0869c.f5721a;
            this.f5757k = C0869c.f5723c;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.f5756j;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    int i8 = i6 - i2;
                    System.arraycopy(iArr, i7, iArr, i2, i8);
                    Object[] objArr2 = this.f5757k;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i3, i8 << 1);
                }
                Object[] objArr3 = this.f5757k;
                int i9 = i6 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                m5465a(i4 > 8 ? i4 + (i4 >> 1) : 8);
                if (i4 != this.f5758l) {
                    throw new ConcurrentModificationException();
                }
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f5756j, 0, i2);
                    System.arraycopy(objArr, 0, this.f5757k, 0, i3);
                }
                if (i2 < i6) {
                    int i10 = i2 + 1;
                    int i11 = i6 - i2;
                    System.arraycopy(iArr, i10, this.f5756j, i2, i11);
                    System.arraycopy(objArr, i10 << 1, this.f5757k, i3, i11 << 1);
                }
            }
            i5 = i6;
        }
        if (i4 != this.f5758l) {
            throw new ConcurrentModificationException();
        }
        this.f5758l = i5;
        return v;
    }

    /* renamed from: m */
    public V mo5476m(int i2, V v) {
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.f5757k;
        V v2 = (V) objArr[i3];
        objArr[i3] = v;
        return v2;
    }

    /* renamed from: n */
    public V m5477n(int i2) {
        return (V) this.f5757k[(i2 << 1) + 1];
    }

    public V put(K k2, V v) {
        int i2;
        int iM5469e;
        int i3 = this.f5758l;
        if (k2 == null) {
            iM5469e = m5471h();
            i2 = 0;
        } else {
            int iHashCode = k2.hashCode();
            i2 = iHashCode;
            iM5469e = m5469e(k2, iHashCode);
        }
        if (iM5469e >= 0) {
            int i4 = (iM5469e << 1) + 1;
            Object[] objArr = this.f5757k;
            V v2 = (V) objArr[i4];
            objArr[i4] = v;
            return v2;
        }
        int i5 = iM5469e ^ (-1);
        int[] iArr = this.f5756j;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr2 = this.f5757k;
            m5465a(i6);
            if (i3 != this.f5758l) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f5756j;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f5757k, 0, objArr2.length);
            }
            m5467d(iArr, objArr2, i3);
        }
        if (i5 < i3) {
            int[] iArr3 = this.f5756j;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f5757k;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.f5758l - i5) << 1);
        }
        int i8 = this.f5758l;
        if (i3 == i8) {
            int[] iArr4 = this.f5756j;
            if (i5 < iArr4.length) {
                iArr4[i5] = i2;
                Object[] objArr4 = this.f5757k;
                int i9 = i5 << 1;
                objArr4[i9] = k2;
                objArr4[i9 + 1] = v;
                this.f5758l = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k2, V v) {
        V v2 = get(k2);
        return v2 == null ? put(k2, v) : v2;
    }

    public V remove(Object obj) {
        int iM5470f = m5470f(obj);
        if (iM5470f >= 0) {
            return mo5475l(iM5470f);
        }
        return null;
    }

    public V replace(K k2, V v) {
        int iM5470f = m5470f(k2);
        if (iM5470f >= 0) {
            return mo5476m(iM5470f, v);
        }
        return null;
    }

    public int size() {
        return this.f5758l;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5758l * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f5758l; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K kM5473j = m5473j(i2);
            if (kM5473j != this) {
                sb.append(kM5473j);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vM5477n = m5477n(i2);
            if (vM5477n != this) {
                sb.append(vM5477n);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int iM5470f = m5470f(obj);
        if (iM5470f < 0) {
            return false;
        }
        V vM5477n = m5477n(iM5470f);
        if (obj2 != vM5477n && (obj2 == null || !obj2.equals(vM5477n))) {
            return false;
        }
        mo5475l(iM5470f);
        return true;
    }

    public boolean replace(K k2, V v, V v2) {
        int iM5470f = m5470f(k2);
        if (iM5470f < 0) {
            return false;
        }
        V vM5477n = m5477n(iM5470f);
        if (vM5477n != v && (v == null || !v.equals(vM5477n))) {
            return false;
        }
        mo5476m(iM5470f, v2);
        return true;
    }

    public C0873g(int i2) {
        if (i2 == 0) {
            this.f5756j = C0869c.f5721a;
            this.f5757k = C0869c.f5723c;
        } else {
            m5465a(i2);
        }
        this.f5758l = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0873g(C0873g<K, V> c0873g) {
        this();
        if (c0873g != 0) {
            mo5474k(c0873g);
        }
    }
}
