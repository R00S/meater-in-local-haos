package cm.aptoide.p092pt.store.view;

import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Type;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import cm.aptoide.p092pt.store.StoreAnalytics;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import cm.aptoide.p092pt.view.recycler.displayable.DisplayablePojo;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class GridStoreDisplayable extends DisplayablePojo<Store> {
    private String origin;
    private StoreAnalytics storeAnalytics;

    public GridStoreDisplayable(Store store, String str, StoreAnalytics storeAnalytics) {
        super(store);
        this.origin = HttpUrl.FRAGMENT_ENCODE_SET;
        this.origin = str;
        this.storeAnalytics = storeAnalytics;
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    protected Displayable.Configs getConfig() {
        Type type = Type.STORES_GROUP;
        return new Displayable.Configs(type.getDefaultPerLineCount(), type.isFixedPerLineCount());
    }

    public String getOrigin() {
        return this.origin;
    }

    public StoreAnalytics getStoreAnalytics() {
        return this.storeAnalytics;
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    public int getViewLayout() {
        return C1146R.layout.displayable_grid_store;
    }

    public GridStoreDisplayable(Store store) {
        super(store);
        this.origin = HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public GridStoreDisplayable() {
        this.origin = HttpUrl.FRAGMENT_ENCODE_SET;
    }
}
