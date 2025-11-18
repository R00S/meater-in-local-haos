package cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store;

import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBodyWithStore;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseRequestWithStore;

/* loaded from: classes.dex */
public class GetStoreBody extends BaseBodyWithStore {
    private StoreContext context;
    private final WidgetsArgs widgetsArgs;

    public GetStoreBody(BaseRequestWithStore.StoreCredentials storeCredentials, WidgetsArgs widgetsArgs) {
        super(storeCredentials);
        this.widgetsArgs = widgetsArgs;
    }

    public StoreContext getContext() {
        return this.context;
    }

    public WidgetsArgs getWidgetsArgs() {
        return this.widgetsArgs;
    }

    public void setContext(StoreContext storeContext) {
        this.context = storeContext;
    }
}
