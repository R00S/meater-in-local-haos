package cm.aptoide.p092pt.view;

import android.content.res.Resources;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ActivityModule_ProvidesScreenWidthFactory implements Provider {
    private final ActivityModule module;
    private final Provider<Resources> resourcesProvider;

    public ActivityModule_ProvidesScreenWidthFactory(ActivityModule activityModule, Provider<Resources> provider) {
        this.module = activityModule;
        this.resourcesProvider = provider;
    }

    public static ActivityModule_ProvidesScreenWidthFactory create(ActivityModule activityModule, Provider<Resources> provider) {
        return new ActivityModule_ProvidesScreenWidthFactory(activityModule, provider);
    }

    public static float providesScreenWidth(ActivityModule activityModule, Resources resources) {
        return activityModule.providesScreenWidth(resources);
    }

    @Override // javax.inject.Provider
    public Float get() {
        return Float.valueOf(providesScreenWidth(this.module, this.resourcesProvider.get()));
    }
}
