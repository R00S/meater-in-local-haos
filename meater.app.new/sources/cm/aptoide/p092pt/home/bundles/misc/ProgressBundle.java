package cm.aptoide.p092pt.home.bundles.misc;

import cm.aptoide.p092pt.home.bundles.base.DummyBundle;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;

/* loaded from: classes.dex */
public class ProgressBundle extends DummyBundle {
    @Override // cm.aptoide.p092pt.home.bundles.base.DummyBundle, cm.aptoide.p092pt.home.bundles.base.HomeBundle
    public HomeBundle.BundleType getType() {
        return HomeBundle.BundleType.LOADING;
    }
}
