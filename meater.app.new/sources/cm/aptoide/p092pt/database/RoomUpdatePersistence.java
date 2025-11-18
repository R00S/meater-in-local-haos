package cm.aptoide.p092pt.database;

import cm.aptoide.p092pt.database.room.RoomUpdate;
import cm.aptoide.p092pt.database.room.UpdateDao;
import cm.aptoide.p092pt.updates.UpdatePersistence;
import java.util.ArrayList;
import java.util.List;
import p319g.p320a.p321a.p322a.C9059d;
import p323h.p324a.EnumC9062a;
import p323h.p324a.p328y.InterfaceC9098f;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11256e;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class RoomUpdatePersistence implements UpdatePersistence {
    private final UpdateDao updateDao;

    public RoomUpdatePersistence(UpdateDao updateDao) {
        this.updateDao = updateDao;
    }

    static /* synthetic */ RoomUpdate lambda$contains$2(Throwable th) {
        return null;
    }

    static /* synthetic */ RoomUpdate lambda$get$0(Throwable th) {
        return null;
    }

    static /* synthetic */ List lambda$getAll$1(Throwable th) {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$remove$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7416a(String str) {
        this.updateDao.deleteByPackageName(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$removeAll$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7417b(List list) {
        this.updateDao.deleteAll(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$save$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7418c(RoomUpdate roomUpdate) {
        this.updateDao.insert(roomUpdate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$saveAll$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7419d(List list) {
        this.updateDao.insertAll(list);
    }

    @Override // cm.aptoide.p092pt.updates.UpdatePersistence
    public Single<Boolean> contains(String str, boolean z) {
        return C9059d.m29126d(this.updateDao.getByPackageAndExcluded(str, z)).m39926r(new InterfaceC11256e() { // from class: cm.aptoide.pt.database.l1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                RoomUpdatePersistence.lambda$contains$2((Throwable) obj);
                return null;
            }
        }).m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.database.g1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((RoomUpdate) obj) != null);
            }
        }).m39930v(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.updates.UpdatePersistence
    public Single<RoomUpdate> get(String str) {
        return C9059d.m29126d(this.updateDao.get(str)).m39926r(new InterfaceC11256e() { // from class: cm.aptoide.pt.database.k1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                RoomUpdatePersistence.lambda$get$0((Throwable) obj);
                return null;
            }
        }).m39930v(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.updates.UpdatePersistence
    public Single<List<RoomUpdate>> getAll(boolean z) {
        return C9059d.m29126d(this.updateDao.getAllByExcluded(z)).m39926r(new InterfaceC11256e() { // from class: cm.aptoide.pt.database.j1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return RoomUpdatePersistence.lambda$getAll$1((Throwable) obj);
            }
        }).m39930v(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.updates.UpdatePersistence
    public C11234e<List<RoomUpdate>> getAllSorted(boolean z) {
        return C9059d.m29124b(this.updateDao.getAllByExcludedSorted(z), EnumC9062a.BUFFER).m40065I0(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.updates.UpdatePersistence
    public Single<Boolean> isExcluded(String str) {
        return C9059d.m29126d(this.updateDao.getByPackageAndExcluded(str, true).m29231g(new InterfaceC9098f() { // from class: cm.aptoide.pt.database.h1
            @Override // p323h.p324a.p328y.InterfaceC9098f
            /* renamed from: a */
            public final Object mo4660a(Object obj) {
                return Boolean.valueOf(((RoomUpdate) obj) != null);
            }
        })).m39926r(new InterfaceC11256e() { // from class: cm.aptoide.pt.database.m1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.FALSE;
            }
        }).m39930v(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.updates.UpdatePersistence
    public C11231b remove(final String str) {
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.database.i1
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f8431f.m7416a(str);
            }
        }).m39967K(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.updates.UpdatePersistence
    public C11231b removeAll(final List<RoomUpdate> list) {
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.database.n1
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f8450f.m7417b(list);
            }
        }).m39967K(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.updates.UpdatePersistence
    public C11231b save(final RoomUpdate roomUpdate) {
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.database.f1
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f8419f.m7418c(roomUpdate);
            }
        }).m39967K(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.updates.UpdatePersistence
    public C11231b saveAll(final List<RoomUpdate> list) {
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.database.e1
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f8413f.m7419d(list);
            }
        }).m39967K(Schedulers.m40658io());
    }
}
