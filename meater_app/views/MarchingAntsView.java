package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MarchingAntsView extends View {

    /* renamed from: u, reason: collision with root package name */
    private static int f10368u;

    /* renamed from: q, reason: collision with root package name */
    private Paint f10369q;

    /* renamed from: r, reason: collision with root package name */
    private int f10370r;

    /* renamed from: s, reason: collision with root package name */
    private int f10371s;

    /* renamed from: t, reason: collision with root package name */
    boolean f10372t;

    public MarchingAntsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10372t = false;
    }

    private void a() {
        if (this.f10369q == null) {
            Paint paint = new Paint();
            this.f10369q = paint;
            paint.setColor(androidx.core.content.a.c(getContext(), 2131099781));
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.height = 8;
            setLayoutParams(layoutParams);
            this.f10371s = f10368u;
        }
        this.f10370r = getWidth();
    }

    public void b() {
        if (this.f10372t) {
            return;
        }
        int i10 = this.f10371s + 3;
        this.f10371s = i10;
        if (i10 >= 15) {
            this.f10371s = 0;
        }
        f10368u = this.f10371s;
        if (getVisibility() == 0) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a();
        for (int i10 = -4; i10 < this.f10370r; i10 += 15) {
            canvas.drawCircle(this.f10371s + i10, 4.0f, 4.0f, this.f10369q);
        }
    }

    public void setForceStop(boolean z10) {
        this.f10372t = z10;
    }
}
