package com.facebook.p157o0.p159l0;

import android.content.SharedPreferences;
import com.facebook.C5641a0;
import com.facebook.C5653d0;
import com.facebook.EnumC5655e0;
import com.facebook.EnumC5659g0;
import com.facebook.GraphRequest;
import com.facebook.internal.C5684j0;
import com.facebook.internal.C5696p0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C9821b;
import kotlin.collections.C10813s;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10546u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AppEventsCAPIManager.kt */
/* renamed from: com.facebook.o0.l0.f */
/* loaded from: classes.dex */
public final class C5845f {

    /* renamed from: a */
    public static final C5845f f15023a = new C5845f();

    /* renamed from: b */
    private static final String f15024b = C5845f.class.getCanonicalName();

    /* renamed from: c */
    private static boolean f15025c;

    private C5845f() {
    }

    /* renamed from: a */
    public static final void m12308a() {
        try {
            C5840a c5840a = new GraphRequest.InterfaceC5631b() { // from class: com.facebook.o0.l0.a
                @Override // com.facebook.GraphRequest.InterfaceC5631b
                /* renamed from: b */
                public final void mo11196b(C5653d0 c5653d0) {
                    C5845f.m12309b(c5653d0);
                }
            };
            C5641a0 c5641a0 = C5641a0.f14199a;
            GraphRequest graphRequest = new GraphRequest(null, C9801m.m32354n(C5641a0.m11285d(), "/cloudbridge_settings"), null, EnumC5655e0.GET, c5840a, null, 32, null);
            C5684j0.a aVar = C5684j0.f14429a;
            EnumC5659g0 enumC5659g0 = EnumC5659g0.APP_EVENTS;
            String str = f15024b;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            aVar.m11455c(enumC5659g0, str, " \n\nCreating Graph Request: \n=============\n%s\n\n ", graphRequest);
            graphRequest.m11180k();
        } catch (JSONException e2) {
            C5684j0.a aVar2 = C5684j0.f14429a;
            EnumC5659g0 enumC5659g02 = EnumC5659g0.APP_EVENTS;
            String str2 = f15024b;
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            aVar2.m11455c(enumC5659g02, str2, " \n\nGraph Request Exception: \n=============\n%s\n\n ", C9821b.m32368b(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m12309b(C5653d0 c5653d0) {
        C9801m.m32346f(c5653d0, "response");
        f15023a.m12312c(c5653d0);
    }

    /* renamed from: d */
    public static final Map<String, Object> m12310d() {
        C5641a0 c5641a0 = C5641a0.f14199a;
        SharedPreferences sharedPreferences = C5641a0.m11284c().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return null;
        }
        EnumC5854o enumC5854o = EnumC5854o.DATASETID;
        String string = sharedPreferences.getString(enumC5854o.m12369k(), null);
        EnumC5854o enumC5854o2 = EnumC5854o.URL;
        String string2 = sharedPreferences.getString(enumC5854o2.m12369k(), null);
        EnumC5854o enumC5854o3 = EnumC5854o.ACCESSKEY;
        String string3 = sharedPreferences.getString(enumC5854o3.m12369k(), null);
        if (string == null || C10546u.m37518t(string)) {
            return null;
        }
        if (string2 == null || C10546u.m37518t(string2)) {
            return null;
        }
        if (string3 == null || C10546u.m37518t(string3)) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(enumC5854o2.m12369k(), string2);
        linkedHashMap.put(enumC5854o.m12369k(), string);
        linkedHashMap.put(enumC5854o3.m12369k(), string3);
        C5684j0.f14429a.m11455c(EnumC5659g0.APP_EVENTS, f15024b.toString(), " \n\nLoading Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", string, string2, string3);
        return linkedHashMap;
    }

    /* renamed from: c */
    public final void m12312c(C5653d0 c5653d0) {
        C9801m.m32346f(c5653d0, "response");
        boolean zBooleanValue = false;
        if (c5653d0.m11338b() != null) {
            C5684j0.a aVar = C5684j0.f14429a;
            EnumC5659g0 enumC5659g0 = EnumC5659g0.APP_EVENTS;
            String str = f15024b;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            aVar.m11455c(enumC5659g0, str, " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", c5653d0.m11338b().toString(), String.valueOf(c5653d0.m11338b().m11143e()));
            Map<String, Object> mapM12310d = m12310d();
            if (mapM12310d != null) {
                URL url = new URL(String.valueOf(mapM12310d.get(EnumC5854o.URL.m12369k())));
                C5847h c5847h = C5847h.f15048a;
                C5847h.m12337c(String.valueOf(mapM12310d.get(EnumC5854o.DATASETID.m12369k())), url.getProtocol() + "://" + ((Object) url.getHost()), String.valueOf(mapM12310d.get(EnumC5854o.ACCESSKEY.m12369k())));
                f15025c = true;
                return;
            }
            return;
        }
        C5684j0.a aVar2 = C5684j0.f14429a;
        EnumC5659g0 enumC5659g02 = EnumC5659g0.APP_EVENTS;
        String str2 = f15024b;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        aVar2.m11455c(enumC5659g02, str2, " \n\nGraph Response Received: \n================\n%s\n\n ", c5653d0);
        JSONObject jSONObjectM11339c = c5653d0.m11339c();
        try {
            C5696p0 c5696p0 = C5696p0.f14478a;
            Object obj = jSONObjectM11339c == null ? null : jSONObjectM11339c.get("data");
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
            }
            Map<String, ? extends Object> mapM11578l = C5696p0.m11578l(new JSONObject((String) C10813s.m38832W(C5696p0.m11576k((JSONArray) obj))));
            String str3 = (String) mapM11578l.get(EnumC5854o.URL.m12369k());
            String str4 = (String) mapM11578l.get(EnumC5854o.DATASETID.m12369k());
            String str5 = (String) mapM11578l.get(EnumC5854o.ACCESSKEY.m12369k());
            if (str3 == null || str4 == null || str5 == null) {
                C9801m.m32345e(str2, "TAG");
                aVar2.m11454b(enumC5659g02, str2, "CloudBridge Settings API response doesn't have valid data");
                return;
            }
            try {
                C5847h c5847h2 = C5847h.f15048a;
                C5847h.m12337c(str4, str3, str5);
                m12314g(mapM11578l);
                EnumC5854o enumC5854o = EnumC5854o.ENABLED;
                if (mapM11578l.get(enumC5854o.m12369k()) != null) {
                    Object obj2 = mapM11578l.get(enumC5854o.m12369k());
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    }
                    zBooleanValue = ((Boolean) obj2).booleanValue();
                }
                f15025c = zBooleanValue;
            } catch (MalformedURLException e2) {
                C5684j0.a aVar3 = C5684j0.f14429a;
                EnumC5659g0 enumC5659g03 = EnumC5659g0.APP_EVENTS;
                String str6 = f15024b;
                C9801m.m32345e(str6, "TAG");
                aVar3.m11455c(enumC5659g03, str6, "CloudBridge Settings API response doesn't have valid url\n %s ", C9821b.m32368b(e2));
            }
        } catch (NullPointerException e3) {
            C5684j0.a aVar4 = C5684j0.f14429a;
            EnumC5659g0 enumC5659g04 = EnumC5659g0.APP_EVENTS;
            String str7 = f15024b;
            C9801m.m32345e(str7, "TAG");
            aVar4.m11455c(enumC5659g04, str7, "CloudBridge Settings API response is not a valid json: \n%s ", C9821b.m32368b(e3));
        } catch (JSONException e4) {
            C5684j0.a aVar5 = C5684j0.f14429a;
            EnumC5659g0 enumC5659g05 = EnumC5659g0.APP_EVENTS;
            String str8 = f15024b;
            C9801m.m32345e(str8, "TAG");
            aVar5.m11455c(enumC5659g05, str8, "CloudBridge Settings API response is not a valid json: \n%s ", C9821b.m32368b(e4));
        }
    }

    /* renamed from: e */
    public final boolean m12313e() {
        return f15025c;
    }

    /* renamed from: g */
    public final void m12314g(Map<String, ? extends Object> map) {
        C5641a0 c5641a0 = C5641a0.f14199a;
        SharedPreferences sharedPreferences = C5641a0.m11284c().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return;
        }
        if (map == null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.clear();
            editorEdit.apply();
            return;
        }
        EnumC5854o enumC5854o = EnumC5854o.DATASETID;
        Object obj = map.get(enumC5854o.m12369k());
        EnumC5854o enumC5854o2 = EnumC5854o.URL;
        Object obj2 = map.get(enumC5854o2.m12369k());
        EnumC5854o enumC5854o3 = EnumC5854o.ACCESSKEY;
        Object obj3 = map.get(enumC5854o3.m12369k());
        if (obj == null || obj2 == null || obj3 == null) {
            return;
        }
        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
        editorEdit2.putString(enumC5854o.m12369k(), obj.toString());
        editorEdit2.putString(enumC5854o2.m12369k(), obj2.toString());
        editorEdit2.putString(enumC5854o3.m12369k(), obj3.toString());
        editorEdit2.apply();
        C5684j0.f14429a.m11455c(EnumC5659g0.APP_EVENTS, f15024b.toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
    }
}
