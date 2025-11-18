package Y8;

import Q8.F;
import Y8.d;
import org.json.JSONObject;

/* compiled from: DefaultSettingsJsonTransform.java */
/* loaded from: classes2.dex */
class b implements i {
    b() {
    }

    static d b(F f10) {
        return new d(f10.a() + 3600000, new d.b(8, 4), new d.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // Y8.i
    public d a(F f10, JSONObject jSONObject) {
        return b(f10);
    }
}
