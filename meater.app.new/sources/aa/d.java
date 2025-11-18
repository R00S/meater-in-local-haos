package aa;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: DropDrawer.java */
/* loaded from: classes2.dex */
public class d extends C1917a {
    public d(Paint paint, Y9.a aVar) {
        super(paint, aVar);
    }

    public void a(Canvas canvas, T9.a aVar, int i10, int i11) {
        if (aVar instanceof U9.b) {
            U9.b bVar = (U9.b) aVar;
            int iS = this.f20104b.s();
            int iO = this.f20104b.o();
            float fL = this.f20104b.l();
            this.f20103a.setColor(iS);
            canvas.drawCircle(i10, i11, fL, this.f20103a);
            this.f20103a.setColor(iO);
            if (this.f20104b.f() == Y9.b.HORIZONTAL) {
                canvas.drawCircle(bVar.c(), bVar.a(), bVar.b(), this.f20103a);
            } else {
                canvas.drawCircle(bVar.a(), bVar.c(), bVar.b(), this.f20103a);
            }
        }
    }
}
