package cm.aptoide.p092pt.dataprovider.p097ws.p098v1;

import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.dataprovider.WebService;
import cm.aptoide.p092pt.dataprovider.model.p093v1.GetPullNotificationsResponse;
import java.util.List;
import java.util.Map;
import p456rx.C11234e;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/* loaded from: classes.dex */
public interface Service {
    @GET("notifications/{id}/campaigns")
    C11234e<List<GetPullNotificationsResponse>> getPullCampaignNotifications(@Path(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID) String str, @QueryMap Map<String, String> map, @Header(WebService.BYPASS_HEADER_KEY) boolean z);
}
