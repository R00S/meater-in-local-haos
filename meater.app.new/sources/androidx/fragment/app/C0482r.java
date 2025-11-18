package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.C0311u;
import androidx.fragment.app.AbstractC0463a0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC0511g;
import androidx.lifecycle.InterfaceC0501a0;
import p024c.p067m.C0985b;

/* compiled from: FragmentStateManager.java */
/* renamed from: androidx.fragment.app.r */
/* loaded from: classes.dex */
class C0482r {

    /* renamed from: a */
    private final C0476l f3305a;

    /* renamed from: b */
    private final C0484t f3306b;

    /* renamed from: c */
    private final Fragment f3307c;

    /* renamed from: d */
    private boolean f3308d = false;

    /* renamed from: e */
    private int f3309e = -1;

    /* compiled from: FragmentStateManager.java */
    /* renamed from: androidx.fragment.app.r$a */
    class a implements View.OnAttachStateChangeListener {

        /* renamed from: f */
        final /* synthetic */ View f3310f;

        a(View view) {
            this.f3310f = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f3310f.removeOnAttachStateChangeListener(this);
            C0311u.m2125f0(this.f3310f);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: FragmentStateManager.java */
    /* renamed from: androidx.fragment.app.r$b */
    static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f3312a;

        static {
            int[] iArr = new int[AbstractC0511g.c.values().length];
            f3312a = iArr;
            try {
                iArr[AbstractC0511g.c.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3312a[AbstractC0511g.c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3312a[AbstractC0511g.c.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3312a[AbstractC0511g.c.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    C0482r(C0476l c0476l, C0484t c0484t, Fragment fragment) {
        this.f3305a = c0476l;
        this.f3306b = c0484t;
        this.f3307c = fragment;
    }

    /* renamed from: l */
    private boolean m3687l(View view) {
        if (view == this.f3307c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f3307c.mView) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    private Bundle m3688q() {
        Bundle bundle = new Bundle();
        this.f3307c.performSaveInstanceState(bundle);
        this.f3305a.m3668j(this.f3307c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f3307c.mView != null) {
            m3706t();
        }
        if (this.f3307c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f3307c.mSavedViewState);
        }
        if (this.f3307c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f3307c.mSavedViewRegistryState);
        }
        if (!this.f3307c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f3307c.mUserVisibleHint);
        }
        return bundle;
    }

    /* renamed from: a */
    void m3689a() {
        if (FragmentManager.m3392H0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f3307c);
        }
        Fragment fragment = this.f3307c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        C0476l c0476l = this.f3305a;
        Fragment fragment2 = this.f3307c;
        c0476l.m3659a(fragment2, fragment2.mSavedFragmentState, false);
    }

    /* renamed from: b */
    void m3690b() {
        int iM3719j = this.f3306b.m3719j(this.f3307c);
        Fragment fragment = this.f3307c;
        fragment.mContainer.addView(fragment.mView, iM3719j);
    }

    /* renamed from: c */
    void m3691c() {
        if (FragmentManager.m3392H0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f3307c);
        }
        Fragment fragment = this.f3307c;
        Fragment fragment2 = fragment.mTarget;
        C0482r c0482rM3722m = null;
        if (fragment2 != null) {
            C0482r c0482rM3722m2 = this.f3306b.m3722m(fragment2.mWho);
            if (c0482rM3722m2 == null) {
                throw new IllegalStateException("Fragment " + this.f3307c + " declared target fragment " + this.f3307c.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f3307c;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            c0482rM3722m = c0482rM3722m2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (c0482rM3722m = this.f3306b.m3722m(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f3307c + " declared target fragment " + this.f3307c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (c0482rM3722m != null && (FragmentManager.f3093b || c0482rM3722m.m3699k().mState < 1)) {
            c0482rM3722m.m3700m();
        }
        Fragment fragment4 = this.f3307c;
        fragment4.mHost = fragment4.mFragmentManager.m3512w0();
        Fragment fragment5 = this.f3307c;
        fragment5.mParentFragment = fragment5.mFragmentManager.m3517z0();
        this.f3305a.m3665g(this.f3307c, false);
        this.f3307c.performAttach();
        this.f3305a.m3660b(this.f3307c, false);
    }

    /* renamed from: d */
    int m3692d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f3307c;
        if (fragment2.mFragmentManager == null) {
            return fragment2.mState;
        }
        int iMin = this.f3309e;
        int i2 = b.f3312a[fragment2.mMaxState.ordinal()];
        if (i2 != 1) {
            iMin = i2 != 2 ? i2 != 3 ? i2 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        Fragment fragment3 = this.f3307c;
        if (fragment3.mFromLayout) {
            if (fragment3.mInLayout) {
                iMin = Math.max(this.f3309e, 2);
                View view = this.f3307c.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f3309e < 4 ? Math.min(iMin, fragment3.mState) : Math.min(iMin, 1);
            }
        }
        if (!this.f3307c.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        AbstractC0463a0.e.b bVarM3575l = null;
        if (FragmentManager.f3093b && (viewGroup = (fragment = this.f3307c).mContainer) != null) {
            bVarM3575l = AbstractC0463a0.m3564n(viewGroup, fragment.getParentFragmentManager()).m3575l(this);
        }
        if (bVarM3575l == AbstractC0463a0.e.b.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (bVarM3575l == AbstractC0463a0.e.b.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment4 = this.f3307c;
            if (fragment4.mRemoving) {
                iMin = fragment4.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment5 = this.f3307c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (FragmentManager.m3392H0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f3307c);
        }
        return iMin;
    }

    /* renamed from: e */
    void m3693e() {
        if (FragmentManager.m3392H0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f3307c);
        }
        Fragment fragment = this.f3307c;
        if (fragment.mIsCreated) {
            fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
            this.f3307c.mState = 1;
            return;
        }
        this.f3305a.m3666h(fragment, fragment.mSavedFragmentState, false);
        Fragment fragment2 = this.f3307c;
        fragment2.performCreate(fragment2.mSavedFragmentState);
        C0476l c0476l = this.f3305a;
        Fragment fragment3 = this.f3307c;
        c0476l.m3661c(fragment3, fragment3.mSavedFragmentState, false);
    }

    /* renamed from: f */
    void m3694f() {
        String resourceName;
        if (this.f3307c.mFromLayout) {
            return;
        }
        if (FragmentManager.m3392H0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3307c);
        }
        Fragment fragment = this.f3307c;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        ViewGroup viewGroup = null;
        Fragment fragment2 = this.f3307c;
        ViewGroup viewGroup2 = fragment2.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i2 = fragment2.mContainerId;
            if (i2 != 0) {
                if (i2 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f3307c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.mFragmentManager.m3501q0().mo3383c(this.f3307c.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f3307c;
                    if (!fragment3.mRestored) {
                        try {
                            resourceName = fragment3.getResources().getResourceName(this.f3307c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f3307c.mContainerId) + " (" + resourceName + ") for fragment " + this.f3307c);
                    }
                }
            }
        }
        Fragment fragment4 = this.f3307c;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
        View view = this.f3307c.mView;
        if (view != null) {
            boolean z = false;
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f3307c;
            fragment5.mView.setTag(C0985b.f6506a, fragment5);
            if (viewGroup != null) {
                m3690b();
            }
            Fragment fragment6 = this.f3307c;
            if (fragment6.mHidden) {
                fragment6.mView.setVisibility(8);
            }
            if (C0311u.m2101N(this.f3307c.mView)) {
                C0311u.m2125f0(this.f3307c.mView);
            } else {
                View view2 = this.f3307c.mView;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f3307c.performViewCreated();
            C0476l c0476l = this.f3305a;
            Fragment fragment7 = this.f3307c;
            c0476l.m3671m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
            int visibility = this.f3307c.mView.getVisibility();
            float alpha = this.f3307c.mView.getAlpha();
            if (FragmentManager.f3093b) {
                this.f3307c.setPostOnViewCreatedAlpha(alpha);
                Fragment fragment8 = this.f3307c;
                if (fragment8.mContainer != null && visibility == 0) {
                    View viewFindFocus = fragment8.mView.findFocus();
                    if (viewFindFocus != null) {
                        this.f3307c.setFocusedView(viewFindFocus);
                        if (FragmentManager.m3392H0(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f3307c);
                        }
                    }
                    this.f3307c.mView.setAlpha(0.0f);
                }
            } else {
                Fragment fragment9 = this.f3307c;
                if (visibility == 0 && fragment9.mContainer != null) {
                    z = true;
                }
                fragment9.mIsNewlyAdded = z;
            }
        }
        this.f3307c.mState = 2;
    }

    /* renamed from: g */
    void m3695g() {
        Fragment fragmentM3715f;
        if (FragmentManager.m3392H0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f3307c);
        }
        Fragment fragment = this.f3307c;
        boolean zIsChangingConfigurations = true;
        boolean z = fragment.mRemoving && !fragment.isInBackStack();
        if (!(z || this.f3306b.m3724o().m3684p(this.f3307c))) {
            String str = this.f3307c.mTargetWho;
            if (str != null && (fragmentM3715f = this.f3306b.m3715f(str)) != null && fragmentM3715f.mRetainInstance) {
                this.f3307c.mTarget = fragmentM3715f;
            }
            this.f3307c.mState = 0;
            return;
        }
        AbstractC0474j<?> abstractC0474j = this.f3307c.mHost;
        if (abstractC0474j instanceof InterfaceC0501a0) {
            zIsChangingConfigurations = this.f3306b.m3724o().m3681m();
        } else if (abstractC0474j.m3654f() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) abstractC0474j.m3654f()).isChangingConfigurations();
        }
        if (z || zIsChangingConfigurations) {
            this.f3306b.m3724o().m3676g(this.f3307c);
        }
        this.f3307c.performDestroy();
        this.f3305a.m3662d(this.f3307c, false);
        for (C0482r c0482r : this.f3306b.m3720k()) {
            if (c0482r != null) {
                Fragment fragmentM3699k = c0482r.m3699k();
                if (this.f3307c.mWho.equals(fragmentM3699k.mTargetWho)) {
                    fragmentM3699k.mTarget = this.f3307c;
                    fragmentM3699k.mTargetWho = null;
                }
            }
        }
        Fragment fragment2 = this.f3307c;
        String str2 = fragment2.mTargetWho;
        if (str2 != null) {
            fragment2.mTarget = this.f3306b.m3715f(str2);
        }
        this.f3306b.m3726q(this);
    }

    /* renamed from: h */
    void m3696h() {
        View view;
        if (FragmentManager.m3392H0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f3307c);
        }
        Fragment fragment = this.f3307c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f3307c.performDestroyView();
        this.f3305a.m3672n(this.f3307c, false);
        Fragment fragment2 = this.f3307c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.mo3822n(null);
        this.f3307c.mInLayout = false;
    }

    /* renamed from: i */
    void m3697i() {
        if (FragmentManager.m3392H0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f3307c);
        }
        this.f3307c.performDetach();
        boolean z = false;
        this.f3305a.m3663e(this.f3307c, false);
        Fragment fragment = this.f3307c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        }
        if (z || this.f3306b.m3724o().m3684p(this.f3307c)) {
            if (FragmentManager.m3392H0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f3307c);
            }
            this.f3307c.initState();
        }
    }

    /* renamed from: j */
    void m3698j() {
        Fragment fragment = this.f3307c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.m3392H0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3307c);
            }
            Fragment fragment2 = this.f3307c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.f3307c.mSavedFragmentState);
            View view = this.f3307c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f3307c;
                fragment3.mView.setTag(C0985b.f6506a, fragment3);
                Fragment fragment4 = this.f3307c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f3307c.performViewCreated();
                C0476l c0476l = this.f3305a;
                Fragment fragment5 = this.f3307c;
                c0476l.m3671m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f3307c.mState = 2;
            }
        }
    }

    /* renamed from: k */
    Fragment m3699k() {
        return this.f3307c;
    }

    /* renamed from: m */
    void m3700m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f3308d) {
            if (FragmentManager.m3392H0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + m3699k());
                return;
            }
            return;
        }
        try {
            this.f3308d = true;
            while (true) {
                int iM3692d = m3692d();
                Fragment fragment = this.f3307c;
                int i2 = fragment.mState;
                if (iM3692d == i2) {
                    if (FragmentManager.f3093b && fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            AbstractC0463a0 abstractC0463a0M3564n = AbstractC0463a0.m3564n(viewGroup, fragment.getParentFragmentManager());
                            if (this.f3307c.mHidden) {
                                abstractC0463a0M3564n.m3568c(this);
                            } else {
                                abstractC0463a0M3564n.m3570e(this);
                            }
                        }
                        Fragment fragment2 = this.f3307c;
                        fragment2.mHiddenChanged = false;
                        fragment2.onHiddenChanged(fragment2.mHidden);
                    }
                    return;
                }
                if (iM3692d <= i2) {
                    switch (i2 - 1) {
                        case -1:
                            m3697i();
                            break;
                        case 0:
                            m3695g();
                            break;
                        case 1:
                            m3696h();
                            this.f3307c.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.m3392H0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f3307c);
                            }
                            Fragment fragment3 = this.f3307c;
                            if (fragment3.mView != null && fragment3.mSavedViewState == null) {
                                m3706t();
                            }
                            Fragment fragment4 = this.f3307c;
                            if (fragment4.mView != null && (viewGroup3 = fragment4.mContainer) != null) {
                                AbstractC0463a0.m3564n(viewGroup3, fragment4.getParentFragmentManager()).m3569d(this);
                            }
                            this.f3307c.mState = 3;
                            break;
                        case 4:
                            m3709w();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            m3701n();
                            break;
                    }
                } else {
                    switch (i2 + 1) {
                        case 0:
                            m3691c();
                            break;
                        case 1:
                            m3693e();
                            break;
                        case 2:
                            m3698j();
                            m3694f();
                            break;
                        case 3:
                            m3689a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                AbstractC0463a0.m3564n(viewGroup2, fragment.getParentFragmentManager()).m3567b(AbstractC0463a0.e.c.m3591k(this.f3307c.mView.getVisibility()), this);
                            }
                            this.f3307c.mState = 4;
                            break;
                        case 5:
                            m3708v();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            m3703p();
                            break;
                    }
                }
            }
        } finally {
            this.f3308d = false;
        }
    }

    /* renamed from: n */
    void m3701n() {
        if (FragmentManager.m3392H0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f3307c);
        }
        this.f3307c.performPause();
        this.f3305a.m3664f(this.f3307c, false);
    }

    /* renamed from: o */
    void m3702o(ClassLoader classLoader) {
        Bundle bundle = this.f3307c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f3307c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f3307c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f3307c;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
        Fragment fragment4 = this.f3307c;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f3307c;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.f3307c.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f3307c;
        if (fragment6.mUserVisibleHint) {
            return;
        }
        fragment6.mDeferStart = true;
    }

    /* renamed from: p */
    void m3703p() {
        if (FragmentManager.m3392H0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f3307c);
        }
        View focusedView = this.f3307c.getFocusedView();
        if (focusedView != null && m3687l(focusedView)) {
            boolean zRequestFocus = focusedView.requestFocus();
            if (FragmentManager.m3392H0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                sb.append(zRequestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f3307c);
                sb.append(" resulting in focused view ");
                sb.append(this.f3307c.mView.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f3307c.setFocusedView(null);
        this.f3307c.performResume();
        this.f3305a.m3667i(this.f3307c, false);
        Fragment fragment = this.f3307c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    /* renamed from: r */
    Fragment.SavedState m3704r() {
        Bundle bundleM3688q;
        if (this.f3307c.mState <= -1 || (bundleM3688q = m3688q()) == null) {
            return null;
        }
        return new Fragment.SavedState(bundleM3688q);
    }

    /* renamed from: s */
    FragmentState m3705s() {
        FragmentState fragmentState = new FragmentState(this.f3307c);
        Fragment fragment = this.f3307c;
        if (fragment.mState <= -1 || fragmentState.f3181r != null) {
            fragmentState.f3181r = fragment.mSavedFragmentState;
        } else {
            Bundle bundleM3688q = m3688q();
            fragmentState.f3181r = bundleM3688q;
            if (this.f3307c.mTargetWho != null) {
                if (bundleM3688q == null) {
                    fragmentState.f3181r = new Bundle();
                }
                fragmentState.f3181r.putString("android:target_state", this.f3307c.mTargetWho);
                int i2 = this.f3307c.mTargetRequestCode;
                if (i2 != 0) {
                    fragmentState.f3181r.putInt("android:target_req_state", i2);
                }
            }
        }
        return fragmentState;
    }

    /* renamed from: t */
    void m3706t() {
        if (this.f3307c.mView == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f3307c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f3307c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f3307c.mViewLifecycleOwner.m3807e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f3307c.mSavedViewRegistryState = bundle;
    }

    /* renamed from: u */
    void m3707u(int i2) {
        this.f3309e = i2;
    }

    /* renamed from: v */
    void m3708v() {
        if (FragmentManager.m3392H0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f3307c);
        }
        this.f3307c.performStart();
        this.f3305a.m3669k(this.f3307c, false);
    }

    /* renamed from: w */
    void m3709w() {
        if (FragmentManager.m3392H0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f3307c);
        }
        this.f3307c.performStop();
        this.f3305a.m3670l(this.f3307c, false);
    }

    C0482r(C0476l c0476l, C0484t c0484t, ClassLoader classLoader, C0473i c0473i, FragmentState fragmentState) {
        this.f3305a = c0476l;
        this.f3306b = c0484t;
        Fragment fragmentMo3524a = c0473i.mo3524a(classLoader, fragmentState.f3169f);
        this.f3307c = fragmentMo3524a;
        Bundle bundle = fragmentState.f3178o;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        fragmentMo3524a.setArguments(fragmentState.f3178o);
        fragmentMo3524a.mWho = fragmentState.f3170g;
        fragmentMo3524a.mFromLayout = fragmentState.f3171h;
        fragmentMo3524a.mRestored = true;
        fragmentMo3524a.mFragmentId = fragmentState.f3172i;
        fragmentMo3524a.mContainerId = fragmentState.f3173j;
        fragmentMo3524a.mTag = fragmentState.f3174k;
        fragmentMo3524a.mRetainInstance = fragmentState.f3175l;
        fragmentMo3524a.mRemoving = fragmentState.f3176m;
        fragmentMo3524a.mDetached = fragmentState.f3177n;
        fragmentMo3524a.mHidden = fragmentState.f3179p;
        fragmentMo3524a.mMaxState = AbstractC0511g.c.values()[fragmentState.f3180q];
        Bundle bundle2 = fragmentState.f3181r;
        if (bundle2 != null) {
            fragmentMo3524a.mSavedFragmentState = bundle2;
        } else {
            fragmentMo3524a.mSavedFragmentState = new Bundle();
        }
        if (FragmentManager.m3392H0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentMo3524a);
        }
    }

    C0482r(C0476l c0476l, C0484t c0484t, Fragment fragment, FragmentState fragmentState) {
        this.f3305a = c0476l;
        this.f3306b = c0484t;
        this.f3307c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.f3181r;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}
