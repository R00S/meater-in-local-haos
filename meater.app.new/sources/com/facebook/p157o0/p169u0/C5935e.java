package com.facebook.p157o0.p169u0;

import android.util.Patterns;
import cm.aptoide.p092pt.root.execution.Command;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.C10773s;
import kotlin.collections.C10810q0;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10547v;
import kotlin.text.Charsets;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FeatureExtractor.kt */
/* renamed from: com.facebook.o0.u0.e */
/* loaded from: classes2.dex */
public final class C5935e {

    /* renamed from: a */
    public static final C5935e f15501a = new C5935e();

    /* renamed from: b */
    private static Map<String, String> f15502b;

    /* renamed from: c */
    private static Map<String, String> f15503c;

    /* renamed from: d */
    private static Map<String, String> f15504d;

    /* renamed from: e */
    private static JSONObject f15505e;

    /* renamed from: f */
    private static boolean f15506f;

    private C5935e() {
    }

    /* renamed from: a */
    public static final float[] m12778a(JSONObject jSONObject, String str) {
        String lowerCase;
        JSONObject jSONObject2;
        String strOptString;
        JSONArray jSONArray;
        C5935e c5935e;
        JSONObject jSONObjectM12779b;
        C9801m.m32346f(jSONObject, "viewHierarchy");
        C9801m.m32346f(str, "appName");
        if (!f15506f) {
            return null;
        }
        float[] fArr = new float[30];
        for (int i2 = 0; i2 < 30; i2++) {
            fArr[i2] = 0.0f;
        }
        try {
            lowerCase = str.toLowerCase();
            C9801m.m32345e(lowerCase, "(this as java.lang.String).toLowerCase()");
            jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
            strOptString = jSONObject.optString("screenname");
            jSONArray = new JSONArray();
            c5935e = f15501a;
            c5935e.m12787j(jSONObject2, jSONArray);
            c5935e.m12790m(fArr, c5935e.m12786i(jSONObject2));
            jSONObjectM12779b = c5935e.m12779b(jSONObject2);
        } catch (JSONException unused) {
        }
        if (jSONObjectM12779b == null) {
            return null;
        }
        C9801m.m32345e(strOptString, "screenName");
        String string = jSONObject2.toString();
        C9801m.m32345e(string, "viewTree.toString()");
        c5935e.m12790m(fArr, c5935e.m12785h(jSONObjectM12779b, jSONArray, strOptString, string, lowerCase));
        return fArr;
    }

    /* renamed from: b */
    private final JSONObject m12779b(JSONObject jSONObject) throws JSONException {
        if (jSONObject.optBoolean("is_interacted")) {
            return jSONObject;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int i2 = 0;
        int length = jSONArrayOptJSONArray.length();
        if (length > 0) {
            while (true) {
                int i3 = i2 + 1;
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                C9801m.m32345e(jSONObject2, "children.getJSONObject(i)");
                JSONObject jSONObjectM12779b = m12779b(jSONObject2);
                if (jSONObjectM12779b != null) {
                    return jSONObjectM12779b;
                }
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static final String m12780c(String str, String str2, String str3) {
        C9801m.m32346f(str, "buttonText");
        C9801m.m32346f(str2, "activityName");
        C9801m.m32346f(str3, "appName");
        String str4 = str3 + " | " + str2 + ", " + str;
        if (str4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = str4.toLowerCase();
        C9801m.m32345e(lowerCase, "(this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    /* renamed from: d */
    public static final void m12781d(File file) throws IOException {
        try {
            f15505e = new JSONObject();
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            fileInputStream.close();
            f15505e = new JSONObject(new String(bArr, Charsets.f40651b));
            f15502b = C10810q0.m38800l(C10773s.m38547a("ENGLISH", "1"), C10773s.m38547a("GERMAN", "2"), C10773s.m38547a("SPANISH", "3"), C10773s.m38547a("JAPANESE", "4"));
            f15503c = C10810q0.m38800l(C10773s.m38547a("VIEW_CONTENT", "0"), C10773s.m38547a("SEARCH", "1"), C10773s.m38547a("ADD_TO_CART", "2"), C10773s.m38547a("ADD_TO_WISHLIST", "3"), C10773s.m38547a("INITIATE_CHECKOUT", "4"), C10773s.m38547a("ADD_PAYMENT_INFO", "5"), C10773s.m38547a("PURCHASE", "6"), C10773s.m38547a("LEAD", "7"), C10773s.m38547a("COMPLETE_REGISTRATION", "8"));
            f15504d = C10810q0.m38800l(C10773s.m38547a("BUTTON_TEXT", "1"), C10773s.m38547a("PAGE_TITLE", "2"), C10773s.m38547a("RESOLVED_DOCUMENT_LINK", "3"), C10773s.m38547a("BUTTON_ID", "4"));
            f15506f = true;
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    private final boolean m12782e(JSONObject jSONObject) {
        return ((jSONObject.optInt("classtypebitmask") & 1) << 5) > 0;
    }

    /* renamed from: f */
    public static final boolean m12783f() {
        return f15506f;
    }

    /* renamed from: g */
    private final boolean m12784g(String[] strArr, String[] strArr2) {
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            String str = strArr[i2];
            i2++;
            int length2 = strArr2.length;
            int i3 = 0;
            while (i3 < length2) {
                String str2 = strArr2[i3];
                i3++;
                if (C10547v.m37538J(str2, str, false, 2, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    private final float[] m12785h(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) throws JSONException {
        float[] fArr = new float[30];
        int i2 = 0;
        while (true) {
            if (i2 >= 30) {
                break;
            }
            fArr[i2] = 0.0f;
            i2++;
        }
        int length = jSONArray.length();
        fArr[3] = length > 1 ? length - 1.0f : 0.0f;
        try {
            int length2 = jSONArray.length();
            if (length2 > 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                    C9801m.m32345e(jSONObject2, "siblings.getJSONObject(i)");
                    if (m12782e(jSONObject2)) {
                        fArr[9] = fArr[9] + 1.0f;
                    }
                    if (i4 >= length2) {
                        break;
                    }
                    i3 = i4;
                }
            }
        } catch (JSONException unused) {
        }
        fArr[13] = -1.0f;
        fArr[14] = -1.0f;
        String str4 = str + '|' + str3;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        m12791n(jSONObject, sb2, sb);
        String string = sb.toString();
        C9801m.m32345e(string, "hintSB.toString()");
        String string2 = sb2.toString();
        C9801m.m32345e(string2, "textSB.toString()");
        fArr[15] = m12789l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", string2) ? 1.0f : 0.0f;
        fArr[16] = m12789l("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
        fArr[17] = m12789l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", string) ? 1.0f : 0.0f;
        fArr[18] = C10547v.m37538J(str2, "password", false, 2, null) ? 1.0f : 0.0f;
        fArr[19] = m12788k("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2) ? 1.0f : 0.0f;
        fArr[20] = m12788k("(?i)(sign in)|login|signIn", str2) ? 1.0f : 0.0f;
        fArr[21] = m12788k("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2) ? 1.0f : 0.0f;
        fArr[22] = m12789l("ENGLISH", "PURCHASE", "BUTTON_TEXT", string2) ? 1.0f : 0.0f;
        fArr[24] = m12789l("ENGLISH", "PURCHASE", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
        fArr[25] = m12788k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", string2) ? 1.0f : 0.0f;
        fArr[27] = m12788k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4) ? 1.0f : 0.0f;
        fArr[28] = m12789l("ENGLISH", "LEAD", "BUTTON_TEXT", string2) ? 1.0f : 0.0f;
        fArr[29] = m12789l("ENGLISH", "LEAD", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
        return fArr;
    }

    /* renamed from: i */
    private final float[] m12786i(JSONObject jSONObject) throws JSONException {
        float[] fArr = new float[30];
        int i2 = 0;
        for (int i3 = 0; i3 < 30; i3++) {
            fArr[i3] = 0.0f;
        }
        String strOptString = jSONObject.optString(Command.CommandHandler.TEXT);
        C9801m.m32345e(strOptString, "node.optString(TEXT_KEY)");
        String lowerCase = strOptString.toLowerCase();
        C9801m.m32345e(lowerCase, "(this as java.lang.String).toLowerCase()");
        String strOptString2 = jSONObject.optString("hint");
        C9801m.m32345e(strOptString2, "node.optString(HINT_KEY)");
        String lowerCase2 = strOptString2.toLowerCase();
        C9801m.m32345e(lowerCase2, "(this as java.lang.String).toLowerCase()");
        String strOptString3 = jSONObject.optString("classname");
        C9801m.m32345e(strOptString3, "node.optString(CLASS_NAME_KEY)");
        String lowerCase3 = strOptString3.toLowerCase();
        C9801m.m32345e(lowerCase3, "(this as java.lang.String).toLowerCase()");
        int iOptInt = jSONObject.optInt("inputtype", -1);
        String[] strArr = {lowerCase, lowerCase2};
        if (m12784g(new String[]{"$", "amount", "price", "total"}, strArr)) {
            fArr[0] = fArr[0] + 1.0f;
        }
        if (m12784g(new String[]{"password", "pwd"}, strArr)) {
            fArr[1] = fArr[1] + 1.0f;
        }
        if (m12784g(new String[]{"tel", "phone"}, strArr)) {
            fArr[2] = fArr[2] + 1.0f;
        }
        if (m12784g(new String[]{"search"}, strArr)) {
            fArr[4] = fArr[4] + 1.0f;
        }
        if (iOptInt >= 0) {
            fArr[5] = fArr[5] + 1.0f;
        }
        if (iOptInt == 3 || iOptInt == 2) {
            fArr[6] = fArr[6] + 1.0f;
        }
        if (iOptInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
            fArr[7] = fArr[7] + 1.0f;
        }
        if (C10547v.m37538J(lowerCase3, "checkbox", false, 2, null)) {
            fArr[8] = fArr[8] + 1.0f;
        }
        if (m12784g(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
            fArr[10] = fArr[10] + 1.0f;
        }
        if (C10547v.m37538J(lowerCase3, "radio", false, 2, null) && C10547v.m37538J(lowerCase3, "button", false, 2, null)) {
            fArr[12] = fArr[12] + 1.0f;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            int length = jSONArrayOptJSONArray.length();
            if (length > 0) {
                while (true) {
                    int i4 = i2 + 1;
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                    C9801m.m32345e(jSONObject2, "childViews.getJSONObject(i)");
                    m12790m(fArr, m12786i(jSONObject2));
                    if (i4 >= length) {
                        break;
                    }
                    i2 = i4;
                }
            }
        } catch (JSONException unused) {
        }
        return fArr;
    }

    /* renamed from: j */
    private final boolean m12787j(JSONObject jSONObject, JSONArray jSONArray) throws JSONException {
        boolean z;
        boolean z2;
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            int length = jSONArrayOptJSONArray.length();
            if (length > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    if (jSONArrayOptJSONArray.getJSONObject(i2).optBoolean("is_interacted")) {
                        z = true;
                        z2 = true;
                        break;
                    }
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
                z = false;
                z2 = false;
            } else {
                z = false;
                z2 = false;
            }
            JSONArray jSONArray2 = new JSONArray();
            if (z) {
                int length2 = jSONArrayOptJSONArray.length();
                if (length2 > 0) {
                    int i4 = 0;
                    while (true) {
                        int i5 = i4 + 1;
                        jSONArray.put(jSONArrayOptJSONArray.getJSONObject(i4));
                        if (i5 >= length2) {
                            break;
                        }
                        i4 = i5;
                    }
                }
            } else {
                int length3 = jSONArrayOptJSONArray.length();
                if (length3 > 0) {
                    int i6 = 0;
                    while (true) {
                        int i7 = i6 + 1;
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i6);
                        C9801m.m32345e(jSONObject2, "child");
                        if (m12787j(jSONObject2, jSONArray)) {
                            jSONArray2.put(jSONObject2);
                            z2 = true;
                        }
                        if (i7 >= length3) {
                            break;
                        }
                        i6 = i7;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
            }
            return z2;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: k */
    private final boolean m12788k(String str, String str2) {
        return Pattern.compile(str).matcher(str2).find();
    }

    /* renamed from: l */
    private final boolean m12789l(String str, String str2, String str3, String str4) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        JSONObject jSONObjectOptJSONObject4;
        JSONObject jSONObject = f15505e;
        String strOptString = null;
        if (jSONObject == null) {
            C9801m.m32363w("rules");
            throw null;
        }
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rulesForLanguage");
        if (jSONObjectOptJSONObject5 == null) {
            jSONObjectOptJSONObject = null;
        } else {
            Map<String, String> map = f15502b;
            if (map == null) {
                C9801m.m32363w("languageInfo");
                throw null;
            }
            jSONObjectOptJSONObject = jSONObjectOptJSONObject5.optJSONObject(map.get(str));
        }
        if (jSONObjectOptJSONObject == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rulesForEvent")) == null) {
            jSONObjectOptJSONObject3 = null;
        } else {
            Map<String, String> map2 = f15503c;
            if (map2 == null) {
                C9801m.m32363w("eventInfo");
                throw null;
            }
            jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(map2.get(str2));
        }
        if (jSONObjectOptJSONObject3 != null && (jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("positiveRules")) != null) {
            Map<String, String> map3 = f15504d;
            if (map3 == null) {
                C9801m.m32363w("textTypeInfo");
                throw null;
            }
            strOptString = jSONObjectOptJSONObject4.optString(map3.get(str3));
        }
        if (strOptString == null) {
            return false;
        }
        return m12788k(strOptString, str4);
    }

    /* renamed from: m */
    private final void m12790m(float[] fArr, float[] fArr2) {
        int length = fArr.length - 1;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            fArr[i2] = fArr[i2] + fArr2[i2];
            if (i3 > length) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    /* renamed from: n */
    private final void m12791n(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) throws JSONException {
        int length;
        String strOptString = jSONObject.optString(Command.CommandHandler.TEXT, HttpUrl.FRAGMENT_ENCODE_SET);
        C9801m.m32345e(strOptString, "view.optString(TEXT_KEY, \"\")");
        String lowerCase = strOptString.toLowerCase();
        C9801m.m32345e(lowerCase, "(this as java.lang.String).toLowerCase()");
        String strOptString2 = jSONObject.optString("hint", HttpUrl.FRAGMENT_ENCODE_SET);
        C9801m.m32345e(strOptString2, "view.optString(HINT_KEY, \"\")");
        String lowerCase2 = strOptString2.toLowerCase();
        C9801m.m32345e(lowerCase2, "(this as java.lang.String).toLowerCase()");
        int i2 = 0;
        if (lowerCase.length() > 0) {
            sb.append(lowerCase);
            sb.append(" ");
        }
        if (lowerCase2.length() > 0) {
            sb2.append(lowerCase2);
            sb2.append(" ");
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
        if (jSONArrayOptJSONArray == null || (length = jSONArrayOptJSONArray.length()) <= 0) {
            return;
        }
        while (true) {
            int i3 = i2 + 1;
            try {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                C9801m.m32345e(jSONObject2, "currentChildView");
                m12791n(jSONObject2, sb, sb2);
            } catch (JSONException unused) {
            }
            if (i3 >= length) {
                return;
            } else {
                i2 = i3;
            }
        }
    }
}
