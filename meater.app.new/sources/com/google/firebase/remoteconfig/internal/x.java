package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import j9.InterfaceC3755b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Personalization.java */
/* loaded from: classes2.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3755b<I8.a> f38785a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f38786b = Collections.synchronizedMap(new HashMap());

    public x(InterfaceC3755b<I8.a> interfaceC3755b) {
        this.f38785a = interfaceC3755b;
    }

    public void a(String str, g gVar) {
        JSONObject jSONObjectOptJSONObject;
        I8.a aVar = this.f38785a.get();
        if (aVar == null) {
            return;
        }
        JSONObject jSONObjectI = gVar.i();
        if (jSONObjectI.length() < 1) {
            return;
        }
        JSONObject jSONObjectG = gVar.g();
        if (jSONObjectG.length() >= 1 && (jSONObjectOptJSONObject = jSONObjectI.optJSONObject(str)) != null) {
            String strOptString = jSONObjectOptJSONObject.optString("choiceId");
            if (strOptString.isEmpty()) {
                return;
            }
            synchronized (this.f38786b) {
                try {
                    if (strOptString.equals(this.f38786b.get(str))) {
                        return;
                    }
                    this.f38786b.put(str, strOptString);
                    Bundle bundle = new Bundle();
                    bundle.putString("arm_key", str);
                    bundle.putString("arm_value", jSONObjectG.optString(str));
                    bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                    bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                    bundle.putString("group", jSONObjectOptJSONObject.optString("group"));
                    aVar.c("fp", "personalization_assignment", bundle);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_fpid", strOptString);
                    aVar.c("fp", "_fpc", bundle2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
