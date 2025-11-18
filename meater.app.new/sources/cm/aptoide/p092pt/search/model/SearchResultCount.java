package cm.aptoide.p092pt.search.model;

import cm.aptoide.p092pt.search.view.SearchResultView;

/* loaded from: classes.dex */
public class SearchResultCount {
    private int resultCount;
    private SearchResultView.Model searchResultViewModel;

    public SearchResultCount(int i2, SearchResultView.Model model) {
        this.resultCount = i2;
        this.searchResultViewModel = model;
    }

    public int getResultCount() {
        return this.resultCount;
    }

    public SearchResultView.Model getSearchResultViewModel() {
        return this.searchResultViewModel;
    }

    public void setResultCount(int i2) {
        this.resultCount = i2;
    }

    public void setSearchResultViewModel(SearchResultView.Model model) {
        this.searchResultViewModel = model;
    }
}
