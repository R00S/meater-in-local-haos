package cm.aptoide.p092pt.view;

import android.content.res.Resources;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ActivityModule_ProvidesScreenHeightFactory implements Provider {
    private final ActivityModule module;
    private final Provider<Resources> resourcesProvider;

    public ActivityModule_ProvidesScreenHeightFactory(ActivityModule activityModule, Provider<Resources> provider) {
        this.module = activityModule;
        this.resourcesProvider = provider;
    }

    public static ActivityModule_ProvidesScreenHeightFactory create(ActivityModule activityModule, Provider<Resources> provider) {
        return new ActivityModule_ProvidesScreenHeightFactory(activityModule, provider);
    }

    public static float providesScreenHeight(ActivityModule activityModule, Resources resources) {
        return activityModule.providesScreenHeight(resources);
    }

    @Override // javax.inject.Provider
    public Float get() {
        return Float.valueOf(providesScreenHeight(this.module, this.resourcesProvider.get()));
    }
}
