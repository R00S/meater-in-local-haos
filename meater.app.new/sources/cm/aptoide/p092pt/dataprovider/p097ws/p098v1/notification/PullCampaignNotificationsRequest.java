package cm.aptoide.p092pt.dataprovider.p097ws.p098v1.notification;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import cm.aptoide.p092pt.dataprovider.model.p093v1.GetPullNotificationsResponse;
import cm.aptoide.p092pt.dataprovider.p097ws.p098v1.PnpV1WebService;
import cm.aptoide.p092pt.dataprovider.p097ws.p098v1.Service;
import cm.aptoide.p092pt.preferences.toolbox.ToolboxManager;
import cm.aptoide.p092pt.utils.AptoideUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class PullCampaignNotificationsRequest extends PnpV1WebService<List<GetPullNotificationsResponse>> {

    /* renamed from: id */
    private final String f8545id;
    private final Map<String, String> options;

    protected PullCampaignNotificationsRequest(String str, Map<String, String> map, OkHttpClient okHttpClient, Converter.Factory factory, SharedPreferences sharedPreferences) {
        super(okHttpClient, factory, sharedPreferences);
        this.options = map;
        this.f8545id = str;
    }

    /* renamed from: of */
    public static PullCampaignNotificationsRequest m7424of(String str, String str2, String str3, OkHttpClient okHttpClient, Converter.Factory factory, String str4, SharedPreferences sharedPreferences, Resources resources) {
        HashMap map = new HashMap();
        map.put("language", AptoideUtils.SystemU.getCountryCode(resources));
        map.put("aptoide_version", str2);
        if (!TextUtils.isEmpty(str4)) {
            map.put("oem_id", str4);
        }
        map.put("aptoide_package", str3);
        if (ToolboxManager.isDebug(sharedPreferences)) {
            map.put("debug", "true");
        }
        return new PullCampaignNotificationsRequest(str, map, okHttpClient, factory, sharedPreferences);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<List<GetPullNotificationsResponse>> loadDataFromNetwork(Service service, boolean z) {
        return service.getPullCampaignNotifications(this.f8545id, this.options, true);
    }
}
