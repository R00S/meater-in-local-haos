package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceManager;
import cm.aptoide.p092pt.install.InstallAppSizeValidator;
import cm.aptoide.p092pt.install.InstallManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesOutOfSpaceManagerFactory implements Provider {
    private final Provider<InstallAppSizeValidator> installAppSizeValidatorProvider;
    private final Provider<InstallManager> installManagerProvider;
    private final FragmentModule module;

    public FragmentModule_ProvidesOutOfSpaceManagerFactory(FragmentModule fragmentModule, Provider<InstallManager> provider, Provider<InstallAppSizeValidator> provider2) {
        this.module = fragmentModule;
        this.installManagerProvider = provider;
        this.installAppSizeValidatorProvider = provider2;
    }

    public static FragmentModule_ProvidesOutOfSpaceManagerFactory create(FragmentModule fragmentModule, Provider<InstallManager> provider, Provider<InstallAppSizeValidator> provider2) {
        return new FragmentModule_ProvidesOutOfSpaceManagerFactory(fragmentModule, provider, provider2);
    }

    public static OutOfSpaceManager providesOutOfSpaceManager(FragmentModule fragmentModule, InstallManager installManager, InstallAppSizeValidator installAppSizeValidator) {
        return (OutOfSpaceManager) C9055b.m29112c(fragmentModule.providesOutOfSpaceManager(installManager, installAppSizeValidator));
    }

    @Override // javax.inject.Provider
    public OutOfSpaceManager get() {
        return providesOutOfSpaceManager(this.module, this.installManagerProvider.get(), this.installAppSizeValidatorProvider.get());
    }
}
