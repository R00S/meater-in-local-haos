package cm.aptoide.p092pt.notification;

import cm.aptoide.p092pt.database.room.RoomNotification;
import java.util.List;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class NotificationCenter {
    private NotificationAnalytics notificationAnalytics;
    private NotificationPolicyFactory notificationPolicyFactory;
    private NotificationProvider notificationProvider;
    private NotificationSyncScheduler notificationSyncScheduler;

    public NotificationCenter(NotificationProvider notificationProvider, NotificationSyncScheduler notificationSyncScheduler, NotificationPolicyFactory notificationPolicyFactory, NotificationAnalytics notificationAnalytics) {
        this.notificationSyncScheduler = notificationSyncScheduler;
        this.notificationProvider = notificationProvider;
        this.notificationPolicyFactory = notificationPolicyFactory;
        this.notificationAnalytics = notificationAnalytics;
    }

    static /* synthetic */ Iterable lambda$getNewNotifications$0(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getNewNotifications$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8311a(AptoideNotification aptoideNotification) {
        if (aptoideNotification.getType() != 7 && aptoideNotification.getType() != 8 && aptoideNotification.getType() != 9) {
            this.notificationAnalytics.sendPushNotificationReceivedEvent(aptoideNotification.getType(), aptoideNotification.getAbTestingGroup(), aptoideNotification.getCampaignId(), aptoideNotification.getUrl());
        }
        aptoideNotification.setProcessed(true);
        return this.notificationProvider.save(aptoideNotification).m39970O(aptoideNotification);
    }

    static /* synthetic */ C11234e lambda$getNewNotifications$3(AptoideNotification aptoideNotification, Boolean bool) {
        return bool.booleanValue() ? C11234e.m40025S(aptoideNotification) : C11234e.m40016B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getNewNotifications$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8312b(final AptoideNotification aptoideNotification) {
        return this.notificationPolicyFactory.getPolicy(aptoideNotification).shouldShow().m39922k(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.k
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return NotificationCenter.lambda$getNewNotifications$3(aptoideNotification, (Boolean) obj);
            }
        });
    }

    static /* synthetic */ C11234e lambda$getNewNotifications$5(Throwable th) {
        th.printStackTrace();
        return C11234e.m40016B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$notificationDismissed$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8313c(RoomNotification roomNotification) {
        roomNotification.setDismissed(System.currentTimeMillis());
        return this.notificationProvider.save(roomNotification);
    }

    static /* synthetic */ Iterable lambda$setAllNotificationsRead$8(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setAllNotificationsRead$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8314d(RoomNotification roomNotification) {
        if (roomNotification.getDismissed() != -1) {
            return C11231b.m39946e();
        }
        roomNotification.setDismissed(System.currentTimeMillis());
        return this.notificationProvider.save(roomNotification);
    }

    public C11234e<List<AptoideNotification>> getInboxNotifications(int i2) {
        return this.notificationProvider.getNotifications(i2);
    }

    public C11234e<AptoideNotification> getNewNotifications() {
        return this.notificationProvider.getAptoideNotifications().m40066J(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                NotificationCenter.lambda$getNewNotifications$0(list);
                return list;
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.m
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                AptoideNotification aptoideNotification = (AptoideNotification) obj;
                return Boolean.valueOf(!aptoideNotification.isProcessed());
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.e
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10371f.m8311a((AptoideNotification) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.l
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10410f.m8312b((AptoideNotification) obj);
            }
        }).m40104o0(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.f
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return NotificationCenter.lambda$getNewNotifications$5((Throwable) obj);
            }
        });
    }

    public C11234e<Boolean> haveNotifications() {
        return this.notificationProvider.getNotifications(1).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.g
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                return Boolean.valueOf(!list.isEmpty());
            }
        });
    }

    public C11231b notificationDismissed(Integer[] numArr) {
        return this.notificationProvider.getLastShowed(numArr).m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.j
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10397f.m8313c((RoomNotification) obj);
            }
        });
    }

    public C11231b setAllNotificationsRead() {
        return this.notificationProvider.getNotifications().m40057E().m40066J(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.h
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                NotificationCenter.lambda$setAllNotificationsRead$8(list);
                return list;
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.i
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10390f.m8314d((RoomNotification) obj);
            }
        }).m40083X0();
    }

    public void setup() {
        this.notificationSyncScheduler.schedule();
    }
}
