package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.p001d.C0040a;
import androidx.activity.p001d.InterfaceC0041b;
import androidx.activity.result.AbstractC0051b;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.InterfaceC0050a;
import androidx.activity.result.InterfaceC0052c;
import androidx.activity.result.p002d.AbstractC0053a;
import androidx.core.app.ActivityC0242f;
import androidx.core.app.C0237a;
import androidx.core.app.C0238b;
import androidx.core.content.C0255a;
import androidx.lifecycle.AbstractC0511g;
import androidx.lifecycle.C0503b0;
import androidx.lifecycle.C0505c0;
import androidx.lifecycle.C0516l;
import androidx.lifecycle.C0526v;
import androidx.lifecycle.C0529y;
import androidx.lifecycle.C0530z;
import androidx.lifecycle.FragmentC0524t;
import androidx.lifecycle.InterfaceC0501a0;
import androidx.lifecycle.InterfaceC0513i;
import androidx.lifecycle.InterfaceC0515k;
import androidx.savedstate.C0673b;
import androidx.savedstate.C0675d;
import androidx.savedstate.InterfaceC0674c;
import androidx.savedstate.SavedStateRegistry;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p024c.p087w.C1021a;

/* loaded from: classes.dex */
public class ComponentActivity extends ActivityC0242f implements InterfaceC0515k, InterfaceC0501a0, InterfaceC0674c, InterfaceC0039c, InterfaceC0052c {
    private ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    final C0040a mContextAwareHelper;
    private C0529y.b mDefaultFactory;
    private final C0516l mLifecycleRegistry;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    final C0673b mSavedStateRegistryController;
    private C0530z mViewModelStore;

    /* renamed from: androidx.activity.ComponentActivity$a */
    class RunnableC0033a implements Runnable {
        RunnableC0033a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e2) {
                if (!TextUtils.equals(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e2;
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    class C0034b extends ActivityResultRegistry {

        /* renamed from: androidx.activity.ComponentActivity$b$a */
        class a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ int f90f;

            /* renamed from: g */
            final /* synthetic */ AbstractC0053a.a f91g;

            a(int i2, AbstractC0053a.a aVar) {
                this.f90f = i2;
                this.f91g = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0034b.this.m152c(this.f90f, this.f91g.m176a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b */
        class b implements Runnable {

            /* renamed from: f */
            final /* synthetic */ int f93f;

            /* renamed from: g */
            final /* synthetic */ IntentSender.SendIntentException f94g;

            b(int i2, IntentSender.SendIntentException sendIntentException) {
                this.f93f = i2;
                this.f94g = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0034b.this.m151b(this.f93f, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f94g));
            }
        }

        C0034b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        /* renamed from: f */
        public <I, O> void mo125f(int i2, AbstractC0053a<I, O> abstractC0053a, I i3, C0238b c0238b) {
            ComponentActivity componentActivity = ComponentActivity.this;
            AbstractC0053a.a<O> aVarMo174b = abstractC0053a.mo174b(componentActivity, i3);
            if (aVarMo174b != null) {
                new Handler(Looper.getMainLooper()).post(new a(i2, aVarMo174b));
                return;
            }
            Intent intentMo173a = abstractC0053a.mo173a(componentActivity, i3);
            Bundle bundleMo1534b = null;
            if (intentMo173a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleMo1534b = intentMo173a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentMo173a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else if (c0238b != null) {
                bundleMo1534b = c0238b.mo1534b();
            }
            Bundle bundle = bundleMo1534b;
            if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentMo173a.getAction())) {
                if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentMo173a.getAction())) {
                    C0237a.m1529u(componentActivity, intentMo173a, i2, bundle);
                    return;
                }
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentMo173a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    C0237a.m1530v(componentActivity, intentSenderRequest.m165d(), i2, intentSenderRequest.m162a(), intentSenderRequest.m163b(), intentSenderRequest.m164c(), 0, bundle);
                    return;
                } catch (IntentSender.SendIntentException e2) {
                    new Handler(Looper.getMainLooper()).post(new b(i2, e2));
                    return;
                }
            }
            String[] stringArrayExtra = intentMo173a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : stringArrayExtra) {
                if (ComponentActivity.this.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            C0237a.m1525q(componentActivity, (String[]) arrayList.toArray(new String[0]), i2);
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$c */
    static final class C0035c {

        /* renamed from: a */
        Object f96a;

        /* renamed from: b */
        C0530z f97b;

        C0035c() {
        }
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new C0040a();
        this.mLifecycleRegistry = new C0516l(this);
        this.mSavedStateRegistryController = C0673b.m4698a(this);
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new RunnableC0033a());
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new C0034b();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            getLifecycle().mo3861a(new InterfaceC0513i() { // from class: androidx.activity.ComponentActivity.3
                @Override // androidx.lifecycle.InterfaceC0513i
                /* renamed from: a */
                public void mo124a(InterfaceC0515k interfaceC0515k, AbstractC0511g.b bVar) {
                    if (bVar == AbstractC0511g.b.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                        if (viewPeekDecorView != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
        }
        getLifecycle().mo3861a(new InterfaceC0513i() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.InterfaceC0513i
            /* renamed from: a */
            public void mo124a(InterfaceC0515k interfaceC0515k, AbstractC0511g.b bVar) {
                if (bVar == AbstractC0511g.b.ON_DESTROY) {
                    ComponentActivity.this.mContextAwareHelper.m137b();
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.getViewModelStore().m3919a();
                }
            }
        });
        getLifecycle().mo3861a(new InterfaceC0513i() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.InterfaceC0513i
            /* renamed from: a */
            public void mo124a(InterfaceC0515k interfaceC0515k, AbstractC0511g.b bVar) {
                ComponentActivity.this.ensureViewModelStore();
                ComponentActivity.this.getLifecycle().mo3863c(this);
            }
        });
        if (19 > i2 || i2 > 23) {
            return;
        }
        getLifecycle().mo3861a(new ImmLeaksCleaner(this));
    }

    private void initViewTreeOwners() {
        C0503b0.m3852a(getWindow().getDecorView(), this);
        C0505c0.m3859a(getWindow().getDecorView(), this);
        C0675d.m4702a(getWindow().getDecorView(), this);
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public final void addOnContextAvailableListener(InterfaceC0041b interfaceC0041b) {
        this.mContextAwareHelper.m136a(interfaceC0041b);
    }

    void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            C0035c c0035c = (C0035c) getLastNonConfigurationInstance();
            if (c0035c != null) {
                this.mViewModelStore = c0035c.f97b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new C0530z();
            }
        }
    }

    @Override // androidx.activity.result.InterfaceC0052c
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    public C0529y.b getDefaultViewModelProviderFactory() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new C0526v(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        C0035c c0035c = (C0035c) getLastNonConfigurationInstance();
        if (c0035c != null) {
            return c0035c.f96a;
        }
        return null;
    }

    @Override // androidx.core.app.ActivityC0242f, androidx.lifecycle.InterfaceC0515k
    public AbstractC0511g getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.InterfaceC0039c
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // androidx.savedstate.InterfaceC0674c
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.m4699b();
    }

    @Override // androidx.lifecycle.InterfaceC0501a0
    public C0530z getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    @Override // android.app.Activity
    @Deprecated
    protected void onActivityResult(int i2, int i3, Intent intent) {
        if (this.mActivityResultRegistry.m151b(i2, i3, intent)) {
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.m129c();
    }

    @Override // androidx.core.app.ActivityC0242f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.m4700c(bundle);
        this.mContextAwareHelper.m138c(this);
        super.onCreate(bundle);
        this.mActivityResultRegistry.m153g(bundle);
        FragmentC0524t.m3896g(this);
        int i2 = this.mContentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.m151b(i2, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0035c c0035c;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C0530z c0530z = this.mViewModelStore;
        if (c0530z == null && (c0035c = (C0035c) getLastNonConfigurationInstance()) != null) {
            c0530z = c0035c.f97b;
        }
        if (c0530z == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0035c c0035c2 = new C0035c();
        c0035c2.f96a = objOnRetainCustomNonConfigurationInstance;
        c0035c2.f97b = c0530z;
        return c0035c2;
    }

    @Override // androidx.core.app.ActivityC0242f, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        AbstractC0511g lifecycle = getLifecycle();
        if (lifecycle instanceof C0516l) {
            ((C0516l) lifecycle).m3881o(AbstractC0511g.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m4701d(bundle);
        this.mActivityResultRegistry.m154h(bundle);
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.m139d();
    }

    public final <I, O> AbstractC0051b<I> registerForActivityResult(AbstractC0053a<I, O> abstractC0053a, ActivityResultRegistry activityResultRegistry, InterfaceC0050a<O> interfaceC0050a) {
        return activityResultRegistry.m156j("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, abstractC0053a, interfaceC0050a);
    }

    public final void removeOnContextAvailableListener(InterfaceC0041b interfaceC0041b) {
        this.mContextAwareHelper.m140e(interfaceC0041b);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (C1021a.m6526d()) {
                C1021a.m6523a("reportFullyDrawn() for " + getComponentName());
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 > 19) {
                super.reportFullyDrawn();
            } else if (i2 == 19 && C0255a.m1672a(this, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                super.reportFullyDrawn();
            }
        } finally {
            C1021a.m6524b();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i2) {
        initViewTreeOwners();
        super.setContentView(i2);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        super.startActivityForResult(intent, i2);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    public final <I, O> AbstractC0051b<I> registerForActivityResult(AbstractC0053a<I, O> abstractC0053a, InterfaceC0050a<O> interfaceC0050a) {
        return registerForActivityResult(abstractC0053a, this.mActivityResultRegistry, interfaceC0050a);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public ComponentActivity(int i2) {
        this();
        this.mContentLayoutId = i2;
    }
}
