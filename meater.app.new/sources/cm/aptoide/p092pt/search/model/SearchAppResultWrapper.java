package cm.aptoide.p092pt.search.model;

/* loaded from: classes.dex */
public class SearchAppResultWrapper {
    private int position;
    private String query;
    private SearchAppResult searchAppResult;

    public SearchAppResultWrapper() {
    }

    public int getPosition() {
        return this.position;
    }

    public String getQuery() {
        return this.query;
    }

    public SearchAppResult getSearchAppResult() {
        return this.searchAppResult;
    }

    public void setQuery(String str) {
        this.query = str;
    }

    public SearchAppResultWrapper(String str, SearchAppResult searchAppResult, int i2) {
        this.query = str;
        this.searchAppResult = searchAppResult;
        this.position = i2;
    }
}
