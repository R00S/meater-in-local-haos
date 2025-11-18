package cm.aptoide.p092pt.store.view;

import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetStoreWidgets;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.StoreContext;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;

/* loaded from: classes.dex */
public class StoreGridHeaderDisplayable extends Displayable {
    private final String marketName;
    private final Model model;
    private NavigationTracker navigationTracker;
    private final StoreTabNavigator storeTabNavigator;
    private final int textColor;
    private final GetStoreWidgets.WSWidget wsWidget;

    public static class Model {
        private boolean moreVisible = true;
        private final StoreContext storeContext;
        private final String storeTheme;
        private final String tag;

        Model(String str, String str2, StoreContext storeContext) {
            this.storeTheme = str;
            this.tag = str2;
            this.storeContext = storeContext;
        }

        public StoreContext getStoreContext() {
            return this.storeContext;
        }

        public String getStoreTheme() {
            return this.storeTheme;
        }

        public String getTag() {
            return this.tag;
        }

        public boolean isMoreVisible() {
            return this.moreVisible;
        }

        public void setMoreVisible(boolean z) {
            this.moreVisible = z;
        }
    }

    public StoreGridHeaderDisplayable() {
        this(null, null, null, null, null, null, null, 0);
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    protected Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    public String getMarketName() {
        return this.marketName;
    }

    public Model getModel() {
        return this.model;
    }

    public NavigationTracker getNavigationTracker() {
        return this.navigationTracker;
    }

    public StoreTabNavigator getStoreTabNavigator() {
        return this.storeTabNavigator;
    }

    public int getTextColor() {
        return this.textColor;
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    public int getViewLayout() {
        return C1146R.layout.displayable_grid_header;
    }

    public GetStoreWidgets.WSWidget getWsWidget() {
        return this.wsWidget;
    }

    public StoreGridHeaderDisplayable(String str, GetStoreWidgets.WSWidget wSWidget, String str2, String str3, StoreContext storeContext, StoreTabNavigator storeTabNavigator, NavigationTracker navigationTracker, int i2) {
        this.model = new Model(str2, str3, storeContext);
        this.wsWidget = wSWidget;
        this.storeTabNavigator = storeTabNavigator;
        this.navigationTracker = navigationTracker;
        this.marketName = str;
        this.textColor = i2;
    }

    public StoreGridHeaderDisplayable(String str, GetStoreWidgets.WSWidget wSWidget, StoreTabNavigator storeTabNavigator, NavigationTracker navigationTracker, int i2) {
        this(str, wSWidget, null, null, null, storeTabNavigator, navigationTracker, i2);
    }
}
