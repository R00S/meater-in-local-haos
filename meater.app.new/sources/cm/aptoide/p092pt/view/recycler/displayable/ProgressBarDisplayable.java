package cm.aptoide.p092pt.view.recycler.displayable;

import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;

/* loaded from: classes.dex */
public class ProgressBarDisplayable extends Displayable {
    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    protected Displayable.Configs getConfig() {
        return new Displayable.Configs(1, false);
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    public int getViewLayout() {
        return C1146R.layout.row_progress_bar;
    }
}
