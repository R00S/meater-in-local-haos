package cm.aptoide.p092pt.database.room;

import java.util.List;
import p323h.p324a.AbstractC9064b;
import p323h.p324a.AbstractC9076m;
import p323h.p324a.AbstractC9082s;

/* loaded from: classes.dex */
public interface InstalledDao {
    AbstractC9076m<RoomInstalled> get(String str, int i2);

    AbstractC9076m<List<RoomInstalled>> getAll();

    AbstractC9076m<List<RoomInstalled>> getAllFilteringSystemApps();

    AbstractC9076m<List<RoomInstalled>> getAllSortedAsc();

    AbstractC9076m<List<RoomInstalled>> getAsList(String str, int i2);

    AbstractC9076m<List<RoomInstalled>> getAsListByPackageName(String str);

    void insert(RoomInstalled roomInstalled);

    void insertAll(List<RoomInstalled> list);

    AbstractC9082s<RoomInstalled> isInstalledByVersion(String str, int i2);

    AbstractC9064b remove(String str);

    AbstractC9064b remove(String str, int i2);

    void removeAll();
}
