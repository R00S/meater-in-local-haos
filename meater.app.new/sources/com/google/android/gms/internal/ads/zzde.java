package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.ads.zzbk;
import com.google.android.gms.internal.ads.zzbp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class zzde extends zzdf {

    /* renamed from: I */
    private AdvertisingIdClient.Info f25517I;

    @Override // com.google.android.gms.internal.ads.zzdf, com.google.android.gms.internal.ads.zzdd
    /* renamed from: b */
    protected final zzbp.zza.C11479zza mo19224b(Context context, View view, Activity activity) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdf
    /* renamed from: h */
    protected final void mo19248h(zzdy zzdyVar, Context context, zzbp.zza.C11479zza c11479zza, zzbk.zza zzaVar) throws InterruptedException {
        if (!zzdyVar.f26020n) {
            zzdf.m19312i(mo19249k(zzdyVar, context, c11479zza, zzaVar));
            return;
        }
        AdvertisingIdClient.Info info = this.f25517I;
        if (info != null) {
            String id = info.getId();
            if (!TextUtils.isEmpty(id)) {
                c11479zza.m18055C(zzef.m19921e(id));
                c11479zza.m18073T(zzbp.zza.zzc.DEVICE_IDENTIFIER_ANDROID_AD_ID);
                c11479zza.m18076X(this.f25517I.isLimitAdTrackingEnabled());
            }
            this.f25517I = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdf
    /* renamed from: k */
    protected final List<Callable<Void>> mo19249k(zzdy zzdyVar, Context context, zzbp.zza.C11479zza c11479zza, zzbk.zza zzaVar) {
        ArrayList arrayList = new ArrayList();
        if (zzdyVar.m19908r() == null) {
            return arrayList;
        }
        arrayList.add(new zzes(zzdyVar, "3pegtvj7nkb7e3rwh5b+3dnQATJj6aqtaosJ3DkOYPzNGN2w+CoarbJEsY1UQgeA", "/kRTFQbKQx44ublaFMNQ8yNL6QxOrgEofiWDpZSH6zA=", c11479zza, zzdyVar.m19907q(), 24));
        return arrayList;
    }
}
