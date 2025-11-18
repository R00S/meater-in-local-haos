package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.account.view.UriToPathResolver;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ActivityModule_ProvideUriToPathResolverFactory implements Provider {
    private final ActivityModule module;

    public ActivityModule_ProvideUriToPathResolverFactory(ActivityModule activityModule) {
        this.module = activityModule;
    }

    public static ActivityModule_ProvideUriToPathResolverFactory create(ActivityModule activityModule) {
        return new ActivityModule_ProvideUriToPathResolverFactory(activityModule);
    }

    public static UriToPathResolver provideUriToPathResolver(ActivityModule activityModule) {
        return (UriToPathResolver) C9055b.m29112c(activityModule.provideUriToPathResolver());
    }

    @Override // javax.inject.Provider
    public UriToPathResolver get() {
        return provideUriToPathResolver(this.module);
    }
}
