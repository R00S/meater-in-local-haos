package cm.aptoide.p092pt.dataprovider.p097ws.p101v7;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetFollowers;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.GetFollowersRequest;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class GetFollowingRequest extends AbstractC2229V7<GetFollowers, GetFollowersRequest.Body> {
    protected GetFollowingRequest(GetFollowersRequest.Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(body, AbstractC2229V7.getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    /* renamed from: of */
    public static GetFollowingRequest m7445of(BodyInterceptor<BaseBody> bodyInterceptor, Long l, Long l2, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        GetFollowersRequest.Body body = new GetFollowersRequest.Body();
        body.setUserId(l);
        body.setStoreId(l2);
        return new GetFollowingRequest(body, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<GetFollowers> loadDataFromNetwork(AbstractC2229V7.Interfaces interfaces, boolean z) {
        return interfaces.getTimelineGetFollowing((GetFollowersRequest.Body) this.body, z);
    }
}
