package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
final class e30 implements zzqw {

    /* renamed from: a */
    private final int f18725a;

    /* renamed from: b */
    private final /* synthetic */ x20 f18726b;

    public e30(x20 x20Var, int i2) {
        this.f18726b = x20Var;
        this.f18725a = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzqw
    /* renamed from: B */
    public final boolean mo15099B() {
        return this.f18726b.m16031v(this.f18725a);
    }

    @Override // com.google.android.gms.internal.ads.zzqw
    /* renamed from: a */
    public final void mo15100a() throws IOException {
        this.f18726b.m16023H();
    }

    @Override // com.google.android.gms.internal.ads.zzqw
    /* renamed from: b */
    public final void mo15101b(long j2) {
        this.f18726b.m16022C(this.f18725a, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzqw
    /* renamed from: c */
    public final int mo15102c(zzlj zzljVar, zznd zzndVar, boolean z) {
        return this.f18726b.m16030q(this.f18725a, zzljVar, zzndVar, z);
    }
}
