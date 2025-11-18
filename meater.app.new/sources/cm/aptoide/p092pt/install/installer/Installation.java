package cm.aptoide.p092pt.install.installer;

import cm.aptoide.p092pt.database.room.RoomFileToDownload;
import java.io.File;
import java.util.List;
import p456rx.C11231b;

/* loaded from: classes.dex */
public interface Installation {
    File getFile();

    List<RoomFileToDownload> getFiles();

    String getId();

    String getPackageName();

    int getStatus();

    int getType();

    int getVersionCode();

    String getVersionName();

    C11231b save();

    C11231b saveFileChanges();

    void setStatus(int i2);

    void setType(int i2);
}
