package cm.aptoide.p092pt.database.room;

import java.util.List;
import p323h.p324a.AbstractC9076m;

/* loaded from: classes.dex */
public interface InstallationDao {
    AbstractC9076m<List<RoomInstallation>> getAll();

    void insert(RoomInstallation roomInstallation);

    void insertAll(List<RoomInstallation> list);
}
