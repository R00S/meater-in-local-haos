package cm.aptoide.p092pt.database.room;

import com.google.gson.C8566e;
import com.google.gson.p219u.C8619a;
import java.util.List;

/* loaded from: classes.dex */
class CampaignUrlTypeConverter {
    CampaignUrlTypeConverter() {
    }

    public static List<RoomCampaignUrl> restoreCampaignUrlList(String str) {
        return (List) new C8566e().m26925i(str, new C8619a<List<RoomCampaignUrl>>() { // from class: cm.aptoide.pt.database.room.CampaignUrlTypeConverter.1
        }.getType());
    }

    public static String saveCampaignUrlList(List<RoomCampaignUrl> list) {
        return new C8566e().m26932q(list);
    }
}
