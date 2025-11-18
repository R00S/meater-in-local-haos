package aa;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: ScaleDownDrawer.java */
/* loaded from: classes2.dex */
public class f extends C1917a {
    public f(Paint paint, Y9.a aVar) {
        super(paint, aVar);
    }

    public void a(Canvas canvas, T9.a aVar, int i10, int i11, int i12) {
        if (aVar instanceof U9.d) {
            U9.d dVar = (U9.d) aVar;
            float fL = this.f20104b.l();
            int iO = this.f20104b.o();
            int iP = this.f20104b.p();
            int iQ = this.f20104b.q();
            int iE = this.f20104b.e();
            if (this.f20104b.x()) {
                if (i10 == iQ) {
                    fL = dVar.e();
                    iO = dVar.a();
                } else if (i10 == iP) {
                    fL = dVar.f();
                    iO = dVar.b();
                }
            } else if (i10 == iP) {
                fL = dVar.e();
                iO = dVar.a();
            } else if (i10 == iE) {
                fL = dVar.f();
                iO = dVar.b();
            }
            this.f20103a.setColor(iO);
            canvas.drawCircle(i11, i12, fL, this.f20103a);
        }
    }
}
