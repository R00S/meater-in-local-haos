package cm.aptoide.p092pt.account.view.user;

import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.LoginSignupManager;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.account.view.AccountNavigator;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class ProfileStepTwoPresenter implements Presenter {
    private final AccountAnalytics accountAnalytics;
    private final AptoideAccountManager accountManager;
    private final AccountNavigator accountNavigator;
    private final CrashReport crashReport;
    private LoginSignupManager loginSignupManager;
    private final ProfileStepTwoView view;

    public ProfileStepTwoPresenter(ProfileStepTwoView profileStepTwoView, AptoideAccountManager aptoideAccountManager, CrashReport crashReport, AccountNavigator accountNavigator, AccountAnalytics accountAnalytics, LoginSignupManager loginSignupManager) {
        this.view = profileStepTwoView;
        this.accountManager = aptoideAccountManager;
        this.crashReport = crashReport;
        this.accountNavigator = accountNavigator;
        this.accountAnalytics = accountAnalytics;
        this.loginSignupManager = loginSignupManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$makeAccountPrivate$17, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m6984a(Throwable th) {
        this.crashReport.log(th);
        return this.view.showGenericErrorMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$makeAccountPublic$16, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m6985b(Throwable th) {
        this.crashReport.log(th);
        return this.view.showGenericErrorMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6986c(Boolean bool) {
        this.view.showWaitDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6987d() {
        sendAnalytics(AccountAnalytics.ProfileAction.CONTINUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$10, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m6988e(final Boolean bool) {
        return makeAccountPrivate().m39986z(C11250a.m40156b()).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.account.view.user.x0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7483f.m6994k();
            }
        }).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.account.view.user.z0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7487f.m6995l();
            }
        }).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.account.view.user.j1
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7446f.m6996m(bool);
            }
        });
    }

    static /* synthetic */ Void lambda$present$11(Boolean bool) {
        return null;
    }

    static /* synthetic */ void lambda$present$14(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6989f(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6990g() {
        this.view.dismissWaitDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6991h(Boolean bool) {
        navigate(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m6992i(final Boolean bool) {
        return makeAccountPublic().m39986z(C11250a.m40156b()).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.account.view.user.g1
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7437f.m6987d();
            }
        }).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.account.view.user.c1
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7424f.m6990g();
            }
        }).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.account.view.user.f1
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7433f.m6991h(bool);
            }
        });
    }

    static /* synthetic */ Void lambda$present$5(Boolean bool) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6993j(Boolean bool) {
        this.view.showWaitDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6994k() {
        sendAnalytics(AccountAnalytics.ProfileAction.PRIVATE_PROFILE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6995l() {
        this.view.dismissWaitDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6996m(Boolean bool) {
        navigate(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$sendAnalytics$18, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6997n(AccountAnalytics.ProfileAction profileAction) {
        this.accountAnalytics.accountProfileAction(2, profileAction);
    }

    private C11231b makeAccountPrivate() {
        return this.accountManager.updateAccount(Account.Access.UNLISTED).m39960C(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.user.d1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7427f.m6984a((Throwable) obj);
            }
        });
    }

    private C11231b makeAccountPublic() {
        return this.accountManager.updateAccount(Account.Access.PUBLIC).m39960C(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.user.w0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7481f.m6985b((Throwable) obj);
            }
        });
    }

    private void navigate(boolean z) {
        if (z || !this.loginSignupManager.shouldShowCreateStore()) {
            this.accountNavigator.navigateToHomeView();
        } else {
            this.accountNavigator.navigateToCreateStoreView();
        }
    }

    private C11231b sendAnalytics(final AccountAnalytics.ProfileAction profileAction) {
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.account.view.user.b1
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7419f.m6997n(profileAction);
            }
        });
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        final C11234e<R> c11234eM40082X = this.view.continueButtonClick().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.user.h1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7440f.m6986c((Boolean) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.user.y0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7485f.m6992i((Boolean) obj);
            }
        }).m40110s0().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.user.e1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                ProfileStepTwoPresenter.lambda$present$5((Boolean) obj);
                return null;
            }
        });
        final C11234e<R> c11234eM40082X2 = this.view.makePrivateProfileButtonClick().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.user.i1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7443f.m6993j((Boolean) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.user.o1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7464f.m6988e((Boolean) obj);
            }
        }).m40110s0().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.user.k1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                ProfileStepTwoPresenter.lambda$present$11((Boolean) obj);
                return null;
            }
        });
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.user.m1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.user.l1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return C11234e.m40033a0(c11234eM40082X, c11234eM40082X2);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.user.a1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ProfileStepTwoPresenter.lambda$present$14((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.user.n1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7461f.m6989f((Throwable) obj);
            }
        });
    }
}
