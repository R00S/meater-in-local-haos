package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.feature.NewFeatureDialogPresenter;
import cm.aptoide.p092pt.themes.NewFeatureManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesDarkthemeDialogPresenterFactory implements Provider {
    private final FragmentModule module;
    private final Provider<NewFeatureManager> newFeatureManagerProvider;

    public FragmentModule_ProvidesDarkthemeDialogPresenterFactory(FragmentModule fragmentModule, Provider<NewFeatureManager> provider) {
        this.module = fragmentModule;
        this.newFeatureManagerProvider = provider;
    }

    public static FragmentModule_ProvidesDarkthemeDialogPresenterFactory create(FragmentModule fragmentModule, Provider<NewFeatureManager> provider) {
        return new FragmentModule_ProvidesDarkthemeDialogPresenterFactory(fragmentModule, provider);
    }

    public static NewFeatureDialogPresenter providesDarkthemeDialogPresenter(FragmentModule fragmentModule, NewFeatureManager newFeatureManager) {
        return (NewFeatureDialogPresenter) C9055b.m29112c(fragmentModule.providesDarkthemeDialogPresenter(newFeatureManager));
    }

    @Override // javax.inject.Provider
    public NewFeatureDialogPresenter get() {
        return providesDarkthemeDialogPresenter(this.module, this.newFeatureManagerProvider.get());
    }
}
