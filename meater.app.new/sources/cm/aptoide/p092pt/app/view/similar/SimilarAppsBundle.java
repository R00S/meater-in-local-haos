package cm.aptoide.p092pt.app.view.similar;

import cm.aptoide.p092pt.app.SimilarAppsViewModel;

/* loaded from: classes.dex */
public class SimilarAppsBundle {
    private final BundleType bundleType;
    private final SimilarAppsViewModel model;

    public enum BundleType {
        APPS,
        APPC_APPS
    }

    public SimilarAppsBundle(SimilarAppsViewModel similarAppsViewModel, BundleType bundleType) {
        this.model = similarAppsViewModel;
        this.bundleType = bundleType;
    }

    public SimilarAppsViewModel getContent() {
        return this.model;
    }

    public BundleType getType() {
        return this.bundleType;
    }
}
