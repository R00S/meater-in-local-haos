package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.IAccountAccessor;

/* loaded from: classes2.dex */
public final class zag extends com.google.android.gms.internal.base.zaa implements zaf {
    zag(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.signin.internal.zaf
    /* renamed from: B1 */
    public final void mo23622B1(int i2) throws RemoteException {
        Parcel parcelM20890H = m20890H();
        parcelM20890H.writeInt(i2);
        m20892k0(7, parcelM20890H);
    }

    @Override // com.google.android.gms.signin.internal.zaf
    /* renamed from: V2 */
    public final void mo23623V2(IAccountAccessor iAccountAccessor, int i2, boolean z) throws RemoteException {
        Parcel parcelM20890H = m20890H();
        com.google.android.gms.internal.base.zac.m20895c(parcelM20890H, iAccountAccessor);
        parcelM20890H.writeInt(i2);
        com.google.android.gms.internal.base.zac.m20893a(parcelM20890H, z);
        m20892k0(9, parcelM20890H);
    }

    @Override // com.google.android.gms.signin.internal.zaf
    /* renamed from: n3 */
    public final void mo23624n3(zah zahVar, zad zadVar) throws RemoteException {
        Parcel parcelM20890H = m20890H();
        com.google.android.gms.internal.base.zac.m20896d(parcelM20890H, zahVar);
        com.google.android.gms.internal.base.zac.m20895c(parcelM20890H, zadVar);
        m20892k0(12, parcelM20890H);
    }
}
