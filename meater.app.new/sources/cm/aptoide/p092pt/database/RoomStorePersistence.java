package cm.aptoide.p092pt.database;

import cm.aptoide.p092pt.database.room.RoomStore;
import cm.aptoide.p092pt.database.room.StoreDao;
import cm.aptoide.p092pt.store.StorePersistence;
import java.util.List;
import p319g.p320a.p321a.p322a.C9059d;
import p323h.p324a.EnumC9062a;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11256e;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class RoomStorePersistence implements StorePersistence {
    private final StoreDao storeDao;

    public RoomStorePersistence(StoreDao storeDao) {
        this.storeDao = storeDao;
    }

    static /* synthetic */ RoomStore lambda$get$0(Throwable th) {
        return null;
    }

    static /* synthetic */ RoomStore lambda$get$1(Throwable th) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$remove$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7413a(String str) {
        this.storeDao.removeByStoreName(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$save$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7414b(RoomStore roomStore) {
        this.storeDao.insert(roomStore);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$saveAll$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7415c(List list) {
        this.storeDao.saveAll(list);
    }

    @Override // cm.aptoide.p092pt.store.StorePersistence
    public Single<RoomStore> get(String str) {
        return C9059d.m29126d(this.storeDao.getByStoreName(str)).m39926r(new InterfaceC11256e() { // from class: cm.aptoide.pt.database.z0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                RoomStorePersistence.lambda$get$0((Throwable) obj);
                return null;
            }
        }).m39930v(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.store.StorePersistence
    public C11234e<List<RoomStore>> getAll() {
        return C9059d.m29124b(this.storeDao.getAll(), EnumC9062a.BUFFER).m40065I0(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.store.StorePersistence
    public C11234e<Boolean> isSubscribed(long j2) {
        return C9059d.m29124b(this.storeDao.isSubscribed(j2), EnumC9062a.BUFFER).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.database.y0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() > 0);
            }
        }).m40065I0(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.store.StorePersistence
    public C11231b remove(final String str) {
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.database.c1
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f8405f.m7413a(str);
            }
        }).m39967K(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.store.StorePersistence
    public C11231b save(final RoomStore roomStore) {
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.database.b1
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f8401f.m7414b(roomStore);
            }
        }).m39967K(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.store.StorePersistence
    public C11231b saveAll(final List<RoomStore> list) {
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.database.x0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f8479f.m7415c(list);
            }
        }).m39967K(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.store.StorePersistence
    public Single<RoomStore> get(long j2) {
        return C9059d.m29126d(this.storeDao.getByStoreId(j2)).m39926r(new InterfaceC11256e() { // from class: cm.aptoide.pt.database.a1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                RoomStorePersistence.lambda$get$1((Throwable) obj);
                return null;
            }
        }).m39930v(Schedulers.m40658io());
    }
}
