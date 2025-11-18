package cm.aptoide.p092pt.dataprovider.model.p096v7;

import com.fasterxml.jackson.annotation.JsonProperty;

/* loaded from: classes.dex */
public class BundlesEndlessDataListResponse<T> extends BaseV7EndlessResponse {

    @JsonProperty("datalist")
    private BundlesDataList dataList;

    public BundlesDataList getDataList() {
        return this.dataList;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessResponse
    public int getNextSize() {
        if (hasData()) {
            return this.dataList.getNext();
        }
        return 0;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessResponse
    public int getTotal() {
        if (hasData()) {
            return this.dataList.getTotal();
        }
        return 0;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessResponse
    public boolean hasData() {
        BundlesDataList bundlesDataList = this.dataList;
        return (bundlesDataList == null || bundlesDataList.getList() == null) ? false : true;
    }

    public void setDataList(BundlesDataList bundlesDataList) {
        this.dataList = bundlesDataList;
    }
}
