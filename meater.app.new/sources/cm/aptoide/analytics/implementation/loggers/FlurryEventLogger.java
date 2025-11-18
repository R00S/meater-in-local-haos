package cm.aptoide.analytics.implementation.loggers;

import android.content.Context;
import cm.aptoide.analytics.AnalyticsLogger;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.EventLogger;
import cm.aptoide.analytics.SessionLogger;
import java.util.HashMap;
import java.util.Map;
import p241e.p252d.p253a.C8776b;

/* loaded from: classes.dex */
public class FlurryEventLogger implements EventLogger, SessionLogger {
    private static final String TAG = "FlurryEventLogger";
    private Context context;
    private final AnalyticsLogger logger;

    public FlurryEventLogger(Context context, AnalyticsLogger analyticsLogger) {
        this.context = context;
        this.logger = analyticsLogger;
    }

    private Map<String, String> map(Map<String, Object> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                map2.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return map2;
    }

    @Override // cm.aptoide.analytics.SessionLogger
    public void endSession() {
        C8776b.m27930e(this.context);
    }

    @Override // cm.aptoide.analytics.EventLogger
    public void log(String str, Map<String, Object> map, AnalyticsManager.Action action, String str2) {
        if (map != null) {
            C8776b.m27929d(str, map(map));
        } else {
            C8776b.m27928c(str);
        }
        this.logger.logDebug(TAG, "log() called with: eventName = [" + str + "], data = [" + map + "], action = [" + action + "], context = [" + str2 + "]");
    }

    @Override // cm.aptoide.analytics.EventLogger
    public void setup() {
    }

    @Override // cm.aptoide.analytics.SessionLogger
    public void startSession() {
        C8776b.m27932g(this.context);
    }
}
