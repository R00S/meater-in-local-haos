package cm.aptoide.p092pt.home;

import cm.aptoide.p092pt.blacklist.BlacklistManager;
import cm.aptoide.p092pt.home.bundles.BundlesRepository;
import cm.aptoide.p092pt.home.bundles.HomeBundlesModel;
import cm.aptoide.p092pt.home.bundles.base.ActionBundle;
import cm.aptoide.p092pt.home.bundles.base.ActionItem;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import cm.aptoide.p092pt.notification.ComingSoonNotificationManager;
import cm.aptoide.p092pt.promotions.PromotionApp;
import cm.aptoide.p092pt.promotions.PromotionsManager;
import cm.aptoide.p092pt.promotions.PromotionsModel;
import cm.aptoide.p092pt.promotions.PromotionsPreferencesManager;
import cm.aptoide.p092pt.reactions.ReactionsManager;
import cm.aptoide.p092pt.reactions.network.LoadReactionModel;
import cm.aptoide.p092pt.reactions.network.ReactionsResponse;
import java.util.List;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class Home {
    private final BlacklistManager blacklistManager;
    private final BundlesRepository bundlesRepository;
    private final ComingSoonNotificationManager comingSoonNotificationManager;
    private final String promotionType;
    private final PromotionsManager promotionsManager;
    private final PromotionsPreferencesManager promotionsPreferencesManager;
    private final ReactionsManager reactionsManager;

    public Home(BundlesRepository bundlesRepository, PromotionsManager promotionsManager, PromotionsPreferencesManager promotionsPreferencesManager, BlacklistManager blacklistManager, String str, ReactionsManager reactionsManager, ComingSoonNotificationManager comingSoonNotificationManager) {
        this.bundlesRepository = bundlesRepository;
        this.promotionsManager = promotionsManager;
        this.promotionsPreferencesManager = promotionsPreferencesManager;
        this.promotionType = str;
        this.blacklistManager = blacklistManager;
        this.reactionsManager = reactionsManager;
        this.comingSoonNotificationManager = comingSoonNotificationManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getUpdatedCards, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Single<List<HomeBundle>> m7820e(HomeBundlesModel homeBundlesModel, LoadReactionModel loadReactionModel, String str) {
        ActionItem actionItem;
        List<HomeBundle> list = homeBundlesModel.getList();
        for (HomeBundle homeBundle : list) {
            if (homeBundle.getType() == HomeBundle.BundleType.EDITORIAL && (homeBundle instanceof ActionBundle) && (actionItem = ((ActionBundle) homeBundle).getActionItem()) != null && actionItem.getCardId().equals(str)) {
                actionItem.setReactions(loadReactionModel.getTopReactionList());
                actionItem.setNumberOfReactions(loadReactionModel.getTotal());
                actionItem.setUserReaction(loadReactionModel.getMyReaction());
            }
        }
        return Single.m39913m(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$actionBundleImpression$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7817b(ActionBundle actionBundle) {
        this.blacklistManager.addImpression(actionBundle.getType().toString(), actionBundle.getActionItem().getCardId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadNextHomeBundles$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7818c(HomeBundlesModel homeBundlesModel) {
        if (homeBundlesModel.hasErrors()) {
            setLoadMoreError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadReactionModel$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7821f(final String str, final LoadReactionModel loadReactionModel) {
        return this.bundlesRepository.loadHomeBundles().m40085Z0().m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.f
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9710f.m7820e(loadReactionModel, str, (HomeBundlesModel) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$remove$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7822g(ActionBundle actionBundle) {
        this.blacklistManager.blacklist(actionBundle.getType().toString(), actionBundle.getActionItem().getCardId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HomePromotionsWrapper mapPromotions(PromotionsModel promotionsModel) {
        int i2;
        float f2;
        List<PromotionApp> appsList = promotionsModel.getAppsList();
        if (appsList.size() > 0) {
            int i3 = 0;
            float appcValue = 0.0f;
            for (PromotionApp promotionApp : appsList) {
                if (!promotionApp.isClaimed()) {
                    i3++;
                    appcValue += promotionApp.getAppcValue();
                }
            }
            i2 = i3;
            f2 = appcValue;
        } else {
            i2 = 0;
            f2 = 0.0f;
        }
        return new HomePromotionsWrapper(promotionsModel.getTitle(), promotionsModel.getFeatureGraphic(), !appsList.isEmpty(), i2, f2, this.promotionsPreferencesManager.shouldShowPromotionsDialog() && f2 > 0.0f, promotionsModel.getDialogDescription());
    }

    private void setLoadMoreError() {
        this.bundlesRepository.setHomeLoadMoreError();
    }

    public C11231b actionBundleImpression(final ActionBundle actionBundle) {
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.home.k
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f9776f.m7817b(actionBundle);
            }
        });
    }

    public C11231b cancelAppComingSoonNotification(String str) {
        return this.comingSoonNotificationManager.cancelScheduledNotification(str);
    }

    public Single<ReactionsResponse> deleteReaction(String str, String str2) {
        return this.reactionsManager.deleteReaction(str, str2);
    }

    public boolean hasMore() {
        return this.bundlesRepository.hasMore();
    }

    public Single<HomePromotionsWrapper> hasPromotionApps() {
        return this.promotionsManager.getPromotionsModel(this.promotionType).m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.g
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9724f.mapPromotions((PromotionsModel) obj);
            }
        });
    }

    public Single<Boolean> isFirstReaction(String str, String str2) {
        return this.reactionsManager.isFirstReaction(str, str2);
    }

    public C11234e<HomeBundlesModel> loadFreshHomeBundles() {
        return this.bundlesRepository.loadFreshHomeBundles();
    }

    public C11234e<HomeBundlesModel> loadHomeBundles() {
        return this.bundlesRepository.loadHomeBundles();
    }

    public C11234e<HomeBundlesModel> loadNextHomeBundles() {
        return this.bundlesRepository.loadNextHomeBundles(false).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.h
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9736f.m7818c((HomeBundlesModel) obj);
            }
        });
    }

    public Single<List<HomeBundle>> loadReactionModel(final String str, String str2, final HomeBundlesModel homeBundlesModel) {
        return this.reactionsManager.loadReactionModel(str, str2).m39915A().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.m
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(homeBundlesModel.isComplete());
            }
        }).m40085Z0().m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.i
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9748f.m7819d(homeBundlesModel, str, (LoadReactionModel) obj);
            }
        });
    }

    public C11231b remove(final ActionBundle actionBundle) {
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.home.l
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f9789f.m7822g(actionBundle);
            }
        }).m39973a(this.bundlesRepository.remove(actionBundle));
    }

    public void setPromotionsDialogShown() {
        this.promotionsPreferencesManager.setPromotionsDialogShown();
    }

    public Single<ReactionsResponse> setReaction(String str, String str2, String str3) {
        return this.reactionsManager.setReaction(str, str2, str3);
    }

    public C11231b setupAppComingSoonNotification(String str) {
        return this.comingSoonNotificationManager.setupNotification(str);
    }

    public Single<List<HomeBundle>> loadReactionModel(final String str, String str2) {
        return this.reactionsManager.loadReactionModel(str, str2).m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.j
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9762f.m7821f(str, (LoadReactionModel) obj);
            }
        });
    }
}
