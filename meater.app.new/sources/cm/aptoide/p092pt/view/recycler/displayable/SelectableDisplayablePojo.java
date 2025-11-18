package cm.aptoide.p092pt.view.recycler.displayable;

/* loaded from: classes.dex */
public abstract class SelectableDisplayablePojo<T> extends DisplayablePojo<T> {
    private boolean selected;

    public SelectableDisplayablePojo() {
    }

    public boolean isSelected() {
        return this.selected;
    }

    public void setSelected(boolean z) {
        this.selected = z;
    }

    public SelectableDisplayablePojo(T t) {
        super(t);
    }
}
