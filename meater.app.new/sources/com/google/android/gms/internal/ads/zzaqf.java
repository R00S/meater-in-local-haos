package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

@zzard
/* loaded from: classes2.dex */
public final class zzaqf extends RemoteCreator<zzaqj> {
    public zzaqf() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    /* renamed from: a */
    protected final /* synthetic */ zzaqj mo14396a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof zzaqj ? (zzaqj) iInterfaceQueryLocalInterface : new zzaqk(iBinder);
    }

    /* renamed from: c */
    public final zzaqg m16876c(Activity activity) {
        try {
            IBinder iBinderMo16877w5 = m14710b(activity).mo16877w5(ObjectWrapper.m14708E0(activity));
            if (iBinderMo16877w5 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderMo16877w5.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return iInterfaceQueryLocalInterface instanceof zzaqg ? (zzaqg) iInterfaceQueryLocalInterface : new zzaqi(iBinderMo16877w5);
        } catch (RemoteException e2) {
            zzbad.m17348d("Could not create remote AdOverlay.", e2);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e3) {
            zzbad.m17348d("Could not create remote AdOverlay.", e3);
            return null;
        }
    }
}
