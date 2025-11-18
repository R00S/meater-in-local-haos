package com.facebook.p157o0.p164p0;

import android.os.Build;
import android.os.Bundle;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import com.facebook.C5641a0;
import com.facebook.internal.C5670c0;
import com.facebook.internal.C5672d0;
import com.facebook.internal.C5696p0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MACARuleMatchingManager.kt */
/* renamed from: com.facebook.o0.p0.b */
/* loaded from: classes2.dex */
public final class C5893b {

    /* renamed from: b */
    private static boolean f15340b;

    /* renamed from: c */
    private static JSONArray f15341c;

    /* renamed from: a */
    public static final C5893b f15339a = new C5893b();

    /* renamed from: d */
    private static String[] f15342d = {"event", "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB"};

    private C5893b() {
    }

    /* renamed from: a */
    public static final void m12583a() {
        f15339a.m12589g();
        if (f15341c != null) {
            f15340b = true;
        }
    }

    /* renamed from: b */
    public static final void m12584b(Bundle bundle, String str) {
        String language;
        String country;
        C9801m.m32346f(bundle, "params");
        C9801m.m32346f(str, "event");
        bundle.putString("event", str);
        StringBuilder sb = new StringBuilder();
        C5696p0 c5696p0 = C5696p0.f14478a;
        Locale localeM11607G = c5696p0.m11607G();
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (localeM11607G == null || (language = localeM11607G.getLanguage()) == null) {
            language = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(language);
        sb.append('_');
        Locale localeM11607G2 = c5696p0.m11607G();
        if (localeM11607G2 == null || (country = localeM11607G2.getCountry()) == null) {
            country = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(country);
        bundle.putString("_locale", sb.toString());
        String strM11608N = c5696p0.m11608N();
        if (strM11608N == null) {
            strM11608N = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        bundle.putString("_appVersion", strM11608N);
        bundle.putString("_deviceOS", "ANDROID");
        bundle.putString("_platform", "mobile");
        String str3 = Build.MODEL;
        if (str3 == null) {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        bundle.putString("_deviceModel", str3);
        C5641a0 c5641a0 = C5641a0.f14199a;
        bundle.putString("_nativeAppID", C5641a0.m11285d());
        String strM11608N2 = c5696p0.m11608N();
        if (strM11608N2 != null) {
            str2 = strM11608N2;
        }
        bundle.putString("_nativeAppShortVersion", str2);
        bundle.putString("_timezone", c5696p0.m11606B());
        bundle.putString("_carrier", c5696p0.m11610w());
        bundle.putString("_deviceOSTypeName", "ANDROID");
        bundle.putString("_deviceOSVersion", Build.VERSION.RELEASE);
        bundle.putLong("_remainingDiskGB", c5696p0.m11609u());
    }

    /* renamed from: c */
    public static final String m12585c(JSONObject jSONObject) {
        C9801m.m32346f(jSONObject, "logic");
        Iterator<String> itKeys = jSONObject.keys();
        if (itKeys.hasNext()) {
            return itKeys.next();
        }
        return null;
    }

    /* renamed from: d */
    public static final String m12586d(Bundle bundle) {
        String strOptString;
        JSONArray jSONArray = f15341c;
        if (jSONArray == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        Integer numValueOf = jSONArray == null ? null : Integer.valueOf(jSONArray.length());
        if (numValueOf != null && numValueOf.intValue() == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        JSONArray jSONArray2 = f15341c;
        if (jSONArray2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int length = jSONArray2.length();
        if (length > 0) {
            while (true) {
                int i3 = i2 + 1;
                String strOptString2 = jSONArray2.optString(i2);
                if (strOptString2 != null) {
                    JSONObject jSONObject = new JSONObject(strOptString2);
                    long jOptLong = jSONObject.optLong(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID);
                    if (jOptLong != 0 && (strOptString = jSONObject.optString("rule")) != null && m12588f(strOptString, bundle)) {
                        arrayList.add(Long.valueOf(jOptLong));
                    }
                }
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        }
        String string = new JSONArray((Collection) arrayList).toString();
        C9801m.m32345e(string, "JSONArray(res).toString()");
        return string;
    }

    /* renamed from: e */
    public static final ArrayList<String> m12587e(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        int i2 = 0;
        int length = jSONArray.length();
        if (length > 0) {
            while (true) {
                int i3 = i2 + 1;
                arrayList.add(jSONArray.get(i2).toString());
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public static final boolean m12588f(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject;
        String strM12585c;
        int length;
        if (str == null || bundle == null || (strM12585c = m12585c((jSONObject = new JSONObject(str)))) == null) {
            return false;
        }
        Object obj = jSONObject.get(strM12585c);
        int iHashCode = strM12585c.hashCode();
        if (iHashCode != 3555) {
            if (iHashCode != 96727) {
                if (iHashCode == 109267 && strM12585c.equals("not")) {
                    return !m12588f(obj.toString(), bundle);
                }
            } else if (strM12585c.equals("and")) {
                JSONArray jSONArray = (JSONArray) obj;
                if (jSONArray == null) {
                    return false;
                }
                int length2 = jSONArray.length();
                if (length2 > 0) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        if (!m12588f(jSONArray.get(i2).toString(), bundle)) {
                            return false;
                        }
                        if (i3 >= length2) {
                            break;
                        }
                        i2 = i3;
                    }
                }
                return true;
            }
        } else if (strM12585c.equals("or")) {
            JSONArray jSONArray2 = (JSONArray) obj;
            if (jSONArray2 != null && (length = jSONArray2.length()) > 0) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    if (m12588f(jSONArray2.get(i4).toString(), bundle)) {
                        return true;
                    }
                    if (i5 >= length) {
                        break;
                    }
                    i4 = i5;
                }
            }
            return false;
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        if (jSONObject2 == null) {
            return false;
        }
        return m12592j(strM12585c, jSONObject2, bundle);
    }

    /* renamed from: g */
    private final void m12589g() {
        C5672d0 c5672d0 = C5672d0.f14392a;
        C5641a0 c5641a0 = C5641a0.f14199a;
        C5670c0 c5670c0M11428o = C5672d0.m11428o(C5641a0.m11285d(), false);
        if (c5670c0M11428o == null) {
            return;
        }
        f15341c = c5670c0M11428o.m11402f();
    }

    /* renamed from: h */
    public static final void m12590h(Bundle bundle, String str) {
        C9801m.m32346f(str, "event");
        if (!f15340b || bundle == null) {
            return;
        }
        try {
            m12584b(bundle, str);
            bundle.putString("_audiencePropertyIds", m12586d(bundle));
            bundle.putString("cs_maca", "1");
            m12591i(bundle);
        } catch (Exception unused) {
        }
    }

    /* renamed from: i */
    public static final void m12591i(Bundle bundle) {
        C9801m.m32346f(bundle, "params");
        String[] strArr = f15342d;
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            String str = strArr[i2];
            i2++;
            bundle.remove(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x023a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0249 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x036a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x037f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:253:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:258:? A[RETURN, SYNTHETIC] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m12592j(java.lang.String r8, org.json.JSONObject r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 1094
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p157o0.p164p0.C5893b.m12592j(java.lang.String, org.json.JSONObject, android.os.Bundle):boolean");
    }
}
