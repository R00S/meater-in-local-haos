package l8;

import java.util.Arrays;

/* compiled from: Objects.java */
/* renamed from: l8.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3918k extends AbstractC3913f {
    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
