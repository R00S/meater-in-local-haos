package cm.aptoide.p092pt.view;

import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesAppViewConfigurationFactory implements Provider {
    private final FragmentModule module;

    public FragmentModule_ProvidesAppViewConfigurationFactory(FragmentModule fragmentModule) {
        this.module = fragmentModule;
    }

    public static FragmentModule_ProvidesAppViewConfigurationFactory create(FragmentModule fragmentModule) {
        return new FragmentModule_ProvidesAppViewConfigurationFactory(fragmentModule);
    }

    public static AppViewConfiguration providesAppViewConfiguration(FragmentModule fragmentModule) {
        return (AppViewConfiguration) C9055b.m29112c(fragmentModule.providesAppViewConfiguration());
    }

    @Override // javax.inject.Provider
    public AppViewConfiguration get() {
        return providesAppViewConfiguration(this.module);
    }
}
