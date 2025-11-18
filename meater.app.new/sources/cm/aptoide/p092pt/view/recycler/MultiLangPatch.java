package cm.aptoide.p092pt.view.recycler;

import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessResponse;

/* loaded from: classes.dex */
public class MultiLangPatch {
    private int total;
    private int totalWaiting;

    public int getTotal() {
        return this.total;
    }

    void updateOffset() {
        this.total = this.totalWaiting;
    }

    void updateTotal(BaseV7EndlessResponse baseV7EndlessResponse) {
        this.totalWaiting += baseV7EndlessResponse.getTotal();
    }
}
