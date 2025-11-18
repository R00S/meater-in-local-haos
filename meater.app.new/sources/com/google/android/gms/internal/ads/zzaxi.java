package com.google.android.gms.internal.ads;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.impl.C6298R;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzaxi {

    /* renamed from: a */
    public static final Handler f22654a = new zzaxa(Looper.getMainLooper());

    /* renamed from: f */
    private String f22659f;

    /* renamed from: b */
    private AtomicReference<Pattern> f22655b = new AtomicReference<>(null);

    /* renamed from: c */
    private AtomicReference<Pattern> f22656c = new AtomicReference<>(null);

    /* renamed from: d */
    private boolean f22657d = true;

    /* renamed from: e */
    private final Object f22658e = new Object();

    /* renamed from: g */
    private boolean f22660g = false;

    /* renamed from: h */
    private boolean f22661h = false;

    /* renamed from: A */
    public static boolean m17121A(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                        return true;
                    }
                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                    return !(powerManager == null ? false : powerManager.isScreenOn());
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: B */
    public static int m17122B(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return 0;
        }
        return applicationInfo.targetSdkVersion;
    }

    /* renamed from: C */
    private static KeyguardManager m17123C(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    @TargetApi(16)
    /* renamed from: D */
    public static boolean m17124D(Context context) {
        KeyguardManager keyguardManagerM17123C;
        return context != null && PlatformVersion.m14639c() && (keyguardManagerM17123C = m17123C(context)) != null && keyguardManagerM17123C.isKeyguardLocked();
    }

    /* renamed from: E */
    public static boolean m17125E(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi2");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            zzbad.m17347c("Error loading class.", th);
            zzk.zzlk().m17052e(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    /* renamed from: F */
    public static String m17126F(Context context) {
        return !((Boolean) zzyt.m20848e().m16421c(zzacu.f21711T4)).booleanValue() ? HttpUrl.FRAGMENT_ENCODE_SET : context.getSharedPreferences("mobileads_consent", 0).getString("consent_string", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* renamed from: G */
    public static Bundle m17127G(Context context) {
        if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21717U4)).booleanValue()) {
            return null;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Bundle bundle = new Bundle();
        if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
            bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
        }
        String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
        for (int i2 = 0; i2 < 4; i2++) {
            String str = strArr[i2];
            if (defaultSharedPreferences.contains(str)) {
                bundle.putString(str, defaultSharedPreferences.getString(str, null));
            }
        }
        return bundle;
    }

    /* renamed from: H */
    public static boolean m17128H(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    @TargetApi(18)
    /* renamed from: I */
    public static void m17129I(Context context, Intent intent) {
        if (intent != null && PlatformVersion.m14641e()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder("android.support.customtabs.extra.SESSION", null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    /* renamed from: J */
    public static void m17130J(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            new zzazi(context, str, (String) obj).zzvi();
        }
    }

    /* renamed from: K */
    public static void m17131K(Context context, String str, String str2) throws IOException {
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(str, 0);
            fileOutputStreamOpenFileOutput.write(str2.getBytes("UTF-8"));
            fileOutputStreamOpenFileOutput.close();
        } catch (Exception e2) {
            zzbad.m17347c("Error writing to file in internal storage.", e2);
        }
    }

    /* renamed from: L */
    public static WebResourceResponse m17132L(Context context, String str, String str2) throws ExecutionException, InterruptedException, TimeoutException {
        try {
            HashMap map = new HashMap();
            map.put("User-Agent", zzk.zzlg().m17177g0(context, str));
            map.put("Cache-Control", "max-stale=3600");
            String str3 = new zzayu(context).m17258c(str2, map).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
            return null;
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e2) {
            zzbad.m17348d("Could not fetch MRAID JS.", e2);
            return null;
        }
    }

    /* renamed from: M */
    public static WebResourceResponse m17133M(HttpURLConnection httpURLConnection) throws IOException {
        zzk.zzlg();
        String contentType = httpURLConnection.getContentType();
        boolean zIsEmpty = TextUtils.isEmpty(contentType);
        String strTrim = HttpUrl.FRAGMENT_ENCODE_SET;
        String strTrim2 = zIsEmpty ? HttpUrl.FRAGMENT_ENCODE_SET : contentType.split(";")[0].trim();
        zzk.zzlg();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] strArrSplit = contentType2.split(";");
            if (strArrSplit.length != 1) {
                int i2 = 1;
                while (true) {
                    if (i2 >= strArrSplit.length) {
                        break;
                    }
                    if (strArrSplit[i2].trim().startsWith("charset")) {
                        String[] strArrSplit2 = strArrSplit[i2].trim().split("=");
                        if (strArrSplit2.length > 1) {
                            strTrim = strArrSplit2[1].trim();
                            break;
                        }
                    }
                    i2++;
                }
            }
        }
        String str = strTrim;
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        HashMap map = new HashMap(headerFields.size());
        for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null && entry.getValue().size() > 0) {
                map.put(entry.getKey(), entry.getValue().get(0));
            }
        }
        return zzk.zzli().mo17195f(strTrim2, str, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), map, httpURLConnection.getInputStream());
    }

    /* renamed from: O */
    public static void m17134O(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            zzaxg.m17119b(runnable);
        }
    }

    /* renamed from: P */
    public static int[] m17135P(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? m17160l0() : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    /* renamed from: Q */
    public static int m17136Q(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e2) {
            String strValueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
            sb.append("Could not parse value:");
            sb.append(strValueOf);
            zzbad.m17353i(sb.toString());
            return 0;
        }
    }

    /* renamed from: R */
    public static boolean m17137R(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    /* renamed from: V */
    public static boolean m17138V(String str) {
        if (!zzazx.m17324a()) {
            return false;
        }
        if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21722V3)).booleanValue()) {
            return false;
        }
        String str2 = (String) zzyt.m20848e().m16421c(zzacu.f21734X3);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) zzyt.m20848e().m16421c(zzacu.f21728W3);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: X */
    public static Map<String, String> m17139X(Uri uri) {
        if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21768c5)).booleanValue()) {
            if (uri == null) {
                return null;
            }
            HashMap map = new HashMap();
            zzk.zzli();
            for (String str : uri.getQueryParameterNames()) {
                map.put(str, uri.getQueryParameter(str));
            }
            return map;
        }
        if (uri == null) {
            return null;
        }
        HashMap map2 = new HashMap(20);
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return map2;
        }
        int length = encodedQuery.length();
        StringBuilder sb = new StringBuilder(100);
        StringBuilder sb2 = new StringBuilder(length);
        StringBuilder sb3 = sb;
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = encodedQuery.charAt(i2);
            if (cCharAt == '%') {
                byte[] bArr = new byte[(length - i2) / 3];
                int i3 = 0;
                while (i2 < length - 2 && cCharAt == '%') {
                    try {
                        bArr[i3] = (byte) ((m17141a(encodedQuery.charAt(i2 + 1)) << 4) + m17141a(encodedQuery.charAt(i2 + 2)));
                        i3++;
                    } catch (IllegalArgumentException unused) {
                    }
                    i2 += 3;
                    if (i2 < length) {
                        cCharAt = encodedQuery.charAt(i2);
                    }
                }
                try {
                    sb3.append(new String(bArr, 0, i3, "UTF-8"));
                } catch (UnsupportedEncodingException unused2) {
                }
                if (cCharAt != '%') {
                }
            } else if (cCharAt == '&') {
                if (sb.length() > 0 && sb3 != sb) {
                    map2.put(sb.toString(), sb2.toString());
                    sb.setLength(0);
                    sb2.setLength(0);
                }
                sb3 = sb;
            } else if (cCharAt == '+') {
                sb3.append(' ');
            } else if (cCharAt == '=' && sb3 != sb2) {
                sb3 = sb2;
            } else {
                sb3.append(cCharAt);
            }
            i2++;
        }
        if (sb.length() > 0 && sb3 != sb) {
            map2.put(sb.toString(), sb2.toString());
        }
        return map2;
    }

    /* renamed from: Z */
    public static Bitmap m17140Z(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return bitmapCreateBitmap;
    }

    /* renamed from: a */
    private static int m17141a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'A';
        if (c2 < 'A' || c2 > 'F') {
            c3 = 'a';
            if (c2 < 'a' || c2 > 'f') {
                throw new IllegalArgumentException("Invalid Hex.");
            }
        }
        return (c2 - c3) + 10;
    }

    /* renamed from: a0 */
    public static Bitmap m17142a0(View view) {
        if (view == null) {
            return null;
        }
        Bitmap bitmapM17146c0 = m17146c0(view);
        return bitmapM17146c0 == null ? m17144b0(view) : bitmapM17146c0;
    }

    /* renamed from: b */
    public static DisplayMetrics m17143b(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: b0 */
    private static Bitmap m17144b0(View view) {
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width != 0 && height != 0) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                view.layout(0, 0, width, height);
                view.draw(canvas);
                return bitmapCreateBitmap;
            }
            zzbad.m17353i("Width or height of view is zero");
            return null;
        } catch (RuntimeException e2) {
            zzbad.m17347c("Fail to capture the webview", e2);
            return null;
        }
    }

    /* renamed from: c */
    public static PopupWindow m17145c(View view, int i2, int i3, boolean z) {
        return new PopupWindow(view, i2, i3, false);
    }

    /* renamed from: c0 */
    private static Bitmap m17146c0(View view) {
        try {
            boolean zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            Bitmap drawingCache = view.getDrawingCache();
            bitmapCreateBitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
            view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
        } catch (RuntimeException e2) {
            zzbad.m17347c("Fail to capture the web view", e2);
        }
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m17148d0(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 == 0) goto L12
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L12
            android.app.Activity r2 = (android.app.Activity) r2
            goto L13
        L12:
            r2 = r0
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaxi.m17148d0(android.view.View):boolean");
    }

    /* renamed from: e0 */
    public static int m17150e0(View view) {
        if (view == null) {
            return -1;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof AdapterView)) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return -1;
        }
        return ((AdapterView) parent).getPositionForView(view);
    }

    /* renamed from: f */
    public static String m17151f(InputStreamReader inputStreamReader) throws IOException {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[RecyclerView.AbstractC0599l.FLAG_MOVED];
        while (true) {
            int i2 = inputStreamReader.read(cArr);
            if (i2 == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, i2);
        }
    }

    /* renamed from: f0 */
    public static boolean m17152f0(Context context, String str) {
        Context contextM16926f = zzasq.m16926f(context);
        return Wrappers.m14674a(contextM16926f).m14668b(str, contextM16926f.getPackageName()) == 0;
    }

    /* renamed from: g */
    private final JSONArray m17153g(Collection<?> collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            m17163o(jSONArray, it.next());
        }
        return jSONArray;
    }

    /* renamed from: h0 */
    public static String m17154h0(Context context, String str) {
        try {
            return new String(IOUtils.m14633d(context.openFileInput(str), true), "UTF-8");
        } catch (IOException unused) {
            zzbad.m17349e("Error reading from internal storage.");
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* renamed from: i */
    public static void m17155i(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    /* renamed from: i0 */
    private static String m17156i0() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    @TargetApi(18)
    /* renamed from: j */
    public static void m17157j(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            m17129I(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String string = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 26);
            sb.append("Opening ");
            sb.append(string);
            sb.append(" in a new browser.");
            zzbad.m17349e(sb.toString());
        } catch (ActivityNotFoundException e2) {
            zzbad.m17347c("No browser is found.", e2);
        }
    }

    /* renamed from: j0 */
    public static String m17158j0() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: k0 */
    public static String m17159k0() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + str2.length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: l0 */
    private static int[] m17160l0() {
        return new int[]{0, 0};
    }

    /* renamed from: m0 */
    public static String m17161m0() {
        Resources resourcesM17050b = zzk.zzlk().m17050b();
        return resourcesM17050b != null ? resourcesM17050b.getString(C6298R.string.f16871s7) : "Test Ad";
    }

    /* renamed from: n */
    public static void m17162n(Context context, Throwable th) {
        if (context == null) {
            return;
        }
        boolean zBooleanValue = false;
        try {
            zBooleanValue = ((Boolean) zzyt.m20848e().m16421c(zzacu.f21826m)).booleanValue();
        } catch (IllegalStateException unused) {
        }
        if (zBooleanValue) {
            CrashUtils.m14619a(context, th);
        }
    }

    /* renamed from: o */
    private final void m17163o(JSONArray jSONArray, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONArray.put(m17171N((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONArray.put(m17176Y((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONArray.put(m17153g((Collection) obj));
            return;
        }
        if (!(obj instanceof Object[])) {
            jSONArray.put(obj);
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (Object obj2 : (Object[]) obj) {
            m17163o(jSONArray2, obj2);
        }
        jSONArray.put(jSONArray2);
    }

    /* renamed from: p */
    private final void m17164p(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONObject.put(str, m17171N((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONObject.put(str, m17176Y((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, m17153g((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, m17153g(Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    /* renamed from: t */
    private static boolean m17166t(String str, AtomicReference<Pattern> atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    @VisibleForTesting
    /* renamed from: w */
    protected static String m17167w(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return m17156i0();
        }
    }

    /* renamed from: x */
    public static AlertDialog.Builder m17168x(Context context) {
        return new AlertDialog.Builder(context);
    }

    /* renamed from: y */
    public static zzacf m17169y(Context context) {
        return new zzacf(context);
    }

    /* renamed from: z */
    public static String m17170z(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && (componentName = runningTaskInfo.topActivity) != null) {
                return componentName.getClassName();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: N */
    public final JSONObject m17171N(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m17164p(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    /* renamed from: S */
    public final int[] m17172S(Activity activity) {
        int[] iArrM17135P = m17135P(activity);
        return new int[]{zzyt.m20844a().m17323j(activity, iArrM17135P[0]), zzyt.m20844a().m17323j(activity, iArrM17135P[1])};
    }

    /* renamed from: T */
    public final boolean m17173T(String str) {
        return m17166t(str, this.f22655b, (String) zzyt.m20848e().m16421c(zzacu.f21593A0));
    }

    /* renamed from: U */
    public final boolean m17174U(String str) {
        return m17166t(str, this.f22656c, (String) zzyt.m20848e().m16421c(zzacu.f21599B0));
    }

    /* renamed from: W */
    public final int[] m17175W(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArrM17160l0 = (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? m17160l0() : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        return new int[]{zzyt.m20844a().m17323j(activity, iArrM17160l0[0]), zzyt.m20844a().m17323j(activity, iArrM17160l0[1])};
    }

    /* renamed from: Y */
    public final JSONObject m17176Y(Map<String, ?> map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                m17164p(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e2) {
            String strValueOf = String.valueOf(e2.getMessage());
            throw new JSONException(strValueOf.length() != 0 ? "Could not convert map to JSON: ".concat(strValueOf) : new String("Could not convert map to JSON: "));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009a A[Catch: Exception -> 0x00a9, all -> 0x00c3, TRY_LEAVE, TryCatch #3 {Exception -> 0x00a9, blocks: (B:29:0x0090, B:31:0x009a), top: B:49:0x0090, outer: #1 }] */
    /* renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m17177g0(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f22658e
            monitor-enter(r0)
            java.lang.String r1 = r4.f22659f     // Catch: java.lang.Throwable -> Lc3
            if (r1 == 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc3
            return r1
        L9:
            if (r6 != 0) goto L11
            java.lang.String r5 = m17156i0()     // Catch: java.lang.Throwable -> Lc3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc3
            return r5
        L11:
            com.google.android.gms.internal.ads.zzaxo r1 = com.google.android.gms.ads.internal.zzk.zzli()     // Catch: java.lang.Exception -> L1b java.lang.Throwable -> Lc3
            java.lang.String r1 = r1.mo17190a(r5)     // Catch: java.lang.Exception -> L1b java.lang.Throwable -> Lc3
            r4.f22659f = r1     // Catch: java.lang.Exception -> L1b java.lang.Throwable -> Lc3
        L1b:
            java.lang.String r1 = r4.f22659f     // Catch: java.lang.Throwable -> Lc3
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lc3
            if (r1 == 0) goto L69
            com.google.android.gms.internal.ads.zzyt.m20844a()     // Catch: java.lang.Throwable -> Lc3
            boolean r1 = com.google.android.gms.internal.ads.zzazt.m17318w()     // Catch: java.lang.Throwable -> Lc3
            if (r1 != 0) goto L63
            r1 = 0
            r4.f22659f = r1     // Catch: java.lang.Throwable -> Lc3
            android.os.Handler r1 = com.google.android.gms.internal.ads.zzaxi.f22654a     // Catch: java.lang.Throwable -> Lc3
            com.google.android.gms.internal.ads.f5 r2 = new com.google.android.gms.internal.ads.f5     // Catch: java.lang.Throwable -> Lc3
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> Lc3
            r1.post(r2)     // Catch: java.lang.Throwable -> Lc3
        L39:
            java.lang.String r1 = r4.f22659f     // Catch: java.lang.Throwable -> Lc3
            if (r1 != 0) goto L69
            java.lang.Object r1 = r4.f22658e     // Catch: java.lang.InterruptedException -> L43 java.lang.Throwable -> Lc3
            r1.wait()     // Catch: java.lang.InterruptedException -> L43 java.lang.Throwable -> Lc3
            goto L39
        L43:
            java.lang.String r1 = m17156i0()     // Catch: java.lang.Throwable -> Lc3
            r4.f22659f = r1     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r2 = "Interrupted, use default user agent: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lc3
            int r3 = r1.length()     // Catch: java.lang.Throwable -> Lc3
            if (r3 == 0) goto L5a
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.Throwable -> Lc3
            goto L5f
        L5a:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> Lc3
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc3
        L5f:
            com.google.android.gms.internal.ads.zzbad.m17353i(r1)     // Catch: java.lang.Throwable -> Lc3
            goto L39
        L63:
            java.lang.String r1 = m17167w(r5)     // Catch: java.lang.Throwable -> Lc3
            r4.f22659f = r1     // Catch: java.lang.Throwable -> Lc3
        L69:
            java.lang.String r1 = r4.f22659f     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lc3
            int r2 = r1.length()     // Catch: java.lang.Throwable -> Lc3
            int r2 = r2 + 10
            int r3 = r6.length()     // Catch: java.lang.Throwable -> Lc3
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc3
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Lc3
            r3.append(r1)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r1 = " (Mobile; "
            r3.append(r1)     // Catch: java.lang.Throwable -> Lc3
            r3.append(r6)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> Lc3
            r4.f22659f = r6     // Catch: java.lang.Throwable -> Lc3
            com.google.android.gms.common.wrappers.PackageManagerWrapper r5 = com.google.android.gms.common.wrappers.Wrappers.m14674a(r5)     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lc3
            boolean r5 = r5.m14672f()     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lc3
            if (r5 == 0) goto Lb3
            java.lang.String r5 = r4.f22659f     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lc3
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lc3
            java.lang.String r6 = ";aia"
            java.lang.String r5 = r5.concat(r6)     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lc3
            r4.f22659f = r5     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lc3
            goto Lb3
        La9:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzawm r6 = com.google.android.gms.ads.internal.zzk.zzlk()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r1 = "AdUtil.getUserAgent"
            r6.m17052e(r5, r1)     // Catch: java.lang.Throwable -> Lc3
        Lb3:
            java.lang.String r5 = r4.f22659f     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r6 = ")"
            java.lang.String r5 = r5.concat(r6)     // Catch: java.lang.Throwable -> Lc3
            r4.f22659f = r5     // Catch: java.lang.Throwable -> Lc3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc3
            return r5
        Lc3:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc3
            goto Lc7
        Lc6:
            throw r5
        Lc7:
            goto Lc6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaxi.m17177g0(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: h */
    public final JSONObject m17178h(Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return m17171N(bundle);
            } catch (JSONException e2) {
                zzbad.m17347c("Error converting Bundle to JSON", e2);
            }
        }
        return null;
    }

    /* renamed from: k */
    public final void m17179k(Context context, String str, WebSettings webSettings) {
        webSettings.setUserAgentString(m17177g0(context, str));
    }

    /* renamed from: l */
    public final void m17180l(Context context, String str, String str2, Bundle bundle, boolean z) {
        zzk.zzlg();
        bundle.putString("device", m17159k0());
        bundle.putString("eids", TextUtils.join(",", zzacu.m16425c()));
        zzyt.m20844a();
        zzazt.m17303e(context, str, str2, bundle, true, new C6698g5(this, context, str));
    }

    /* renamed from: m */
    public final void m17181m(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", m17177g0(context, str));
        httpURLConnection.setUseCaches(false);
    }

    /* renamed from: q */
    public final boolean m17182q(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return m17183r(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, m17123C(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m17183r(android.view.View r4, android.os.PowerManager r5, android.app.KeyguardManager r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzaxi r0 = com.google.android.gms.ads.internal.zzk.zzlg()
            boolean r0 = r0.f22657d
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L1d
            if (r6 != 0) goto Le
            r6 = 0
            goto L12
        Le:
            boolean r6 = r6.inKeyguardRestrictedInputMode()
        L12:
            if (r6 == 0) goto L1d
            boolean r6 = m17148d0(r4)
            if (r6 == 0) goto L1b
            goto L1d
        L1b:
            r6 = 0
            goto L1e
        L1d:
            r6 = 1
        L1e:
            int r0 = r4.getVisibility()
            if (r0 != 0) goto L63
            boolean r0 = r4.isShown()
            if (r0 == 0) goto L63
            if (r5 == 0) goto L35
            boolean r5 = r5.isScreenOn()
            if (r5 == 0) goto L33
            goto L35
        L33:
            r5 = 0
            goto L36
        L35:
            r5 = 1
        L36:
            if (r5 == 0) goto L63
            if (r6 == 0) goto L63
            com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r5 = com.google.android.gms.internal.ads.zzacu.f21678O1
            com.google.android.gms.internal.ads.zzacr r6 = com.google.android.gms.internal.ads.zzyt.m20848e()
            java.lang.Object r5 = r6.m16421c(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L62
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r4.getLocalVisibleRect(r5)
            if (r5 != 0) goto L62
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r4 = r4.getGlobalVisibleRect(r5)
            if (r4 == 0) goto L63
        L62:
            return r1
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaxi.m17183r(android.view.View, android.os.PowerManager, android.app.KeyguardManager):boolean");
    }

    /* renamed from: u */
    public final boolean m17184u(Context context) {
        if (this.f22660g) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new C6772i5(this, null), intentFilter);
        this.f22660g = true;
        return true;
    }

    /* renamed from: v */
    public final boolean m17185v(Context context) {
        if (this.f22661h) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new C6735h5(this, null), intentFilter);
        this.f22661h = true;
        return true;
    }
}
