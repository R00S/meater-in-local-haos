package androidx.core.content.p003d;

import java.lang.reflect.Array;

/* compiled from: GrowingArrayUtils.java */
/* renamed from: androidx.core.content.d.e */
/* loaded from: classes.dex */
final class C0262e {
    /* renamed from: a */
    public static int[] m1745a(int[] iArr, int i2, int i3) {
        if (i2 + 1 > iArr.length) {
            int[] iArr2 = new int[m1747c(i2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            iArr = iArr2;
        }
        iArr[i2] = i3;
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Object[]] */
    /* renamed from: b */
    public static <T> T[] m1746b(T[] tArr, int i2, T t) {
        if (i2 + 1 > tArr.length) {
            ?? r0 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), m1747c(i2));
            System.arraycopy(tArr, 0, r0, 0, i2);
            tArr = r0;
        }
        tArr[i2] = t;
        return tArr;
    }

    /* renamed from: c */
    public static int m1747c(int i2) {
        if (i2 <= 4) {
            return 8;
        }
        return i2 * 2;
    }
}
