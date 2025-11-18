package cm.aptoide.p092pt.updates;

import cm.aptoide.p092pt.database.room.RoomUpdate;
import java.util.List;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;

/* loaded from: classes.dex */
public interface UpdatePersistence {
    Single<Boolean> contains(String str, boolean z);

    Single<RoomUpdate> get(String str);

    Single<List<RoomUpdate>> getAll(boolean z);

    C11234e<List<RoomUpdate>> getAllSorted(boolean z);

    Single<Boolean> isExcluded(String str);

    C11231b remove(String str);

    C11231b removeAll(List<RoomUpdate> list);

    C11231b save(RoomUpdate roomUpdate);

    C11231b saveAll(List<RoomUpdate> list);
}
