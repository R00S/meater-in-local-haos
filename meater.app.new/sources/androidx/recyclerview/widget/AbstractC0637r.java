package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SnapHelper.java */
/* renamed from: androidx.recyclerview.widget.r */
/* loaded from: classes.dex */
public abstract class AbstractC0637r extends RecyclerView.AbstractC0605r {
    static final float MILLISECONDS_PER_INCH = 100.0f;
    private Scroller mGravityScroller;
    RecyclerView mRecyclerView;
    private final RecyclerView.AbstractC0607t mScrollListener = new a();

    /* compiled from: SnapHelper.java */
    /* renamed from: androidx.recyclerview.widget.r$a */
    class a extends RecyclerView.AbstractC0607t {

        /* renamed from: a */
        boolean f4214a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0607t
        public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
            super.onScrollStateChanged(recyclerView, i2);
            if (i2 == 0 && this.f4214a) {
                this.f4214a = false;
                AbstractC0637r.this.snapToTargetExistingView();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0607t
        public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
            if (i2 == 0 && i3 == 0) {
                return;
            }
            this.f4214a = true;
        }
    }

    /* compiled from: SnapHelper.java */
    /* renamed from: androidx.recyclerview.widget.r$b */
    class b extends C0629j {
        b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C0629j
        protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return AbstractC0637r.MILLISECONDS_PER_INCH / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C0629j, androidx.recyclerview.widget.RecyclerView.AbstractC0612y
        protected void onTargetFound(View view, RecyclerView.C0613z c0613z, RecyclerView.AbstractC0612y.a aVar) {
            AbstractC0637r abstractC0637r = AbstractC0637r.this;
            RecyclerView recyclerView = abstractC0637r.mRecyclerView;
            if (recyclerView == null) {
                return;
            }
            int[] iArrCalculateDistanceToFinalSnap = abstractC0637r.calculateDistanceToFinalSnap(recyclerView.getLayoutManager(), view);
            int i2 = iArrCalculateDistanceToFinalSnap[0];
            int i3 = iArrCalculateDistanceToFinalSnap[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i2), Math.abs(i3)));
            if (iCalculateTimeForDeceleration > 0) {
                aVar.m4304d(i2, i3, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    private void destroyCallbacks() {
        this.mRecyclerView.removeOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(null);
    }

    private void setupCallbacks() throws IllegalStateException {
        if (this.mRecyclerView.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.mRecyclerView.addOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(this);
    }

    private boolean snapFromFling(RecyclerView.AbstractC0602o abstractC0602o, int i2, int i3) {
        RecyclerView.AbstractC0612y abstractC0612yCreateScroller;
        int iFindTargetSnapPosition;
        if (!(abstractC0602o instanceof RecyclerView.AbstractC0612y.b) || (abstractC0612yCreateScroller = createScroller(abstractC0602o)) == null || (iFindTargetSnapPosition = findTargetSnapPosition(abstractC0602o, i2, i3)) == -1) {
            return false;
        }
        abstractC0612yCreateScroller.setTargetPosition(iFindTargetSnapPosition);
        abstractC0602o.startSmoothScroll(abstractC0612yCreateScroller);
        return true;
    }

    public void attachToRecyclerView(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            destroyCallbacks();
        }
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            setupCallbacks();
            this.mGravityScroller = new Scroller(this.mRecyclerView.getContext(), new DecelerateInterpolator());
            snapToTargetExistingView();
        }
    }

    public abstract int[] calculateDistanceToFinalSnap(RecyclerView.AbstractC0602o abstractC0602o, View view);

    public int[] calculateScrollDistance(int i2, int i3) {
        this.mGravityScroller.fling(0, 0, i2, i3, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.mGravityScroller.getFinalX(), this.mGravityScroller.getFinalY()};
    }

    protected RecyclerView.AbstractC0612y createScroller(RecyclerView.AbstractC0602o abstractC0602o) {
        return createSnapScroller(abstractC0602o);
    }

    @Deprecated
    protected C0629j createSnapScroller(RecyclerView.AbstractC0602o abstractC0602o) {
        if (abstractC0602o instanceof RecyclerView.AbstractC0612y.b) {
            return new b(this.mRecyclerView.getContext());
        }
        return null;
    }

    public abstract View findSnapView(RecyclerView.AbstractC0602o abstractC0602o);

    public abstract int findTargetSnapPosition(RecyclerView.AbstractC0602o abstractC0602o, int i2, int i3);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0605r
    public boolean onFling(int i2, int i3) {
        RecyclerView.AbstractC0602o layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager == null || this.mRecyclerView.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.mRecyclerView.getMinFlingVelocity();
        return (Math.abs(i3) > minFlingVelocity || Math.abs(i2) > minFlingVelocity) && snapFromFling(layoutManager, i2, i3);
    }

    void snapToTargetExistingView() {
        RecyclerView.AbstractC0602o layoutManager;
        View viewFindSnapView;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewFindSnapView = findSnapView(layoutManager)) == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, viewFindSnapView);
        if (iArrCalculateDistanceToFinalSnap[0] == 0 && iArrCalculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.mRecyclerView.smoothScrollBy(iArrCalculateDistanceToFinalSnap[0], iArrCalculateDistanceToFinalSnap[1]);
    }
}
