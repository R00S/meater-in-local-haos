package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

@zzard
/* loaded from: classes2.dex */
public final class zzatf extends RemoteCreator<zzasz> {
    public zzatf() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    /* renamed from: a */
    protected final /* synthetic */ zzasz mo14396a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        return iInterfaceQueryLocalInterface instanceof zzasz ? (zzasz) iInterfaceQueryLocalInterface : new zzata(iBinder);
    }

    /* renamed from: c */
    public final zzasw m16937c(Context context, zzamp zzampVar) {
        try {
            IBinder iBinderMo16930V5 = m14710b(context).mo16930V5(ObjectWrapper.m14708E0(context), zzampVar, 15000000);
            if (iBinderMo16930V5 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderMo16930V5.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            return iInterfaceQueryLocalInterface instanceof zzasw ? (zzasw) iInterfaceQueryLocalInterface : new zzasy(iBinderMo16930V5);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
            zzbad.m17348d("Could not get remote RewardedVideoAd.", e2);
            return null;
        }
    }
}
