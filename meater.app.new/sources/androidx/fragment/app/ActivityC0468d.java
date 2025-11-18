package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.InterfaceC0039c;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.p001d.InterfaceC0041b;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.InterfaceC0052c;
import androidx.core.app.AbstractC0251o;
import androidx.core.app.C0237a;
import androidx.lifecycle.AbstractC0511g;
import androidx.lifecycle.C0516l;
import androidx.lifecycle.C0530z;
import androidx.lifecycle.InterfaceC0501a0;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p024c.p073p.p074a.AbstractC0992a;

/* compiled from: FragmentActivity.java */
/* renamed from: androidx.fragment.app.d */
/* loaded from: classes.dex */
public class ActivityC0468d extends ComponentActivity implements C0237a.c, C0237a.e {
    static final String FRAGMENTS_TAG = "android:support:fragments";
    boolean mCreated;
    final C0516l mFragmentLifecycleRegistry;
    final C0472h mFragments;
    boolean mResumed;
    boolean mStopped;

    /* compiled from: FragmentActivity.java */
    /* renamed from: androidx.fragment.app.d$a */
    class a implements SavedStateRegistry.InterfaceC0671b {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC0671b
        /* renamed from: a */
        public Bundle mo3613a() {
            Bundle bundle = new Bundle();
            ActivityC0468d.this.markFragmentsCreated();
            ActivityC0468d.this.mFragmentLifecycleRegistry.m3879h(AbstractC0511g.b.ON_STOP);
            Parcelable parcelableM3649x = ActivityC0468d.this.mFragments.m3649x();
            if (parcelableM3649x != null) {
                bundle.putParcelable(ActivityC0468d.FRAGMENTS_TAG, parcelableM3649x);
            }
            return bundle;
        }
    }

    /* compiled from: FragmentActivity.java */
    /* renamed from: androidx.fragment.app.d$b */
    class b implements InterfaceC0041b {
        b() {
        }

        @Override // androidx.activity.p001d.InterfaceC0041b
        /* renamed from: a */
        public void mo141a(Context context) {
            ActivityC0468d.this.mFragments.m3627a(null);
            Bundle bundleM4693a = ActivityC0468d.this.getSavedStateRegistry().m4693a(ActivityC0468d.FRAGMENTS_TAG);
            if (bundleM4693a != null) {
                ActivityC0468d.this.mFragments.m3648w(bundleM4693a.getParcelable(ActivityC0468d.FRAGMENTS_TAG));
            }
        }
    }

    /* compiled from: FragmentActivity.java */
    /* renamed from: androidx.fragment.app.d$c */
    class c extends AbstractC0474j<ActivityC0468d> implements InterfaceC0501a0, InterfaceC0039c, InterfaceC0052c, InterfaceC0479o {
        public c() {
            super(ActivityC0468d.this);
        }

        @Override // androidx.fragment.app.InterfaceC0479o
        /* renamed from: a */
        public void mo3526a(FragmentManager fragmentManager, Fragment fragment) {
            ActivityC0468d.this.onAttachFragment(fragment);
        }

        @Override // androidx.fragment.app.AbstractC0474j, androidx.fragment.app.AbstractC0470f
        /* renamed from: c */
        public View mo3383c(int i2) {
            return ActivityC0468d.this.findViewById(i2);
        }

        @Override // androidx.fragment.app.AbstractC0474j, androidx.fragment.app.AbstractC0470f
        /* renamed from: d */
        public boolean mo3384d() {
            Window window = ActivityC0468d.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.activity.result.InterfaceC0052c
        public ActivityResultRegistry getActivityResultRegistry() {
            return ActivityC0468d.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.InterfaceC0515k
        public AbstractC0511g getLifecycle() {
            return ActivityC0468d.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.InterfaceC0039c
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return ActivityC0468d.this.getOnBackPressedDispatcher();
        }

        @Override // androidx.lifecycle.InterfaceC0501a0
        public C0530z getViewModelStore() {
            return ActivityC0468d.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.AbstractC0474j
        /* renamed from: h */
        public void mo3614h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            ActivityC0468d.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.AbstractC0474j
        /* renamed from: j */
        public LayoutInflater mo3616j() {
            return ActivityC0468d.this.getLayoutInflater().cloneInContext(ActivityC0468d.this);
        }

        @Override // androidx.fragment.app.AbstractC0474j
        /* renamed from: l */
        public boolean mo3617l(Fragment fragment) {
            return !ActivityC0468d.this.isFinishing();
        }

        @Override // androidx.fragment.app.AbstractC0474j
        /* renamed from: m */
        public boolean mo3618m(String str) {
            return C0237a.m1528t(ActivityC0468d.this, str);
        }

        @Override // androidx.fragment.app.AbstractC0474j
        /* renamed from: p */
        public void mo3619p() {
            ActivityC0468d.this.supportInvalidateOptionsMenu();
        }

        @Override // androidx.fragment.app.AbstractC0474j
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public ActivityC0468d mo3615i() {
            return ActivityC0468d.this;
        }
    }

    public ActivityC0468d() {
        this.mFragments = C0472h.m3626b(new c());
        this.mFragmentLifecycleRegistry = new C0516l(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().m4696d(FRAGMENTS_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private static boolean markState(FragmentManager fragmentManager, AbstractC0511g.c cVar) {
        boolean zMarkState = false;
        for (Fragment fragment : fragmentManager.m3510v0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zMarkState |= markState(fragment.getChildFragmentManager(), cVar);
                }
                C0489y c0489y = fragment.mViewLifecycleOwner;
                if (c0489y != null && c0489y.getLifecycle().mo3862b().m3867g(AbstractC0511g.c.STARTED)) {
                    fragment.mViewLifecycleOwner.m3808f(cVar);
                    zMarkState = true;
                }
                if (fragment.mLifecycleRegistry.mo3862b().m3867g(AbstractC0511g.c.STARTED)) {
                    fragment.mLifecycleRegistry.m3881o(cVar);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.m3647v(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            AbstractC0992a.m6272b(this).mo6273a(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.m3645t().m3466X(str, fileDescriptor, printWriter, strArr);
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.m3645t();
    }

    @Deprecated
    public AbstractC0992a getSupportLoaderManager() {
        return AbstractC0992a.m6272b(this);
    }

    void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), AbstractC0511g.c.CREATED)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        this.mFragments.m3646u();
        super.onActivityResult(i2, i3, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mFragments.m3646u();
        this.mFragments.m3629d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityC0242f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.m3879h(AbstractC0511g.b.ON_CREATE);
        this.mFragments.m3631f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i2, Menu menu) {
        return i2 == 0 ? super.onCreatePanelMenu(i2, menu) | this.mFragments.m3632g(menu, getMenuInflater()) : super.onCreatePanelMenu(i2, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.mFragments.m3633h();
        this.mFragmentLifecycleRegistry.m3879h(AbstractC0511g.b.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.m3634i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.mFragments.m3636k(menuItem);
        }
        if (i2 != 6) {
            return false;
        }
        return this.mFragments.m3630e(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.m3635j(z);
    }

    @Override // android.app.Activity
    protected void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.mFragments.m3646u();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            this.mFragments.m3637l(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.m3638m();
        this.mFragmentLifecycleRegistry.m3879h(AbstractC0511g.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.m3639n(z);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Deprecated
    protected boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i2, View view, Menu menu) {
        return i2 == 0 ? onPrepareOptionsPanel(view, menu) | this.mFragments.m3640o(menu) : super.onPreparePanel(i2, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.mFragments.m3646u();
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.mResumed = true;
        this.mFragments.m3646u();
        this.mFragments.m3644s();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.m3879h(AbstractC0511g.b.ON_RESUME);
        this.mFragments.m3641p();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.m3628c();
        }
        this.mFragments.m3646u();
        this.mFragments.m3644s();
        this.mFragmentLifecycleRegistry.m3879h(AbstractC0511g.b.ON_START);
        this.mFragments.m3642q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m3646u();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.m3643r();
        this.mFragmentLifecycleRegistry.m3879h(AbstractC0511g.b.ON_STOP);
    }

    public void setEnterSharedElementCallback(AbstractC0251o abstractC0251o) {
        C0237a.m1526r(this, abstractC0251o);
    }

    public void setExitSharedElementCallback(AbstractC0251o abstractC0251o) {
        C0237a.m1527s(this, abstractC0251o);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        startActivityFromFragment(fragment, intent, i2, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        if (i2 == -1) {
            C0237a.m1530v(this, intentSender, i2, intent, i3, i4, i5, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        C0237a.m1522n(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        C0237a.m1523o(this);
    }

    public void supportStartPostponedEnterTransition() {
        C0237a.m1531w(this);
    }

    @Override // androidx.core.app.C0237a.e
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i2) {
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (i2 == -1) {
            C0237a.m1529u(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i2, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public ActivityC0468d(int i2) {
        super(i2);
        this.mFragments = C0472h.m3626b(new c());
        this.mFragmentLifecycleRegistry = new C0516l(this);
        this.mStopped = true;
        init();
    }
}
