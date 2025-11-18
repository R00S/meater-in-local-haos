package cm.aptoide.p092pt.account.view.user;

import android.net.Uri;
import android.text.TextUtils;
import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.account.view.UriToPathResolver;
import cm.aptoide.p092pt.account.view.user.ManageUserFragment;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.view.ThrowableToStringMapper;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeoutException;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class ManageUserPresenter implements Presenter {
    private final AccountAnalytics accountAnalytics;
    private final AptoideAccountManager accountManager;
    private final CrashReport crashReport;
    private final ThrowableToStringMapper errorMapper;
    private final boolean isEditProfile;
    private final boolean isFirstTime;
    private final ManageUserNavigator navigator;
    private final boolean showPrivacyConfigs;
    private final UriToPathResolver uriToPathResolver;
    private final ManageUserView view;

    public ManageUserPresenter(ManageUserView manageUserView, CrashReport crashReport, AptoideAccountManager aptoideAccountManager, ThrowableToStringMapper throwableToStringMapper, ManageUserNavigator manageUserNavigator, boolean z, UriToPathResolver uriToPathResolver, boolean z2, boolean z3, AccountAnalytics accountAnalytics) {
        this.view = manageUserView;
        this.crashReport = crashReport;
        this.accountManager = aptoideAccountManager;
        this.errorMapper = throwableToStringMapper;
        this.navigator = manageUserNavigator;
        this.isEditProfile = z;
        this.uriToPathResolver = uriToPathResolver;
        this.showPrivacyConfigs = z2;
        this.isFirstTime = z3;
        this.accountAnalytics = accountAnalytics;
    }

    private void handleCancelClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.user.n
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.user.g
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7435f.m6952b((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.user.a0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ManageUserPresenter.lambda$handleCancelClick$18((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.user.k
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7448f.m6953c((Throwable) obj);
            }
        });
    }

    private void handleSaveDataClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.user.v
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.user.j
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7444f.m6954d((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40056D0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleSaveUserDataError, reason: merged with bridge method [inline-methods] */
    public C11231b m6967q(Throwable th) {
        String map = this.errorMapper.map(th);
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.account.view.user.s
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7471f.m6958h();
            }
        }).m39973a(((th instanceof SocketTimeoutException) || (th instanceof TimeoutException)) ? this.view.showErrorMessage(map).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.account.view.user.m
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7456f.m6957g();
            }
        }) : this.view.showErrorMessage(map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCancelClick$16, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6951a(Void r1) {
        this.navigator.goBack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCancelClick$17, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m6952b(View.LifecycleEvent lifecycleEvent) {
        return this.view.cancelButtonClick().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.user.i
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7441f.m6951a((Void) obj);
            }
        });
    }

    static /* synthetic */ void lambda$handleCancelClick$18(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCancelClick$19, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6953c(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSaveDataClick$10, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m6954d(View.LifecycleEvent lifecycleEvent) {
        return this.view.saveUserDataButtonClick().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.user.x
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7482f.m6955e((ManageUserFragment.ViewModel) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.user.z
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7486f.m6956f((ManageUserFragment.ViewModel) obj);
            }
        }).m40110s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSaveDataClick$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6955e(ManageUserFragment.ViewModel viewModel) {
        this.view.showProgressDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSaveUserDataError$21, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6958h() {
        this.view.hideProgressDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onViewCreatedLoadUserData$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m6959i(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(this.isFirstTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onViewCreatedLoadUserData$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m6960j(View.LifecycleEvent lifecycleEvent) {
        return this.accountManager.accountStatus().m40057E().m40085Z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onViewCreatedLoadUserData$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ ManageUserFragment.ViewModel m6961k(Account account) {
        if (this.isEditProfile) {
            return new ManageUserFragment.ViewModel(account.getNickname(), account.getAvatar());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onViewCreatedLoadUserData$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6962l(ManageUserFragment.ViewModel viewModel) {
        this.view.loadImageStateless(viewModel.getPictureUri());
        this.view.setUserName(viewModel.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onViewCreatedLoadUserData$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6963m(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$saveUserData$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6964n() {
        this.view.hideProgressDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navigateAway, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m6966p() {
        if (this.isEditProfile) {
            this.navigator.goBack();
        } else if (this.showPrivacyConfigs) {
            this.navigator.toProfileStepOne();
        } else {
            this.navigator.goToHome();
        }
    }

    private void onViewCreatedLoadUserData() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.user.t
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.user.o
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7462f.m6959i((View.LifecycleEvent) obj);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.user.q
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7467f.m6960j((View.LifecycleEvent) obj);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.user.p
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7465f.m6961k((Account) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.user.r
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((ManageUserFragment.ViewModel) obj) != null);
            }
        }).m40095j0(C11250a.m40156b()).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.user.y
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7484f.m6962l((ManageUserFragment.ViewModel) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.user.h
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7438f.m6963m((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: saveUserData, reason: merged with bridge method [inline-methods] */
    public C11231b m6956f(final ManageUserFragment.ViewModel viewModel) {
        return updateUserAccount(viewModel).m39986z(C11250a.m40156b()).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.account.view.user.f
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7431f.m6964n();
            }
        }).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.account.view.user.u
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7475f.m6965o(viewModel);
            }
        }).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.account.view.user.w
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7480f.m6966p();
            }
        }).m39960C(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.user.l
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7451f.m6967q((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendAnalytics, reason: merged with bridge method [inline-methods] */
    public void m6965o(ManageUserFragment.ViewModel viewModel) {
        if (this.isEditProfile) {
            return;
        }
        this.accountAnalytics.createdUserProfile(!TextUtils.isEmpty(viewModel.getPictureUri()));
    }

    private C11231b updateUserAccount(ManageUserFragment.ViewModel viewModel) {
        if (this.isEditProfile) {
            if (!viewModel.hasNewPicture()) {
                return this.accountManager.updateAccount(viewModel.getName());
            }
            return this.accountManager.updateAccount(viewModel.getName(), this.uriToPathResolver.getMediaStoragePath(Uri.parse(viewModel.getPictureUri())));
        }
        if (!viewModel.hasNewPicture()) {
            return this.accountManager.updateAccount(viewModel.getName());
        }
        return this.accountManager.updateAccount(viewModel.getName(), this.uriToPathResolver.getMediaStoragePath(Uri.parse(viewModel.getPictureUri())));
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        handleSaveDataClick();
        handleCancelClick();
        onViewCreatedLoadUserData();
    }
}
