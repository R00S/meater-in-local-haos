package v2;

import X1.C1804a;

/* compiled from: VorbisBitArray.java */
/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f51076a;

    /* renamed from: b, reason: collision with root package name */
    private final int f51077b;

    /* renamed from: c, reason: collision with root package name */
    private int f51078c;

    /* renamed from: d, reason: collision with root package name */
    private int f51079d;

    public Q(byte[] bArr) {
        this.f51076a = bArr;
        this.f51077b = bArr.length;
    }

    private void a() {
        int i10;
        int i11 = this.f51078c;
        C1804a.g(i11 >= 0 && (i11 < (i10 = this.f51077b) || (i11 == i10 && this.f51079d == 0)));
    }

    public int b() {
        return (this.f51078c * 8) + this.f51079d;
    }

    public boolean c() {
        boolean z10 = (((this.f51076a[this.f51078c] & 255) >> this.f51079d) & 1) == 1;
        e(1);
        return z10;
    }

    public int d(int i10) {
        int i11 = this.f51078c;
        int iMin = Math.min(i10, 8 - this.f51079d);
        int i12 = i11 + 1;
        int i13 = ((this.f51076a[i11] & 255) >> this.f51079d) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.f51076a[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        e(i10);
        return i14;
    }

    public void e(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f51078c + i11;
        this.f51078c = i12;
        int i13 = this.f51079d + (i10 - (i11 * 8));
        this.f51079d = i13;
        if (i13 > 7) {
            this.f51078c = i12 + 1;
            this.f51079d = i13 - 8;
        }
        a();
    }
}
