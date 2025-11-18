package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public interface zzaiq extends IInterface {
    void onInitializationFailed(String str) throws RemoteException;

    void onInitializationSucceeded() throws RemoteException;
}
