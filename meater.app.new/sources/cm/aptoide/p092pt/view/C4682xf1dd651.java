package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.notification.AppcPromotionNotificationStringProvider;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesAppcPromotionNotificationStringProviderFactory */
/* loaded from: classes.dex */
public final class C4682xf1dd651 implements Provider {
    private final FragmentModule module;

    public C4682xf1dd651(FragmentModule fragmentModule) {
        this.module = fragmentModule;
    }

    public static C4682xf1dd651 create(FragmentModule fragmentModule) {
        return new C4682xf1dd651(fragmentModule);
    }

    public static AppcPromotionNotificationStringProvider providesAppcPromotionNotificationStringProvider(FragmentModule fragmentModule) {
        return (AppcPromotionNotificationStringProvider) C9055b.m29112c(fragmentModule.providesAppcPromotionNotificationStringProvider());
    }

    @Override // javax.inject.Provider
    public AppcPromotionNotificationStringProvider get() {
        return providesAppcPromotionNotificationStringProvider(this.module);
    }
}
