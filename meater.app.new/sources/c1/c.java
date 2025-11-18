package c1;

import Y0.e;
import android.view.View;

/* compiled from: ViewSpline.java */
/* loaded from: classes.dex */
public abstract class c extends e {
    public abstract void b(View view, float f10);

    /* compiled from: ViewSpline.java */
    public static class a extends c {
        public void c(View view, float f10, double d10, double d11) {
            view.setRotation(a(f10) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }

        @Override // c1.c
        public void b(View view, float f10) {
        }
    }
}
