package cm.aptoide.p092pt.view;

import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesBundleEventFactory implements Provider {
    private final FragmentModule module;

    public FragmentModule_ProvidesBundleEventFactory(FragmentModule fragmentModule) {
        this.module = fragmentModule;
    }

    public static FragmentModule_ProvidesBundleEventFactory create(FragmentModule fragmentModule) {
        return new FragmentModule_ProvidesBundleEventFactory(fragmentModule);
    }

    public static BundleEvent providesBundleEvent(FragmentModule fragmentModule) {
        return (BundleEvent) C9055b.m29112c(fragmentModule.providesBundleEvent());
    }

    @Override // javax.inject.Provider
    public BundleEvent get() {
        return providesBundleEvent(this.module);
    }
}
