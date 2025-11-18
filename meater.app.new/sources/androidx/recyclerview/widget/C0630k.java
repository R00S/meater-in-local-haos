package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LinearSnapHelper.java */
/* renamed from: androidx.recyclerview.widget.k */
/* loaded from: classes.dex */
public class C0630k extends AbstractC0637r {
    private static final float INVALID_DISTANCE = 1.0f;
    private AbstractC0633n mHorizontalHelper;
    private AbstractC0633n mVerticalHelper;

    private float computeDistancePerChild(RecyclerView.AbstractC0602o abstractC0602o, AbstractC0633n abstractC0633n) {
        int childCount = abstractC0602o.getChildCount();
        if (childCount == 0) {
            return INVALID_DISTANCE;
        }
        View view = null;
        View view2 = null;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = abstractC0602o.getChildAt(i4);
            int position = abstractC0602o.getPosition(childAt);
            if (position != -1) {
                if (position < i2) {
                    view = childAt;
                    i2 = position;
                }
                if (position > i3) {
                    view2 = childAt;
                    i3 = position;
                }
            }
        }
        if (view == null || view2 == null) {
            return INVALID_DISTANCE;
        }
        int iMax = Math.max(abstractC0633n.mo4533d(view), abstractC0633n.mo4533d(view2)) - Math.min(abstractC0633n.mo4536g(view), abstractC0633n.mo4536g(view2));
        return iMax == 0 ? INVALID_DISTANCE : (iMax * INVALID_DISTANCE) / ((i3 - i2) + 1);
    }

    private int distanceToCenter(RecyclerView.AbstractC0602o abstractC0602o, View view, AbstractC0633n abstractC0633n) {
        return (abstractC0633n.mo4536g(view) + (abstractC0633n.mo4534e(view) / 2)) - (abstractC0633n.mo4542m() + (abstractC0633n.mo4543n() / 2));
    }

    private int estimateNextPositionDiffForFling(RecyclerView.AbstractC0602o abstractC0602o, AbstractC0633n abstractC0633n, int i2, int i3) {
        int[] iArrCalculateScrollDistance = calculateScrollDistance(i2, i3);
        float fComputeDistancePerChild = computeDistancePerChild(abstractC0602o, abstractC0633n);
        if (fComputeDistancePerChild <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArrCalculateScrollDistance[0]) > Math.abs(iArrCalculateScrollDistance[1]) ? iArrCalculateScrollDistance[0] : iArrCalculateScrollDistance[1]) / fComputeDistancePerChild);
    }

    private View findCenterView(RecyclerView.AbstractC0602o abstractC0602o, AbstractC0633n abstractC0633n) {
        int childCount = abstractC0602o.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iMo4542m = abstractC0633n.mo4542m() + (abstractC0633n.mo4543n() / 2);
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = abstractC0602o.getChildAt(i3);
            int iAbs = Math.abs((abstractC0633n.mo4536g(childAt) + (abstractC0633n.mo4534e(childAt) / 2)) - iMo4542m);
            if (iAbs < i2) {
                view = childAt;
                i2 = iAbs;
            }
        }
        return view;
    }

    private AbstractC0633n getHorizontalHelper(RecyclerView.AbstractC0602o abstractC0602o) {
        AbstractC0633n abstractC0633n = this.mHorizontalHelper;
        if (abstractC0633n == null || abstractC0633n.f4207a != abstractC0602o) {
            this.mHorizontalHelper = AbstractC0633n.m4530a(abstractC0602o);
        }
        return this.mHorizontalHelper;
    }

    private AbstractC0633n getVerticalHelper(RecyclerView.AbstractC0602o abstractC0602o) {
        AbstractC0633n abstractC0633n = this.mVerticalHelper;
        if (abstractC0633n == null || abstractC0633n.f4207a != abstractC0602o) {
            this.mVerticalHelper = AbstractC0633n.m4532c(abstractC0602o);
        }
        return this.mVerticalHelper;
    }

    @Override // androidx.recyclerview.widget.AbstractC0637r
    public int[] calculateDistanceToFinalSnap(RecyclerView.AbstractC0602o abstractC0602o, View view) {
        int[] iArr = new int[2];
        if (abstractC0602o.canScrollHorizontally()) {
            iArr[0] = distanceToCenter(abstractC0602o, view, getHorizontalHelper(abstractC0602o));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0602o.canScrollVertically()) {
            iArr[1] = distanceToCenter(abstractC0602o, view, getVerticalHelper(abstractC0602o));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC0637r
    public View findSnapView(RecyclerView.AbstractC0602o abstractC0602o) {
        if (abstractC0602o.canScrollVertically()) {
            return findCenterView(abstractC0602o, getVerticalHelper(abstractC0602o));
        }
        if (abstractC0602o.canScrollHorizontally()) {
            return findCenterView(abstractC0602o, getHorizontalHelper(abstractC0602o));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.AbstractC0637r
    public int findTargetSnapPosition(RecyclerView.AbstractC0602o abstractC0602o, int i2, int i3) {
        int itemCount;
        View viewFindSnapView;
        int position;
        int i4;
        PointF pointFComputeScrollVectorForPosition;
        int iEstimateNextPositionDiffForFling;
        int iEstimateNextPositionDiffForFling2;
        if (!(abstractC0602o instanceof RecyclerView.AbstractC0612y.b) || (itemCount = abstractC0602o.getItemCount()) == 0 || (viewFindSnapView = findSnapView(abstractC0602o)) == null || (position = abstractC0602o.getPosition(viewFindSnapView)) == -1 || (pointFComputeScrollVectorForPosition = ((RecyclerView.AbstractC0612y.b) abstractC0602o).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return -1;
        }
        if (abstractC0602o.canScrollHorizontally()) {
            iEstimateNextPositionDiffForFling = estimateNextPositionDiffForFling(abstractC0602o, getHorizontalHelper(abstractC0602o), i2, 0);
            if (pointFComputeScrollVectorForPosition.x < 0.0f) {
                iEstimateNextPositionDiffForFling = -iEstimateNextPositionDiffForFling;
            }
        } else {
            iEstimateNextPositionDiffForFling = 0;
        }
        if (abstractC0602o.canScrollVertically()) {
            iEstimateNextPositionDiffForFling2 = estimateNextPositionDiffForFling(abstractC0602o, getVerticalHelper(abstractC0602o), 0, i3);
            if (pointFComputeScrollVectorForPosition.y < 0.0f) {
                iEstimateNextPositionDiffForFling2 = -iEstimateNextPositionDiffForFling2;
            }
        } else {
            iEstimateNextPositionDiffForFling2 = 0;
        }
        if (abstractC0602o.canScrollVertically()) {
            iEstimateNextPositionDiffForFling = iEstimateNextPositionDiffForFling2;
        }
        if (iEstimateNextPositionDiffForFling == 0) {
            return -1;
        }
        int i5 = position + iEstimateNextPositionDiffForFling;
        int i6 = i5 >= 0 ? i5 : 0;
        return i6 >= itemCount ? i4 : i6;
    }
}
