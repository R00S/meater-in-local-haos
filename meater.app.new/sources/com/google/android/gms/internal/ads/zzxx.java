package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

@zzard
/* loaded from: classes2.dex */
public final class zzxx extends RemoteCreator<zzzn> {
    @VisibleForTesting
    public zzxx() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    /* renamed from: a */
    protected final /* synthetic */ zzzn mo14396a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof zzzn ? (zzzn) iInterfaceQueryLocalInterface : new zzzo(iBinder);
    }

    /* renamed from: c */
    public final zzzk m20816c(Context context, zzyd zzydVar, String str, zzamp zzampVar, int i2) {
        try {
            IBinder iBinderMo20856o5 = m14710b(context).mo20856o5(ObjectWrapper.m14708E0(context), zzydVar, str, zzampVar, 15000000, i2);
            if (iBinderMo20856o5 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderMo20856o5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return iInterfaceQueryLocalInterface instanceof zzzk ? (zzzk) iInterfaceQueryLocalInterface : new zzzm(iBinderMo20856o5);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
            zzbad.m17346b("Could not create remote AdManager.", e2);
            return null;
        }
    }
}
