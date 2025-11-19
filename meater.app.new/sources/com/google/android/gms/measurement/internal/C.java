package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.C2823q3;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class C {

    /* renamed from: f, reason: collision with root package name */
    private static final C f34759f = new C(null, 100);

    /* renamed from: a, reason: collision with root package name */
    private final int f34760a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34761b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f34762c;

    /* renamed from: d, reason: collision with root package name */
    private final String f34763d;

    /* renamed from: e, reason: collision with root package name */
    private final EnumMap<C2823q3.a, v7.E> f34764e;

    C(Boolean bool, int i10) {
        this((Boolean) null, i10, (Boolean) null, (String) null);
    }

    public static C b(Bundle bundle, int i10) {
        if (bundle == null) {
            return new C(null, i10);
        }
        EnumMap enumMap = new EnumMap(C2823q3.a.class);
        for (C2823q3.a aVar : EnumC2829r3.DMA.c()) {
            enumMap.put((EnumMap) aVar, (C2823q3.a) C2823q3.k(bundle.getString(aVar.f35534B)));
        }
        return new C((EnumMap<C2823q3.a, v7.E>) enumMap, i10, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static C c(String str) throws NumberFormatException {
        if (str == null || str.length() <= 0) {
            return f34759f;
        }
        String[] strArrSplit = str.split(":");
        int i10 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(C2823q3.a.class);
        C2823q3.a[] aVarArrC = EnumC2829r3.DMA.c();
        int length = aVarArrC.length;
        int i11 = 1;
        int i12 = 0;
        while (i12 < length) {
            enumMap.put((EnumMap) aVarArrC[i12], (C2823q3.a) C2823q3.i(strArrSplit[i11].charAt(0)));
            i12++;
            i11++;
        }
        return new C((EnumMap<C2823q3.a, v7.E>) enumMap, i10, (Boolean) null, (String) null);
    }

    static C d(v7.E e10, int i10) {
        EnumMap enumMap = new EnumMap(C2823q3.a.class);
        enumMap.put((EnumMap) C2823q3.a.AD_USER_DATA, (C2823q3.a) e10);
        return new C((EnumMap<C2823q3.a, v7.E>) enumMap, -10, (Boolean) null, (String) null);
    }

    public static Boolean e(Bundle bundle) {
        v7.E eK;
        if (bundle == null || (eK = C2823q3.k(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int i10 = B.f34750a[eK.ordinal()];
        if (i10 == 3) {
            return Boolean.FALSE;
        }
        if (i10 != 4) {
            return null;
        }
        return Boolean.TRUE;
    }

    private final String l() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f34760a);
        for (C2823q3.a aVar : EnumC2829r3.DMA.c()) {
            sb2.append(":");
            sb2.append(C2823q3.a(this.f34764e.get(aVar)));
        }
        return sb2.toString();
    }

    public final int a() {
        return this.f34760a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        if (this.f34761b.equalsIgnoreCase(c10.f34761b) && Objects.equals(this.f34762c, c10.f34762c)) {
            return Objects.equals(this.f34763d, c10.f34763d);
        }
        return false;
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        Iterator it = this.f34764e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strQ = C2823q3.q((v7.E) entry.getValue());
            if (strQ != null) {
                bundle.putString(((C2823q3.a) entry.getKey()).f35534B, strQ);
            }
        }
        Boolean bool = this.f34762c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f34763d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final v7.E g() {
        v7.E e10 = this.f34764e.get(C2823q3.a.AD_USER_DATA);
        return e10 == null ? v7.E.UNINITIALIZED : e10;
    }

    public final Boolean h() {
        return this.f34762c;
    }

    public final int hashCode() {
        Boolean bool = this.f34762c;
        int i10 = bool == null ? 3 : bool == Boolean.TRUE ? 7 : 13;
        String str = this.f34763d;
        return this.f34761b.hashCode() + (i10 * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final String i() {
        return this.f34763d;
    }

    public final String j() {
        return this.f34761b;
    }

    public final boolean k() {
        Iterator<v7.E> it = this.f34764e.values().iterator();
        while (it.hasNext()) {
            if (it.next() != v7.E.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(C2823q3.g(this.f34760a));
        for (C2823q3.a aVar : EnumC2829r3.DMA.c()) {
            sb2.append(",");
            sb2.append(aVar.f35534B);
            sb2.append("=");
            v7.E e10 = this.f34764e.get(aVar);
            if (e10 == null) {
                sb2.append("uninitialized");
            } else {
                int i10 = B.f34750a[e10.ordinal()];
                if (i10 == 1) {
                    sb2.append("uninitialized");
                } else if (i10 == 2) {
                    sb2.append("eu_consent_policy");
                } else if (i10 == 3) {
                    sb2.append("denied");
                } else if (i10 == 4) {
                    sb2.append("granted");
                }
            }
        }
        if (this.f34762c != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(this.f34762c);
        }
        if (this.f34763d != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(this.f34763d);
        }
        return sb2.toString();
    }

    C(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap<C2823q3.a, v7.E> enumMap = new EnumMap<>(C2823q3.a.class);
        this.f34764e = enumMap;
        enumMap.put((EnumMap<C2823q3.a, v7.E>) C2823q3.a.AD_USER_DATA, (C2823q3.a) C2823q3.j(bool));
        this.f34760a = i10;
        this.f34761b = l();
        this.f34762c = bool2;
        this.f34763d = str;
    }

    private C(EnumMap<C2823q3.a, v7.E> enumMap, int i10, Boolean bool, String str) {
        EnumMap<C2823q3.a, v7.E> enumMap2 = new EnumMap<>(C2823q3.a.class);
        this.f34764e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f34760a = i10;
        this.f34761b = l();
        this.f34762c = bool;
        this.f34763d = str;
    }
}
