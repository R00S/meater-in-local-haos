package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzcro implements zzcuz<Bundle> {

    /* renamed from: a */
    private final zzyd f24975a;

    /* renamed from: b */
    private final String f24976b;

    /* renamed from: c */
    private final boolean f24977c;

    /* renamed from: d */
    private final String f24978d;

    /* renamed from: e */
    private final float f24979e;

    /* renamed from: f */
    private final int f24980f;

    /* renamed from: g */
    private final int f24981g;

    /* renamed from: h */
    private final String f24982h;

    public zzcro(zzyd zzydVar, String str, boolean z, String str2, float f2, int i2, int i3, String str3) {
        Preconditions.m14373l(zzydVar, "the adSize must not be null");
        this.f24975a = zzydVar;
        this.f24976b = str;
        this.f24977c = z;
        this.f24978d = str2;
        this.f24979e = f2;
        this.f24980f = i2;
        this.f24981g = i3;
        this.f24982h = str3;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    /* renamed from: a */
    public final /* synthetic */ void mo15076a(Bundle bundle) {
        Bundle bundle2 = bundle;
        zzcxz.m19064f(bundle2, "smart_w", "full", this.f24975a.f27451j == -1);
        zzcxz.m19064f(bundle2, "smart_h", "auto", this.f24975a.f27448g == -2);
        zzcxz.m19061c(bundle2, "ene", Boolean.TRUE, this.f24975a.f27456o);
        zzcxz.m19063e(bundle2, "format", this.f24976b);
        zzcxz.m19064f(bundle2, "fluid", "height", this.f24977c);
        zzcxz.m19064f(bundle2, "sz", this.f24978d, !TextUtils.isEmpty(r0));
        bundle2.putFloat("u_sd", this.f24979e);
        bundle2.putInt("sw", this.f24980f);
        bundle2.putInt("sh", this.f24981g);
        String str = this.f24982h;
        zzcxz.m19064f(bundle2, "sc", str, true ^ TextUtils.isEmpty(str));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        zzyd[] zzydVarArr = this.f24975a.f27453l;
        if (zzydVarArr == null) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt("height", this.f24975a.f27448g);
            bundle3.putInt("width", this.f24975a.f27451j);
            bundle3.putBoolean("is_fluid_height", this.f24975a.f27455n);
            arrayList.add(bundle3);
        } else {
            for (zzyd zzydVar : zzydVarArr) {
                Bundle bundle4 = new Bundle();
                bundle4.putBoolean("is_fluid_height", zzydVar.f27455n);
                bundle4.putInt("height", zzydVar.f27448g);
                bundle4.putInt("width", zzydVar.f27451j);
                arrayList.add(bundle4);
            }
        }
        bundle2.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
