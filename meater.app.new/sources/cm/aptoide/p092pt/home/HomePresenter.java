package cm.aptoide.p092pt.home;

import android.util.Pair;
import cm.aptoide.p092pt.UserFeedbackAnalytics;
import cm.aptoide.p092pt.ads.data.ApplicationAd;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.home.bundles.HomeBundlesModel;
import cm.aptoide.p092pt.home.bundles.ads.AdClick;
import cm.aptoide.p092pt.home.bundles.ads.AdHomeEvent;
import cm.aptoide.p092pt.home.bundles.ads.AdMapper;
import cm.aptoide.p092pt.home.bundles.ads.SearchAdNavigationResult;
import cm.aptoide.p092pt.home.bundles.apps.RewardApp;
import cm.aptoide.p092pt.home.bundles.base.ActionBundle;
import cm.aptoide.p092pt.home.bundles.base.AppComingSoonPromotionalBundle;
import cm.aptoide.p092pt.home.bundles.base.AppHomeEvent;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;
import cm.aptoide.p092pt.home.bundles.base.PromotionalBundle;
import cm.aptoide.p092pt.home.bundles.editorial.EditorialHomeEvent;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.reactions.ReactionsHomeEvent;
import cm.aptoide.p092pt.reactions.network.ReactionsResponse;
import cm.aptoide.p092pt.view.app.Application;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;
import p456rx.AbstractC11243h;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.exceptions.OnErrorNotImplementedException;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class HomePresenter implements Presenter {
    private final AdMapper adMapper;
    private final CrashReport crashReporter;
    private final Home home;
    private final HomeAnalytics homeAnalytics;
    private final HomeNavigator homeNavigator;
    private final UserFeedbackAnalytics userFeedbackAnalytics;
    private final HomeView view;
    private final AbstractC11243h viewScheduler;

    /* renamed from: cm.aptoide.pt.home.HomePresenter$1 */
    static /* synthetic */ class C28121 {
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

    public HomePresenter(HomeView homeView, Home home, AbstractC11243h abstractC11243h, CrashReport crashReport, HomeNavigator homeNavigator, AdMapper adMapper, HomeAnalytics homeAnalytics, UserFeedbackAnalytics userFeedbackAnalytics) {
        this.view = homeView;
        this.home = home;
        this.viewScheduler = abstractC11243h;
        this.crashReporter = crashReport;
        this.homeNavigator = homeNavigator;
        this.adMapper = adMapper;
        this.homeAnalytics = homeAnalytics;
        this.userFeedbackAnalytics = userFeedbackAnalytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleBundlesResult(HomeBundlesModel homeBundlesModel) {
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

    private void handleCancelNotifyMeAppComingSoonClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.g6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.y9
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10048f.m7934r((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.y5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomeEvent) obj).getBundle() instanceof AppComingSoonPromotionalBundle);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.q9
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return HomePresenter.lambda$handleCancelNotifyMeAppComingSoonClick$153((HomeEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.n5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9921f.m7936s((Pair) obj);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.j6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return HomePresenter.lambda$handleCancelNotifyMeAppComingSoonClick$155((Pair) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.d6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9693f.m7938t((AppComingSoonPromotionalBundle) obj);
            }
        }).m40095j0(C11250a.m40156b()).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.u7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10001f.m7940u((AppComingSoonPromotionalBundle) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.i4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handleCancelNotifyMeAppComingSoonClick$158((AppComingSoonPromotionalBundle) obj);
            }
        }, C3131ia.f9761f);
    }

    private void handleEditorialCardClick() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.m7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.a9
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9345f.m7871A((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C3357t9 c3357t9 = new InterfaceC11253b() { // from class: cm.aptoide.pt.home.t9
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handleEditorialCardClick$99((EditorialHomeEvent) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c3357t9, new C3060d(crashReport));
    }

    private void handleError(HomeBundlesModel.Error error) {
        int i2 = C28121.$SwitchMap$cm$aptoide$pt$home$bundles$HomeBundlesModel$Error[error.ordinal()];
        if (i2 == 1) {
            this.view.showNetworkError();
        } else {
            if (i2 != 2) {
                return;
            }
            this.view.showGenericError();
        }
    }

    private void handleInstallWalletOfferClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.l5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.e8
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9707f.m7875C((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.h5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9742f.m7877D((HomeEvent) obj);
            }
        }).m40082X(C2815a.f9335f).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.s6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomeBundle) obj) instanceof ActionBundle);
            }
        }).m40088b(ActionBundle.class).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.m5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9808f.m7873B((ActionBundle) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.p9
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handleInstallWalletOfferClick$12((ActionBundle) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.a4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handleInstallWalletOfferClick$13((Throwable) obj);
                throw null;
            }
        });
    }

    private void handleLoadMoreError() {
        this.view.showLoadMoreError();
    }

    private void handleLoadMoreErrorRetry() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.v4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.z3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10053f.m7881G((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.e5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9704f.m7882H((HomeEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.b7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9507f.m7883I((HomeEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.u9
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10003f.m7884J((HomeEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.e4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handleLoadMoreErrorRetry$5((List) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.m8
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9811f.m7885K((Throwable) obj);
            }
        });
    }

    private void handlePromotionalClick() {
        C11234e c11234eM40119x = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.z4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.y3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10042f.m7894T((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.a5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((AppHomeEvent) obj).getBundle() instanceof PromotionalBundle);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.v6
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10011f.m7895U((AppHomeEvent) obj);
            }
        });
        HomeView homeView = this.view;
        View.LifecycleEvent lifecycleEvent = View.LifecycleEvent.DESTROY;
        C11234e c11234eM40091f = c11234eM40119x.m40091f(homeView.bindUntilEvent(lifecycleEvent));
        C3130i9 c3130i9 = new InterfaceC11253b() { // from class: cm.aptoide.pt.home.i9
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handlePromotionalClick$45((AppHomeEvent) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c3130i9, new C3060d(crashReport));
        C11234e c11234eM40091f2 = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.h4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.t6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9989f.m7896V((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.q5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                EditorialHomeEvent editorialHomeEvent = (EditorialHomeEvent) obj;
                return Boolean.valueOf((editorialHomeEvent.getBundle() instanceof ActionBundle) && editorialHomeEvent.getBundle().getType().isPromotional());
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.q7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9957f.m7897W((EditorialHomeEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(lifecycleEvent));
        C3309p5 c3309p5 = new InterfaceC11253b() { // from class: cm.aptoide.pt.home.p5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handlePromotionalClick$50((EditorialHomeEvent) obj);
            }
        };
        CrashReport crashReport2 = this.crashReporter;
        crashReport2.getClass();
        c11234eM40091f2.m40063H0(c3309p5, new C3060d(crashReport2));
    }

    private void handleReactionsResponse(ReactionsResponse reactionsResponse, boolean z) {
        if (reactionsResponse.wasSuccess()) {
            if (z) {
                this.homeAnalytics.sendDeleteEvent();
                return;
            } else {
                this.homeAnalytics.sendReactedEvent();
                return;
            }
        }
        if (reactionsResponse.reactionsExceeded()) {
            this.view.showLogInDialog();
        } else if (reactionsResponse.wasNetworkError()) {
            this.view.showNetworkErrorToast();
        } else if (reactionsResponse.wasGeneralError()) {
            this.view.showGenericErrorToast();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleActionBundlesImpression$52, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7902b(View.LifecycleEvent lifecycleEvent) {
        return this.view.visibleBundles();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleActionBundlesImpression$54, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7904c(HomeEvent homeEvent) {
        if (homeEvent.getBundle().getType().equals(HomeBundle.BundleType.INFO_BUNDLE) || homeEvent.getBundle().getType().equals(HomeBundle.BundleType.WALLET_ADS_OFFER) || homeEvent.getBundle().getType().isPromotional()) {
            this.homeAnalytics.sendActionItemImpressionEvent(homeEvent.getBundle().getTag(), homeEvent.getBundlePosition());
            return;
        }
        ActionBundle actionBundle = (ActionBundle) homeEvent.getBundle();
        if (actionBundle.getActionItem() != null) {
            this.homeAnalytics.sendEditorialImpressionEvent(actionBundle.getTag(), homeEvent.getBundlePosition(), actionBundle.getActionItem().getCardId());
            this.homeAnalytics.sendActionItemEditorialImpressionEvent(actionBundle.getTag(), homeEvent.getBundlePosition(), actionBundle.getActionItem().getCardId());
        }
    }

    static /* synthetic */ void lambda$handleActionBundlesImpression$56(ActionBundle actionBundle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleActionBundlesImpression$57, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7906d(Throwable th) {
        this.crashReporter.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAdClick$101, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7908e(AdHomeEvent adHomeEvent) {
        this.homeAnalytics.sendAdClickEvent(adHomeEvent.getAdClick().getAd().getStars().intValue(), adHomeEvent.getAdClick().getAd().getPackageName(), adHomeEvent.getBundlePosition(), adHomeEvent.getBundle().getTag(), adHomeEvent.getType(), ApplicationAd.Network.SERVER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAdClick$103, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7910f(Throwable th) {
        Logger.getInstance().m8279e(getClass().getCanonicalName(), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAdClick$104, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7912g(SearchAdNavigationResult searchAdNavigationResult) {
        this.homeNavigator.navigateToAppView(searchAdNavigationResult.getTag(), searchAdNavigationResult.getSearchAdResult());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAdClick$105, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7914h(View.LifecycleEvent lifecycleEvent) {
        C11234e<R> c11234eM40082X = this.view.adClicked().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.c7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9682f.m7908e((AdHomeEvent) obj);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.c9
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((AdHomeEvent) obj).getAdClick();
            }
        });
        final AdMapper adMapper = this.adMapper;
        adMapper.getClass();
        return c11234eM40082X.m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.c
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return adMapper.mapAdToSearchAd((AdClick) obj);
            }
        }).m40095j0(this.viewScheduler).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.t4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9987f.m7910f((Throwable) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.h6
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9743f.m7912g((SearchAdNavigationResult) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleAdClick$106(SearchAdNavigationResult searchAdNavigationResult) {
    }

    static /* synthetic */ void lambda$handleAdClick$107(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAppClick$91, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7916i(AppHomeEvent appHomeEvent) {
        this.homeAnalytics.sendTapOnAppInteractEvent(appHomeEvent.getApp().getRating(), appHomeEvent.getApp().getPackageName(), appHomeEvent.getAppPosition(), appHomeEvent.getBundlePosition(), appHomeEvent.getBundle().getTag(), appHomeEvent.getBundle().getContent().size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAppClick$92, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7918j(AppHomeEvent appHomeEvent) {
        Application app = appHomeEvent.getApp();
        if (appHomeEvent.getBundle().getType().equals(HomeBundle.BundleType.EDITORS)) {
            this.homeNavigator.navigateWithEditorsPosition(appHomeEvent.getApp().getAppId(), appHomeEvent.getApp().getPackageName(), HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, appHomeEvent.getApp().getTag(), String.valueOf(appHomeEvent.getAppPosition()));
        } else {
            if (!appHomeEvent.getBundle().getType().equals(HomeBundle.BundleType.APPCOINS_ADS)) {
                this.homeNavigator.navigateToAppView(app.getAppId(), app.getPackageName(), app.getTag());
                return;
            }
            RewardApp rewardApp = (RewardApp) app;
            this.homeAnalytics.convertAppcAdClick(rewardApp.getClickUrl());
            this.homeNavigator.navigateWithDownloadUrlAndReward(rewardApp.getAppId(), rewardApp.getPackageName(), rewardApp.getTag(), rewardApp.getDownloadUrl(), (float) rewardApp.getReward().getAppc());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAppClick$93, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7920k(View.LifecycleEvent lifecycleEvent) {
        return this.view.appClicked().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.k4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9782f.m7916i((AppHomeEvent) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.p8
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9946f.m7918j((AppHomeEvent) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleAppClick$94(AppHomeEvent appHomeEvent) {
    }

    static /* synthetic */ void lambda$handleAppClick$95(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBottomReached$119, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m7922l(Object obj) {
        return Boolean.valueOf(this.home.hasMore());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBottomReached$120, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7924m(Object obj) {
        this.view.showLoadMore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBottomReached$121, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7926n(Object obj) {
        return loadNextBundlesAndReactions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBottomReached$122, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7928o(View.LifecycleEvent lifecycleEvent) {
        return this.view.reachesBottom().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.d9
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9696f.m7922l(obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.i6
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9757f.m7924m(obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.w9
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10026f.m7926n(obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleBottomReached$123(List list) {
    }

    static /* synthetic */ void lambda$handleBottomReached$124(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBundleScrolledRight$114, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7930p(HomeEvent homeEvent) {
        this.homeAnalytics.sendScrollRightInteractEvent(homeEvent.getBundlePosition(), homeEvent.getBundle().getTag(), homeEvent.getBundle().getContent().size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBundleScrolledRight$115, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7932q(View.LifecycleEvent lifecycleEvent) {
        C11234e<HomeEvent> c11234eM40119x = this.view.bundleScrolled().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.ba
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9510f.m7930p((HomeEvent) obj);
            }
        });
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        return c11234eM40119x.m40117w(new C3060d(crashReport)).m40110s0();
    }

    static /* synthetic */ void lambda$handleBundleScrolledRight$116(HomeEvent homeEvent) {
    }

    static /* synthetic */ void lambda$handleBundleScrolledRight$117(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCancelNotifyMeAppComingSoonClick$151, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7934r(View.LifecycleEvent lifecycleEvent) {
        return this.view.cancelNotifyMeClicked();
    }

    static /* synthetic */ Pair lambda$handleCancelNotifyMeAppComingSoonClick$153(HomeEvent homeEvent) {
        return new Pair(Integer.valueOf(homeEvent.getBundlePosition()), (AppComingSoonPromotionalBundle) homeEvent.getBundle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCancelNotifyMeAppComingSoonClick$154, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7936s(Pair pair) {
        this.homeAnalytics.sendPromotionalArticleClickEvent(((AppComingSoonPromotionalBundle) pair.second).getType().name(), ((AppComingSoonPromotionalBundle) pair.second).getActionItem().getCardId());
        this.homeAnalytics.sendActionItemTapOnCardInteractEvent(((AppComingSoonPromotionalBundle) pair.second).getTag(), ((Integer) pair.first).intValue(), ((AppComingSoonPromotionalBundle) pair.second).getActionItem().getCardId());
    }

    static /* synthetic */ AppComingSoonPromotionalBundle lambda$handleCancelNotifyMeAppComingSoonClick$155(Pair pair) {
        return (AppComingSoonPromotionalBundle) pair.second;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCancelNotifyMeAppComingSoonClick$156, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7938t(AppComingSoonPromotionalBundle appComingSoonPromotionalBundle) {
        return this.home.cancelAppComingSoonNotification(appComingSoonPromotionalBundle.getActionItem().getPackageName()).m39974b(C11234e.m40025S(appComingSoonPromotionalBundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCancelNotifyMeAppComingSoonClick$157, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7940u(AppComingSoonPromotionalBundle appComingSoonPromotionalBundle) {
        this.view.updateAppComingSoonStatus(appComingSoonPromotionalBundle, false);
    }

    static /* synthetic */ void lambda$handleCancelNotifyMeAppComingSoonClick$158(AppComingSoonPromotionalBundle appComingSoonPromotionalBundle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDismissClick$79, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7942v(View.LifecycleEvent lifecycleEvent) {
        return this.view.dismissBundleClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDismissClick$81, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7944w(HomeEvent homeEvent) {
        this.homeAnalytics.sendActionItemDismissInteractEvent(homeEvent.getBundle().getTag(), homeEvent.getBundlePosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDismissClick$82, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7946x(HomeEvent homeEvent) {
        return this.home.remove((ActionBundle) homeEvent.getBundle()).m39974b(C11234e.m40025S(homeEvent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDismissClick$83, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7948y(HomeEvent homeEvent) {
        this.view.hideBundle(homeEvent.getBundlePosition());
    }

    static /* synthetic */ void lambda$handleDismissClick$84(HomeEvent homeEvent) {
    }

    static /* synthetic */ void lambda$handleDismissClick$85(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleEditorialCardClick$97, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7949z(EditorialHomeEvent editorialHomeEvent) {
        this.homeAnalytics.sendEditorialInteractEvent(editorialHomeEvent.getBundle().getTag(), editorialHomeEvent.getBundlePosition(), editorialHomeEvent.getCardId());
        this.homeAnalytics.sendActionItemTapOnCardInteractEvent(editorialHomeEvent.getBundle().getTag(), editorialHomeEvent.getBundlePosition(), editorialHomeEvent.getCardId());
        this.homeNavigator.navigateToEditorial(editorialHomeEvent.getCardId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleEditorialCardClick$98, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7871A(View.LifecycleEvent lifecycleEvent) {
        return this.view.editorialCardClicked().m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.b9
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9509f.m7949z((EditorialHomeEvent) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleEditorialCardClick$99(EditorialHomeEvent editorialHomeEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallWalletOfferClick$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7873B(ActionBundle actionBundle) {
        this.view.sendDeeplinkToWalletAppView(actionBundle.getActionItem().getUrl());
    }

    static /* synthetic */ void lambda$handleInstallWalletOfferClick$12(ActionBundle actionBundle) {
    }

    static /* synthetic */ void lambda$handleInstallWalletOfferClick$13(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallWalletOfferClick$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7875C(View.LifecycleEvent lifecycleEvent) {
        return this.view.walletOfferCardInstallWalletClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallWalletOfferClick$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7877D(HomeEvent homeEvent) {
        this.homeAnalytics.sendActionItemTapOnCardInteractEvent(homeEvent.getBundle().getTag(), homeEvent.getBundlePosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleKnowMoreClick$59, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7879E(View.LifecycleEvent lifecycleEvent) {
        return this.view.infoBundleKnowMoreClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleKnowMoreClick$60, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7880F(HomeEvent homeEvent) {
        this.homeAnalytics.sendActionItemTapOnCardInteractEvent(homeEvent.getBundle().getTag(), homeEvent.getBundlePosition());
        this.homeNavigator.navigateToAppCoinsInformationView();
    }

    static /* synthetic */ void lambda$handleKnowMoreClick$61(HomeEvent homeEvent) {
    }

    static /* synthetic */ void lambda$handleKnowMoreClick$62(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleLoadMoreErrorRetry$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7881G(View.LifecycleEvent lifecycleEvent) {
        return this.view.onLoadMoreRetryClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleLoadMoreErrorRetry$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7882H(HomeEvent homeEvent) {
        this.view.removeLoadMoreError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleLoadMoreErrorRetry$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7883I(HomeEvent homeEvent) {
        this.view.showLoadMore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleLoadMoreErrorRetry$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7884J(HomeEvent homeEvent) {
        return loadNextBundlesAndReactions();
    }

    static /* synthetic */ void lambda$handleLoadMoreErrorRetry$5(List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleLoadMoreErrorRetry$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7885K(Throwable th) {
        this.crashReporter.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleLongPressedReactionButton$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7886L(View.LifecycleEvent lifecycleEvent) {
        return this.view.reactionButtonLongPress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleLongPressedReactionButton$16, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7887M(EditorialHomeEvent editorialHomeEvent) {
        this.homeAnalytics.sendReactionButtonClickEvent();
        this.view.showReactionsPopup(editorialHomeEvent.getCardId(), editorialHomeEvent.getGroupId(), editorialHomeEvent.getBundlePosition());
    }

    static /* synthetic */ void lambda$handleLongPressedReactionButton$17(EditorialHomeEvent editorialHomeEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleMoreClick$109, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7888N(HomeEvent homeEvent) {
        this.homeAnalytics.sendTapOnMoreInteractEvent(homeEvent.getBundlePosition(), homeEvent.getBundle().getTag(), homeEvent.getBundle().getContent().size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleMoreClick$110, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7889O(View.LifecycleEvent lifecycleEvent) {
        C11234e<HomeEvent> c11234eM40095j0 = this.view.moreClicked().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.j7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9771f.m7888N((HomeEvent) obj);
            }
        }).m40095j0(this.viewScheduler);
        final HomeNavigator homeNavigator = this.homeNavigator;
        homeNavigator.getClass();
        return c11234eM40095j0.m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.fa
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                homeNavigator.navigateWithAction((HomeEvent) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleMoreClick$111(HomeEvent homeEvent) {
    }

    static /* synthetic */ void lambda$handleMoreClick$112(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleNotifyMeAppComingSoonClick$142, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7890P(View.LifecycleEvent lifecycleEvent) {
        return this.view.notifyMeClicked();
    }

    static /* synthetic */ Pair lambda$handleNotifyMeAppComingSoonClick$144(HomeEvent homeEvent) {
        return new Pair(Integer.valueOf(homeEvent.getBundlePosition()), (AppComingSoonPromotionalBundle) homeEvent.getBundle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleNotifyMeAppComingSoonClick$145, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7891Q(Pair pair) {
        this.homeAnalytics.sendPromotionalArticleClickEvent(((AppComingSoonPromotionalBundle) pair.second).getType().name(), ((AppComingSoonPromotionalBundle) pair.second).getActionItem().getCardId());
        this.homeAnalytics.sendActionItemTapOnCardInteractEvent(((AppComingSoonPromotionalBundle) pair.second).getTag(), ((Integer) pair.first).intValue(), ((AppComingSoonPromotionalBundle) pair.second).getActionItem().getCardId());
    }

    static /* synthetic */ AppComingSoonPromotionalBundle lambda$handleNotifyMeAppComingSoonClick$146(Pair pair) {
        return (AppComingSoonPromotionalBundle) pair.second;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleNotifyMeAppComingSoonClick$147, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7892R(AppComingSoonPromotionalBundle appComingSoonPromotionalBundle) {
        return this.home.setupAppComingSoonNotification(appComingSoonPromotionalBundle.getActionItem().getPackageName()).m39974b(C11234e.m40025S(appComingSoonPromotionalBundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleNotifyMeAppComingSoonClick$148, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7893S(AppComingSoonPromotionalBundle appComingSoonPromotionalBundle) {
        this.view.updateAppComingSoonStatus(appComingSoonPromotionalBundle, true);
    }

    static /* synthetic */ void lambda$handleNotifyMeAppComingSoonClick$149(AppComingSoonPromotionalBundle appComingSoonPromotionalBundle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePromotionalClick$42, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7894T(View.LifecycleEvent lifecycleEvent) {
        return this.view.appClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePromotionalClick$44, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7895U(AppHomeEvent appHomeEvent) {
        HomeBundle bundle = appHomeEvent.getBundle();
        this.homeAnalytics.sendPromotionalAppClickEvent(bundle.getType().name(), ((PromotionalBundle) bundle).getApp().getPackageName());
    }

    static /* synthetic */ void lambda$handlePromotionalClick$45(AppHomeEvent appHomeEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePromotionalClick$47, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7896V(View.LifecycleEvent lifecycleEvent) {
        return this.view.editorialCardClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePromotionalClick$49, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7897W(EditorialHomeEvent editorialHomeEvent) {
        HomeBundle bundle = editorialHomeEvent.getBundle();
        this.homeAnalytics.sendPromotionalArticleClickEvent(bundle.getType().name(), ((ActionBundle) bundle).getActionItem().getCardId());
    }

    static /* synthetic */ void lambda$handlePromotionalClick$50(EditorialHomeEvent editorialHomeEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePromotionalImpression$32, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7898X(View.LifecycleEvent lifecycleEvent) {
        return this.view.visibleBundles();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePromotionalImpression$34, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7899Y(HomeEvent homeEvent) {
        HomeBundle bundle = homeEvent.getBundle();
        this.homeAnalytics.sendPromotionalAppImpressionEvent(bundle.getType().name(), ((PromotionalBundle) bundle).getApp().getPackageName());
        this.homeAnalytics.sendPromotionalAppHomeInteractImpressionEvent(bundle.getTag(), homeEvent.getBundlePosition());
    }

    static /* synthetic */ void lambda$handlePromotionalImpression$35(HomeEvent homeEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePromotionalImpression$37, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7900Z(View.LifecycleEvent lifecycleEvent) {
        return this.view.visibleBundles();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePromotionalImpression$39, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7901a0(HomeEvent homeEvent) {
        ActionBundle actionBundle = (ActionBundle) homeEvent.getBundle();
        if (actionBundle.getActionItem() != null) {
            this.homeAnalytics.sendPromotionalArticleImpressionEvent(actionBundle.getType().name(), actionBundle.getActionItem().getCardId());
        }
    }

    static /* synthetic */ void lambda$handlePromotionalImpression$40(HomeEvent homeEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePullToRefresh$127, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7903b0(Void r1) {
        this.homeAnalytics.sendPullRefreshInteractEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePullToRefresh$128, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7905c0(Void r1) {
        return loadFreshBundlesAndReactions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePullToRefresh$129, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7907d0(View.LifecycleEvent lifecycleEvent) {
        return this.view.refreshes().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.j5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9769f.m7903b0((Void) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.k9
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9787f.m7905c0((Void) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handlePullToRefresh$130(List list) {
    }

    static /* synthetic */ void lambda$handlePullToRefresh$131(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleReactionButtonClick$64, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7909e0(View.LifecycleEvent lifecycleEvent) {
        return this.view.reactionsButtonClicked();
    }

    static /* synthetic */ void lambda$handleReactionButtonClick$65(List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleReactionButtonClick$66, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7911f0(Throwable th) {
        this.crashReporter.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRetryClick$134, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7913g0(Void r1) {
        this.view.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRetryClick$135, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7915h0(Void r1) {
        return loadNextBundlesAndReactions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRetryClick$136, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7917i0(View.LifecycleEvent lifecycleEvent) {
        return this.view.retryClicked().m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.g5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9730f.m7913g0((Void) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.v5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10010f.m7915h0((Void) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleRetryClick$137(List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSnackLogInClick$75, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7919j0(View.LifecycleEvent lifecycleEvent) {
        return this.view.snackLogInClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSnackLogInClick$76, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7921k0(Void r1) {
        this.homeNavigator.navigateToLogIn();
    }

    static /* synthetic */ void lambda$handleSnackLogInClick$77(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUserReaction$68, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7923l0(View.LifecycleEvent lifecycleEvent) {
        return this.view.reactionClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUserReaction$69, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7925m0(ReactionsHomeEvent reactionsHomeEvent) {
        this.userFeedbackAnalytics.sendReactionEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUserReaction$70, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7927n0(ReactionsResponse reactionsResponse) {
        handleReactionsResponse(reactionsResponse, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUserReaction$71, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7929o0(ReactionsHomeEvent reactionsHomeEvent, ReactionsResponse reactionsResponse) {
        return loadReactionModel(reactionsHomeEvent.getCardId(), reactionsHomeEvent.getGroupId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUserReaction$72, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7931p0(final ReactionsHomeEvent reactionsHomeEvent) {
        return this.home.setReaction(reactionsHomeEvent.getCardId(), reactionsHomeEvent.getGroupId(), reactionsHomeEvent.getReaction()).m39915A().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.ca
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((ReactionsResponse) obj).differentReaction());
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.o5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9932f.m7927n0((ReactionsResponse) obj);
            }
        }).m40055D(C3119ha.f9747f).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.j8
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9772f.m7929o0(reactionsHomeEvent, (ReactionsResponse) obj);
            }
        });
    }

    static /* synthetic */ void lambda$handleUserReaction$73(List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadFreshBundles$132, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7933q0(HomeBundlesModel homeBundlesModel) {
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
    /* renamed from: lambda$loadFreshBundlesAndReactions$27, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7935r0(ActionBundle actionBundle) {
        return loadReactionModel(actionBundle.getActionItem().getCardId(), actionBundle.getActionItem().getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadHomeAndReactions$23, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7937s0(HomeBundlesModel homeBundlesModel, ActionBundle actionBundle) {
        return loadReactionModel(actionBundle.getActionItem().getCardId(), actionBundle.getActionItem().getType(), homeBundlesModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadHomeAndReactions$24, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7939t0(final HomeBundlesModel homeBundlesModel) {
        return C11234e.m40020N(homeBundlesModel.getList()).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.r9
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomeBundle) obj).getType() == HomeBundle.BundleType.EDITORIAL);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.n9
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomeBundle) obj) instanceof ActionBundle);
            }
        }).m40088b(ActionBundle.class).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.v7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((ActionBundle) obj).getActionItem() != null);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.q6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9955f.m7937s0(homeBundlesModel, (ActionBundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadNextBundles$125, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7941u0(HomeBundlesModel homeBundlesModel) {
        this.homeAnalytics.sendLoadMoreInteractEvent();
        if (homeBundlesModel.hasErrors()) {
            handleLoadMoreError();
        } else if (!homeBundlesModel.isLoading()) {
            this.view.showMoreHomeBundles(homeBundlesModel.getList());
            this.view.hideLoading();
        }
        this.view.hideShowMore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadNextBundlesAndReactions$30, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7943v0(ActionBundle actionBundle) {
        return loadReactionModel(actionBundle.getActionItem().getCardId(), actionBundle.getActionItem().getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadReactionModel$18, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7945w0(List list) {
        this.view.updateEditorialCards();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadReactionModel$19, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7947x0(List list) {
        this.view.updateEditorialCards();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateLoadBundles$87, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7950z0(View.LifecycleEvent lifecycleEvent) {
        this.view.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateLoadBundles$88, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7872A0(View.LifecycleEvent lifecycleEvent) {
        return loadHomeAndReactions();
    }

    static /* synthetic */ void lambda$onCreateLoadBundles$89(List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$singlePressReactionButtonAction$138, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7874B0(ReactionsResponse reactionsResponse) {
        handleReactionsResponse(reactionsResponse, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$singlePressReactionButtonAction$139, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7876C0(EditorialHomeEvent editorialHomeEvent, ReactionsResponse reactionsResponse) {
        return loadReactionModel(editorialHomeEvent.getCardId(), editorialHomeEvent.getGroupId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$singlePressReactionButtonAction$140, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7878D0(final EditorialHomeEvent editorialHomeEvent, Boolean bool) {
        if (!bool.booleanValue()) {
            return this.home.deleteReaction(editorialHomeEvent.getCardId(), editorialHomeEvent.getGroupId()).m39915A().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.e6
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    this.f9705f.m7874B0((ReactionsResponse) obj);
                }
            }).m40055D(C3119ha.f9747f).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.z5
                @Override // p456rx.p460m.InterfaceC11256e
                public final Object call(Object obj) {
                    return this.f10055f.m7876C0(editorialHomeEvent, (ReactionsResponse) obj);
                }
            });
        }
        this.homeAnalytics.sendReactionButtonClickEvent();
        this.view.showReactionsPopup(editorialHomeEvent.getCardId(), editorialHomeEvent.getGroupId(), editorialHomeEvent.getBundlePosition());
        return C11234e.m40025S(Collections.emptyList());
    }

    private C11234e<HomeBundlesModel> loadFreshBundles() {
        return this.home.loadFreshHomeBundles().m40055D(C3155ka.f9788f).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.v9
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10014f.m7933q0((HomeBundlesModel) obj);
            }
        });
    }

    private C11234e<List<HomeBundle>> loadFreshBundlesAndReactions() {
        return loadFreshBundles().m40057E().m40066J(C3143ja.f9775f).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.c4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomeBundle) obj).getType() == HomeBundle.BundleType.EDITORIAL);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.u4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomeBundle) obj) instanceof ActionBundle);
            }
        }).m40088b(ActionBundle.class).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.f9
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9722f.m7935r0((ActionBundle) obj);
            }
        });
    }

    private C11234e<HomeBundlesModel> loadHome() {
        C11234e c11234eM40095j0 = this.home.loadHomeBundles().m40088b(HomeBundlesModel.class).m40095j0(this.viewScheduler);
        final HomeView homeView = this.view;
        homeView.getClass();
        return c11234eM40095j0.m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.ga
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                homeView.showBundlesSkeleton((HomeBundlesModel) obj);
            }
        }).m40055D(C3155ka.f9788f).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.o8
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9935f.handleBundlesResult((HomeBundlesModel) obj);
            }
        });
    }

    private C11234e<List<HomeBundle>> loadHomeAndReactions() {
        return loadHome().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.x3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10031f.m7939t0((HomeBundlesModel) obj);
            }
        });
    }

    private Single<HomeBundlesModel> loadNextBundles() {
        return this.home.loadNextHomeBundles().m40055D(C3155ka.f9788f).m40085Z0().m39924p(this.viewScheduler).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.o7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9934f.m7941u0((HomeBundlesModel) obj);
            }
        });
    }

    private C11234e<List<HomeBundle>> loadNextBundlesAndReactions() {
        return loadNextBundles().m39915A().m40066J(C3143ja.f9775f).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.i7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomeBundle) obj).getType() == HomeBundle.BundleType.EDITORIAL);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.f7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomeBundle) obj) instanceof ActionBundle);
            }
        }).m40088b(ActionBundle.class).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.d7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9694f.m7943v0((ActionBundle) obj);
            }
        });
    }

    private Single<List<HomeBundle>> loadReactionModel(String str, String str2, HomeBundlesModel homeBundlesModel) {
        return this.home.loadReactionModel(str, str2, homeBundlesModel).m39924p(this.viewScheduler).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.b8
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9508f.m7945w0((List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C11234e<List<HomeBundle>> singlePressReactionButtonAction(final EditorialHomeEvent editorialHomeEvent) {
        return this.home.isFirstReaction(editorialHomeEvent.getCardId(), editorialHomeEvent.getGroupId()).m39922k(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.w6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10022f.m7878D0(editorialHomeEvent, (Boolean) obj);
            }
        });
    }

    public void handleActionBundlesImpression() {
        C11234e c11234eM40088b = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.r5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.c8
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9683f.m7902b((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.d5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomeEvent) obj).getBundle() instanceof ActionBundle);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.x7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10035f.m7904c((HomeEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.t5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                HomeEvent homeEvent = (HomeEvent) obj;
                return Boolean.valueOf(homeEvent.getBundle().getType().equals(HomeBundle.BundleType.INFO_BUNDLE) || homeEvent.getBundle().getType().equals(HomeBundle.BundleType.WALLET_ADS_OFFER));
            }
        }).m40082X(C2815a.f9335f).m40088b(ActionBundle.class);
        final Home home = this.home;
        home.getClass();
        c11234eM40088b.m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.b
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return home.actionBundleImpression((ActionBundle) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.o4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handleActionBundlesImpression$56((ActionBundle) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.o9
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9936f.m7906d((Throwable) obj);
            }
        });
    }

    public void handleAdClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.c6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.g8
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9733f.m7914h((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.g4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handleAdClick$106((SearchAdNavigationResult) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.s8
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handleAdClick$107((Throwable) obj);
                throw null;
            }
        });
    }

    public void handleAppClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.h8
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.g7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9732f.m7920k((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.q4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handleAppClick$94((AppHomeEvent) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.d4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handleAppClick$95((Throwable) obj);
                throw null;
            }
        });
    }

    public void handleBottomReached() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.e9
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.q8
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9958f.m7928o((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.l9
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handleBottomReached$123((List) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.p7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handleBottomReached$124((Throwable) obj);
                throw null;
            }
        });
    }

    public void handleBundleScrolledRight() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.m9
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.w4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10020f.m7932q((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.w5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handleBundleScrolledRight$116((HomeEvent) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.z6
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handleBundleScrolledRight$117((Throwable) obj);
                throw null;
            }
        });
    }

    public void handleDismissClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.y6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.m4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9807f.m7942v((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.r6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomeEvent) obj).getBundle() instanceof ActionBundle);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.l4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9795f.m7944w((HomeEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.m6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9809f.m7946x((HomeEvent) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.l7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9798f.m7948y((HomeEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.y8
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handleDismissClick$84((HomeEvent) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.a7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handleDismissClick$85((Throwable) obj);
                throw null;
            }
        });
    }

    public void handleKnowMoreClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.n7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.p6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9944f.m7879E((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.i8
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9759f.m7880F((HomeEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.s9
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handleKnowMoreClick$61((HomeEvent) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.k7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handleKnowMoreClick$62((Throwable) obj);
                throw null;
            }
        });
    }

    public void handleLongPressedReactionButton() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.a8
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.c5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9680f.m7886L((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.r8
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9969f.m7887M((EditorialHomeEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C3401x9 c3401x9 = new InterfaceC11253b() { // from class: cm.aptoide.pt.home.x9
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handleLongPressedReactionButton$17((EditorialHomeEvent) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c3401x9, new C3060d(crashReport));
    }

    public void handleMoreClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.n4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.f6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9719f.m7889O((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.f4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handleMoreClick$111((HomeEvent) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.k5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handleMoreClick$112((Throwable) obj);
                throw null;
            }
        });
    }

    public void handleNotifyMeAppComingSoonClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.h7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.x4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10032f.m7890P((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.z9
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomeEvent) obj).getBundle() instanceof AppComingSoonPromotionalBundle);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.d8
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return HomePresenter.lambda$handleNotifyMeAppComingSoonClick$144((HomeEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.j4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9768f.m7891Q((Pair) obj);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.j9
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return HomePresenter.lambda$handleNotifyMeAppComingSoonClick$146((Pair) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.x6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10034f.m7892R((AppComingSoonPromotionalBundle) obj);
            }
        }).m40095j0(C11250a.m40156b()).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.z8
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10059f.m7893S((AppComingSoonPromotionalBundle) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.f5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handleNotifyMeAppComingSoonClick$149((AppComingSoonPromotionalBundle) obj);
            }
        }, C3131ia.f9761f);
    }

    public void handlePromotionalImpression() {
        C11234e c11234eM40119x = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.a6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.o6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9933f.m7898X((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.k6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                HomeEvent homeEvent = (HomeEvent) obj;
                return Boolean.valueOf((homeEvent.getBundle() instanceof PromotionalBundle) && homeEvent.getBundle().getType().isPromotional());
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.x8
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10036f.m7899Y((HomeEvent) obj);
            }
        });
        HomeView homeView = this.view;
        View.LifecycleEvent lifecycleEvent = View.LifecycleEvent.DESTROY;
        C11234e c11234eM40091f = c11234eM40119x.m40091f(homeView.bindUntilEvent(lifecycleEvent));
        C3407y4 c3407y4 = new InterfaceC11253b() { // from class: cm.aptoide.pt.home.y4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handlePromotionalImpression$35((HomeEvent) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c3407y4, new C3060d(crashReport));
        C11234e c11234eM40091f2 = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.i5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.b4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9504f.m7900Z((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.s7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                HomeEvent homeEvent = (HomeEvent) obj;
                return Boolean.valueOf((homeEvent.getBundle() instanceof ActionBundle) && homeEvent.getBundle().getType().isPromotional());
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.u8
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10002f.m7901a0((HomeEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(lifecycleEvent));
        C3288n6 c3288n6 = new InterfaceC11253b() { // from class: cm.aptoide.pt.home.n6
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handlePromotionalImpression$40((HomeEvent) obj);
            }
        };
        CrashReport crashReport2 = this.crashReporter;
        crashReport2.getClass();
        c11234eM40091f2.m40063H0(c3288n6, new C3060d(crashReport2));
    }

    public void handlePullToRefresh() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.l6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.s5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9977f.m7907d0((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.u6
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handlePullToRefresh$130((List) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.b5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handlePullToRefresh$131((Throwable) obj);
                throw null;
            }
        });
    }

    public void handleReactionButtonClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.h9
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.t8
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9991f.m7909e0((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.viewScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.r4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9965f.singlePressReactionButtonAction((EditorialHomeEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.s4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handleReactionButtonClick$65((List) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.n8
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9924f.m7911f0((Throwable) obj);
            }
        });
    }

    public void handleRetryClick() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.p4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.v8
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10013f.m7917i0((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C3364u5 c3364u5 = new InterfaceC11253b() { // from class: cm.aptoide.pt.home.u5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handleRetryClick$137((List) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c3364u5, new C3060d(crashReport));
    }

    public void handleSnackLogInClick() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.aa
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.y7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10046f.m7919j0((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.w7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10024f.m7921k0((Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C3355t7 c3355t7 = new InterfaceC11253b() { // from class: cm.aptoide.pt.home.t7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handleSnackLogInClick$77((Void) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c3355t7, new C3060d(crashReport));
    }

    public void handleUserReaction() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.b6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.l8
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9799f.m7923l0((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.k8
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9786f.m7925m0((ReactionsHomeEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.g9
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9734f.m7931p0((ReactionsHomeEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C3093f8 c3093f8 = new InterfaceC11253b() { // from class: cm.aptoide.pt.home.f8
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$handleUserReaction$73((List) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c3093f8, new C3060d(crashReport));
    }

    public void onCreateLoadBundles() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.r7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.e7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9706f.m7950z0((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.w8
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10025f.m7872A0((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C3421z7 c3421z7 = new InterfaceC11253b() { // from class: cm.aptoide.pt.home.z7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomePresenter.lambda$onCreateLoadBundles$89((List) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c3421z7, new C3060d(crashReport));
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        onCreateLoadBundles();
        handleAppClick();
        handleAdClick();
        handleMoreClick();
        handleBottomReached();
        handlePullToRefresh();
        handleRetryClick();
        handleBundleScrolledRight();
        handleKnowMoreClick();
        handleDismissClick();
        handleActionBundlesImpression();
        handleEditorialCardClick();
        handleInstallWalletOfferClick();
        handleReactionButtonClick();
        handleLongPressedReactionButton();
        handleUserReaction();
        handleSnackLogInClick();
        handleLoadMoreErrorRetry();
        handlePromotionalImpression();
        handlePromotionalClick();
        handleNotifyMeAppComingSoonClick();
        handleCancelNotifyMeAppComingSoonClick();
    }

    private Single<List<HomeBundle>> loadReactionModel(String str, String str2) {
        return this.home.loadReactionModel(str, str2).m39924p(this.viewScheduler).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.x5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10033f.m7947x0((List) obj);
            }
        });
    }
}
