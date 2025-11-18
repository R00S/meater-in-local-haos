package com.facebook.p157o0.p160m0.p161n;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ParameterComponent.kt */
/* renamed from: com.facebook.o0.m0.n.b */
/* loaded from: classes.dex */
public final class C5870b {

    /* renamed from: a */
    public static final a f15232a = new a(null);

    /* renamed from: b */
    private final String f15233b;

    /* renamed from: c */
    private final String f15234c;

    /* renamed from: d */
    private final List<C5871c> f15235d;

    /* renamed from: e */
    private final String f15236e;

    /* compiled from: ParameterComponent.kt */
    /* renamed from: com.facebook.o0.m0.n.b$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    public C5870b(JSONObject jSONObject) throws JSONException {
        C9801m.m32346f(jSONObject, "component");
        String string = jSONObject.getString("name");
        C9801m.m32345e(string, "component.getString(PARAMETER_NAME_KEY)");
        this.f15233b = string;
        String strOptString = jSONObject.optString("value");
        C9801m.m32345e(strOptString, "component.optString(PARAMETER_VALUE_KEY)");
        this.f15234c = strOptString;
        String strOptString2 = jSONObject.optString("path_type", "absolute");
        C9801m.m32345e(strOptString2, "component.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE)");
        this.f15236e = strOptString2;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("path");
        if (jSONArrayOptJSONArray != null) {
            int i2 = 0;
            int length = jSONArrayOptJSONArray.length();
            if (length > 0) {
                while (true) {
                    int i3 = i2 + 1;
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                    C9801m.m32345e(jSONObject2, "jsonPathArray.getJSONObject(i)");
                    arrayList.add(new C5871c(jSONObject2));
                    if (i3 >= length) {
                        break;
                    } else {
                        i2 = i3;
                    }
                }
            }
        }
        this.f15235d = arrayList;
    }

    /* renamed from: a */
    public final String m12443a() {
        return this.f15233b;
    }

    /* renamed from: b */
    public final List<C5871c> m12444b() {
        return this.f15235d;
    }

    /* renamed from: c */
    public final String m12445c() {
        return this.f15236e;
    }

    /* renamed from: d */
    public final String m12446d() {
        return this.f15234c;
    }
}
