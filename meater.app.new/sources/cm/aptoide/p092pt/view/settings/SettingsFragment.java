package cm.aptoide.p092pt.view.settings;

import android.R;
import android.app.ActivityManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0064a;
import androidx.appcompat.app.ActivityC0067d;
import androidx.appcompat.app.DialogInterfaceC0066c;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.preference.AbstractC0563g;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.SwitchPreferenceCompat;
import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.SettingsManager;
import cm.aptoide.p092pt.account.AdultContentAnalytics;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.file.FileManager;
import cm.aptoide.p092pt.link.CustomTabsHelper;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.navigator.ActivityResultNavigator;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.notification.NotificationSyncScheduler;
import cm.aptoide.p092pt.preferences.managed.ManagedKeys;
import cm.aptoide.p092pt.preferences.managed.ManagerPreferences;
import cm.aptoide.p092pt.themes.ThemeAnalytics;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.updates.UpdateRepository;
import cm.aptoide.p092pt.updates.view.excluded.ExcludedUpdatesFragment;
import cm.aptoide.p092pt.util.MarketResourceFormatter;
import cm.aptoide.p092pt.util.SettingsConstants;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.utils.GenericDialogs;
import cm.aptoide.p092pt.utils.design.ShowMessage;
import cm.aptoide.p092pt.view.BaseActivity;
import cm.aptoide.p092pt.view.NotBottomNavigationView;
import cm.aptoide.p092pt.view.dialog.EditableTextDialog;
import cm.aptoide.p092pt.view.feedback.SendFeedbackFragment;
import cm.aptoide.p092pt.view.p107rx.RxAlertDialog;
import cm.aptoide.p092pt.view.p107rx.RxPreference;
import cm.aptoide.p092pt.view.settings.InputDialog;
import javax.inject.Inject;
import javax.inject.Named;
import okhttp3.HttpUrl;
import p024c.p025a.p032o.C0844d;
import p456rx.C11234e;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p474t.C11426b;

/* loaded from: classes.dex */
public class SettingsFragment extends AbstractC0563g implements SharedPreferences.OnSharedPreferenceChangeListener, NotBottomNavigationView {
    private static final String ADULT_CONTENT_PIN_PREFERENCE_VIEW_KEY = "Maturepin";
    private static final String ADULT_CONTENT_PREFERENCE_VIEW_KEY = "matureChkBox";
    private static final String ADULT_CONTENT_WITH_PIN_PREFERENCE_VIEW_KEY = "matureChkBoxWithPin";
    private static final String APP_THEME_PREFERENCE_KEY = "appTheme";
    private static final String DELETE_ACCOUNT = "deleteAccount";
    private static final String EXCLUDED_UPDATES_PREFERENCE_KEY = "excludedUpdates";
    private static final String PRIVACY_POLICY_PREFERENCE_KEY = "privacyPolicy";
    private static final String REMOVE_ADULT_CONTENT_PIN_PREFERENCE_VIEW_KEY = "removeMaturepin";
    private static final String SEND_FEEDBACK_PREFERENCE_KEY = "sendFeedback";
    private static final String TAG = SettingsFragment.class.getSimpleName();
    private static final String TERMS_AND_CONDITIONS_PREFERENCE_KEY = "termsConditions";
    private AptoideAccountManager accountManager;
    private AdultContentAnalytics adultContentAnalytics;
    private RxAlertDialog adultContentConfirmationDialog;
    private SwitchPreferenceCompat adultContentPreferenceView;
    private SwitchPreferenceCompat adultContentWithPinPreferenceView;
    private RxAlertDialog appThemeDialog;
    private Context context;
    private Preference deleteAccount;
    private EditableTextDialog enableAdultContentPinDialog;
    private Preference excludedUpdates;

    @Inject
    FileManager fileManager;
    private InputDialog fileMaxCacheDialog;
    private Preference fileMaxCachePreferenceView;
    private FragmentNavigator fragmentNavigator;

    @Inject
    @Named
    String marketName;

    @Inject
    MarketResourceFormatter marketResourceFormatter;
    private NotificationSyncScheduler notificationSyncScheduler;
    private Preference pinPreferenceView;
    private Preference privacyPolicy;
    private EditableTextDialog removePinDialog;
    private Preference removePinPreferenceView;
    private Preference sendFeedback;
    private EditableTextDialog setPinDialog;
    private SettingsManager settingsManager;
    private SharedPreferences sharedPreferences;
    private SwitchPreferenceCompat socialCampaignNotifications;
    private C11426b subscriptions;

    @Inject
    SupportEmailProvider supportEmailProvider;
    private Preference termsAndConditions;

    @Inject
    ThemeAnalytics themeAnalytics;

    @Inject
    ThemeManager themeManager;
    protected Toolbar toolbar;
    private boolean trackAnalytics;

    @Inject
    UpdateRepository updatesRepository;

    /* renamed from: cm.aptoide.pt.view.settings.SettingsFragment$1 */
    class C48841 implements Preference.InterfaceC0544d {
        C48841() {
        }

        @Override // androidx.preference.Preference.InterfaceC0544d
        public boolean onPreferenceClick(Preference preference) {
            String str;
            int i2;
            View viewInflate = LayoutInflater.from(SettingsFragment.this.context).inflate(C1146R.layout.dialog_about, (ViewGroup) null);
            try {
                str = SettingsFragment.this.getActivity().getPackageManager().getPackageInfo(SettingsFragment.this.getActivity().getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException e2) {
                CrashReport.getInstance().log(e2);
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            try {
                i2 = SettingsFragment.this.getActivity().getPackageManager().getPackageInfo(SettingsFragment.this.getActivity().getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e3) {
                CrashReport.getInstance().log(e3);
                i2 = 0;
            }
            ((TextView) viewInflate.findViewById(C1146R.id.aptoide_version)).setText(SettingsFragment.this.getString(C1146R.string.version) + " " + str + " (" + i2 + ")");
            ((TextView) viewInflate.findViewById(C1146R.id.credits)).setMovementMethod(LinkMovementMethod.getInstance());
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(C1146R.id.contact_layout);
            ((TextView) viewInflate.findViewById(C1146R.id.contact_text)).setText(SettingsFragment.this.supportEmailProvider.getEmail());
            if (SettingsFragment.this.supportEmailProvider.isAptoideSupport()) {
                linearLayout.setVisibility(0);
            } else {
                linearLayout.setVisibility(4);
            }
            new DialogInterfaceC0066c.a(new C0844d(SettingsFragment.this.context, SettingsFragment.this.themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId)).m266w(viewInflate).m265v(SettingsFragment.this.getString(C1146R.string.settings_about_us)).m249f(R.drawable.ic_menu_info_details).m260q(R.string.ok, new DialogInterface.OnClickListener() { // from class: cm.aptoide.pt.view.settings.m2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    dialogInterface.cancel();
                }
            }).m244a().show();
            return true;
        }
    }

    /* renamed from: cm.aptoide.pt.view.settings.SettingsFragment$2 */
    static /* synthetic */ class C48852 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$themes$ThemeManager$ThemeOption;

        static {
            int[] iArr = new int[ThemeManager.ThemeOption.values().length];
            $SwitchMap$cm$aptoide$pt$themes$ThemeManager$ThemeOption = iArr;
            try {
                iArr[ThemeManager.ThemeOption.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$themes$ThemeManager$ThemeOption[ThemeManager.ThemeOption.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$themes$ThemeManager$ThemeOption[ThemeManager.ThemeOption.SYSTEM_DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private String getFormattedDensity(int i2) {
        return i2 + (i2 != 120 ? i2 != 160 ? i2 != 213 ? i2 != 240 ? i2 != 320 ? i2 != 480 ? i2 != 640 ? HttpUrl.FRAGMENT_ENCODE_SET : " xxxhdpi" : " xxhdpi" : " xhdpi" : " hdpi" : " tvdpi" : " mdpi" : " ldpi");
    }

    private String getThemeString(ThemeManager.ThemeOption themeOption) {
        int i2 = C48852.$SwitchMap$cm$aptoide$pt$themes$ThemeManager$ThemeOption[themeOption.ordinal()];
        return i2 != 1 ? i2 != 2 ? getString(C1146R.string.settings_dark_theme_system) : getString(C1146R.string.settings_dark_theme_light) : getString(C1146R.string.settings_dark_theme_dark);
    }

    private void handleDeleteAccountVisibility() {
        this.subscriptions.m40667a(this.accountManager.accountStatus().m40095j0(C11250a.m40156b()).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.a3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11930f.m9088d((Account) obj);
            }
        }).m40056D0());
    }

    private void handleSocialNotifications(Boolean bool) {
        this.notificationSyncScheduler.setEnabled(bool.booleanValue());
        if (bool.booleanValue()) {
            this.notificationSyncScheduler.schedule();
        } else {
            this.notificationSyncScheduler.removeSchedules();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDeleteAccountVisibility$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9088d(Account account) {
        this.deleteAccount.m4017T0(account.isLoggedIn());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onViewCreated$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9089e(View view) {
        getActivity().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupAdultContentClickHandlers$24, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9090f(DialogInterface dialogInterface) {
        this.adultContentPreferenceView.m3993G0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupAdultContentClickHandlers$26, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9092h() {
        this.adultContentPreferenceView.m3993G0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupAdultContentClickHandlers$27, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9093i(DialogInterface dialogInterface) {
        return this.accountManager.enable().m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.settings.l3
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11996f.m9091g();
            }
        }).m39986z(C11250a.m40156b()).m39984q(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.settings.l2
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11995f.m9092h();
            }
        }).m39968M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupAdultContentClickHandlers$28, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9094j(DialogInterface dialogInterface) {
        rollbackCheck(this.adultContentPreferenceView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupAdultContentClickHandlers$29, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9095k(DialogInterface dialogInterface) {
        rollbackCheck(this.adultContentWithPinPreferenceView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupAdultContentClickHandlers$31, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9097m() {
        this.adultContentWithPinPreferenceView.m3993G0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupAdultContentClickHandlers$32, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9098n(Preference preference) {
        if (((SwitchPreferenceCompat) preference).m4090Z0()) {
            this.enableAdultContentPinDialog.show();
            return C11234e.m40016B();
        }
        this.adultContentWithPinPreferenceView.m3993G0(false);
        return this.accountManager.disable().m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.settings.y3
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f12067f.m9096l();
            }
        }).m39986z(C11250a.m40156b()).m39984q(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.settings.u3
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f12047f.m9097m();
            }
        }).m39968M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupAdultContentClickHandlers$33, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9099o(Throwable th) {
        if (th instanceof SecurityException) {
            ShowMessage.asSnack(getActivity(), C1146R.string.adult_pin_wrong);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupAdultContentClickHandlers$34, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9100p(CharSequence charSequence) {
        return this.accountManager.removePin(Integer.valueOf(charSequence.toString()).intValue()).m39986z(C11250a.m40156b()).m39981n(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.m3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f12002f.m9099o((Throwable) obj);
            }
        }).m39968M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupAdultContentClickHandlers$35, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9101q(CharSequence charSequence) {
        this.adultContentWithPinPreferenceView.m3993G0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupAdultContentClickHandlers$37, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9103s(Throwable th) {
        if (th instanceof SecurityException) {
            ShowMessage.asSnack(getActivity(), C1146R.string.adult_pin_wrong);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupAdultContentClickHandlers$38, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9104t() {
        this.adultContentWithPinPreferenceView.m3993G0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupAdultContentClickHandlers$39, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9105u(CharSequence charSequence) {
        return this.accountManager.enable(Integer.valueOf(charSequence.toString()).intValue()).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.settings.t2
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f12040f.m9102r();
            }
        }).m39986z(C11250a.m40156b()).m39981n(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.j3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11984f.m9103s((Throwable) obj);
            }
        }).m39984q(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.settings.i3
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11978f.m9104t();
            }
        }).m39968M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupAdultContentClickHandlers$40, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9106v(Boolean bool) {
        this.adultContentPreferenceView.m4091a1(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupAdultContentClickHandlers$41, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9107w(Boolean bool) {
        this.adultContentWithPinPreferenceView.m4091a1(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupAdultContentClickHandlers$43, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9109y() {
        this.adultContentPreferenceView.m3993G0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupAdultContentClickHandlers$44, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9110z(Preference preference) {
        if (((SwitchPreferenceCompat) preference).m4090Z0()) {
            this.adultContentConfirmationDialog.show();
            return C11234e.m40016B();
        }
        this.adultContentPreferenceView.m3993G0(false);
        return this.accountManager.disable().m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.settings.j4
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11985f.m9108x();
            }
        }).m39986z(C11250a.m40156b()).m39984q(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.settings.h4
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11973f.m9109y();
            }
        }).m39968M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupAdultContentClickHandlers$45, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9066A(Preference preference) {
        this.setPinDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupAdultContentClickHandlers$46, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9067B(Preference preference) {
        this.fileMaxCacheDialog.showWithInput(String.valueOf(ManagerPreferences.getCacheLimit(this.sharedPreferences)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupAdultContentClickHandlers$47, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9068C(Boolean bool) {
        if (bool.booleanValue()) {
            this.pinPreferenceView.m4017T0(false);
            this.removePinPreferenceView.m4017T0(true);
            this.adultContentWithPinPreferenceView.m4017T0(true);
            this.adultContentPreferenceView.m4017T0(false);
            return;
        }
        this.pinPreferenceView.m4017T0(true);
        this.removePinPreferenceView.m4017T0(false);
        this.adultContentWithPinPreferenceView.m4017T0(false);
        this.adultContentPreferenceView.m4017T0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupAdultContentClickHandlers$48, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9069D(Preference preference) {
        this.removePinDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupAdultContentClickHandlers$50, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9070E(CharSequence charSequence) {
        return this.accountManager.requirePin(Integer.valueOf(charSequence.toString()).intValue()).m39968M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupAdultContentClickHandlers$54, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9071F(Integer num) {
        ManagerPreferences.setCacheLimit(num.intValue(), this.sharedPreferences);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupAppTheme$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9072G(Preference preference) {
        this.appThemeDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupAppTheme$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ ThemeManager.ThemeOption m9073H(ThemeManager.ThemeOption[] themeOptionArr, DialogInterface dialogInterface) {
        return themeOptionArr[this.appThemeDialog.getCheckedItem()];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupAppTheme$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9074I(Preference preference, CharSequence[] charSequenceArr, ThemeManager.ThemeOption themeOption) {
        preference.mo3959P0(charSequenceArr[this.appThemeDialog.getCheckedItem()]);
        this.themeManager.setThemeOption(themeOption);
        this.themeManager.resetToBaseTheme();
        this.themeAnalytics.sendThemeChangedEvent(themeOption, TAG);
        this.themeAnalytics.setDarkThemeUserProperty(this.themeManager.getDarkThemeMode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupClickHandlers$10, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9075J(Preference preference) {
        this.fragmentNavigator.navigateTo(ExcludedUpdatesFragment.newInstance(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupClickHandlers$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9076K(Preference preference) {
        this.fragmentNavigator.navigateTo(SendFeedbackFragment.newInstance(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupClickHandlers$12, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9077L(Preference preference) {
        CustomTabsHelper.getInstance().openInChromeCustomTab(getString(C1146R.string.all_url_terms_conditions), getContext(), this.themeManager.getAttributeForTheme(C1146R.attr.colorPrimary).resourceId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupClickHandlers$13, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9078M(Preference preference) {
        CustomTabsHelper.getInstance().openInChromeCustomTab(getString(C1146R.string.all_url_privacy_policy), getContext(), this.themeManager.getAttributeForTheme(C1146R.attr.colorPrimary).resourceId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupClickHandlers$14, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ boolean m9079N(Preference preference) {
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) preference;
        boolean z = false;
        if (switchPreferenceCompat.m4090Z0()) {
            switchPreferenceCompat.m4091a1(true);
            z = true;
        } else {
            switchPreferenceCompat.m4091a1(false);
        }
        ManagerPreferences.setHWSpecsFilter(z, this.sharedPreferences);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupClickHandlers$17, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9080O(GenericDialogs.EResponse eResponse) {
        return this.fileManager.deleteCache(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupClickHandlers$19, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9081P(Long l) {
        ShowMessage.asSnack(this, AptoideUtils.StringU.getFormattedString(C1146R.string.freed_space, getContext().getResources(), AptoideUtils.StringU.formatBytes(l.longValue(), false)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupClickHandlers$20, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9082Q(Throwable th) {
        ShowMessage.asSnack(this, C1146R.string.ws_error_SYS_1);
        th.printStackTrace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupClickHandlers$21, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ boolean m9083R(Preference preference) {
        final ProgressDialog progressDialogCreateGenericPleaseWaitDialog = GenericDialogs.createGenericPleaseWaitDialog(getContext(), this.themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId);
        this.subscriptions.m40667a(GenericDialogs.createGenericContinueCancelMessage(getContext(), getString(C1146R.string.storage_dialog_title, this.marketName), getString(C1146R.string.clear_cache_dialog_message), this.themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.v2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((GenericDialogs.EResponse) obj).equals(GenericDialogs.EResponse.YES));
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.i4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                progressDialogCreateGenericPleaseWaitDialog.show();
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.x2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f12061f.m9080O((GenericDialogs.EResponse) obj);
            }
        }).m40095j0(C11250a.m40156b()).m40123z(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.settings.e3
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                progressDialogCreateGenericPleaseWaitDialog.dismiss();
            }
        }).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.k4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11991f.m9081P((Long) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.d4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11949f.m9082Q((Throwable) obj);
            }
        }));
        return false;
    }

    static /* synthetic */ void lambda$setupClickHandlers$22(DialogInterface dialogInterface, int i2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupClickHandlers$23, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ boolean m9084S(String str, Preference preference) {
        DialogInterfaceC0066c.a aVar = new DialogInterfaceC0066c.a(this.context, this.themeManager.getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId);
        aVar.m265v(getString(C1146R.string.setting_hwspecstitle));
        aVar.m249f(R.drawable.ic_menu_info_details).m253j(getString(C1146R.string.setting_sdk_version) + ": " + AptoideUtils.SystemU.getSdkVer() + "\n" + getString(C1146R.string.setting_screen_size) + ": " + AptoideUtils.ScreenU.getScreenSize(getContext().getResources()) + "\n" + getString(C1146R.string.setting_esgl_version) + ": " + AptoideUtils.SystemU.getGlEsVer((ActivityManager) getContext().getSystemService("activity")) + "\n" + getString(C1146R.string.screenCode) + ": " + AptoideUtils.ScreenU.getNumericScreenSize(getContext().getResources()) + "/" + AptoideUtils.ScreenU.getDensityDpi((WindowManager) getContext().getSystemService("window")) + "\n" + getString(C1146R.string.cpuAbi) + ": " + AptoideUtils.SystemU.getAbis() + "\n" + getString(C1146R.string.setting_density) + ": " + str).m247d(false).m257n(getString(R.string.ok), new DialogInterface.OnClickListener() { // from class: cm.aptoide.pt.view.settings.c3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                SettingsFragment.lambda$setupClickHandlers$22(dialogInterface, i2);
            }
        });
        aVar.m244a().show();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupClickHandlers$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9085T(Preference preference) {
        return this.accountManager.accountStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupClickHandlers$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9086U(Account account) {
        openDeleteAccountView(account.getEmail());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupClickHandlers$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9087V(Preference preference) {
        handleSocialNotifications(Boolean.valueOf(((SwitchPreferenceCompat) preference).m4090Z0()));
    }

    public static Fragment newInstance() {
        return new SettingsFragment();
    }

    private void openDeleteAccountView(String str) {
        CustomTabsHelper.getInstance().openInChromeCustomTab(getString(C1146R.string.settings_url_delete_account, str), getContext(), this.themeManager.getAttributeForTheme(C1146R.attr.colorPrimary).resourceId);
    }

    private void rollbackCheck(SwitchPreferenceCompat switchPreferenceCompat) {
        switchPreferenceCompat.m4091a1(!switchPreferenceCompat.m4090Z0());
    }

    private void setAdultContentContent() {
        if (this.settingsManager.showAdultContent()) {
            this.adultContentConfirmationDialog = new RxAlertDialog.Builder(getContext(), this.themeManager).setMessage(C1146R.string.are_you_adult).setPositiveButton(C1146R.string.yes).setNegativeButton(C1146R.string.f7167no).build();
            this.enableAdultContentPinDialog = new InputDialog.Builder(getContext(), this.themeManager).setMessage(C1146R.string.request_adult_pin).setPositiveButton(C1146R.string.all_button_ok).setNegativeButton(C1146R.string.cancel).setView(C1146R.layout.dialog_request_input).setEditText(C1146R.id.input).build();
            this.removePinDialog = new InputDialog.Builder(getContext(), this.themeManager).setMessage(C1146R.string.request_adult_pin).setPositiveButton(C1146R.string.all_button_ok).setNegativeButton(C1146R.string.cancel).setView(C1146R.layout.dialog_request_input).setEditText(C1146R.id.input).build();
            this.setPinDialog = new InputDialog.Builder(getContext(), this.themeManager).setMessage(C1146R.string.asksetadultpinmessage).setPositiveButton(C1146R.string.all_button_ok).setNegativeButton(C1146R.string.cancel).setView(C1146R.layout.dialog_request_input).setEditText(C1146R.id.input).build();
        }
    }

    private void setAdultContentViews() {
        if (this.settingsManager.showAdultContent()) {
            this.adultContentPreferenceView = (SwitchPreferenceCompat) findPreference(ADULT_CONTENT_PREFERENCE_VIEW_KEY);
            this.adultContentWithPinPreferenceView = (SwitchPreferenceCompat) findPreference(ADULT_CONTENT_WITH_PIN_PREFERENCE_VIEW_KEY);
            this.pinPreferenceView = findPreference(ADULT_CONTENT_PIN_PREFERENCE_VIEW_KEY);
            this.removePinPreferenceView = findPreference(REMOVE_ADULT_CONTENT_PIN_PREFERENCE_VIEW_KEY);
            return;
        }
        PreferenceCategory preferenceCategory = (PreferenceCategory) findPreference("adultContent");
        if (preferenceCategory != null) {
            getPreferenceScreen().m4064i1(preferenceCategory);
        }
    }

    private void setGDPR() {
        if (this.settingsManager.showGDPR()) {
            this.termsAndConditions = findPreference(TERMS_AND_CONDITIONS_PREFERENCE_KEY);
            this.privacyPolicy = findPreference(PRIVACY_POLICY_PREFERENCE_KEY);
            return;
        }
        PreferenceCategory preferenceCategory = (PreferenceCategory) findPreference("about");
        Preference preferenceFindPreference = findPreference(TERMS_AND_CONDITIONS_PREFERENCE_KEY);
        Preference preferenceFindPreference2 = findPreference(PRIVACY_POLICY_PREFERENCE_KEY);
        if (preferenceFindPreference != null) {
            preferenceCategory.m4064i1(preferenceFindPreference);
        }
        if (preferenceFindPreference2 != null) {
            preferenceCategory.m4064i1(preferenceFindPreference2);
        }
    }

    private void setupAdultContentClickHandlers() {
        if (this.settingsManager.showAdultContent()) {
            this.subscriptions.m40667a(this.adultContentConfirmationDialog.positiveClicks().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.n3
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    this.f12008f.m9090f((DialogInterface) obj);
                }
            }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.p3
                @Override // p456rx.p460m.InterfaceC11256e
                public final Object call(Object obj) {
                    return this.f12021f.m9093i((DialogInterface) obj);
                }
            }).m40110s0().m40056D0());
            this.subscriptions.m40667a(this.adultContentConfirmationDialog.negativeClicks().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.g4
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    this.f11967f.m9094j((DialogInterface) obj);
                }
            }).m40110s0().m40056D0());
            this.subscriptions.m40667a(this.enableAdultContentPinDialog.negativeClicks().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.o2
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    this.f12013f.m9095k((DialogInterface) obj);
                }
            }).m40110s0().m40056D0());
            this.subscriptions.m40667a(RxPreference.clicks(this.adultContentWithPinPreferenceView).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.s2
                @Override // p456rx.p460m.InterfaceC11256e
                public final Object call(Object obj) {
                    return this.f12035f.m9098n((Preference) obj);
                }
            }).m40110s0().m40056D0());
            this.subscriptions.m40667a(this.removePinDialog.positiveClicks().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.b4
                @Override // p456rx.p460m.InterfaceC11256e
                public final Object call(Object obj) {
                    return this.f11937f.m9100p((CharSequence) obj);
                }
            }).m40110s0().m40056D0());
            this.subscriptions.m40667a(this.enableAdultContentPinDialog.positiveClicks().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.f4
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    this.f11961f.m9101q((CharSequence) obj);
                }
            }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.c4
                @Override // p456rx.p460m.InterfaceC11256e
                public final Object call(Object obj) {
                    return this.f11943f.m9105u((CharSequence) obj);
                }
            }).m40110s0().m40056D0());
            this.subscriptions.m40667a(this.accountManager.hasMatureContentEnabled().m40095j0(C11250a.m40156b()).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.m4
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    this.f12003f.m9106v((Boolean) obj);
                }
            }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.s3
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    this.f12036f.m9107w((Boolean) obj);
                }
            }).m40056D0());
            this.subscriptions.m40667a(RxPreference.clicks(this.adultContentPreferenceView).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.a4
                @Override // p456rx.p460m.InterfaceC11256e
                public final Object call(Object obj) {
                    return this.f11931f.m9110z((Preference) obj);
                }
            }).m40110s0().m40056D0());
            this.subscriptions.m40667a(RxPreference.clicks(this.pinPreferenceView).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.y2
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    this.f12066f.m9066A((Preference) obj);
                }
            }).m40056D0());
            this.subscriptions.m40667a(RxPreference.clicks(this.fileMaxCachePreferenceView).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.q2
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    this.f12025f.m9067B((Preference) obj);
                }
            }).m40056D0());
            this.subscriptions.m40667a(this.accountManager.pinRequired().m40095j0(C11250a.m40156b()).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.g3
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    this.f11966f.m9068C((Boolean) obj);
                }
            }).m40056D0());
            this.subscriptions.m40667a(RxPreference.clicks(this.removePinPreferenceView).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.b3
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    this.f11936f.m9069D((Preference) obj);
                }
            }).m40056D0());
            this.subscriptions.m40667a(this.setPinDialog.positiveClicks().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.o3
                @Override // p456rx.p460m.InterfaceC11256e
                public final Object call(Object obj) {
                    CharSequence charSequence = (CharSequence) obj;
                    return Boolean.valueOf(!TextUtils.isEmpty(charSequence));
                }
            }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.h3
                @Override // p456rx.p460m.InterfaceC11256e
                public final Object call(Object obj) {
                    return this.f11972f.m9070E((CharSequence) obj);
                }
            }).m40110s0().m40056D0());
            this.subscriptions.m40667a(this.fileMaxCacheDialog.positiveClicks().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.f3
                @Override // p456rx.p460m.InterfaceC11256e
                public final Object call(Object obj) {
                    CharSequence charSequence = (CharSequence) obj;
                    return Boolean.valueOf(!TextUtils.isEmpty(charSequence));
                }
            }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.n4
                @Override // p456rx.p460m.InterfaceC11256e
                public final Object call(Object obj) {
                    return Integer.valueOf(Integer.parseInt(((CharSequence) obj).toString()));
                }
            }).m40104o0(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.x3
                @Override // p456rx.p460m.InterfaceC11256e
                public final Object call(Object obj) {
                    return C11234e.m40025S(200);
                }
            }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.z2
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    this.f12071f.m9071F((Integer) obj);
                }
            }).m40110s0().m40056D0());
        }
    }

    private void setupAppTheme() {
        final Preference preferenceFindPreference = findPreference(APP_THEME_PREFERENCE_KEY);
        preferenceFindPreference.mo3959P0(getThemeString(this.themeManager.getThemeOption()));
        final ThemeManager.ThemeOption[] themeOptionArrValues = ThemeManager.ThemeOption.values();
        ThemeManager.ThemeOption themeOption = this.themeManager.getThemeOption();
        final CharSequence[] charSequenceArr = new CharSequence[themeOptionArrValues.length];
        int i2 = 0;
        for (int i3 = 0; i3 < themeOptionArrValues.length; i3++) {
            if (themeOptionArrValues[i3].equals(themeOption)) {
                i2 = i3;
            }
            charSequenceArr[i3] = getThemeString(themeOptionArrValues[i3]);
        }
        this.appThemeDialog = new RxAlertDialog.Builder(getContext(), this.themeManager).setTitleSmall(C1146R.string.settings_dark_theme_dialog_title).setSingleChoiceItems(charSequenceArr, i2).setPositiveButton(C1146R.string.all_button_ok).setNegativeButton(C1146R.string.cancel).build();
        this.subscriptions.m40667a(RxPreference.clicks(preferenceFindPreference).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.l4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11997f.m9072G((Preference) obj);
            }
        }).m40056D0());
        this.subscriptions.m40667a(this.appThemeDialog.positiveClicks().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.t3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f12041f.m9073H(themeOptionArrValues, (DialogInterface) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.z3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f12072f.m9074I(preferenceFindPreference, charSequenceArr, (ThemeManager.ThemeOption) obj);
            }
        }).m40110s0().m40056D0());
    }

    private void setupClickHandlers() {
        handleDeleteAccountVisibility();
        Preference preferenceFindPreference = findPreference(SettingsConstants.CHECK_AUTO_UPDATE);
        preferenceFindPreference.m4015S0(this.marketResourceFormatter.formatString(getContext(), C1146R.string.setting_category_autoupdate_title, new String[0]));
        preferenceFindPreference.mo3959P0(this.marketResourceFormatter.formatString(getContext(), C1146R.string.setting_category_autoupdate_message, new String[0]));
        this.subscriptions.m40667a(RxPreference.clicks(this.deleteAccount).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.r3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f12031f.m9085T((Preference) obj);
            }
        }).m40057E().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.d3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11948f.m9086U((Account) obj);
            }
        }).m40056D0());
        this.subscriptions.m40667a(RxPreference.clicks(this.socialCampaignNotifications).m40061G0(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.w3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f12057f.m9087V((Preference) obj);
            }
        }));
        this.subscriptions.m40667a(RxPreference.clicks(this.excludedUpdates).m40061G0(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.n2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f12007f.m9075J((Preference) obj);
            }
        }));
        this.subscriptions.m40667a(RxPreference.clicks(this.sendFeedback).m40061G0(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.w2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f12056f.m9076K((Preference) obj);
            }
        }));
        if (this.settingsManager.showGDPR()) {
            this.subscriptions.m40667a(RxPreference.clicks(this.termsAndConditions).m40061G0(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.e4
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    this.f11955f.m9077L((Preference) obj);
                }
            }));
            this.subscriptions.m40667a(RxPreference.clicks(this.privacyPolicy).m40061G0(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.v3
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    this.f12052f.m9078M((Preference) obj);
                }
            }));
        }
        findPreference(SettingsConstants.FILTER_APPS).m4006N0(new Preference.InterfaceC0544d() { // from class: cm.aptoide.pt.view.settings.r2
            @Override // androidx.preference.Preference.InterfaceC0544d
            public final boolean onPreferenceClick(Preference preference) {
                return this.f12030a.m9079N(preference);
            }
        });
        findPreference(SettingsConstants.CLEAR_CACHE).m4006N0(new Preference.InterfaceC0544d() { // from class: cm.aptoide.pt.view.settings.u2
            @Override // androidx.preference.Preference.InterfaceC0544d
            public final boolean onPreferenceClick(Preference preference) {
                return this.f12046a.m9083R(preference);
            }
        });
        Preference preferenceFindPreference2 = findPreference(SettingsConstants.HARDWARE_SPECS);
        final String formattedDensity = getFormattedDensity(AptoideUtils.ScreenU.getDensityDpi(getActivity().getWindowManager()));
        preferenceFindPreference2.m4006N0(new Preference.InterfaceC0544d() { // from class: cm.aptoide.pt.view.settings.o4
            @Override // androidx.preference.Preference.InterfaceC0544d
            public final boolean onPreferenceClick(Preference preference) {
                return this.f12015a.m9084S(formattedDensity, preference);
            }
        });
        findPreference(SettingsConstants.ABOUT_DIALOG).m4006N0(new C48841());
        setupAdultContentClickHandlers();
    }

    private void setupFileMaxCacheDialog() {
        this.fileMaxCacheDialog = new InputDialog.Builder(getContext(), this.themeManager).setMessage(C1146R.string.settings_maxFileCache_title).setPositiveButton(C1146R.string.all_button_ok).setNegativeButton(C1146R.string.cancel).setView(C1146R.layout.dialog_request_input).setEditText(C1146R.id.input).build();
    }

    private boolean shouldRefreshUpdates(String str) {
        return str.equals(ManagedKeys.UPDATES_FILTER_ALPHA_BETA_KEY) || str.equals(ManagedKeys.HWSPECS_FILTER) || str.equals(ManagedKeys.UPDATES_SYSTEM_APPS_KEY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: trackLock, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m9108x() {
        if (this.trackAnalytics) {
            this.trackAnalytics = false;
            this.adultContentAnalytics.lock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: trackUnlock, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m9102r() {
        if (this.trackAnalytics) {
            this.trackAnalytics = false;
            this.adultContentAnalytics.unlock();
        }
    }

    @Override // androidx.preference.AbstractC0563g, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((BaseActivity) getContext()).getActivityComponent().inject(this);
        AptoideApplication aptoideApplication = (AptoideApplication) getContext().getApplicationContext();
        this.trackAnalytics = true;
        this.accountManager = ((AptoideApplication) getContext().getApplicationContext()).getAccountManager();
        this.subscriptions = new C11426b();
        this.fragmentNavigator = ((ActivityResultNavigator) getActivity()).getFragmentNavigator();
        this.notificationSyncScheduler = ((AptoideApplication) getContext().getApplicationContext()).getNotificationSyncScheduler();
        ((AptoideApplication) getContext().getApplicationContext()).getNavigationTracker().registerScreen(ScreenTagHistory.Builder.build(getClass().getSimpleName()));
        this.adultContentAnalytics = aptoideApplication.getAdultContentAnalytics();
        this.settingsManager = ((AptoideApplication) getContext().getApplicationContext()).getSettingsManager();
        setAdultContentContent();
        setupFileMaxCacheDialog();
    }

    @Override // androidx.preference.AbstractC0563g
    public void onCreatePreferences(Bundle bundle, String str) {
        addPreferencesFromResource(C1146R.xml.settings);
        SharedPreferences defaultSharedPreferences = ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences();
        this.sharedPreferences = defaultSharedPreferences;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
    }

    @Override // androidx.preference.AbstractC0563g, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.preference.AbstractC0563g, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.subscriptions.m40668b();
        this.toolbar = null;
        this.adultContentPreferenceView = null;
        this.adultContentWithPinPreferenceView = null;
        this.socialCampaignNotifications = null;
        this.pinPreferenceView = null;
        this.fileMaxCachePreferenceView = null;
        this.removePinPreferenceView = null;
        this.excludedUpdates = null;
        this.sendFeedback = null;
        this.termsAndConditions = null;
        this.privacyPolicy = null;
        this.deleteAccount = null;
        this.context = null;
        super.onDestroyView();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (shouldRefreshUpdates(str)) {
            this.updatesRepository.sync(true, false, true).m39965I(new InterfaceC11252a() { // from class: cm.aptoide.pt.view.settings.k3
                @Override // p456rx.p460m.InterfaceC11252a
                public final void call() {
                    Logger.getInstance().m8273d(SettingsFragment.TAG, "updates refreshed");
                }
            }, new InterfaceC11253b() { // from class: cm.aptoide.pt.view.settings.q3
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    CrashReport.getInstance().log((Throwable) obj);
                }
            });
        }
    }

    @Override // androidx.preference.AbstractC0563g, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.context = getContext();
        this.toolbar = (Toolbar) view.findViewById(C1146R.id.toolbar);
        ActivityC0067d activityC0067d = (ActivityC0067d) getActivity();
        Toolbar toolbar = this.toolbar;
        if (toolbar != null) {
            activityC0067d.setSupportActionBar(toolbar);
            this.toolbar.setTitle(C1146R.string.settings_title_settings);
            this.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.view.settings.p2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f12020f.m9089e(view2);
                }
            });
            AbstractC0064a supportActionBar = activityC0067d.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.mo227r(true);
            }
        }
        setAdultContentViews();
        this.excludedUpdates = findPreference(EXCLUDED_UPDATES_PREFERENCE_KEY);
        this.sendFeedback = findPreference(SEND_FEEDBACK_PREFERENCE_KEY);
        setGDPR();
        setupAppTheme();
        this.deleteAccount = findPreference(DELETE_ACCOUNT);
        this.socialCampaignNotifications = (SwitchPreferenceCompat) findPreference(ManagedKeys.CAMPAIGN_SOCIAL_NOTIFICATIONS_PREFERENCE_VIEW_KEY);
        this.fileMaxCachePreferenceView = findPreference(ManagedKeys.MAX_FILE_CACHE);
        setupClickHandlers();
    }
}
