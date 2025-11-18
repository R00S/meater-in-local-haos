package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public interface zzafe extends IInterface {
    /* renamed from: F3 */
    boolean mo16506F3(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: N1 */
    zzaei mo16507N1(String str) throws RemoteException;

    /* renamed from: U4 */
    IObjectWrapper mo16508U4() throws RemoteException;

    /* renamed from: Y0 */
    String mo16509Y0(String str) throws RemoteException;

    void destroy() throws RemoteException;

    List<String> getAvailableAssetNames() throws RemoteException;

    String getCustomTemplateId() throws RemoteException;

    zzaar getVideoController() throws RemoteException;

    void performClick(String str) throws RemoteException;

    /* renamed from: r */
    IObjectWrapper mo16510r() throws RemoteException;

    void recordImpression() throws RemoteException;
}
