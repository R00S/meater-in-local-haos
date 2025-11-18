package cm.aptoide.p092pt.store;

import cm.aptoide.p092pt.database.room.RoomStore;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseRequestWithStore;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.V7Url;

/* loaded from: classes.dex */
public class StoreCredentialsProviderImpl implements StoreCredentialsProvider {
    private final RoomStoreRepository storeRepository;

    public StoreCredentialsProviderImpl(RoomStoreRepository roomStoreRepository) {
        this.storeRepository = roomStoreRepository;
    }

    @Override // cm.aptoide.p092pt.store.StoreCredentialsProvider
    public BaseRequestWithStore.StoreCredentials fromUrl(String str) {
        V7Url v7Url = new V7Url(str);
        Long storeId = v7Url.getStoreId();
        String storeName = v7Url.getStoreName();
        return storeId != null ? get(storeId.longValue()) : storeName != null ? get(storeName) : new BaseRequestWithStore.StoreCredentials();
    }

    @Override // cm.aptoide.p092pt.store.StoreCredentialsProvider
    public BaseRequestWithStore.StoreCredentials get(long j2) throws InterruptedException {
        RoomStore roomStoreM40633b = this.storeRepository.get(Long.valueOf(j2)).m39933y().m40633b();
        if (roomStoreM40633b == null) {
            return new BaseRequestWithStore.StoreCredentials(j2, (String) null, (String) null);
        }
        return new BaseRequestWithStore.StoreCredentials(j2, roomStoreM40633b.getStoreName(), roomStoreM40633b.getUsername(), roomStoreM40633b.getPasswordSha1());
    }

    @Override // cm.aptoide.p092pt.store.StoreCredentialsProvider
    public BaseRequestWithStore.StoreCredentials get(String str) throws InterruptedException {
        RoomStore roomStoreM40633b = this.storeRepository.get(str).m39933y().m40633b();
        if (roomStoreM40633b != null) {
            return new BaseRequestWithStore.StoreCredentials(roomStoreM40633b.getStoreId(), str, roomStoreM40633b.getUsername(), roomStoreM40633b.getPasswordSha1());
        }
        return new BaseRequestWithStore.StoreCredentials(str, (String) null, (String) null);
    }
}
