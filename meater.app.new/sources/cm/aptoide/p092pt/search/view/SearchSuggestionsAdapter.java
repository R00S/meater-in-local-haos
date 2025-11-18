package cm.aptoide.p092pt.search.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.search.model.Suggestion;
import cm.aptoide.p092pt.search.suggestions.SearchQueryEvent;
import cm.aptoide.p092pt.search.view.item.SuggestionViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class SearchSuggestionsAdapter extends RecyclerView.AbstractC0594g<SuggestionViewHolder> {
    private List<Suggestion> suggestions;
    private C11418b<SearchQueryEvent> suggestionsPublishSubject;

    public SearchSuggestionsAdapter(List<Suggestion> list, C11418b<SearchQueryEvent> c11418b) {
        this.suggestions = list;
        this.suggestionsPublishSubject = c11418b;
    }

    public void addSuggestions(List<Suggestion> list) {
        this.suggestions = list;
        notifyDataSetChanged();
    }

    public void addSuggestionsFromString(List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Suggestion(it.next(), null));
        }
        this.suggestions = arrayList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemCount() {
        return this.suggestions.size();
    }

    public List<Suggestion> getSuggestions() {
        return this.suggestions;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public void onBindViewHolder(SuggestionViewHolder suggestionViewHolder, int i2) {
        suggestionViewHolder.setSuggestion(this.suggestions.get(i2), i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public SuggestionViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return new SuggestionViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1146R.layout.search_suggestion_item, viewGroup, false), this.suggestionsPublishSubject);
    }
}
