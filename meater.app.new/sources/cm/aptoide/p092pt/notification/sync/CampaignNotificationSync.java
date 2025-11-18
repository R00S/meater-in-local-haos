package cm.aptoide.p092pt.notification.sync;

import cm.aptoide.p092pt.notification.AptoideNotification;
import cm.aptoide.p092pt.notification.NotificationProvider;
import cm.aptoide.p092pt.notification.NotificationService;
import cm.aptoide.p092pt.sync.Sync;
import java.util.List;
import p456rx.C11231b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class CampaignNotificationSync extends Sync {
    private final NotificationService networkService;
    private final NotificationProvider provider;

    public CampaignNotificationSync(String str, NotificationService notificationService, NotificationProvider notificationProvider, boolean z, boolean z2, long j2, long j3) {
        super(str, z, z2, j3, j2);
        this.networkService = notificationService;
        this.provider = notificationProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$execute$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8379a(List list) {
        return this.provider.save((List<AptoideNotification>) list);
    }

    @Override // cm.aptoide.p092pt.sync.Sync
    public C11231b execute() {
        return this.networkService.getCampaignNotifications().m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.notification.sync.a
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10458f.m8379a((List) obj);
            }
        });
    }
}
