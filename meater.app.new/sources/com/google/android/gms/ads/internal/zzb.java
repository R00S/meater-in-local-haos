package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzard;
import com.google.android.gms.internal.ads.zzark;
import com.google.android.gms.internal.ads.zzavb;
import com.google.android.gms.internal.ads.zzaxi;
import java.util.List;
import okhttp3.HttpUrl;

@zzard
/* loaded from: classes2.dex */
public final class zzb {
    private boolean zzbqv;
    private zzavb zzbqw;
    private zzark zzbqx;
    private final Context zzlj;

    public zzb(Context context, zzavb zzavbVar, zzark zzarkVar) {
        this.zzlj = context;
        this.zzbqw = zzavbVar;
        this.zzbqx = null;
        if (0 == 0) {
            this.zzbqx = new zzark();
        }
    }

    private final boolean zzkw() {
        zzavb zzavbVar = this.zzbqw;
        return (zzavbVar != null && zzavbVar.mo16976h().f22550k) || this.zzbqx.f22406f;
    }

    public final void recordClick() {
        this.zzbqv = true;
    }

    public final void zzbk(String str) {
        List<String> list;
        if (zzkw()) {
            if (str == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            zzavb zzavbVar = this.zzbqw;
            if (zzavbVar != null) {
                zzavbVar.mo16969a(str, null, 3);
                return;
            }
            zzark zzarkVar = this.zzbqx;
            if (!zzarkVar.f22406f || (list = zzarkVar.f22407g) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    zzk.zzlg();
                    zzaxi.m17130J(this.zzlj, HttpUrl.FRAGMENT_ENCODE_SET, strReplace);
                }
            }
        }
    }

    public final boolean zzkx() {
        return !zzkw() || this.zzbqv;
    }
}
