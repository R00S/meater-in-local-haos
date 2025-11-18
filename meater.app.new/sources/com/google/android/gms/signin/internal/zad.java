package com.google.android.gms.signin.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public interface zad extends IInterface {
    /* renamed from: K3 */
    void mo23618K3(Status status) throws RemoteException;

    /* renamed from: W0 */
    void mo23619W0(Status status, GoogleSignInAccount googleSignInAccount) throws RemoteException;

    /* renamed from: W3 */
    void mo23620W3(Status status) throws RemoteException;

    /* renamed from: X4 */
    void mo23621X4(ConnectionResult connectionResult, zaa zaaVar) throws RemoteException;

    /* renamed from: w1 */
    void mo14065w1(zaj zajVar) throws RemoteException;
}
