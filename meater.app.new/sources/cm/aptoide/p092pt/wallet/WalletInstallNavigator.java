package cm.aptoide.p092pt.wallet;

import cm.aptoide.p092pt.navigator.FragmentNavigator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: WalletInstallNavigator.kt */
@Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m32267d2 = {"Lcm/aptoide/pt/wallet/WalletInstallNavigator;", HttpUrl.FRAGMENT_ENCODE_SET, "fragmentNavigator", "Lcm/aptoide/pt/navigator/FragmentNavigator;", "(Lcm/aptoide/pt/navigator/FragmentNavigator;)V", "getFragmentNavigator", "()Lcm/aptoide/pt/navigator/FragmentNavigator;", "navigateToWalletInstallView", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class WalletInstallNavigator {
    private final FragmentNavigator fragmentNavigator;

    public WalletInstallNavigator(FragmentNavigator fragmentNavigator) {
        C9801m.m32346f(fragmentNavigator, "fragmentNavigator");
        this.fragmentNavigator = fragmentNavigator;
    }

    public final FragmentNavigator getFragmentNavigator() {
        return this.fragmentNavigator;
    }

    public final void navigateToWalletInstallView() {
    }
}
