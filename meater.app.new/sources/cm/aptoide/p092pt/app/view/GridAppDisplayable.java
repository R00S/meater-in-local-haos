package cm.aptoide.p092pt.app.view;

import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Type;
import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.App;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.StoreContext;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import cm.aptoide.p092pt.view.recycler.displayable.DisplayablePojo;

/* loaded from: classes.dex */
public class GridAppDisplayable extends DisplayablePojo<App> {
    private NavigationTracker navigationTracker;
    private StoreContext storeContext;
    private String tag;

    public GridAppDisplayable() {
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    protected Displayable.Configs getConfig() {
        Type type = Type.APPS_GROUP;
        return new Displayable.Configs(type.getDefaultPerLineCount(), type.isFixedPerLineCount());
    }

    public NavigationTracker getNavigationTracker() {
        return this.navigationTracker;
    }

    public StoreContext getStoreContext() {
        return this.storeContext;
    }

    public String getTag() {
        return this.tag;
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    public int getViewLayout() {
        return C1146R.layout.displayable_grid_app;
    }

    public GridAppDisplayable(App app, String str, NavigationTracker navigationTracker, StoreContext storeContext) {
        super(app);
        this.tag = str;
        this.navigationTracker = navigationTracker;
        this.storeContext = storeContext;
    }
}
