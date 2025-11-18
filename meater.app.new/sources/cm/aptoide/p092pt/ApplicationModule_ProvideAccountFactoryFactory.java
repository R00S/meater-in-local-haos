package cm.aptoide.p092pt;

import cm.aptoide.accountmanager.AccountFactory;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideAccountFactoryFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideAccountFactoryFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideAccountFactoryFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideAccountFactoryFactory(applicationModule);
    }

    public static AccountFactory provideAccountFactory(ApplicationModule applicationModule) {
        return (AccountFactory) C9055b.m29112c(applicationModule.provideAccountFactory());
    }

    @Override // javax.inject.Provider
    public AccountFactory get() {
        return provideAccountFactory(this.module);
    }
}
