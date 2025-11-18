package cm.aptoide.analytics.implementation.utils;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MapToJsonMapper {
    public JSONObject mapToJsonObject(Map<String, Object> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                try {
                    jSONObject.put(entry.getKey(), entry.getValue().toString());
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
        return jSONObject;
    }
}
