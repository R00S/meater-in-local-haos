package cm.aptoide.p092pt.dataprovider.p097ws.p100v3;

import android.content.SharedPreferences;
import android.text.TextUtils;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.networking.BodyInterceptorV3;
import cm.aptoide.p092pt.preferences.managed.ManagerPreferences;
import p456rx.C11234e;

/* loaded from: classes.dex */
public class PushNotificationsRequest extends AbstractC2225V3<GetPushNotificationsResponse> {
    protected PushNotificationsRequest(BaseBody baseBody, BodyInterceptor<BaseBody> bodyInterceptor, TokenInvalidator tokenInvalidator) {
        super("https://webservices.aptoide.com/webservices/3/", baseBody, bodyInterceptor, tokenInvalidator);
    }

    /* renamed from: of */
    public static PushNotificationsRequest m7433of(SharedPreferences sharedPreferences, String str, BodyInterceptor<BaseBody> bodyInterceptor, TokenInvalidator tokenInvalidator, int i2, int i3, String str2) {
        BaseBody baseBody = new BaseBody();
        baseBody.put("oem_id", str);
        baseBody.put("mode", BodyInterceptorV3.RESPONSE_MODE_JSON);
        baseBody.put("limit", "1");
        baseBody.put("lang", str2);
        if (ManagerPreferences.isDebug(sharedPreferences)) {
            String notificationType = ManagerPreferences.getNotificationType(sharedPreferences);
            if (TextUtils.isEmpty(notificationType)) {
                notificationType = "aptoide_tests";
            }
            baseBody.put("notification_type", notificationType);
        } else {
            baseBody.put("notification_type", "aptoide_vanilla");
        }
        baseBody.put(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, String.valueOf(i3));
        baseBody.put("aptoide_vercode", Integer.toString(i2));
        return new PushNotificationsRequest(baseBody, bodyInterceptor, tokenInvalidator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.dataprovider.WebService
    public C11234e<GetPushNotificationsResponse> loadDataFromNetwork(Service service, boolean z) {
        return service.getPushNotifications(this.map, z);
    }
}
