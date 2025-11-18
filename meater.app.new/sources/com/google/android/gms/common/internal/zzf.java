package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzf extends AbstractC6426i {

    /* renamed from: g */
    public final IBinder f17854g;

    /* renamed from: h */
    final /* synthetic */ BaseGmsClient f17855h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(BaseGmsClient baseGmsClient, int i2, IBinder iBinder, Bundle bundle) {
        super(baseGmsClient, i2, bundle);
        this.f17855h = baseGmsClient;
        this.f17854g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6426i
    /* renamed from: f */
    protected final void mo14404f(ConnectionResult connectionResult) {
        if (this.f17855h.zzx != null) {
            this.f17855h.zzx.mo14286E0(connectionResult);
        }
        this.f17855h.onConnectionFailed(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.AbstractC6426i
    /* renamed from: g */
    protected final boolean mo14405g() throws RemoteException {
        try {
            IBinder iBinder = this.f17854g;
            Preconditions.m14372k(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f17855h.getServiceDescriptor().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + this.f17855h.getServiceDescriptor() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceCreateServiceInterface = this.f17855h.createServiceInterface(this.f17854g);
            if (iInterfaceCreateServiceInterface == null || !(BaseGmsClient.zzn(this.f17855h, 2, 4, iInterfaceCreateServiceInterface) || BaseGmsClient.zzn(this.f17855h, 3, 4, iInterfaceCreateServiceInterface))) {
                return false;
            }
            this.f17855h.zzB = null;
            Bundle connectionHint = this.f17855h.getConnectionHint();
            BaseGmsClient baseGmsClient = this.f17855h;
            if (baseGmsClient.zzw == null) {
                return true;
            }
            baseGmsClient.zzw.mo14285P(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
