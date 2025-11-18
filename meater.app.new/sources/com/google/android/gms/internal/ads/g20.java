package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class g20 implements d20 {

    /* renamed from: a */
    private final zzst f18933a;

    /* renamed from: b */
    private final int f18934b;

    /* renamed from: c */
    private final int f18935c;

    /* renamed from: d */
    private int f18936d;

    /* renamed from: e */
    private int f18937e;

    public g20(a20 a20Var) {
        zzst zzstVar = a20Var.f18072Q0;
        this.f18933a = zzstVar;
        zzstVar.m20510k(12);
        this.f18935c = zzstVar.m20518s() & 255;
        this.f18934b = zzstVar.m20518s();
    }

    @Override // com.google.android.gms.internal.ads.d20
    /* renamed from: a */
    public final boolean mo15022a() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.d20
    /* renamed from: b */
    public final int mo15023b() {
        return this.f18934b;
    }

    @Override // com.google.android.gms.internal.ads.d20
    /* renamed from: c */
    public final int mo15024c() {
        int i2 = this.f18935c;
        if (i2 == 8) {
            return this.f18933a.m20506g();
        }
        if (i2 == 16) {
            return this.f18933a.m20507h();
        }
        int i3 = this.f18936d;
        this.f18936d = i3 + 1;
        if (i3 % 2 != 0) {
            return this.f18937e & 15;
        }
        int iM20506g = this.f18933a.m20506g();
        this.f18937e = iM20506g;
        return (iM20506g & 240) >> 4;
    }
}
