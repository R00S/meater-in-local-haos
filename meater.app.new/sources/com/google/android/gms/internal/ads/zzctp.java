package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzctp implements zzcva<zzcto> {

    /* renamed from: a */
    private final zzbbl f25059a;

    /* renamed from: b */
    private final zzcxv f25060b;

    /* renamed from: c */
    private final PackageInfo f25061c;

    /* renamed from: d */
    private final zzaxb f25062d;

    public zzctp(zzbbl zzbblVar, zzcxv zzcxvVar, PackageInfo packageInfo, zzaxb zzaxbVar) {
        this.f25059a = zzbblVar;
        this.f25060b = zzcxvVar;
        this.f25061c = packageInfo;
        this.f25062d = zzaxbVar;
    }

    /* renamed from: a */
    final /* synthetic */ void m18977a(ArrayList arrayList, Bundle bundle) {
        JSONArray jSONArrayOptJSONArray;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", this.f25060b.f25297h);
        String str = "landscape";
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21673N2)).booleanValue() && this.f25060b.f25298i.f21961f > 3) {
            bundle.putBoolean("enable_native_media_orientation", true);
            int i2 = this.f25060b.f25298i.f21968m;
            String str2 = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "unknown" : "square" : "portrait" : "landscape" : "any";
            if (!"unknown".equals(str2)) {
                bundle.putString("native_media_orientation", str2);
            }
        }
        int i3 = this.f25060b.f25298i.f21963h;
        if (i3 == 0) {
            str = "any";
        } else if (i3 == 1) {
            str = "portrait";
        } else if (i3 != 2) {
            str = "unknown";
        }
        if (!"unknown".equals(str)) {
            bundle.putString("native_image_orientation", str);
        }
        bundle.putBoolean("native_multiple_images", this.f25060b.f25298i.f21964i);
        bundle.putBoolean("use_custom_mute", this.f25060b.f25298i.f21967l);
        PackageInfo packageInfo = this.f25061c;
        int i4 = packageInfo == null ? 0 : packageInfo.versionCode;
        if (i4 > this.f25062d.mo17105s()) {
            this.f25062d.mo17111y();
            this.f25062d.mo17091e(i4);
        }
        JSONObject jSONObjectMo17087a = this.f25062d.mo17087a();
        String string = (jSONObjectMo17087a == null || (jSONArrayOptJSONArray = jSONObjectMo17087a.optJSONArray(this.f25060b.f25295f)) == null) ? null : jSONArrayOptJSONArray.toString();
        if (!TextUtils.isEmpty(string)) {
            bundle.putString("native_advanced_settings", string);
        }
        int i5 = this.f25060b.f25301l;
        if (i5 > 1) {
            bundle.putInt("max_num_ads", i5);
        }
        zzaiy zzaiyVar = this.f25060b.f25292c;
        if (zzaiyVar != null) {
            int i6 = zzaiyVar.f22067f;
            String str3 = "l";
            if (i6 != 1) {
                if (i6 != 2) {
                    StringBuilder sb = new StringBuilder(52);
                    sb.append("Instream ad video aspect ratio ");
                    sb.append(i6);
                    sb.append(" is wrong.");
                    zzbad.m17351g(sb.toString());
                } else {
                    str3 = "p";
                }
            }
            bundle.putString("ia_var", str3);
            bundle.putBoolean("instr", true);
        }
        if (this.f25060b.m19024a() != null) {
            bundle.putBoolean("has_delayed_banner_listener", true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<zzcto> mo14982b() {
        return this.f25059a.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.ko

            /* renamed from: f */
            private final zzctp f19719f;

            {
                this.f19719f = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f19719f.m18978c();
            }
        });
    }

    /* renamed from: c */
    final /* synthetic */ zzcto m18978c() throws Exception {
        final ArrayList<String> arrayList = this.f25060b.f25296g;
        return arrayList == null ? C6902lo.f19847a : arrayList.isEmpty() ? C6939mo.f19934a : new zzcto(this, arrayList) { // from class: com.google.android.gms.internal.ads.no

            /* renamed from: a */
            private final zzctp f20100a;

            /* renamed from: b */
            private final ArrayList f20101b;

            {
                this.f20100a = this;
                this.f20101b = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.zzcuz
            /* renamed from: a */
            public final void mo15076a(Bundle bundle) {
                this.f20100a.m18977a(this.f20101b, bundle);
            }
        };
    }
}
