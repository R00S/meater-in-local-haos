package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import cm.aptoide.p092pt.database.room.RoomNotification;
import com.facebook.C5641a0;
import com.facebook.GraphRequest;
import com.facebook.internal.p147s0.C5702a;
import com.facebook.internal.p147s0.C5703b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FetchedAppGateKeepersManager.kt */
/* renamed from: com.facebook.internal.b0 */
/* loaded from: classes2.dex */
public final class C5668b0 {

    /* renamed from: a */
    public static final C5668b0 f14356a = new C5668b0();

    /* renamed from: b */
    private static final String f14357b = C9790g0.m32298b(C5668b0.class).mo32291q();

    /* renamed from: c */
    private static final AtomicBoolean f14358c = new AtomicBoolean(false);

    /* renamed from: d */
    private static final ConcurrentLinkedQueue<a> f14359d = new ConcurrentLinkedQueue<>();

    /* renamed from: e */
    private static final Map<String, JSONObject> f14360e = new ConcurrentHashMap();

    /* renamed from: f */
    private static Long f14361f;

    /* renamed from: g */
    private static C5703b f14362g;

    /* compiled from: FetchedAppGateKeepersManager.kt */
    /* renamed from: com.facebook.internal.b0$a */
    public interface a {
        void onCompleted();
    }

    private C5668b0() {
    }

    /* renamed from: a */
    private final JSONObject m11384a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        C5641a0 c5641a0 = C5641a0.f14199a;
        bundle.putString("sdk_version", C5641a0.m11300s());
        bundle.putString("fields", "gatekeepers");
        GraphRequest.C5632c c5632c = GraphRequest.f14159a;
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String str2 = String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1));
        C9801m.m32345e(str2, "java.lang.String.format(format, *args)");
        GraphRequest graphRequestM11236x = c5632c.m11236x(null, str2, null);
        graphRequestM11236x.m11177H(bundle);
        JSONObject jSONObjectM11340d = graphRequestM11236x.m11179j().m11340d();
        return jSONObjectM11340d == null ? new JSONObject() : jSONObjectM11340d;
    }

    /* renamed from: b */
    public static final boolean m11385b(String str, String str2, boolean z) {
        Boolean bool;
        C9801m.m32346f(str, "name");
        Map<String, Boolean> mapM11395c = f14356a.m11395c(str2);
        return (mapM11395c.containsKey(str) && (bool = mapM11395c.get(str)) != null) ? bool.booleanValue() : z;
    }

    /* renamed from: d */
    private final boolean m11386d(Long l) {
        return l != null && System.currentTimeMillis() - l.longValue() < 3600000;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046 A[Catch: all -> 0x008b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x001a, B:10:0x0022, B:13:0x0027, B:17:0x0046, B:19:0x0059, B:24:0x006a, B:25:0x006d, B:29:0x0077, B:33:0x0081, B:22:0x0061), top: B:39:0x0005, inners: #1 }] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final synchronized void m11389h(com.facebook.internal.C5668b0.a r8) {
        /*
            java.lang.Class<com.facebook.internal.b0> r0 = com.facebook.internal.C5668b0.class
            monitor-enter(r0)
            if (r8 == 0) goto La
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.b0$a> r1 = com.facebook.internal.C5668b0.f14359d     // Catch: java.lang.Throwable -> L8b
            r1.add(r8)     // Catch: java.lang.Throwable -> L8b
        La:
            com.facebook.a0 r8 = com.facebook.C5641a0.f14199a     // Catch: java.lang.Throwable -> L8b
            java.lang.String r8 = com.facebook.C5641a0.m11285d()     // Catch: java.lang.Throwable -> L8b
            com.facebook.internal.b0 r1 = com.facebook.internal.C5668b0.f14356a     // Catch: java.lang.Throwable -> L8b
            java.lang.Long r2 = com.facebook.internal.C5668b0.f14361f     // Catch: java.lang.Throwable -> L8b
            boolean r2 = r1.m11386d(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L27
            java.util.Map<java.lang.String, org.json.JSONObject> r2 = com.facebook.internal.C5668b0.f14360e     // Catch: java.lang.Throwable -> L8b
            boolean r2 = r2.containsKey(r8)     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L27
            r1.m11392k()     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r0)
            return
        L27:
            android.content.Context r1 = com.facebook.C5641a0.m11284c()     // Catch: java.lang.Throwable -> L8b
            kotlin.a0.d.k0 r2 = kotlin.jvm.internal.StringCompanionObject.f37185a     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = "com.facebook.internal.APP_GATEKEEPERS.%s"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L8b
            r5 = 0
            r4[r5] = r8     // Catch: java.lang.Throwable -> L8b
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r3)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = java.lang.String.format(r2, r4)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r4 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.C9801m.m32345e(r2, r4)     // Catch: java.lang.Throwable -> L8b
            if (r1 != 0) goto L46
            monitor-exit(r0)
            return
        L46:
            java.lang.String r4 = "com.facebook.internal.preferences.APP_GATEKEEPERS"
            android.content.SharedPreferences r4 = r1.getSharedPreferences(r4, r5)     // Catch: java.lang.Throwable -> L8b
            r6 = 0
            java.lang.String r4 = r4.getString(r2, r6)     // Catch: java.lang.Throwable -> L8b
            com.facebook.internal.p0 r7 = com.facebook.internal.C5696p0.f14478a     // Catch: java.lang.Throwable -> L8b
            boolean r7 = com.facebook.internal.C5696p0.m11557a0(r4)     // Catch: java.lang.Throwable -> L8b
            if (r7 != 0) goto L6d
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: org.json.JSONException -> L60 java.lang.Throwable -> L8b
            r7.<init>(r4)     // Catch: org.json.JSONException -> L60 java.lang.Throwable -> L8b
            r6 = r7
            goto L68
        L60:
            r4 = move-exception
            com.facebook.internal.p0 r7 = com.facebook.internal.C5696p0.f14478a     // Catch: java.lang.Throwable -> L8b
            java.lang.String r7 = "FacebookSDK"
            com.facebook.internal.C5696p0.m11573i0(r7, r4)     // Catch: java.lang.Throwable -> L8b
        L68:
            if (r6 == 0) goto L6d
            m11391j(r8, r6)     // Catch: java.lang.Throwable -> L8b
        L6d:
            com.facebook.a0 r4 = com.facebook.C5641a0.f14199a     // Catch: java.lang.Throwable -> L8b
            java.util.concurrent.Executor r4 = com.facebook.C5641a0.m11292k()     // Catch: java.lang.Throwable -> L8b
            if (r4 != 0) goto L77
            monitor-exit(r0)
            return
        L77:
            java.util.concurrent.atomic.AtomicBoolean r6 = com.facebook.internal.C5668b0.f14358c     // Catch: java.lang.Throwable -> L8b
            boolean r3 = r6.compareAndSet(r5, r3)     // Catch: java.lang.Throwable -> L8b
            if (r3 != 0) goto L81
            monitor-exit(r0)
            return
        L81:
            com.facebook.internal.e r3 = new com.facebook.internal.e     // Catch: java.lang.Throwable -> L8b
            r3.<init>()     // Catch: java.lang.Throwable -> L8b
            r4.execute(r3)     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r0)
            return
        L8b:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C5668b0.m11389h(com.facebook.internal.b0$a):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m11390i(String str, Context context, String str2) {
        C9801m.m32346f(str, "$applicationId");
        C9801m.m32346f(context, "$context");
        C9801m.m32346f(str2, "$gateKeepersKey");
        C5668b0 c5668b0 = f14356a;
        JSONObject jSONObjectM11384a = c5668b0.m11384a(str);
        if (jSONObjectM11384a.length() != 0) {
            m11391j(str, jSONObjectM11384a);
            context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str2, jSONObjectM11384a.toString()).apply();
            f14361f = Long.valueOf(System.currentTimeMillis());
        }
        c5668b0.m11392k();
        f14358c.set(false);
    }

    /* renamed from: j */
    public static final synchronized JSONObject m11391j(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArrayOptJSONArray;
        C9801m.m32346f(str, "applicationId");
        jSONObject2 = f14360e.get(str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        int i2 = 0;
        JSONObject jSONObjectOptJSONObject = null;
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("data")) != null) {
            jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        }
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("gatekeepers");
        if (jSONArrayOptJSONArray2 == null) {
            jSONArrayOptJSONArray2 = new JSONArray();
        }
        int length = jSONArrayOptJSONArray2.length();
        if (length > 0) {
            while (true) {
                int i3 = i2 + 1;
                try {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i2);
                    jSONObject2.put(jSONObject3.getString(RoomNotification.KEY), jSONObject3.getBoolean("value"));
                } catch (JSONException e2) {
                    C5696p0 c5696p0 = C5696p0.f14478a;
                    C5696p0.m11573i0("FacebookSDK", e2);
                }
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
            f14360e.put(str, jSONObject2);
        } else {
            f14360e.put(str, jSONObject2);
        }
        return jSONObject2;
    }

    /* renamed from: k */
    private final void m11392k() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<a> concurrentLinkedQueue = f14359d;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            final a aVarPoll = concurrentLinkedQueue.poll();
            if (aVarPoll != null) {
                handler.post(new Runnable() { // from class: com.facebook.internal.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5668b0.m11393l(aVarPoll);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m11393l(a aVar) {
        aVar.onCompleted();
    }

    /* renamed from: m */
    public static final JSONObject m11394m(String str, boolean z) {
        C9801m.m32346f(str, "applicationId");
        if (!z) {
            Map<String, JSONObject> map = f14360e;
            if (map.containsKey(str)) {
                JSONObject jSONObject = map.get(str);
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        }
        JSONObject jSONObjectM11384a = f14356a.m11384a(str);
        C5641a0 c5641a0 = C5641a0.f14199a;
        Context contextM11284c = C5641a0.m11284c();
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String str2 = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{str}, 1));
        C9801m.m32345e(str2, "java.lang.String.format(format, *args)");
        contextM11284c.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str2, jSONObjectM11384a.toString()).apply();
        return m11391j(str, jSONObjectM11384a);
    }

    /* renamed from: c */
    public final Map<String, Boolean> m11395c(String str) {
        m11396g();
        if (str != null) {
            Map<String, JSONObject> map = f14360e;
            if (map.containsKey(str)) {
                C5703b c5703b = f14362g;
                List<C5702a> listM11703a = c5703b == null ? null : c5703b.m11703a(str);
                if (listM11703a != null) {
                    HashMap map2 = new HashMap();
                    for (C5702a c5702a : listM11703a) {
                        map2.put(c5702a.m11701a(), Boolean.valueOf(c5702a.m11702b()));
                    }
                    return map2;
                }
                HashMap map3 = new HashMap();
                JSONObject jSONObject = map.get(str);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    C9801m.m32345e(next, RoomNotification.KEY);
                    map3.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
                }
                C5703b c5703b2 = f14362g;
                if (c5703b2 == null) {
                    c5703b2 = new C5703b();
                }
                ArrayList arrayList = new ArrayList(map3.size());
                for (Map.Entry entry : map3.entrySet()) {
                    arrayList.add(new C5702a((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                c5703b2.m11704b(str, arrayList);
                f14362g = c5703b2;
                return map3;
            }
        }
        return new HashMap();
    }

    /* renamed from: g */
    public final void m11396g() {
        m11389h(null);
    }
}
