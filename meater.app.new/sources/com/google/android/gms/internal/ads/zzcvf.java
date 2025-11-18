package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class zzcvf implements zzcuz<Bundle> {

    /* renamed from: a */
    private final boolean f25130a;

    /* renamed from: b */
    private final boolean f25131b;

    /* renamed from: c */
    private final String f25132c;

    /* renamed from: d */
    private final boolean f25133d;

    /* renamed from: e */
    private final boolean f25134e;

    /* renamed from: f */
    private final boolean f25135f;

    /* renamed from: g */
    private final String f25136g;

    /* renamed from: h */
    private final String f25137h;

    /* renamed from: i */
    private final String f25138i;

    /* renamed from: j */
    private final String f25139j;

    /* renamed from: k */
    private final boolean f25140k;

    /* renamed from: l */
    private final String f25141l;

    public zzcvf(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, String str3, String str4, String str5, boolean z6, String str6) {
        this.f25130a = z;
        this.f25131b = z2;
        this.f25132c = str;
        this.f25133d = z3;
        this.f25134e = z4;
        this.f25135f = z5;
        this.f25136g = str2;
        this.f25137h = str3;
        this.f25138i = str4;
        this.f25139j = str5;
        this.f25140k = z6;
        this.f25141l = str6;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    /* renamed from: a */
    public final /* synthetic */ void mo15076a(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putBoolean("cog", this.f25130a);
        bundle2.putBoolean("coh", this.f25131b);
        bundle2.putString("gl", this.f25132c);
        bundle2.putBoolean("simulator", this.f25133d);
        bundle2.putBoolean("is_latchsky", this.f25134e);
        bundle2.putBoolean("is_sidewinder", this.f25135f);
        bundle2.putString("hl", this.f25136g);
        bundle2.putString("mv", this.f25137h);
        bundle2.putString("submodel", this.f25141l);
        Bundle bundleM19059a = zzcxz.m19059a(bundle2, "device");
        bundle2.putBundle("device", bundleM19059a);
        bundleM19059a.putString("build", this.f25139j);
        Bundle bundleM19059a2 = zzcxz.m19059a(bundleM19059a, "browser");
        bundleM19059a.putBundle("browser", bundleM19059a2);
        bundleM19059a2.putBoolean("is_browser_custom_tabs_capable", this.f25140k);
        if (TextUtils.isEmpty(this.f25138i)) {
            return;
        }
        Bundle bundleM19059a3 = zzcxz.m19059a(bundleM19059a, "play_store");
        bundleM19059a.putBundle("play_store", bundleM19059a3);
        bundleM19059a3.putString("package_version", this.f25138i);
    }
}
