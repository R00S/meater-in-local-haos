package androidx.core.os;

import android.os.Build;

/* compiled from: BuildCompat.java */
/* renamed from: androidx.core.os.a */
/* loaded from: classes.dex */
public class C0272a {
    /* renamed from: a */
    protected static boolean m1831a(String str, String str2) {
        return !"REL".equals(str2) && str2.compareTo(str) >= 0;
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m1832b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    /* renamed from: c */
    public static boolean m1833c() {
        return Build.VERSION.SDK_INT >= 31 || m1831a("S", Build.VERSION.CODENAME);
    }
}
