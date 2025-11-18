package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzcsc implements zzcuz<Bundle> {

    /* renamed from: a */
    private final int f25006a;

    /* renamed from: b */
    private final boolean f25007b;

    /* renamed from: c */
    private final boolean f25008c;

    /* renamed from: d */
    private final int f25009d;

    /* renamed from: e */
    private final int f25010e;

    /* renamed from: f */
    private final int f25011f;

    /* renamed from: g */
    private final float f25012g;

    /* renamed from: h */
    private final boolean f25013h;

    public zzcsc(int i2, boolean z, boolean z2, int i3, int i4, int i5, float f2, boolean z3) {
        this.f25006a = i2;
        this.f25007b = z;
        this.f25008c = z2;
        this.f25009d = i3;
        this.f25010e = i4;
        this.f25011f = i5;
        this.f25012g = f2;
        this.f25013h = z3;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    /* renamed from: a */
    public final /* synthetic */ void mo15076a(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putInt("am", this.f25006a);
        bundle2.putBoolean("ma", this.f25007b);
        bundle2.putBoolean("sp", this.f25008c);
        bundle2.putInt("muv", this.f25009d);
        bundle2.putInt("rm", this.f25010e);
        bundle2.putInt("riv", this.f25011f);
        bundle2.putFloat("android_app_volume", this.f25012g);
        bundle2.putBoolean("android_app_muted", this.f25013h);
    }
}
