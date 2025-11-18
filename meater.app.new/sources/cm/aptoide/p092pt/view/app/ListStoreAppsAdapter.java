package cm.aptoide.p092pt.view.app;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1146R;
import java.util.List;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
class ListStoreAppsAdapter extends RecyclerView.AbstractC0594g<ListStoreAppViewHolder> {
    private final C11418b<Application> appClicks;
    private List<Application> list;

    public ListStoreAppsAdapter(List<Application> list, C11418b<Application> c11418b) {
        this.list = list;
        this.appClicks = c11418b;
    }

    public void addApps(List<Application> list) {
        int loadingPosition = getLoadingPosition();
        if (loadingPosition >= 0) {
            this.list.addAll(loadingPosition, list);
        } else {
            loadingPosition = this.list.size();
            this.list.addAll(list);
        }
        notifyItemRangeInserted(loadingPosition, list.size());
    }

    public Application getItem(int i2) {
        return this.list.get(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemCount() {
        return this.list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemViewType(int i2) {
        return this.list.get(i2) instanceof AppLoading ? C1146R.layout.search_ad_loading_list_item : C1146R.layout.displayable_grid_app;
    }

    public int getLoadingPosition() {
        for (int size = this.list.size() - 1; size >= 0; size--) {
            if (this.list.get(size) instanceof AppLoading) {
                return size;
            }
        }
        return -1;
    }

    public void hideLoading() {
        int loadingPosition = getLoadingPosition();
        if (loadingPosition >= 0) {
            this.list.remove(loadingPosition);
            notifyItemRemoved(loadingPosition);
        }
    }

    public void setApps(List<Application> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    public void showLoading() {
        if (getLoadingPosition() < 0) {
            this.list.add(new AppLoading());
            notifyItemInserted(this.list.size() - 1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public void onBindViewHolder(ListStoreAppViewHolder listStoreAppViewHolder, int i2) {
        listStoreAppViewHolder.setApp(this.list.get(i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public ListStoreAppViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return i2 == C1146R.layout.search_ad_loading_list_item ? new AppLoadingViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1146R.layout.search_ad_loading_list_item, viewGroup, false)) : new ApplicationViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1146R.layout.displayable_grid_app, viewGroup, false), this.appClicks);
    }
}
