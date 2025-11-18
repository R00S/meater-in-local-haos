package p024c.p041e;

/* compiled from: LongSparseArray.java */
/* renamed from: c.e.d */
/* loaded from: classes.dex */
public class C0870d<E> implements Cloneable {

    /* renamed from: f */
    private static final Object f5724f = new Object();

    /* renamed from: g */
    private boolean f5725g;

    /* renamed from: h */
    private long[] f5726h;

    /* renamed from: i */
    private Object[] f5727i;

    /* renamed from: j */
    private int f5728j;

    public C0870d() {
        this(10);
    }

    /* renamed from: f */
    private void m5434f() {
        int i2 = this.f5728j;
        long[] jArr = this.f5726h;
        Object[] objArr = this.f5727i;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f5724f) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f5725g = false;
        this.f5728j = i3;
    }

    /* renamed from: b */
    public void m5435b(long j2, E e2) {
        int i2 = this.f5728j;
        if (i2 != 0 && j2 <= this.f5726h[i2 - 1]) {
            m5442k(j2, e2);
            return;
        }
        if (this.f5725g && i2 >= this.f5726h.length) {
            m5434f();
        }
        int i3 = this.f5728j;
        if (i3 >= this.f5726h.length) {
            int iM5433f = C0869c.m5433f(i3 + 1);
            long[] jArr = new long[iM5433f];
            Object[] objArr = new Object[iM5433f];
            long[] jArr2 = this.f5726h;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f5727i;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f5726h = jArr;
            this.f5727i = objArr;
        }
        this.f5726h[i3] = j2;
        this.f5727i[i3] = e2;
        this.f5728j = i3 + 1;
    }

    /* renamed from: d */
    public void m5436d() {
        int i2 = this.f5728j;
        Object[] objArr = this.f5727i;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f5728j = 0;
        this.f5725g = false;
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C0870d<E> clone() {
        try {
            C0870d<E> c0870d = (C0870d) super.clone();
            c0870d.f5726h = (long[]) this.f5726h.clone();
            c0870d.f5727i = (Object[]) this.f5727i.clone();
            return c0870d;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: g */
    public E m5438g(long j2) {
        return m5439h(j2, null);
    }

    /* renamed from: h */
    public E m5439h(long j2, E e2) {
        int iM5429b = C0869c.m5429b(this.f5726h, this.f5728j, j2);
        if (iM5429b >= 0) {
            Object[] objArr = this.f5727i;
            if (objArr[iM5429b] != f5724f) {
                return (E) objArr[iM5429b];
            }
        }
        return e2;
    }

    /* renamed from: i */
    public int m5440i(long j2) {
        if (this.f5725g) {
            m5434f();
        }
        return C0869c.m5429b(this.f5726h, this.f5728j, j2);
    }

    /* renamed from: j */
    public long m5441j(int i2) {
        if (this.f5725g) {
            m5434f();
        }
        return this.f5726h[i2];
    }

    /* renamed from: k */
    public void m5442k(long j2, E e2) {
        int iM5429b = C0869c.m5429b(this.f5726h, this.f5728j, j2);
        if (iM5429b >= 0) {
            this.f5727i[iM5429b] = e2;
            return;
        }
        int iM5429b2 = iM5429b ^ (-1);
        int i2 = this.f5728j;
        if (iM5429b2 < i2) {
            Object[] objArr = this.f5727i;
            if (objArr[iM5429b2] == f5724f) {
                this.f5726h[iM5429b2] = j2;
                objArr[iM5429b2] = e2;
                return;
            }
        }
        if (this.f5725g && i2 >= this.f5726h.length) {
            m5434f();
            iM5429b2 = C0869c.m5429b(this.f5726h, this.f5728j, j2) ^ (-1);
        }
        int i3 = this.f5728j;
        if (i3 >= this.f5726h.length) {
            int iM5433f = C0869c.m5433f(i3 + 1);
            long[] jArr = new long[iM5433f];
            Object[] objArr2 = new Object[iM5433f];
            long[] jArr2 = this.f5726h;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f5727i;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f5726h = jArr;
            this.f5727i = objArr2;
        }
        int i4 = this.f5728j;
        if (i4 - iM5429b2 != 0) {
            long[] jArr3 = this.f5726h;
            int i5 = iM5429b2 + 1;
            System.arraycopy(jArr3, iM5429b2, jArr3, i5, i4 - iM5429b2);
            Object[] objArr4 = this.f5727i;
            System.arraycopy(objArr4, iM5429b2, objArr4, i5, this.f5728j - iM5429b2);
        }
        this.f5726h[iM5429b2] = j2;
        this.f5727i[iM5429b2] = e2;
        this.f5728j++;
    }

    /* renamed from: l */
    public void m5443l(long j2) {
        int iM5429b = C0869c.m5429b(this.f5726h, this.f5728j, j2);
        if (iM5429b >= 0) {
            Object[] objArr = this.f5727i;
            Object obj = objArr[iM5429b];
            Object obj2 = f5724f;
            if (obj != obj2) {
                objArr[iM5429b] = obj2;
                this.f5725g = true;
            }
        }
    }

    /* renamed from: m */
    public void m5444m(int i2) {
        Object[] objArr = this.f5727i;
        Object obj = objArr[i2];
        Object obj2 = f5724f;
        if (obj != obj2) {
            objArr[i2] = obj2;
            this.f5725g = true;
        }
    }

    /* renamed from: n */
    public int m5445n() {
        if (this.f5725g) {
            m5434f();
        }
        return this.f5728j;
    }

    /* renamed from: o */
    public E m5446o(int i2) {
        if (this.f5725g) {
            m5434f();
        }
        return (E) this.f5727i[i2];
    }

    public String toString() {
        if (m5445n() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5728j * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f5728j; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(m5441j(i2));
            sb.append('=');
            E eM5446o = m5446o(i2);
            if (eM5446o != this) {
                sb.append(eM5446o);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C0870d(int i2) {
        this.f5725g = false;
        if (i2 == 0) {
            this.f5726h = C0869c.f5722b;
            this.f5727i = C0869c.f5723c;
        } else {
            int iM5433f = C0869c.m5433f(i2);
            this.f5726h = new long[iM5433f];
            this.f5727i = new Object[iM5433f];
        }
    }
}
