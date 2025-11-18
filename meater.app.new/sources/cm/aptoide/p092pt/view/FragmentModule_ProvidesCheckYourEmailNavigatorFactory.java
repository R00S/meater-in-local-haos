package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.account.view.magiclink.CheckYourEmailNavigator;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesCheckYourEmailNavigatorFactory implements Provider {
    private final FragmentModule module;

    public FragmentModule_ProvidesCheckYourEmailNavigatorFactory(FragmentModule fragmentModule) {
        this.module = fragmentModule;
    }

    public static FragmentModule_ProvidesCheckYourEmailNavigatorFactory create(FragmentModule fragmentModule) {
        return new FragmentModule_ProvidesCheckYourEmailNavigatorFactory(fragmentModule);
    }

    public static CheckYourEmailNavigator providesCheckYourEmailNavigator(FragmentModule fragmentModule) {
        return (CheckYourEmailNavigator) C9055b.m29112c(fragmentModule.providesCheckYourEmailNavigator());
    }

    @Override // javax.inject.Provider
    public CheckYourEmailNavigator get() {
        return providesCheckYourEmailNavigator(this.module);
    }
}
