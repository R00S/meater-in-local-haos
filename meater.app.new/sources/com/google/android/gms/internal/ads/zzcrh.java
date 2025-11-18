package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class zzcrh implements zzcuz<Bundle> {

    /* renamed from: a */
    private final zzcxv f24968a;

    public zzcrh(zzcxv zzcxvVar) {
        Preconditions.m14373l(zzcxvVar, "the targeting must not be null");
        this.f24968a = zzcxvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    /* renamed from: a */
    public final /* synthetic */ void mo15076a(Bundle bundle) {
        Bundle bundle2 = bundle;
        zzcxv zzcxvVar = this.f24968a;
        zzxz zzxzVar = zzcxvVar.f25293d;
        bundle2.putString("slotname", zzcxvVar.f25295f);
        if (this.f24968a.f25304o.contains("new_rewarded")) {
            bundle2.putBoolean("is_new_rewarded", true);
        }
        zzcxz.m19064f(bundle2, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzxzVar.f27403g)), zzxzVar.f27403g != -1);
        zzcxz.m19060b(bundle2, "extras", zzxzVar.f27404h);
        zzcxz.m19062d(bundle2, "cust_gender", Integer.valueOf(zzxzVar.f27405i), zzxzVar.f27405i != -1);
        zzcxz.m19065g(bundle2, "kw", zzxzVar.f27406j);
        zzcxz.m19062d(bundle2, "tag_for_child_directed_treatment", Integer.valueOf(zzxzVar.f27408l), zzxzVar.f27408l != -1);
        boolean z = zzxzVar.f27407k;
        if (z) {
            bundle2.putBoolean("test_request", z);
        }
        zzcxz.m19062d(bundle2, "d_imp_hdr", 1, zzxzVar.f27402f >= 2 && zzxzVar.f27409m);
        String str = zzxzVar.f27410n;
        zzcxz.m19064f(bundle2, "ppid", str, zzxzVar.f27402f >= 2 && !TextUtils.isEmpty(str));
        Location location = zzxzVar.f27412p;
        if (location != null) {
            Float fValueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
            Long lValueOf = Long.valueOf(location.getTime() * 1000);
            Long lValueOf2 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
            Long lValueOf3 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
            Bundle bundle3 = new Bundle();
            bundle3.putFloat("radius", fValueOf.floatValue());
            bundle3.putLong("lat", lValueOf2.longValue());
            bundle3.putLong("long", lValueOf3.longValue());
            bundle3.putLong("time", lValueOf.longValue());
            bundle2.putBundle("uule", bundle3);
        }
        zzcxz.m19063e(bundle2, "url", zzxzVar.f27413q);
        zzcxz.m19060b(bundle2, "custom_targeting", zzxzVar.f27415s);
        zzcxz.m19065g(bundle2, "category_exclusions", zzxzVar.f27416t);
        zzcxz.m19063e(bundle2, "request_agent", zzxzVar.f27417u);
        zzcxz.m19063e(bundle2, "request_pkg", zzxzVar.f27418v);
        zzcxz.m19061c(bundle2, "is_designed_for_families", Boolean.valueOf(zzxzVar.f27419w), zzxzVar.f27402f >= 7);
        if (zzxzVar.f27402f >= 8) {
            zzcxz.m19062d(bundle2, "tag_for_under_age_of_consent", Integer.valueOf(zzxzVar.f27421y), zzxzVar.f27421y != -1);
            zzcxz.m19063e(bundle2, "max_ad_content_rating", zzxzVar.f27422z);
        }
    }
}
