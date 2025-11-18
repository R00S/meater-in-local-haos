package p241e.p254e.p256b.p271c.p276p;

import android.os.Build;

/* compiled from: CircularRevealHelper.java */
/* renamed from: e.e.b.c.p.c */
/* loaded from: classes2.dex */
public class C8934c {

    /* renamed from: a */
    public static final int f34399a;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            f34399a = 2;
        } else if (i2 >= 18) {
            f34399a = 1;
        } else {
            f34399a = 0;
        }
    }
}
