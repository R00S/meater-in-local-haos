package cm.aptoide.p092pt.view.recycler.displayable;

import android.content.res.Resources;
import android.view.WindowManager;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import cm.aptoide.p092pt.view.recycler.widget.WidgetFactory;
import java.util.List;

/* loaded from: classes.dex */
public class DisplayableGroup extends Displayable {
    private final List<Displayable> children;
    private final Resources resources;
    private final WindowManager windowManager;

    public DisplayableGroup(List<Displayable> list, WindowManager windowManager, Resources resources) {
        this(list, true, windowManager, resources);
    }

    private void computeLeftSpaces() {
        int columnSize = WidgetFactory.getColumnSize(this.resources, this.windowManager);
        int spanSize = 0;
        for (Displayable displayable : this.children) {
            spanSize = displayable.getSpanSize(this.windowManager, this.resources) + spanSize > columnSize ? displayable.getSpanSize(this.windowManager, this.resources) : spanSize + displayable.getSpanSize(this.windowManager, this.resources);
        }
        if (spanSize < columnSize) {
            this.children.add(new EmptyDisplayable(columnSize - spanSize));
        }
    }

    public List<Displayable> getChildren() {
        return this.children;
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    protected Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    public int getDefaultPerLineCount() {
        throw new IllegalStateException("getDefaultPerLineCount() on DisplayableGroup should not be called!");
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    public int getViewLayout() {
        throw new IllegalStateException("getViewLayout() on DisplayableGroup should not be called!");
    }

    DisplayableGroup(List<Displayable> list, boolean z, WindowManager windowManager, Resources resources) {
        this.children = list;
        this.windowManager = windowManager;
        this.resources = resources;
        if (z) {
            computeLeftSpaces();
        }
    }
}
