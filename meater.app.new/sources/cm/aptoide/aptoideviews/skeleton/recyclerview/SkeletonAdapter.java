package cm.aptoide.aptoideviews.skeleton.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: SkeletonAdapter.kt */
@Metadata(m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m32267d2 = {"Lcm/aptoide/aptoideviews/skeleton/recyclerview/SkeletonAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcm/aptoide/aptoideviews/skeleton/recyclerview/SkeletonViewHolder;", "listItemLayoutResId", HttpUrl.FRAGMENT_ENCODE_SET, "itemCount", "(II)V", "getItemCount", "onBindViewHolder", HttpUrl.FRAGMENT_ENCODE_SET, "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class SkeletonAdapter extends RecyclerView.AbstractC0594g<SkeletonViewHolder> {
    private final int itemCount;
    private final int listItemLayoutResId;

    public SkeletonAdapter(int i2, int i3) {
        this.listItemLayoutResId = i2;
        this.itemCount = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemCount() {
        return this.itemCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public void onBindViewHolder(SkeletonViewHolder holder, int position) {
        C9801m.m32346f(holder, "holder");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public SkeletonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        C9801m.m32346f(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(this.listItemLayoutResId, parent, false);
        C9801m.m32345e(viewInflate, "from(parent.context).inf…youtResId, parent, false)");
        return new SkeletonViewHolder(viewInflate);
    }
}
