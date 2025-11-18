package com.google.android.gms.internal.auth;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzl;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public interface zzx extends IInterface {
    /* renamed from: J5 */
    void mo20881J5(Status status) throws RemoteException;

    /* renamed from: Q0 */
    void mo20882Q0(Status status, com.google.android.gms.auth.api.accounttransfer.zzt zztVar) throws RemoteException;

    /* renamed from: R5 */
    void mo20883R5(Status status) throws RemoteException;

    /* renamed from: S2 */
    void mo20884S2(DeviceMetaData deviceMetaData) throws RemoteException;

    /* renamed from: d */
    void mo20885d() throws RemoteException;

    /* renamed from: i0 */
    void mo20886i0(byte[] bArr) throws RemoteException;

    /* renamed from: j1 */
    void mo20887j1(Status status, zzl zzlVar) throws RemoteException;
}
