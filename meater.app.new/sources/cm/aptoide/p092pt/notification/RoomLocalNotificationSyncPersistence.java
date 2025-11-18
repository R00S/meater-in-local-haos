package cm.aptoide.p092pt.notification;

import cm.aptoide.p092pt.database.room.LocalNotificationSyncDao;
import cm.aptoide.p092pt.database.room.RoomLocalNotificationSync;
import cm.aptoide.p092pt.notification.sync.LocalNotificationSync;
import cm.aptoide.p092pt.sync.Sync;
import p319g.p320a.p321a.p322a.C9059d;
import p323h.p324a.EnumC9062a;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class RoomLocalNotificationSyncPersistence implements LocalNotificationSyncPersistence {
    private LocalNotificationSyncDao localNotificationSyncDao;
    private RoomLocalNotificationSyncMapper mapper;
    private NotificationProvider provider;

    public RoomLocalNotificationSyncPersistence(RoomLocalNotificationSyncMapper roomLocalNotificationSyncMapper, NotificationProvider notificationProvider, LocalNotificationSyncDao localNotificationSyncDao) {
        this.mapper = roomLocalNotificationSyncMapper;
        this.provider = notificationProvider;
        this.localNotificationSyncDao = localNotificationSyncDao;
    }

    static /* synthetic */ RoomLocalNotificationSync lambda$get$0(Throwable th) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$get$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Sync m8347a(RoomLocalNotificationSync roomLocalNotificationSync) {
        if (roomLocalNotificationSync != null) {
            return this.mapper.map(roomLocalNotificationSync, this.provider);
        }
        return null;
    }

    @Override // cm.aptoide.p092pt.notification.LocalNotificationSyncPersistence
    public C11234e<Sync> get(String str) {
        return C9059d.m29124b(this.localNotificationSyncDao.get(str), EnumC9062a.BUFFER).m40065I0(Schedulers.m40658io()).m40105p0(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.d1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                RoomLocalNotificationSyncPersistence.lambda$get$0((Throwable) obj);
                return null;
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.c1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10362f.m8347a((RoomLocalNotificationSync) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.notification.LocalNotificationSyncPersistence
    public void remove(String str) {
        this.localNotificationSyncDao.delete(str);
    }

    @Override // cm.aptoide.p092pt.notification.LocalNotificationSyncPersistence
    public void save(LocalNotificationSync localNotificationSync) {
        this.localNotificationSyncDao.save(this.mapper.map(localNotificationSync));
    }
}
