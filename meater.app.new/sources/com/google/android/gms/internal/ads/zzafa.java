package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public interface zzafa extends IInterface {
    /* renamed from: D0 */
    zzaei mo16493D0() throws RemoteException;

    /* renamed from: E */
    boolean mo16494E(Bundle bundle) throws RemoteException;

    /* renamed from: L */
    void mo16495L(Bundle bundle) throws RemoteException;

    void destroy() throws RemoteException;

    /* renamed from: f */
    zzaea mo16496f() throws RemoteException;

    /* renamed from: g */
    String mo16497g() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    zzaar getVideoController() throws RemoteException;

    /* renamed from: h */
    String mo16498h() throws RemoteException;

    /* renamed from: i */
    String mo16499i() throws RemoteException;

    /* renamed from: j */
    IObjectWrapper mo16500j() throws RemoteException;

    /* renamed from: k */
    List mo16501k() throws RemoteException;

    /* renamed from: r */
    IObjectWrapper mo16502r() throws RemoteException;

    /* renamed from: w */
    String mo16503w() throws RemoteException;

    /* renamed from: z */
    void mo16504z(Bundle bundle) throws RemoteException;
}
