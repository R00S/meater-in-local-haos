package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.database.room.RoomNotification;
import cm.aptoide.p092pt.dataprovider.BuildConfig;
import com.facebook.AccessToken;
import com.facebook.C5641a0;
import com.facebook.C5653d0;
import com.facebook.EnumC5655e0;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.internal.C5666a0;
import com.facebook.p157o0.C5831j0;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.C10546u;
import kotlin.text.C10547v;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: Utility.kt */
/* renamed from: com.facebook.internal.p0 */
/* loaded from: classes2.dex */
public final class C5696p0 {

    /* renamed from: b */
    private static int f14479b;

    /* renamed from: j */
    private static Locale f14487j;

    /* renamed from: a */
    public static final C5696p0 f14478a = new C5696p0();

    /* renamed from: c */
    private static long f14480c = -1;

    /* renamed from: d */
    private static long f14481d = -1;

    /* renamed from: e */
    private static long f14482e = -1;

    /* renamed from: f */
    private static String f14483f = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: g */
    private static String f14484g = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: h */
    private static String f14485h = "NoCarrier";

    /* renamed from: i */
    private static String f14486i = HttpUrl.FRAGMENT_ENCODE_SET;

    /* compiled from: Utility.kt */
    /* renamed from: com.facebook.internal.p0$a */
    public interface a {
        /* renamed from: a */
        void mo11259a(JSONObject jSONObject);

        /* renamed from: b */
        void mo11260b(FacebookException facebookException);
    }

    private C5696p0() {
    }

    /* renamed from: A */
    public static final JSONObject m11525A() {
        C5641a0 c5641a0 = C5641a0.f14199a;
        String string = C5641a0.m11284c().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
        if (string != null) {
            try {
                return new JSONObject(string);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: A0 */
    private final void m11526A0() {
        try {
            if (m11586p()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f14481d = statFs.getBlockCount() * statFs.getBlockSize();
            }
            f14481d = m11574j(f14481d);
        } catch (Exception unused) {
        }
    }

    /* renamed from: B0 */
    public static final void m11527B0(Runnable runnable) {
        try {
            C5641a0 c5641a0 = C5641a0.f14199a;
            C5641a0.m11292k().execute(runnable);
        } catch (Exception unused) {
        }
    }

    /* renamed from: C */
    public static final String m11528C(String str) {
        C5641a0 c5641a0 = C5641a0.f14199a;
        String strM11293l = C5641a0.m11293l();
        return str == null ? strM11293l : C9801m.m32341a(str, "gaming") ? C10546u.m37507A(strM11293l, "facebook.com", "fb.gg", false, 4, null) : C9801m.m32341a(str, "instagram") ? C10546u.m37507A(strM11293l, "facebook.com", "instagram.com", false, 4, null) : strM11293l;
    }

    /* renamed from: C0 */
    public static final void m11529C0(JSONObject jSONObject, C5697q c5697q, String str, boolean z, Context context) throws JSONException {
        C9801m.m32346f(jSONObject, "params");
        C9801m.m32346f(context, "context");
        C5666a0 c5666a0 = C5666a0.f14313a;
        C5666a0.b bVar = C5666a0.b.ServiceUpdateCompliance;
        if (!C5666a0.m11378g(bVar)) {
            jSONObject.put("anon_id", str);
        }
        jSONObject.put("application_tracking_enabled", !z);
        C5641a0 c5641a0 = C5641a0.f14199a;
        jSONObject.put("advertiser_id_collection_enabled", C5641a0.m11283b());
        if (c5697q != null) {
            if (C5666a0.m11378g(bVar)) {
                f14478a.m11556a(jSONObject, c5697q, str, context);
            }
            if (c5697q.m11620j() != null) {
                if (C5666a0.m11378g(bVar)) {
                    f14478a.m11558b(jSONObject, c5697q, context);
                } else {
                    jSONObject.put("attribution", c5697q.m11620j());
                }
            }
            if (c5697q.m11618h() != null) {
                jSONObject.put("advertiser_id", c5697q.m11618h());
                jSONObject.put("advertiser_tracking_enabled", !c5697q.m11621k());
            }
            if (!c5697q.m11621k()) {
                C5831j0 c5831j0 = C5831j0.f14968a;
                String strM12262a = C5831j0.m12262a();
                if (!(strM12262a.length() == 0)) {
                    jSONObject.put("ud", strM12262a);
                }
            }
            if (c5697q.m11619i() != null) {
                jSONObject.put("installer_package", c5697q.m11619i());
            }
        }
    }

    /* renamed from: D */
    private final GraphRequest m11530D(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", m11541K(m11604z()));
        bundle.putString("access_token", str);
        GraphRequest graphRequestM11237y = GraphRequest.f14159a.m11237y(null, null);
        graphRequestM11237y.m11177H(bundle);
        graphRequestM11237y.m11176G(EnumC5655e0.GET);
        return graphRequestM11237y;
    }

    /* renamed from: D0 */
    public static final void m11531D0(JSONObject jSONObject, Context context) throws JSONException, PackageManager.NameNotFoundException {
        Locale locale;
        String language;
        int i2;
        Display defaultDisplay;
        String country;
        PackageInfo packageInfo;
        C9801m.m32346f(jSONObject, "params");
        C9801m.m32346f(context, "appContext");
        JSONArray jSONArray = new JSONArray();
        C5696p0 c5696p0 = f14478a;
        jSONArray.put("a2");
        c5696p0.m11603y0(context);
        String packageName = context.getPackageName();
        int i3 = 0;
        int i4 = -1;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageInfo == null) {
            return;
        }
        i4 = packageInfo.versionCode;
        f14486i = packageInfo.versionName;
        jSONArray.put(packageName);
        jSONArray.put(i4);
        jSONArray.put(f14486i);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = context.getResources().getConfiguration().locale;
        } catch (Exception unused2) {
            locale = Locale.getDefault();
        }
        f14487j = locale;
        StringBuilder sb = new StringBuilder();
        Locale locale2 = f14487j;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        if (locale2 == null || (language = locale2.getLanguage()) == null) {
            language = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(language);
        sb.append('_');
        Locale locale3 = f14487j;
        if (locale3 != null && (country = locale3.getCountry()) != null) {
            str = country;
        }
        sb.append(str);
        jSONArray.put(sb.toString());
        jSONArray.put(f14483f);
        jSONArray.put(f14485h);
        double d2 = 0.0d;
        try {
            defaultDisplay = null;
            if (Build.VERSION.SDK_INT >= 17) {
                Object systemService = context.getSystemService("display");
                DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
                if (displayManager != null) {
                    defaultDisplay = displayManager.getDisplay(0);
                }
            } else {
                Object systemService2 = context.getSystemService("window");
                WindowManager windowManager = systemService2 instanceof WindowManager ? (WindowManager) systemService2 : null;
                if (windowManager != null) {
                    defaultDisplay = windowManager.getDefaultDisplay();
                }
            }
        } catch (Exception unused3) {
        }
        if (defaultDisplay != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i5 = displayMetrics.widthPixels;
            try {
                int i6 = displayMetrics.heightPixels;
                try {
                    d2 = displayMetrics.density;
                } catch (Exception unused4) {
                }
                i2 = i6;
                i3 = i5;
            } catch (Exception unused5) {
                i3 = i5;
            }
        } else {
            i2 = 0;
        }
        jSONArray.put(i3);
        jSONArray.put(i2);
        jSONArray.put(new DecimalFormat("#.##").format(d2));
        jSONArray.put(f14478a.m11598v0());
        jSONArray.put(f14481d);
        jSONArray.put(f14482e);
        jSONArray.put(f14484g);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    /* renamed from: E */
    public static final void m11532E(final String str, final a aVar) {
        C9801m.m32346f(str, "accessToken");
        C9801m.m32346f(aVar, "callback");
        C5690m0 c5690m0 = C5690m0.f14461a;
        JSONObject jSONObjectM11508a = C5690m0.m11508a(str);
        if (jSONObjectM11508a != null) {
            aVar.mo11259a(jSONObjectM11508a);
            return;
        }
        GraphRequest.InterfaceC5631b interfaceC5631b = new GraphRequest.InterfaceC5631b() { // from class: com.facebook.internal.k
            @Override // com.facebook.GraphRequest.InterfaceC5631b
            /* renamed from: b */
            public final void mo11196b(C5653d0 c5653d0) {
                C5696p0.m11534F(aVar, str, c5653d0);
            }
        };
        GraphRequest graphRequestM11530D = f14478a.m11530D(str);
        graphRequestM11530D.m11173D(interfaceC5631b);
        graphRequestM11530D.m11180k();
    }

    /* renamed from: E0 */
    public static final String m11533E0(byte[] bArr) {
        C9801m.m32346f(bArr, "bytes");
        return f14478a.m11546Q("SHA-1", bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public static final void m11534F(a aVar, String str, C5653d0 c5653d0) {
        C9801m.m32346f(aVar, "$callback");
        C9801m.m32346f(str, "$accessToken");
        C9801m.m32346f(c5653d0, "response");
        if (c5653d0.m11338b() != null) {
            aVar.mo11260b(c5653d0.m11338b().m11143e());
            return;
        }
        C5690m0 c5690m0 = C5690m0.f14461a;
        JSONObject jSONObjectM11340d = c5653d0.m11340d();
        if (jSONObjectM11340d == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        C5690m0.m11509b(str, jSONObjectM11340d);
        aVar.mo11259a(c5653d0.m11340d());
    }

    /* renamed from: F0 */
    public static final String m11535F0(String str) {
        if (str == null) {
            return null;
        }
        return f14478a.m11545P("SHA-256", str);
    }

    /* renamed from: G0 */
    public static final void m11536G0(Parcel parcel, Map<String, String> map) {
        C9801m.m32346f(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            parcel.writeString(key);
            parcel.writeString(value);
        }
    }

    /* renamed from: H */
    public static final String m11537H(Context context) {
        C5698q0 c5698q0 = C5698q0.f14500a;
        C5698q0.m11642j(context, "context");
        C5641a0 c5641a0 = C5641a0.f14199a;
        return C5641a0.m11285d();
    }

    /* renamed from: H0 */
    public static final void m11538H0(Parcel parcel, Map<String, String> map) {
        C9801m.m32346f(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            parcel.writeString(key);
            parcel.writeString(value);
        }
    }

    /* renamed from: I */
    public static final Method m11539I(Class<?> cls, String str, Class<?>... clsArr) {
        C9801m.m32346f(cls, "clazz");
        C9801m.m32346f(str, "methodName");
        C9801m.m32346f(clsArr, "parameterTypes");
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: J */
    public static final Method m11540J(String str, String str2, Class<?>... clsArr) throws ClassNotFoundException {
        C9801m.m32346f(str, "className");
        C9801m.m32346f(str2, "methodName");
        C9801m.m32346f(clsArr, "parameterTypes");
        try {
            Class<?> cls = Class.forName(str);
            C9801m.m32345e(cls, "clazz");
            return m11539I(cls, str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: K */
    private final String m11541K(String str) {
        return C9801m.m32341a(str, "instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name";
    }

    /* renamed from: L */
    public static final Locale m11542L() {
        try {
            C5641a0 c5641a0 = C5641a0.f14199a;
            return C5641a0.m11284c().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: M */
    public static final Object m11543M(JSONObject jSONObject, String str, String str2) throws JSONException {
        C9801m.m32346f(jSONObject, "jsonObject");
        Object objOpt = jSONObject.opt(str);
        if (objOpt != null && (objOpt instanceof String)) {
            objOpt = new JSONTokener((String) objOpt).nextValue();
        }
        if (objOpt == null || (objOpt instanceof JSONObject) || (objOpt instanceof JSONArray)) {
            return objOpt;
        }
        if (str2 == null) {
            throw new FacebookException("Got an unexpected non-JSON object.");
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt(str2, objOpt);
        return jSONObject2;
    }

    /* renamed from: O */
    private final String m11544O(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] bArrDigest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        C9801m.m32345e(bArrDigest, "digest");
        int length = bArrDigest.length;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArrDigest[i2];
            i2++;
            sb.append(Integer.toHexString((b2 >> 4) & 15));
            sb.append(Integer.toHexString((b2 >> 0) & 15));
        }
        String string = sb.toString();
        C9801m.m32345e(string, "builder.toString()");
        return string;
    }

    /* renamed from: P */
    private final String m11545P(String str, String str2) {
        Charset charset = Charsets.f40651b;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = str2.getBytes(charset);
        C9801m.m32345e(bytes, "(this as java.lang.String).getBytes(charset)");
        return m11546Q(str, bytes);
    }

    /* renamed from: Q */
    private final String m11546Q(String str, byte[] bArr) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            C9801m.m32345e(messageDigest, "hash");
            return m11544O(messageDigest, bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: R */
    public static final Object m11547R(Object obj, Method method, Object... objArr) {
        C9801m.m32346f(method, "method");
        C9801m.m32346f(objArr, "args");
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: S */
    public static final boolean m11548S() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            C5641a0 c5641a0 = C5641a0.f14199a;
            String str = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{C5641a0.m11285d()}, 1));
            C9801m.m32345e(str, "java.lang.String.format(format, *args)");
            intent.setData(Uri.parse(str));
            Context contextM11284c = C5641a0.m11284c();
            PackageManager packageManager = contextM11284c.getPackageManager();
            String packageName = contextM11284c.getPackageName();
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            C9801m.m32345e(listQueryIntentActivities, "packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                if (C9801m.m32341a(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: T */
    public static final boolean m11549T(Context context) {
        AutofillManager autofillManager;
        C9801m.m32346f(context, "context");
        return Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class)) != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled();
    }

    /* renamed from: U */
    public static final boolean m11550U(Context context) {
        C9801m.m32346f(context, "context");
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        if (str != null) {
            C9801m.m32345e(str, "DEVICE");
            if (new Regex(".+_cheets|cheets_.+").m37438b(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: V */
    public static final boolean m11551V(Uri uri) {
        return uri != null && C10546u.m37515q("content", uri.getScheme(), true);
    }

    /* renamed from: W */
    public static final boolean m11552W(AccessToken accessToken) {
        return accessToken != null && C9801m.m32341a(accessToken, AccessToken.f14054f.m11105e());
    }

    /* renamed from: X */
    public static final boolean m11553X() throws JSONException {
        JSONObject jSONObjectM11525A = m11525A();
        if (jSONObjectM11525A == null) {
            return false;
        }
        try {
            JSONArray jSONArray = jSONObjectM11525A.getJSONArray("data_processing_options");
            int length = jSONArray.length();
            if (length > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    String string = jSONArray.getString(i2);
                    C9801m.m32345e(string, "options.getString(i)");
                    String lowerCase = string.toLowerCase();
                    C9801m.m32345e(lowerCase, "(this as java.lang.String).toLowerCase()");
                    if (C9801m.m32341a(lowerCase, "ldu")) {
                        return true;
                    }
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: Y */
    public static final boolean m11554Y(Uri uri) {
        return uri != null && C10546u.m37515q("file", uri.getScheme(), true);
    }

    /* renamed from: Z */
    private final boolean m11555Z(Context context) throws ClassNotFoundException {
        Method methodM11540J = m11540J("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (methodM11540J == null) {
            return false;
        }
        Object objM11547R = m11547R(null, methodM11540J, context);
        return (objM11547R instanceof Integer) && C9801m.m32341a(objM11547R, 0);
    }

    /* renamed from: a */
    private final void m11556a(JSONObject jSONObject, C5697q c5697q, String str, Context context) throws JSONException {
        if (Build.VERSION.SDK_INT < 31 || !m11555Z(context)) {
            jSONObject.put("anon_id", str);
        } else {
            if (c5697q.m11621k()) {
                return;
            }
            jSONObject.put("anon_id", str);
        }
    }

    /* renamed from: a0 */
    public static final boolean m11557a0(String str) {
        if (str != null) {
            if (!(str.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private final void m11558b(JSONObject jSONObject, C5697q c5697q, Context context) throws JSONException {
        if (Build.VERSION.SDK_INT < 31 || !m11555Z(context)) {
            jSONObject.put("attribution", c5697q.m11620j());
        } else {
            if (c5697q.m11621k()) {
                return;
            }
            jSONObject.put("attribution", c5697q.m11620j());
        }
    }

    /* renamed from: b0 */
    public static final boolean m11559b0(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    /* renamed from: c */
    public static final <T> boolean m11560c(T t, T t2) {
        return t == null ? t2 == null : C9801m.m32341a(t, t2);
    }

    /* renamed from: c0 */
    public static final boolean m11561c0(Uri uri) {
        return uri != null && (C10546u.m37515q("http", uri.getScheme(), true) || C10546u.m37515q(BuildConfig.APTOIDE_WEB_SERVICES_SCHEME, uri.getScheme(), true) || C10546u.m37515q("fbstaging", uri.getScheme(), true));
    }

    /* renamed from: d */
    public static final JSONObject m11562d(String str) {
        C9801m.m32346f(str, "accessToken");
        C5690m0 c5690m0 = C5690m0.f14461a;
        JSONObject jSONObjectM11508a = C5690m0.m11508a(str);
        if (jSONObjectM11508a != null) {
            return jSONObjectM11508a;
        }
        C5653d0 c5653d0M11179j = f14478a.m11530D(str).m11179j();
        if (c5653d0M11179j.m11338b() != null) {
            return null;
        }
        return c5653d0M11179j.m11340d();
    }

    /* renamed from: d0 */
    public static final Set<String> m11563d0(JSONArray jSONArray) throws JSONException {
        C9801m.m32346f(jSONArray, "jsonArray");
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        if (length > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                String string = jSONArray.getString(i2);
                C9801m.m32345e(string, "jsonArray.getString(i)");
                hashSet.add(string);
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        }
        return hashSet;
    }

    /* renamed from: e */
    public static final Uri m11564e(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri uriBuild = builder.build();
        C9801m.m32345e(uriBuild, "builder.build()");
        return uriBuild;
    }

    /* renamed from: e0 */
    public static final List<String> m11565e0(JSONArray jSONArray) throws JSONException {
        C9801m.m32346f(jSONArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        if (length > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                arrayList.add(jSONArray.getString(i2));
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    private final void m11566f(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        Object[] array = C10547v.m37582v0(cookie, new String[]{";"}, false, 0, 6, null).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) array;
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            String str2 = strArr[i2];
            i2++;
            Object[] array2 = C10547v.m37582v0(str2, new String[]{"="}, false, 0, 6, null).toArray(new String[0]);
            if (array2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr2 = (String[]) array2;
            if (strArr2.length > 0) {
                String str3 = strArr2[0];
                int length2 = str3.length() - 1;
                int i3 = 0;
                boolean z = false;
                while (i3 <= length2) {
                    boolean z2 = C9801m.m32348h(str3.charAt(!z ? i3 : length2), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        } else {
                            length2--;
                        }
                    } else if (z2) {
                        i3++;
                    } else {
                        z = true;
                    }
                }
                cookieManager.setCookie(str, C9801m.m32354n(str3.subSequence(i3, length2 + 1).toString(), "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;"));
            }
        }
        cookieManager.removeExpiredCookie();
    }

    /* renamed from: f0 */
    public static final Map<String, String> m11567f0(String str) throws JSONException {
        C9801m.m32346f(str, "str");
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                C9801m.m32345e(next, RoomNotification.KEY);
                String string = jSONObject.getString(next);
                C9801m.m32345e(string, "jsonObject.getString(key)");
                map.put(next, string);
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    /* renamed from: g */
    public static final void m11568g(Context context) {
        C9801m.m32346f(context, "context");
        try {
            C5696p0 c5696p0 = f14478a;
            c5696p0.m11566f(context, "facebook.com");
            c5696p0.m11566f(context, ".facebook.com");
            c5696p0.m11566f(context, "https://facebook.com");
            c5696p0.m11566f(context, "https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    public static final void m11570h(Closeable closeable) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* renamed from: i */
    public static final String m11572i(String str, String str2) {
        return m11557a0(str) ? str2 : str;
    }

    /* renamed from: i0 */
    public static final void m11573i0(String str, Exception exc) {
        C5641a0 c5641a0 = C5641a0.f14199a;
        if (!C5641a0.m11302u() || str == null || exc == null) {
            return;
        }
        Log.d(str, exc.getClass().getSimpleName() + ": " + ((Object) exc.getMessage()));
    }

    /* renamed from: j */
    private final long m11574j(double d2) {
        return Math.round(d2 / 1.073741824E9d);
    }

    /* renamed from: j0 */
    public static final void m11575j0(String str, String str2) {
        C5641a0 c5641a0 = C5641a0.f14199a;
        if (!C5641a0.m11302u() || str == null || str2 == null) {
            return;
        }
        Log.d(str, str2);
    }

    /* renamed from: k */
    public static final List<String> m11576k(JSONArray jSONArray) throws JSONException {
        C9801m.m32346f(jSONArray, "jsonArray");
        try {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            int length = jSONArray.length();
            if (length <= 0) {
                return arrayList;
            }
            while (true) {
                int i3 = i2 + 1;
                String string = jSONArray.getString(i2);
                C9801m.m32345e(string, "jsonArray.getString(i)");
                arrayList.add(string);
                if (i3 >= length) {
                    return arrayList;
                }
                i2 = i3;
            }
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    /* renamed from: k0 */
    public static final void m11577k0(String str, String str2, Throwable th) {
        C5641a0 c5641a0 = C5641a0.f14199a;
        if (!C5641a0.m11302u() || m11557a0(str)) {
            return;
        }
        Log.d(str, str2, th);
    }

    /* renamed from: l */
    public static final Map<String, Object> m11578l(JSONObject jSONObject) throws JSONException {
        C9801m.m32346f(jSONObject, "jsonObject");
        HashMap map = new HashMap();
        JSONArray jSONArrayNames = jSONObject.names();
        if (jSONArrayNames == null) {
            return map;
        }
        int i2 = 0;
        int length = jSONArrayNames.length();
        if (length > 0) {
            while (true) {
                int i3 = i2 + 1;
                try {
                    String string = jSONArrayNames.getString(i2);
                    C9801m.m32345e(string, "keys.getString(i)");
                    Object objM11578l = jSONObject.get(string);
                    if (objM11578l instanceof JSONObject) {
                        objM11578l = m11578l((JSONObject) objM11578l);
                    }
                    C9801m.m32345e(objM11578l, "value");
                    map.put(string, objM11578l);
                } catch (JSONException unused) {
                }
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        }
        return map;
    }

    /* renamed from: l0 */
    public static final String m11579l0(Map<String, String> map) throws JSONException {
        C9801m.m32346f(map, "map");
        boolean zIsEmpty = map.isEmpty();
        String string = HttpUrl.FRAGMENT_ENCODE_SET;
        if (!zIsEmpty) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                string = jSONObject.toString();
            } catch (JSONException unused) {
            }
            C9801m.m32345e(string, "{\n      try {\n        val jsonObject = JSONObject()\n        for ((key, value) in map) {\n          jsonObject.put(key, value)\n        }\n        jsonObject.toString()\n      } catch (_e: JSONException) {\n        \"\"\n      }\n    }");
        }
        return string;
    }

    /* renamed from: m */
    public static final Map<String, String> m11580m(JSONObject jSONObject) {
        C9801m.m32346f(jSONObject, "jsonObject");
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObject.optString(next);
            if (strOptString != null) {
                C9801m.m32345e(next, RoomNotification.KEY);
                map.put(next, strOptString);
            }
        }
        return map;
    }

    /* renamed from: m0 */
    public static final String m11581m0(String str) {
        C9801m.m32346f(str, RoomNotification.KEY);
        return f14478a.m11545P("MD5", str);
    }

    /* renamed from: n */
    public static final int m11582n(InputStream inputStream, OutputStream outputStream) throws Throwable {
        BufferedInputStream bufferedInputStream;
        C9801m.m32346f(outputStream, "outputStream");
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[8192];
            int i2 = 0;
            while (true) {
                int i3 = bufferedInputStream.read(bArr);
                if (i3 == -1) {
                    break;
                }
                outputStream.write(bArr, 0, i3);
                i2 += i3;
            }
            bufferedInputStream.close();
            if (inputStream != null) {
                inputStream.close();
            }
            return i2;
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
                bufferedInputStream2.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    /* renamed from: n0 */
    public static final boolean m11583n0(Context context) {
        C9801m.m32346f(context, "context");
        return m11549T(context);
    }

    /* renamed from: o */
    public static final void m11584o(URLConnection uRLConnection) {
        if (uRLConnection == null || !(uRLConnection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) uRLConnection).disconnect();
    }

    /* renamed from: o0 */
    public static final Bundle m11585o0(String str) {
        Bundle bundle = new Bundle();
        if (!m11557a0(str)) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            Object[] array = C10547v.m37582v0(str, new String[]{"&"}, false, 0, 6, null).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                String str2 = strArr[i2];
                i2++;
                Object[] array2 = C10547v.m37582v0(str2, new String[]{"="}, false, 0, 6, null).toArray(new String[0]);
                if (array2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr2 = (String[]) array2;
                try {
                    if (strArr2.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), URLDecoder.decode(strArr2[1], "UTF-8"));
                    } else if (strArr2.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), HttpUrl.FRAGMENT_ENCODE_SET);
                    }
                } catch (UnsupportedEncodingException e2) {
                    m11573i0("FacebookSDK", e2);
                }
            }
        }
        return bundle;
    }

    /* renamed from: p */
    private final boolean m11586p() {
        return C9801m.m32341a("mounted", Environment.getExternalStorageState());
    }

    /* renamed from: p0 */
    public static final boolean m11587p0(Bundle bundle, String str, Object obj) {
        C9801m.m32346f(bundle, "bundle");
        if (obj == null) {
            bundle.remove(str);
            return true;
        }
        if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        }
        if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
            return true;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Number) obj).doubleValue());
            return true;
        }
        if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
            return true;
        }
        if (obj instanceof Integer) {
            bundle.putInt(str, ((Number) obj).intValue());
            return true;
        }
        if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
            return true;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Number) obj).longValue());
            return true;
        }
        if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
            return true;
        }
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return true;
        }
        if (obj instanceof JSONArray) {
            bundle.putString(str, ((JSONArray) obj).toString());
            return true;
        }
        if (!(obj instanceof JSONObject)) {
            return false;
        }
        bundle.putString(str, ((JSONObject) obj).toString());
        return true;
    }

    /* renamed from: q */
    public static final String m11588q(int i2) {
        String string = new BigInteger(i2 * 5, new Random()).toString(32);
        C9801m.m32345e(string, "BigInteger(length * 5, r).toString(32)");
        return string;
    }

    /* renamed from: q0 */
    public static final void m11589q0(Bundle bundle, String str, String str2) {
        C9801m.m32346f(bundle, "b");
        if (m11557a0(str2)) {
            return;
        }
        bundle.putString(str, str2);
    }

    /* renamed from: r */
    public static final String m11590r(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        String simpleName = context.getClass().getSimpleName();
        C9801m.m32345e(simpleName, "{\n      context.javaClass.simpleName\n    }");
        return simpleName;
    }

    /* renamed from: r0 */
    public static final Map<String, String> m11591r0(Parcel parcel) {
        C9801m.m32346f(parcel, "parcel");
        int i2 = parcel.readInt();
        if (i2 < 0) {
            return null;
        }
        HashMap map = new HashMap();
        int i3 = 0;
        if (i2 > 0) {
            do {
                i3++;
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (string != null && string2 != null) {
                    map.put(string, string2);
                }
            } while (i3 < i2);
        }
        return map;
    }

    /* renamed from: s */
    public static final String m11592s(Context context) {
        String string;
        C9801m.m32346f(context, "context");
        try {
            C5641a0 c5641a0 = C5641a0.f14199a;
            String strM11286e = C5641a0.m11286e();
            if (strM11286e != null) {
                return strM11286e;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i2 = applicationInfo.labelRes;
            if (i2 == 0) {
                string = applicationInfo.nonLocalizedLabel.toString();
            } else {
                string = context.getString(i2);
                C9801m.m32345e(string, "context.getString(stringId)");
            }
            return string;
        } catch (Exception unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* renamed from: s0 */
    public static final String m11593s0(InputStream inputStream) throws Throwable {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
            } catch (Throwable th2) {
                th = th2;
                inputStreamReader = null;
            }
        } catch (Throwable th3) {
            bufferedInputStream = null;
            th = th3;
            inputStreamReader = null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            char[] cArr = new char[RecyclerView.AbstractC0599l.FLAG_MOVED];
            while (true) {
                int i2 = inputStreamReader.read(cArr);
                if (i2 == -1) {
                    String string = sb.toString();
                    C9801m.m32345e(string, "{\n      bufferedInputStream = BufferedInputStream(inputStream)\n      reader = InputStreamReader(bufferedInputStream)\n      val stringBuilder = StringBuilder()\n      val bufferSize = 1024 * 2\n      val buffer = CharArray(bufferSize)\n      var n = 0\n      while (reader.read(buffer).also { n = it } != -1) {\n        stringBuilder.append(buffer, 0, n)\n      }\n      stringBuilder.toString()\n    }");
                    m11570h(bufferedInputStream);
                    m11570h(inputStreamReader);
                    return string;
                }
                sb.append(cArr, 0, i2);
            }
        } catch (Throwable th4) {
            th = th4;
            m11570h(bufferedInputStream);
            m11570h(inputStreamReader);
            throw th;
        }
    }

    /* renamed from: t */
    public static final String m11594t() throws PackageManager.NameNotFoundException {
        C5641a0 c5641a0 = C5641a0.f14199a;
        Context contextM11284c = C5641a0.m11284c();
        if (contextM11284c == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = contextM11284c.getPackageManager().getPackageInfo(contextM11284c.getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: t0 */
    public static final Map<String, String> m11595t0(Parcel parcel) {
        C9801m.m32346f(parcel, "parcel");
        int i2 = parcel.readInt();
        if (i2 < 0) {
            return null;
        }
        HashMap map = new HashMap();
        int i3 = 0;
        if (i2 > 0) {
            do {
                i3++;
                map.put(parcel.readString(), parcel.readString());
            } while (i3 < i2);
        }
        return map;
    }

    /* renamed from: u0 */
    private final void m11596u0() {
        try {
            if (m11586p()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f14482e = statFs.getAvailableBlocks() * statFs.getBlockSize();
            }
            f14482e = m11574j(f14482e);
        } catch (Exception unused) {
        }
    }

    /* renamed from: v */
    public static final Date m11597v(Bundle bundle, String str, Date date) throws NumberFormatException {
        long jLongValue;
        C9801m.m32346f(date, "dateBase");
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (!(obj instanceof Long)) {
            if (obj instanceof String) {
                try {
                    jLongValue = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        jLongValue = ((Number) obj).longValue();
        return jLongValue == 0 ? new Date(Long.MAX_VALUE) : new Date(date.getTime() + (jLongValue * 1000));
    }

    /* renamed from: v0 */
    private final int m11598v0() {
        int i2 = f14479b;
        if (i2 > 0) {
            return i2;
        }
        try {
            File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new FilenameFilter() { // from class: com.facebook.internal.l
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    return C5696p0.m11599w0(file, str);
                }
            });
            if (fileArrListFiles != null) {
                f14479b = fileArrListFiles.length;
            }
        } catch (Exception unused) {
        }
        if (f14479b <= 0) {
            f14479b = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return f14479b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public static final boolean m11599w0(File file, String str) {
        return Pattern.matches("cpu[0-9]+", str);
    }

    /* renamed from: x */
    public static final long m11600x(Uri uri) {
        C9801m.m32346f(uri, "contentUri");
        Cursor cursorQuery = null;
        try {
            C5641a0 c5641a0 = C5641a0.f14199a;
            cursorQuery = C5641a0.m11284c().getContentResolver().query(uri, null, null, null, null);
            if (cursorQuery == null) {
                return 0L;
            }
            int columnIndex = cursorQuery.getColumnIndex("_size");
            cursorQuery.moveToFirst();
            long j2 = cursorQuery.getLong(columnIndex);
            cursorQuery.close();
            return j2;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* renamed from: x0 */
    private final void m11601x0(Context context) {
        if (C9801m.m32341a(f14485h, "NoCarrier")) {
            try {
                Object systemService = context.getSystemService("phone");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
                }
                String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                C9801m.m32345e(networkOperatorName, "telephonyManager.networkOperatorName");
                f14485h = networkOperatorName;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: y */
    public static final Locale m11602y() {
        Locale localeM11542L = m11542L();
        if (localeM11542L != null) {
            return localeM11542L;
        }
        Locale locale = Locale.getDefault();
        C9801m.m32345e(locale, "getDefault()");
        return locale;
    }

    /* renamed from: y0 */
    private final void m11603y0(Context context) {
        if (f14480c == -1 || System.currentTimeMillis() - f14480c >= cm.aptoide.p092pt.BuildConfig.ANALYTICS_SESSION_INTERVAL_IN_MILLIS) {
            f14480c = System.currentTimeMillis();
            m11605z0();
            m11601x0(context);
            m11526A0();
            m11596u0();
        }
    }

    /* renamed from: z */
    private final String m11604z() {
        AccessToken accessTokenM11105e = AccessToken.f14054f.m11105e();
        return (accessTokenM11105e == null || accessTokenM11105e.m11089h() == null) ? "facebook" : accessTokenM11105e.m11089h();
    }

    /* renamed from: z0 */
    private final void m11605z0() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            C9801m.m32345e(displayName, "tz.getDisplayName(tz.inDaylightTime(Date()), TimeZone.SHORT)");
            f14483f = displayName;
            String id = timeZone.getID();
            C9801m.m32345e(id, "tz.id");
            f14484g = id;
        } catch (AssertionError | Exception unused) {
        }
    }

    /* renamed from: B */
    public final String m11606B() {
        return f14484g;
    }

    /* renamed from: G */
    public final Locale m11607G() {
        return f14487j;
    }

    /* renamed from: N */
    public final String m11608N() {
        return f14486i;
    }

    /* renamed from: u */
    public final long m11609u() {
        return f14482e;
    }

    /* renamed from: w */
    public final String m11610w() {
        return f14485h;
    }
}
