package cm.aptoide.p092pt.app;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.AppCoinsCampaign;
import cm.aptoide.p092pt.dataprovider.model.p096v7.ListAppCoinsCampaigns;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.GetAppCoinsCampaignsRequest;
import java.util.List;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import p456rx.Single;
import p456rx.p460m.InterfaceC11256e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class AppCoinsService {
    private final BodyInterceptor<BaseBody> bodyInterceptor;
    private final Converter.Factory converterFactory;
    private final OkHttpClient httpClient;
    private final SharedPreferences preferences;
    private final TokenInvalidator tokenInvalidator;

    public AppCoinsService(OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, BodyInterceptor<BaseBody> bodyInterceptor, Converter.Factory factory) {
        this.httpClient = okHttpClient;
        this.tokenInvalidator = tokenInvalidator;
        this.preferences = sharedPreferences;
        this.bodyInterceptor = bodyInterceptor;
        this.converterFactory = factory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mapAdvertising, reason: merged with bridge method [inline-methods] */
    public AppCoinsAdvertisingModel m7021a(ListAppCoinsCampaigns listAppCoinsCampaigns) {
        List<AppCoinsCampaign> list = listAppCoinsCampaigns.getDataList().getList();
        if (list.isEmpty()) {
            return new AppCoinsAdvertisingModel();
        }
        return new AppCoinsAdvertisingModel(list.get(0).getReward().getAppc(), true, list.get(0).getReward().getFiat().getAmount(), list.get(0).getReward().getFiat().getSymbol(), list.get(0).getBudget() != null ? list.get(0).getBudget().getAppc() : -1.0d, list.get(0).getEndDate() != null ? list.get(0).getEndDate() : HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public Single<AppCoinsAdvertisingModel> getValidCampaign(String str, int i2) {
        return new GetAppCoinsCampaignsRequest(new GetAppCoinsCampaignsRequest.Body(str, i2), this.httpClient, this.converterFactory, this.bodyInterceptor, this.tokenInvalidator, this.preferences).observe().m40085Z0().m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.c
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7577f.m7021a((ListAppCoinsCampaigns) obj);
            }
        });
    }
}
