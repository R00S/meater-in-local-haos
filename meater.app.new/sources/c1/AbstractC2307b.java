package c1;

import android.view.View;

/* compiled from: ViewOscillator.java */
/* renamed from: c1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2307b extends Y0.d {
    public abstract void b(View view, float f10);

    /* compiled from: ViewOscillator.java */
    /* renamed from: c1.b$a */
    public static class a extends AbstractC2307b {
        public void c(View view, float f10, double d10, double d11) {
            view.setRotation(a(f10) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }

        @Override // c1.AbstractC2307b
        public void b(View view, float f10) {
        }
    }
}
