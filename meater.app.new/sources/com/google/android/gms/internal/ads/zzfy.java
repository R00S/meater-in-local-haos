package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class zzfy extends zzfn implements zzfx {
    /* renamed from: h7 */
    public static zzfx m19961h7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return iInterfaceQueryLocalInterface instanceof zzfx ? (zzfx) iInterfaceQueryLocalInterface : new zzfz(iBinder);
    }
}
