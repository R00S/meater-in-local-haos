package cm.aptoide.p092pt.store;

import cm.aptoide.p092pt.database.room.RoomStore;
import java.util.List;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;

/* loaded from: classes.dex */
public interface StorePersistence {
    Single<RoomStore> get(long j2);

    Single<RoomStore> get(String str);

    C11234e<List<RoomStore>> getAll();

    C11234e<Boolean> isSubscribed(long j2);

    C11231b remove(String str);

    C11231b save(RoomStore roomStore);

    C11231b saveAll(List<RoomStore> list);
}
