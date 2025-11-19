package aa;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: ColorDrawer.java */
/* renamed from: aa.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1919c extends C1917a {
    public C1919c(Paint paint, Y9.a aVar) {
        super(paint, aVar);
    }

    public void a(Canvas canvas, T9.a aVar, int i10, int i11, int i12) {
        if (aVar instanceof U9.a) {
            U9.a aVar2 = (U9.a) aVar;
            float fL = this.f20104b.l();
            int iO = this.f20104b.o();
            int iP = this.f20104b.p();
            int iQ = this.f20104b.q();
            int iE = this.f20104b.e();
            if (this.f20104b.x()) {
                if (i10 == iQ) {
                    iO = aVar2.a();
                } else if (i10 == iP) {
                    iO = aVar2.b();
                }
            } else if (i10 == iP) {
                iO = aVar2.a();
            } else if (i10 == iE) {
                iO = aVar2.b();
            }
            this.f20103a.setColor(iO);
            canvas.drawCircle(i11, i12, fL, this.f20103a);
        }
    }
}
