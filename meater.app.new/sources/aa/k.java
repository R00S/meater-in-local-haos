package aa;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: WormDrawer.java */
/* loaded from: classes2.dex */
public class k extends C1917a {

    /* renamed from: c, reason: collision with root package name */
    public RectF f20107c;

    public k(Paint paint, Y9.a aVar) {
        super(paint, aVar);
        this.f20107c = new RectF();
    }

    public void a(Canvas canvas, T9.a aVar, int i10, int i11) {
        if (aVar instanceof U9.h) {
            U9.h hVar = (U9.h) aVar;
            int iB = hVar.b();
            int iA = hVar.a();
            int iL = this.f20104b.l();
            int iS = this.f20104b.s();
            int iO = this.f20104b.o();
            if (this.f20104b.f() == Y9.b.HORIZONTAL) {
                RectF rectF = this.f20107c;
                rectF.left = iB;
                rectF.right = iA;
                rectF.top = i11 - iL;
                rectF.bottom = i11 + iL;
            } else {
                RectF rectF2 = this.f20107c;
                rectF2.left = i10 - iL;
                rectF2.right = i10 + iL;
                rectF2.top = iB;
                rectF2.bottom = iA;
            }
            this.f20103a.setColor(iS);
            float f10 = i10;
            float f11 = i11;
            float f12 = iL;
            canvas.drawCircle(f10, f11, f12, this.f20103a);
            this.f20103a.setColor(iO);
            canvas.drawRoundRect(this.f20107c, f12, f12, this.f20103a);
        }
    }
}
