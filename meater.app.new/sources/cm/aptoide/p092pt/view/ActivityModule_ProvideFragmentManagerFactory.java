package cm.aptoide.p092pt.view;

import androidx.fragment.app.FragmentManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ActivityModule_ProvideFragmentManagerFactory implements Provider {
    private final ActivityModule module;

    public ActivityModule_ProvideFragmentManagerFactory(ActivityModule activityModule) {
        this.module = activityModule;
    }

    public static ActivityModule_ProvideFragmentManagerFactory create(ActivityModule activityModule) {
        return new ActivityModule_ProvideFragmentManagerFactory(activityModule);
    }

    public static FragmentManager provideFragmentManager(ActivityModule activityModule) {
        return (FragmentManager) C9055b.m29112c(activityModule.provideFragmentManager());
    }

    @Override // javax.inject.Provider
    public FragmentManager get() {
        return provideFragmentManager(this.module);
    }
}
