package cm.aptoide.p092pt;

import android.content.Intent;
import android.content.UriMatcher;
import android.content.pm.ShortcutManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.dataprovider.BuildConfig;
import cm.aptoide.p092pt.dataprovider.WebService;
import cm.aptoide.p092pt.dataprovider.exception.AptoideWsV7Exception;
import cm.aptoide.p092pt.dataprovider.exception.NoNetworkConnectionException;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetApp;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.GetAppRequest;
import cm.aptoide.p092pt.download.DownloadAnalytics;
import cm.aptoide.p092pt.link.AptoideInstall;
import cm.aptoide.p092pt.link.AptoideInstallParser;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.notification.ReadyToInstallNotificationManager;
import cm.aptoide.p092pt.reviews.RateAndReviewsFragment;
import cm.aptoide.p092pt.store.StoreUtils;
import cm.aptoide.p092pt.themes.NewFeature;
import cm.aptoide.p092pt.timeline.view.follow.TimeLineFollowFragment;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.utils.design.ShowMessage;
import cm.aptoide.p092pt.view.ActivityView;
import cm.aptoide.p092pt.wallet.WalletInstallActivity;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class DeepLinkIntentReceiver extends ActivityView {
    public static final String AUTHORITY = "cm.aptoide.pt";
    public static final int DEEPLINK_ID = 1;
    public static final String DEEP_LINK = "deeplink";
    public static final String FROM_SHORTCUT = "from_shortcut";
    public static final String SCHEDULE_DOWNLOADS = "schedule_downloads";
    public static final int SCHEDULE_DOWNLOADS_ID = 2;
    private static final String TAG = DeepLinkIntentReceiver.class.getSimpleName();
    private static final UriMatcher sURIMatcher;
    private AnalyticsManager analyticsManager;
    private DeepLinkAnalytics deepLinkAnalytics;
    private NavigationTracker navigationTracker;
    private NewFeature newFeature;
    private boolean shortcutNavigation;
    private final Class startClass = AptoideApplication.getActivityProvider().getMainActivityFragmentClass();

    public static class DeepLinksKeys {
        public static final String ACTION = "action";
        public static final String APK_FY = "APK_FY";
        public static final String APP_ID_KEY = "appId";
        public static final String APP_MD5_KEY = "md5";
        public static final String AUTH_TOKEN = "auth_token";
        public static final String CARD_ID = "cardId";
        public static final String FROM_NOTIFICATION_READY_TO_INSTALL = "notification_ready_to_install";

        /* renamed from: ID */
        public static final String f7163ID = "id";
        public static final String LAYOUT = "layout";
        public static final String NAME = "name";
        public static final String OEM_ID_KEY = "oemId";
        public static final String OPEN_TYPE = "open_type";
        public static final String PACKAGE_NAME_KEY = "packageName";
        public static final String SLUG = "slug";
        public static final String STORENAME_KEY = "storeName";
        public static final String STORE_THEME = "storetheme";
        public static final String TITLE = "title";
        public static final String TYPE = "type";
        public static final String UNAME = "uname";
        public static final String URI = "uri";
        public static final String WALLET_PACKAGE_NAME_KEY = "wallet_package_name";
    }

    public static class DeepLinksTargets {
        public static final String APPC_ADS = "appc_ads";
        public static final String APPC_INFO_VIEW = "appc_info_view";
        public static final String APPS = "apps";
        public static final String APP_VIEW_FRAGMENT = "appViewFragment";
        public static final String APTOIDE_AUTH = "aptoide_auth";
        public static final String EDITORIAL_DEEPLINK = "editorial";
        public static final String FEATURE = "feature";
        public static final String FROM_AD = "fromAd";
        public static final String FROM_DOWNLOAD_NOTIFICATION = "fromDownloadNotification";
        public static final String GENERIC_DEEPLINK = "generic_deeplink";
        public static final String HOME_DEEPLINK = "home_tab";
        public static final String MY_STORE_DEEPLINK = "my_store";
        public static final String NEW_REPO = "newrepo";
        public static final String NEW_UPDATES = "new_updates";
        public static final String PICK_APP_DEEPLINK = "pick_app_deeplink";
        public static final String PROMOTIONAL_DEEPLINK = "promotional";
        public static final String PROMOTIONS_DEEPLINK = "promotions";
        public static final String SEARCH_FRAGMENT = "searchFragment";
        public static final String TIMELINE_DEEPLINK = "apps_timeline";
        public static final String USER_DEEPLINK = "open_user_profile";
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        sURIMatcher = uriMatcher;
        uriMatcher.addURI("cm.aptoide.pt", DEEP_LINK, 1);
        uriMatcher.addURI("cm.aptoide.pt", SCHEDULE_DOWNLOADS, 2);
    }

    private Intent dealWithAptoideAuthentication(String str) {
        return parseAptoideAuthUri(str.split("app.aptoide.com/auth/code/")[1].split("/")[0]);
    }

    private Intent dealWithAptoideRepo(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str.substring(14));
        return startWithRepo(StoreUtils.split(arrayList));
    }

    private Intent dealWithAptoideSchema(Uri uri) {
        if ("getHome".equals(uri.getQueryParameter("name"))) {
            String queryParameter = uri.getQueryParameter(TimeLineFollowFragment.BundleKeys.USER_ID);
            if (queryParameter != null) {
                return openUserScreen(Long.valueOf(queryParameter));
            }
            return null;
        }
        if ("getUserTimeline".equals(uri.getQueryParameter("name"))) {
            return startFromAppsTimeline(uri.getQueryParameter("cardId"));
        }
        if ("search".equals(uri.getQueryParameter("name"))) {
            return startFromSearch(uri.getQueryParameterNames().contains("keyword") ? uri.getQueryParameter("keyword") : HttpUrl.FRAGMENT_ENCODE_SET);
        }
        if ("myStore".equals(uri.getQueryParameter("name"))) {
            return startFromMyStore();
        }
        if ("pickApp".equals(uri.getQueryParameter("name"))) {
            return startFromPickApp();
        }
        if (DeepLinksTargets.PROMOTIONS_DEEPLINK.equals(uri.getQueryParameter("name"))) {
            return startFromPromotions();
        }
        if ("CURATION_1".equals(uri.getQueryParameter("name")) && uri.getQueryParameter(DeepLinksKeys.f7163ID) != null) {
            return startFromEditorialCard(uri.getQueryParameter(DeepLinksKeys.f7163ID));
        }
        if ("NEW_APP".equals(uri.getQueryParameter("name")) || "NEW_APP_VERSION".equals(uri.getQueryParameter("name"))) {
            return startFromHome();
        }
        if (("IN_GAME_EVENT".equals(uri.getQueryParameter("name")) || "NEWS_ITEM".equals(uri.getQueryParameter("name"))) && uri.getQueryParameter(DeepLinksKeys.f7163ID) != null) {
            return startFromPromotionalCard(uri.getQueryParameter(DeepLinksKeys.f7163ID));
        }
        if (DeepLinksTargets.APPC_INFO_VIEW.equals(uri.getQueryParameter("name"))) {
            return startAppcInfoView();
        }
        if ("appcoins_ads".equals(uri.getQueryParameter("name"))) {
            return startFromAppcAds();
        }
        if (sURIMatcher.match(uri) == 1) {
            return startGenericDeepLink(uri);
        }
        return null;
    }

    private Intent dealWithAptoideWebsite(Uri uri) {
        String lastPathSegment;
        if (uri.getPath() != null && (uri.getPath().contains("thank-you") || uri.getPath().contains(DownloadAnalytics.RAKAM_DOWNLOAD_EVENT))) {
            this.deepLinkAnalytics.websiteFromThankYouWebPage();
            String queryParameter = uri.getQueryParameter(RateAndReviewsFragment.BundleCons.APP_ID);
            Logger.getInstance().m8283v(TAG, "aptoide thank you: app id: " + queryParameter);
            if (!TextUtils.isEmpty(queryParameter)) {
                return parseAptoideInstallUri(queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("package_uname");
            if (!TextUtils.isEmpty(queryParameter2)) {
                return parseAptoideInstallUri("uname=" + queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("package_name");
            if (TextUtils.isEmpty(queryParameter3)) {
                return null;
            }
            return parseAptoideInstallUri("package=" + queryParameter3);
        }
        if (uri.getPath() != null && uri.getPath().contains("group")) {
            this.deepLinkAnalytics.websiteFromBundlesWebPage();
            List<String> pathSegments = uri.getPathSegments();
            boolean zContains = uri.getPath().contains(AccountAnalytics.STORE);
            String str = DeepLinksTargets.APPS;
            if (!zContains) {
                lastPathSegment = uri.getLastPathSegment();
            } else if (pathSegments == null || pathSegments.size() < 4) {
                lastPathSegment = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                lastPathSegment = pathSegments.get(3);
                str = pathSegments.get(1);
            }
            Logger logger = Logger.getInstance();
            String str2 = TAG;
            logger.m8283v(str2, "aptoide web site: bundle: " + lastPathSegment);
            if (!TextUtils.isEmpty(lastPathSegment)) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("aptoide://cm.aptoide.pt/deeplink?name=listApps&layout=GRID&type=API&title=bundle&action=");
                    sb.append(URLEncoder.encode("https://ws75-cache.aptoide.com/api/7/listApps/store_name=" + str + "/group_name=" + lastPathSegment + "/limit=30/sort=downloads7d", "utf-8"));
                    sb.append("&storetheme=default");
                    Uri uri2 = Uri.parse(sb.toString());
                    Logger.getInstance().m8283v(str2, "aptoide web site: bundle: " + uri2.toString());
                    return dealWithAptoideSchema(uri2);
                } catch (Exception e2) {
                    Logger.getInstance().m8278e(TAG, "dealWithAptoideWebsite: ", e2);
                    return null;
                }
            }
        } else {
            if (uri.getPath() != null && uri.getPath().contains(AccountAnalytics.STORE)) {
                this.deepLinkAnalytics.websiteFromStoreWebPage();
                Logger.getInstance().m8283v(TAG, "aptoide web site: store: " + uri.getLastPathSegment());
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(uri.getLastPathSegment());
                return startWithRepo(arrayList);
            }
            if (uri.getPath() != null && uri.getPath().contains(DeepLinksTargets.EDITORIAL_DEEPLINK)) {
                return startEditorialFromSlug(uri.getPath().split("/")[2]);
            }
            if (uri.getPath() != null && uri.getPath().contains("appcoins")) {
                return startAppcInfoView();
            }
            String[] strArrSplit = uri.getHost().split("\\.");
            if (strArrSplit != null && strArrSplit.length == 4) {
                this.deepLinkAnalytics.websiteFromAppViewWebPage();
                Logger.getInstance().m8283v(TAG, "aptoide web site: app view: " + strArrSplit[0]);
                return startAppView(strArrSplit[0]);
            }
            if (strArrSplit != null && strArrSplit.length == 3) {
                this.deepLinkAnalytics.websiteFromHomeWebPage();
                Logger.getInstance().m8283v(TAG, "aptoide web site: home: " + strArrSplit[0]);
                return startFromHome();
            }
        }
        return null;
    }

    private Intent dealWithGoogleHost(Uri uri) {
        String queryParameter = uri.getQueryParameter(DeepLinksKeys.f7163ID);
        if (queryParameter.contains("pname:")) {
            queryParameter = queryParameter.substring(6);
        } else if (queryParameter.contains("pub:")) {
            queryParameter = queryParameter.substring(4);
        }
        return startFromPackageName(queryParameter);
    }

    private Intent dealWithMarketSchema(String str, Uri uri) {
        String strSubstring;
        if ("details".equalsIgnoreCase(uri.getHost())) {
            strSubstring = uri.getQueryParameter(DeepLinksKeys.f7163ID);
        } else if ("search".equalsIgnoreCase(uri.getHost())) {
            strSubstring = uri.getQueryParameter("q");
        } else {
            String str2 = str.split("&")[0];
            String[] strArrSplit = str2.split("=");
            strSubstring = (strArrSplit == null || strArrSplit.length <= 1) ? HttpUrl.FRAGMENT_ENCODE_SET : str2.split("=")[1];
            if (strSubstring.contains("pname:")) {
                strSubstring = strSubstring.substring(6);
            } else if (strSubstring.contains("pub:")) {
                strSubstring = strSubstring.substring(4);
            }
        }
        String queryParameter = uri.getQueryParameter("utm_source");
        String queryParameter2 = uri.getQueryParameter("app_source");
        if (queryParameter != null && isFromAppCoins(queryParameter) && AptoideApplication.APPCOINS_WALLET_PACKAGE_NAME.equals(strSubstring)) {
            this.deepLinkAnalytics.sendWalletDeepLinkEvent(queryParameter);
            if (queryParameter.equals("appcoinssdk")) {
                return startWalletInstallIntent(strSubstring, queryParameter, queryParameter2);
            }
        }
        return startFromPackageName(strSubstring);
    }

    private void dealWithShortcuts() {
        if (Build.VERSION.SDK_INT >= 25) {
            ShortcutManager shortcutManager = (ShortcutManager) getApplicationContext().getSystemService(ShortcutManager.class);
            Intent intent = getIntent();
            if (intent != null) {
                if (intent.hasExtra("search")) {
                    if (intent.getBooleanExtra("search", false)) {
                        this.shortcutNavigation = true;
                        if (shortcutManager != null) {
                            shortcutManager.reportShortcutUsed("search");
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (intent.hasExtra("timeline") && intent.getBooleanExtra("timeline", false)) {
                    this.shortcutNavigation = true;
                    if (shortcutManager != null) {
                        shortcutManager.reportShortcutUsed("timeline");
                    }
                }
            }
        }
    }

    private Intent dealWithWebservicesAptoide(String str) {
        Map<String, String> mapSplitQuery;
        try {
            mapSplitQuery = AptoideUtils.StringU.splitQuery(URI.create(str));
        } catch (UnsupportedEncodingException e2) {
            CrashReport.getInstance().log(e2);
            mapSplitQuery = null;
        }
        if (mapSplitQuery != null) {
            String value = null;
            for (Map.Entry<String, String> entry : mapSplitQuery.entrySet()) {
                if (entry.getKey().equals("uid")) {
                    value = entry.getValue();
                }
            }
            if (value != null) {
                try {
                    return startFromAppView(Long.parseLong(value), null, "open_with_install_popup", "no_origin");
                } catch (NumberFormatException e3) {
                    CrashReport.getInstance().log(e3);
                    CrashReport.getInstance().log(e3);
                    ShowMessage.asToast(getApplicationContext(), C1146R.string.simple_error_occured + value);
                }
            }
        }
        return null;
    }

    private boolean isFromAppCoins(String str) {
        return str.equals("myappcoins") || str.equals("appcoinssdk");
    }

    private Intent openUserScreen(Long l) {
        Intent intent = new Intent(this, (Class<?>) this.startClass);
        intent.putExtra(DeepLinksTargets.USER_DEEPLINK, l);
        return intent;
    }

    private Intent parseAptoideAuthUri(String str) {
        Intent intent = new Intent(this, (Class<?>) this.startClass);
        intent.putExtra(DeepLinksTargets.APTOIDE_AUTH, true);
        intent.putExtra(DeepLinksKeys.AUTH_TOKEN, str);
        intent.setFlags(805306368);
        return intent;
    }

    private Intent parseAptoideInstallUri(String str) {
        AptoideInstall aptoideInstall = new AptoideInstallParser().parse(str);
        return aptoideInstall.getAppId() > 0 ? startFromAppView(aptoideInstall.getAppId(), aptoideInstall.getPackageName(), aptoideInstall.getOpenType(), aptoideInstall.getOrigin()) : !TextUtils.isEmpty(aptoideInstall.getUname()) ? startAppView(aptoideInstall.getUname()) : startFromAppview(aptoideInstall.getStoreName(), aptoideInstall.getPackageName(), aptoideInstall.getOpenType(), aptoideInstall.getOrigin());
    }

    private Intent parseFeatureUri(String str) {
        Intent intent = new Intent(this, (Class<?>) this.startClass);
        intent.putExtra(DeepLinksTargets.FEATURE, true);
        if (str.contains("id=" + this.newFeature.getId())) {
            intent.putExtra(DeepLinksKeys.f7163ID, this.newFeature.getId());
            if (str.contains("action=" + this.newFeature.getActionId())) {
                intent.putExtra("action", this.newFeature.getActionId());
            }
        }
        return intent;
    }

    private Intent startAppcInfoView() {
        Intent intent = new Intent(this, (Class<?>) this.startClass);
        intent.putExtra(DeepLinksTargets.APPC_INFO_VIEW, true);
        return intent;
    }

    private Intent startEditorialFromSlug(String str) {
        Intent intent = new Intent(this, (Class<?>) this.startClass);
        intent.putExtra(DeepLinksTargets.EDITORIAL_DEEPLINK, true);
        intent.putExtra("slug", str);
        return intent;
    }

    private Intent startFromAppcAds() {
        Intent intent = new Intent(this, (Class<?>) this.startClass);
        intent.putExtra(DeepLinksTargets.APPC_ADS, true);
        return intent;
    }

    private Intent startFromAppview(String str, String str2, String str3, String str4) {
        Intent intent = new Intent(this, (Class<?>) this.startClass);
        intent.putExtra(DeepLinksTargets.APP_VIEW_FRAGMENT, true);
        intent.putExtra("packageName", str2);
        intent.putExtra("storeName", str);
        intent.putExtra(DeepLinksKeys.OPEN_TYPE, str3);
        if (str4 != null && str4.equals(ReadyToInstallNotificationManager.ORIGIN)) {
            intent.putExtra(DeepLinksKeys.FROM_NOTIFICATION_READY_TO_INSTALL, true);
        }
        intent.setFlags(805306368);
        return intent;
    }

    private Intent startFromEditorialCard(String str) {
        Intent intent = new Intent(this, (Class<?>) this.startClass);
        intent.putExtra(DeepLinksTargets.EDITORIAL_DEEPLINK, true);
        intent.putExtra("cardId", str);
        return intent;
    }

    private Intent startFromMyStore() {
        Intent intent = new Intent(this, (Class<?>) this.startClass);
        intent.putExtra(DeepLinksTargets.MY_STORE_DEEPLINK, true);
        return intent;
    }

    private Intent startFromPickApp() {
        Intent intent = new Intent(this, (Class<?>) this.startClass);
        intent.putExtra(DeepLinksTargets.PICK_APP_DEEPLINK, true);
        return intent;
    }

    private Intent startFromPromotionalCard(String str) {
        Intent intent = new Intent(this, (Class<?>) this.startClass);
        intent.putExtra(DeepLinksTargets.PROMOTIONAL_DEEPLINK, true);
        intent.putExtra("cardId", str);
        return intent;
    }

    private Intent startFromPromotions() {
        Intent intent = new Intent(this, (Class<?>) this.startClass);
        intent.putExtra(DeepLinksTargets.PROMOTIONS_DEEPLINK, true);
        return intent;
    }

    private Intent startGenericDeepLink(Uri uri) {
        Intent intent = new Intent(this, (Class<?>) this.startClass);
        intent.putExtra(DeepLinksTargets.GENERIC_DEEPLINK, true);
        intent.putExtra(DeepLinksKeys.URI, uri);
        return intent;
    }

    @Override // cm.aptoide.p092pt.analytics.view.AnalyticsActivity, cm.aptoide.p092pt.permission.PermissionProviderActivity, cm.aptoide.p092pt.permission.PermissionServiceActivity, cm.aptoide.p092pt.navigator.ActivityResultNavigator, cm.aptoide.p092pt.view.BaseActivity, com.trello.rxlifecycle.p235h.p236a.AbstractActivityC8764a, androidx.appcompat.app.ActivityC0067d, androidx.fragment.app.ActivityC0468d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0242f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        Uri uri;
        super.onCreate(bundle);
        AptoideApplication aptoideApplication = (AptoideApplication) getApplicationContext();
        this.analyticsManager = aptoideApplication.getAnalyticsManager();
        NavigationTracker navigationTracker = aptoideApplication.getNavigationTracker();
        this.navigationTracker = navigationTracker;
        this.deepLinkAnalytics = new DeepLinkAnalytics(this.analyticsManager, navigationTracker);
        String dataString = getIntent().getDataString();
        this.shortcutNavigation = false;
        this.newFeature = aptoideApplication.getNewFeature();
        dealWithShortcuts();
        Intent aptoideAuthUri = null;
        try {
            uri = Uri.parse(dataString);
        } catch (Exception e2) {
            CrashReport.getInstance().log(e2);
            uri = null;
        }
        if (!"aptoideauth".equalsIgnoreCase(uri.getScheme())) {
            this.deepLinkAnalytics.website(dataString);
            Logger.getInstance().m8283v(TAG, "uri: " + dataString);
        }
        if (uri.getHost() != null) {
            if (uri.getHost().contains(BuildConfig.APTOIDE_WEB_SERVICES_HOST)) {
                aptoideAuthUri = dealWithWebservicesAptoide(dataString);
            } else if (uri.getHost().contains("app.aptoide.com")) {
                aptoideAuthUri = dealWithAptoideAuthentication(dataString);
            } else if (uri.getHost().contains("aptoide.com")) {
                aptoideAuthUri = dealWithAptoideWebsite(uri);
            } else if ("aptoiderepo".equalsIgnoreCase(uri.getScheme())) {
                aptoideAuthUri = dealWithAptoideRepo(dataString);
            } else if ("aptoidesearch".equalsIgnoreCase(uri.getScheme())) {
                aptoideAuthUri = startFromPackageName(dataString.split("aptoidesearch://")[1]);
            } else if ("market".equalsIgnoreCase(uri.getScheme())) {
                aptoideAuthUri = dealWithMarketSchema(dataString, uri);
            } else if (uri.getHost().contains("market.android.com")) {
                aptoideAuthUri = startFromPackageName(uri.getQueryParameter(DeepLinksKeys.f7163ID));
            } else if (uri.getHost().contains("play.google.com") && uri.getPath().contains("store/apps/details")) {
                aptoideAuthUri = dealWithGoogleHost(uri);
            } else if ("aptoideinstall".equalsIgnoreCase(uri.getScheme())) {
                aptoideAuthUri = parseAptoideInstallUri(dataString.substring(17));
            } else if (uri.getHost().equals("cm.aptoide.pt") && uri.getPath().equals("/deeplink") && "aptoide".equalsIgnoreCase(uri.getScheme())) {
                aptoideAuthUri = dealWithAptoideSchema(uri);
            } else if ("aptoidefeature".equalsIgnoreCase(uri.getScheme())) {
                aptoideAuthUri = parseFeatureUri(uri.getHost());
            } else if ("aptoideauth".equalsIgnoreCase(uri.getScheme())) {
                aptoideAuthUri = parseAptoideAuthUri(dataString.split("aptoideauth://")[1]);
            }
        }
        if (aptoideAuthUri != null) {
            startActivity(aptoideAuthUri);
        }
        this.deepLinkAnalytics.sendWebsite();
        finish();
    }

    public Intent startAppView(String str) {
        Intent intent = new Intent(this, (Class<?>) this.startClass);
        intent.putExtra(DeepLinksTargets.APP_VIEW_FRAGMENT, true);
        intent.putExtra(DeepLinksKeys.UNAME, str);
        return intent;
    }

    public Intent startFromAppView(long j2, String str, String str2, String str3) {
        Intent intent = new Intent(this, (Class<?>) this.startClass);
        intent.putExtra(DeepLinksTargets.APP_VIEW_FRAGMENT, true);
        intent.putExtra("appId", j2);
        intent.putExtra("packageName", str);
        intent.putExtra(DeepLinksKeys.OPEN_TYPE, str2);
        if (str3 != null && str3.equals(ReadyToInstallNotificationManager.ORIGIN)) {
            intent.putExtra(DeepLinksKeys.FROM_NOTIFICATION_READY_TO_INSTALL, true);
        }
        return intent;
    }

    public Intent startFromAppsTimeline(String str) {
        Intent intent = new Intent(this, (Class<?>) this.startClass);
        intent.putExtra(DeepLinksTargets.TIMELINE_DEEPLINK, true);
        intent.putExtra("cardId", str);
        boolean z = this.shortcutNavigation;
        if (z) {
            intent.putExtra(FROM_SHORTCUT, z);
        }
        return intent;
    }

    public Intent startFromHome() {
        Intent intent = new Intent(this, (Class<?>) this.startClass);
        intent.putExtra(DeepLinksTargets.HOME_DEEPLINK, true);
        return intent;
    }

    public Intent startFromPackageName(String str) {
        GetApp getAppM40551b;
        if (str != null) {
            try {
                getAppM40551b = GetAppRequest.m7442of(str, ((AptoideApplication) getApplicationContext()).getAccountSettingsBodyInterceptorPoolV7(), ((AptoideApplication) getApplicationContext()).getDefaultClient(), WebService.getDefaultConverter(), ((AptoideApplication) getApplicationContext()).getTokenInvalidator(), ((AptoideApplication) getApplicationContext()).getDefaultSharedPreferences()).observe().m40081W0().m40551b();
            } catch (AptoideWsV7Exception unused) {
                return startFromSearch(str);
            } catch (NoNetworkConnectionException unused2) {
                return startFromHome();
            }
        } else {
            getAppM40551b = null;
        }
        return (getAppM40551b == null || !getAppM40551b.isOk()) ? startFromSearch(str) : startFromAppView(str);
    }

    public Intent startFromSearch(String str) {
        Intent intent = new Intent(this, (Class<?>) this.startClass);
        intent.putExtra(DeepLinksTargets.SEARCH_FRAGMENT, true);
        intent.putExtra("query", str);
        intent.putExtra(FROM_SHORTCUT, this.shortcutNavigation);
        return intent;
    }

    public Intent startWalletInstallIntent(String str, String str2, String str3) {
        Intent intent = new Intent(this, (Class<?>) WalletInstallActivity.class);
        intent.putExtra(DeepLinksKeys.WALLET_PACKAGE_NAME_KEY, str);
        intent.putExtra("packageName", str3);
        intent.setFlags(268435456);
        return intent;
    }

    public Intent startWithRepo(ArrayList<String> arrayList) {
        Intent intent = new Intent(this, (Class<?>) this.startClass);
        intent.putExtra(DeepLinksTargets.NEW_REPO, arrayList);
        this.deepLinkAnalytics.newRepo();
        return intent;
    }

    public Intent startFromAppView(String str) {
        Intent intent = new Intent(this, (Class<?>) this.startClass);
        intent.putExtra(DeepLinksTargets.APP_VIEW_FRAGMENT, true);
        intent.putExtra("packageName", str);
        return intent;
    }
}
