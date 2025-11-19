package S8;

import Q8.C1622j;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: KeysMap.java */
/* loaded from: classes2.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f15535a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final int f15536b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15537c;

    public e(int i10, int i11) {
        this.f15536b = i10;
        this.f15537c = i11;
    }

    private String b(String str) {
        if (str != null) {
            return c(str, this.f15537c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static String c(String str, int i10) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i10 ? strTrim.substring(0, i10) : strTrim;
    }

    public synchronized Map<String, String> a() {
        return Collections.unmodifiableMap(new HashMap(this.f15535a));
    }

    public synchronized boolean d(String str, String str2) {
        String strB = b(str);
        if (this.f15535a.size() >= this.f15536b && !this.f15535a.containsKey(strB)) {
            N8.g.f().k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f15536b);
            return false;
        }
        String strC = c(str2, this.f15537c);
        if (C1622j.y(this.f15535a.get(strB), strC)) {
            return false;
        }
        Map<String, String> map = this.f15535a;
        if (str2 == null) {
            strC = "";
        }
        map.put(strB, strC);
        return true;
    }

    public synchronized void e(Map<String, String> map) {
        try {
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String strB = b(entry.getKey());
                if (this.f15535a.size() < this.f15536b || this.f15535a.containsKey(strB)) {
                    String value = entry.getValue();
                    this.f15535a.put(strB, value == null ? "" : c(value, this.f15537c));
                } else {
                    i10++;
                }
            }
            if (i10 > 0) {
                N8.g.f().k("Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f15536b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
