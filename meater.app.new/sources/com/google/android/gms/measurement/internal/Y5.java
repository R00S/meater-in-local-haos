package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final class Y5 extends AbstractC2873x5 {

    /* renamed from: d, reason: collision with root package name */
    private String f35234d;

    /* renamed from: e, reason: collision with root package name */
    private Set<Integer> f35235e;

    /* renamed from: f, reason: collision with root package name */
    private Map<Integer, a6> f35236f;

    /* renamed from: g, reason: collision with root package name */
    private Long f35237g;

    /* renamed from: h, reason: collision with root package name */
    private Long f35238h;

    Y5(C2880y5 c2880y5) {
        super(c2880y5);
    }

    private final boolean B(int i10, int i11) {
        a6 a6Var = this.f35236f.get(Integer.valueOf(i10));
        if (a6Var == null) {
            return false;
        }
        return a6Var.f35267d.get(i11);
    }

    private final a6 z(Integer num) {
        if (this.f35236f.containsKey(num)) {
            return this.f35236f.get(num);
        }
        a6 a6Var = new a6(this, this.f35234d);
        this.f35236f.put(num, a6Var);
        return a6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x05dd, code lost:
    
        r7 = k().M();
        r8 = com.google.android.gms.measurement.internal.C2759h2.w(r52.f35234d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x05ef, code lost:
    
        if (r9.S() == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x05f1, code lost:
    
        r9 = java.lang.Integer.valueOf(r9.n());
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x05fa, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x05fb, code lost:
    
        r7.c("Invalid property filter ID. appId, id", r8, java.lang.String.valueOf(r9));
        r9 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.util.List<com.google.android.gms.internal.measurement.C2554p2> A(java.lang.String r53, java.util.List<com.google.android.gms.internal.measurement.C2569r2> r54, java.util.List<com.google.android.gms.internal.measurement.B2> r55, java.lang.Long r56, java.lang.Long r57, boolean r58) {
        /*
            Method dump skipped, instructions count: 1710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Y5.A(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.List");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2873x5
    protected final boolean y() {
        return false;
    }
}
