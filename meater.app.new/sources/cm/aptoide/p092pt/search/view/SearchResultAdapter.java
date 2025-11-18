package cm.aptoide.p092pt.search.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C0625f;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.app.view.screenshots.ScreenShotClickEvent;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.download.view.DownloadClick;
import cm.aptoide.p092pt.search.SearchItemDiffCallback;
import cm.aptoide.p092pt.search.model.SearchAppResult;
import cm.aptoide.p092pt.search.model.SearchAppResultWrapper;
import cm.aptoide.p092pt.search.model.SearchItem;
import cm.aptoide.p092pt.search.model.SearchLoadingItem;
import cm.aptoide.p092pt.search.view.DiffUtilAdapter;
import cm.aptoide.p092pt.search.view.item.SearchLoadingViewHolder;
import cm.aptoide.p092pt.search.view.item.SearchResultItemView;
import cm.aptoide.p092pt.search.view.item.SearchResultViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class SearchResultAdapter extends DiffUtilAdapter<SearchItem, SearchResultItemView> {
    private CrashReport crashReport;
    private final C11418b<DownloadClick> downloadClickPublishSubject;
    private final C11418b<SearchAppResultWrapper> onItemViewClick;
    private String query;
    private final C11418b<ScreenShotClickEvent> screenShotClick;
    private List<SearchItem> searchResults;

    /* renamed from: cm.aptoide.pt.search.view.SearchResultAdapter$1 */
    static /* synthetic */ class C41941 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$search$model$SearchItem$Type;

        static {
            int[] iArr = new int[SearchItem.Type.values().length];
            $SwitchMap$cm$aptoide$pt$search$model$SearchItem$Type = iArr;
            try {
                iArr[SearchItem.Type.APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$search$model$SearchItem$Type[SearchItem.Type.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public SearchResultAdapter(C11418b<SearchAppResultWrapper> c11418b, C11418b<DownloadClick> c11418b2, C11418b<ScreenShotClickEvent> c11418b3, List<SearchItem> list, CrashReport crashReport) {
        this.onItemViewClick = c11418b;
        this.searchResults = list;
        this.crashReport = crashReport;
        this.downloadClickPublishSubject = c11418b2;
        this.screenShotClick = c11418b3;
    }

    private boolean hasLoadingItem() {
        Iterator<SearchItem> it = this.searchResults.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof SearchLoadingItem) {
                return true;
            }
        }
        return false;
    }

    public void addResultForSearch(String str, List<SearchAppResult> list, boolean z) {
        this.query = str;
        ArrayList arrayList = new ArrayList(list);
        applyDiffUtil(new DiffUtilAdapter.DiffRequest(arrayList, new SearchItemDiffCallback(new ArrayList(this.searchResults), arrayList)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cm.aptoide.p092pt.search.view.DiffUtilAdapter
    public void dispatchUpdates(List<? extends SearchItem> list, C0625f.c cVar) {
        this.searchResults = list;
        cVar.m4482e(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemCount() {
        return this.searchResults.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemViewType(int i2) {
        return C41941.$SwitchMap$cm$aptoide$pt$search$model$SearchItem$Type[this.searchResults.get(i2).getType().ordinal()] != 1 ? C1146R.layout.search_ad_loading_list_item : C1146R.layout.search_app_row;
    }

    public void setMoreLoading() {
        if (hasLoadingItem()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.searchResults);
        arrayList.add(new SearchLoadingItem());
        applyDiffUtil(new DiffUtilAdapter.DiffRequest(arrayList, new SearchItemDiffCallback(new ArrayList(this.searchResults), arrayList)));
    }

    public void setResultForSearch(RecyclerView recyclerView, String str, List<SearchAppResult> list, boolean z) {
        this.query = str;
        this.searchResults = new ArrayList(list);
        recyclerView.getRecycledViewPool().mo4249b();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC0590c0 abstractC0590c0, int i2, List list) {
        onBindViewHolder((SearchResultItemView) abstractC0590c0, i2, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public SearchResultItemView onCreateViewHolder(ViewGroup viewGroup, int i2) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false);
        return i2 != C1146R.layout.search_app_row ? new SearchLoadingViewHolder(viewInflate) : new SearchResultViewHolder(viewInflate, this.onItemViewClick, this.downloadClickPublishSubject, this.screenShotClick, this.query);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public void onBindViewHolder(SearchResultItemView searchResultItemView, int i2) {
        try {
            searchResultItemView.setup(this.searchResults.get(i2));
        } catch (ClassCastException e2) {
            this.crashReport.log(e2);
        }
    }

    public void onBindViewHolder(SearchResultItemView searchResultItemView, int i2, List<Object> list) {
        if ((searchResultItemView instanceof SearchResultViewHolder) && !list.isEmpty()) {
            ((SearchResultViewHolder) searchResultItemView).setDownloadStatus((SearchAppResult) list.get(0));
        } else {
            super.onBindViewHolder((SearchResultAdapter) searchResultItemView, i2, list);
        }
    }
}
