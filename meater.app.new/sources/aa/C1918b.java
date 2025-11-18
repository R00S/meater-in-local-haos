package aa;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: BasicDrawer.java */
/* renamed from: aa.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1918b extends C1917a {

    /* renamed from: c, reason: collision with root package name */
    private Paint f20105c;

    public C1918b(Paint paint, Y9.a aVar) {
        super(paint, aVar);
        Paint paint2 = new Paint();
        this.f20105c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f20105c.setAntiAlias(true);
        this.f20105c.setStrokeWidth(aVar.r());
    }

    public void a(Canvas canvas, int i10, boolean z10, int i11, int i12) {
        Paint paint;
        float fL = this.f20104b.l();
        int iR = this.f20104b.r();
        float fN = this.f20104b.n();
        int iO = this.f20104b.o();
        int iS = this.f20104b.s();
        int iP = this.f20104b.p();
        V9.a aVarB = this.f20104b.b();
        if ((aVarB == V9.a.SCALE && !z10) || (aVarB == V9.a.SCALE_DOWN && z10)) {
            fL *= fN;
        }
        if (i10 != iP) {
            iO = iS;
        }
        if (aVarB != V9.a.FILL || i10 == iP) {
            paint = this.f20103a;
        } else {
            paint = this.f20105c;
            paint.setStrokeWidth(iR);
        }
        paint.setColor(iO);
        canvas.drawCircle(i11, i12, fL, paint);
    }
}
