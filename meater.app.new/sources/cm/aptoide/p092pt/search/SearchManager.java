package cm.aptoide.p092pt.search;

import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.aptoideviews.filters.Filter;
import cm.aptoide.p092pt.app.mmpcampaigns.Campaign;
import cm.aptoide.p092pt.download.view.DownloadStatusManager;
import cm.aptoide.p092pt.download.view.DownloadStatusModel;
import cm.aptoide.p092pt.search.model.SearchAppResult;
import cm.aptoide.p092pt.search.model.SearchFilterType;
import cm.aptoide.p092pt.search.model.SearchFilters;
import cm.aptoide.p092pt.search.model.SearchResult;
import cm.aptoide.p092pt.view.app.AppCenter;
import cm.aptoide.p092pt.view.app.AppScreenshot;
import cm.aptoide.p092pt.view.app.DetailedAppRequestResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p460m.InterfaceC11258g;

/* loaded from: classes.dex */
public class SearchManager {
    private final AptoideAccountManager accountManager;
    private final AppCenter appCenter;
    private final DownloadStatusManager downloadStatusManager;
    private final SearchRepository searchRepository;

    public SearchManager(AptoideAccountManager aptoideAccountManager, SearchRepository searchRepository, DownloadStatusManager downloadStatusManager, AppCenter appCenter) {
        this.accountManager = aptoideAccountManager;
        this.searchRepository = searchRepository;
        this.downloadStatusManager = downloadStatusManager;
        this.appCenter = appCenter;
    }

    private C11234e<SearchResult> getHighlightedSearchResult(SearchResult searchResult) {
        return C11234e.m40025S(new SearchResult(searchResult.getQuery(), searchResult.getSpecificStore(), searchResult.getSearchResultsList(), searchResult.getFilters(), searchResult.getCurrentOffset(), searchResult.getNextOffset(), searchResult.getTotal(), searchResult.getLoading(), false, searchResult.getError()));
    }

    static /* synthetic */ List lambda$loadAppScreenShots$4(DetailedAppRequestResult detailedAppRequestResult) {
        List listEmptyList = Collections.emptyList();
        return (detailedAppRequestResult == null || detailedAppRequestResult.getDetailedApp() == null || detailedAppRequestResult.getDetailedApp().getMedia() == null || detailedAppRequestResult.getDetailedApp().getMedia().getScreenshots() == null) ? listEmptyList : detailedAppRequestResult.getDetailedApp().getMedia().getScreenshots();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observeHighlightedSearchResult$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ SearchResult m8606a(DetailedAppRequestResult detailedAppRequestResult, SearchResult searchResult, DownloadStatusModel downloadStatusModel, List list) {
        return mergeSearchResult(searchResult, downloadStatusModel, list, detailedAppRequestResult.getDetailedApp().getBdsFlags().contains("STORE_BDS"), detailedAppRequestResult.getDetailedApp().getAppCategory(), detailedAppRequestResult.getDetailedApp().getCampaign());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observeHighlightedSearchResult$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8607b(SearchResult searchResult, SearchAppResult searchAppResult, final DetailedAppRequestResult detailedAppRequestResult) {
        return C11234e.m40038d(getHighlightedSearchResult(searchResult), this.downloadStatusManager.loadDownloadModel(searchAppResult.getMd5(), searchAppResult.getPackageName(), searchAppResult.getVersionCode(), detailedAppRequestResult.getDetailedApp().getSignature(), searchAppResult.getStoreId().longValue(), searchAppResult.hasAdvertising() || searchAppResult.hasBilling()), loadAppScreenShots(searchAppResult.getAppId(), searchAppResult.getStoreName(), searchAppResult.getPackageName()), new InterfaceC11258g() { // from class: cm.aptoide.pt.search.c
            @Override // p456rx.p460m.InterfaceC11258g
            /* renamed from: a */
            public final Object mo6864a(Object obj, Object obj2, Object obj3) {
                return this.f10981a.m8606a(detailedAppRequestResult, (SearchResult) obj, (DownloadStatusModel) obj2, (List) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observeSearchResults$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8608c(SearchResult searchResult) {
        List<SearchAppResult> searchResultsList = searchResult.getSearchResultsList();
        return (searchResultsList.isEmpty() || !searchResultsList.get(0).isHighlightedResult()) ? C11234e.m40025S(searchResult) : searchResult.isFreshResult() ? C11234e.m40043f0(C11234e.m40025S(searchResult), observeHighlightedSearchResult(searchResult)) : observeHighlightedSearchResult(searchResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$searchAppInStores$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8609d(String str, List list, boolean z, Boolean bool) {
        return this.searchRepository.generalSearch(str, getSearchFilters(list), bool.booleanValue(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$searchInStore$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8610e(String str, List list, String str2, boolean z, Boolean bool) {
        return this.searchRepository.searchInStore(str, getSearchFilters(list), bool.booleanValue(), str2, z);
    }

    private C11234e<List<AppScreenshot>> loadAppScreenShots(long j2, String str, String str2) {
        return C11234e.m40043f0(C11234e.m40025S(null), this.appCenter.unsafeLoadDetailedApp(j2, str, str2).m39915A()).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.b
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return SearchManager.lambda$loadAppScreenShots$4((DetailedAppRequestResult) obj);
            }
        }).m40077R0(700L, TimeUnit.MILLISECONDS);
    }

    private SearchResult mergeSearchResult(SearchResult searchResult, DownloadStatusModel downloadStatusModel, List<AppScreenshot> list, boolean z, String str, Campaign campaign) {
        ArrayList arrayList = new ArrayList(searchResult.getSearchResultsList());
        arrayList.set(0, new SearchAppResult((SearchAppResult) arrayList.get(0), downloadStatusModel, list, z, str, campaign));
        return new SearchResult(searchResult.getQuery(), searchResult.getSpecificStore(), arrayList, searchResult.getFilters(), searchResult.getCurrentOffset(), searchResult.getNextOffset(), searchResult.getTotal(), searchResult.getLoading(), searchResult.isFreshResult(), searchResult.getError());
    }

    public C11231b disableAdultContent() {
        return this.accountManager.disable();
    }

    public C11231b enableAdultContent() {
        return this.accountManager.enable();
    }

    public C11231b enableAdultContentWithPin(int i2) {
        return this.accountManager.enable(i2);
    }

    public SearchFilters getSearchFilters(List<Filter> list) {
        boolean selected = false;
        boolean selected2 = false;
        boolean selected3 = false;
        boolean selected4 = false;
        for (Filter filter : list) {
            if (filter.getIdentifier() != null) {
                if (filter.getIdentifier().equals(SearchFilterType.FOLLOWED_STORES.name())) {
                    selected = filter.getSelected();
                } else if (filter.getIdentifier().equals(SearchFilterType.TRUSTED.name())) {
                    selected2 = filter.getSelected();
                } else if (filter.getIdentifier().equals(SearchFilterType.BETA.name())) {
                    selected3 = filter.getSelected();
                } else if (filter.getIdentifier().equals(SearchFilterType.APPC.name())) {
                    selected4 = filter.getSelected();
                }
            }
        }
        return new SearchFilters(selected, selected2, selected3, selected4);
    }

    public C11234e<Boolean> isAdultContentEnabled() {
        return this.accountManager.hasMatureContentEnabled();
    }

    public C11234e<Boolean> isAdultContentPinRequired() {
        return this.accountManager.pinRequired();
    }

    public C11234e<SearchResult> observeHighlightedSearchResult(final SearchResult searchResult) {
        final SearchAppResult searchAppResult = searchResult.getSearchResultsList().get(0);
        return this.appCenter.unsafeLoadDetailedApp(searchAppResult.getAppId(), searchAppResult.getStoreName(), searchAppResult.getPackageName()).m39915A().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.a
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10977f.m8607b(searchResult, searchAppResult, (DetailedAppRequestResult) obj);
            }
        });
    }

    public C11234e<SearchResult> observeSearchResults() {
        return this.searchRepository.observeSearchResults().m40071L0(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.f
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10992f.m8608c((SearchResult) obj);
            }
        });
    }

    public C11231b searchAppInStores(final String str, final List<Filter> list, final boolean z) {
        return this.accountManager.hasMatureContentEnabled().m40057E().m40085Z0().m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.e
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10988f.m8609d(str, list, z, (Boolean) obj);
            }
        });
    }

    public C11231b searchInStore(final String str, final String str2, final List<Filter> list, final boolean z) {
        return this.accountManager.hasMatureContentEnabled().m40057E().m40085Z0().m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10983f.m8610e(str, list, str2, z, (Boolean) obj);
            }
        });
    }
}
