package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
final class A5 implements InterfaceC2501i5 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2517k5 f33655a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33656b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f33657c;

    /* renamed from: d, reason: collision with root package name */
    private final int f33658d;

    A5(InterfaceC2517k5 interfaceC2517k5, String str, Object[] objArr) {
        this.f33655a = interfaceC2517k5;
        this.f33656b = str;
        this.f33657c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f33658d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f33658d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2501i5
    public final InterfaceC2517k5 a() {
        return this.f33655a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2501i5
    public final EnumC2636z5 b() {
        int i10 = this.f33658d;
        return (i10 & 1) != 0 ? EnumC2636z5.PROTO2 : (i10 & 4) == 4 ? EnumC2636z5.EDITIONS : EnumC2636z5.PROTO3;
    }

    final String c() {
        return this.f33656b;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2501i5
    public final boolean d() {
        return (this.f33658d & 2) == 2;
    }

    final Object[] e() {
        return this.f33657c;
    }
}
