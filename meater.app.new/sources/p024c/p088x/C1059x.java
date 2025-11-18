package p024c.p088x;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;

/* compiled from: ViewGroupUtils.java */
/* renamed from: c.x.x */
/* loaded from: classes.dex */
class C1059x {

    /* renamed from: a */
    private static boolean f6941a = true;

    /* renamed from: a */
    static InterfaceC1058w m6679a(ViewGroup viewGroup) {
        return Build.VERSION.SDK_INT >= 18 ? new C1057v(viewGroup) : C1056u.m6676g(viewGroup);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    private static void m6680b(ViewGroup viewGroup, boolean z) {
        if (f6941a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f6941a = false;
            }
        }
    }

    /* renamed from: c */
    static void m6681c(ViewGroup viewGroup, boolean z) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            viewGroup.suppressLayout(z);
        } else if (i2 >= 18) {
            m6680b(viewGroup, z);
        } else {
            C1060y.m6683b(viewGroup, z);
        }
    }
}
