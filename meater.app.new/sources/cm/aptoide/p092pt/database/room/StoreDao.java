package cm.aptoide.p092pt.database.room;

import java.util.List;
import p323h.p324a.AbstractC9076m;
import p323h.p324a.AbstractC9082s;

/* loaded from: classes.dex */
public interface StoreDao {
    AbstractC9076m<List<RoomStore>> getAll();

    AbstractC9082s<RoomStore> getByStoreId(long j2);

    AbstractC9082s<RoomStore> getByStoreName(String str);

    void insert(RoomStore roomStore);

    AbstractC9076m<Integer> isSubscribed(long j2);

    void removeByStoreName(String str);

    void saveAll(List<RoomStore> list);
}
