package cm.aptoide.p092pt.view.recycler.displayable;

import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.ads.MinimalAd;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;

/* loaded from: classes.dex */
public class GridAdDisplayable extends DisplayablePojo<MinimalAd> {
    private NavigationTracker navigationTracker;
    private String tag;

    public GridAdDisplayable() {
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    protected Displayable.Configs getConfig() {
        return new Displayable.Configs(3, false);
    }

    public NavigationTracker getNavigationTracker() {
        return this.navigationTracker;
    }

    public String getTag() {
        return this.tag;
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    public int getViewLayout() {
        return C1146R.layout.displayable_grid_ad;
    }

    public GridAdDisplayable(MinimalAd minimalAd, String str, NavigationTracker navigationTracker) {
        super(minimalAd);
        this.tag = str;
        this.navigationTracker = navigationTracker;
    }
}
