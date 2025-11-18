package cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.WindowManager;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.ListStores;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class GetMyStoreListRequest extends AbstractC2229V7<ListStores, EndlessBody> {
    private static boolean useEndless;
    private String url;

    public static class Body extends BaseBody {
        private boolean refresh;
        private WidgetsArgs widgetsArgs;

        public Body(WidgetsArgs widgetsArgs) {
            this.widgetsArgs = widgetsArgs;
        }

        public WidgetsArgs getWidgetsArgs() {
            return this.widgetsArgs;
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody, cm.aptoide.p092pt.dataprovider.p097ws.RefreshBody
        public void setRefresh(boolean z) {
            this.refresh = z;
        }
    }

    public static class EndlessBody extends Body implements Endless {
        private Integer limit;
        private int offset;

        public EndlessBody(WidgetsArgs widgetsArgs) {
            super(widgetsArgs);
            this.limit = 25;
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless
        public Integer getLimit() {
            return this.limit;
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless
        public int getOffset() {
            return this.offset;
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless
        public void setOffset(int i2) {
            this.offset = i2;
        }
    }

    public GetMyStoreListRequest(String str, EndlessBody endlessBody, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(endlessBody, AbstractC2229V7.getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
        this.url = str;
    }

    /* renamed from: of */
    public static GetMyStoreListRequest m7487of(String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, Resources resources, WindowManager windowManager) {
        return m7488of(str, false, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, resources, windowManager);
    }

    /* renamed from: of */
    public static GetMyStoreListRequest m7488of(String str, boolean z, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, Resources resources, WindowManager windowManager) {
        useEndless = z;
        return new GetMyStoreListRequest(str, new EndlessBody(WidgetsArgs.createDefault(resources, windowManager)), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<ListStores> loadDataFromNetwork(AbstractC2229V7.Interfaces interfaces, boolean z) {
        if (this.url.contains("getSubscribed")) {
            ((EndlessBody) this.body).setRefresh(z);
        }
        return TextUtils.isEmpty(this.url) ? interfaces.getMyStoreList((Body) this.body, z) : useEndless ? interfaces.getMyStoreListEndless(this.url, (EndlessBody) this.body, z) : interfaces.getMyStoreList(this.url, (Body) this.body, z);
    }
}
