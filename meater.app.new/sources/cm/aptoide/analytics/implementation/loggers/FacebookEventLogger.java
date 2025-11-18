package cm.aptoide.analytics.implementation.loggers;

import android.os.Bundle;
import cm.aptoide.analytics.AnalyticsLogger;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.EventLogger;
import com.facebook.p157o0.C5813a0;
import java.util.Map;

/* loaded from: classes.dex */
public class FacebookEventLogger implements EventLogger {
    private static final String TAG = "FacebookEventLogger";
    private final C5813a0 facebook;
    private final AnalyticsLogger logger;

    public FacebookEventLogger(C5813a0 c5813a0, AnalyticsLogger analyticsLogger) {
        this.facebook = c5813a0;
        this.logger = analyticsLogger;
    }

    private Bundle mapToBundle(Map<String, Object> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue().toString());
        }
        return bundle;
    }

    @Override // cm.aptoide.analytics.EventLogger
    public void log(String str, Map<String, Object> map, AnalyticsManager.Action action, String str2) {
        if (map != null) {
            this.facebook.m12166d(str, mapToBundle(map));
        } else {
            this.facebook.m12165c(str);
        }
        this.logger.logDebug(TAG, "log() called with: eventName = [" + str + "], data = [" + map + "], action = [" + action + "], context = [" + str2 + "]");
    }

    @Override // cm.aptoide.analytics.EventLogger
    public void setup() {
    }
}
