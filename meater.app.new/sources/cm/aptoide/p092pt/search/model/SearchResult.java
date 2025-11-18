package cm.aptoide.p092pt.search.model;

import com.google.android.gms.ads.AdRequest;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: SearchResult.kt */
@Metadata(m32266d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\bBu\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0015J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003J\t\u0010+\u001a\u00020\u000fHÆ\u0003J\t\u0010,\u001a\u00020\u000fHÆ\u0003J\t\u0010-\u001a\u00020\u0013HÆ\u0003J\t\u0010.\u001a\u00020\u0013HÆ\u0003Jy\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u00100\u001a\u00020\u00132\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u00102\u001a\u00020\u0013J\u0006\u00103\u001a\u00020\u0013J\t\u00104\u001a\u00020\u000fHÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0011\u0010\u0011\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017¨\u00066"}, m32267d2 = {"Lcm/aptoide/pt/search/model/SearchResult;", HttpUrl.FRAGMENT_ENCODE_SET, "query", HttpUrl.FRAGMENT_ENCODE_SET, "error", "Lcm/aptoide/pt/search/model/SearchResultError;", "(Ljava/lang/String;Lcm/aptoide/pt/search/model/SearchResultError;)V", "specificStore", "(Ljava/lang/String;Ljava/lang/String;Lcm/aptoide/pt/search/model/SearchResultError;)V", "searchResultsList", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/pt/search/model/SearchAppResult;", "filters", "Lcm/aptoide/pt/search/model/SearchFilters;", "currentOffset", HttpUrl.FRAGMENT_ENCODE_SET, "nextOffset", "total", "loading", HttpUrl.FRAGMENT_ENCODE_SET, "isFreshResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcm/aptoide/pt/search/model/SearchFilters;IIIZZLcm/aptoide/pt/search/model/SearchResultError;)V", "getCurrentOffset", "()I", "getError", "()Lcm/aptoide/pt/search/model/SearchResultError;", "getFilters", "()Lcm/aptoide/pt/search/model/SearchFilters;", "()Z", "getLoading", "getNextOffset", "getQuery", "()Ljava/lang/String;", "getSearchResultsList", "()Ljava/util/List;", "getSpecificStore", "getTotal", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hasError", "hasMore", "hashCode", "toString", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SearchResult {
    private final int currentOffset;
    private final SearchResultError error;
    private final SearchFilters filters;
    private final boolean isFreshResult;
    private final boolean loading;
    private final int nextOffset;
    private final String query;
    private final List<SearchAppResult> searchResultsList;
    private final String specificStore;
    private final int total;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchResult(String str) {
        this(str, null, null, null, 0, 0, 0, false, false, null, 1022, null);
        C9801m.m32346f(str, "query");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchResult(String str, String str2) {
        this(str, str2, null, null, 0, 0, 0, false, false, null, 1020, null);
        C9801m.m32346f(str, "query");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchResult(String str, String str2, List<? extends SearchAppResult> list) {
        this(str, str2, list, null, 0, 0, 0, false, false, null, 1016, null);
        C9801m.m32346f(str, "query");
        C9801m.m32346f(list, "searchResultsList");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchResult(String str, String str2, List<? extends SearchAppResult> list, SearchFilters searchFilters) {
        this(str, str2, list, searchFilters, 0, 0, 0, false, false, null, 1008, null);
        C9801m.m32346f(str, "query");
        C9801m.m32346f(list, "searchResultsList");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchResult(String str, String str2, List<? extends SearchAppResult> list, SearchFilters searchFilters, int i2) {
        this(str, str2, list, searchFilters, i2, 0, 0, false, false, null, 992, null);
        C9801m.m32346f(str, "query");
        C9801m.m32346f(list, "searchResultsList");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchResult(String str, String str2, List<? extends SearchAppResult> list, SearchFilters searchFilters, int i2, int i3) {
        this(str, str2, list, searchFilters, i2, i3, 0, false, false, null, 960, null);
        C9801m.m32346f(str, "query");
        C9801m.m32346f(list, "searchResultsList");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchResult(String str, String str2, List<? extends SearchAppResult> list, SearchFilters searchFilters, int i2, int i3, int i4) {
        this(str, str2, list, searchFilters, i2, i3, i4, false, false, null, 896, null);
        C9801m.m32346f(str, "query");
        C9801m.m32346f(list, "searchResultsList");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchResult(String str, String str2, List<? extends SearchAppResult> list, SearchFilters searchFilters, int i2, int i3, int i4, boolean z) {
        this(str, str2, list, searchFilters, i2, i3, i4, z, false, null, 768, null);
        C9801m.m32346f(str, "query");
        C9801m.m32346f(list, "searchResultsList");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchResult(String str, String str2, List<? extends SearchAppResult> list, SearchFilters searchFilters, int i2, int i3, int i4, boolean z, boolean z2) {
        this(str, str2, list, searchFilters, i2, i3, i4, z, z2, null, AdRequest.MAX_CONTENT_URL_LENGTH, null);
        C9801m.m32346f(str, "query");
        C9801m.m32346f(list, "searchResultsList");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchResult(String str, String str2, List<? extends SearchAppResult> list, SearchFilters searchFilters, int i2, int i3, int i4, boolean z, boolean z2, SearchResultError searchResultError) {
        C9801m.m32346f(str, "query");
        C9801m.m32346f(list, "searchResultsList");
        this.query = str;
        this.specificStore = str2;
        this.searchResultsList = list;
        this.filters = searchFilters;
        this.currentOffset = i2;
        this.nextOffset = i3;
        this.total = i4;
        this.loading = z;
        this.isFreshResult = z2;
        this.error = searchResultError;
    }

    /* renamed from: component1, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* renamed from: component10, reason: from getter */
    public final SearchResultError getError() {
        return this.error;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSpecificStore() {
        return this.specificStore;
    }

    public final List<SearchAppResult> component3() {
        return this.searchResultsList;
    }

    /* renamed from: component4, reason: from getter */
    public final SearchFilters getFilters() {
        return this.filters;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCurrentOffset() {
        return this.currentOffset;
    }

    /* renamed from: component6, reason: from getter */
    public final int getNextOffset() {
        return this.nextOffset;
    }

    /* renamed from: component7, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsFreshResult() {
        return this.isFreshResult;
    }

    public final SearchResult copy(String query, String specificStore, List<? extends SearchAppResult> searchResultsList, SearchFilters filters, int currentOffset, int nextOffset, int total, boolean loading, boolean isFreshResult, SearchResultError error) {
        C9801m.m32346f(query, "query");
        C9801m.m32346f(searchResultsList, "searchResultsList");
        return new SearchResult(query, specificStore, searchResultsList, filters, currentOffset, nextOffset, total, loading, isFreshResult, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResult)) {
            return false;
        }
        SearchResult searchResult = (SearchResult) other;
        return C9801m.m32341a(this.query, searchResult.query) && C9801m.m32341a(this.specificStore, searchResult.specificStore) && C9801m.m32341a(this.searchResultsList, searchResult.searchResultsList) && C9801m.m32341a(this.filters, searchResult.filters) && this.currentOffset == searchResult.currentOffset && this.nextOffset == searchResult.nextOffset && this.total == searchResult.total && this.loading == searchResult.loading && this.isFreshResult == searchResult.isFreshResult && this.error == searchResult.error;
    }

    public final int getCurrentOffset() {
        return this.currentOffset;
    }

    public final SearchResultError getError() {
        return this.error;
    }

    public final SearchFilters getFilters() {
        return this.filters;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final int getNextOffset() {
        return this.nextOffset;
    }

    public final String getQuery() {
        return this.query;
    }

    public final List<SearchAppResult> getSearchResultsList() {
        return this.searchResultsList;
    }

    public final String getSpecificStore() {
        return this.specificStore;
    }

    public final int getTotal() {
        return this.total;
    }

    public final boolean hasError() {
        return this.error != null;
    }

    public final boolean hasMore() {
        return (this.nextOffset >= this.total || this.loading || hasError()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.query.hashCode() * 31;
        String str = this.specificStore;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.searchResultsList.hashCode()) * 31;
        SearchFilters searchFilters = this.filters;
        int iHashCode3 = (((((((iHashCode2 + (searchFilters == null ? 0 : searchFilters.hashCode())) * 31) + this.currentOffset) * 31) + this.nextOffset) * 31) + this.total) * 31;
        boolean z = this.loading;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (iHashCode3 + i2) * 31;
        boolean z2 = this.isFreshResult;
        int i4 = (i3 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        SearchResultError searchResultError = this.error;
        return i4 + (searchResultError != null ? searchResultError.hashCode() : 0);
    }

    public final boolean isFreshResult() {
        return this.isFreshResult;
    }

    public String toString() {
        return "SearchResult(query=" + this.query + ", specificStore=" + this.specificStore + ", searchResultsList=" + this.searchResultsList + ", filters=" + this.filters + ", currentOffset=" + this.currentOffset + ", nextOffset=" + this.nextOffset + ", total=" + this.total + ", loading=" + this.loading + ", isFreshResult=" + this.isFreshResult + ", error=" + this.error + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SearchResult(String str, String str2, List list, SearchFilters searchFilters, int i2, int i3, int i4, boolean z, boolean z2, SearchResultError searchResultError, int i5, C9789g c9789g) {
        List listEmptyList;
        String str3 = (i5 & 2) != 0 ? null : str2;
        if ((i5 & 4) != 0) {
            listEmptyList = Collections.emptyList();
            C9801m.m32345e(listEmptyList, "emptyList()");
        } else {
            listEmptyList = list;
        }
        this(str, str3, listEmptyList, (i5 & 8) != 0 ? null : searchFilters, (i5 & 16) != 0 ? -1 : i2, (i5 & 32) != 0 ? -1 : i3, (i5 & 64) == 0 ? i4 : -1, (i5 & 128) != 0 ? false : z, (i5 & 256) == 0 ? z2 : false, (i5 & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 ? searchResultError : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchResult(String str, SearchResultError searchResultError) {
        this(str, (String) null, searchResultError);
        C9801m.m32346f(str, "query");
        C9801m.m32346f(searchResultError, "error");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchResult(String str, String str2, SearchResultError searchResultError) {
        C9801m.m32346f(str, "query");
        C9801m.m32346f(searchResultError, "error");
        List listEmptyList = Collections.emptyList();
        C9801m.m32345e(listEmptyList, "emptyList()");
        this(str, str2, listEmptyList, null, -1, -1, -1, false, false, searchResultError);
    }
}
