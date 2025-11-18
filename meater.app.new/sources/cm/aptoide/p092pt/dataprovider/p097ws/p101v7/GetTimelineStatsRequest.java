package cm.aptoide.p092pt.dataprovider.p097ws.p101v7;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.TimelineStats;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class GetTimelineStatsRequest extends AbstractC2229V7<TimelineStats, Body> {

    public static class Body extends BaseBody {
        private Long userId;

        public Body(Long l) {
            this.userId = l;
        }

        public Long getUserId() {
            return this.userId;
        }

        public void setUserId(Long l) {
            this.userId = l;
        }
    }

    protected GetTimelineStatsRequest(Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(body, AbstractC2229V7.getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    /* renamed from: of */
    public static GetTimelineStatsRequest m7446of(BodyInterceptor<BaseBody> bodyInterceptor, Long l, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new GetTimelineStatsRequest(new Body(l), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<TimelineStats> loadDataFromNetwork(AbstractC2229V7.Interfaces interfaces, boolean z) {
        return interfaces.getTimelineStats((Body) this.body, z);
    }
}
