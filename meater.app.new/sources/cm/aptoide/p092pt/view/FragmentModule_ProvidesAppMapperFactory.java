package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.home.apps.AppMapper;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesAppMapperFactory implements Provider {
    private final FragmentModule module;

    public FragmentModule_ProvidesAppMapperFactory(FragmentModule fragmentModule) {
        this.module = fragmentModule;
    }

    public static FragmentModule_ProvidesAppMapperFactory create(FragmentModule fragmentModule) {
        return new FragmentModule_ProvidesAppMapperFactory(fragmentModule);
    }

    public static AppMapper providesAppMapper(FragmentModule fragmentModule) {
        return (AppMapper) C9055b.m29112c(fragmentModule.providesAppMapper());
    }

    @Override // javax.inject.Provider
    public AppMapper get() {
        return providesAppMapper(this.module);
    }
}
