package cm.aptoide.p092pt.downloadmanager;

import cm.aptoide.p092pt.database.room.RoomDownload;

/* loaded from: classes.dex */
public class DownloadAppMapper {
    private DownloadAppFileMapper downloadAppFileMapper;

    public DownloadAppMapper(DownloadAppFileMapper downloadAppFileMapper) {
        this.downloadAppFileMapper = downloadAppFileMapper;
    }

    public DownloadApp mapDownload(RoomDownload roomDownload) {
        return new DownloadApp(roomDownload.getPackageName(), roomDownload.getVersionCode(), this.downloadAppFileMapper.mapFileToDownloadList(roomDownload.getFilesToDownload()), roomDownload.getMd5(), roomDownload.getSize(), roomDownload.getAttributionId());
    }
}
