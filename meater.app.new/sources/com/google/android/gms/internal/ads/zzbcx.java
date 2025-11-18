package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.Arrays;
import java.util.List;

@zzard
/* loaded from: classes2.dex */
public final class zzbcx extends zzbcp {
    @Override // com.google.android.gms.internal.ads.zzbcp
    /* renamed from: a */
    public final zzbco mo17432a(Context context, zzbdf zzbdfVar, int i2, boolean z, zzadi zzadiVar, zzbde zzbdeVar) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (!(PlatformVersion.m14637a() && (applicationInfo == null || applicationInfo.targetSdkVersion >= 11))) {
            return null;
        }
        zzbdg zzbdgVar = new zzbdg(context, zzbdfVar.mo14899b(), zzbdfVar.mo14928r(), zzadiVar, zzbdfVar.mo14888P());
        if (Build.VERSION.SDK_INT >= 16 && i2 == 2) {
            List listAsList = Arrays.asList(zzbdeVar.f22844e.split(","));
            if (listAsList.contains("3")) {
                return new zzbek(context, zzbdgVar, zzbdfVar, z, zzbcp.m17431b(zzbdfVar), zzbdeVar);
            }
            if (listAsList.contains("1")) {
                return new zzbdq(context, zzbdgVar, zzbdfVar, i2, z, zzbcp.m17431b(zzbdfVar), zzbdeVar);
            }
        }
        return new zzbcd(context, z, zzbcp.m17431b(zzbdfVar), zzbdeVar, new zzbdg(context, zzbdfVar.mo14899b(), zzbdfVar.mo14928r(), zzadiVar, zzbdfVar.mo14888P()));
    }
}
