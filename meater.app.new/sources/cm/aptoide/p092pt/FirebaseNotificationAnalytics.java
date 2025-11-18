package cm.aptoide.p092pt;

import cm.aptoide.analytics.AnalyticsManager;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C10773s;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C10808p0;
import kotlin.collections.C10810q0;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: FirebaseNotificationAnalytics.kt */
@Metadata(m32266d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JW\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u0006\"\u0004\b\u0000\u0010\u0007\"\b\b\u0001\u0010\b*\u00020\u00012.\u0010\t\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u0002H\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\b0\u000b0\n\"\u0010\u0012\u0004\u0012\u0002H\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\b0\u000b¢\u0006\u0002\u0010\fJ(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010J0\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m32267d2 = {"Lcm/aptoide/pt/FirebaseNotificationAnalytics;", HttpUrl.FRAGMENT_ENCODE_SET, "analyticsManager", "Lcm/aptoide/analytics/AnalyticsManager;", "(Lcm/aptoide/analytics/AnalyticsManager;)V", "mapOfNonNull", HttpUrl.FRAGMENT_ENCODE_SET, "K", "V", "pairs", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/Pair;", "([Lkotlin/Pair;)Ljava/util/Map;", "sendFirebaseNotificationOpened", HttpUrl.FRAGMENT_ENCODE_SET, "messageId", HttpUrl.FRAGMENT_ENCODE_SET, "messageName", "messageDeviceTime", HttpUrl.FRAGMENT_ENCODE_SET, FirebaseNotificationAnalytics.P_LABEL, "sendFirebaseNotificationReceived", "hasNotificationPermissions", HttpUrl.FRAGMENT_ENCODE_SET, "Companion", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class FirebaseNotificationAnalytics {
    public static final String NOTIFICATION_OPEN = "vanilla_notification_open";
    public static final String NOTIFICATION_RECEIVE = "vanilla_notification_receive";
    private static final String P_LABEL = "label";
    private static final String P_MESSAGE_DEVICE_TIME = "message_device_time";
    private static final String P_MESSAGE_ID = "message_id";
    private static final String P_MESSAGE_NAME = "message_name";
    private static final String P_STATUS = "status";
    private final AnalyticsManager analyticsManager;

    public FirebaseNotificationAnalytics(AnalyticsManager analyticsManager) {
        C9801m.m32346f(analyticsManager, "analyticsManager");
        this.analyticsManager = analyticsManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> Map<K, V> mapOfNonNull(Pair<? extends K, ? extends V>... pairArr) {
        C9801m.m32346f(pairArr, "pairs");
        Map mapM38800l = C10810q0.m38800l((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, V> entry : mapM38800l.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C10808p0.m38793e(linkedHashMap.size()));
        Iterator<T> it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Object key = entry2.getKey();
            Object value = entry2.getValue();
            if (value == null) {
                throw new NullPointerException("null cannot be cast to non-null type V of cm.aptoide.pt.FirebaseNotificationAnalytics.mapOfNonNull$lambda-1");
            }
            linkedHashMap2.put(key, value);
        }
        return linkedHashMap2;
    }

    public final void sendFirebaseNotificationOpened(String messageId, String messageName, long messageDeviceTime, String label) {
        C9801m.m32346f(messageId, "messageId");
        C9801m.m32346f(messageName, "messageName");
        this.analyticsManager.logEvent(mapOfNonNull(C10773s.m38547a(P_MESSAGE_ID, messageId), C10773s.m38547a(P_MESSAGE_NAME, messageName), C10773s.m38547a(P_MESSAGE_DEVICE_TIME, Long.valueOf(messageDeviceTime)), C10773s.m38547a(P_LABEL, label)), NOTIFICATION_OPEN, AnalyticsManager.Action.AUTO, "notification");
    }

    public final void sendFirebaseNotificationReceived(String messageId, String messageName, long messageDeviceTime, String label, boolean hasNotificationPermissions) {
        C9801m.m32346f(messageId, "messageId");
        C9801m.m32346f(messageName, "messageName");
        AnalyticsManager analyticsManager = this.analyticsManager;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = C10773s.m38547a(P_MESSAGE_ID, messageId);
        pairArr[1] = C10773s.m38547a(P_MESSAGE_NAME, messageName);
        pairArr[2] = C10773s.m38547a(P_MESSAGE_DEVICE_TIME, Long.valueOf(messageDeviceTime));
        pairArr[3] = C10773s.m38547a(P_LABEL, label);
        pairArr[4] = C10773s.m38547a(P_STATUS, hasNotificationPermissions ? "impression" : "no_permission");
        analyticsManager.logEvent(mapOfNonNull(pairArr), NOTIFICATION_RECEIVE, AnalyticsManager.Action.AUTO, "notification");
    }
}
