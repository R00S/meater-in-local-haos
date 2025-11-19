package aa;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: SlideDrawer.java */
/* loaded from: classes2.dex */
public class h extends C1917a {
    public h(Paint paint, Y9.a aVar) {
        super(paint, aVar);
    }

    public void a(Canvas canvas, T9.a aVar, int i10, int i11) {
        if (aVar instanceof U9.e) {
            int iA = ((U9.e) aVar).a();
            int iS = this.f20104b.s();
            int iO = this.f20104b.o();
            int iL = this.f20104b.l();
            this.f20103a.setColor(iS);
            float f10 = i10;
            float f11 = i11;
            float f12 = iL;
            canvas.drawCircle(f10, f11, f12, this.f20103a);
            this.f20103a.setColor(iO);
            if (this.f20104b.f() == Y9.b.HORIZONTAL) {
                canvas.drawCircle(iA, f11, f12, this.f20103a);
            } else {
                canvas.drawCircle(f10, iA, f12, this.f20103a);
            }
        }
    }
}
