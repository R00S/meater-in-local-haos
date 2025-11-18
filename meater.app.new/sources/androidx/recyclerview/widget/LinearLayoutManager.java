package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.AbstractC0602o implements RecyclerView.AbstractC0612y.b {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final C0581a mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final C0582b mLayoutChunkResult;
    private C0583c mLayoutState;
    int mOrientation;
    AbstractC0633n mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0580a();

        /* renamed from: f */
        int f3915f;

        /* renamed from: g */
        int f3916g;

        /* renamed from: h */
        boolean f3917h;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$a */
        static class C0580a implements Parcelable.Creator<SavedState> {
            C0580a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState() {
        }

        /* renamed from: a */
        boolean m4168a() {
            return this.f3915f >= 0;
        }

        /* renamed from: b */
        void m4169b() {
            this.f3915f = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f3915f);
            parcel.writeInt(this.f3916g);
            parcel.writeInt(this.f3917h ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            this.f3915f = parcel.readInt();
            this.f3916g = parcel.readInt();
            this.f3917h = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f3915f = savedState.f3915f;
            this.f3916g = savedState.f3916g;
            this.f3917h = savedState.f3917h;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    static class C0581a {

        /* renamed from: a */
        AbstractC0633n f3918a;

        /* renamed from: b */
        int f3919b;

        /* renamed from: c */
        int f3920c;

        /* renamed from: d */
        boolean f3921d;

        /* renamed from: e */
        boolean f3922e;

        C0581a() {
            m4176e();
        }

        /* renamed from: a */
        void m4172a() {
            this.f3920c = this.f3921d ? this.f3918a.mo4538i() : this.f3918a.mo4542m();
        }

        /* renamed from: b */
        public void m4173b(View view, int i2) {
            if (this.f3921d) {
                this.f3920c = this.f3918a.mo4533d(view) + this.f3918a.m4544o();
            } else {
                this.f3920c = this.f3918a.mo4536g(view);
            }
            this.f3919b = i2;
        }

        /* renamed from: c */
        public void m4174c(View view, int i2) {
            int iM4544o = this.f3918a.m4544o();
            if (iM4544o >= 0) {
                m4173b(view, i2);
                return;
            }
            this.f3919b = i2;
            if (this.f3921d) {
                int iMo4538i = (this.f3918a.mo4538i() - iM4544o) - this.f3918a.mo4533d(view);
                this.f3920c = this.f3918a.mo4538i() - iMo4538i;
                if (iMo4538i > 0) {
                    int iMo4534e = this.f3920c - this.f3918a.mo4534e(view);
                    int iMo4542m = this.f3918a.mo4542m();
                    int iMin = iMo4534e - (iMo4542m + Math.min(this.f3918a.mo4536g(view) - iMo4542m, 0));
                    if (iMin < 0) {
                        this.f3920c += Math.min(iMo4538i, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iMo4536g = this.f3918a.mo4536g(view);
            int iMo4542m2 = iMo4536g - this.f3918a.mo4542m();
            this.f3920c = iMo4536g;
            if (iMo4542m2 > 0) {
                int iMo4538i2 = (this.f3918a.mo4538i() - Math.min(0, (this.f3918a.mo4538i() - iM4544o) - this.f3918a.mo4533d(view))) - (iMo4536g + this.f3918a.mo4534e(view));
                if (iMo4538i2 < 0) {
                    this.f3920c -= Math.min(iMo4542m2, -iMo4538i2);
                }
            }
        }

        /* renamed from: d */
        boolean m4175d(View view, RecyclerView.C0613z c0613z) {
            RecyclerView.C0603p c0603p = (RecyclerView.C0603p) view.getLayoutParams();
            return !c0603p.m4240c() && c0603p.m4238a() >= 0 && c0603p.m4238a() < c0613z.m4306b();
        }

        /* renamed from: e */
        void m4176e() {
            this.f3919b = -1;
            this.f3920c = Integer.MIN_VALUE;
            this.f3921d = false;
            this.f3922e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f3919b + ", mCoordinate=" + this.f3920c + ", mLayoutFromEnd=" + this.f3921d + ", mValid=" + this.f3922e + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    protected static class C0582b {

        /* renamed from: a */
        public int f3923a;

        /* renamed from: b */
        public boolean f3924b;

        /* renamed from: c */
        public boolean f3925c;

        /* renamed from: d */
        public boolean f3926d;

        protected C0582b() {
        }

        /* renamed from: a */
        void m4177a() {
            this.f3923a = 0;
            this.f3924b = false;
            this.f3925c = false;
            this.f3926d = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    static class C0583c {

        /* renamed from: b */
        int f3928b;

        /* renamed from: c */
        int f3929c;

        /* renamed from: d */
        int f3930d;

        /* renamed from: e */
        int f3931e;

        /* renamed from: f */
        int f3932f;

        /* renamed from: g */
        int f3933g;

        /* renamed from: k */
        int f3937k;

        /* renamed from: m */
        boolean f3939m;

        /* renamed from: a */
        boolean f3927a = true;

        /* renamed from: h */
        int f3934h = 0;

        /* renamed from: i */
        int f3935i = 0;

        /* renamed from: j */
        boolean f3936j = false;

        /* renamed from: l */
        List<RecyclerView.AbstractC0590c0> f3938l = null;

        C0583c() {
        }

        /* renamed from: e */
        private View m4178e() {
            int size = this.f3938l.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = this.f3938l.get(i2).itemView;
                RecyclerView.C0603p c0603p = (RecyclerView.C0603p) view.getLayoutParams();
                if (!c0603p.m4240c() && this.f3930d == c0603p.m4238a()) {
                    m4180b(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void m4179a() {
            m4180b(null);
        }

        /* renamed from: b */
        public void m4180b(View view) {
            View viewM4183f = m4183f(view);
            if (viewM4183f == null) {
                this.f3930d = -1;
            } else {
                this.f3930d = ((RecyclerView.C0603p) viewM4183f.getLayoutParams()).m4238a();
            }
        }

        /* renamed from: c */
        boolean m4181c(RecyclerView.C0613z c0613z) {
            int i2 = this.f3930d;
            return i2 >= 0 && i2 < c0613z.m4306b();
        }

        /* renamed from: d */
        View m4182d(RecyclerView.C0609v c0609v) {
            if (this.f3938l != null) {
                return m4178e();
            }
            View viewM4288o = c0609v.m4288o(this.f3930d);
            this.f3930d += this.f3931e;
            return viewM4288o;
        }

        /* renamed from: f */
        public View m4183f(View view) {
            int iM4238a;
            int size = this.f3938l.size();
            View view2 = null;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < size; i3++) {
                View view3 = this.f3938l.get(i3).itemView;
                RecyclerView.C0603p c0603p = (RecyclerView.C0603p) view3.getLayoutParams();
                if (view3 != view && !c0603p.m4240c() && (iM4238a = (c0603p.m4238a() - this.f3930d) * this.f3931e) >= 0 && iM4238a < i2) {
                    view2 = view3;
                    if (iM4238a == 0) {
                        break;
                    }
                    i2 = iM4238a;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private int computeScrollExtent(RecyclerView.C0613z c0613z) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C0635p.m4552a(c0613z, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.C0613z c0613z) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C0635p.m4553b(c0613z, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.C0613z c0613z) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C0635p.m4554c(c0613z, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View findFirstReferenceChild(RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z) {
        return findReferenceChild(c0609v, c0613z, 0, getChildCount(), c0613z.m4306b());
    }

    private View findLastPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    private View findLastReferenceChild(RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z) {
        return findReferenceChild(c0609v, c0613z, getChildCount() - 1, -1, c0613z.m4306b());
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
        return this.mShouldReverseLayout ? findFirstPartiallyOrCompletelyInvisibleChild() : findLastPartiallyOrCompletelyInvisibleChild();
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
        return this.mShouldReverseLayout ? findLastPartiallyOrCompletelyInvisibleChild() : findFirstPartiallyOrCompletelyInvisibleChild();
    }

    private View findReferenceChildClosestToEnd(RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z) {
        return this.mShouldReverseLayout ? findFirstReferenceChild(c0609v, c0613z) : findLastReferenceChild(c0609v, c0613z);
    }

    private View findReferenceChildClosestToStart(RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z) {
        return this.mShouldReverseLayout ? findLastReferenceChild(c0609v, c0613z) : findFirstReferenceChild(c0609v, c0613z);
    }

    private int fixLayoutEndGap(int i2, RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z, boolean z) {
        int iMo4538i;
        int iMo4538i2 = this.mOrientationHelper.mo4538i() - i2;
        if (iMo4538i2 <= 0) {
            return 0;
        }
        int i3 = -scrollBy(-iMo4538i2, c0609v, c0613z);
        int i4 = i2 + i3;
        if (!z || (iMo4538i = this.mOrientationHelper.mo4538i() - i4) <= 0) {
            return i3;
        }
        this.mOrientationHelper.mo4547r(iMo4538i);
        return iMo4538i + i3;
    }

    private int fixLayoutStartGap(int i2, RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z, boolean z) {
        int iMo4542m;
        int iMo4542m2 = i2 - this.mOrientationHelper.mo4542m();
        if (iMo4542m2 <= 0) {
            return 0;
        }
        int i3 = -scrollBy(iMo4542m2, c0609v, c0613z);
        int i4 = i2 + i3;
        if (!z || (iMo4542m = i4 - this.mOrientationHelper.mo4542m()) <= 0) {
            return i3;
        }
        this.mOrientationHelper.mo4547r(-iMo4542m);
        return i3 - iMo4542m;
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private void layoutForPredictiveAnimations(RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z, int i2, int i3) {
        if (!c0613z.m4311g() || getChildCount() == 0 || c0613z.m4309e() || !supportsPredictiveItemAnimations()) {
            return;
        }
        List<RecyclerView.AbstractC0590c0> listM4284k = c0609v.m4284k();
        int size = listM4284k.size();
        int position = getPosition(getChildAt(0));
        int iMo4534e = 0;
        int iMo4534e2 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView.AbstractC0590c0 abstractC0590c0 = listM4284k.get(i4);
            if (!abstractC0590c0.isRemoved()) {
                if (((abstractC0590c0.getLayoutPosition() < position) != this.mShouldReverseLayout ? (char) 65535 : (char) 1) == 65535) {
                    iMo4534e += this.mOrientationHelper.mo4534e(abstractC0590c0.itemView);
                } else {
                    iMo4534e2 += this.mOrientationHelper.mo4534e(abstractC0590c0.itemView);
                }
            }
        }
        this.mLayoutState.f3938l = listM4284k;
        if (iMo4534e > 0) {
            updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i2);
            C0583c c0583c = this.mLayoutState;
            c0583c.f3934h = iMo4534e;
            c0583c.f3929c = 0;
            c0583c.m4179a();
            fill(c0609v, this.mLayoutState, c0613z, false);
        }
        if (iMo4534e2 > 0) {
            updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i3);
            C0583c c0583c2 = this.mLayoutState;
            c0583c2.f3934h = iMo4534e2;
            c0583c2.f3929c = 0;
            c0583c2.m4179a();
            fill(c0609v, this.mLayoutState, c0613z, false);
        }
        this.mLayoutState.f3938l = null;
    }

    private void logChildren() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.mo4536g(childAt));
        }
        Log.d(TAG, "==============");
    }

    private void recycleByLayoutState(RecyclerView.C0609v c0609v, C0583c c0583c) {
        if (!c0583c.f3927a || c0583c.f3939m) {
            return;
        }
        int i2 = c0583c.f3933g;
        int i3 = c0583c.f3935i;
        if (c0583c.f3932f == -1) {
            recycleViewsFromEnd(c0609v, i2, i3);
        } else {
            recycleViewsFromStart(c0609v, i2, i3);
        }
    }

    private void recycleChildren(RecyclerView.C0609v c0609v, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        if (i3 <= i2) {
            while (i2 > i3) {
                removeAndRecycleViewAt(i2, c0609v);
                i2--;
            }
        } else {
            for (int i4 = i3 - 1; i4 >= i2; i4--) {
                removeAndRecycleViewAt(i4, c0609v);
            }
        }
    }

    private void recycleViewsFromEnd(RecyclerView.C0609v c0609v, int i2, int i3) {
        int childCount = getChildCount();
        if (i2 < 0) {
            return;
        }
        int iMo4537h = (this.mOrientationHelper.mo4537h() - i2) + i3;
        if (this.mShouldReverseLayout) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (this.mOrientationHelper.mo4536g(childAt) < iMo4537h || this.mOrientationHelper.mo4546q(childAt) < iMo4537h) {
                    recycleChildren(c0609v, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = childCount - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View childAt2 = getChildAt(i6);
            if (this.mOrientationHelper.mo4536g(childAt2) < iMo4537h || this.mOrientationHelper.mo4546q(childAt2) < iMo4537h) {
                recycleChildren(c0609v, i5, i6);
                return;
            }
        }
    }

    private void recycleViewsFromStart(RecyclerView.C0609v c0609v, int i2, int i3) {
        if (i2 < 0) {
            return;
        }
        int i4 = i2 - i3;
        int childCount = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (this.mOrientationHelper.mo4533d(childAt) > i4 || this.mOrientationHelper.mo4545p(childAt) > i4) {
                    recycleChildren(c0609v, 0, i5);
                    return;
                }
            }
            return;
        }
        int i6 = childCount - 1;
        for (int i7 = i6; i7 >= 0; i7--) {
            View childAt2 = getChildAt(i7);
            if (this.mOrientationHelper.mo4533d(childAt2) > i4 || this.mOrientationHelper.mo4545p(childAt2) > i4) {
                recycleChildren(c0609v, i6, i7);
                return;
            }
        }
    }

    private void resolveShouldLayoutReverse() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    private boolean updateAnchorFromChildren(RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z, C0581a c0581a) {
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && c0581a.m4175d(focusedChild, c0613z)) {
            c0581a.m4174c(focusedChild, getPosition(focusedChild));
            return true;
        }
        if (this.mLastStackFromEnd != this.mStackFromEnd) {
            return false;
        }
        View viewFindReferenceChildClosestToEnd = c0581a.f3921d ? findReferenceChildClosestToEnd(c0609v, c0613z) : findReferenceChildClosestToStart(c0609v, c0613z);
        if (viewFindReferenceChildClosestToEnd == null) {
            return false;
        }
        c0581a.m4173b(viewFindReferenceChildClosestToEnd, getPosition(viewFindReferenceChildClosestToEnd));
        if (!c0613z.m4309e() && supportsPredictiveItemAnimations()) {
            if (this.mOrientationHelper.mo4536g(viewFindReferenceChildClosestToEnd) >= this.mOrientationHelper.mo4538i() || this.mOrientationHelper.mo4533d(viewFindReferenceChildClosestToEnd) < this.mOrientationHelper.mo4542m()) {
                c0581a.f3920c = c0581a.f3921d ? this.mOrientationHelper.mo4538i() : this.mOrientationHelper.mo4542m();
            }
        }
        return true;
    }

    private boolean updateAnchorFromPendingData(RecyclerView.C0613z c0613z, C0581a c0581a) {
        int i2;
        if (!c0613z.m4309e() && (i2 = this.mPendingScrollPosition) != -1) {
            if (i2 >= 0 && i2 < c0613z.m4306b()) {
                c0581a.f3919b = this.mPendingScrollPosition;
                SavedState savedState = this.mPendingSavedState;
                if (savedState != null && savedState.m4168a()) {
                    boolean z = this.mPendingSavedState.f3917h;
                    c0581a.f3921d = z;
                    if (z) {
                        c0581a.f3920c = this.mOrientationHelper.mo4538i() - this.mPendingSavedState.f3916g;
                    } else {
                        c0581a.f3920c = this.mOrientationHelper.mo4542m() + this.mPendingSavedState.f3916g;
                    }
                    return true;
                }
                if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                    boolean z2 = this.mShouldReverseLayout;
                    c0581a.f3921d = z2;
                    if (z2) {
                        c0581a.f3920c = this.mOrientationHelper.mo4538i() - this.mPendingScrollPositionOffset;
                    } else {
                        c0581a.f3920c = this.mOrientationHelper.mo4542m() + this.mPendingScrollPositionOffset;
                    }
                    return true;
                }
                View viewFindViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                if (viewFindViewByPosition == null) {
                    if (getChildCount() > 0) {
                        c0581a.f3921d = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                    }
                    c0581a.m4172a();
                } else {
                    if (this.mOrientationHelper.mo4534e(viewFindViewByPosition) > this.mOrientationHelper.mo4543n()) {
                        c0581a.m4172a();
                        return true;
                    }
                    if (this.mOrientationHelper.mo4536g(viewFindViewByPosition) - this.mOrientationHelper.mo4542m() < 0) {
                        c0581a.f3920c = this.mOrientationHelper.mo4542m();
                        c0581a.f3921d = false;
                        return true;
                    }
                    if (this.mOrientationHelper.mo4538i() - this.mOrientationHelper.mo4533d(viewFindViewByPosition) < 0) {
                        c0581a.f3920c = this.mOrientationHelper.mo4538i();
                        c0581a.f3921d = true;
                        return true;
                    }
                    c0581a.f3920c = c0581a.f3921d ? this.mOrientationHelper.mo4533d(viewFindViewByPosition) + this.mOrientationHelper.m4544o() : this.mOrientationHelper.mo4536g(viewFindViewByPosition);
                }
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    private void updateAnchorInfoForLayout(RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z, C0581a c0581a) {
        if (updateAnchorFromPendingData(c0613z, c0581a) || updateAnchorFromChildren(c0609v, c0613z, c0581a)) {
            return;
        }
        c0581a.m4172a();
        c0581a.f3919b = this.mStackFromEnd ? c0613z.m4306b() - 1 : 0;
    }

    private void updateLayoutState(int i2, int i3, boolean z, RecyclerView.C0613z c0613z) {
        int iMo4542m;
        this.mLayoutState.f3939m = resolveIsInfinite();
        this.mLayoutState.f3932f = i2;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c0613z, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z2 = i2 == 1;
        C0583c c0583c = this.mLayoutState;
        int i4 = z2 ? iMax2 : iMax;
        c0583c.f3934h = i4;
        if (!z2) {
            iMax = iMax2;
        }
        c0583c.f3935i = iMax;
        if (z2) {
            c0583c.f3934h = i4 + this.mOrientationHelper.mo4539j();
            View childClosestToEnd = getChildClosestToEnd();
            C0583c c0583c2 = this.mLayoutState;
            c0583c2.f3931e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(childClosestToEnd);
            C0583c c0583c3 = this.mLayoutState;
            c0583c2.f3930d = position + c0583c3.f3931e;
            c0583c3.f3928b = this.mOrientationHelper.mo4533d(childClosestToEnd);
            iMo4542m = this.mOrientationHelper.mo4533d(childClosestToEnd) - this.mOrientationHelper.mo4538i();
        } else {
            View childClosestToStart = getChildClosestToStart();
            this.mLayoutState.f3934h += this.mOrientationHelper.mo4542m();
            C0583c c0583c4 = this.mLayoutState;
            c0583c4.f3931e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(childClosestToStart);
            C0583c c0583c5 = this.mLayoutState;
            c0583c4.f3930d = position2 + c0583c5.f3931e;
            c0583c5.f3928b = this.mOrientationHelper.mo4536g(childClosestToStart);
            iMo4542m = (-this.mOrientationHelper.mo4536g(childClosestToStart)) + this.mOrientationHelper.mo4542m();
        }
        C0583c c0583c6 = this.mLayoutState;
        c0583c6.f3929c = i3;
        if (z) {
            c0583c6.f3929c = i3 - iMo4542m;
        }
        c0583c6.f3933g = iMo4542m;
    }

    private void updateLayoutStateToFillEnd(C0581a c0581a) {
        updateLayoutStateToFillEnd(c0581a.f3919b, c0581a.f3920c);
    }

    private void updateLayoutStateToFillStart(C0581a c0581a) {
        updateLayoutStateToFillStart(c0581a.f3919b, c0581a.f3920c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    protected void calculateExtraLayoutSpace(RecyclerView.C0613z c0613z, int[] iArr) {
        int i2;
        int extraLayoutSpace = getExtraLayoutSpace(c0613z);
        if (this.mLayoutState.f3932f == -1) {
            i2 = 0;
        } else {
            i2 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void collectAdjacentPrefetchPositions(int i2, int i3, RecyclerView.C0613z c0613z, RecyclerView.AbstractC0602o.c cVar) {
        if (this.mOrientation != 0) {
            i2 = i3;
        }
        if (getChildCount() == 0 || i2 == 0) {
            return;
        }
        ensureLayoutState();
        updateLayoutState(i2 > 0 ? 1 : -1, Math.abs(i2), true, c0613z);
        collectPrefetchPositionsForLayoutState(c0613z, this.mLayoutState, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void collectInitialPrefetchPositions(int i2, RecyclerView.AbstractC0602o.c cVar) {
        boolean z;
        int i3;
        SavedState savedState = this.mPendingSavedState;
        if (savedState == null || !savedState.m4168a()) {
            resolveShouldLayoutReverse();
            z = this.mShouldReverseLayout;
            i3 = this.mPendingScrollPosition;
            if (i3 == -1) {
                i3 = z ? i2 - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.mPendingSavedState;
            z = savedState2.f3917h;
            i3 = savedState2.f3915f;
        }
        int i4 = z ? -1 : 1;
        for (int i5 = 0; i5 < this.mInitialPrefetchItemCount && i3 >= 0 && i3 < i2; i5++) {
            cVar.mo4237a(i3, 0);
            i3 += i4;
        }
    }

    void collectPrefetchPositionsForLayoutState(RecyclerView.C0613z c0613z, C0583c c0583c, RecyclerView.AbstractC0602o.c cVar) {
        int i2 = c0583c.f3930d;
        if (i2 < 0 || i2 >= c0613z.m4306b()) {
            return;
        }
        cVar.mo4237a(i2, Math.max(0, c0583c.f3933g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public int computeHorizontalScrollExtent(RecyclerView.C0613z c0613z) {
        return computeScrollExtent(c0613z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public int computeHorizontalScrollOffset(RecyclerView.C0613z c0613z) {
        return computeScrollOffset(c0613z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public int computeHorizontalScrollRange(RecyclerView.C0613z c0613z) {
        return computeScrollRange(c0613z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0612y.b
    public PointF computeScrollVectorForPosition(int i2) {
        if (getChildCount() == 0) {
            return null;
        }
        int i3 = (i2 < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i3, 0.0f) : new PointF(0.0f, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public int computeVerticalScrollExtent(RecyclerView.C0613z c0613z) {
        return computeScrollExtent(c0613z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public int computeVerticalScrollOffset(RecyclerView.C0613z c0613z) {
        return computeScrollOffset(c0613z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public int computeVerticalScrollRange(RecyclerView.C0613z c0613z) {
        return computeScrollRange(c0613z);
    }

    int convertFocusDirectionToLayoutDirection(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 17 ? i2 != 33 ? i2 != 66 ? (i2 == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE : this.mOrientation == 0 ? 1 : Integer.MIN_VALUE : this.mOrientation == 1 ? -1 : Integer.MIN_VALUE : this.mOrientation == 0 ? -1 : Integer.MIN_VALUE : (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1 : (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
    }

    C0583c createLayoutState() {
        return new C0583c();
    }

    void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    int fill(RecyclerView.C0609v c0609v, C0583c c0583c, RecyclerView.C0613z c0613z, boolean z) {
        int i2 = c0583c.f3929c;
        int i3 = c0583c.f3933g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c0583c.f3933g = i3 + i2;
            }
            recycleByLayoutState(c0609v, c0583c);
        }
        int i4 = c0583c.f3929c + c0583c.f3934h;
        C0582b c0582b = this.mLayoutChunkResult;
        while (true) {
            if ((!c0583c.f3939m && i4 <= 0) || !c0583c.m4181c(c0613z)) {
                break;
            }
            c0582b.m4177a();
            layoutChunk(c0609v, c0613z, c0583c, c0582b);
            if (!c0582b.f3924b) {
                c0583c.f3928b += c0582b.f3923a * c0583c.f3932f;
                if (!c0582b.f3925c || c0583c.f3938l != null || !c0613z.m4309e()) {
                    int i5 = c0583c.f3929c;
                    int i6 = c0582b.f3923a;
                    c0583c.f3929c = i5 - i6;
                    i4 -= i6;
                }
                int i7 = c0583c.f3933g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + c0582b.f3923a;
                    c0583c.f3933g = i8;
                    int i9 = c0583c.f3929c;
                    if (i9 < 0) {
                        c0583c.f3933g = i8 + i9;
                    }
                    recycleByLayoutState(c0609v, c0583c);
                }
                if (z && c0582b.f3926d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c0583c.f3929c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    View findFirstVisibleChildClosestToEnd(boolean z, boolean z2) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z, z2) : findOneVisibleChild(getChildCount() - 1, -1, z, z2);
    }

    View findFirstVisibleChildClosestToStart(boolean z, boolean z2) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z, z2) : findOneVisibleChild(0, getChildCount(), z, z2);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    View findOnePartiallyOrCompletelyInvisibleChild(int i2, int i3) {
        int i4;
        int i5;
        ensureLayoutState();
        if ((i3 > i2 ? (char) 1 : i3 < i2 ? (char) 65535 : (char) 0) == 0) {
            return getChildAt(i2);
        }
        if (this.mOrientationHelper.mo4536g(getChildAt(i2)) < this.mOrientationHelper.mo4542m()) {
            i4 = 16644;
            i5 = 16388;
        } else {
            i4 = 4161;
            i5 = 4097;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.m4555a(i2, i3, i4, i5) : this.mVerticalBoundCheck.m4555a(i2, i3, i4, i5);
    }

    View findOneVisibleChild(int i2, int i3, boolean z, boolean z2) {
        ensureLayoutState();
        int i4 = z ? 24579 : 320;
        int i5 = z2 ? 320 : 0;
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.m4555a(i2, i3, i4, i5) : this.mVerticalBoundCheck.m4555a(i2, i3, i4, i5);
    }

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
            if (position >= 0 && position < i4) {
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

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public View findViewByPosition(int i2) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i2 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i2) {
                return childAt;
            }
        }
        return super.findViewByPosition(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public RecyclerView.C0603p generateDefaultLayoutParams() {
        return new RecyclerView.C0603p(-2, -2);
    }

    @Deprecated
    protected int getExtraLayoutSpace(RecyclerView.C0613z c0613z) {
        if (c0613z.m4308d()) {
            return this.mOrientationHelper.mo4543n();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    protected boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    void layoutChunk(RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z, C0583c c0583c, C0582b c0582b) {
        int i2;
        int i3;
        int i4;
        int paddingLeft;
        int iMo4535f;
        View viewM4182d = c0583c.m4182d(c0609v);
        if (viewM4182d == null) {
            c0582b.f3924b = true;
            return;
        }
        RecyclerView.C0603p c0603p = (RecyclerView.C0603p) viewM4182d.getLayoutParams();
        if (c0583c.f3938l == null) {
            if (this.mShouldReverseLayout == (c0583c.f3932f == -1)) {
                addView(viewM4182d);
            } else {
                addView(viewM4182d, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (c0583c.f3932f == -1)) {
                addDisappearingView(viewM4182d);
            } else {
                addDisappearingView(viewM4182d, 0);
            }
        }
        measureChildWithMargins(viewM4182d, 0, 0);
        c0582b.f3923a = this.mOrientationHelper.mo4534e(viewM4182d);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iMo4535f = getWidth() - getPaddingRight();
                paddingLeft = iMo4535f - this.mOrientationHelper.mo4535f(viewM4182d);
            } else {
                paddingLeft = getPaddingLeft();
                iMo4535f = this.mOrientationHelper.mo4535f(viewM4182d) + paddingLeft;
            }
            if (c0583c.f3932f == -1) {
                int i5 = c0583c.f3928b;
                i4 = i5;
                i3 = iMo4535f;
                i2 = i5 - c0582b.f3923a;
            } else {
                int i6 = c0583c.f3928b;
                i2 = i6;
                i3 = iMo4535f;
                i4 = c0582b.f3923a + i6;
            }
        } else {
            int paddingTop = getPaddingTop();
            int iMo4535f2 = this.mOrientationHelper.mo4535f(viewM4182d) + paddingTop;
            if (c0583c.f3932f == -1) {
                int i7 = c0583c.f3928b;
                i3 = i7;
                i2 = paddingTop;
                i4 = iMo4535f2;
                paddingLeft = i7 - c0582b.f3923a;
            } else {
                int i8 = c0583c.f3928b;
                i2 = paddingTop;
                i3 = c0582b.f3923a + i8;
                i4 = iMo4535f2;
                paddingLeft = i8;
            }
        }
        layoutDecoratedWithMargins(viewM4182d, paddingLeft, i2, i3, i4);
        if (c0603p.m4240c() || c0603p.m4239b()) {
            c0582b.f3925c = true;
        }
        c0582b.f3926d = viewM4182d.hasFocusable();
    }

    void onAnchorReady(RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z, C0581a c0581a, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.C0609v c0609v) {
        super.onDetachedFromWindow(recyclerView, c0609v);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(c0609v);
            c0609v.m4276c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public View onFocusSearchFailed(View view, int i2, RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z) {
        int iConvertFocusDirectionToLayoutDirection;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i2)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        updateLayoutState(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.mo4543n() * MAX_SCROLL_FACTOR), false, c0613z);
        C0583c c0583c = this.mLayoutState;
        c0583c.f3933g = Integer.MIN_VALUE;
        c0583c.f3927a = false;
        fill(c0609v, c0583c, c0613z, true);
        View viewFindPartiallyOrCompletelyInvisibleChildClosestToStart = iConvertFocusDirectionToLayoutDirection == -1 ? findPartiallyOrCompletelyInvisibleChildClosestToStart() : findPartiallyOrCompletelyInvisibleChildClosestToEnd();
        View childClosestToStart = iConvertFocusDirectionToLayoutDirection == -1 ? getChildClosestToStart() : getChildClosestToEnd();
        if (!childClosestToStart.hasFocusable()) {
            return viewFindPartiallyOrCompletelyInvisibleChildClosestToStart;
        }
        if (viewFindPartiallyOrCompletelyInvisibleChildClosestToStart == null) {
            return null;
        }
        return childClosestToStart;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void onLayoutChildren(RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int iFixLayoutEndGap;
        int i6;
        View viewFindViewByPosition;
        int iMo4536g;
        int iMo4538i;
        int i7 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && c0613z.m4306b() == 0) {
            removeAndRecycleAllViews(c0609v);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.m4168a()) {
            this.mPendingScrollPosition = this.mPendingSavedState.f3915f;
        }
        ensureLayoutState();
        this.mLayoutState.f3927a = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        C0581a c0581a = this.mAnchorInfo;
        if (!c0581a.f3922e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            c0581a.m4176e();
            C0581a c0581a2 = this.mAnchorInfo;
            c0581a2.f3921d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(c0609v, c0613z, c0581a2);
            this.mAnchorInfo.f3922e = true;
        } else if (focusedChild != null && (this.mOrientationHelper.mo4536g(focusedChild) >= this.mOrientationHelper.mo4538i() || this.mOrientationHelper.mo4533d(focusedChild) <= this.mOrientationHelper.mo4542m())) {
            this.mAnchorInfo.m4174c(focusedChild, getPosition(focusedChild));
        }
        C0583c c0583c = this.mLayoutState;
        c0583c.f3932f = c0583c.f3937k >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c0613z, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]) + this.mOrientationHelper.mo4542m();
        int iMax2 = Math.max(0, this.mReusableIntPair[1]) + this.mOrientationHelper.mo4539j();
        if (c0613z.m4309e() && (i6 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i6)) != null) {
            if (this.mShouldReverseLayout) {
                iMo4538i = this.mOrientationHelper.mo4538i() - this.mOrientationHelper.mo4533d(viewFindViewByPosition);
                iMo4536g = this.mPendingScrollPositionOffset;
            } else {
                iMo4536g = this.mOrientationHelper.mo4536g(viewFindViewByPosition) - this.mOrientationHelper.mo4542m();
                iMo4538i = this.mPendingScrollPositionOffset;
            }
            int i8 = iMo4538i - iMo4536g;
            if (i8 > 0) {
                iMax += i8;
            } else {
                iMax2 -= i8;
            }
        }
        C0581a c0581a3 = this.mAnchorInfo;
        if (!c0581a3.f3921d ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i7 = 1;
        }
        onAnchorReady(c0609v, c0613z, c0581a3, i7);
        detachAndScrapAttachedViews(c0609v);
        this.mLayoutState.f3939m = resolveIsInfinite();
        this.mLayoutState.f3936j = c0613z.m4309e();
        this.mLayoutState.f3935i = 0;
        C0581a c0581a4 = this.mAnchorInfo;
        if (c0581a4.f3921d) {
            updateLayoutStateToFillStart(c0581a4);
            C0583c c0583c2 = this.mLayoutState;
            c0583c2.f3934h = iMax;
            fill(c0609v, c0583c2, c0613z, false);
            C0583c c0583c3 = this.mLayoutState;
            i3 = c0583c3.f3928b;
            int i9 = c0583c3.f3930d;
            int i10 = c0583c3.f3929c;
            if (i10 > 0) {
                iMax2 += i10;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            C0583c c0583c4 = this.mLayoutState;
            c0583c4.f3934h = iMax2;
            c0583c4.f3930d += c0583c4.f3931e;
            fill(c0609v, c0583c4, c0613z, false);
            C0583c c0583c5 = this.mLayoutState;
            i2 = c0583c5.f3928b;
            int i11 = c0583c5.f3929c;
            if (i11 > 0) {
                updateLayoutStateToFillStart(i9, i3);
                C0583c c0583c6 = this.mLayoutState;
                c0583c6.f3934h = i11;
                fill(c0609v, c0583c6, c0613z, false);
                i3 = this.mLayoutState.f3928b;
            }
        } else {
            updateLayoutStateToFillEnd(c0581a4);
            C0583c c0583c7 = this.mLayoutState;
            c0583c7.f3934h = iMax2;
            fill(c0609v, c0583c7, c0613z, false);
            C0583c c0583c8 = this.mLayoutState;
            i2 = c0583c8.f3928b;
            int i12 = c0583c8.f3930d;
            int i13 = c0583c8.f3929c;
            if (i13 > 0) {
                iMax += i13;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            C0583c c0583c9 = this.mLayoutState;
            c0583c9.f3934h = iMax;
            c0583c9.f3930d += c0583c9.f3931e;
            fill(c0609v, c0583c9, c0613z, false);
            C0583c c0583c10 = this.mLayoutState;
            i3 = c0583c10.f3928b;
            int i14 = c0583c10.f3929c;
            if (i14 > 0) {
                updateLayoutStateToFillEnd(i12, i2);
                C0583c c0583c11 = this.mLayoutState;
                c0583c11.f3934h = i14;
                fill(c0609v, c0583c11, c0613z, false);
                i2 = this.mLayoutState.f3928b;
            }
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int iFixLayoutEndGap2 = fixLayoutEndGap(i2, c0609v, c0613z, true);
                i4 = i3 + iFixLayoutEndGap2;
                i5 = i2 + iFixLayoutEndGap2;
                iFixLayoutEndGap = fixLayoutStartGap(i4, c0609v, c0613z, false);
            } else {
                int iFixLayoutStartGap = fixLayoutStartGap(i3, c0609v, c0613z, true);
                i4 = i3 + iFixLayoutStartGap;
                i5 = i2 + iFixLayoutStartGap;
                iFixLayoutEndGap = fixLayoutEndGap(i5, c0609v, c0613z, false);
            }
            i3 = i4 + iFixLayoutEndGap;
            i2 = i5 + iFixLayoutEndGap;
        }
        layoutForPredictiveAnimations(c0609v, c0613z, i3, i2);
        if (c0613z.m4309e()) {
            this.mAnchorInfo.m4176e();
        } else {
            this.mOrientationHelper.m4548s();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void onLayoutCompleted(RecyclerView.C0613z c0613z) {
        super.onLayoutCompleted(c0613z);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.m4176e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.mPendingSavedState = (SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() > 0) {
            ensureLayoutState();
            boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            savedState.f3917h = z;
            if (z) {
                View childClosestToEnd = getChildClosestToEnd();
                savedState.f3916g = this.mOrientationHelper.mo4538i() - this.mOrientationHelper.mo4533d(childClosestToEnd);
                savedState.f3915f = getPosition(childClosestToEnd);
            } else {
                View childClosestToStart = getChildClosestToStart();
                savedState.f3915f = getPosition(childClosestToStart);
                savedState.f3916g = this.mOrientationHelper.mo4536g(childClosestToStart) - this.mOrientationHelper.mo4542m();
            }
        } else {
            savedState.m4169b();
        }
        return savedState;
    }

    public void prepareForDrop(View view, View view2, int i2, int i3) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        char c2 = position < position2 ? (char) 1 : (char) 65535;
        if (this.mShouldReverseLayout) {
            if (c2 == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo4538i() - (this.mOrientationHelper.mo4536g(view2) + this.mOrientationHelper.mo4534e(view)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo4538i() - this.mOrientationHelper.mo4533d(view2));
                return;
            }
        }
        if (c2 == 65535) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo4536g(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo4533d(view2) - this.mOrientationHelper.mo4534e(view));
        }
    }

    boolean resolveIsInfinite() {
        return this.mOrientationHelper.mo4540k() == 0 && this.mOrientationHelper.mo4537h() == 0;
    }

    int scrollBy(int i2, RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z) {
        if (getChildCount() == 0 || i2 == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f3927a = true;
        int i3 = i2 > 0 ? 1 : -1;
        int iAbs = Math.abs(i2);
        updateLayoutState(i3, iAbs, true, c0613z);
        C0583c c0583c = this.mLayoutState;
        int iFill = c0583c.f3933g + fill(c0609v, c0583c, c0613z, false);
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i2 = i3 * iFill;
        }
        this.mOrientationHelper.mo4547r(-i2);
        this.mLayoutState.f3937k = i2;
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public int scrollHorizontallyBy(int i2, RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i2, c0609v, c0613z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void scrollToPosition(int i2) {
        this.mPendingScrollPosition = i2;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.m4169b();
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i2, int i3) {
        this.mPendingScrollPosition = i2;
        this.mPendingScrollPositionOffset = i3;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.m4169b();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public int scrollVerticallyBy(int i2, RecyclerView.C0609v c0609v, RecyclerView.C0613z c0613z) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i2, c0609v, c0613z);
    }

    public void setInitialPrefetchItemCount(int i2) {
        this.mInitialPrefetchItemCount = i2;
    }

    public void setOrientation(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i2);
        }
        assertNotInLayoutOrScroll(null);
        if (i2 != this.mOrientation || this.mOrientationHelper == null) {
            AbstractC0633n abstractC0633nM4531b = AbstractC0633n.m4531b(this, i2);
            this.mOrientationHelper = abstractC0633nM4531b;
            this.mAnchorInfo.f3918a = abstractC0633nM4531b;
            this.mOrientation = i2;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (z == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.mSmoothScrollbarEnabled = z;
    }

    public void setStackFromEnd(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z) {
            return;
        }
        this.mStackFromEnd = z;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C0613z c0613z, int i2) {
        C0629j c0629j = new C0629j(recyclerView.getContext());
        c0629j.setTargetPosition(i2);
        startSmoothScroll(c0629j);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0602o
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int iMo4536g = this.mOrientationHelper.mo4536g(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i2 = 1; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                int position2 = getPosition(childAt);
                int iMo4536g2 = this.mOrientationHelper.mo4536g(childAt);
                if (position2 < position) {
                    logChildren();
                    StringBuilder sb = new StringBuilder();
                    sb.append("detected invalid position. loc invalid? ");
                    sb.append(iMo4536g2 < iMo4536g);
                    throw new RuntimeException(sb.toString());
                }
                if (iMo4536g2 > iMo4536g) {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i3 = 1; i3 < getChildCount(); i3++) {
            View childAt2 = getChildAt(i3);
            int position3 = getPosition(childAt2);
            int iMo4536g3 = this.mOrientationHelper.mo4536g(childAt2);
            if (position3 < position) {
                logChildren();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("detected invalid position. loc invalid? ");
                sb2.append(iMo4536g3 < iMo4536g);
                throw new RuntimeException(sb2.toString());
            }
            if (iMo4536g3 < iMo4536g) {
                logChildren();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    public LinearLayoutManager(Context context, int i2, boolean z) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C0581a();
        this.mLayoutChunkResult = new C0582b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i2);
        setReverseLayout(z);
    }

    private void updateLayoutStateToFillEnd(int i2, int i3) {
        this.mLayoutState.f3929c = this.mOrientationHelper.mo4538i() - i3;
        C0583c c0583c = this.mLayoutState;
        c0583c.f3931e = this.mShouldReverseLayout ? -1 : 1;
        c0583c.f3930d = i2;
        c0583c.f3932f = 1;
        c0583c.f3928b = i3;
        c0583c.f3933g = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(int i2, int i3) {
        this.mLayoutState.f3929c = i3 - this.mOrientationHelper.mo4542m();
        C0583c c0583c = this.mLayoutState;
        c0583c.f3930d = i2;
        c0583c.f3931e = this.mShouldReverseLayout ? 1 : -1;
        c0583c.f3932f = -1;
        c0583c.f3928b = i3;
        c0583c.f3933g = Integer.MIN_VALUE;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C0581a();
        this.mLayoutChunkResult = new C0582b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.AbstractC0602o.d properties = RecyclerView.AbstractC0602o.getProperties(context, attributeSet, i2, i3);
        setOrientation(properties.f3960a);
        setReverseLayout(properties.f3962c);
        setStackFromEnd(properties.f3963d);
    }
}
