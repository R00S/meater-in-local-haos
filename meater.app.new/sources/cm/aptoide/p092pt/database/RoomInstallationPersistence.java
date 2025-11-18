package cm.aptoide.p092pt.database;

import cm.aptoide.p092pt.database.room.InstallationDao;
import cm.aptoide.p092pt.database.room.RoomInstallation;
import cm.aptoide.p092pt.install.InstallationPersistence;
import java.util.List;
import p319g.p320a.p321a.p322a.C9059d;
import p323h.p324a.EnumC9062a;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11252a;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class RoomInstallationPersistence implements InstallationPersistence {
    private InstallationDao installationDao;

    public RoomInstallationPersistence(InstallationDao installationDao) {
        this.installationDao = installationDao;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$insert$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7399a(RoomInstallation roomInstallation) {
        this.installationDao.insert(roomInstallation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$insertAll$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7400b(List list) {
        this.installationDao.insertAll(list);
    }

    @Override // cm.aptoide.p092pt.install.InstallationPersistence
    public C11234e<List<RoomInstallation>> getInstallationsHistory() {
        return C9059d.m29124b(this.installationDao.getAll(), EnumC9062a.BUFFER).m40065I0(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.install.InstallationPersistence
    public C11231b insert(final RoomInstallation roomInstallation) {
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.database.a0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f8394f.m7399a(roomInstallation);
            }
        }).m39967K(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.install.InstallationPersistence
    public C11231b insertAll(final List<RoomInstallation> list) {
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.database.b0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f8399f.m7400b(list);
            }
        }).m39967K(Schedulers.m40658io());
    }
}
