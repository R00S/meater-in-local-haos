package cm.aptoide.p092pt.repository.request;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.AppCoinsCampaign;
import cm.aptoide.p092pt.dataprovider.model.p096v7.DataList;
import cm.aptoide.p092pt.dataprovider.model.p096v7.ListAppCoinsCampaigns;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.GetAppCoinsCampaignsRequest;
import cm.aptoide.p092pt.home.bundles.apps.RewardApp;
import cm.aptoide.p092pt.install.InstallManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class RewardAppCoinsAppsRepository {
    private static final int APPCOINS_REWARD_LIMIT = 50;
    private BodyInterceptor<BaseBody> bodyInterceptor;
    private Converter.Factory converterFactory;
    private OkHttpClient httpClient;
    private InstallManager installManager;
    private SharedPreferences sharedPreferences;
    private TokenInvalidator tokenInvalidator;
    private int total = 0;
    private int next = 0;

    public RewardAppCoinsAppsRepository(OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor<BaseBody> bodyInterceptor, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, InstallManager installManager) {
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.bodyInterceptor = bodyInterceptor;
        this.tokenInvalidator = tokenInvalidator;
        this.sharedPreferences = sharedPreferences;
        this.installManager = installManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getFreshAppCoinsRewardAppsFromHomeMore$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8596a(String str, ListAppCoinsCampaigns listAppCoinsCampaigns) {
        return map(listAppCoinsCampaigns.getDataList(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getNextAppCoinsRewardAppsFromHomeMore$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8597b(String str, ListAppCoinsCampaigns listAppCoinsCampaigns) {
        return map(listAppCoinsCampaigns.getDataList(), str);
    }

    private C11234e<List<RewardApp>> map(DataList<AppCoinsCampaign> dataList, String str) {
        this.total = dataList.getTotal();
        this.next = dataList.getNext();
        ArrayList arrayList = new ArrayList();
        for (AppCoinsCampaign appCoinsCampaign : dataList.getList()) {
            AppCoinsCampaign.CampaignApp app = appCoinsCampaign.getApp();
            if (!this.installManager.wasAppEverInstalled(app.getPackageName())) {
                arrayList.add(new RewardApp(app.getName(), app.getIcon(), app.getStats().getRating().getAvg(), app.getStats().getPdownloads(), app.getPackageName(), app.getId(), str, app.getAppcoins() != null, app.getAppcoins().getClicks().getClick(), app.getAppcoins().getClicks().getInstall(), mapReward(appCoinsCampaign.getReward()), app.getGraphic()));
            }
        }
        return C11234e.m40025S(arrayList);
    }

    private RewardApp.Reward mapReward(AppCoinsCampaign.Reward reward) {
        AppCoinsCampaign.Fiat fiat = reward.getFiat();
        return new RewardApp.Reward(reward.getAppc(), new RewardApp.Fiat(fiat.getAmount(), fiat.getCurrency(), fiat.getSymbol()));
    }

    public C11234e<List<RewardApp>> getFreshAppCoinsRewardAppsFromHomeMore(final String str) {
        return new GetAppCoinsCampaignsRequest(new GetAppCoinsCampaignsRequest.Body(0, 50), this.httpClient, this.converterFactory, this.bodyInterceptor, this.tokenInvalidator, this.sharedPreferences).observe(true).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.repository.request.a
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10956f.m8596a(str, (ListAppCoinsCampaigns) obj);
            }
        });
    }

    public C11234e<List<RewardApp>> getNextAppCoinsRewardAppsFromHomeMore(final String str) {
        int i2 = this.next;
        return i2 >= this.total ? C11234e.m40025S(Collections.emptyList()) : new GetAppCoinsCampaignsRequest(new GetAppCoinsCampaignsRequest.Body(i2, 50), this.httpClient, this.converterFactory, this.bodyInterceptor, this.tokenInvalidator, this.sharedPreferences).observe(false).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.repository.request.b
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10958f.m8597b(str, (ListAppCoinsCampaigns) obj);
            }
        });
    }
}
