package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import m8.AbstractC3979B;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2463e {

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC3979B<String> f34098d = AbstractC3979B.L("_syn", "_err", "_el");

    /* renamed from: a, reason: collision with root package name */
    private String f34099a;

    /* renamed from: b, reason: collision with root package name */
    private long f34100b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Object> f34101c;

    public C2463e(String str, long j10, Map<String, Object> map) {
        this.f34099a = str;
        this.f34100b = j10;
        HashMap map2 = new HashMap();
        this.f34101c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object c(String str, Object obj, Object obj2) {
        return (f34098d.contains(str) && (obj2 instanceof Double)) ? Long.valueOf(Math.round(((Double) obj2).doubleValue())) : str.startsWith("_") ? ((obj instanceof String) || obj == null) ? obj2 : obj : obj instanceof Double ? obj2 : obj instanceof Long ? Long.valueOf(Math.round(((Double) obj2).doubleValue())) : obj instanceof String ? obj2.toString() : obj2;
    }

    public final long a() {
        return this.f34100b;
    }

    public final Object b(String str) {
        if (this.f34101c.containsKey(str)) {
            return this.f34101c.get(str);
        }
        return null;
    }

    public final /* synthetic */ Object clone() {
        return new C2463e(this.f34099a, this.f34100b, new HashMap(this.f34101c));
    }

    public final void d(String str, Object obj) {
        if (obj == null) {
            this.f34101c.remove(str);
        } else {
            this.f34101c.put(str, c(str, this.f34101c.get(str), obj));
        }
    }

    public final String e() {
        return this.f34099a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2463e)) {
            return false;
        }
        C2463e c2463e = (C2463e) obj;
        if (this.f34100b == c2463e.f34100b && this.f34099a.equals(c2463e.f34099a)) {
            return this.f34101c.equals(c2463e.f34101c);
        }
        return false;
    }

    public final void f(String str) {
        this.f34099a = str;
    }

    public final Map<String, Object> g() {
        return this.f34101c;
    }

    public final int hashCode() {
        int iHashCode = this.f34099a.hashCode() * 31;
        long j10 = this.f34100b;
        return ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f34101c.hashCode();
    }

    public final String toString() {
        return "Event{name='" + this.f34099a + "', timestamp=" + this.f34100b + ", params=" + String.valueOf(this.f34101c) + "}";
    }
}
