package aa;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: FillDrawer.java */
/* loaded from: classes2.dex */
public class e extends C1917a {

    /* renamed from: c, reason: collision with root package name */
    private Paint f20106c;

    public e(Paint paint, Y9.a aVar) {
        super(paint, aVar);
        Paint paint2 = new Paint();
        this.f20106c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f20106c.setAntiAlias(true);
    }

    public void a(Canvas canvas, T9.a aVar, int i10, int i11, int i12) {
        if (aVar instanceof U9.c) {
            U9.c cVar = (U9.c) aVar;
            int iS = this.f20104b.s();
            float fL = this.f20104b.l();
            int iR = this.f20104b.r();
            int iP = this.f20104b.p();
            int iQ = this.f20104b.q();
            int iE = this.f20104b.e();
            if (this.f20104b.x()) {
                if (i10 == iQ) {
                    iS = cVar.a();
                    fL = cVar.e();
                    iR = cVar.g();
                } else if (i10 == iP) {
                    iS = cVar.b();
                    fL = cVar.f();
                    iR = cVar.h();
                }
            } else if (i10 == iP) {
                iS = cVar.a();
                fL = cVar.e();
                iR = cVar.g();
            } else if (i10 == iE) {
                iS = cVar.b();
                fL = cVar.f();
                iR = cVar.h();
            }
            this.f20106c.setColor(iS);
            this.f20106c.setStrokeWidth(this.f20104b.r());
            float f10 = i11;
            float f11 = i12;
            canvas.drawCircle(f10, f11, this.f20104b.l(), this.f20106c);
            this.f20106c.setStrokeWidth(iR);
            canvas.drawCircle(f10, f11, fL, this.f20106c);
        }
    }
}
