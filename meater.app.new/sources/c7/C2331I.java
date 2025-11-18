package c7;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: c7.I, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2331I {
    static int a(int i10) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i11 = 0; i11 < 6; i11++) {
            int i12 = iArr[i11];
            int i13 = i12 - 1;
            if (i12 == 0) {
                throw null;
            }
            if (i13 == i10) {
                return i12;
            }
        }
        return 1;
    }
}
