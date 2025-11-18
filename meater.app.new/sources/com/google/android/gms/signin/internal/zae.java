package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public abstract class zae extends com.google.android.gms.internal.base.zab implements zad {
    public zae() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    /* renamed from: E3 */
    protected boolean mo14025E3(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 3) {
            mo23621X4((ConnectionResult) com.google.android.gms.internal.base.zac.m20894b(parcel, ConnectionResult.CREATOR), (zaa) com.google.android.gms.internal.base.zac.m20894b(parcel, zaa.CREATOR));
        } else if (i2 == 4) {
            mo23618K3((Status) com.google.android.gms.internal.base.zac.m20894b(parcel, Status.CREATOR));
        } else if (i2 == 6) {
            mo23620W3((Status) com.google.android.gms.internal.base.zac.m20894b(parcel, Status.CREATOR));
        } else if (i2 == 7) {
            mo23619W0((Status) com.google.android.gms.internal.base.zac.m20894b(parcel, Status.CREATOR), (GoogleSignInAccount) com.google.android.gms.internal.base.zac.m20894b(parcel, GoogleSignInAccount.CREATOR));
        } else {
            if (i2 != 8) {
                return false;
            }
            mo14065w1((zaj) com.google.android.gms.internal.base.zac.m20894b(parcel, zaj.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
