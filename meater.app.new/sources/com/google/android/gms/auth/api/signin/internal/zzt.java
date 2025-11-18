package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public abstract class zzt extends com.google.android.gms.internal.p475authapi.zzd implements zzs {
    public zzt() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.p475authapi.zzd
    /* renamed from: H */
    protected final boolean mo13739H(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 101:
                mo13722G2((GoogleSignInAccount) com.google.android.gms.internal.p475authapi.zze.m20871a(parcel, GoogleSignInAccount.CREATOR), (Status) com.google.android.gms.internal.p475authapi.zze.m20871a(parcel, Status.CREATOR));
                break;
            case 102:
                mo13720g1((Status) com.google.android.gms.internal.p475authapi.zze.m20871a(parcel, Status.CREATOR));
                break;
            case 103:
                mo13721Q1((Status) com.google.android.gms.internal.p475authapi.zze.m20871a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
