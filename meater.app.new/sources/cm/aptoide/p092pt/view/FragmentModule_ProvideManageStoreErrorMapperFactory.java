package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.account.view.store.ManageStoreErrorMapper;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvideManageStoreErrorMapperFactory implements Provider {
    private final FragmentModule module;

    public FragmentModule_ProvideManageStoreErrorMapperFactory(FragmentModule fragmentModule) {
        this.module = fragmentModule;
    }

    public static FragmentModule_ProvideManageStoreErrorMapperFactory create(FragmentModule fragmentModule) {
        return new FragmentModule_ProvideManageStoreErrorMapperFactory(fragmentModule);
    }

    public static ManageStoreErrorMapper provideManageStoreErrorMapper(FragmentModule fragmentModule) {
        return (ManageStoreErrorMapper) C9055b.m29112c(fragmentModule.provideManageStoreErrorMapper());
    }

    @Override // javax.inject.Provider
    public ManageStoreErrorMapper get() {
        return provideManageStoreErrorMapper(this.module);
    }
}
