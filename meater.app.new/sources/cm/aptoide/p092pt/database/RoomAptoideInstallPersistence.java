package cm.aptoide.p092pt.database;

import cm.aptoide.p092pt.database.room.AptoideInstallDao;
import cm.aptoide.p092pt.database.room.RoomAptoideInstallApp;
import cm.aptoide.p092pt.install.AptoideInstallPersistence;
import p319g.p320a.p321a.p322a.C9059d;
import p456rx.Single;
import p456rx.p460m.InterfaceC11256e;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class RoomAptoideInstallPersistence implements AptoideInstallPersistence {
    private final AptoideInstallDao aptoideInstallDao;

    public RoomAptoideInstallPersistence(AptoideInstallDao aptoideInstallDao) {
        this.aptoideInstallDao = aptoideInstallDao;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$insert$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7388a(String str) {
        this.aptoideInstallDao.insert(new RoomAptoideInstallApp(str));
    }

    @Override // cm.aptoide.p092pt.install.AptoideInstallPersistence
    public void insert(final String str) {
        new Thread(new Runnable() { // from class: cm.aptoide.pt.database.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f8415f.m7388a(str);
            }
        }).start();
    }

    @Override // cm.aptoide.p092pt.install.AptoideInstallPersistence
    public Single<Boolean> isInstalledWithAptoide(String str) {
        return C9059d.m29126d(this.aptoideInstallDao.get(str)).m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.database.g
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.TRUE;
            }
        }).m39926r(new InterfaceC11256e() { // from class: cm.aptoide.pt.database.h
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.FALSE;
            }
        }).m39930v(Schedulers.m40658io());
    }
}
