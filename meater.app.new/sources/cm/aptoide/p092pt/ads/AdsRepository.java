package cm.aptoide.p092pt.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.dataprovider.model.p094v2.GetAdsResponse;
import cm.aptoide.p092pt.dataprovider.p097ws.p099v2.aptwords.AdsApplicationVersionCodeProvider;
import cm.aptoide.p092pt.dataprovider.p097ws.p099v2.aptwords.GetAdsRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p099v2.aptwords.Location;
import cm.aptoide.p092pt.networking.IdsRepository;
import cm.aptoide.p092pt.preferences.managed.ManagerPreferences;
import cm.aptoide.p092pt.utils.p106q.QManager;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;
import p456rx.schedulers.Schedulers;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class AdsRepository {
    private final AptoideAccountManager accountManager;
    private final MinimalAdMapper adMapper;
    private final ConnectivityManager connectivityManager;
    private final Context context;
    private final Converter.Factory converterFactory;
    private final GooglePlayServicesAvailabilityChecker googlePlayServicesAvailabilityChecker;
    private final OkHttpClient httpClient;
    private final IdsRepository idsRepository;
    private final String partnerId;
    private final QManager qManager;
    private final Resources resources;
    private final SharedPreferences sharedPreferences;
    private final AdsApplicationVersionCodeProvider versionCodeProvider;

    public AdsRepository(IdsRepository idsRepository, AptoideAccountManager aptoideAccountManager, OkHttpClient okHttpClient, Converter.Factory factory, QManager qManager, SharedPreferences sharedPreferences, Context context, ConnectivityManager connectivityManager, Resources resources, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider, GooglePlayServicesAvailabilityChecker googlePlayServicesAvailabilityChecker, String str, MinimalAdMapper minimalAdMapper) {
        this.idsRepository = idsRepository;
        this.accountManager = aptoideAccountManager;
        this.versionCodeProvider = adsApplicationVersionCodeProvider;
        this.googlePlayServicesAvailabilityChecker = googlePlayServicesAvailabilityChecker;
        this.partnerId = str;
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.qManager = qManager;
        this.sharedPreferences = sharedPreferences;
        this.context = context;
        this.connectivityManager = connectivityManager;
        this.resources = resources;
        this.adMapper = minimalAdMapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getAdForShortcut$18, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m6998a(Account account, String str) {
        return mapRandomAd(GetAdsRequest.m7426of(Location.homepage, "__NULL__", 10, str, this.googlePlayServicesAvailabilityChecker.isAvailable(this.context), this.partnerId, account.isAdultContentEnabled(), this.httpClient, this.converterFactory, this.qManager.getFilters(ManagerPreferences.getHWSpecsFilter(this.sharedPreferences)), this.sharedPreferences, this.connectivityManager, this.resources, this.versionCodeProvider).observe());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getAdForShortcut$19, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m6999b(final Account account) {
        return this.idsRepository.getUniqueIdentifier().m39922k(new InterfaceC11256e() { // from class: cm.aptoide.pt.ads.k
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7532f.m6998a(account, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getAdsFromHomepageMore$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7000c(Account account, boolean z, String str) {
        return mapToMinimalAds(GetAdsRequest.ofHomepageMore(str, this.googlePlayServicesAvailabilityChecker.isAvailable(this.context), this.partnerId, account.isAdultContentEnabled(), this.httpClient, this.converterFactory, this.qManager.getFilters(ManagerPreferences.getHWSpecsFilter(this.sharedPreferences)), this.sharedPreferences, this.connectivityManager, this.resources, this.versionCodeProvider).observe(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getAdsFromHomepageMore$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7001d(final boolean z, final Account account) {
        return this.idsRepository.getUniqueIdentifier().m39922k(new InterfaceC11256e() { // from class: cm.aptoide.pt.ads.g
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7519f.m7000c(account, z, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getAdsFromSearch$12, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7002e(String str, Account account, String str2) {
        return mapToMinimalAd(GetAdsRequest.ofSearch(str, str2, this.googlePlayServicesAvailabilityChecker.isAvailable(this.context), this.partnerId, account.isAdultContentEnabled(), this.httpClient, this.converterFactory, this.qManager.getFilters(ManagerPreferences.getHWSpecsFilter(this.sharedPreferences)), this.sharedPreferences, this.connectivityManager, this.resources, this.versionCodeProvider).observe());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getAdsFromSearch$13, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7003f(final String str, final Account account) {
        return this.idsRepository.getUniqueIdentifier().m39922k(new InterfaceC11256e() { // from class: cm.aptoide.pt.ads.v
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7551f.m7002e(str, account, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getAdsFromSecondInstall$14, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7004g(String str, Account account, String str2) {
        return mapToMinimalAd(GetAdsRequest.ofSecondInstall(str, str2, this.googlePlayServicesAvailabilityChecker.isAvailable(this.context), this.partnerId, account.isAdultContentEnabled(), this.httpClient, this.converterFactory, this.qManager.getFilters(ManagerPreferences.getHWSpecsFilter(this.sharedPreferences)), this.sharedPreferences, this.connectivityManager, this.resources, this.versionCodeProvider).observe());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getAdsFromSecondInstall$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7005h(final String str, final Account account) {
        return this.idsRepository.getUniqueIdentifier().m39922k(new InterfaceC11256e() { // from class: cm.aptoide.pt.ads.j
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7529f.m7004g(str, account, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getAdsFromSecondTry$16, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7006i(String str, Account account, String str2) {
        return mapToMinimalAd(GetAdsRequest.ofSecondTry(str, str2, this.googlePlayServicesAvailabilityChecker.isAvailable(this.context), this.partnerId, account.isAdultContentEnabled(), this.httpClient, this.converterFactory, this.qManager.getFilters(ManagerPreferences.getHWSpecsFilter(this.sharedPreferences)), this.sharedPreferences, this.connectivityManager, this.resources, this.versionCodeProvider).observe());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getAdsFromSecondTry$17, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7007j(final String str, final Account account) {
        return this.idsRepository.getUniqueIdentifier().m39922k(new InterfaceC11256e() { // from class: cm.aptoide.pt.ads.i
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7526f.m7006i(str, account, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadAdsFromAppView$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7008k(String str, String str2, Account account, String str3) {
        return mapToMinimalAd(GetAdsRequest.ofAppviewOrganic(str, str2, str3, this.googlePlayServicesAvailabilityChecker.isAvailable(this.context), this.partnerId, account.isAdultContentEnabled(), this.httpClient, this.converterFactory, this.qManager.getFilters(ManagerPreferences.getHWSpecsFilter(this.sharedPreferences)), this.sharedPreferences, this.connectivityManager, this.resources, this.versionCodeProvider).observe());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadAdsFromAppView$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7009l(final String str, final String str2, final Account account) {
        return this.idsRepository.getUniqueIdentifier().m39922k(new InterfaceC11256e() { // from class: cm.aptoide.pt.ads.h
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7522f.m7008k(str, str2, account, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadAdsFromAppviewSuggested$10, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7010m(List list, String str, Account account, String str2) {
        return mapToMinimalAds(GetAdsRequest.ofAppviewSuggested(list, str2, this.googlePlayServicesAvailabilityChecker.isAvailable(this.context), str, this.partnerId, account.isAdultContentEnabled(), this.httpClient, this.converterFactory, this.qManager.getFilters(ManagerPreferences.getHWSpecsFilter(this.sharedPreferences)), this.sharedPreferences, this.connectivityManager, this.resources, this.versionCodeProvider).observe()).m40065I0(Schedulers.m40658io());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadAdsFromAppviewSuggested$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7011n(final List list, final String str, final Account account) {
        return this.idsRepository.getUniqueIdentifier().m39922k(new InterfaceC11256e() { // from class: cm.aptoide.pt.ads.w
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7554f.m7010m(list, str, account, (String) obj);
            }
        });
    }

    static /* synthetic */ C11234e lambda$mapRandomAd$21(Random random, List list) {
        return !validAds((List<GetAdsResponse.C2220Ad>) list) ? C11234e.m40017C(new IllegalStateException("Invalid ads returned from server")) : C11234e.m40025S((GetAdsResponse.C2220Ad) list.get(random.nextInt(10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$mapRandomAd$22, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ MinimalAd m7012o(GetAdsResponse.C2220Ad c2220Ad) {
        return this.adMapper.map(c2220Ad);
    }

    static /* synthetic */ C11234e lambda$mapToMinimalAd$3(List list) {
        return !validAds((List<GetAdsResponse.C2220Ad>) list) ? C11234e.m40017C(new IllegalStateException("Invalid ads returned from server")) : C11234e.m40025S((GetAdsResponse.C2220Ad) list.get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$mapToMinimalAd$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ MinimalAd m7013p(GetAdsResponse.C2220Ad c2220Ad) {
        return this.adMapper.map(c2220Ad);
    }

    static /* synthetic */ C11234e lambda$mapToMinimalAds$7(GetAdsResponse getAdsResponse) {
        return !validAds(getAdsResponse) ? C11234e.m40017C(new IllegalStateException("Invalid ads returned from server")) : C11234e.m40025S(getAdsResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$mapToMinimalAds$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ List m7014q(List list) {
        LinkedList linkedList = new LinkedList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedList.add(this.adMapper.map((GetAdsResponse.C2220Ad) it.next()));
        }
        return linkedList;
    }

    private C11234e<MinimalAd> mapRandomAd(C11234e<GetAdsResponse> c11234e) {
        final Random random = new Random();
        return c11234e.m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.ads.s
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((GetAdsResponse) obj).getAds();
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.ads.t
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AdsRepository.lambda$mapRandomAd$21(random, (List) obj);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.ads.c
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7515f.m7012o((GetAdsResponse.C2220Ad) obj);
            }
        });
    }

    private C11234e<MinimalAd> mapToMinimalAd(C11234e<GetAdsResponse> c11234e) {
        return c11234e.m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.ads.l
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((GetAdsResponse) obj).getAds();
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.ads.e
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AdsRepository.lambda$mapToMinimalAd$3((List) obj);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.ads.b
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7514f.m7013p((GetAdsResponse.C2220Ad) obj);
            }
        });
    }

    private C11234e<List<MinimalAd>> mapToMinimalAds(C11234e<GetAdsResponse> c11234e) {
        return c11234e.m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.ads.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AdsRepository.lambda$mapToMinimalAds$7((GetAdsResponse) obj);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.ads.f
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((GetAdsResponse) obj).getAds();
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.ads.p
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7541f.m7014q((List) obj);
            }
        });
    }

    public static boolean validAds(List<GetAdsResponse.C2220Ad> list) {
        return (list == null || list.isEmpty() || list.get(0) == null || list.get(0).getPartner() == null || list.get(0).getPartner().getData() == null) ? false : true;
    }

    public C11234e<MinimalAd> getAdForShortcut() {
        return this.accountManager.accountStatus().m40057E().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.ads.m
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7535f.m6999b((Account) obj);
            }
        });
    }

    public C11234e<List<MinimalAd>> getAdsFromHomepageMore(final boolean z) {
        return this.accountManager.accountStatus().m40057E().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.ads.o
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7539f.m7001d(z, (Account) obj);
            }
        });
    }

    public C11234e<MinimalAd> getAdsFromSearch(final String str) {
        return this.accountManager.accountStatus().m40057E().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.ads.a
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7512f.m7003f(str, (Account) obj);
            }
        });
    }

    public C11234e<MinimalAd> getAdsFromSecondInstall(final String str) {
        return this.accountManager.accountStatus().m40057E().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.ads.q
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7542f.m7005h(str, (Account) obj);
            }
        });
    }

    public C11234e<MinimalAd> getAdsFromSecondTry(final String str) {
        return this.accountManager.accountStatus().m40057E().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.ads.u
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7549f.m7007j(str, (Account) obj);
            }
        });
    }

    public C11234e<MinimalAd> loadAdsFromAppView(final String str, final String str2) {
        return this.accountManager.accountStatus().m40057E().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.ads.r
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7544f.m7009l(str, str2, (Account) obj);
            }
        });
    }

    public C11234e<List<MinimalAd>> loadAdsFromAppviewSuggested(final String str, final List<String> list) {
        return this.accountManager.accountStatus().m40057E().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.ads.n
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7536f.m7011n(list, str, (Account) obj);
            }
        });
    }

    public static boolean validAds(GetAdsResponse getAdsResponse) {
        return getAdsResponse != null && validAds(getAdsResponse.getAds());
    }
}
