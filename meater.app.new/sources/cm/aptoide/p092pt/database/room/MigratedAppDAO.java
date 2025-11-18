package cm.aptoide.p092pt.database.room;

import p323h.p324a.AbstractC9076m;

/* loaded from: classes.dex */
public interface MigratedAppDAO {
    AbstractC9076m<Integer> isAppMigrated(String str);

    void save(RoomMigratedApp roomMigratedApp);
}
