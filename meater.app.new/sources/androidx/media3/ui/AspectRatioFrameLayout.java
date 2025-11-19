package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import e3.C3183D;

/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: B, reason: collision with root package name */
    private final c f28067B;

    /* renamed from: C, reason: collision with root package name */
    private float f28068C;

    /* renamed from: D, reason: collision with root package name */
    private int f28069D;

    public interface b {
    }

    private final class c implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        private float f28070B;

        /* renamed from: C, reason: collision with root package name */
        private float f28071C;

        /* renamed from: D, reason: collision with root package name */
        private boolean f28072D;

        /* renamed from: E, reason: collision with root package name */
        private boolean f28073E;

        private c() {
        }

        public void a(float f10, float f11, boolean z10) {
            this.f28070B = f10;
            this.f28071C = f11;
            this.f28072D = z10;
            if (this.f28073E) {
                return;
            }
            this.f28073E = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f28073E = false;
            AspectRatioFrameLayout.a(AspectRatioFrameLayout.this);
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28069D = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C3183D.f40358a, 0, 0);
            try {
                this.f28069D = typedArrayObtainStyledAttributes.getInt(C3183D.f40360b, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f28067B = new c();
    }

    static /* synthetic */ b a(AspectRatioFrameLayout aspectRatioFrameLayout) {
        aspectRatioFrameLayout.getClass();
        return null;
    }

    public int getResizeMode() {
        return this.f28069D;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f28068C <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = f12 / f13;
        float f15 = (this.f28068C / f14) - 1.0f;
        if (Math.abs(f15) <= 0.01f) {
            this.f28067B.a(this.f28068C, f14, false);
            return;
        }
        int i12 = this.f28069D;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    f10 = this.f28068C;
                } else if (i12 == 4) {
                    if (f15 > 0.0f) {
                        f10 = this.f28068C;
                    } else {
                        f11 = this.f28068C;
                    }
                }
                measuredWidth = (int) (f13 * f10);
            } else {
                f11 = this.f28068C;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f15 > 0.0f) {
            f11 = this.f28068C;
            measuredHeight = (int) (f12 / f11);
        } else {
            f10 = this.f28068C;
            measuredWidth = (int) (f13 * f10);
        }
        this.f28067B.a(this.f28068C, f14, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f10) {
        if (this.f28068C != f10) {
            this.f28068C = f10;
            requestLayout();
        }
    }

    public void setResizeMode(int i10) {
        if (this.f28069D != i10) {
            this.f28069D = i10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(b bVar) {
    }
}
