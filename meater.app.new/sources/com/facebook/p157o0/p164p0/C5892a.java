package com.facebook.p157o0.p164p0;

import com.facebook.C5641a0;
import com.facebook.internal.C5668b0;
import com.facebook.p157o0.p166r0.C5919h;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10782c0;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: IntegrityManager.kt */
/* renamed from: com.facebook.o0.p0.a */
/* loaded from: classes2.dex */
public final class C5892a {

    /* renamed from: a */
    public static final C5892a f15336a = new C5892a();

    /* renamed from: b */
    private static boolean f15337b;

    /* renamed from: c */
    private static boolean f15338c;

    private C5892a() {
    }

    /* renamed from: a */
    public static final void m12579a() {
        f15337b = true;
        C5668b0 c5668b0 = C5668b0.f14356a;
        C5641a0 c5641a0 = C5641a0.f14199a;
        f15338c = C5668b0.m11385b("FBSDKFeatureIntegritySample", C5641a0.m11285d(), false);
    }

    /* renamed from: b */
    private final String m12580b(String str) {
        String str2;
        float[] fArr = new float[30];
        for (int i2 = 0; i2 < 30; i2++) {
            fArr[i2] = 0.0f;
        }
        C5919h c5919h = C5919h.f15431a;
        String[] strArrM12699q = C5919h.m12699q(C5919h.a.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
        return (strArrM12699q == null || (str2 = strArrM12699q[0]) == null) ? "none" : str2;
    }

    /* renamed from: c */
    public static final void m12581c(Map<String, String> map) throws JSONException {
        C9801m.m32346f(map, "parameters");
        if (!f15337b || map.isEmpty()) {
            return;
        }
        try {
            List<String> listM38569E0 = C10782c0.m38569E0(map.keySet());
            JSONObject jSONObject = new JSONObject();
            for (String str : listM38569E0) {
                String str2 = map.get(str);
                if (str2 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                String str3 = str2;
                C5892a c5892a = f15336a;
                if (c5892a.m12582d(str) || c5892a.m12582d(str3)) {
                    map.remove(str);
                    if (!f15338c) {
                        str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    jSONObject.put(str, str3);
                }
            }
            if (jSONObject.length() != 0) {
                String string = jSONObject.toString();
                C9801m.m32345e(string, "restrictiveParamJson.toString()");
                map.put("_onDeviceParams", string);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    private final boolean m12582d(String str) {
        return !C9801m.m32341a("none", m12580b(str));
    }
}
