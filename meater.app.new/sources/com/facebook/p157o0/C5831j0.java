package com.facebook.p157o0;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import com.facebook.C5641a0;
import com.facebook.internal.C5696p0;
import com.facebook.p157o0.p158k0.C5837e;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.C10822w0;
import kotlin.jvm.internal.C9801m;
import kotlin.text.Regex;
import okhttp3.HttpUrl;

/* compiled from: UserDataStore.kt */
/* renamed from: com.facebook.o0.j0 */
/* loaded from: classes.dex */
public final class C5831j0 {

    /* renamed from: c */
    private static SharedPreferences f14970c;

    /* renamed from: a */
    public static final C5831j0 f14968a = new C5831j0();

    /* renamed from: b */
    private static final String f14969b = C5831j0.class.getSimpleName();

    /* renamed from: d */
    private static final AtomicBoolean f14971d = new AtomicBoolean(false);

    /* renamed from: e */
    private static final ConcurrentHashMap<String, String> f14972e = new ConcurrentHashMap<>();

    /* renamed from: f */
    private static final ConcurrentHashMap<String, String> f14973f = new ConcurrentHashMap<>();

    private C5831j0() {
    }

    /* renamed from: a */
    public static final String m12262a() {
        if (!f14971d.get()) {
            f14968a.m12264c();
        }
        HashMap map = new HashMap();
        map.putAll(f14972e);
        map.putAll(f14968a.m12263b());
        C5696p0 c5696p0 = C5696p0.f14478a;
        return C5696p0.m11579l0(map);
    }

    /* renamed from: b */
    private final Map<String, String> m12263b() {
        HashMap map = new HashMap();
        Set<String> setM12287b = C5837e.f14982a.m12287b();
        for (String str : f14973f.keySet()) {
            if (setM12287b.contains(str)) {
                map.put(str, f14973f.get(str));
            }
        }
        return map;
    }

    /* renamed from: c */
    private final synchronized void m12264c() {
        AtomicBoolean atomicBoolean = f14971d;
        if (atomicBoolean.get()) {
            return;
        }
        C5641a0 c5641a0 = C5641a0.f14199a;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C5641a0.m11284c());
        C9801m.m32345e(defaultSharedPreferences, "getDefaultSharedPreferences(FacebookSdk.getApplicationContext())");
        f14970c = defaultSharedPreferences;
        if (defaultSharedPreferences == null) {
            C9801m.m32363w("sharedPreferences");
            throw null;
        }
        String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", HttpUrl.FRAGMENT_ENCODE_SET);
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        SharedPreferences sharedPreferences = f14970c;
        if (sharedPreferences == null) {
            C9801m.m32363w("sharedPreferences");
            throw null;
        }
        String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", HttpUrl.FRAGMENT_ENCODE_SET);
        if (string2 == null) {
            string2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        ConcurrentHashMap<String, String> concurrentHashMap = f14972e;
        C5696p0 c5696p0 = C5696p0.f14478a;
        concurrentHashMap.putAll(C5696p0.m11567f0(string));
        f14973f.putAll(C5696p0.m11567f0(string2));
        atomicBoolean.set(true);
    }

    /* renamed from: d */
    public static final void m12265d() {
        if (f14971d.get()) {
            return;
        }
        f14968a.m12264c();
    }

    /* renamed from: f */
    private final String m12267f(String str, String str2) {
        String strSubstring;
        int length = str2.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            boolean z2 = C9801m.m32348h(str2.charAt(!z ? i2 : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i2++;
            } else {
                z = true;
            }
        }
        String string = str2.subSequence(i2, length + 1).toString();
        if (string == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = string.toLowerCase();
        C9801m.m32345e(lowerCase, "(this as java.lang.String).toLowerCase()");
        if (C9801m.m32341a("em", str)) {
            if (Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                return lowerCase;
            }
            Log.e(f14969b, "Setting email failure: this is not a valid email address");
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (C9801m.m32341a("ph", str)) {
            return new Regex("[^0-9]").m37439c(lowerCase, HttpUrl.FRAGMENT_ENCODE_SET);
        }
        if (!C9801m.m32341a("ge", str)) {
            return lowerCase;
        }
        if (!(lowerCase.length() > 0)) {
            strSubstring = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            if (lowerCase == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            strSubstring = lowerCase.substring(0, 1);
            C9801m.m32345e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        if (C9801m.m32341a("f", strSubstring) || C9801m.m32341a("m", strSubstring)) {
            return strSubstring;
        }
        Log.e(f14969b, "Setting gender failure: the supported value for gender is f or m");
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* renamed from: g */
    public static final void m12268g(Map<String, String> map) {
        List<String> listM37440d;
        C9801m.m32346f(map, "ud");
        if (!f14971d.get()) {
            f14968a.m12264c();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            C5696p0 c5696p0 = C5696p0.f14478a;
            C5831j0 c5831j0 = f14968a;
            int i2 = 1;
            int length = value.length() - 1;
            int i3 = 0;
            boolean z = false;
            while (i3 <= length) {
                boolean z2 = C9801m.m32348h(value.charAt(!z ? i3 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i3++;
                } else {
                    z = true;
                }
            }
            String strM11535F0 = C5696p0.m11535F0(c5831j0.m12267f(key, value.subSequence(i3, length + 1).toString()));
            ConcurrentHashMap<String, String> concurrentHashMap = f14973f;
            if (concurrentHashMap.containsKey(key)) {
                String str = concurrentHashMap.get(key);
                String[] strArr = null;
                if (str != null && (listM37440d = new Regex(",").m37440d(str, 0)) != null) {
                    Object[] array = listM37440d.toArray(new String[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    strArr = (String[]) array;
                }
                if (strArr == null) {
                    strArr = new String[0];
                }
                Set setM38920g = C10822w0.m38920g(Arrays.copyOf(strArr, strArr.length));
                if (setM38920g.contains(strM11535F0)) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                if (strArr.length == 0) {
                    sb.append(strM11535F0);
                } else if (strArr.length < 5) {
                    sb.append(str);
                    sb.append(",");
                    sb.append(strM11535F0);
                } else {
                    while (true) {
                        int i4 = i2 + 1;
                        sb.append(strArr[i2]);
                        sb.append(",");
                        if (i4 >= 5) {
                            break;
                        } else {
                            i2 = i4;
                        }
                    }
                    sb.append(strM11535F0);
                    setM38920g.remove(strArr[0]);
                }
                f14973f.put(key, sb.toString());
            } else {
                concurrentHashMap.put(key, strM11535F0);
            }
        }
        C5831j0 c5831j02 = f14968a;
        C5696p0 c5696p02 = C5696p0.f14478a;
        c5831j02.m12269h("com.facebook.appevents.UserDataStore.internalUserData", C5696p0.m11579l0(f14973f));
    }

    /* renamed from: h */
    private final void m12269h(final String str, final String str2) {
        C5641a0 c5641a0 = C5641a0.f14199a;
        C5641a0.m11292k().execute(new Runnable() { // from class: com.facebook.o0.s
            @Override // java.lang.Runnable
            public final void run() {
                C5831j0.m12270i(str, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m12270i(String str, String str2) {
        C9801m.m32346f(str, "$key");
        C9801m.m32346f(str2, "$value");
        if (!f14971d.get()) {
            f14968a.m12264c();
        }
        SharedPreferences sharedPreferences = f14970c;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString(str, str2).apply();
        } else {
            C9801m.m32363w("sharedPreferences");
            throw null;
        }
    }
}
