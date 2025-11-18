package cm.aptoide.p092pt.search.model;

import cm.aptoide.aptoideviews.filters.Filter;
import cm.aptoide.p092pt.search.view.SearchResultView;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class SearchViewModel implements SearchResultView.Model {
    List<Filter> filters;
    boolean loadedAds;
    boolean loadedResults;
    boolean onlyTrustedApps;
    SearchQueryModel searchQueryModel;
    String storeName;
    private String storeTheme;

    public SearchViewModel() {
        this.loadedAds = false;
        this.loadedResults = false;
    }

    @Override // cm.aptoide.pt.search.view.SearchResultView.Model
    public List<Filter> getFilters() {
        return this.filters;
    }

    @Override // cm.aptoide.pt.search.view.SearchResultView.Model
    public SearchQueryModel getSearchQueryModel() {
        return this.searchQueryModel;
    }

    @Override // cm.aptoide.pt.search.view.SearchResultView.Model
    public String getStoreName() {
        return this.storeName;
    }

    @Override // cm.aptoide.pt.search.view.SearchResultView.Model
    public String getStoreTheme() {
        return this.storeTheme;
    }

    @Override // cm.aptoide.pt.search.view.SearchResultView.Model
    public boolean hasLoadedAds() {
        return this.loadedAds;
    }

    @Override // cm.aptoide.pt.search.view.SearchResultView.Model
    public boolean hasLoadedResults() {
        return this.loadedResults;
    }

    public void setFilters(List<Filter> list) {
        this.filters = list;
    }

    public void setLoadedResults(boolean z) {
        this.loadedResults = z;
    }

    public SearchViewModel(SearchQueryModel searchQueryModel, String str, boolean z, String str2) {
        this.loadedAds = false;
        this.loadedResults = false;
        this.searchQueryModel = searchQueryModel;
        this.storeName = str;
        this.onlyTrustedApps = z;
        this.storeTheme = str2;
    }

    public SearchViewModel(SearchQueryModel searchQueryModel, boolean z) {
        this(searchQueryModel, null, z, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public SearchViewModel(SearchQueryModel searchQueryModel, String str, String str2) {
        this(searchQueryModel, str, true, str2);
    }
}
