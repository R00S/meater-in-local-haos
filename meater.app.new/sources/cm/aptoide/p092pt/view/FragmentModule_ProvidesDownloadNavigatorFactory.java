package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.download.view.DownloadNavigator;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesDownloadNavigatorFactory implements Provider {
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final FragmentModule module;

    public FragmentModule_ProvidesDownloadNavigatorFactory(FragmentModule fragmentModule, Provider<FragmentNavigator> provider) {
        this.module = fragmentModule;
        this.fragmentNavigatorProvider = provider;
    }

    public static FragmentModule_ProvidesDownloadNavigatorFactory create(FragmentModule fragmentModule, Provider<FragmentNavigator> provider) {
        return new FragmentModule_ProvidesDownloadNavigatorFactory(fragmentModule, provider);
    }

    public static DownloadNavigator providesDownloadNavigator(FragmentModule fragmentModule, FragmentNavigator fragmentNavigator) {
        return (DownloadNavigator) C9055b.m29112c(fragmentModule.providesDownloadNavigator(fragmentNavigator));
    }

    @Override // javax.inject.Provider
    public DownloadNavigator get() {
        return providesDownloadNavigator(this.module, this.fragmentNavigatorProvider.get());
    }
}
