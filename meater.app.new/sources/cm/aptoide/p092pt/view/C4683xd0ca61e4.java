package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.account.view.LoginSignUpCredentialsConfiguration;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesLoginSignUpCredentialsConfigurationFactory */
/* loaded from: classes.dex */
public final class C4683xd0ca61e4 implements Provider {
    private final FragmentModule module;

    public C4683xd0ca61e4(FragmentModule fragmentModule) {
        this.module = fragmentModule;
    }

    public static C4683xd0ca61e4 create(FragmentModule fragmentModule) {
        return new C4683xd0ca61e4(fragmentModule);
    }

    public static LoginSignUpCredentialsConfiguration providesLoginSignUpCredentialsConfiguration(FragmentModule fragmentModule) {
        return (LoginSignUpCredentialsConfiguration) C9055b.m29112c(fragmentModule.providesLoginSignUpCredentialsConfiguration());
    }

    @Override // javax.inject.Provider
    public LoginSignUpCredentialsConfiguration get() {
        return providesLoginSignUpCredentialsConfiguration(this.module);
    }
}
