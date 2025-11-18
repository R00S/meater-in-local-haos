package cm.aptoide.p092pt.database.room;

import java.util.List;
import p323h.p324a.AbstractC9076m;

/* loaded from: classes.dex */
public interface EventDAO {
    void delete(RoomEvent roomEvent);

    AbstractC9076m<List<RoomEvent>> getAll();

    void insert(RoomEvent roomEvent);
}
