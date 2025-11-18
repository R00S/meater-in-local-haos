package com.facebook.p157o0.p168t0;

import android.util.Log;
import cm.aptoide.p092pt.database.room.RoomNotification;
import com.facebook.C5641a0;
import com.facebook.internal.C5670c0;
import com.facebook.internal.C5672d0;
import com.facebook.internal.C5696p0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.C9801m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RestrictiveDataManager.kt */
/* renamed from: com.facebook.o0.t0.a */
/* loaded from: classes2.dex */
public final class C5929a {

    /* renamed from: b */
    private static boolean f15482b;

    /* renamed from: a */
    public static final C5929a f15481a = new C5929a();

    /* renamed from: c */
    private static final String f15483c = C5929a.class.getCanonicalName();

    /* renamed from: d */
    private static final List<a> f15484d = new ArrayList();

    /* renamed from: e */
    private static final Set<String> f15485e = new CopyOnWriteArraySet();

    /* compiled from: RestrictiveDataManager.kt */
    /* renamed from: com.facebook.o0.t0.a$a */
    public static final class a {

        /* renamed from: a */
        private String f15486a;

        /* renamed from: b */
        private Map<String, String> f15487b;

        public a(String str, Map<String, String> map) {
            C9801m.m32346f(str, "eventName");
            C9801m.m32346f(map, "restrictiveParams");
            this.f15486a = str;
            this.f15487b = map;
        }

        /* renamed from: a */
        public final String m12767a() {
            return this.f15486a;
        }

        /* renamed from: b */
        public final Map<String, String> m12768b() {
            return this.f15487b;
        }

        /* renamed from: c */
        public final void m12769c(Map<String, String> map) {
            C9801m.m32346f(map, "<set-?>");
            this.f15487b = map;
        }
    }

    private C5929a() {
    }

    /* renamed from: a */
    public static final void m12761a() throws JSONException {
        C5929a c5929a = f15481a;
        f15482b = true;
        c5929a.m12763c();
    }

    /* renamed from: b */
    private final String m12762b(String str, String str2) {
        try {
            for (a aVar : new ArrayList(f15484d)) {
                if (aVar != null && C9801m.m32341a(str, aVar.m12767a())) {
                    for (String str3 : aVar.m12768b().keySet()) {
                        if (C9801m.m32341a(str2, str3)) {
                            return aVar.m12768b().get(str3);
                        }
                    }
                }
            }
            return null;
        } catch (Exception e2) {
            Log.w(f15483c, "getMatchedRuleType failed", e2);
            return null;
        }
    }

    /* renamed from: c */
    private final void m12763c() throws JSONException {
        String strM11405i;
        try {
            C5672d0 c5672d0 = C5672d0.f14392a;
            C5641a0 c5641a0 = C5641a0.f14199a;
            C5670c0 c5670c0M11428o = C5672d0.m11428o(C5641a0.m11285d(), false);
            if (c5670c0M11428o == null || (strM11405i = c5670c0M11428o.m11405i()) == null) {
                return;
            }
            if (strM11405i.length() == 0) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strM11405i);
            f15484d.clear();
            f15485e.clear();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (jSONObject2 != null) {
                    JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("restrictive_param");
                    C9801m.m32345e(next, RoomNotification.KEY);
                    a aVar = new a(next, new HashMap());
                    if (jSONObjectOptJSONObject != null) {
                        C5696p0 c5696p0 = C5696p0.f14478a;
                        aVar.m12769c(C5696p0.m11580m(jSONObjectOptJSONObject));
                        f15484d.add(aVar);
                    }
                    if (jSONObject2.has("process_event_name")) {
                        f15485e.add(aVar.m12767a());
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    private final boolean m12764d(String str) {
        return f15485e.contains(str);
    }

    /* renamed from: e */
    public static final String m12765e(String str) {
        C9801m.m32346f(str, "eventName");
        return (f15482b && f15481a.m12764d(str)) ? "_removed_" : str;
    }

    /* renamed from: f */
    public static final void m12766f(Map<String, String> map, String str) throws JSONException {
        C9801m.m32346f(map, "parameters");
        C9801m.m32346f(str, "eventName");
        if (f15482b) {
            HashMap map2 = new HashMap();
            for (String str2 : new ArrayList(map.keySet())) {
                String strM12762b = f15481a.m12762b(str, str2);
                if (strM12762b != null) {
                    map2.put(str2, strM12762b);
                    map.remove(str2);
                }
            }
            if (!map2.isEmpty()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : map2.entrySet()) {
                        jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                    }
                    map.put("_restrictedParams", jSONObject.toString());
                } catch (JSONException unused) {
                }
            }
        }
    }
}
