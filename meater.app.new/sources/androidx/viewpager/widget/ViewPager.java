package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.content.C0255a;
import androidx.core.view.C0280a;
import androidx.core.view.C0285c0;
import androidx.core.view.C0311u;
import androidx.core.view.InterfaceC0306p;
import androidx.core.view.p004d0.C0289c;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private static final boolean USE_CACHE = false;
    private int mActivePointerId;
    AbstractC0694a mAdapter;
    private List<InterfaceC0688i> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private InterfaceC0689j mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<C0685f> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private C0691l mObserver;
    private int mOffscreenPageLimit;
    private InterfaceC0689j mOnPageChangeListener;
    private List<InterfaceC0689j> mOnPageChangeListeners;
    private int mPageMargin;
    private InterfaceC0690k mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffect mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final C0685f mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    static final int[] LAYOUT_ATTRS = {R.attr.layout_gravity};
    private static final Comparator<C0685f> COMPARATOR = new C0680a();
    private static final Interpolator sInterpolator = new InterpolatorC0681b();
    private static final C0693n sPositionComparator = new C0693n();

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0679a();

        /* renamed from: h */
        int f4413h;

        /* renamed from: i */
        Parcelable f4414i;

        /* renamed from: j */
        ClassLoader f4415j;

        /* renamed from: androidx.viewpager.widget.ViewPager$SavedState$a */
        static class C0679a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0679a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f4413h + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f4413h);
            parcel.writeParcelable(this.f4414i, i2);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? SavedState.class.getClassLoader() : classLoader;
            this.f4413h = parcel.readInt();
            this.f4414i = parcel.readParcelable(classLoader);
            this.f4415j = classLoader;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$a */
    static class C0680a implements Comparator<C0685f> {
        C0680a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C0685f c0685f, C0685f c0685f2) {
            return c0685f.f4420b - c0685f2.f4420b;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$b */
    static class InterpolatorC0681b implements Interpolator {
        InterpolatorC0681b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$c */
    class RunnableC0682c implements Runnable {
        RunnableC0682c() {
        }

        @Override // java.lang.Runnable
        public void run() throws Resources.NotFoundException {
            ViewPager.this.setScrollState(0);
            ViewPager.this.populate();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$d */
    class C0683d implements InterfaceC0306p {

        /* renamed from: a */
        private final Rect f4417a = new Rect();

        C0683d() {
        }

        @Override // androidx.core.view.InterfaceC0306p
        /* renamed from: a */
        public C0285c0 mo363a(View view, C0285c0 c0285c0) {
            C0285c0 c0285c0M2109V = C0311u.m2109V(view, c0285c0);
            if (c0285c0M2109V.m1886n()) {
                return c0285c0M2109V;
            }
            Rect rect = this.f4417a;
            rect.left = c0285c0M2109V.m1882i();
            rect.top = c0285c0M2109V.m1884k();
            rect.right = c0285c0M2109V.m1883j();
            rect.bottom = c0285c0M2109V.m1881h();
            int childCount = ViewPager.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                C0285c0 c0285c0M2126g = C0311u.m2126g(ViewPager.this.getChildAt(i2), c0285c0M2109V);
                rect.left = Math.min(c0285c0M2126g.m1882i(), rect.left);
                rect.top = Math.min(c0285c0M2126g.m1884k(), rect.top);
                rect.right = Math.min(c0285c0M2126g.m1883j(), rect.right);
                rect.bottom = Math.min(c0285c0M2126g.m1881h(), rect.bottom);
            }
            return c0285c0M2109V.m1887o(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.viewpager.widget.ViewPager$e */
    public @interface InterfaceC0684e {
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$f */
    static class C0685f {

        /* renamed from: a */
        Object f4419a;

        /* renamed from: b */
        int f4420b;

        /* renamed from: c */
        boolean f4421c;

        /* renamed from: d */
        float f4422d;

        /* renamed from: e */
        float f4423e;

        C0685f() {
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$h */
    class C0687h extends C0280a {
        C0687h() {
        }

        /* renamed from: n */
        private boolean m4749n() {
            AbstractC0694a abstractC0694a = ViewPager.this.mAdapter;
            return abstractC0694a != null && abstractC0694a.getCount() > 1;
        }

        @Override // androidx.core.view.C0280a
        /* renamed from: f */
        public void mo1857f(View view, AccessibilityEvent accessibilityEvent) {
            AbstractC0694a abstractC0694a;
            super.mo1857f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(m4749n());
            if (accessibilityEvent.getEventType() != 4096 || (abstractC0694a = ViewPager.this.mAdapter) == null) {
                return;
            }
            accessibilityEvent.setItemCount(abstractC0694a.getCount());
            accessibilityEvent.setFromIndex(ViewPager.this.mCurItem);
            accessibilityEvent.setToIndex(ViewPager.this.mCurItem);
        }

        @Override // androidx.core.view.C0280a
        /* renamed from: g */
        public void mo1858g(View view, C0289c c0289c) {
            super.mo1858g(view, c0289c);
            c0289c.m1970Y(ViewPager.class.getName());
            c0289c.m2001r0(m4749n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                c0289c.m1972a(RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                c0289c.m1972a(8192);
            }
        }

        @Override // androidx.core.view.C0280a
        /* renamed from: j */
        public boolean mo1861j(View view, int i2, Bundle bundle) throws Resources.NotFoundException {
            if (super.mo1861j(view, i2, bundle)) {
                return true;
            }
            if (i2 == 4096) {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.mCurItem + 1);
                return true;
            }
            if (i2 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.mCurItem - 1);
            return true;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$i */
    public interface InterfaceC0688i {
        /* renamed from: a */
        void m4750a(ViewPager viewPager, AbstractC0694a abstractC0694a, AbstractC0694a abstractC0694a2);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$j */
    public interface InterfaceC0689j {
        void onPageScrollStateChanged(int i2);

        void onPageScrolled(int i2, float f2, int i3);

        void onPageSelected(int i2);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$k */
    public interface InterfaceC0690k {
        /* renamed from: a */
        void m4751a(View view, float f2);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$l */
    private class C0691l extends DataSetObserver {
        C0691l() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() throws Resources.NotFoundException {
            ViewPager.this.dataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() throws Resources.NotFoundException {
            ViewPager.this.dataSetChanged();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$m */
    public static class C0692m implements InterfaceC0689j {
        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0689j
        public void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0689j
        public void onPageScrolled(int i2, float f2, int i3) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0689j
        public void onPageSelected(int i2) {
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$n */
    static class C0693n implements Comparator<View> {
        C0693n() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            C0686g c0686g = (C0686g) view.getLayoutParams();
            C0686g c0686g2 = (C0686g) view2.getLayoutParams();
            boolean z = c0686g.f4424a;
            return z != c0686g2.f4424a ? z ? 1 : -1 : c0686g.f4428e - c0686g2.f4428e;
        }
    }

    public ViewPager(Context context) {
        super(context);
        this.mItems = new ArrayList<>();
        this.mTempItem = new C0685f();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new RunnableC0682c();
        this.mScrollState = 0;
        initViewPager();
    }

    private void calculatePageOffsets(C0685f c0685f, int i2, C0685f c0685f2) {
        int i3;
        int i4;
        C0685f c0685f3;
        C0685f c0685f4;
        int count = this.mAdapter.getCount();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? this.mPageMargin / clientWidth : 0.0f;
        if (c0685f2 != null) {
            int i5 = c0685f2.f4420b;
            int i6 = c0685f.f4420b;
            if (i5 < i6) {
                float pageWidth = c0685f2.f4423e + c0685f2.f4422d + f2;
                int i7 = i5 + 1;
                int i8 = 0;
                while (i7 <= c0685f.f4420b && i8 < this.mItems.size()) {
                    C0685f c0685f5 = this.mItems.get(i8);
                    while (true) {
                        c0685f4 = c0685f5;
                        if (i7 <= c0685f4.f4420b || i8 >= this.mItems.size() - 1) {
                            break;
                        }
                        i8++;
                        c0685f5 = this.mItems.get(i8);
                    }
                    while (i7 < c0685f4.f4420b) {
                        pageWidth += this.mAdapter.getPageWidth(i7) + f2;
                        i7++;
                    }
                    c0685f4.f4423e = pageWidth;
                    pageWidth += c0685f4.f4422d + f2;
                    i7++;
                }
            } else if (i5 > i6) {
                int size = this.mItems.size() - 1;
                float pageWidth2 = c0685f2.f4423e;
                while (true) {
                    i5--;
                    if (i5 < c0685f.f4420b || size < 0) {
                        break;
                    }
                    C0685f c0685f6 = this.mItems.get(size);
                    while (true) {
                        c0685f3 = c0685f6;
                        if (i5 >= c0685f3.f4420b || size <= 0) {
                            break;
                        }
                        size--;
                        c0685f6 = this.mItems.get(size);
                    }
                    while (i5 > c0685f3.f4420b) {
                        pageWidth2 -= this.mAdapter.getPageWidth(i5) + f2;
                        i5--;
                    }
                    pageWidth2 -= c0685f3.f4422d + f2;
                    c0685f3.f4423e = pageWidth2;
                }
            }
        }
        int size2 = this.mItems.size();
        float pageWidth3 = c0685f.f4423e;
        int i9 = c0685f.f4420b;
        int i10 = i9 - 1;
        this.mFirstOffset = i9 == 0 ? pageWidth3 : -3.4028235E38f;
        int i11 = count - 1;
        this.mLastOffset = i9 == i11 ? (c0685f.f4422d + pageWidth3) - 1.0f : Float.MAX_VALUE;
        int i12 = i2 - 1;
        while (i12 >= 0) {
            C0685f c0685f7 = this.mItems.get(i12);
            while (true) {
                i4 = c0685f7.f4420b;
                if (i10 <= i4) {
                    break;
                }
                pageWidth3 -= this.mAdapter.getPageWidth(i10) + f2;
                i10--;
            }
            pageWidth3 -= c0685f7.f4422d + f2;
            c0685f7.f4423e = pageWidth3;
            if (i4 == 0) {
                this.mFirstOffset = pageWidth3;
            }
            i12--;
            i10--;
        }
        float pageWidth4 = c0685f.f4423e + c0685f.f4422d + f2;
        int i13 = c0685f.f4420b + 1;
        int i14 = i2 + 1;
        while (i14 < size2) {
            C0685f c0685f8 = this.mItems.get(i14);
            while (true) {
                i3 = c0685f8.f4420b;
                if (i13 >= i3) {
                    break;
                }
                pageWidth4 += this.mAdapter.getPageWidth(i13) + f2;
                i13++;
            }
            if (i3 == i11) {
                this.mLastOffset = (c0685f8.f4422d + pageWidth4) - 1.0f;
            }
            c0685f8.f4423e = pageWidth4;
            pageWidth4 += c0685f8.f4422d + f2;
            i14++;
            i13++;
        }
        this.mNeedCalculatePageOffsets = false;
    }

    private void completeScroll(boolean z) {
        boolean z2 = this.mScrollState == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        pageScrolled(currX);
                    }
                }
            }
        }
        this.mPopulatePending = false;
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            C0685f c0685f = this.mItems.get(i2);
            if (c0685f.f4421c) {
                c0685f.f4421c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                C0311u.m2115a0(this, this.mEndScrollRunnable);
            } else {
                this.mEndScrollRunnable.run();
            }
        }
    }

    private int determineTargetPage(int i2, float f2, int i3, int i4) {
        if (Math.abs(i4) <= this.mFlingDistance || Math.abs(i3) <= this.mMinimumVelocity) {
            i2 += (int) (f2 + (i2 >= this.mCurItem ? 0.4f : 0.6f));
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.mItems.size() <= 0) {
            return i2;
        }
        return Math.max(this.mItems.get(0).f4420b, Math.min(i2, this.mItems.get(r4.size() - 1).f4420b));
    }

    private void dispatchOnPageScrolled(int i2, float f2, int i3) {
        InterfaceC0689j interfaceC0689j = this.mOnPageChangeListener;
        if (interfaceC0689j != null) {
            interfaceC0689j.onPageScrolled(i2, f2, i3);
        }
        List<InterfaceC0689j> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                InterfaceC0689j interfaceC0689j2 = this.mOnPageChangeListeners.get(i4);
                if (interfaceC0689j2 != null) {
                    interfaceC0689j2.onPageScrolled(i2, f2, i3);
                }
            }
        }
        InterfaceC0689j interfaceC0689j3 = this.mInternalPageChangeListener;
        if (interfaceC0689j3 != null) {
            interfaceC0689j3.onPageScrolled(i2, f2, i3);
        }
    }

    private void dispatchOnPageSelected(int i2) {
        InterfaceC0689j interfaceC0689j = this.mOnPageChangeListener;
        if (interfaceC0689j != null) {
            interfaceC0689j.onPageSelected(i2);
        }
        List<InterfaceC0689j> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC0689j interfaceC0689j2 = this.mOnPageChangeListeners.get(i3);
                if (interfaceC0689j2 != null) {
                    interfaceC0689j2.onPageSelected(i2);
                }
            }
        }
        InterfaceC0689j interfaceC0689j3 = this.mInternalPageChangeListener;
        if (interfaceC0689j3 != null) {
            interfaceC0689j3.onPageSelected(i2);
        }
    }

    private void dispatchOnScrollStateChanged(int i2) {
        InterfaceC0689j interfaceC0689j = this.mOnPageChangeListener;
        if (interfaceC0689j != null) {
            interfaceC0689j.onPageScrollStateChanged(i2);
        }
        List<InterfaceC0689j> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC0689j interfaceC0689j2 = this.mOnPageChangeListeners.get(i3);
                if (interfaceC0689j2 != null) {
                    interfaceC0689j2.onPageScrollStateChanged(i2);
                }
            }
        }
        InterfaceC0689j interfaceC0689j3 = this.mInternalPageChangeListener;
        if (interfaceC0689j3 != null) {
            interfaceC0689j3.onPageScrollStateChanged(i2);
        }
    }

    private void enableLayers(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).setLayerType(z ? this.mPageTransformerLayerType : 0, null);
        }
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private C0685f infoForCurrentScrollPosition() {
        int i2;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f3 = clientWidth > 0 ? this.mPageMargin / clientWidth : 0.0f;
        C0685f c0685f = null;
        float f4 = 0.0f;
        int i3 = -1;
        int i4 = 0;
        boolean z = true;
        while (i4 < this.mItems.size()) {
            C0685f c0685f2 = this.mItems.get(i4);
            if (!z && c0685f2.f4420b != (i2 = i3 + 1)) {
                c0685f2 = this.mTempItem;
                c0685f2.f4423e = f2 + f4 + f3;
                c0685f2.f4420b = i2;
                c0685f2.f4422d = this.mAdapter.getPageWidth(i2);
                i4--;
            }
            f2 = c0685f2.f4423e;
            float f5 = c0685f2.f4422d + f2 + f3;
            if (!z && scrollX < f2) {
                return c0685f;
            }
            if (scrollX < f5 || i4 == this.mItems.size() - 1) {
                return c0685f2;
            }
            i3 = c0685f2.f4420b;
            f4 = c0685f2.f4422d;
            i4++;
            c0685f = c0685f2;
            z = false;
        }
        return c0685f;
    }

    private static boolean isDecorView(View view) {
        return view.getClass().getAnnotation(InterfaceC0684e.class) != null;
    }

    private boolean isGutterDrag(float f2, float f3) {
        return (f2 < ((float) this.mGutterSize) && f3 > 0.0f) || (f2 > ((float) (getWidth() - this.mGutterSize)) && f3 < 0.0f);
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.mLastMotionX = motionEvent.getX(i2);
            this.mActivePointerId = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean pageScrolled(int i2) {
        if (this.mItems.size() == 0) {
            if (this.mFirstLayout) {
                return false;
            }
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C0685f c0685fInfoForCurrentScrollPosition = infoForCurrentScrollPosition();
        int clientWidth = getClientWidth();
        int i3 = this.mPageMargin;
        int i4 = clientWidth + i3;
        float f2 = clientWidth;
        int i5 = c0685fInfoForCurrentScrollPosition.f4420b;
        float f3 = ((i2 / f2) - c0685fInfoForCurrentScrollPosition.f4423e) / (c0685fInfoForCurrentScrollPosition.f4422d + (i3 / f2));
        this.mCalledSuper = false;
        onPageScrolled(i5, f3, (int) (i4 * f3));
        if (this.mCalledSuper) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean performDrag(float f2) {
        boolean z;
        boolean z2;
        float f3 = this.mLastMotionX - f2;
        this.mLastMotionX = f2;
        float scrollX = getScrollX() + f3;
        float clientWidth = getClientWidth();
        float f4 = this.mFirstOffset * clientWidth;
        float f5 = this.mLastOffset * clientWidth;
        boolean z3 = false;
        C0685f c0685f = this.mItems.get(0);
        ArrayList<C0685f> arrayList = this.mItems;
        C0685f c0685f2 = arrayList.get(arrayList.size() - 1);
        if (c0685f.f4420b != 0) {
            f4 = c0685f.f4423e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (c0685f2.f4420b != this.mAdapter.getCount() - 1) {
            f5 = c0685f2.f4423e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f4) {
            if (z) {
                this.mLeftEdge.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z2) {
                this.mRightEdge.onPull(Math.abs(scrollX - f5) / clientWidth);
                z3 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.mLastMotionX += scrollX - i2;
        scrollTo(i2, getScrollY());
        pageScrolled(i2);
        return z3;
    }

    private void recomputeScrollPosition(int i2, int i3, int i4, int i5) {
        if (i3 > 0 && !this.mItems.isEmpty()) {
            if (!this.mScroller.isFinished()) {
                this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i3 - getPaddingLeft()) - getPaddingRight()) + i5)) * (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)), getScrollY());
                return;
            }
        }
        C0685f c0685fInfoForPosition = infoForPosition(this.mCurItem);
        int iMin = (int) ((c0685fInfoForPosition != null ? Math.min(c0685fInfoForPosition.f4423e, this.mLastOffset) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            completeScroll(false);
            scrollTo(iMin, getScrollY());
        }
    }

    private void removeNonDecorViews() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((C0686g) getChildAt(i2).getLayoutParams()).f4424a) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean resetTouch() {
        this.mActivePointerId = -1;
        endDrag();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        return this.mLeftEdge.isFinished() || this.mRightEdge.isFinished();
    }

    private void scrollToItem(int i2, boolean z, int i3, boolean z2) throws Resources.NotFoundException {
        C0685f c0685fInfoForPosition = infoForPosition(i2);
        int clientWidth = c0685fInfoForPosition != null ? (int) (getClientWidth() * Math.max(this.mFirstOffset, Math.min(c0685fInfoForPosition.f4423e, this.mLastOffset))) : 0;
        if (z) {
            smoothScrollTo(clientWidth, 0, i3);
            if (z2) {
                dispatchOnPageSelected(i2);
                return;
            }
            return;
        }
        if (z2) {
            dispatchOnPageSelected(i2);
        }
        completeScroll(false);
        scrollTo(clientWidth, 0);
        pageScrolled(clientWidth);
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.mScrollingCacheEnabled != z) {
            this.mScrollingCacheEnabled = z;
        }
    }

    private void sortChildDrawingOrder() {
        if (this.mDrawingOrder != 0) {
            ArrayList<View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.mDrawingOrderedChildren.add(getChildAt(i2));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        C0685f c0685fInfoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (c0685fInfoForChild = infoForChild(childAt)) != null && c0685fInfoForChild.f4420b == this.mCurItem) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    C0685f addNewItem(int i2, int i3) {
        C0685f c0685f = new C0685f();
        c0685f.f4420b = i2;
        c0685f.f4419a = this.mAdapter.instantiateItem((ViewGroup) this, i2);
        c0685f.f4422d = this.mAdapter.getPageWidth(i2);
        if (i3 < 0 || i3 >= this.mItems.size()) {
            this.mItems.add(c0685f);
        } else {
            this.mItems.add(i3, c0685f);
        }
        return c0685f;
    }

    public void addOnAdapterChangeListener(InterfaceC0688i interfaceC0688i) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(interfaceC0688i);
    }

    public void addOnPageChangeListener(InterfaceC0689j interfaceC0689j) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(interfaceC0689j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        C0685f c0685fInfoForChild;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (c0685fInfoForChild = infoForChild(childAt)) != null && c0685fInfoForChild.f4420b == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0686g c0686g = (C0686g) layoutParams;
        boolean zIsDecorView = c0686g.f4424a | isDecorView(view);
        c0686g.f4424a = zIsDecorView;
        if (!this.mInLayout) {
            super.addView(view, i2, layoutParams);
        } else {
            if (zIsDecorView) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c0686g.f4427d = true;
            addViewInLayout(view, i2, layoutParams);
        }
    }

    public boolean arrowScroll(int i2) throws Resources.NotFoundException {
        boolean z;
        boolean zRequestFocus;
        View viewFindFocus = findFocus();
        boolean zPageLeft = false;
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    z = false;
                    break;
                }
                if (parent == this) {
                    z = true;
                    break;
                }
                parent = parent.getParent();
            }
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append(viewFindFocus.getClass().getSimpleName());
                for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(" => ");
                    sb.append(parent2.getClass().getSimpleName());
                }
                Log.e(TAG, "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                viewFindFocus = null;
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            if (i2 == 17) {
                zRequestFocus = (viewFindFocus == null || getChildRectInPagerCoordinates(this.mTempRect, viewFindNextFocus).left < getChildRectInPagerCoordinates(this.mTempRect, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : pageLeft();
            } else if (i2 == 66) {
                zRequestFocus = (viewFindFocus == null || getChildRectInPagerCoordinates(this.mTempRect, viewFindNextFocus).left > getChildRectInPagerCoordinates(this.mTempRect, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : pageRight();
            }
            zPageLeft = zRequestFocus;
        } else if (i2 == 17 || i2 == 1) {
            zPageLeft = pageLeft();
        } else if (i2 == 66 || i2 == 2) {
            zPageLeft = pageRight();
        }
        if (zPageLeft) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
        }
        return zPageLeft;
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        this.mFakeDragBeginTime = jUptimeMillis;
        return true;
    }

    protected boolean canScroll(View view, boolean z, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && canScroll(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i2);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i2 < 0 ? scrollX > ((int) (((float) clientWidth) * this.mFirstOffset)) : i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.mLastOffset));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0686g) && super.checkLayoutParams(layoutParams);
    }

    public void clearOnPageChangeListeners() {
        List<InterfaceC0689j> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            completeScroll(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!pageScrolled(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C0311u.m2113Z(this);
    }

    void dataSetChanged() throws Resources.NotFoundException {
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        boolean z = this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < count;
        int iMax = this.mCurItem;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.mItems.size()) {
            C0685f c0685f = this.mItems.get(i2);
            int itemPosition = this.mAdapter.getItemPosition(c0685f.f4419a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i2);
                    i2--;
                    if (!z2) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, c0685f.f4420b, c0685f.f4419a);
                    int i3 = this.mCurItem;
                    if (i3 == c0685f.f4420b) {
                        iMax = Math.max(0, Math.min(i3, count - 1));
                    }
                } else {
                    int i4 = c0685f.f4420b;
                    if (i4 != itemPosition) {
                        if (i4 == this.mCurItem) {
                            iMax = itemPosition;
                        }
                        c0685f.f4420b = itemPosition;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                C0686g c0686g = (C0686g) getChildAt(i5).getLayoutParams();
                if (!c0686g.f4424a) {
                    c0686g.f4426c = 0.0f;
                }
            }
            setCurrentItemInternal(iMax, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C0685f c0685fInfoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (c0685fInfoForChild = infoForChild(childAt)) != null && c0685fInfoForChild.f4420b == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    float distanceInfluenceForSnapDuration(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC0694a abstractC0694a;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (abstractC0694a = this.mAdapter) != null && abstractC0694a.getCount() > 1)) {
            if (!this.mLeftEdge.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.mFirstOffset * width);
                this.mLeftEdge.setSize(height, width);
                zDraw = false | this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.mRightEdge.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.mLastOffset + 1.0f)) * width2);
                this.mRightEdge.setSize(height2, width2);
                zDraw |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.mLeftEdge.finish();
            this.mRightEdge.finish();
        }
        if (zDraw) {
            C0311u.m2113Z(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public void endFakeDrag() throws Resources.NotFoundException {
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.mAdapter != null) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
            this.mPopulatePending = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C0685f c0685fInfoForCurrentScrollPosition = infoForCurrentScrollPosition();
            setCurrentItemInternal(determineTargetPage(c0685fInfoForCurrentScrollPosition.f4420b, ((scrollX / clientWidth) - c0685fInfoForCurrentScrollPosition.f4423e) / c0685fInfoForCurrentScrollPosition.f4422d, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
        }
        endDrag();
        this.mFakeDragging = false;
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return keyEvent.hasModifiers(2) ? pageLeft() : arrowScroll(17);
            }
            if (keyCode == 22) {
                return keyEvent.hasModifiers(2) ? pageRight() : arrowScroll(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return arrowScroll(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return arrowScroll(1);
                }
            }
        }
        return false;
    }

    public void fakeDragBy(float f2) {
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.mAdapter == null) {
            return;
        }
        this.mLastMotionX += f2;
        float scrollX = getScrollX() - f2;
        float clientWidth = getClientWidth();
        float f3 = this.mFirstOffset * clientWidth;
        float f4 = this.mLastOffset * clientWidth;
        C0685f c0685f = this.mItems.get(0);
        C0685f c0685f2 = this.mItems.get(r4.size() - 1);
        if (c0685f.f4420b != 0) {
            f3 = c0685f.f4423e * clientWidth;
        }
        if (c0685f2.f4420b != this.mAdapter.getCount() - 1) {
            f4 = c0685f2.f4423e * clientWidth;
        }
        if (scrollX < f3) {
            scrollX = f3;
        } else if (scrollX > f4) {
            scrollX = f4;
        }
        int i2 = (int) scrollX;
        this.mLastMotionX += scrollX - i2;
        scrollTo(i2, getScrollY());
        pageScrolled(i2);
        MotionEvent motionEventObtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0686g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC0694a getAdapter() {
        return this.mAdapter;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        if (this.mDrawingOrder == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((C0686g) this.mDrawingOrderedChildren.get(i3).getLayoutParams()).f4429f;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    C0685f infoForAnyChild(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return infoForChild(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    C0685f infoForChild(View view) {
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            C0685f c0685f = this.mItems.get(i2);
            if (this.mAdapter.isViewFromObject(view, c0685f.f4419a)) {
                return c0685f;
            }
        }
        return null;
    }

    C0685f infoForPosition(int i2) {
        for (int i3 = 0; i3 < this.mItems.size(); i3++) {
            C0685f c0685f = this.mItems.get(i3);
            if (c0685f.f4420b == i2) {
                return c0685f;
            }
        }
        return null;
    }

    void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f2);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f2);
        this.mCloseEnough = (int) (2.0f * f2);
        this.mDefaultGutterSize = (int) (f2 * 16.0f);
        C0311u.m2131i0(this, new C0687h());
        if (C0311u.m2158w(this) == 0) {
            C0311u.m2153t0(this, 1);
        }
        C0311u.m2157v0(this, new C0683d());
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i2;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.mPageMargin <= 0 || this.mMarginDrawable == null || this.mItems.size() <= 0 || this.mAdapter == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f4 = this.mPageMargin / width;
        int i3 = 0;
        C0685f c0685f = this.mItems.get(0);
        float f5 = c0685f.f4423e;
        int size = this.mItems.size();
        int i4 = c0685f.f4420b;
        int i5 = this.mItems.get(size - 1).f4420b;
        while (i4 < i5) {
            while (true) {
                i2 = c0685f.f4420b;
                if (i4 <= i2 || i3 >= size) {
                    break;
                }
                i3++;
                c0685f = this.mItems.get(i3);
            }
            if (i4 == i2) {
                float f6 = c0685f.f4423e;
                float f7 = c0685f.f4422d;
                f2 = (f6 + f7) * width;
                f5 = f6 + f7 + f4;
            } else {
                float pageWidth = this.mAdapter.getPageWidth(i4);
                f2 = (f5 + pageWidth) * width;
                f5 += pageWidth + f4;
            }
            if (this.mPageMargin + f2 > scrollX) {
                f3 = f4;
                this.mMarginDrawable.setBounds(Math.round(f2), this.mTopPageBounds, Math.round(this.mPageMargin + f2), this.mBottomPageBounds);
                this.mMarginDrawable.draw(canvas);
            } else {
                f3 = f4;
            }
            if (f2 > scrollX + r2) {
                return;
            }
            i4++;
            f4 = f3;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            resetTouch();
            return false;
        }
        if (action != 0) {
            if (this.mIsBeingDragged) {
                return true;
            }
            if (this.mIsUnableToDrag) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.mInitialMotionX = x;
            this.mLastMotionX = x;
            float y = motionEvent.getY();
            this.mInitialMotionY = y;
            this.mLastMotionY = y;
            this.mActivePointerId = motionEvent.getPointerId(0);
            this.mIsUnableToDrag = false;
            this.mIsScrollStarted = true;
            this.mScroller.computeScrollOffset();
            if (this.mScrollState != 2 || Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) <= this.mCloseEnough) {
                completeScroll(false);
                this.mIsBeingDragged = false;
            } else {
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                this.mIsBeingDragged = true;
                requestParentDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.mActivePointerId;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f2 = x2 - this.mLastMotionX;
                float fAbs = Math.abs(f2);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.mInitialMotionY);
                if (f2 != 0.0f && !isGutterDrag(this.mLastMotionX, f2) && canScroll(this, false, (int) f2, (int) x2, (int) y2)) {
                    this.mLastMotionX = x2;
                    this.mLastMotionY = y2;
                    this.mIsUnableToDrag = true;
                    return false;
                }
                int i3 = this.mTouchSlop;
                if (fAbs > i3 && fAbs * 0.5f > fAbs2) {
                    this.mIsBeingDragged = true;
                    requestParentDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                    this.mLastMotionX = f2 > 0.0f ? this.mInitialMotionX + this.mTouchSlop : this.mInitialMotionX - this.mTouchSlop;
                    this.mLastMotionY = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i3) {
                    this.mIsUnableToDrag = true;
                }
                if (this.mIsBeingDragged && performDrag(x2)) {
                    C0311u.m2113Z(this);
                }
            }
        } else if (action == 6) {
            onSecondaryPointerUp(motionEvent);
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        return this.mIsBeingDragged;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onPageScrolled(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.mDecorChildCount
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r9 = (androidx.viewpager.widget.ViewPager.C0686g) r9
            boolean r10 = r9.f4424a
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f4425b
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            r12.dispatchOnPageScrolled(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$k r13 = r12.mPageTransformer
            if (r13 == 0) goto L9f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r0 = (androidx.viewpager.widget.ViewPager.C0686g) r0
            boolean r0 = r0.f4424a
            if (r0 == 0) goto L8b
            goto L9c
        L8b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$k r3 = r12.mPageTransformer
            r3.m4751a(r15, r0)
        L9c:
            int r1 = r1 + 1
            goto L7a
        L9f:
            r12.mCalledSuper = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onPageScrolled(int, float, int):void");
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        C0685f c0685fInfoForChild;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i3 = 0;
            i4 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
        }
        while (i3 != i5) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (c0685fInfoForChild = infoForChild(childAt)) != null && c0685fInfoForChild.f4420b == this.mCurItem && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m2342a());
        AbstractC0694a abstractC0694a = this.mAdapter;
        if (abstractC0694a != null) {
            abstractC0694a.restoreState(savedState.f4414i, savedState.f4415j);
            setCurrentItemInternal(savedState.f4413h, false, true);
        } else {
            this.mRestoredCurItem = savedState.f4413h;
            this.mRestoredAdapterState = savedState.f4414i;
            this.mRestoredClassLoader = savedState.f4415j;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4413h = this.mCurItem;
        AbstractC0694a abstractC0694a = this.mAdapter;
        if (abstractC0694a != null) {
            savedState.f4414i = abstractC0694a.saveState();
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.mPageMargin;
            recomputeScrollPosition(i2, i4, i6, i6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    boolean pageLeft() throws Resources.NotFoundException {
        int i2 = this.mCurItem;
        if (i2 <= 0) {
            return false;
        }
        setCurrentItem(i2 - 1, true);
        return true;
    }

    boolean pageRight() throws Resources.NotFoundException {
        AbstractC0694a abstractC0694a = this.mAdapter;
        if (abstractC0694a == null || this.mCurItem >= abstractC0694a.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    void populate() throws Resources.NotFoundException {
        populate(this.mCurItem);
    }

    public void removeOnAdapterChangeListener(InterfaceC0688i interfaceC0688i) {
        List<InterfaceC0688i> list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(interfaceC0688i);
        }
    }

    public void removeOnPageChangeListener(InterfaceC0689j interfaceC0689j) {
        List<InterfaceC0689j> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(interfaceC0689j);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(AbstractC0694a abstractC0694a) throws Resources.NotFoundException {
        AbstractC0694a abstractC0694a2 = this.mAdapter;
        if (abstractC0694a2 != null) {
            abstractC0694a2.setViewPagerObserver(null);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i2 = 0; i2 < this.mItems.size(); i2++) {
                C0685f c0685f = this.mItems.get(i2);
                this.mAdapter.destroyItem((ViewGroup) this, c0685f.f4420b, c0685f.f4419a);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        AbstractC0694a abstractC0694a3 = this.mAdapter;
        this.mAdapter = abstractC0694a;
        this.mExpectedAdapterCount = 0;
        if (abstractC0694a != null) {
            if (this.mObserver == null) {
                this.mObserver = new C0691l();
            }
            this.mAdapter.setViewPagerObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (z) {
                requestLayout();
            } else {
                populate();
            }
        }
        List<InterfaceC0688i> list = this.mAdapterChangeListeners;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.mAdapterChangeListeners.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.mAdapterChangeListeners.get(i3).m4750a(this, abstractC0694a3, abstractC0694a);
        }
    }

    public void setCurrentItem(int i2) throws Resources.NotFoundException {
        this.mPopulatePending = false;
        setCurrentItemInternal(i2, !this.mFirstLayout, false);
    }

    void setCurrentItemInternal(int i2, boolean z, boolean z2) throws Resources.NotFoundException {
        setCurrentItemInternal(i2, z, z2, 0);
    }

    InterfaceC0689j setInternalPageChangeListener(InterfaceC0689j interfaceC0689j) {
        InterfaceC0689j interfaceC0689j2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = interfaceC0689j;
        return interfaceC0689j2;
    }

    public void setOffscreenPageLimit(int i2) throws Resources.NotFoundException {
        if (i2 < 1) {
            Log.w(TAG, "Requested offscreen page limit " + i2 + " too small; defaulting to 1");
            i2 = 1;
        }
        if (i2 != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i2;
            populate();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC0689j interfaceC0689j) {
        this.mOnPageChangeListener = interfaceC0689j;
    }

    public void setPageMargin(int i2) {
        int i3 = this.mPageMargin;
        this.mPageMargin = i2;
        int width = getWidth();
        recomputeScrollPosition(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z, InterfaceC0690k interfaceC0690k) throws Resources.NotFoundException {
        setPageTransformer(z, interfaceC0690k, 2);
    }

    void setScrollState(int i2) {
        if (this.mScrollState == i2) {
            return;
        }
        this.mScrollState = i2;
        if (this.mPageTransformer != null) {
            enableLayers(i2 != 0);
        }
        dispatchOnScrollStateChanged(i2);
    }

    void smoothScrollTo(int i2, int i3) throws Resources.NotFoundException {
        smoothScrollTo(i2, i3, 0);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mMarginDrawable;
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$g */
    public static class C0686g extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f4424a;

        /* renamed from: b */
        public int f4425b;

        /* renamed from: c */
        float f4426c;

        /* renamed from: d */
        boolean f4427d;

        /* renamed from: e */
        int f4428e;

        /* renamed from: f */
        int f4429f;

        public C0686g() {
            super(-1, -1);
            this.f4426c = 0.0f;
        }

        public C0686g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4426c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.LAYOUT_ATTRS);
            this.f4425b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0686g(getContext(), attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f7 A[PHI: r7 r10 r15
      0x00f7: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:62:0x00ec, B:59:0x00d6, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:62:0x00ec, B:59:0x00d6, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:62:0x00ec, B:59:0x00d6, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void populate(int r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.populate(int):void");
    }

    void setCurrentItemInternal(int i2, boolean z, boolean z2, int i3) throws Resources.NotFoundException {
        AbstractC0694a abstractC0694a = this.mAdapter;
        if (abstractC0694a == null || abstractC0694a.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.mCurItem == i2 && this.mItems.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= this.mAdapter.getCount()) {
            i2 = this.mAdapter.getCount() - 1;
        }
        int i4 = this.mOffscreenPageLimit;
        int i5 = this.mCurItem;
        if (i2 > i5 + i4 || i2 < i5 - i4) {
            for (int i6 = 0; i6 < this.mItems.size(); i6++) {
                this.mItems.get(i6).f4421c = true;
            }
        }
        boolean z3 = this.mCurItem != i2;
        if (!this.mFirstLayout) {
            populate(i2);
            scrollToItem(i2, z, i3, z3);
        } else {
            this.mCurItem = i2;
            if (z3) {
                dispatchOnPageSelected(i2);
            }
            requestLayout();
        }
    }

    public void setPageTransformer(boolean z, InterfaceC0690k interfaceC0690k, int i2) throws Resources.NotFoundException {
        boolean z2 = interfaceC0690k != null;
        boolean z3 = z2 != (this.mPageTransformer != null);
        this.mPageTransformer = interfaceC0690k;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.mDrawingOrder = z ? 2 : 1;
            this.mPageTransformerLayerType = i2;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z3) {
            populate();
        }
    }

    void smoothScrollTo(int i2, int i3, int i4) throws Resources.NotFoundException {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.mScroller;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.mIsScrollStarted ? this.mScroller.getCurrX() : this.mScroller.getStartX();
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i5 = scrollX;
        int scrollY = getScrollY();
        int i6 = i2 - i5;
        int i7 = i3 - scrollY;
        if (i6 == 0 && i7 == 0) {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i8 = clientWidth / 2;
        float f2 = clientWidth;
        float f3 = i8;
        float fDistanceInfluenceForSnapDuration = f3 + (distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(i6) * 1.0f) / f2)) * f3);
        int iAbs = Math.abs(i4);
        int iMin = Math.min(iAbs > 0 ? Math.round(Math.abs(fDistanceInfluenceForSnapDuration / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i6) / ((f2 * this.mAdapter.getPageWidth(this.mCurItem)) + this.mPageMargin)) + 1.0f) * 100.0f), MAX_SETTLE_DURATION);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(i5, scrollY, i6, i7, iMin);
        C0311u.m2113Z(this);
    }

    public void setCurrentItem(int i2, boolean z) throws Resources.NotFoundException {
        this.mPopulatePending = false;
        setCurrentItemInternal(i2, z, false);
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(C0255a.m1677f(getContext(), i2));
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mItems = new ArrayList<>();
        this.mTempItem = new C0685f();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new RunnableC0682c();
        this.mScrollState = 0;
        initViewPager();
    }
}
