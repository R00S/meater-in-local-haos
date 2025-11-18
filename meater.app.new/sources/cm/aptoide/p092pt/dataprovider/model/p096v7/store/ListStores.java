package cm.aptoide.p092pt.dataprovider.model.p096v7.store;

import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessDataListResponse;

/* loaded from: classes.dex */
public class ListStores extends BaseV7EndlessDataListResponse<Store> {
    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessDataListResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    protected boolean canEqual(Object obj) {
        return obj instanceof ListStores;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessDataListResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ListStores) && ((ListStores) obj).canEqual(this) && super.equals(obj);
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessDataListResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public int hashCode() {
        return 59 + super.hashCode();
    }
}
