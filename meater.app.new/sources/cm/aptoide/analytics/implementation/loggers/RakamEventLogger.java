package cm.aptoide.analytics.implementation.loggers;

import cm.aptoide.analytics.AnalyticsLogger;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.EventLogger;
import cm.aptoide.analytics.implementation.utils.MapToJsonMapper;
import io.rakam.api.C9230f;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public class RakamEventLogger implements EventLogger {
    private static final String TAG = "RakamEventLogger";
    private final MapToJsonMapper jsonMapper;
    private final AnalyticsLogger logger;

    public RakamEventLogger(AnalyticsLogger analyticsLogger, MapToJsonMapper mapToJsonMapper) {
        this.logger = analyticsLogger;
        this.jsonMapper = mapToJsonMapper;
    }

    @Override // cm.aptoide.analytics.EventLogger
    public void log(String str, Map<String, Object> map, AnalyticsManager.Action action, String str2) throws JSONException {
        if (map != null) {
            C9230f.m29891a().m29935G(str, this.jsonMapper.mapToJsonObject(map));
        } else {
            C9230f.m29891a().m29934F(str);
        }
        this.logger.logDebug(TAG, "log() called with: eventName = [" + str + "], data = [" + map + "], action = [" + action + "], context = [" + str2 + "]");
    }

    @Override // cm.aptoide.analytics.EventLogger
    public void setup() {
    }
}
