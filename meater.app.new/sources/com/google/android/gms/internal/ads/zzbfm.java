package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.Arrays;
import java.util.List;

@zzard
/* loaded from: classes2.dex */
public final class zzbfm implements zzbgd {
    @Override // com.google.android.gms.internal.ads.zzbgd
    /* renamed from: a */
    public final zzbft mo17616a(zzbdf zzbdfVar, int i2, String str, zzbde zzbdeVar) {
        if (Build.VERSION.SDK_INT >= 16 && i2 > 0) {
            List listAsList = Arrays.asList(zzbdeVar.f22844e.split(","));
            if (listAsList.contains("3")) {
                int iM17580H = zzbfa.m17580H();
                return iM17580H < zzbdeVar.f22847h ? new zzbgp(zzbdfVar, zzbdeVar) : iM17580H < zzbdeVar.f22841b ? new zzbgo(zzbdfVar, zzbdeVar) : new zzbgf(zzbdfVar);
            }
            if (listAsList.contains("1")) {
                int iM17498h = zzbdk.m17498h();
                if (iM17498h < zzbdeVar.f22847h) {
                    if (i2 == 1) {
                        return new zzbgk(zzbdfVar);
                    }
                    if (i2 == 2) {
                        return new zzbgh(zzbdfVar, null);
                    }
                }
                return iM17498h < zzbdeVar.f22841b ? new zzbgg(zzbdfVar, zzbdeVar) : new zzbgf(zzbdfVar);
            }
        }
        return new zzbge(zzbdfVar);
    }
}
