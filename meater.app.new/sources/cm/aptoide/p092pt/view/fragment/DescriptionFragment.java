package cm.aptoide.p092pt.view.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0064a;
import androidx.appcompat.app.ActivityC0067d;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C0255a;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.dataprovider.WebService;
import cm.aptoide.p092pt.dataprovider.interfaces.SuccessRequestListener;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetApp;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetAppMeta;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.GetAppRequest;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import cm.aptoide.p092pt.store.StoreUtils;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.view.NotBottomNavigationView;
import javax.inject.Inject;
import okhttp3.OkHttpClient;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class DescriptionFragment extends BaseLoaderToolbarFragment implements NotBottomNavigationView {
    private static final String APP_ID = "app_id";
    private static final String APP_NAME = "APP_NAME";
    private static final String DESCRIPTION = "description";
    private static final String HAS_APPC = "HAS_APPC";
    private static final String PACKAGE_NAME = "packageName";
    private static final String STORE_NAME = "store_name";
    private static final String TAG = DescriptionFragment.class.getSimpleName();
    private long appId;
    private String appName;
    private BodyInterceptor<BaseBody> baseBodyBodyInterceptor;
    private Converter.Factory converterFactory;
    private String description;
    private TextView descriptionContainer;
    private TextView emptyData;
    private boolean hasAppId = false;
    private boolean hasAppc;
    private OkHttpClient httpClient;
    private String packageName;
    private String partnerId;

    @Inject
    StoreCredentialsProvider storeCredentialsProvider;
    private String storeName;

    @Inject
    ThemeManager themeManager;
    private Toolbar toolbar;

    private boolean hasAppc(GetApp getApp) {
        return getApp.getNodes().getMeta().getData().hasAdvertising() || getApp.getNodes().getMeta().getData().hasBilling();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$load$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8992e(GetApp getApp) {
        setupAppDescription(getApp);
        setupTitle(getApp);
        finishLoading();
        if (hasAppc(getApp)) {
            this.hasAppc = true;
            setupAppcAppView();
        }
    }

    public static DescriptionFragment newInstance(String str, String str2, boolean z) {
        DescriptionFragment descriptionFragment = new DescriptionFragment();
        Bundle bundle = new Bundle();
        bundle.putString(APP_NAME, str);
        bundle.putString(DESCRIPTION, str2);
        bundle.putBoolean(HAS_APPC, z);
        descriptionFragment.setArguments(bundle);
        return descriptionFragment;
    }

    private void setDataUnavailable() {
        this.emptyData.setVisibility(0);
        this.descriptionContainer.setVisibility(8);
    }

    private void setupAppDescription(GetApp getApp) {
        try {
            GetAppMeta.Media media = getApp.getNodes().getMeta().getData().getMedia();
            if (!TextUtils.isEmpty(media.getDescription())) {
                this.descriptionContainer.setText(AptoideUtils.HtmlU.parse(media.getDescription()));
                return;
            }
        } catch (NullPointerException e2) {
            CrashReport.getInstance().log(e2);
        }
        setDataUnavailable();
    }

    private void setupAppcAppView() {
        this.toolbar.setBackground(C0255a.m1677f(getContext(), this.themeManager.getAttributeForTheme(C1146R.attr.appDescriptionToolbarAppc).resourceId));
    }

    private void setupTitle(GetApp getApp) {
        try {
            String name = getApp.getNodes().getMeta().getData().getName();
            if (!TextUtils.isEmpty(name) && hasToolbar()) {
                ((ActivityC0067d) getActivity()).getSupportActionBar().mo231v(name);
                return;
            }
        } catch (NullPointerException e2) {
            CrashReport.getInstance().log(e2);
        }
        setDataUnavailable();
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void bindViews(View view) {
        super.bindViews(view);
        this.emptyData = (TextView) view.findViewById(C1146R.id.empty_data);
        this.descriptionContainer = (TextView) view.findViewById(C1146R.id.data_container);
        this.toolbar = (Toolbar) view.findViewById(C1146R.id.toolbar);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment
    protected boolean displayHomeUpAsEnabled() {
        return true;
    }

    @Override // cm.aptoide.p092pt.view.fragment.UiComponent
    public int getContentViewId() {
        return C1146R.layout.fragment_app_view_description;
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(getClass().getSimpleName());
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderFragment
    protected int getViewToShowAfterLoadingId() {
        return C1146R.id.data_container;
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderFragment
    protected int[] getViewsToShowAfterLoadingId() {
        return new int[0];
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, cm.aptoide.p092pt.view.LoadInterface
    public void load(boolean z, boolean z2, Bundle bundle) {
        if (TextUtils.isEmpty(this.description) || TextUtils.isEmpty(this.appName)) {
            if (this.hasAppId) {
                GetAppRequest.m7440of(this.appId, this.partnerId == null ? null : this.storeName, StoreUtils.getStoreCredentials(this.storeName, this.storeCredentialsProvider), this.packageName, this.baseBodyBodyInterceptor, this.httpClient, this.converterFactory, ((AptoideApplication) getContext().getApplicationContext()).getTokenInvalidator(), ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences()).execute(new SuccessRequestListener() { // from class: cm.aptoide.pt.view.fragment.c
                    @Override // cm.aptoide.p092pt.dataprovider.interfaces.SuccessRequestListener, p456rx.p460m.InterfaceC11253b
                    public final void call(Object obj) {
                        this.f11840f.m8992e((GetApp) obj);
                    }
                }, false);
                return;
            } else {
                Logger.getInstance().m8277e(TAG, "App id unavailable");
                setDataUnavailable();
                return;
            }
        }
        this.descriptionContainer.setText(AptoideUtils.HtmlU.parse(this.description));
        if (hasToolbar()) {
            AbstractC0064a supportActionBar = ((ActivityC0067d) getActivity()).getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.mo231v(this.appName);
            }
            if (this.hasAppc) {
                setupAppcAppView();
            }
        }
        finishLoading();
    }

    @Override // cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void loadExtras(Bundle bundle) {
        super.loadExtras(bundle);
        if (bundle.containsKey("app_id")) {
            this.appId = bundle.getLong("app_id", -1L);
            this.hasAppId = true;
        }
        if (bundle.containsKey("packageName")) {
            this.packageName = bundle.getString("packageName");
        }
        if (bundle.containsKey("store_name")) {
            this.storeName = bundle.getString("store_name");
        }
        if (bundle.containsKey(DESCRIPTION)) {
            this.description = bundle.getString(DESCRIPTION);
        }
        if (bundle.containsKey(APP_NAME)) {
            this.appName = bundle.getString(APP_NAME);
        }
        if (bundle.containsKey(HAS_APPC)) {
            this.hasAppc = bundle.getBoolean(HAS_APPC);
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        AptoideApplication aptoideApplication = (AptoideApplication) getContext().getApplicationContext();
        this.baseBodyBodyInterceptor = aptoideApplication.getAccountSettingsBodyInterceptorPoolV7();
        this.httpClient = aptoideApplication.getDefaultClient();
        this.converterFactory = WebService.getDefaultConverter();
        this.partnerId = aptoideApplication.getPartnerId();
        setHasOptionsMenu(true);
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(C1146R.menu.menu_empty, menu);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }
}
