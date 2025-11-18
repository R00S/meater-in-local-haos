package cm.aptoide.p092pt.reviews;

import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.dataprovider.model.p096v7.FullReview;
import cm.aptoide.p092pt.store.StoreAnalytics;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import cm.aptoide.p092pt.view.recycler.displayable.DisplayablePojo;

/* loaded from: classes.dex */
public class RowReviewDisplayable extends DisplayablePojo<FullReview> {
    private StoreAnalytics storeAnalytics;

    public RowReviewDisplayable() {
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    protected Displayable.Configs getConfig() {
        return new Displayable.Configs(1, false);
    }

    public StoreAnalytics getStoreAnalytics() {
        return this.storeAnalytics;
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    public int getViewLayout() {
        return C1146R.layout.displayable_row_review;
    }

    public RowReviewDisplayable(FullReview fullReview, StoreAnalytics storeAnalytics) {
        super(fullReview);
        this.storeAnalytics = storeAnalytics;
    }
}
