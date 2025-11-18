package com.facebook.p157o0.p165q0;

import android.content.Context;
import com.facebook.EnumC5659g0;
import com.facebook.internal.C5684j0;
import com.facebook.internal.C5696p0;
import com.facebook.internal.C5697q;
import com.facebook.p157o0.C5813a0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.C10773s;
import kotlin.collections.C10810q0;
import kotlin.jvm.internal.C9801m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AppEventsLoggerUtility.kt */
/* renamed from: com.facebook.o0.q0.h */
/* loaded from: classes2.dex */
public final class C5903h {

    /* renamed from: a */
    public static final C5903h f15371a = new C5903h();

    /* renamed from: b */
    private static final Map<a, String> f15372b = C10810q0.m38799k(C10773s.m38547a(a.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), C10773s.m38547a(a.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));

    /* compiled from: AppEventsLoggerUtility.kt */
    /* renamed from: com.facebook.o0.q0.h$a */
    public enum a {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            return (a[]) Arrays.copyOf(aVarArrValuesCustom, aVarArrValuesCustom.length);
        }
    }

    private C5903h() {
    }

    /* renamed from: a */
    public static final JSONObject m12631a(a aVar, C5697q c5697q, String str, boolean z, Context context) throws JSONException {
        C9801m.m32346f(aVar, "activityType");
        C9801m.m32346f(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f15372b.get(aVar));
        String strM12171e = C5813a0.f14908a.m12171e();
        if (strM12171e != null) {
            jSONObject.put("app_user_id", strM12171e);
        }
        C5696p0 c5696p0 = C5696p0.f14478a;
        C5696p0.m11529C0(jSONObject, c5697q, str, z, context);
        try {
            C5696p0.m11531D0(jSONObject, context);
        } catch (Exception e2) {
            C5684j0.f14429a.m11455c(EnumC5659g0.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e2.toString());
        }
        C5696p0 c5696p02 = C5696p0.f14478a;
        JSONObject jSONObjectM11525A = C5696p0.m11525A();
        if (jSONObjectM11525A != null) {
            Iterator<String> itKeys = jSONObjectM11525A.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObjectM11525A.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
