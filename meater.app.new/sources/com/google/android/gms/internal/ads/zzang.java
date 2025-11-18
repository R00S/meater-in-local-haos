package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public interface zzang extends IInterface {
    /* renamed from: A */
    void mo16778A(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: C */
    boolean mo16779C() throws RemoteException;

    /* renamed from: D */
    void mo16780D(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException;

    /* renamed from: I */
    IObjectWrapper mo16781I() throws RemoteException;

    /* renamed from: K */
    IObjectWrapper mo16782K() throws RemoteException;

    /* renamed from: M */
    boolean mo16783M() throws RemoteException;

    /* renamed from: N */
    void mo16784N(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: X3 */
    float mo16785X3() throws RemoteException;

    /* renamed from: f */
    zzaea mo16786f() throws RemoteException;

    /* renamed from: g */
    String mo16787g() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    String getStore() throws RemoteException;

    zzaar getVideoController() throws RemoteException;

    /* renamed from: h */
    String mo16788h() throws RemoteException;

    /* renamed from: i */
    String mo16789i() throws RemoteException;

    /* renamed from: j */
    IObjectWrapper mo16790j() throws RemoteException;

    /* renamed from: k */
    List mo16791k() throws RemoteException;

    /* renamed from: n */
    zzaei mo16792n() throws RemoteException;

    /* renamed from: o */
    String mo16793o() throws RemoteException;

    void recordImpression() throws RemoteException;

    /* renamed from: t */
    double mo16794t() throws RemoteException;

    /* renamed from: w */
    String mo16795w() throws RemoteException;
}
