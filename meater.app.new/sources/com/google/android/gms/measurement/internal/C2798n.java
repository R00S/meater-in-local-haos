package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.C2823q3;
import java.util.EnumMap;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2798n {

    /* renamed from: a, reason: collision with root package name */
    private final EnumMap<C2823q3.a, EnumC2791m> f35471a;

    C2798n() {
        this.f35471a = new EnumMap<>(C2823q3.a.class);
    }

    public static C2798n b(String str) {
        EnumMap enumMap = new EnumMap(C2823q3.a.class);
        if (str.length() >= C2823q3.a.values().length) {
            int i10 = 0;
            if (str.charAt(0) == '1') {
                C2823q3.a[] aVarArrValues = C2823q3.a.values();
                int length = aVarArrValues.length;
                int i11 = 1;
                while (i10 < length) {
                    enumMap.put((EnumMap) aVarArrValues[i10], (C2823q3.a) EnumC2791m.j(str.charAt(i11)));
                    i10++;
                    i11++;
                }
                return new C2798n(enumMap);
            }
        }
        return new C2798n();
    }

    public final EnumC2791m a(C2823q3.a aVar) {
        EnumC2791m enumC2791m = this.f35471a.get(aVar);
        return enumC2791m == null ? EnumC2791m.UNSET : enumC2791m;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.google.android.gms.measurement.internal.C2823q3.a r3, int r4) {
        /*
            r2 = this;
            com.google.android.gms.measurement.internal.m r0 = com.google.android.gms.measurement.internal.EnumC2791m.UNSET
            r1 = -30
            if (r4 == r1) goto L1e
            r1 = -20
            if (r4 == r1) goto L1b
            r1 = -10
            if (r4 == r1) goto L18
            if (r4 == 0) goto L1b
            r1 = 30
            if (r4 == r1) goto L15
            goto L20
        L15:
            com.google.android.gms.measurement.internal.m r0 = com.google.android.gms.measurement.internal.EnumC2791m.INITIALIZATION
            goto L20
        L18:
            com.google.android.gms.measurement.internal.m r0 = com.google.android.gms.measurement.internal.EnumC2791m.MANIFEST
            goto L20
        L1b:
            com.google.android.gms.measurement.internal.m r0 = com.google.android.gms.measurement.internal.EnumC2791m.API
            goto L20
        L1e:
            com.google.android.gms.measurement.internal.m r0 = com.google.android.gms.measurement.internal.EnumC2791m.TCF
        L20:
            java.util.EnumMap<com.google.android.gms.measurement.internal.q3$a, com.google.android.gms.measurement.internal.m> r4 = r2.f35471a
            r4.put(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2798n.c(com.google.android.gms.measurement.internal.q3$a, int):void");
    }

    public final void d(C2823q3.a aVar, EnumC2791m enumC2791m) {
        this.f35471a.put((EnumMap<C2823q3.a, EnumC2791m>) aVar, (C2823q3.a) enumC2791m);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("1");
        for (C2823q3.a aVar : C2823q3.a.values()) {
            EnumC2791m enumC2791m = this.f35471a.get(aVar);
            if (enumC2791m == null) {
                enumC2791m = EnumC2791m.UNSET;
            }
            sb2.append(enumC2791m.f35456B);
        }
        return sb2.toString();
    }

    private C2798n(EnumMap<C2823q3.a, EnumC2791m> enumMap) {
        EnumMap<C2823q3.a, EnumC2791m> enumMap2 = new EnumMap<>(C2823q3.a.class);
        this.f35471a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
