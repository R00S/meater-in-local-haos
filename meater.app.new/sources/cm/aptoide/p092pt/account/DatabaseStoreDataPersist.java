package cm.aptoide.p092pt.account;

import cm.aptoide.accountmanager.Store;
import cm.aptoide.p092pt.database.room.RoomStore;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.store.RoomStoreRepository;
import java.util.List;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class DatabaseStoreDataPersist {
    private final DatabaseStoreMapper databaseStoreMapper;
    private final RoomStoreRepository storeRepository;

    public static class DatabaseStoreMapper {
        public Store fromDatabase(RoomStore roomStore) {
            return new Store(roomStore.getDownloads(), roomStore.getIconPath(), roomStore.getStoreId(), roomStore.getStoreName(), roomStore.getTheme(), roomStore.getUsername(), roomStore.getPasswordSha1(), true);
        }

        public RoomStore toDatabase(Store store) {
            RoomStore roomStore = new RoomStore();
            roomStore.setDownloads(store.getDownloadCount());
            roomStore.setIconPath(store.getAvatar());
            roomStore.setStoreId(store.getId());
            roomStore.setStoreName(store.getName());
            roomStore.setTheme(store.getTheme());
            roomStore.setUsername(store.getUsername());
            roomStore.setPasswordSha1(store.getPassword());
            return roomStore;
        }
    }

    public DatabaseStoreDataPersist(DatabaseStoreMapper databaseStoreMapper, RoomStoreRepository roomStoreRepository) {
        this.storeRepository = roomStoreRepository;
        this.databaseStoreMapper = databaseStoreMapper;
    }

    static /* synthetic */ Iterable lambda$get$2(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$get$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Store m6858a(RoomStore roomStore) {
        return this.databaseStoreMapper.fromDatabase(roomStore);
    }

    static /* synthetic */ void lambda$get$4(List list) {
        Logger logger = Logger.getInstance();
        StringBuilder sb = new StringBuilder();
        sb.append("nr stores= ");
        sb.append(list != null ? list.size() : 0);
        logger.m8273d("DatabaseStoreDataPersist", sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$persist$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ RoomStore m6859b(Store store) {
        return this.databaseStoreMapper.toDatabase(store);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$persist$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m6860c(List list) {
        return this.storeRepository.saveAll(list);
    }

    public Single<List<Store>> get() {
        return this.storeRepository.getAll().m40057E().m40066J(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.l0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                DatabaseStoreDataPersist.lambda$get$2(list);
                return list;
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.m0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7266f.m6858a((RoomStore) obj);
            }
        }).m40084Y0().m40085Z0().m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.j0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                DatabaseStoreDataPersist.lambda$get$4((List) obj);
            }
        });
    }

    public C11231b persist(List<Store> list) {
        return C11234e.m40020N(list).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.n0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7268f.m6859b((Store) obj);
            }
        }).m40084Y0().m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.k0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7262f.m6860c((List) obj);
            }
        }).m40083X0();
    }
}
