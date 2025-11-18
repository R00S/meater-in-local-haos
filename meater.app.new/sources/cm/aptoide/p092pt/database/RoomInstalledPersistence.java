package cm.aptoide.p092pt.database;

import cm.aptoide.p092pt.database.room.InstalledDao;
import cm.aptoide.p092pt.database.room.RoomInstallation;
import cm.aptoide.p092pt.database.room.RoomInstalled;
import cm.aptoide.p092pt.install.InstallationPersistence;
import cm.aptoide.p092pt.install.InstalledPersistence;
import java.util.ArrayList;
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
public class RoomInstalledPersistence implements InstalledPersistence {
    private final RoomInstallationMapper installationMapper;
    private final InstalledDao installedDao;
    private final InstallationPersistence roomInstallationPersistence;

    public RoomInstalledPersistence(InstalledDao installedDao, RoomInstallationPersistence roomInstallationPersistence, RoomInstallationMapper roomInstallationMapper) {
        this.installedDao = installedDao;
        this.roomInstallationPersistence = roomInstallationPersistence;
        this.installationMapper = roomInstallationMapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: filterCompleted, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C11234e<List<RoomInstalled>> m7405e(List<RoomInstalled> list) {
        return C11234e.m40020N(list).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.database.h0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((RoomInstalled) obj).getStatus() == 4);
            }
        }).m40084Y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: filterInstalling, reason: merged with bridge method [inline-methods] */
    public C11234e<List<RoomInstalled>> m7403c(List<RoomInstalled> list) {
        return C11234e.m40020N(list).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.database.j0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((RoomInstalled) obj).getStatus() == 3);
            }
        }).m40084Y0();
    }

    private C11234e<List<RoomInstalled>> getInstalledAsList(String str) {
        return C9059d.m29124b(this.installedDao.getAsListByPackageName(str), EnumC9062a.BUFFER).m40105p0(new InterfaceC11256e() { // from class: cm.aptoide.pt.database.c0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return RoomInstalledPersistence.lambda$getInstalledAsList$13((Throwable) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.database.k0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8437f.m7404d((List) obj);
            }
        }).m40065I0(Schedulers.m40658io());
    }

    static /* synthetic */ List lambda$getAsList$4(Throwable th) {
        return new ArrayList();
    }

    static /* synthetic */ RoomInstalled lambda$getInstalled$3(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return (RoomInstalled) list.get(0);
    }

    static /* synthetic */ List lambda$getInstalledAsList$13(Throwable th) {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$insert$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7406f(RoomInstalled roomInstalled) {
        this.installedDao.insert(roomInstalled);
    }

    static /* synthetic */ RoomInstalled lambda$isInstalled$8(Throwable th) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$replaceAllBy$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7407g(List list) {
        this.installedDao.removeAll();
        this.installedDao.insertAll(list);
    }

    @Override // cm.aptoide.p092pt.install.InstalledPersistence
    public C11234e<RoomInstalled> get(String str, int i2) {
        return C9059d.m29124b(this.installedDao.get(str, i2), EnumC9062a.BUFFER).m40065I0(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.install.InstalledPersistence
    public C11234e<List<RoomInstalled>> getAll() {
        return C9059d.m29124b(this.installedDao.getAll(), EnumC9062a.BUFFER).m40065I0(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.install.InstalledPersistence
    public C11234e<List<RoomInstalled>> getAllAsList(String str) {
        return C9059d.m29124b(this.installedDao.getAsListByPackageName(str), EnumC9062a.BUFFER).m40065I0(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.install.InstalledPersistence
    public C11234e<List<RoomInstalled>> getAllInstalled() {
        return C9059d.m29124b(this.installedDao.getAll(), EnumC9062a.BUFFER).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.database.l0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8440f.m7401a((List) obj);
            }
        }).m40065I0(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.install.InstalledPersistence
    public C11234e<List<RoomInstalled>> getAllInstalledSorted() {
        return C9059d.m29124b(this.installedDao.getAllSortedAsc(), EnumC9062a.BUFFER).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.database.n0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8449f.m7402b((List) obj);
            }
        }).m40065I0(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.install.InstalledPersistence
    public C11234e<List<RoomInstalled>> getAllInstalling() {
        return C9059d.m29124b(this.installedDao.getAll(), EnumC9062a.BUFFER).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.database.m0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8444f.m7403c((List) obj);
            }
        }).m40065I0(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.install.InstalledPersistence
    public C11234e<List<RoomInstalled>> getAsList(String str, int i2) {
        return C9059d.m29124b(this.installedDao.getAsList(str, i2), EnumC9062a.BUFFER).m40105p0(new InterfaceC11256e() { // from class: cm.aptoide.pt.database.p0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return RoomInstalledPersistence.lambda$getAsList$4((Throwable) obj);
            }
        }).m40065I0(Schedulers.m40658io());
    }

    public C11234e<List<RoomInstallation>> getInstallationsHistory() {
        return this.roomInstallationPersistence.getInstallationsHistory();
    }

    @Override // cm.aptoide.p092pt.install.InstalledPersistence
    public C11234e<RoomInstalled> getInstalled(String str) {
        return getInstalledAsList(str).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.database.d0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return RoomInstalledPersistence.lambda$getInstalled$3((List) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.install.InstalledPersistence
    public C11234e<List<RoomInstalled>> getInstalledFilteringSystemApps() {
        return C9059d.m29124b(this.installedDao.getAllFilteringSystemApps(), EnumC9062a.BUFFER).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.database.g0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8422f.m7405e((List) obj);
            }
        }).m40065I0(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.install.InstalledPersistence
    public C11231b insert(final RoomInstalled roomInstalled) {
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.database.f0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f8417f.m7406f(roomInstalled);
            }
        }).m39973a(this.roomInstallationPersistence.insert(this.installationMapper.map(roomInstalled))).m39967K(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.install.InstalledPersistence
    public C11234e<Boolean> isInstalled(String str) {
        return getInstalled(str).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.database.q0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                RoomInstalled roomInstalled = (RoomInstalled) obj;
                return Boolean.valueOf(roomInstalled != null && roomInstalled.getStatus() == 4);
            }
        });
    }

    @Override // cm.aptoide.p092pt.install.InstalledPersistence
    public C11231b remove(String str, int i2) {
        return C9059d.m29123a(this.installedDao.remove(str, i2)).m39967K(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.install.InstalledPersistence
    public C11231b replaceAllBy(final List<RoomInstalled> list) {
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.database.i0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f8429f.m7407g(list);
            }
        }).m39973a(this.roomInstallationPersistence.insertAll(this.installationMapper.map(list))).m39967K(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.install.InstalledPersistence
    public Single<Boolean> isInstalled(String str, int i2) {
        return C9059d.m29126d(this.installedDao.isInstalledByVersion(str, i2)).m39926r(new InterfaceC11256e() { // from class: cm.aptoide.pt.database.e0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                RoomInstalledPersistence.lambda$isInstalled$8((Throwable) obj);
                return null;
            }
        }).m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.database.o0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                RoomInstalled roomInstalled = (RoomInstalled) obj;
                return Boolean.valueOf(roomInstalled != null && roomInstalled.getStatus() == 4);
            }
        }).m39930v(Schedulers.m40658io());
    }

    public C11231b remove(String str) {
        return C9059d.m29123a(this.installedDao.remove(str)).m39967K(Schedulers.m40658io());
    }
}
