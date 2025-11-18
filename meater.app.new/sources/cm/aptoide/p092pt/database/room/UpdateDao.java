package cm.aptoide.p092pt.database.room;

import java.util.List;
import p323h.p324a.AbstractC9076m;
import p323h.p324a.AbstractC9082s;

/* loaded from: classes.dex */
public interface UpdateDao {
    void deleteAll(List<RoomUpdate> list);

    void deleteByPackageName(String str);

    AbstractC9082s<RoomUpdate> get(String str);

    AbstractC9082s<List<RoomUpdate>> getAllByExcluded(boolean z);

    AbstractC9076m<List<RoomUpdate>> getAllByExcludedSorted(boolean z);

    AbstractC9082s<RoomUpdate> getByPackageAndExcluded(String str, boolean z);

    void insert(RoomUpdate roomUpdate);

    void insertAll(List<RoomUpdate> list);
}
