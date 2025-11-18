package cm.aptoide.p092pt.downloadmanager;

import cm.aptoide.p092pt.database.room.RoomDownload;
import java.util.List;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;

/* loaded from: classes.dex */
public interface DownloadPersistence {
    C11231b delete(String str);

    C11231b delete(String str, int i2);

    C11234e<List<RoomDownload>> getAll();

    C11234e<List<RoomDownload>> getAsList(String str);

    C11234e<RoomDownload> getAsObservable(String str);

    Single<RoomDownload> getAsSingle(String str);

    C11234e<List<RoomDownload>> getInQueueSortedDownloads();

    C11234e<List<RoomDownload>> getOutOfSpaceDownloads();

    C11234e<List<RoomDownload>> getRunningDownloads();

    C11231b save(RoomDownload roomDownload);
}
