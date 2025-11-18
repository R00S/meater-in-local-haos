package cm.aptoide.p092pt.install;

import cm.aptoide.p092pt.database.room.RoomInstalled;
import java.util.List;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;

/* loaded from: classes.dex */
public interface InstalledPersistence {
    C11234e<RoomInstalled> get(String str, int i2);

    C11234e<List<RoomInstalled>> getAll();

    C11234e<List<RoomInstalled>> getAllAsList(String str);

    C11234e<List<RoomInstalled>> getAllInstalled();

    C11234e<List<RoomInstalled>> getAllInstalledSorted();

    C11234e<List<RoomInstalled>> getAllInstalling();

    C11234e<List<RoomInstalled>> getAsList(String str, int i2);

    C11234e<RoomInstalled> getInstalled(String str);

    C11234e<List<RoomInstalled>> getInstalledFilteringSystemApps();

    C11231b insert(RoomInstalled roomInstalled);

    Single<Boolean> isInstalled(String str, int i2);

    C11234e<Boolean> isInstalled(String str);

    C11231b remove(String str, int i2);

    C11231b replaceAllBy(List<RoomInstalled> list);
}
