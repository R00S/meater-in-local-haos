package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.account.view.ImageInfoProvider;
import cm.aptoide.p092pt.account.view.ImageValidator;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvideImageValidatorFactory implements Provider {
    private final Provider<ImageInfoProvider> imageInfoProvider;
    private final FragmentModule module;

    public FragmentModule_ProvideImageValidatorFactory(FragmentModule fragmentModule, Provider<ImageInfoProvider> provider) {
        this.module = fragmentModule;
        this.imageInfoProvider = provider;
    }

    public static FragmentModule_ProvideImageValidatorFactory create(FragmentModule fragmentModule, Provider<ImageInfoProvider> provider) {
        return new FragmentModule_ProvideImageValidatorFactory(fragmentModule, provider);
    }

    public static ImageValidator provideImageValidator(FragmentModule fragmentModule, ImageInfoProvider imageInfoProvider) {
        return (ImageValidator) C9055b.m29112c(fragmentModule.provideImageValidator(imageInfoProvider));
    }

    @Override // javax.inject.Provider
    public ImageValidator get() {
        return provideImageValidator(this.module, this.imageInfoProvider.get());
    }
}
