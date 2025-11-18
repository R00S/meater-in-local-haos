package androidx.media3.exoplayer.drm;

import X1.L;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ClearKeyUtil.java */
/* loaded from: classes.dex */
final class a {
    public static byte[] a(byte[] bArr) {
        return L.f18626a >= 27 ? bArr : L.t0(c(L.H(bArr)));
    }

    public static byte[] b(byte[] bArr) throws JSONException {
        if (L.f18626a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(L.H(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (i10 != 0) {
                    sb2.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                sb2.append("{\"k\":\"");
                sb2.append(d(jSONObject2.getString("k")));
                sb2.append("\",\"kid\":\"");
                sb2.append(d(jSONObject2.getString("kid")));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return L.t0(sb2.toString());
        } catch (JSONException e10) {
            X1.n.d("ClearKeyUtil", "Failed to adjust response data: " + L.H(bArr), e10);
            return bArr;
        }
    }

    private static String c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    private static String d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
