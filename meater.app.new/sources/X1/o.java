package X1;

import java.util.Arrays;

/* compiled from: LongArray.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private int f18683a;

    /* renamed from: b, reason: collision with root package name */
    private long[] f18684b;

    public o() {
        this(32);
    }

    public void a(long j10) {
        int i10 = this.f18683a;
        long[] jArr = this.f18684b;
        if (i10 == jArr.length) {
            this.f18684b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f18684b;
        int i11 = this.f18683a;
        this.f18683a = i11 + 1;
        jArr2[i11] = j10;
    }

    public void b(long[] jArr) {
        int length = this.f18683a + jArr.length;
        long[] jArr2 = this.f18684b;
        if (length > jArr2.length) {
            this.f18684b = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f18684b, this.f18683a, jArr.length);
        this.f18683a = length;
    }

    public long c(int i10) {
        if (i10 >= 0 && i10 < this.f18683a) {
            return this.f18684b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f18683a);
    }

    public int d() {
        return this.f18683a;
    }

    public o(int i10) {
        this.f18684b = new long[i10];
    }
}
