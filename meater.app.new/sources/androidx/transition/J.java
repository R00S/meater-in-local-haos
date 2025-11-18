package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi22.java */
/* loaded from: classes.dex */
class J extends H {

    /* renamed from: f, reason: collision with root package name */
    private static boolean f29426f = true;

    /* compiled from: ViewUtilsApi22.java */
    static class a {
        static void a(View view, int i10, int i11, int i12, int i13) {
            view.setLeftTopRightBottom(i10, i11, i12, i13);
        }
    }

    J() {
    }

    @Override // androidx.transition.E
    @SuppressLint({"NewApi"})
    public void d(View view, int i10, int i11, int i12, int i13) {
        if (f29426f) {
            try {
                a.a(view, i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f29426f = false;
            }
        }
    }
}
