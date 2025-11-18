package cm.aptoide.p092pt.downloadmanager;

import cm.aptoide.p092pt.database.room.RoomFileToDownload;

/* loaded from: classes.dex */
public interface PathProvider {
    String getFilePathFromFileType(RoomFileToDownload roomFileToDownload);
}
