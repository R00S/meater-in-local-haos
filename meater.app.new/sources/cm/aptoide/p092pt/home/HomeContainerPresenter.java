package cm.aptoide.p092pt.home;

import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.home.ChipManager;
import cm.aptoide.p092pt.home.HomeContainerFragment;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import p456rx.AbstractC11243h;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.exceptions.OnErrorNotImplementedException;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class HomeContainerPresenter implements Presenter {
    private final AptoideAccountManager accountManager;
    private final ChipManager chipManager;
    private final Home home;
    private final HomeAnalytics homeAnalytics;
    private final HomeContainerNavigator homeContainerNavigator;
    private final HomeNavigator homeNavigator;
    private final HomeContainerView view;
    private final AbstractC11243h viewScheduler;

    /* renamed from: cm.aptoide.pt.home.HomeContainerPresenter$1 */
    static /* synthetic */ class C28111 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$home$HomeContainerFragment$ChipsEvents;

        static {
            int[] iArr = new int[HomeContainerFragment.ChipsEvents.values().length];
            $SwitchMap$cm$aptoide$pt$home$HomeContainerFragment$ChipsEvents = iArr;
            try {
                iArr[HomeContainerFragment.ChipsEvents.GAMES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$home$HomeContainerFragment$ChipsEvents[HomeContainerFragment.ChipsEvents.APPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public HomeContainerPresenter(HomeContainerView homeContainerView, AbstractC11243h abstractC11243h, AptoideAccountManager aptoideAccountManager, HomeContainerNavigator homeContainerNavigator, HomeNavigator homeNavigator, HomeAnalytics homeAnalytics, Home home, ChipManager chipManager) {
        this.view = homeContainerView;
        this.viewScheduler = abstractC11243h;
        this.accountManager = aptoideAccountManager;
        this.homeContainerNavigator = homeContainerNavigator;
        this.homeNavigator = homeNavigator;
        this.homeAnalytics = homeAnalytics;
        this.home = home;
        this.chipManager = chipManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getUserAvatar, reason: merged with bridge method [inline-methods] */
    public C11234e<String> m7835G(Account account) {
        return C11234e.m40025S((account == null || !account.isLoggedIn()) ? null : account.getAvatar());
    }

    private void handleBottomNavigationEvents() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.u0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.y0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10039f.m7841e((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.viewScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.l0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9791f.m7842f((Integer) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.a1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9337f.m7843g((Boolean) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.m2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomeContainerPresenter.lambda$handleBottomNavigationEvents$9((Boolean) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.u2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomeContainerPresenter.lambda$handleBottomNavigationEvents$10((Throwable) obj);
                throw null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$checkForPromotionApps$28, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7837a(View.LifecycleEvent lifecycleEvent) {
        return this.home.hasPromotionApps();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$checkForPromotionApps$29, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7838b(HomePromotionsWrapper homePromotionsWrapper) {
        this.view.showPromotionsHomeIcon(homePromotionsWrapper);
        this.homeAnalytics.sendPromotionsImpressionEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$checkForPromotionApps$30, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7839c(HomePromotionsWrapper homePromotionsWrapper) {
        this.homeAnalytics.sendPromotionsDialogImpressionEvent();
        this.home.setPromotionsDialogShown();
        this.view.showPromotionsHomeDialog(homePromotionsWrapper);
    }

    static /* synthetic */ void lambda$checkForPromotionApps$31(HomePromotionsWrapper homePromotionsWrapper) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$checkForPromotionApps$32, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7840d(Throwable th) {
        this.view.hidePromotionsIcon();
    }

    static /* synthetic */ void lambda$handleBottomNavigationEvents$10(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBottomNavigationEvents$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7841e(View.LifecycleEvent lifecycleEvent) {
        return this.homeNavigator.bottomNavigation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBottomNavigationEvents$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7842f(Integer num) {
        return this.homeContainerNavigator.navigateHome();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBottomNavigationEvents$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7843g(Boolean bool) {
        this.view.expandChips();
        if (bool.booleanValue()) {
            this.homeContainerNavigator.loadMainHomeContent();
            this.chipManager.setCurrentChip(null);
            this.view.uncheckChips();
        }
    }

    static /* synthetic */ void lambda$handleBottomNavigationEvents$9(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnAppsChip$81, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7844h(View.LifecycleEvent lifecycleEvent) {
        return this.view.appsChipClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnAppsChip$82, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7845i(Boolean bool) {
        if (bool.booleanValue()) {
            this.homeContainerNavigator.loadAppsHomeContent();
            this.chipManager.setCurrentChip(ChipManager.Chip.APPS);
        } else {
            this.homeContainerNavigator.loadMainHomeContent();
            this.chipManager.setCurrentChip(null);
        }
        HomeAnalytics homeAnalytics = this.homeAnalytics;
        ChipManager.Chip chip = ChipManager.Chip.APPS;
        homeAnalytics.sendChipInteractEvent(chip.getName());
        this.homeAnalytics.sendChipHomeInteractEvent(chip.getName());
    }

    static /* synthetic */ void lambda$handleClickOnAppsChip$83(Boolean bool) {
    }

    static /* synthetic */ void lambda$handleClickOnAppsChip$84(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnGamesChip$76, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7846j(View.LifecycleEvent lifecycleEvent) {
        return this.view.gamesChipClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnGamesChip$77, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7847k(Boolean bool) {
        if (bool.booleanValue()) {
            this.homeContainerNavigator.loadGamesHomeContent();
            this.chipManager.setCurrentChip(ChipManager.Chip.GAMES);
        } else {
            this.homeContainerNavigator.loadMainHomeContent();
            this.chipManager.setCurrentChip(null);
        }
        HomeAnalytics homeAnalytics = this.homeAnalytics;
        ChipManager.Chip chip = ChipManager.Chip.GAMES;
        homeAnalytics.sendChipInteractEvent(chip.getName());
        this.homeAnalytics.sendChipHomeInteractEvent(chip.getName());
    }

    static /* synthetic */ void lambda$handleClickOnGamesChip$78(Boolean bool) {
    }

    static /* synthetic */ void lambda$handleClickOnGamesChip$79(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnPrivacyPolicy$70, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7848l(View.LifecycleEvent lifecycleEvent) {
        return this.view.gdprDialogClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnPrivacyPolicy$72, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7849m(String str) {
        this.homeNavigator.navigateToPrivacyPolicy();
    }

    static /* synthetic */ void lambda$handleClickOnPrivacyPolicy$73(String str) {
    }

    static /* synthetic */ void lambda$handleClickOnPrivacyPolicy$74(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnPromotionsDialogCancel$40, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7850n(View.LifecycleEvent lifecycleEvent) {
        return this.view.promotionsHomeDialogClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnPromotionsDialogCancel$42, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7851o(String str) {
        this.homeAnalytics.sendPromotionsDialogDismissEvent();
        this.view.dismissPromotionsDialog();
    }

    static /* synthetic */ void lambda$handleClickOnPromotionsDialogCancel$43(String str) {
    }

    static /* synthetic */ void lambda$handleClickOnPromotionsDialogCancel$44(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnPromotionsDialogContinue$34, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7852p(View.LifecycleEvent lifecycleEvent) {
        return this.view.promotionsHomeDialogClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnPromotionsDialogContinue$36, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7853q(String str) {
        this.homeAnalytics.sendPromotionsDialogNavigateEvent();
        this.view.dismissPromotionsDialog();
        this.homeNavigator.navigateToPromotions();
    }

    static /* synthetic */ void lambda$handleClickOnPromotionsDialogContinue$37(String str) {
    }

    static /* synthetic */ void lambda$handleClickOnPromotionsDialogContinue$38(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnTermsAndConditions$64, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7854r(View.LifecycleEvent lifecycleEvent) {
        return this.view.gdprDialogClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnTermsAndConditions$66, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7855s(String str) {
        this.homeNavigator.navigateToTermsAndConditions();
    }

    static /* synthetic */ void lambda$handleClickOnTermsAndConditions$67(String str) {
    }

    static /* synthetic */ void lambda$handleClickOnTermsAndConditions$68(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleLoggedInAcceptTermsAndConditions$46, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7856t(View.LifecycleEvent lifecycleEvent) {
        return this.accountManager.accountStatus().m40057E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleLoggedInAcceptTermsAndConditions$48, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7857u(Account account) {
        this.view.showTermsAndConditionsDialog();
    }

    static /* synthetic */ void lambda$handleLoggedInAcceptTermsAndConditions$49(Account account) {
    }

    static /* synthetic */ void lambda$handleLoggedInAcceptTermsAndConditions$50(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePromotionsClick$23, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7858v(Void r1) {
        this.homeAnalytics.sendPromotionsIconClickEvent();
        this.homeNavigator.navigateToPromotions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePromotionsClick$24, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7859w(View.LifecycleEvent lifecycleEvent) {
        return this.view.toolbarPromotionsClick().m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.r2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9963f.m7858v((Void) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handlePromotionsClick$25(Void r0) {
    }

    static /* synthetic */ void lambda$handlePromotionsClick$26(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleTermsAndConditionsContinueClicked$52, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7860x(View.LifecycleEvent lifecycleEvent) {
        return this.view.gdprDialogClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleTermsAndConditionsContinueClicked$54, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7861y(String str) {
        return this.accountManager.updateTermsAndConditions();
    }

    static /* synthetic */ void lambda$handleTermsAndConditionsContinueClicked$55(String str) {
    }

    static /* synthetic */ void lambda$handleTermsAndConditionsContinueClicked$56(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleTermsAndConditionsLogOutClicked$58, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7862z(View.LifecycleEvent lifecycleEvent) {
        return this.view.gdprDialogClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleTermsAndConditionsLogOutClicked$60, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7829A(String str) {
        return this.accountManager.logout();
    }

    static /* synthetic */ void lambda$handleTermsAndConditionsLogOutClicked$61(String str) {
    }

    static /* synthetic */ void lambda$handleTermsAndConditionsLogOutClicked$62(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUserImageClick$18, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7830B(Void r1) {
        this.homeNavigator.navigateToMyAccount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUserImageClick$19, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7831C(View.LifecycleEvent lifecycleEvent) {
        return this.view.toolbarUserClick().m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.m1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9804f.m7830B((Void) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleUserImageClick$20(Void r0) {
    }

    static /* synthetic */ void lambda$handleUserImageClick$21(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadMainHomeContent$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7832D(View.LifecycleEvent lifecycleEvent) {
        return this.view.isChipChecked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadMainHomeContent$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7833E(HomeContainerFragment.ChipsEvents chipsEvents) {
        int i2 = C28111.$SwitchMap$cm$aptoide$pt$home$HomeContainerFragment$ChipsEvents[chipsEvents.ordinal()];
        if (i2 == 1) {
            this.homeContainerNavigator.loadGamesHomeContent();
        } else if (i2 != 2) {
            this.homeContainerNavigator.loadMainHomeContent();
        } else {
            this.homeContainerNavigator.loadAppsHomeContent();
        }
    }

    static /* synthetic */ void lambda$loadMainHomeContent$3(HomeContainerFragment.ChipsEvents chipsEvents) {
    }

    static /* synthetic */ void lambda$loadMainHomeContent$4(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadUserImage$12, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7834F(View.LifecycleEvent lifecycleEvent) {
        return this.accountManager.accountStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadUserImage$14, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7836H(String str) {
        if (str != null) {
            this.view.setUserImage(str);
        } else {
            this.view.setDefaultUserImage();
        }
        this.view.showAvatar();
    }

    static /* synthetic */ void lambda$loadUserImage$15(String str) {
    }

    static /* synthetic */ void lambda$loadUserImage$16(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    public void checkForPromotionApps() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.x1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.e0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9699f.m7837a((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.la
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomePromotionsWrapper) obj).hasPromotions());
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.h1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9738f.m7838b((HomePromotionsWrapper) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.e
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((HomePromotionsWrapper) obj).shouldShowDialog());
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.q2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9951f.m7839c((HomePromotionsWrapper) obj);
            }
        }).m40117w(C3131ia.f9761f).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.g0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomeContainerPresenter.lambda$checkForPromotionApps$31((HomePromotionsWrapper) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.j0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9764f.m7840d((Throwable) obj);
            }
        });
    }

    public void handleClickOnAppsChip() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.t1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.c1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9676f.m7844h((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.y1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10040f.m7845i((Boolean) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.l2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomeContainerPresenter.lambda$handleClickOnAppsChip$83((Boolean) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.x2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomeContainerPresenter.lambda$handleClickOnAppsChip$84((Throwable) obj);
                throw null;
            }
        });
    }

    public void handleClickOnGamesChip() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.k2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.r1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9962f.m7846j((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.k0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9778f.m7847k((Boolean) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.f2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomeContainerPresenter.lambda$handleClickOnGamesChip$78((Boolean) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.d2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomeContainerPresenter.lambda$handleClickOnGamesChip$79((Throwable) obj);
                throw null;
            }
        });
    }

    public void handleClickOnPrivacyPolicy() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.d0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.f1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9714f.m7848l((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.s2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).equals("privacy"));
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.h0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9737f.m7849m((String) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.q0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomeContainerPresenter.lambda$handleClickOnPrivacyPolicy$73((String) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.z1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomeContainerPresenter.lambda$handleClickOnPrivacyPolicy$74((Throwable) obj);
                throw null;
            }
        });
    }

    public void handleClickOnPromotionsDialogCancel() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.v1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.g1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9726f.m7850n((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.r0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).equals("cancel"));
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.o0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9927f.m7851o((String) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.f0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomeContainerPresenter.lambda$handleClickOnPromotionsDialogCancel$43((String) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.w0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomeContainerPresenter.lambda$handleClickOnPromotionsDialogCancel$44((Throwable) obj);
                throw null;
            }
        });
    }

    public void handleClickOnPromotionsDialogContinue() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.k1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.x
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10027f.m7852p((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.b2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).equals("navigate"));
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.a2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9338f.m7853q((String) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.o1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomeContainerPresenter.lambda$handleClickOnPromotionsDialogContinue$37((String) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.i0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomeContainerPresenter.lambda$handleClickOnPromotionsDialogContinue$38((Throwable) obj);
                throw null;
            }
        });
    }

    public void handleClickOnTermsAndConditions() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.p0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.h2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9739f.m7854r((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.w2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).equals("terms"));
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.v2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10007f.m7855s((String) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.n2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomeContainerPresenter.lambda$handleClickOnTermsAndConditions$67((String) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.z
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomeContainerPresenter.lambda$handleClickOnTermsAndConditions$68((Throwable) obj);
                throw null;
            }
        });
    }

    public void handleLoggedInAcceptTermsAndConditions() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.u
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.j2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9766f.m7856t((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.ma
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((Account) obj).isLoggedIn());
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.o2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Account account = (Account) obj;
                return Boolean.valueOf((account.acceptedPrivacyPolicy() && account.acceptedTermsAndConditions()) ? false : true);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.z2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10052f.m7857u((Account) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.a0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomeContainerPresenter.lambda$handleLoggedInAcceptTermsAndConditions$49((Account) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.v0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomeContainerPresenter.lambda$handleLoggedInAcceptTermsAndConditions$50((Throwable) obj);
                throw null;
            }
        });
    }

    public void handlePromotionsClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.g2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.i2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9753f.m7859w((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.s1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomeContainerPresenter.lambda$handlePromotionsClick$25((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.t
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomeContainerPresenter.lambda$handlePromotionsClick$26((Throwable) obj);
                throw null;
            }
        });
    }

    public void handleTermsAndConditionsContinueClicked() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.p2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.u1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9995f.m7860x((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.e1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).equals("continue"));
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.q1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9950f.m7861y((String) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.z0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomeContainerPresenter.lambda$handleTermsAndConditionsContinueClicked$55((String) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.w
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomeContainerPresenter.lambda$handleTermsAndConditionsContinueClicked$56((Throwable) obj);
                throw null;
            }
        });
    }

    public void handleTermsAndConditionsLogOutClicked() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.b0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.n0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9916f.m7862z((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.d1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).equals("logout"));
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.c0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9675f.m7829A((String) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.y2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomeContainerPresenter.lambda$handleTermsAndConditionsLogOutClicked$61((String) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.n1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomeContainerPresenter.lambda$handleTermsAndConditionsLogOutClicked$62((Throwable) obj);
                throw null;
            }
        });
    }

    public void handleUserImageClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.l1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.w1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10017f.m7831C((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.m0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomeContainerPresenter.lambda$handleUserImageClick$20((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.x0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomeContainerPresenter.lambda$handleUserImageClick$21((Throwable) obj);
                throw null;
            }
        });
    }

    public void loadMainHomeContent() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.j1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.c2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9677f.m7832D((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.s0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9972f.m7833E((HomeContainerFragment.ChipsEvents) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.y
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomeContainerPresenter.lambda$loadMainHomeContent$3((HomeContainerFragment.ChipsEvents) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.p1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomeContainerPresenter.lambda$loadMainHomeContent$4((Throwable) obj);
                throw null;
            }
        });
    }

    public void loadUserImage() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.t2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.e2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9701f.m7834F((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.t0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9983f.m7835G((Account) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.i1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9752f.m7836H((String) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.v
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomeContainerPresenter.lambda$loadUserImage$15((String) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.b1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                HomeContainerPresenter.lambda$loadUserImage$16((Throwable) obj);
                throw null;
            }
        });
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        loadMainHomeContent();
        loadUserImage();
        handleUserImageClick();
        handlePromotionsClick();
        checkForPromotionApps();
        handleClickOnPromotionsDialogContinue();
        handleClickOnPromotionsDialogCancel();
        handleLoggedInAcceptTermsAndConditions();
        handleTermsAndConditionsContinueClicked();
        handleTermsAndConditionsLogOutClicked();
        handleClickOnTermsAndConditions();
        handleClickOnPrivacyPolicy();
        handleClickOnGamesChip();
        handleClickOnAppsChip();
        handleBottomNavigationEvents();
    }
}
