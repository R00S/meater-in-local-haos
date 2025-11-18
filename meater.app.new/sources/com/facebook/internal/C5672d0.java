package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.C5641a0;
import com.facebook.GraphRequest;
import com.facebook.internal.C5670c0;
import com.facebook.internal.C5738x;
import com.facebook.p157o0.p160m0.p161n.C5873e;
import com.facebook.p157o0.p165q0.C5904i;
import com.facebook.p157o0.p165q0.C5905j;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.StringCompanionObject;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FetchedAppSettingsManager.kt */
/* renamed from: com.facebook.internal.d0 */
/* loaded from: classes2.dex */
public final class C5672d0 {

    /* renamed from: a */
    public static final C5672d0 f14392a = new C5672d0();

    /* renamed from: b */
    private static final String f14393b = C5672d0.class.getSimpleName();

    /* renamed from: c */
    private static final List<String> f14394c = C10817u.m38891m("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules");

    /* renamed from: d */
    private static final Map<String, C5670c0> f14395d = new ConcurrentHashMap();

    /* renamed from: e */
    private static final AtomicReference<a> f14396e = new AtomicReference<>(a.NOT_LOADED);

    /* renamed from: f */
    private static final ConcurrentLinkedQueue<b> f14397f = new ConcurrentLinkedQueue<>();

    /* renamed from: g */
    private static boolean f14398g;

    /* renamed from: h */
    private static JSONArray f14399h;

    /* compiled from: FetchedAppSettingsManager.kt */
    /* renamed from: com.facebook.internal.d0$a */
    public enum a {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            return (a[]) Arrays.copyOf(aVarArrValuesCustom, aVarArrValuesCustom.length);
        }
    }

    /* compiled from: FetchedAppSettingsManager.kt */
    /* renamed from: com.facebook.internal.d0$b */
    public interface b {
        /* renamed from: a */
        void mo11431a(C5670c0 c5670c0);

        void onError();
    }

    private C5672d0() {
    }

    /* renamed from: a */
    public static final void m11415a(b bVar) {
        C9801m.m32346f(bVar, "callback");
        f14397f.add(bVar);
        m11421g();
    }

    /* renamed from: b */
    private final JSONObject m11416b(String str) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f14394c);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        GraphRequest graphRequestM11236x = GraphRequest.f14159a.m11236x(null, "app", null);
        graphRequestM11236x.m11174E(true);
        graphRequestM11236x.m11177H(bundle);
        JSONObject jSONObjectM11340d = graphRequestM11236x.m11179j().m11340d();
        return jSONObjectM11340d == null ? new JSONObject() : jSONObjectM11340d;
    }

    /* renamed from: c */
    public static final C5670c0 m11417c(String str) {
        if (str != null) {
            return f14395d.get(str);
        }
        return null;
    }

    /* renamed from: g */
    public static final void m11421g() {
        C5641a0 c5641a0 = C5641a0.f14199a;
        final Context contextM11284c = C5641a0.m11284c();
        final String strM11285d = C5641a0.m11285d();
        C5696p0 c5696p0 = C5696p0.f14478a;
        if (C5696p0.m11557a0(strM11285d)) {
            f14396e.set(a.ERROR);
            f14392a.m11425l();
            return;
        }
        if (f14395d.containsKey(strM11285d)) {
            f14396e.set(a.SUCCESS);
            f14392a.m11425l();
            return;
        }
        AtomicReference<a> atomicReference = f14396e;
        a aVar = a.NOT_LOADED;
        a aVar2 = a.LOADING;
        if (!(atomicReference.compareAndSet(aVar, aVar2) || atomicReference.compareAndSet(a.ERROR, aVar2))) {
            f14392a.m11425l();
            return;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        final String str = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strM11285d}, 1));
        C9801m.m32345e(str, "java.lang.String.format(format, *args)");
        C5641a0.m11292k().execute(new Runnable() { // from class: com.facebook.internal.f
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                C5672d0.m11422h(contextM11284c, str, strM11285d);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m11422h(Context context, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        JSONObject jSONObject;
        C9801m.m32346f(context, "$context");
        C9801m.m32346f(str, "$settingsKey");
        C9801m.m32346f(str2, "$applicationId");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
        C5670c0 c5670c0M11429i = null;
        String string = sharedPreferences.getString(str, null);
        C5696p0 c5696p0 = C5696p0.f14478a;
        if (!C5696p0.m11557a0(string)) {
            if (string == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e2) {
                C5696p0 c5696p02 = C5696p0.f14478a;
                C5696p0.m11573i0("FacebookSDK", e2);
                jSONObject = null;
            }
            if (jSONObject != null) {
                c5670c0M11429i = f14392a.m11429i(str2, jSONObject);
            }
        }
        C5672d0 c5672d0 = f14392a;
        JSONObject jSONObjectM11416b = c5672d0.m11416b(str2);
        if (jSONObjectM11416b != null) {
            c5672d0.m11429i(str2, jSONObjectM11416b);
            sharedPreferences.edit().putString(str, jSONObjectM11416b.toString()).apply();
        }
        if (c5670c0M11429i != null) {
            String strM11406j = c5670c0M11429i.m11406j();
            if (!f14398g && strM11406j != null && strM11406j.length() > 0) {
                f14398g = true;
                Log.w(f14393b, strM11406j);
            }
        }
        C5668b0 c5668b0 = C5668b0.f14356a;
        C5668b0.m11394m(str2, true);
        C5904i c5904i = C5904i.f15376a;
        C5904i.m12636d();
        f14396e.set(f14395d.containsKey(str2) ? a.SUCCESS : a.ERROR);
        c5672d0.m11425l();
    }

    /* renamed from: j */
    private final Map<String, Map<String, C5670c0.b>> m11423j(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        HashMap map = new HashMap();
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("data")) != null) {
            int i2 = 0;
            int length = jSONArrayOptJSONArray.length();
            if (length > 0) {
                while (true) {
                    int i3 = i2 + 1;
                    C5670c0.b.a aVar = C5670c0.b.f14386a;
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                    C9801m.m32345e(jSONObjectOptJSONObject, "dialogConfigData.optJSONObject(i)");
                    C5670c0.b bVarM11414a = aVar.m11414a(jSONObjectOptJSONObject);
                    if (bVarM11414a != null) {
                        String strM11411a = bVarM11414a.m11411a();
                        Map map2 = (Map) map.get(strM11411a);
                        if (map2 == null) {
                            map2 = new HashMap();
                            map.put(strM11411a, map2);
                        }
                        map2.put(bVarM11414a.m11412b(), bVarM11414a);
                    }
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
            }
        }
        return map;
    }

    /* renamed from: k */
    private final JSONArray m11424k(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    /* renamed from: l */
    private final synchronized void m11425l() {
        a aVar = f14396e.get();
        if (a.NOT_LOADED != aVar && a.LOADING != aVar) {
            C5641a0 c5641a0 = C5641a0.f14199a;
            final C5670c0 c5670c0 = f14395d.get(C5641a0.m11285d());
            Handler handler = new Handler(Looper.getMainLooper());
            if (a.ERROR == aVar) {
                while (true) {
                    ConcurrentLinkedQueue<b> concurrentLinkedQueue = f14397f;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    }
                    final b bVarPoll = concurrentLinkedQueue.poll();
                    handler.post(new Runnable() { // from class: com.facebook.internal.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5672d0.m11426m(bVarPoll);
                        }
                    });
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue<b> concurrentLinkedQueue2 = f14397f;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    }
                    final b bVarPoll2 = concurrentLinkedQueue2.poll();
                    handler.post(new Runnable() { // from class: com.facebook.internal.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5672d0.m11427n(bVarPoll2, c5670c0);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m11426m(b bVar) {
        bVar.onError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m11427n(b bVar, C5670c0 c5670c0) {
        bVar.mo11431a(c5670c0);
    }

    /* renamed from: o */
    public static final C5670c0 m11428o(String str, boolean z) {
        C9801m.m32346f(str, "applicationId");
        if (!z) {
            Map<String, C5670c0> map = f14395d;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        C5672d0 c5672d0 = f14392a;
        JSONObject jSONObjectM11416b = c5672d0.m11416b(str);
        if (jSONObjectM11416b == null) {
            return null;
        }
        C5670c0 c5670c0M11429i = c5672d0.m11429i(str, jSONObjectM11416b);
        C5641a0 c5641a0 = C5641a0.f14199a;
        if (C9801m.m32341a(str, C5641a0.m11285d())) {
            f14396e.set(a.SUCCESS);
            c5672d0.m11425l();
        }
        return c5670c0M11429i;
    }

    /* renamed from: i */
    public final C5670c0 m11429i(String str, JSONObject jSONObject) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C9801m.m32346f(str, "applicationId");
        C9801m.m32346f(jSONObject, "settingsJSON");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("android_sdk_error_categories");
        C5738x.a aVar = C5738x.f14638a;
        C5738x c5738xM11826a = aVar.m11826a(jSONArrayOptJSONArray);
        if (c5738xM11826a == null) {
            c5738xM11826a = aVar.m11827b();
        }
        C5738x c5738x = c5738xM11826a;
        int iOptInt = jSONObject.optInt("app_events_feature_bitmask", 0);
        boolean z = (iOptInt & 8) != 0;
        boolean z2 = (iOptInt & 16) != 0;
        boolean z3 = (iOptInt & 32) != 0;
        boolean z4 = (iOptInt & 256) != 0;
        boolean z5 = (iOptInt & Http2.INITIAL_MAX_FRAME_SIZE) != 0;
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("auto_event_mapping_android");
        f14399h = jSONArrayOptJSONArray2;
        if (jSONArrayOptJSONArray2 != null) {
            C5680h0 c5680h0 = C5680h0.f14422a;
            if (C5680h0.m11442b()) {
                C5873e c5873e = C5873e.f15254a;
                C5873e.m12466c(jSONArrayOptJSONArray2 == null ? null : jSONArrayOptJSONArray2.toString());
            }
        }
        boolean zOptBoolean = jSONObject.optBoolean("supports_implicit_sdk_logging", false);
        String strOptString = jSONObject.optString("gdpv4_nux_content", HttpUrl.FRAGMENT_ENCODE_SET);
        C9801m.m32345e(strOptString, "settingsJSON.optString(APP_SETTING_NUX_CONTENT, \"\")");
        boolean zOptBoolean2 = jSONObject.optBoolean("gdpv4_nux_enabled", false);
        C5905j c5905j = C5905j.f15382a;
        int iOptInt2 = jSONObject.optInt("app_events_session_timeout", C5905j.m12642a());
        EnumSet<EnumC5694o0> enumSetM11524a = EnumC5694o0.f14470f.m11524a(jSONObject.optLong("seamless_login"));
        Map<String, Map<String, C5670c0.b>> mapM11423j = m11423j(jSONObject.optJSONObject("android_dialog_configs"));
        String strOptString2 = jSONObject.optString("smart_login_bookmark_icon_url");
        C9801m.m32345e(strOptString2, "settingsJSON.optString(SMART_LOGIN_BOOKMARK_ICON_URL)");
        String strOptString3 = jSONObject.optString("smart_login_menu_icon_url");
        C9801m.m32345e(strOptString3, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String strOptString4 = jSONObject.optString("sdk_update_message");
        C9801m.m32345e(strOptString4, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        C5670c0 c5670c0 = new C5670c0(zOptBoolean, strOptString, zOptBoolean2, iOptInt2, enumSetM11524a, mapM11423j, z, c5738x, strOptString2, strOptString3, z2, z3, jSONArrayOptJSONArray2, strOptString4, z4, z5, jSONObject.optString("aam_rules"), jSONObject.optString("suggested_events_setting"), jSONObject.optString("restrictive_data_filter_params"), m11424k(jSONObject.optJSONObject("protected_mode_rules"), "standard_params"), m11424k(jSONObject.optJSONObject("protected_mode_rules"), "maca_rules"));
        f14395d.put(str, c5670c0);
        return c5670c0;
    }
}
