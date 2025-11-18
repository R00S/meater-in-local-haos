package cm.aptoide.p092pt.dataprovider.p097ws.p101v7;

import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseRequestWithStore;

/* loaded from: classes.dex */
public class BaseBodyWithStore extends BaseBody {
    private Long storeId;
    private String storeName;
    private String storePassSha1;
    private String storeUser;

    public BaseBodyWithStore() {
    }

    public Long getStoreId() {
        return this.storeId;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public String getStorePassSha1() {
        return this.storePassSha1;
    }

    public String getStoreUser() {
        return this.storeUser;
    }

    public BaseBodyWithStore(BaseRequestWithStore.StoreCredentials storeCredentials) {
        this.storeId = storeCredentials.getId();
        this.storeName = storeCredentials.getName();
        this.storeUser = storeCredentials.getUsername();
        this.storePassSha1 = storeCredentials.getPasswordSha1();
    }
}
