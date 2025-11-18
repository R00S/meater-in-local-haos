package cm.aptoide.p092pt.editorialList;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.bonus.BonusAppcModel;
import cm.aptoide.p092pt.editorial.CaptionBackgroundPainter;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;
import cm.aptoide.p092pt.home.bundles.editorial.EditorialBundleViewHolder;
import cm.aptoide.p092pt.home.bundles.editorial.EditorialViewHolder;
import cm.aptoide.p092pt.themes.ThemeManager;
import java.util.List;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
class EditorialListAdapter extends RecyclerView.AbstractC0594g<EditorialViewHolder> {
    private static final int EDITORIAL_CARD = 2131493005;
    private static final int LOADING = 2131493141;
    private BonusAppcModel bonusAppcModel;
    private final CaptionBackgroundPainter captionBackgroundPainter;
    private List<CurationCard> editorialListItems;
    private final ProgressCard progressBundle;
    private final ThemeManager themeAttributeProvider;
    private final C11418b<HomeEvent> uiEventsListener;

    public EditorialListAdapter(List<CurationCard> list, ProgressCard progressCard, C11418b<HomeEvent> c11418b, CaptionBackgroundPainter captionBackgroundPainter, ThemeManager themeManager) {
        this.editorialListItems = list;
        this.progressBundle = progressCard;
        this.uiEventsListener = c11418b;
        this.captionBackgroundPainter = captionBackgroundPainter;
        this.themeAttributeProvider = themeManager;
    }

    public void add(List<CurationCard> list, BonusAppcModel bonusAppcModel) {
        int size = this.editorialListItems.size();
        this.editorialListItems.addAll(list);
        this.bonusAppcModel = bonusAppcModel;
        notifyItemRangeInserted(size, list.size());
    }

    public void addLoadMore() {
        if (getLoadingPosition() < 0) {
            this.editorialListItems.add(this.progressBundle);
            notifyItemInserted(this.editorialListItems.size() - 1);
        }
    }

    public CurationCard getCard(int i2) {
        return this.editorialListItems.get(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemCount() {
        return this.editorialListItems.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemViewType(int i2) {
        return this.editorialListItems.get(i2) instanceof ProgressCard ? C1146R.layout.progress_item : C1146R.layout.editorial_action_item;
    }

    public synchronized int getLoadingPosition() {
        for (int size = this.editorialListItems.size() - 1; size >= 0; size--) {
            if (this.editorialListItems.get(size) instanceof ProgressCard) {
                return size;
            }
        }
        return -1;
    }

    public void removeLoadMore() {
        int loadingPosition = getLoadingPosition();
        if (loadingPosition >= 0) {
            this.editorialListItems.remove(loadingPosition);
            notifyItemRemoved(loadingPosition);
        }
    }

    public void update(List<CurationCard> list) {
        this.editorialListItems = list;
        notifyDataSetChanged();
    }

    public void updateEditorialCard(CurationCard curationCard) {
        for (int i2 = 0; i2 < this.editorialListItems.size(); i2++) {
            if (curationCard != null && this.editorialListItems.get(i2).getId().equals(curationCard.getId())) {
                this.editorialListItems.set(i2, curationCard);
                notifyItemChanged(i2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public void onBindViewHolder(EditorialViewHolder editorialViewHolder, int i2) {
        if (editorialViewHolder instanceof EditorialBundleViewHolder) {
            ((EditorialBundleViewHolder) editorialViewHolder).setEditorialCard(this.editorialListItems.get(i2), i2, this.bonusAppcModel);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public EditorialViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return i2 == C1146R.layout.editorial_action_item ? new EditorialBundleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1146R.layout.editorial_action_item, viewGroup, false), this.uiEventsListener, this.captionBackgroundPainter, this.themeAttributeProvider) : new LoadingViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1146R.layout.progress_item, viewGroup, false), this.uiEventsListener, this.captionBackgroundPainter);
    }
}
