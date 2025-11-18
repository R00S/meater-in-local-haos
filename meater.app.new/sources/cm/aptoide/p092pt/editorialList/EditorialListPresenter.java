package cm.aptoide.p092pt.editorialList;

import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.UserFeedbackAnalytics;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.editorialList.EditorialCardListModel;
import cm.aptoide.p092pt.home.bundles.editorial.EditorialHomeEvent;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.reactions.ReactionsHomeEvent;
import cm.aptoide.p092pt.reactions.network.ReactionsResponse;
import p456rx.AbstractC11243h;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class EditorialListPresenter implements Presenter {
    private final AptoideAccountManager accountManager;
    private final CrashReport crashReporter;
    private final EditorialListAnalytics editorialListAnalytics;
    private final EditorialListManager editorialListManager;
    private final EditorialListNavigator editorialListNavigator;
    private final UserFeedbackAnalytics userFeedbackAnalytics;
    private final EditorialListView view;
    private final AbstractC11243h viewScheduler;

    public EditorialListPresenter(EditorialListView editorialListView, EditorialListManager editorialListManager, AptoideAccountManager aptoideAccountManager, EditorialListNavigator editorialListNavigator, EditorialListAnalytics editorialListAnalytics, CrashReport crashReport, AbstractC11243h abstractC11243h, UserFeedbackAnalytics userFeedbackAnalytics) {
        this.view = editorialListView;
        this.editorialListManager = editorialListManager;
        this.accountManager = aptoideAccountManager;
        this.editorialListNavigator = editorialListNavigator;
        this.editorialListAnalytics = editorialListAnalytics;
        this.crashReporter = crashReport;
        this.viewScheduler = abstractC11243h;
        this.userFeedbackAnalytics = userFeedbackAnalytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getUserAvatar, reason: merged with bridge method [inline-methods] */
    public C11234e<String> m7768M(Account account) {
        return C11234e.m40025S((account == null || !account.isLoggedIn()) ? null : account.getAvatar());
    }

    private void handleReactionsResponse(ReactionsResponse reactionsResponse, boolean z) {
        if (reactionsResponse.wasSuccess()) {
            if (z) {
                this.editorialListAnalytics.sendDeleteEvent();
                return;
            } else {
                this.editorialListAnalytics.sendReactedEvent();
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
    public C11234e<CurationCard> handleSinglePressReactionButton(final EditorialHomeEvent editorialHomeEvent) {
        return this.editorialListManager.isFirstReaction(editorialHomeEvent.getCardId(), editorialHomeEvent.getGroupId()).m39922k(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.j2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9241f.m7794x(editorialHomeEvent, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBottomReached$31, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m7772b(Object obj) {
        return Boolean.valueOf(this.editorialListManager.hasMore());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBottomReached$32, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7773c(Object obj) {
        this.view.showLoadMore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBottomReached$33, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7774d(Object obj) {
        return loadEditorialAndReactions(true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBottomReached$34, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7775e(View.LifecycleEvent lifecycleEvent) {
        return this.view.reachesBottom().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.m2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9254f.m7772b(obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.c1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9211f.m7773c(obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.g2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9228f.m7774d(obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleBottomReached$35(CurationCard curationCard) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBottomReached$36, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7776f(Throwable th) {
        this.crashReporter.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleEditorialCardClick$13, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7777g(EditorialHomeEvent editorialHomeEvent) {
        this.editorialListAnalytics.sendEditorialInteractEvent(editorialHomeEvent.getCardId(), editorialHomeEvent.getBundlePosition());
        this.editorialListNavigator.navigateToEditorial(editorialHomeEvent.getCardId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleEditorialCardClick$14, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7778h(View.LifecycleEvent lifecycleEvent) {
        return this.view.editorialCardClicked().m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.n1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9257f.m7777g((EditorialHomeEvent) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleEditorialCardClick$15(EditorialHomeEvent editorialHomeEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleEditorialCardClick$16, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7779i(Throwable th) {
        this.crashReporter.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleImpressions$27, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7780j(EditorialListEvent editorialListEvent) {
        this.editorialListAnalytics.sendEditorialImpressionEvent(editorialListEvent.getCardId(), editorialListEvent.getPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleImpressions$28, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7781k(View.LifecycleEvent lifecycleEvent) {
        return this.view.visibleCards().m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.d2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9216f.m7780j((EditorialListEvent) obj);
            }
        });
    }

    static /* synthetic */ void lambda$handleImpressions$29(EditorialListEvent editorialListEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleLongPressReactionButton$48, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7782l(View.LifecycleEvent lifecycleEvent) {
        return this.view.reactionButtonLongPress();
    }

    static /* synthetic */ void lambda$handleLongPressReactionButton$50(EditorialHomeEvent editorialHomeEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOnDismissPopup$52, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7784n(View.LifecycleEvent lifecycleEvent) {
        return this.view.onPopupDismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOnDismissPopup$53, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7785o(EditorialHomeEvent editorialHomeEvent) {
        this.view.setScrollEnabled(Boolean.TRUE);
    }

    static /* synthetic */ void lambda$handleOnDismissPopup$54(EditorialHomeEvent editorialHomeEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePullToRefresh$18, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7786p(Void r2) {
        return loadEditorialAndReactions(false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePullToRefresh$19, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7787q(View.LifecycleEvent lifecycleEvent) {
        return this.view.refreshes().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.t1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9281f.m7786p((Void) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handlePullToRefresh$20(CurationCard curationCard) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleReactionButtonClick$45, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7788r(View.LifecycleEvent lifecycleEvent) {
        return this.view.reactionsButtonClicked();
    }

    static /* synthetic */ void lambda$handleReactionButtonClick$46(CurationCard curationCard) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRetryClick$22, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7789s(Void r1) {
        this.view.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRetryClick$23, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7790t(Void r2) {
        return loadEditorialAndReactions(false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRetryClick$24, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7791u(View.LifecycleEvent lifecycleEvent) {
        return this.view.retryClicked().m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.u1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9284f.m7789s((Void) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.w0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9292f.m7790t((Void) obj);
            }
        });
    }

    static /* synthetic */ void lambda$handleRetryClick$25(CurationCard curationCard) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSinglePressReactionButton$66, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7792v(ReactionsResponse reactionsResponse) {
        handleReactionsResponse(reactionsResponse, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSinglePressReactionButton$67, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7793w(EditorialHomeEvent editorialHomeEvent, ReactionsResponse reactionsResponse) {
        return loadReactionModel(editorialHomeEvent.getCardId(), editorialHomeEvent.getGroupId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSinglePressReactionButton$68, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7794x(final EditorialHomeEvent editorialHomeEvent, Boolean bool) {
        if (!bool.booleanValue()) {
            return this.editorialListManager.deleteReaction(editorialHomeEvent.getCardId(), editorialHomeEvent.getGroupId()).m39915A().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.z0
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    this.f9302f.m7792v((ReactionsResponse) obj);
                }
            }).m40055D(C2758r2.f9274f).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.y0
                @Override // p456rx.p460m.InterfaceC11256e
                public final Object call(Object obj) {
                    return this.f9298f.m7793w(editorialHomeEvent, (ReactionsResponse) obj);
                }
            });
        }
        lambda$handleLongPressReactionButton$49(editorialHomeEvent);
        return C11234e.m40025S(new CurationCard());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSnackLogInClick$63, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7795y(View.LifecycleEvent lifecycleEvent) {
        return this.view.snackLogInClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSnackLogInClick$64, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7796z(Void r1) {
        this.editorialListNavigator.navigateToLogIn();
    }

    static /* synthetic */ void lambda$handleSnackLogInClick$65(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUserImageClick$40, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7756A(Void r1) {
        this.editorialListNavigator.navigateToMyAccount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUserImageClick$41, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7757B(View.LifecycleEvent lifecycleEvent) {
        return this.view.imageClick().m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.k0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9244f.m7756A((Void) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleUserImageClick$42(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUserImageClick$43, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7758C(Throwable th) {
        this.crashReporter.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUserReaction$56, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7759D(View.LifecycleEvent lifecycleEvent) {
        return this.view.reactionClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUserReaction$57, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7760E(ReactionsHomeEvent reactionsHomeEvent) {
        this.userFeedbackAnalytics.sendReactionEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUserReaction$58, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7761F(ReactionsResponse reactionsResponse) {
        handleReactionsResponse(reactionsResponse, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUserReaction$59, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7762G(ReactionsHomeEvent reactionsHomeEvent, ReactionsResponse reactionsResponse) {
        return loadReactionModel(reactionsHomeEvent.getCardId(), reactionsHomeEvent.getGroupId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUserReaction$60, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7763H(final ReactionsHomeEvent reactionsHomeEvent) {
        return this.editorialListManager.setReaction(reactionsHomeEvent.getCardId(), reactionsHomeEvent.getGroupId(), reactionsHomeEvent.getReaction()).m39915A().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.p2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((ReactionsResponse) obj).differentReaction());
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.d1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9215f.m7761F((ReactionsResponse) obj);
            }
        }).m40055D(C2758r2.f9274f).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.t0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9279f.m7762G(reactionsHomeEvent, (ReactionsResponse) obj);
            }
        });
    }

    static /* synthetic */ void lambda$handleUserReaction$61(CurationCard curationCard) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadEditorialAndReactions$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7764I(CurationCard curationCard) {
        return loadReactionModel(curationCard.getId(), curationCard.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadEditorialListModel$37, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7765J(boolean z, EditorialListModel editorialListModel) {
        if (!editorialListModel.getEditorialCardListModel().isLoading()) {
            this.view.hideLoading();
        }
        if (editorialListModel.getEditorialCardListModel().hasError()) {
            if (editorialListModel.getEditorialCardListModel().getError() == EditorialCardListModel.Error.NETWORK) {
                this.view.showNetworkError();
            } else {
                this.view.showGenericError();
            }
        } else if (z) {
            this.view.hideRefresh();
            this.view.update(editorialListModel.getEditorialCardListModel().getCurationCards());
        } else {
            this.view.populateView(editorialListModel.getEditorialCardListModel().getCurationCards(), editorialListModel.getBonusAppcModel());
        }
        this.view.hideLoadMore();
    }

    static /* synthetic */ EditorialListModel lambda$loadEditorialListModel$38(EditorialListModel editorialListModel) {
        return editorialListModel;
    }

    static /* synthetic */ void lambda$loadUserImage$10(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadUserImage$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7766K(Throwable th) {
        this.crashReporter.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadUserImage$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7767L(View.LifecycleEvent lifecycleEvent) {
        return this.accountManager.accountStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadUserImage$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7769N(String str) {
        if (str != null) {
            this.view.setUserImage(str);
        } else {
            this.view.setDefaultUserImage();
        }
        this.view.showAvatar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateLoadViewModel$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7770O(View.LifecycleEvent lifecycleEvent) {
        this.view.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateLoadViewModel$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7771P(View.LifecycleEvent lifecycleEvent) {
        return loadEditorialAndReactions(false, false);
    }

    static /* synthetic */ void lambda$onCreateLoadViewModel$3(CurationCard curationCard) {
    }

    private C11234e<CurationCard> loadEditorialAndReactions(boolean z, boolean z2) {
        return loadEditorialListModel(z, z2).m39915A().m40066J(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.i0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((EditorialListModel) obj).getEditorialCardListModel().getCurationCards();
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.h0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9230f.m7764I((CurationCard) obj);
            }
        });
    }

    private Single<EditorialListModel> loadEditorialListModel(boolean z, final boolean z2) {
        return this.editorialListManager.loadEditorialListModel(z, z2).m39924p(this.viewScheduler).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.h1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9231f.m7765J(z2, (EditorialListModel) obj);
            }
        }).m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.k2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                EditorialListModel editorialListModel = (EditorialListModel) obj;
                EditorialListPresenter.lambda$loadEditorialListModel$38(editorialListModel);
                return editorialListModel;
            }
        });
    }

    private Single<CurationCard> loadReactionModel(String str, String str2) {
        Single<CurationCard> singleM39924p = this.editorialListManager.loadReactionModel(str, str2).m39924p(this.viewScheduler);
        final EditorialListView editorialListView = this.view;
        editorialListView.getClass();
        return singleM39924p.m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.q2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                editorialListView.updateEditorialCard((CurationCard) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showReactions, reason: merged with bridge method [inline-methods] */
    public void m7783m(EditorialHomeEvent editorialHomeEvent) {
        this.editorialListAnalytics.sendReactionButtonClickEvent();
        this.view.showReactionsPopup(editorialHomeEvent.getCardId(), editorialHomeEvent.getGroupId(), editorialHomeEvent.getBundlePosition());
    }

    public void handleBottomReached() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.h2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.q1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9269f.m7775e((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.x0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialListPresenter.lambda$handleBottomReached$35((CurationCard) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.y
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9297f.m7776f((Throwable) obj);
            }
        });
    }

    public void handleEditorialCardClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.e1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.x1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9296f.m7778h((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.b2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialListPresenter.lambda$handleEditorialCardClick$15((EditorialHomeEvent) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.v0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9288f.m7779i((Throwable) obj);
            }
        });
    }

    public void handleImpressions() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.f1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.i1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9236f.m7781k((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2748p0 c2748p0 = new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.p0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialListPresenter.lambda$handleImpressions$29((EditorialListEvent) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c2748p0, new C2687a(crashReport));
    }

    void handleLongPressReactionButton() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.j1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.j0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9239f.m7782l((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.s1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9277f.m7783m((EditorialHomeEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2757r1 c2757r1 = new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.r1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialListPresenter.lambda$handleLongPressReactionButton$50((EditorialHomeEvent) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c2757r1, new C2687a(crashReport));
    }

    void handleOnDismissPopup() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.w1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.g0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9226f.m7784n((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.s0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9276f.m7785o((EditorialHomeEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2734l2 c2734l2 = new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.l2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialListPresenter.lambda$handleOnDismissPopup$54((EditorialHomeEvent) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c2734l2, new C2687a(crashReport));
    }

    public void handlePullToRefresh() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.q0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.x
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9294f.m7787q((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2706e2 c2706e2 = new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.e2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialListPresenter.lambda$handlePullToRefresh$20((CurationCard) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c2706e2, new C2687a(crashReport));
    }

    public void handleReactionButtonClick() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.i2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.v1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9289f.m7788r((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.viewScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.o0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9260f.handleSinglePressReactionButton((EditorialHomeEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2742n2 c2742n2 = new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.n2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialListPresenter.lambda$handleReactionButtonClick$46((CurationCard) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c2742n2, new C2687a(crashReport));
    }

    public void handleRetryClick() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.z1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.d0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9214f.m7791u((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2736m0 c2736m0 = new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.m0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialListPresenter.lambda$handleRetryClick$25((CurationCard) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c2736m0, new C2687a(crashReport));
    }

    public void handleSnackLogInClick() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.o1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.a0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9201f.m7795y((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.l0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9248f.m7796z((Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2746o2 c2746o2 = new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.o2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialListPresenter.lambda$handleSnackLogInClick$65((Void) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c2746o2, new C2687a(crashReport));
    }

    public void handleUserImageClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.z
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.f2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9224f.m7757B((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.b1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialListPresenter.lambda$handleUserImageClick$42((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.c0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9210f.m7758C((Throwable) obj);
            }
        });
    }

    public void handleUserReaction() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.e0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.y1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9300f.m7759D((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.l1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9249f.m7760E((ReactionsHomeEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.m1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9253f.m7763H((ReactionsHomeEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2756r0 c2756r0 = new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.r0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialListPresenter.lambda$handleUserReaction$61((CurationCard) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c2756r0, new C2687a(crashReport));
    }

    public void loadUserImage() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.b0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.k1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9245f.m7767L((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.u0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9283f.m7768M((Account) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.a1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9202f.m7769N((String) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.g1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialListPresenter.lambda$loadUserImage$10((String) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.f0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9222f.m7766K((Throwable) obj);
            }
        });
    }

    public void onCreateLoadViewModel() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.a2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.c2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f9212f.m7770O((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.editorialList.p1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9265f.m7771P((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2740n0 c2740n0 = new InterfaceC11253b() { // from class: cm.aptoide.pt.editorialList.n0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EditorialListPresenter.lambda$onCreateLoadViewModel$3((CurationCard) obj);
            }
        };
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c2740n0, new C2687a(crashReport));
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        onCreateLoadViewModel();
        handleImpressions();
        handleEditorialCardClick();
        handlePullToRefresh();
        handleRetryClick();
        handleBottomReached();
        handleUserImageClick();
        loadUserImage();
        handleReactionButtonClick();
        handleLongPressReactionButton();
        handleUserReaction();
        handleSnackLogInClick();
        handleOnDismissPopup();
    }
}
