package com.facebook.p157o0.p169u0;

import android.content.SharedPreferences;
import android.view.View;
import cm.aptoide.p092pt.root.execution.Command;
import com.facebook.C5641a0;
import com.facebook.internal.C5696p0;
import com.facebook.p157o0.p160m0.p161n.C5874f;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.C10810q0;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PredictionHistoryManager.kt */
/* renamed from: com.facebook.o0.u0.f */
/* loaded from: classes2.dex */
public final class C5936f {

    /* renamed from: c */
    private static SharedPreferences f15509c;

    /* renamed from: a */
    public static final C5936f f15507a = new C5936f();

    /* renamed from: b */
    private static final Map<String, String> f15508b = new LinkedHashMap();

    /* renamed from: d */
    private static final AtomicBoolean f15510d = new AtomicBoolean(false);

    private C5936f() {
    }

    /* renamed from: a */
    public static final void m12792a(String str, String str2) {
        C9801m.m32346f(str, "pathID");
        C9801m.m32346f(str2, "predictedEvent");
        if (!f15510d.get()) {
            f15507a.m12794c();
        }
        Map<String, String> map = f15508b;
        map.put(str, str2);
        SharedPreferences sharedPreferences = f15509c;
        if (sharedPreferences == null) {
            C9801m.m32363w("shardPreferences");
            throw null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        C5696p0 c5696p0 = C5696p0.f14478a;
        editorEdit.putString("SUGGESTED_EVENTS_HISTORY", C5696p0.m11579l0(C10810q0.m38807s(map))).apply();
    }

    /* renamed from: b */
    public static final String m12793b(View view, String str) throws JSONException {
        C9801m.m32346f(view, "view");
        C9801m.m32346f(str, Command.CommandHandler.TEXT);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Command.CommandHandler.TEXT, str);
            JSONArray jSONArray = new JSONArray();
            while (view != null) {
                jSONArray.put(view.getClass().getSimpleName());
                C5874f c5874f = C5874f.f15257a;
                view = C5874f.m12477j(view);
            }
            jSONObject.put("classname", jSONArray);
        } catch (JSONException unused) {
        }
        C5696p0 c5696p0 = C5696p0.f14478a;
        return C5696p0.m11535F0(jSONObject.toString());
    }

    /* renamed from: c */
    private final void m12794c() {
        AtomicBoolean atomicBoolean = f15510d;
        if (atomicBoolean.get()) {
            return;
        }
        C5641a0 c5641a0 = C5641a0.f14199a;
        SharedPreferences sharedPreferences = C5641a0.m11284c().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
        C9801m.m32345e(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(CLICKED_PATH_STORE, Context.MODE_PRIVATE)");
        f15509c = sharedPreferences;
        Map<String, String> map = f15508b;
        C5696p0 c5696p0 = C5696p0.f14478a;
        SharedPreferences sharedPreferences2 = f15509c;
        if (sharedPreferences2 == null) {
            C9801m.m32363w("shardPreferences");
            throw null;
        }
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        String string = sharedPreferences2.getString("SUGGESTED_EVENTS_HISTORY", HttpUrl.FRAGMENT_ENCODE_SET);
        if (string != null) {
            str = string;
        }
        map.putAll(C5696p0.m11567f0(str));
        atomicBoolean.set(true);
    }

    /* renamed from: d */
    public static final String m12795d(String str) {
        C9801m.m32346f(str, "pathID");
        Map<String, String> map = f15508b;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }
}
