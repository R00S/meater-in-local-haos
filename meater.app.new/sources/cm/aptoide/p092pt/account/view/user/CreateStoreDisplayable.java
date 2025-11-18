package cm.aptoide.p092pt.account.view.user;

import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.dataprovider.model.p096v7.TimelineStats;
import cm.aptoide.p092pt.store.StoreAnalytics;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;

/* loaded from: classes.dex */
public class CreateStoreDisplayable extends Displayable {
    private StoreAnalytics storeAnalytics;
    private int textAccentColor;
    private TimelineStats timelineStats;

    public CreateStoreDisplayable() {
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    protected Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    public long getFollowers() {
        return this.timelineStats.getData().getFollowers();
    }

    public long getFollowings() {
        return this.timelineStats.getData().getFollowing();
    }

    public StoreAnalytics getStoreAnalytics() {
        return this.storeAnalytics;
    }

    public int getTextAccentColor() {
        return this.textAccentColor;
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    public int getViewLayout() {
        return C1146R.layout.create_store_displayable_layout;
    }

    public CreateStoreDisplayable(StoreAnalytics storeAnalytics, TimelineStats timelineStats, int i2) {
        this.storeAnalytics = storeAnalytics;
        this.timelineStats = timelineStats;
        this.textAccentColor = i2;
    }
}
