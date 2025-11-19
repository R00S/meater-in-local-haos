package O8;

import N8.g;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BreadcrumbAnalyticsEventReceiver.java */
/* loaded from: classes2.dex */
public class d implements b, P8.b {

    /* renamed from: a, reason: collision with root package name */
    private P8.a f13303a;

    private static String b(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // P8.b
    public void a(P8.a aVar) {
        this.f13303a = aVar;
        g.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // O8.b
    public void j(String str, Bundle bundle) {
        P8.a aVar = this.f13303a;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + b(str, bundle));
            } catch (JSONException unused) {
                g.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
