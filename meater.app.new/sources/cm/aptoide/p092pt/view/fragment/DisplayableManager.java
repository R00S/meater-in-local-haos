package cm.aptoide.p092pt.view.fragment;

import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import java.util.List;

/* loaded from: classes.dex */
public interface DisplayableManager {
    DisplayableManager addDisplayable(int i2, Displayable displayable, boolean z);

    DisplayableManager addDisplayable(Displayable displayable, boolean z);

    @Deprecated
    DisplayableManager addDisplayables(int i2, List<? extends Displayable> list, boolean z);

    DisplayableManager addDisplayables(List<? extends Displayable> list, boolean z);

    DisplayableManager clearDisplayables();

    int getDisplayablesSize();

    boolean hasDisplayables();

    void removeDisplayables(int i2, int i3);
}
