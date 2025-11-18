package cm.aptoide.aptoideviews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
public class CustomArcView extends RelativeLayout {
    private Paint paint;
    private Path path;

    public CustomArcView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Path path = this.path;
        if (path != null) {
            canvas.drawPath(path, this.paint);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(C1103R.attr.wizardBackgroundBottom, typedValue, true);
        Paint paint = new Paint(1);
        this.paint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(getContext().getResources().getColor(typedValue.resourceId));
        this.path = new Path();
        float f2 = i2;
        float f3 = f2 * 0.8f;
        float f4 = (-i3) * 0.8f;
        RectF rectF = new RectF(-f3, f4, f2 + f3, i3);
        this.path.lineTo(rectF.left, f4);
        this.path.arcTo(rectF, 0.0f, 300.0f, false);
        this.path.setFillType(Path.FillType.INVERSE_EVEN_ODD);
    }
}
