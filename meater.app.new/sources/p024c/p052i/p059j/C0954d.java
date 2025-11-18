package p024c.p052i.p059j;

import android.os.Build;
import java.util.Arrays;

/* compiled from: ObjectsCompat.java */
/* renamed from: c.i.j.d */
/* loaded from: classes.dex */
public class C0954d {
    /* renamed from: a */
    public static boolean m6056a(Object obj, Object obj2) {
        return Build.VERSION.SDK_INT >= 19 ? C0953c.m6055a(obj, obj2) : obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m6057b(Object... objArr) {
        return Build.VERSION.SDK_INT >= 19 ? Arrays.hashCode(objArr) : Arrays.hashCode(objArr);
    }

    /* renamed from: c */
    public static String m6058c(Object obj, String str) {
        return obj != null ? obj.toString() : str;
    }
}
