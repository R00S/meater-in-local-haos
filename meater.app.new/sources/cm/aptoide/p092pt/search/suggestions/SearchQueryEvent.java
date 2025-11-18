package cm.aptoide.p092pt.search.suggestions;

/* loaded from: classes.dex */
public class SearchQueryEvent {
    private final boolean isSubmitted;
    private final boolean isSuggestion;
    private final int position;
    private final String query;

    public SearchQueryEvent(String str, boolean z) {
        this(str, 0, z, false);
    }

    public int getPosition() {
        return this.position;
    }

    public String getQuery() {
        return this.query;
    }

    public boolean hasQuery() {
        String str = this.query;
        return (str == null || str.isEmpty()) ? false : true;
    }

    public boolean isSubmitted() {
        return this.isSubmitted;
    }

    public boolean isSuggestion() {
        return this.isSuggestion;
    }

    public SearchQueryEvent(String str, int i2, boolean z, boolean z2) {
        this.query = str;
        this.position = i2;
        this.isSubmitted = z;
        this.isSuggestion = z2;
    }
}
