package cm.aptoide.p092pt.dataprovider.p097ws.p101v7;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.dataprovider.BuildConfig;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import cm.aptoide.p092pt.preferences.toolbox.ToolboxManager;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class EditorialListRequest extends AbstractC2229V7<EditorialListResponse, Body> {
    private final int limit;

    public static class Body extends BaseBody implements Endless {
        private int limit;
        private int offset;

        public Body(int i2, int i3) {
            this.limit = i2;
            this.offset = i3;
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless
        public Integer getLimit() {
            return Integer.valueOf(this.limit);
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

    protected EditorialListRequest(Body body, String str, OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor bodyInterceptor, TokenInvalidator tokenInvalidator, int i2) {
        super(body, str, okHttpClient, factory, bodyInterceptor, tokenInvalidator);
        this.limit = i2;
    }

    public static String getHost(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_V7_HOST);
        sb.append("/api/7.20181019/");
        return sb.toString();
    }

    /* renamed from: of */
    public static EditorialListRequest m7439of(BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, int i2, int i3) {
        return new EditorialListRequest(new Body(i2, i3), getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<EditorialListResponse> loadDataFromNetwork(AbstractC2229V7.Interfaces interfaces, boolean z) {
        return interfaces.getEditorialList(this.limit, (Body) this.body);
    }
}
