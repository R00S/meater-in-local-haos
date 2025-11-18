package cm.aptoide.p092pt.view.settings;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0064a;
import androidx.appcompat.app.ActivityC0067d;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.content.C0255a;
import androidx.fragment.app.Fragment;
import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.aptoideviews.socialmedia.SocialMediaView;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.MyAccountManager;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.dataprovider.WebService;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.GetStore;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseRequestWithStore;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.GetStoreRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.StoreContext;
import cm.aptoide.p092pt.link.CustomTabsHelper;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.socialmedia.SocialMediaAnalytics;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.view.BackButtonFragment;
import cm.aptoide.p092pt.view.NotBottomNavigationView;
import javax.inject.Inject;
import javax.inject.Named;
import okhttp3.OkHttpClient;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.C11234e;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11256e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class MyAccountFragment extends BackButtonFragment implements SharedPreferences.OnSharedPreferenceChangeListener, MyAccountView, NotBottomNavigationView {
    private static final float STROKE_SIZE = 0.04f;

    @Inject
    AccountAnalytics accountAnalytics;
    private AptoideAccountManager accountManager;
    private View accountView;
    private CardView aptoideBackupAppsCardView;
    private CardView aptoideTvCardView;
    private CardView aptoideUploaderCardView;
    private BodyInterceptor<BaseBody> bodyInterceptor;
    private Converter.Factory converterFactory;
    private Button createStoreButton;
    private TextView createStoreMessage;
    private Button editProfileButton;
    private Button editStoreButton;
    private OkHttpClient httpClient;
    private Button loginButton;
    private View loginView;
    private Button logoutButton;

    @Inject
    @Named
    String marketName;
    private ImageView myAccountAvatar;

    @Inject
    MyAccountManager myAccountManager;
    private TextView myAccountName;

    @Inject
    MyAccountNavigator myAccountNavigator;
    private TextView myAccountProductCardTitle;
    private View myProfileView;
    private ImageView myStoreAvatar;
    private TextView myStoreName;
    private View myStoreView;
    private View settings;

    @Inject
    SocialMediaAnalytics socialMediaAnalytics;
    private SocialMediaView socialMediaView;

    @Inject
    ThemeManager themeManager;
    protected Toolbar toolbar;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getStore$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m9010e(Account account) {
        return GetStoreRequest.m7491of(new BaseRequestWithStore.StoreCredentials(account.getStore().getName(), (String) null, (String) null), StoreContext.meta, this.bodyInterceptor, this.httpClient, this.converterFactory, ((AptoideApplication) getContext().getApplicationContext()).getTokenInvalidator(), ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences(), getContext().getResources(), (WindowManager) getContext().getSystemService("window")).observe();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupToolbar$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9011f(View view) {
        getActivity().onBackPressed();
    }

    public static Fragment newInstance() {
        return new MyAccountFragment();
    }

    private void setAccountViews(View view) {
        this.myProfileView = view.findViewById(C1146R.id.my_profile);
        this.myStoreView = view.findViewById(C1146R.id.my_store);
        this.accountView = view.findViewById(C1146R.id.account_displayables);
        this.loginView = view.findViewById(C1146R.id.login_register_container);
        this.myAccountAvatar = (ImageView) this.myProfileView.findViewById(C1146R.id.user_icon);
        this.myAccountName = (TextView) this.myProfileView.findViewById(C1146R.id.description);
        this.myStoreAvatar = (ImageView) this.myStoreView.findViewById(C1146R.id.user_icon);
        this.myStoreName = (TextView) this.myStoreView.findViewById(C1146R.id.description);
        ((TextView) this.myStoreView.findViewById(C1146R.id.name)).setText(C1146R.string.newaccount_my_store);
        ((TextView) this.myProfileView.findViewById(C1146R.id.name)).setText(C1146R.string.newaccount_my_profile);
        this.loginButton = (Button) view.findViewById(C1146R.id.login_button);
        this.logoutButton = (Button) view.findViewById(C1146R.id.logout_button);
        this.createStoreMessage = (TextView) view.findViewById(C1146R.id.create_store_message);
        this.createStoreButton = (Button) view.findViewById(C1146R.id.create_store_button);
        this.editStoreButton = (Button) this.myStoreView.findViewById(C1146R.id.edit_button);
        this.editProfileButton = (Button) this.myProfileView.findViewById(C1146R.id.edit_button);
        this.aptoideTvCardView = (CardView) view.findViewById(C1146R.id.product_aptoideTv_cardview);
        this.aptoideUploaderCardView = (CardView) view.findViewById(C1146R.id.product_uploader_cardview);
        this.aptoideBackupAppsCardView = (CardView) view.findViewById(C1146R.id.product_backup_cardview);
        this.socialMediaView = (SocialMediaView) view.findViewById(C1146R.id.social_media_view);
    }

    private void setUserProfile(Account account) {
        if (TextUtils.isEmpty(account.getNickname())) {
            this.myAccountName.setText(account.getEmail());
        } else {
            this.myAccountName.setText(account.getNickname());
        }
        if (TextUtils.isEmpty(account.getAvatar())) {
            return;
        }
        ImageLoader.with(getContext()).loadWithShadowCircleTransformWithPlaceholder(account.getAvatar(), this.myAccountAvatar, STROKE_SIZE, C1146R.attr.placeholder_myaccount);
    }

    private void setUserStore(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.myStoreName.setText(str);
        ImageLoader.with(getContext()).loadWithShadowCircleTransformWithPlaceholder(str2, this.myStoreAvatar, STROKE_SIZE, C1146R.attr.placeholder_myaccount);
    }

    private void setupProductCardViews() {
        ((TextView) this.aptoideTvCardView.findViewById(C1146R.id.product_title_textview)).setText(getString(C1146R.string.product_card_aptoide_tv_title));
        ((TextView) this.aptoideTvCardView.findViewById(C1146R.id.product_subtitle_textview)).setText(getString(C1146R.string.product_card_aptoide_tv_subtitle));
        ((ImageView) this.aptoideTvCardView.findViewById(C1146R.id.product_icon_imageview)).setImageDrawable(C0255a.m1677f(getContext(), C1146R.drawable.ic_product_tv));
        ((TextView) this.aptoideUploaderCardView.findViewById(C1146R.id.product_title_textview)).setText(getString(C1146R.string.product_card_aptoide_uploader_title));
        ((TextView) this.aptoideUploaderCardView.findViewById(C1146R.id.product_subtitle_textview)).setText(getString(C1146R.string.product_card_aptoide_uploader_subtitle));
        ((ImageView) this.aptoideUploaderCardView.findViewById(C1146R.id.product_icon_imageview)).setImageDrawable(C0255a.m1677f(getContext(), C1146R.drawable.ic_product_uploader));
        ((TextView) this.aptoideBackupAppsCardView.findViewById(C1146R.id.product_title_textview)).setText(getString(C1146R.string.product_card_aptoide_backup_apps_title));
        ((TextView) this.aptoideBackupAppsCardView.findViewById(C1146R.id.product_subtitle_textview)).setText(getString(C1146R.string.product_card_aptoide_backup_apps_subtitle));
        ((ImageView) this.aptoideBackupAppsCardView.findViewById(C1146R.id.product_icon_imageview)).setImageDrawable(C0255a.m1677f(getContext(), C1146R.drawable.ic_product_backup_apps));
    }

    private void setupToolbar() {
        this.toolbar.setTitle(C1146R.string.my_account_title_my_account);
        ActivityC0067d activityC0067d = (ActivityC0067d) getActivity();
        activityC0067d.setSupportActionBar(this.toolbar);
        AbstractC0064a supportActionBar = activityC0067d.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo227r(true);
            supportActionBar.mo231v(this.toolbar.getTitle());
        }
        this.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.view.settings.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11932f.m9011f(view);
            }
        });
    }

    private void showAccountAndStoreDisplayable() {
        this.loginView.setVisibility(8);
        this.accountView.setVisibility(0);
        this.myProfileView.setVisibility(0);
        this.myStoreView.setVisibility(0);
        this.createStoreButton.setVisibility(8);
        this.createStoreMessage.setVisibility(8);
    }

    private void showAccountNoStoreDisplayable() {
        this.loginView.setVisibility(8);
        this.accountView.setVisibility(0);
        this.myProfileView.setVisibility(0);
        this.myStoreView.setVisibility(8);
        if (this.myAccountManager.shouldShowCreateStore()) {
            this.createStoreButton.setVisibility(0);
            this.createStoreMessage.setVisibility(0);
        } else {
            this.createStoreButton.setVisibility(8);
            this.createStoreMessage.setVisibility(8);
        }
    }

    @Override // cm.aptoide.p092pt.view.settings.MyAccountView
    public C11234e<Void> aptoideBackupCardViewClick() {
        return C8975a.m28573a(this.aptoideBackupAppsCardView);
    }

    @Override // cm.aptoide.p092pt.view.settings.MyAccountView
    public C11234e<Void> aptoideTvCardViewClick() {
        return C8975a.m28573a(this.aptoideTvCardView);
    }

    @Override // cm.aptoide.p092pt.view.settings.MyAccountView
    public C11234e<Void> aptoideUploaderCardViewClick() {
        return C8975a.m28573a(this.aptoideUploaderCardView);
    }

    @Override // cm.aptoide.p092pt.view.settings.MyAccountView
    public C11234e<Void> createStoreClick() {
        return C8975a.m28573a(this.createStoreButton);
    }

    @Override // cm.aptoide.p092pt.view.settings.MyAccountView
    public C11234e<Void> editStoreClick() {
        return C8975a.m28573a(this.editStoreButton);
    }

    @Override // cm.aptoide.p092pt.view.settings.MyAccountView
    public C11234e<Void> editUserProfileClick() {
        return C8975a.m28573a(this.editProfileButton);
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(getClass().getSimpleName());
    }

    @Override // cm.aptoide.p092pt.view.settings.MyAccountView
    public C11234e<GetStore> getStore() {
        return this.accountManager.accountStatus().m40057E().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.settings.a
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11926f.m9010e((Account) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.view.settings.MyAccountView
    public C11234e<Void> loginClick() {
        return C8975a.m28573a(this.loginButton);
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        AptoideApplication aptoideApplication = (AptoideApplication) getContext().getApplicationContext();
        this.accountManager = ((AptoideApplication) getContext().getApplicationContext()).getAccountManager();
        this.bodyInterceptor = aptoideApplication.getAccountSettingsBodyInterceptorPoolV7();
        this.httpClient = aptoideApplication.getDefaultClient();
        this.converterFactory = WebService.getDefaultConverter();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1146R.layout.fragment_my_account, viewGroup, false);
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.myProfileView = null;
        this.myStoreView = null;
        this.loginView = null;
        this.accountView = null;
        this.createStoreMessage = null;
        this.myAccountAvatar = null;
        this.myAccountName = null;
        this.myStoreName = null;
        this.loginButton = null;
        this.logoutButton = null;
        this.createStoreButton = null;
        this.editStoreButton = null;
        this.editProfileButton = null;
        this.aptoideBackupAppsCardView = null;
        this.aptoideTvCardView = null;
        this.aptoideUploaderCardView = null;
        this.socialMediaView = null;
        super.onDestroyView();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((TextView) view.findViewById(C1146R.id.sign_in_message)).setText(getString(C1146R.string.newaccount_signin_message, this.marketName));
        this.toolbar = (Toolbar) view.findViewById(C1146R.id.toolbar);
        this.settings = view.findViewById(C1146R.id.settings);
        TextView textView = (TextView) view.findViewById(C1146R.id.my_account_product_card_title);
        this.myAccountProductCardTitle = textView;
        textView.setText(getString(C1146R.string.my_account_product_card_section_title));
        setAccountViews(view);
        setupToolbar();
        setupProductCardViews();
        attachPresenter(new MyAccountPresenter(this, this.accountManager, CrashReport.getInstance(), C11250a.m40156b(), this.myAccountNavigator, this.accountAnalytics, this.socialMediaAnalytics));
    }

    @Override // cm.aptoide.p092pt.view.settings.MyAccountView
    public void refreshUI(Store store) {
        this.myStoreName.setText(store.getName());
        setUserStore(store.getName(), store.getAvatar());
    }

    @Override // cm.aptoide.p092pt.view.settings.MyAccountView
    public C11234e<Void> settingsClicked() {
        return C8975a.m28573a(this.settings);
    }

    @Override // cm.aptoide.p092pt.view.settings.MyAccountView
    public void showAccount(Account account) {
        if (TextUtils.isEmpty(account.getEmail())) {
            showLoginAccountDisplayable();
            return;
        }
        if (account.getStore().getName().isEmpty()) {
            showAccountNoStoreDisplayable();
            setUserProfile(account);
        } else {
            showAccountAndStoreDisplayable();
            setUserProfile(account);
            setUserStore(account.getStore().getName(), account.getStore().getAvatar());
        }
    }

    @Override // cm.aptoide.p092pt.view.settings.MyAccountView
    public void showLoginAccountDisplayable() {
        this.loginView.setVisibility(0);
        this.accountView.setVisibility(8);
    }

    @Override // cm.aptoide.p092pt.view.settings.MyAccountView
    public C11234e<Void> signOutClick() {
        return C8975a.m28573a(this.logoutButton);
    }

    @Override // cm.aptoide.p092pt.view.settings.MyAccountView
    public C11234e<SocialMediaView.SocialMediaType> socialMediaClick() {
        return this.socialMediaView.onSocialMediaClick();
    }

    @Override // cm.aptoide.p092pt.view.settings.MyAccountView
    public void startAptoideTvWebView() {
        CustomTabsHelper.getInstance().openInChromeCustomTab("https://blog.aptoide.com/what-is-aptoidetv/", getContext(), this.themeManager.getAttributeForTheme(C1146R.attr.colorPrimary).resourceId);
    }

    @Override // cm.aptoide.p092pt.view.settings.MyAccountView
    public C11234e<Void> storeClick() {
        return C8975a.m28573a(this.myStoreView);
    }

    @Override // cm.aptoide.p092pt.view.settings.MyAccountView
    public C11234e<Void> userClick() {
        return C8975a.m28573a(this.myProfileView);
    }
}
