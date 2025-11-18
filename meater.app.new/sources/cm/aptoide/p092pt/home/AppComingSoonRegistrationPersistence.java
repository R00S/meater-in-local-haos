package cm.aptoide.p092pt.home;

import cm.aptoide.p092pt.database.room.RoomAppComingSoonRegistration;
import p456rx.C11231b;
import p456rx.C11234e;

/* loaded from: classes.dex */
public interface AppComingSoonRegistrationPersistence {
    C11234e<Boolean> isRegisteredForApp(String str);

    C11231b registerForAppNotification(RoomAppComingSoonRegistration roomAppComingSoonRegistration);

    C11231b unregisterForAppNotification(RoomAppComingSoonRegistration roomAppComingSoonRegistration);
}
