package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

@zzard
/* loaded from: classes2.dex */
public final class zzabk extends RemoteCreator<zzaae> {
    public zzabk() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    /* renamed from: a */
    protected final /* synthetic */ zzaae mo14396a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return iInterfaceQueryLocalInterface instanceof zzaae ? (zzaae) iInterfaceQueryLocalInterface : new zzaaf(iBinder);
    }

    /* renamed from: c */
    public final zzaab m16326c(Context context) {
        try {
            IBinder iBinderMo16184C6 = m14710b(context).mo16184C6(ObjectWrapper.m14708E0(context), 15000000);
            if (iBinderMo16184C6 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderMo16184C6.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof zzaab ? (zzaab) iInterfaceQueryLocalInterface : new zzaad(iBinderMo16184C6);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
            zzbad.m17348d("Could not get remote MobileAdsSettingManager.", e2);
            return null;
        }
    }
}
