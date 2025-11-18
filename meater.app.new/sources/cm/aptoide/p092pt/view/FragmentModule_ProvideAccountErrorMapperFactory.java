package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.account.view.AccountErrorMapper;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvideAccountErrorMapperFactory implements Provider {
    private final FragmentModule module;

    public FragmentModule_ProvideAccountErrorMapperFactory(FragmentModule fragmentModule) {
        this.module = fragmentModule;
    }

    public static FragmentModule_ProvideAccountErrorMapperFactory create(FragmentModule fragmentModule) {
        return new FragmentModule_ProvideAccountErrorMapperFactory(fragmentModule);
    }

    public static AccountErrorMapper provideAccountErrorMapper(FragmentModule fragmentModule) {
        return (AccountErrorMapper) C9055b.m29112c(fragmentModule.provideAccountErrorMapper());
    }

    @Override // javax.inject.Provider
    public AccountErrorMapper get() {
        return provideAccountErrorMapper(this.module);
    }
}
