package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public abstract class zzcmn<AdT> implements zzcjv<AdT> {
    /* renamed from: d */
    private static Bundle m18880d(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    /* renamed from: a */
    public final zzbbh<AdT> mo18846a(zzcxu zzcxuVar, zzcxm zzcxmVar) {
        String strOptString = zzcxmVar.f25261s.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, HttpUrl.FRAGMENT_ENCODE_SET);
        zzcxv zzcxvVar = zzcxuVar.f25288a.f25282a;
        zzcxx zzcxxVarM19054t = new zzcxx().m19057w(zzcxvVar.f25293d).m19051n(zzcxvVar.f25294e).m19052o(zzcxvVar.f25290a).m19054t(zzcxvVar.f25295f).m19049k(zzcxvVar.f25291b).m19047h(zzcxvVar.f25296g).m19050l(zzcxvVar.f25297h).m19045f(zzcxvVar.f25298i).m19055u(zzcxvVar.f25299j).m19044e(zzcxvVar.f25302m).m19056v(zzcxvVar.f25300k).m19054t(strOptString);
        Bundle bundleM18880d = m18880d(zzcxvVar.f25293d.f27414r);
        Bundle bundleM18880d2 = m18880d(bundleM18880d.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        bundleM18880d2.putInt("gw", 1);
        String strOptString2 = zzcxmVar.f25261s.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundleM18880d2.putString("mad_hac", strOptString2);
        }
        String strOptString3 = zzcxmVar.f25261s.optString("adJson", null);
        if (strOptString3 != null) {
            bundleM18880d2.putString("_ad", strOptString3);
        }
        bundleM18880d2.putBoolean("_noRefresh", true);
        Iterator<String> itKeys = zzcxmVar.f25228A.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = zzcxmVar.f25228A.optString(next, null);
            if (next != null) {
                bundleM18880d2.putString(next, strOptString4);
            }
        }
        bundleM18880d.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundleM18880d2);
        zzxz zzxzVar = zzcxvVar.f25293d;
        zzcxv zzcxvVarM19043d = zzcxxVarM19054t.m19057w(new zzxz(zzxzVar.f27402f, zzxzVar.f27403g, bundleM18880d2, zzxzVar.f27405i, zzxzVar.f27406j, zzxzVar.f27407k, zzxzVar.f27408l, zzxzVar.f27409m, zzxzVar.f27410n, zzxzVar.f27411o, zzxzVar.f27412p, zzxzVar.f27413q, bundleM18880d, zzxzVar.f27415s, zzxzVar.f27416t, zzxzVar.f27417u, zzxzVar.f27418v, zzxzVar.f27419w, zzxzVar.f27420x, zzxzVar.f27421y, zzxzVar.f27422z)).m19043d();
        Bundle bundle = new Bundle();
        zzcxo zzcxoVar = zzcxuVar.f25289b.f25284b;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(zzcxoVar.f25272a));
        bundle2.putInt("refresh_interval", zzcxoVar.f25274c);
        bundle2.putString("gws_query_id", zzcxoVar.f25273b);
        bundle.putBundle("parent_common_config", bundle2);
        String str = zzcxuVar.f25288a.f25282a.f25295f;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", zzcxmVar.f25262t);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(zzcxmVar.f25245c));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(zzcxmVar.f25246d));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzcxmVar.f25256n));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(zzcxmVar.f25255m));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(zzcxmVar.f25249g));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(zzcxmVar.f25250h));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(zzcxmVar.f25251i));
        bundle3.putString("transaction_id", zzcxmVar.f25252j);
        bundle3.putString("valid_from_timestamp", zzcxmVar.f25253k);
        bundle3.putBoolean("is_closable_area_disabled", zzcxmVar.f25234G);
        if (zzcxmVar.f25254l != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzcxmVar.f25254l.f22517g);
            bundle4.putString("rb_type", zzcxmVar.f25254l.f22516f);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return mo18879c(zzcxvVarM19043d, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    /* renamed from: b */
    public final boolean mo18847b(zzcxu zzcxuVar, zzcxm zzcxmVar) {
        return !TextUtils.isEmpty(zzcxmVar.f25261s.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, HttpUrl.FRAGMENT_ENCODE_SET));
    }

    /* renamed from: c */
    protected abstract zzbbh<AdT> mo18879c(zzcxv zzcxvVar, Bundle bundle);
}
