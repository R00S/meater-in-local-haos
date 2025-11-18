package cm.aptoide.p092pt.timeline.view.displayable;

import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Type;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;

/* loaded from: classes.dex */
public class FollowStoreDisplayable extends Displayable {
    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    protected Displayable.Configs getConfig() {
        Type type = Type.FOLLOW_STORE;
        return new Displayable.Configs(type.getDefaultPerLineCount(), type.isFixedPerLineCount());
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    public int getViewLayout() {
        return C1146R.layout.displayable_grid_follow_store;
    }
}
