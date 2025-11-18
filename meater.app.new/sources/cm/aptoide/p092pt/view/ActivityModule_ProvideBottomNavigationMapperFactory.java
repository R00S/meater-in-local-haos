package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.bottomNavigation.BottomNavigationMapper;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ActivityModule_ProvideBottomNavigationMapperFactory implements Provider {
    private final ActivityModule module;

    public ActivityModule_ProvideBottomNavigationMapperFactory(ActivityModule activityModule) {
        this.module = activityModule;
    }

    public static ActivityModule_ProvideBottomNavigationMapperFactory create(ActivityModule activityModule) {
        return new ActivityModule_ProvideBottomNavigationMapperFactory(activityModule);
    }

    public static BottomNavigationMapper provideBottomNavigationMapper(ActivityModule activityModule) {
        return (BottomNavigationMapper) C9055b.m29112c(activityModule.provideBottomNavigationMapper());
    }

    @Override // javax.inject.Provider
    public BottomNavigationMapper get() {
        return provideBottomNavigationMapper(this.module);
    }
}
