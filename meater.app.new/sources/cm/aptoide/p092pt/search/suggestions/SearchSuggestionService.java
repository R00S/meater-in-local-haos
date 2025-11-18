package cm.aptoide.p092pt.search.suggestions;

import java.util.List;
import p456rx.Single;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class SearchSuggestionService {
    private final SearchSuggestionRemoteRepository repository;

    public SearchSuggestionService(SearchSuggestionRemoteRepository searchSuggestionRemoteRepository) {
        this.repository = searchSuggestionRemoteRepository;
    }

    public Single<List<String>> getAppSuggestionsForQuery(String str) {
        return this.repository.getSuggestionForApp(str).m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.suggestions.a
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((Suggestions) obj).getData();
            }
        });
    }

    public Single<List<String>> getStoreSuggestionsForQuery(String str) {
        return this.repository.getSuggestionForStore(str).m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.suggestions.b
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((Suggestions) obj).getData();
            }
        });
    }
}
