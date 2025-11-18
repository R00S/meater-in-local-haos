package cm.aptoide.p092pt.dataprovider.p097ws.p101v7;

import android.content.SharedPreferences;
import android.text.TextUtils;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.ListComments;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseRequestWithStore;
import cm.aptoide.p092pt.dataprovider.util.CommentType;
import cm.aptoide.p092pt.preferences.managed.ManagerPreferences;
import com.fasterxml.jackson.annotation.JsonProperty;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class ListCommentsRequest extends AbstractC2229V7<ListComments, Body> {
    private static String url;

    private ListCommentsRequest(Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(body, AbstractC2229V7.getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    private static Body getBody(long j2, int i2, boolean z, SharedPreferences sharedPreferences) {
        Body body = new Body(i2, ManagerPreferences.getAndResetForceServerRefresh(sharedPreferences), Order.desc);
        if (z) {
            body.setReviewId(Long.valueOf(j2));
        } else {
            body.setStoreId(Long.valueOf(j2));
        }
        return body;
    }

    /* renamed from: of */
    public static ListCommentsRequest m7450of(String str, long j2, int i2, BaseRequestWithStore.StoreCredentials storeCredentials, boolean z, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        url = str;
        Body body = new Body(i2, ManagerPreferences.getAndResetForceServerRefresh(sharedPreferences), Order.desc, storeCredentials.getUsername(), storeCredentials.getPasswordSha1());
        if (z) {
            body.setReviewId(Long.valueOf(j2));
        } else {
            body.setStoreId(Long.valueOf(j2));
        }
        return new ListCommentsRequest(body, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    public static ListCommentsRequest ofStoreAction(String str, boolean z, BaseRequestWithStore.StoreCredentials storeCredentials, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        url = str;
        Body body = new Body(z, Order.desc);
        if (storeCredentials != null) {
            body.setStoreUser(storeCredentials.getUsername());
            body.setStorePassSha1(storeCredentials.getPasswordSha1());
            body.setStoreId(storeCredentials.getId());
        }
        return new ListCommentsRequest(body, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    public static ListCommentsRequest ofTimeline(String str, int i2, int i3, boolean z, String str2, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        url = str;
        Body body = new Body(i3, z, Order.desc);
        body.setCommentType(null);
        body.setOffset(i2);
        body.setTimelineCardId(str2);
        return new ListCommentsRequest(body, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<ListComments> loadDataFromNetwork(AbstractC2229V7.Interfaces interfaces, boolean z) {
        return TextUtils.isEmpty(url) ? interfaces.listComments((Body) this.body, true) : interfaces.listComments(url, (Body) this.body, true);
    }

    public static class Body extends BaseBody implements Endless {
        private Integer limit;
        private int offset;
        private Order order;
        private boolean refresh;
        private Long reviewId;
        private Long storeId;

        @JsonProperty("store_pass_sha1")
        private String storePassSha1;

        @JsonProperty("store_user")
        private String storeUser;

        @JsonProperty("card_uid")
        private String timelineCardId;
        private String commentType = CommentType.REVIEW.name();
        private long subLimit = 5;

        public Body(boolean z, Order order) {
            this.refresh = z;
            this.order = order;
        }

        public String getCommentType() {
            return this.commentType;
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless
        public Integer getLimit() {
            return this.limit;
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless
        public int getOffset() {
            return this.offset;
        }

        public Order getOrder() {
            return this.order;
        }

        public Long getReviewId() {
            return this.reviewId;
        }

        public Long getStoreId() {
            return this.storeId;
        }

        public String getStorePassSha1() {
            return this.storePassSha1;
        }

        public String getStoreUser() {
            return this.storeUser;
        }

        public long getSubLimit() {
            return this.subLimit;
        }

        public String getTimelineCardId() {
            return this.timelineCardId;
        }

        public void setCommentType(CommentType commentType) {
            if (commentType == null) {
                this.commentType = null;
            } else {
                this.commentType = commentType.name();
            }
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless
        public void setOffset(int i2) {
            this.offset = i2;
        }

        public void setOrder(Order order) {
            this.order = order;
        }

        @Override // cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody, cm.aptoide.p092pt.dataprovider.p097ws.RefreshBody
        public void setRefresh(boolean z) {
            this.refresh = z;
        }

        public void setReviewId(Long l) {
            this.reviewId = l;
            this.commentType = CommentType.REVIEW.name();
        }

        public void setStoreId(Long l) {
            this.storeId = l;
            this.commentType = CommentType.STORE.name();
        }

        public void setStorePassSha1(String str) {
            this.storePassSha1 = str;
        }

        public void setStoreUser(String str) {
            this.storeUser = str;
        }

        public void setSubLimit(long j2) {
            this.subLimit = j2;
        }

        public void setTimelineCardId(String str) {
            this.timelineCardId = str;
        }

        public Body(int i2, boolean z, Order order) {
            this.limit = Integer.valueOf(i2);
            this.refresh = z;
            this.order = order;
        }

        public Body(int i2, boolean z, Order order, String str, String str2) {
            this.limit = Integer.valueOf(i2);
            this.refresh = z;
            this.order = order;
            this.storeUser = str;
            this.storePassSha1 = str2;
        }
    }

    /* renamed from: of */
    public static ListCommentsRequest m7448of(long j2, int i2, int i3, boolean z, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        Body body = getBody(j2, i3, z, sharedPreferences);
        body.setOffset(i2);
        return new ListCommentsRequest(body, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* renamed from: of */
    public static ListCommentsRequest m7449of(long j2, int i2, boolean z, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new ListCommentsRequest(getBody(j2, i2, z, sharedPreferences), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }
}
