package s1;

import android.graphics.Rect;
import android.view.Gravity;

/* compiled from: GravityCompat.java */
/* renamed from: s1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4456s {
    public static void a(int i10, int i11, int i12, Rect rect, Rect rect2, int i13) {
        Gravity.apply(i10, i11, i12, rect, rect2, i13);
    }

    public static int b(int i10, int i11) {
        return Gravity.getAbsoluteGravity(i10, i11);
    }
}
