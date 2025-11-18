package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2488h0 extends AbstractC2560q0 {

    /* renamed from: a, reason: collision with root package name */
    private String f34134a;

    /* renamed from: b, reason: collision with root package name */
    private EnumC2583t0 f34135b;

    /* renamed from: c, reason: collision with root package name */
    private EnumC2575s0 f34136c;

    /* renamed from: d, reason: collision with root package name */
    private byte f34137d;

    C2488h0() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2560q0
    public final AbstractC2560q0 a(EnumC2575s0 enumC2575s0) {
        if (enumC2575s0 == null) {
            throw new NullPointerException("Null filePurpose");
        }
        this.f34136c = enumC2575s0;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2560q0
    final AbstractC2560q0 b(EnumC2583t0 enumC2583t0) {
        if (enumC2583t0 == null) {
            throw new NullPointerException("Null fileChecks");
        }
        this.f34135b = enumC2583t0;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2560q0
    public final AbstractC2560q0 c(boolean z10) {
        this.f34137d = (byte) (this.f34137d | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2560q0
    public final AbstractC2567r0 d() {
        if (this.f34137d == 1 && this.f34134a != null && this.f34135b != null && this.f34136c != null) {
            return new C2496i0(this.f34134a, this.f34135b, this.f34136c);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f34134a == null) {
            sb2.append(" fileOwner");
        }
        if ((1 & this.f34137d) == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if (this.f34135b == null) {
            sb2.append(" fileChecks");
        }
        if (this.f34136c == null) {
            sb2.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:" + String.valueOf(sb2));
    }

    public final AbstractC2560q0 e(String str) {
        this.f34134a = str;
        return this;
    }
}
