package cm.aptoide.p092pt.database.room;

import java.util.List;
import p323h.p324a.AbstractC9076m;
import p323h.p324a.AbstractC9082s;

/* loaded from: classes.dex */
public interface DownloadDAO {
    AbstractC9076m<List<RoomDownload>> getAll();

    AbstractC9076m<List<RoomDownload>> getAsList(String str);

    AbstractC9076m<RoomDownload> getAsObservable(String str);

    AbstractC9082s<RoomDownload> getAsSingle(String str);

    AbstractC9076m<List<RoomDownload>> getInQueueSortedDownloads();

    AbstractC9076m<List<RoomDownload>> getOutOfSpaceDownloads();

    AbstractC9076m<List<RoomDownload>> getRunningDownloads();

    void insert(RoomDownload roomDownload);

    void insertAll(List<RoomDownload> list);

    void remove(String str);

    void remove(String str, int i2);
}
