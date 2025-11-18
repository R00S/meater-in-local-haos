package cm.aptoide.p092pt.view.custom;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import cm.aptoide.p092pt.utils.AptoideUtils;

/* loaded from: classes.dex */
public class DotsView extends View {
    private static final int COLOR_1 = -16121;
    private static final int COLOR_2 = -26624;
    private static final int COLOR_3 = -43230;
    private static final int COLOR_4 = -769226;
    private static final int DOTS_COUNT = 7;
    public static final Property<DotsView, Float> DOTS_PROGRESS = new Property<DotsView, Float>(Float.class, "dotsProgress") { // from class: cm.aptoide.pt.view.custom.DotsView.1
        @Override // android.util.Property
        public Float get(DotsView dotsView) {
            return Float.valueOf(dotsView.getCurrentProgress());
        }

        @Override // android.util.Property
        public void set(DotsView dotsView, Float f2) {
            dotsView.setCurrentProgress(f2.floatValue());
        }
    };
    private static final int OUTER_DOTS_POSITION_ANGLE = 51;
    private ArgbEvaluator argbEvaluator;
    private int centerX;
    private int centerY;
    private final Paint[] circlePaints;
    private float currentDotSize1;
    private float currentDotSize2;
    private float currentProgress;
    private float currentRadius1;
    private float currentRadius2;
    private float maxDotSize;
    private float maxInnerDotsRadius;
    private float maxOuterDotsRadius;

    public DotsView(Context context) {
        super(context);
        this.circlePaints = new Paint[4];
        this.currentProgress = 0.0f;
        this.currentRadius1 = 0.0f;
        this.currentDotSize1 = 0.0f;
        this.currentDotSize2 = 0.0f;
        this.currentRadius2 = 0.0f;
        this.argbEvaluator = new ArgbEvaluator();
        init();
    }

    private void drawInnerDotsFrame(Canvas canvas) {
        int i2 = 0;
        while (i2 < 7) {
            double d2 = this.centerX;
            double d3 = this.currentRadius2;
            double d4 = (i2 * 51) - 10;
            Double.isNaN(d4);
            double d5 = (d4 * 3.141592653589793d) / 180.0d;
            double dCos = Math.cos(d5);
            Double.isNaN(d3);
            Double.isNaN(d2);
            int i3 = (int) (d2 + (d3 * dCos));
            double d6 = this.centerY;
            double d7 = this.currentRadius2;
            double dSin = Math.sin(d5);
            Double.isNaN(d7);
            Double.isNaN(d6);
            float f2 = (int) (d6 + (d7 * dSin));
            float f3 = this.currentDotSize2;
            Paint[] paintArr = this.circlePaints;
            i2++;
            canvas.drawCircle(i3, f2, f3, paintArr[i2 % paintArr.length]);
        }
    }

    private void drawOuterDotsFrame(Canvas canvas) {
        for (int i2 = 0; i2 < 7; i2++) {
            double d2 = this.centerX;
            double d3 = this.currentRadius1;
            double d4 = i2 * 51;
            Double.isNaN(d4);
            double d5 = (d4 * 3.141592653589793d) / 180.0d;
            double dCos = Math.cos(d5);
            Double.isNaN(d3);
            Double.isNaN(d2);
            int i3 = (int) (d2 + (d3 * dCos));
            double d6 = this.centerY;
            double d7 = this.currentRadius1;
            double dSin = Math.sin(d5);
            Double.isNaN(d7);
            Double.isNaN(d6);
            float f2 = (int) (d6 + (d7 * dSin));
            float f3 = this.currentDotSize1;
            Paint[] paintArr = this.circlePaints;
            canvas.drawCircle(i3, f2, f3, paintArr[i2 % paintArr.length]);
        }
    }

    private void init() {
        int i2 = 0;
        while (true) {
            Paint[] paintArr = this.circlePaints;
            if (i2 >= paintArr.length) {
                return;
            }
            paintArr[i2] = new Paint();
            this.circlePaints[i2].setStyle(Paint.Style.FILL);
            i2++;
        }
    }

    private void updateDotsAlpha() {
        int iMapValueFromRangeToRange = (int) AptoideUtils.MathU.mapValueFromRangeToRange((float) AptoideUtils.MathU.clamp(this.currentProgress, 0.6000000238418579d, 1.0d), 0.6000000238418579d, 1.0d, 255.0d, 0.0d);
        this.circlePaints[0].setAlpha(iMapValueFromRangeToRange);
        this.circlePaints[1].setAlpha(iMapValueFromRangeToRange);
        this.circlePaints[2].setAlpha(iMapValueFromRangeToRange);
        this.circlePaints[3].setAlpha(iMapValueFromRangeToRange);
    }

    private void updateDotsPaints() {
        float f2 = this.currentProgress;
        Integer numValueOf = Integer.valueOf(COLOR_1);
        Integer numValueOf2 = Integer.valueOf(COLOR_4);
        Integer numValueOf3 = Integer.valueOf(COLOR_3);
        Integer numValueOf4 = Integer.valueOf(COLOR_2);
        if (f2 < 0.5f) {
            float fMapValueFromRangeToRange = (float) AptoideUtils.MathU.mapValueFromRangeToRange(f2, 0.0d, 0.5d, 0.0d, 1.0d);
            this.circlePaints[0].setColor(((Integer) this.argbEvaluator.evaluate(fMapValueFromRangeToRange, numValueOf, numValueOf4)).intValue());
            this.circlePaints[1].setColor(((Integer) this.argbEvaluator.evaluate(fMapValueFromRangeToRange, numValueOf4, numValueOf3)).intValue());
            this.circlePaints[2].setColor(((Integer) this.argbEvaluator.evaluate(fMapValueFromRangeToRange, numValueOf3, numValueOf2)).intValue());
            this.circlePaints[3].setColor(((Integer) this.argbEvaluator.evaluate(fMapValueFromRangeToRange, numValueOf2, numValueOf)).intValue());
            return;
        }
        float fMapValueFromRangeToRange2 = (float) AptoideUtils.MathU.mapValueFromRangeToRange(f2, 0.5d, 1.0d, 0.0d, 1.0d);
        this.circlePaints[0].setColor(((Integer) this.argbEvaluator.evaluate(fMapValueFromRangeToRange2, numValueOf4, numValueOf3)).intValue());
        this.circlePaints[1].setColor(((Integer) this.argbEvaluator.evaluate(fMapValueFromRangeToRange2, numValueOf3, numValueOf2)).intValue());
        this.circlePaints[2].setColor(((Integer) this.argbEvaluator.evaluate(fMapValueFromRangeToRange2, numValueOf2, numValueOf)).intValue());
        this.circlePaints[3].setColor(((Integer) this.argbEvaluator.evaluate(fMapValueFromRangeToRange2, numValueOf, numValueOf4)).intValue());
    }

    private void updateInnerDotsPosition() {
        float f2 = this.currentProgress;
        if (f2 < 0.3f) {
            this.currentRadius2 = (float) AptoideUtils.MathU.mapValueFromRangeToRange(f2, 0.0d, 0.30000001192092896d, 0.0d, this.maxInnerDotsRadius);
        } else {
            this.currentRadius2 = this.maxInnerDotsRadius;
        }
        float f3 = this.currentProgress;
        if (f3 < 0.2d) {
            this.currentDotSize2 = this.maxDotSize;
            return;
        }
        if (f3 >= 0.5d) {
            this.currentDotSize2 = (float) AptoideUtils.MathU.mapValueFromRangeToRange(f3, 0.5d, 1.0d, this.maxDotSize * 0.3f, 0.0d);
            return;
        }
        double d2 = f3;
        float f4 = this.maxDotSize;
        double d3 = f4;
        Double.isNaN(d3);
        this.currentDotSize2 = (float) AptoideUtils.MathU.mapValueFromRangeToRange(d2, 0.20000000298023224d, 0.5d, f4, d3 * 0.3d);
    }

    private void updateOuterDotsPosition() {
        float f2 = this.currentProgress;
        if (f2 < 0.3f) {
            this.currentRadius1 = (float) AptoideUtils.MathU.mapValueFromRangeToRange(f2, 0.0d, 0.30000001192092896d, 0.0d, this.maxOuterDotsRadius * 0.8f);
        } else {
            this.currentRadius1 = (float) AptoideUtils.MathU.mapValueFromRangeToRange(f2, 0.30000001192092896d, 1.0d, 0.8f * r0, this.maxOuterDotsRadius);
        }
        float f3 = this.currentProgress;
        if (f3 < 0.7d) {
            this.currentDotSize1 = this.maxDotSize;
        } else {
            this.currentDotSize1 = (float) AptoideUtils.MathU.mapValueFromRangeToRange(f3, 0.699999988079071d, 1.0d, this.maxDotSize, 0.0d);
        }
    }

    public float getCurrentProgress() {
        return this.currentProgress;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        drawOuterDotsFrame(canvas);
        drawInnerDotsFrame(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.centerX = i2 / 2;
        this.centerY = i3 / 2;
        this.maxDotSize = 4.0f;
        float f2 = (i2 / 2.3f) - (4.0f * 2.0f);
        this.maxOuterDotsRadius = f2;
        this.maxInnerDotsRadius = f2 * 0.8f;
    }

    public void setCurrentProgress(float f2) {
        this.currentProgress = f2;
        updateInnerDotsPosition();
        updateOuterDotsPosition();
        updateDotsPaints();
        updateDotsAlpha();
        postInvalidate();
    }

    public DotsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.circlePaints = new Paint[4];
        this.currentProgress = 0.0f;
        this.currentRadius1 = 0.0f;
        this.currentDotSize1 = 0.0f;
        this.currentDotSize2 = 0.0f;
        this.currentRadius2 = 0.0f;
        this.argbEvaluator = new ArgbEvaluator();
        init();
    }

    public DotsView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.circlePaints = new Paint[4];
        this.currentProgress = 0.0f;
        this.currentRadius1 = 0.0f;
        this.currentDotSize1 = 0.0f;
        this.currentDotSize2 = 0.0f;
        this.currentRadius2 = 0.0f;
        this.argbEvaluator = new ArgbEvaluator();
        init();
    }
}
