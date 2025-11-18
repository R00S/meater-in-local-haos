package cm.aptoide.p092pt.presenter;

import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.account.view.AccountNavigator;
import cm.aptoide.p092pt.account.view.LoginSignUpCredentialsConfiguration;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.view.ThrowableToStringMapper;
import java.util.Collection;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class LoginSignupCredentialsFlavorPresenter extends LoginSignUpCredentialsPresenter {
    private final AccountNavigator accountNavigator;
    private final CrashReport crashReport;
    private final ThrowableToStringMapper errorMapper;
    private final LoginSignUpCredentialsView view;

    public LoginSignupCredentialsFlavorPresenter(LoginSignUpCredentialsView loginSignUpCredentialsView, AptoideAccountManager aptoideAccountManager, CrashReport crashReport, LoginSignUpCredentialsConfiguration loginSignUpCredentialsConfiguration, AccountNavigator accountNavigator, Collection<String> collection, ThrowableToStringMapper throwableToStringMapper, AccountAnalytics accountAnalytics) {
        super(loginSignUpCredentialsView, aptoideAccountManager, crashReport, loginSignUpCredentialsConfiguration, accountNavigator, collection, throwableToStringMapper, accountAnalytics);
        this.view = loginSignUpCredentialsView;
        this.errorMapper = throwableToStringMapper;
        this.crashReport = crashReport;
        this.accountNavigator = accountNavigator;
    }

    private void handleClickOnPrivacyPolicy() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.i0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.g0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10603f.m8416o((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.o0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10641f.m8417p((Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.b0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                LoginSignupCredentialsFlavorPresenter.lambda$handleClickOnPrivacyPolicy$8((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.y
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10680f.m8418q((Throwable) obj);
            }
        });
    }

    private void handleClickOnTermsAndConditions() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.f0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.k0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10623f.m8419r((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.j0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10618f.m8420s((Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.z
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                LoginSignupCredentialsFlavorPresenter.lambda$handleClickOnTermsAndConditions$3((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.m0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10633f.m8421t((Throwable) obj);
            }
        });
    }

    private void handleConnectWithEmailClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.p0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.c0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10583f.m8423v((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.d0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                LoginSignupCredentialsFlavorPresenter.lambda$handleConnectWithEmailClick$16((Boolean) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.l0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10628f.m8424w((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnPrivacyPolicy$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8416o(View.LifecycleEvent lifecycleEvent) {
        return this.view.privacyPolicyClickEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnPrivacyPolicy$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8417p(Void r1) {
        this.accountNavigator.navigateToPrivacyPolicy();
    }

    static /* synthetic */ void lambda$handleClickOnPrivacyPolicy$8(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnPrivacyPolicy$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8418q(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnTermsAndConditions$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8419r(View.LifecycleEvent lifecycleEvent) {
        return this.view.termsAndConditionsClickEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnTermsAndConditions$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8420s(Void r1) {
        this.accountNavigator.navigateToTermsAndConditions();
    }

    static /* synthetic */ void lambda$handleClickOnTermsAndConditions$3(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnTermsAndConditions$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8421t(Throwable th) {
        this.crashReport.log(th);
    }

    static /* synthetic */ Boolean lambda$handleConnectWithEmailClick$13(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleConnectWithEmailClick$14, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8422u(Boolean bool) {
        this.view.showAptoideLoginArea();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleConnectWithEmailClick$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8423v(View.LifecycleEvent lifecycleEvent) {
        return this.view.showAptoideLoginAreaClick().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.k3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10626f.showNotCheckedMessage(((Boolean) obj).booleanValue());
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.a0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Boolean bool = (Boolean) obj;
                LoginSignupCredentialsFlavorPresenter.lambda$handleConnectWithEmailClick$13(bool);
                return bool;
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.e0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10593f.m8422u((Boolean) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleConnectWithEmailClick$16(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleConnectWithEmailClick$17, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8424w(Throwable th) {
        this.view.hideLoading();
        this.view.showError(this.errorMapper.map(th));
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showTCandPP$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8425x(View.LifecycleEvent lifecycleEvent) {
        this.view.showTCandPP();
    }

    private void showTCandPP() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.n0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.h0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10608f.m8425x((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40056D0();
    }

    @Override // cm.aptoide.pt.view.BackButton.ClickHandler
    public boolean handle() {
        return this.view.tryCloseLoginBottomSheet(true);
    }

    @Override // cm.aptoide.p092pt.presenter.LoginSignUpCredentialsPresenter, cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        showTCandPP();
        super.present();
        handleConnectWithEmailClick();
        handleClickOnTermsAndConditions();
        handleClickOnPrivacyPolicy();
    }
}
