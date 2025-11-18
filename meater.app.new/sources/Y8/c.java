package Y8;

import Q8.A;
import android.text.TextUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: DefaultSettingsSpiCall.java */
/* loaded from: classes2.dex */
class c implements l {

    /* renamed from: a, reason: collision with root package name */
    private final String f19459a;

    /* renamed from: b, reason: collision with root package name */
    private final V8.b f19460b;

    /* renamed from: c, reason: collision with root package name */
    private final N8.g f19461c;

    public c(String str, V8.b bVar) {
        this(str, bVar, N8.g.f());
    }

    private V8.a b(V8.a aVar, k kVar) {
        c(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", kVar.f19492a);
        c(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", A.m());
        c(aVar, "Accept", "application/json");
        c(aVar, "X-CRASHLYTICS-DEVICE-MODEL", kVar.f19493b);
        c(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", kVar.f19494c);
        c(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", kVar.f19495d);
        c(aVar, "X-CRASHLYTICS-INSTALLATION-ID", kVar.f19496e.a().c());
        return aVar;
    }

    private void c(V8.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.d(str, str2);
        }
    }

    private JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e10) {
            this.f19461c.l("Failed to parse settings JSON from " + this.f19459a, e10);
            this.f19461c.k("Settings response " + str);
            return null;
        }
    }

    private Map<String, String> f(k kVar) {
        HashMap map = new HashMap();
        map.put("build_version", kVar.f19499h);
        map.put("display_version", kVar.f19498g);
        map.put("source", Integer.toString(kVar.f19500i));
        String str = kVar.f19497f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    @Override // Y8.l
    public JSONObject a(k kVar, boolean z10) {
        R8.f.d();
        if (!z10) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        try {
            Map<String, String> mapF = f(kVar);
            V8.a aVarB = b(d(mapF), kVar);
            this.f19461c.b("Requesting settings from " + this.f19459a);
            this.f19461c.i("Settings query params were: " + mapF);
            return g(aVarB.c());
        } catch (IOException e10) {
            this.f19461c.e("Settings request failed.", e10);
            return null;
        }
    }

    protected V8.a d(Map<String, String> map) {
        return this.f19460b.a(this.f19459a, map).d("User-Agent", "Crashlytics Android SDK/" + A.m()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    JSONObject g(V8.c cVar) {
        int iB = cVar.b();
        this.f19461c.i("Settings response code was: " + iB);
        if (h(iB)) {
            return e(cVar.a());
        }
        this.f19461c.d("Settings request failed; (status: " + iB + ") from " + this.f19459a);
        return null;
    }

    boolean h(int i10) {
        return i10 == 200 || i10 == 201 || i10 == 202 || i10 == 203;
    }

    c(String str, V8.b bVar, N8.g gVar) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f19461c = gVar;
        this.f19460b = bVar;
        this.f19459a = str;
    }
}
