package cm.aptoide.p092pt.view.recycler.displayable;

import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;

/* loaded from: classes.dex */
public class FooterRowDisplayable extends DisplayablePojo<String> {
    public FooterRowDisplayable() {
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    protected Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    public int getViewLayout() {
        return C1146R.layout.displayable_grid_footer_text;
    }

    public FooterRowDisplayable(String str) {
        super(str);
    }
}
