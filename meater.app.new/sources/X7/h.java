package X7;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.u;

/* compiled from: MaterialShapeUtils.java */
/* loaded from: classes2.dex */
public class h {
    static d a(int i10) {
        return i10 != 0 ? i10 != 1 ? b() : new e() : new j();
    }

    static d b() {
        return new j();
    }

    static f c() {
        return new f();
    }

    public static void d(View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            ((g) background).a0(f10);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            f(view, (g) background);
        }
    }

    public static void f(View view, g gVar) {
        if (gVar.S()) {
            gVar.e0(u.f(view));
        }
    }
}
