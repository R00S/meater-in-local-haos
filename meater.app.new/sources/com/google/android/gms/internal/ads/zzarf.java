package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;

@zzard
/* loaded from: classes2.dex */
public final class zzarf extends com.google.android.gms.ads.internal.zzc<zzarm> {
    public zzarf(Context context, Looper looper, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        super(zzasq.m16926f(context), looper, 8, baseConnectionCallbacks, baseOnConnectionFailedListener, null);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @VisibleForTesting
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return iInterfaceQueryLocalInterface instanceof zzarm ? (zzarm) iInterfaceQueryLocalInterface : new zzaro(iBinder);
    }

    /* renamed from: e */
    public final zzarm m16891e() throws DeadObjectException {
        return (zzarm) super.getService();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @VisibleForTesting
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @VisibleForTesting
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.START";
    }
}
