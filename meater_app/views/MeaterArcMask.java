package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MeaterArcMask extends AppCompatImageView {

    /* renamed from: t, reason: collision with root package name */
    private Drawable f10378t;

    /* renamed from: u, reason: collision with root package name */
    Paint f10379u;

    /* renamed from: v, reason: collision with root package name */
    Xfermode f10380v;

    public MeaterArcMask(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10379u = new Paint();
        this.f10380v = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        this.f10379u.setFilterBitmap(false);
        this.f10379u.setXfermode(this.f10380v);
        this.f10379u.setAntiAlias(true);
        this.f10378t.setBounds(getLeft(), getTop(), getRight(), getBottom());
        this.f10378t.draw(canvas);
        Rect bounds = this.f10378t.getBounds();
        canvas.saveLayer(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f10379u);
        super.onDraw(canvas);
        canvas.restore();
    }

    public void setMask(Drawable drawable) {
        this.f10378t = drawable;
    }
}
