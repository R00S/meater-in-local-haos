package cm.aptoide.p092pt.presenter;

import android.content.Intent;
import android.content.SharedPreferences;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.accountmanager.AptoideCredentials;
import cm.aptoide.p092pt.account.AgentPersistence;
import cm.aptoide.p092pt.account.view.AccountNavigator;
import cm.aptoide.p092pt.actions.PermissionService;
import cm.aptoide.p092pt.apkfy.ApkFyParser;
import cm.aptoide.p092pt.autoupdate.AutoUpdateDialogFragment;
import cm.aptoide.p092pt.autoupdate.AutoUpdateManager;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationMapper;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationNavigator;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.home.AptoideBottomNavigator;
import cm.aptoide.p092pt.home.apps.UpdatesManager;
import cm.aptoide.p092pt.install.Install;
import cm.aptoide.p092pt.install.InstallCompletedNotifier;
import cm.aptoide.p092pt.install.InstallManager;
import cm.aptoide.p092pt.install.installer.RootInstallationRetryHandler;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.notification.ContentPuller;
import cm.aptoide.p092pt.notification.NotificationSyncScheduler;
import cm.aptoide.p092pt.preferences.managed.ManagerPreferences;
import cm.aptoide.p092pt.preferences.secure.SecurePreferences;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.root.RootAvailabilityManager;
import cm.aptoide.p092pt.view.DeepLinkManager;
import cm.aptoide.p092pt.view.wizard.WizardFragment;
import com.aptoide.authentication.AuthenticationException;
import java.util.List;
import p456rx.AbstractC11243h;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.exceptions.OnErrorNotImplementedException;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class MainPresenter implements Presenter {
    private final AptoideAccountManager accountManager;
    private final AccountNavigator accountNavigator;
    private final AgentPersistence agentPersistence;
    private final ApkFyParser apkFyParser;
    private final AptoideBottomNavigator aptoideBottomNavigator;
    private final AutoUpdateManager autoUpdateManager;
    private final BottomNavigationMapper bottomNavigationMapper;
    private final BottomNavigationNavigator bottomNavigationNavigator;
    private final ContentPuller contentPuller;
    private final CrashReport crashReport;
    private final DeepLinkManager deepLinkManager;
    private final boolean firstCreated;
    private final FragmentNavigator fragmentNavigator;
    private final InstallCompletedNotifier installCompletedNotifier;
    private final InstallManager installManager;
    private final AbstractC11243h ioScheduler;
    private final NotificationSyncScheduler notificationSyncScheduler;
    private final PermissionService permissionService;
    private final RootAvailabilityManager rootAvailabilityManager;
    private final RootInstallationRetryHandler rootInstallationRetryHandler;
    private final SharedPreferences securePreferences;
    private final SharedPreferences sharedPreferences;
    private final UpdatesManager updatesManager;
    private final MainView view;
    private final AbstractC11243h viewScheduler;

    public MainPresenter(MainView mainView, InstallManager installManager, RootInstallationRetryHandler rootInstallationRetryHandler, CrashReport crashReport, ApkFyParser apkFyParser, ContentPuller contentPuller, NotificationSyncScheduler notificationSyncScheduler, InstallCompletedNotifier installCompletedNotifier, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, FragmentNavigator fragmentNavigator, DeepLinkManager deepLinkManager, boolean z, AptoideBottomNavigator aptoideBottomNavigator, AbstractC11243h abstractC11243h, AbstractC11243h abstractC11243h2, BottomNavigationNavigator bottomNavigationNavigator, UpdatesManager updatesManager, AutoUpdateManager autoUpdateManager, PermissionService permissionService, RootAvailabilityManager rootAvailabilityManager, BottomNavigationMapper bottomNavigationMapper, AptoideAccountManager aptoideAccountManager, AccountNavigator accountNavigator, AgentPersistence agentPersistence) {
        this.view = mainView;
        this.installManager = installManager;
        this.rootInstallationRetryHandler = rootInstallationRetryHandler;
        this.crashReport = crashReport;
        this.apkFyParser = apkFyParser;
        this.contentPuller = contentPuller;
        this.notificationSyncScheduler = notificationSyncScheduler;
        this.installCompletedNotifier = installCompletedNotifier;
        this.fragmentNavigator = fragmentNavigator;
        this.deepLinkManager = deepLinkManager;
        this.firstCreated = z;
        this.sharedPreferences = sharedPreferences;
        this.securePreferences = sharedPreferences2;
        this.aptoideBottomNavigator = aptoideBottomNavigator;
        this.viewScheduler = abstractC11243h;
        this.ioScheduler = abstractC11243h2;
        this.bottomNavigationNavigator = bottomNavigationNavigator;
        this.updatesManager = updatesManager;
        this.autoUpdateManager = autoUpdateManager;
        this.permissionService = permissionService;
        this.rootAvailabilityManager = rootAvailabilityManager;
        this.bottomNavigationMapper = bottomNavigationMapper;
        this.accountManager = aptoideAccountManager;
        this.accountNavigator = accountNavigator;
        this.agentPersistence = agentPersistence;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: authenticate, reason: merged with bridge method [inline-methods] */
    public C11231b m8453k(String str) {
        return this.accountManager.login(new AptoideCredentials(this.agentPersistence.getEmail(), str, true, this.agentPersistence.getAgent(), this.agentPersistence.getState())).m39924p(this.viewScheduler).m39918f(new InterfaceC11252a() { // from class: cm.aptoide.pt.presenter.d3
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f10591f.m8443a();
            }
        }).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.v1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10670f.m8444b((Boolean) obj);
            }
        }).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.b3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10581f.m8445c((Boolean) obj);
            }
        }).m39917e(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.y1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10682f.m8446d((Throwable) obj);
            }
        }).m39934z();
    }

    private void downloadAutoUpdate() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.w0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(View.LifecycleEvent.CREATE.equals((View.LifecycleEvent) obj));
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.u2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10667f.m8447e((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.ioScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.s1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10658f.m8448f((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.viewScheduler).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.e3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Boolean bool = (Boolean) obj;
                MainPresenter.lambda$downloadAutoUpdate$61(bool);
                return bool;
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.q0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10649f.m8449g((Boolean) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.v0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10669f.m8450h((Boolean) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.w2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MainPresenter.lambda$downloadAutoUpdate$64(obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.t0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10661f.m8451i((Throwable) obj);
            }
        });
    }

    private void handleAuthentication() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.z0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(View.LifecycleEvent.CREATE.equals((View.LifecycleEvent) obj));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.h1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10609f.m8454l((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.b1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MainPresenter.lambda$handleAuthentication$18((String) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.l3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        });
    }

    private C11234e<Boolean> handleAutoUpdateDialog() {
        this.autoUpdateManager.incrementAutoUpdateShow();
        return this.autoUpdateManager.shouldShowAutoUpdateDialog().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.g3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Boolean bool = (Boolean) obj;
                MainPresenter.lambda$handleAutoUpdateDialog$69(bool);
                return bool;
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.w1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10674f.m8455m((Boolean) obj);
            }
        });
    }

    private C11234e<Install> handleAutoUpdateDownload() {
        return this.autoUpdateManager.hasDownloadPermissions(this.permissionService).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.h3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Boolean bool = (Boolean) obj;
                MainPresenter.lambda$handleAutoUpdateDownload$66(bool);
                return bool;
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.s2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10659f.m8456n((Boolean) obj);
            }
        }).m40095j0(this.ioScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.r2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10655f.m8457o((Boolean) obj);
            }
        });
    }

    private void handleErrorResult(Throwable th) {
        this.view.dismissAutoUpdateDialog();
        if (th instanceof SecurityException) {
            return;
        }
        this.view.showUnknownErrorMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleFirstSignup, reason: merged with bridge method [inline-methods] */
    public void m8445c(Boolean bool) {
        if (bool.booleanValue()) {
            this.accountNavigator.navigateToCreateProfileView();
        }
    }

    private Single<Boolean> isAutoUpdateDownloaded() {
        return this.autoUpdateManager.isDownloadComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$authenticate$19, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8443a() {
        this.view.showLoadingView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$authenticate$20, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8444b(Boolean bool) {
        this.view.hideLoadingView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$authenticate$22, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8446d(Throwable th) {
        this.view.hideLoadingView();
        if (th instanceof AuthenticationException) {
            AuthenticationException authenticationException = (AuthenticationException) th;
            if (authenticationException.getCode() >= 400 && authenticationException.getCode() < 500) {
                this.accountNavigator.navigateToLoginError();
                return;
            }
        }
        this.view.showGenericErrorMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadAutoUpdate$59, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m8447e(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(ManagerPreferences.isCheckAutoUpdateEnable(this.sharedPreferences));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadAutoUpdate$60, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8448f(View.LifecycleEvent lifecycleEvent) {
        return this.autoUpdateManager.shouldUpdate();
    }

    static /* synthetic */ Boolean lambda$downloadAutoUpdate$61(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadAutoUpdate$62, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8449g(Boolean bool) {
        return isAutoUpdateDownloaded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadAutoUpdate$63, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8450h(Boolean bool) {
        return bool.booleanValue() ? handleAutoUpdateDialog() : handleAutoUpdateDownload();
    }

    static /* synthetic */ void lambda$downloadAutoUpdate$64(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadAutoUpdate$65, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8451i(Throwable th) {
        handleErrorResult(th);
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAuthentication$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8452j(String str) {
        this.accountNavigator.clearBackStackUntilLogin();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAuthentication$17, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8454l(View.LifecycleEvent lifecycleEvent) {
        return this.view.onAuthenticationIntent().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.u0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10665f.m8452j((String) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.m2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10635f.m8453k((String) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleAuthentication$18(String str) {
    }

    static /* synthetic */ Boolean lambda$handleAutoUpdateDialog$69(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAutoUpdateDialog$70, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8455m(Boolean bool) {
        showAutoUpdate();
    }

    static /* synthetic */ Boolean lambda$handleAutoUpdateDownload$66(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAutoUpdateDownload$67, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8456n(Boolean bool) {
        this.autoUpdateManager.clearAutoUpdateShow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAutoUpdateDownload$68, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8457o(Boolean bool) {
        return this.autoUpdateManager.startUpdate(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8458p(View.LifecycleEvent lifecycleEvent) {
        this.apkFyParser.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$10, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8459q(Integer num) {
        this.aptoideBottomNavigator.showFragment(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8460r(View.LifecycleEvent lifecycleEvent) {
        return this.aptoideBottomNavigator.navigationEvent().m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.n2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10639f.m8459q((Integer) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$present$12(Integer num) {
    }

    static /* synthetic */ void lambda$present$13(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m8461s(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(this.firstCreated);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8462t(View.LifecycleEvent lifecycleEvent) {
        this.notificationSyncScheduler.forceSync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8463u(View.LifecycleEvent lifecycleEvent) {
        this.contentPuller.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8464v(View.LifecycleEvent lifecycleEvent) {
        downloadAutoUpdate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8465w(View.LifecycleEvent lifecycleEvent) {
        navigate();
    }

    static /* synthetic */ void lambda$present$7(View.LifecycleEvent lifecycleEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8466x(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupInstallErrorsDisplay$29, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8467y(View.LifecycleEvent lifecycleEvent) {
        return this.rootAvailabilityManager.isRootAvailable();
    }

    static /* synthetic */ Boolean lambda$setupInstallErrorsDisplay$30(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupInstallErrorsDisplay$31, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8468z(Boolean bool) {
        return this.rootInstallationRetryHandler.retries().m40091f(this.view.bindUntilEvent(View.LifecycleEvent.PAUSE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupInstallErrorsDisplay$34, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8426A(List list) {
        watchInstalls(list);
        this.view.showInstallationError(list.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupInstallErrorsDisplay$35, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8427B(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupInstallErrorsDisplay$37, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8428C(View.LifecycleEvent lifecycleEvent) {
        return this.rootAvailabilityManager.isRootAvailable();
    }

    static /* synthetic */ Boolean lambda$setupInstallErrorsDisplay$38(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupInstallErrorsDisplay$39, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8429D(Boolean bool) {
        return this.installManager.getTimedOutInstallations();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupInstallErrorsDisplay$41, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8430E(List list) {
        this.view.dismissInstallationError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupInstallErrorsDisplay$42, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8431F(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupInstallErrorsDisplay$44, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8432G(View.LifecycleEvent lifecycleEvent) {
        return this.rootAvailabilityManager.isRootAvailable();
    }

    static /* synthetic */ Boolean lambda$setupInstallErrorsDisplay$45(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupInstallErrorsDisplay$46, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8433H(Boolean bool) {
        return this.installCompletedNotifier.getWatcher();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupInstallErrorsDisplay$47, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8434I(Void r1) {
        this.view.showInstallationSuccessMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupInstallErrorsDisplay$49, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8435J(View.LifecycleEvent lifecycleEvent) {
        return this.rootAvailabilityManager.isRootAvailable();
    }

    static /* synthetic */ Boolean lambda$setupInstallErrorsDisplay$50(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupInstallErrorsDisplay$51, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8436K(Boolean bool) {
        return this.view.getInstallErrorsDismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupInstallErrorsDisplay$52, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8437L(Void r1) {
        return this.installManager.cleanTimedOutInstalls();
    }

    static /* synthetic */ void lambda$setupInstallErrorsDisplay$53(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupInstallErrorsDisplay$54, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8438M(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupUpdatesNumber$24, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8439N(View.LifecycleEvent lifecycleEvent) {
        return this.updatesManager.getUpdatesNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupUpdatesNumber$25, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8440O(Integer num) {
        this.view.showUpdatesBadge(num.intValue());
    }

    static /* synthetic */ void lambda$setupUpdatesNumber$26(Integer num) {
    }

    static /* synthetic */ void lambda$setupUpdatesNumber$27(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$shortcutManagement$56, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8441P(View.LifecycleEvent lifecycleEvent) {
        this.deepLinkManager.freeSubscriptions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$shortcutManagement$57, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8442Q(Throwable th) {
        this.crashReport.log(th);
    }

    private void navigate() {
        Intent intentAfterCreate = this.view.getIntentAfterCreate();
        showHome();
        if (this.deepLinkManager.showDeepLink(intentAfterCreate)) {
            SecurePreferences.setWizardAvailable(false, this.securePreferences);
        } else if (SecurePreferences.isWizardAvailable(this.securePreferences)) {
            showWizard();
            SecurePreferences.setWizardAvailable(false, this.securePreferences);
        }
    }

    private void setupInstallErrorsDisplay() {
        C11234e c11234eM40095j0 = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.a2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(View.LifecycleEvent.RESUME.equals((View.LifecycleEvent) obj));
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.x0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10677f.m8467y((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.p1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Boolean bool = (Boolean) obj;
                MainPresenter.lambda$setupInstallErrorsDisplay$30(bool);
                return bool;
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.l1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10629f.m8468z((Boolean) obj);
            }
        }).m40113u(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.p2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Integer.valueOf(((List) obj).size());
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.x1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                return Boolean.valueOf(!list.isEmpty());
            }
        }).m40095j0(C11250a.m40156b());
        MainView mainView = this.view;
        View.LifecycleEvent lifecycleEvent = View.LifecycleEvent.DESTROY;
        c11234eM40095j0.m40091f(mainView.bindUntilEvent(lifecycleEvent)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.x2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10679f.m8426A((List) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.j1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10619f.m8427B((Throwable) obj);
            }
        });
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.t1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(View.LifecycleEvent.RESUME.equals((View.LifecycleEvent) obj));
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.s0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10657f.m8428C((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.b2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Boolean bool = (Boolean) obj;
                MainPresenter.lambda$setupInstallErrorsDisplay$38(bool);
                return bool;
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.z1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10686f.m8429D((Boolean) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.o2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                return Boolean.valueOf(!list.isEmpty());
            }
        }).m40095j0(C11250a.m40156b()).m40091f(this.view.bindUntilEvent(lifecycleEvent)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.f2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10600f.m8430E((List) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.h2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10610f.m8431F((Throwable) obj);
            }
        });
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.t2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(View.LifecycleEvent.RESUME.equals((View.LifecycleEvent) obj));
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.r0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10653f.m8432G((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.n1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Boolean bool = (Boolean) obj;
                MainPresenter.lambda$setupInstallErrorsDisplay$45(bool);
                return bool;
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.k1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10624f.m8433H((Boolean) obj);
            }
        }).m40091f(this.view.bindUntilEvent(lifecycleEvent)).m40061G0(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.u1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10666f.m8434I((Void) obj);
            }
        });
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.c1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(View.LifecycleEvent.RESUME.equals((View.LifecycleEvent) obj));
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.i1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10614f.m8435J((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.e2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Boolean bool = (Boolean) obj;
                MainPresenter.lambda$setupInstallErrorsDisplay$50(bool);
                return bool;
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.g1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10604f.m8436K((Boolean) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.z2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10687f.m8437L((Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(lifecycleEvent)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.i2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MainPresenter.lambda$setupInstallErrorsDisplay$53((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.y0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10681f.m8438M((Throwable) obj);
            }
        });
    }

    private void setupUpdatesNumber() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.k2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.a3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10576f.m8439N((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.v2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10671f.m8440O((Integer) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.d1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MainPresenter.lambda$setupUpdatesNumber$26((Integer) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.f1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MainPresenter.lambda$setupUpdatesNumber$27((Throwable) obj);
                throw null;
            }
        });
    }

    private void shortcutManagement() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.i3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.DESTROY));
            }
        }).m40057E().m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.o1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10642f.m8441P((View.LifecycleEvent) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.y2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10683f.m8442Q((Throwable) obj);
            }
        });
    }

    private void showAutoUpdate() {
        this.fragmentNavigator.navigateToDialogFragment(new AutoUpdateDialogFragment());
    }

    private void showHome() {
        this.bottomNavigationNavigator.navigateToHome();
    }

    private void showWizard() {
        this.fragmentNavigator.navigateTo(WizardFragment.newInstance(), true);
    }

    private void watchInstalls(List<Install> list) {
        for (Install install : list) {
            this.installCompletedNotifier.add(install.getPackageName(), install.getVersionCode(), install.getMd5());
        }
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        C11234e<View.LifecycleEvent> c11234eM40119x = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.c2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(View.LifecycleEvent.CREATE.equals((View.LifecycleEvent) obj));
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.r1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10654f.m8458p((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.q2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10651f.m8461s((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.f3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10601f.m8462t((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.q1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10650f.m8463u((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.a1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10574f.m8464v((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.c3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10586f.m8465w((View.LifecycleEvent) obj);
            }
        });
        MainView mainView = this.view;
        View.LifecycleEvent lifecycleEvent = View.LifecycleEvent.DESTROY;
        c11234eM40119x.m40091f(mainView.bindUntilEvent(lifecycleEvent)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.d2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MainPresenter.lambda$present$7((View.LifecycleEvent) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.j2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10620f.m8466x((Throwable) obj);
            }
        });
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.m1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(View.LifecycleEvent.CREATE.equals((View.LifecycleEvent) obj));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.presenter.g2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10605f.m8460r((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(lifecycleEvent)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.l2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MainPresenter.lambda$present$12((Integer) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.presenter.e1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MainPresenter.lambda$present$13((Throwable) obj);
                throw null;
            }
        });
        setupInstallErrorsDisplay();
        shortcutManagement();
        setupUpdatesNumber();
        handleAuthentication();
    }
}
