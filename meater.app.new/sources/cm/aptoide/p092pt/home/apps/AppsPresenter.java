package cm.aptoide.p092pt.home.apps;

import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.actions.PermissionManager;
import cm.aptoide.p092pt.actions.PermissionService;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.home.apps.App;
import cm.aptoide.p092pt.home.apps.model.StateApp;
import cm.aptoide.p092pt.home.apps.model.UpdateApp;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.view.p107rx.RxAlertDialog;
import java.util.List;
import p456rx.AbstractC11243h;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.exceptions.OnErrorNotImplementedException;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p460m.InterfaceC11258g;

/* loaded from: classes.dex */
public class AppsPresenter implements Presenter {
    private final AptoideAccountManager accountManager;
    private final AppsManager appsManager;
    private final AppsNavigator appsNavigator;
    private final CrashReport crashReport;
    private final AbstractC11243h ioScheduler;
    private final PermissionManager permissionManager;
    private final PermissionService permissionService;
    private final AppsFragmentView view;
    private final AbstractC11243h viewScheduler;

    public AppsPresenter(AppsFragmentView appsFragmentView, AppsManager appsManager, AbstractC11243h abstractC11243h, AbstractC11243h abstractC11243h2, CrashReport crashReport, PermissionManager permissionManager, PermissionService permissionService, AptoideAccountManager aptoideAccountManager, AppsNavigator appsNavigator) {
        this.view = appsFragmentView;
        this.appsManager = appsManager;
        this.viewScheduler = abstractC11243h;
        this.ioScheduler = abstractC11243h2;
        this.crashReport = crashReport;
        this.permissionManager = permissionManager;
        this.permissionService = permissionService;
        this.accountManager = aptoideAccountManager;
        this.appsNavigator = appsNavigator;
    }

    private C11234e<AppsModel> getAppsModel() {
        return C11234e.m40038d(this.appsManager.getDownloadApps(), this.appsManager.getInstalledApps(), this.appsManager.getUpdatesList(), new InterfaceC11258g() { // from class: cm.aptoide.pt.home.apps.s1
            @Override // p456rx.p460m.InterfaceC11258g
            /* renamed from: a */
            public final Object mo6864a(Object obj, Object obj2, Object obj3) {
                return AppsPresenter.lambda$getAppsModel$61((List) obj, (List) obj2, (List) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getUserAvatar, reason: merged with bridge method [inline-methods] */
    public C11234e<String> m7987M(Account account) {
        return C11234e.m40025S((account == null || !account.isLoggedIn()) ? null : account.getAvatar());
    }

    private void handleBottomNavigationEvents() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.w0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.f3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9379f.m7991a((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.z0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9495f.m7992b((Integer) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.f1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppsPresenter.lambda$handleBottomNavigationEvents$37((Integer) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.y0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppsPresenter.lambda$handleBottomNavigationEvents$38((Throwable) obj);
                throw null;
            }
        });
    }

    private void handleCancelDownloadClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.v0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40095j0(this.viewScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.m3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9427f.m7993c((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.viewScheduler).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.b1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppsPresenter.lambda$handleCancelDownloadClick$51((App) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.q1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9449f.m7994d((Throwable) obj);
            }
        });
    }

    private void handleCardClick() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.x1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40095j0(this.viewScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.o3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9439f.m7995e((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.k3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9406f.m7996f((App) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2887l2 c2887l2 = new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.l2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppsPresenter.lambda$handleCardClick$13((App) obj);
            }
        };
        CrashReport crashReport = this.crashReport;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c2887l2, new C2834b(crashReport));
    }

    private void handleDownloadAbortEvent(String str) {
        this.appsManager.handleDownloadAbort(str).m39958A().m39964H();
    }

    private void handleInstallAppClick() {
        C11234e c11234eM40095j0 = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.n1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40095j0(this.viewScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.i2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9394f.m7997g((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.ioScheduler);
        final AppsManager appsManager = this.appsManager;
        appsManager.getClass();
        c11234eM40095j0.m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.p3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return appsManager.installApp((App) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.o2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppsPresenter.lambda$handleInstallAppClick$47((App) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.u0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9470f.m7998h((Throwable) obj);
            }
        });
    }

    private void handleOutOfSpaceAnalytics() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.z2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.h1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9388f.m7999i((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2952x0 c2952x0 = new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.x0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppsPresenter.lambda$handleOutOfSpaceAnalytics$2((List) obj);
            }
        };
        CrashReport crashReport = this.crashReport;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c2952x0, new C2834b(crashReport));
    }

    private void handlePauseDownloadClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.b2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40095j0(this.viewScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.e1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9371f.m8000j((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.j2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppsPresenter.lambda$handlePauseDownloadClick$55((App) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.i3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9395f.m8001k((Throwable) obj);
            }
        });
    }

    private void handleRefreshApps() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.s2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.i1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9393f.m8005o((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.t2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9466f.m8006p((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.w1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9481f.m8007q((Throwable) obj);
            }
        });
    }

    private void handleResumeClick() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.y1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40095j0(this.viewScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.y2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9492f.m8008r((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.ioScheduler).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.p2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9445f.m8009s((App) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2863g3 c2863g3 = new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.g3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppsPresenter.lambda$handleResumeClick$23((App) obj);
            }
        };
        CrashReport crashReport = this.crashReport;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c2863g3, new C2834b(crashReport));
    }

    private void handleStartDownloadClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.k1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40095j0(this.viewScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.h3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9390f.m8016z((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.x2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppsPresenter.lambda$handleStartDownloadClick$32((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.g2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9383f.m7975A((Throwable) obj);
            }
        });
    }

    private void handleUpdateAllClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.f2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40095j0(this.viewScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.c3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9363f.m7977C((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.ioScheduler).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.m2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9426f.m7978D((Void) obj);
            }
        }).m40095j0(this.viewScheduler).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.d1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppsPresenter.lambda$handleUpdateAllClick$43((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.a1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9349f.m7979E((Throwable) obj);
            }
        });
    }

    private void handleUpdateCardLongClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.v1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40095j0(this.viewScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.k2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9405f.m7980F((View.LifecycleEvent) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.e2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9372f.m7982H((App) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.d2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppsPresenter.lambda$handleUpdateCardLongClick$18((App) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.d3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9368f.m7983I((Throwable) obj);
            }
        });
    }

    private void handleUserAvatarClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.e3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.w2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9482f.m7985K((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.l3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppsPresenter.lambda$handleUserAvatarClick$71((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.p1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppsPresenter.lambda$handleUserAvatarClick$72((Throwable) obj);
                throw null;
            }
        });
    }

    static /* synthetic */ AppsModel lambda$getAppsModel$61(List list, List list2, List list3) {
        return new AppsModel(list3, list2, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBottomNavigationEvents$35, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7991a(View.LifecycleEvent lifecycleEvent) {
        return this.appsNavigator.bottomNavigation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBottomNavigationEvents$36, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7992b(Integer num) {
        this.view.scrollToTop();
    }

    static /* synthetic */ void lambda$handleBottomNavigationEvents$37(Integer num) {
    }

    static /* synthetic */ void lambda$handleBottomNavigationEvents$38(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCancelDownloadClick$50, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7993c(View.LifecycleEvent lifecycleEvent) {
        C11234e<App> c11234eM40095j0 = this.view.cancelDownload().m40095j0(this.ioScheduler);
        final AppsManager appsManager = this.appsManager;
        appsManager.getClass();
        return c11234eM40095j0.m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.s3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return appsManager.cancelDownload((App) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleCancelDownloadClick$51(App app) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCancelDownloadClick$52, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7994d(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCardClick$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7995e(View.LifecycleEvent lifecycleEvent) {
        return this.view.cardClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCardClick$12, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7996f(App app) {
        if (app.getType() == App.Type.DOWNLOAD || app.getType() == App.Type.UPDATE) {
            this.appsManager.setAppViewAnalyticsEvent();
        }
        this.appsNavigator.navigateToAppView(((StateApp) app).getMd5());
    }

    static /* synthetic */ void lambda$handleCardClick$13(App app) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallAppClick$46, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7997g(View.LifecycleEvent lifecycleEvent) {
        return this.view.installApp();
    }

    static /* synthetic */ void lambda$handleInstallAppClick$47(App app) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallAppClick$48, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7998h(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOutOfSpaceAnalytics$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7999i(View.LifecycleEvent lifecycleEvent) {
        return this.appsManager.observeOutOfSpaceApps();
    }

    static /* synthetic */ void lambda$handleOutOfSpaceAnalytics$2(List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePauseDownloadClick$54, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8000j(View.LifecycleEvent lifecycleEvent) {
        C11234e<App> c11234eM40095j0 = this.view.pauseDownload().m40095j0(this.ioScheduler);
        final AppsManager appsManager = this.appsManager;
        appsManager.getClass();
        return c11234eM40095j0.m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.v3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return appsManager.pauseDownload((App) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handlePauseDownloadClick$55(App app) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePauseDownloadClick$56, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8001k(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRefreshApps$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8002l() {
        this.view.hidePullToRefresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRefreshApps$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8003m(Throwable th) {
        this.view.hidePullToRefresh();
        th.printStackTrace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRefreshApps$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8004n(Void r2) {
        return this.appsManager.refreshAllUpdates().m39986z(this.viewScheduler).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.home.apps.q2
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f9450f.m8002l();
            }
        }).m39981n(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.m1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9425f.m8003m((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRefreshApps$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8005o(View.LifecycleEvent lifecycleEvent) {
        return this.view.refreshApps().m40095j0(this.ioScheduler).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.g1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9382f.m8004n((Void) obj);
            }
        }).m40110s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRefreshApps$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8006p(Void r1) {
        this.view.hidePullToRefresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRefreshApps$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8007q(Throwable th) {
        this.view.hidePullToRefresh();
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleResumeClick$21, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8008r(View.LifecycleEvent lifecycleEvent) {
        return this.view.resumeDownload();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleResumeClick$22, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8009s(App app) {
        return this.appsManager.resumeDownload(app, app.getType().toString());
    }

    static /* synthetic */ void lambda$handleResumeClick$23(App app) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleStartDownloadClick$25, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8010t(App app, Throwable th) {
        handleDownloadAbortEvent(((UpdateApp) app).getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleStartDownloadClick$26, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8011u(Boolean bool) {
        this.appsManager.storeRootAnswer(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleStartDownloadClick$27, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8012v(Void r2) {
        return this.appsManager.showWarning() ? this.view.showRootWarning().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.r1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9455f.m8011u((Boolean) obj);
            }
        }) : C11234e.m40025S(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleStartDownloadClick$28, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8013w(Boolean bool) {
        return this.permissionManager.requestDownloadAccess(this.permissionService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleStartDownloadClick$29, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8014x(App app, Void r2) {
        return this.appsManager.updateApp(app);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleStartDownloadClick$30, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8015y(final App app) {
        return this.permissionManager.requestExternalStoragePermission(this.permissionService).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.b3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9356f.m8010t(app, (Throwable) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.j3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9401f.m8012v((Void) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.o1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9437f.m8013w((Boolean) obj);
            }
        }).m40095j0(this.ioScheduler).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.j1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9398f.m8014x(app, (Void) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleStartDownloadClick$31, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8016z(View.LifecycleEvent lifecycleEvent) {
        return this.view.startDownload().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.c1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9360f.m8015y((App) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleStartDownloadClick$32(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleStartDownloadClick$33, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7975A(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUpdateAllClick$40, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7976B(Void r2) {
        return this.permissionManager.requestExternalStoragePermission(this.permissionService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUpdateAllClick$41, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7977C(View.LifecycleEvent lifecycleEvent) {
        return this.view.updateAll().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.a3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9351f.m7976B((Void) obj);
            }
        }).m40110s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUpdateAllClick$42, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7978D(Void r1) {
        return this.appsManager.updateAll();
    }

    static /* synthetic */ void lambda$handleUpdateAllClick$43(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUpdateAllClick$44, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7979E(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUpdateCardLongClick$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7980F(View.LifecycleEvent lifecycleEvent) {
        return this.view.updateLongClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUpdateCardLongClick$16, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7981G(App app, RxAlertDialog.Result result) {
        return result == RxAlertDialog.Result.POSITIVE ? this.appsManager.excludeUpdate(app) : C11231b.m39946e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUpdateCardLongClick$17, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7982H(final App app) {
        return this.view.showIgnoreUpdateDialog().m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.c2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9361f.m7981G(app, (RxAlertDialog.Result) obj);
            }
        });
    }

    static /* synthetic */ void lambda$handleUpdateCardLongClick$18(App app) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUpdateCardLongClick$19, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7983I(Throwable th) {
        this.view.showUnknownErrorMessage();
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUserAvatarClick$69, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7984J(Void r1) {
        this.appsNavigator.navigateToMyAccount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUserAvatarClick$70, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7985K(View.LifecycleEvent lifecycleEvent) {
        return this.view.imageClick().m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.l1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9409f.m7984J((Void) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleUserAvatarClick$71(Void r0) {
    }

    static /* synthetic */ void lambda$handleUserAvatarClick$72(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadUserImage$63, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7986L(View.LifecycleEvent lifecycleEvent) {
        return this.accountManager.accountStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadUserImage$65, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7988N(String str) {
        if (str != null) {
            this.view.setUserImage(str);
        } else {
            this.view.setDefaultUserImage();
        }
        this.view.showAvatar();
    }

    static /* synthetic */ void lambda$loadUserImage$66(String str) {
    }

    static /* synthetic */ void lambda$loadUserImage$67(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observeAppModelState$58, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7989O(View.LifecycleEvent lifecycleEvent) {
        return getAppsModel();
    }

    static /* synthetic */ void lambda$observeAppModelState$59(AppsModel appsModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observeAppModelState$60, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7990P(Throwable th) {
        this.crashReport.log(th);
    }

    private void loadUserImage() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.v2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.u1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9471f.m7986L((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.u2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9472f.m7987M((Account) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.z1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9496f.m7988N((String) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.t1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppsPresenter.lambda$loadUserImage$66((String) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.r2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppsPresenter.lambda$loadUserImage$67((Throwable) obj);
                throw null;
            }
        });
    }

    private void observeAppModelState() {
        C11234e c11234eM40095j0 = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.h2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40095j0(this.ioScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.a2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9350f.m7989O((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.viewScheduler);
        final AppsFragmentView appsFragmentView = this.view;
        appsFragmentView.getClass();
        c11234eM40095j0.m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.y3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                appsFragmentView.showModel((AppsModel) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.n2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppsPresenter.lambda$observeAppModelState$59((AppsModel) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.apps.n3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9433f.m7990P((Throwable) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        observeAppModelState();
        handlePauseDownloadClick();
        handleResumeClick();
        handleCancelDownloadClick();
        handleInstallAppClick();
        handleUpdateAllClick();
        handleStartDownloadClick();
        handleCardClick();
        handleUpdateCardLongClick();
        loadUserImage();
        handleUserAvatarClick();
        handleBottomNavigationEvents();
        handleRefreshApps();
        handleOutOfSpaceAnalytics();
    }
}
