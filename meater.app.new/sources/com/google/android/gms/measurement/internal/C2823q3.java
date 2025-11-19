package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.q3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2823q3 {

    /* renamed from: c, reason: collision with root package name */
    public static final C2823q3 f35526c = new C2823q3(null, null, 100);

    /* renamed from: a, reason: collision with root package name */
    private final EnumMap<a, v7.E> f35527a;

    /* renamed from: b, reason: collision with root package name */
    private final int f35528b;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
    /* renamed from: com.google.android.gms.measurement.internal.q3$a */
    public enum a {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");


        /* renamed from: B, reason: collision with root package name */
        public final String f35534B;

        a(String str) {
            this.f35534B = str;
        }
    }

    private C2823q3(EnumMap<a, v7.E> enumMap, int i10) {
        EnumMap<a, v7.E> enumMap2 = new EnumMap<>(a.class);
        this.f35527a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f35528b = i10;
    }

    static char a(v7.E e10) {
        if (e10 == null) {
            return '-';
        }
        int iOrdinal = e10.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static C2823q3 c(Bundle bundle, int i10) {
        if (bundle == null) {
            return new C2823q3(null, null, i10);
        }
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : EnumC2829r3.STORAGE.f35591B) {
            enumMap.put((EnumMap) aVar, (a) k(bundle.getString(aVar.f35534B)));
        }
        return new C2823q3(enumMap, i10);
    }

    public static C2823q3 e(String str, int i10) {
        EnumMap enumMap = new EnumMap(a.class);
        if (str == null) {
            str = "";
        }
        a[] aVarArrC = EnumC2829r3.STORAGE.c();
        for (int i11 = 0; i11 < aVarArrC.length; i11++) {
            a aVar = aVarArrC[i11];
            int i12 = i11 + 2;
            if (i12 < str.length()) {
                enumMap.put((EnumMap) aVar, (a) i(str.charAt(i12)));
            } else {
                enumMap.put((EnumMap) aVar, (a) v7.E.UNINITIALIZED);
            }
        }
        return new C2823q3(enumMap, i10);
    }

    public static C2823q3 f(v7.E e10, v7.E e11, int i10) {
        EnumMap enumMap = new EnumMap(a.class);
        enumMap.put((EnumMap) a.AD_STORAGE, (a) e10);
        enumMap.put((EnumMap) a.ANALYTICS_STORAGE, (a) e11);
        return new C2823q3(enumMap, -10);
    }

    static String g(int i10) {
        return i10 != -30 ? i10 != -20 ? i10 != -10 ? i10 != 0 ? i10 != 30 ? i10 != 90 ? i10 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static String h(Bundle bundle) {
        String string;
        a[] aVarArr = EnumC2829r3.STORAGE.f35591B;
        int length = aVarArr.length;
        int i10 = 0;
        while (true) {
            Boolean bool = null;
            if (i10 >= length) {
                return null;
            }
            a aVar = aVarArr[i10];
            if (bundle.containsKey(aVar.f35534B) && (string = bundle.getString(aVar.f35534B)) != null) {
                if (string.equals("granted")) {
                    bool = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    bool = Boolean.FALSE;
                }
                if (bool == null) {
                    return string;
                }
            }
            i10++;
        }
    }

    static v7.E i(char c10) {
        return c10 != '+' ? c10 != '0' ? c10 != '1' ? v7.E.UNINITIALIZED : v7.E.GRANTED : v7.E.DENIED : v7.E.POLICY;
    }

    static v7.E j(Boolean bool) {
        return bool == null ? v7.E.UNINITIALIZED : bool.booleanValue() ? v7.E.GRANTED : v7.E.DENIED;
    }

    static v7.E k(String str) {
        return str == null ? v7.E.UNINITIALIZED : str.equals("granted") ? v7.E.GRANTED : str.equals("denied") ? v7.E.DENIED : v7.E.UNINITIALIZED;
    }

    public static boolean l(int i10, int i11) {
        if (i10 == -20 && i11 == -30) {
            return true;
        }
        return (i10 == -30 && i11 == -20) || i10 == i11 || i10 < i11;
    }

    public static C2823q3 p(String str) {
        return e(str, 100);
    }

    static String q(v7.E e10) {
        int iOrdinal = e10.ordinal();
        if (iOrdinal == 2) {
            return "denied";
        }
        if (iOrdinal != 3) {
            return null;
        }
        return "granted";
    }

    public final int b() {
        return this.f35528b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.C2823q3 d(com.google.android.gms.measurement.internal.C2823q3 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.q3$a> r1 = com.google.android.gms.measurement.internal.C2823q3.a.class
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.r3 r1 = com.google.android.gms.measurement.internal.EnumC2829r3.STORAGE
            com.google.android.gms.measurement.internal.q3$a[] r1 = com.google.android.gms.measurement.internal.EnumC2829r3.j(r1)
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L4d
            r4 = r1[r3]
            java.util.EnumMap<com.google.android.gms.measurement.internal.q3$a, v7.E> r5 = r8.f35527a
            java.lang.Object r5 = r5.get(r4)
            v7.E r5 = (v7.E) r5
            java.util.EnumMap<com.google.android.gms.measurement.internal.q3$a, v7.E> r6 = r9.f35527a
            java.lang.Object r6 = r6.get(r4)
            v7.E r6 = (v7.E) r6
            if (r5 != 0) goto L26
            goto L35
        L26:
            if (r6 != 0) goto L29
            goto L45
        L29:
            v7.E r7 = v7.E.UNINITIALIZED
            if (r5 != r7) goto L2e
            goto L35
        L2e:
            if (r6 != r7) goto L31
            goto L45
        L31:
            v7.E r7 = v7.E.POLICY
            if (r5 != r7) goto L37
        L35:
            r5 = r6
            goto L45
        L37:
            if (r6 != r7) goto L3a
            goto L45
        L3a:
            v7.E r7 = v7.E.DENIED
            if (r5 == r7) goto L44
            if (r6 != r7) goto L41
            goto L44
        L41:
            v7.E r5 = v7.E.GRANTED
            goto L45
        L44:
            r5 = r7
        L45:
            if (r5 == 0) goto L4a
            r0.put(r4, r5)
        L4a:
            int r3 = r3 + 1
            goto Lf
        L4d:
            com.google.android.gms.measurement.internal.q3 r9 = new com.google.android.gms.measurement.internal.q3
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2823q3.d(com.google.android.gms.measurement.internal.q3):com.google.android.gms.measurement.internal.q3");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2823q3)) {
            return false;
        }
        C2823q3 c2823q3 = (C2823q3) obj;
        for (a aVar : EnumC2829r3.STORAGE.f35591B) {
            if (this.f35527a.get(aVar) != c2823q3.f35527a.get(aVar)) {
                return false;
            }
        }
        return this.f35528b == c2823q3.f35528b;
    }

    public final int hashCode() {
        int iHashCode = this.f35528b * 17;
        Iterator<v7.E> it = this.f35527a.values().iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + it.next().hashCode();
        }
        return iHashCode;
    }

    public final boolean m(a aVar) {
        return this.f35527a.get(aVar) != v7.E.DENIED;
    }

    public final Bundle n() {
        Bundle bundle = new Bundle();
        Iterator it = this.f35527a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strQ = q((v7.E) entry.getValue());
            if (strQ != null) {
                bundle.putString(((a) entry.getKey()).f35534B, strQ);
            }
        }
        return bundle;
    }

    public final C2823q3 o(C2823q3 c2823q3) {
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : EnumC2829r3.STORAGE.f35591B) {
            v7.E e10 = this.f35527a.get(aVar);
            if (e10 == v7.E.UNINITIALIZED) {
                e10 = c2823q3.f35527a.get(aVar);
            }
            if (e10 != null) {
                enumMap.put((EnumMap) aVar, (a) e10);
            }
        }
        return new C2823q3(enumMap, this.f35528b);
    }

    public final v7.E r() {
        v7.E e10 = this.f35527a.get(a.AD_STORAGE);
        return e10 == null ? v7.E.UNINITIALIZED : e10;
    }

    public final boolean s(C2823q3 c2823q3) {
        for (a aVar : (a[]) this.f35527a.keySet().toArray(new a[0])) {
            v7.E e10 = this.f35527a.get(aVar);
            v7.E e11 = c2823q3.f35527a.get(aVar);
            v7.E e12 = v7.E.DENIED;
            if (e10 == e12 && e11 != e12) {
                return true;
            }
        }
        return false;
    }

    public final v7.E t() {
        v7.E e10 = this.f35527a.get(a.ANALYTICS_STORAGE);
        return e10 == null ? v7.E.UNINITIALIZED : e10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(g(this.f35528b));
        for (a aVar : EnumC2829r3.STORAGE.f35591B) {
            sb2.append(",");
            sb2.append(aVar.f35534B);
            sb2.append("=");
            v7.E e10 = this.f35527a.get(aVar);
            if (e10 == null) {
                e10 = v7.E.UNINITIALIZED;
            }
            sb2.append(e10);
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String u() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "G1"
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.r3 r1 = com.google.android.gms.measurement.internal.EnumC2829r3.STORAGE
            com.google.android.gms.measurement.internal.q3$a[] r1 = r1.c()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L3a
            r4 = r1[r3]
            java.util.EnumMap<com.google.android.gms.measurement.internal.q3$a, v7.E> r5 = r7.f35527a
            java.lang.Object r4 = r5.get(r4)
            v7.E r4 = (v7.E) r4
            r5 = 45
            if (r4 == 0) goto L34
            int r4 = r4.ordinal()
            if (r4 == 0) goto L34
            r6 = 1
            if (r4 == r6) goto L32
            r6 = 2
            if (r4 == r6) goto L2f
            r6 = 3
            if (r4 == r6) goto L32
            goto L34
        L2f:
            r5 = 48
            goto L34
        L32:
            r5 = 49
        L34:
            r0.append(r5)
            int r3 = r3 + 1
            goto Lf
        L3a:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2823q3.u():java.lang.String");
    }

    public final String v() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (a aVar : EnumC2829r3.STORAGE.c()) {
            sb2.append(a(this.f35527a.get(aVar)));
        }
        return sb2.toString();
    }

    public final boolean w() {
        return m(a.AD_STORAGE);
    }

    public final boolean x() {
        return m(a.ANALYTICS_STORAGE);
    }

    public final boolean y() {
        Iterator<v7.E> it = this.f35527a.values().iterator();
        while (it.hasNext()) {
            if (it.next() != v7.E.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public C2823q3(Boolean bool, Boolean bool2, int i10) {
        EnumMap<a, v7.E> enumMap = new EnumMap<>(a.class);
        this.f35527a = enumMap;
        enumMap.put((EnumMap<a, v7.E>) a.AD_STORAGE, (a) j(null));
        enumMap.put((EnumMap<a, v7.E>) a.ANALYTICS_STORAGE, (a) j(null));
        this.f35528b = i10;
    }
}
