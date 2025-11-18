package cm.aptoide.p092pt.downloadmanager;

import cm.aptoide.p092pt.database.room.RoomDownload;
import java.util.List;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class DownloadsRepository {
    private final DownloadPersistence downloadPersistence;

    public DownloadsRepository(DownloadPersistence downloadPersistence) {
        this.downloadPersistence = downloadPersistence;
    }

    public C11234e<List<RoomDownload>> getAllDownloads() {
        return this.downloadPersistence.getAll();
    }

    public C11234e<List<RoomDownload>> getCurrentActiveDownloads() {
        return this.downloadPersistence.getRunningDownloads();
    }

    public C11234e<RoomDownload> getDownloadAsObservable(String str) {
        return this.downloadPersistence.getAsObservable(str);
    }

    public Single<RoomDownload> getDownloadAsSingle(String str) {
        return this.downloadPersistence.getAsSingle(str);
    }

    public C11234e<List<RoomDownload>> getDownloadListByMd5(String str) {
        return this.downloadPersistence.getAsList(str);
    }

    public C11234e<List<RoomDownload>> getDownloadsInProgress() {
        return this.downloadPersistence.getRunningDownloads();
    }

    public C11234e<List<RoomDownload>> getInProgressDownloadsList() {
        return this.downloadPersistence.getRunningDownloads().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.p1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return C11234e.m40020N((List) obj).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.downloadmanager.o1
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj2) {
                        RoomDownload roomDownload = (RoomDownload) obj2;
                        return Boolean.valueOf(roomDownload.getOverallDownloadStatus() == 5 || roomDownload.getOverallDownloadStatus() == 4);
                    }
                }).m40084Y0();
            }
        });
    }

    public C11234e<List<RoomDownload>> getInQueueDownloads() {
        return this.downloadPersistence.getInQueueSortedDownloads();
    }

    public C11234e<List<RoomDownload>> getOutOfSpaceDownloads() {
        return this.downloadPersistence.getOutOfSpaceDownloads();
    }

    public C11231b remove(String str) {
        return this.downloadPersistence.delete(str);
    }

    public C11231b save(RoomDownload roomDownload) {
        return this.downloadPersistence.save(roomDownload);
    }

    public C11231b remove(String str, int i2) {
        return this.downloadPersistence.delete(str, i2);
    }
}
