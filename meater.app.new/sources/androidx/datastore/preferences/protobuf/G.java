package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C2079z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: LongArrayList.java */
/* loaded from: classes.dex */
final class G extends AbstractC2057c<Long> implements C2079z.h, RandomAccess, Z {

    /* renamed from: E, reason: collision with root package name */
    private static final G f24851E;

    /* renamed from: C, reason: collision with root package name */
    private long[] f24852C;

    /* renamed from: D, reason: collision with root package name */
    private int f24853D;

    static {
        G g10 = new G(new long[0], 0);
        f24851E = g10;
        g10.n();
    }

    G() {
        this(new long[10], 0);
    }

    private void i(int i10, long j10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f24853D)) {
            throw new IndexOutOfBoundsException(x(i10));
        }
        long[] jArr = this.f24852C;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f24852C, i10, jArr2, i10 + 1, this.f24853D - i10);
            this.f24852C = jArr2;
        }
        this.f24852C[i10] = j10;
        this.f24853D++;
        ((AbstractList) this).modCount++;
    }

    private void r(int i10) {
        if (i10 < 0 || i10 >= this.f24853D) {
            throw new IndexOutOfBoundsException(x(i10));
        }
    }

    private String x(int i10) {
        return "Index:" + i10 + ", Size:" + this.f24853D;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public Long set(int i10, Long l10) {
        return Long.valueOf(B(i10, l10.longValue()));
    }

    public long B(int i10, long j10) {
        c();
        r(i10);
        long[] jArr = this.f24852C;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        c();
        C2079z.a(collection);
        if (!(collection instanceof G)) {
            return super.addAll(collection);
        }
        G g10 = (G) collection;
        int i10 = g10.f24853D;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f24853D;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f24852C;
        if (i12 > jArr.length) {
            this.f24852C = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(g10.f24852C, 0, this.f24852C, this.f24853D, g10.f24853D);
        this.f24853D = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return super.equals(obj);
        }
        G g10 = (G) obj;
        if (this.f24853D != g10.f24853D) {
            return false;
        }
        long[] jArr = g10.f24852C;
        for (int i10 = 0; i10 < this.f24853D; i10++) {
            if (this.f24852C[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Long l10) {
        i(i10, l10.longValue());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l10) {
        j(l10.longValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iF = 1;
        for (int i10 = 0; i10 < this.f24853D; i10++) {
            iF = (iF * 31) + C2079z.f(this.f24852C[i10]);
        }
        return iF;
    }

    public void j(long j10) {
        c();
        int i10 = this.f24853D;
        long[] jArr = this.f24852C;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f24852C = jArr2;
        }
        long[] jArr3 = this.f24852C;
        int i11 = this.f24853D;
        this.f24853D = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f24852C;
        System.arraycopy(jArr, i11, jArr, i10, this.f24853D - i11);
        this.f24853D -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f24853D;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Long get(int i10) {
        return Long.valueOf(w(i10));
    }

    public long w(int i10) {
        r(i10);
        return this.f24852C[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.C2079z.i
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C2079z.h k(int i10) {
        if (i10 >= this.f24853D) {
            return new G(Arrays.copyOf(this.f24852C, i10), this.f24853D);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Long remove(int i10) {
        c();
        r(i10);
        long[] jArr = this.f24852C;
        long j10 = jArr[i10];
        if (i10 < this.f24853D - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f24853D--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    private G(long[] jArr, int i10) {
        this.f24852C = jArr;
        this.f24853D = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        c();
        for (int i10 = 0; i10 < this.f24853D; i10++) {
            if (obj.equals(Long.valueOf(this.f24852C[i10]))) {
                long[] jArr = this.f24852C;
                System.arraycopy(jArr, i10 + 1, jArr, i10, (this.f24853D - i10) - 1);
                this.f24853D--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
