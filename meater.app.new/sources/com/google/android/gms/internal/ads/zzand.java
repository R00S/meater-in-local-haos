package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public interface zzand extends IInterface {
    /* renamed from: A */
    void mo16762A(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: C */
    boolean mo16763C() throws RemoteException;

    /* renamed from: C0 */
    void mo16764C0(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: D */
    void mo16765D(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException;

    /* renamed from: D0 */
    zzaei mo16766D0() throws RemoteException;

    /* renamed from: I */
    IObjectWrapper mo16767I() throws RemoteException;

    /* renamed from: K */
    IObjectWrapper mo16768K() throws RemoteException;

    /* renamed from: M */
    boolean mo16769M() throws RemoteException;

    /* renamed from: N */
    void mo16770N(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: f */
    zzaea mo16771f() throws RemoteException;

    /* renamed from: g */
    String mo16772g() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    zzaar getVideoController() throws RemoteException;

    /* renamed from: h */
    String mo16773h() throws RemoteException;

    /* renamed from: i */
    String mo16774i() throws RemoteException;

    /* renamed from: j */
    IObjectWrapper mo16775j() throws RemoteException;

    /* renamed from: k */
    List mo16776k() throws RemoteException;

    void recordImpression() throws RemoteException;

    /* renamed from: w */
    String mo16777w() throws RemoteException;
}
