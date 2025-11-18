package cm.aptoide.p092pt.view.wizard;

import cm.aptoide.p092pt.presenter.View;
import p456rx.C11231b;
import p456rx.C11234e;

/* loaded from: classes.dex */
public interface WizardView extends View {
    C11231b createWizardAdapter(boolean z);

    int getCount();

    void handleColorTransitions(int i2, float f2, int i3);

    void handleSelectedPage(int i2);

    void skipWizard();

    C11234e<Void> skipWizardClick();
}
