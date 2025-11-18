package S3;

import java.util.Arrays;

/* compiled from: GradientColor.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f15317a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f15318b;

    public d(float[] fArr, int[] iArr) {
        this.f15317a = fArr;
        this.f15318b = iArr;
    }

    private void a(d dVar) {
        int i10 = 0;
        while (true) {
            int[] iArr = dVar.f15318b;
            if (i10 >= iArr.length) {
                return;
            }
            this.f15317a[i10] = dVar.f15317a[i10];
            this.f15318b[i10] = iArr[i10];
            i10++;
        }
    }

    private int c(float f10) {
        int iBinarySearch = Arrays.binarySearch(this.f15317a, f10);
        if (iBinarySearch >= 0) {
            return this.f15318b[iBinarySearch];
        }
        int i10 = -(iBinarySearch + 1);
        if (i10 == 0) {
            return this.f15318b[0];
        }
        int[] iArr = this.f15318b;
        if (i10 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.f15317a;
        int i11 = i10 - 1;
        float f11 = fArr[i11];
        return X3.b.c((f10 - f11) / (fArr[i10] - f11), iArr[i11], iArr[i10]);
    }

    public d b(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            iArr[i10] = c(fArr[i10]);
        }
        return new d(fArr, iArr);
    }

    public int[] d() {
        return this.f15318b;
    }

    public float[] e() {
        return this.f15317a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return Arrays.equals(this.f15317a, dVar.f15317a) && Arrays.equals(this.f15318b, dVar.f15318b);
    }

    public int f() {
        return this.f15318b.length;
    }

    public void g(d dVar, d dVar2, float f10) {
        int[] iArr;
        if (dVar.equals(dVar2)) {
            a(dVar);
            return;
        }
        if (f10 <= 0.0f) {
            a(dVar);
            return;
        }
        if (f10 >= 1.0f) {
            a(dVar2);
            return;
        }
        if (dVar.f15318b.length != dVar2.f15318b.length) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + dVar.f15318b.length + " vs " + dVar2.f15318b.length + ")");
        }
        int i10 = 0;
        while (true) {
            iArr = dVar.f15318b;
            if (i10 >= iArr.length) {
                break;
            }
            this.f15317a[i10] = X3.i.i(dVar.f15317a[i10], dVar2.f15317a[i10], f10);
            this.f15318b[i10] = X3.b.c(f10, dVar.f15318b[i10], dVar2.f15318b[i10]);
            i10++;
        }
        int length = iArr.length;
        while (true) {
            float[] fArr = this.f15317a;
            if (length >= fArr.length) {
                return;
            }
            int[] iArr2 = dVar.f15318b;
            fArr[length] = fArr[iArr2.length - 1];
            int[] iArr3 = this.f15318b;
            iArr3[length] = iArr3[iArr2.length - 1];
            length++;
        }
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f15317a) * 31) + Arrays.hashCode(this.f15318b);
    }
}
