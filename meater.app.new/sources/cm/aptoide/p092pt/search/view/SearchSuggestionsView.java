package cm.aptoide.p092pt.search.view;

import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.search.model.Suggestion;
import cm.aptoide.p092pt.search.suggestions.SearchQueryEvent;
import java.util.List;
import p456rx.C11234e;

/* loaded from: classes.dex */
public interface SearchSuggestionsView extends View {
    void collapseSearchBar(boolean z);

    void focusInSearchBar();

    String getCurrentQuery();

    C11234e<SearchQueryEvent> onQueryTextChanged();

    void setSuggestionsList(List<String> list);

    void setTrendingCursor(List<String> list);

    void setTrendingList(List<Suggestion> list);
}
