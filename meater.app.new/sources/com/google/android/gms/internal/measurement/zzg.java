package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public abstract class zzg extends zzc implements zzd {
    /* renamed from: P */
    public static zzd m22315P(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return iInterfaceQueryLocalInterface instanceof zzd ? (zzd) iInterfaceQueryLocalInterface : new zzf(iBinder);
    }
}
