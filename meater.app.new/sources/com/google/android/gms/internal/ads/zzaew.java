package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public interface zzaew extends IInterface {
    /* renamed from: E */
    boolean mo16478E(Bundle bundle) throws RemoteException;

    /* renamed from: L */
    void mo16479L(Bundle bundle) throws RemoteException;

    void destroy() throws RemoteException;

    /* renamed from: f */
    zzaea mo16480f() throws RemoteException;

    /* renamed from: g */
    String mo16481g() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    String getStore() throws RemoteException;

    zzaar getVideoController() throws RemoteException;

    /* renamed from: h */
    String mo16482h() throws RemoteException;

    /* renamed from: i */
    String mo16483i() throws RemoteException;

    /* renamed from: j */
    IObjectWrapper mo16484j() throws RemoteException;

    /* renamed from: k */
    List mo16485k() throws RemoteException;

    /* renamed from: n */
    zzaei mo16486n() throws RemoteException;

    /* renamed from: o */
    String mo16487o() throws RemoteException;

    /* renamed from: r */
    IObjectWrapper mo16488r() throws RemoteException;

    /* renamed from: t */
    double mo16489t() throws RemoteException;

    /* renamed from: z */
    void mo16490z(Bundle bundle) throws RemoteException;
}
