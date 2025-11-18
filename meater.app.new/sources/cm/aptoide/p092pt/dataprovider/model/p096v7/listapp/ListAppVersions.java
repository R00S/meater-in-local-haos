package cm.aptoide.p092pt.dataprovider.model.p096v7.listapp;

import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessListResponse;

/* loaded from: classes.dex */
public class ListAppVersions extends BaseV7EndlessListResponse<App> {
    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessListResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    protected boolean canEqual(Object obj) {
        return obj instanceof ListAppVersions;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessListResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ListAppVersions) && ((ListAppVersions) obj).canEqual(this) && super.equals(obj);
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessListResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public int hashCode() {
        return 59 + super.hashCode();
    }
}
