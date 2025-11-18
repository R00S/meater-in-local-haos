package cm.aptoide.p092pt.app.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import cm.aptoide.p092pt.C1146R;

/* loaded from: classes.dex */
public class ToolbarArcBackground extends View {
    private float extenderOverBoundary;
    private Paint paint;
    private RectF rectF;
    private float scale;
    private float strokeWidth;

    public ToolbarArcBackground(Context context) {
        this(context, null);
    }

    private void retrievePreferences(AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1146R.styleable.ToolbarArcBackground, i2, 0);
        this.paint.setColor(typedArrayObtainStyledAttributes.getColor(0, -1));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(this.strokeWidth);
        RectF rectF = new RectF(-this.extenderOverBoundary, (getHeight() + (this.strokeWidth / 2.0f)) * this.scale, getWidth() + this.extenderOverBoundary, getHeight() + (this.strokeWidth / 2.0f));
        this.rectF = rectF;
        canvas.drawArc(rectF, 0.0f, 180.0f, false, this.paint);
    }

    public void setScale(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        this.scale = f2;
        invalidate();
    }

    public ToolbarArcBackground(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ToolbarArcBackground(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.scale = 0.0f;
        this.extenderOverBoundary = 250.0f;
        this.strokeWidth = 200.0f;
        this.paint = new Paint(1);
        this.rectF = new RectF();
        retrievePreferences(attributeSet, i2);
    }
}
