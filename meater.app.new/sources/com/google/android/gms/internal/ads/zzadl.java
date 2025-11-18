package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public interface zzadl extends IInterface {
    /* renamed from: M5 */
    String mo16454M5() throws RemoteException;

    String getContent() throws RemoteException;

    void recordClick() throws RemoteException;

    void recordImpression() throws RemoteException;

    /* renamed from: z1 */
    void mo16455z1(IObjectWrapper iObjectWrapper) throws RemoteException;
}
