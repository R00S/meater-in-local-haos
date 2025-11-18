package cm.aptoide.p092pt.view;

import android.R;
import android.app.NotificationManager;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.FirebaseConstants;
import cm.aptoide.p092pt.FirebaseNotificationAnalytics;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationActivity;
import cm.aptoide.p092pt.install.InstallManager;
import cm.aptoide.p092pt.notification.NotificationInfo;
import cm.aptoide.p092pt.notification.SystemNotificationShower;
import cm.aptoide.p092pt.presenter.MainView;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.themes.ThemeAnalytics;
import cm.aptoide.p092pt.util.MarketResourceFormatter;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.utils.GenericDialogs;
import cm.aptoide.p092pt.utils.design.ShowMessage;
import cm.aptoide.p092pt.view.DeepLinkManager;
import com.google.android.material.bottomnavigation.C7960a;
import com.google.android.material.bottomnavigation.C7962c;
import com.google.android.material.snackbar.Snackbar;
import javax.inject.Inject;
import p241e.p294g.p306b.C8988c;
import p456rx.C11234e;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class MainActivity extends BottomNavigationActivity implements MainView, DeepLinkManager.DeepLinkView {
    private C11418b<String> authenticationSubject;
    private ProgressDialog autoUpdateDialog;

    @Inject
    DeepLinkManager deepLinkManager;

    @Inject
    FirebaseNotificationAnalytics firebaseNotificationAnalytics;
    private C8988c<Void> installErrorsDismissEvent;
    private InstallManager installManager;

    @Inject
    MarketResourceFormatter marketResourceFormatter;
    private C8988c<NotificationInfo> notificationPublishRelay;

    @Inject
    Presenter presenter;
    private ProgressDialog progressDialog;

    @Inject
    Resources resources;
    private View snackBarLayout;
    private Snackbar snackbar;

    @Inject
    ThemeAnalytics themeAnalytics;
    private View updatesBadge;
    private TextView updatesNumber;

    private void handleFirebaseDeeplink(Intent intent) {
        String stringExtra = intent.getStringExtra("dti.link");
        if (stringExtra == null || stringExtra.isEmpty()) {
            return;
        }
        Intent intent2 = new Intent(getApplicationContext(), (Class<?>) DeepLinkIntentReceiver.class);
        intent2.setData(Uri.parse(stringExtra));
        startActivity(intent2);
    }

    private void handleNewIntent(Intent intent) {
        if (isAuthenticationDeepLink(intent).booleanValue()) {
            this.authenticationSubject.onNext(intent.getStringExtra(DeepLinkIntentReceiver.DeepLinksKeys.AUTH_TOKEN));
            return;
        }
        if (isNotificationDeeplink(intent).booleanValue()) {
            Bundle extras = intent.getExtras();
            NotificationInfo notificationInfo = new NotificationInfo(intent.getAction(), extras.getInt(SystemNotificationShower.NOTIFICATION_NOTIFICATION_ID), extras.getString(SystemNotificationShower.NOTIFICATION_TRACK_URL), extras.getString(SystemNotificationShower.NOTIFICATION_TARGET_URL));
            ((NotificationManager) getSystemService("notification")).cancel(intent.getIntExtra(SystemNotificationShower.NOTIFICATION_NOTIFICATION_ID, -1));
            this.notificationPublishRelay.call(notificationInfo);
            return;
        }
        if (!isFirebaseNotification(intent)) {
            this.deepLinkManager.showDeepLink(intent);
        } else {
            sendFirebaseNotificationAnalytics(intent);
            handleFirebaseDeeplink(intent);
        }
    }

    private Boolean isAuthenticationDeepLink(Intent intent) {
        return Boolean.valueOf(intent.getBooleanExtra(DeepLinkIntentReceiver.DeepLinksTargets.APTOIDE_AUTH, false));
    }

    private boolean isFirebaseNotification(Intent intent) {
        return intent.getStringExtra(FirebaseConstants.FIREBASE_MESSAGE_ID) != null;
    }

    private Boolean isNotificationDeeplink(Intent intent) {
        return Boolean.valueOf(intent.getAction() != null && (intent.getAction().equals(SystemNotificationShower.NOTIFICATION_PRESSED_ACTION) || intent.getAction().equals(SystemNotificationShower.NOTIFICATION_DISMISSED_ACTION)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showInstallationError$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8908g(View view) {
        this.installManager.retryTimedOutInstallations().m39973a(this.installManager.cleanTimedOutInstalls()).m39964H();
    }

    private void sendFirebaseNotificationAnalytics(Intent intent) {
        String stringExtra = intent.getStringExtra(FirebaseConstants.FIREBASE_MESSAGE_ID);
        Bundle bundleExtra = intent.getBundleExtra(FirebaseConstants.FIREBASE_ANALYTICS_DATA);
        if (stringExtra == null || bundleExtra == null) {
            return;
        }
        String string = bundleExtra.getString(FirebaseConstants.FIREBASE_MESSAGE_NAME);
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.firebaseNotificationAnalytics.sendFirebaseNotificationOpened(stringExtra, string, lValueOf.longValue(), bundleExtra.getString(FirebaseConstants.FIREBASE_MESSAGE_LABEL));
    }

    private void setupUpdatesNotification() {
        C7962c c7962c = (C7962c) this.bottomNavigationView.getChildAt(0);
        C7960a c7960a = (C7960a) c7962c.getChildAt(4);
        View viewInflate = LayoutInflater.from(this).inflate(C1146R.layout.updates_badge, (ViewGroup) c7962c, false);
        this.updatesBadge = viewInflate;
        this.updatesNumber = (TextView) viewInflate.findViewById(C1146R.id.updates_badge);
        c7960a.addView(this.updatesBadge);
        c7960a.setVisibility(0);
    }

    @Override // cm.aptoide.p092pt.presenter.MainView
    public void dismissAutoUpdateDialog() {
        ProgressDialog progressDialog = this.autoUpdateDialog;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.autoUpdateDialog.dismiss();
    }

    @Override // cm.aptoide.p092pt.presenter.MainView
    public void dismissInstallationError() {
        Snackbar snackbar = this.snackbar;
        if (snackbar != null) {
            snackbar.mo24748t();
        }
    }

    @Override // cm.aptoide.p092pt.presenter.MainView
    public C11234e<Void> getInstallErrorsDismiss() {
        return this.installErrorsDismissEvent;
    }

    @Override // cm.aptoide.p092pt.presenter.MainView
    public Intent getIntentAfterCreate() {
        return getIntent();
    }

    @Override // cm.aptoide.p092pt.presenter.MainView
    public void hideLoadingView() {
        this.progressDialog.hide();
    }

    @Override // cm.aptoide.p092pt.presenter.MainView
    public C11234e<String> onAuthenticationIntent() {
        return this.authenticationSubject;
    }

    @Override // cm.aptoide.p092pt.bottomNavigation.BottomNavigationActivity, cm.aptoide.p092pt.account.view.LoginBottomSheetActivity, cm.aptoide.p092pt.view.BackButtonActivity, cm.aptoide.p092pt.view.ThemedActivityView, cm.aptoide.p092pt.analytics.view.AnalyticsActivity, cm.aptoide.p092pt.permission.PermissionProviderActivity, cm.aptoide.p092pt.permission.PermissionServiceActivity, cm.aptoide.p092pt.navigator.ActivityResultNavigator, cm.aptoide.p092pt.view.BaseActivity, com.trello.rxlifecycle.p235h.p236a.AbstractActivityC8764a, androidx.appcompat.app.ActivityC0067d, androidx.fragment.app.ActivityC0468d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0242f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getActivityComponent().inject(this);
        this.installManager = ((AptoideApplication) getApplicationContext()).getInstallManager();
        this.snackBarLayout = findViewById(C1146R.id.snackbar_layout);
        this.installErrorsDismissEvent = C8988c.m28593f1();
        this.authenticationSubject = C11418b.m40637g1();
        this.notificationPublishRelay = ((AptoideApplication) getApplicationContext()).getNotificationsPublishRelay();
        this.themeAnalytics.setDarkThemeUserProperty(((ThemedActivityView) this).themeManager.getDarkThemeMode());
        this.progressDialog = GenericDialogs.createGenericPleaseWaitDialog(this, ((ThemedActivityView) this).themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId);
        setupUpdatesNotification();
        Intent intent = getIntent();
        if (isNotificationDeeplink(intent).booleanValue()) {
            Bundle extras = intent.getExtras();
            NotificationInfo notificationInfo = new NotificationInfo(intent.getAction(), extras.getInt(SystemNotificationShower.NOTIFICATION_NOTIFICATION_ID), extras.getString(SystemNotificationShower.NOTIFICATION_TRACK_URL), extras.getString(SystemNotificationShower.NOTIFICATION_TARGET_URL));
            ((NotificationManager) getSystemService("notification")).cancel(intent.getIntExtra(SystemNotificationShower.NOTIFICATION_NOTIFICATION_ID, -1));
            this.notificationPublishRelay.call(notificationInfo);
        } else if (isFirebaseNotification(intent)) {
            sendFirebaseNotificationAnalytics(intent);
            handleFirebaseDeeplink(intent);
        }
        attachPresenter(this.presenter);
    }

    @Override // cm.aptoide.p092pt.bottomNavigation.BottomNavigationActivity, cm.aptoide.p092pt.view.BaseActivity, com.trello.rxlifecycle.p235h.p236a.AbstractActivityC8764a, androidx.appcompat.app.ActivityC0067d, androidx.fragment.app.ActivityC0468d, android.app.Activity
    protected void onDestroy() {
        this.autoUpdateDialog = null;
        this.installErrorsDismissEvent = null;
        this.installManager = null;
        this.updatesBadge = null;
        this.snackBarLayout = null;
        this.snackbar = null;
        this.progressDialog = null;
        this.authenticationSubject = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0468d, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        handleNewIntent(intent);
    }

    @Override // cm.aptoide.p092pt.analytics.view.AnalyticsActivity, com.trello.rxlifecycle.p235h.p236a.AbstractActivityC8764a, androidx.fragment.app.ActivityC0468d, android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
    }

    @Override // cm.aptoide.p092pt.analytics.view.AnalyticsActivity, com.trello.rxlifecycle.p235h.p236a.AbstractActivityC8764a, androidx.fragment.app.ActivityC0468d, android.app.Activity
    protected void onResume() {
        super.onResume();
    }

    @Override // cm.aptoide.p092pt.analytics.view.AnalyticsActivity, com.trello.rxlifecycle.p235h.p236a.AbstractActivityC8764a, androidx.appcompat.app.ActivityC0067d, androidx.fragment.app.ActivityC0468d, android.app.Activity
    protected void onStart() {
        super.onStart();
    }

    @Override // cm.aptoide.p092pt.analytics.view.AnalyticsActivity, com.trello.rxlifecycle.p235h.p236a.AbstractActivityC8764a, androidx.appcompat.app.ActivityC0067d, androidx.fragment.app.ActivityC0468d, android.app.Activity
    protected void onStop() {
        super.onStop();
    }

    @Override // cm.aptoide.p092pt.presenter.MainView
    public void showGenericErrorMessage() {
        ShowMessage.asLongSnack(this, getString(C1146R.string.all_message_general_error));
    }

    @Override // cm.aptoide.p092pt.presenter.MainView
    public void showInstallationError(int i2) {
        Snackbar snackbarM24746p = Snackbar.m24764a0(this.snackBarLayout, i2 == 1 ? getString(C1146R.string.generalscreen_short_root_install_single_app_timeout_error_message) : getString(C1146R.string.generalscreen_short_root_install_timeout_error_message, new Object[]{Integer.valueOf(i2)}), -2).m24765b0(C1146R.string.generalscreen_short_root_install_timeout_error_action, new View.OnClickListener() { // from class: cm.aptoide.pt.view.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12105f.m8908g(view);
            }
        }).m24746p(new Snackbar.C8058b() { // from class: cm.aptoide.pt.view.MainActivity.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.snackbar.Snackbar.C8058b, com.google.android.material.snackbar.BaseTransientBottomBar.AbstractC8052r
            public void onDismissed(Snackbar snackbar, int i3) {
                super.onDismissed(snackbar, i3);
                if (i3 == 0) {
                    MainActivity.this.installErrorsDismissEvent.call(null);
                }
            }
        });
        this.snackbar = snackbarM24746p;
        snackbarM24746p.mo24744P();
    }

    @Override // cm.aptoide.p092pt.presenter.MainView
    public void showInstallationSuccessMessage() {
        ShowMessage.asSnack(this.snackBarLayout, C1146R.string.generalscreen_short_root_install_success_install);
    }

    @Override // cm.aptoide.p092pt.presenter.MainView
    public void showLoadingView() {
        this.progressDialog.show();
    }

    @Override // cm.aptoide.pt.view.DeepLinkManager.DeepLinkView
    public void showStoreAlreadyAdded() {
        ShowMessage.asLongSnack(this, getString(C1146R.string.store_already_added));
    }

    @Override // cm.aptoide.pt.view.DeepLinkManager.DeepLinkView
    public void showStoreFollowed(String str) {
        ShowMessage.asLongSnack(this, AptoideUtils.StringU.getFormattedString(C1146R.string.store_followed, getResources(), str));
    }

    @Override // cm.aptoide.p092pt.presenter.MainView
    public void showUnknownErrorMessage() {
        Snackbar.m24763Z(findViewById(R.id.content), C1146R.string.unknown_error, -1).mo24744P();
    }

    @Override // cm.aptoide.p092pt.presenter.MainView
    public void showUpdatesBadge(int i2) {
        if (i2 <= 0) {
            this.updatesNumber.setVisibility(0);
            this.updatesNumber.setBackground(getResources().getDrawable(C1146R.drawable.updates_badge_circle_small));
            this.updatesNumber.setTextSize(6.0f);
        } else {
            this.updatesNumber.setVisibility(0);
            this.updatesNumber.setBackground(getResources().getDrawable(C1146R.drawable.updates_badge_circle));
            this.updatesNumber.setTextSize(10.0f);
            this.updatesNumber.setText(String.valueOf(i2));
        }
    }
}
