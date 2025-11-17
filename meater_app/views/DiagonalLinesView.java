package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: /tmp/meat/meat/classes.dex */
public class DiagonalLinesView extends View {

    /* renamed from: q, reason: collision with root package name */
    Paint f10278q;

    /* renamed from: r, reason: collision with root package name */
    int f10279r;

    public DiagonalLinesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10279r = 20;
        a();
    }

    private void a() {
        Paint paint = new Paint();
        this.f10278q = paint;
        paint.setColor(f8.l0.h(2131099784));
        this.f10278q.setStyle(Paint.Style.FILL);
        this.f10278q.setStrokeWidth(2.0f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i10 = 0;
        while (i10 < canvas.getWidth() + (canvas.getWidth() / 2)) {
            int i11 = this.f10279r;
            canvas.drawLine(0.0f, i10 + i11, i11 + i10, 0.0f, this.f10278q);
            i10 += this.f10279r;
        }
    }
}
