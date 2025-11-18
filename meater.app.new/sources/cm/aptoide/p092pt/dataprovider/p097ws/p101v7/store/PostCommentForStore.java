package cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.dataprovider.BuildConfig;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.SetComment;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.preferences.toolbox.ToolboxManager;
import com.fasterxml.jackson.annotation.JsonProperty;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class PostCommentForStore extends AbstractC2229V7<SetComment, Body> {
    private PostCommentForStore(Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(body, getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    public static String getHost(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_WRITE_V7_HOST);
        sb.append("/api/7/");
        return sb.toString();
    }

    /* renamed from: of */
    public static PostCommentForStore m7498of(long j2, String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new PostCommentForStore(new Body(j2, str), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    public static class Body extends BaseBody {
        private String body;

        @JsonProperty("comment_id")
        private Long previousCommentId;
        private long storeId;

        public Body(long j2, String str, long j3) {
            this(j2, str);
            this.previousCommentId = Long.valueOf(j3);
        }

        public String getBody() {
            return this.body;
        }

        public Long getPreviousCommentId() {
            return this.previousCommentId;
        }

        public long getStoreId() {
            return this.storeId;
        }

        public void setBody(String str) {
            this.body = str;
        }

        public void setPreviousCommentId(Long l) {
            this.previousCommentId = l;
        }

        public void setStoreId(long j2) {
            this.storeId = j2;
        }

        public Body(long j2, String str) {
            this.storeId = j2;
            this.body = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<SetComment> loadDataFromNetwork(AbstractC2229V7.Interfaces interfaces, boolean z) {
        return interfaces.postStoreComment((Body) this.body, true);
    }

    /* renamed from: of */
    public static PostCommentForStore m7497of(long j2, long j3, String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new PostCommentForStore(new Body(j2, str, j3), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }
}
