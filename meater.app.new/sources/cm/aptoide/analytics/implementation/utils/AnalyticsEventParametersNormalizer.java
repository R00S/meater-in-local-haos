package cm.aptoide.analytics.implementation.utils;

import cm.aptoide.analytics.KeyValueNormalizer;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class AnalyticsEventParametersNormalizer implements KeyValueNormalizer {
    @Override // cm.aptoide.analytics.KeyValueNormalizer
    public Map<String, Object> normalize(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                entry.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
            }
        }
        return map;
    }
}
