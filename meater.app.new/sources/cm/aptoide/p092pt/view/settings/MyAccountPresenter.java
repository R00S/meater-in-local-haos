package cm.aptoide.p092pt.view.settings;

import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.aptoideviews.socialmedia.SocialMediaView;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.GetStore;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.GetStoreMeta;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.socialmedia.SocialMediaAnalytics;
import p456rx.AbstractC11243h;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class MyAccountPresenter implements Presenter {
    private static final int EDIT_STORE_REQUEST_CODE = 1230;
    private final AccountAnalytics accountAnalytics;
    private final AptoideAccountManager accountManager;
    private final CrashReport crashReport;
    private final MyAccountNavigator myAccountNavigator;
    private final AbstractC11243h scheduler;
    private final SocialMediaAnalytics socialMediaAnalytics;
    private final MyAccountView view;

    public MyAccountPresenter(MyAccountView myAccountView, AptoideAccountManager aptoideAccountManager, CrashReport crashReport, AbstractC11243h abstractC11243h, MyAccountNavigator myAccountNavigator, AccountAnalytics accountAnalytics, SocialMediaAnalytics socialMediaAnalytics) {
        this.view = myAccountView;
        this.accountManager = aptoideAccountManager;
        this.crashReport = crashReport;
        this.scheduler = abstractC11243h;
        this.myAccountNavigator = myAccountNavigator;
        this.accountAnalytics = accountAnalytics;
        this.socialMediaAnalytics = socialMediaAnalytics;
    }

    private void handleAptoideBackupCardViewClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.h2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11971f.m9045f((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.f
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11956f.m9046g((Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.q
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MyAccountPresenter.lambda$handleAptoideBackupCardViewClick$84((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.g
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11962f.m9047h((Throwable) obj);
            }
        });
    }

    private void handleAptoideTvCardViewClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.n0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.y
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f12063f.m9048i((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.v0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f12049f.m9049j((Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.z
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MyAccountPresenter.lambda$handleAptoideTvCardViewClick$74((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.w0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f12054f.m9050k((Throwable) obj);
            }
        });
    }

    private void handleAptoideUploaderCardViewClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.j
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.z1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f12070f.m9051l((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.i2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11977f.m9052m((Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.h1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MyAccountPresenter.lambda$handleAptoideUploaderCardViewClick$79((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.o1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f12012f.m9053n((Throwable) obj);
            }
        });
    }

    private void handleSocialMediaPromotionClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.p0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.i
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11974f.m9019H((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.d0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11945f.m9020I((SocialMediaView.SocialMediaType) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.j1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MyAccountPresenter.lambda$handleSocialMediaPromotionClick$3((SocialMediaView.SocialMediaType) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.n1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f12006f.m9021J((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$checkIfStoreIsInvalidAndRefresh$51, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9038a(View.LifecycleEvent lifecycleEvent) {
        return this.accountManager.accountStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$checkIfStoreIsInvalidAndRefresh$52, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m9040b(Account account) {
        return Boolean.valueOf(!storeExistsInAccount(account) && account.hasStore());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$checkIfStoreIsInvalidAndRefresh$54, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9042c(Store store) {
        this.view.refreshUI(store);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$checkIfStoreIsInvalidAndRefresh$55, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9043d(Account account) {
        return this.view.getStore().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.s
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((GetStoreMeta) ((GetStore) obj).getNodes().getMeta()).getData();
            }
        }).m40095j0(this.scheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.d2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11947f.m9042c((Store) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$checkIfStoreIsInvalidAndRefresh$56, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9044e(Store store) {
        return this.accountManager.updateAccount().m39968M();
    }

    static /* synthetic */ void lambda$checkIfStoreIsInvalidAndRefresh$57(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAptoideBackupCardViewClick$82, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9045f(View.LifecycleEvent lifecycleEvent) {
        return this.view.aptoideBackupCardViewClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAptoideBackupCardViewClick$83, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9046g(Void r1) {
        this.myAccountNavigator.navigateToBackupApps();
        this.accountAnalytics.sendPromoteAptoideBackupAppsEvent();
    }

    static /* synthetic */ void lambda$handleAptoideBackupCardViewClick$84(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAptoideBackupCardViewClick$85, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9047h(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAptoideTvCardViewClick$72, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9048i(View.LifecycleEvent lifecycleEvent) {
        return this.view.aptoideTvCardViewClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAptoideTvCardViewClick$73, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9049j(Void r1) {
        this.view.startAptoideTvWebView();
        this.accountAnalytics.sendPromoteAptoideTVEvent();
    }

    static /* synthetic */ void lambda$handleAptoideTvCardViewClick$74(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAptoideTvCardViewClick$75, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9050k(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAptoideUploaderCardViewClick$77, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9051l(View.LifecycleEvent lifecycleEvent) {
        return this.view.aptoideUploaderCardViewClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAptoideUploaderCardViewClick$78, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9052m(Void r1) {
        this.myAccountNavigator.navigateToUploader();
        this.accountAnalytics.sendPromoteAptoideUploaderEvent();
    }

    static /* synthetic */ void lambda$handleAptoideUploaderCardViewClick$79(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAptoideUploaderCardViewClick$80, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9053n(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCreateStoreClick$46, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9054o(View.LifecycleEvent lifecycleEvent) {
        return this.view.createStoreClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCreateStoreClick$47, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9055p(Void r1) {
        this.myAccountNavigator.navigateToCreateStore();
    }

    static /* synthetic */ void lambda$handleCreateStoreClick$48(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCreateStoreClick$49, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9056q(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleLogOutClick$60, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9057r(View.LifecycleEvent lifecycleEvent) {
        return signOutClick();
    }

    static /* synthetic */ void lambda$handleLogOutClick$61(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleLogOutClick$62, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9058s(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleLoginClick$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9059t(View.LifecycleEvent lifecycleEvent) {
        return this.view.loginClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleLoginClick$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9060u(Void r2) {
        this.myAccountNavigator.navigateToLoginView(AccountAnalytics.AccountOrigins.MY_ACCOUNT);
    }

    static /* synthetic */ void lambda$handleLoginClick$8(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleLoginClick$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9061v(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleProfileDisplayableClick$16, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9062w(View.LifecycleEvent lifecycleEvent) {
        return this.view.userClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleProfileDisplayableClick$17, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9063x(Void r1) {
        return this.accountManager.accountStatus().m40057E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleProfileDisplayableClick$18, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9064y(Account account) {
        this.myAccountNavigator.navigateToUserView(account.getId(), account.getStore().getTheme());
    }

    static /* synthetic */ void lambda$handleProfileDisplayableClick$19(Account account) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleProfileDisplayableClick$20, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9065z(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleProfileEditClick$22, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9012A(Void r1) {
        return this.accountManager.accountStatus().m40057E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleProfileEditClick$23, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9013B(Account account) {
        this.myAccountNavigator.navigateToEditProfileView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleProfileEditClick$24, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9014C(View.LifecycleEvent lifecycleEvent) {
        return this.view.editUserProfileClick().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.h0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11969f.m9012A((Void) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.o0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f12011f.m9013B((Account) obj);
            }
        });
    }

    static /* synthetic */ void lambda$handleProfileEditClick$25(Account account) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleProfileEditClick$26, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9015D(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSettingsClicked$64, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9016E(View.LifecycleEvent lifecycleEvent) {
        return this.view.settingsClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSettingsClicked$65, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9017F(Void r1) {
        this.myAccountNavigator.navigateToSettings();
    }

    static /* synthetic */ void lambda$handleSettingsClicked$66(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSettingsClicked$67, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9018G(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSocialMediaPromotionClick$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9019H(View.LifecycleEvent lifecycleEvent) {
        return this.view.socialMediaClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSocialMediaPromotionClick$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9020I(SocialMediaView.SocialMediaType socialMediaType) {
        this.myAccountNavigator.navigateToSocialMedia(socialMediaType);
        this.socialMediaAnalytics.sendPromoteSocialMediaClickEvent(socialMediaType);
    }

    static /* synthetic */ void lambda$handleSocialMediaPromotionClick$3(SocialMediaView.SocialMediaType socialMediaType) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSocialMediaPromotionClick$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9021J(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleStoreDisplayableClick$28, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9022K(View.LifecycleEvent lifecycleEvent) {
        return this.view.storeClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleStoreDisplayableClick$29, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9023L(Void r1) {
        return this.accountManager.accountStatus().m40057E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleStoreDisplayableClick$30, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9024M(Account account) {
        this.myAccountNavigator.navigateToStoreView(account.getStore().getName(), account.getStore().getTheme());
    }

    static /* synthetic */ void lambda$handleStoreDisplayableClick$31(Account account) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleStoreDisplayableClick$32, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9025N(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleStoreEditClick$34, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9026O(Void r1) {
        return this.view.getStore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleStoreEditClick$36, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9027P(View.LifecycleEvent lifecycleEvent) {
        return this.view.editStoreClick().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.u1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f12045f.m9026O((Void) obj);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.f0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((GetStoreMeta) ((GetStore) obj).getNodes().getMeta()).getData();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleStoreEditClick$37, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9028Q(Store store) {
        this.myAccountNavigator.navigateToEditStoreView(store, EDIT_STORE_REQUEST_CODE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleStoreEditClick$38, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9029R(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleStoreEditResult$40, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9030S(View.LifecycleEvent lifecycleEvent) {
        return this.myAccountNavigator.editStoreResult(EDIT_STORE_REQUEST_CODE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleStoreEditResult$41, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9031T(Boolean bool) {
        return this.accountManager.accountStatus().m40057E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleStoreEditResult$42, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9032U(Account account) {
        this.view.showAccount(account);
    }

    static /* synthetic */ void lambda$handleStoreEditResult$43(Account account) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleStoreEditResult$44, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9033V(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$populateAccountViews$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9034W(View.LifecycleEvent lifecycleEvent) {
        return this.accountManager.accountStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$populateAccountViews$12, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9035X(Account account) {
        this.view.showAccount(account);
    }

    static /* synthetic */ void lambda$populateAccountViews$13(Account account) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$populateAccountViews$14, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9036Y(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$signOutClick$68, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9037Z() {
        this.view.showLoginAccountDisplayable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$signOutClick$69, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9039a0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$signOutClick$70, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9041b0(Void r2) {
        return this.accountManager.logout().m39986z(this.scheduler).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.settings.r0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f12028f.m9037Z();
            }
        }).m39981n(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.s0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f12033f.m9039a0((Throwable) obj);
            }
        }).m39968M();
    }

    private C11234e<Void> signOutClick() {
        return this.view.signOutClick().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.q0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f12023f.m9041b0((Void) obj);
            }
        }).m40110s0();
    }

    private boolean storeExistsInAccount(Account account) {
        return account.getStore().getId() != 0;
    }

    public void checkIfStoreIsInvalidAndRefresh() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.e0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.v1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f12050f.m9038a((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.w
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f12053f.m9040b((Account) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.l0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11993f.m9043d((Account) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.x1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f12060f.m9044e((Store) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.a2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MyAccountPresenter.lambda$checkIfStoreIsInvalidAndRefresh$57(obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.g2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        });
    }

    public void handleCreateStoreClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.w1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.x
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f12058f.m9054o((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.b0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11933f.m9055p((Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.u0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MyAccountPresenter.lambda$handleCreateStoreClick$48((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.f1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11958f.m9056q((Throwable) obj);
            }
        });
    }

    public void handleLogOutClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.y1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.r1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f12029f.m9057r((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.y0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MyAccountPresenter.lambda$handleLogOutClick$61((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.k0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11987f.m9058s((Throwable) obj);
            }
        });
    }

    public void handleLoginClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.g0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.c2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11941f.m9059t((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.e2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11953f.m9060u((Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.l
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MyAccountPresenter.lambda$handleLoginClick$8((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.z0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f12069f.m9061v((Throwable) obj);
            }
        });
    }

    public void handleProfileDisplayableClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.i0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.s1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f12034f.m9062w((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.t
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f12037f.m9063x((Void) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.v
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f12048f.m9064y((Account) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.l1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MyAccountPresenter.lambda$handleProfileDisplayableClick$19((Account) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.f2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11959f.m9065z((Throwable) obj);
            }
        });
    }

    public void handleProfileEditClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.i1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.t0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f12038f.m9014C((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.c1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MyAccountPresenter.lambda$handleProfileEditClick$25((Account) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.u
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f12043f.m9015D((Throwable) obj);
            }
        });
    }

    public void handleSettingsClicked() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.b1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.p
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f12017f.m9016E((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.m
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11998f.m9017F((Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.p1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MyAccountPresenter.lambda$handleSettingsClicked$66((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.e
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11950f.m9018G((Throwable) obj);
            }
        });
    }

    public void handleStoreDisplayableClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.k
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.c0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11939f.m9022K((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.a1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11928f.m9023L((Void) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.m1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f12000f.m9024M((Account) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.n
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MyAccountPresenter.lambda$handleStoreDisplayableClick$31((Account) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.j0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11981f.m9025N((Throwable) obj);
            }
        });
    }

    public void handleStoreEditClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.k1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.e1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11952f.m9027P((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.scheduler).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.o
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f12010f.m9028Q((Store) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.q1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f12024f.m9029R((Throwable) obj);
            }
        });
    }

    public void handleStoreEditResult() {
        C11234e<View.LifecycleEvent> c11234eM40055D = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.x0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        });
        MyAccountView myAccountView = this.view;
        View.LifecycleEvent lifecycleEvent = View.LifecycleEvent.DESTROY;
        c11234eM40055D.m40091f(myAccountView.bindUntilEvent(lifecycleEvent)).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.h
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11968f.m9030S((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.j2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11983f.m9031T((Boolean) obj);
            }
        }).m40095j0(this.scheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.m0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11999f.m9032U((Account) obj);
            }
        }).m40091f(this.view.bindUntilEvent(lifecycleEvent)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.a0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MyAccountPresenter.lambda$handleStoreEditResult$43((Account) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.k2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11989f.m9033V((Throwable) obj);
            }
        });
    }

    public void populateAccountViews() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.r
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.g1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11964f.m9034W((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.scheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.d1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11946f.m9035X((Account) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.t1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MyAccountPresenter.lambda$populateAccountViews$13((Account) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.b2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11935f.m9036Y((Throwable) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        populateAccountViews();
        checkIfStoreIsInvalidAndRefresh();
        handleLoginClick();
        handleLogOutClick();
        handleCreateStoreClick();
        handleStoreEditClick();
        handleStoreEditResult();
        handleStoreDisplayableClick();
        handleProfileEditClick();
        handleProfileDisplayableClick();
        handleSettingsClicked();
        handleAptoideTvCardViewClick();
        handleAptoideUploaderCardViewClick();
        handleAptoideBackupCardViewClick();
        handleSocialMediaPromotionClick();
    }
}
