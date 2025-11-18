package cm.aptoide.p092pt.install;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import cm.aptoide.p092pt.database.RoomInstalledPersistence;
import cm.aptoide.p092pt.database.room.RoomInstallation;
import cm.aptoide.p092pt.database.room.RoomInstalled;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.utils.FileUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import p319g.p320a.p321a.p322a.C9059d;
import p323h.p324a.AbstractC9082s;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class AptoideInstalledAppsRepository implements InstalledAppsRepository {
    private final FileUtils fileUtils;
    private final RoomInstalledPersistence installedPersistence;
    private final PackageManager packageManager;
    private boolean synced = false;

    public AptoideInstalledAppsRepository(RoomInstalledPersistence roomInstalledPersistence, PackageManager packageManager, FileUtils fileUtils) {
        this.installedPersistence = roomInstalledPersistence;
        this.packageManager = packageManager;
        this.fileUtils = fileUtils;
    }

    private <T> List<T> combineLists(List<T> list, List<T> list2, InterfaceC11253b<T> interfaceC11253b) {
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        arrayList.addAll(list);
        for (T t : list2) {
            if (!arrayList.contains(t)) {
                if (interfaceC11253b != null) {
                    interfaceC11253b.call(t);
                }
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    static /* synthetic */ RoomInstalled lambda$getAsList$12(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return (RoomInstalled) list.get(0);
    }

    static /* synthetic */ Iterable lambda$getInstalledAppsNames$13(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$syncWithDevice$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ PackageInfo m8196a(String str) throws Exception {
        return AptoideUtils.SystemU.getPackageInfo(str, this.packageManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$syncWithDevice$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8197b(PackageInfo packageInfo, Boolean bool) {
        return !bool.booleanValue() ? this.installedPersistence.insert(new RoomInstalled(packageInfo, this.packageManager, this.fileUtils)) : C11231b.m39946e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$syncWithDevice$10, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8198c(final List list) {
        return this.installedPersistence.getAll().m40057E().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.h
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10110f.m8203h(list, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$syncWithDevice$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8199d() {
        this.synced = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$syncWithDevice$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8200e(String str, final PackageInfo packageInfo) {
        return packageInfo != null ? this.installedPersistence.isInstalled(str, packageInfo.versionCode).m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10087f.m8197b(packageInfo, (Boolean) obj);
            }
        }) : this.installedPersistence.remove(str);
    }

    static /* synthetic */ int lambda$syncWithDevice$4(PackageInfo packageInfo, PackageInfo packageInfo2) {
        return (int) ((packageInfo.firstInstallTime - packageInfo2.firstInstallTime) / 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$syncWithDevice$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ List m8201f() throws Exception {
        List<PackageInfo> allInstalledApps = AptoideUtils.SystemU.getAllInstalledApps(this.packageManager);
        Logger.getInstance().m8283v("InstalledRepository", "Found " + allInstalledApps.size() + " user installed apps.");
        Collections.sort(allInstalledApps, new Comparator() { // from class: cm.aptoide.pt.install.m
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AptoideInstalledAppsRepository.lambda$syncWithDevice$4((PackageInfo) obj, (PackageInfo) obj2);
            }
        });
        return allInstalledApps;
    }

    static /* synthetic */ Iterable lambda$syncWithDevice$6(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$syncWithDevice$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ RoomInstalled m8202g(PackageInfo packageInfo) {
        return new RoomInstalled(packageInfo, this.packageManager, this.fileUtils);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$syncWithDevice$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ List m8203h(List list, List list2) {
        return combineLists(list, list2, new InterfaceC11253b() { // from class: cm.aptoide.pt.install.o
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ((RoomInstalled) obj).setStatus(1);
            }
        });
    }

    public boolean contains(String str) {
        return this.installedPersistence.isInstalled(str).m40081W0().m40551b().booleanValue();
    }

    public C11234e<RoomInstalled> get(String str, int i2) {
        return this.installedPersistence.get(str, i2);
    }

    public C11234e<List<RoomInstalled>> getAllInstalled() {
        return this.installedPersistence.getAllInstalled();
    }

    public C11234e<List<RoomInstalled>> getAllInstalledSorted() {
        return this.installedPersistence.getAllInstalledSorted();
    }

    public C11234e<List<RoomInstalled>> getAllInstalling() {
        return this.installedPersistence.getAllInstalling();
    }

    public Single<List<RoomInstalled>> getAllSyncedInstalled() {
        return !this.synced ? syncWithDevice().m39975c(getAllInstalled().m40057E().m40085Z0()) : getAllInstalled().m40057E().m40085Z0();
    }

    public C11234e<RoomInstalled> getAsList(String str, int i2) {
        return this.installedPersistence.getAsList(str, i2).m40095j0(Schedulers.m40658io()).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.n
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AptoideInstalledAppsRepository.lambda$getAsList$12((List) obj);
            }
        });
    }

    public C11234e<List<RoomInstallation>> getInstallationsHistory() {
        return this.installedPersistence.getInstallationsHistory();
    }

    public C11234e<RoomInstalled> getInstalled(String str) {
        return this.installedPersistence.getInstalled(str);
    }

    public C11234e<List<RoomInstalled>> getInstalledAppsFilterSystem() {
        return this.installedPersistence.getInstalledFilteringSystemApps();
    }

    @Override // cm.aptoide.p092pt.install.InstalledAppsRepository
    public AbstractC9082s<List<String>> getInstalledAppsNames() {
        return C9059d.m29128f(getAllInstalled().m40057E().m40066J(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.g
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                AptoideInstalledAppsRepository.lambda$getInstalledAppsNames$13(list);
                return list;
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.j3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((RoomInstalled) obj).getPackageName();
            }
        }).m40084Y0().m40085Z0());
    }

    public C11234e<Boolean> isInstalled(String str) {
        return this.installedPersistence.isInstalled(str);
    }

    public C11231b remove(String str, int i2) {
        return this.installedPersistence.remove(str, i2);
    }

    public C11231b save(RoomInstalled roomInstalled) {
        return this.installedPersistence.insert(roomInstalled);
    }

    public C11231b syncWithDevice(final String str) {
        return C11234e.m40022P(new Callable() { // from class: cm.aptoide.pt.install.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f10080f.m8196a(str);
            }
        }).m40105p0(null).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.b
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10069f.m8200e(str, (PackageInfo) obj);
            }
        }).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.install.e
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }).m40083X0();
    }

    public Single<Boolean> isInstalled(String str, int i2) {
        return this.installedPersistence.isInstalled(str, i2);
    }

    public C11234e<List<RoomInstalled>> getAsList(String str) {
        return this.installedPersistence.getAllAsList(str);
    }

    public C11231b syncWithDevice() {
        C11234e c11234eM40060G = C11234e.m40022P(new Callable() { // from class: cm.aptoide.pt.install.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f10116f.m8201f();
            }
        }).m40066J(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.k
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                AptoideInstalledAppsRepository.lambda$syncWithDevice$6(list);
                return list;
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.j
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10191f.m8202g((PackageInfo) obj);
            }
        }).m40084Y0().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.f
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10099f.m8198c((List) obj);
            }
        });
        final RoomInstalledPersistence roomInstalledPersistence = this.installedPersistence;
        roomInstalledPersistence.getClass();
        return c11234eM40060G.m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.n2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return roomInstalledPersistence.replaceAllBy((List) obj);
            }
        }).m40083X0().m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.install.l
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f10207f.m8199d();
            }
        });
    }
}
