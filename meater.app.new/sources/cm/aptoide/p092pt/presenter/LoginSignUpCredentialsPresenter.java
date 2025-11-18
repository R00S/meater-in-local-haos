package cm.aptoide.p092pt.presenter;

import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.account.GoogleSignUpAdapter;
import cm.aptoide.p092pt.account.view.AccountNavigator;
import cm.aptoide.p092pt.account.view.LoginSignUpCredentialsConfiguration;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.view.BackButton;
import cm.aptoide.p092pt.view.ThrowableToStringMapper;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collection;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public abstract class LoginSignUpCredentialsPresenter implements Presenter, BackButton.ClickHandler {
    private static final int RESOLVE_GOOGLE_CREDENTIALS_REQUEST_CODE = 2;
    private final AccountAnalytics accountAnalytics;
    private final AptoideAccountManager accountManager;
    private final AccountNavigator accountNavigator;
    private final LoginSignUpCredentialsConfiguration configuration;
    private final CrashReport crashReport;
    private final ThrowableToStringMapper errorMapper;
    private final Collection<String> permissions;
    private final LoginSignUpCredentialsView view;

    public LoginSignUpCredentialsPresenter(LoginSignUpCredentialsView loginSignUpCredentialsView, AptoideAccountManager aptoideAccountManager, CrashReport crashReport, LoginSignUpCredentialsConfiguration loginSignUpCredentialsConfiguration, AccountNavigator accountNavigator, Collection<String> collection, ThrowableToStringMapper throwableToStringMapper, AccountAnalytics accountAnalytics) {
        this.view = loginSignUpCredentialsView;
        this.accountManager = aptoideAccountManager;
        this.crashReport = crashReport;
        this.configuration = loginSignUpCredentialsConfiguration;
        this.accountNavigator = accountNavigator;
        this.permissions = collection;
        this.errorMapper = throwableToStringMapper;
        this.accountAnalytics = accountAnalytics;
    }

    private void handleAccountStatusChangeWhileShowingView() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.l
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.RESUME));
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.m
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10632f.m8402a((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.u
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10664f.m8403b((Account) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.PAUSE)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.n
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                LoginSignUpCredentialsPresenter.lambda$handleAccountStatusChangeWhileShowingView$7((Account) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.j
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        });
    }

    private void handleGoogleSignUpEvent() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.o
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.i
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10612f.m8404c((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.c
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10582f.m8405d((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.w
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10672f.m8406e((Boolean) obj);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.e
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10592f.m8407f((Boolean) obj);
            }
        }).m40095j0(C11250a.m40156b()).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.t
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10660f.m8408g((ConnectionResult) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.k
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                LoginSignUpCredentialsPresenter.lambda$handleGoogleSignUpEvent$16((ConnectionResult) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.b
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10577f.m8409h((Throwable) obj);
            }
        });
    }

    private void handleGoogleSignUpResult() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.s
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.g
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10602f.m8414m((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40056D0();
    }

    private void handleOpenOptions() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.f
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.x
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10676f.m8415n((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.h
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                LoginSignUpCredentialsPresenter.lambda$handleOpenOptions$2((View.LifecycleEvent) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.q
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAccountStatusChangeWhileShowingView$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8402a(View.LifecycleEvent lifecycleEvent) {
        return this.accountManager.accountStatus().m40057E().m40085Z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAccountStatusChangeWhileShowingView$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8403b(Account account) {
        if (account.isLoggedIn()) {
            navigateBack();
        }
    }

    static /* synthetic */ void lambda$handleAccountStatusChangeWhileShowingView$7(Account account) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleGoogleSignUpEvent$10, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8404c(View.LifecycleEvent lifecycleEvent) {
        showOrHideGoogleSignUp();
    }

    static /* synthetic */ Boolean lambda$handleGoogleSignUpEvent$11(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleGoogleSignUpEvent$12, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8405d(View.LifecycleEvent lifecycleEvent) {
        return this.view.googleSignUpEvent().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.j3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10621f.showNotCheckedMessage(((Boolean) obj).booleanValue());
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Boolean bool = (Boolean) obj;
                LoginSignUpCredentialsPresenter.lambda$handleGoogleSignUpEvent$11(bool);
                return bool;
            }
        }).m40110s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleGoogleSignUpEvent$13, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8406e(Boolean bool) {
        this.view.showLoading();
        this.accountAnalytics.sendGoogleLoginButtonPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleGoogleSignUpEvent$14, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8407f(Boolean bool) {
        return this.accountNavigator.navigateToGoogleSignUpForResult(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleGoogleSignUpEvent$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8408g(ConnectionResult connectionResult) {
        if (connectionResult.m13795e0()) {
            return;
        }
        this.view.showConnectionError(connectionResult);
        this.view.hideLoading();
    }

    static /* synthetic */ void lambda$handleGoogleSignUpEvent$16(ConnectionResult connectionResult) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleGoogleSignUpEvent$17, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8409h(Throwable th) {
        this.view.hideLoading();
        this.view.showError(this.errorMapper.map(th));
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleGoogleSignUpResult$19, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8410i() {
        this.accountAnalytics.loginSuccess();
        navigateToMainView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleGoogleSignUpResult$20, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8411j() {
        this.view.hideLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleGoogleSignUpResult$21, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8412k(Throwable th) {
        this.view.showError(this.errorMapper.map(th));
        this.crashReport.log(th);
        this.accountAnalytics.sendLoginErrorEvent(AccountAnalytics.LoginMethod.GOOGLE, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleGoogleSignUpResult$22, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8413l(GoogleSignInResult googleSignInResult) {
        return this.accountManager.signUp(GoogleSignUpAdapter.TYPE, googleSignInResult).m39986z(C11250a.m40156b()).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.presenter.r
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f10652f.m8410i();
            }
        }).m39984q(new InterfaceC11252a() { // from class: cm.aptoide.pt.presenter.a
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f10572f.m8411j();
            }
        }).m39981n(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.v
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10668f.m8412k((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleGoogleSignUpResult$23, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8414m(View.LifecycleEvent lifecycleEvent) {
        return this.accountNavigator.googleSignUpResults(2).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.p
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10644f.m8413l((GoogleSignInResult) obj);
            }
        }).m40110s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOpenOptions$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8415n(View.LifecycleEvent lifecycleEvent) {
        if (this.configuration.getHasMagicLinkError()) {
            this.view.showAptoideLoginArea();
            this.view.showMagicLinkError(this.configuration.getMagicLinkErrorMessage());
        }
    }

    static /* synthetic */ void lambda$handleOpenOptions$2(View.LifecycleEvent lifecycleEvent) {
    }

    private void navigateBack() {
        this.accountNavigator.popView();
    }

    private void navigateToMainView() {
        if (this.configuration.getDismissToNavigateToMainView()) {
            this.view.dismiss();
        } else if (this.configuration.getCleanBackStack()) {
            navigateToMainViewCleaningBackStack();
        } else {
            navigateBack();
        }
    }

    private void navigateToMainViewCleaningBackStack() {
        this.accountNavigator.navigateToHomeView();
    }

    private void showOrHideGoogleSignUp() {
        if (this.accountManager.isSignUpEnabled(GoogleSignUpAdapter.TYPE)) {
            this.view.showGoogleLogin();
        } else {
            this.view.hideGoogleLogin();
        }
    }

    void lockScreenRotation() {
        this.view.lockScreenRotation();
    }

    void navigateToCreateProfile() {
        this.accountNavigator.navigateToCreateProfileView();
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        handleOpenOptions();
        handleGoogleSignUpEvent();
        handleGoogleSignUpResult();
        handleAccountStatusChangeWhileShowingView();
    }

    void showNotCheckedMessage(boolean z) {
        if (z) {
            return;
        }
        this.view.showTermsConditionError();
    }

    void unlockScreenRotation() {
        this.view.unlockScreenRotation();
    }
}
