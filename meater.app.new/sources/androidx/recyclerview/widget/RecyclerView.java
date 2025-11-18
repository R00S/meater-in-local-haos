package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.os.C0275d;
import androidx.core.view.C0280a;
import androidx.core.view.C0299i;
import androidx.core.view.C0301k;
import androidx.core.view.C0311u;
import androidx.core.view.C0312v;
import androidx.core.view.InterfaceC0300j;
import androidx.core.view.ScrollingView;
import androidx.core.view.p004d0.C0288b;
import androidx.core.view.p004d0.C0289c;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.C0620a;
import androidx.recyclerview.widget.C0623d;
import androidx.recyclerview.widget.C0634o;
import androidx.recyclerview.widget.C0638s;
import androidx.recyclerview.widget.C0639t;
import androidx.recyclerview.widget.RunnableC0627h;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;
import p024c.p052i.p059j.C0959i;
import p024c.p081t.C1004a;
import p024c.p081t.C1005b;
import p024c.p081t.C1006c;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, InterfaceC0300j {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
    static final boolean ALLOW_THREAD_GAP_WORK;
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION;
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final Interpolator sQuinticInterpolator;
    C0634o mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    AbstractC0594g mAdapter;
    C0620a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private InterfaceC0597j mChildDrawingOrderCallback;
    C0623d mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private C0598k mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    RunnableC0627h mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private InterfaceC0606s mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    AbstractC0599l mItemAnimator;
    private AbstractC0599l.b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<AbstractC0601n> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    AbstractC0602o mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final C0611x mObserver;
    private List<InterfaceC0604q> mOnChildAttachStateListeners;
    private AbstractC0605r mOnFlingListener;
    private final ArrayList<InterfaceC0606s> mOnItemTouchListeners;
    final List<AbstractC0590c0> mPendingAccessibilityImportanceChange;
    private SavedState mPendingSavedState;
    boolean mPostedAnimatorRunner;
    RunnableC0627h.b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final C0609v mRecycler;
    InterfaceC0610w mRecyclerListener;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private AbstractC0607t mScrollListener;
    private List<AbstractC0607t> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private C0301k mScrollingChildHelper;
    final C0613z mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final RunnableC0588b0 mViewFlinger;
    private final C0639t.b mViewInfoProcessCallback;
    final C0639t mViewInfoStore;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    class RunnableC0585a implements Runnable {
        RunnableC0585a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.mIsAttached) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.mLayoutSuppressed) {
                recyclerView2.mLayoutWasDefered = true;
            } else {
                recyclerView2.consumePendingUpdateOperations();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    public static abstract class AbstractC0586a0 {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    class RunnableC0587b implements Runnable {
        RunnableC0587b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0599l abstractC0599l = RecyclerView.this.mItemAnimator;
            if (abstractC0599l != null) {
                abstractC0599l.runPendingAnimations();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    class RunnableC0588b0 implements Runnable {

        /* renamed from: f */
        private int f3943f;

        /* renamed from: g */
        private int f3944g;

        /* renamed from: h */
        OverScroller f3945h;

        /* renamed from: i */
        Interpolator f3946i;

        /* renamed from: j */
        private boolean f3947j;

        /* renamed from: k */
        private boolean f3948k;

        RunnableC0588b0() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f3946i = interpolator;
            this.f3947j = false;
            this.f3948k = false;
            this.f3945h = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: a */
        private int m4188a(int i2, int i3, int i4, int i5) {
            int iRound;
            int iAbs = Math.abs(i2);
            int iAbs2 = Math.abs(i3);
            boolean z = iAbs > iAbs2;
            int iSqrt = (int) Math.sqrt((i4 * i4) + (i5 * i5));
            int iSqrt2 = (int) Math.sqrt((i2 * i2) + (i3 * i3));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f2 = width;
            float f3 = i6;
            float fM4189b = f3 + (m4189b(Math.min(1.0f, (iSqrt2 * 1.0f) / f2)) * f3);
            if (iSqrt > 0) {
                iRound = Math.round(Math.abs(fM4189b / iSqrt) * 1000.0f) * 4;
            } else {
                if (!z) {
                    iAbs = iAbs2;
                }
                iRound = (int) (((iAbs / f2) + 1.0f) * 300.0f);
            }
            return Math.min(iRound, RecyclerView.MAX_SCROLL_DURATION);
        }

        /* renamed from: b */
        private float m4189b(float f2) {
            return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
        }

        /* renamed from: d */
        private void m4190d() {
            RecyclerView.this.removeCallbacks(this);
            C0311u.m2115a0(RecyclerView.this, this);
        }

        /* renamed from: c */
        public void m4191c(int i2, int i3) {
            RecyclerView.this.setScrollState(2);
            this.f3944g = 0;
            this.f3943f = 0;
            Interpolator interpolator = this.f3946i;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f3946i = interpolator2;
                this.f3945h = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f3945h.fling(0, 0, i2, i3, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            m4192e();
        }

        /* renamed from: e */
        void m4192e() {
            if (this.f3947j) {
                this.f3948k = true;
            } else {
                m4190d();
            }
        }

        /* renamed from: f */
        public void m4193f(int i2, int i3, int i4, Interpolator interpolator) {
            if (i4 == Integer.MIN_VALUE) {
                i4 = m4188a(i2, i3, 0, 0);
            }
            int i5 = i4;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f3946i != interpolator) {
                this.f3946i = interpolator;
                this.f3945h = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f3944g = 0;
            this.f3943f = 0;
            RecyclerView.this.setScrollState(2);
            this.f3945h.startScroll(0, 0, i2, i3, i5);
            if (Build.VERSION.SDK_INT < 23) {
                this.f3945h.computeScrollOffset();
            }
            m4192e();
        }

        /* renamed from: g */
        public void m4194g() {
            RecyclerView.this.removeCallbacks(this);
            this.f3945h.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i2;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                m4194g();
                return;
            }
            this.f3948k = false;
            this.f3947j = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f3945h;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.f3943f;
                int i5 = currY - this.f3944g;
                this.f3943f = currX;
                this.f3944g = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i4, i5, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    i4 -= iArr2[0];
                    i5 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i4, i5);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i4, i5, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i3 = iArr4[0];
                    i2 = iArr4[1];
                    i4 -= i3;
                    i5 -= i2;
                    AbstractC0612y abstractC0612y = recyclerView4.mLayout.mSmoothScroller;
                    if (abstractC0612y != null && !abstractC0612y.isPendingInitialRun() && abstractC0612y.isRunning()) {
                        int iM4306b = RecyclerView.this.mState.m4306b();
                        if (iM4306b == 0) {
                            abstractC0612y.stop();
                        } else if (abstractC0612y.getTargetPosition() >= iM4306b) {
                            abstractC0612y.setTargetPosition(iM4306b - 1);
                            abstractC0612y.onAnimation(i3, i2);
                        } else {
                            abstractC0612y.onAnimation(i3, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i3 = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i3, i2, i4, i5, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i6 = i4 - iArr6[0];
                int i7 = i5 - iArr6[1];
                if (i3 != 0 || i2 != 0) {
                    recyclerView6.dispatchOnScrolled(i3, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i6 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i7 != 0));
                AbstractC0612y abstractC0612y2 = RecyclerView.this.mLayout.mSmoothScroller;
                if ((abstractC0612y2 != null && abstractC0612y2.isPendingInitialRun()) || !z) {
                    m4192e();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    RunnableC0627h runnableC0627h = recyclerView7.mGapWorker;
                    if (runnableC0627h != null) {
                        runnableC0627h.m4513f(recyclerView7, i3, i2);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i8 = i6 < 0 ? -currVelocity : i6 > 0 ? currVelocity : 0;
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i8, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.m4517b();
                    }
                }
            }
            AbstractC0612y abstractC0612y3 = RecyclerView.this.mLayout.mSmoothScroller;
            if (abstractC0612y3 != null && abstractC0612y3.isPendingInitialRun()) {
                abstractC0612y3.onAnimation(0, 0);
            }
            this.f3947j = false;
            if (this.f3948k) {
                m4190d();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.stopNestedScroll(1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    static class InterpolatorC0589c implements Interpolator {
        InterpolatorC0589c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c0 */
    public static abstract class AbstractC0590c0 {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        AbstractC0590c0 mShadowedHolder = null;
        AbstractC0590c0 mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        C0609v mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public AbstractC0590c0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(FLAG_ADAPTER_FULLUPDATE);
            } else if ((FLAG_ADAPTER_FULLUPDATE & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        void addFlags(int i2) {
            this.mFlags = i2 | this.mFlags;
        }

        void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && C0311u.m2099L(this.itemView);
        }

        void flagRemovedAndOffsetPosition(int i2, int i3, boolean z) {
            addFlags(8);
            offsetPosition(i3, z);
            this.mPosition = i2;
        }

        public final int getAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionFor(this);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i2 = this.mPreLayoutPosition;
            return i2 == -1 ? this.mPosition : i2;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i2 = this.mPreLayoutPosition;
            return i2 == -1 ? this.mPosition : i2;
        }

        List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & FLAG_ADAPTER_FULLUPDATE) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        boolean hasAnyOfTheFlags(int i2) {
            return (i2 & this.mFlags) != 0;
        }

        boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !C0311u.m2099L(this.itemView);
        }

        boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        boolean isScrap() {
            return this.mScrapContainer != null;
        }

        boolean isTmpDetached() {
            return (this.mFlags & FLAG_TMP_DETACHED) != 0;
        }

        boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        void offsetPosition(int i2, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i2;
            }
            this.mPosition += i2;
            if (this.itemView.getLayoutParams() != null) {
                ((C0603p) this.itemView.getLayoutParams()).f3966c = true;
            }
        }

        void onEnteredHiddenState(RecyclerView recyclerView) {
            int i2 = this.mPendingAccessibilityState;
            if (i2 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i2;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = C0311u.m2158w(this.itemView);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        void setFlags(int i2, int i3) {
            this.mFlags = (i2 & i3) | (this.mFlags & (i3 ^ (-1)));
        }

        public final void setIsRecyclable(boolean z) {
            int i2 = this.mIsRecyclableCount;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.mIsRecyclableCount = i3;
            if (i3 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i3 == 1) {
                this.mFlags |= 16;
            } else if (z && i3 == 0) {
                this.mFlags &= -17;
            }
        }

        void setScrapContainer(C0609v c0609v, boolean z) {
            this.mScrapContainer = c0609v;
            this.mInChangeScrap = z;
        }

        boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        void unScrap() {
            this.mScrapContainer.m4271J(this);
        }

        boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    class C0591d implements C0639t.b {
        C0591d() {
        }

        @Override // androidx.recyclerview.widget.C0639t.b
        /* renamed from: a */
        public void mo4195a(AbstractC0590c0 abstractC0590c0) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.removeAndRecycleView(abstractC0590c0.itemView, recyclerView.mRecycler);
        }

        @Override // androidx.recyclerview.widget.C0639t.b
        /* renamed from: b */
        public void mo4196b(AbstractC0590c0 abstractC0590c0, AbstractC0599l.c cVar, AbstractC0599l.c cVar2) {
            RecyclerView.this.animateAppearance(abstractC0590c0, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.C0639t.b
        /* renamed from: c */
        public void mo4197c(AbstractC0590c0 abstractC0590c0, AbstractC0599l.c cVar, AbstractC0599l.c cVar2) {
            RecyclerView.this.mRecycler.m4271J(abstractC0590c0);
            RecyclerView.this.animateDisappearance(abstractC0590c0, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.C0639t.b
        /* renamed from: d */
        public void mo4198d(AbstractC0590c0 abstractC0590c0, AbstractC0599l.c cVar, AbstractC0599l.c cVar2) {
            abstractC0590c0.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mDataSetHasChangedAfterLayout) {
                if (recyclerView.mItemAnimator.animateChange(abstractC0590c0, abstractC0590c0, cVar, cVar2)) {
                    RecyclerView.this.postAnimationRunner();
                }
            } else if (recyclerView.mItemAnimator.animatePersistence(abstractC0590c0, cVar, cVar2)) {
                RecyclerView.this.postAnimationRunner();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    class C0592e implements C0623d.b {
        C0592e() {
        }

        @Override // androidx.recyclerview.widget.C0623d.b
        /* renamed from: a */
        public View mo4199a(int i2) {
            return RecyclerView.this.getChildAt(i2);
        }

        @Override // androidx.recyclerview.widget.C0623d.b
        /* renamed from: b */
        public void mo4200b(View view) {
            AbstractC0590c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C0623d.b
        /* renamed from: c */
        public int mo4201c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.C0623d.b
        /* renamed from: d */
        public void mo4202d() {
            int iMo4201c = mo4201c();
            for (int i2 = 0; i2 < iMo4201c; i2++) {
                View viewMo4199a = mo4199a(i2);
                RecyclerView.this.dispatchChildDetached(viewMo4199a);
                viewMo4199a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.C0623d.b
        /* renamed from: e */
        public int mo4203e(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.C0623d.b
        /* renamed from: f */
        public AbstractC0590c0 mo4204f(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        @Override // androidx.recyclerview.widget.C0623d.b
        /* renamed from: g */
        public void mo4205g(int i2) {
            AbstractC0590c0 childViewHolderInt;
            View viewMo4199a = mo4199a(i2);
            if (viewMo4199a != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(viewMo4199a)) != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                childViewHolderInt.addFlags(256);
            }
            RecyclerView.this.detachViewFromParent(i2);
        }

        @Override // androidx.recyclerview.widget.C0623d.b
        /* renamed from: h */
        public void mo4206h(View view) {
            AbstractC0590c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C0623d.b
        /* renamed from: i */
        public void mo4207i(View view, int i2) {
            RecyclerView.this.addView(view, i2);
            RecyclerView.this.dispatchChildAttached(view);
        }

        @Override // androidx.recyclerview.widget.C0623d.b
        /* renamed from: j */
        public void mo4208j(int i2) {
            View childAt = RecyclerView.this.getChildAt(i2);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i2);
        }

        @Override // androidx.recyclerview.widget.C0623d.b
        /* renamed from: k */
        public void mo4209k(View view, int i2, ViewGroup.LayoutParams layoutParams) {
            AbstractC0590c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                childViewHolderInt.clearTmpDetachFlag();
            }
            RecyclerView.this.attachViewToParent(view, i2, layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    class C0593f implements C0620a.a {
        C0593f() {
        }

        @Override // androidx.recyclerview.widget.C0620a.a
        /* renamed from: a */
        public void mo4210a(int i2, int i3) {
            RecyclerView.this.offsetPositionRecordsForMove(i2, i3);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.C0620a.a
        /* renamed from: b */
        public void mo4211b(C0620a.b bVar) {
            m4218i(bVar);
        }

        @Override // androidx.recyclerview.widget.C0620a.a
        /* renamed from: c */
        public void mo4212c(int i2, int i3, Object obj) {
            RecyclerView.this.viewRangeUpdate(i2, i3, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        @Override // androidx.recyclerview.widget.C0620a.a
        /* renamed from: d */
        public void mo4213d(C0620a.b bVar) {
            m4218i(bVar);
        }

        @Override // androidx.recyclerview.widget.C0620a.a
        /* renamed from: e */
        public AbstractC0590c0 mo4214e(int i2) {
            AbstractC0590c0 abstractC0590c0FindViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i2, true);
            if (abstractC0590c0FindViewHolderForPosition == null || RecyclerView.this.mChildHelper.m4455n(abstractC0590c0FindViewHolderForPosition.itemView)) {
                return null;
            }
            return abstractC0590c0FindViewHolderForPosition;
        }

        @Override // androidx.recyclerview.widget.C0620a.a
        /* renamed from: f */
        public void mo4215f(int i2, int i3) {
            RecyclerView.this.offsetPositionRecordsForRemove(i2, i3, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.C0620a.a
        /* renamed from: g */
        public void mo4216g(int i2, int i3) {
            RecyclerView.this.offsetPositionRecordsForInsert(i2, i3);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.C0620a.a
        /* renamed from: h */
        public void mo4217h(int i2, int i3) {
            RecyclerView.this.offsetPositionRecordsForRemove(i2, i3, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f3994d += i3;
        }

        /* renamed from: i */
        void m4218i(C0620a.b bVar) {
            int i2 = bVar.f4072a;
            if (i2 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.onItemsAdded(recyclerView, bVar.f4073b, bVar.f4075d);
                return;
            }
            if (i2 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.onItemsRemoved(recyclerView2, bVar.f4073b, bVar.f4075d);
            } else if (i2 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.onItemsUpdated(recyclerView3, bVar.f4073b, bVar.f4075d, bVar.f4074c);
            } else {
                if (i2 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.onItemsMoved(recyclerView4, bVar.f4073b, bVar.f4075d, 1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public static abstract class AbstractC0594g<VH extends AbstractC0590c0> {
        private final C0595h mObservable = new C0595h();
        private boolean mHasStableIds = false;

        public final void bindViewHolder(VH vh, int i2) {
            vh.mPosition = i2;
            if (hasStableIds()) {
                vh.mItemId = getItemId(i2);
            }
            vh.setFlags(1, 519);
            C0275d.m1840a(RecyclerView.TRACE_BIND_VIEW_TAG);
            onBindViewHolder(vh, i2, vh.getUnmodifiedPayloads());
            vh.clearPayload();
            ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
            if (layoutParams instanceof C0603p) {
                ((C0603p) layoutParams).f3966c = true;
            }
            C0275d.m1841b();
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i2) {
            try {
                C0275d.m1840a(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH vh = (VH) onCreateViewHolder(viewGroup, i2);
                if (vh.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh.mItemViewType = i2;
                return vh;
            } finally {
                C0275d.m1841b();
            }
        }

        public abstract int getItemCount();

        public long getItemId(int i2) {
            return -1L;
        }

        public int getItemViewType(int i2) {
            return 0;
        }

        public final boolean hasObservers() {
            return this.mObservable.m4219a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.m4220b();
        }

        public final void notifyItemChanged(int i2) {
            this.mObservable.m4222d(i2, 1);
        }

        public final void notifyItemInserted(int i2) {
            this.mObservable.m4224f(i2, 1);
        }

        public final void notifyItemMoved(int i2, int i3) {
            this.mObservable.m4221c(i2, i3);
        }

        public final void notifyItemRangeChanged(int i2, int i3) {
            this.mObservable.m4222d(i2, i3);
        }

        public final void notifyItemRangeInserted(int i2, int i3) {
            this.mObservable.m4224f(i2, i3);
        }

        public final void notifyItemRangeRemoved(int i2, int i3) {
            this.mObservable.m4225g(i2, i3);
        }

        public final void notifyItemRemoved(int i2) {
            this.mObservable.m4225g(i2, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i2);

        public void onBindViewHolder(VH vh, int i2, List<Object> list) {
            onBindViewHolder(vh, i2);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i2);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public void registerAdapterDataObserver(AbstractC0596i abstractC0596i) {
            this.mObservable.registerObserver(abstractC0596i);
        }

        public void setHasStableIds(boolean z) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z;
        }

        public void unregisterAdapterDataObserver(AbstractC0596i abstractC0596i) {
            this.mObservable.unregisterObserver(abstractC0596i);
        }

        public final void notifyItemChanged(int i2, Object obj) {
            this.mObservable.m4223e(i2, 1, obj);
        }

        public final void notifyItemRangeChanged(int i2, int i3, Object obj) {
            this.mObservable.m4223e(i2, i3, obj);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    static class C0595h extends Observable<AbstractC0596i> {
        C0595h() {
        }

        /* renamed from: a */
        public boolean m4219a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* renamed from: b */
        public void m4220b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0596i) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        /* renamed from: c */
        public void m4221c(int i2, int i3) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0596i) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i2, i3, 1);
            }
        }

        /* renamed from: d */
        public void m4222d(int i2, int i3) {
            m4223e(i2, i3, null);
        }

        /* renamed from: e */
        public void m4223e(int i2, int i3, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0596i) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i2, i3, obj);
            }
        }

        /* renamed from: f */
        public void m4224f(int i2, int i3) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0596i) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i2, i3);
            }
        }

        /* renamed from: g */
        public void m4225g(int i2, int i3) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0596i) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i2, i3);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static abstract class AbstractC0596i {
        public void onChanged() {
        }

        public void onItemRangeChanged(int i2, int i3) {
        }

        public void onItemRangeChanged(int i2, int i3, Object obj) {
            onItemRangeChanged(i2, i3);
        }

        public void onItemRangeInserted(int i2, int i3) {
        }

        public void onItemRangeMoved(int i2, int i3, int i4) {
        }

        public void onItemRangeRemoved(int i2, int i3) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public interface InterfaceC0597j {
        /* renamed from: a */
        int m4226a(int i2, int i3);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public static class C0598k {
        /* renamed from: a */
        protected EdgeEffect m4227a(RecyclerView recyclerView, int i2) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static abstract class AbstractC0599l {
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_REMOVED = 8;
        private b mListener = null;
        private ArrayList<a> mFinishedListeners = new ArrayList<>();
        private long mAddDuration = 120;
        private long mRemoveDuration = 120;
        private long mMoveDuration = 250;
        private long mChangeDuration = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$a */
        public interface a {
            /* renamed from: a */
            void m4228a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$b */
        interface b {
            /* renamed from: a */
            void mo4229a(AbstractC0590c0 abstractC0590c0);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$c */
        public static class c {

            /* renamed from: a */
            public int f3953a;

            /* renamed from: b */
            public int f3954b;

            /* renamed from: c */
            public int f3955c;

            /* renamed from: d */
            public int f3956d;

            /* renamed from: a */
            public c m4230a(AbstractC0590c0 abstractC0590c0) {
                return m4231b(abstractC0590c0, 0);
            }

            /* renamed from: b */
            public c m4231b(AbstractC0590c0 abstractC0590c0, int i2) {
                View view = abstractC0590c0.itemView;
                this.f3953a = view.getLeft();
                this.f3954b = view.getTop();
                this.f3955c = view.getRight();
                this.f3956d = view.getBottom();
                return this;
            }
        }

        static int buildAdapterChangeFlagsForAnimations(AbstractC0590c0 abstractC0590c0) {
            int i2 = abstractC0590c0.mFlags & 14;
            if (abstractC0590c0.isInvalid()) {
                return 4;
            }
            if ((i2 & 4) != 0) {
                return i2;
            }
            int oldPosition = abstractC0590c0.getOldPosition();
            int adapterPosition = abstractC0590c0.getAdapterPosition();
            return (oldPosition == -1 || adapterPosition == -1 || oldPosition == adapterPosition) ? i2 : i2 | FLAG_MOVED;
        }

        public abstract boolean animateAppearance(AbstractC0590c0 abstractC0590c0, c cVar, c cVar2);

        public abstract boolean animateChange(AbstractC0590c0 abstractC0590c0, AbstractC0590c0 abstractC0590c02, c cVar, c cVar2);

        public abstract boolean animateDisappearance(AbstractC0590c0 abstractC0590c0, c cVar, c cVar2);

        public abstract boolean animatePersistence(AbstractC0590c0 abstractC0590c0, c cVar, c cVar2);

        public abstract boolean canReuseUpdatedViewHolder(AbstractC0590c0 abstractC0590c0);

        public boolean canReuseUpdatedViewHolder(AbstractC0590c0 abstractC0590c0, List<Object> list) {
            return canReuseUpdatedViewHolder(abstractC0590c0);
        }

        public final void dispatchAnimationFinished(AbstractC0590c0 abstractC0590c0) {
            onAnimationFinished(abstractC0590c0);
            b bVar = this.mListener;
            if (bVar != null) {
                bVar.mo4229a(abstractC0590c0);
            }
        }

        public final void dispatchAnimationStarted(AbstractC0590c0 abstractC0590c0) {
            onAnimationStarted(abstractC0590c0);
        }

        public final void dispatchAnimationsFinished() {
            int size = this.mFinishedListeners.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mFinishedListeners.get(i2).m4228a();
            }
            this.mFinishedListeners.clear();
        }

        public abstract void endAnimation(AbstractC0590c0 abstractC0590c0);

        public abstract void endAnimations();

        public long getAddDuration() {
            return this.mAddDuration;
        }

        public long getChangeDuration() {
            return this.mChangeDuration;
        }

        public long getMoveDuration() {
            return this.mMoveDuration;
        }

        public long getRemoveDuration() {
            return this.mRemoveDuration;
        }

        public abstract boolean isRunning();

        public final boolean isRunning(a aVar) {
            boolean zIsRunning = isRunning();
            if (aVar != null) {
                if (zIsRunning) {
                    this.mFinishedListeners.add(aVar);
                } else {
                    aVar.m4228a();
                }
            }
            return zIsRunning;
        }

        public c obtainHolderInfo() {
            return new c();
        }

        public void onAnimationFinished(AbstractC0590c0 abstractC0590c0) {
        }

        public void onAnimationStarted(AbstractC0590c0 abstractC0590c0) {
        }

        public c recordPostLayoutInformation(C0613z c0613z, AbstractC0590c0 abstractC0590c0) {
            return obtainHolderInfo().m4230a(abstractC0590c0);
        }

        public c recordPreLayoutInformation(C0613z c0613z, AbstractC0590c0 abstractC0590c0, int i2, List<Object> list) {
            return obtainHolderInfo().m4230a(abstractC0590c0);
        }

        public abstract void runPendingAnimations();

        public void setAddDuration(long j2) {
            this.mAddDuration = j2;
        }

        public void setChangeDuration(long j2) {
            this.mChangeDuration = j2;
        }

        void setListener(b bVar) {
            this.mListener = bVar;
        }

        public void setMoveDuration(long j2) {
            this.mMoveDuration = j2;
        }

        public void setRemoveDuration(long j2) {
            this.mRemoveDuration = j2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    private class C0600m implements AbstractC0599l.b {
        C0600m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0599l.b
        /* renamed from: a */
        public void mo4229a(AbstractC0590c0 abstractC0590c0) {
            abstractC0590c0.setIsRecyclable(true);
            if (abstractC0590c0.mShadowedHolder != null && abstractC0590c0.mShadowingHolder == null) {
                abstractC0590c0.mShadowedHolder = null;
            }
            abstractC0590c0.mShadowingHolder = null;
            if (abstractC0590c0.shouldBeKeptAsChild() || RecyclerView.this.removeAnimatingView(abstractC0590c0.itemView) || !abstractC0590c0.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(abstractC0590c0.itemView, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static abstract class AbstractC0601n {
        @Deprecated
        public void getItemOffsets(Rect rect, int i2, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, C0613z c0613z) {
            onDraw(canvas, recyclerView);
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C0613z c0613z) {
            onDrawOver(canvas, recyclerView);
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0613z c0613z) {
            getItemOffsets(rect, ((C0603p) view.getLayoutParams()).m4238a(), recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public static abstract class AbstractC0602o {
        boolean mAutoMeasure;
        C0623d mChildHelper;
        private int mHeight;
        private int mHeightMode;
        C0638s mHorizontalBoundCheck;
        private final C0638s.b mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;
        AbstractC0612y mSmoothScroller;
        C0638s mVerticalBoundCheck;
        private final C0638s.b mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$a */
        class a implements C0638s.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.C0638s.b
            /* renamed from: a */
            public View mo4232a(int i2) {
                return AbstractC0602o.this.getChildAt(i2);
            }

            @Override // androidx.recyclerview.widget.C0638s.b
            /* renamed from: b */
            public int mo4233b(View view) {
                return AbstractC0602o.this.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((C0603p) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.C0638s.b
            /* renamed from: c */
            public int mo4234c() {
                return AbstractC0602o.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.C0638s.b
            /* renamed from: d */
            public int mo4235d() {
                return AbstractC0602o.this.getWidth() - AbstractC0602o.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.C0638s.b
            /* renamed from: e */
            public int mo4236e(View view) {
                return AbstractC0602o.this.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((C0603p) view.getLayoutParams())).rightMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$b */
        class b implements C0638s.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.C0638s.b
            /* renamed from: a */
            public View mo4232a(int i2) {
                return AbstractC0602o.this.getChildAt(i2);
            }

            @Override // androidx.recyclerview.widget.C0638s.b
            /* renamed from: b */
            public int mo4233b(View view) {
                return AbstractC0602o.this.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((C0603p) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.C0638s.b
            /* renamed from: c */
            public int mo4234c() {
                return AbstractC0602o.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.C0638s.b
            /* renamed from: d */
            public int mo4235d() {
                return AbstractC0602o.this.getHeight() - AbstractC0602o.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.C0638s.b
            /* renamed from: e */
            public int mo4236e(View view) {
                return AbstractC0602o.this.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((C0603p) view.getLayoutParams())).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$c */
        public interface c {
            /* renamed from: a */
            void mo4237a(int i2, int i3);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$d */
        public static class d {

            /* renamed from: a */
            public int f3960a;

            /* renamed from: b */
            public int f3961b;

            /* renamed from: c */
            public boolean f3962c;

            /* renamed from: d */
            public boolean f3963d;
        }

        public AbstractC0602o() {
            a aVar = new a();
            this.mHorizontalBoundCheckCallback = aVar;
            b bVar = new b();
            this.mVerticalBoundCheckCallback = bVar;
            this.mHorizontalBoundCheck = new C0638s(aVar);
            this.mVerticalBoundCheck = new C0638s(bVar);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        private void addViewInt(View view, int i2, boolean z) {
            AbstractC0590c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.m4564b(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.m4577p(childViewHolderInt);
            }
            C0603p c0603p = (C0603p) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.m4446c(view, i2, view.getLayoutParams(), false);
            } else if (view.getParent() == this.mRecyclerView) {
                int iM4454m = this.mChildHelper.m4454m(view);
                if (i2 == -1) {
                    i2 = this.mChildHelper.m4450g();
                }
                if (iM4454m == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.mRecyclerView.indexOfChild(view) + this.mRecyclerView.exceptionLabel());
                }
                if (iM4454m != i2) {
                    this.mRecyclerView.mLayout.moveView(iM4454m, i2);
                }
            } else {
                this.mChildHelper.m4444a(view, i2, false);
                c0603p.f3966c = true;
                AbstractC0612y abstractC0612y = this.mSmoothScroller;
                if (abstractC0612y != null && abstractC0612y.isRunning()) {
                    this.mSmoothScroller.onChildAttachedToWindow(view);
                }
            }
            if (c0603p.f3967d) {
                childViewHolderInt.itemView.invalidate();
                c0603p.f3967d = false;
            }
        }

        public static int chooseSize(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i4) : size : Math.min(size, Math.max(i3, i4));
        }

        private void detachViewInternal(int i2, View view) {
            this.mChildHelper.m4447d(i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
        @java.lang.Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto Lf
                if (r3 < 0) goto Ld
                goto L11
            Ld:
                r3 = 0
                goto L21
            Lf:
                if (r3 < 0) goto L14
            L11:
                r2 = 1073741824(0x40000000, float:2.0)
                goto L21
            L14:
                r4 = -1
                if (r3 != r4) goto L1b
                r2 = 1073741824(0x40000000, float:2.0)
            L19:
                r3 = r1
                goto L21
            L1b:
                r4 = -2
                if (r3 != r4) goto Ld
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L19
            L21:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.AbstractC0602o.getChildMeasureSpec(int, int, int, boolean):int");
        }

        private int[] getChildRectangleOnScreenScrollAmount(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i2 = left - paddingLeft;
            int iMin = Math.min(0, i2);
            int i3 = top - paddingTop;
            int iMin2 = Math.min(0, i3);
            int i4 = iWidth - width;
            int iMax = Math.max(0, i4);
            int iMax2 = Math.max(0, iHeight - height);
            if (getLayoutDirection() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i2, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i4);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i3, iMax2);
            }
            iArr[0] = iMax;
            iArr[1] = iMin2;
            return iArr;
        }

        public static d getProperties(Context context, AttributeSet attributeSet, int i2, int i3) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1006c.f6674f, i2, i3);
            dVar.f3960a = typedArrayObtainStyledAttributes.getInt(C1006c.f6675g, 1);
            dVar.f3961b = typedArrayObtainStyledAttributes.getInt(C1006c.f6685q, 1);
            dVar.f3962c = typedArrayObtainStyledAttributes.getBoolean(C1006c.f6684p, false);
            dVar.f3963d = typedArrayObtainStyledAttributes.getBoolean(C1006c.f6686r, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int i2, int i3) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            return rect.left - i2 < width && rect.right - i2 > paddingLeft && rect.top - i3 < height && rect.bottom - i3 > paddingTop;
        }

        private static boolean isMeasurementUpToDate(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (i4 > 0 && i2 != i4) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i2;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i2;
            }
            return true;
        }

        private void scrapOrRecycleView(C0609v c0609v, int i2, View view) {
            AbstractC0590c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
                removeViewAt(i2);
                c0609v.m4265C(childViewHolderInt);
            } else {
                detachViewAt(i2);
                c0609v.m4266D(view);
                this.mRecyclerView.mViewInfoStore.m4573k(childViewHolderInt);
            }
        }

        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void attachView(View view, int i2, C0603p c0603p) {
            AbstractC0590c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.m4564b(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.m4577p(childViewHolderInt);
            }
            this.mChildHelper.m4446c(view, i2, c0603p, childViewHolderInt.isRemoved());
        }

        public void calculateItemDecorationsForChild(View view, Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(C0603p c0603p) {
            return c0603p != null;
        }

        public void collectAdjacentPrefetchPositions(int i2, int i3, C0613z c0613z, c cVar) {
        }

        public void collectInitialPrefetchPositions(int i2, c cVar) {
        }

        public int computeHorizontalScrollExtent(C0613z c0613z) {
            return 0;
        }

        public int computeHorizontalScrollOffset(C0613z c0613z) {
            return 0;
        }

        public int computeHorizontalScrollRange(C0613z c0613z) {
            return 0;
        }

        public int computeVerticalScrollExtent(C0613z c0613z) {
            return 0;
        }

        public int computeVerticalScrollOffset(C0613z c0613z) {
            return 0;
        }

        public int computeVerticalScrollRange(C0613z c0613z) {
            return 0;
        }

        public void detachAndScrapAttachedViews(C0609v c0609v) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                scrapOrRecycleView(c0609v, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(View view, C0609v c0609v) {
            scrapOrRecycleView(c0609v, this.mChildHelper.m4454m(view), view);
        }

        public void detachAndScrapViewAt(int i2, C0609v c0609v) {
            scrapOrRecycleView(c0609v, i2, getChildAt(i2));
        }

        public void detachView(View view) {
            int iM4454m = this.mChildHelper.m4454m(view);
            if (iM4454m >= 0) {
                detachViewInternal(iM4454m, view);
            }
        }

        public void detachViewAt(int i2) {
            detachViewInternal(i2, getChildAt(i2));
        }

        void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        void dispatchDetachedFromWindow(RecyclerView recyclerView, C0609v c0609v) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, c0609v);
        }

        public void endAnimation(View view) {
            AbstractC0599l abstractC0599l = this.mRecyclerView.mItemAnimator;
            if (abstractC0599l != null) {
                abstractC0599l.endAnimation(RecyclerView.getChildViewHolderInt(view));
            }
        }

        public View findContainingItemView(View view) {
            View viewFindContainingItemView;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.m4455n(viewFindContainingItemView)) {
                return null;
            }
            return viewFindContainingItemView;
        }

        public View findViewByPosition(int i2) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                AbstractC0590c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i2 && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.m4309e() || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public abstract C0603p generateDefaultLayoutParams();

        public C0603p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof C0603p ? new C0603p((C0603p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0603p((ViewGroup.MarginLayoutParams) layoutParams) : new C0603p(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(View view) {
            return ((C0603p) view.getLayoutParams()).f3965b.bottom;
        }

        public View getChildAt(int i2) {
            C0623d c0623d = this.mChildHelper;
            if (c0623d != null) {
                return c0623d.m4449f(i2);
            }
            return null;
        }

        public int getChildCount() {
            C0623d c0623d = this.mChildHelper;
            if (c0623d != null) {
                return c0623d.m4450g();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public int getColumnCountForAccessibility(C0609v c0609v, C0613z c0613z) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || recyclerView.mAdapter == null || !canScrollHorizontally()) {
                return 1;
            }
            return this.mRecyclerView.mAdapter.getItemCount();
        }

        public int getDecoratedBottom(View view) {
            return view.getBottom() + getBottomDecorationHeight(view);
        }

        public void getDecoratedBoundsWithMargins(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(View view) {
            Rect rect = ((C0603p) view.getLayoutParams()).f3965b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(View view) {
            Rect rect = ((C0603p) view.getLayoutParams()).f3965b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(View view) {
            return view.getRight() + getRightDecorationWidth(view);
        }

        public int getDecoratedTop(View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.m4455n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            AbstractC0594g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(View view) {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        public int getLayoutDirection() {
            return C0311u.m2162y(this.mRecyclerView);
        }

        public int getLeftDecorationWidth(View view) {
            return ((C0603p) view.getLayoutParams()).f3965b.left;
        }

        public int getMinimumHeight() {
            return C0311u.m2164z(this.mRecyclerView);
        }

        public int getMinimumWidth() {
            return C0311u.m2084A(this.mRecyclerView);
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return C0311u.m2088C(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return C0311u.m2090D(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(View view) {
            return ((C0603p) view.getLayoutParams()).m4238a();
        }

        public int getRightDecorationWidth(View view) {
            return ((C0603p) view.getLayoutParams()).f3965b.right;
        }

        public int getRowCountForAccessibility(C0609v c0609v, C0613z c0613z) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || recyclerView.mAdapter == null || !canScrollVertically()) {
                return 1;
            }
            return this.mRecyclerView.mAdapter.getItemCount();
        }

        public int getSelectionModeForAccessibility(C0609v c0609v, C0613z c0613z) {
            return 0;
        }

        public int getTopDecorationHeight(View view) {
            return ((C0603p) view.getLayoutParams()).f3965b.top;
        }

        public void getTransformedBoundingBox(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((C0603p) view.getLayoutParams()).f3965b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i2).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void ignoreView(View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException("View should be fully attached to be ignored" + this.mRecyclerView.exceptionLabel());
            }
            AbstractC0590c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.addFlags(128);
            this.mRecyclerView.mViewInfoStore.m4578q(childViewHolderInt);
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(C0609v c0609v, C0613z c0613z) {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            AbstractC0612y abstractC0612y = this.mSmoothScroller;
            return abstractC0612y != null && abstractC0612y.isRunning();
        }

        public boolean isViewPartiallyVisible(View view, boolean z, boolean z2) {
            boolean z3 = this.mHorizontalBoundCheck.m4556b(view, 24579) && this.mVerticalBoundCheck.m4556b(view, 24579);
            return z ? z3 : !z3;
        }

        public void layoutDecorated(View view, int i2, int i3, int i4, int i5) {
            Rect rect = ((C0603p) view.getLayoutParams()).f3965b;
            view.layout(i2 + rect.left, i3 + rect.top, i4 - rect.right, i5 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(View view, int i2, int i3, int i4, int i5) {
            C0603p c0603p = (C0603p) view.getLayoutParams();
            Rect rect = c0603p.f3965b;
            view.layout(i2 + rect.left + ((ViewGroup.MarginLayoutParams) c0603p).leftMargin, i3 + rect.top + ((ViewGroup.MarginLayoutParams) c0603p).topMargin, (i4 - rect.right) - ((ViewGroup.MarginLayoutParams) c0603p).rightMargin, (i5 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0603p).bottomMargin);
        }

        public void measureChild(View view, int i2, int i3) {
            C0603p c0603p = (C0603p) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i4 = i2 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i5 = i3 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + i4, ((ViewGroup.MarginLayoutParams) c0603p).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + i5, ((ViewGroup.MarginLayoutParams) c0603p).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, c0603p)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(View view, int i2, int i3) {
            C0603p c0603p = (C0603p) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i4 = i2 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i5 = i3 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) c0603p).leftMargin + ((ViewGroup.MarginLayoutParams) c0603p).rightMargin + i4, ((ViewGroup.MarginLayoutParams) c0603p).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) c0603p).topMargin + ((ViewGroup.MarginLayoutParams) c0603p).bottomMargin + i5, ((ViewGroup.MarginLayoutParams) c0603p).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, c0603p)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i2, int i3) {
            View childAt = getChildAt(i2);
            if (childAt != null) {
                detachViewAt(i2);
                attachView(childAt, i3);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i2 + this.mRecyclerView.toString());
            }
        }

        public void offsetChildrenHorizontal(int i2) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i2);
            }
        }

        public void offsetChildrenVertical(int i2) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i2);
            }
        }

        public void onAdapterChanged(AbstractC0594g abstractC0594g, AbstractC0594g abstractC0594g2) {
        }

        public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i2, int i3) {
            return false;
        }

        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        public void onDetachedFromWindow(RecyclerView recyclerView, C0609v c0609v) {
            onDetachedFromWindow(recyclerView);
        }

        public View onFocusSearchFailed(View view, int i2, C0609v c0609v, C0613z c0613z) {
            return null;
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        void onInitializeAccessibilityNodeInfo(C0289c c0289c) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, c0289c);
        }

        void onInitializeAccessibilityNodeInfoForItem(View view, C0289c c0289c) {
            AbstractC0590c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved() || this.mChildHelper.m4455n(childViewHolderInt.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, c0289c);
        }

        public View onInterceptFocusSearch(View view, int i2) {
            return null;
        }

        public void onItemsAdded(RecyclerView recyclerView, int i2, int i3) {
        }

        public void onItemsChanged(RecyclerView recyclerView) {
        }

        public void onItemsMoved(RecyclerView recyclerView, int i2, int i3, int i4) {
        }

        public void onItemsRemoved(RecyclerView recyclerView, int i2, int i3) {
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i2, int i3) {
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i2, int i3, Object obj) {
            onItemsUpdated(recyclerView, i2, i3);
        }

        public void onLayoutChildren(C0609v c0609v, C0613z c0613z) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void onLayoutCompleted(C0613z c0613z) {
        }

        public void onMeasure(C0609v c0609v, C0613z c0613z, int i2, int i3) {
            this.mRecyclerView.defaultOnMeasure(i2, i3);
        }

        @Deprecated
        public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i2) {
        }

        void onSmoothScrollerStopped(AbstractC0612y abstractC0612y) {
            if (this.mSmoothScroller == abstractC0612y) {
                this.mSmoothScroller = null;
            }
        }

        boolean performAccessibilityAction(int i2, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i2, bundle);
        }

        boolean performAccessibilityActionForItem(View view, int i2, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i2, bundle);
        }

        public boolean performAccessibilityActionForItem(C0609v c0609v, C0613z c0613z, View view, int i2, Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                C0311u.m2115a0(recyclerView, runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.m4458q(childCount);
            }
        }

        public void removeAndRecycleAllViews(C0609v c0609v) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, c0609v);
                }
            }
        }

        void removeAndRecycleScrapInt(C0609v c0609v) {
            int iM4283j = c0609v.m4283j();
            for (int i2 = iM4283j - 1; i2 >= 0; i2--) {
                View viewM4287n = c0609v.m4287n(i2);
                AbstractC0590c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(viewM4287n);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(viewM4287n, false);
                    }
                    AbstractC0599l abstractC0599l = this.mRecyclerView.mItemAnimator;
                    if (abstractC0599l != null) {
                        abstractC0599l.endAnimation(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    c0609v.m4296y(viewM4287n);
                }
            }
            c0609v.m4278e();
            if (iM4283j > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(View view, C0609v c0609v) {
            removeView(view);
            c0609v.m4264B(view);
        }

        public void removeAndRecycleViewAt(int i2, C0609v c0609v) {
            View childAt = getChildAt(i2);
            removeViewAt(i2);
            c0609v.m4264B(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        public void removeView(View view) {
            this.mChildHelper.m4457p(view);
        }

        public void removeViewAt(int i2) {
            if (getChildAt(i2) != null) {
                this.mChildHelper.m4458q(i2);
            }
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z, false);
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        public int scrollHorizontallyBy(int i2, C0609v c0609v, C0613z c0613z) {
            return 0;
        }

        public void scrollToPosition(int i2) {
        }

        public int scrollVerticallyBy(int i2, C0609v c0609v, C0613z c0613z) {
            return 0;
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z) {
            this.mAutoMeasure = z;
        }

        void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setItemPrefetchEnabled(boolean z) {
            if (z != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.m4272K();
                }
            }
        }

        void setMeasureSpecs(int i2, int i3) {
            this.mWidth = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i3);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.mHeightMode = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.mHeight = 0;
        }

        public void setMeasuredDimension(Rect rect, int i2, int i3) {
            setMeasuredDimension(chooseSize(i2, rect.width() + getPaddingLeft() + getPaddingRight(), getMinimumWidth()), chooseSize(i3, rect.height() + getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
        }

        void setMeasuredDimensionFromChildren(int i2, int i3) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i2, i3);
                return;
            }
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i9 = rect.left;
                if (i9 < i6) {
                    i6 = i9;
                }
                int i10 = rect.right;
                if (i10 > i4) {
                    i4 = i10;
                }
                int i11 = rect.top;
                if (i11 < i7) {
                    i7 = i11;
                }
                int i12 = rect.bottom;
                if (i12 > i5) {
                    i5 = i12;
                }
            }
            this.mRecyclerView.mTempRect.set(i6, i7, i4, i5);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i2, i3);
        }

        public void setMeasurementCacheEnabled(boolean z) {
            this.mMeasurementCacheEnabled = z;
        }

        void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        boolean shouldMeasureChild(View view, int i2, int i3, C0603p c0603p) {
            return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getWidth(), i2, ((ViewGroup.MarginLayoutParams) c0603p).width) && isMeasurementUpToDate(view.getHeight(), i3, ((ViewGroup.MarginLayoutParams) c0603p).height)) ? false : true;
        }

        boolean shouldMeasureTwice() {
            return false;
        }

        boolean shouldReMeasureChild(View view, int i2, int i3, C0603p c0603p) {
            return (this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getMeasuredWidth(), i2, ((ViewGroup.MarginLayoutParams) c0603p).width) && isMeasurementUpToDate(view.getMeasuredHeight(), i3, ((ViewGroup.MarginLayoutParams) c0603p).height)) ? false : true;
        }

        public void smoothScrollToPosition(RecyclerView recyclerView, C0613z c0613z, int i2) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void startSmoothScroll(AbstractC0612y abstractC0612y) {
            AbstractC0612y abstractC0612y2 = this.mSmoothScroller;
            if (abstractC0612y2 != null && abstractC0612y != abstractC0612y2 && abstractC0612y2.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = abstractC0612y;
            abstractC0612y.start(this.mRecyclerView, this);
        }

        public void stopIgnoringView(View view) {
            AbstractC0590c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        void stopSmoothScroller() {
            AbstractC0612y abstractC0612y = this.mSmoothScroller;
            if (abstractC0612y != null) {
                abstractC0612y.stop();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        public void addDisappearingView(View view, int i2) {
            addViewInt(view, i2, true);
        }

        public void addView(View view, int i2) {
            addViewInt(view, i2, false);
        }

        public void onInitializeAccessibilityEvent(C0609v c0609v, C0613z c0613z, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            AbstractC0594g abstractC0594g = this.mRecyclerView.mAdapter;
            if (abstractC0594g != null) {
                accessibilityEvent.setItemCount(abstractC0594g.getItemCount());
            }
        }

        public void onInitializeAccessibilityNodeInfo(C0609v c0609v, C0613z c0613z, C0289c c0289c) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                c0289c.m1972a(8192);
                c0289c.m2001r0(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                c0289c.m1972a(AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT);
                c0289c.m2001r0(true);
            }
            c0289c.m1973a0(C0289c.b.m2016a(getRowCountForAccessibility(c0609v, c0613z), getColumnCountForAccessibility(c0609v, c0613z), isLayoutHierarchical(c0609v, c0613z), getSelectionModeForAccessibility(c0609v, c0613z)));
        }

        public boolean onRequestChildFocus(RecyclerView recyclerView, C0613z c0613z, View view, View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        public boolean performAccessibilityAction(C0609v c0609v, C0613z c0613z, int i2, Bundle bundle) {
            int height;
            int width;
            int i3;
            int i4;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return false;
            }
            if (i2 == 4096) {
                height = recyclerView.canScrollVertically(1) ? (getHeight() - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                    i3 = height;
                    i4 = width;
                }
                i3 = height;
                i4 = 0;
            } else if (i2 != 8192) {
                i4 = 0;
                i3 = 0;
            } else {
                height = recyclerView.canScrollVertically(-1) ? -((getHeight() - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    width = -((getWidth() - getPaddingLeft()) - getPaddingRight());
                    i3 = height;
                    i4 = width;
                }
                i3 = height;
                i4 = 0;
            }
            if (i3 == 0 && i4 == 0) {
                return false;
            }
            this.mRecyclerView.smoothScrollBy(i4, i3, null, Integer.MIN_VALUE, true);
            return true;
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(view, rect);
            int i2 = childRectangleOnScreenScrollAmount[0];
            int i3 = childRectangleOnScreenScrollAmount[1];
            if ((z2 && !isFocusedChildVisibleAfterScrolling(recyclerView, i2, i3)) || (i2 == 0 && i3 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i2, i3);
            } else {
                recyclerView.smoothScrollBy(i2, i3);
            }
            return true;
        }

        public static int getChildMeasureSpec(int i2, int i3, int i4, int i5, boolean z) {
            int iMax = Math.max(0, i2 - i4);
            if (z) {
                if (i5 < 0) {
                    if (i5 != -1 || (i3 != Integer.MIN_VALUE && (i3 == 0 || i3 != 1073741824))) {
                        i3 = 0;
                        i5 = 0;
                    } else {
                        i5 = iMax;
                    }
                }
                i3 = 1073741824;
            } else {
                if (i5 < 0) {
                    if (i5 != -1) {
                        if (i5 == -2) {
                            i3 = (i3 == Integer.MIN_VALUE || i3 == 1073741824) ? Integer.MIN_VALUE : 0;
                        }
                        i3 = 0;
                        i5 = 0;
                    }
                    i5 = iMax;
                }
                i3 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(i5, i3);
        }

        public void onInitializeAccessibilityNodeInfoForItem(C0609v c0609v, C0613z c0613z, View view, C0289c c0289c) {
            c0289c.m1975b0(C0289c.c.m2017f(canScrollVertically() ? getPosition(view) : 0, 1, canScrollHorizontally() ? getPosition(view) : 0, 1, false, false));
        }

        public void attachView(View view, int i2) {
            attachView(view, i2, (C0603p) view.getLayoutParams());
        }

        public C0603p generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new C0603p(context, attributeSet);
        }

        public void setMeasuredDimension(int i2, int i3) {
            this.mRecyclerView.setMeasuredDimension(i2, i3);
        }

        public void attachView(View view) {
            attachView(view, -1);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public interface InterfaceC0604q {
        /* renamed from: a */
        void m4242a(View view);

        /* renamed from: b */
        void m4243b(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public static abstract class AbstractC0605r {
        public abstract boolean onFling(int i2, int i3);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public interface InterfaceC0606s {
        /* renamed from: a */
        void mo4244a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: b */
        boolean mo4245b(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: c */
        void mo4246c(boolean z);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public static abstract class AbstractC0607t {
        public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
        }

        public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public static class C0608u {

        /* renamed from: a */
        SparseArray<a> f3968a = new SparseArray<>();

        /* renamed from: b */
        private int f3969b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$u$a */
        static class a {

            /* renamed from: a */
            final ArrayList<AbstractC0590c0> f3970a = new ArrayList<>();

            /* renamed from: b */
            int f3971b = 5;

            /* renamed from: c */
            long f3972c = 0;

            /* renamed from: d */
            long f3973d = 0;

            a() {
            }
        }

        /* renamed from: g */
        private a m4247g(int i2) {
            a aVar = this.f3968a.get(i2);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f3968a.put(i2, aVar2);
            return aVar2;
        }

        /* renamed from: a */
        void m4248a() {
            this.f3969b++;
        }

        /* renamed from: b */
        public void mo4249b() {
            for (int i2 = 0; i2 < this.f3968a.size(); i2++) {
                this.f3968a.valueAt(i2).f3970a.clear();
            }
        }

        /* renamed from: c */
        void m4250c() {
            this.f3969b--;
        }

        /* renamed from: d */
        void m4251d(int i2, long j2) {
            a aVarM4247g = m4247g(i2);
            aVarM4247g.f3973d = m4256j(aVarM4247g.f3973d, j2);
        }

        /* renamed from: e */
        void m4252e(int i2, long j2) {
            a aVarM4247g = m4247g(i2);
            aVarM4247g.f3972c = m4256j(aVarM4247g.f3972c, j2);
        }

        /* renamed from: f */
        public AbstractC0590c0 mo4253f(int i2) {
            a aVar = this.f3968a.get(i2);
            if (aVar == null || aVar.f3970a.isEmpty()) {
                return null;
            }
            ArrayList<AbstractC0590c0> arrayList = aVar.f3970a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* renamed from: h */
        void m4254h(AbstractC0594g abstractC0594g, AbstractC0594g abstractC0594g2, boolean z) {
            if (abstractC0594g != null) {
                m4250c();
            }
            if (!z && this.f3969b == 0) {
                mo4249b();
            }
            if (abstractC0594g2 != null) {
                m4248a();
            }
        }

        /* renamed from: i */
        public void mo4255i(AbstractC0590c0 abstractC0590c0) {
            int itemViewType = abstractC0590c0.getItemViewType();
            ArrayList<AbstractC0590c0> arrayList = m4247g(itemViewType).f3970a;
            if (this.f3968a.get(itemViewType).f3971b <= arrayList.size()) {
                return;
            }
            abstractC0590c0.resetInternal();
            arrayList.add(abstractC0590c0);
        }

        /* renamed from: j */
        long m4256j(long j2, long j3) {
            return j2 == 0 ? j3 : ((j2 / 4) * 3) + (j3 / 4);
        }

        /* renamed from: k */
        boolean m4257k(int i2, long j2, long j3) {
            long j4 = m4247g(i2).f3973d;
            return j4 == 0 || j2 + j4 < j3;
        }

        /* renamed from: l */
        boolean m4258l(int i2, long j2, long j3) {
            long j4 = m4247g(i2).f3972c;
            return j4 == 0 || j2 + j4 < j3;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public final class C0609v {

        /* renamed from: a */
        final ArrayList<AbstractC0590c0> f3974a;

        /* renamed from: b */
        ArrayList<AbstractC0590c0> f3975b;

        /* renamed from: c */
        final ArrayList<AbstractC0590c0> f3976c;

        /* renamed from: d */
        private final List<AbstractC0590c0> f3977d;

        /* renamed from: e */
        private int f3978e;

        /* renamed from: f */
        int f3979f;

        /* renamed from: g */
        C0608u f3980g;

        /* renamed from: h */
        private AbstractC0586a0 f3981h;

        public C0609v() {
            ArrayList<AbstractC0590c0> arrayList = new ArrayList<>();
            this.f3974a = arrayList;
            this.f3975b = null;
            this.f3976c = new ArrayList<>();
            this.f3977d = Collections.unmodifiableList(arrayList);
            this.f3978e = 2;
            this.f3979f = 2;
        }

        /* renamed from: H */
        private boolean m4259H(AbstractC0590c0 abstractC0590c0, int i2, int i3, long j2) {
            abstractC0590c0.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = abstractC0590c0.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j2 != RecyclerView.FOREVER_NS && !this.f3980g.m4257k(itemViewType, nanoTime, j2)) {
                return false;
            }
            RecyclerView.this.mAdapter.bindViewHolder(abstractC0590c0, i2);
            this.f3980g.m4251d(abstractC0590c0.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            m4260b(abstractC0590c0);
            if (!RecyclerView.this.mState.m4309e()) {
                return true;
            }
            abstractC0590c0.mPreLayoutPosition = i3;
            return true;
        }

        /* renamed from: b */
        private void m4260b(AbstractC0590c0 abstractC0590c0) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = abstractC0590c0.itemView;
                if (C0311u.m2158w(view) == 0) {
                    C0311u.m2153t0(view, 1);
                }
                C0634o c0634o = RecyclerView.this.mAccessibilityDelegate;
                if (c0634o == null) {
                    return;
                }
                C0280a c0280aMo4160n = c0634o.mo4160n();
                if (c0280aMo4160n instanceof C0634o.a) {
                    ((C0634o.a) c0280aMo4160n).m4551o(view);
                }
                C0311u.m2131i0(view, c0280aMo4160n);
            }
        }

        /* renamed from: q */
        private void m4261q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m4261q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        /* renamed from: r */
        private void m4262r(AbstractC0590c0 abstractC0590c0) {
            View view = abstractC0590c0.itemView;
            if (view instanceof ViewGroup) {
                m4261q((ViewGroup) view, false);
            }
        }

        /* renamed from: A */
        void m4263A(int i2) {
            m4275a(this.f3976c.get(i2), true);
            this.f3976c.remove(i2);
        }

        /* renamed from: B */
        public void m4264B(View view) {
            AbstractC0590c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            m4265C(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
                return;
            }
            RecyclerView.this.mItemAnimator.endAnimation(childViewHolderInt);
        }

        /* renamed from: C */
        void m4265C(AbstractC0590c0 abstractC0590c0) {
            boolean z;
            boolean z2 = true;
            if (abstractC0590c0.isScrap() || abstractC0590c0.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(abstractC0590c0.isScrap());
                sb.append(" isAttached:");
                sb.append(abstractC0590c0.itemView.getParent() != null);
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            }
            if (abstractC0590c0.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC0590c0 + RecyclerView.this.exceptionLabel());
            }
            if (abstractC0590c0.shouldIgnore()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
            }
            boolean zDoesTransientStatePreventRecycling = abstractC0590c0.doesTransientStatePreventRecycling();
            AbstractC0594g abstractC0594g = RecyclerView.this.mAdapter;
            if ((abstractC0594g != null && zDoesTransientStatePreventRecycling && abstractC0594g.onFailedToRecycleView(abstractC0590c0)) || abstractC0590c0.isRecyclable()) {
                if (this.f3979f <= 0 || abstractC0590c0.hasAnyOfTheFlags(526)) {
                    z = false;
                } else {
                    int size = this.f3976c.size();
                    if (size >= this.f3979f && size > 0) {
                        m4263A(0);
                        size--;
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.m4519d(abstractC0590c0.mPosition)) {
                        int i2 = size - 1;
                        while (i2 >= 0) {
                            if (!RecyclerView.this.mPrefetchRegistry.m4519d(this.f3976c.get(i2).mPosition)) {
                                break;
                            } else {
                                i2--;
                            }
                        }
                        size = i2 + 1;
                    }
                    this.f3976c.add(size, abstractC0590c0);
                    z = true;
                }
                if (z) {
                    z = z;
                    z2 = false;
                } else {
                    m4275a(abstractC0590c0, true);
                    z = z;
                }
            } else {
                z2 = false;
            }
            RecyclerView.this.mViewInfoStore.m4578q(abstractC0590c0);
            if (z || z2 || !zDoesTransientStatePreventRecycling) {
                return;
            }
            abstractC0590c0.mOwnerRecyclerView = null;
        }

        /* renamed from: D */
        void m4266D(View view) {
            AbstractC0590c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f3975b == null) {
                    this.f3975b = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f3975b.add(childViewHolderInt);
                return;
            }
            if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || RecyclerView.this.mAdapter.hasStableIds()) {
                childViewHolderInt.setScrapContainer(this, false);
                this.f3974a.add(childViewHolderInt);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
            }
        }

        /* renamed from: E */
        void m4267E(C0608u c0608u) {
            C0608u c0608u2 = this.f3980g;
            if (c0608u2 != null) {
                c0608u2.m4250c();
            }
            this.f3980g = c0608u;
            if (c0608u == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f3980g.m4248a();
        }

        /* renamed from: F */
        void m4268F(AbstractC0586a0 abstractC0586a0) {
        }

        /* renamed from: G */
        public void m4269G(int i2) {
            this.f3978e = i2;
            m4272K();
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0134 A[PHI: r1 r4
          0x0134: PHI (r1v12 androidx.recyclerview.widget.RecyclerView$c0) = (r1v11 androidx.recyclerview.widget.RecyclerView$c0), (r1v30 androidx.recyclerview.widget.RecyclerView$c0) binds: [B:28:0x005d, B:50:0x00b5] A[DONT_GENERATE, DONT_INLINE]
          0x0134: PHI (r4v3 boolean) = (r4v2 boolean), (r4v7 boolean) binds: [B:28:0x005d, B:50:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0155  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0181  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x01b1  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x01bf  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x01db A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:99:0x01de  */
        /* renamed from: I */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        androidx.recyclerview.widget.RecyclerView.AbstractC0590c0 m4270I(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 538
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0609v.m4270I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$c0");
        }

        /* renamed from: J */
        void m4271J(AbstractC0590c0 abstractC0590c0) {
            if (abstractC0590c0.mInChangeScrap) {
                this.f3975b.remove(abstractC0590c0);
            } else {
                this.f3974a.remove(abstractC0590c0);
            }
            abstractC0590c0.mScrapContainer = null;
            abstractC0590c0.mInChangeScrap = false;
            abstractC0590c0.clearReturnedFromScrapFlag();
        }

        /* renamed from: K */
        void m4272K() {
            AbstractC0602o abstractC0602o = RecyclerView.this.mLayout;
            this.f3979f = this.f3978e + (abstractC0602o != null ? abstractC0602o.mPrefetchMaxCountObserved : 0);
            for (int size = this.f3976c.size() - 1; size >= 0 && this.f3976c.size() > this.f3979f; size--) {
                m4263A(size);
            }
        }

        /* renamed from: L */
        boolean m4273L(AbstractC0590c0 abstractC0590c0) {
            if (abstractC0590c0.isRemoved()) {
                return RecyclerView.this.mState.m4309e();
            }
            int i2 = abstractC0590c0.mPosition;
            if (i2 >= 0 && i2 < RecyclerView.this.mAdapter.getItemCount()) {
                if (RecyclerView.this.mState.m4309e() || RecyclerView.this.mAdapter.getItemViewType(abstractC0590c0.mPosition) == abstractC0590c0.getItemViewType()) {
                    return !RecyclerView.this.mAdapter.hasStableIds() || abstractC0590c0.getItemId() == RecyclerView.this.mAdapter.getItemId(abstractC0590c0.mPosition);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC0590c0 + RecyclerView.this.exceptionLabel());
        }

        /* renamed from: M */
        void m4274M(int i2, int i3) {
            int i4;
            int i5 = i3 + i2;
            for (int size = this.f3976c.size() - 1; size >= 0; size--) {
                AbstractC0590c0 abstractC0590c0 = this.f3976c.get(size);
                if (abstractC0590c0 != null && (i4 = abstractC0590c0.mPosition) >= i2 && i4 < i5) {
                    abstractC0590c0.addFlags(2);
                    m4263A(size);
                }
            }
        }

        /* renamed from: a */
        void m4275a(AbstractC0590c0 abstractC0590c0, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(abstractC0590c0);
            View view = abstractC0590c0.itemView;
            C0634o c0634o = RecyclerView.this.mAccessibilityDelegate;
            if (c0634o != null) {
                C0280a c0280aMo4160n = c0634o.mo4160n();
                C0311u.m2131i0(view, c0280aMo4160n instanceof C0634o.a ? ((C0634o.a) c0280aMo4160n).m4550n(view) : null);
            }
            if (z) {
                m4280g(abstractC0590c0);
            }
            abstractC0590c0.mOwnerRecyclerView = null;
            m4282i().mo4255i(abstractC0590c0);
        }

        /* renamed from: c */
        public void m4276c() {
            this.f3974a.clear();
            m4297z();
        }

        /* renamed from: d */
        void m4277d() {
            int size = this.f3976c.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f3976c.get(i2).clearOldPosition();
            }
            int size2 = this.f3974a.size();
            for (int i3 = 0; i3 < size2; i3++) {
                this.f3974a.get(i3).clearOldPosition();
            }
            ArrayList<AbstractC0590c0> arrayList = this.f3975b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    this.f3975b.get(i4).clearOldPosition();
                }
            }
        }

        /* renamed from: e */
        void m4278e() {
            this.f3974a.clear();
            ArrayList<AbstractC0590c0> arrayList = this.f3975b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: f */
        public int m4279f(int i2) {
            if (i2 >= 0 && i2 < RecyclerView.this.mState.m4306b()) {
                return !RecyclerView.this.mState.m4309e() ? i2 : RecyclerView.this.mAdapterHelper.m4423m(i2);
            }
            throw new IndexOutOfBoundsException("invalid position " + i2 + ". State item count is " + RecyclerView.this.mState.m4306b() + RecyclerView.this.exceptionLabel());
        }

        /* renamed from: g */
        void m4280g(AbstractC0590c0 abstractC0590c0) {
            InterfaceC0610w interfaceC0610w = RecyclerView.this.mRecyclerListener;
            if (interfaceC0610w != null) {
                interfaceC0610w.m4298a(abstractC0590c0);
            }
            AbstractC0594g abstractC0594g = RecyclerView.this.mAdapter;
            if (abstractC0594g != null) {
                abstractC0594g.onViewRecycled(abstractC0590c0);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.m4578q(abstractC0590c0);
            }
        }

        /* renamed from: h */
        AbstractC0590c0 m4281h(int i2) {
            int size;
            int iM4423m;
            ArrayList<AbstractC0590c0> arrayList = this.f3975b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i3 = 0; i3 < size; i3++) {
                    AbstractC0590c0 abstractC0590c0 = this.f3975b.get(i3);
                    if (!abstractC0590c0.wasReturnedFromScrap() && abstractC0590c0.getLayoutPosition() == i2) {
                        abstractC0590c0.addFlags(32);
                        return abstractC0590c0;
                    }
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && (iM4423m = RecyclerView.this.mAdapterHelper.m4423m(i2)) > 0 && iM4423m < RecyclerView.this.mAdapter.getItemCount()) {
                    long itemId = RecyclerView.this.mAdapter.getItemId(iM4423m);
                    for (int i4 = 0; i4 < size; i4++) {
                        AbstractC0590c0 abstractC0590c02 = this.f3975b.get(i4);
                        if (!abstractC0590c02.wasReturnedFromScrap() && abstractC0590c02.getItemId() == itemId) {
                            abstractC0590c02.addFlags(32);
                            return abstractC0590c02;
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: i */
        C0608u m4282i() {
            if (this.f3980g == null) {
                this.f3980g = new C0608u();
            }
            return this.f3980g;
        }

        /* renamed from: j */
        int m4283j() {
            return this.f3974a.size();
        }

        /* renamed from: k */
        public List<AbstractC0590c0> m4284k() {
            return this.f3977d;
        }

        /* renamed from: l */
        AbstractC0590c0 m4285l(long j2, int i2, boolean z) {
            for (int size = this.f3974a.size() - 1; size >= 0; size--) {
                AbstractC0590c0 abstractC0590c0 = this.f3974a.get(size);
                if (abstractC0590c0.getItemId() == j2 && !abstractC0590c0.wasReturnedFromScrap()) {
                    if (i2 == abstractC0590c0.getItemViewType()) {
                        abstractC0590c0.addFlags(32);
                        if (abstractC0590c0.isRemoved() && !RecyclerView.this.mState.m4309e()) {
                            abstractC0590c0.setFlags(2, 14);
                        }
                        return abstractC0590c0;
                    }
                    if (!z) {
                        this.f3974a.remove(size);
                        RecyclerView.this.removeDetachedView(abstractC0590c0.itemView, false);
                        m4296y(abstractC0590c0.itemView);
                    }
                }
            }
            int size2 = this.f3976c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                AbstractC0590c0 abstractC0590c02 = this.f3976c.get(size2);
                if (abstractC0590c02.getItemId() == j2 && !abstractC0590c02.isAttachedToTransitionOverlay()) {
                    if (i2 == abstractC0590c02.getItemViewType()) {
                        if (!z) {
                            this.f3976c.remove(size2);
                        }
                        return abstractC0590c02;
                    }
                    if (!z) {
                        m4263A(size2);
                        return null;
                    }
                }
            }
        }

        /* renamed from: m */
        AbstractC0590c0 m4286m(int i2, boolean z) {
            View viewM4448e;
            int size = this.f3974a.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC0590c0 abstractC0590c0 = this.f3974a.get(i3);
                if (!abstractC0590c0.wasReturnedFromScrap() && abstractC0590c0.getLayoutPosition() == i2 && !abstractC0590c0.isInvalid() && (RecyclerView.this.mState.f3998h || !abstractC0590c0.isRemoved())) {
                    abstractC0590c0.addFlags(32);
                    return abstractC0590c0;
                }
            }
            if (z || (viewM4448e = RecyclerView.this.mChildHelper.m4448e(i2)) == null) {
                int size2 = this.f3976c.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    AbstractC0590c0 abstractC0590c02 = this.f3976c.get(i4);
                    if (!abstractC0590c02.isInvalid() && abstractC0590c02.getLayoutPosition() == i2 && !abstractC0590c02.isAttachedToTransitionOverlay()) {
                        if (!z) {
                            this.f3976c.remove(i4);
                        }
                        return abstractC0590c02;
                    }
                }
                return null;
            }
            AbstractC0590c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(viewM4448e);
            RecyclerView.this.mChildHelper.m4460s(viewM4448e);
            int iM4454m = RecyclerView.this.mChildHelper.m4454m(viewM4448e);
            if (iM4454m != -1) {
                RecyclerView.this.mChildHelper.m4447d(iM4454m);
                m4266D(viewM4448e);
                childViewHolderInt.addFlags(8224);
                return childViewHolderInt;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + RecyclerView.this.exceptionLabel());
        }

        /* renamed from: n */
        View m4287n(int i2) {
            return this.f3974a.get(i2).itemView;
        }

        /* renamed from: o */
        public View m4288o(int i2) {
            return m4289p(i2, false);
        }

        /* renamed from: p */
        View m4289p(int i2, boolean z) {
            return m4270I(i2, z, RecyclerView.FOREVER_NS).itemView;
        }

        /* renamed from: s */
        void m4290s() {
            int size = this.f3976c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0603p c0603p = (C0603p) this.f3976c.get(i2).itemView.getLayoutParams();
                if (c0603p != null) {
                    c0603p.f3966c = true;
                }
            }
        }

        /* renamed from: t */
        void m4291t() {
            int size = this.f3976c.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC0590c0 abstractC0590c0 = this.f3976c.get(i2);
                if (abstractC0590c0 != null) {
                    abstractC0590c0.addFlags(6);
                    abstractC0590c0.addChangePayload(null);
                }
            }
            AbstractC0594g abstractC0594g = RecyclerView.this.mAdapter;
            if (abstractC0594g == null || !abstractC0594g.hasStableIds()) {
                m4297z();
            }
        }

        /* renamed from: u */
        void m4292u(int i2, int i3) {
            int size = this.f3976c.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractC0590c0 abstractC0590c0 = this.f3976c.get(i4);
                if (abstractC0590c0 != null && abstractC0590c0.mPosition >= i2) {
                    abstractC0590c0.offsetPosition(i3, true);
                }
            }
        }

        /* renamed from: v */
        void m4293v(int i2, int i3) {
            int i4;
            int i5;
            int i6;
            int i7;
            if (i2 < i3) {
                i4 = -1;
                i6 = i2;
                i5 = i3;
            } else {
                i4 = 1;
                i5 = i2;
                i6 = i3;
            }
            int size = this.f3976c.size();
            for (int i8 = 0; i8 < size; i8++) {
                AbstractC0590c0 abstractC0590c0 = this.f3976c.get(i8);
                if (abstractC0590c0 != null && (i7 = abstractC0590c0.mPosition) >= i6 && i7 <= i5) {
                    if (i7 == i2) {
                        abstractC0590c0.offsetPosition(i3 - i2, false);
                    } else {
                        abstractC0590c0.offsetPosition(i4, false);
                    }
                }
            }
        }

        /* renamed from: w */
        void m4294w(int i2, int i3, boolean z) {
            int i4 = i2 + i3;
            for (int size = this.f3976c.size() - 1; size >= 0; size--) {
                AbstractC0590c0 abstractC0590c0 = this.f3976c.get(size);
                if (abstractC0590c0 != null) {
                    int i5 = abstractC0590c0.mPosition;
                    if (i5 >= i4) {
                        abstractC0590c0.offsetPosition(-i3, z);
                    } else if (i5 >= i2) {
                        abstractC0590c0.addFlags(8);
                        m4263A(size);
                    }
                }
            }
        }

        /* renamed from: x */
        void m4295x(AbstractC0594g abstractC0594g, AbstractC0594g abstractC0594g2, boolean z) {
            m4276c();
            m4282i().m4254h(abstractC0594g, abstractC0594g2, z);
        }

        /* renamed from: y */
        void m4296y(View view) {
            AbstractC0590c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.mScrapContainer = null;
            childViewHolderInt.mInChangeScrap = false;
            childViewHolderInt.clearReturnedFromScrapFlag();
            m4265C(childViewHolderInt);
        }

        /* renamed from: z */
        void m4297z() {
            for (int size = this.f3976c.size() - 1; size >= 0; size--) {
                m4263A(size);
            }
            this.f3976c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.m4517b();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public interface InterfaceC0610w {
        /* renamed from: a */
        void m4298a(AbstractC0590c0 abstractC0590c0);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    private class C0611x extends AbstractC0596i {
        C0611x() {
        }

        /* renamed from: a */
        void m4299a() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    C0311u.m2115a0(recyclerView, recyclerView.mUpdateChildViewsRunnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0596i
        public void onChanged() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f3997g = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (RecyclerView.this.mAdapterHelper.m4426p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0596i
        public void onItemRangeChanged(int i2, int i3, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m4428r(i2, i3, obj)) {
                m4299a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0596i
        public void onItemRangeInserted(int i2, int i3) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m4429s(i2, i3)) {
                m4299a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0596i
        public void onItemRangeMoved(int i2, int i3, int i4) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m4430t(i2, i3, i4)) {
                m4299a();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0596i
        public void onItemRangeRemoved(int i2, int i3) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m4431u(i2, i3)) {
                m4299a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public static abstract class AbstractC0612y {
        private AbstractC0602o mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private boolean mRunning;
        private boolean mStarted;
        private View mTargetView;
        private int mTargetPosition = -1;
        private final a mRecyclingAction = new a(0, 0);

        /* renamed from: androidx.recyclerview.widget.RecyclerView$y$a */
        public static class a {

            /* renamed from: a */
            private int f3984a;

            /* renamed from: b */
            private int f3985b;

            /* renamed from: c */
            private int f3986c;

            /* renamed from: d */
            private int f3987d;

            /* renamed from: e */
            private Interpolator f3988e;

            /* renamed from: f */
            private boolean f3989f;

            /* renamed from: g */
            private int f3990g;

            public a(int i2, int i3) {
                this(i2, i3, Integer.MIN_VALUE, null);
            }

            /* renamed from: e */
            private void m4300e() {
                if (this.f3988e != null && this.f3986c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f3986c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* renamed from: a */
            boolean m4301a() {
                return this.f3987d >= 0;
            }

            /* renamed from: b */
            public void m4302b(int i2) {
                this.f3987d = i2;
            }

            /* renamed from: c */
            void m4303c(RecyclerView recyclerView) {
                int i2 = this.f3987d;
                if (i2 >= 0) {
                    this.f3987d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i2);
                    this.f3989f = false;
                } else {
                    if (!this.f3989f) {
                        this.f3990g = 0;
                        return;
                    }
                    m4300e();
                    recyclerView.mViewFlinger.m4193f(this.f3984a, this.f3985b, this.f3986c, this.f3988e);
                    int i3 = this.f3990g + 1;
                    this.f3990g = i3;
                    if (i3 > 10) {
                        Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f3989f = false;
                }
            }

            /* renamed from: d */
            public void m4304d(int i2, int i3, int i4, Interpolator interpolator) {
                this.f3984a = i2;
                this.f3985b = i3;
                this.f3986c = i4;
                this.f3988e = interpolator;
                this.f3989f = true;
            }

            public a(int i2, int i3, int i4, Interpolator interpolator) {
                this.f3987d = -1;
                this.f3989f = false;
                this.f3990g = 0;
                this.f3984a = i2;
                this.f3985b = i3;
                this.f3986c = i4;
                this.f3988e = interpolator;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$y$b */
        public interface b {
            PointF computeScrollVectorForPosition(int i2);
        }

        public PointF computeScrollVectorForPosition(int i2) {
            Object layoutManager = getLayoutManager();
            if (layoutManager instanceof b) {
                return ((b) layoutManager).computeScrollVectorForPosition(i2);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View findViewByPosition(int i2) {
            return this.mRecyclerView.mLayout.findViewByPosition(i2);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.getChildCount();
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        public AbstractC0602o getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        @Deprecated
        public void instantScrollToPosition(int i2) {
            this.mRecyclerView.scrollToPosition(i2);
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        protected void normalize(PointF pointF) {
            float f2 = pointF.x;
            float f3 = pointF.y;
            float fSqrt = (float) Math.sqrt((f2 * f2) + (f3 * f3));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        void onAnimation(int i2, int i3) {
            PointF pointFComputeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f2 = pointFComputeScrollVectorForPosition.x;
                if (f2 != 0.0f || pointFComputeScrollVectorForPosition.y != 0.0f) {
                    recyclerView.scrollStep((int) Math.signum(f2), (int) Math.signum(pointFComputeScrollVectorForPosition.y), null);
                }
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.m4303c(recyclerView);
                    stop();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i2, i3, recyclerView.mState, this.mRecyclingAction);
                boolean zM4301a = this.mRecyclingAction.m4301a();
                this.mRecyclingAction.m4303c(recyclerView);
                if (zM4301a && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.mViewFlinger.m4192e();
                }
            }
        }

        protected void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
            }
        }

        protected abstract void onSeekTargetStep(int i2, int i3, C0613z c0613z, a aVar);

        protected abstract void onStart();

        protected abstract void onStop();

        protected abstract void onTargetFound(View view, C0613z c0613z, a aVar);

        public void setTargetPosition(int i2) {
            this.mTargetPosition = i2;
        }

        void start(RecyclerView recyclerView, AbstractC0602o abstractC0602o) {
            recyclerView.mViewFlinger.m4194g();
            if (this.mStarted) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = abstractC0602o;
            int i2 = this.mTargetPosition;
            if (i2 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.mState.f3991a = i2;
            this.mRunning = true;
            this.mPendingInitialRun = true;
            this.mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            this.mRecyclerView.mViewFlinger.m4192e();
            this.mStarted = true;
        }

        protected final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.mState.f3991a = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.onSmoothScrollerStopped(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static class C0613z {

        /* renamed from: b */
        private SparseArray<Object> f3992b;

        /* renamed from: m */
        int f4003m;

        /* renamed from: n */
        long f4004n;

        /* renamed from: o */
        int f4005o;

        /* renamed from: p */
        int f4006p;

        /* renamed from: q */
        int f4007q;

        /* renamed from: a */
        int f3991a = -1;

        /* renamed from: c */
        int f3993c = 0;

        /* renamed from: d */
        int f3994d = 0;

        /* renamed from: e */
        int f3995e = 1;

        /* renamed from: f */
        int f3996f = 0;

        /* renamed from: g */
        boolean f3997g = false;

        /* renamed from: h */
        boolean f3998h = false;

        /* renamed from: i */
        boolean f3999i = false;

        /* renamed from: j */
        boolean f4000j = false;

        /* renamed from: k */
        boolean f4001k = false;

        /* renamed from: l */
        boolean f4002l = false;

        /* renamed from: a */
        void m4305a(int i2) {
            if ((this.f3995e & i2) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i2) + " but it is " + Integer.toBinaryString(this.f3995e));
        }

        /* renamed from: b */
        public int m4306b() {
            return this.f3998h ? this.f3993c - this.f3994d : this.f3996f;
        }

        /* renamed from: c */
        public int m4307c() {
            return this.f3991a;
        }

        /* renamed from: d */
        public boolean m4308d() {
            return this.f3991a != -1;
        }

        /* renamed from: e */
        public boolean m4309e() {
            return this.f3998h;
        }

        /* renamed from: f */
        void m4310f(AbstractC0594g abstractC0594g) {
            this.f3995e = 1;
            this.f3996f = abstractC0594g.getItemCount();
            this.f3998h = false;
            this.f3999i = false;
            this.f4000j = false;
        }

        /* renamed from: g */
        public boolean m4311g() {
            return this.f4002l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f3991a + ", mData=" + this.f3992b + ", mItemCount=" + this.f3996f + ", mIsMeasuring=" + this.f4000j + ", mPreviousLayoutItemCount=" + this.f3993c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3994d + ", mStructureChanged=" + this.f3997g + ", mInPreLayout=" + this.f3998h + ", mRunSimpleAnimations=" + this.f4001k + ", mRunPredictiveAnimations=" + this.f4002l + '}';
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        FORCE_INVALIDATE_DISPLAY_LIST = i2 == 18 || i2 == 19 || i2 == 20;
        ALLOW_SIZE_IN_UNSPECIFIED_SPEC = i2 >= 23;
        POST_UPDATES_ON_ANIMATION = i2 >= 16;
        ALLOW_THREAD_GAP_WORK = i2 >= 21;
        FORCE_ABS_FOCUS_SEARCH_DIRECTION = i2 <= 15;
        IGNORE_DETACHED_FOCUSED_CHILD = i2 <= 15;
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new InterpolatorC0589c();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void addAnimatingView(AbstractC0590c0 abstractC0590c0) {
        View view = abstractC0590c0.itemView;
        boolean z = view.getParent() == this;
        this.mRecycler.m4271J(getChildViewHolder(view));
        if (abstractC0590c0.isTmpDetached()) {
            this.mChildHelper.m4446c(view, -1, view.getLayoutParams(), true);
        } else if (z) {
            this.mChildHelper.m4453k(view);
        } else {
            this.mChildHelper.m4445b(view, true);
        }
    }

    private void animateChange(AbstractC0590c0 abstractC0590c0, AbstractC0590c0 abstractC0590c02, AbstractC0599l.c cVar, AbstractC0599l.c cVar2, boolean z, boolean z2) {
        abstractC0590c0.setIsRecyclable(false);
        if (z) {
            addAnimatingView(abstractC0590c0);
        }
        if (abstractC0590c0 != abstractC0590c02) {
            if (z2) {
                addAnimatingView(abstractC0590c02);
            }
            abstractC0590c0.mShadowedHolder = abstractC0590c02;
            addAnimatingView(abstractC0590c0);
            this.mRecycler.m4271J(abstractC0590c0);
            abstractC0590c02.setIsRecyclable(false);
            abstractC0590c02.mShadowingHolder = abstractC0590c0;
        }
        if (this.mItemAnimator.animateChange(abstractC0590c0, abstractC0590c02, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    static void clearNestedRecyclerViewIfNotNested(AbstractC0590c0 abstractC0590c0) {
        WeakReference<RecyclerView> weakReference = abstractC0590c0.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == abstractC0590c0.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            abstractC0590c0.mNestedRecyclerView = null;
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i2, int i3) throws NoSuchMethodException, SecurityException {
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC0602o.class);
                Object[] objArr = null;
                try {
                    constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                } catch (NoSuchMethodException e2) {
                    try {
                        constructor = clsAsSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e3) {
                        e3.initCause(e2);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e3);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((AbstractC0602o) constructor.newInstance(objArr));
            } catch (ClassCastException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e4);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e5);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e6);
            } catch (InstantiationException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e8);
            }
        }
    }

    private boolean didChildRangeChange(int i2, int i3) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i2 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i2 == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(AbstractC0599l.FLAG_MOVED);
        C0288b.m1934b(accessibilityEventObtain, i2);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void dispatchLayoutStep1() {
        this.mState.m4305a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f4000j = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.m4568f();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        C0613z c0613z = this.mState;
        c0613z.f3999i = c0613z.f4001k && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        c0613z.f3998h = c0613z.f4002l;
        c0613z.f3996f = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f4001k) {
            int iM4450g = this.mChildHelper.m4450g();
            for (int i2 = 0; i2 < iM4450g; i2++) {
                AbstractC0590c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4449f(i2));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    this.mViewInfoStore.m4567e(childViewHolderInt, this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt, AbstractC0599l.buildAdapterChangeFlagsForAnimations(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads()));
                    if (this.mState.f3999i && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.m4565c(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f4002l) {
            saveOldPositions();
            C0613z c0613z2 = this.mState;
            boolean z = c0613z2.f3997g;
            c0613z2.f3997g = false;
            this.mLayout.onLayoutChildren(this.mRecycler, c0613z2);
            this.mState.f3997g = z;
            for (int i3 = 0; i3 < this.mChildHelper.m4450g(); i3++) {
                AbstractC0590c0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.m4449f(i3));
                if (!childViewHolderInt2.shouldIgnore() && !this.mViewInfoStore.m4571i(childViewHolderInt2)) {
                    int iBuildAdapterChangeFlagsForAnimations = AbstractC0599l.buildAdapterChangeFlagsForAnimations(childViewHolderInt2);
                    boolean zHasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    if (!zHasAnyOfTheFlags) {
                        iBuildAdapterChangeFlagsForAnimations |= AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT;
                    }
                    AbstractC0599l.c cVarRecordPreLayoutInformation = this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt2, iBuildAdapterChangeFlagsForAnimations, childViewHolderInt2.getUnmodifiedPayloads());
                    if (zHasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, cVarRecordPreLayoutInformation);
                    } else {
                        this.mViewInfoStore.m4563a(childViewHolderInt2, cVarRecordPreLayoutInformation);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f3995e = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.m4305a(6);
        this.mAdapterHelper.m4421j();
        this.mState.f3996f = this.mAdapter.getItemCount();
        C0613z c0613z = this.mState;
        c0613z.f3994d = 0;
        c0613z.f3998h = false;
        this.mLayout.onLayoutChildren(this.mRecycler, c0613z);
        C0613z c0613z2 = this.mState;
        c0613z2.f3997g = false;
        this.mPendingSavedState = null;
        c0613z2.f4001k = c0613z2.f4001k && this.mItemAnimator != null;
        c0613z2.f3995e = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.m4305a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C0613z c0613z = this.mState;
        c0613z.f3995e = 1;
        if (c0613z.f4001k) {
            for (int iM4450g = this.mChildHelper.m4450g() - 1; iM4450g >= 0; iM4450g--) {
                AbstractC0590c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4449f(iM4450g));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    AbstractC0599l.c cVarRecordPostLayoutInformation = this.mItemAnimator.recordPostLayoutInformation(this.mState, childViewHolderInt);
                    AbstractC0590c0 abstractC0590c0M4569g = this.mViewInfoStore.m4569g(changedHolderKey);
                    if (abstractC0590c0M4569g == null || abstractC0590c0M4569g.shouldIgnore()) {
                        this.mViewInfoStore.m4566d(childViewHolderInt, cVarRecordPostLayoutInformation);
                    } else {
                        boolean zM4570h = this.mViewInfoStore.m4570h(abstractC0590c0M4569g);
                        boolean zM4570h2 = this.mViewInfoStore.m4570h(childViewHolderInt);
                        if (zM4570h && abstractC0590c0M4569g == childViewHolderInt) {
                            this.mViewInfoStore.m4566d(childViewHolderInt, cVarRecordPostLayoutInformation);
                        } else {
                            AbstractC0599l.c cVarM4575n = this.mViewInfoStore.m4575n(abstractC0590c0M4569g);
                            this.mViewInfoStore.m4566d(childViewHolderInt, cVarRecordPostLayoutInformation);
                            AbstractC0599l.c cVarM4574m = this.mViewInfoStore.m4574m(childViewHolderInt);
                            if (cVarM4575n == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, abstractC0590c0M4569g);
                            } else {
                                animateChange(abstractC0590c0M4569g, childViewHolderInt, cVarM4575n, cVarM4574m, zM4570h, zM4570h2);
                            }
                        }
                    }
                }
            }
            this.mViewInfoStore.m4576o(this.mViewInfoProcessCallback);
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        C0613z c0613z2 = this.mState;
        c0613z2.f3993c = c0613z2.f3996f;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        c0613z2.f4001k = false;
        c0613z2.f4002l = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList<AbstractC0590c0> arrayList = this.mRecycler.f3975b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC0602o abstractC0602o = this.mLayout;
        if (abstractC0602o.mPrefetchMaxObservedInInitialPrefetch) {
            abstractC0602o.mPrefetchMaxCountObserved = 0;
            abstractC0602o.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.m4272K();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.m4568f();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        InterfaceC0606s interfaceC0606s = this.mInterceptingOnItemTouchListener;
        if (interfaceC0606s == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        interfaceC0606s.mo4244a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC0606s interfaceC0606s = this.mOnItemTouchListeners.get(i2);
            if (interfaceC0606s.mo4245b(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = interfaceC0606s;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int iM4450g = this.mChildHelper.m4450g();
        if (iM4450g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < iM4450g; i4++) {
            AbstractC0590c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4449f(i4));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i2) {
                    i2 = layoutPosition;
                }
                if (layoutPosition > i3) {
                    i3 = layoutPosition;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView recyclerViewFindNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i2));
            if (recyclerViewFindNestedRecyclerView != null) {
                return recyclerViewFindNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        AbstractC0590c0 abstractC0590c0FindViewHolderForAdapterPosition;
        C0613z c0613z = this.mState;
        int i2 = c0613z.f4003m;
        if (i2 == -1) {
            i2 = 0;
        }
        int iM4306b = c0613z.m4306b();
        for (int i3 = i2; i3 < iM4306b; i3++) {
            AbstractC0590c0 abstractC0590c0FindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i3);
            if (abstractC0590c0FindViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (abstractC0590c0FindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return abstractC0590c0FindViewHolderForAdapterPosition2.itemView;
            }
        }
        int iMin = Math.min(iM4306b, i2);
        do {
            iMin--;
            if (iMin < 0 || (abstractC0590c0FindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin)) == null) {
                return null;
            }
        } while (!abstractC0590c0FindViewHolderForAdapterPosition.itemView.hasFocusable());
        return abstractC0590c0FindViewHolderForAdapterPosition.itemView;
    }

    static AbstractC0590c0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((C0603p) view.getLayoutParams()).f3964a;
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        C0603p c0603p = (C0603p) view.getLayoutParams();
        Rect rect2 = c0603p.f3965b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0603p).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0603p).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0603p).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0603p).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private C0301k getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C0301k(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j2, AbstractC0590c0 abstractC0590c0, AbstractC0590c0 abstractC0590c02) {
        int iM4450g = this.mChildHelper.m4450g();
        for (int i2 = 0; i2 < iM4450g; i2++) {
            AbstractC0590c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4449f(i2));
            if (childViewHolderInt != abstractC0590c0 && getChangedHolderKey(childViewHolderInt) == j2) {
                AbstractC0594g abstractC0594g = this.mAdapter;
                if (abstractC0594g == null || !abstractC0594g.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + abstractC0590c0 + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + abstractC0590c0 + exceptionLabel());
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC0590c02 + " cannot be found but it is necessary for " + abstractC0590c0 + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int iM4450g = this.mChildHelper.m4450g();
        for (int i2 = 0; i2 < iM4450g; i2++) {
            AbstractC0590c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4449f(i2));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (C0311u.m2160x(this) == 0) {
            C0311u.m2155u0(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new C0623d(new C0592e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i2) {
        int i3;
        if (view2 == null || view2 == this || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c2 = 65535;
        int i4 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i5 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i6 = rect2.left;
        if ((i5 < i6 || rect.right <= i6) && rect.right < rect2.right) {
            i3 = 1;
        } else {
            int i7 = rect.right;
            int i8 = rect2.right;
            i3 = ((i7 > i8 || i5 >= i8) && i5 > i6) ? -1 : 0;
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
            c2 = 1;
        } else {
            int i11 = rect.bottom;
            int i12 = rect2.bottom;
            if ((i11 <= i12 && i9 < i12) || i9 <= i10) {
                c2 = 0;
            }
        }
        if (i2 == 1) {
            return c2 < 0 || (c2 == 0 && i3 * i4 <= 0);
        }
        if (i2 == 2) {
            return c2 > 0 || (c2 == 0 && i3 * i4 >= 0);
        }
        if (i2 == 17) {
            return i3 < 0;
        }
        if (i2 == 33) {
            return c2 < 0;
        }
        if (i2 == 66) {
            return i3 > 0;
        }
        if (i2 == 130) {
            return c2 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i2 + exceptionLabel());
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i2);
            int x = (int) (motionEvent.getX(i2) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i2) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.m4434y();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.m4432w();
        } else {
            this.mAdapterHelper.m4421j();
        }
        boolean z2 = false;
        boolean z3 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f4001k = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z = this.mDataSetHasChangedAfterLayout) || z3 || this.mLayout.mRequestedSimpleAnimations) && (!z || this.mAdapter.hasStableIds());
        C0613z c0613z = this.mState;
        if (c0613z.f4001k && z3 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z2 = true;
        }
        c0613z.f4002l = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L21
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r3 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            androidx.core.widget.C0325f.m2310a(r3, r4, r9)
        L1f:
            r9 = 1
            goto L3c
        L21:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L3b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r3 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.C0325f.m2310a(r3, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L56
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.C0325f.m2310a(r9, r0, r7)
            goto L72
        L56:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L71
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.C0325f.m2310a(r9, r3, r0)
            goto L72
        L71:
            r1 = r9
        L72:
            if (r1 != 0) goto L7c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            androidx.core.view.C0311u.m2113Z(r6)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void recoverFocusFromState() {
        View viewFindViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.mChildHelper.m4455n(focusedChild)) {
                    return;
                }
            } else if (this.mChildHelper.m4450g() == 0) {
                requestFocus();
                return;
            }
        }
        View viewFindNextViewToFocus = null;
        AbstractC0590c0 abstractC0590c0FindViewHolderForItemId = (this.mState.f4004n == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.f4004n);
        if (abstractC0590c0FindViewHolderForItemId != null && !this.mChildHelper.m4455n(abstractC0590c0FindViewHolderForItemId.itemView) && abstractC0590c0FindViewHolderForItemId.itemView.hasFocusable()) {
            viewFindNextViewToFocus = abstractC0590c0FindViewHolderForItemId.itemView;
        } else if (this.mChildHelper.m4450g() > 0) {
            viewFindNextViewToFocus = findNextViewToFocus();
        }
        if (viewFindNextViewToFocus != null) {
            int i2 = this.mState.f4005o;
            if (i2 != -1 && (viewFindViewById = viewFindNextViewToFocus.findViewById(i2)) != null && viewFindViewById.isFocusable()) {
                viewFindNextViewToFocus = viewFindViewById;
            }
            viewFindNextViewToFocus.requestFocus();
        }
    }

    private void releaseGlows() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            C0311u.m2113Z(this);
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0603p) {
            C0603p c0603p = (C0603p) layoutParams;
            if (!c0603p.f3966c) {
                Rect rect = c0603p.f3965b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        C0613z c0613z = this.mState;
        c0613z.f4004n = -1L;
        c0613z.f4003m = -1;
        c0613z.f4005o = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        AbstractC0590c0 abstractC0590c0FindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (abstractC0590c0FindContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f4004n = this.mAdapter.hasStableIds() ? abstractC0590c0FindContainingViewHolder.getItemId() : -1L;
        this.mState.f4003m = this.mDataSetHasChangedAfterLayout ? -1 : abstractC0590c0FindContainingViewHolder.isRemoved() ? abstractC0590c0FindContainingViewHolder.mOldPosition : abstractC0590c0FindContainingViewHolder.getAdapterPosition();
        this.mState.f4005o = getDeepestFocusedViewWithId(abstractC0590c0FindContainingViewHolder.itemView);
    }

    private void setAdapterInternal(AbstractC0594g abstractC0594g, boolean z, boolean z2) {
        AbstractC0594g abstractC0594g2 = this.mAdapter;
        if (abstractC0594g2 != null) {
            abstractC0594g2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.m4434y();
        AbstractC0594g abstractC0594g3 = this.mAdapter;
        this.mAdapter = abstractC0594g;
        if (abstractC0594g != null) {
            abstractC0594g.registerAdapterDataObserver(this.mObserver);
            abstractC0594g.onAttachedToRecyclerView(this);
        }
        AbstractC0602o abstractC0602o = this.mLayout;
        if (abstractC0602o != null) {
            abstractC0602o.onAdapterChanged(abstractC0594g3, this.mAdapter);
        }
        this.mRecycler.m4295x(abstractC0594g3, this.mAdapter, z);
        this.mState.f3997g = true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.m4194g();
        AbstractC0602o abstractC0602o = this.mLayout;
        if (abstractC0602o != null) {
            abstractC0602o.stopSmoothScroller();
        }
    }

    void absorbGlows(int i2, int i3) {
        if (i2 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i3);
            }
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        C0311u.m2113Z(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        AbstractC0602o abstractC0602o = this.mLayout;
        if (abstractC0602o == null || !abstractC0602o.onAddFocusables(this, arrayList, i2, i3)) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    public void addItemDecoration(AbstractC0601n abstractC0601n, int i2) {
        AbstractC0602o abstractC0602o = this.mLayout;
        if (abstractC0602o != null) {
            abstractC0602o.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.mItemDecorations.add(abstractC0601n);
        } else {
            this.mItemDecorations.add(i2, abstractC0601n);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(InterfaceC0604q interfaceC0604q) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(interfaceC0604q);
    }

    public void addOnItemTouchListener(InterfaceC0606s interfaceC0606s) {
        this.mOnItemTouchListeners.add(interfaceC0606s);
    }

    public void addOnScrollListener(AbstractC0607t abstractC0607t) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(abstractC0607t);
    }

    void animateAppearance(AbstractC0590c0 abstractC0590c0, AbstractC0599l.c cVar, AbstractC0599l.c cVar2) {
        abstractC0590c0.setIsRecyclable(false);
        if (this.mItemAnimator.animateAppearance(abstractC0590c0, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    void animateDisappearance(AbstractC0590c0 abstractC0590c0, AbstractC0599l.c cVar, AbstractC0599l.c cVar2) {
        addAnimatingView(abstractC0590c0);
        abstractC0590c0.setIsRecyclable(false);
        if (this.mItemAnimator.animateDisappearance(abstractC0590c0, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        throw new IllegalStateException(str + exceptionLabel());
    }

    void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(HttpUrl.FRAGMENT_ENCODE_SET + exceptionLabel()));
        }
    }

    boolean canReuseUpdatedViewHolder(AbstractC0590c0 abstractC0590c0) {
        AbstractC0599l abstractC0599l = this.mItemAnimator;
        return abstractC0599l == null || abstractC0599l.canReuseUpdatedViewHolder(abstractC0590c0, abstractC0590c0.getUnmodifiedPayloads());
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0603p) && this.mLayout.checkLayoutParams((C0603p) layoutParams);
    }

    void clearOldPositions() {
        int iM4452j = this.mChildHelper.m4452j();
        for (int i2 = 0; i2 < iM4452j; i2++) {
            AbstractC0590c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4451i(i2));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        this.mRecycler.m4277d();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<InterfaceC0604q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<AbstractC0607t> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        AbstractC0602o abstractC0602o = this.mLayout;
        if (abstractC0602o != null && abstractC0602o.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        AbstractC0602o abstractC0602o = this.mLayout;
        if (abstractC0602o != null && abstractC0602o.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        AbstractC0602o abstractC0602o = this.mLayout;
        if (abstractC0602o != null && abstractC0602o.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        AbstractC0602o abstractC0602o = this.mLayout;
        if (abstractC0602o != null && abstractC0602o.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        AbstractC0602o abstractC0602o = this.mLayout;
        if (abstractC0602o != null && abstractC0602o.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        AbstractC0602o abstractC0602o = this.mLayout;
        if (abstractC0602o != null && abstractC0602o.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    void considerReleasingGlowsOnScroll(int i2, int i3) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            zIsFinished = false;
        } else {
            this.mLeftGlow.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.mRightGlow.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.mTopGlow.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.mBottomGlow.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            C0311u.m2113Z(this);
        }
    }

    void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            C0275d.m1840a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            C0275d.m1841b();
            return;
        }
        if (this.mAdapterHelper.m4426p()) {
            if (!this.mAdapterHelper.m4425o(4) || this.mAdapterHelper.m4425o(11)) {
                if (this.mAdapterHelper.m4426p()) {
                    C0275d.m1840a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    C0275d.m1841b();
                    return;
                }
                return;
            }
            C0275d.m1840a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.m4432w();
            if (!this.mLayoutWasDefered) {
                if (hasUpdatedView()) {
                    dispatchLayout();
                } else {
                    this.mAdapterHelper.m4420i();
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            C0275d.m1841b();
        }
    }

    void defaultOnMeasure(int i2, int i3) {
        setMeasuredDimension(AbstractC0602o.chooseSize(i2, getPaddingLeft() + getPaddingRight(), C0311u.m2084A(this)), AbstractC0602o.chooseSize(i3, getPaddingTop() + getPaddingBottom(), C0311u.m2164z(this)));
    }

    void dispatchChildAttached(View view) {
        AbstractC0590c0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        AbstractC0594g abstractC0594g = this.mAdapter;
        if (abstractC0594g != null && childViewHolderInt != null) {
            abstractC0594g.onViewAttachedToWindow(childViewHolderInt);
        }
        List<InterfaceC0604q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).m4243b(view);
            }
        }
    }

    void dispatchChildDetached(View view) {
        AbstractC0590c0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        AbstractC0594g abstractC0594g = this.mAdapter;
        if (abstractC0594g != null && childViewHolderInt != null) {
            abstractC0594g.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<InterfaceC0604q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).m4242a(view);
            }
        }
    }

    void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.e(TAG, "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        C0613z c0613z = this.mState;
        c0613z.f4000j = false;
        if (c0613z.f3995e == 1) {
            dispatchLayoutStep1();
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else if (!this.mAdapterHelper.m4427q() && this.mLayout.getWidth() == getWidth() && this.mLayout.getHeight() == getHeight()) {
            this.mLayout.setExactMeasureSpecsFrom(this);
        } else {
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        }
        dispatchLayoutStep3();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return getScrollingChildHelper().m2060a(f2, f3, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().m2061b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m2062c(i2, i3, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().m2065f(i2, i3, i4, i5, iArr);
    }

    void dispatchOnScrollStateChanged(int i2) {
        AbstractC0602o abstractC0602o = this.mLayout;
        if (abstractC0602o != null) {
            abstractC0602o.onScrollStateChanged(i2);
        }
        onScrollStateChanged(i2);
        AbstractC0607t abstractC0607t = this.mScrollListener;
        if (abstractC0607t != null) {
            abstractC0607t.onScrollStateChanged(this, i2);
        }
        List<AbstractC0607t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i2);
            }
        }
    }

    void dispatchOnScrolled(int i2, int i3) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        onScrolled(i2, i3);
        AbstractC0607t abstractC0607t = this.mScrollListener;
        if (abstractC0607t != null) {
            abstractC0607t.onScrolled(this, i2, i3);
        }
        List<AbstractC0607t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i2, i3);
            }
        }
        this.mDispatchScrollCounter--;
    }

    void dispatchPendingImportantForAccessibilityChanges() {
        int i2;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            AbstractC0590c0 abstractC0590c0 = this.mPendingAccessibilityImportanceChange.get(size);
            if (abstractC0590c0.itemView.getParent() == this && !abstractC0590c0.shouldIgnore() && (i2 = abstractC0590c0.mPendingAccessibilityState) != -1) {
                C0311u.m2153t0(abstractC0590c0.itemView, i2);
                abstractC0590c0.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.isRunning()) ? z : true) {
            C0311u.m2113Z(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect edgeEffectM4227a = this.mEdgeEffectFactory.m4227a(this, 3);
        this.mBottomGlow = edgeEffectM4227a;
        if (this.mClipToPadding) {
            edgeEffectM4227a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectM4227a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect edgeEffectM4227a = this.mEdgeEffectFactory.m4227a(this, 0);
        this.mLeftGlow = edgeEffectM4227a;
        if (this.mClipToPadding) {
            edgeEffectM4227a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectM4227a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect edgeEffectM4227a = this.mEdgeEffectFactory.m4227a(this, 2);
        this.mRightGlow = edgeEffectM4227a;
        if (this.mClipToPadding) {
            edgeEffectM4227a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectM4227a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect edgeEffectM4227a = this.mEdgeEffectFactory.m4227a(this, 1);
        this.mTopGlow = edgeEffectM4227a;
        if (this.mClipToPadding) {
            edgeEffectM4227a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectM4227a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    final void fillRemainingScrollValues(C0613z c0613z) {
        if (getScrollState() != 2) {
            c0613z.f4006p = 0;
            c0613z.f4007q = 0;
        } else {
            OverScroller overScroller = this.mViewFlinger.f3945h;
            c0613z.f4006p = overScroller.getFinalX() - overScroller.getCurrX();
            c0613z.f4007q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public View findChildViewUnder(float f2, float f3) {
        for (int iM4450g = this.mChildHelper.m4450g() - 1; iM4450g >= 0; iM4450g--) {
            View viewM4449f = this.mChildHelper.m4449f(iM4450g);
            float translationX = viewM4449f.getTranslationX();
            float translationY = viewM4449f.getTranslationY();
            if (f2 >= viewM4449f.getLeft() + translationX && f2 <= viewM4449f.getRight() + translationX && f3 >= viewM4449f.getTop() + translationY && f3 <= viewM4449f.getBottom() + translationY) {
                return viewM4449f;
            }
        }
        return null;
    }

    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public AbstractC0590c0 findContainingViewHolder(View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    public AbstractC0590c0 findViewHolderForAdapterPosition(int i2) {
        AbstractC0590c0 abstractC0590c0 = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int iM4452j = this.mChildHelper.m4452j();
        for (int i3 = 0; i3 < iM4452j; i3++) {
            AbstractC0590c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4451i(i3));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionFor(childViewHolderInt) == i2) {
                if (!this.mChildHelper.m4455n(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                abstractC0590c0 = childViewHolderInt;
            }
        }
        return abstractC0590c0;
    }

    public AbstractC0590c0 findViewHolderForItemId(long j2) {
        AbstractC0594g abstractC0594g = this.mAdapter;
        AbstractC0590c0 abstractC0590c0 = null;
        if (abstractC0594g != null && abstractC0594g.hasStableIds()) {
            int iM4452j = this.mChildHelper.m4452j();
            for (int i2 = 0; i2 < iM4452j; i2++) {
                AbstractC0590c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4451i(i2));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j2) {
                    if (!this.mChildHelper.m4455n(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    abstractC0590c0 = childViewHolderInt;
                }
            }
        }
        return abstractC0590c0;
    }

    public AbstractC0590c0 findViewHolderForLayoutPosition(int i2) {
        return findViewHolderForPosition(i2, false);
    }

    @Deprecated
    public AbstractC0590c0 findViewHolderForPosition(int i2) {
        return findViewHolderForPosition(i2, false);
    }

    public boolean fling(int i2, int i3) {
        AbstractC0602o abstractC0602o = this.mLayout;
        if (abstractC0602o == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.mLayoutSuppressed) {
            return false;
        }
        boolean zCanScrollHorizontally = abstractC0602o.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (!zCanScrollHorizontally || Math.abs(i2) < this.mMinFlingVelocity) {
            i2 = 0;
        }
        if (!zCanScrollVertically || Math.abs(i3) < this.mMinFlingVelocity) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return false;
        }
        float f2 = i2;
        float f3 = i3;
        if (!dispatchNestedPreFling(f2, f3)) {
            boolean z = zCanScrollHorizontally || zCanScrollVertically;
            dispatchNestedFling(f2, f3, z);
            AbstractC0605r abstractC0605r = this.mOnFlingListener;
            if (abstractC0605r != null && abstractC0605r.onFling(i2, i3)) {
                return true;
            }
            if (z) {
                int i4 = zCanScrollHorizontally ? 1 : 0;
                if (zCanScrollVertically) {
                    i4 |= 2;
                }
                startNestedScroll(i4, 1);
                int i5 = this.mMaxFlingVelocity;
                int iMax = Math.max(-i5, Math.min(i2, i5));
                int i6 = this.mMaxFlingVelocity;
                this.mViewFlinger.m4191c(iMax, Math.max(-i6, Math.min(i3, i6)));
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i2) {
        View viewOnFocusSearchFailed;
        boolean z;
        View viewOnInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i2);
        if (viewOnInterceptFocusSearch != null) {
            return viewOnInterceptFocusSearch;
        }
        boolean z2 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z2 && (i2 == 2 || i2 == 1)) {
            if (this.mLayout.canScrollVertically()) {
                int i3 = i2 == 2 ? 130 : 33;
                z = focusFinder.findNextFocus(this, view, i3) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i2 = i3;
                }
            } else {
                z = false;
            }
            if (!z && this.mLayout.canScrollHorizontally()) {
                int i4 = (this.mLayout.getLayoutDirection() == 1) ^ (i2 == 2) ? 66 : 17;
                boolean z3 = focusFinder.findNextFocus(this, view, i4) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i2 = i4;
                }
                z = z3;
            }
            if (z) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i2, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            viewOnFocusSearchFailed = focusFinder.findNextFocus(this, view, i2);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i2);
            if (viewFindNextFocus == null && z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                viewOnFocusSearchFailed = this.mLayout.onFocusSearchFailed(view, i2, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                viewOnFocusSearchFailed = viewFindNextFocus;
            }
        }
        if (viewOnFocusSearchFailed == null || viewOnFocusSearchFailed.hasFocusable()) {
            return isPreferredNextFocus(view, viewOnFocusSearchFailed, i2) ? viewOnFocusSearchFailed : super.focusSearch(view, i2);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        }
        requestChildOnScreen(viewOnFocusSearchFailed, null);
        return view;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0602o abstractC0602o = this.mLayout;
        if (abstractC0602o != null) {
            return abstractC0602o.generateDefaultLayoutParams();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0602o abstractC0602o = this.mLayout;
        if (abstractC0602o != null) {
            return abstractC0602o.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0594g getAdapter() {
        return this.mAdapter;
    }

    int getAdapterPositionFor(AbstractC0590c0 abstractC0590c0) {
        if (abstractC0590c0.hasAnyOfTheFlags(524) || !abstractC0590c0.isBound()) {
            return -1;
        }
        return this.mAdapterHelper.m4419e(abstractC0590c0.mPosition);
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0602o abstractC0602o = this.mLayout;
        return abstractC0602o != null ? abstractC0602o.getBaseline() : super.getBaseline();
    }

    long getChangedHolderKey(AbstractC0590c0 abstractC0590c0) {
        return this.mAdapter.hasStableIds() ? abstractC0590c0.getItemId() : abstractC0590c0.mPosition;
    }

    public int getChildAdapterPosition(View view) {
        AbstractC0590c0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        InterfaceC0597j interfaceC0597j = this.mChildDrawingOrderCallback;
        return interfaceC0597j == null ? super.getChildDrawingOrder(i2, i3) : interfaceC0597j.m4226a(i2, i3);
    }

    public long getChildItemId(View view) {
        AbstractC0590c0 childViewHolderInt;
        AbstractC0594g abstractC0594g = this.mAdapter;
        if (abstractC0594g == null || !abstractC0594g.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(View view) {
        AbstractC0590c0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public AbstractC0590c0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public C0634o getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public C0598k getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public AbstractC0599l getItemAnimator() {
        return this.mItemAnimator;
    }

    Rect getItemDecorInsetsForChild(View view) {
        C0603p c0603p = (C0603p) view.getLayoutParams();
        if (!c0603p.f3966c) {
            return c0603p.f3965b;
        }
        if (this.mState.m4309e() && (c0603p.m4239b() || c0603p.m4241d())) {
            return c0603p.f3965b;
        }
        Rect rect = c0603p.f3965b;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i2).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i3 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c0603p.f3966c = false;
        return rect;
    }

    public AbstractC0601n getItemDecorationAt(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 >= 0 && i2 < itemDecorationCount) {
            return this.mItemDecorations.get(i2);
        }
        throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public AbstractC0602o getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC0605r getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public C0608u getRecycledViewPool() {
        return this.mRecycler.m4282i();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m2067k();
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.m4426p();
    }

    void initAdapterManager() {
        this.mAdapterHelper = new C0620a(new C0593f());
    }

    void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new C0626g(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C1005b.f6666a), resources.getDimensionPixelSize(C1005b.f6668c), resources.getDimensionPixelOffset(C1005b.f6667b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
        }
    }

    void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        AbstractC0602o abstractC0602o = this.mLayout;
        if (abstractC0602o != null) {
            abstractC0602o.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        AbstractC0599l abstractC0599l = this.mItemAnimator;
        return abstractC0599l != null && abstractC0599l.isRunning();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0300j
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m2069m();
    }

    void jumpToPositionForSmoothScroller(int i2) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i2);
        awakenScrollBars();
    }

    void markItemDecorInsetsDirty() {
        int iM4452j = this.mChildHelper.m4452j();
        for (int i2 = 0; i2 < iM4452j; i2++) {
            ((C0603p) this.mChildHelper.m4451i(i2).getLayoutParams()).f3966c = true;
        }
        this.mRecycler.m4290s();
    }

    void markKnownViewsInvalid() {
        int iM4452j = this.mChildHelper.m4452j();
        for (int i2 = 0; i2 < iM4452j; i2++) {
            AbstractC0590c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4451i(i2));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.m4291t();
    }

    public void offsetChildrenHorizontal(int i2) {
        int iM4450g = this.mChildHelper.m4450g();
        for (int i3 = 0; i3 < iM4450g; i3++) {
            this.mChildHelper.m4449f(i3).offsetLeftAndRight(i2);
        }
    }

    public void offsetChildrenVertical(int i2) {
        int iM4450g = this.mChildHelper.m4450g();
        for (int i3 = 0; i3 < iM4450g; i3++) {
            this.mChildHelper.m4449f(i3).offsetTopAndBottom(i2);
        }
    }

    void offsetPositionRecordsForInsert(int i2, int i3) {
        int iM4452j = this.mChildHelper.m4452j();
        for (int i4 = 0; i4 < iM4452j; i4++) {
            AbstractC0590c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4451i(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i2) {
                childViewHolderInt.offsetPosition(i3, false);
                this.mState.f3997g = true;
            }
        }
        this.mRecycler.m4292u(i2, i3);
        requestLayout();
    }

    void offsetPositionRecordsForMove(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int iM4452j = this.mChildHelper.m4452j();
        if (i2 < i3) {
            i6 = -1;
            i5 = i2;
            i4 = i3;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i8 = 0; i8 < iM4452j; i8++) {
            AbstractC0590c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4451i(i8));
            if (childViewHolderInt != null && (i7 = childViewHolderInt.mPosition) >= i5 && i7 <= i4) {
                if (i7 == i2) {
                    childViewHolderInt.offsetPosition(i3 - i2, false);
                } else {
                    childViewHolderInt.offsetPosition(i6, false);
                }
                this.mState.f3997g = true;
            }
        }
        this.mRecycler.m4293v(i2, i3);
        requestLayout();
    }

    void offsetPositionRecordsForRemove(int i2, int i3, boolean z) {
        int i4 = i2 + i3;
        int iM4452j = this.mChildHelper.m4452j();
        for (int i5 = 0; i5 < iM4452j; i5++) {
            AbstractC0590c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4451i(i5));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i6 = childViewHolderInt.mPosition;
                if (i6 >= i4) {
                    childViewHolderInt.offsetPosition(-i3, z);
                    this.mState.f3997g = true;
                } else if (i6 >= i2) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i2 - 1, -i3, z);
                    this.mState.f3997g = true;
                }
            }
        }
        this.mRecycler.m4294w(i2, i3, z);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        AbstractC0602o abstractC0602o = this.mLayout;
        if (abstractC0602o != null) {
            abstractC0602o.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal<RunnableC0627h> threadLocal = RunnableC0627h.f4182f;
            RunnableC0627h runnableC0627h = threadLocal.get();
            this.mGapWorker = runnableC0627h;
            if (runnableC0627h == null) {
                this.mGapWorker = new RunnableC0627h();
                Display displayM2150s = C0311u.m2150s(this);
                float f2 = 60.0f;
                if (!isInEditMode() && displayM2150s != null) {
                    float refreshRate = displayM2150s.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f2 = refreshRate;
                    }
                }
                RunnableC0627h runnableC0627h2 = this.mGapWorker;
                runnableC0627h2.f4186j = (long) (1.0E9f / f2);
                threadLocal.set(runnableC0627h2);
            }
            this.mGapWorker.m4512a(this);
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        RunnableC0627h runnableC0627h;
        super.onDetachedFromWindow();
        AbstractC0599l abstractC0599l = this.mItemAnimator;
        if (abstractC0599l != null) {
            abstractC0599l.endAnimations();
        }
        stopScroll();
        this.mIsAttached = false;
        AbstractC0602o abstractC0602o = this.mLayout;
        if (abstractC0602o != null) {
            abstractC0602o.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.m4572j();
        if (!ALLOW_THREAD_GAP_WORK || (runnableC0627h = this.mGapWorker) == null) {
            return;
        }
        runnableC0627h.m4515j(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).onDraw(canvas, this, this.mState);
        }
    }

    void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.mLayoutSuppressed
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3c
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L61
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L62
        L3c:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L60
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.mLayout
            boolean r3 = r3.canScrollVertically()
            if (r3 == 0) goto L55
            float r0 = -r0
            goto L61
        L55:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L60
            r3 = r0
            r0 = 0
            goto L62
        L60:
            r0 = 0
        L61:
            r3 = 0
        L62:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6a
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6a:
            float r2 = r5.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.scrollByInternal(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        AbstractC0602o abstractC0602o = this.mLayout;
        if (abstractC0602o == null) {
            return false;
        }
        boolean zCanScrollHorizontally = abstractC0602o.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = zCanScrollHorizontally;
            if (zCanScrollVertically) {
                i2 = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i2, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i3 = x2 - this.mInitialTouchX;
                int i4 = y2 - this.mInitialTouchY;
                if (zCanScrollHorizontally == 0 || Math.abs(i3) <= this.mTouchSlop) {
                    z = false;
                } else {
                    this.mLastTouchX = x2;
                    z = true;
                }
                if (zCanScrollVertically && Math.abs(i4) > this.mTouchSlop) {
                    this.mLastTouchY = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        C0275d.m1840a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        C0275d.m1841b();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        AbstractC0602o abstractC0602o = this.mLayout;
        if (abstractC0602o == null) {
            defaultOnMeasure(i2, i3);
            return;
        }
        boolean z = false;
        if (abstractC0602o.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (z || this.mAdapter == null) {
                return;
            }
            if (this.mState.f3995e == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.setMeasureSpecs(i2, i3);
            this.mState.f4000j = true;
            dispatchLayoutStep2();
            this.mLayout.setMeasuredDimensionFromChildren(i2, i3);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f4000j = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i2, i3);
                return;
            }
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i2, i3);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            C0613z c0613z = this.mState;
            if (c0613z.f4002l) {
                c0613z.f3998h = true;
            } else {
                this.mAdapterHelper.m4421j();
                this.mState.f3998h = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f4002l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC0594g abstractC0594g = this.mAdapter;
        if (abstractC0594g != null) {
            this.mState.f3996f = abstractC0594g.getItemCount();
        } else {
            this.mState.f3996f = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i2, i3);
        stopInterceptRequestLayout(false);
        this.mState.f3998h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.m2342a());
        AbstractC0602o abstractC0602o = this.mLayout;
        if (abstractC0602o == null || (parcelable2 = this.mPendingSavedState.f3940h) == null) {
            return;
        }
        abstractC0602o.onRestoreInstanceState(parcelable2);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.m4184b(savedState2);
        } else {
            AbstractC0602o abstractC0602o = this.mLayout;
            if (abstractC0602o != null) {
                savedState.f3940h = abstractC0602o.onSaveInstanceState();
            } else {
                savedState.f3940h = null;
            }
        }
        return savedState;
    }

    public void onScrollStateChanged(int i2) {
    }

    public void onScrolled(int i2, int i3) {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df A[PHI: r0
      0x00df: PHI (r0v36 int) = (r0v26 int), (r0v40 int) binds: [B:41:0x00c8, B:45:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        C0311u.m2115a0(this, this.mItemAnimatorRunner);
        this.mPostedAnimatorRunner = true;
    }

    void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    void recordAnimationInfoIfBouncedHiddenView(AbstractC0590c0 abstractC0590c0, AbstractC0599l.c cVar) {
        abstractC0590c0.setFlags(0, 8192);
        if (this.mState.f3999i && abstractC0590c0.isUpdated() && !abstractC0590c0.isRemoved() && !abstractC0590c0.shouldIgnore()) {
            this.mViewInfoStore.m4565c(getChangedHolderKey(abstractC0590c0), abstractC0590c0);
        }
        this.mViewInfoStore.m4567e(abstractC0590c0, cVar);
    }

    void removeAndRecycleViews() {
        AbstractC0599l abstractC0599l = this.mItemAnimator;
        if (abstractC0599l != null) {
            abstractC0599l.endAnimations();
        }
        AbstractC0602o abstractC0602o = this.mLayout;
        if (abstractC0602o != null) {
            abstractC0602o.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        this.mRecycler.m4276c();
    }

    boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean zM4459r = this.mChildHelper.m4459r(view);
        if (zM4459r) {
            AbstractC0590c0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.m4271J(childViewHolderInt);
            this.mRecycler.m4265C(childViewHolderInt);
        }
        stopInterceptRequestLayout(!zM4459r);
        return zM4459r;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z) {
        AbstractC0590c0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public void removeItemDecoration(AbstractC0601n abstractC0601n) {
        AbstractC0602o abstractC0602o = this.mLayout;
        if (abstractC0602o != null) {
            abstractC0602o.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(abstractC0601n);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 >= 0 && i2 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i2));
            return;
        }
        throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(InterfaceC0604q interfaceC0604q) {
        List<InterfaceC0604q> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(interfaceC0604q);
    }

    public void removeOnItemTouchListener(InterfaceC0606s interfaceC0606s) {
        this.mOnItemTouchListeners.remove(interfaceC0606s);
        if (this.mInterceptingOnItemTouchListener == interfaceC0606s) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(AbstractC0607t abstractC0607t) {
        List<AbstractC0607t> list = this.mScrollListeners;
        if (list != null) {
            list.remove(abstractC0607t);
        }
    }

    void repositionShadowingViews() {
        AbstractC0590c0 abstractC0590c0;
        int iM4450g = this.mChildHelper.m4450g();
        for (int i2 = 0; i2 < iM4450g; i2++) {
            View viewM4449f = this.mChildHelper.m4449f(i2);
            AbstractC0590c0 childViewHolder = getChildViewHolder(viewM4449f);
            if (childViewHolder != null && (abstractC0590c0 = childViewHolder.mShadowingHolder) != null) {
                View view = abstractC0590c0.itemView;
                int left = viewM4449f.getLeft();
                int top = viewM4449f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mOnItemTouchListeners.get(i2).mo4246c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    void saveOldPositions() {
        int iM4452j = this.mChildHelper.m4452j();
        for (int i2 = 0; i2 < iM4452j; i2++) {
            AbstractC0590c0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4451i(i2));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        AbstractC0602o abstractC0602o = this.mLayout;
        if (abstractC0602o == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean zCanScrollHorizontally = abstractC0602o.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i2 = 0;
            }
            if (!zCanScrollVertically) {
                i3 = 0;
            }
            scrollByInternal(i2, i3, null);
        }
    }

    boolean scrollByInternal(int i2, int i3, MotionEvent motionEvent) {
        int i4;
        int i5;
        int i6;
        int i7;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i2, i3, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i4 = i9;
            i5 = i8;
            i6 = i2 - i8;
            i7 = i3 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i5, i4, i6, i7, this.mScrollOffset, 0, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i10 = i6 - iArr4[0];
        int i11 = i7 - iArr4[1];
        boolean z = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i12 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        this.mLastTouchX = i12 - iArr5[0];
        this.mLastTouchY -= iArr5[1];
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !C0299i.m2055a(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), i10, motionEvent.getY(), i11);
            }
            considerReleasingGlowsOnScroll(i2, i3);
        }
        if (i5 != 0 || i4 != 0) {
            dispatchOnScrolled(i5, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i5 == 0 && i4 == 0) ? false : true;
    }

    void scrollStep(int i2, int i3, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C0275d.m1840a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int iScrollHorizontallyBy = i2 != 0 ? this.mLayout.scrollHorizontallyBy(i2, this.mRecycler, this.mState) : 0;
        int iScrollVerticallyBy = i3 != 0 ? this.mLayout.scrollVerticallyBy(i3, this.mRecycler, this.mState) : 0;
        C0275d.m1841b();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i2) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        AbstractC0602o abstractC0602o = this.mLayout;
        if (abstractC0602o == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0602o.scrollToPosition(i2);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C0634o c0634o) {
        this.mAccessibilityDelegate = c0634o;
        C0311u.m2131i0(this, c0634o);
    }

    public void setAdapter(AbstractC0594g abstractC0594g) {
        setLayoutFrozen(false);
        setAdapterInternal(abstractC0594g, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0597j interfaceC0597j) {
        if (interfaceC0597j == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = interfaceC0597j;
        setChildrenDrawingOrderEnabled(interfaceC0597j != null);
    }

    boolean setChildImportantForAccessibilityInternal(AbstractC0590c0 abstractC0590c0, int i2) {
        if (!isComputingLayout()) {
            C0311u.m2153t0(abstractC0590c0.itemView, i2);
            return true;
        }
        abstractC0590c0.mPendingAccessibilityState = i2;
        this.mPendingAccessibilityImportanceChange.add(abstractC0590c0);
        return false;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0598k c0598k) {
        C0959i.m6065c(c0598k);
        this.mEdgeEffectFactory = c0598k;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public void setItemAnimator(AbstractC0599l abstractC0599l) {
        AbstractC0599l abstractC0599l2 = this.mItemAnimator;
        if (abstractC0599l2 != null) {
            abstractC0599l2.endAnimations();
            this.mItemAnimator.setListener(null);
        }
        this.mItemAnimator = abstractC0599l;
        if (abstractC0599l != null) {
            abstractC0599l.setListener(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i2) {
        this.mRecycler.m4269G(i2);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(AbstractC0602o abstractC0602o) {
        if (abstractC0602o == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            AbstractC0599l abstractC0599l = this.mItemAnimator;
            if (abstractC0599l != null) {
                abstractC0599l.endAnimations();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            this.mRecycler.m4276c();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            this.mRecycler.m4276c();
        }
        this.mChildHelper.m4456o();
        this.mLayout = abstractC0602o;
        if (abstractC0602o != null) {
            if (abstractC0602o.mRecyclerView != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC0602o + " is already attached to a RecyclerView:" + abstractC0602o.mRecyclerView.exceptionLabel());
            }
            abstractC0602o.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.m4272K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().m2070n(z);
    }

    public void setOnFlingListener(AbstractC0605r abstractC0605r) {
        this.mOnFlingListener = abstractC0605r;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0607t abstractC0607t) {
        this.mScrollListener = abstractC0607t;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public void setRecycledViewPool(C0608u c0608u) {
        this.mRecycler.m4267E(c0608u);
    }

    public void setRecyclerListener(InterfaceC0610w interfaceC0610w) {
        this.mRecyclerListener = interfaceC0610w;
    }

    void setScrollState(int i2) {
        if (i2 == this.mScrollState) {
            return;
        }
        this.mScrollState = i2;
        if (i2 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i2);
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 == 1) {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC0586a0 abstractC0586a0) {
        this.mRecycler.m4268F(abstractC0586a0);
    }

    boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int iM1933a = accessibilityEvent != null ? C0288b.m1933a(accessibilityEvent) : 0;
        this.mEatenAccessibilityChangeFlags |= iM1933a != 0 ? iM1933a : 0;
        return true;
    }

    public void smoothScrollBy(int i2, int i3) {
        smoothScrollBy(i2, i3, null);
    }

    public void smoothScrollToPosition(int i2) {
        if (this.mLayoutSuppressed) {
            return;
        }
        AbstractC0602o abstractC0602o = this.mLayout;
        if (abstractC0602o == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0602o.smoothScrollToPosition(this, this.mState, i2);
        }
    }

    void startInterceptRequestLayout() {
        int i2 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i2;
        if (i2 != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().m2071p(i2);
    }

    void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View, androidx.core.view.InterfaceC0300j
    public void stopNestedScroll() {
        getScrollingChildHelper().m2073r();
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void swapAdapter(AbstractC0594g abstractC0594g, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(abstractC0594g, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    void viewRangeUpdate(int i2, int i3, Object obj) {
        int i4;
        int iM4452j = this.mChildHelper.m4452j();
        int i5 = i2 + i3;
        for (int i6 = 0; i6 < iM4452j; i6++) {
            View viewM4451i = this.mChildHelper.m4451i(i6);
            AbstractC0590c0 childViewHolderInt = getChildViewHolderInt(viewM4451i);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i4 = childViewHolderInt.mPosition) >= i2 && i4 < i5) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((C0603p) viewM4451i.getLayoutParams()).f3966c = true;
            }
        }
        this.mRecycler.m4274M(i2, i3);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1004a.f6665a);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().m2063d(i2, i3, iArr, iArr2, i4);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return getScrollingChildHelper().m2066g(i2, i3, i4, i5, iArr, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.recyclerview.widget.RecyclerView.AbstractC0590c0 findViewHolderForPosition(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.d r0 = r5.mChildHelper
            int r0 = r0.m4452j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.d r3 = r5.mChildHelper
            android.view.View r3 = r3.m4451i(r2)
            androidx.recyclerview.widget.RecyclerView$c0 r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.d r1 = r5.mChildHelper
            android.view.View r4 = r3.itemView
            boolean r1 = r1.m4455n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findViewHolderForPosition(int, boolean):androidx.recyclerview.widget.RecyclerView$c0");
    }

    public boolean hasNestedScrollingParent(int i2) {
        return getScrollingChildHelper().m2068l(i2);
    }

    void onExitLayoutOrScroll(boolean z) {
        int i2 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i2;
        if (i2 < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator) {
        smoothScrollBy(i2, i3, interpolator, Integer.MIN_VALUE);
    }

    public boolean startNestedScroll(int i2, int i3) {
        return getScrollingChildHelper().m2072q(i2, i3);
    }

    public void stopNestedScroll(int i2) {
        getScrollingChildHelper().m2074s(i2);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) throws NoSuchMethodException, SecurityException {
        super(context, attributeSet, i2);
        this.mObserver = new C0611x();
        this.mRecycler = new C0609v();
        this.mViewInfoStore = new C0639t();
        this.mUpdateChildViewsRunnable = new RunnableC0585a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new C0598k();
        this.mItemAnimator = new C0624e();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        boolean z = true;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new RunnableC0588b0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new RunnableC0627h.b() : null;
        this.mState = new C0613z();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new C0600m();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new RunnableC0587b();
        this.mViewInfoProcessCallback = new C0591d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = C0312v.m2203b(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = C0312v.m2205d(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.setListener(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (C0311u.m2158w(this) == 0) {
            C0311u.m2153t0(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0634o(this));
        int[] iArr = C1006c.f6674f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        }
        String string = typedArrayObtainStyledAttributes.getString(C1006c.f6683o);
        if (typedArrayObtainStyledAttributes.getInt(C1006c.f6677i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(C1006c.f6676h, true);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(C1006c.f6678j, false);
        this.mEnableFastScroller = z2;
        if (z2) {
            initFastScroller((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(C1006c.f6681m), typedArrayObtainStyledAttributes.getDrawable(C1006c.f6682n), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(C1006c.f6679k), typedArrayObtainStyledAttributes.getDrawable(C1006c.f6680l));
        }
        typedArrayObtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i2, 0);
        if (i3 >= 21) {
            int[] iArr2 = NESTED_SCROLLING_ATTRS;
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
            if (i3 >= 29) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i2, 0);
            }
            z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
            typedArrayObtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z);
    }

    public final void dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().m2064e(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator, int i4) {
        smoothScrollBy(i2, i3, interpolator, i4, false);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0584a();

        /* renamed from: h */
        Parcelable f3940h;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$SavedState$a */
        static class C0584a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0584a() {
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

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3940h = parcel.readParcelable(classLoader == null ? AbstractC0602o.class.getClassLoader() : classLoader);
        }

        /* renamed from: b */
        void m4184b(SavedState savedState) {
            this.f3940h = savedState.f3940h;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeParcelable(this.f3940h, 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static class C0603p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        AbstractC0590c0 f3964a;

        /* renamed from: b */
        final Rect f3965b;

        /* renamed from: c */
        boolean f3966c;

        /* renamed from: d */
        boolean f3967d;

        public C0603p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3965b = new Rect();
            this.f3966c = true;
            this.f3967d = false;
        }

        /* renamed from: a */
        public int m4238a() {
            return this.f3964a.getLayoutPosition();
        }

        /* renamed from: b */
        public boolean m4239b() {
            return this.f3964a.isUpdated();
        }

        /* renamed from: c */
        public boolean m4240c() {
            return this.f3964a.isRemoved();
        }

        /* renamed from: d */
        public boolean m4241d() {
            return this.f3964a.isInvalid();
        }

        public C0603p(int i2, int i3) {
            super(i2, i3);
            this.f3965b = new Rect();
            this.f3966c = true;
            this.f3967d = false;
        }

        public C0603p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3965b = new Rect();
            this.f3966c = true;
            this.f3967d = false;
        }

        public C0603p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3965b = new Rect();
            this.f3966c = true;
            this.f3967d = false;
        }

        public C0603p(C0603p c0603p) {
            super((ViewGroup.LayoutParams) c0603p);
            this.f3965b = new Rect();
            this.f3966c = true;
            this.f3967d = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0602o abstractC0602o = this.mLayout;
        if (abstractC0602o != null) {
            return abstractC0602o.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    void smoothScrollBy(int i2, int i3, Interpolator interpolator, int i4, boolean z) {
        AbstractC0602o abstractC0602o = this.mLayout;
        if (abstractC0602o == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!abstractC0602o.canScrollHorizontally()) {
            i2 = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        if (i4 == Integer.MIN_VALUE || i4 > 0) {
            if (z) {
                int i5 = i2 != 0 ? 1 : 0;
                if (i3 != 0) {
                    i5 |= 2;
                }
                startNestedScroll(i5, 1);
            }
            this.mViewFlinger.m4193f(i2, i3, i4, interpolator);
            return;
        }
        scrollBy(i2, i3);
    }

    public void addItemDecoration(AbstractC0601n abstractC0601n) {
        addItemDecoration(abstractC0601n, -1);
    }
}
