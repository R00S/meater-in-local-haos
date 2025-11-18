package cm.aptoide.p092pt.dataprovider.model.p096v7.search;

import cm.aptoide.p092pt.dataprovider.model.p096v7.Obb;
import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.App;

/* loaded from: classes.dex */
public class SearchApp extends App {
    private boolean hasVersions;
    private Obb obb;

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.App
    public Obb getObb() {
        return this.obb;
    }

    public boolean hasVersions() {
        return this.hasVersions;
    }

    public void setHasVersions(boolean z) {
        this.hasVersions = z;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.App
    public void setObb(Obb obb) {
        this.obb = obb;
    }
}
