package cm.aptoide.p092pt.view.custom;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import cm.aptoide.p092pt.utils.AptoideUtils;

/* loaded from: classes.dex */
public class CircleView extends View {
    private static final int END_COLOR = -16121;
    public static final Property<CircleView, Float> INNER_CIRCLE_RADIUS_PROGRESS;
    public static final Property<CircleView, Float> OUTER_CIRCLE_RADIUS_PROGRESS;
    private static final int START_COLOR = -43230;
    private ArgbEvaluator argbEvaluator;
    private Paint circlePaint;
    private float innerCircleRadiusProgress;
    private Paint maskPaint;
    private int maxCircleSize;
    private float outerCircleRadiusProgress;
    private Bitmap tempBitmap;
    private Canvas tempCanvas;

    static {
        Class<Float> cls = Float.class;
        INNER_CIRCLE_RADIUS_PROGRESS = new Property<CircleView, Float>(cls, "innerCircleRadiusProgress") { // from class: cm.aptoide.pt.view.custom.CircleView.1
            @Override // android.util.Property
            public Float get(CircleView circleView) {
                return Float.valueOf(circleView.getInnerCircleRadiusProgress());
            }

            @Override // android.util.Property
            public void set(CircleView circleView, Float f2) {
                circleView.setInnerCircleRadiusProgress(f2.floatValue());
            }
        };
        OUTER_CIRCLE_RADIUS_PROGRESS = new Property<CircleView, Float>(cls, "outerCircleRadiusProgress") { // from class: cm.aptoide.pt.view.custom.CircleView.2
            @Override // android.util.Property
            public Float get(CircleView circleView) {
                return Float.valueOf(circleView.getOuterCircleRadiusProgress());
            }

            @Override // android.util.Property
            public void set(CircleView circleView, Float f2) {
                circleView.setOuterCircleRadiusProgress(f2.floatValue());
            }
        };
    }

    public CircleView(Context context) {
        super(context);
        this.argbEvaluator = new ArgbEvaluator();
        this.circlePaint = new Paint();
        this.maskPaint = new Paint();
        this.outerCircleRadiusProgress = 0.0f;
        this.innerCircleRadiusProgress = 0.0f;
        init();
    }

    private void init() {
        this.circlePaint.setStyle(Paint.Style.FILL);
        this.maskPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    private void updateCircleColor() {
        this.circlePaint.setColor(((Integer) this.argbEvaluator.evaluate((float) AptoideUtils.MathU.mapValueFromRangeToRange((float) AptoideUtils.MathU.clamp(this.outerCircleRadiusProgress, 0.5d, 1.0d), 0.5d, 1.0d, 0.0d, 1.0d), Integer.valueOf(START_COLOR), Integer.valueOf(END_COLOR))).intValue());
    }

    public float getInnerCircleRadiusProgress() {
        return this.innerCircleRadiusProgress;
    }

    public float getOuterCircleRadiusProgress() {
        return this.outerCircleRadiusProgress;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.tempCanvas.drawColor(16777215, PorterDuff.Mode.CLEAR);
        this.tempCanvas.drawCircle(getWidth() / 2, getHeight() / 2, this.outerCircleRadiusProgress * this.maxCircleSize, this.circlePaint);
        this.tempCanvas.drawCircle(getWidth() / 2, getHeight() / 2, this.innerCircleRadiusProgress * this.maxCircleSize, this.maskPaint);
        canvas.drawBitmap(this.tempBitmap, 0.0f, 0.0f, (Paint) null);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.maxCircleSize = i2 / 2;
        this.tempBitmap = Bitmap.createBitmap(getWidth(), getWidth(), Bitmap.Config.ARGB_8888);
        this.tempCanvas = new Canvas(this.tempBitmap);
    }

    public void setInnerCircleRadiusProgress(float f2) {
        this.innerCircleRadiusProgress = f2;
        postInvalidate();
    }

    public void setOuterCircleRadiusProgress(float f2) {
        this.outerCircleRadiusProgress = f2;
        updateCircleColor();
        postInvalidate();
    }

    public CircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.argbEvaluator = new ArgbEvaluator();
        this.circlePaint = new Paint();
        this.maskPaint = new Paint();
        this.outerCircleRadiusProgress = 0.0f;
        this.innerCircleRadiusProgress = 0.0f;
        init();
    }

    public CircleView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.argbEvaluator = new ArgbEvaluator();
        this.circlePaint = new Paint();
        this.maskPaint = new Paint();
        this.outerCircleRadiusProgress = 0.0f;
        this.innerCircleRadiusProgress = 0.0f;
        init();
    }
}
