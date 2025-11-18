package cm.aptoide.p092pt.app.view;

import android.text.TextUtils;
import android.util.Pair;
import android.view.MenuItem;
import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.BuildConfig;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.account.view.AccountNavigator;
import cm.aptoide.p092pt.actions.PermissionManager;
import cm.aptoide.p092pt.actions.PermissionService;
import cm.aptoide.p092pt.ads.data.ApplicationAd;
import cm.aptoide.p092pt.ads.data.AptoideNativeAd;
import cm.aptoide.p092pt.app.AppModel;
import cm.aptoide.p092pt.app.AppViewAnalytics;
import cm.aptoide.p092pt.app.AppViewManager;
import cm.aptoide.p092pt.app.AppViewModel;
import cm.aptoide.p092pt.app.AppViewSimilarApp;
import cm.aptoide.p092pt.app.CampaignAnalytics;
import cm.aptoide.p092pt.app.DownloadModel;
import cm.aptoide.p092pt.app.PromotionViewModel;
import cm.aptoide.p092pt.app.ReviewsViewModel;
import cm.aptoide.p092pt.app.SimilarAppsViewModel;
import cm.aptoide.p092pt.app.view.AppViewFragment;
import cm.aptoide.p092pt.app.view.screenshots.ScreenShotClickEvent;
import cm.aptoide.p092pt.app.view.similar.SimilarAppClickEvent;
import cm.aptoide.p092pt.app.view.similar.SimilarAppsBundle;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.download.InvalidAppException;
import cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceNavigatorWrapper;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.promotions.ClaimDialogResultWrapper;
import cm.aptoide.p092pt.promotions.Promotion;
import cm.aptoide.p092pt.promotions.PromotionsNavigator;
import cm.aptoide.p092pt.promotions.WalletApp;
import cm.aptoide.p092pt.search.model.SearchAdResult;
import cm.aptoide.p092pt.utils.GenericDialogs;
import cm.aptoide.p092pt.view.app.FlagsVote;
import cm.aptoide.p092pt.wallet.WalletAppProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import p456rx.AbstractC11243h;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.exceptions.OnErrorNotImplementedException;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p460m.InterfaceC11257f;
import p456rx.p460m.InterfaceCallableC11255d;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class AppViewPresenter implements Presenter {
    private static final String TAG = "AppViewPresenter";
    private static final long TIME_BETWEEN_SCROLL = 2000;
    private final AptoideAccountManager accountManager;
    private final AccountNavigator accountNavigator;
    private final AppViewAnalytics appViewAnalytics;
    private final AppViewManager appViewManager;
    private final AppViewNavigator appViewNavigator;
    private final CampaignAnalytics campaignAnalytics;
    private final CrashReport crashReport;
    private boolean openTypeAlreadyRegistered = false;
    private final PermissionManager permissionManager;
    private final PermissionService permissionService;
    private final PromotionsNavigator promotionsNavigator;
    private final AppViewView view;
    private final AbstractC11243h viewScheduler;
    private final WalletAppProvider walletAppProvider;

    /* renamed from: cm.aptoide.pt.app.view.AppViewPresenter$1 */
    static /* synthetic */ class C15021 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action;

        static {
            int[] iArr = new int[DownloadModel.Action.values().length];
            $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action = iArr;
            try {
                iArr[DownloadModel.Action.INSTALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.DOWNGRADE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[DownloadModel.Action.MIGRATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public AppViewPresenter(AppViewView appViewView, AccountNavigator accountNavigator, AppViewAnalytics appViewAnalytics, CampaignAnalytics campaignAnalytics, AppViewNavigator appViewNavigator, AppViewManager appViewManager, AptoideAccountManager aptoideAccountManager, AbstractC11243h abstractC11243h, CrashReport crashReport, PermissionManager permissionManager, PermissionService permissionService, PromotionsNavigator promotionsNavigator, WalletAppProvider walletAppProvider) {
        this.view = appViewView;
        this.accountNavigator = accountNavigator;
        this.appViewAnalytics = appViewAnalytics;
        this.campaignAnalytics = campaignAnalytics;
        this.appViewNavigator = appViewNavigator;
        this.appViewManager = appViewManager;
        this.accountManager = aptoideAccountManager;
        this.viewScheduler = abstractC11243h;
        this.crashReport = crashReport;
        this.permissionManager = permissionManager;
        this.permissionService = permissionService;
        this.promotionsNavigator = promotionsNavigator;
        this.walletAppProvider = walletAppProvider;
    }

    private void cancelDownload() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.n4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.j1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7858f.m7191f((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.e9
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$cancelDownload$220((AppModel) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.x2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$cancelDownload$221((Throwable) obj);
            }
        });
    }

    private void cancelPromotionDownload() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.g5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.j5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7863f.m7199h((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.u3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$cancelPromotionDownload$287((WalletApp) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.a8
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$cancelPromotionDownload$288((Throwable) obj);
                throw null;
            }
        });
    }

    private void claimApp() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.ya
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.t9
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8077f.m7211k((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.v5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$claimApp$298((AppModel) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.qc
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$claimApp$299((Throwable) obj);
                throw null;
            }
        });
    }

    private C11231b downgradeApp(final DownloadModel.Action action, final AppModel appModel, final boolean z) {
        return this.view.showDowngradeMessage().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.hb
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Boolean bool = (Boolean) obj;
                AppViewPresenter.lambda$downgradeApp$251(bool);
                return bool;
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.s2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8037f.m7215l((Boolean) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.e6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7751f.m7219m(action, appModel, z, (Boolean) obj);
            }
        }).m40083X0();
    }

    private C11231b downloadApp(final DownloadModel.Action action, final AppModel appModel, final boolean z) {
        return C11234e.m40049p(new InterfaceCallableC11255d() { // from class: cm.aptoide.pt.app.view.o1
            @Override // p456rx.p460m.InterfaceCallableC11255d, java.util.concurrent.Callable
            public final Object call() {
                return this.f7961f.m7226o(action);
            }
        }).m40095j0(this.viewScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.n5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7942f.m7242s(appModel, action, z, (DownloadModel.Action) obj);
            }
        }).m40083X0();
    }

    private C11234e<DownloadModel> downloadInRange(final int i2, final int i3) {
        return this.appViewManager.downloadStarted().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.s7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((DownloadModel) obj).isDownloading());
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.s9
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                DownloadModel downloadModel = (DownloadModel) obj;
                return Boolean.valueOf(downloadModel.getProgress() >= i2 && downloadModel.getProgress() < i3);
            }
        }).m40057E();
    }

    private C11231b downloadWallet(final WalletApp walletApp) {
        return C11234e.m40049p(new InterfaceCallableC11255d() { // from class: cm.aptoide.pt.app.view.k1
            @Override // p456rx.p460m.InterfaceCallableC11255d, java.util.concurrent.Callable
            public final Object call() {
                return this.f7878f.m7250u();
            }
        }).m40095j0(this.viewScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.j3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7860f.m7254v(walletApp, (Boolean) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.ha
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7819f.m7258w((Void) obj);
            }
        }).m40095j0(Schedulers.m40658io()).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.b3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7689f.m7262x(walletApp, (Void) obj);
            }
        }).m40083X0();
    }

    private void handleAdsLogic(SearchAdResult searchAdResult) {
        this.appViewManager.handleAdsLogic(searchAdResult);
        this.view.extractReferrer(searchAdResult);
    }

    private void handleApkfyDialogPositiveClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.e3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.f7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7773f.m7266y((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.a2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7668f.m7270z((String) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.fb
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleApkfyDialogPositiveClick$265((String) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.q1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleApkfyDialogPositiveClick$266((Throwable) obj);
                throw null;
            }
        });
    }

    private void handleClickFlags() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.f6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.wb
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8133f.m7106E((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.r4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8021f.m7110F((FlagsVote.VoteType) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.z3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8191f.m7126K((FlagsVote.VoteType) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.s8
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickFlags$175((Boolean) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.y7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8170f.m7129L((Throwable) obj);
            }
        });
    }

    private void handleClickLoginSnack() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.f5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.m6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7922f.m7132M((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.y3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8166f.m7135N((Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.p2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickLoginSnack$180((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.gb
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7797f.m7138O((Throwable) obj);
            }
        });
    }

    private void handleClickOnAppcIabInfo() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.x5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.t7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8073f.m7141P((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.o2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7963f.m7144Q((Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.d5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnAppcIabInfo$106((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.f2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7768f.m7147R((Throwable) obj);
            }
        });
    }

    private void handleClickOnAppcInfo() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.z7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.r2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8019f.m7149S((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.dd
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7740f.m7152T((Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.d9
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnAppcInfo$96((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.h1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7806f.m7155U((Throwable) obj);
            }
        });
    }

    private void handleClickOnBonusAppcFlair() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.b5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.w8
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8130f.m7164X((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.d8
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7735f.m7158V((Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.mb
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnBonusAppcFlair$101((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.mc
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7928f.m7161W((Throwable) obj);
            }
        });
    }

    private void handleClickOnCatappultCard() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.r6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.ob
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7973f.m7167Y((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.lc
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7910f.m7170Z((Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C1951z5 c1951z5 = new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.z5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnCatappultCard$203((Void) obj);
            }
        };
        CrashReport crashReport = this.crashReport;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c1951z5, new C1561d(crashReport));
    }

    private void handleClickOnDescriptionReadMore() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.z1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.q9
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8009f.m7173a0((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.l9
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7907f.m7176b0((ReadMoreClickEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.nb
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnDescriptionReadMore$84((ReadMoreClickEvent) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.v7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8110f.m7180c0((Throwable) obj);
            }
        });
    }

    private void handleClickOnDeveloperEmail() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.e4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.ma
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7926f.m7184d0((View.LifecycleEvent) obj);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.b4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7691f.m7188e0((Void) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.y2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                AppModel appModel = (AppModel) obj;
                return Boolean.valueOf(!TextUtils.isEmpty(appModel.getDeveloper().getEmail()));
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.b6
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7693f.m7192f0((AppModel) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.c7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnDeveloperEmail$113((AppModel) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.h9
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7818f.m7196g0((Throwable) obj);
            }
        });
    }

    private void handleClickOnDeveloperPermissions() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.b7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.ga
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7796f.m7200h0((View.LifecycleEvent) obj);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.ra
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8027f.m7204i0((Void) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.l3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7900f.m7208j0((AppModel) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.h3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnDeveloperPermissions$126((AppModel) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.i9
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7844f.m7212k0((Throwable) obj);
            }
        });
    }

    private void handleClickOnDeveloperPrivacy() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.s6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.f9
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7775f.m7216l0((View.LifecycleEvent) obj);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.w2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8124f.m7220m0((Void) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.r3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                AppModel appModel = (AppModel) obj;
                return Boolean.valueOf(!TextUtils.isEmpty(appModel.getDeveloper().getPrivacy()));
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.lb
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7909f.m7224n0((AppModel) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.p5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnDeveloperPrivacy$120((AppModel) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.ed
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7761f.m7227o0((Throwable) obj);
            }
        });
    }

    private void handleClickOnDeveloperWebsite() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.j9
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.p3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7983f.m7231p0((View.LifecycleEvent) obj);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.u8
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8094f.m7235q0((Void) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.i1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                AppModel appModel = (AppModel) obj;
                return Boolean.valueOf(!TextUtils.isEmpty(appModel.getDeveloper().getWebsite()));
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.b8
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7695f.m7239r0((AppModel) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.n8
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnDeveloperWebsite$91((AppModel) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.v6
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8109f.m7243s0((Throwable) obj);
            }
        });
    }

    private void handleClickOnFollowStore() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.i4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.u7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8093f.m7247t0((View.LifecycleEvent) obj);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.cc
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7718f.m7251u0((Void) obj);
            }
        }).m40095j0(this.viewScheduler).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.rb
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8028f.m7255v0((AppModel) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.aa
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnFollowStore$138((AppModel) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.f4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnFollowStore$139((Throwable) obj);
                throw null;
            }
        });
    }

    private void handleClickOnOtherVersions() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.p9
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.hc
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7821f.m7259w0((View.LifecycleEvent) obj);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.qa
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8010f.m7263x0((Void) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.g8
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7794f.m7267y0((AppModel) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.a3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnOtherVersions$144((AppModel) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.p4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7984f.m7271z0((Throwable) obj);
            }
        });
    }

    private void handleClickOnRateApp() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.u9
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.cb
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7717f.m7091A0((View.LifecycleEvent) obj);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.r7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8024f.m7095B0((Void) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.x7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8148f.m7099C0((AppModel) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.o8
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7969f.m7103D0((AppModel) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.k2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnRateApp$157((GenericDialogs.EResponse) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.a7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7673f.m7107E0((Throwable) obj);
            }
        });
    }

    private void handleClickOnRetry() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.w9
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.t5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8071f.m7118H0((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.ub
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnRetry$198((AppViewModel) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.g9
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7795f.m7121I0((Throwable) obj);
            }
        });
    }

    private void handleClickOnScreenshot() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.sb
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.k5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7883f.m7124J0((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.x1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                ScreenShotClickEvent screenShotClickEvent = (ScreenShotClickEvent) obj;
                return Boolean.valueOf(!screenShotClickEvent.isVideo());
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.dc
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7739f.m7127K0((ScreenShotClickEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.eb
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnScreenshot$73((ScreenShotClickEvent) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.ea
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7758f.m7130L0((Throwable) obj);
            }
        });
    }

    private void handleClickOnSimilarApps() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.c8
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.q6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8006f.m7133M0((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.viewScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.fa
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7776f.m7136N0((SimilarAppClickEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.pb
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnSimilarApps$185((Boolean) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.qb
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8011f.m7139O0((Throwable) obj);
            }
        });
    }

    private void handleClickOnStoreLayout() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.n1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.q8
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8008f.m7142P0((View.LifecycleEvent) obj);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.xa
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8153f.m7145Q0((Void) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.u4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8090f.m7148R0((AppModel) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.jb
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnStoreLayout$132((AppModel) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.g4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7790f.m7150S0((Throwable) obj);
            }
        });
    }

    private void handleClickOnToolbar() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.s3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.fc
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7778f.m7159V0((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.j8
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnToolbar$192((AppModel) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.c5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7711f.m7162W0((Throwable) obj);
            }
        });
    }

    private void handleClickOnTrustedBadge() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.m1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.e8
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7756f.m7165X0((View.LifecycleEvent) obj);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.q5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8005f.m7168Y0((Void) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.n2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7939f.m7171Z0((AppModel) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.gd
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnTrustedBadge$150((AppModel) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.q2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8002f.m7174a1((Throwable) obj);
            }
        });
    }

    private void handleClickOnVideo() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.hd
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.o3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7964f.m7177b1((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.y4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((ScreenShotClickEvent) obj).isVideo());
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.j4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7862f.m7181c1((ScreenShotClickEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.z4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickOnVideo$79((ScreenShotClickEvent) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.j7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7865f.m7185d1((Throwable) obj);
            }
        });
    }

    private void handleClickReadReviews() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.o7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.ka
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7888f.m7189e1((View.LifecycleEvent) obj);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.c9
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7715f.m7193f1((Void) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.p8
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7988f.m7197g1((AppModel) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.d6
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleClickReadReviews$163((AppModel) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.r1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8018f.m7201h1((Throwable) obj);
            }
        });
    }

    private void handleDismissWalletPromotion() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.w5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.v8
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8111f.m7205i1((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.c3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7709f.m7209j1((Promotion) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.r8
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleDismissWalletPromotion$270((Promotion) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.m2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleDismissWalletPromotion$271((Throwable) obj);
                throw null;
            }
        });
    }

    private void handleDownloadingSimilarApp() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.yb
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.m3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7918f.m7213k1((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.t6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8072f.m7217l1((Serializable) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.l5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7902f.m7221m1((DownloadModel) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.wc
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleDownloadingSimilarApp$49((DownloadModel) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.d3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7729f.m7225n1((Throwable) obj);
            }
        });
    }

    private void handleInstallButtonClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.w4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.bd
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7701f.m7240r1((View.LifecycleEvent) obj);
            }
        }).m40057E().m40095j0(this.viewScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.jc
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7870f.m7092A1((Account) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.a4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleInstallButtonClick$249((DownloadModel.Action) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.s5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleInstallButtonClick$250((Throwable) obj);
                throw null;
            }
        });
    }

    private void handleInstallWalletPromotion() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.y5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.p7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7987f.m7104D1((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.v3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleInstallWalletPromotion$276((Pair) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.ad
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleInstallWalletPromotion$277((Throwable) obj);
                throw null;
            }
        });
    }

    private void handleOnSimilarAppsVisible() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.g1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.ba
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7697f.m7108E1((View.LifecycleEvent) obj);
            }
        }).m40057E().m40095j0(Schedulers.m40658io()).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.rc
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8029f.m7112F1((Boolean) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.z8
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleOnSimilarAppsVisible$62((Boolean) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.j6
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7864f.m7116G1((Throwable) obj);
            }
        });
    }

    private C11234e<Boolean> handleOpenAppViewDialogInput(AppModel appModel) {
        if (!this.openTypeAlreadyRegistered) {
            this.openTypeAlreadyRegistered = true;
            if (appModel.getOpenType() == AppViewFragment.OpenType.OPEN_AND_INSTALL) {
                return C11234e.m40025S(Boolean.TRUE);
            }
            if (appModel.getOpenType() == AppViewFragment.OpenType.OPEN_WITH_INSTALL_POPUP) {
                return this.view.showOpenAndInstallDialog(appModel.getMarketName(), appModel.getAppName()).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.la
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        return Boolean.TRUE;
                    }
                });
            }
            if (appModel.getOpenType() == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP) {
                return this.view.showOpenAndInstallApkFyDialog(appModel.getMarketName(), appModel.getAppName(), appModel.getAppc(), appModel.getRating().getAverage(), appModel.getIcon(), appModel.getPackageDownloads()).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.xc
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj) {
                        return Boolean.TRUE;
                    }
                });
            }
        }
        return C11234e.m40025S(Boolean.FALSE);
    }

    private void handleOutOfSpaceDialogResult() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.k8
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.v9
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8112f.m7119H1((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.pa
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((OutOfSpaceNavigatorWrapper) obj).getClearedSuccessfully());
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.db
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7738f.m7128K1((OutOfSpaceNavigatorWrapper) obj);
            }
        }).m40110s0().m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.g7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleOutOfSpaceDialogResult$6(obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.k7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7885f.m7131L1((Throwable) obj);
            }
        });
    }

    private void handlePromotionClaimResult() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.tb
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.u5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8091f.m7134M1((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.od
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((ClaimDialogResultWrapper) obj).isOk());
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.ta
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8078f.m7137N1((ClaimDialogResultWrapper) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.kc
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handlePromotionClaimResult$303((ClaimDialogResultWrapper) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.n3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handlePromotionClaimResult$304((Throwable) obj);
                throw null;
            }
        });
    }

    private void handleReviewAutoScroll() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.q7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.i8
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7843f.m7140O1((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.g6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7792f.m7143P1((Integer) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.l8
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleReviewAutoScroll$67((Integer) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.s4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8039f.m7146Q1((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cancelDownload$216, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7179c(Void r1) {
        return this.appViewManager.getAppModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cancelDownload$217, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7183d(AppModel appModel) {
        this.appViewAnalytics.sendDownloadCancelEvent(appModel.getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cancelDownload$218, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7187e(AppModel appModel) {
        return this.appViewManager.cancelDownload(appModel.getMd5(), appModel.getPackageName(), appModel.getVersionCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cancelDownload$219, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7191f(View.LifecycleEvent lifecycleEvent) {
        return this.view.cancelDownload().m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.l7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7905f.m7179c((Void) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.zb
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8200f.m7183d((AppModel) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.nc
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7953f.m7187e((AppModel) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$cancelDownload$220(AppModel appModel) {
    }

    static /* synthetic */ void lambda$cancelDownload$221(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cancelPromotionDownload$285, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7195g(WalletApp walletApp) {
        return this.appViewManager.cancelDownload(walletApp.getMd5sum(), walletApp.getPackageName(), walletApp.getVersionCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cancelPromotionDownload$286, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7199h(View.LifecycleEvent lifecycleEvent) {
        return this.view.cancelPromotionDownload().m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.d2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7728f.m7195g((WalletApp) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$cancelPromotionDownload$287(WalletApp walletApp) {
    }

    static /* synthetic */ void lambda$cancelPromotionDownload$288(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$claimApp$295, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7203i(Promotion promotion, AppModel appModel) {
        this.promotionsNavigator.navigateToClaimDialog(appModel.getPackageName(), promotion.getPromotionId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$claimApp$296, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7207j(final Promotion promotion) {
        this.appViewAnalytics.sendClickOnClaimAppViewPromotion(promotion.getPromotionId());
        return this.appViewManager.getAppModel().m39915A().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.y9
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8172f.m7203i(promotion, (AppModel) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$claimApp$297, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7211k(View.LifecycleEvent lifecycleEvent) {
        return this.view.claimAppClick().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.sc
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8049f.m7207j((Promotion) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$claimApp$298(AppModel appModel) {
    }

    static /* synthetic */ void lambda$claimApp$299(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    static /* synthetic */ Boolean lambda$downgradeApp$251(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downgradeApp$252, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7215l(Boolean bool) {
        this.view.showDowngradingMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downgradeApp$253, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7219m(DownloadModel.Action action, AppModel appModel, boolean z, Boolean bool) {
        return downloadApp(action, appModel, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$255, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7223n(Boolean bool) {
        this.appViewManager.allowRootInstall(bool);
    }

    static /* synthetic */ DownloadModel.Action lambda$downloadApp$256(DownloadModel.Action action, Boolean bool) {
        return action;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$257, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7226o(final DownloadModel.Action action) {
        return this.appViewManager.shouldShowRootInstallWarningPopup() ? this.view.showRootInstallWarningPopup().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.na
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7951f.m7223n((Boolean) obj);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.kb
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                DownloadModel.Action action2 = action;
                AppViewPresenter.lambda$downloadApp$256(action2, (Boolean) obj);
                return action2;
            }
        }) : C11234e.m40025S(action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$258, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7230p(AppModel appModel, DownloadModel.Action action, Throwable th) {
        this.appViewAnalytics.sendDownloadAbortEvent(appModel.getPackageName(), appModel.getVersionCode(), action, action != null && action.equals(DownloadModel.Action.MIGRATE), !appModel.getSplits().isEmpty(), appModel.hasAdvertising() || appModel.hasBilling(), appModel.getMalware().getRank().toString(), appModel.getStore().getName(), appModel.getOpenType() == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP, appModel.getObb() != null, appModel.getBdsFlags().contains("STORE_BDS"), appModel.getAppCategory(), appModel.getSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$259, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7234q(final AppModel appModel, final DownloadModel.Action action, Void r4) {
        return this.permissionManager.requestExternalStoragePermission(this.permissionService).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.t8
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8074f.m7230p(appModel, action, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$260, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7238r(DownloadModel.Action action, AppModel appModel, boolean z, Void r11) {
        return this.appViewManager.downloadApp(action, appModel.getAppId(), appModel.getMalware().getRank().name(), appModel.getEditorsChoice(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$261, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7242s(final AppModel appModel, final DownloadModel.Action action, final boolean z, DownloadModel.Action action2) {
        return this.permissionManager.requestDownloadAccessWithWifiBypass(this.permissionService, appModel.getSize()).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.i7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7840f.m7234q(appModel, action, (Void) obj);
            }
        }).m40095j0(Schedulers.m40658io()).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.ic
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7847f.m7238r(action, appModel, z, (Void) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadWallet$305, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7246t(Boolean bool) {
        this.appViewManager.allowRootInstall(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadWallet$306, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7250u() {
        return this.appViewManager.shouldShowRootInstallWarningPopup() ? this.view.showRootInstallWarningPopup().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.a9
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7675f.m7246t((Boolean) obj);
            }
        }) : C11234e.m40025S(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadWallet$307, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7254v(WalletApp walletApp, Boolean bool) {
        return this.permissionManager.requestDownloadAccessWithWifiBypass(this.permissionService, walletApp.getSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadWallet$308, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7258w(Void r2) {
        return this.permissionManager.requestExternalStoragePermission(this.permissionService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadWallet$309, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7262x(WalletApp walletApp, Void r2) {
        return this.appViewManager.downloadApp(walletApp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleApkfyDialogPositiveClick$263, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7266y(View.LifecycleEvent lifecycleEvent) {
        return this.view.apkfyDialogPositiveClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleApkfyDialogPositiveClick$264, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7270z(String str) {
        this.view.showApkfyElement(str);
    }

    static /* synthetic */ void lambda$handleApkfyDialogPositiveClick$265(String str) {
    }

    static /* synthetic */ void lambda$handleApkfyDialogPositiveClick$266(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    static /* synthetic */ Boolean lambda$handleAppViewOpenOptions$18(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAppViewOpenOptions$19, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7090A(AppModel appModel, DownloadModel.Action action, AppViewModel appViewModel, Boolean bool) {
        this.appViewAnalytics.clickOnInstallButton(appModel.getPackageName(), appModel.getDeveloper().getName(), action.toString(), appModel.hasSplits(), appModel.hasBilling(), action.equals(DownloadModel.Action.MIGRATE), appModel.getMalware().getRank().name(), appModel.getOriginTag(), appModel.getStore().getName(), appModel.getOpenType() == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP, appModel.getObb() != null, appModel.getBdsFlags(), appViewModel.getAppModel().getAppCategory(), appModel.getSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAppViewOpenOptions$20, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7094B(Throwable th) {
        if (th instanceof InvalidAppException) {
            this.view.showInvalidAppInfoErrorDialog();
        } else {
            this.view.showGenericErrorDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAppViewOpenOptions$21, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7098C(DownloadModel.Action action, AppModel appModel, Boolean bool) {
        return downloadApp(action, appModel, appModel.getOpenType() == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP).m39981n(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.x9
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8152f.m7094B((Throwable) obj);
            }
        }).m39958A();
    }

    static /* synthetic */ AppViewModel lambda$handleAppViewOpenOptions$22(AppViewModel appViewModel, Boolean bool) {
        return appViewModel;
    }

    private /* synthetic */ AppViewModel lambda$handleAppViewOpenOptions$23(AppViewModel appViewModel, Throwable th) {
        this.crashReport.log(th);
        return appViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickFlags$166, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7106E(View.LifecycleEvent lifecycleEvent) {
        return C11234e.m40037c0(this.view.clickVirusFlag(), this.view.clickLicenseFlag(), this.view.clickWorkingFlag(), this.view.clickFakeFlag());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickFlags$167, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7110F(FlagsVote.VoteType voteType) {
        this.view.disableFlags();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickFlags$168, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7114G(Account account) {
        if (account.isLoggedIn()) {
            return C11234e.m40025S(Boolean.TRUE);
        }
        this.view.enableFlags();
        this.view.displayNotLoggedInSnack();
        return C11234e.m40025S(Boolean.FALSE);
    }

    static /* synthetic */ Boolean lambda$handleClickFlags$169(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickFlags$170, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7117H(Boolean bool) {
        return this.appViewManager.getAppModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickFlags$171, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7120I(FlagsVote.VoteType voteType, AppModel appModel) {
        return this.appViewManager.flagApk(appModel.getStore().getName(), appModel.getMd5(), voteType);
    }

    static /* synthetic */ Boolean lambda$handleClickFlags$172(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickFlags$173, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7123J(FlagsVote.VoteType voteType, Boolean bool) {
        this.view.incrementFlags(voteType);
        this.view.showFlagVoteSubmittedMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickFlags$174, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7126K(final FlagsVote.VoteType voteType) {
        return this.accountManager.accountStatus().m40057E().m40095j0(this.viewScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.x3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8143f.m7114G((Account) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.ja
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Boolean bool = (Boolean) obj;
                AppViewPresenter.lambda$handleClickFlags$169(bool);
                return bool;
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.k6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7884f.m7117H((Boolean) obj);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.bb
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7698f.m7120I(voteType, (AppModel) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.c6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Boolean bool = (Boolean) obj;
                AppViewPresenter.lambda$handleClickFlags$172(bool);
                return bool;
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.sa
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8046f.m7123J(voteType, (Boolean) obj);
            }
        });
    }

    static /* synthetic */ void lambda$handleClickFlags$175(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickFlags$176, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7129L(Throwable th) {
        this.view.enableFlags();
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickLoginSnack$178, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7132M(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickLoginSnack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickLoginSnack$179, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7135N(Void r2) {
        this.accountNavigator.navigateToAccountView(AccountAnalytics.AccountOrigins.APP_VIEW_FLAG);
    }

    static /* synthetic */ void lambda$handleClickLoginSnack$180(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickLoginSnack$181, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7138O(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnAppcIabInfo$104, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7141P(View.LifecycleEvent lifecycleEvent) {
        return this.view.iabInfoClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnAppcIabInfo$105, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7144Q(Void r1) {
        this.appViewNavigator.navigateToAppCoinsInfo();
    }

    static /* synthetic */ void lambda$handleClickOnAppcIabInfo$106(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnAppcIabInfo$107, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7147R(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnAppcInfo$94, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7149S(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickGetAppcInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnAppcInfo$95, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7152T(Void r1) {
        this.appViewAnalytics.sendAppcInfoInteractEvent();
        this.appViewNavigator.navigateToAppCoinsInfo();
    }

    static /* synthetic */ void lambda$handleClickOnAppcInfo$96(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnAppcInfo$97, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7155U(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnBonusAppcFlair$100, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7158V(Void r1) {
        this.appViewAnalytics.sendAppcInfoInteractEvent();
        this.appViewNavigator.navigateToAppCoinsInfo();
    }

    static /* synthetic */ void lambda$handleClickOnBonusAppcFlair$101(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnBonusAppcFlair$102, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7161W(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnBonusAppcFlair$99, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7164X(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickBonusAppcFlair();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnCatappultCard$201, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7167Y(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickCatappultCard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnCatappultCard$202, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7170Z(Void r1) {
        this.appViewNavigator.navigateToCatappultWebsite();
    }

    static /* synthetic */ void lambda$handleClickOnCatappultCard$203(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDescriptionReadMore$82, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7173a0(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickedReadMore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDescriptionReadMore$83, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7176b0(ReadMoreClickEvent readMoreClickEvent) {
        this.appViewAnalytics.sendReadMoreEvent();
        this.appViewNavigator.navigateToDescriptionReadMore(readMoreClickEvent.getStoreName(), readMoreClickEvent.getDescription(), readMoreClickEvent.hasAppc());
    }

    static /* synthetic */ void lambda$handleClickOnDescriptionReadMore$84(ReadMoreClickEvent readMoreClickEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDescriptionReadMore$85, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7180c0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperEmail$109, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7184d0(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickDeveloperEmail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperEmail$110, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7188e0(Void r1) {
        return this.appViewManager.getAppModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperEmail$112, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7192f0(AppModel appModel) {
        this.view.navigateToDeveloperEmail(appModel);
    }

    static /* synthetic */ void lambda$handleClickOnDeveloperEmail$113(AppModel appModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperEmail$114, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7196g0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperPermissions$123, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7200h0(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickDeveloperPermissions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperPermissions$124, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7204i0(Void r1) {
        return this.appViewManager.getAppModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperPermissions$125, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7208j0(AppModel appModel) {
        this.view.navigateToDeveloperPermissions(appModel);
    }

    static /* synthetic */ void lambda$handleClickOnDeveloperPermissions$126(AppModel appModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperPermissions$127, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7212k0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperPrivacy$116, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7216l0(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickDeveloperPrivacy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperPrivacy$117, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7220m0(Void r1) {
        return this.appViewManager.getAppModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperPrivacy$119, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7224n0(AppModel appModel) {
        this.view.navigateToDeveloperPrivacy(appModel);
    }

    static /* synthetic */ void lambda$handleClickOnDeveloperPrivacy$120(AppModel appModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperPrivacy$121, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7227o0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperWebsite$87, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7231p0(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickDeveloperWebsite();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperWebsite$88, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7235q0(Void r1) {
        return this.appViewManager.getAppModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperWebsite$90, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7239r0(AppModel appModel) {
        this.view.navigateToDeveloperWebsite(appModel);
    }

    static /* synthetic */ void lambda$handleClickOnDeveloperWebsite$91(AppModel appModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnDeveloperWebsite$92, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7243s0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnFollowStore$135, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7247t0(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickFollowStore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnFollowStore$136, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7251u0(Void r1) {
        return this.appViewManager.getAppModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnFollowStore$137, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7255v0(AppModel appModel) {
        if (appModel.isStoreFollowed()) {
            this.view.setFollowButton(true);
            this.appViewAnalytics.sendOpenStoreEvent();
            this.appViewNavigator.navigateToStore(appModel.getStore());
            return C11231b.m39946e();
        }
        this.view.setFollowButton(false);
        this.appViewAnalytics.sendFollowStoreEvent();
        this.view.displayStoreFollowedSnack(appModel.getStore().getName());
        return this.appViewManager.subscribeStore(appModel.getStore().getName());
    }

    static /* synthetic */ void lambda$handleClickOnFollowStore$138(AppModel appModel) {
    }

    static /* synthetic */ void lambda$handleClickOnFollowStore$139(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnOtherVersions$141, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7259w0(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickOtherVersions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnOtherVersions$142, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7263x0(Void r1) {
        return this.appViewManager.getAppModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnOtherVersions$143, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7267y0(AppModel appModel) {
        this.appViewAnalytics.sendOtherVersionsEvent();
        this.appViewNavigator.navigateToOtherVersions(appModel.getAppName(), appModel.getIcon(), appModel.getPackageName());
    }

    static /* synthetic */ void lambda$handleClickOnOtherVersions$144(AppModel appModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnOtherVersions$145, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7271z0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnRateApp$153, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7091A0(View.LifecycleEvent lifecycleEvent) {
        return C11234e.m40034b0(this.view.clickRateApp(), this.view.clickRateAppLarge(), this.view.clickRateAppLayout());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnRateApp$154, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7095B0(Void r1) {
        return this.appViewManager.getAppModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnRateApp$155, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7099C0(AppModel appModel) {
        this.appViewAnalytics.sendRateThisAppEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnRateApp$156, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7103D0(AppModel appModel) {
        return this.view.showRateDialog(appModel.getAppName(), appModel.getPackageName(), appModel.getStore().getName());
    }

    static /* synthetic */ void lambda$handleClickOnRateApp$157(GenericDialogs.EResponse eResponse) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnRateApp$158, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7107E0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnRetry$195, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7111F0(Void r1) {
        this.view.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnRetry$196, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7115G0(Void r1) {
        return loadAppView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnRetry$197, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7118H0(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickErrorRetry().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.g2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7787f.m7111F0((Void) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.l4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7901f.m7115G0((Void) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleClickOnRetry$198(AppViewModel appViewModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnRetry$199, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7121I0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnScreenshot$70, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7124J0(View.LifecycleEvent lifecycleEvent) {
        return this.view.getScreenshotClickEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnScreenshot$72, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7127K0(ScreenShotClickEvent screenShotClickEvent) {
        this.appViewAnalytics.sendOpenScreenshotEvent();
        this.appViewNavigator.navigateToScreenshots(screenShotClickEvent.getImagesUris(), screenShotClickEvent.getImagesIndex());
    }

    static /* synthetic */ void lambda$handleClickOnScreenshot$73(ScreenShotClickEvent screenShotClickEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnScreenshot$74, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7130L0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnSimilarApps$183, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7133M0(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickSimilarApp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnSimilarApps$184, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7136N0(SimilarAppClickEvent similarAppClickEvent) {
        String packageName;
        boolean z;
        ApplicationAd.Network network;
        AppViewSimilarApp similar = similarAppClickEvent.getSimilar();
        if (similar.isAd()) {
            z = true;
            network = similar.getAd().getNetwork();
            packageName = similar.getAd().getPackageName();
            if (similar.getAd().getNetwork() == ApplicationAd.Network.SERVER) {
                this.appViewNavigator.navigateToAd((AptoideNativeAd) similar.getAd(), similarAppClickEvent.getType().getDescription());
            }
        } else {
            packageName = similar.getApp().getPackageName();
            this.appViewNavigator.navigateToAppView(similar.getApp().getAppId(), packageName, similarAppClickEvent.getType().getDescription());
            z = false;
            network = null;
        }
        this.appViewAnalytics.sendSimilarAppsInteractEvent(similarAppClickEvent.getType().getDescription());
        this.appViewAnalytics.similarAppClick(similarAppClickEvent.getType(), network, packageName, similarAppClickEvent.getPosition(), z);
        return C11234e.m40025S(Boolean.valueOf(z));
    }

    static /* synthetic */ void lambda$handleClickOnSimilarApps$185(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnSimilarApps$186, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7139O0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnStoreLayout$129, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7142P0(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickStoreLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnStoreLayout$130, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7145Q0(Void r1) {
        return this.appViewManager.getAppModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnStoreLayout$131, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7148R0(AppModel appModel) {
        this.appViewAnalytics.sendStoreOpenEvent(appModel.getStore());
        this.appViewAnalytics.sendOpenStoreEvent();
        this.appViewNavigator.navigateToStore(appModel.getStore());
    }

    static /* synthetic */ void lambda$handleClickOnStoreLayout$132(AppModel appModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnStoreLayout$133, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7150S0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnToolbar$189, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7153T0(MenuItem menuItem, AppModel appModel) {
        switch (menuItem.getItemId()) {
            case C1146R.id.menu_item_share /* 2131296927 */:
                this.view.defaultShare(appModel.getAppName(), appModel.getUniqueName() + ".en.aptoide.com/");
                break;
            case C1146R.id.menu_remote_install /* 2131296928 */:
                this.appViewAnalytics.sendRemoteInstallEvent();
                this.view.showShareOnTvDialog(appModel.getAppId());
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnToolbar$190, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7156U0(final MenuItem menuItem) {
        return this.appViewManager.getAppModel().m39915A().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.ec
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(menuItem != null);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.x6
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8146f.m7153T0(menuItem, (AppModel) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnToolbar$191, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7159V0(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickToolbar().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.o6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7967f.m7156U0((MenuItem) obj);
            }
        });
    }

    static /* synthetic */ void lambda$handleClickOnToolbar$192(AppModel appModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnToolbar$193, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7162W0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnTrustedBadge$147, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7165X0(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickTrustedBadge();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnTrustedBadge$148, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7168Y0(Void r1) {
        return this.appViewManager.getAppModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnTrustedBadge$149, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7171Z0(AppModel appModel) {
        this.appViewAnalytics.sendBadgeClickEvent();
        this.view.showTrustedDialog(appModel);
    }

    static /* synthetic */ void lambda$handleClickOnTrustedBadge$150(AppModel appModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnTrustedBadge$151, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7174a1(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnVideo$76, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7177b1(View.LifecycleEvent lifecycleEvent) {
        return this.view.getScreenshotClickEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnVideo$78, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7181c1(ScreenShotClickEvent screenShotClickEvent) {
        this.appViewAnalytics.sendOpenVideoEvent();
        this.appViewNavigator.navigateToUri(screenShotClickEvent.getUri());
    }

    static /* synthetic */ void lambda$handleClickOnVideo$79(ScreenShotClickEvent screenShotClickEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnVideo$80, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7185d1(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickReadReviews$160, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7189e1(View.LifecycleEvent lifecycleEvent) {
        return C11234e.m40033a0(this.view.clickReviewsLayout(), this.view.clickReadAllReviews());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickReadReviews$161, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7193f1(Void r1) {
        return this.appViewManager.getAppModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickReadReviews$162, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7197g1(AppModel appModel) {
        this.appViewAnalytics.sendReadAllEvent();
        this.appViewNavigator.navigateToRateAndReview(appModel.getAppId(), appModel.getAppName(), appModel.getStore().getName(), appModel.getPackageName(), BuildConfig.APTOIDE_THEME);
    }

    static /* synthetic */ void lambda$handleClickReadReviews$163(AppModel appModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickReadReviews$164, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7201h1(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDismissWalletPromotion$268, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7205i1(View.LifecycleEvent lifecycleEvent) {
        return this.view.dismissWalletPromotionClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDismissWalletPromotion$269, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7209j1(Promotion promotion) {
        this.appViewAnalytics.sendClickOnNoThanksWallet(promotion.getPromotionId());
        this.view.dismissWalletPromotionView();
    }

    static /* synthetic */ void lambda$handleDismissWalletPromotion$270(Promotion promotion) {
    }

    static /* synthetic */ void lambda$handleDismissWalletPromotion$271(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDownloadingSimilarApp$46, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7213k1(View.LifecycleEvent lifecycleEvent) {
        return C11234e.m40033a0(this.view.installAppClick(), this.view.apkfyDialogPositiveClick());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDownloadingSimilarApp$47, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7217l1(Serializable serializable) {
        return downloadInRange(0, 100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDownloadingSimilarApp$48, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7221m1(DownloadModel downloadModel) {
        this.view.showDownloadingSimilarApps(this.appViewManager.getCachedAppcSimilarAppsViewModel().hasSimilarApps() || this.appViewManager.getCachedSimilarAppsViewModel().hasSimilarApps());
    }

    static /* synthetic */ void lambda$handleDownloadingSimilarApp$49(DownloadModel downloadModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDownloadingSimilarApp$50, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7225n1(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFirstLoad$54, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7228o1(View.LifecycleEvent lifecycleEvent) {
        this.view.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFirstLoad$55, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7232p1(View.LifecycleEvent lifecycleEvent) {
        return loadAppView();
    }

    static /* synthetic */ void lambda$handleFirstLoad$56(AppViewModel appViewModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFirstLoad$57, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7236q1(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallButtonClick$239, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7240r1(View.LifecycleEvent lifecycleEvent) {
        return this.accountManager.accountStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallButtonClick$240, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7244s1(AppModel appModel, DownloadModel.Action action) {
        String campaignUrl = appModel.getCampaignUrl();
        if (!campaignUrl.isEmpty()) {
            this.campaignAnalytics.sendCampaignConversionEvent(campaignUrl, appModel.getPackageName(), appModel.getVersionCode());
        }
        this.appViewAnalytics.clickOnInstallButton(appModel.getPackageName(), appModel.getDeveloper().getName(), action.toString(), appModel.hasSplits(), appModel.hasBilling(), false, appModel.getMalware().getRank().name(), appModel.getOriginTag(), appModel.getStore().getName(), appModel.getOpenType() == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP, appModel.getObb() != null, appModel.getBdsFlags(), appModel.getAppCategory(), appModel.getSize());
        if (this.appViewManager.hasClaimablePromotion(Promotion.ClaimAction.INSTALL)) {
            this.appViewAnalytics.sendInstallPromotionApp();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallButtonClick$241, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7248t1(final DownloadModel.Action action, final AppModel appModel) {
        return downloadApp(action, appModel, appModel.getOpenType() == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP).m39973a(this.appViewManager.convertCampaign()).m39986z(this.viewScheduler).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.app.view.h5
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7811f.m7244s1(appModel, action);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallButtonClick$242, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7252u1(AppModel appModel) {
        return openInstalledApp(appModel.getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallButtonClick$243, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7256v1(AppModel appModel, DownloadModel.Action action) {
        this.appViewAnalytics.clickOnInstallButton(appModel.getPackageName(), appModel.getDeveloper().getName(), action.toString(), appModel.hasSplits(), appModel.hasBilling(), false, appModel.getMalware().getRank().name(), appModel.getOriginTag(), appModel.getStore().getName(), appModel.getOpenType() == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP, appModel.getObb() != null, appModel.getBdsFlags(), appModel.getAppCategory(), appModel.getSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallButtonClick$244, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7260w1(final DownloadModel.Action action, final AppModel appModel) {
        return downgradeApp(action, appModel, appModel.getOpenType() == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP).m39973a(this.appViewManager.convertCampaign()).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.app.view.t2
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f8065f.m7256v1(appModel, action);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallButtonClick$245, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7264x1(DownloadModel.Action action, AppModel appModel) {
        DownloadModel.Action action2;
        AppModel appModel2;
        boolean z;
        if (this.appViewManager.hasClaimablePromotion(Promotion.ClaimAction.MIGRATE)) {
            this.appViewAnalytics.sendAppcMigrationUpdateClick();
        }
        AppViewAnalytics appViewAnalytics = this.appViewAnalytics;
        String packageName = appModel.getPackageName();
        String name = appModel.getDeveloper().getName();
        boolean zHasSplits = appModel.hasSplits();
        boolean zHasBilling = appModel.hasBilling();
        String strName = appModel.getMalware().getRank().name();
        String originTag = appModel.getOriginTag();
        String name2 = appModel.getStore().getName();
        AppViewFragment.OpenType openType = appModel.getOpenType();
        AppViewFragment.OpenType openType2 = AppViewFragment.OpenType.APK_FY_INSTALL_POPUP;
        appViewAnalytics.clickOnInstallButton(packageName, name, "UPDATE TO APPC", zHasSplits, zHasBilling, true, strName, originTag, name2, openType == openType2, appModel.getObb() != null, appModel.getBdsFlags(), appModel.getAppCategory(), appModel.getSize());
        if (appModel.getOpenType() == openType2) {
            action2 = action;
            appModel2 = appModel;
            z = true;
        } else {
            action2 = action;
            appModel2 = appModel;
            z = false;
        }
        return migrateApp(action2, appModel2, z).m39973a(this.appViewManager.convertCampaign());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallButtonClick$246, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7268y1(final DownloadModel.Action action) {
        int i2 = C15021.$SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[action.ordinal()];
        return (i2 == 1 || i2 == 2) ? this.appViewManager.getAppModel().m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.g3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7788f.m7248t1(action, (AppModel) obj);
            }
        }) : i2 != 3 ? i2 != 4 ? i2 != 5 ? C11231b.m39951s(new IllegalArgumentException("Invalid type of action")) : this.appViewManager.getAppModel().m39924p(this.viewScheduler).m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.n6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7946f.m7264x1(action, (AppModel) obj);
            }
        }) : this.appViewManager.getAppModel().m39924p(this.viewScheduler).m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.p1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7980f.m7260w1(action, (AppModel) obj);
            }
        }) : this.appViewManager.getAppModel().m39924p(this.viewScheduler).m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.u6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8092f.m7252u1((AppModel) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallButtonClick$247, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7272z1(Throwable th) {
        this.crashReport.log(th);
        if (th instanceof InvalidAppException) {
            this.view.showInvalidAppInfoErrorDialog();
        } else {
            this.view.showGenericErrorDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallButtonClick$248, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7092A1(Account account) {
        return this.view.installAppClick().m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.uc
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8098f.m7268y1((DownloadModel.Action) obj);
            }
        }).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.v2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8105f.m7272z1((Throwable) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleInstallButtonClick$249(DownloadModel.Action action) {
    }

    static /* synthetic */ void lambda$handleInstallButtonClick$250(Throwable th) {
        throw new IllegalStateException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallWalletPromotion$273, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7096B1(Pair pair) {
        this.appViewAnalytics.sendInstallAppcWallet(((Promotion) pair.first).getPromotionId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallWalletPromotion$274, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7100C1(Pair pair) {
        return downloadWallet((WalletApp) pair.second);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallWalletPromotion$275, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7104D1(View.LifecycleEvent lifecycleEvent) {
        return this.view.installWalletButtonClick().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.e5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7750f.m7096B1((Pair) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.y8
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8171f.m7100C1((Pair) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleInstallWalletPromotion$276(Pair pair) {
    }

    static /* synthetic */ void lambda$handleInstallWalletPromotion$277(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOnSimilarAppsVisible$60, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7108E1(View.LifecycleEvent lifecycleEvent) {
        return C11234e.m40033a0(this.view.scrollVisibleSimilarApps().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.wa
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.TRUE;
            }
        }), this.view.similarAppsVisibilityFromInstallClick());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOnSimilarAppsVisible$61, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7112F1(Boolean bool) {
        sendSimilarAppInteractEvent(this.appViewManager.getCachedSimilarAppsViewModel());
        sendSimilarAppcAppsImpressionEvent(this.appViewManager.getCachedAppcSimilarAppsViewModel());
    }

    static /* synthetic */ void lambda$handleOnSimilarAppsVisible$62(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOnSimilarAppsVisible$63, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7116G1(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOutOfSpaceDialogResult$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7119H1(View.LifecycleEvent lifecycleEvent) {
        return this.appViewNavigator.outOfSpaceDialogResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOutOfSpaceDialogResult$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7122I1(PromotionViewModel promotionViewModel) {
        return this.appViewManager.resumeDownload(promotionViewModel.getWalletApp().getMd5sum(), promotionViewModel.getWalletApp().getId(), promotionViewModel.getWalletApp().getDownloadModel().getAction(), promotionViewModel.getWalletApp().getTrustedBadge(), false, true, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOutOfSpaceDialogResult$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7125J1(AppViewModel appViewModel) {
        return this.appViewManager.resumeDownload(appViewModel.getAppModel().getMd5(), appViewModel.getAppModel().getAppId(), appViewModel.getDownloadModel().getAction(), appViewModel.getAppModel().getMalware().getRank().toString(), appViewModel.getAppModel().getOpenType() == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP, appViewModel.getAppModel().getBdsFlags().contains("STORE_BDS"), appViewModel.getAppModel().getAppCategory());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOutOfSpaceDialogResult$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7128K1(OutOfSpaceNavigatorWrapper outOfSpaceNavigatorWrapper) {
        return outOfSpaceNavigatorWrapper.getPackageName().equals(AptoideApplication.APPCOINS_WALLET_PACKAGE_NAME) ? this.appViewManager.loadPromotionViewModel().m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.t3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8068f.m7122I1((PromotionViewModel) obj);
            }
        }) : this.appViewManager.getAppViewModel().m39915A().m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.n7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7948f.m7125J1((AppViewModel) obj);
            }
        });
    }

    static /* synthetic */ void lambda$handleOutOfSpaceDialogResult$6(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOutOfSpaceDialogResult$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7131L1(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePromotionClaimResult$301, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7134M1(View.LifecycleEvent lifecycleEvent) {
        return this.promotionsNavigator.claimDialogResults();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePromotionClaimResult$302, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7137N1(ClaimDialogResultWrapper claimDialogResultWrapper) {
        this.appViewManager.unscheduleNotificationSync();
    }

    static /* synthetic */ void lambda$handlePromotionClaimResult$303(ClaimDialogResultWrapper claimDialogResultWrapper) {
    }

    static /* synthetic */ void lambda$handlePromotionClaimResult$304(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleReviewAutoScroll$65, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7140O1(View.LifecycleEvent lifecycleEvent) {
        return this.view.scrollReviewsResponse();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleReviewAutoScroll$66, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7143P1(Integer num) {
        return scheduleAnimations(num.intValue());
    }

    static /* synthetic */ void lambda$handleReviewAutoScroll$67(Integer num) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleReviewAutoScroll$68, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7146Q1(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadAds$10, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7151S1(AppViewModel appViewModel, Boolean bool) {
        return loadOrganicAds(appViewModel);
    }

    static /* synthetic */ AppViewModel lambda$loadAds$11(AppViewModel appViewModel, SearchAdResult searchAdResult) {
        return appViewModel;
    }

    private /* synthetic */ AppViewModel lambda$loadAds$12(AppViewModel appViewModel, Throwable th) {
        this.crashReport.log(th);
        return appViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadAppView$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7157U1(AppViewModel appViewModel) {
        return C11234e.m40047h0(loadAds(appViewModel), handleAppViewOpenOptions(appViewModel), loadAppcPromotion(appViewModel), observePromotionDownloadErrors(appViewModel), observeDownloadApp(), observeDownloadErrors(), loadOtherAppViewComponents(appViewModel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadAppcPromotion$29, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7160V1(AppModel appModel) {
        return this.appViewManager.loadPromotionViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadAppcPromotion$30, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7163W1(PromotionViewModel promotionViewModel) {
        if (promotionViewModel.getAppViewModel() == null) {
            return;
        }
        DownloadModel downloadModel = promotionViewModel.getAppViewModel().getDownloadModel();
        AppModel appModel = promotionViewModel.getAppViewModel().getAppModel();
        Promotion.ClaimAction claimAction = Promotion.ClaimAction.INSTALL;
        if (downloadModel != null && downloadModel.getAction() == DownloadModel.Action.MIGRATE) {
            claimAction = Promotion.ClaimAction.MIGRATE;
        } else if (promotionViewModel.getAppViewModel().getMigrationModel().isMigrated() && downloadModel != null && downloadModel.getAction() == DownloadModel.Action.OPEN) {
            claimAction = Promotion.ClaimAction.MIGRATE;
        }
        Promotion claimablePromotion = this.appViewManager.getClaimablePromotion(promotionViewModel.getPromotions(), claimAction);
        if (claimablePromotion == null || appModel == null || downloadModel == null) {
            return;
        }
        this.view.showAppcWalletPromotionView(claimablePromotion, promotionViewModel.getWalletApp(), claimAction, downloadModel);
        if (!this.appViewManager.isAppcPromotionImpressionSent()) {
            this.appViewAnalytics.sendPromotionImpression(claimablePromotion.getPromotionId());
            this.appViewManager.setAppcPromotionImpressionSent();
        }
        if (promotionViewModel.getWalletApp().isInstalled() && downloadModel.getAction() == DownloadModel.Action.OPEN) {
            this.appViewManager.scheduleNotification(String.valueOf(claimablePromotion.getAppc()), appModel.getIcon(), appModel.getPackageName(), appModel.getStore().getName());
        }
    }

    static /* synthetic */ AppViewModel lambda$loadAppcPromotion$31(AppViewModel appViewModel, PromotionViewModel promotionViewModel) {
        return appViewModel;
    }

    private /* synthetic */ AppViewModel lambda$loadAppcPromotion$32(AppViewModel appViewModel, Throwable th) {
        th.printStackTrace();
        this.crashReport.log(th);
        return appViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadOrganicAds$13, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7169Y1(SearchAdResult searchAdResult) {
        this.appViewManager.setSearchAdResult(searchAdResult);
        handleAdsLogic(this.appViewManager.getSearchAdResult());
    }

    static /* synthetic */ void lambda$loadOrganicAds$14(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadOrganicAds$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7172Z1(SearchAdResult searchAdResult, SearchAdResult searchAdResult2) {
        handleAdsLogic(searchAdResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadOrganicAds$16, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7175a2(final SearchAdResult searchAdResult) {
        return searchAdResult == null ? this.appViewManager.loadAdsFromAppView().m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.k3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7880f.m7169Y1((SearchAdResult) obj);
            }
        }).m39917e(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.n9
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$loadOrganicAds$14((Throwable) obj);
            }
        }) : Single.m39913m(searchAdResult).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.yc
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8176f.m7172Z1(searchAdResult, (SearchAdResult) obj);
            }
        });
    }

    static /* synthetic */ SearchAdResult lambda$loadOrganicAds$17(Throwable th) {
        return null;
    }

    static /* synthetic */ AppViewModel lambda$loadOtherAppViewComponents$27(AppViewModel appViewModel, C11234e c11234e) {
        return appViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observeDownloadApp$37, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7178b2(AppViewModel appViewModel) {
        this.view.showDownloadAppModel(appViewModel.getDownloadModel(), appViewModel.getAppCoinsViewModel(), appViewModel.getAppModel().hasSplits());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observeDownloadErrors$39, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7182c2(DownloadModel.Action action) {
        return this.appViewManager.observeAppViewModel().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.d7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((AppViewModel) obj).getDownloadModel().hasError());
            }
        }).m40057E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observeDownloadErrors$40, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7186d2(AppViewModel appViewModel) {
        if (appViewModel.getDownloadModel().getDownloadState().equals(DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR)) {
            this.appViewNavigator.navigateToOutOfSpaceDialog(appViewModel.getAppModel().getSize(), appViewModel.getAppModel().getPackageName());
        } else {
            this.view.showDownloadError(appViewModel.getDownloadModel());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observePromotionDownloadErrors$34, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7190e2(Object obj) {
        return this.appViewManager.loadPromotionViewModel().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.w1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj2) {
                PromotionViewModel promotionViewModel = (PromotionViewModel) obj2;
                return Boolean.valueOf(promotionViewModel.getWalletApp().getDownloadModel() != null && promotionViewModel.getWalletApp().getDownloadModel().hasError());
            }
        }).m40057E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observePromotionDownloadErrors$35, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7194f2(PromotionViewModel promotionViewModel) {
        if (promotionViewModel.getWalletApp().getDownloadModel().getDownloadState().equals(DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR)) {
            this.appViewNavigator.navigateToOutOfSpaceDialog(promotionViewModel.getWalletApp().getSize(), promotionViewModel.getWalletApp().getPackageName());
        } else {
            this.view.showDownloadError(promotionViewModel.getWalletApp().getDownloadModel());
        }
    }

    static /* synthetic */ AppViewModel lambda$observePromotionDownloadErrors$36(AppViewModel appViewModel, PromotionViewModel promotionViewModel) {
        return appViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$openInstalledApp$254, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7198g2(String str) {
        this.view.openApp(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$pauseDownload$232, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7202h2(Void r1) {
        return this.appViewManager.getAppModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$pauseDownload$233, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7206i2(AppModel appModel) {
        this.appViewAnalytics.sendDownloadPauseEvent(appModel.getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$pauseDownload$234, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7210j2(AppModel appModel) {
        return this.appViewManager.pauseDownload(appModel.getMd5());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$pauseDownload$235, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7214k2(View.LifecycleEvent lifecycleEvent) {
        return this.view.pauseDownload().m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.vb
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8115f.m7202h2((Void) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.i5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7838f.m7206i2((AppModel) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.da
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7737f.m7210j2((AppModel) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$pauseDownload$236(AppModel appModel) {
    }

    static /* synthetic */ void lambda$pauseDownload$237(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$pauseWalletDownload$290, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7218l2(WalletApp walletApp) {
        return this.appViewManager.pauseDownload(walletApp.getMd5sum());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$pauseWalletDownload$291, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7222m2(View.LifecycleEvent lifecycleEvent) {
        return this.view.pausePromotionDownload().m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.b2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7688f.m7218l2((WalletApp) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$pauseWalletDownload$292(WalletApp walletApp) {
    }

    static /* synthetic */ void lambda$pauseWalletDownload$293(Throwable th) {
        throw new IllegalStateException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$223, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7229o2(AppViewModel appViewModel, DownloadModel.Action action, Throwable th) {
        AppModel appModel = appViewModel.getAppModel();
        this.appViewAnalytics.sendDownloadAbortEvent(appModel.getPackageName(), appModel.getVersionCode(), action, action != null && action.equals(DownloadModel.Action.MIGRATE), !appModel.getSplits().isEmpty(), appModel.hasAdvertising() || appModel.hasBilling(), appModel.getMalware().getRank().toString(), appModel.getStore().getName(), appModel.getOpenType() == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP, appModel.getObb() != null, appModel.getBdsFlags().contains("STORE_BDS"), appModel.getAppCategory(), appModel.getSize());
    }

    static /* synthetic */ AppViewModel lambda$resumeDownload$224(AppViewModel appViewModel, Void r1) {
        return appViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$225, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7233p2(final DownloadModel.Action action, final AppViewModel appViewModel) {
        return this.permissionManager.requestExternalStoragePermission(this.permissionService).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.i2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7833f.m7229o2(appViewModel, action, (Throwable) obj);
            }
        }).m40085Z0().m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.r5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                AppViewModel appViewModel2 = appViewModel;
                AppViewPresenter.lambda$resumeDownload$224(appViewModel2, (Void) obj);
                return appViewModel2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$226, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7237q2(final DownloadModel.Action action) {
        return this.appViewManager.getAppViewModel().m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.d4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7730f.m7233p2(action, (AppViewModel) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$227, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7241r2(AppViewModel appViewModel) {
        return this.appViewManager.resumeDownload(appViewModel.getAppModel().getMd5(), appViewModel.getAppModel().getAppId(), appViewModel.getDownloadModel().getAction(), appViewModel.getAppModel().getMalware().getRank().toString(), appViewModel.getAppModel().getOpenType() == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP, appViewModel.getAppModel().getBdsFlags().contains("STORE_BDS"), appViewModel.getAppModel().getAppCategory()).m39961E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$228, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7245s2(View.LifecycleEvent lifecycleEvent) {
        return this.view.resumeDownload().m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.m9
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7925f.m7237q2((DownloadModel.Action) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.b9
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7696f.m7241r2((AppViewModel) obj);
            }
        });
    }

    static /* synthetic */ void lambda$resumeDownload$229(AppViewModel appViewModel) {
    }

    static /* synthetic */ void lambda$resumeDownload$230(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeWalletDownload$279, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7249t2(WalletApp walletApp, Void r11) {
        return this.appViewManager.resumeDownload(walletApp.getMd5sum(), walletApp.getId(), walletApp.getDownloadModel().getAction(), walletApp.getTrustedBadge(), false, true, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeWalletDownload$280, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7253u2(final WalletApp walletApp) {
        return this.permissionManager.requestExternalStoragePermission(this.permissionService).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.vc
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8116f.m7249t2(walletApp, (Void) obj);
            }
        }).m40110s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeWalletDownload$281, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7257v2(View.LifecycleEvent lifecycleEvent) {
        return this.view.resumePromotionDownload().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.v4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8107f.m7253u2((WalletApp) obj);
            }
        });
    }

    static /* synthetic */ void lambda$resumeWalletDownload$282(Void r0) {
    }

    static /* synthetic */ void lambda$resumeWalletDownload$283(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$scheduleAnimations$204, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7261w2(Integer num) {
        this.view.scrollReviews(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$scheduleAnimations$205, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7265x2(Integer num) {
        return C11234e.m40025S(num).m40106q(TIME_BETWEEN_SCROLL, TimeUnit.MILLISECONDS).m40095j0(C11250a.m40156b()).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.l2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7899f.m7261w2((Integer) obj);
            }
        });
    }

    static /* synthetic */ List lambda$sortSuggestedApps$210(List list, AppModel appModel, List list2) {
        if (list.size() >= 2) {
            if (appModel.isAppCoinApp()) {
                if (((SimilarAppsBundle) list.get(0)).getType() == SimilarAppsBundle.BundleType.APPS) {
                    Collections.swap(list, 0, 1);
                }
            } else if (((SimilarAppsBundle) list.get(0)).getType() == SimilarAppsBundle.BundleType.APPC_APPS) {
                Collections.swap(list, 0, 1);
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateReviews$213, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7269y2(Throwable th) {
        this.view.hideReviews();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateReviews$214, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7273z2(AppModel appModel, ReviewsViewModel reviewsViewModel) {
        if (reviewsViewModel.hasError()) {
            this.view.hideReviews();
        } else {
            this.view.populateReviews(reviewsViewModel, appModel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateSimilarAppsBundles$209, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7105D2(List list) {
        this.view.populateSimilar(list);
    }

    static /* synthetic */ List lambda$updateSuggestedAppcApps$211(List list, SimilarAppsViewModel similarAppsViewModel) {
        if (similarAppsViewModel.hasSimilarApps()) {
            list.add(new SimilarAppsBundle(similarAppsViewModel, SimilarAppsBundle.BundleType.APPC_APPS));
        }
        return list;
    }

    static /* synthetic */ List lambda$updateSuggestedApps$212(List list, SimilarAppsViewModel similarAppsViewModel) {
        if (similarAppsViewModel.hasSimilarApps()) {
            list.add(new SimilarAppsBundle(similarAppsViewModel, SimilarAppsBundle.BundleType.APPS));
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$verifyNotEnoughSpaceError$41, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7109E2(AppModel appModel) {
        this.appViewAnalytics.sendNotEnoughSpaceErrorEvent(appModel.getMd5());
    }

    static /* synthetic */ AppViewModel lambda$verifyNotEnoughSpaceError$42(AppViewModel appViewModel, Object obj) {
        return appViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$verifyNotEnoughSpaceError$43, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7113F2(WalletApp walletApp) {
        this.appViewAnalytics.sendNotEnoughSpaceErrorEvent(walletApp.getMd5sum());
    }

    static /* synthetic */ PromotionViewModel lambda$verifyNotEnoughSpaceError$44(PromotionViewModel promotionViewModel, Object obj) {
        return promotionViewModel;
    }

    private C11234e<AppViewModel> loadAppView() {
        return this.appViewManager.getAppViewModel().m39924p(this.viewScheduler).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.e7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7755f.showAppView((AppViewModel) obj);
            }
        }).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.r9
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8026f.sendAppViewLoadAnalytics((AppViewModel) obj);
            }
        }).m39915A().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.a5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                AppViewModel appViewModel = (AppViewModel) obj;
                return Boolean.valueOf(!appViewModel.getAppModel().hasError());
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.w7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8129f.m7157U1((AppViewModel) obj);
            }
        });
    }

    private C11234e<SearchAdResult> loadOrganicAds(AppViewModel appViewModel) {
        return Single.m39913m(appViewModel.getAppModel().getMinimalAd()).m39924p(Schedulers.m40658io()).m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.m8
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7924f.m7175a2((SearchAdResult) obj);
            }
        }).m39926r(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.w6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                AppViewPresenter.lambda$loadOrganicAds$17((Throwable) obj);
                return null;
            }
        }).m39915A().m40095j0(this.viewScheduler);
    }

    private C11231b migrateApp(DownloadModel.Action action, AppModel appModel, boolean z) {
        return downloadApp(action, appModel, false);
    }

    private C11234e<AppViewModel> observeDownloadErrors() {
        return C11234e.m40033a0(this.view.installAppClick(), this.view.resumeDownload()).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.z9
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8198f.m7182c2((DownloadModel.Action) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.y6
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8169f.m7186d2((AppViewModel) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.ib
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7846f.verifyNotEnoughSpaceError((AppViewModel) obj);
            }
        }).m40110s0();
    }

    private C11231b openInstalledApp(final String str) {
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.app.view.z6
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f8194f.m7198g2(str);
            }
        });
    }

    private void pauseDownload() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.ca
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.cd
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7719f.m7214k2((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.m4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$pauseDownload$236((AppModel) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.h7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$pauseDownload$237((Throwable) obj);
            }
        });
    }

    private void pauseWalletDownload() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.u1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.x4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8144f.m7222m2((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.v1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$pauseWalletDownload$292((WalletApp) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.xb
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$pauseWalletDownload$293((Throwable) obj);
                throw null;
            }
        });
    }

    private void resumeDownload() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.oc
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.gc
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7798f.m7245s2((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.f3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$resumeDownload$229((AppViewModel) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.c4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$resumeDownload$230((Throwable) obj);
            }
        });
    }

    private void resumeWalletDownload() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.o5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.i3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7836f.m7257v2((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.ua
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$resumeWalletDownload$282((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.o4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$resumeWalletDownload$283((Throwable) obj);
            }
        });
    }

    private C11234e<Integer> scheduleAnimations(int i2) {
        if (i2 > 1) {
            return C11234e.m40050r0(0, i2).m40092i(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.c2
                @Override // p456rx.p460m.InterfaceC11256e
                public final Object call(Object obj) {
                    return this.f7708f.m7265x2((Integer) obj);
                }
            });
        }
        Logger.getInstance().m8285w(TAG, "Not enough top reviews to do paging animation.");
        return C11234e.m40016B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAppViewLoadAnalytics(AppViewModel appViewModel) {
        AppModel appModel = appViewModel.getAppModel();
        if (appModel.isFromEditorsChoice()) {
            this.appViewManager.sendEditorsAppOpenAnalytics(appModel.getPackageName(), appModel.getDeveloper().getName(), appModel.getMalware().getRank().name(), appModel.hasBilling(), appModel.hasAdvertising(), appModel.getEditorsChoice());
        } else {
            this.appViewManager.sendAppOpenAnalytics(appModel.getPackageName(), appModel.getDeveloper().getName(), appModel.getMalware().getRank().name(), appModel.hasBilling(), appModel.hasAdvertising());
        }
        if (!appViewModel.getDownloadModel().getAction().equals(DownloadModel.Action.MIGRATE) || this.appViewManager.isMigrationImpressionSent()) {
            return;
        }
        this.appViewManager.setMigrationImpressionSent();
        this.appViewAnalytics.sendAppcMigrationAppOpen();
    }

    private void sendSimilarAppInteractEvent(SimilarAppsViewModel similarAppsViewModel) {
        sendSimilarAppsAdImpressionEvent(similarAppsViewModel);
        this.appViewAnalytics.similarAppBundleImpression(null, false);
    }

    private void sendSimilarAppcAppsImpressionEvent(SimilarAppsViewModel similarAppsViewModel) {
        if (similarAppsViewModel != null) {
            this.appViewAnalytics.similarAppcAppBundleImpression();
        }
    }

    private void sendSimilarAppsAdImpressionEvent(SimilarAppsViewModel similarAppsViewModel) {
        if (similarAppsViewModel == null || !similarAppsViewModel.hasAd() || similarAppsViewModel.hasRecordedAdImpression()) {
            return;
        }
        similarAppsViewModel.setHasRecordedAdImpression(true);
        this.appViewAnalytics.similarAppBundleImpression(similarAppsViewModel.getAd().getNetwork(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showAppView(AppViewModel appViewModel) {
        if (appViewModel.getAppModel().hasError()) {
            this.view.handleError(appViewModel.getAppModel().getError());
            return;
        }
        this.view.setInstallButton(appViewModel.getAppCoinsViewModel());
        this.view.showAppView(appViewModel.getAppModel());
        this.view.showDownloadAppModel(appViewModel.getDownloadModel(), appViewModel.getAppCoinsViewModel(), appViewModel.getAppModel().hasSplits());
        if (appViewModel.getAppCoinsViewModel().hasAdvertising() || appViewModel.getAppCoinsViewModel().hasBilling()) {
            this.view.setupAppcAppView(appViewModel.getAppCoinsViewModel().hasBilling(), appViewModel.getAppCoinsViewModel().getBonusAppcModel());
        }
        this.view.recoverScrollViewState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sortSuggestedApps, reason: merged with bridge method [inline-methods] */
    public C11234e<List<SimilarAppsBundle>> m7101C2(final AppModel appModel, final List<SimilarAppsBundle> list) {
        return C11234e.m40025S(list).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.s1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list2 = list;
                AppViewPresenter.lambda$sortSuggestedApps$210(list2, appModel, (List) obj);
                return list2;
            }
        });
    }

    private C11234e<ReviewsViewModel> updateReviews(final AppModel appModel) {
        return this.appViewManager.loadReviewsViewModel(appModel.getStore().getName(), appModel.getPackageName(), this.view.getLanguageFilter()).m39924p(this.viewScheduler).m39917e(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.k9
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7887f.m7269y2((Throwable) obj);
            }
        }).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.t4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8069f.m7273z2(appModel, (ReviewsViewModel) obj);
            }
        }).m39915A();
    }

    private C11234e<List<SimilarAppsBundle>> updateSimilarAppsBundles(final AppModel appModel) {
        return C11234e.m40025S(new ArrayList()).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.h4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7809f.m7093A2(appModel, (ArrayList) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.k4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7881f.m7097B2(appModel, (List) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.o9
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7970f.m7101C2(appModel, (List) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.tc
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8080f.m7105D2((List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateSuggestedAppcApps, reason: merged with bridge method [inline-methods] */
    public C11234e<List<SimilarAppsBundle>> m7093A2(AppModel appModel, final List<SimilarAppsBundle> list) {
        return this.appViewManager.loadAppcSimilarAppsViewModel(appModel.getPackageName()).m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.zc
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list2 = list;
                AppViewPresenter.lambda$updateSuggestedAppcApps$211(list2, (SimilarAppsViewModel) obj);
                return list2;
            }
        }).m39915A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateSuggestedApps, reason: merged with bridge method [inline-methods] */
    public C11234e<List<SimilarAppsBundle>> m7097B2(AppModel appModel, final List<SimilarAppsBundle> list) {
        return this.appViewManager.loadSimilarAppsViewModel(appModel.getPackageName(), appModel.getMedia().getKeywords()).m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.j2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list2 = list;
                AppViewPresenter.lambda$updateSuggestedApps$212(list2, (SimilarAppsViewModel) obj);
                return list2;
            }
        }).m39915A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C11234e<AppViewModel> verifyNotEnoughSpaceError(final AppViewModel appViewModel) {
        final AppModel appModel = appViewModel.getAppModel();
        return appViewModel.getDownloadModel().getDownloadState() == DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR ? C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.app.view.m5
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7920f.m7109E2(appModel);
            }
        }).m39968M().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.t1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                AppViewModel appViewModel2 = appViewModel;
                AppViewPresenter.lambda$verifyNotEnoughSpaceError$42(appViewModel2, obj);
                return appViewModel2;
            }
        }) : C11234e.m40025S(appViewModel);
    }

    /* renamed from: D */
    public /* synthetic */ AppViewModel m7102D(AppViewModel appViewModel, Throwable th) {
        lambda$handleAppViewOpenOptions$23(appViewModel, th);
        return appViewModel;
    }

    /* renamed from: T1 */
    public /* synthetic */ AppViewModel m7154T1(AppViewModel appViewModel, Throwable th) {
        lambda$loadAds$12(appViewModel, th);
        return appViewModel;
    }

    /* renamed from: X1 */
    public /* synthetic */ AppViewModel m7166X1(AppViewModel appViewModel, Throwable th) {
        lambda$loadAppcPromotion$32(appViewModel, th);
        return appViewModel;
    }

    public C11234e<AppViewModel> handleAppViewOpenOptions(final AppViewModel appViewModel) {
        final AppModel appModel = appViewModel.getAppModel();
        final DownloadModel.Action action = appViewModel.getDownloadModel().getAction();
        return handleOpenAppViewDialogInput(appViewModel.getAppModel()).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.oa
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Boolean bool = (Boolean) obj;
                AppViewPresenter.lambda$handleAppViewOpenOptions$18(bool);
                return bool;
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.y1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8161f.m7090A(appModel, action, appViewModel, (Boolean) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.x8
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8149f.m7098C(action, appModel, (Boolean) obj);
            }
        }).m40069K0(C11234e.m40025S(Boolean.FALSE)).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.ia
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                AppViewModel appViewModel2 = appViewModel;
                AppViewPresenter.lambda$handleAppViewOpenOptions$22(appViewModel2, (Boolean) obj);
                return appViewModel2;
            }
        }).m40105p0(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.l6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                AppViewPresenter appViewPresenter = this.f7903f;
                AppViewModel appViewModel2 = appViewModel;
                appViewPresenter.m7102D(appViewModel2, (Throwable) obj);
                return appViewModel2;
            }
        });
    }

    public void handleFirstLoad() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.f8
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.za
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8199f.m7228o1((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.i6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7839f.m7232p1((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.ac
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppViewPresenter.lambda$handleFirstLoad$56((AppViewModel) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.q3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8003f.m7236q1((Throwable) obj);
            }
        });
    }

    public C11234e<AppViewModel> loadAds(final AppViewModel appViewModel) {
        return this.appViewManager.registerAppsFlyerImpression(appViewModel.getAppModel().getPackageName()).m39917e(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.fg
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }).m39915A().m40065I0(Schedulers.m40658io()).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.h8
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7816f.m7151S1(appViewModel, (Boolean) obj);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.h6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                AppViewModel appViewModel2 = appViewModel;
                AppViewPresenter.lambda$loadAds$11(appViewModel2, (SearchAdResult) obj);
                return appViewModel2;
            }
        }).m40105p0(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.pc
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                AppViewPresenter appViewPresenter = this.f7992f;
                AppViewModel appViewModel2 = appViewModel;
                appViewPresenter.m7154T1(appViewModel2, (Throwable) obj);
                return appViewModel2;
            }
        });
    }

    public C11234e<AppViewModel> loadAppcPromotion(final AppViewModel appViewModel) {
        return C11234e.m40025S(appViewModel.getAppModel()).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.ab
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                AppModel appModel = (AppModel) obj;
                return Boolean.valueOf(appModel.hasBilling() || appModel.hasAdvertising());
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.a6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7672f.m7160V1((AppModel) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.z2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8190f.m7163W1((PromotionViewModel) obj);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.w3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                AppViewModel appViewModel2 = appViewModel;
                AppViewPresenter.lambda$loadAppcPromotion$31(appViewModel2, (PromotionViewModel) obj);
                return appViewModel2;
            }
        }).m40105p0(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.va
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                AppViewPresenter appViewPresenter = this.f8113f;
                AppViewModel appViewModel2 = appViewModel;
                appViewPresenter.m7166X1(appViewModel2, (Throwable) obj);
                return appViewModel2;
            }
        });
    }

    public C11234e<AppViewModel> loadOtherAppViewComponents(final AppViewModel appViewModel) {
        return C11234e.m40040d1(updateSimilarAppsBundles(appViewModel.getAppModel()), updateReviews(appViewModel.getAppModel()), new InterfaceC11257f() { // from class: cm.aptoide.pt.app.view.fd
            @Override // p456rx.p460m.InterfaceC11257f
            /* renamed from: a */
            public final Object mo6865a(Object obj, Object obj2) {
                return C11234e.m40025S(appViewModel);
            }
        }).m40057E().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.p6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                AppViewModel appViewModel2 = appViewModel;
                AppViewPresenter.lambda$loadOtherAppViewComponents$27(appViewModel2, (C11234e) obj);
                return appViewModel2;
            }
        });
    }

    public C11234e<AppViewModel> observeDownloadApp() {
        return this.appViewManager.observeAppViewModel().m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.l1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7898f.m7178b2((AppViewModel) obj);
            }
        });
    }

    public C11234e<AppViewModel> observePromotionDownloadErrors(final AppViewModel appViewModel) {
        return C11234e.m40033a0(this.view.resumePromotionDownload(), this.view.installWalletButtonClick()).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.e2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7747f.m7190e2(obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.m7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7923f.m7194f2((PromotionViewModel) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.h2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7807f.verifyNotEnoughSpaceError((PromotionViewModel) obj);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.bc
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                AppViewModel appViewModel2 = appViewModel;
                AppViewPresenter.lambda$observePromotionDownloadErrors$36(appViewModel2, (PromotionViewModel) obj);
                return appViewModel2;
            }
        }).m40110s0();
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        handleFirstLoad();
        handleReviewAutoScroll();
        handleClickOnScreenshot();
        handleClickOnVideo();
        handleClickOnDescriptionReadMore();
        handleClickOnDeveloperWebsite();
        handleClickOnDeveloperEmail();
        handleClickOnDeveloperPrivacy();
        handleClickOnDeveloperPermissions();
        handleClickOnStoreLayout();
        handleClickOnFollowStore();
        handleClickOnOtherVersions();
        handleClickOnTrustedBadge();
        handleClickOnRateApp();
        handleClickReadReviews();
        handleClickFlags();
        handleClickLoginSnack();
        handleClickOnAppcInfo();
        handleClickOnBonusAppcFlair();
        handleClickOnAppcIabInfo();
        handleClickOnSimilarApps();
        handleClickOnToolbar();
        handleClickOnRetry();
        handleClickOnCatappultCard();
        handleOnSimilarAppsVisible();
        handleInstallButtonClick();
        pauseDownload();
        resumeDownload();
        cancelDownload();
        handleApkfyDialogPositiveClick();
        handleDismissWalletPromotion();
        handleInstallWalletPromotion();
        claimApp();
        handlePromotionClaimResult();
        resumeWalletDownload();
        cancelPromotionDownload();
        pauseWalletDownload();
        handleDownloadingSimilarApp();
        handleOutOfSpaceDialogResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C11234e<PromotionViewModel> verifyNotEnoughSpaceError(final PromotionViewModel promotionViewModel) {
        final WalletApp walletApp = promotionViewModel.getWalletApp();
        DownloadModel downloadModel = walletApp.getDownloadModel();
        if (downloadModel != null && downloadModel.getDownloadState() == DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR) {
            return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.app.view.u2
                @Override // p456rx.p460m.InterfaceC11252a
                public final void call() {
                    this.f8087f.m7113F2(walletApp);
                }
            }).m39968M().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.q4
                @Override // p456rx.p460m.InterfaceC11256e
                public final Object call(Object obj) {
                    PromotionViewModel promotionViewModel2 = promotionViewModel;
                    AppViewPresenter.lambda$verifyNotEnoughSpaceError$44(promotionViewModel2, obj);
                    return promotionViewModel2;
                }
            });
        }
        return C11234e.m40025S(promotionViewModel);
    }
}
