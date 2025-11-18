package cm.aptoide.p092pt.app.view.displayable;

import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.App;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import cm.aptoide.p092pt.view.recycler.displayable.DisplayablePojo;

/* loaded from: classes.dex */
public class OtherVersionDisplayable extends DisplayablePojo<App> {
    private ThemeManager themeManager;

    public OtherVersionDisplayable() {
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    protected Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    public ThemeManager getThemeManager() {
        return this.themeManager;
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    public int getViewLayout() {
        return C1146R.layout.other_version_row;
    }

    public OtherVersionDisplayable(App app, ThemeManager themeManager) {
        super(app);
        this.themeManager = themeManager;
    }
}
