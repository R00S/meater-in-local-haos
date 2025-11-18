package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class zzdai extends zzfn implements zzdah {
    /* renamed from: h7 */
    public static zzdah m19145h7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.omid.IOmid");
        return iInterfaceQueryLocalInterface instanceof zzdah ? (zzdah) iInterfaceQueryLocalInterface : new zzdaj(iBinder);
    }
}
