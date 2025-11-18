package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class f20 implements d20 {

    /* renamed from: a */
    private final int f18847a;

    /* renamed from: b */
    private final int f18848b;

    /* renamed from: c */
    private final zzst f18849c;

    public f20(a20 a20Var) {
        zzst zzstVar = a20Var.f18072Q0;
        this.f18849c = zzstVar;
        zzstVar.m20510k(12);
        this.f18847a = zzstVar.m20518s();
        this.f18848b = zzstVar.m20518s();
    }

    @Override // com.google.android.gms.internal.ads.d20
    /* renamed from: a */
    public final boolean mo15022a() {
        return this.f18847a != 0;
    }

    @Override // com.google.android.gms.internal.ads.d20
    /* renamed from: b */
    public final int mo15023b() {
        return this.f18848b;
    }

    @Override // com.google.android.gms.internal.ads.d20
    /* renamed from: c */
    public final int mo15024c() {
        int i2 = this.f18847a;
        return i2 == 0 ? this.f18849c.m20518s() : i2;
    }
}
