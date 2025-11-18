package cm.aptoide.p092pt.notification;

import android.content.SharedPreferences;
import android.content.res.Resources;
import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.dataprovider.model.p093v1.GetPullNotificationsResponse;
import cm.aptoide.p092pt.dataprovider.p097ws.p098v1.notification.PullCampaignNotificationsRequest;
import cm.aptoide.p092pt.networking.IdsRepository;
import java.util.LinkedList;
import java.util.List;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11256e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class NotificationService {
    private final AptoideAccountManager accountManager;
    private final String applicationId;
    private final Converter.Factory converterFactory;
    private final String extraId;
    private final OkHttpClient httpClient;
    private final IdsRepository idsRepository;
    private final Resources resources;
    private final SharedPreferences sharedPreferences;
    private final String versionName;

    public NotificationService(String str, OkHttpClient okHttpClient, Converter.Factory factory, IdsRepository idsRepository, String str2, String str3, SharedPreferences sharedPreferences, Resources resources, AptoideAccountManager aptoideAccountManager) {
        this.applicationId = str;
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.idsRepository = idsRepository;
        this.versionName = str2;
        this.extraId = str3;
        this.sharedPreferences = sharedPreferences;
        this.resources = resources;
        this.accountManager = aptoideAccountManager;
    }

    private List<AptoideNotification> convertCampaignNotifications(List<GetPullNotificationsResponse> list, String str) {
        String str2;
        String appGraphic;
        LinkedList linkedList = new LinkedList();
        for (GetPullNotificationsResponse getPullNotificationsResponse : list) {
            if (getPullNotificationsResponse.getAttr() != null) {
                String appName = getPullNotificationsResponse.getAttr().getAppName();
                appGraphic = getPullNotificationsResponse.getAttr().getAppGraphic();
                str2 = appName;
            } else {
                str2 = null;
                appGraphic = null;
            }
            linkedList.add(new AptoideNotification(getPullNotificationsResponse.getBody(), getPullNotificationsResponse.getImg(), getPullNotificationsResponse.getTitle(), getPullNotificationsResponse.getUrl(), 0, str2, appGraphic, -1L, str, getPullNotificationsResponse.getUrlTrack(), getPullNotificationsResponse.getUrlTrackNc(), false, System.currentTimeMillis(), getPullNotificationsResponse.getExpire(), getPullNotificationsResponse.getAbTestingGroup(), getPullNotificationsResponse.getCampaignId(), getPullNotificationsResponse.getLang(), -1, getPullNotificationsResponse.getWhitelistedPackages()));
        }
        return linkedList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getCampaignNotifications$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8323a(String str) {
        return PullCampaignNotificationsRequest.m7424of(str, this.versionName, this.applicationId, this.httpClient, this.converterFactory, this.extraId, this.sharedPreferences, this.resources).observe();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getCampaignNotifications$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ List m8324b(List list, Account account) {
        return convertCampaignNotifications(list, account.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getCampaignNotifications$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8325c(final List list) {
        return this.accountManager.accountStatus().m40057E().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.v
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10465f.m8324b(list, (Account) obj);
            }
        });
    }

    public Single<List<AptoideNotification>> getCampaignNotifications() {
        return this.idsRepository.getUniqueIdentifier().m39922k(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.w
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10485f.m8323a((String) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.x
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10489f.m8325c((List) obj);
            }
        }).m40057E().m40085Z0();
    }
}
