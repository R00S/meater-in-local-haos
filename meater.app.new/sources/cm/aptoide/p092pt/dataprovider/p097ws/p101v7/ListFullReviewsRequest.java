package cm.aptoide.p092pt.dataprovider.p097ws.p101v7;

import android.content.SharedPreferences;
import android.text.TextUtils;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.ListFullReviews;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseRequestWithStore;
import cm.aptoide.p092pt.preferences.managed.ManagerPreferences;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class ListFullReviewsRequest extends AbstractC2229V7<ListFullReviews, Body> {
    private static final int MAX_COMMENTS = 10;
    private static final int MAX_REVIEWS = 10;
    private String url;

    protected ListFullReviewsRequest(Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(body, AbstractC2229V7.getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    /* renamed from: of */
    public static ListFullReviewsRequest m7451of(long j2, int i2, int i3, BaseRequestWithStore.StoreCredentials storeCredentials, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new ListFullReviewsRequest(new Body(j2, i2, i3, ManagerPreferences.getAndResetForceServerRefresh(sharedPreferences), storeCredentials), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    public static ListFullReviewsRequest ofAction(String str, boolean z, BaseRequestWithStore.StoreCredentials storeCredentials, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new ListFullReviewsRequest(str.replace("listFullReviews", HttpUrl.FRAGMENT_ENCODE_SET), new Body(z, storeCredentials), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    public static class Body extends BaseBodyWithStore implements Endless {
        private String lang;
        private Integer limit;
        private boolean mature;
        private int offset;
        private Order order;
        private String packageName;
        private boolean refresh;
        private Long reviewId;
        private Sort sort;
        private Long storeId;
        private String storeName;
        private Integer subLimit;

        public enum Sort {
            latest,
            points
        }

        public Body(boolean z, BaseRequestWithStore.StoreCredentials storeCredentials) {
            super(storeCredentials);
            this.refresh = z;
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

        public Body(long j2, int i2, int i3, boolean z, BaseRequestWithStore.StoreCredentials storeCredentials) {
            super(storeCredentials);
            this.storeId = Long.valueOf(j2);
            this.limit = Integer.valueOf(i2);
            this.offset = i3;
            this.refresh = z;
        }

        public Body(String str, String str2, int i2, int i3, boolean z) {
            this.packageName = str2;
            this.storeName = str;
            this.limit = Integer.valueOf(i2);
            this.subLimit = Integer.valueOf(i3);
            this.refresh = z;
        }
    }

    public ListFullReviewsRequest(String str, Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        this(body, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
        this.url = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<ListFullReviews> loadDataFromNetwork(AbstractC2229V7.Interfaces interfaces, boolean z) {
        return TextUtils.isEmpty(this.url) ? interfaces.listFullReviews((Body) this.body, z) : interfaces.listFullReviews(this.url, (Body) this.body, z);
    }
}
