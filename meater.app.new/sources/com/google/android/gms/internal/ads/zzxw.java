package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

@zzard
/* loaded from: classes2.dex */
public final class zzxw extends RemoteCreator<zzzi> {
    public zzxw() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    /* renamed from: a */
    protected final /* synthetic */ zzzi mo14396a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return iInterfaceQueryLocalInterface instanceof zzzi ? (zzzi) iInterfaceQueryLocalInterface : new zzzj(iBinder);
    }

    /* renamed from: c */
    public final zzzf m20815c(Context context, String str, zzamp zzampVar) {
        try {
            IBinder iBinderMo20854i6 = m14710b(context).mo20854i6(ObjectWrapper.m14708E0(context), str, zzampVar, 15000000);
            if (iBinderMo20854i6 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderMo20854i6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof zzzf ? (zzzf) iInterfaceQueryLocalInterface : new zzzh(iBinderMo20854i6);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
            zzbad.m17348d("Could not create remote builder for AdLoader.", e2);
            return null;
        }
    }
}
