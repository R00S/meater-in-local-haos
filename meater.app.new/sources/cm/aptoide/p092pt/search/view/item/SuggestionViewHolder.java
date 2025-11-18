package cm.aptoide.p092pt.search.view.item;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.search.model.Suggestion;
import cm.aptoide.p092pt.search.suggestions.SearchQueryEvent;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class SuggestionViewHolder extends RecyclerView.AbstractC0590c0 {
    private ImageView suggestionIcon;
    private TextView suggestionName;
    private C11418b<SearchQueryEvent> suggestionPublishSubject;

    public SuggestionViewHolder(View view, C11418b<SearchQueryEvent> c11418b) {
        super(view);
        this.suggestionPublishSubject = c11418b;
        this.suggestionName = (TextView) view.findViewById(C1146R.id.search_suggestion_app_name);
        this.suggestionIcon = (ImageView) view.findViewById(C1146R.id.search_suggestion_app_icon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setSuggestion$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8771a(Suggestion suggestion, int i2, View view) {
        this.suggestionPublishSubject.onNext(new SearchQueryEvent(suggestion.getName(), i2, true, true));
    }

    public void setSuggestion(final Suggestion suggestion, final int i2) {
        this.suggestionName.setText(suggestion.getName().trim());
        if (suggestion.getIcon() != null) {
            this.suggestionIcon.setImageResource(C1146R.drawable.ic_suggestions_trending);
        } else {
            this.suggestionIcon.setImageResource(C1146R.drawable.ic_stat_aptoide_notification);
        }
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.search.view.item.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11123f.m8771a(suggestion, i2, view);
            }
        });
    }
}
