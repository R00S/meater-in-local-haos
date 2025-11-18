package cm.aptoide.p092pt.view.recycler.displayable;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.WindowManager;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.view.LifecycleSchim;
import cm.aptoide.p092pt.view.recycler.widget.WidgetFactory;
import p456rx.p474t.C11426b;

/* loaded from: classes.dex */
public abstract class Displayable implements LifecycleSchim {
    private int defaultPerLineCount;
    private boolean fixedPerLineCount;
    private boolean isVisible = false;
    private C11426b subscriptions = new C11426b();

    public class Configs {
        private final int defaultPerLineCount;
        private final boolean fixedPerLineCount;

        public Configs(int i2, boolean z) {
            this.defaultPerLineCount = i2;
            this.fixedPerLineCount = z;
        }

        public int getDefaultPerLineCount() {
            return this.defaultPerLineCount;
        }

        public boolean isFixedPerLineCount() {
            return this.fixedPerLineCount;
        }
    }

    public Displayable() {
        Configs config = getConfig();
        this.fixedPerLineCount = config.isFixedPerLineCount();
        this.defaultPerLineCount = config.getDefaultPerLineCount();
    }

    protected abstract Configs getConfig();

    public int getDefaultPerLineCount() {
        return this.defaultPerLineCount;
    }

    public int getPerLineCount(WindowManager windowManager, Resources resources) {
        int defaultPerLineCount = isFixedPerLineCount() ? getDefaultPerLineCount() : (int) ((AptoideUtils.ScreenU.getScreenWidthInDip(windowManager, resources) / 360.0f) * getDefaultPerLineCount());
        if (defaultPerLineCount != 0) {
            return defaultPerLineCount;
        }
        return 1;
    }

    public int getSpanSize(WindowManager windowManager, Resources resources) {
        return WidgetFactory.getColumnSize(resources, windowManager) / getPerLineCount(windowManager, resources);
    }

    public C11426b getSubscriptions() {
        return this.subscriptions;
    }

    public abstract int getViewLayout();

    public boolean isFixedPerLineCount() {
        return this.fixedPerLineCount;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    @Override // cm.aptoide.p092pt.view.LifecycleSchim
    public void onDestroyView() {
    }

    @Override // cm.aptoide.p092pt.view.LifecycleSchim
    public void onPause() {
        this.isVisible = false;
    }

    @Override // cm.aptoide.p092pt.view.LifecycleSchim
    public void onResume() {
        this.isVisible = true;
    }

    @Override // cm.aptoide.p092pt.view.LifecycleSchim
    public void onSaveInstanceState(Bundle bundle) {
    }

    @Override // cm.aptoide.p092pt.view.LifecycleSchim
    public void onViewCreated() {
    }

    @Override // cm.aptoide.p092pt.view.LifecycleSchim
    public void onViewStateRestored(Bundle bundle) {
    }

    public Displayable setFullRow() {
        this.defaultPerLineCount = 1;
        this.fixedPerLineCount = true;
        return this;
    }

    public void setVisible(boolean z) {
        this.isVisible = z;
    }
}
