package p024c.p041e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: ArraySet.java */
/* renamed from: c.e.b */
/* loaded from: classes.dex */
public final class C0868b<E> implements Collection<E>, Set<E> {

    /* renamed from: f */
    private static final int[] f5710f = new int[0];

    /* renamed from: g */
    private static final Object[] f5711g = new Object[0];

    /* renamed from: h */
    private static Object[] f5712h;

    /* renamed from: i */
    private static int f5713i;

    /* renamed from: j */
    private static Object[] f5714j;

    /* renamed from: k */
    private static int f5715k;

    /* renamed from: l */
    private int[] f5716l;

    /* renamed from: m */
    Object[] f5717m;

    /* renamed from: n */
    int f5718n;

    /* renamed from: o */
    private AbstractC0872f<E, E> f5719o;

    /* compiled from: ArraySet.java */
    /* renamed from: c.e.b$a */
    class a extends AbstractC0872f<E, E> {
        a() {
        }

        @Override // p024c.p041e.AbstractC0872f
        /* renamed from: a */
        protected void mo5411a() {
            C0868b.this.clear();
        }

        @Override // p024c.p041e.AbstractC0872f
        /* renamed from: b */
        protected Object mo5412b(int i2, int i3) {
            return C0868b.this.f5717m[i2];
        }

        @Override // p024c.p041e.AbstractC0872f
        /* renamed from: c */
        protected Map<E, E> mo5413c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // p024c.p041e.AbstractC0872f
        /* renamed from: d */
        protected int mo5414d() {
            return C0868b.this.f5718n;
        }

        @Override // p024c.p041e.AbstractC0872f
        /* renamed from: e */
        protected int mo5415e(Object obj) {
            return C0868b.this.indexOf(obj);
        }

        @Override // p024c.p041e.AbstractC0872f
        /* renamed from: f */
        protected int mo5416f(Object obj) {
            return C0868b.this.indexOf(obj);
        }

        @Override // p024c.p041e.AbstractC0872f
        /* renamed from: g */
        protected void mo5417g(E e2, E e3) {
            C0868b.this.add(e2);
        }

        @Override // p024c.p041e.AbstractC0872f
        /* renamed from: h */
        protected void mo5418h(int i2) {
            C0868b.this.m5426o(i2);
        }

        @Override // p024c.p041e.AbstractC0872f
        /* renamed from: i */
        protected E mo5419i(int i2, E e2) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public C0868b() {
        this(0);
    }

    /* renamed from: c */
    private void m5420c(int i2) {
        if (i2 == 8) {
            synchronized (C0868b.class) {
                Object[] objArr = f5714j;
                if (objArr != null) {
                    this.f5717m = objArr;
                    f5714j = (Object[]) objArr[0];
                    this.f5716l = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f5715k--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (C0868b.class) {
                Object[] objArr2 = f5712h;
                if (objArr2 != null) {
                    this.f5717m = objArr2;
                    f5712h = (Object[]) objArr2[0];
                    this.f5716l = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f5713i--;
                    return;
                }
            }
        }
        this.f5716l = new int[i2];
        this.f5717m = new Object[i2];
    }

    /* renamed from: g */
    private static void m5421g(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (C0868b.class) {
                if (f5715k < 10) {
                    objArr[0] = f5714j;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f5714j = objArr;
                    f5715k++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0868b.class) {
                if (f5713i < 10) {
                    objArr[0] = f5712h;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f5712h = objArr;
                    f5713i++;
                }
            }
        }
    }

    /* renamed from: h */
    private AbstractC0872f<E, E> m5422h() {
        if (this.f5719o == null) {
            this.f5719o = new a();
        }
        return this.f5719o;
    }

    /* renamed from: i */
    private int m5423i(Object obj, int i2) {
        int i3 = this.f5718n;
        if (i3 == 0) {
            return -1;
        }
        int iM5428a = C0869c.m5428a(this.f5716l, i3, i2);
        if (iM5428a < 0 || obj.equals(this.f5717m[iM5428a])) {
            return iM5428a;
        }
        int i4 = iM5428a + 1;
        while (i4 < i3 && this.f5716l[i4] == i2) {
            if (obj.equals(this.f5717m[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iM5428a - 1; i5 >= 0 && this.f5716l[i5] == i2; i5--) {
            if (obj.equals(this.f5717m[i5])) {
                return i5;
            }
        }
        return i4 ^ (-1);
    }

    /* renamed from: n */
    private int m5424n() {
        int i2 = this.f5718n;
        if (i2 == 0) {
            return -1;
        }
        int iM5428a = C0869c.m5428a(this.f5716l, i2, 0);
        if (iM5428a < 0 || this.f5717m[iM5428a] == null) {
            return iM5428a;
        }
        int i3 = iM5428a + 1;
        while (i3 < i2 && this.f5716l[i3] == 0) {
            if (this.f5717m[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM5428a - 1; i4 >= 0 && this.f5716l[i4] == 0; i4--) {
            if (this.f5717m[i4] == null) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e2) {
        int i2;
        int iM5423i;
        if (e2 == null) {
            iM5423i = m5424n();
            i2 = 0;
        } else {
            int iHashCode = e2.hashCode();
            i2 = iHashCode;
            iM5423i = m5423i(e2, iHashCode);
        }
        if (iM5423i >= 0) {
            return false;
        }
        int i3 = iM5423i ^ (-1);
        int i4 = this.f5718n;
        int[] iArr = this.f5716l;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f5717m;
            m5420c(i5);
            int[] iArr2 = this.f5716l;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f5717m, 0, objArr.length);
            }
            m5421g(iArr, objArr, this.f5718n);
        }
        int i6 = this.f5718n;
        if (i3 < i6) {
            int[] iArr3 = this.f5716l;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f5717m;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f5718n - i3);
        }
        this.f5716l[i3] = i2;
        this.f5717m[i3] = e2;
        this.f5718n++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        m5425f(this.f5718n + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i2 = this.f5718n;
        if (i2 != 0) {
            m5421g(this.f5716l, this.f5717m, i2);
            this.f5716l = f5710f;
            this.f5717m = f5711g;
            this.f5718n = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f5718n; i2++) {
                try {
                    if (!set.contains(m5427q(i2))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m5425f(int i2) {
        int[] iArr = this.f5716l;
        if (iArr.length < i2) {
            Object[] objArr = this.f5717m;
            m5420c(i2);
            int i3 = this.f5718n;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f5716l, 0, i3);
                System.arraycopy(objArr, 0, this.f5717m, 0, this.f5718n);
            }
            m5421g(iArr, objArr, this.f5718n);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f5716l;
        int i2 = this.f5718n;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public int indexOf(Object obj) {
        return obj == null ? m5424n() : m5423i(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f5718n <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return m5422h().m5459m().iterator();
    }

    /* renamed from: o */
    public E m5426o(int i2) {
        Object[] objArr = this.f5717m;
        E e2 = (E) objArr[i2];
        int i3 = this.f5718n;
        if (i3 <= 1) {
            m5421g(this.f5716l, objArr, i3);
            this.f5716l = f5710f;
            this.f5717m = f5711g;
            this.f5718n = 0;
        } else {
            int[] iArr = this.f5716l;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i4 = i3 - 1;
                this.f5718n = i4;
                if (i2 < i4) {
                    int i5 = i2 + 1;
                    System.arraycopy(iArr, i5, iArr, i2, i4 - i2);
                    Object[] objArr2 = this.f5717m;
                    System.arraycopy(objArr2, i5, objArr2, i2, this.f5718n - i2);
                }
                this.f5717m[this.f5718n] = null;
            } else {
                m5420c(i3 > 8 ? i3 + (i3 >> 1) : 8);
                this.f5718n--;
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f5716l, 0, i2);
                    System.arraycopy(objArr, 0, this.f5717m, 0, i2);
                }
                int i6 = this.f5718n;
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    System.arraycopy(iArr, i7, this.f5716l, i2, i6 - i2);
                    System.arraycopy(objArr, i7, this.f5717m, i2, this.f5718n - i2);
                }
            }
        }
        return e2;
    }

    /* renamed from: q */
    public E m5427q(int i2) {
        return (E) this.f5717m[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        m5426o(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.f5718n - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f5717m[i2])) {
                m5426o(i2);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f5718n;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i2 = this.f5718n;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f5717m, 0, objArr, 0, i2);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5718n * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f5718n; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            E eM5427q = m5427q(i2);
            if (eM5427q != this) {
                sb.append(eM5427q);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C0868b(int i2) {
        if (i2 == 0) {
            this.f5716l = f5710f;
            this.f5717m = f5711g;
        } else {
            m5420c(i2);
        }
        this.f5718n = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f5718n) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f5718n));
        }
        System.arraycopy(this.f5717m, 0, tArr, 0, this.f5718n);
        int length = tArr.length;
        int i2 = this.f5718n;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }
}
