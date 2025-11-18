package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

@zzard
/* loaded from: classes2.dex */
public final class zzagk extends RemoteCreator<zzaep> {
    @VisibleForTesting
    public zzagk() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    /* renamed from: a */
    protected final /* synthetic */ zzaep mo14396a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof zzaep ? (zzaep) iInterfaceQueryLocalInterface : new zzaeq(iBinder);
    }

    /* renamed from: c */
    public final zzaem m16559c(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder iBinderMo16475t3 = m14710b(context).mo16475t3(ObjectWrapper.m14708E0(context), ObjectWrapper.m14708E0(frameLayout), ObjectWrapper.m14708E0(frameLayout2), 15000000);
            if (iBinderMo16475t3 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderMo16475t3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return iInterfaceQueryLocalInterface instanceof zzaem ? (zzaem) iInterfaceQueryLocalInterface : new zzaeo(iBinderMo16475t3);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
            zzbad.m17348d("Could not create remote NativeAdViewDelegate.", e2);
            return null;
        }
    }
}
