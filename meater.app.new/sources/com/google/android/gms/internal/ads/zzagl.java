package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import java.util.HashMap;

@zzard
/* loaded from: classes2.dex */
public final class zzagl extends RemoteCreator<zzaeu> {
    @VisibleForTesting
    public zzagl() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    /* renamed from: a */
    protected final /* synthetic */ zzaeu mo14396a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof zzaeu ? (zzaeu) iInterfaceQueryLocalInterface : new zzaev(iBinder);
    }

    /* renamed from: c */
    public final zzaer m16560c(View view, HashMap<String, View> map, HashMap<String, View> map2) {
        try {
            IBinder iBinderMo16477y5 = m14710b(view.getContext()).mo16477y5(ObjectWrapper.m14708E0(view), ObjectWrapper.m14708E0(map), ObjectWrapper.m14708E0(map2));
            if (iBinderMo16477y5 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderMo16477y5.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return iInterfaceQueryLocalInterface instanceof zzaer ? (zzaer) iInterfaceQueryLocalInterface : new zzaet(iBinderMo16477y5);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
            zzbad.m17348d("Could not create remote NativeAdViewHolderDelegate.", e2);
            return null;
        }
    }
}
