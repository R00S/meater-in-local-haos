package Y8;

import Q8.F;
import org.json.JSONObject;

/* compiled from: SettingsJsonParser.java */
/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final F f19491a;

    h(F f10) {
        this.f19491a = f10;
    }

    private static i a(int i10) {
        if (i10 == 3) {
            return new m();
        }
        N8.g.f().d("Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.");
        return new b();
    }

    public d b(JSONObject jSONObject) {
        return a(jSONObject.getInt("settings_version")).a(this.f19491a, jSONObject);
    }
}
