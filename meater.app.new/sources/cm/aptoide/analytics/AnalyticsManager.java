package cm.aptoide.analytics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class AnalyticsManager {
    private static final String TAG = "AnalyticsManager";
    private final AnalyticsLogger analyticsLogger;
    private final KeyValueNormalizer analyticsNormalizer;
    private Map<EventLogger, Collection<String>> eventLoggers;
    private final KnockEventLogger knockEventLogger;
    private List<SessionLogger> sessionLoggers;

    public enum Action {
        CLICK,
        SCROLL,
        INPUT,
        AUTO,
        ROOT,
        VIEW,
        INSTALL,
        OPEN,
        IMPRESSION,
        PULL_REFRESH,
        DISMISS,
        ENDLESS_SCROLL
    }

    public static class Builder {
        private AnalyticsLogger analyticsLogger;
        private KeyValueNormalizer analyticsNormalizer;
        private KnockEventLogger knockEventLogger;
        private List<SessionLogger> sessionLoggers = new ArrayList();
        private final Map<EventLogger, Collection<String>> eventLoggers = new HashMap();

        public Builder addLogger(EventLogger eventLogger, Collection<String> collection) {
            this.eventLoggers.put(eventLogger, collection);
            return this;
        }

        public Builder addSessionLogger(SessionLogger sessionLogger) {
            this.sessionLoggers.add(sessionLogger);
            return this;
        }

        public AnalyticsManager build() {
            if (this.knockEventLogger == null) {
                throw new IllegalArgumentException("Analytics manager need an okhttp client");
            }
            if (this.eventLoggers.size() < 1) {
                throw new IllegalArgumentException("Analytics manager need at least one logger");
            }
            if (this.analyticsLogger != null) {
                return new AnalyticsManager(this.knockEventLogger, this.eventLoggers, this.sessionLoggers, this.analyticsNormalizer, this.analyticsLogger);
            }
            throw new IllegalArgumentException("Analytics manager need a Debug Logger");
        }

        public Builder setAnalyticsNormalizer(KeyValueNormalizer keyValueNormalizer) {
            this.analyticsNormalizer = keyValueNormalizer;
            return this;
        }

        public Builder setDebugLogger(AnalyticsLogger analyticsLogger) {
            this.analyticsLogger = analyticsLogger;
            return this;
        }

        public Builder setKnockLogger(KnockEventLogger knockEventLogger) {
            this.knockEventLogger = knockEventLogger;
            return this;
        }
    }

    public void endSession() {
        Iterator<SessionLogger> it = this.sessionLoggers.iterator();
        while (it.hasNext()) {
            it.next().endSession();
        }
    }

    public void logEvent(Map<String, Object> map, String str, Action action, String str2) {
        this.analyticsLogger.logDebug(TAG, "logEvent() called with: eventName = [" + str + "], data = [" + map + "],  action = [" + action + "], context = [" + str2 + "]");
        Map<String, Object> mapNormalize = this.analyticsNormalizer.normalize(map);
        int i2 = 0;
        for (Map.Entry<EventLogger, Collection<String>> entry : this.eventLoggers.entrySet()) {
            if (entry.getValue().contains(str)) {
                entry.getKey().log(str, mapNormalize, action, str2);
                i2++;
            }
        }
        if (i2 <= 0) {
            this.analyticsLogger.logWarningDebug(TAG, str + " event not sent ");
        }
    }

    public void setup() {
        Iterator<Map.Entry<EventLogger, Collection<String>>> it = this.eventLoggers.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getKey().setup();
        }
    }

    public void startSession() {
        Iterator<SessionLogger> it = this.sessionLoggers.iterator();
        while (it.hasNext()) {
            it.next().startSession();
        }
    }

    private AnalyticsManager(KnockEventLogger knockEventLogger, Map<EventLogger, Collection<String>> map, List<SessionLogger> list, KeyValueNormalizer keyValueNormalizer, AnalyticsLogger analyticsLogger) {
        this.knockEventLogger = knockEventLogger;
        this.eventLoggers = map;
        this.sessionLoggers = list;
        this.analyticsNormalizer = keyValueNormalizer;
        this.analyticsLogger = analyticsLogger;
    }

    public void logEvent(String str) {
        this.knockEventLogger.log(str);
    }
}
