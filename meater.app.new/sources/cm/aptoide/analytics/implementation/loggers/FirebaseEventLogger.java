package cm.aptoide.analytics.implementation.loggers;

import android.os.Bundle;
import cm.aptoide.analytics.AnalyticsLogger;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.EventLogger;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;

/* loaded from: classes.dex */
public class FirebaseEventLogger implements EventLogger {
    private static final String TAG = "FirebaseEventLogger";
    private final FirebaseAnalytics firebaseAnalytics;
    private final AnalyticsLogger logger;

    public FirebaseEventLogger(FirebaseAnalytics firebaseAnalytics, AnalyticsLogger analyticsLogger) {
        this.firebaseAnalytics = firebaseAnalytics;
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
    public void log(String str, Map<String, Object> map, AnalyticsManager.Action action, String str2) throws IllegalStateException {
        this.firebaseAnalytics.m24948a(str, mapToBundle(map));
        this.logger.logDebug(TAG, "log() called with: eventName = [" + str + "], data = [" + map + "], action = [" + action + "], context = [" + str2 + "]");
    }

    @Override // cm.aptoide.analytics.EventLogger
    public void setup() {
    }
}
