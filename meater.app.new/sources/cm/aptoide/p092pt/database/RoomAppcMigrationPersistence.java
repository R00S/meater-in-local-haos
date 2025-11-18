package cm.aptoide.p092pt.database;

import cm.aptoide.p092pt.app.migration.AppcMigrationPersistence;
import cm.aptoide.p092pt.database.room.MigratedAppDAO;
import cm.aptoide.p092pt.database.room.RoomMigratedApp;
import p319g.p320a.p321a.p322a.C9059d;
import p323h.p324a.EnumC9062a;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class RoomAppcMigrationPersistence implements AppcMigrationPersistence {
    private MigratedAppDAO migratedAppDAO;

    public RoomAppcMigrationPersistence(MigratedAppDAO migratedAppDAO) {
        this.migratedAppDAO = migratedAppDAO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$insert$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7387a(String str) {
        this.migratedAppDAO.save(new RoomMigratedApp(str));
    }

    @Override // cm.aptoide.p092pt.app.migration.AppcMigrationPersistence
    public void insert(final String str) {
        new Thread(new Runnable() { // from class: cm.aptoide.pt.database.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f8407f.m7387a(str);
            }
        }).start();
    }

    @Override // cm.aptoide.p092pt.app.migration.AppcMigrationPersistence
    public C11234e<Boolean> isAppMigrated(String str) {
        return C9059d.m29124b(this.migratedAppDAO.isAppMigrated(str), EnumC9062a.BUFFER).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.database.e
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() > 0);
            }
        }).m40065I0(Schedulers.m40658io());
    }
}
