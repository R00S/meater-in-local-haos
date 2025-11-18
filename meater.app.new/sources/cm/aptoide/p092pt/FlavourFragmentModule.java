package cm.aptoide.p092pt;

import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.view.FragmentScope;
import cm.aptoide.p092pt.view.wizard.WizardFragmentProvider;

/* loaded from: classes.dex */
public class FlavourFragmentModule {
    @FragmentScope
    WizardFragmentProvider providesWizardFragmentProvider(ThemeManager themeManager) {
        return new WizardFragmentProvider(themeManager);
    }
}
