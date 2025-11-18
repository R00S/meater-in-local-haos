package cm.aptoide.p092pt.notification;

import cm.aptoide.p092pt.database.RoomNotificationPersistence;
import cm.aptoide.p092pt.database.room.RoomNotification;
import java.util.List;
import p456rx.AbstractC11243h;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class NotificationProvider {
    private final RoomNotificationPersistence roomNotificationPersistence;
    private final AbstractC11243h scheduler;

    public NotificationProvider(RoomNotificationPersistence roomNotificationPersistence, AbstractC11243h abstractC11243h) {
        this.scheduler = abstractC11243h;
        this.roomNotificationPersistence = roomNotificationPersistence;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: convertToAptoideNotification, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AptoideNotification m8319e(RoomNotification roomNotification) {
        return new AptoideNotification(roomNotification.getBody(), roomNotification.getImg(), roomNotification.getTitle(), roomNotification.getUrl(), roomNotification.getType(), roomNotification.getAppName(), roomNotification.getGraphic(), roomNotification.getDismissed(), roomNotification.getOwnerId(), roomNotification.getUrlTrack(), roomNotification.getNotificationCenterUrlTrack(), roomNotification.isProcessed(), roomNotification.getTimeStamp(), roomNotification.getExpire(), roomNotification.getAbTestingGroup(), roomNotification.getCampaignId(), roomNotification.getLang(), roomNotification.getActionStringRes(), roomNotification.getWhitelistedPackages());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: convertToNotification, reason: merged with bridge method [inline-methods] */
    public RoomNotification m8321g(AptoideNotification aptoideNotification) {
        return new RoomNotification(aptoideNotification.getExpire(), aptoideNotification.getAbTestingGroup(), aptoideNotification.getBody(), aptoideNotification.getCampaignId(), aptoideNotification.getImg(), aptoideNotification.getLang(), aptoideNotification.getTitle(), aptoideNotification.getUrl(), aptoideNotification.getUrlTrack(), aptoideNotification.getNotificationCenterUrlTrack(), aptoideNotification.getTimeStamp(), aptoideNotification.getType(), aptoideNotification.getDismissed(), aptoideNotification.getAppName(), aptoideNotification.getGraphic(), aptoideNotification.getOwnerId(), aptoideNotification.isProcessed(), aptoideNotification.getActionStringRes(), aptoideNotification.getWhitelistedPackages());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getAptoideNotifications$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8316b(List list) {
        return C11234e.m40020N(list).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.q
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10447f.m8315a((RoomNotification) obj);
            }
        }).m40084Y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getDismissedNotifications$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8318d(List list) {
        return C11234e.m40020N(list).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.o
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10434f.m8317c((RoomNotification) obj);
            }
        }).m40084Y0().m40085Z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getNotifications$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8320f(int i2, List list) {
        return C11234e.m40020N(list).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.r
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10450f.m8319e((RoomNotification) obj);
            }
        }).m40073N0(i2).m40084Y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$save$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8322h(List list) {
        return this.roomNotificationPersistence.insertAll(list);
    }

    public C11231b deleteAllForType(int i2) {
        return this.roomNotificationPersistence.deleteAllOfType(i2);
    }

    public C11234e<List<AptoideNotification>> getAptoideNotifications() {
        return this.roomNotificationPersistence.getAll().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.u
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10462f.m8316b((List) obj);
            }
        });
    }

    public Single<List<AptoideNotification>> getDismissedNotifications(Integer[] numArr, long j2, long j3) {
        return this.roomNotificationPersistence.getDismissed(numArr, j2, j3).m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.p
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10438f.m8318d((List) obj);
            }
        });
    }

    public Single<RoomNotification> getLastShowed(Integer[] numArr) {
        return this.roomNotificationPersistence.getLastShowed(numArr);
    }

    public C11234e<List<AptoideNotification>> getNotifications(final int i2) {
        return this.roomNotificationPersistence.getAllSortedDesc().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.n
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10429f.m8320f(i2, (List) obj);
            }
        });
    }

    public C11231b save(List<AptoideNotification> list) {
        return C11234e.m40020N(list).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.t
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10459f.m8321g((AptoideNotification) obj);
            }
        }).m40084Y0().m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.s
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10454f.m8322h((List) obj);
            }
        }).m40083X0();
    }

    public C11234e<List<RoomNotification>> getNotifications() {
        return this.roomNotificationPersistence.getAll();
    }

    public C11231b save(RoomNotification roomNotification) {
        return this.roomNotificationPersistence.insert(roomNotification).m39967K(this.scheduler);
    }

    public C11231b save(AptoideNotification aptoideNotification) {
        return save(lambda$save$2(aptoideNotification));
    }
}
