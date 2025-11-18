package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzagu implements zzaho<Object> {

    /* renamed from: a */
    private final zzagv f22015a;

    public zzagu(zzagv zzagvVar) {
        this.f22015a = zzagvVar;
    }

    /* renamed from: b */
    private static Bundle m16562b(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> itKeys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj != null) {
                if (obj instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Double) {
                    bundle.putDouble(next, ((Double) obj).doubleValue());
                } else if (obj instanceof Integer) {
                    bundle.putInt(next, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    bundle.putLong(next, ((Long) obj).longValue());
                } else if (obj instanceof String) {
                    bundle.putString(next, (String) obj);
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    if (jSONArray.length() != 0) {
                        int length = jSONArray.length();
                        int i2 = 0;
                        Object obj2 = null;
                        for (int i3 = 0; obj2 == null && i3 < length; i3++) {
                            obj2 = !jSONArray.isNull(i3) ? jSONArray.get(i3) : null;
                        }
                        if (obj2 == null) {
                            String strValueOf = String.valueOf(next);
                            zzbad.m17353i(strValueOf.length() != 0 ? "Expected JSONArray with at least 1 non-null element for key:".concat(strValueOf) : new String("Expected JSONArray with at least 1 non-null element for key:"));
                        } else if (obj2 instanceof JSONObject) {
                            Bundle[] bundleArr = new Bundle[length];
                            while (i2 < length) {
                                bundleArr[i2] = !jSONArray.isNull(i2) ? m16562b(jSONArray.optJSONObject(i2)) : null;
                                i2++;
                            }
                            bundle.putParcelableArray(next, bundleArr);
                        } else if (obj2 instanceof Number) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i2 < length) {
                                dArr[i2] = jSONArray.optDouble(i2);
                                i2++;
                            }
                            bundle.putDoubleArray(next, dArr);
                        } else if (obj2 instanceof CharSequence) {
                            String[] strArr = new String[length];
                            while (i2 < length) {
                                strArr[i2] = !jSONArray.isNull(i2) ? jSONArray.optString(i2) : null;
                                i2++;
                            }
                            bundle.putStringArray(next, strArr);
                        } else if (obj2 instanceof Boolean) {
                            boolean[] zArr = new boolean[length];
                            while (i2 < length) {
                                zArr[i2] = jSONArray.optBoolean(i2);
                                i2++;
                            }
                            bundle.putBooleanArray(next, zArr);
                        } else {
                            zzbad.m17353i(String.format("JSONArray with unsupported type %s for key:%s", obj2.getClass().getCanonicalName(), next));
                        }
                    }
                } else if (obj instanceof JSONObject) {
                    bundle.putBundle(next, m16562b((JSONObject) obj));
                } else {
                    String strValueOf2 = String.valueOf(next);
                    zzbad.m17353i(strValueOf2.length() != 0 ? "Unsupported type for key:".concat(strValueOf2) : new String("Unsupported type for key:"));
                }
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final void mo14739a(Object obj, Map<String, String> map) {
        if (this.f22015a == null) {
            return;
        }
        String str = map.get("name");
        if (str == null) {
            zzbad.m17352h("Ad metadata with no name parameter.");
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Bundle bundleM16562b = null;
        if (map.containsKey("info")) {
            try {
                bundleM16562b = m16562b(new JSONObject(map.get("info")));
            } catch (JSONException e2) {
                zzbad.m17347c("Failed to convert ad metadata to JSON.", e2);
            }
        }
        if (bundleM16562b == null) {
            zzbad.m17351g("Failed to convert ad metadata to Bundle.");
        } else {
            this.f22015a.mo15747k(str, bundleM16562b);
        }
    }
}
