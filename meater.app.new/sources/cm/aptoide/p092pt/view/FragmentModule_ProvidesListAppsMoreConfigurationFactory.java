package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.home.more.apps.ListAppsConfiguration;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesListAppsMoreConfigurationFactory implements Provider {
    private final FragmentModule module;

    public FragmentModule_ProvidesListAppsMoreConfigurationFactory(FragmentModule fragmentModule) {
        this.module = fragmentModule;
    }

    public static FragmentModule_ProvidesListAppsMoreConfigurationFactory create(FragmentModule fragmentModule) {
        return new FragmentModule_ProvidesListAppsMoreConfigurationFactory(fragmentModule);
    }

    public static ListAppsConfiguration providesListAppsMoreConfiguration(FragmentModule fragmentModule) {
        return (ListAppsConfiguration) C9055b.m29112c(fragmentModule.providesListAppsMoreConfiguration());
    }

    @Override // javax.inject.Provider
    public ListAppsConfiguration get() {
        return providesListAppsMoreConfiguration(this.module);
    }
}
