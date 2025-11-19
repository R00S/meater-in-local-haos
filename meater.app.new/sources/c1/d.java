package c1;

import Y0.f;
import android.view.View;

/* compiled from: ViewTimeCycle.java */
/* loaded from: classes.dex */
public abstract class d extends f {

    /* compiled from: ViewTimeCycle.java */
    public static class a extends d {
        @Override // c1.d
        public boolean b(View view, float f10, long j10, Y0.c cVar) {
            return this.f19209h;
        }

        public boolean c(View view, Y0.c cVar, float f10, long j10, double d10, double d11) {
            view.setRotation(a(f10, j10, view, cVar) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
            return this.f19209h;
        }
    }

    public float a(float f10, long j10, View view, Y0.c cVar) {
        this.f19202a.c(f10, this.f19208g);
        float[] fArr = this.f19208g;
        float f11 = fArr[1];
        if (f11 == 0.0f) {
            this.f19209h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f19211j)) {
            throw null;
        }
        this.f19211j = (float) ((this.f19211j + (((j10 - this.f19210i) * 1.0E-9d) * f11)) % 1.0d);
        throw null;
    }

    public abstract boolean b(View view, float f10, long j10, Y0.c cVar);
}
