package cm.aptoide.p092pt.account.view.user;

import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.LoginSignupManager;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.account.view.AccountNavigator;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class ProfileStepOnePresenter implements Presenter {
    private static final String TAG = "ProfileStepOnePresenter";
    private final AccountAnalytics accountAnalytics;
    private final AptoideAccountManager accountManager;
    private final AccountNavigator accountNavigator;
    private final CrashReport crashReport;
    private LoginSignupManager loginSignupManager;
    private final ProfileStepOneView view;

    public ProfileStepOnePresenter(ProfileStepOneView profileStepOneView, CrashReport crashReport, AptoideAccountManager aptoideAccountManager, AccountNavigator accountNavigator, AccountAnalytics accountAnalytics, LoginSignupManager loginSignupManager) {
        this.view = profileStepOneView;
        this.crashReport = crashReport;
        this.accountManager = aptoideAccountManager;
        this.accountNavigator = accountNavigator;
        this.accountAnalytics = accountAnalytics;
        this.loginSignupManager = loginSignupManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$makeUserProfilePublic$16, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m6969a(Throwable th) {
        this.crashReport.log(th);
        return this.view.showGenericErrorMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6970b(Void r3) {
        this.accountAnalytics.accountProfileAction(1, AccountAnalytics.ProfileAction.MORE_INFO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$10, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6971c(Boolean bool) {
        if (bool.booleanValue() || !this.loginSignupManager.shouldShowCreateStore()) {
            this.accountNavigator.navigateToHomeView();
        } else {
            this.accountNavigator.navigateToCreateStoreView();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m6972d(final Boolean bool) {
        return makeUserProfilePublic().m39986z(C11250a.m40156b()).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.account.view.user.h0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7439f.m6979k();
            }
        }).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.account.view.user.k0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7449f.m6980l();
            }
        }).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.account.view.user.l0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7452f.m6971c(bool);
            }
        }).m39968M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$13, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m6973e(View.LifecycleEvent lifecycleEvent) {
        return this.view.continueButtonClick().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.user.s0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7472f.m6978j((Boolean) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.user.r0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7470f.m6972d((Boolean) obj);
            }
        }).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.user.j0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                Logger.getInstance().m8279e(ProfileStepOnePresenter.TAG, (Throwable) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$present$14(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6974f(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6975g(Void r1) {
        this.accountNavigator.navigateToProfileStepTwoView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m6976h(View.LifecycleEvent lifecycleEvent) {
        return this.view.moreInfoButtonClick().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.user.f0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7432f.m6970b((Void) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.user.c0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7423f.m6975g((Void) obj);
            }
        });
    }

    static /* synthetic */ void lambda$present$4(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6977i(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6978j(Boolean bool) {
        this.view.showWaitDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6979k() {
        this.accountAnalytics.accountProfileAction(1, AccountAnalytics.ProfileAction.CONTINUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6980l() {
        this.view.dismissWaitDialog();
    }

    private C11231b makeUserProfilePublic() {
        return this.accountManager.updateAccount(Account.Access.PUBLIC).m39960C(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.user.m0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7457f.m6969a((Throwable) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        C11234e<R> c11234eM40060G = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.user.d0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.user.e0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7429f.m6976h((View.LifecycleEvent) obj);
            }
        });
        ProfileStepOneView profileStepOneView = this.view;
        View.LifecycleEvent lifecycleEvent = View.LifecycleEvent.DESTROY;
        c11234eM40060G.m40091f(profileStepOneView.bindUntilEvent(lifecycleEvent)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.user.q0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ProfileStepOnePresenter.lambda$present$4((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.user.n0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7460f.m6977i((Throwable) obj);
            }
        });
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.user.g0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.user.p0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7466f.m6973e((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(lifecycleEvent)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.user.o0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ProfileStepOnePresenter.lambda$present$14(obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.user.i0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7442f.m6974f((Throwable) obj);
            }
        });
    }
}
