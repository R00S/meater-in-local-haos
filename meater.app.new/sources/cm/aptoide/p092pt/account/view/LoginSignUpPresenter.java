package cm.aptoide.p092pt.account.view;

import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.presenter.LoginSignUpView;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.view.BackButton;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class LoginSignUpPresenter extends BottomSheetBehavior.AbstractC7968e implements Presenter, BackButton.ClickHandler {
    private static final String TAG = "cm.aptoide.pt.account.view.LoginSignUpPresenter";
    private final boolean dismissToNavigateToMainView;
    private boolean hasMagicLinkError;
    private String magicLinkErrorMessage;
    private final boolean navigateToHome;
    private final FragmentNavigator navigatorChild;
    private final LoginSignUpView view;

    public LoginSignUpPresenter(LoginSignUpView loginSignUpView, FragmentNavigator fragmentNavigator, boolean z, boolean z2, boolean z3, String str) {
        this.view = loginSignUpView;
        this.navigatorChild = fragmentNavigator;
        this.dismissToNavigateToMainView = z;
        this.navigateToHome = z2;
        this.hasMagicLinkError = z3;
        this.magicLinkErrorMessage = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6898a(View.LifecycleEvent lifecycleEvent) {
        LoginSignUpCredentialsFragment loginSignUpCredentialsFragment;
        try {
            loginSignUpCredentialsFragment = (LoginSignUpCredentialsFragment) this.navigatorChild.getFragment();
        } catch (ClassCastException e2) {
            Logger.getInstance().m8279e(TAG, (Throwable) e2);
            loginSignUpCredentialsFragment = null;
        }
        if (loginSignUpCredentialsFragment == null) {
            this.navigatorChild.navigateToWithoutBackSave(LoginSignUpCredentialsFragment.newInstance(this.dismissToNavigateToMainView, this.navigateToHome, this.hasMagicLinkError, this.magicLinkErrorMessage), true);
        }
    }

    @Override // cm.aptoide.pt.view.BackButton.ClickHandler
    public boolean handle() {
        if (!this.view.bottomSheetIsExpanded()) {
            return false;
        }
        this.view.setBottomSheetState(4);
        return true;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC7968e
    public void onSlide(android.view.View view, float f2) {
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC7968e
    public void onStateChanged(android.view.View view, int i2) {
        if (i2 == 3) {
            this.view.expandBottomSheet();
        } else {
            if (i2 != 4) {
                return;
            }
            this.view.collapseBottomSheet();
        }
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.a1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.z0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7498f.m6898a((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40056D0();
    }
}
