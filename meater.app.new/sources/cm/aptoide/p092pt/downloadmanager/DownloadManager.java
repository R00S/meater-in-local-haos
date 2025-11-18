package cm.aptoide.p092pt.downloadmanager;

import cm.aptoide.p092pt.database.room.RoomDownload;
import java.util.List;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;

/* loaded from: classes.dex */
public interface DownloadManager {
    C11231b cancelDownload(String str);

    C11234e<List<RoomDownload>> getCurrentActiveDownloads();

    C11234e<RoomDownload> getCurrentInProgressDownload();

    C11234e<RoomDownload> getDownloadAsObservable(String str);

    Single<RoomDownload> getDownloadAsSingle(String str);

    C11234e<RoomDownload> getDownloadsByMd5(String str);

    C11234e<List<RoomDownload>> getDownloadsList();

    C11231b invalidateDatabase();

    C11231b pauseAllDownloads();

    C11231b pauseDownload(String str);

    void start();

    C11231b startDownload(RoomDownload roomDownload);

    void stop();
}
