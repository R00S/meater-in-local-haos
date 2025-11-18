package cm.aptoide.p092pt.database.room;

import com.google.gson.C8566e;
import com.google.gson.p219u.C8619a;
import java.util.List;

/* loaded from: classes.dex */
public class FileToDownloadTypeConverter {
    public static List<RoomFileToDownload> restoreFileToDownloadList(String str) {
        return (List) new C8566e().m26925i(str, new C8619a<List<RoomFileToDownload>>() { // from class: cm.aptoide.pt.database.room.FileToDownloadTypeConverter.1
        }.getType());
    }

    public static String saveFileToDownloadList(List<RoomFileToDownload> list) {
        return new C8566e().m26932q(list);
    }
}
