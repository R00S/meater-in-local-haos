package cm.aptoide.p092pt.install;

import cm.aptoide.p092pt.database.room.RoomInstallation;
import java.util.List;
import p456rx.C11231b;
import p456rx.C11234e;

/* loaded from: classes.dex */
public interface InstallationPersistence {
    C11234e<List<RoomInstallation>> getInstallationsHistory();

    C11231b insert(RoomInstallation roomInstallation);

    C11231b insertAll(List<RoomInstallation> list);
}
