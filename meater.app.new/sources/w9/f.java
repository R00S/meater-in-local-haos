package w9;

import android.util.SparseIntArray;

/* compiled from: FrameMetricsCalculator.java */
/* loaded from: classes2.dex */
public class f {

    /* compiled from: FrameMetricsCalculator.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f51994a;

        /* renamed from: b, reason: collision with root package name */
        int f51995b;

        /* renamed from: c, reason: collision with root package name */
        int f51996c;

        public a(int i10, int i11, int i12) {
            this.f51994a = i10;
            this.f51995b = i11;
            this.f51996c = i12;
        }

        public a a(a aVar) {
            return new a(this.f51994a - aVar.d(), this.f51995b - aVar.c(), this.f51996c - aVar.b());
        }

        public int b() {
            return this.f51996c;
        }

        public int c() {
            return this.f51995b;
        }

        public int d() {
            return this.f51994a;
        }
    }

    public static a a(SparseIntArray[] sparseIntArrayArr) {
        int i10;
        int i11;
        SparseIntArray sparseIntArray;
        int i12 = 0;
        if (sparseIntArrayArr == null || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i10 = 0;
            i11 = 0;
        } else {
            int i13 = 0;
            i10 = 0;
            i11 = 0;
            while (i12 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i12);
                int iValueAt = sparseIntArray.valueAt(i12);
                i13 += iValueAt;
                if (iKeyAt > 700) {
                    i11 += iValueAt;
                }
                if (iKeyAt > 16) {
                    i10 += iValueAt;
                }
                i12++;
            }
            i12 = i13;
        }
        return new a(i12, i10, i11);
    }
}
