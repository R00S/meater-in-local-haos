package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

/* loaded from: classes2.dex */
final class PicassoDrawable extends BitmapDrawable {
    private static final Paint DEBUG_PAINT = new Paint();
    private static final float FADE_DURATION = 200.0f;
    int alpha;
    boolean animating;
    private final boolean debugging;
    private final float density;
    private final Picasso.LoadedFrom loadedFrom;
    Drawable placeholder;
    long startTimeMillis;

    PicassoDrawable(Context context, Bitmap bitmap, Drawable drawable, Picasso.LoadedFrom loadedFrom, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        this.alpha = 255;
        this.debugging = z2;
        this.density = context.getResources().getDisplayMetrics().density;
        this.loadedFrom = loadedFrom;
        if ((loadedFrom == Picasso.LoadedFrom.MEMORY || z) ? false : true) {
            this.placeholder = drawable;
            this.animating = true;
            this.startTimeMillis = SystemClock.uptimeMillis();
        }
    }

    private void drawDebugIndicator(Canvas canvas) {
        Paint paint = DEBUG_PAINT;
        paint.setColor(-1);
        canvas.drawPath(getTrianglePath(new Point(0, 0), (int) (this.density * 16.0f)), paint);
        paint.setColor(this.loadedFrom.debugColor);
        canvas.drawPath(getTrianglePath(new Point(0, 0), (int) (this.density * 15.0f)), paint);
    }

    private static Path getTrianglePath(Point point, int i2) {
        Point point2 = new Point(point.x + i2, point.y);
        Point point3 = new Point(point.x, point.y + i2);
        Path path = new Path();
        path.moveTo(point.x, point.y);
        path.lineTo(point2.x, point2.y);
        path.lineTo(point3.x, point3.y);
        return path;
    }

    static void setBitmap(ImageView imageView, Context context, Bitmap bitmap, Picasso.LoadedFrom loadedFrom, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        imageView.setImageDrawable(new PicassoDrawable(context, bitmap, drawable, loadedFrom, z, z2));
    }

    static void setPlaceholder(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof AnimationDrawable) {
            ((AnimationDrawable) imageView.getDrawable()).start();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.animating) {
            float fUptimeMillis = (SystemClock.uptimeMillis() - this.startTimeMillis) / FADE_DURATION;
            if (fUptimeMillis >= 1.0f) {
                this.animating = false;
                this.placeholder = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.placeholder;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (this.alpha * fUptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.alpha);
                if (Build.VERSION.SDK_INT <= 10) {
                    invalidateSelf();
                }
            }
        } else {
            super.draw(canvas);
        }
        if (this.debugging) {
            drawDebugIndicator(canvas);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.placeholder;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.alpha = i2;
        Drawable drawable = this.placeholder;
        if (drawable != null) {
            drawable.setAlpha(i2);
        }
        super.setAlpha(i2);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.placeholder;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
