package cm.aptoide.p092pt.view.recycler.displayable;

import android.content.res.Resources;
import android.view.WindowManager;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;

/* loaded from: classes.dex */
public class EmptyDisplayable extends Displayable {
    private int spanSize;

    public EmptyDisplayable() {
        this.spanSize = 1;
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    protected Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    public int getDefaultPerLineCount() {
        return 1;
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    public int getSpanSize(WindowManager windowManager, Resources resources) {
        return this.spanSize;
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    public int getViewLayout() {
        return C1146R.layout.displayable_empty;
    }

    public EmptyDisplayable(int i2) {
        this.spanSize = 1;
        this.spanSize = i2;
    }
}
