package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public final class zzaqu extends zzfn implements zzaqt {
    /* renamed from: h7 */
    public static zzaqt m16880h7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        return iInterfaceQueryLocalInterface instanceof zzaqt ? (zzaqt) iInterfaceQueryLocalInterface : new zzaqv(iBinder);
    }
}
