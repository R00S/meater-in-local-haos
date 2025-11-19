package s;

import java.lang.reflect.Array;

/* compiled from: ArraySetJvmUtil.java */
/* renamed from: s.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C4393c {
    static <T> T[] a(T[] tArr, int i10) {
        if (tArr.length < i10) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10));
        }
        if (tArr.length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }
}
