package cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store;

import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseRequestWithStore;

/* loaded from: classes.dex */
public class GetHomeBody extends GetStoreBody {
    private Long userId;

    public GetHomeBody(BaseRequestWithStore.StoreCredentials storeCredentials, WidgetsArgs widgetsArgs, Long l) {
        super(storeCredentials, widgetsArgs);
        this.userId = l;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long l) {
        this.userId = l;
    }
}
