package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: classes2.dex */
public final class zzv extends com.google.android.gms.internal.p475authapi.zzc implements zzu {
    zzv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzu
    /* renamed from: B3 */
    public final void mo13740B3(zzs zzsVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel parcelM20869H = m20869H();
        com.google.android.gms.internal.p475authapi.zze.m20872b(parcelM20869H, zzsVar);
        com.google.android.gms.internal.p475authapi.zze.m20873c(parcelM20869H, googleSignInOptions);
        m20870P(103, parcelM20869H);
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzu
    /* renamed from: i3 */
    public final void mo13741i3(zzs zzsVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel parcelM20869H = m20869H();
        com.google.android.gms.internal.p475authapi.zze.m20872b(parcelM20869H, zzsVar);
        com.google.android.gms.internal.p475authapi.zze.m20873c(parcelM20869H, googleSignInOptions);
        m20870P(102, parcelM20869H);
    }
}
