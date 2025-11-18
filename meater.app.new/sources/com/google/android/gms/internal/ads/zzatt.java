package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public interface zzatt extends IInterface {
    /* renamed from: G5 */
    void mo16375G5(zzaao zzaaoVar) throws RemoteException;

    /* renamed from: K2 */
    void mo16376K2(zzaue zzaueVar) throws RemoteException;

    /* renamed from: L5 */
    void mo16377L5(zzatw zzatwVar) throws RemoteException;

    /* renamed from: O6 */
    zzatq mo16378O6() throws RemoteException;

    /* renamed from: W1 */
    void mo16379W1(zzxz zzxzVar, zzaub zzaubVar) throws RemoteException;

    /* renamed from: e7 */
    void mo16380e7(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException;

    /* renamed from: f5 */
    void mo16381f5(IObjectWrapper iObjectWrapper) throws RemoteException;

    Bundle getAdMetadata() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    boolean isLoaded() throws RemoteException;

    /* renamed from: m2 */
    void mo16382m2(zzaum zzaumVar) throws RemoteException;
}
