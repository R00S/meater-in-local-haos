package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.AbstractC0051b;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.InterfaceC0050a;
import androidx.activity.result.InterfaceC0052c;
import androidx.activity.result.p002d.AbstractC0053a;
import androidx.core.app.AbstractC0251o;
import androidx.core.app.C0238b;
import androidx.core.view.C0296f;
import androidx.lifecycle.AbstractC0511g;
import androidx.lifecycle.C0503b0;
import androidx.lifecycle.C0505c0;
import androidx.lifecycle.C0516l;
import androidx.lifecycle.C0521q;
import androidx.lifecycle.C0526v;
import androidx.lifecycle.C0529y;
import androidx.lifecycle.C0530z;
import androidx.lifecycle.InterfaceC0501a0;
import androidx.lifecycle.InterfaceC0513i;
import androidx.lifecycle.InterfaceC0515k;
import androidx.lifecycle.LiveData;
import androidx.savedstate.C0673b;
import androidx.savedstate.C0675d;
import androidx.savedstate.InterfaceC0674c;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p024c.p033b.p034a.p037c.InterfaceC0855a;
import p024c.p073p.p074a.AbstractC0992a;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0515k, InterfaceC0501a0, InterfaceC0674c {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    C0438i mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    private boolean mCalled;
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    private C0529y.b mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    AbstractC0474j<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    boolean mIsNewlyAdded;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    C0516l mLifecycleRegistry;
    AbstractC0511g.c mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<AbstractC0439j> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    float mPostponedAlpha;
    Runnable mPostponedDurationRunnable;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    C0673b mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    C0489y mViewLifecycleOwner;
    C0521q<InterfaceC0515k> mViewLifecycleOwnerLiveData;
    String mWho;

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$a */
    class RunnableC0430a implements Runnable {
        RunnableC0430a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    class RunnableC0431b implements Runnable {
        RunnableC0431b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    class RunnableC0432c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ AbstractC0463a0 f3057f;

        RunnableC0432c(AbstractC0463a0 abstractC0463a0) {
            this.f3057f = abstractC0463a0;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3057f.m3572g();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    class C0433d extends AbstractC0470f {
        C0433d() {
        }

        @Override // androidx.fragment.app.AbstractC0470f
        /* renamed from: c */
        public View mo3383c(int i2) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i2);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.AbstractC0470f
        /* renamed from: d */
        public boolean mo3384d() {
            return Fragment.this.mView != null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    class C0434e implements InterfaceC0855a<Void, ActivityResultRegistry> {
        C0434e() {
        }

        @Override // p024c.p033b.p034a.p037c.InterfaceC0855a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ActivityResultRegistry mo3385a(Void r3) {
            Fragment fragment = Fragment.this;
            Object obj = fragment.mHost;
            return obj instanceof InterfaceC0052c ? ((InterfaceC0052c) obj).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$f */
    class C0435f implements InterfaceC0855a<Void, ActivityResultRegistry> {

        /* renamed from: a */
        final /* synthetic */ ActivityResultRegistry f3061a;

        C0435f(ActivityResultRegistry activityResultRegistry) {
            this.f3061a = activityResultRegistry;
        }

        @Override // p024c.p033b.p034a.p037c.InterfaceC0855a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ActivityResultRegistry mo3385a(Void r1) {
            return this.f3061a;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$g */
    class C0436g extends AbstractC0439j {

        /* renamed from: a */
        final /* synthetic */ InterfaceC0855a f3063a;

        /* renamed from: b */
        final /* synthetic */ AtomicReference f3064b;

        /* renamed from: c */
        final /* synthetic */ AbstractC0053a f3065c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC0050a f3066d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0436g(InterfaceC0855a interfaceC0855a, AtomicReference atomicReference, AbstractC0053a abstractC0053a, InterfaceC0050a interfaceC0050a) {
            super(null);
            this.f3063a = interfaceC0855a;
            this.f3064b = atomicReference;
            this.f3065c = abstractC0053a;
            this.f3066d = interfaceC0050a;
        }

        @Override // androidx.fragment.app.Fragment.AbstractC0439j
        /* renamed from: a */
        void mo3388a() {
            String strGenerateActivityResultKey = Fragment.this.generateActivityResultKey();
            this.f3064b.set(((ActivityResultRegistry) this.f3063a.mo3385a(null)).m156j(strGenerateActivityResultKey, Fragment.this, this.f3065c, this.f3066d));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* renamed from: androidx.fragment.app.Fragment$h */
    class C0437h<I> extends AbstractC0051b<I> {

        /* renamed from: a */
        final /* synthetic */ AtomicReference f3068a;

        /* renamed from: b */
        final /* synthetic */ AbstractC0053a f3069b;

        C0437h(AtomicReference atomicReference, AbstractC0053a abstractC0053a) {
            this.f3068a = atomicReference;
            this.f3069b = abstractC0053a;
        }

        @Override // androidx.activity.result.AbstractC0051b
        /* renamed from: b */
        public void mo158b(I i2, C0238b c0238b) {
            AbstractC0051b abstractC0051b = (AbstractC0051b) this.f3068a.get();
            if (abstractC0051b == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            abstractC0051b.mo158b(i2, c0238b);
        }

        @Override // androidx.activity.result.AbstractC0051b
        /* renamed from: c */
        public void mo159c() {
            AbstractC0051b abstractC0051b = (AbstractC0051b) this.f3068a.getAndSet(null);
            if (abstractC0051b != null) {
                abstractC0051b.mo159c();
            }
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$i */
    static class C0438i {

        /* renamed from: a */
        View f3071a;

        /* renamed from: b */
        Animator f3072b;

        /* renamed from: c */
        int f3073c;

        /* renamed from: d */
        int f3074d;

        /* renamed from: e */
        ArrayList<String> f3075e;

        /* renamed from: f */
        ArrayList<String> f3076f;

        /* renamed from: g */
        Object f3077g = null;

        /* renamed from: h */
        Object f3078h;

        /* renamed from: i */
        Object f3079i;

        /* renamed from: j */
        Object f3080j;

        /* renamed from: k */
        Object f3081k;

        /* renamed from: l */
        Object f3082l;

        /* renamed from: m */
        Boolean f3083m;

        /* renamed from: n */
        Boolean f3084n;

        /* renamed from: o */
        AbstractC0251o f3085o;

        /* renamed from: p */
        AbstractC0251o f3086p;

        /* renamed from: q */
        float f3087q;

        /* renamed from: r */
        View f3088r;

        /* renamed from: s */
        boolean f3089s;

        /* renamed from: t */
        InterfaceC0440k f3090t;

        /* renamed from: u */
        boolean f3091u;

        C0438i() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f3078h = obj;
            this.f3079i = null;
            this.f3080j = obj;
            this.f3081k = null;
            this.f3082l = obj;
            this.f3087q = 1.0f;
            this.f3088r = null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$j */
    private static abstract class AbstractC0439j {
        private AbstractC0439j() {
        }

        /* renamed from: a */
        abstract void mo3388a();

        /* synthetic */ AbstractC0439j(RunnableC0430a runnableC0430a) {
            this();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$k */
    interface InterfaceC0440k {
        /* renamed from: a */
        void mo3389a();

        /* renamed from: b */
        void mo3390b();
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new C0477m();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new RunnableC0430a();
        this.mMaxState = AbstractC0511g.c.RESUMED;
        this.mViewLifecycleOwnerLiveData = new C0521q<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        initLifecycle();
    }

    private C0438i ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C0438i();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        AbstractC0511g.c cVar = this.mMaxState;
        return (cVar == AbstractC0511g.c.INITIALIZED || this.mParentFragment == null) ? cVar.ordinal() : Math.min(cVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new C0516l(this);
        this.mSavedStateRegistryController = C0673b.m4698a(this);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    private <I, O> AbstractC0051b<I> prepareCallInternal(AbstractC0053a<I, O> abstractC0053a, InterfaceC0855a<Void, ActivityResultRegistry> interfaceC0855a, InterfaceC0050a<O> interfaceC0050a) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new C0436g(interfaceC0855a, atomicReference, abstractC0053a, interfaceC0050a));
            return new C0437h(atomicReference, abstractC0053a);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void registerOnPreAttachListener(AbstractC0439j abstractC0439j) {
        if (this.mState >= 0) {
            abstractC0439j.mo3388a();
        } else {
            this.mOnPreAttachedListeners.add(abstractC0439j);
        }
    }

    void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        C0438i c0438i = this.mAnimationInfo;
        InterfaceC0440k interfaceC0440k = null;
        if (c0438i != null) {
            c0438i.f3089s = false;
            InterfaceC0440k interfaceC0440k2 = c0438i.f3090t;
            c0438i.f3090t = null;
            interfaceC0440k = interfaceC0440k2;
        }
        if (interfaceC0440k != null) {
            interfaceC0440k.mo3390b();
            return;
        }
        if (!FragmentManager.f3093b || this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
            return;
        }
        AbstractC0463a0 abstractC0463a0M3564n = AbstractC0463a0.m3564n(viewGroup, fragmentManager);
        abstractC0463a0M3564n.m3577p();
        if (z) {
            this.mHost.m3655g().post(new RunnableC0432c(abstractC0463a0M3564n));
        } else {
            abstractC0463a0M3564n.m3572g();
        }
    }

    AbstractC0470f createFragmentContainer() {
        return new C0433d();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        if (getNextAnim() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(getNextAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            AbstractC0992a.m6272b(this).mo6273a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.m3466X(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    Fragment findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.m3490k0(str);
    }

    String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final ActivityC0468d getActivity() {
        AbstractC0474j<?> abstractC0474j = this.mHost;
        if (abstractC0474j == null) {
            return null;
        }
        return (ActivityC0468d) abstractC0474j.m3653e();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C0438i c0438i = this.mAnimationInfo;
        if (c0438i == null || (bool = c0438i.f3084n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C0438i c0438i = this.mAnimationInfo;
        if (c0438i == null || (bool = c0438i.f3083m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    View getAnimatingAway() {
        C0438i c0438i = this.mAnimationInfo;
        if (c0438i == null) {
            return null;
        }
        return c0438i.f3071a;
    }

    Animator getAnimator() {
        C0438i c0438i = this.mAnimationInfo;
        if (c0438i == null) {
            return null;
        }
        return c0438i.f3072b;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context getContext() {
        AbstractC0474j<?> abstractC0474j = this.mHost;
        if (abstractC0474j == null) {
            return null;
        }
        return abstractC0474j.m3654f();
    }

    public C0529y.b getDefaultViewModelProviderFactory() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Application application = null;
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && FragmentManager.m3392H0(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new C0526v(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public Object getEnterTransition() {
        C0438i c0438i = this.mAnimationInfo;
        if (c0438i == null) {
            return null;
        }
        return c0438i.f3077g;
    }

    AbstractC0251o getEnterTransitionCallback() {
        C0438i c0438i = this.mAnimationInfo;
        if (c0438i == null) {
            return null;
        }
        return c0438i.f3085o;
    }

    public Object getExitTransition() {
        C0438i c0438i = this.mAnimationInfo;
        if (c0438i == null) {
            return null;
        }
        return c0438i.f3079i;
    }

    AbstractC0251o getExitTransitionCallback() {
        C0438i c0438i = this.mAnimationInfo;
        if (c0438i == null) {
            return null;
        }
        return c0438i.f3086p;
    }

    View getFocusedView() {
        C0438i c0438i = this.mAnimationInfo;
        if (c0438i == null) {
            return null;
        }
        return c0438i.f3088r;
    }

    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        AbstractC0474j<?> abstractC0474j = this.mHost;
        if (abstractC0474j == null) {
            return null;
        }
        return abstractC0474j.mo3615i();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.InterfaceC0515k
    public AbstractC0511g getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public AbstractC0992a getLoaderManager() {
        return AbstractC0992a.m6272b(this);
    }

    int getNextAnim() {
        C0438i c0438i = this.mAnimationInfo;
        if (c0438i == null) {
            return 0;
        }
        return c0438i.f3073c;
    }

    int getNextTransition() {
        C0438i c0438i = this.mAnimationInfo;
        if (c0438i == null) {
            return 0;
        }
        return c0438i.f3074d;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    float getPostOnViewCreatedAlpha() {
        C0438i c0438i = this.mAnimationInfo;
        if (c0438i == null) {
            return 1.0f;
        }
        return c0438i.f3087q;
    }

    public Object getReenterTransition() {
        C0438i c0438i = this.mAnimationInfo;
        if (c0438i == null) {
            return null;
        }
        Object obj = c0438i.f3080j;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        C0438i c0438i = this.mAnimationInfo;
        if (c0438i == null) {
            return null;
        }
        Object obj = c0438i.f3078h;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // androidx.savedstate.InterfaceC0674c
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.m4699b();
    }

    public Object getSharedElementEnterTransition() {
        C0438i c0438i = this.mAnimationInfo;
        if (c0438i == null) {
            return null;
        }
        return c0438i.f3081k;
    }

    public Object getSharedElementReturnTransition() {
        C0438i c0438i = this.mAnimationInfo;
        if (c0438i == null) {
            return null;
        }
        Object obj = c0438i.f3082l;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        C0438i c0438i = this.mAnimationInfo;
        return (c0438i == null || (arrayList = c0438i.f3075e) == null) ? new ArrayList<>() : arrayList;
    }

    ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        C0438i c0438i = this.mAnimationInfo;
        return (c0438i == null || (arrayList = c0438i.f3076f) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i2) {
        return getResources().getString(i2);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        String str;
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.m3483h0(str);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i2) {
        return getResources().getText(i2);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public InterfaceC0515k getViewLifecycleOwner() {
        C0489y c0489y = this.mViewLifecycleOwner;
        if (c0489y != null) {
            return c0489y;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData<InterfaceC0515k> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.InterfaceC0501a0
    public C0530z getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() != AbstractC0511g.c.INITIALIZED.ordinal()) {
            return this.mFragmentManager.m3433D0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    void initState() {
        initLifecycle();
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new C0477m();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    boolean isHideReplaced() {
        C0438i c0438i = this.mAnimationInfo;
        if (c0438i == null) {
            return false;
        }
        return c0438i.f3091u;
    }

    final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        FragmentManager fragmentManager;
        return this.mMenuVisible && ((fragmentManager = this.mFragmentManager) == null || fragmentManager.m3443J0(this.mParentFragment));
    }

    boolean isPostponed() {
        C0438i c0438i = this.mAnimationInfo;
        if (c0438i == null) {
            return false;
        }
        return c0438i.f3089s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    final boolean isRemovingParent() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null && (parentFragment.isRemoving() || parentFragment.isRemovingParent());
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.m3448M0();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    void noteStateNotSaved() {
        this.mChildFragmentManager.m3464V0();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (FragmentManager.m3392H0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i2 + " resultCode: " + i3 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        AbstractC0474j<?> abstractC0474j = this.mHost;
        Activity activityM3653e = abstractC0474j == null ? null : abstractC0474j.m3653e();
        if (activityM3653e != null) {
            this.mCalled = false;
            onAttach(activityM3653e);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (this.mChildFragmentManager.m3447L0(1)) {
            return;
        }
        this.mChildFragmentManager.m3432D();
    }

    public Animation onCreateAnimation(int i2, boolean z, int i3) {
        return null;
    }

    public Animator onCreateAnimator(int i2, boolean z, int i3) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = this.mContentLayoutId;
        if (i2 != 0) {
            return layoutInflater.inflate(i2, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        AbstractC0474j<?> abstractC0474j = this.mHost;
        Activity activityM3653e = abstractC0474j == null ? null : abstractC0474j.m3653e();
        if (activityM3653e != null) {
            this.mCalled = false;
            onInflate(activityM3653e, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.m3464V0();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            restoreViewState();
            this.mChildFragmentManager.m3516z();
        } else {
            throw new C0467c0("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    void performAttach() {
        Iterator<AbstractC0439j> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo3388a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.m3489k(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.m3654f());
        if (this.mCalled) {
            this.mFragmentManager.m3442J(this);
            this.mChildFragmentManager.m3427A();
        } else {
            throw new C0467c0("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.m3429B(configuration);
    }

    boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m3431C(menuItem);
    }

    void performCreate(Bundle bundle) {
        this.mChildFragmentManager.m3464V0();
        this.mState = 1;
        this.mCalled = false;
        if (Build.VERSION.SDK_INT >= 19) {
            this.mLifecycleRegistry.mo3861a(new InterfaceC0513i() { // from class: androidx.fragment.app.Fragment.5
                @Override // androidx.lifecycle.InterfaceC0513i
                /* renamed from: a */
                public void mo124a(InterfaceC0515k interfaceC0515k, AbstractC0511g.b bVar) {
                    View view;
                    if (bVar != AbstractC0511g.b.ON_STOP || (view = Fragment.this.mView) == null) {
                        return;
                    }
                    view.cancelPendingInputEvents();
                }
            });
        }
        this.mSavedStateRegistryController.m4700c(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.m3879h(AbstractC0511g.b.ON_CREATE);
            return;
        }
        throw new C0467c0("Fragment " + this + " did not call through to super.onCreate()");
    }

    boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        return z | this.mChildFragmentManager.m3434E(menu, menuInflater);
    }

    void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.m3464V0();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C0489y();
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.m3805c()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
        } else {
            this.mViewLifecycleOwner.m3804b();
            C0503b0.m3852a(this.mView, this.mViewLifecycleOwner);
            C0505c0.m3859a(this.mView, this);
            C0675d.m4702a(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.mo3822n(this.mViewLifecycleOwner);
        }
    }

    void performDestroy() {
        this.mChildFragmentManager.m3436F();
        this.mLifecycleRegistry.m3879h(AbstractC0511g.b.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new C0467c0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void performDestroyView() {
        this.mChildFragmentManager.m3438G();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().mo3862b().m3867g(AbstractC0511g.c.CREATED)) {
            this.mViewLifecycleOwner.m3803a(AbstractC0511g.b.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            AbstractC0992a.m6272b(this).mo6275d();
            this.mPerformedCreateView = false;
        } else {
            throw new C0467c0("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (this.mChildFragmentManager.m3439G0()) {
                return;
            }
            this.mChildFragmentManager.m3436F();
            this.mChildFragmentManager = new C0477m();
            return;
        }
        throw new C0467c0("Fragment " + this + " did not call through to super.onDetach()");
    }

    LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.m3440H();
    }

    void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        this.mChildFragmentManager.m3441I(z);
    }

    boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m3444K(menuItem);
    }

    void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.m3446L(menu);
    }

    void performPause() {
        this.mChildFragmentManager.m3449N();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m3803a(AbstractC0511g.b.ON_PAUSE);
        }
        this.mLifecycleRegistry.m3879h(AbstractC0511g.b.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new C0467c0("Fragment " + this + " did not call through to super.onPause()");
    }

    void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        this.mChildFragmentManager.m3451O(z);
    }

    boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onPrepareOptionsMenu(menu);
        }
        return z | this.mChildFragmentManager.m3453P(menu);
    }

    void performPrimaryNavigationFragmentChanged() {
        boolean zM3445K0 = this.mFragmentManager.m3445K0(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zM3445K0) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zM3445K0);
            onPrimaryNavigationFragmentChanged(zM3445K0);
            this.mChildFragmentManager.m3455Q();
        }
    }

    void performResume() {
        this.mChildFragmentManager.m3464V0();
        this.mChildFragmentManager.m3472b0(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new C0467c0("Fragment " + this + " did not call through to super.onResume()");
        }
        C0516l c0516l = this.mLifecycleRegistry;
        AbstractC0511g.b bVar = AbstractC0511g.b.ON_RESUME;
        c0516l.m3879h(bVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m3803a(bVar);
        }
        this.mChildFragmentManager.m3456R();
    }

    void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m4701d(bundle);
        Parcelable parcelableM3494m1 = this.mChildFragmentManager.m3494m1();
        if (parcelableM3494m1 != null) {
            bundle.putParcelable("android:support:fragments", parcelableM3494m1);
        }
    }

    void performStart() {
        this.mChildFragmentManager.m3464V0();
        this.mChildFragmentManager.m3472b0(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new C0467c0("Fragment " + this + " did not call through to super.onStart()");
        }
        C0516l c0516l = this.mLifecycleRegistry;
        AbstractC0511g.b bVar = AbstractC0511g.b.ON_START;
        c0516l.m3879h(bVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m3803a(bVar);
        }
        this.mChildFragmentManager.m3458S();
    }

    void performStop() {
        this.mChildFragmentManager.m3461U();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m3803a(AbstractC0511g.b.ON_STOP);
        }
        this.mLifecycleRegistry.m3879h(AbstractC0511g.b.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new C0467c0("Fragment " + this + " did not call through to super.onStop()");
    }

    void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.m3463V();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f3089s = true;
    }

    public final <I, O> AbstractC0051b<I> registerForActivityResult(AbstractC0053a<I, O> abstractC0053a, InterfaceC0050a<O> interfaceC0050a) {
        return prepareCallInternal(abstractC0053a, new C0434e(), interfaceC0050a);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i2) {
        if (this.mHost != null) {
            getParentFragmentManager().m3450N0(this, strArr, i2);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final ActivityC0468d requireActivity() {
        ActivityC0468d activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.mChildFragmentManager.m3491k1(parcelable);
        this.mChildFragmentManager.m3432D();
    }

    final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.m3806d(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.m3803a(AbstractC0511g.b.ON_CREATE);
            }
        } else {
            throw new C0467c0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().f3084n = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().f3083m = Boolean.valueOf(z);
    }

    void setAnimatingAway(View view) {
        ensureAnimationInfo().f3071a = view;
    }

    void setAnimator(Animator animator) {
        ensureAnimationInfo().f3072b = animator;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(AbstractC0251o abstractC0251o) {
        ensureAnimationInfo().f3085o = abstractC0251o;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f3077g = obj;
    }

    public void setExitSharedElementCallback(AbstractC0251o abstractC0251o) {
        ensureAnimationInfo().f3086p = abstractC0251o;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f3079i = obj;
    }

    void setFocusedView(View view) {
        ensureAnimationInfo().f3088r = view;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.mo3619p();
        }
    }

    void setHideReplaced(boolean z) {
        ensureAnimationInfo().f3091u = z;
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (savedState == null || (bundle = savedState.f3054f) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo3619p();
            }
        }
    }

    void setNextAnim(int i2) {
        if (this.mAnimationInfo == null && i2 == 0) {
            return;
        }
        ensureAnimationInfo().f3073c = i2;
    }

    void setNextTransition(int i2) {
        if (this.mAnimationInfo == null && i2 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f3074d = i2;
    }

    void setOnStartEnterTransitionListener(InterfaceC0440k interfaceC0440k) {
        ensureAnimationInfo();
        C0438i c0438i = this.mAnimationInfo;
        InterfaceC0440k interfaceC0440k2 = c0438i.f3090t;
        if (interfaceC0440k == interfaceC0440k2) {
            return;
        }
        if (interfaceC0440k != null && interfaceC0440k2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (c0438i.f3089s) {
            c0438i.f3090t = interfaceC0440k;
        }
        if (interfaceC0440k != null) {
            interfaceC0440k.mo3389a();
        }
    }

    void setPostOnViewCreatedAlpha(float f2) {
        ensureAnimationInfo().f3087q = f2;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f3080j = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        this.mRetainInstance = z;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            fragmentManager.m3484i(this);
        } else {
            fragmentManager.m3486i1(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f3078h = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f3081k = obj;
    }

    void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        C0438i c0438i = this.mAnimationInfo;
        c0438i.f3075e = arrayList;
        c0438i.f3076f = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f3082l = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i2) {
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
        }
        for (Fragment targetFragment = fragment; targetFragment != null; targetFragment = targetFragment.getTargetFragment()) {
            if (targetFragment.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i2;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.m3465W0(fragmentManager.m3511w(this));
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 5 && !z;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        AbstractC0474j<?> abstractC0474j = this.mHost;
        if (abstractC0474j != null) {
            return abstractC0474j.mo3618m(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        startActivityForResult(intent, i2, null);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if (FragmentManager.m3392H0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i2 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        getParentFragmentManager().m3454P0(this, intentSender, i2, intent, i3, i4, i5, bundle);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().f3089s) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().f3089s = false;
        } else if (Looper.myLooper() != this.mHost.m3655g().getLooper()) {
            this.mHost.m3655g().postAtFrontOfQueue(new RunnableC0431b());
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        sb.append(")");
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" ");
            sb.append(this.mTag);
        }
        sb.append('}');
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0429a();

        /* renamed from: f */
        final Bundle f3054f;

        /* renamed from: androidx.fragment.app.Fragment$SavedState$a */
        class C0429a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0429a() {
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

        SavedState(Bundle bundle) {
            this.f3054f = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeBundle(this.f3054f);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f3054f = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) throws IllegalAccessException, java.lang.InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Fragment fragmentNewInstance = C0473i.m3652d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
                fragmentNewInstance.setArguments(bundle);
            }
            return fragmentNewInstance;
        } catch (IllegalAccessException e2) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (java.lang.InstantiationException e3) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    public final String getString(int i2, Object... objArr) {
        return getResources().getString(i2, objArr);
    }

    public final void postponeEnterTransition(long j2, TimeUnit timeUnit) {
        ensureAnimationInfo().f3089s = true;
        FragmentManager fragmentManager = this.mFragmentManager;
        Handler handlerM3655g = fragmentManager != null ? fragmentManager.m3512w0().m3655g() : new Handler(Looper.getMainLooper());
        handlerM3655g.removeCallbacks(this.mPostponedDurationRunnable);
        handlerM3655g.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j2));
    }

    public final <I, O> AbstractC0051b<I> registerForActivityResult(AbstractC0053a<I, O> abstractC0053a, ActivityResultRegistry activityResultRegistry, InterfaceC0050a<O> interfaceC0050a) {
        return prepareCallInternal(abstractC0053a, new C0435f(activityResultRegistry), interfaceC0050a);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        AbstractC0474j<?> abstractC0474j = this.mHost;
        if (abstractC0474j != null) {
            abstractC0474j.m3657n(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().m3452O0(this, intent, i2, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        AbstractC0474j<?> abstractC0474j = this.mHost;
        if (abstractC0474j != null) {
            LayoutInflater layoutInflaterMo3616j = abstractC0474j.mo3616j();
            C0296f.m2043b(layoutInflaterMo3616j, this.mChildFragmentManager.m3513x0());
            return layoutInflaterMo3616j;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    private void restoreViewState() {
        if (FragmentManager.m3392H0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    public Fragment(int i2) {
        this();
        this.mContentLayoutId = i2;
    }
}
