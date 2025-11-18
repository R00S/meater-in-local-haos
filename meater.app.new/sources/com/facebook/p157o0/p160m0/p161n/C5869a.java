package com.facebook.p157o0.p160m0.p161n;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: EventBinding.kt */
/* renamed from: com.facebook.o0.m0.n.a */
/* loaded from: classes.dex */
public final class C5869a {

    /* renamed from: a */
    public static final b f15215a = new b(null);

    /* renamed from: b */
    private final String f15216b;

    /* renamed from: c */
    private final c f15217c;

    /* renamed from: d */
    private final a f15218d;

    /* renamed from: e */
    private final String f15219e;

    /* renamed from: f */
    private final List<C5871c> f15220f;

    /* renamed from: g */
    private final List<C5870b> f15221g;

    /* renamed from: h */
    private final String f15222h;

    /* renamed from: i */
    private final String f15223i;

    /* renamed from: j */
    private final String f15224j;

    /* compiled from: EventBinding.kt */
    /* renamed from: com.facebook.o0.m0.n.a$a */
    public enum a {
        CLICK,
        SELECTED,
        TEXT_CHANGED;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            return (a[]) Arrays.copyOf(aVarArrValuesCustom, aVarArrValuesCustom.length);
        }
    }

    /* compiled from: EventBinding.kt */
    /* renamed from: com.facebook.o0.m0.n.a$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final C5869a m12440a(JSONObject jSONObject) throws JSONException, IllegalArgumentException {
            int length;
            C9801m.m32346f(jSONObject, "mapping");
            String string = jSONObject.getString("event_name");
            String string2 = jSONObject.getString("method");
            C9801m.m32345e(string2, "mapping.getString(\"method\")");
            Locale locale = Locale.ENGLISH;
            C9801m.m32345e(locale, "ENGLISH");
            String upperCase = string2.toUpperCase(locale);
            C9801m.m32345e(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            c cVarValueOf = c.valueOf(upperCase);
            String string3 = jSONObject.getString("event_type");
            C9801m.m32345e(string3, "mapping.getString(\"event_type\")");
            C9801m.m32345e(locale, "ENGLISH");
            String upperCase2 = string3.toUpperCase(locale);
            C9801m.m32345e(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
            a aVarValueOf = a.valueOf(upperCase2);
            String string4 = jSONObject.getString("app_version");
            JSONArray jSONArray = jSONObject.getJSONArray("path");
            ArrayList arrayList = new ArrayList();
            int length2 = jSONArray.length();
            int i2 = 0;
            if (length2 > 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                    C9801m.m32345e(jSONObject2, "jsonPath");
                    arrayList.add(new C5871c(jSONObject2));
                    if (i4 >= length2) {
                        break;
                    }
                    i3 = i4;
                }
            }
            String strOptString = jSONObject.optString("path_type", "absolute");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("parameters");
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null && (length = jSONArrayOptJSONArray.length()) > 0) {
                while (true) {
                    int i5 = i2 + 1;
                    JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i2);
                    C9801m.m32345e(jSONObject3, "jsonParameter");
                    arrayList2.add(new C5870b(jSONObject3));
                    if (i5 >= length) {
                        break;
                    }
                    i2 = i5;
                }
            }
            String strOptString2 = jSONObject.optString("component_id");
            String strOptString3 = jSONObject.optString("activity_name");
            C9801m.m32345e(string, "eventName");
            C9801m.m32345e(string4, "appVersion");
            C9801m.m32345e(strOptString2, "componentId");
            C9801m.m32345e(strOptString, "pathType");
            C9801m.m32345e(strOptString3, "activityName");
            return new C5869a(string, cVarValueOf, aVarValueOf, string4, arrayList, arrayList2, strOptString2, strOptString, strOptString3);
        }

        /* renamed from: b */
        public final List<C5869a> m12441b(JSONArray jSONArray) throws JSONException {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                int i2 = 0;
                try {
                    int length = jSONArray.length();
                    if (length > 0) {
                        while (true) {
                            int i3 = i2 + 1;
                            JSONObject jSONObject = jSONArray.getJSONObject(i2);
                            C9801m.m32345e(jSONObject, "array.getJSONObject(i)");
                            arrayList.add(m12440a(jSONObject));
                            if (i3 >= length) {
                                break;
                            }
                            i2 = i3;
                        }
                    }
                } catch (IllegalArgumentException | JSONException unused) {
                }
            }
            return arrayList;
        }
    }

    /* compiled from: EventBinding.kt */
    /* renamed from: com.facebook.o0.m0.n.a$c */
    public enum c {
        MANUAL,
        INFERENCE;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] cVarArrValuesCustom = values();
            return (c[]) Arrays.copyOf(cVarArrValuesCustom, cVarArrValuesCustom.length);
        }
    }

    public C5869a(String str, c cVar, a aVar, String str2, List<C5871c> list, List<C5870b> list2, String str3, String str4, String str5) {
        C9801m.m32346f(str, "eventName");
        C9801m.m32346f(cVar, "method");
        C9801m.m32346f(aVar, "type");
        C9801m.m32346f(str2, "appVersion");
        C9801m.m32346f(list, "path");
        C9801m.m32346f(list2, "parameters");
        C9801m.m32346f(str3, "componentId");
        C9801m.m32346f(str4, "pathType");
        C9801m.m32346f(str5, "activityName");
        this.f15216b = str;
        this.f15217c = cVar;
        this.f15218d = aVar;
        this.f15219e = str2;
        this.f15220f = list;
        this.f15221g = list2;
        this.f15222h = str3;
        this.f15223i = str4;
        this.f15224j = str5;
    }

    /* renamed from: a */
    public final String m12435a() {
        return this.f15224j;
    }

    /* renamed from: b */
    public final String m12436b() {
        return this.f15216b;
    }

    /* renamed from: c */
    public final List<C5870b> m12437c() {
        List<C5870b> listUnmodifiableList = Collections.unmodifiableList(this.f15221g);
        C9801m.m32345e(listUnmodifiableList, "unmodifiableList(parameters)");
        return listUnmodifiableList;
    }

    /* renamed from: d */
    public final List<C5871c> m12438d() {
        List<C5871c> listUnmodifiableList = Collections.unmodifiableList(this.f15220f);
        C9801m.m32345e(listUnmodifiableList, "unmodifiableList(path)");
        return listUnmodifiableList;
    }
}
