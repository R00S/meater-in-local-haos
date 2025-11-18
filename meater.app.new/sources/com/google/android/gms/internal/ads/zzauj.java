package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

@zzard
/* loaded from: classes2.dex */
public final class zzauj {
    /* renamed from: a */
    public static zzatt m16962a(Context context, String str, zzamp zzampVar) {
        try {
            IBinder iBinderMo16949L6 = ((zzatz) zzbae.m17356a(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", C7288w3.f20826a)).mo16949L6(ObjectWrapper.m14708E0(context), str, zzampVar, 15000000);
            if (iBinderMo16949L6 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderMo16949L6.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return iInterfaceQueryLocalInterface instanceof zzatt ? (zzatt) iInterfaceQueryLocalInterface : new zzatv(iBinderMo16949L6);
        } catch (RemoteException | zzbag e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
            return null;
        }
    }
}
