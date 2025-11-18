package cm.aptoide.p092pt.timeline.view.follow;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.store.view.AddStoreDialog;
import cm.aptoide.p092pt.timeline.view.displayable.FollowStoreDisplayable;
import cm.aptoide.p092pt.view.recycler.widget.Widget;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.p460m.InterfaceC11253b;

/* loaded from: classes.dex */
public class FollowStoreWidget extends Widget<FollowStoreDisplayable> {
    private View storeLayout;

    public FollowStoreWidget(View view) {
        super(view);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    protected void assignViews(View view) {
        this.storeLayout = view.findViewById(C1146R.id.store_tab_follow_store_layout);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    public void bindView(FollowStoreDisplayable followStoreDisplayable, int i2) {
        final FragmentManager supportFragmentManager = getContext().getSupportFragmentManager();
        this.compositeSubscription.m40667a(C8975a.m28573a(this.storeLayout).m40061G0(new InterfaceC11253b() { // from class: cm.aptoide.pt.timeline.view.follow.a
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                new AddStoreDialog().show(supportFragmentManager, "addStoreDialog");
            }
        }));
    }
}
