package com.facebook.p157o0.p163o0;

import android.content.SharedPreferences;
import com.facebook.C5641a0;
import com.facebook.p157o0.p165q0.C5904i;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.C10810q0;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10547v;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InAppPurchaseLoggerManager.kt */
/* renamed from: com.facebook.o0.o0.j */
/* loaded from: classes2.dex */
public final class C5887j {

    /* renamed from: b */
    private static SharedPreferences f15320b;

    /* renamed from: a */
    public static final C5887j f15319a = new C5887j();

    /* renamed from: c */
    private static final Set<String> f15321c = new CopyOnWriteArraySet();

    /* renamed from: d */
    private static final Map<String, Long> f15322d = new ConcurrentHashMap();

    private C5887j() {
    }

    /* renamed from: d */
    public static final boolean m12557d() {
        f15319a.m12560g();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        SharedPreferences sharedPreferences = f15320b;
        if (sharedPreferences == null) {
            C9801m.m32363w("sharedPreferences");
            throw null;
        }
        long j2 = sharedPreferences.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0L);
        if (j2 != 0 && jCurrentTimeMillis - j2 < 86400) {
            return false;
        }
        SharedPreferences sharedPreferences2 = f15320b;
        if (sharedPreferences2 != null) {
            sharedPreferences2.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", jCurrentTimeMillis).apply();
            return true;
        }
        C9801m.m32363w("sharedPreferences");
        throw null;
    }

    /* renamed from: e */
    public static final void m12558e(Map<String, JSONObject> map, Map<String, ? extends JSONObject> map2) {
        C9801m.m32346f(map, "purchaseDetailsMap");
        C9801m.m32346f(map2, "skuDetailsMap");
        C5887j c5887j = f15319a;
        c5887j.m12560g();
        c5887j.m12559f(c5887j.m12563c(c5887j.m12561a(map), map2));
    }

    /* renamed from: f */
    private final void m12559f(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null && value != null) {
                C5904i c5904i = C5904i.f15376a;
                C5904i.m12638f(key, value, false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    private final void m12560g() {
        C5641a0 c5641a0 = C5641a0.f14199a;
        SharedPreferences sharedPreferences = C5641a0.m11284c().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
        SharedPreferences sharedPreferences2 = C5641a0.m11284c().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
        if (sharedPreferences.contains("LAST_CLEARED_TIME")) {
            sharedPreferences.edit().clear().apply();
            sharedPreferences2.edit().clear().apply();
        }
        SharedPreferences sharedPreferences3 = C5641a0.m11284c().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
        C9801m.m32345e(sharedPreferences3, "getApplicationContext().getSharedPreferences(PRODUCT_DETAILS_STORE, Context.MODE_PRIVATE)");
        f15320b = sharedPreferences3;
        Set<String> set = f15321c;
        if (sharedPreferences3 == null) {
            C9801m.m32363w("sharedPreferences");
            throw null;
        }
        Set<String> stringSet = sharedPreferences3.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
        if (stringSet == null) {
            stringSet = new HashSet<>();
        }
        set.addAll(stringSet);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            List listM37582v0 = C10547v.m37582v0(it.next(), new String[]{";"}, false, 2, 2, null);
            f15322d.put(listM37582v0.get(0), Long.valueOf(Long.parseLong((String) listM37582v0.get(1))));
        }
        m12562b();
    }

    /* renamed from: a */
    public final Map<String, JSONObject> m12561a(Map<String, JSONObject> map) throws JSONException {
        C9801m.m32346f(map, "purchaseDetailsMap");
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        for (Map.Entry entry : C10810q0.m38807s(map).entrySet()) {
            String str = (String) entry.getKey();
            JSONObject jSONObject = (JSONObject) entry.getValue();
            try {
                if (jSONObject.has("purchaseToken")) {
                    String string = jSONObject.getString("purchaseToken");
                    if (f15322d.containsKey(string)) {
                        map.remove(str);
                    } else {
                        Set<String> set = f15321c;
                        StringBuilder sb = new StringBuilder();
                        sb.append((Object) string);
                        sb.append(';');
                        sb.append(jCurrentTimeMillis);
                        set.add(sb.toString());
                    }
                }
            } catch (Exception unused) {
            }
        }
        SharedPreferences sharedPreferences = f15320b;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putStringSet("PURCHASE_DETAILS_SET", f15321c).apply();
            return new HashMap(map);
        }
        C9801m.m32363w("sharedPreferences");
        throw null;
    }

    /* renamed from: b */
    public final void m12562b() {
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        SharedPreferences sharedPreferences = f15320b;
        if (sharedPreferences == null) {
            C9801m.m32363w("sharedPreferences");
            throw null;
        }
        long j2 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
        if (j2 == 0) {
            SharedPreferences sharedPreferences2 = f15320b;
            if (sharedPreferences2 != null) {
                sharedPreferences2.edit().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
                return;
            } else {
                C9801m.m32363w("sharedPreferences");
                throw null;
            }
        }
        if (jCurrentTimeMillis - j2 > 604800) {
            for (Map.Entry entry : C10810q0.m38807s(f15322d).entrySet()) {
                String str = (String) entry.getKey();
                long jLongValue = ((Number) entry.getValue()).longValue();
                if (jCurrentTimeMillis - jLongValue > 86400) {
                    f15321c.remove(str + ';' + jLongValue);
                    f15322d.remove(str);
                }
            }
            SharedPreferences sharedPreferences3 = f15320b;
            if (sharedPreferences3 == null) {
                C9801m.m32363w("sharedPreferences");
                throw null;
            }
            sharedPreferences3.edit().putStringSet("PURCHASE_DETAILS_SET", f15321c).putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
        }
    }

    /* renamed from: c */
    public final Map<String, String> m12563c(Map<String, ? extends JSONObject> map, Map<String, ? extends JSONObject> map2) {
        C9801m.m32346f(map, "purchaseDetailsMap");
        C9801m.m32346f(map2, "skuDetailsMap");
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends JSONObject> entry : map.entrySet()) {
            String key = entry.getKey();
            JSONObject value = entry.getValue();
            JSONObject jSONObject = map2.get(key);
            if (value != null && value.has("purchaseTime")) {
                try {
                    if (jCurrentTimeMillis - (value.getLong("purchaseTime") / 1000) <= 86400 && jSONObject != null) {
                        String string = value.toString();
                        C9801m.m32345e(string, "purchaseDetail.toString()");
                        String string2 = jSONObject.toString();
                        C9801m.m32345e(string2, "skuDetail.toString()");
                        linkedHashMap.put(string, string2);
                    }
                } catch (Exception unused) {
                }
            }
        }
        return linkedHashMap;
    }
}
