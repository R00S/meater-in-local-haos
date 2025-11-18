package cm.aptoide.analytics;

import cm.aptoide.analytics.AnalyticsManager;
import java.util.Map;

/* loaded from: classes.dex */
public interface EventLogger {
    void log(String str, Map<String, Object> map, AnalyticsManager.Action action, String str2);

    void setup();
}
