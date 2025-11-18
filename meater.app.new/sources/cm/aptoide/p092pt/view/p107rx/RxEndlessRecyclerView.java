package cm.aptoide.p092pt.view.p107rx;

import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.view.recycler.BaseAdapter;
import p456rx.C11234e;

/* loaded from: classes.dex */
public final class RxEndlessRecyclerView {
    private RxEndlessRecyclerView() {
        new AssertionError("No instances!");
    }

    public static C11234e<Integer> loadMore(RecyclerView recyclerView, BaseAdapter baseAdapter) {
        return C11234e.m40048l(new EndlessRecyclerViewLoadMoreOnSubscribe(recyclerView, baseAdapter));
    }
}
