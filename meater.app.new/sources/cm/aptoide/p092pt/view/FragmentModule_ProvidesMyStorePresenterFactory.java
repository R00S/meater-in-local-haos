package cm.aptoide.p092pt.view;

import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.store.view.p104my.MyStoresNavigator;
import cm.aptoide.p092pt.store.view.p104my.MyStoresPresenter;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesMyStorePresenterFactory implements Provider {
    private final Provider<AptoideAccountManager> aptoideAccountManagerProvider;
    private final FragmentModule module;
    private final Provider<MyStoresNavigator> navigatorProvider;

    public FragmentModule_ProvidesMyStorePresenterFactory(FragmentModule fragmentModule, Provider<AptoideAccountManager> provider, Provider<MyStoresNavigator> provider2) {
        this.module = fragmentModule;
        this.aptoideAccountManagerProvider = provider;
        this.navigatorProvider = provider2;
    }

    public static FragmentModule_ProvidesMyStorePresenterFactory create(FragmentModule fragmentModule, Provider<AptoideAccountManager> provider, Provider<MyStoresNavigator> provider2) {
        return new FragmentModule_ProvidesMyStorePresenterFactory(fragmentModule, provider, provider2);
    }

    public static MyStoresPresenter providesMyStorePresenter(FragmentModule fragmentModule, AptoideAccountManager aptoideAccountManager, MyStoresNavigator myStoresNavigator) {
        return (MyStoresPresenter) C9055b.m29112c(fragmentModule.providesMyStorePresenter(aptoideAccountManager, myStoresNavigator));
    }

    @Override // javax.inject.Provider
    public MyStoresPresenter get() {
        return providesMyStorePresenter(this.module, this.aptoideAccountManagerProvider.get(), this.navigatorProvider.get());
    }
}
