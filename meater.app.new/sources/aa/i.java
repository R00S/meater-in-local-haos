package aa;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: SwapDrawer.java */
/* loaded from: classes2.dex */
public class i extends C1917a {
    public i(Paint paint, Y9.a aVar) {
        super(paint, aVar);
    }

    public void a(Canvas canvas, T9.a aVar, int i10, int i11, int i12) {
        if (aVar instanceof U9.f) {
            U9.f fVar = (U9.f) aVar;
            int iO = this.f20104b.o();
            int iS = this.f20104b.s();
            int iL = this.f20104b.l();
            int iP = this.f20104b.p();
            int iQ = this.f20104b.q();
            int iE = this.f20104b.e();
            int iA = fVar.a();
            if (this.f20104b.x()) {
                if (i10 == iQ) {
                    iA = fVar.a();
                } else {
                    if (i10 == iP) {
                        iA = fVar.b();
                    }
                    iO = iS;
                }
            } else if (i10 == iE) {
                iA = fVar.a();
            } else {
                if (i10 == iP) {
                    iA = fVar.b();
                }
                iO = iS;
            }
            this.f20103a.setColor(iO);
            if (this.f20104b.f() == Y9.b.HORIZONTAL) {
                canvas.drawCircle(iA, i12, iL, this.f20103a);
            } else {
                canvas.drawCircle(i11, iA, iL, this.f20103a);
            }
        }
    }
}
