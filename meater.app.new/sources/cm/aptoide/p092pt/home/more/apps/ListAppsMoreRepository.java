package cm.aptoide.p092pt.home.more.apps;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.view.WindowManager;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.ListApps;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.ListAppsRequest;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import retrofit2.Converter;

/* compiled from: ListAppsMoreRepository.kt */
@Metadata(m32266d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*J&\u0010+\u001a\b\u0012\u0004\u0012\u00020&0%2\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\u0006\u0010,\u001a\u00020-R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006."}, m32267d2 = {"Lcm/aptoide/pt/home/more/apps/ListAppsMoreRepository;", HttpUrl.FRAGMENT_ENCODE_SET, "storeCredentialsProvider", "Lcm/aptoide/pt/store/StoreCredentialsProvider;", "bodyInterceptor", "Lcm/aptoide/pt/dataprovider/ws/BodyInterceptor;", "Lcm/aptoide/pt/dataprovider/ws/v7/BaseBody;", "okHttpClient", "Lokhttp3/OkHttpClient;", "converterFactory", "Lretrofit2/Converter$Factory;", "tokenInvalidator", "Lcm/aptoide/pt/dataprovider/interfaces/TokenInvalidator;", "sharedPreferences", "Landroid/content/SharedPreferences;", "resources", "Landroid/content/res/Resources;", "windowManager", "Landroid/view/WindowManager;", "(Lcm/aptoide/pt/store/StoreCredentialsProvider;Lcm/aptoide/pt/dataprovider/ws/BodyInterceptor;Lokhttp3/OkHttpClient;Lretrofit2/Converter$Factory;Lcm/aptoide/pt/dataprovider/interfaces/TokenInvalidator;Landroid/content/SharedPreferences;Landroid/content/res/Resources;Landroid/view/WindowManager;)V", "getBodyInterceptor", "()Lcm/aptoide/pt/dataprovider/ws/BodyInterceptor;", "getConverterFactory", "()Lretrofit2/Converter$Factory;", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "getResources", "()Landroid/content/res/Resources;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "getStoreCredentialsProvider", "()Lcm/aptoide/pt/store/StoreCredentialsProvider;", "getTokenInvalidator", "()Lcm/aptoide/pt/dataprovider/interfaces/TokenInvalidator;", "getWindowManager", "()Landroid/view/WindowManager;", "getApps", "Lrx/Observable;", "Lcm/aptoide/pt/dataprovider/model/v7/ListApps;", "url", HttpUrl.FRAGMENT_ENCODE_SET, "refresh", HttpUrl.FRAGMENT_ENCODE_SET, "loadMoreApps", "offset", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class ListAppsMoreRepository {
    private final BodyInterceptor<BaseBody> bodyInterceptor;
    private final Converter.Factory converterFactory;
    private final OkHttpClient okHttpClient;
    private final Resources resources;
    private final SharedPreferences sharedPreferences;
    private final StoreCredentialsProvider storeCredentialsProvider;
    private final TokenInvalidator tokenInvalidator;
    private final WindowManager windowManager;

    public ListAppsMoreRepository(StoreCredentialsProvider storeCredentialsProvider, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, Resources resources, WindowManager windowManager) {
        C9801m.m32346f(storeCredentialsProvider, "storeCredentialsProvider");
        C9801m.m32346f(bodyInterceptor, "bodyInterceptor");
        C9801m.m32346f(okHttpClient, "okHttpClient");
        C9801m.m32346f(factory, "converterFactory");
        C9801m.m32346f(tokenInvalidator, "tokenInvalidator");
        C9801m.m32346f(sharedPreferences, "sharedPreferences");
        C9801m.m32346f(resources, "resources");
        C9801m.m32346f(windowManager, "windowManager");
        this.storeCredentialsProvider = storeCredentialsProvider;
        this.bodyInterceptor = bodyInterceptor;
        this.okHttpClient = okHttpClient;
        this.converterFactory = factory;
        this.tokenInvalidator = tokenInvalidator;
        this.sharedPreferences = sharedPreferences;
        this.resources = resources;
        this.windowManager = windowManager;
    }

    public final C11234e<ListApps> getApps(String str, boolean z) {
        C11234e<ListApps> c11234eObserve = ListAppsRequest.ofAction(str, this.storeCredentialsProvider.fromUrl(str), this.bodyInterceptor, this.okHttpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, this.resources, this.windowManager).observe(z);
        C9801m.m32345e(c11234eObserve, "ofAction(\n      url, sto…er\n    ).observe(refresh)");
        return c11234eObserve;
    }

    public final BodyInterceptor<BaseBody> getBodyInterceptor() {
        return this.bodyInterceptor;
    }

    public final Converter.Factory getConverterFactory() {
        return this.converterFactory;
    }

    public final OkHttpClient getOkHttpClient() {
        return this.okHttpClient;
    }

    public final Resources getResources() {
        return this.resources;
    }

    public final SharedPreferences getSharedPreferences() {
        return this.sharedPreferences;
    }

    public final StoreCredentialsProvider getStoreCredentialsProvider() {
        return this.storeCredentialsProvider;
    }

    public final TokenInvalidator getTokenInvalidator() {
        return this.tokenInvalidator;
    }

    public final WindowManager getWindowManager() {
        return this.windowManager;
    }

    public final C11234e<ListApps> loadMoreApps(String str, boolean z, int i2) {
        ListAppsRequest listAppsRequestOfAction = ListAppsRequest.ofAction(str, this.storeCredentialsProvider.fromUrl(str), this.bodyInterceptor, this.okHttpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, this.resources, this.windowManager);
        listAppsRequestOfAction.getBody().setOffset(i2);
        C11234e<ListApps> c11234eObserve = listAppsRequestOfAction.observe(z);
        C9801m.m32345e(c11234eObserve, "request.observe(refresh)");
        return c11234eObserve;
    }
}
