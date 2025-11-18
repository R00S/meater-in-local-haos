package cm.aptoide.p092pt.store.view;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0468d;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.view.recycler.widget.Widget;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.p460m.InterfaceC11253b;

/* loaded from: classes.dex */
public class GridStoreWidget extends Widget<GridStoreDisplayable> {
    private ImageView storeAvatar;
    private View storeLayout;
    private TextView storeName;

    public GridStoreWidget(View view) {
        super(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bindView$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8808a(GridStoreDisplayable gridStoreDisplayable, Store store, Void r6) {
        String origin = gridStoreDisplayable.getOrigin();
        if (!origin.isEmpty()) {
            gridStoreDisplayable.getStoreAnalytics().sendStoreTabInteractEvent(origin, true);
            gridStoreDisplayable.getStoreAnalytics().sendStoreOpenEvent(origin, gridStoreDisplayable.getPojo().getName(), true);
        }
        getFragmentNavigator().navigateTo(AptoideApplication.getFragmentProvider().newStoreFragment(gridStoreDisplayable.getPojo().getName(), store.getAppearance().getTheme()), true);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    protected void assignViews(View view) {
        this.storeAvatar = (ImageView) view.findViewById(C1146R.id.store_avatar_row);
        this.storeName = (TextView) view.findViewById(C1146R.id.store_name_row);
        this.storeLayout = view.findViewById(C1146R.id.store_main_layout_row);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    public void bindView(final GridStoreDisplayable gridStoreDisplayable, int i2) {
        final Store pojo = gridStoreDisplayable.getPojo();
        this.storeName.setText(pojo.getName());
        this.compositeSubscription.m40667a(C8975a.m28573a(this.storeLayout).m40061G0(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.x0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11490f.m8808a(gridStoreDisplayable, pojo, (Void) obj);
            }
        }));
        ActivityC0468d context = getContext();
        if (pojo.getId() == -1 || TextUtils.isEmpty(pojo.getAvatar())) {
            ImageLoader.with(context).loadUsingCircleTransform(C1146R.drawable.ic_avatar_apps, this.storeAvatar);
        } else {
            ImageLoader.with(context).loadUsingCircleTransform(pojo.getAvatar(), this.storeAvatar);
        }
    }
}
