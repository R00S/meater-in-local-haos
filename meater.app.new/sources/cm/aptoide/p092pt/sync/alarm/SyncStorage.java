package cm.aptoide.p092pt.sync.alarm;

import cm.aptoide.p092pt.notification.LocalNotificationSyncPersistence;
import cm.aptoide.p092pt.notification.sync.LocalNotificationSync;
import cm.aptoide.p092pt.sync.Sync;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p456rx.C11231b;
import p456rx.p460m.InterfaceC11252a;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class SyncStorage {
    private final LocalNotificationSyncPersistence persistence;
    private final Map<String, Sync> syncs;

    public SyncStorage(Map<String, Sync> map, LocalNotificationSyncPersistence localNotificationSyncPersistence) {
        this.syncs = map;
        this.persistence = localNotificationSyncPersistence;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$remove$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8857a(String str) {
        if (str.equals(LocalNotificationSync.APPC_CAMPAIGN_NOTIFICATION)) {
            this.persistence.remove(str);
        }
        this.syncs.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$save$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8858b(Sync sync) {
        if (sync instanceof LocalNotificationSync) {
            this.persistence.save((LocalNotificationSync) sync);
        }
        this.syncs.put(sync.getId(), sync);
    }

    public Sync get(String str) {
        return (str.equals(LocalNotificationSync.APPC_CAMPAIGN_NOTIFICATION) || str.equals(LocalNotificationSync.NEW_FEATURE)) ? this.persistence.get(str).m40081W0().m40551b() : this.syncs.get(str);
    }

    public List<Sync> getAll() {
        return new ArrayList(this.syncs.values());
    }

    public void remove(final String str) {
        C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.sync.alarm.b
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11503f.m8857a(str);
            }
        }).m39967K(Schedulers.m40658io()).m39964H();
    }

    public void save(final Sync sync) {
        C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.sync.alarm.a
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f11501f.m8858b(sync);
            }
        }).m39967K(Schedulers.m40658io()).m39964H();
    }
}
