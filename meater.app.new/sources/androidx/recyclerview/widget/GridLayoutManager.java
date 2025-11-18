package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.p004d0.C0289c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    private static final boolean DEBUG = false;
    public static final int DEFAULT_SPAN_COUNT = -1;
    private static final String TAG = "GridLayoutManager";
    int[] mCachedBorders;
    final Rect mDecorInsets;
    boolean mPendingSpanCountChange;
    final SparseIntArray mPreLayoutSpanIndexCache;
    final SparseIntArray mPreLayoutSpanSizeCache;
    View[] mSet;
    int mSpanCount;
    AbstractC0579c mSpanSizeLookup;
    private boolean mUsingSpansToEstimateScrollBarDimensions;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C0577a extends AbstractC0579c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0579c
        public int getSpanIndex(int i2, int i3) {
            return i2 % i3;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0579c
        public int getSpanSize(int i2) {
            return 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static abstract class AbstractC0579c {
        final SparseIntArray mSpanIndexCache = new SparseIntArray();
        final SparseIntArray mSpanGroupIndexCache = new SparseIntArray();
        private boolean mCacheSpanIndices = false;
        private boolean mCacheSpanGroupIndices = false;

        static int findFirstKeyLessThan(SparseIntArray sparseIntArray, int i2) {
            int size = sparseIntArray.size() - 1;
            int i3 = 0;
            while (i3 <= size) {
                int i4 = (i3 + size) >>> 1;
                if (sparseIntArray.keyAt(i4) < i2) {
                    i3 = i4 + 1;
                } else {
                    size = i4 - 1;
                }
            }
            int i5 = i3 - 1;
            if (i5 < 0 || i5 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i5);
        }

        int getCachedSpanGroupIndex(int i2, int i3) {
            if (!this.mCacheSpanGroupIndices) {
                return getSpanGroupIndex(i2, i3);
            }
            int i4 = this.mSpanGroupIndexCache.get(i2, -1);
            if (i4 != -1) {
                return i4;
            }
            int spanGroupIndex = getSpanGroupIndex(i2, i3);
            this.mSpanGroupIndexCache.put(i2, spanGroupIndex);
            return spanGroupIndex;
        }

        int getCachedSpanIndex(int i2, int i3) {
            if (!this.mCacheSpanIndices) {
                return getSpanIndex(i2, i3);
            }
            int i4 = this.mSpanIndexCache.get(i2, -1);
            if (i4 != -1) {
                return i4;
            }
            int spanIndex = getSpanIndex(i2, i3);
            this.mSpanIndexCache.put(i2, spanIndex);
            return spanIndex;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int getSpanGroupIndex(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.mCacheSpanGroupIndices
                r1 = 0
                if (r0 == 0) goto L24
                android.util.SparseIntArray r0 = r6.mSpanGroupIndexCache
                int r0 = findFirstKeyLessThan(r0, r7)
                r2 = -1
                if (r0 == r2) goto L24
                android.util.SparseIntArray r2 = r6.mSpanGroupIndexCache
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.getCachedSpanIndex(r0, r8)
                int r0 = r6.getSpanSize(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L27
                int r2 = r2 + 1
                goto L26
            L24:
                r2 = 0
                r3 = 0
            L26:
                r4 = 0
            L27:
                int r0 = r6.getSpanSize(r7)
            L2b:
                if (r3 >= r7) goto L40
                int r5 = r6.getSpanSize(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L38
                int r2 = r2 + 1
                r4 = 0
                goto L3d
            L38:
                if (r4 <= r8) goto L3d
                int r2 = r2 + 1
                r4 = r5
            L3d:
                int r3 = r3 + 1
                goto L2b
            L40:
                int r4 = r4 + r0
                if (r4 <= r8) goto L45
                int r2 = r2 + 1
            L45:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.AbstractC0579c.getSpanGroupIndex(int, int):int");
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:17:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int getSpanIndex(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.getSpanSize(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.mCacheSpanIndices
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.mSpanIndexCache
                int r2 = findFirstKeyLessThan(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.mSpanIndexCache
                int r3 = r3.get(r2)
                int r4 = r5.getSpanSize(r2)
                int r3 = r3 + r4
                goto L30
            L20:
                r2 = 0
                r3 = 0
            L22:
                if (r2 >= r6) goto L33
                int r4 = r5.getSpanSize(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L2d
                r3 = 0
                goto L30
            L2d:
                if (r3 <= r7) goto L30
                r3 = r4
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r3
                if (r0 > r7) goto L37
                return r3
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.AbstractC0579c.getSpanIndex(int, int):int");
        }

        public abstract int getSpanSize(int i2);

        public void invalidateSpanGroupIndexCache() {
            this.mSpanGroupIndexCache.clear();
        }

        public void invalidateSpanIndexCache() {
            this.mSpanIndexCache.clear();
        }

        public boolean isSpanGroupIndexCacheEnabled() {
            return this.mCacheSpanGroupIndices;
        }

        public boolean isSpanIndexCacheEnabled() {
            return this.mCacheSpanIndices;
        }

        public void setSpanGroupIndexCacheEnabled(boolean z) {
            if (!z) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanGroupIndices = z;
        }

        public void setSpanIndexCacheEnabled(boolean z) {
            if (!z) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanIndices = z;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new C0577a();
        this.mDecorInsets = new Rect();
        setSpanCount(RecyclerView.AbstractC0602o.getProperties(context, attributeSet, i2, i3).f3961b);
    }

    private void assignSpans(RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z, int i2, boolean z) {
        int i3;
        int i4;
        int i5 = 0;
        int i6 = -1;
        if (z) {
            i6 = i2;
            i3 = 0;
            i4 = 1;
        } else {
            i3 = i2 - 1;
            i4 = -1;
        }
        while (i3 != i6) {
            View view = this.mSet[i3];
            C0578b c0578b = (C0578b) view.getLayoutParams();
            int spanSize = getSpanSize(c0609v, c0613z, getPosition(view));
            c0578b.f3914f = spanSize;
            c0578b.f3913e = i5;
            i5 += spanSize;
            i3 += i4;
        }
    }

    private void cachePreLayoutSpanMapping() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            C0578b c0578b = (C0578b) getChildAt(i2).getLayoutParams();
            int iM4238a = c0578b.m4238a();
            this.mPreLayoutSpanSizeCache.put(iM4238a, c0578b.m4167f());
            this.mPreLayoutSpanIndexCache.put(iM4238a, c0578b.m4166e());
        }
    }

    private void calculateItemBorders(int i2) {
        this.mCachedBorders = calculateItemBorders(this.mCachedBorders, this.mSpanCount, i2);
    }

    private void clearPreLayoutSpanMappingCache() {
        this.mPreLayoutSpanSizeCache.clear();
        this.mPreLayoutSpanIndexCache.clear();
    }

    private int computeScrollOffsetWithSpanInfo(RecyclerView.C0613z c0613z) {
        if (getChildCount() != 0 && c0613z.m4306b() != 0) {
            ensureLayoutState();
            boolean zIsSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
            View viewFindFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!zIsSmoothScrollbarEnabled, true);
            View viewFindFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!zIsSmoothScrollbarEnabled, true);
            if (viewFindFirstVisibleChildClosestToStart != null && viewFindFirstVisibleChildClosestToEnd != null) {
                int cachedSpanGroupIndex = this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToStart), this.mSpanCount);
                int cachedSpanGroupIndex2 = this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToEnd), this.mSpanCount);
                int iMax = this.mShouldReverseLayout ? Math.max(0, ((this.mSpanSizeLookup.getCachedSpanGroupIndex(c0613z.m4306b() - 1, this.mSpanCount) + 1) - Math.max(cachedSpanGroupIndex, cachedSpanGroupIndex2)) - 1) : Math.max(0, Math.min(cachedSpanGroupIndex, cachedSpanGroupIndex2));
                if (zIsSmoothScrollbarEnabled) {
                    return Math.round((iMax * (Math.abs(this.mOrientationHelper.mo4533d(viewFindFirstVisibleChildClosestToEnd) - this.mOrientationHelper.mo4536g(viewFindFirstVisibleChildClosestToStart)) / ((this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToEnd), this.mSpanCount) - this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToStart), this.mSpanCount)) + 1))) + (this.mOrientationHelper.mo4542m() - this.mOrientationHelper.mo4536g(viewFindFirstVisibleChildClosestToStart)));
                }
                return iMax;
            }
        }
        return 0;
    }

    private int computeScrollRangeWithSpanInfo(RecyclerView.C0613z c0613z) {
        if (getChildCount() != 0 && c0613z.m4306b() != 0) {
            ensureLayoutState();
            View viewFindFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled(), true);
            View viewFindFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled(), true);
            if (viewFindFirstVisibleChildClosestToStart != null && viewFindFirstVisibleChildClosestToEnd != null) {
                if (!isSmoothScrollbarEnabled()) {
                    return this.mSpanSizeLookup.getCachedSpanGroupIndex(c0613z.m4306b() - 1, this.mSpanCount) + 1;
                }
                int iMo4533d = this.mOrientationHelper.mo4533d(viewFindFirstVisibleChildClosestToEnd) - this.mOrientationHelper.mo4536g(viewFindFirstVisibleChildClosestToStart);
                int cachedSpanGroupIndex = this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToStart), this.mSpanCount);
                return (int) ((iMo4533d / ((this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToEnd), this.mSpanCount) - cachedSpanGroupIndex) + 1)) * (this.mSpanSizeLookup.getCachedSpanGroupIndex(c0613z.m4306b() - 1, this.mSpanCount) + 1));
            }
        }
        return 0;
    }

    private void ensureAnchorIsInCorrectSpan(RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z, LinearLayoutManager.C0581a c0581a, int i2) {
        boolean z = i2 == 1;
        int spanIndex = getSpanIndex(c0609v, c0613z, c0581a.f3919b);
        if (z) {
            while (spanIndex > 0) {
                int i3 = c0581a.f3919b;
                if (i3 <= 0) {
                    return;
                }
                int i4 = i3 - 1;
                c0581a.f3919b = i4;
                spanIndex = getSpanIndex(c0609v, c0613z, i4);
            }
            return;
        }
        int iM4306b = c0613z.m4306b() - 1;
        int i5 = c0581a.f3919b;
        while (i5 < iM4306b) {
            int i6 = i5 + 1;
            int spanIndex2 = getSpanIndex(c0609v, c0613z, i6);
            if (spanIndex2 <= spanIndex) {
                break;
            }
            i5 = i6;
            spanIndex = spanIndex2;
        }
        c0581a.f3919b = i5;
    }

    private void ensureViewSet() {
        View[] viewArr = this.mSet;
        if (viewArr == null || viewArr.length != this.mSpanCount) {
            this.mSet = new View[this.mSpanCount];
        }
    }

    private int getSpanGroupIndex(RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z, int i2) {
        if (!c0613z.m4309e()) {
            return this.mSpanSizeLookup.getCachedSpanGroupIndex(i2, this.mSpanCount);
        }
        int iM4279f = c0609v.m4279f(i2);
        if (iM4279f != -1) {
            return this.mSpanSizeLookup.getCachedSpanGroupIndex(iM4279f, this.mSpanCount);
        }
        Log.w(TAG, "Cannot find span size for pre layout position. " + i2);
        return 0;
    }

    private int getSpanIndex(RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z, int i2) {
        if (!c0613z.m4309e()) {
            return this.mSpanSizeLookup.getCachedSpanIndex(i2, this.mSpanCount);
        }
        int i3 = this.mPreLayoutSpanIndexCache.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int iM4279f = c0609v.m4279f(i2);
        if (iM4279f != -1) {
            return this.mSpanSizeLookup.getCachedSpanIndex(iM4279f, this.mSpanCount);
        }
        Log.w(TAG, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 0;
    }

    private int getSpanSize(RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z, int i2) {
        if (!c0613z.m4309e()) {
            return this.mSpanSizeLookup.getSpanSize(i2);
        }
        int i3 = this.mPreLayoutSpanSizeCache.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int iM4279f = c0609v.m4279f(i2);
        if (iM4279f != -1) {
            return this.mSpanSizeLookup.getSpanSize(iM4279f);
        }
        Log.w(TAG, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 1;
    }

    private void guessMeasurement(float f2, int i2) {
        calculateItemBorders(Math.max(Math.round(f2 * this.mSpanCount), i2));
    }

    private void measureChild(View view, int i2, boolean z) {
        int childMeasureSpec;
        int childMeasureSpec2;
        C0578b c0578b = (C0578b) view.getLayoutParams();
        Rect rect = c0578b.f3965b;
        int i3 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0578b).topMargin + ((ViewGroup.MarginLayoutParams) c0578b).bottomMargin;
        int i4 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0578b).leftMargin + ((ViewGroup.MarginLayoutParams) c0578b).rightMargin;
        int spaceForSpanRange = getSpaceForSpanRange(c0578b.f3913e, c0578b.f3914f);
        if (this.mOrientation == 1) {
            childMeasureSpec2 = RecyclerView.AbstractC0602o.getChildMeasureSpec(spaceForSpanRange, i2, i4, ((ViewGroup.MarginLayoutParams) c0578b).width, false);
            childMeasureSpec = RecyclerView.AbstractC0602o.getChildMeasureSpec(this.mOrientationHelper.mo4543n(), getHeightMode(), i3, ((ViewGroup.MarginLayoutParams) c0578b).height, true);
        } else {
            int childMeasureSpec3 = RecyclerView.AbstractC0602o.getChildMeasureSpec(spaceForSpanRange, i2, i3, ((ViewGroup.MarginLayoutParams) c0578b).height, false);
            int childMeasureSpec4 = RecyclerView.AbstractC0602o.getChildMeasureSpec(this.mOrientationHelper.mo4543n(), getWidthMode(), i4, ((ViewGroup.MarginLayoutParams) c0578b).width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        measureChildWithDecorationsAndMargin(view, childMeasureSpec2, childMeasureSpec, z);
    }

    private void measureChildWithDecorationsAndMargin(View view, int i2, int i3, boolean z) {
        RecyclerView.C0603p c0603p = (RecyclerView.C0603p) view.getLayoutParams();
        if (z ? shouldReMeasureChild(view, i2, i3, c0603p) : shouldMeasureChild(view, i2, i3, c0603p)) {
            view.measure(i2, i3);
        }
    }

    private void updateMeasurements() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        calculateItemBorders(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public boolean checkLayoutParams(RecyclerView.C0603p c0603p) {
        return c0603p instanceof C0578b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void collectPrefetchPositionsForLayoutState(RecyclerView.C0613z c0613z, LinearLayoutManager.C0583c c0583c, RecyclerView.AbstractC0602o.c cVar) {
        int spanSize = this.mSpanCount;
        for (int i2 = 0; i2 < this.mSpanCount && c0583c.m4181c(c0613z) && spanSize > 0; i2++) {
            int i3 = c0583c.f3930d;
            cVar.mo4237a(i3, Math.max(0, c0583c.f3933g));
            spanSize -= this.mSpanSizeLookup.getSpanSize(i3);
            c0583c.f3930d += c0583c.f3931e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public int computeHorizontalScrollOffset(RecyclerView.C0613z c0613z) {
        return this.mUsingSpansToEstimateScrollBarDimensions ? computeScrollOffsetWithSpanInfo(c0613z) : super.computeHorizontalScrollOffset(c0613z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public int computeHorizontalScrollRange(RecyclerView.C0613z c0613z) {
        return this.mUsingSpansToEstimateScrollBarDimensions ? computeScrollRangeWithSpanInfo(c0613z) : super.computeHorizontalScrollRange(c0613z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public int computeVerticalScrollOffset(RecyclerView.C0613z c0613z) {
        return this.mUsingSpansToEstimateScrollBarDimensions ? computeScrollOffsetWithSpanInfo(c0613z) : super.computeVerticalScrollOffset(c0613z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public int computeVerticalScrollRange(RecyclerView.C0613z c0613z) {
        return this.mUsingSpansToEstimateScrollBarDimensions ? computeScrollRangeWithSpanInfo(c0613z) : super.computeVerticalScrollRange(c0613z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View findReferenceChild(RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z, int i2, int i3, int i4) {
        ensureLayoutState();
        int iMo4542m = this.mOrientationHelper.mo4542m();
        int iMo4538i = this.mOrientationHelper.mo4538i();
        int i5 = i3 > i2 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            int position = getPosition(childAt);
            if (position >= 0 && position < i4 && getSpanIndex(c0609v, c0613z, position) == 0) {
                if (((RecyclerView.C0603p) childAt.getLayoutParams()).m4240c()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.mo4536g(childAt) < iMo4538i && this.mOrientationHelper.mo4533d(childAt) >= iMo4542m) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i2 += i5;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public RecyclerView.C0603p generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new C0578b(-2, -1) : new C0578b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public RecyclerView.C0603p generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C0578b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public int getColumnCountForAccessibility(RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z) {
        if (this.mOrientation == 1) {
            return this.mSpanCount;
        }
        if (c0613z.m4306b() < 1) {
            return 0;
        }
        return getSpanGroupIndex(c0609v, c0613z, c0613z.m4306b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public int getRowCountForAccessibility(RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z) {
        if (this.mOrientation == 0) {
            return this.mSpanCount;
        }
        if (c0613z.m4306b() < 1) {
            return 0;
        }
        return getSpanGroupIndex(c0609v, c0613z, c0613z.m4306b() - 1) + 1;
    }

    int getSpaceForSpanRange(int i2, int i3) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.mCachedBorders;
            return iArr[i3 + i2] - iArr[i2];
        }
        int[] iArr2 = this.mCachedBorders;
        int i4 = this.mSpanCount;
        return iArr2[i4 - i2] - iArr2[(i4 - i2) - i3];
    }

    public int getSpanCount() {
        return this.mSpanCount;
    }

    public AbstractC0579c getSpanSizeLookup() {
        return this.mSpanSizeLookup;
    }

    public boolean isUsingSpansToEstimateScrollbarDimensions() {
        return this.mUsingSpansToEstimateScrollBarDimensions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0219  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v19 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void layoutChunk(androidx.recyclerview.widget.RecyclerView.C0609v r18, androidx.recyclerview.widget.RecyclerView.C0613z r19, androidx.recyclerview.widget.LinearLayoutManager.C0583c r20, androidx.recyclerview.widget.LinearLayoutManager.C0582b r21) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.layoutChunk(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void onAnchorReady(RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z, LinearLayoutManager.C0581a c0581a, int i2) {
        super.onAnchorReady(c0609v, c0613z, c0581a, i2);
        updateMeasurements();
        if (c0613z.m4306b() > 0 && !c0613z.m4309e()) {
            ensureAnchorIsInCorrectSpan(c0609v, c0613z, c0581a, i2);
        }
        ensureViewSet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
    
        if (r13 == (r2 > r15)) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.C0609v r26, androidx.recyclerview.widget.RecyclerView.C0613z r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z, View view, C0289c c0289c) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0578b)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, c0289c);
            return;
        }
        C0578b c0578b = (C0578b) layoutParams;
        int spanGroupIndex = getSpanGroupIndex(c0609v, c0613z, c0578b.m4238a());
        if (this.mOrientation == 0) {
            c0289c.m1975b0(C0289c.c.m2017f(c0578b.m4166e(), c0578b.m4167f(), spanGroupIndex, 1, false, false));
        } else {
            c0289c.m1975b0(C0289c.c.m2017f(spanGroupIndex, 1, c0578b.m4166e(), c0578b.m4167f(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void onItemsAdded(RecyclerView recyclerView, int i2, int i3) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void onItemsChanged(RecyclerView recyclerView) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void onItemsMoved(RecyclerView recyclerView, int i2, int i3, int i4) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void onItemsRemoved(RecyclerView recyclerView, int i2, int i3) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void onItemsUpdated(RecyclerView recyclerView, int i2, int i3, Object obj) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void onLayoutChildren(RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z) {
        if (c0613z.m4309e()) {
            cachePreLayoutSpanMapping();
        }
        super.onLayoutChildren(c0609v, c0613z);
        clearPreLayoutSpanMappingCache();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void onLayoutCompleted(RecyclerView.C0613z c0613z) {
        super.onLayoutCompleted(c0613z);
        this.mPendingSpanCountChange = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public int scrollHorizontallyBy(int i2, RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollHorizontallyBy(i2, c0609v, c0613z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public int scrollVerticallyBy(int i2, RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollVerticallyBy(i2, c0609v, c0613z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void setMeasuredDimension(Rect rect, int i2, int i3) {
        int iChooseSize;
        int iChooseSize2;
        if (this.mCachedBorders == null) {
            super.setMeasuredDimension(rect, i2, i3);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            iChooseSize2 = RecyclerView.AbstractC0602o.chooseSize(i3, rect.height() + paddingTop, getMinimumHeight());
            int[] iArr = this.mCachedBorders;
            iChooseSize = RecyclerView.AbstractC0602o.chooseSize(i2, iArr[iArr.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.AbstractC0602o.chooseSize(i2, rect.width() + paddingLeft, getMinimumWidth());
            int[] iArr2 = this.mCachedBorders;
            iChooseSize2 = RecyclerView.AbstractC0602o.chooseSize(i3, iArr2[iArr2.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    public void setSpanCount(int i2) {
        if (i2 == this.mSpanCount) {
            return;
        }
        this.mPendingSpanCountChange = true;
        if (i2 >= 1) {
            this.mSpanCount = i2;
            this.mSpanSizeLookup.invalidateSpanIndexCache();
            requestLayout();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i2);
        }
    }

    public void setSpanSizeLookup(AbstractC0579c abstractC0579c) {
        this.mSpanSizeLookup = abstractC0579c;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    public void setUsingSpansToEstimateScrollbarDimensions(boolean z) {
        this.mUsingSpansToEstimateScrollBarDimensions = z;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.mPendingSpanCountChange;
    }

    static int[] calculateItemBorders(int[] iArr, int i2, int i3) {
        int i4;
        if (iArr == null || iArr.length != i2 + 1 || iArr[iArr.length - 1] != i3) {
            iArr = new int[i2 + 1];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i3 / i2;
        int i7 = i3 % i2;
        int i8 = 0;
        for (int i9 = 1; i9 <= i2; i9++) {
            i5 += i7;
            if (i5 <= 0 || i2 - i5 >= i7) {
                i4 = i6;
            } else {
                i4 = i6 + 1;
                i5 -= i2;
            }
            i8 += i4;
            iArr[i9] = i8;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public RecyclerView.C0603p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0578b((ViewGroup.MarginLayoutParams) layoutParams) : new C0578b(layoutParams);
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static class C0578b extends RecyclerView.C0603p {

        /* renamed from: e */
        int f3913e;

        /* renamed from: f */
        int f3914f;

        public C0578b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3913e = -1;
            this.f3914f = 0;
        }

        /* renamed from: e */
        public int m4166e() {
            return this.f3913e;
        }

        /* renamed from: f */
        public int m4167f() {
            return this.f3914f;
        }

        public C0578b(int i2, int i3) {
            super(i2, i3);
            this.f3913e = -1;
            this.f3914f = 0;
        }

        public C0578b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3913e = -1;
            this.f3914f = 0;
        }

        public C0578b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3913e = -1;
            this.f3914f = 0;
        }
    }

    public GridLayoutManager(Context context, int i2) {
        super(context);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new C0577a();
        this.mDecorInsets = new Rect();
        setSpanCount(i2);
    }

    public GridLayoutManager(Context context, int i2, int i3, boolean z) {
        super(context, i3, z);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new C0577a();
        this.mDecorInsets = new Rect();
        setSpanCount(i2);
    }
}
