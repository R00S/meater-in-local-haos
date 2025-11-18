package cm.aptoide.p092pt.home.bundles.ads;

import cm.aptoide.p092pt.search.model.SearchAdResult;
import cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: SearchAdNavigationResult.kt */
@Metadata(m32266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m32267d2 = {"Lcm/aptoide/pt/home/bundles/ads/SearchAdNavigationResult;", HttpUrl.FRAGMENT_ENCODE_SET, StoreTabGridRecyclerFragment.BundleCons.TAG, HttpUrl.FRAGMENT_ENCODE_SET, "searchAdResult", "Lcm/aptoide/pt/search/model/SearchAdResult;", "(Ljava/lang/String;Lcm/aptoide/pt/search/model/SearchAdResult;)V", "getSearchAdResult", "()Lcm/aptoide/pt/search/model/SearchAdResult;", "getTag", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SearchAdNavigationResult {
    private final SearchAdResult searchAdResult;
    private final String tag;

    public SearchAdNavigationResult(String str, SearchAdResult searchAdResult) {
        C9801m.m32346f(str, StoreTabGridRecyclerFragment.BundleCons.TAG);
        C9801m.m32346f(searchAdResult, "searchAdResult");
        this.tag = str;
        this.searchAdResult = searchAdResult;
    }

    public static /* synthetic */ SearchAdNavigationResult copy$default(SearchAdNavigationResult searchAdNavigationResult, String str, SearchAdResult searchAdResult, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = searchAdNavigationResult.tag;
        }
        if ((i2 & 2) != 0) {
            searchAdResult = searchAdNavigationResult.searchAdResult;
        }
        return searchAdNavigationResult.copy(str, searchAdResult);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* renamed from: component2, reason: from getter */
    public final SearchAdResult getSearchAdResult() {
        return this.searchAdResult;
    }

    public final SearchAdNavigationResult copy(String tag, SearchAdResult searchAdResult) {
        C9801m.m32346f(tag, StoreTabGridRecyclerFragment.BundleCons.TAG);
        C9801m.m32346f(searchAdResult, "searchAdResult");
        return new SearchAdNavigationResult(tag, searchAdResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchAdNavigationResult)) {
            return false;
        }
        SearchAdNavigationResult searchAdNavigationResult = (SearchAdNavigationResult) other;
        return C9801m.m32341a(this.tag, searchAdNavigationResult.tag) && C9801m.m32341a(this.searchAdResult, searchAdNavigationResult.searchAdResult);
    }

    public final SearchAdResult getSearchAdResult() {
        return this.searchAdResult;
    }

    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        return (this.tag.hashCode() * 31) + this.searchAdResult.hashCode();
    }

    public String toString() {
        return "SearchAdNavigationResult(tag=" + this.tag + ", searchAdResult=" + this.searchAdResult + ')';
    }
}
