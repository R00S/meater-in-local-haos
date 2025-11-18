package cm.aptoide.p092pt.store.view.featured;

import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.App;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import cm.aptoide.p092pt.view.recycler.displayable.DisplayablePojo;

/* loaded from: classes.dex */
public class AppBrickDisplayable extends DisplayablePojo<App> {
    private NavigationTracker navigationTracker;
    private String tag;

    public AppBrickDisplayable() {
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    protected Displayable.Configs getConfig() {
        return new Displayable.Configs(2, true);
    }

    public NavigationTracker getNavigationTracker() {
        return this.navigationTracker;
    }

    public String getTag() {
        return this.tag;
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    public int getViewLayout() {
        return C1146R.layout.brick_app_item;
    }

    public AppBrickDisplayable(App app, String str, NavigationTracker navigationTracker) {
        super(app);
        this.tag = str;
        this.navigationTracker = navigationTracker;
    }
}
