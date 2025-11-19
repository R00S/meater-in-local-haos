package r1;

import java.util.Objects;

/* compiled from: ObjectsCompat.java */
/* renamed from: r1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4337d {
    public static boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static int b(Object... objArr) {
        return Objects.hash(objArr);
    }

    public static <T> T c(T t10) {
        t10.getClass();
        return t10;
    }

    public static <T> T d(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static String e(Object obj, String str) {
        return obj != null ? obj.toString() : str;
    }
}
