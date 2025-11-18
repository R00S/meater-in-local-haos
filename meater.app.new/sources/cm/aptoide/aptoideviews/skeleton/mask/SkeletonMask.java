package cm.aptoide.aptoideviews.skeleton.mask;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import cm.aptoide.aptoideviews.skeleton.SkeletonViewPreferences;
import cm.aptoide.aptoideviews.skeleton.mask.Shape;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: SkeletonMask.kt */
@Metadata(m32266d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J(\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m32267d2 = {"Lcm/aptoide/aptoideviews/skeleton/mask/SkeletonMask;", HttpUrl.FRAGMENT_ENCODE_SET, "view", "Landroid/view/View;", "preferences", "Lcm/aptoide/aptoideviews/skeleton/SkeletonViewPreferences;", "(Landroid/view/View;Lcm/aptoide/aptoideviews/skeleton/SkeletonViewPreferences;)V", "borderPaint", "Landroid/graphics/Paint;", "paint", "getPreferences", "()Lcm/aptoide/aptoideviews/skeleton/SkeletonViewPreferences;", "getView", "()Landroid/view/View;", "draw", HttpUrl.FRAGMENT_ENCODE_SET, "canvas", "Landroid/graphics/Canvas;", "drawShape", "bounds", "Landroid/graphics/RectF;", "shape", "Lcm/aptoide/aptoideviews/skeleton/mask/Shape;", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class SkeletonMask {
    private final Paint borderPaint;
    private Paint paint;
    private final SkeletonViewPreferences preferences;
    private final View view;

    public SkeletonMask(View view, SkeletonViewPreferences skeletonViewPreferences) {
        C9801m.m32346f(view, "view");
        C9801m.m32346f(skeletonViewPreferences, "preferences");
        this.view = view;
        this.preferences = skeletonViewPreferences;
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setColor(skeletonViewPreferences.getShape().getColor());
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(skeletonViewPreferences.getBorder().getSize() > 0 || (skeletonViewPreferences.getShape() instanceof Shape.Circle));
        this.paint = paint;
        Paint paint2 = new Paint(1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint2.setColor(skeletonViewPreferences.getBorder().getColor());
        paint2.setStrokeWidth(skeletonViewPreferences.getBorder().getSize());
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(skeletonViewPreferences.getBorder().getSize() > 0 || (skeletonViewPreferences.getShape() instanceof Shape.Circle));
        this.borderPaint = paint2;
        view.setLayerType(1, null);
    }

    private final void drawShape(RectF bounds, Shape shape, Paint paint, Canvas canvas) {
        if (shape instanceof Shape.Rect) {
            if (((Shape.Rect) shape).getCornerRadius() > 0) {
                canvas.drawRoundRect(bounds, r4.getCornerRadius(), r4.getCornerRadius(), paint);
                return;
            } else {
                canvas.drawRect(bounds, paint);
                return;
            }
        }
        if (shape instanceof Shape.Circle) {
            float f2 = (bounds.right - bounds.left) / 2.0f;
            float f3 = (bounds.bottom - bounds.top) / 2.0f;
            canvas.drawCircle(f2, f3, Math.min(f2, f3), paint);
        }
    }

    public final void draw(Canvas canvas) {
        C9801m.m32346f(canvas, "canvas");
        RectF rectF = new RectF(this.preferences.getBorder().getSize() / 2.0f, this.preferences.getBorder().getSize() / 2.0f, this.view.getWidth() - (this.preferences.getBorder().getSize() / 2.0f), this.view.getHeight() - (this.preferences.getBorder().getSize() / 2.0f));
        drawShape(rectF, this.preferences.getShape(), this.paint, canvas);
        if (this.preferences.getBorder().getSize() > 0) {
            drawShape(rectF, this.preferences.getShape(), this.borderPaint, canvas);
        }
    }

    public final SkeletonViewPreferences getPreferences() {
        return this.preferences;
    }

    public final View getView() {
        return this.view;
    }
}
