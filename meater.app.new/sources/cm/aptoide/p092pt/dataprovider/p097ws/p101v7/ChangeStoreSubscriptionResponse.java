package cm.aptoide.p092pt.dataprovider.p097ws.p101v7;

import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;

/* loaded from: classes.dex */
public class ChangeStoreSubscriptionResponse extends BaseV7Response {
    private StoreSubscriptionState status;
    private Store store;

    public enum StoreSubscriptionState {
        UNSUBSCRIBED,
        SUBSCRIBED
    }

    public StoreSubscriptionState getStatus() {
        return this.status;
    }

    public Store getStore() {
        return this.store;
    }

    public void setStatus(StoreSubscriptionState storeSubscriptionState) {
        this.status = storeSubscriptionState;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}
