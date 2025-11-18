package com.google.firebase.crashlytics.internal.p190t;

import com.google.firebase.crashlytics.internal.p183n.InterfaceC8199d0;
import com.google.firebase.crashlytics.internal.p190t.C8307d;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SettingsV3JsonTransform.java */
/* renamed from: com.google.firebase.crashlytics.h.t.l */
/* loaded from: classes2.dex */
class C8315l implements InterfaceC8311h {
    C8315l() {
    }

    /* renamed from: b */
    private static C8307d.a m26067b(JSONObject jSONObject) {
        return new C8307d.a(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false), jSONObject.optBoolean("collect_build_ids", false));
    }

    /* renamed from: c */
    private static C8307d.b m26068c(JSONObject jSONObject) {
        return new C8307d.b(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    /* renamed from: d */
    private static long m26069d(InterfaceC8199d0 interfaceC8199d0, long j2, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return (j2 * 1000) + interfaceC8199d0.mo25232a();
    }

    @Override // com.google.firebase.crashlytics.internal.p190t.InterfaceC8311h
    /* renamed from: a */
    public C8307d mo26036a(InterfaceC8199d0 interfaceC8199d0, JSONObject jSONObject) throws JSONException {
        int iOptInt = jSONObject.optInt("settings_version", 0);
        int iOptInt2 = jSONObject.optInt("cache_duration", 3600);
        return new C8307d(m26069d(interfaceC8199d0, iOptInt2, jSONObject), jSONObject.has("session") ? m26068c(jSONObject.getJSONObject("session")) : m26068c(new JSONObject()), m26067b(jSONObject.getJSONObject("features")), iOptInt, iOptInt2, jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d), jSONObject.optDouble("on_demand_backoff_base", 1.2d), jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60));
    }
}
