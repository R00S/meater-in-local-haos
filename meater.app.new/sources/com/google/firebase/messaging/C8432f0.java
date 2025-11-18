package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import cm.aptoide.p092pt.FirebaseConstants;
import cm.aptoide.p092pt.networking.BodyInterceptorV3;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.C8405j;
import com.google.firebase.analytics.p179a.InterfaceC8095a;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.InterfaceC8325a;
import com.google.firebase.encoders.json.C8336d;
import com.google.firebase.installations.C8384h;
import com.google.firebase.messaging.C8469y;
import java.util.concurrent.ExecutionException;
import p241e.p254e.p256b.p257a.AbstractC8786c;
import p241e.p254e.p256b.p257a.C8785b;
import p241e.p254e.p256b.p257a.InterfaceC8789f;
import p241e.p254e.p256b.p257a.InterfaceC8790g;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.firebase.messaging.f0 */
/* loaded from: classes2.dex */
public class C8432f0 {

    /* renamed from: a */
    private static final InterfaceC8325a f31990a = new C8336d().mo26092a(C8469y.b.class, new C8469y.c()).mo26092a(C8469y.class, new C8469y.a()).m26100f();

    /* renamed from: A */
    public static boolean m26511A(Intent intent) {
        if (intent == null || m26531s(intent)) {
            return false;
        }
        return m26513a();
    }

    /* renamed from: B */
    public static boolean m26512B(Intent intent) {
        if (intent == null || m26531s(intent)) {
            return false;
        }
        return "1".equals(intent.getStringExtra("google.c.a.e"));
    }

    /* renamed from: a */
    static boolean m26513a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            C8405j.m26392j();
            Context contextM26404i = C8405j.m26392j().m26404i();
            SharedPreferences sharedPreferences = contextM26404i.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = contextM26404i.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextM26404i.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* renamed from: b */
    static String m26514b(Intent intent) {
        return intent.getStringExtra("collapse_key");
    }

    /* renamed from: c */
    static String m26515c(Intent intent) {
        return intent.getStringExtra("google.c.a.c_id");
    }

    /* renamed from: d */
    static String m26516d(Intent intent) {
        return intent.getStringExtra(FirebaseConstants.FIREBASE_MESSAGE_NAME);
    }

    /* renamed from: e */
    static String m26517e(Intent intent) {
        String stringExtra = intent.getStringExtra("google.to");
        if (!TextUtils.isEmpty(stringExtra)) {
            return stringExtra;
        }
        try {
            return (String) Tasks.m23659a(C8384h.m26266l(C8405j.m26392j()).getId());
        } catch (InterruptedException | ExecutionException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: f */
    static String m26518f(Intent intent) {
        return intent.getStringExtra("google.c.a.m_c");
    }

    /* renamed from: g */
    static String m26519g(Intent intent) {
        String stringExtra = intent.getStringExtra(FirebaseConstants.FIREBASE_MESSAGE_ID);
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    /* renamed from: h */
    static String m26520h(Intent intent) {
        return intent.getStringExtra(FirebaseConstants.FIREBASE_MESSAGE_LABEL);
    }

    /* renamed from: i */
    private static int m26521i(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    /* renamed from: j */
    static String m26522j(Intent intent) {
        return intent.getStringExtra("google.c.a.ts");
    }

    /* renamed from: k */
    static String m26523k(Intent intent) {
        return (intent.getExtras() == null || !C8436h0.m26550t(intent.getExtras())) ? "DATA_MESSAGE" : "DISPLAY_NOTIFICATION";
    }

    /* renamed from: l */
    static String m26524l(Intent intent) {
        return (intent.getExtras() == null || !C8436h0.m26550t(intent.getExtras())) ? "data" : "display";
    }

    /* renamed from: m */
    static String m26525m() {
        return C8405j.m26392j().m26404i().getPackageName();
    }

    /* renamed from: n */
    static int m26526n(Intent intent) {
        String stringExtra = intent.getStringExtra("google.delivered_priority");
        if (stringExtra == null) {
            if ("1".equals(intent.getStringExtra("google.priority_reduced"))) {
                return 2;
            }
            stringExtra = intent.getStringExtra("google.priority");
        }
        return m26521i(stringExtra);
    }

    /* renamed from: o */
    static String m26527o(Intent intent) {
        if (intent.hasExtra("google.c.sender.id")) {
            return intent.getStringExtra("google.c.sender.id");
        }
        C8405j c8405jM26392j = C8405j.m26392j();
        String strM26425d = c8405jM26392j.m26406l().m26425d();
        if (strM26425d != null) {
            return strM26425d;
        }
        String strM26424c = c8405jM26392j.m26406l().m26424c();
        if (!strM26424c.startsWith("1:")) {
            return strM26424c;
        }
        String[] strArrSplit = strM26424c.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: p */
    static String m26528p(Intent intent) {
        String stringExtra = intent.getStringExtra("from");
        if (stringExtra == null || !stringExtra.startsWith("/topics/")) {
            return null;
        }
        return stringExtra;
    }

    /* renamed from: q */
    static int m26529q(Intent intent) {
        Object obj = intent.getExtras().get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            String strValueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 13);
            sb.append("Invalid TTL: ");
            sb.append(strValueOf);
            Log.w("FirebaseMessaging", sb.toString());
            return 0;
        }
    }

    /* renamed from: r */
    static String m26530r(Intent intent) {
        if (intent.hasExtra("google.c.a.udt")) {
            return intent.getStringExtra("google.c.a.udt");
        }
        return null;
    }

    /* renamed from: s */
    private static boolean m26531s(Intent intent) {
        return FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction());
    }

    /* renamed from: t */
    public static void m26532t(Intent intent) {
        m26537y("_nd", intent);
    }

    /* renamed from: u */
    public static void m26533u(Intent intent) {
        m26537y("_nf", intent);
    }

    /* renamed from: v */
    public static void m26534v(Intent intent) {
        m26538z(intent);
        m26537y("_no", intent);
    }

    /* renamed from: w */
    public static void m26535w(Intent intent) {
        if (m26512B(intent)) {
            m26537y("_nr", intent);
        }
        if (m26511A(intent)) {
            InterfaceC8790g interfaceC8790gM26430i = FirebaseMessaging.m26430i();
            if (interfaceC8790gM26430i != null) {
                m26536x("MESSAGE_DELIVERED", intent, interfaceC8790gM26430i.mo26454a("FCM_CLIENT_EVENT_LOGGING", String.class, C8785b.m27945b(BodyInterceptorV3.RESPONSE_MODE_JSON), C8430e0.f31987a));
            } else {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            }
        }
    }

    /* renamed from: x */
    private static void m26536x(String str, Intent intent, InterfaceC8789f<String> interfaceC8789f) {
        try {
            interfaceC8789f.mo26452a(AbstractC8786c.m27948e(f31990a.mo26075b(new C8469y.b(new C8469y("MESSAGE_DELIVERED", intent)))));
        } catch (EncodingException unused) {
            Log.d("FirebaseMessaging", "Failed to encode big query analytics payload. Skip sending");
        }
    }

    /* renamed from: y */
    static void m26537y(String str, Intent intent) {
        Bundle bundle = new Bundle();
        String strM26515c = m26515c(intent);
        if (strM26515c != null) {
            bundle.putString("_nmid", strM26515c);
        }
        String strM26516d = m26516d(intent);
        if (strM26516d != null) {
            bundle.putString("_nmn", strM26516d);
        }
        String strM26520h = m26520h(intent);
        if (!TextUtils.isEmpty(strM26520h)) {
            bundle.putString("label", strM26520h);
        }
        String strM26518f = m26518f(intent);
        if (!TextUtils.isEmpty(strM26518f)) {
            bundle.putString("message_channel", strM26518f);
        }
        String strM26528p = m26528p(intent);
        if (strM26528p != null) {
            bundle.putString("_nt", strM26528p);
        }
        String strM26522j = m26522j(intent);
        if (strM26522j != null) {
            try {
                bundle.putInt("_nmt", Integer.parseInt(strM26522j));
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e2);
            }
        }
        String strM26530r = m26530r(intent);
        if (strM26530r != null) {
            try {
                bundle.putInt("_ndt", Integer.parseInt(strM26530r));
            } catch (NumberFormatException e3) {
                Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e3);
            }
        }
        String strM26524l = m26524l(intent);
        if ("_nr".equals(str) || "_nf".equals(str)) {
            bundle.putString("_nmc", strM26524l);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String strValueOf = String.valueOf(bundle);
            StringBuilder sb = new StringBuilder(str.length() + 37 + strValueOf.length());
            sb.append("Logging to scion event=");
            sb.append(str);
            sb.append(" scionPayload=");
            sb.append(strValueOf);
            Log.d("FirebaseMessaging", sb.toString());
        }
        InterfaceC8095a interfaceC8095a = (InterfaceC8095a) C8405j.m26392j().m26403h(InterfaceC8095a.class);
        if (interfaceC8095a != null) {
            interfaceC8095a.mo24952m0("fcm", str, bundle);
        } else {
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        }
    }

    /* renamed from: z */
    private static void m26538z(Intent intent) {
        if (intent == null) {
            return;
        }
        if (!"1".equals(intent.getStringExtra("google.c.a.tc"))) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                return;
            }
            return;
        }
        InterfaceC8095a interfaceC8095a = (InterfaceC8095a) C8405j.m26392j().m26403h(InterfaceC8095a.class);
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
        }
        if (interfaceC8095a == null) {
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            return;
        }
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        interfaceC8095a.mo24950a("fcm", "_ln", stringExtra);
        Bundle bundle = new Bundle();
        bundle.putString("source", "Firebase");
        bundle.putString("medium", "notification");
        bundle.putString("campaign", stringExtra);
        interfaceC8095a.mo24952m0("fcm", "_cmp", bundle);
    }
}
