package cm.aptoide.p092pt.database;

import cm.aptoide.p092pt.database.room.AppComingSoonRegistrationDAO;
import cm.aptoide.p092pt.database.room.RoomAppComingSoonRegistration;
import cm.aptoide.p092pt.home.AppComingSoonRegistrationPersistence;
import p319g.p320a.p321a.p322a.C9059d;
import p323h.p324a.EnumC9062a;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11256e;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class RoomAppComingSoonPersistence implements AppComingSoonRegistrationPersistence {
    private final AppComingSoonRegistrationDAO appComingSoonRegistrationDAO;

    public RoomAppComingSoonPersistence(AppComingSoonRegistrationDAO appComingSoonRegistrationDAO) {
        this.appComingSoonRegistrationDAO = appComingSoonRegistrationDAO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$registerForAppNotification$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7385a(RoomAppComingSoonRegistration roomAppComingSoonRegistration) {
        this.appComingSoonRegistrationDAO.save(roomAppComingSoonRegistration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$unregisterForAppNotification$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7386b(RoomAppComingSoonRegistration roomAppComingSoonRegistration) {
        this.appComingSoonRegistrationDAO.remove(roomAppComingSoonRegistration);
    }

    @Override // cm.aptoide.p092pt.home.AppComingSoonRegistrationPersistence
    public C11234e<Boolean> isRegisteredForApp(String str) {
        return C9059d.m29124b(this.appComingSoonRegistrationDAO.isRegisteredForApp(str), EnumC9062a.BUFFER).m40065I0(Schedulers.m40658io()).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.database.c
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() > 0);
            }
        });
    }

    @Override // cm.aptoide.p092pt.home.AppComingSoonRegistrationPersistence
    public C11231b registerForAppNotification(final RoomAppComingSoonRegistration roomAppComingSoonRegistration) {
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.database.b
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f8397f.m7385a(roomAppComingSoonRegistration);
            }
        }).m39967K(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.home.AppComingSoonRegistrationPersistence
    public C11231b unregisterForAppNotification(final RoomAppComingSoonRegistration roomAppComingSoonRegistration) {
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.database.a
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f8392f.m7386b(roomAppComingSoonRegistration);
            }
        }).m39967K(Schedulers.m40658io());
    }
}
