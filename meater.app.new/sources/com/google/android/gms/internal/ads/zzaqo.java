package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public final class zzaqo extends zzfn implements zzaqn {
    /* renamed from: h7 */
    public static zzaqn m16879h7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        return iInterfaceQueryLocalInterface instanceof zzaqn ? (zzaqn) iInterfaceQueryLocalInterface : new zzaqp(iBinder);
    }
}
