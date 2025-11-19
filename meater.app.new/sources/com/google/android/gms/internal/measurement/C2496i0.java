package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2496i0 extends AbstractC2567r0 {

    /* renamed from: c, reason: collision with root package name */
    private final String f34149c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f34150d;

    /* renamed from: e, reason: collision with root package name */
    private final EnumC2583t0 f34151e;

    /* renamed from: f, reason: collision with root package name */
    private final EnumC2575s0 f34152f;

    @Override // com.google.android.gms.internal.measurement.AbstractC2567r0
    public final InterfaceC2480g0 a() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2567r0
    public final InterfaceC2472f0 b() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2567r0
    public final EnumC2583t0 c() {
        return this.f34151e;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2567r0
    public final EnumC2575s0 d() {
        return this.f34152f;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2567r0
    public final String e() {
        return this.f34149c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2567r0) {
            AbstractC2567r0 abstractC2567r0 = (AbstractC2567r0) obj;
            if (this.f34149c.equals(abstractC2567r0.e()) && this.f34150d == abstractC2567r0.f() && this.f34151e.equals(abstractC2567r0.c())) {
                abstractC2567r0.a();
                abstractC2567r0.b();
                if (this.f34152f.equals(abstractC2567r0.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2567r0
    public final boolean f() {
        return this.f34150d;
    }

    public final int hashCode() {
        return ((((((this.f34149c.hashCode() ^ 1000003) * 1000003) ^ (this.f34150d ? 1231 : 1237)) * 1000003) ^ this.f34151e.hashCode()) * 583896283) ^ this.f34152f.hashCode();
    }

    public final String toString() {
        return "FileComplianceOptions{fileOwner=" + this.f34149c + ", hasDifferentDmaOwner=" + this.f34150d + ", fileChecks=" + String.valueOf(this.f34151e) + ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + String.valueOf(this.f34152f) + "}";
    }

    private C2496i0(String str, boolean z10, EnumC2583t0 enumC2583t0, InterfaceC2480g0 interfaceC2480g0, InterfaceC2472f0 interfaceC2472f0, EnumC2575s0 enumC2575s0) {
        this.f34149c = str;
        this.f34150d = z10;
        this.f34151e = enumC2583t0;
        this.f34152f = enumC2575s0;
    }
}
