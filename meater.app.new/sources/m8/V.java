package m8;

import java.util.Arrays;
import java.util.Map;

/* compiled from: Platform.java */
/* loaded from: classes2.dex */
final class V {
    static <T> T[] a(Object[] objArr, int i10, int i11, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i10, i11, tArr.getClass());
    }

    static <T> T[] b(T[] tArr, int i10) {
        if (tArr.length != 0) {
            tArr = (T[]) Arrays.copyOf(tArr, 0);
        }
        return (T[]) Arrays.copyOf(tArr, i10);
    }

    static <K, V> Map<K, V> c(int i10) {
        return C3996k.A(i10);
    }
}
