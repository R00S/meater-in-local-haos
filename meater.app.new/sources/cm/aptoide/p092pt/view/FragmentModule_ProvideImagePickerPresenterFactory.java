package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.account.view.ImagePickerNavigator;
import cm.aptoide.p092pt.account.view.ImagePickerPresenter;
import cm.aptoide.p092pt.account.view.ImageValidator;
import cm.aptoide.p092pt.account.view.PhotoFileGenerator;
import cm.aptoide.p092pt.account.view.UriToPathResolver;
import cm.aptoide.p092pt.permission.AccountPermissionProvider;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvideImagePickerPresenterFactory implements Provider {
    private final Provider<AccountPermissionProvider> accountPermissionProvider;
    private final Provider<ImagePickerNavigator> imagePickerNavigatorProvider;
    private final Provider<ImageValidator> imageValidatorProvider;
    private final FragmentModule module;
    private final Provider<PhotoFileGenerator> photoFileGeneratorProvider;
    private final Provider<UriToPathResolver> uriToPathResolverProvider;

    public FragmentModule_ProvideImagePickerPresenterFactory(FragmentModule fragmentModule, Provider<AccountPermissionProvider> provider, Provider<PhotoFileGenerator> provider2, Provider<ImageValidator> provider3, Provider<UriToPathResolver> provider4, Provider<ImagePickerNavigator> provider5) {
        this.module = fragmentModule;
        this.accountPermissionProvider = provider;
        this.photoFileGeneratorProvider = provider2;
        this.imageValidatorProvider = provider3;
        this.uriToPathResolverProvider = provider4;
        this.imagePickerNavigatorProvider = provider5;
    }

    public static FragmentModule_ProvideImagePickerPresenterFactory create(FragmentModule fragmentModule, Provider<AccountPermissionProvider> provider, Provider<PhotoFileGenerator> provider2, Provider<ImageValidator> provider3, Provider<UriToPathResolver> provider4, Provider<ImagePickerNavigator> provider5) {
        return new FragmentModule_ProvideImagePickerPresenterFactory(fragmentModule, provider, provider2, provider3, provider4, provider5);
    }

    public static ImagePickerPresenter provideImagePickerPresenter(FragmentModule fragmentModule, AccountPermissionProvider accountPermissionProvider, PhotoFileGenerator photoFileGenerator, ImageValidator imageValidator, UriToPathResolver uriToPathResolver, ImagePickerNavigator imagePickerNavigator) {
        return (ImagePickerPresenter) C9055b.m29112c(fragmentModule.provideImagePickerPresenter(accountPermissionProvider, photoFileGenerator, imageValidator, uriToPathResolver, imagePickerNavigator));
    }

    @Override // javax.inject.Provider
    public ImagePickerPresenter get() {
        return provideImagePickerPresenter(this.module, this.accountPermissionProvider.get(), this.photoFileGeneratorProvider.get(), this.imageValidatorProvider.get(), this.uriToPathResolverProvider.get(), this.imagePickerNavigatorProvider.get());
    }
}
