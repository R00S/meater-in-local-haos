package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public interface zzasw extends IInterface {
    /* renamed from: M6 */
    void mo16384M6(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: T4 */
    void mo16385T4(zzasu zzasuVar) throws RemoteException;

    /* renamed from: T5 */
    void mo16386T5(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: d2 */
    void mo16387d2(IObjectWrapper iObjectWrapper) throws RemoteException;

    void destroy() throws RemoteException;

    /* renamed from: g5 */
    void mo16388g5(String str) throws RemoteException;

    Bundle getAdMetadata() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    /* renamed from: h0 */
    void mo16389h0(zzatb zzatbVar) throws RemoteException;

    /* renamed from: i4 */
    void mo16390i4(zzath zzathVar) throws RemoteException;

    boolean isLoaded() throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    /* renamed from: s0 */
    void mo16391s0(IObjectWrapper iObjectWrapper) throws RemoteException;

    void setCustomData(String str) throws RemoteException;

    void setImmersiveMode(boolean z) throws RemoteException;

    void setUserId(String str) throws RemoteException;

    void show() throws RemoteException;

    /* renamed from: z0 */
    void mo16392z0(zzzp zzzpVar) throws RemoteException;
}
