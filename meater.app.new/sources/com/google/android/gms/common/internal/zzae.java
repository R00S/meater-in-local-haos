package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public abstract class zzae extends zzb implements zzaf {
    /* renamed from: P */
    public static zzaf m14499P(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return iInterfaceQueryLocalInterface instanceof zzaf ? (zzaf) iInterfaceQueryLocalInterface : new zzad(iBinder);
    }
}
