package p024c.p085v.p086a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.C0311u;

/* compiled from: CircleImageView.java */
/* renamed from: c.v.a.a */
/* loaded from: classes.dex */
class C1018a extends ImageView {

    /* renamed from: f */
    private Animation.AnimationListener f6719f;

    /* renamed from: g */
    int f6720g;

    /* compiled from: CircleImageView.java */
    /* renamed from: c.v.a.a$a */
    private class a extends OvalShape {

        /* renamed from: f */
        private RadialGradient f6721f;

        /* renamed from: g */
        private Paint f6722g = new Paint();

        a(int i2) {
            C1018a.this.f6720g = i2;
            m6479b((int) rect().width());
        }

        /* renamed from: b */
        private void m6479b(int i2) {
            float f2 = i2 / 2;
            RadialGradient radialGradient = new RadialGradient(f2, f2, C1018a.this.f6720g, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f6721f = radialGradient;
            this.f6722g.setShader(radialGradient);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = C1018a.this.getWidth() / 2;
            float height = C1018a.this.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.f6722g);
            canvas.drawCircle(width, height, r0 - C1018a.this.f6720g, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f2, float f3) {
            super.onResize(f2, f3);
            m6479b((int) f2);
        }
    }

    C1018a(Context context, int i2) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f2 = getContext().getResources().getDisplayMetrics().density;
        int i3 = (int) (1.75f * f2);
        int i4 = (int) (0.0f * f2);
        this.f6720g = (int) (3.5f * f2);
        if (m6477a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C0311u.m2147q0(this, f2 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new a(this.f6720g));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f6720g, i4, i3, 503316480);
            int i5 = this.f6720g;
            setPadding(i5, i5, i5, i5);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i2);
        C0311u.m2139m0(this, shapeDrawable);
    }

    /* renamed from: a */
    private boolean m6477a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    /* renamed from: b */
    public void m6478b(Animation.AnimationListener animationListener) {
        this.f6719f = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f6719f;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f6719f;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (m6477a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f6720g * 2), getMeasuredHeight() + (this.f6720g * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i2);
        }
    }
}
