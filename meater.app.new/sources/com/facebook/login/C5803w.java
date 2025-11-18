package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.login.LoginClient;
import com.facebook.p157o0.C5825g0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LoginLogger.kt */
/* renamed from: com.facebook.login.w */
/* loaded from: classes2.dex */
public final class C5803w {

    /* renamed from: a */
    public static final a f14853a = new a(null);

    /* renamed from: b */
    private static final ScheduledExecutorService f14854b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c */
    private final String f14855c;

    /* renamed from: d */
    private final C5825g0 f14856d;

    /* renamed from: e */
    private String f14857e;

    /* compiled from: LoginLogger.kt */
    /* renamed from: com.facebook.login.w$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final Bundle m12098b(String str) {
            Bundle bundle = new Bundle();
            bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle.putString("0_auth_logger_id", str);
            bundle.putString("3_method", HttpUrl.FRAGMENT_ENCODE_SET);
            bundle.putString("2_result", HttpUrl.FRAGMENT_ENCODE_SET);
            bundle.putString("5_error_message", HttpUrl.FRAGMENT_ENCODE_SET);
            bundle.putString("4_error_code", HttpUrl.FRAGMENT_ENCODE_SET);
            bundle.putString("6_extras", HttpUrl.FRAGMENT_ENCODE_SET);
            return bundle;
        }
    }

    public C5803w(Context context, String str) {
        PackageInfo packageInfo;
        C9801m.m32346f(context, "context");
        C9801m.m32346f(str, "applicationId");
        this.f14855c = str;
        this.f14856d = new C5825g0(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) == null) {
                return;
            }
            this.f14857e = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: g */
    private final void m12087g(String str) {
        final Bundle bundleM12098b = f14853a.m12098b(str);
        f14854b.schedule(new Runnable() { // from class: com.facebook.login.l
            @Override // java.lang.Runnable
            public final void run() {
                C5803w.m12088h(this.f14805f, bundleM12098b);
            }
        }, 5L, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m12088h(C5803w c5803w, Bundle bundle) {
        C9801m.m32346f(c5803w, "this$0");
        C9801m.m32346f(bundle, "$bundle");
        c5803w.f14856d.m12245g("fb_mobile_login_heartbeat", bundle);
    }

    /* renamed from: k */
    public static /* synthetic */ void m12089k(C5803w c5803w, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        c5803w.m12096j(str, str2, str3);
    }

    /* renamed from: a */
    public final String m12090a() {
        return this.f14855c;
    }

    /* renamed from: c */
    public final void m12091c(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6) {
        Bundle bundleM12098b = f14853a.m12098b(str);
        if (str3 != null) {
            bundleM12098b.putString("2_result", str3);
        }
        if (str4 != null) {
            bundleM12098b.putString("5_error_message", str4);
        }
        if (str5 != null) {
            bundleM12098b.putString("4_error_code", str5);
        }
        if (map != null && (!map.isEmpty())) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            bundleM12098b.putString("6_extras", new JSONObject(linkedHashMap).toString());
        }
        bundleM12098b.putString("3_method", str2);
        this.f14856d.m12245g(str6, bundleM12098b);
    }

    /* renamed from: d */
    public final void m12092d(String str, String str2, String str3) {
        Bundle bundleM12098b = f14853a.m12098b(str);
        bundleM12098b.putString("3_method", str2);
        this.f14856d.m12245g(str3, bundleM12098b);
    }

    /* renamed from: e */
    public final void m12093e(String str, String str2, String str3) {
        Bundle bundleM12098b = f14853a.m12098b(str);
        bundleM12098b.putString("3_method", str2);
        this.f14856d.m12245g(str3, bundleM12098b);
    }

    /* renamed from: f */
    public final void m12094f(String str, Map<String, String> map, LoginClient.Result.EnumC5765a enumC5765a, Map<String, String> map2, Exception exc, String str2) throws JSONException {
        C9801m.m32346f(map, "loggingExtras");
        Bundle bundleM12098b = f14853a.m12098b(str);
        if (enumC5765a != null) {
            bundleM12098b.putString("2_result", enumC5765a.m11983k());
        }
        if ((exc == null ? null : exc.getMessage()) != null) {
            bundleM12098b.putString("5_error_message", exc.getMessage());
        }
        JSONObject jSONObject = map.isEmpty() ^ true ? new JSONObject(map) : null;
        if (map2 != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                for (Map.Entry<String, String> entry : map2.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (key != null) {
                        jSONObject.put(key, value);
                    }
                }
            } catch (JSONException unused) {
            }
        }
        if (jSONObject != null) {
            bundleM12098b.putString("6_extras", jSONObject.toString());
        }
        this.f14856d.m12245g(str2, bundleM12098b);
        if (enumC5765a == LoginClient.Result.EnumC5765a.SUCCESS) {
            m12087g(str);
        }
    }

    /* renamed from: i */
    public final void m12095i(LoginClient.Request request, String str) throws JSONException {
        C9801m.m32346f(request, "pendingLoginRequest");
        Bundle bundleM12098b = f14853a.m12098b(request.m11955b());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("login_behavior", request.m11963j().toString());
            jSONObject.put("request_code", LoginClient.f14714f.m11996b());
            jSONObject.put("permissions", TextUtils.join(",", request.m11967n()));
            jSONObject.put("default_audience", request.m11960g().toString());
            jSONObject.put("isReauthorize", request.m11972s());
            String str2 = this.f14857e;
            if (str2 != null) {
                jSONObject.put("facebookVersion", str2);
            }
            if (request.m11964k() != null) {
                jSONObject.put("target_app", request.m11964k().toString());
            }
            bundleM12098b.putString("6_extras", jSONObject.toString());
        } catch (JSONException unused) {
        }
        this.f14856d.m12245g(str, bundleM12098b);
    }

    /* renamed from: j */
    public final void m12096j(String str, String str2, String str3) {
        Bundle bundleM12098b = f14853a.m12098b(HttpUrl.FRAGMENT_ENCODE_SET);
        bundleM12098b.putString("2_result", LoginClient.Result.EnumC5765a.ERROR.m11983k());
        bundleM12098b.putString("5_error_message", str2);
        bundleM12098b.putString("3_method", str3);
        this.f14856d.m12245g(str, bundleM12098b);
    }
}
