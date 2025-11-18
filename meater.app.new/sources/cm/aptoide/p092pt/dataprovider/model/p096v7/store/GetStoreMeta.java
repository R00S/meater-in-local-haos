package cm.aptoide.p092pt.dataprovider.model.p096v7.store;

import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response;

/* loaded from: classes.dex */
public class GetStoreMeta extends BaseV7Response {
    private Store data;

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    protected boolean canEqual(Object obj) {
        return obj instanceof GetStoreMeta;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetStoreMeta)) {
            return false;
        }
        GetStoreMeta getStoreMeta = (GetStoreMeta) obj;
        if (!getStoreMeta.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Store data = getData();
        Store data2 = getStoreMeta.getData();
        return data != null ? data.equals(data2) : data2 == null;
    }

    public Store getData() {
        return this.data;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public int hashCode() {
        int iHashCode = super.hashCode() + 59;
        Store data = getData();
        return (iHashCode * 59) + (data == null ? 43 : data.hashCode());
    }

    public void setData(Store store) {
        this.data = store;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public String toString() {
        return "GetStoreMeta(data=" + getData() + ")";
    }
}
