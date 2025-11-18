package cm.aptoide.p092pt.app.view;

import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.home.ChipManager;
import cm.aptoide.p092pt.home.HomeAnalytics;
import cm.aptoide.p092pt.home.HomeNavigator;
import cm.aptoide.p092pt.home.bundles.HomeBundlesModel;
import cm.aptoide.p092pt.home.bundles.ads.AdClick;
import cm.aptoide.p092pt.home.bundles.ads.AdHomeEvent;
import cm.aptoide.p092pt.home.bundles.ads.AdMapper;
import cm.aptoide.p092pt.home.bundles.ads.SearchAdNavigationResult;
import cm.aptoide.p092pt.home.bundles.base.AppHomeEvent;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.view.BundleEvent;
import cm.aptoide.p092pt.view.app.Application;
import p456rx.AbstractC11243h;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.exceptions.OnErrorNotImplementedException;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class MoreBundlePresenter implements Presenter {
    private final AdMapper adMapper;
    private final BundleEvent bundleEvent;
    private final ChipManager chipManager;
    private final CrashReport crashReporter;
    private final HomeAnalytics homeAnalytics;
    private final HomeNavigator homeNavigator;
    private final MoreBundleManager moreBundleManager;
    private final MoreBundleView view;
    private final AbstractC11243h viewScheduler;

    /* renamed from: cm.aptoide.pt.app.view.MoreBundlePresenter$1 */
    static /* synthetic */ class C15041 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$home$bundles$HomeBundlesModel$Error;

        static {
            int[] iArr = new int[HomeBundlesModel.Error.values().length];
            $SwitchMap$cm$aptoide$pt$home$bundles$HomeBundlesModel$Error = iArr;
            try {
                iArr[HomeBundlesModel.Error.NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$home$bundles$HomeBundlesModel$Error[HomeBundlesModel.Error.GENERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MoreBundlePresenter(MoreBundleView moreBundleView, MoreBundleManager moreBundleManager, AbstractC11243h abstractC11243h, CrashReport crashReport, HomeNavigator homeNavigator, AdMapper adMapper, BundleEvent bundleEvent, HomeAnalytics homeAnalytics, ChipManager chipManager) {
        this.view = moreBundleView;
        this.moreBundleManager = moreBundleManager;
        this.viewScheduler = abstractC11243h;
        this.crashReporter = crashReport;
        this.homeNavigator = homeNavigator;
        this.adMapper = adMapper;
        this.bundleEvent = bundleEvent;
        this.homeAnalytics = homeAnalytics;
        this.chipManager = chipManager;
    }

    private void handleError(HomeBundlesModel.Error error) {
        int i2 = C15041.$SwitchMap$cm$aptoide$pt$home$bundles$HomeBundlesModel$Error[error.ordinal()];
        if (i2 == 1) {
            this.view.showNetworkError();
        } else {
            if (i2 != 2) {
                return;
            }
            this.view.showGenericError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAdClick$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7284a(SearchAdNavigationResult searchAdNavigationResult) {
        this.homeNavigator.navigateToAppView(searchAdNavigationResult.getTag(), searchAdNavigationResult.getSearchAdResult());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAdClick$16, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7285b(View.LifecycleEvent lifecycleEvent) {
        C11234e<R> c11234eM40082X = this.view.adClicked().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.eg
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((AdHomeEvent) obj).getAdClick();
            }
        });
        final AdMapper adMapper = this.adMapper;
        adMapper.getClass();
        return c11234eM40082X.m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.c
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return adMapper.mapAdToSearchAd((AdClick) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.gf
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7801f.m7284a((SearchAdNavigationResult) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleAdClick$17(SearchAdNavigationResult searchAdNavigationResult) {
    }

    static /* synthetic */ void lambda$handleAdClick$18(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAppClick$10, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7286c(AppHomeEvent appHomeEvent) {
        Application app = appHomeEvent.getApp();
        this.homeNavigator.navigateToAppView(app.getAppId(), app.getPackageName(), app.getTag());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAppClick$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7287d(View.LifecycleEvent lifecycleEvent) {
        return this.view.appClicked().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.mf
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7934f.m7288e((AppHomeEvent) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.ee
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7762f.m7286c((AppHomeEvent) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleAppClick$12(AppHomeEvent appHomeEvent) {
    }

    static /* synthetic */ void lambda$handleAppClick$13(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAppClick$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7288e(AppHomeEvent appHomeEvent) {
        ChipManager.Chip currentChip = this.chipManager.getCurrentChip();
        this.homeAnalytics.sendTapOnAppInteractEvent(appHomeEvent.getApp().getRating(), appHomeEvent.getApp().getPackageName(), appHomeEvent.getAppPosition(), appHomeEvent.getBundlePosition(), appHomeEvent.getBundle().getTag(), appHomeEvent.getBundle().getContent().size(), currentChip != null ? currentChip.getName() : null);
        if (currentChip != null) {
            this.homeAnalytics.sendChipTapOnApp(appHomeEvent.getBundle().getTag(), appHomeEvent.getApp().getPackageName(), currentChip.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBottomReached$30, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m7289f(Object obj) {
        return Boolean.valueOf(this.moreBundleManager.hasMore(this.bundleEvent.getTitle()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBottomReached$31, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7290g(Object obj) {
        this.view.showLoadMore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBottomReached$32, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7291h(Object obj) {
        return loadNextBundles();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBottomReached$33, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7292i(HomeBundlesModel homeBundlesModel) {
        this.homeAnalytics.sendLoadMoreInteractEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBottomReached$34, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7293j(View.LifecycleEvent lifecycleEvent) {
        return this.view.reachesBottom().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.re
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8031f.m7289f(obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.ne
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7955f.m7290g(obj);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.fe
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7780f.m7291h(obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.sf
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8058f.m7292i((HomeBundlesModel) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleBottomReached$35(HomeBundlesModel homeBundlesModel) {
    }

    static /* synthetic */ void lambda$handleBottomReached$36(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBundleScrolledRight$25, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7294k(HomeEvent homeEvent) {
        this.homeAnalytics.sendScrollRightInteractEvent(homeEvent.getBundlePosition(), homeEvent.getBundle().getTag(), homeEvent.getBundle().getContent().size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBundleScrolledRight$26, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7295l(View.LifecycleEvent lifecycleEvent) {
        C11234e<HomeEvent> c11234eM40119x = this.view.bundleScrolled().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.hf
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7824f.m7294k((HomeEvent) obj);
            }
        });
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        return c11234eM40119x.m40117w(new C1561d(crashReport)).m40110s0();
    }

    static /* synthetic */ void lambda$handleBundleScrolledRight$27(HomeEvent homeEvent) {
    }

    static /* synthetic */ void lambda$handleBundleScrolledRight$28(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleMoreClick$20, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7296m(HomeEvent homeEvent) {
        ChipManager.Chip currentChip = this.chipManager.getCurrentChip();
        this.homeAnalytics.sendTapOnMoreInteractEvent(homeEvent.getBundlePosition(), homeEvent.getBundle().getTag(), homeEvent.getBundle().getContent().size(), currentChip != null ? currentChip.getName() : null);
        if (currentChip != null) {
            this.homeAnalytics.sendChipTapOnMore(homeEvent.getBundle().getTag(), currentChip.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleMoreClick$21, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7297n(View.LifecycleEvent lifecycleEvent) {
        C11234e<HomeEvent> c11234eM40095j0 = this.view.moreClicked().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.ze
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8205f.m7296m((HomeEvent) obj);
            }
        }).m40095j0(this.viewScheduler);
        final HomeNavigator homeNavigator = this.homeNavigator;
        homeNavigator.getClass();
        return c11234eM40095j0.m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.cg
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                homeNavigator.navigateWithAction((HomeEvent) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleMoreClick$22(HomeEvent homeEvent) {
    }

    static /* synthetic */ void lambda$handleMoreClick$23(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePullToRefresh$39, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7298o(Void r1) {
        this.homeAnalytics.sendPullRefreshInteractEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePullToRefresh$40, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7299p(Void r1) {
        return loadFreshBundles();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePullToRefresh$41, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7300q(View.LifecycleEvent lifecycleEvent) {
        return this.view.refreshes().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.ae
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7680f.m7298o((Void) obj);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.se
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8057f.m7299p((Void) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handlePullToRefresh$42(HomeBundlesModel homeBundlesModel) {
    }

    static /* synthetic */ void lambda$handlePullToRefresh$43(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRetryClick$46, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7301r(Void r1) {
        this.view.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRetryClick$47, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7302s(Void r1) {
        return loadNextBundles();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRetryClick$48, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7303t(View.LifecycleEvent lifecycleEvent) {
        return this.view.retryClicked().m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.ge
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7800f.m7301r((Void) obj);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.me
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7933f.m7302s((Void) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleRetryClick$49(HomeBundlesModel homeBundlesModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadBundles$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7304u(HomeBundlesModel homeBundlesModel) {
        if (homeBundlesModel.hasErrors()) {
            handleError(homeBundlesModel.getError());
        } else {
            if (homeBundlesModel.isLoading()) {
                return;
            }
            this.view.showBundles(homeBundlesModel.getList());
            this.view.hideLoading();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadFreshBundles$44, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7305v(HomeBundlesModel homeBundlesModel) {
        this.view.hideRefresh();
        if (homeBundlesModel.hasErrors()) {
            handleError(homeBundlesModel.getError());
        } else {
            if (homeBundlesModel.isLoading()) {
                return;
            }
            this.view.showBundles(homeBundlesModel.getList());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadNextBundles$37, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7306w(HomeBundlesModel homeBundlesModel) {
        if (homeBundlesModel.hasErrors()) {
            handleError(homeBundlesModel.getError());
        } else if (!homeBundlesModel.isLoading()) {
            this.view.showMoreHomeBundles(homeBundlesModel.getList());
            this.view.hideLoading();
        }
        this.view.hideShowMore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateLoadBundles$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7307x(View.LifecycleEvent lifecycleEvent) {
        this.view.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateLoadBundles$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7308y(View.LifecycleEvent lifecycleEvent) {
        return loadBundles();
    }

    static /* synthetic */ void lambda$onCreateLoadBundles$6(HomeBundlesModel homeBundlesModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateSetupToolbar$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7309z(View.LifecycleEvent lifecycleEvent) {
        this.view.setToolbarInfo(this.bundleEvent.getTitle());
    }

    static /* synthetic */ void lambda$onCreateSetupToolbar$2(View.LifecycleEvent lifecycleEvent) {
    }

    private Single<HomeBundlesModel> loadBundles() {
        return this.moreBundleManager.loadBundle(this.bundleEvent.getTitle(), this.bundleEvent.getAction()).m39924p(this.viewScheduler).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.pe
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7995f.m7304u((HomeBundlesModel) obj);
            }
        });
    }

    private Single<HomeBundlesModel> loadFreshBundles() {
        return this.moreBundleManager.loadFreshBundles(this.bundleEvent.getTitle(), this.bundleEvent.getAction()).m39924p(this.viewScheduler).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.qe
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8014f.m7305v((HomeBundlesModel) obj);
            }
        });
    }

    private Single<HomeBundlesModel> loadNextBundles() {
        return this.moreBundleManager.loadNextBundles(this.bundleEvent.getTitle(), this.bundleEvent.getAction()).m39924p(this.viewScheduler).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.vf
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8120f.m7306w((HomeBundlesModel) obj);
            }
        });
    }

    public void handleAdClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.xe
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.cf
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7721f.m7285b((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.le
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MoreBundlePresenter.lambda$handleAdClick$17((SearchAdNavigationResult) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.de
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MoreBundlePresenter.lambda$handleAdClick$18((Throwable) obj);
                throw null;
            }
        });
    }

    public void handleAppClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.df
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.je
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7874f.m7287d((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.ve
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MoreBundlePresenter.lambda$handleAppClick$12((AppHomeEvent) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.jf
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MoreBundlePresenter.lambda$handleAppClick$13((Throwable) obj);
                throw null;
            }
        });
    }

    public void handleBottomReached() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.rf
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.ff
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7781f.m7293j((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.be
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MoreBundlePresenter.lambda$handleBottomReached$35((HomeBundlesModel) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.ce
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MoreBundlePresenter.lambda$handleBottomReached$36((Throwable) obj);
                throw null;
            }
        });
    }

    public void handleBundleScrolledRight() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.uf
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.ue
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8100f.m7295l((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.he
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MoreBundlePresenter.lambda$handleBundleScrolledRight$27((HomeEvent) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.wf
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MoreBundlePresenter.lambda$handleBundleScrolledRight$28((Throwable) obj);
                throw null;
            }
        });
    }

    public void handleMoreClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.ef
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.af
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7681f.m7297n((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.xf
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MoreBundlePresenter.lambda$handleMoreClick$22((HomeEvent) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.lf
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MoreBundlePresenter.lambda$handleMoreClick$23((Throwable) obj);
                throw null;
            }
        });
    }

    public void handlePullToRefresh() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.if
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.we
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8136f.m7300q((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.qf
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MoreBundlePresenter.lambda$handlePullToRefresh$42((HomeBundlesModel) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.ke
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MoreBundlePresenter.lambda$handlePullToRefresh$43((Throwable) obj);
                throw null;
            }
        });
    }

    public void handleRetryClick() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.bf
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.oe
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7976f.m7303t((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C1664ie c1664ie = new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.ie
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MoreBundlePresenter.lambda$handleRetryClick$49((HomeBundlesModel) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c1664ie, new C1561d(crashReport));
    }

    public void onCreateLoadBundles() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.nf
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.pf
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7996f.m7307x((View.LifecycleEvent) obj);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.ye
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8181f.m7308y((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C1856te c1856te = new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.te
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MoreBundlePresenter.lambda$onCreateLoadBundles$6((HomeBundlesModel) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c1856te, new C1561d(crashReport));
    }

    public void onCreateSetupToolbar() {
        C11234e<View.LifecycleEvent> c11234eM40119x = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.of
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.kf
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7895f.m7309z((View.LifecycleEvent) obj);
            }
        });
        C1857tf c1857tf = new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.tf
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                MoreBundlePresenter.lambda$onCreateSetupToolbar$2((View.LifecycleEvent) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40119x.m40063H0(c1857tf, new C1561d(crashReport));
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        onCreateSetupToolbar();
        onCreateLoadBundles();
        handleAppClick();
        handleAdClick();
        handleMoreClick();
        handleBottomReached();
        handlePullToRefresh();
        handleRetryClick();
        handleBundleScrolledRight();
    }
}
