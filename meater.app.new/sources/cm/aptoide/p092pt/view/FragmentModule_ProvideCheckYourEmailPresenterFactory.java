package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.account.view.magiclink.CheckYourEmailNavigator;
import cm.aptoide.p092pt.account.view.magiclink.CheckYourEmailPresenter;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvideCheckYourEmailPresenterFactory implements Provider {
    private final FragmentModule module;
    private final Provider<CheckYourEmailNavigator> navigatorProvider;

    public FragmentModule_ProvideCheckYourEmailPresenterFactory(FragmentModule fragmentModule, Provider<CheckYourEmailNavigator> provider) {
        this.module = fragmentModule;
        this.navigatorProvider = provider;
    }

    public static FragmentModule_ProvideCheckYourEmailPresenterFactory create(FragmentModule fragmentModule, Provider<CheckYourEmailNavigator> provider) {
        return new FragmentModule_ProvideCheckYourEmailPresenterFactory(fragmentModule, provider);
    }

    public static CheckYourEmailPresenter provideCheckYourEmailPresenter(FragmentModule fragmentModule, CheckYourEmailNavigator checkYourEmailNavigator) {
        return (CheckYourEmailPresenter) C9055b.m29112c(fragmentModule.provideCheckYourEmailPresenter(checkYourEmailNavigator));
    }

    @Override // javax.inject.Provider
    public CheckYourEmailPresenter get() {
        return provideCheckYourEmailPresenter(this.module, this.navigatorProvider.get());
    }
}
