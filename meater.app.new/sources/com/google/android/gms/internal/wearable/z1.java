package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
final class z1 extends F1 {

    /* renamed from: b, reason: collision with root package name */
    private final String f34722b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34723c;

    /* renamed from: d, reason: collision with root package name */
    private final int f34724d;

    /* synthetic */ z1(String str, boolean z10, int i10, InterfaceC2696u0 interfaceC2696u0, V0 v02, int i11, y1 y1Var) {
        this.f34722b = str;
        this.f34723c = i10;
        this.f34724d = i11;
    }

    @Override // com.google.android.gms.internal.wearable.F1
    public final InterfaceC2696u0 a() {
        return null;
    }

    @Override // com.google.android.gms.internal.wearable.F1
    public final V0 b() {
        return null;
    }

    @Override // com.google.android.gms.internal.wearable.F1
    public final String c() {
        return this.f34722b;
    }

    @Override // com.google.android.gms.internal.wearable.F1
    public final boolean d() {
        return false;
    }

    @Override // com.google.android.gms.internal.wearable.F1
    public final int e() {
        return this.f34723c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F1) {
            F1 f12 = (F1) obj;
            if (this.f34722b.equals(f12.c())) {
                f12.d();
                int i10 = this.f34723c;
                int iE = f12.e();
                if (i10 == 0) {
                    throw null;
                }
                if (i10 == iE) {
                    f12.a();
                    f12.b();
                    int i11 = this.f34724d;
                    int iF = f12.f();
                    if (i11 == 0) {
                        throw null;
                    }
                    if (iF == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.wearable.F1
    public final int f() {
        return this.f34724d;
    }

    public final int hashCode() {
        int iHashCode = this.f34722b.hashCode() ^ 1000003;
        int i10 = this.f34723c;
        if (i10 == 0) {
            throw null;
        }
        int i11 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i10;
        if (this.f34724d != 0) {
            return (i11 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i10 = this.f34723c;
        String str = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        String str2 = this.f34724d == 1 ? "READ_AND_WRITE" : "null";
        return "FileComplianceOptions{fileOwner=" + this.f34722b + ", hasDifferentDmaOwner=false, fileChecks=" + str + ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + str2 + "}";
    }
}
