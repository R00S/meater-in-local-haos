package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public interface zzana extends IInterface {
    /* renamed from: A */
    void mo16745A(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: C */
    boolean mo16746C() throws RemoteException;

    /* renamed from: C0 */
    void mo16747C0(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: D */
    void mo16748D(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException;

    /* renamed from: I */
    IObjectWrapper mo16749I() throws RemoteException;

    /* renamed from: K */
    IObjectWrapper mo16750K() throws RemoteException;

    /* renamed from: M */
    boolean mo16751M() throws RemoteException;

    /* renamed from: N */
    void mo16752N(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: f */
    zzaea mo16753f() throws RemoteException;

    /* renamed from: g */
    String mo16754g() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    String getStore() throws RemoteException;

    zzaar getVideoController() throws RemoteException;

    /* renamed from: h */
    String mo16755h() throws RemoteException;

    /* renamed from: i */
    String mo16756i() throws RemoteException;

    /* renamed from: j */
    IObjectWrapper mo16757j() throws RemoteException;

    /* renamed from: k */
    List mo16758k() throws RemoteException;

    /* renamed from: n */
    zzaei mo16759n() throws RemoteException;

    /* renamed from: o */
    String mo16760o() throws RemoteException;

    void recordImpression() throws RemoteException;

    /* renamed from: t */
    double mo16761t() throws RemoteException;
}
