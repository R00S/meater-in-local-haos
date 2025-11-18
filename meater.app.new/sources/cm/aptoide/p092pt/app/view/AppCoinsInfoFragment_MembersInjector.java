package cm.aptoide.p092pt.app.view;

import cm.aptoide.p092pt.view.AppCoinsInfoPresenter;
import javax.inject.Named;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class AppCoinsInfoFragment_MembersInjector implements InterfaceC9053a<AppCoinsInfoFragment> {
    private final Provider<AppCoinsInfoPresenter> appCoinsInfoPresenterProvider;
    private final Provider<Float> screenHeightProvider;
    private final Provider<Float> screenWidthProvider;

    public AppCoinsInfoFragment_MembersInjector(Provider<AppCoinsInfoPresenter> provider, Provider<Float> provider2, Provider<Float> provider3) {
        this.appCoinsInfoPresenterProvider = provider;
        this.screenWidthProvider = provider2;
        this.screenHeightProvider = provider3;
    }

    public static InterfaceC9053a<AppCoinsInfoFragment> create(Provider<AppCoinsInfoPresenter> provider, Provider<Float> provider2, Provider<Float> provider3) {
        return new AppCoinsInfoFragment_MembersInjector(provider, provider2, provider3);
    }

    public static void injectAppCoinsInfoPresenter(AppCoinsInfoFragment appCoinsInfoFragment, AppCoinsInfoPresenter appCoinsInfoPresenter) {
        appCoinsInfoFragment.appCoinsInfoPresenter = appCoinsInfoPresenter;
    }

    @Named
    public static void injectScreenHeight(AppCoinsInfoFragment appCoinsInfoFragment, float f2) {
        appCoinsInfoFragment.screenHeight = f2;
    }

    @Named
    public static void injectScreenWidth(AppCoinsInfoFragment appCoinsInfoFragment, float f2) {
        appCoinsInfoFragment.screenWidth = f2;
    }

    public void injectMembers(AppCoinsInfoFragment appCoinsInfoFragment) {
        injectAppCoinsInfoPresenter(appCoinsInfoFragment, this.appCoinsInfoPresenterProvider.get());
        injectScreenWidth(appCoinsInfoFragment, this.screenWidthProvider.get().floatValue());
        injectScreenHeight(appCoinsInfoFragment, this.screenHeightProvider.get().floatValue());
    }
}
