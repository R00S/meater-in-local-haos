package cm.aptoide.p092pt.search;

import androidx.recyclerview.widget.C0625f;
import cm.aptoide.p092pt.search.model.SearchItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: SearchItemDiffCallback.kt */
@Metadata(m32266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m32267d2 = {"Lcm/aptoide/pt/search/SearchItemDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldSearchResultList", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/pt/search/model/SearchItem;", "newSearchResultList", "(Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", HttpUrl.FRAGMENT_ENCODE_SET, "oldItemPosition", HttpUrl.FRAGMENT_ENCODE_SET, "newItemPosition", "areItemsTheSame", "getChangePayload", HttpUrl.FRAGMENT_ENCODE_SET, "getNewListSize", "getOldListSize", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class SearchItemDiffCallback extends C0625f.b {
    private final List<SearchItem> newSearchResultList;
    private final List<SearchItem> oldSearchResultList;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchItemDiffCallback(List<? extends SearchItem> list, List<? extends SearchItem> list2) {
        this.oldSearchResultList = list;
        this.newSearchResultList = list2;
    }

    @Override // androidx.recyclerview.widget.C0625f.b
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        List<SearchItem> list = this.oldSearchResultList;
        SearchItem searchItem = list != null ? list.get(oldItemPosition) : null;
        List<SearchItem> list2 = this.newSearchResultList;
        return C9801m.m32341a(searchItem, list2 != null ? list2.get(newItemPosition) : null);
    }

    @Override // androidx.recyclerview.widget.C0625f.b
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        SearchItem searchItem;
        SearchItem searchItem2;
        List<SearchItem> list = this.oldSearchResultList;
        Long lValueOf = null;
        Long lValueOf2 = (list == null || (searchItem2 = list.get(oldItemPosition)) == null) ? null : Long.valueOf(searchItem2.getId());
        List<SearchItem> list2 = this.newSearchResultList;
        if (list2 != null && (searchItem = list2.get(newItemPosition)) != null) {
            lValueOf = Long.valueOf(searchItem.getId());
        }
        return C9801m.m32341a(lValueOf2, lValueOf);
    }

    @Override // androidx.recyclerview.widget.C0625f.b
    public Object getChangePayload(int oldItemPosition, int newItemPosition) {
        List<SearchItem> list = this.newSearchResultList;
        if (list != null) {
            return list.get(newItemPosition);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.C0625f.b
    public int getNewListSize() {
        List<SearchItem> list = this.newSearchResultList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.C0625f.b
    public int getOldListSize() {
        List<SearchItem> list = this.oldSearchResultList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
