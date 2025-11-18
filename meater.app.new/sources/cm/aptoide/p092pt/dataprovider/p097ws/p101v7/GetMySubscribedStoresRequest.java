package cm.aptoide.p092pt.dataprovider.p097ws.p101v7;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetMySubscribedStoresResponse;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class GetMySubscribedStoresRequest extends AbstractC2229V7<GetMySubscribedStoresResponse, Body> {

    public static class Body extends BaseBody implements Endless {
        private Integer limit;
        private int offset;
        private Order order;
        private boolean refresh;
        Sort sort;

        public enum Sort {
            added,
            latest,
            alpha,
            downloads,
            trending
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

        public Sort getSort() {
            return this.sort;
        }

        public void setLimit(Integer num) {
            this.limit = num;
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

        public void setSort(Sort sort) {
            this.sort = sort;
        }
    }

    public GetMySubscribedStoresRequest(BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(new Body(), AbstractC2229V7.getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<GetMySubscribedStoresResponse> loadDataFromNetwork(AbstractC2229V7.Interfaces interfaces, boolean z) {
        return interfaces.getMySubscribedStores(z, (Body) this.body);
    }
}
