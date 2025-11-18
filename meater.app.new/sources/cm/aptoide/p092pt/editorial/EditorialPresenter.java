package cm.aptoide.p092pt.editorial;

import cm.aptoide.aptoideviews.socialmedia.SocialMediaView;
import cm.aptoide.p092pt.UserFeedbackAnalytics;
import cm.aptoide.p092pt.actions.PermissionManager;
import cm.aptoide.p092pt.actions.PermissionService;
import cm.aptoide.p092pt.ads.MoPubAdsManager;
import cm.aptoide.p092pt.ads.WalletAdsOfferManager;
import cm.aptoide.p092pt.app.DownloadModel;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceNavigatorWrapper;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.reactions.ReactionEvent;
import cm.aptoide.p092pt.reactions.network.LoadReactionModel;
import cm.aptoide.p092pt.reactions.network.ReactionsResponse;
import cm.aptoide.p092pt.socialmedia.SocialMediaAnalytics;
import okhttp3.HttpUrl;
import p456rx.AbstractC11243h;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p460m.InterfaceCallableC11255d;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class EditorialPresenter implements Presenter {
    private final CrashReport crashReporter;
    private final EditorialAnalytics editorialAnalytics;
    private final EditorialManager editorialManager;
    private final EditorialNavigator editorialNavigator;
    private final MoPubAdsManager moPubAdsManager;
    private final PermissionManager permissionManager;
    private final PermissionService permissionService;
    private final SocialMediaAnalytics socialMediaAnalytics;
    private final UserFeedbackAnalytics userFeedbackAnalytics;
    private final EditorialView view;
    private final AbstractC11243h viewScheduler;

    /* renamed from: cm.aptoide.pt.editorial.EditorialPresenter$1 */
    static /* synthetic */ class C24801 {
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
        }
    }

    public EditorialPresenter(EditorialView editorialView, EditorialManager editorialManager, AbstractC11243h abstractC11243h, CrashReport crashReport, PermissionManager permissionManager, PermissionService permissionService, EditorialAnalytics editorialAnalytics, EditorialNavigator editorialNavigator, UserFeedbackAnalytics userFeedbackAnalytics, MoPubAdsManager moPubAdsManager, SocialMediaAnalytics socialMediaAnalytics) {
        this.view = editorialView;
        this.editorialManager = editorialManager;
        this.viewScheduler = abstractC11243h;
        this.crashReporter = crashReport;
        this.permissionManager = permissionManager;
        this.permissionService = permissionService;
        this.editorialAnalytics = editorialAnalytics;
        this.editorialNavigator = editorialNavigator;
        this.userFeedbackAnalytics = userFeedbackAnalytics;
        this.moPubAdsManager = moPubAdsManager;
        this.socialMediaAnalytics = socialMediaAnalytics;
    }

    private void cancelDownload() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.j4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.n5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9051f.m7676a((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.r4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9090f.m7682d((EditorialViewModel) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.m0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialPresenter.lambda$cancelDownload$52((EditorialDownloadEvent) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.p3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialPresenter.lambda$cancelDownload$53((Throwable) obj);
            }
        });
    }

    private C11231b downgradeApp(final EditorialDownloadEvent editorialDownloadEvent, final EditorialViewModel editorialViewModel) {
        return this.view.showDowngradeMessage().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.s2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Boolean bool = (Boolean) obj;
                EditorialPresenter.lambda$downgradeApp$117(bool);
                return bool;
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.k5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9021f.m7684e(editorialDownloadEvent, editorialViewModel, (Boolean) obj);
            }
        }).m40083X0();
    }

    private C11231b downloadApp(final EditorialDownloadEvent editorialDownloadEvent, final EditorialViewModel editorialViewModel) {
        return C11234e.m40049p(new InterfaceCallableC11255d() { // from class: cm.aptoide.pt.editorial.u2
            @Override // p456rx.p460m.InterfaceCallableC11255d, java.util.concurrent.Callable
            public final Object call() {
                return this.f9113f.m7686f(editorialDownloadEvent);
            }
        }).m40095j0(this.viewScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.h1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8983f.m7688g((EditorialDownloadEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.p1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9063f.m7692i(editorialDownloadEvent, editorialViewModel, (Void) obj);
            }
        }).m40095j0(Schedulers.m40658io()).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.y2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9171f.m7694j(editorialDownloadEvent, (Void) obj);
            }
        }).m40083X0();
    }

    private void handleInstallClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.i3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.r2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9088f.m7708q((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.z2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9195f.m7724y((EditorialViewModel) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.l4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handleInstallClick$45((EditorialDownloadEvent) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.c3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handleInstallClick$46((Throwable) obj);
                throw null;
            }
        });
    }

    private void handleOutOfSpaceDialogResult() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.j5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.o2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9056f.m7653H((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.b5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((OutOfSpaceNavigatorWrapper) obj).getClearedSuccessfully());
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.l5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9032f.m7655I((OutOfSpaceNavigatorWrapper) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.g5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8979f.m7657J((EditorialViewModel) obj);
            }
        }).m40110s0().m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.h4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handleOutOfSpaceDialogResult$5((EditorialViewModel) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.g3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8977f.m7659K((Throwable) obj);
            }
        });
    }

    private void handleReactionsResponse(ReactionsResponse reactionsResponse, boolean z) {
        if (reactionsResponse.wasSuccess()) {
            if (z) {
                this.editorialAnalytics.sendDeletedEvent();
                return;
            } else {
                this.editorialAnalytics.sendReactedEvent();
                return;
            }
        }
        if (reactionsResponse.reactionsExceeded()) {
            this.view.showLoginDialog();
        } else if (reactionsResponse.wasNetworkError()) {
            this.view.showNetworkErrorToast();
        } else if (reactionsResponse.wasGeneralError()) {
            this.view.showGenericErrorToast();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleSinglePressReactionButton, reason: merged with bridge method [inline-methods] */
    public C11234e<LoadReactionModel> m7669T(final EditorialViewModel editorialViewModel) {
        return this.editorialManager.isFirstReaction(editorialViewModel.getCardId(), editorialViewModel.getGroupId()).m39922k(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.n3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9048f.m7677a0(editorialViewModel, (Boolean) obj);
            }
        });
    }

    private void handleSocialMediaPromotionClick() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.g2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.k2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9018f.m7683d0((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.d5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8948f.m7685e0((SocialMediaView.SocialMediaType) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2493b3 c2493b3 = new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.b3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handleSocialMediaPromotionClick$10((SocialMediaView.SocialMediaType) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c2493b3, new C2489b(crashReport));
    }

    private boolean isOnlyOneMediaVisible(int i2, int i3) {
        return i2 == i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cancelDownload$48, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7676a(View.LifecycleEvent lifecycleEvent) {
        return setUpViewModelOnViewReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cancelDownload$49, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7678b(EditorialDownloadEvent editorialDownloadEvent) {
        this.editorialAnalytics.sendDownloadCancelEvent(editorialDownloadEvent.getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cancelDownload$50, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7680c(EditorialDownloadEvent editorialDownloadEvent) {
        return this.editorialManager.cancelDownload(editorialDownloadEvent.getMd5(), editorialDownloadEvent.getPackageName(), editorialDownloadEvent.getVerCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cancelDownload$51, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7682d(EditorialViewModel editorialViewModel) {
        return this.view.cancelDownload(editorialViewModel).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.p4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9068f.m7678b((EditorialDownloadEvent) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.z5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9198f.m7680c((EditorialDownloadEvent) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$cancelDownload$52(EditorialDownloadEvent editorialDownloadEvent) {
    }

    static /* synthetic */ void lambda$cancelDownload$53(Throwable th) {
    }

    static /* synthetic */ Boolean lambda$downgradeApp$117(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downgradeApp$118, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7684e(EditorialDownloadEvent editorialDownloadEvent, EditorialViewModel editorialViewModel, Boolean bool) {
        return downloadApp(editorialDownloadEvent, editorialViewModel);
    }

    static /* synthetic */ EditorialDownloadEvent lambda$downloadApp$70(EditorialDownloadEvent editorialDownloadEvent, Boolean bool) {
        return editorialDownloadEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$71, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7686f(final EditorialDownloadEvent editorialDownloadEvent) {
        if (!this.editorialManager.shouldShowRootInstallWarningPopup()) {
            return C11234e.m40025S(editorialDownloadEvent);
        }
        C11234e<Boolean> c11234eShowRootInstallWarningPopup = this.view.showRootInstallWarningPopup();
        final EditorialManager editorialManager = this.editorialManager;
        editorialManager.getClass();
        return c11234eShowRootInstallWarningPopup.m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.r6
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                editorialManager.allowRootInstall((Boolean) obj);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.w0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                EditorialDownloadEvent editorialDownloadEvent2 = editorialDownloadEvent;
                EditorialPresenter.lambda$downloadApp$70(editorialDownloadEvent2, (Boolean) obj);
                return editorialDownloadEvent2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$72, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7688g(EditorialDownloadEvent editorialDownloadEvent) {
        return this.permissionManager.requestDownloadAccess(this.permissionService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$73, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7690h(EditorialDownloadEvent editorialDownloadEvent, EditorialViewModel editorialViewModel, Throwable th) {
        th.printStackTrace();
        this.editorialAnalytics.sendDownloadAbortEvent(editorialDownloadEvent.getPackageName(), editorialDownloadEvent.getVerCode(), editorialDownloadEvent.getAction(), editorialDownloadEvent.getAction().equals(DownloadModel.Action.MIGRATE), !editorialDownloadEvent.getSplits().isEmpty(), editorialViewModel.hasAppc(), editorialDownloadEvent.getTrustedBadge(), editorialDownloadEvent.getStoreName(), false, editorialDownloadEvent.getObb() != null, editorialDownloadEvent.getBdsFlags().contains("STORE_BDS"), HttpUrl.FRAGMENT_ENCODE_SET, editorialDownloadEvent.getSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$74, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7692i(final EditorialDownloadEvent editorialDownloadEvent, final EditorialViewModel editorialViewModel, Void r4) {
        return this.permissionManager.requestExternalStoragePermission(this.permissionService).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.d2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8943f.m7690h(editorialDownloadEvent, editorialViewModel, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$75, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7694j(EditorialDownloadEvent editorialDownloadEvent, Void r2) {
        return this.editorialManager.downloadApp(editorialDownloadEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickActionButtonCard$31, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7696k(View.LifecycleEvent lifecycleEvent) {
        return this.view.actionButtonClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickActionButtonCard$32, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7698l(EditorialEvent editorialEvent) {
        this.editorialNavigator.navigateToUri(editorialEvent.getUrl());
    }

    static /* synthetic */ void lambda$handleClickActionButtonCard$33(EditorialEvent editorialEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnAppCard$27, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7700m(View.LifecycleEvent lifecycleEvent) {
        return setUpViewModelOnViewReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnAppCard$28, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7702n(EditorialEvent editorialEvent) {
        this.editorialNavigator.navigateToAppView(editorialEvent.getId(), editorialEvent.getPackageName());
    }

    static /* synthetic */ void lambda$handleClickOnAppCard$29(EditorialEvent editorialEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnMedia$23, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7704o(View.LifecycleEvent lifecycleEvent) {
        return this.view.mediaContentClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnMedia$24, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7706p(EditorialEvent editorialEvent) {
        this.editorialNavigator.navigateToUri(editorialEvent.getUrl());
    }

    static /* synthetic */ void lambda$handleClickOnMedia$25(EditorialEvent editorialEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallClick$35, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7708q(View.LifecycleEvent lifecycleEvent) {
        return setUpViewModelOnViewReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallClick$36, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7710r(EditorialDownloadEvent editorialDownloadEvent, DownloadModel.Action action, EditorialViewModel editorialViewModel) {
        this.editorialAnalytics.clickOnInstallButton(editorialDownloadEvent.getPackageName(), action.toString(), editorialViewModel.hasSplits(), editorialViewModel.hasAppc(), false, editorialViewModel.getRank(), null, editorialViewModel.getStoreName(), editorialViewModel.getBottomCardObb() != null, editorialDownloadEvent.getBdsFlags(), editorialDownloadEvent.getSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallClick$37, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7712s(final EditorialDownloadEvent editorialDownloadEvent, final DownloadModel.Action action, final EditorialViewModel editorialViewModel) {
        return downloadApp(editorialDownloadEvent, editorialViewModel).m39973a(this.editorialManager.convertCampaign(editorialDownloadEvent)).m39986z(this.viewScheduler).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.editorial.p5
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f9069f.m7710r(editorialDownloadEvent, action, editorialViewModel);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallClick$38, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7714t(EditorialDownloadEvent editorialDownloadEvent, DownloadModel.Action action, EditorialViewModel editorialViewModel) {
        this.editorialAnalytics.clickOnInstallButton(editorialDownloadEvent.getPackageName(), action.toString(), editorialViewModel.hasSplits(), editorialViewModel.hasAppc(), false, editorialViewModel.getRank(), null, editorialViewModel.getStoreName(), editorialViewModel.getBottomCardObb() != null, editorialDownloadEvent.getBdsFlags(), editorialDownloadEvent.getSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallClick$39, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7716u(final EditorialDownloadEvent editorialDownloadEvent, final DownloadModel.Action action, final EditorialViewModel editorialViewModel) {
        return openInstalledApp(editorialDownloadEvent.getPackageName()).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.editorial.w5
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f9139f.m7714t(editorialDownloadEvent, action, editorialViewModel);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallClick$40, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7718v(EditorialDownloadEvent editorialDownloadEvent, DownloadModel.Action action, EditorialViewModel editorialViewModel) {
        this.editorialAnalytics.clickOnInstallButton(editorialDownloadEvent.getPackageName(), action.toString(), editorialViewModel.hasSplits(), editorialViewModel.hasAppc(), false, editorialViewModel.getRank(), null, editorialViewModel.getStoreName(), editorialViewModel.getBottomCardObb() != null, editorialDownloadEvent.getBdsFlags(), editorialDownloadEvent.getSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallClick$41, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7720w(final EditorialDownloadEvent editorialDownloadEvent, final DownloadModel.Action action, final EditorialViewModel editorialViewModel) {
        return downgradeApp(editorialDownloadEvent, editorialViewModel).m39973a(this.editorialManager.convertCampaign(editorialDownloadEvent)).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.editorial.v3
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f9123f.m7718v(editorialDownloadEvent, action, editorialViewModel);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallClick$42, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7722x(final EditorialDownloadEvent editorialDownloadEvent) {
        final DownloadModel.Action action = editorialDownloadEvent.getAction();
        int i2 = C24801.$SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[action.ordinal()];
        if (i2 == 1 || i2 == 2) {
            return this.editorialManager.loadEditorialViewModel().m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.i2
                @Override // p456rx.p460m.InterfaceC11256e
                public final Object call(Object obj) {
                    return this.f8996f.m7712s(editorialDownloadEvent, action, (EditorialViewModel) obj);
                }
            });
        }
        if (i2 == 3) {
            return this.editorialManager.loadEditorialViewModel().m39924p(this.viewScheduler).m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.i1
                @Override // p456rx.p460m.InterfaceC11256e
                public final Object call(Object obj) {
                    return this.f8993f.m7716u(editorialDownloadEvent, action, (EditorialViewModel) obj);
                }
            });
        }
        if (i2 != 4) {
            return null;
        }
        return this.editorialManager.loadEditorialViewModel().m39924p(this.viewScheduler).m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.z1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9192f.m7720w(editorialDownloadEvent, action, (EditorialViewModel) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleInstallClick$44, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7724y(EditorialViewModel editorialViewModel) {
        return this.view.installButtonClick(editorialViewModel).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.t1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9103f.m7722x((EditorialDownloadEvent) obj);
            }
        }).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.t3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleInstallClick$45(EditorialDownloadEvent editorialDownloadEvent) {
    }

    static /* synthetic */ void lambda$handleInstallClick$46(Throwable th) {
        throw new IllegalStateException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleLongPressReactionButton$134, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7726z(View.LifecycleEvent lifecycleEvent) {
        return this.view.reactionsButtonLongPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleLongPressReactionButton$135, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7639A(Void r1) {
        return this.editorialManager.loadEditorialViewModel().m39915A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleLongPressReactionButton$136, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7641B(EditorialViewModel editorialViewModel) {
        this.editorialAnalytics.sendReactionButtonClickEvent();
        this.view.showReactionsPopup(editorialViewModel.getCardId(), editorialViewModel.getGroupId());
    }

    static /* synthetic */ void lambda$handleLongPressReactionButton$137(EditorialViewModel editorialViewModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleMediaListDescriptionVisibility$104, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7643C(View.LifecycleEvent lifecycleEvent) {
        return this.view.mediaListDescriptionChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleMediaListDescriptionVisibility$106, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7645D(EditorialEvent editorialEvent) {
        if (isOnlyOneMediaVisible(editorialEvent.getFirstVisiblePosition(), editorialEvent.getLastVisibleItemPosition())) {
            this.view.manageMediaListDescriptionAnimationVisibility(editorialEvent);
        } else {
            this.view.setMediaListDescriptionsVisible(editorialEvent);
        }
    }

    static /* synthetic */ void lambda$handleMediaListDescriptionVisibility$107(EditorialEvent editorialEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleMovingCollapse$109, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7647E(View.LifecycleEvent lifecycleEvent) {
        return this.view.handleMovingCollapse();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleMovingCollapse$110, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7649F(Boolean bool) {
        if (bool.booleanValue()) {
            this.view.removeBottomCardAnimation();
        } else {
            this.view.addBottomCardAnimation();
        }
    }

    static /* synthetic */ void lambda$handleMovingCollapse$111(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleMovingCollapse$112, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7651G(Throwable th) {
        this.crashReporter.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOutOfSpaceDialogResult$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7653H(View.LifecycleEvent lifecycleEvent) {
        return this.editorialNavigator.outOfSpaceDialogResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOutOfSpaceDialogResult$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7655I(OutOfSpaceNavigatorWrapper outOfSpaceNavigatorWrapper) {
        return this.editorialManager.loadEditorialViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOutOfSpaceDialogResult$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7657J(EditorialViewModel editorialViewModel) {
        return this.editorialManager.resumeDownload(editorialViewModel.getBottomCardMd5(), editorialViewModel.getBottomCardPackageName(), editorialViewModel.getBottomCardAppId(), this.view.getAction(), editorialViewModel.getBdsFlags());
    }

    static /* synthetic */ void lambda$handleOutOfSpaceDialogResult$5(EditorialViewModel editorialViewModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOutOfSpaceDialogResult$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7659K(Throwable th) {
        this.crashReporter.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePlaceHolderVisibility$93, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7661L(View.LifecycleEvent lifecycleEvent) {
        return this.view.isViewReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePlaceHolderVisibility$94, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7662M(Void r1) {
        this.view.managePlaceHolderVisibity();
    }

    static /* synthetic */ void lambda$handlePlaceHolderVisibility$95(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePlaceHolderVisibility$96, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7663N(Throwable th) {
        this.crashReporter.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePlaceHolderVisibilityChange$100, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7664O(ScrollEvent scrollEvent) {
        if (scrollEvent.getItemShown().booleanValue()) {
            this.view.removeBottomCardAnimation();
        } else {
            if (scrollEvent.getItemShown().booleanValue()) {
                return;
            }
            this.view.addBottomCardAnimation();
        }
    }

    static /* synthetic */ void lambda$handlePlaceHolderVisibilityChange$101(ScrollEvent scrollEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePlaceHolderVisibilityChange$102, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7665P(Throwable th) {
        this.crashReporter.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePlaceHolderVisibilityChange$99, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7666Q(View.LifecycleEvent lifecycleEvent) {
        return this.view.placeHolderVisibilityChange();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleReactionButtonClick$121, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7667R(View.LifecycleEvent lifecycleEvent) {
        return this.view.reactionsButtonClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleReactionButtonClick$122, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7668S(Void r1) {
        return this.editorialManager.loadEditorialViewModel();
    }

    static /* synthetic */ void lambda$handleReactionButtonClick$124(LoadReactionModel loadReactionModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleReactionButtonClick$125, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7670U(Throwable th) {
        this.crashReporter.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRetryClick$18, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7671V(Void r1) {
        this.view.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRetryClick$19, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7672W(Void r1) {
        return loadEditorialViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRetryClick$20, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7673X(View.LifecycleEvent lifecycleEvent) {
        return this.view.retryClicked().m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.v1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9121f.m7671V((Void) obj);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.w4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9138f.m7672W((Void) obj);
            }
        });
    }

    static /* synthetic */ void lambda$handleRetryClick$21(EditorialViewModel editorialViewModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSinglePressReactionButton$113, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7674Y(ReactionsResponse reactionsResponse) {
        handleReactionsResponse(reactionsResponse, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSinglePressReactionButton$114, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7675Z(EditorialViewModel editorialViewModel, ReactionsResponse reactionsResponse) {
        return loadReactionModel(editorialViewModel.getCardId(), editorialViewModel.getGroupId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSinglePressReactionButton$115, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7677a0(final EditorialViewModel editorialViewModel, Boolean bool) {
        if (!bool.booleanValue()) {
            return this.editorialManager.deleteReaction(editorialViewModel.getCardId(), editorialViewModel.getGroupId()).m39915A().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.o0
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    this.f9054f.m7674Y((ReactionsResponse) obj);
                }
            }).m40055D(C2640t6.f9108f).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.a4
                @Override // p456rx.p460m.InterfaceC11256e
                public final Object call(Object obj) {
                    return this.f8900f.m7675Z(editorialViewModel, (ReactionsResponse) obj);
                }
            });
        }
        this.editorialAnalytics.sendReactionButtonClickEvent();
        this.view.showReactionsPopup(editorialViewModel.getCardId(), editorialViewModel.getGroupId());
        return C11234e.m40025S(new LoadReactionModel());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSnackLogInClick$139, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7679b0(View.LifecycleEvent lifecycleEvent) {
        return this.view.snackLoginClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSnackLogInClick$140, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7681c0(Void r1) {
        this.editorialNavigator.navigateToLogIn();
    }

    static /* synthetic */ void lambda$handleSnackLogInClick$141(Void r0) {
    }

    static /* synthetic */ void lambda$handleSocialMediaPromotionClick$10(SocialMediaView.SocialMediaType socialMediaType) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSocialMediaPromotionClick$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7683d0(View.LifecycleEvent lifecycleEvent) {
        return this.view.socialMediaClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSocialMediaPromotionClick$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7685e0(SocialMediaView.SocialMediaType socialMediaType) {
        this.editorialNavigator.navigateToSocialMedia(socialMediaType);
        this.socialMediaAnalytics.sendPromoteSocialMediaClickEvent(socialMediaType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUserReaction$127, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7687f0(View.LifecycleEvent lifecycleEvent) {
        return this.view.reactionClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUserReaction$128, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7689g0(ReactionEvent reactionEvent) {
        this.userFeedbackAnalytics.sendReactionEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUserReaction$129, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7691h0(ReactionsResponse reactionsResponse) {
        handleReactionsResponse(reactionsResponse, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUserReaction$130, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7693i0(ReactionEvent reactionEvent, ReactionsResponse reactionsResponse) {
        return loadReactionModel(reactionEvent.getCardId(), reactionEvent.getGroupId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUserReaction$131, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7695j0(final ReactionEvent reactionEvent) {
        return this.editorialManager.setReaction(reactionEvent.getCardId(), reactionEvent.getGroupId(), reactionEvent.getReactionType()).m39915A().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.o6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((ReactionsResponse) obj).differentReaction());
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.f2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8964f.m7691h0((ReactionsResponse) obj);
            }
        }).m40055D(C2640t6.f9108f).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.l2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9028f.m7693i0(reactionEvent, (ReactionsResponse) obj);
            }
        });
    }

    static /* synthetic */ void lambda$handleUserReaction$132(LoadReactionModel loadReactionModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadDownloadApp$77, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7697k0(View.LifecycleEvent lifecycleEvent) {
        return this.view.isViewReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadDownloadApp$78, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7699l0(Void r1) {
        return this.editorialManager.loadEditorialViewModel().m39915A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadDownloadApp$80, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7701m0(EditorialContent editorialContent) {
        C11234e<EditorialDownloadModel> c11234eM40095j0 = this.editorialManager.loadDownloadModel(editorialContent.getMd5sum(), editorialContent.getPackageName(), editorialContent.getVerCode(), editorialContent.getPosition()).m40095j0(this.viewScheduler);
        final EditorialView editorialView = this.view;
        editorialView.getClass();
        return c11234eM40095j0.m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.s6
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                editorialView.showDownloadModel((EditorialDownloadModel) obj);
            }
        });
    }

    static /* synthetic */ void lambda$loadDownloadApp$81(EditorialDownloadModel editorialDownloadModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadEditorialViewModel$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7703n0(EditorialViewModel editorialViewModel) {
        if (!editorialViewModel.isLoading()) {
            this.view.hideLoading();
        }
        if (editorialViewModel.hasError()) {
            this.view.showError(editorialViewModel.getError());
        } else {
            this.view.populateView(editorialViewModel);
        }
    }

    static /* synthetic */ EditorialViewModel lambda$loadEditorialViewModel$16(EditorialViewModel editorialViewModel) {
        return editorialViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadReactionModel$116, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7705o0(LoadReactionModel loadReactionModel) {
        this.view.showTopReactions(loadReactionModel.getMyReaction(), loadReactionModel.getTopReactionList(), loadReactionModel.getTotal());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observeDownloadErrors$83, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7707p0(View.LifecycleEvent lifecycleEvent) {
        return setUpViewModelOnViewReady();
    }

    static /* synthetic */ EditorialViewModel lambda$observeDownloadErrors$84(EditorialViewModel editorialViewModel, EditorialDownloadEvent editorialDownloadEvent) {
        return editorialViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observeDownloadErrors$85, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7709q0(final EditorialViewModel editorialViewModel) {
        return C11234e.m40033a0(this.view.installButtonClick(editorialViewModel), this.view.resumeDownload(editorialViewModel)).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.m2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                EditorialViewModel editorialViewModel2 = editorialViewModel;
                EditorialPresenter.lambda$observeDownloadErrors$84(editorialViewModel2, (EditorialDownloadEvent) obj);
                return editorialViewModel2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observeDownloadErrors$87, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7713s0(EditorialContent editorialContent, EditorialDownloadModel editorialDownloadModel) {
        if (editorialDownloadModel.getDownloadState().equals(DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR)) {
            this.editorialNavigator.navigateToOutOfSpaceDialog(editorialContent.getSize(), editorialContent.getPackageName());
        } else {
            this.view.showDownloadError(editorialDownloadModel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observeDownloadErrors$88, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7715t0(final EditorialContent editorialContent) {
        return this.editorialManager.loadDownloadModel(editorialContent.getMd5sum(), editorialContent.getPackageName(), editorialContent.getVerCode(), editorialContent.getPosition()).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.v6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((EditorialDownloadModel) obj).hasError());
            }
        }).m40057E().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.q1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9077f.m7711r0(editorialContent, (EditorialDownloadModel) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.m1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9036f.m7713s0(editorialContent, (EditorialDownloadModel) obj);
            }
        });
    }

    static /* synthetic */ void lambda$observeDownloadErrors$89(EditorialDownloadModel editorialDownloadModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateLoadAppOfTheWeek$12, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7717u0(View.LifecycleEvent lifecycleEvent) {
        this.view.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateLoadAppOfTheWeek$13, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7719v0(View.LifecycleEvent lifecycleEvent) {
        return loadEditorialViewModel();
    }

    static /* synthetic */ void lambda$onCreateLoadAppOfTheWeek$14(EditorialViewModel editorialViewModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateLoadReactionModel$143, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7721w0(View.LifecycleEvent lifecycleEvent) {
        return setUpViewModelOnViewReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateLoadReactionModel$144, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7723x0(EditorialViewModel editorialViewModel) {
        return loadReactionModel(editorialViewModel.getCardId(), editorialViewModel.getGroupId());
    }

    static /* synthetic */ void lambda$onCreateLoadReactionModel$145(LoadReactionModel loadReactionModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$openInstalledApp$97, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7725y0(String str) {
        this.view.openApp(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$pauseDownload$64, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7727z0(View.LifecycleEvent lifecycleEvent) {
        return setUpViewModelOnViewReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$pauseDownload$65, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7640A0(EditorialDownloadEvent editorialDownloadEvent) {
        this.editorialAnalytics.sendDownloadPauseEvent(editorialDownloadEvent.getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$pauseDownload$66, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7642B0(EditorialDownloadEvent editorialDownloadEvent) {
        return this.editorialManager.pauseDownload(editorialDownloadEvent.getMd5());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$pauseDownload$67, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7644C0(EditorialViewModel editorialViewModel) {
        return this.view.pauseDownload(editorialViewModel).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.t5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9107f.m7640A0((EditorialDownloadEvent) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.s5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9099f.m7642B0((EditorialDownloadEvent) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$pauseDownload$68(EditorialDownloadEvent editorialDownloadEvent) {
    }

    static /* synthetic */ void lambda$pauseDownload$69(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$55, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7646D0(View.LifecycleEvent lifecycleEvent) {
        return setUpViewModelOnViewReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$56, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7648E0(EditorialDownloadEvent editorialDownloadEvent, EditorialViewModel editorialViewModel, Throwable th) {
        this.editorialAnalytics.sendDownloadAbortEvent(editorialDownloadEvent.getPackageName(), editorialDownloadEvent.getVerCode(), editorialDownloadEvent.getAction(), editorialDownloadEvent.getAction().equals(DownloadModel.Action.MIGRATE), !editorialDownloadEvent.getSplits().isEmpty(), editorialViewModel.hasAppc(), editorialDownloadEvent.getTrustedBadge(), editorialDownloadEvent.getStoreName(), false, editorialDownloadEvent.getObb() != null, editorialDownloadEvent.getBdsFlags().contains("STORE_BDS"), HttpUrl.FRAGMENT_ENCODE_SET, editorialDownloadEvent.getSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$57, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7650F0(final EditorialDownloadEvent editorialDownloadEvent, final EditorialViewModel editorialViewModel, Void r4) {
        return this.permissionManager.requestExternalStoragePermission(this.permissionService).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.i4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9000f.m7648E0(editorialDownloadEvent, editorialViewModel, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$58, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7652G0(EditorialDownloadEvent editorialDownloadEvent, Void r9) {
        return this.editorialManager.resumeDownload(editorialDownloadEvent.getMd5(), editorialDownloadEvent.getPackageName(), editorialDownloadEvent.getAppId(), editorialDownloadEvent.getAction().toString(), editorialDownloadEvent.getBdsFlags());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$59, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7654H0(final EditorialViewModel editorialViewModel, final EditorialDownloadEvent editorialDownloadEvent) {
        return this.permissionManager.requestDownloadAccess(this.permissionService).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.c2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8930f.m7650F0(editorialDownloadEvent, editorialViewModel, (Void) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.c5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8935f.m7652G0(editorialDownloadEvent, (Void) obj);
            }
        }).m40110s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$60, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7656I0(final EditorialViewModel editorialViewModel) {
        return this.view.resumeDownload(editorialViewModel).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.r1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9086f.m7654H0(editorialViewModel, (EditorialDownloadEvent) obj);
            }
        });
    }

    static /* synthetic */ void lambda$resumeDownload$61(Void r0) {
    }

    static /* synthetic */ void lambda$resumeDownload$62(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setUpViewModelOnViewReady$119, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7658J0(Void r1) {
        return this.editorialManager.loadEditorialViewModel().m39915A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$verifyNotEnoughSpaceError$90, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7660K0(EditorialContent editorialContent, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        this.editorialAnalytics.sendNotEnoughSpaceErrorEvent(editorialContent.getMd5sum());
    }

    static /* synthetic */ EditorialDownloadModel lambda$verifyNotEnoughSpaceError$91(EditorialDownloadModel editorialDownloadModel, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        return editorialDownloadModel;
    }

    private Single<EditorialViewModel> loadEditorialViewModel() {
        return this.editorialManager.loadEditorialViewModel().m39924p(this.viewScheduler).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.a1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8897f.m7703n0((EditorialViewModel) obj);
            }
        }).m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.q5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                EditorialViewModel editorialViewModel = (EditorialViewModel) obj;
                EditorialPresenter.lambda$loadEditorialViewModel$16(editorialViewModel);
                return editorialViewModel;
            }
        });
    }

    private Single<LoadReactionModel> loadReactionModel(String str, String str2) {
        return this.editorialManager.loadReactionModel(str, str2).m39924p(this.viewScheduler).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.r5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9091f.m7705o0((LoadReactionModel) obj);
            }
        });
    }

    private C11231b openInstalledApp(final String str) {
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.editorial.e1
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f8953f.m7725y0(str);
            }
        });
    }

    private void pauseDownload() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.t4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.k1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9017f.m7727z0((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.x1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9146f.m7644C0((EditorialViewModel) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.b6
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialPresenter.lambda$pauseDownload$68((EditorialDownloadEvent) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.q0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialPresenter.lambda$pauseDownload$69((Throwable) obj);
            }
        });
    }

    private void resumeDownload() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.d3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.q3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9080f.m7646D0((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.s1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9095f.m7656I0((EditorialViewModel) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.f4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialPresenter.lambda$resumeDownload$61((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.c1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialPresenter.lambda$resumeDownload$62((Throwable) obj);
            }
        });
    }

    private C11234e<EditorialViewModel> setUpViewModelOnViewReady() {
        return this.view.isViewReady().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.p0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9062f.m7658J0((Void) obj);
            }
        }).m40095j0(this.viewScheduler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: verifyNotEnoughSpaceError, reason: merged with bridge method [inline-methods] */
    public C11234e<EditorialDownloadModel> m7711r0(final EditorialContent editorialContent, final EditorialDownloadModel editorialDownloadModel) {
        return editorialDownloadModel.getDownloadState() == DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR ? this.moPubAdsManager.getAdsVisibilityStatus().m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.u1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9111f.m7660K0(editorialContent, (WalletAdsOfferManager.OfferResponseStatus) obj);
            }
        }).m39915A().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.n0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                EditorialDownloadModel editorialDownloadModel2 = editorialDownloadModel;
                EditorialPresenter.lambda$verifyNotEnoughSpaceError$91(editorialDownloadModel2, (WalletAdsOfferManager.OfferResponseStatus) obj);
                return editorialDownloadModel2;
            }
        }) : C11234e.m40025S(editorialDownloadModel);
    }

    public void handleClickActionButtonCard() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.b2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.d4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8947f.m7696k((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.k4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9020f.m7698l((EditorialEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2523f1 c2523f1 = new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.f1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handleClickActionButtonCard$33((EditorialEvent) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c2523f1, new C2489b(crashReport));
    }

    public void handleClickOnAppCard() {
        C11234e<R> c11234eM40060G = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.s0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.x0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9145f.m7700m((View.LifecycleEvent) obj);
            }
        });
        final EditorialView editorialView = this.view;
        editorialView.getClass();
        C11234e c11234eM40091f = c11234eM40060G.m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.u6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return editorialView.appCardClicked((EditorialViewModel) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.a5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8902f.m7702n((EditorialEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2684z3 c2684z3 = new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.z3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handleClickOnAppCard$29((EditorialEvent) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c2684z3, new C2489b(crashReport));
    }

    public void handleClickOnMedia() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.f5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.n4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9050f.m7704o((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.y3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9173f.m7706p((EditorialEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2681z0 c2681z0 = new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.z0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handleClickOnMedia$25((EditorialEvent) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c2681z0, new C2489b(crashReport));
    }

    public void handleLongPressReactionButton() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.u5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.h2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8984f.m7726z((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.w2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9136f.m7639A((Void) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.x2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9147f.m7641B((EditorialViewModel) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2571l1 c2571l1 = new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.l1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handleLongPressReactionButton$137((EditorialViewModel) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c2571l1, new C2489b(crashReport));
    }

    public void handleMediaListDescriptionVisibility() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.r3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.a3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8899f.m7643C((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.viewScheduler).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.v0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((EditorialEvent) obj).getFirstVisiblePosition() >= 0);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.x5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9150f.m7645D((EditorialEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2518e4 c2518e4 = new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.e4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handleMediaListDescriptionVisibility$107((EditorialEvent) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c2518e4, new C2489b(crashReport));
    }

    public void handleMovingCollapse() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.g1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.o4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9058f.m7647E((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.k3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9019f.m7649F((Boolean) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.j2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handleMovingCollapse$111((Boolean) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.q2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9079f.m7651G((Throwable) obj);
            }
        });
    }

    public void handlePlaceHolderVisibility() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.r0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.v5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9128f.m7661L((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.i5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9003f.m7662M((Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.d1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handlePlaceHolderVisibility$95((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.y5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9175f.m7663N((Throwable) obj);
            }
        });
    }

    public void handlePlaceHolderVisibilityChange() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.t0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.c4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8934f.m7666Q((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.f3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8965f.m7664O((ScrollEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.n2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handlePlaceHolderVisibilityChange$101((ScrollEvent) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.e3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8956f.m7665P((Throwable) obj);
            }
        });
    }

    public void handleReactionButtonClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.y4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.n1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9046f.m7667R((View.LifecycleEvent) obj);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.y0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9169f.m7668S((Void) obj);
            }
        }).m40095j0(this.viewScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.h3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8985f.m7669T((EditorialViewModel) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.u4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handleReactionButtonClick$124((LoadReactionModel) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.u3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9115f.m7670U((Throwable) obj);
            }
        });
    }

    public void handleRetryClick() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.u0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.o5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9059f.m7673X((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2614q4 c2614q4 = new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.q4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handleRetryClick$21((EditorialViewModel) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c2614q4, new C2489b(crashReport));
    }

    public void handleSnackLogInClick() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.s3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.m3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9039f.m7679b0((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.w1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9135f.m7681c0((Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2582m4 c2582m4 = new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.m4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handleSnackLogInClick$141((Void) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c2582m4, new C2489b(crashReport));
    }

    public void handleUserReaction() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.j3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.g4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8978f.m7687f0((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.b4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8910f.m7689g0((ReactionEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.w3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9137f.m7695j0((ReactionEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2654v4 c2654v4 = new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.v4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialPresenter.lambda$handleUserReaction$132((LoadReactionModel) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c2654v4, new C2489b(crashReport));
    }

    public void loadDownloadApp() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.b1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.z4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9197f.m7697k0((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.v2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9122f.m7699l0((Void) obj);
            }
        }).m40066J(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.a2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((EditorialViewModel) obj).getPlaceHolderContent();
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.e5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8958f.m7701m0((EditorialContent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2675y1 c2675y1 = new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.y1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialPresenter.lambda$loadDownloadApp$81((EditorialDownloadModel) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c2675y1, new C2489b(crashReport));
    }

    public void observeDownloadErrors() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.x4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.t2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9104f.m7707p0((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.h5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8987f.m7709q0((EditorialViewModel) obj);
            }
        }).m40066J(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.w6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((EditorialViewModel) obj).getPlaceHolderContent();
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.p2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9066f.m7715t0((EditorialContent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2488a6 c2488a6 = new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.a6
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialPresenter.lambda$observeDownloadErrors$89((EditorialDownloadModel) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c2488a6, new C2489b(crashReport));
    }

    public void onCreateLoadAppOfTheWeek() {
        C11234e<R> c11234eM40070L = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.o3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.j1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9008f.m7717u0((View.LifecycleEvent) obj);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.l3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9030f.m7719v0((View.LifecycleEvent) obj);
            }
        });
        C2669x3 c2669x3 = new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.x3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialPresenter.lambda$onCreateLoadAppOfTheWeek$14((EditorialViewModel) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40070L.m40063H0(c2669x3, new C2489b(crashReport));
    }

    public void onCreateLoadReactionModel() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.s4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.o1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9055f.m7721w0((View.LifecycleEvent) obj);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorial.m5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9041f.m7723x0((EditorialViewModel) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2516e2 c2516e2 = new InterfaceC11253b() { // from class: cm.aptoide.pt.editorial.e2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialPresenter.lambda$onCreateLoadReactionModel$145((LoadReactionModel) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c2516e2, new C2489b(crashReport));
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        onCreateLoadAppOfTheWeek();
        handleRetryClick();
        handleClickOnMedia();
        handleClickOnAppCard();
        handleInstallClick();
        observeDownloadErrors();
        pauseDownload();
        resumeDownload();
        cancelDownload();
        loadDownloadApp();
        handlePlaceHolderVisibilityChange();
        handlePlaceHolderVisibility();
        handleMediaListDescriptionVisibility();
        handleClickActionButtonCard();
        handleMovingCollapse();
        handleReactionButtonClick();
        handleUserReaction();
        handleLongPressReactionButton();
        handleSnackLogInClick();
        onCreateLoadReactionModel();
        handleSocialMediaPromotionClick();
        handleOutOfSpaceDialogResult();
    }
}
