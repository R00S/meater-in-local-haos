package com.google.firebase.crashlytics.internal.p181l;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.C8179h;
import com.google.firebase.crashlytics.internal.p182m.InterfaceC8189a;
import com.google.firebase.crashlytics.internal.p182m.InterfaceC8190b;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BreadcrumbAnalyticsEventReceiver.java */
/* renamed from: com.google.firebase.crashlytics.h.l.d */
/* loaded from: classes2.dex */
public class C8186d implements InterfaceC8184b, InterfaceC8190b {

    /* renamed from: a */
    private InterfaceC8189a f30871a;

    /* renamed from: b */
    private static String m25196b(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // com.google.firebase.crashlytics.internal.p181l.InterfaceC8184b
    /* renamed from: J0 */
    public void mo25195J0(String str, Bundle bundle) {
        InterfaceC8189a interfaceC8189a = this.f30871a;
        if (interfaceC8189a != null) {
            try {
                interfaceC8189a.mo25197a("$A$:" + m25196b(str, bundle));
            } catch (JSONException unused) {
                C8179h.m25176f().m25185k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.p182m.InterfaceC8190b
    /* renamed from: a */
    public void mo25136a(InterfaceC8189a interfaceC8189a) {
        this.f30871a = interfaceC8189a;
        C8179h.m25176f().m25177b("Registered Firebase Analytics event receiver for breadcrumbs");
    }
}
