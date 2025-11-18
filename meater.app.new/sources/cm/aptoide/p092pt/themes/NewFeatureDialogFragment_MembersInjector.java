package cm.aptoide.p092pt.themes;

import cm.aptoide.p092pt.feature.NewFeatureDialogPresenter;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class NewFeatureDialogFragment_MembersInjector implements InterfaceC9053a<NewFeatureDialogFragment> {
    private final Provider<NewFeatureDialogPresenter> presenterProvider;

    public NewFeatureDialogFragment_MembersInjector(Provider<NewFeatureDialogPresenter> provider) {
        this.presenterProvider = provider;
    }

    public static InterfaceC9053a<NewFeatureDialogFragment> create(Provider<NewFeatureDialogPresenter> provider) {
        return new NewFeatureDialogFragment_MembersInjector(provider);
    }

    public static void injectPresenter(NewFeatureDialogFragment newFeatureDialogFragment, NewFeatureDialogPresenter newFeatureDialogPresenter) {
        newFeatureDialogFragment.presenter = newFeatureDialogPresenter;
    }

    public void injectMembers(NewFeatureDialogFragment newFeatureDialogFragment) {
        injectPresenter(newFeatureDialogFragment, this.presenterProvider.get());
    }
}
