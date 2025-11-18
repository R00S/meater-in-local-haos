package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LinearSmoothScroller.java */
/* renamed from: androidx.recyclerview.widget.j */
/* loaded from: classes.dex */
public class C0629j extends RecyclerView.AbstractC0612y {
    private static final boolean DEBUG = false;
    private static final float MILLISECONDS_PER_INCH = 25.0f;
    public static final int SNAP_TO_ANY = 0;
    public static final int SNAP_TO_END = 1;
    public static final int SNAP_TO_START = -1;
    private static final float TARGET_SEEK_EXTRA_SCROLL_RATIO = 1.2f;
    private static final int TARGET_SEEK_SCROLL_DISTANCE_PX = 10000;
    private final DisplayMetrics mDisplayMetrics;
    private float mMillisPerPixel;
    protected PointF mTargetVector;
    protected final LinearInterpolator mLinearInterpolator = new LinearInterpolator();
    protected final DecelerateInterpolator mDecelerateInterpolator = new DecelerateInterpolator();
    private boolean mHasCalculatedMillisPerPixel = false;
    protected int mInterimTargetDx = 0;
    protected int mInterimTargetDy = 0;

    public C0629j(Context context) {
        this.mDisplayMetrics = context.getResources().getDisplayMetrics();
    }

    private int clampApplyScroll(int i2, int i3) {
        int i4 = i2 - i3;
        if (i2 * i4 <= 0) {
            return 0;
        }
        return i4;
    }

    private float getSpeedPerPixel() {
        if (!this.mHasCalculatedMillisPerPixel) {
            this.mMillisPerPixel = calculateSpeedPerPixel(this.mDisplayMetrics);
            this.mHasCalculatedMillisPerPixel = true;
        }
        return this.mMillisPerPixel;
    }

    public int calculateDtToFit(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 != 0) {
            if (i6 == 1) {
                return i5 - i3;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i7 = i4 - i2;
        if (i7 > 0) {
            return i7;
        }
        int i8 = i5 - i3;
        if (i8 < 0) {
            return i8;
        }
        return 0;
    }

    public int calculateDxToMakeVisible(View view, int i2) {
        RecyclerView.AbstractC0602o layoutManager = getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            return 0;
        }
        RecyclerView.C0603p c0603p = (RecyclerView.C0603p) view.getLayoutParams();
        return calculateDtToFit(layoutManager.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) c0603p).leftMargin, layoutManager.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) c0603p).rightMargin, layoutManager.getPaddingLeft(), layoutManager.getWidth() - layoutManager.getPaddingRight(), i2);
    }

    public int calculateDyToMakeVisible(View view, int i2) {
        RecyclerView.AbstractC0602o layoutManager = getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollVertically()) {
            return 0;
        }
        RecyclerView.C0603p c0603p = (RecyclerView.C0603p) view.getLayoutParams();
        return calculateDtToFit(layoutManager.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) c0603p).topMargin, layoutManager.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) c0603p).bottomMargin, layoutManager.getPaddingTop(), layoutManager.getHeight() - layoutManager.getPaddingBottom(), i2);
    }

    protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return MILLISECONDS_PER_INCH / displayMetrics.densityDpi;
    }

    protected int calculateTimeForDeceleration(int i2) {
        double dCalculateTimeForScrolling = calculateTimeForScrolling(i2);
        Double.isNaN(dCalculateTimeForScrolling);
        return (int) Math.ceil(dCalculateTimeForScrolling / 0.3356d);
    }

    protected int calculateTimeForScrolling(int i2) {
        return (int) Math.ceil(Math.abs(i2) * getSpeedPerPixel());
    }

    protected int getHorizontalSnapPreference() {
        PointF pointF = this.mTargetVector;
        if (pointF != null) {
            float f2 = pointF.x;
            if (f2 != 0.0f) {
                return f2 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    protected int getVerticalSnapPreference() {
        PointF pointF = this.mTargetVector;
        if (pointF != null) {
            float f2 = pointF.y;
            if (f2 != 0.0f) {
                return f2 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0612y
    protected void onSeekTargetStep(int i2, int i3, RecyclerView.C0613z c0613z, RecyclerView.AbstractC0612y.a aVar) {
        if (getChildCount() == 0) {
            stop();
            return;
        }
        this.mInterimTargetDx = clampApplyScroll(this.mInterimTargetDx, i2);
        int iClampApplyScroll = clampApplyScroll(this.mInterimTargetDy, i3);
        this.mInterimTargetDy = iClampApplyScroll;
        if (this.mInterimTargetDx == 0 && iClampApplyScroll == 0) {
            updateActionForInterimTarget(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0612y
    protected void onStart() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0612y
    protected void onStop() {
        this.mInterimTargetDy = 0;
        this.mInterimTargetDx = 0;
        this.mTargetVector = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0612y
    protected void onTargetFound(View view, RecyclerView.C0613z c0613z, RecyclerView.AbstractC0612y.a aVar) {
        int iCalculateDxToMakeVisible = calculateDxToMakeVisible(view, getHorizontalSnapPreference());
        int iCalculateDyToMakeVisible = calculateDyToMakeVisible(view, getVerticalSnapPreference());
        int iCalculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((iCalculateDxToMakeVisible * iCalculateDxToMakeVisible) + (iCalculateDyToMakeVisible * iCalculateDyToMakeVisible)));
        if (iCalculateTimeForDeceleration > 0) {
            aVar.m4304d(-iCalculateDxToMakeVisible, -iCalculateDyToMakeVisible, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
        }
    }

    protected void updateActionForInterimTarget(RecyclerView.AbstractC0612y.a aVar) {
        PointF pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(getTargetPosition());
        if (pointFComputeScrollVectorForPosition == null || (pointFComputeScrollVectorForPosition.x == 0.0f && pointFComputeScrollVectorForPosition.y == 0.0f)) {
            aVar.m4302b(getTargetPosition());
            stop();
            return;
        }
        normalize(pointFComputeScrollVectorForPosition);
        this.mTargetVector = pointFComputeScrollVectorForPosition;
        this.mInterimTargetDx = (int) (pointFComputeScrollVectorForPosition.x * 10000.0f);
        this.mInterimTargetDy = (int) (pointFComputeScrollVectorForPosition.y * 10000.0f);
        aVar.m4304d((int) (this.mInterimTargetDx * TARGET_SEEK_EXTRA_SCROLL_RATIO), (int) (this.mInterimTargetDy * TARGET_SEEK_EXTRA_SCROLL_RATIO), (int) (calculateTimeForScrolling(TARGET_SEEK_SCROLL_DISTANCE_PX) * TARGET_SEEK_EXTRA_SCROLL_RATIO), this.mLinearInterpolator);
    }
}
