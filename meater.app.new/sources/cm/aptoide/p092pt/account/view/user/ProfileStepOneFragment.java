package cm.aptoide.p092pt.account.view.user;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.LoginSignupManager;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.account.view.AccountNavigator;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.orientation.ScreenOrientationManager;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.utils.GenericDialogs;
import cm.aptoide.p092pt.utils.design.ShowMessage;
import cm.aptoide.p092pt.view.NotBottomNavigationView;
import cm.aptoide.p092pt.view.fragment.BaseToolbarFragment;
import javax.inject.Inject;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class ProfileStepOneFragment extends BaseToolbarFragment implements ProfileStepOneView, NotBottomNavigationView {
    public static final String IS_EXTERNAL_LOGIN = "facebook_google";
    private static final int LAYOUT = 2131493039;

    @Inject
    AccountAnalytics accountAnalytics;

    @Inject
    AccountNavigator accountNavigator;
    private Button continueBtn;
    private boolean externalLogin;

    @Inject
    LoginSignupManager loginSignupManager;
    private Button moreInfoBtn;

    @Inject
    ScreenOrientationManager orientationManager;

    @Inject
    ThemeManager themeManager;
    private ProgressDialog waitDialog;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$continueButtonClick$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m6968e(Void r1) {
        return Boolean.valueOf(this.externalLogin);
    }

    public static ProfileStepOneFragment newInstance() {
        return new ProfileStepOneFragment();
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseToolbarFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void bindViews(View view) {
        super.bindViews(view);
        this.continueBtn = (Button) view.findViewById(C1146R.id.logged_in_continue);
        this.moreInfoBtn = (Button) view.findViewById(C1146R.id.logged_in_more_info_button);
    }

    @Override // cm.aptoide.p092pt.account.view.user.ProfileStepOneView
    public C11234e<Boolean> continueButtonClick() {
        return C8975a.m28573a(this.continueBtn).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.user.b0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7418f.m6968e((Void) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.account.view.user.ProfileStepOneView
    public void dismissWaitDialog() {
        this.orientationManager.unlock();
        ProgressDialog progressDialog = this.waitDialog;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.waitDialog.dismiss();
    }

    @Override // cm.aptoide.p092pt.view.fragment.UiComponent
    public int getContentViewId() {
        return C1146R.layout.fragment_profile_step_one;
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(getClass().getSimpleName());
    }

    @Override // cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void loadExtras(Bundle bundle) {
        super.loadExtras(bundle);
        if (bundle != null) {
            this.externalLogin = bundle.getBoolean(IS_EXTERNAL_LOGIN, false);
        }
    }

    @Override // cm.aptoide.p092pt.account.view.user.ProfileStepOneView
    public C11234e<Void> moreInfoButtonClick() {
        return C8975a.m28573a(this.moreInfoBtn);
    }

    @Override // cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.waitDialog = GenericDialogs.createGenericPleaseWaitDialog(getContext(), this.themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId, getContext().getString(C1146R.string.please_wait));
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ProgressDialog progressDialog = this.waitDialog;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.waitDialog.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(IS_EXTERNAL_LOGIN, this.externalLogin);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        loadExtras(bundle);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseToolbarFragment
    protected void setupToolbarDetails(Toolbar toolbar) {
        super.setupToolbarDetails(toolbar);
        toolbar.setTitle(C1146R.string.create_profile_logged_in_activity_title);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseToolbarFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void setupViews() {
        super.setupViews();
        attachPresenter(new ProfileStepOnePresenter(this, CrashReport.getInstance(), ((AptoideApplication) getActivity().getApplicationContext()).getAccountManager(), this.accountNavigator, this.accountAnalytics, this.loginSignupManager));
    }

    @Override // cm.aptoide.p092pt.account.view.user.ProfileStepOneView
    public C11231b showGenericErrorMessage() {
        return ShowMessage.asLongObservableSnack(this, C1146R.string.unknown_error);
    }

    @Override // cm.aptoide.p092pt.account.view.user.ProfileStepOneView
    public void showWaitDialog() {
        this.orientationManager.lock();
        ProgressDialog progressDialog = this.waitDialog;
        if (progressDialog == null || progressDialog.isShowing()) {
            return;
        }
        this.waitDialog.show();
    }
}
