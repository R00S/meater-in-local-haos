package cm.aptoide.p092pt.promotions;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import cm.aptoide.p092pt.install.installer.RootCommandOnSubscribe;
import cm.aptoide.p092pt.navigator.Result;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.promotions.ClaimStatusWrapper;
import java.util.List;
import p241e.p294g.p295a.p305d.C8982b;
import p456rx.AbstractC11243h;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p474t.C11426b;

/* loaded from: classes.dex */
public class ClaimPromotionDialogPresenter implements Presenter {
    private static final String WALLET_ADDRESS = "WALLET_ADDRESS";
    private static final int WALLET_VERIFICATION_RESULT_CANCELED = 1;
    private static final int WALLET_VERIFICATION_RESULT_FAILED = 2;
    private static final int WALLET_VERIFICATION_RESULT_OK = 0;
    private ClaimPromotionsManager claimPromotionsManager;
    private ClaimPromotionsNavigator navigator;
    private PromotionsAnalytics promotionsAnalytics;
    private boolean shouldSendIntent = true;
    private C11426b subscriptions;
    private ClaimPromotionDialogView view;
    private AbstractC11243h viewScheduler;

    public ClaimPromotionDialogPresenter(ClaimPromotionDialogView claimPromotionDialogView, C11426b c11426b, AbstractC11243h abstractC11243h, ClaimPromotionsManager claimPromotionsManager, PromotionsAnalytics promotionsAnalytics, ClaimPromotionsNavigator claimPromotionsNavigator) {
        this.view = claimPromotionDialogView;
        this.subscriptions = c11426b;
        this.viewScheduler = abstractC11243h;
        this.claimPromotionsManager = claimPromotionsManager;
        this.promotionsAnalytics = promotionsAnalytics;
        this.navigator = claimPromotionsNavigator;
    }

    private Single<String> claimPromotion() {
        return this.claimPromotionsManager.claimPromotion().m39924p(this.viewScheduler).m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.r0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10855f.m8474b((ClaimStatusWrapper) obj);
            }
        });
    }

    private void handleContinueClick() {
        this.subscriptions.m40667a(this.view.continueWalletClick().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.i0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10768f.m8475c((ClaimPromotionsClickWrapper) obj);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.s0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10866f.m8476d((ClaimPromotionsClickWrapper) obj);
            }
        }).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.d0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.lambda$handleContinueClick$31((String) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.y
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.lambda$handleContinueClick$32((Throwable) obj);
            }
        }));
    }

    private void handleDismissGenericError() {
        this.subscriptions.m40667a(this.view.dismissGenericErrorClick().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.j0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10776f.m8477e((Void) obj);
            }
        }).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.t
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.lambda$handleDismissGenericError$38((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.u
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10882f.m8478f((Throwable) obj);
            }
        }));
    }

    private void handleDismissGenericMessage() {
        this.subscriptions.m40667a(this.view.dismissGenericMessage().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.n
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10815f.m8479g((ClaimDialogResultWrapper) obj);
            }
        }).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.a0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.lambda$handleDismissGenericMessage$44((ClaimDialogResultWrapper) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.b0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10701f.m8480h((Throwable) obj);
            }
        }));
    }

    private String handleErrors(List<ClaimStatusWrapper.Error> list) {
        if (list.contains(ClaimStatusWrapper.Error.PROMOTION_CLAIMED)) {
            this.view.showPromotionAlreadyClaimed();
            return "error";
        }
        if (list.contains(ClaimStatusWrapper.Error.WRONG_ADDRESS)) {
            this.view.showInvalidWalletAddress();
            return "error";
        }
        if (list.contains(ClaimStatusWrapper.Error.WALLET_NOT_VERIFIED)) {
            this.view.verifyWallet();
            return "error";
        }
        this.view.showGenericError();
        return "error";
    }

    private void handleFindAddressClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.x0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40095j0(this.viewScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.w0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10901f.m8483k((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.g
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.lambda$handleFindAddressClick$27((String) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.p
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.lambda$handleFindAddressClick$28((Throwable) obj);
            }
        });
    }

    private void handleOnEditTextChanged() {
        this.subscriptions.m40667a(this.view.editTextChanges().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.e0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10730f.m8484l((C8982b) obj);
            }
        }).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.k
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.lambda$handleOnEditTextChanged$35((C8982b) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.m0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10806f.m8485m((Throwable) obj);
            }
        }));
    }

    private void handleOnResumeEvent() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.o
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.RESUME);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.s
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10865f.m8486n((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.q0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.lambda$handleOnResumeEvent$17((View.LifecycleEvent) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.j
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.lambda$handleOnResumeEvent$18((Throwable) obj);
            }
        });
    }

    private void handleUpdateWallet() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.h0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40095j0(this.viewScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.w
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10900f.m8487o((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.e
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10729f.m8488p((Void) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.n0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10816f.m8489q((Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.k0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.lambda$handleUpdateWallet$4((Void) obj);
            }
        }, C4100x6.f10915f);
    }

    private void handleUpdateWalletCancelClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.h
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40095j0(this.viewScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.y0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10917f.m8490r((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.c0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10711f.m8491s((Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.v0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.lambda$handleUpdateWalletCancelClick$8((Void) obj);
            }
        }, C4100x6.f10915f);
    }

    private void handleWalletCancelClick() {
        this.subscriptions.m40667a(this.view.walletCancelClick().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.o0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10827f.m8492t((String) obj);
            }
        }).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.x
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.lambda$handleWalletCancelClick$41((String) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.u0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10883f.m8493u((Throwable) obj);
            }
        }));
    }

    private void handleWalletPermissionsResult() {
        this.view.getActivityResults().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.l
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((Result) obj).getRequestCode() == 123);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.l0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10797f.m8494v((Result) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.t0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.lambda$handleWalletPermissionsResult$21((Result) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.v
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10891f.m8495w((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleWalletVerificationErrors(Integer num) {
        if (num.intValue() == 1) {
            this.view.showCanceledVerificationError();
        } else if (num.equals(2)) {
            this.view.showGenericError();
        }
    }

    private void handleWalletVerificationResult() {
        this.view.getActivityResults().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.i
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((Result) obj).getRequestCode() == 124);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.y6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Integer.valueOf(((Result) obj).getResultCode());
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.z
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10926f.handleWalletVerificationErrors((Integer) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.f0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() == 0);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.f
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10738f.m8496x((Integer) obj);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.m
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10805f.m8497y((Integer) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.q
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ClaimPromotionDialogPresenter.lambda$handleWalletVerificationResult$13((String) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.g0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10750f.m8498z((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$claimPromotion$33, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8474b(ClaimStatusWrapper claimStatusWrapper) {
        if (!claimStatusWrapper.getStatus().equals(ClaimStatusWrapper.Status.OK)) {
            return Single.m39913m(handleErrors(claimStatusWrapper.getErrors()));
        }
        this.view.showClaimSuccess();
        return Single.m39913m(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleContinueClick$29, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8475c(ClaimPromotionsClickWrapper claimPromotionsClickWrapper) {
        this.promotionsAnalytics.sendClickOnWalletDialogNext(claimPromotionsClickWrapper.getPackageName());
        this.claimPromotionsManager.saveWalletAddress(claimPromotionsClickWrapper.getWalletAddress());
        this.view.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleContinueClick$30, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8476d(ClaimPromotionsClickWrapper claimPromotionsClickWrapper) {
        return claimPromotion();
    }

    static /* synthetic */ void lambda$handleContinueClick$31(String str) {
    }

    static /* synthetic */ void lambda$handleContinueClick$32(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDismissGenericError$37, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8477e(Void r1) {
        this.view.dismissDialog();
    }

    static /* synthetic */ void lambda$handleDismissGenericError$38(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDismissGenericError$39, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8478f(Throwable th) {
        this.view.showGenericError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDismissGenericMessage$43, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8479g(ClaimDialogResultWrapper claimDialogResultWrapper) {
        this.navigator.popDialogWithResult(claimDialogResultWrapper.getPackageName(), claimDialogResultWrapper.isOk() ? -1 : 0);
        this.view.dismissDialog();
    }

    static /* synthetic */ void lambda$handleDismissGenericMessage$44(ClaimDialogResultWrapper claimDialogResultWrapper) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDismissGenericMessage$45, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8480h(Throwable th) {
        this.view.showGenericError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFindAddressClick$24, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8481i(String str) {
        this.promotionsAnalytics.sendClickOnWalletDialogFindWallet(str);
        this.view.fetchWalletAddressByIntent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFindAddressClick$25, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8482j(Throwable th) {
        this.shouldSendIntent = false;
        this.view.sendWalletIntent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFindAddressClick$26, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8483k(View.LifecycleEvent lifecycleEvent) {
        return this.view.getWalletClick().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.p0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10837f.m8481i((String) obj);
            }
        }).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.promotions.r
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10854f.m8482j((Throwable) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleFindAddressClick$27(String str) {
    }

    static /* synthetic */ void lambda$handleFindAddressClick$28(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOnEditTextChanged$34, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8484l(C8982b c8982b) {
        this.view.handleEmptyEditText(c8982b.m28584c());
    }

    static /* synthetic */ void lambda$handleOnEditTextChanged$35(C8982b c8982b) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOnEditTextChanged$36, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8485m(Throwable th) {
        this.view.showGenericError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOnResumeEvent$16, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8486n(View.LifecycleEvent lifecycleEvent) {
        if (this.shouldSendIntent) {
            return;
        }
        this.view.fetchWalletAddressByClipboard();
    }

    static /* synthetic */ void lambda$handleOnResumeEvent$17(View.LifecycleEvent lifecycleEvent) {
    }

    static /* synthetic */ void lambda$handleOnResumeEvent$18(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUpdateWallet$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8487o(View.LifecycleEvent lifecycleEvent) {
        return this.view.onUpdateWalletClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUpdateWallet$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8488p(Void r1) {
        this.navigator.navigateToWalletAppView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUpdateWallet$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8489q(Void r1) {
        this.view.dismissDialog();
    }

    static /* synthetic */ void lambda$handleUpdateWallet$4(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUpdateWalletCancelClick$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8490r(View.LifecycleEvent lifecycleEvent) {
        return this.view.onCancelWalletUpdate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleUpdateWalletCancelClick$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8491s(Void r1) {
        this.view.dismissDialog();
    }

    static /* synthetic */ void lambda$handleUpdateWalletCancelClick$8(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleWalletCancelClick$40, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8492t(String str) {
        this.promotionsAnalytics.sendClickOnWalletDialogCancel(str);
        this.navigator.popDialogWithResult(str, 0);
        this.view.dismissDialog();
    }

    static /* synthetic */ void lambda$handleWalletCancelClick$41(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleWalletCancelClick$42, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8493u(Throwable th) {
        this.view.showGenericError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleWalletPermissionsResult$20, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8494v(Result result) {
        if (result.getResultCode() != -1) {
            if (result.getResultCode() != 0) {
                this.shouldSendIntent = false;
                this.view.sendWalletIntent();
                return;
            }
            return;
        }
        Intent data = result.getData();
        if (data != null && data.getExtras() != null) {
            this.view.updateWalletText(data.getExtras().getString(WALLET_ADDRESS));
        } else {
            this.shouldSendIntent = false;
            this.view.sendWalletIntent();
        }
    }

    static /* synthetic */ void lambda$handleWalletPermissionsResult$21(Result result) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleWalletPermissionsResult$22, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8495w(Throwable th) {
        this.shouldSendIntent = false;
        this.view.sendWalletIntent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleWalletVerificationResult$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8496x(Integer num) {
        this.view.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleWalletVerificationResult$12, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8497y(Integer num) {
        return claimPromotion();
    }

    static /* synthetic */ void lambda$handleWalletVerificationResult$13(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleWalletVerificationResult$14, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8498z(Throwable th) {
        if (th instanceof ActivityNotFoundException) {
            this.view.showUpdateWalletDialog();
        }
        th.printStackTrace();
    }

    public void dispose() {
        this.subscriptions.m40668b();
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        handleOnResumeEvent();
        handleWalletPermissionsResult();
        handleFindAddressClick();
        handleContinueClick();
        handleOnEditTextChanged();
        handleDismissGenericError();
        handleWalletCancelClick();
        handleDismissGenericMessage();
        handleWalletVerificationResult();
        handleUpdateWalletCancelClick();
        handleUpdateWallet();
    }
}
