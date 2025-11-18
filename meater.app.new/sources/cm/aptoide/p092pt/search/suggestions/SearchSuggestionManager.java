package cm.aptoide.p092pt.search.suggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;
import p456rx.AbstractC11243h;
import p456rx.Single;

/* loaded from: classes.dex */
public class SearchSuggestionManager {
    private final AbstractC11243h ioScheduler;
    private final SearchSuggestionService service;
    private final int timeout;
    private final TimeUnit timeoutTimeUnit;

    public SearchSuggestionManager(SearchSuggestionService searchSuggestionService, AbstractC11243h abstractC11243h) {
        this.service = searchSuggestionService;
        this.ioScheduler = abstractC11243h;
        this.timeout = 10;
        this.timeoutTimeUnit = TimeUnit.SECONDS;
    }

    public Single<List<String>> getSuggestionsForApp(String str) {
        return this.service.getAppSuggestionsForQuery(str).m39931w(this.timeout, this.timeoutTimeUnit).m39930v(this.ioScheduler);
    }

    public Single<List<String>> getSuggestionsForStore(String str) {
        return this.service.getStoreSuggestionsForQuery(str).m39931w(this.timeout, this.timeoutTimeUnit).m39930v(this.ioScheduler);
    }

    public SearchSuggestionManager(SearchSuggestionService searchSuggestionService, int i2, TimeUnit timeUnit, AbstractC11243h abstractC11243h) {
        this.service = searchSuggestionService;
        this.ioScheduler = abstractC11243h;
        this.timeout = i2;
        this.timeoutTimeUnit = timeUnit;
    }
}
