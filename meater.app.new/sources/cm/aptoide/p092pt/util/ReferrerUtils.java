package cm.aptoide.p092pt.util;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.ads.AdsRepository;
import cm.aptoide.p092pt.ads.MinimalAd;
import cm.aptoide.p092pt.ads.MinimalAdMapper;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.database.RoomStoredMinimalAdPersistence;
import cm.aptoide.p092pt.dataprovider.ads.AdNetworkUtils;
import cm.aptoide.p092pt.dataprovider.p097ws.p099v2.aptwords.RegisterAdRefererRequest;
import cm.aptoide.p092pt.dataprovider.util.referrer.SimpleTimedFuture;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.networking.IdsRepository;
import cm.aptoide.p092pt.preferences.managed.ManagerPreferences;
import cm.aptoide.p092pt.search.model.SearchAdResult;
import cm.aptoide.p092pt.util.ReferrerUtils;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.utils.p106q.QManager;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import p456rx.C11231b;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.schedulers.Schedulers;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class ReferrerUtils extends cm.aptoide.p092pt.dataprovider.util.referrer.ReferrerUtils {
    private static final String TAG = "ReferrerUtils";

    public static void broadcastReferrer(String str, String str2, Context context) {
        Intent intent = new Intent("com.android.vending.INSTALL_REFERRER");
        intent.setPackage(str);
        intent.setFlags(32);
        intent.putExtra("referrer", str2);
        context.sendBroadcast(intent);
        Logger.getInstance().m8273d(TAG, "Sent broadcast to " + str + " with referrer " + str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<Long> clearExcludedNetworks(String str) {
        return cm.aptoide.p092pt.dataprovider.util.referrer.ReferrerUtils.excludedNetworks.remove(str);
    }

    public static void extractReferrer(SearchAdResult searchAdResult, int i2, boolean z, AdsRepository adsRepository, OkHttpClient okHttpClient, Converter.Factory factory, QManager qManager, final Context context, SharedPreferences sharedPreferences, MinimalAdMapper minimalAdMapper, RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence) {
        String packageName = searchAdResult.getPackageName();
        long networkId = searchAdResult.getNetworkId();
        final String clickUrl = searchAdResult.getClickUrl();
        if (clickUrl == null) {
            Logger.getInstance().m8273d("ExtractReferrer", "No click_url for packageName " + packageName);
            return;
        }
        if (!AptoideUtils.ThreadU.isUiThread()) {
            throw new RuntimeException("ExtractReferrer must be run on UI thread!");
        }
        try {
            Logger.getInstance().m8273d("ExtractReferrer", "Called for: " + clickUrl + " with packageName " + packageName);
            final String[] strArr = {clickUrl};
            final SimpleTimedFuture simpleTimedFuture = new SimpleTimedFuture();
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2006, 16, -3);
            layoutParams.gravity = 51;
            layoutParams.x = 0;
            layoutParams.y = 0;
            layoutParams.width = 0;
            layoutParams.height = 0;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            AptoideUtils.ThreadU.runOnIoThread(new Runnable() { // from class: cm.aptoide.pt.util.g
                @Override // java.lang.Runnable
                public final void run() {
                    ReferrerUtils.lambda$extractReferrer$0(context, strArr, clickUrl, simpleTimedFuture);
                }
            });
            simpleTimedFuture.get();
            WebView webView = new WebView(context);
            webView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            linearLayout.addView(webView);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new C46271(searchAdResult, i2, okHttpClient, factory, qManager, z, packageName, context, roomStoredMinimalAdPersistence, minimalAdMapper, sharedPreferences, networkId, adsRepository));
            webView.loadUrl(strArr[0]);
            windowManager.addView(linearLayout, layoutParams);
        } catch (Exception e2) {
            CrashReport.getInstance().log(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getReferrer(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("referrer");
        if (TextUtils.isEmpty(queryParameter)) {
            Logger.getInstance().m8283v(TAG, "Didn't find any referrer: " + str);
        } else {
            Logger.getInstance().m8283v(TAG, "Found referrer: " + queryParameter);
        }
        return queryParameter;
    }

    static /* synthetic */ void lambda$extractReferrer$0(Context context, String[] strArr, String str, SimpleTimedFuture simpleTimedFuture) {
        IdsRepository idsRepository = ((AptoideApplication) context.getApplicationContext()).getIdsRepository();
        strArr[0] = AdNetworkUtils.parseMacros(str, idsRepository.getAndroidId(), idsRepository.getUniqueIdentifier().m39933y().m40633b(), idsRepository.getAdvertisingId().m39933y().m40633b());
        simpleTimedFuture.set(strArr[0]);
        Logger.getInstance().m8273d("ExtractReferrer", "Parsed clickUrl: " + strArr[0]);
    }

    /* renamed from: cm.aptoide.pt.util.ReferrerUtils$1 */
    class C46271 extends WebViewClient {
        Future<Void> future;
        final /* synthetic */ MinimalAdMapper val$adMapper;
        final /* synthetic */ AdsRepository val$adsRepository;
        final /* synthetic */ boolean val$broadcastReferrer;
        final /* synthetic */ Context val$context;
        final /* synthetic */ Converter.Factory val$converterFactory;
        final /* synthetic */ OkHttpClient val$httpClient;
        final /* synthetic */ long val$networkId;
        final /* synthetic */ String val$packageName;
        final /* synthetic */ QManager val$qManager;
        final /* synthetic */ int val$retries;
        final /* synthetic */ RoomStoredMinimalAdPersistence val$roomStoredMinimalAdPersistence;
        final /* synthetic */ SearchAdResult val$searchAdResult;
        final /* synthetic */ SharedPreferences val$sharedPreferences;

        C46271(SearchAdResult searchAdResult, int i2, OkHttpClient okHttpClient, Converter.Factory factory, QManager qManager, boolean z, String str, Context context, RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence, MinimalAdMapper minimalAdMapper, SharedPreferences sharedPreferences, long j2, AdsRepository adsRepository) {
            this.val$searchAdResult = searchAdResult;
            this.val$retries = i2;
            this.val$httpClient = okHttpClient;
            this.val$converterFactory = factory;
            this.val$qManager = qManager;
            this.val$broadcastReferrer = z;
            this.val$packageName = str;
            this.val$context = context;
            this.val$roomStoredMinimalAdPersistence = roomStoredMinimalAdPersistence;
            this.val$adMapper = minimalAdMapper;
            this.val$sharedPreferences = sharedPreferences;
            this.val$networkId = j2;
            this.val$adsRepository = adsRepository;
        }

        static /* synthetic */ MinimalAd lambda$postponeReferrerExtraction$1(Throwable th) {
            return null;
        }

        static /* synthetic */ Void lambda$postponeReferrerExtraction$5(boolean z, final SearchAdResult searchAdResult, final OkHttpClient okHttpClient, final Converter.Factory factory, final QManager qManager, final SharedPreferences sharedPreferences, final int i2, final String str, long j2, final AdsRepository adsRepository, final boolean z2, final Context context, final RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence) throws Exception {
            Logger.getInstance().m8273d("ExtractReferrer", "Sending RegisterAdRefererRequest with value " + z);
            RegisterAdRefererRequest.m7427of(searchAdResult.getAdId(), searchAdResult.getAppId(), searchAdResult.getClickUrl(), z, okHttpClient, factory, qManager.getFilters(ManagerPreferences.getHWSpecsFilter(sharedPreferences)), sharedPreferences).execute();
            Logger.getInstance().m8273d("ExtractReferrer", "Retries left: " + i2);
            if (z) {
                ReferrerUtils.clearExcludedNetworks(str);
                return null;
            }
            cm.aptoide.p092pt.dataprovider.util.referrer.ReferrerUtils.excludedNetworks.add(str, j2);
            try {
                if (i2 > 0) {
                    adsRepository.getAdsFromSecondTry(str).m40095j0(C11250a.m40156b()).m40105p0(new InterfaceC11256e() { // from class: cm.aptoide.pt.util.f
                        @Override // p456rx.p460m.InterfaceC11256e
                        public final Object call(Object obj) {
                            ReferrerUtils.C46271.lambda$postponeReferrerExtraction$1((Throwable) obj);
                            return null;
                        }
                    }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.util.c
                        @Override // p456rx.p460m.InterfaceC11256e
                        public final Object call(Object obj) {
                            return Boolean.valueOf(searchAdResult != null);
                        }
                    }).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.util.e
                        @Override // p456rx.p460m.InterfaceC11253b
                        public final void call(Object obj) {
                            ReferrerUtils.extractReferrer(new SearchAdResult((MinimalAd) obj), i2 - 1, z2, adsRepository, okHttpClient, factory, qManager, context, sharedPreferences, new MinimalAdMapper(), roomStoredMinimalAdPersistence);
                        }
                    }, new InterfaceC11253b() { // from class: cm.aptoide.pt.util.b
                        @Override // p456rx.p460m.InterfaceC11253b
                        public final void call(Object obj) {
                            ReferrerUtils.clearExcludedNetworks(str);
                        }
                    });
                } else {
                    ReferrerUtils.clearExcludedNetworks(str);
                }
                return null;
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }

        private ScheduledFuture<Void> postponeReferrerExtraction(SearchAdResult searchAdResult, int i2, int i3, OkHttpClient okHttpClient, Converter.Factory factory, QManager qManager) {
            return postponeReferrerExtraction(searchAdResult, i2, false, i3, okHttpClient, factory, qManager.getFilters(ManagerPreferences.getHWSpecsFilter(this.val$sharedPreferences)), qManager);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            Logger.getInstance().m8273d("ExtractReferrer", "Openened clickUrl: " + str);
            if (this.future == null) {
                this.future = postponeReferrerExtraction(this.val$searchAdResult, 5, this.val$retries, this.val$httpClient, this.val$converterFactory, this.val$qManager);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (this.future == null) {
                Logger.getInstance().m8273d("ExtractReferrer", "onPageStarted potentially not called : " + str);
                this.future = postponeReferrerExtraction(this.val$searchAdResult, 5, this.val$retries, this.val$httpClient, this.val$converterFactory, this.val$qManager);
            }
            Logger.getInstance().m8273d("ExtractReferrer", "ClickUrl redirect: " + str);
            if (str.startsWith("market://") || str.startsWith("https://play.google.com") || str.startsWith("http://play.google.com")) {
                Logger.getInstance().m8273d("ExtractReferrer", "Clickurl landed on market");
                final String referrer = ReferrerUtils.getReferrer(str);
                if (!TextUtils.isEmpty(referrer)) {
                    Logger.getInstance().m8273d("ExtractReferrer", "Referrer successfully extracted");
                    if (this.val$broadcastReferrer) {
                        ReferrerUtils.broadcastReferrer(this.val$packageName, referrer, this.val$context);
                    } else {
                        final RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence = this.val$roomStoredMinimalAdPersistence;
                        final MinimalAdMapper minimalAdMapper = this.val$adMapper;
                        final SearchAdResult searchAdResult = this.val$searchAdResult;
                        C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.util.d
                            @Override // p456rx.p460m.InterfaceC11252a
                            public final void call() {
                                roomStoredMinimalAdPersistence.insert(minimalAdMapper.map(searchAdResult, referrer));
                            }
                        }).m39967K(Schedulers.m40658io()).m39964H();
                    }
                    Future<Void> future = this.future;
                    if (future != null) {
                        future.cancel(false);
                    }
                    postponeReferrerExtraction(this.val$searchAdResult, 0, true, this.val$httpClient, this.val$converterFactory, this.val$qManager);
                }
            }
            return false;
        }

        private ScheduledFuture<Void> postponeReferrerExtraction(SearchAdResult searchAdResult, int i2, boolean z, OkHttpClient okHttpClient, Converter.Factory factory, QManager qManager) {
            return postponeReferrerExtraction(searchAdResult, i2, z, 0, okHttpClient, factory, qManager.getFilters(ManagerPreferences.getHWSpecsFilter(this.val$sharedPreferences)), qManager);
        }

        private ScheduledFuture<Void> postponeReferrerExtraction(final SearchAdResult searchAdResult, int i2, final boolean z, final int i3, final OkHttpClient okHttpClient, final Converter.Factory factory, String str, final QManager qManager) {
            Logger.getInstance().m8273d("ExtractReferrer", "Referrer postponed " + i2 + " seconds.");
            final SharedPreferences sharedPreferences = this.val$sharedPreferences;
            final String str2 = this.val$packageName;
            final long j2 = this.val$networkId;
            final AdsRepository adsRepository = this.val$adsRepository;
            final boolean z2 = this.val$broadcastReferrer;
            final Context context = this.val$context;
            final RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence = this.val$roomStoredMinimalAdPersistence;
            return cm.aptoide.p092pt.dataprovider.util.referrer.ReferrerUtils.executorService.schedule(new Callable() { // from class: cm.aptoide.pt.util.a
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    ReferrerUtils.C46271.lambda$postponeReferrerExtraction$5(z, searchAdResult, okHttpClient, factory, qManager, sharedPreferences, i3, str2, j2, adsRepository, z2, context, roomStoredMinimalAdPersistence);
                    return null;
                }
            }, i2, TimeUnit.SECONDS);
        }
    }
}
