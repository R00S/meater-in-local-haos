package cm.aptoide.p092pt.view.p107rx;

import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.view.recycler.BaseAdapter;
import cm.aptoide.p092pt.view.recycler.EndlessRecyclerOnScrollListener;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.p457l.AbstractC11247a;

/* loaded from: classes.dex */
public class EndlessRecyclerViewLoadMoreOnSubscribe implements C11234e.a<Integer> {
    private final BaseAdapter adapter;
    private final RecyclerView recyclerView;

    public EndlessRecyclerViewLoadMoreOnSubscribe(RecyclerView recyclerView, BaseAdapter baseAdapter) {
        this.recyclerView = recyclerView;
        this.adapter = baseAdapter;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    public void call(final AbstractC11245j<? super Integer> abstractC11245j) {
        AbstractC11247a.verifyMainThread();
        final EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener = new EndlessRecyclerOnScrollListener(this.adapter) { // from class: cm.aptoide.pt.view.rx.EndlessRecyclerViewLoadMoreOnSubscribe.1
            @Override // cm.aptoide.p092pt.view.recycler.EndlessRecyclerOnScrollListener
            protected boolean hasMoreElements() {
                return true;
            }

            @Override // cm.aptoide.p092pt.view.recycler.EndlessRecyclerOnScrollListener
            public void onLoadMore(boolean z, boolean z2) {
                if (abstractC11245j.isUnsubscribed()) {
                    return;
                }
                abstractC11245j.onNext(Integer.valueOf(getAdapter().getItemCount()));
            }
        };
        this.recyclerView.addOnScrollListener(endlessRecyclerOnScrollListener);
        abstractC11245j.add(new AbstractC11247a() { // from class: cm.aptoide.pt.view.rx.EndlessRecyclerViewLoadMoreOnSubscribe.2
            @Override // p456rx.p457l.AbstractC11247a
            protected void onUnsubscribe() {
                EndlessRecyclerViewLoadMoreOnSubscribe.this.recyclerView.removeOnScrollListener(endlessRecyclerOnScrollListener);
            }
        });
    }
}
