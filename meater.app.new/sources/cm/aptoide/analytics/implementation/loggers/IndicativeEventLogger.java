package cm.aptoide.analytics.implementation.loggers;

import cm.aptoide.analytics.AnalyticsLogger;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.EventLogger;
import java.util.Map;
import p241e.p291f.p292a.p293a.C8956a;

/* loaded from: classes.dex */
public class IndicativeEventLogger implements EventLogger {
    private static final String TAG = "IndicativeEventLogger";
    private final AnalyticsLogger logger;

    public IndicativeEventLogger(AnalyticsLogger analyticsLogger) {
        this.logger = analyticsLogger;
    }

    @Override // cm.aptoide.analytics.EventLogger
    public void log(String str, Map<String, Object> map, AnalyticsManager.Action action, String str2) {
        if (map != null) {
            C8956a.m28544q(str, map);
        } else {
            C8956a.m28541n(str);
        }
        this.logger.logDebug(TAG, "log() called with: eventName = [" + str + "], data = [" + map + "], action = [" + action + "], context = [" + str2 + "]");
    }

    @Override // cm.aptoide.analytics.EventLogger
    public void setup() {
    }
}
