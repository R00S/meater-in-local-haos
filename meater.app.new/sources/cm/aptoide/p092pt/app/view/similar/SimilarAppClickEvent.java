package cm.aptoide.p092pt.app.view.similar;

import cm.aptoide.p092pt.app.AppViewSimilarApp;
import cm.aptoide.p092pt.app.view.AppViewSimilarAppsAdapter;

/* loaded from: classes.dex */
public class SimilarAppClickEvent {
    private int position;
    private AppViewSimilarApp similar;
    private AppViewSimilarAppsAdapter.SimilarAppType type;

    public SimilarAppClickEvent(AppViewSimilarApp appViewSimilarApp, AppViewSimilarAppsAdapter.SimilarAppType similarAppType, int i2) {
        this.similar = appViewSimilarApp;
        this.type = similarAppType;
        this.position = i2;
    }

    public int getPosition() {
        return this.position;
    }

    public AppViewSimilarApp getSimilar() {
        return this.similar;
    }

    public AppViewSimilarAppsAdapter.SimilarAppType getType() {
        return this.type;
    }
}
