package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class zzcvj implements zzcuz<Bundle> {

    /* renamed from: a */
    private final String f25144a;

    /* renamed from: b */
    private final int f25145b;

    /* renamed from: c */
    private final int f25146c;

    /* renamed from: d */
    private final int f25147d;

    /* renamed from: e */
    private final boolean f25148e;

    /* renamed from: f */
    private final int f25149f;

    public zzcvj(String str, int i2, int i3, int i4, boolean z, int i5) {
        this.f25144a = str;
        this.f25145b = i2;
        this.f25146c = i3;
        this.f25147d = i4;
        this.f25148e = z;
        this.f25149f = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    /* renamed from: a */
    public final /* synthetic */ void mo15076a(Bundle bundle) {
        Bundle bundle2 = bundle;
        zzcxz.m19064f(bundle2, "carrier", this.f25144a, !TextUtils.isEmpty(r0));
        zzcxz.m19062d(bundle2, "cnt", Integer.valueOf(this.f25145b), this.f25145b != -2);
        bundle2.putInt("gnt", this.f25146c);
        bundle2.putInt("pt", this.f25147d);
        Bundle bundleM19059a = zzcxz.m19059a(bundle2, "device");
        bundle2.putBundle("device", bundleM19059a);
        Bundle bundleM19059a2 = zzcxz.m19059a(bundleM19059a, "network");
        bundleM19059a.putBundle("network", bundleM19059a2);
        bundleM19059a2.putInt("active_network_state", this.f25149f);
        bundleM19059a2.putBoolean("active_network_metered", this.f25148e);
    }
}
