package cm.aptoide.p092pt.home.more.appcoins;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.p092pt.actions.PermissionManager;
import cm.aptoide.p092pt.actions.PermissionService;
import cm.aptoide.p092pt.ads.MoPubAdsManager;
import cm.aptoide.p092pt.app.AppNavigator;
import cm.aptoide.p092pt.app.DownloadModel;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceNavigatorWrapper;
import cm.aptoide.p092pt.home.bundles.apps.RewardApp;
import cm.aptoide.p092pt.home.more.appcoins.EarnAppcListPresenter;
import cm.aptoide.p092pt.home.more.base.ListAppsClickEvent;
import cm.aptoide.p092pt.home.more.base.ListAppsPresenter;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.promotions.WalletApp;
import cm.aptoide.p092pt.repository.request.RewardAppCoinsAppsRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.AbstractC11243h;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p460m.InterfaceCallableC11255d;
import p456rx.schedulers.Schedulers;

/* compiled from: EarnAppcListPresenter.kt */
@Metadata(m32266d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c¢\u0006\u0002\u0010\u001dJ\u001c\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020 0\u001f2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0016J\u0016\u0010%\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020(H\u0016J\b\u0010)\u001a\u00020&H\u0002J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\"0\u001fH\u0002J\b\u0010+\u001a\u00020&H\u0002J\b\u0010,\u001a\u00020&H\u0002J\b\u0010-\u001a\u00020&H\u0002J\b\u0010.\u001a\u00020&H\u0002J\u0014\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020 0\u001fH\u0016J\b\u00100\u001a\u00020&H\u0002J\u000e\u00101\u001a\b\u0012\u0004\u0012\u0002020\u001fH\u0002J\u000e\u00103\u001a\b\u0012\u0004\u0012\u0002020\u001fH\u0002J\b\u00104\u001a\u00020&H\u0016J\u0010\u00105\u001a\u0002062\u0006\u00107\u001a\u000206H\u0002J\u0016\u00108\u001a\b\u0012\u0004\u0012\u0002020\u001f2\u0006\u00109\u001a\u000202H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, m32267d2 = {"Lcm/aptoide/pt/home/more/appcoins/EarnAppcListPresenter;", "Lcm/aptoide/pt/home/more/base/ListAppsPresenter;", "Lcm/aptoide/pt/home/bundles/apps/RewardApp;", "view", "Lcm/aptoide/pt/home/more/appcoins/EarnAppcListView;", "viewScheduler", "Lrx/Scheduler;", "crashReporter", "Lcm/aptoide/pt/crashreports/CrashReport;", "rewardAppsRepository", "Lcm/aptoide/pt/repository/request/RewardAppCoinsAppsRepository;", "analyticsManager", "Lcm/aptoide/analytics/AnalyticsManager;", "appNavigator", "Lcm/aptoide/pt/app/AppNavigator;", "earnAppcListConfiguration", "Lcm/aptoide/pt/home/more/appcoins/EarnAppcListConfiguration;", "earnAppcListManager", "Lcm/aptoide/pt/home/more/appcoins/EarnAppcListManager;", "permissionManager", "Lcm/aptoide/pt/actions/PermissionManager;", "permissionService", "Lcm/aptoide/pt/actions/PermissionService;", "moPubAdsManager", "Lcm/aptoide/pt/ads/MoPubAdsManager;", "earnAppcListAnalytics", "Lcm/aptoide/pt/home/more/appcoins/EarnAppcListAnalytics;", "earnAppcNavigator", "Lcm/aptoide/pt/home/more/appcoins/EarnAppcNavigator;", "(Lcm/aptoide/pt/home/more/appcoins/EarnAppcListView;Lrx/Scheduler;Lcm/aptoide/pt/crashreports/CrashReport;Lcm/aptoide/pt/repository/request/RewardAppCoinsAppsRepository;Lcm/aptoide/analytics/AnalyticsManager;Lcm/aptoide/pt/app/AppNavigator;Lcm/aptoide/pt/home/more/appcoins/EarnAppcListConfiguration;Lcm/aptoide/pt/home/more/appcoins/EarnAppcListManager;Lcm/aptoide/pt/actions/PermissionManager;Lcm/aptoide/pt/actions/PermissionService;Lcm/aptoide/pt/ads/MoPubAdsManager;Lcm/aptoide/pt/home/more/appcoins/EarnAppcListAnalytics;Lcm/aptoide/pt/home/more/appcoins/EarnAppcNavigator;)V", "getApps", "Lrx/Observable;", HttpUrl.FRAGMENT_ENCODE_SET, "refresh", HttpUrl.FRAGMENT_ENCODE_SET, "getTitle", HttpUrl.FRAGMENT_ENCODE_SET, "handleAppClick", HttpUrl.FRAGMENT_ENCODE_SET, "appClickEvent", "Lcm/aptoide/pt/home/more/base/ListAppsClickEvent;", "handleCancelDownload", "handleOnWalletInstalled", "handleOutOfSpaceDialogResult", "handlePauseDownload", "handleResumeDownload", "handleWalletInstallClick", "loadMoreApps", "loadWalletApp", "observeWalletDownloadError", "Lcm/aptoide/pt/promotions/WalletApp;", "observeWalletState", "present", "startWalletDownload", "Lrx/Completable;", "actionCompletable", "verifyNotEnoughSpaceError", "walletApp", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class EarnAppcListPresenter extends ListAppsPresenter<RewardApp> {
    private final AnalyticsManager analyticsManager;
    private final AppNavigator appNavigator;
    private final CrashReport crashReporter;
    private final EarnAppcListAnalytics earnAppcListAnalytics;
    private final EarnAppcListConfiguration earnAppcListConfiguration;
    private final EarnAppcListManager earnAppcListManager;
    private final EarnAppcNavigator earnAppcNavigator;
    private final MoPubAdsManager moPubAdsManager;
    private final PermissionManager permissionManager;
    private final PermissionService permissionService;
    private final RewardAppCoinsAppsRepository rewardAppsRepository;
    private final EarnAppcListView view;
    private final AbstractC11243h viewScheduler;

    /* compiled from: EarnAppcListPresenter.kt */
    @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", "Lrx/Observable;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "it", HttpUrl.FRAGMENT_ENCODE_SET, "call"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: cm.aptoide.pt.home.more.appcoins.EarnAppcListPresenter$startWalletDownload$2 */
    static final class C31812<T, R> implements InterfaceC11256e {
        final /* synthetic */ C11231b $actionCompletable;

        C31812(C11231b c11231b) {
            this.$actionCompletable = c11231b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: call$lambda-0, reason: not valid java name */
        public static final C11234e m40909call$lambda0(EarnAppcListPresenter earnAppcListPresenter, Void r1) {
            C9801m.m32346f(earnAppcListPresenter, "this$0");
            return earnAppcListPresenter.permissionManager.requestExternalStoragePermission(earnAppcListPresenter.permissionService);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: call$lambda-1, reason: not valid java name */
        public static final C11231b m40910call$lambda1(C11231b c11231b, Void r1) {
            C9801m.m32346f(c11231b, "$actionCompletable");
            return c11231b;
        }

        @Override // p456rx.p460m.InterfaceC11256e
        public final C11234e<? extends Void> call(Void r3) {
            C11234e<Void> c11234eRequestDownloadAllowingMobileData = EarnAppcListPresenter.this.permissionManager.requestDownloadAllowingMobileData(EarnAppcListPresenter.this.permissionService);
            final EarnAppcListPresenter earnAppcListPresenter = EarnAppcListPresenter.this;
            C11234e<R> c11234eM40095j0 = c11234eRequestDownloadAllowingMobileData.m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.appcoins.y0
                @Override // p456rx.p460m.InterfaceC11256e
                public final Object call(Object obj) {
                    return EarnAppcListPresenter.C31812.m40909call$lambda0(earnAppcListPresenter, (Void) obj);
                }
            }).m40095j0(Schedulers.m40658io());
            final C11231b c11231b = this.$actionCompletable;
            return c11234eM40095j0.m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.appcoins.x0
                @Override // p456rx.p460m.InterfaceC11256e
                public final Object call(Object obj) {
                    return EarnAppcListPresenter.C31812.m40910call$lambda1(c11231b, (Void) obj);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarnAppcListPresenter(EarnAppcListView earnAppcListView, AbstractC11243h abstractC11243h, CrashReport crashReport, RewardAppCoinsAppsRepository rewardAppCoinsAppsRepository, AnalyticsManager analyticsManager, AppNavigator appNavigator, EarnAppcListConfiguration earnAppcListConfiguration, EarnAppcListManager earnAppcListManager, PermissionManager permissionManager, PermissionService permissionService, MoPubAdsManager moPubAdsManager, EarnAppcListAnalytics earnAppcListAnalytics, EarnAppcNavigator earnAppcNavigator) {
        super(earnAppcListView, abstractC11243h, crashReport);
        C9801m.m32346f(earnAppcListView, "view");
        C9801m.m32346f(abstractC11243h, "viewScheduler");
        C9801m.m32346f(crashReport, "crashReporter");
        C9801m.m32346f(rewardAppCoinsAppsRepository, "rewardAppsRepository");
        C9801m.m32346f(analyticsManager, "analyticsManager");
        C9801m.m32346f(appNavigator, "appNavigator");
        C9801m.m32346f(earnAppcListConfiguration, "earnAppcListConfiguration");
        C9801m.m32346f(earnAppcListManager, "earnAppcListManager");
        C9801m.m32346f(permissionManager, "permissionManager");
        C9801m.m32346f(permissionService, "permissionService");
        C9801m.m32346f(moPubAdsManager, "moPubAdsManager");
        C9801m.m32346f(earnAppcListAnalytics, "earnAppcListAnalytics");
        C9801m.m32346f(earnAppcNavigator, "earnAppcNavigator");
        this.view = earnAppcListView;
        this.viewScheduler = abstractC11243h;
        this.crashReporter = crashReport;
        this.rewardAppsRepository = rewardAppCoinsAppsRepository;
        this.analyticsManager = analyticsManager;
        this.appNavigator = appNavigator;
        this.earnAppcListConfiguration = earnAppcListConfiguration;
        this.earnAppcListManager = earnAppcListManager;
        this.permissionManager = permissionManager;
        this.permissionService = permissionService;
        this.moPubAdsManager = moPubAdsManager;
        this.earnAppcListAnalytics = earnAppcListAnalytics;
        this.earnAppcNavigator = earnAppcNavigator;
    }

    private final void handleCancelDownload() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.appcoins.g0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return EarnAppcListPresenter.m40865handleCancelDownload$lambda20((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.appcoins.w0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return EarnAppcListPresenter.m40866handleCancelDownload$lambda22(this.f9867f, (View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.appcoins.p
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EarnAppcListPresenter.m40868handleCancelDownload$lambda23((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.appcoins.i0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EarnAppcListPresenter.m40869handleCancelDownload$lambda24(this.f9838f, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleCancelDownload$lambda-20, reason: not valid java name */
    public static final Boolean m40865handleCancelDownload$lambda20(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleCancelDownload$lambda-22, reason: not valid java name */
    public static final C11234e m40866handleCancelDownload$lambda22(final EarnAppcListPresenter earnAppcListPresenter, View.LifecycleEvent lifecycleEvent) {
        C9801m.m32346f(earnAppcListPresenter, "this$0");
        return earnAppcListPresenter.view.cancelDownload().m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.appcoins.q
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return EarnAppcListPresenter.m40867handleCancelDownload$lambda22$lambda21(this.f9854f, (Void) obj);
            }
        }).m40110s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleCancelDownload$lambda-22$lambda-21, reason: not valid java name */
    public static final C11231b m40867handleCancelDownload$lambda22$lambda21(EarnAppcListPresenter earnAppcListPresenter, Void r1) {
        C9801m.m32346f(earnAppcListPresenter, "this$0");
        return earnAppcListPresenter.earnAppcListManager.cancelWalletDownload();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleCancelDownload$lambda-23, reason: not valid java name */
    public static final void m40868handleCancelDownload$lambda23(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleCancelDownload$lambda-24, reason: not valid java name */
    public static final void m40869handleCancelDownload$lambda24(EarnAppcListPresenter earnAppcListPresenter, Throwable th) {
        C9801m.m32346f(earnAppcListPresenter, "this$0");
        earnAppcListPresenter.crashReporter.log(th);
    }

    private final C11234e<Boolean> handleOnWalletInstalled() {
        C11234e<Boolean> c11234eM40119x = this.earnAppcListManager.onWalletInstalled().m40057E().m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.appcoins.m0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EarnAppcListPresenter.m40870handleOnWalletInstalled$lambda6(this.f9847f, (Boolean) obj);
            }
        });
        C9801m.m32345e(c11234eM40119x, "earnAppcListManager.onWa…{ view.hideWalletArea() }");
        return c11234eM40119x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnWalletInstalled$lambda-6, reason: not valid java name */
    public static final void m40870handleOnWalletInstalled$lambda6(EarnAppcListPresenter earnAppcListPresenter, Boolean bool) {
        C9801m.m32346f(earnAppcListPresenter, "this$0");
        earnAppcListPresenter.view.hideWalletArea();
    }

    private final void handleOutOfSpaceDialogResult() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.appcoins.a1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return EarnAppcListPresenter.m40871handleOutOfSpaceDialogResult$lambda0((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.appcoins.t
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return EarnAppcListPresenter.m40872handleOutOfSpaceDialogResult$lambda1(this.f9860f, (View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.appcoins.s
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return EarnAppcListPresenter.m40873handleOutOfSpaceDialogResult$lambda2((OutOfSpaceNavigatorWrapper) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.appcoins.a0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return EarnAppcListPresenter.m40874handleOutOfSpaceDialogResult$lambda3(this.f9815f, (OutOfSpaceNavigatorWrapper) obj);
            }
        }).m40110s0().m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.appcoins.b0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EarnAppcListPresenter.m40875handleOutOfSpaceDialogResult$lambda4((OutOfSpaceNavigatorWrapper) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.appcoins.h0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EarnAppcListPresenter.m40876handleOutOfSpaceDialogResult$lambda5(this.f9836f, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOutOfSpaceDialogResult$lambda-0, reason: not valid java name */
    public static final Boolean m40871handleOutOfSpaceDialogResult$lambda0(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOutOfSpaceDialogResult$lambda-1, reason: not valid java name */
    public static final C11234e m40872handleOutOfSpaceDialogResult$lambda1(EarnAppcListPresenter earnAppcListPresenter, View.LifecycleEvent lifecycleEvent) {
        C9801m.m32346f(earnAppcListPresenter, "this$0");
        return earnAppcListPresenter.earnAppcNavigator.outOfSpaceDialogResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOutOfSpaceDialogResult$lambda-2, reason: not valid java name */
    public static final Boolean m40873handleOutOfSpaceDialogResult$lambda2(OutOfSpaceNavigatorWrapper outOfSpaceNavigatorWrapper) {
        return Boolean.valueOf(outOfSpaceNavigatorWrapper.getClearedSuccessfully());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOutOfSpaceDialogResult$lambda-3, reason: not valid java name */
    public static final C11231b m40874handleOutOfSpaceDialogResult$lambda3(EarnAppcListPresenter earnAppcListPresenter, OutOfSpaceNavigatorWrapper outOfSpaceNavigatorWrapper) {
        C9801m.m32346f(earnAppcListPresenter, "this$0");
        return earnAppcListPresenter.startWalletDownload(earnAppcListPresenter.earnAppcListManager.resumeWalletDownload());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOutOfSpaceDialogResult$lambda-4, reason: not valid java name */
    public static final void m40875handleOutOfSpaceDialogResult$lambda4(OutOfSpaceNavigatorWrapper outOfSpaceNavigatorWrapper) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOutOfSpaceDialogResult$lambda-5, reason: not valid java name */
    public static final void m40876handleOutOfSpaceDialogResult$lambda5(EarnAppcListPresenter earnAppcListPresenter, Throwable th) {
        C9801m.m32346f(earnAppcListPresenter, "this$0");
        earnAppcListPresenter.crashReporter.log(th);
    }

    private final void handlePauseDownload() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.appcoins.l
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return EarnAppcListPresenter.m40877handlePauseDownload$lambda30((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.appcoins.w
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return EarnAppcListPresenter.m40878handlePauseDownload$lambda32(this.f9866f, (View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.appcoins.q0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EarnAppcListPresenter.m40880handlePauseDownload$lambda33((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.appcoins.s0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EarnAppcListPresenter.m40881handlePauseDownload$lambda34(this.f9859f, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handlePauseDownload$lambda-30, reason: not valid java name */
    public static final Boolean m40877handlePauseDownload$lambda30(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handlePauseDownload$lambda-32, reason: not valid java name */
    public static final C11234e m40878handlePauseDownload$lambda32(final EarnAppcListPresenter earnAppcListPresenter, View.LifecycleEvent lifecycleEvent) {
        C9801m.m32346f(earnAppcListPresenter, "this$0");
        return earnAppcListPresenter.view.pauseDownload().m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.appcoins.d0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return EarnAppcListPresenter.m40879handlePauseDownload$lambda32$lambda31(this.f9824f, (Void) obj);
            }
        }).m40110s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handlePauseDownload$lambda-32$lambda-31, reason: not valid java name */
    public static final C11231b m40879handlePauseDownload$lambda32$lambda31(EarnAppcListPresenter earnAppcListPresenter, Void r1) {
        C9801m.m32346f(earnAppcListPresenter, "this$0");
        return earnAppcListPresenter.earnAppcListManager.pauseWalletDownload();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handlePauseDownload$lambda-33, reason: not valid java name */
    public static final void m40880handlePauseDownload$lambda33(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handlePauseDownload$lambda-34, reason: not valid java name */
    public static final void m40881handlePauseDownload$lambda34(EarnAppcListPresenter earnAppcListPresenter, Throwable th) {
        C9801m.m32346f(earnAppcListPresenter, "this$0");
        earnAppcListPresenter.crashReporter.log(th);
    }

    private final void handleResumeDownload() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.appcoins.k
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return EarnAppcListPresenter.m40882handleResumeDownload$lambda25((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.appcoins.j0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return EarnAppcListPresenter.m40883handleResumeDownload$lambda27(this.f9840f, (View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.appcoins.u
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EarnAppcListPresenter.m40885handleResumeDownload$lambda28((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.appcoins.l0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EarnAppcListPresenter.m40886handleResumeDownload$lambda29(this.f9845f, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleResumeDownload$lambda-25, reason: not valid java name */
    public static final Boolean m40882handleResumeDownload$lambda25(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleResumeDownload$lambda-27, reason: not valid java name */
    public static final C11234e m40883handleResumeDownload$lambda27(final EarnAppcListPresenter earnAppcListPresenter, View.LifecycleEvent lifecycleEvent) {
        C9801m.m32346f(earnAppcListPresenter, "this$0");
        return earnAppcListPresenter.view.resumeDownload().m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.appcoins.v0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return EarnAppcListPresenter.m40884handleResumeDownload$lambda27$lambda26(this.f9865f, (Void) obj);
            }
        }).m40110s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleResumeDownload$lambda-27$lambda-26, reason: not valid java name */
    public static final C11231b m40884handleResumeDownload$lambda27$lambda26(EarnAppcListPresenter earnAppcListPresenter, Void r1) {
        C9801m.m32346f(earnAppcListPresenter, "this$0");
        return earnAppcListPresenter.startWalletDownload(earnAppcListPresenter.earnAppcListManager.resumeWalletDownload());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleResumeDownload$lambda-28, reason: not valid java name */
    public static final void m40885handleResumeDownload$lambda28(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleResumeDownload$lambda-29, reason: not valid java name */
    public static final void m40886handleResumeDownload$lambda29(EarnAppcListPresenter earnAppcListPresenter, Throwable th) {
        C9801m.m32346f(earnAppcListPresenter, "this$0");
        earnAppcListPresenter.crashReporter.log(th);
    }

    private final void handleWalletInstallClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.appcoins.n0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return EarnAppcListPresenter.m40887handleWalletInstallClick$lambda13((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.viewScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.appcoins.r0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return EarnAppcListPresenter.m40888handleWalletInstallClick$lambda15(this.f9857f, (View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.appcoins.b1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EarnAppcListPresenter.m40890handleWalletInstallClick$lambda16((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.appcoins.j
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EarnAppcListPresenter.m40891handleWalletInstallClick$lambda17(this.f9839f, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleWalletInstallClick$lambda-13, reason: not valid java name */
    public static final Boolean m40887handleWalletInstallClick$lambda13(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleWalletInstallClick$lambda-15, reason: not valid java name */
    public static final C11234e m40888handleWalletInstallClick$lambda15(final EarnAppcListPresenter earnAppcListPresenter, View.LifecycleEvent lifecycleEvent) {
        C9801m.m32346f(earnAppcListPresenter, "this$0");
        return earnAppcListPresenter.view.onWalletInstallClick().m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.appcoins.f0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return EarnAppcListPresenter.m40889handleWalletInstallClick$lambda15$lambda14(this.f9832f, (Void) obj);
            }
        }).m40110s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleWalletInstallClick$lambda-15$lambda-14, reason: not valid java name */
    public static final C11231b m40889handleWalletInstallClick$lambda15$lambda14(EarnAppcListPresenter earnAppcListPresenter, Void r1) {
        C9801m.m32346f(earnAppcListPresenter, "this$0");
        return earnAppcListPresenter.startWalletDownload(earnAppcListPresenter.earnAppcListManager.downloadApp());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleWalletInstallClick$lambda-16, reason: not valid java name */
    public static final void m40890handleWalletInstallClick$lambda16(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleWalletInstallClick$lambda-17, reason: not valid java name */
    public static final void m40891handleWalletInstallClick$lambda17(EarnAppcListPresenter earnAppcListPresenter, Throwable th) {
        C9801m.m32346f(earnAppcListPresenter, "this$0");
        earnAppcListPresenter.crashReporter.log(th);
    }

    private final void loadWalletApp() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.appcoins.p0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return EarnAppcListPresenter.m40895loadWalletApp$lambda7((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.appcoins.c0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return EarnAppcListPresenter.m40896loadWalletApp$lambda8(this.f9821f, (View.LifecycleEvent) obj);
            }
        }).m40057E().m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.appcoins.z
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EarnAppcListPresenter.m40897loadWalletApp$lambda9(this.f9872f, (WalletApp) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.appcoins.m
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return EarnAppcListPresenter.m40892loadWalletApp$lambda10(this.f9846f, (WalletApp) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.appcoins.o0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EarnAppcListPresenter.m40893loadWalletApp$lambda11(obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.appcoins.r
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EarnAppcListPresenter.m40894loadWalletApp$lambda12(this.f9856f, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadWalletApp$lambda-10, reason: not valid java name */
    public static final C11234e m40892loadWalletApp$lambda10(EarnAppcListPresenter earnAppcListPresenter, WalletApp walletApp) {
        C9801m.m32346f(earnAppcListPresenter, "this$0");
        return C11234e.m40045g0(earnAppcListPresenter.observeWalletState(), earnAppcListPresenter.handleOnWalletInstalled(), earnAppcListPresenter.observeWalletDownloadError());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadWalletApp$lambda-11, reason: not valid java name */
    public static final void m40893loadWalletApp$lambda11(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadWalletApp$lambda-12, reason: not valid java name */
    public static final void m40894loadWalletApp$lambda12(EarnAppcListPresenter earnAppcListPresenter, Throwable th) {
        C9801m.m32346f(earnAppcListPresenter, "this$0");
        earnAppcListPresenter.crashReporter.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadWalletApp$lambda-7, reason: not valid java name */
    public static final Boolean m40895loadWalletApp$lambda7(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadWalletApp$lambda-8, reason: not valid java name */
    public static final C11234e m40896loadWalletApp$lambda8(EarnAppcListPresenter earnAppcListPresenter, View.LifecycleEvent lifecycleEvent) {
        C9801m.m32346f(earnAppcListPresenter, "this$0");
        return earnAppcListPresenter.earnAppcListManager.getWalletApp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadWalletApp$lambda-9, reason: not valid java name */
    public static final void m40897loadWalletApp$lambda9(EarnAppcListPresenter earnAppcListPresenter, WalletApp walletApp) {
        C9801m.m32346f(earnAppcListPresenter, "this$0");
        EarnAppcListView earnAppcListView = earnAppcListPresenter.view;
        C9801m.m32345e(walletApp, "walletApp");
        earnAppcListView.setupWallet(walletApp);
    }

    private final C11234e<WalletApp> observeWalletDownloadError() {
        C11234e<WalletApp> c11234eM40110s0 = C11234e.m40033a0(this.view.resumeDownload(), this.view.onWalletInstallClick()).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.appcoins.e0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return EarnAppcListPresenter.m40898observeWalletDownloadError$lambda40(this.f9829f, (Void) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.appcoins.n
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return EarnAppcListPresenter.m40901observeWalletDownloadError$lambda41(this.f9848f, (WalletApp) obj);
            }
        }).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.appcoins.y
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }).m40110s0();
        C9801m.m32345e(c11234eM40110s0, "merge(view.resumeDownloa…kTrace() }\n      .retry()");
        return c11234eM40110s0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observeWalletDownloadError$lambda-40, reason: not valid java name */
    public static final C11234e m40898observeWalletDownloadError$lambda40(final EarnAppcListPresenter earnAppcListPresenter, Void r2) {
        C9801m.m32346f(earnAppcListPresenter, "this$0");
        return earnAppcListPresenter.earnAppcListManager.observeWalletApp().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.appcoins.u0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return EarnAppcListPresenter.m40899observeWalletDownloadError$lambda40$lambda38((WalletApp) obj);
            }
        }).m40095j0(earnAppcListPresenter.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.appcoins.v
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EarnAppcListPresenter.m40900observeWalletDownloadError$lambda40$lambda39(this.f9864f, (WalletApp) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observeWalletDownloadError$lambda-40$lambda-38, reason: not valid java name */
    public static final Boolean m40899observeWalletDownloadError$lambda40$lambda38(WalletApp walletApp) {
        DownloadModel downloadModel = walletApp.getDownloadModel();
        if (downloadModel != null) {
            return Boolean.valueOf(downloadModel.hasError());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observeWalletDownloadError$lambda-40$lambda-39, reason: not valid java name */
    public static final void m40900observeWalletDownloadError$lambda40$lambda39(EarnAppcListPresenter earnAppcListPresenter, WalletApp walletApp) {
        C9801m.m32346f(earnAppcListPresenter, "this$0");
        C9801m.m32346f(walletApp, "walletApp");
        DownloadModel downloadModel = walletApp.getDownloadModel();
        if ((downloadModel != null ? downloadModel.getDownloadState() : null) == DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR) {
            earnAppcListPresenter.earnAppcNavigator.openOutOfSpaceDialog(walletApp.getSize(), walletApp.getPackageName());
        } else {
            earnAppcListPresenter.view.showDownloadError(walletApp);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observeWalletDownloadError$lambda-41, reason: not valid java name */
    public static final C11234e m40901observeWalletDownloadError$lambda41(EarnAppcListPresenter earnAppcListPresenter, WalletApp walletApp) {
        C9801m.m32346f(earnAppcListPresenter, "this$0");
        C9801m.m32345e(walletApp, "walletApp");
        return earnAppcListPresenter.verifyNotEnoughSpaceError(walletApp);
    }

    private final C11234e<WalletApp> observeWalletState() {
        C11234e<WalletApp> c11234eM40117w = this.earnAppcListManager.observeWalletApp().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.appcoins.t0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return EarnAppcListPresenter.m40903observeWalletState$lambda35(this.f9861f, (WalletApp) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.appcoins.z0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EarnAppcListPresenter.m40904observeWalletState$lambda36(this.f9873f, (WalletApp) obj);
            }
        }).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.appcoins.x
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        });
        C9801m.m32345e(c11234eM40117w, "earnAppcListManager.obse… -> e.printStackTrace() }");
        return c11234eM40117w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observeWalletState$lambda-35, reason: not valid java name */
    public static final C11234e m40903observeWalletState$lambda35(EarnAppcListPresenter earnAppcListPresenter, WalletApp walletApp) {
        C9801m.m32346f(earnAppcListPresenter, "this$0");
        C9801m.m32345e(walletApp, "walletApp");
        return earnAppcListPresenter.verifyNotEnoughSpaceError(walletApp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observeWalletState$lambda-36, reason: not valid java name */
    public static final void m40904observeWalletState$lambda36(EarnAppcListPresenter earnAppcListPresenter, WalletApp walletApp) {
        C9801m.m32346f(earnAppcListPresenter, "this$0");
        EarnAppcListView earnAppcListView = earnAppcListPresenter.view;
        C9801m.m32345e(walletApp, "walletApp");
        earnAppcListView.updateState(walletApp);
    }

    private final C11231b startWalletDownload(C11231b c11231b) {
        C11231b c11231bM40083X0 = C11234e.m40049p(new InterfaceCallableC11255d() { // from class: cm.aptoide.pt.home.more.appcoins.o
            @Override // p456rx.p460m.InterfaceCallableC11255d, java.util.concurrent.Callable
            public final Object call() {
                return EarnAppcListPresenter.m40906startWalletDownload$lambda19(this.f9850f);
            }
        }).m40095j0(this.viewScheduler).m40060G(new C31812(c11231b)).m40083X0();
        C9801m.m32345e(c11231bM40083X0, "private fun startWalletD…    }.toCompletable()\n  }");
        return c11231bM40083X0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startWalletDownload$lambda-19, reason: not valid java name */
    public static final C11234e m40906startWalletDownload$lambda19(final EarnAppcListPresenter earnAppcListPresenter) {
        C9801m.m32346f(earnAppcListPresenter, "this$0");
        if (earnAppcListPresenter.earnAppcListManager.shouldShowRootInstallWarningPopup()) {
            earnAppcListPresenter.view.showRootInstallWarningPopup().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.appcoins.c1
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    EarnAppcListPresenter.m40907startWalletDownload$lambda19$lambda18(this.f9822f, (Boolean) obj);
                }
            });
        }
        return C11234e.m40025S(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startWalletDownload$lambda-19$lambda-18, reason: not valid java name */
    public static final void m40907startWalletDownload$lambda19$lambda18(EarnAppcListPresenter earnAppcListPresenter, Boolean bool) {
        C9801m.m32346f(earnAppcListPresenter, "this$0");
        EarnAppcListManager earnAppcListManager = earnAppcListPresenter.earnAppcListManager;
        C9801m.m32345e(bool, "answer");
        earnAppcListManager.allowRootInstall(bool.booleanValue());
    }

    private final C11234e<WalletApp> verifyNotEnoughSpaceError(final WalletApp walletApp) {
        DownloadModel downloadModel = walletApp.getDownloadModel();
        if (downloadModel != null && downloadModel.getDownloadState() == DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR) {
            C11234e.m40025S(walletApp).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.appcoins.k0
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    EarnAppcListPresenter.m40908verifyNotEnoughSpaceError$lambda44$lambda43(this.f9842f, walletApp, (WalletApp) obj);
                }
            });
        }
        C11234e<WalletApp> c11234eM40025S = C11234e.m40025S(walletApp);
        C9801m.m32345e(c11234eM40025S, "just(walletApp)");
        return c11234eM40025S;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: verifyNotEnoughSpaceError$lambda-44$lambda-43, reason: not valid java name */
    public static final void m40908verifyNotEnoughSpaceError$lambda44$lambda43(EarnAppcListPresenter earnAppcListPresenter, WalletApp walletApp, WalletApp walletApp2) {
        C9801m.m32346f(earnAppcListPresenter, "this$0");
        C9801m.m32346f(walletApp, "$walletApp");
        earnAppcListPresenter.earnAppcListAnalytics.sendNotEnoughSpaceErrorEvent(walletApp.getMd5sum());
    }

    @Override // cm.aptoide.p092pt.home.more.base.ListAppsPresenter
    public C11234e<List<RewardApp>> getApps(boolean z) {
        C11234e<List<RewardApp>> freshAppCoinsRewardAppsFromHomeMore = this.rewardAppsRepository.getFreshAppCoinsRewardAppsFromHomeMore("appcoins-ads");
        C9801m.m32345e(freshAppCoinsRewardAppsFromHomeMore, "rewardAppsRepository.get…mHomeMore(\"appcoins-ads\")");
        return freshAppCoinsRewardAppsFromHomeMore;
    }

    @Override // cm.aptoide.p092pt.home.more.base.ListAppsPresenter
    public String getTitle() {
        String title = this.earnAppcListConfiguration.getTitle();
        return title == null ? HttpUrl.FRAGMENT_ENCODE_SET : title;
    }

    @Override // cm.aptoide.p092pt.home.more.base.ListAppsPresenter
    public void handleAppClick(ListAppsClickEvent<RewardApp> appClickEvent) {
        C9801m.m32346f(appClickEvent, "appClickEvent");
        RewardApp rewardApp = (RewardApp) appClickEvent.getApplication();
        this.analyticsManager.logEvent(((RewardApp) appClickEvent.getApplication()).getClickUrl());
        AppNavigator appNavigator = this.appNavigator;
        long appId = rewardApp.getAppId();
        String packageName = rewardApp.getPackageName();
        String tag = this.earnAppcListConfiguration.getTag();
        String downloadUrl = rewardApp.getDownloadUrl();
        RewardApp.Reward reward = rewardApp.getReward();
        appNavigator.navigateWithDownloadUrlAndReward(appId, packageName, tag, downloadUrl, reward != null ? (float) reward.getAppc() : -1.0f);
    }

    @Override // cm.aptoide.p092pt.home.more.base.ListAppsPresenter
    public C11234e<List<RewardApp>> loadMoreApps() {
        C11234e<List<RewardApp>> nextAppCoinsRewardAppsFromHomeMore = this.rewardAppsRepository.getNextAppCoinsRewardAppsFromHomeMore("appcoins-ads");
        C9801m.m32345e(nextAppCoinsRewardAppsFromHomeMore, "rewardAppsRepository.get…mHomeMore(\"appcoins-ads\")");
        return nextAppCoinsRewardAppsFromHomeMore;
    }

    @Override // cm.aptoide.p092pt.home.more.base.ListAppsPresenter, cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        super.present();
        loadWalletApp();
        handleWalletInstallClick();
        handleResumeDownload();
        handlePauseDownload();
        handleCancelDownload();
        handleOutOfSpaceDialogResult();
    }
}
