package cm.aptoide.p092pt.updates.view.excluded;

import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.database.room.RoomUpdate;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import cm.aptoide.p092pt.view.recycler.displayable.DisplayablePojo;

/* loaded from: classes.dex */
public class ExcludedUpdateDisplayable extends DisplayablePojo<RoomUpdate> {
    private boolean selected;

    public ExcludedUpdateDisplayable() {
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    protected Displayable.Configs getConfig() {
        return new Displayable.Configs(1, false);
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    public int getViewLayout() {
        return C1146R.layout.row_excluded_update;
    }

    public boolean isSelected() {
        return this.selected;
    }

    public void setSelected(boolean z) {
        this.selected = z;
    }

    public ExcludedUpdateDisplayable(RoomUpdate roomUpdate) {
        super(roomUpdate);
    }
}
