package com.google.android.gms.measurement.internal;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p024c.p041e.C0867a;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.u7 */
/* loaded from: classes2.dex */
final class C7838u7 {

    /* renamed from: a */
    private String f28940a;

    /* renamed from: b */
    private Set<Integer> f28941b = new HashSet();

    /* renamed from: c */
    private Map<Integer, C7811r7> f28942c = new C0867a();

    /* renamed from: d */
    private final /* synthetic */ C7802q7 f28943d;

    C7838u7(C7802q7 c7802q7, String str) {
        this.f28943d = c7802q7;
        this.f28940a = str;
    }

    /* renamed from: a */
    private final C7811r7 m22860a(int i2) {
        if (this.f28942c.containsKey(Integer.valueOf(i2))) {
            return this.f28942c.get(Integer.valueOf(i2));
        }
        C7811r7 c7811r7 = new C7811r7(this.f28943d, this.f28940a, null);
        this.f28942c.put(Integer.valueOf(i2), c7811r7);
        return c7811r7;
    }

    /* renamed from: c */
    private final boolean m22861c(int i2, int i3) {
        if (this.f28942c.get(Integer.valueOf(i2)) == null) {
            return false;
        }
        return this.f28942c.get(Integer.valueOf(i2)).f28887c.get(i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x076e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0250  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.util.List<com.google.android.gms.internal.measurement.zzbr.zza> m22862b(java.util.List<com.google.android.gms.internal.measurement.zzbr.zzc> r62, java.util.List<com.google.android.gms.internal.measurement.zzbr.zzk> r63, java.lang.Long r64) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2121
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7838u7.m22862b(java.util.List, java.util.List, java.lang.Long):java.util.List");
    }
}
