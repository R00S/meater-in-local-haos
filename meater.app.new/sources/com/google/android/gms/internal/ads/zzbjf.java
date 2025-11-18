package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface zzbjf extends IInterface {
    /* renamed from: E2 */
    long mo16672E2() throws RemoteException;

    /* renamed from: I3 */
    int mo16673I3(String str) throws RemoteException;

    /* renamed from: J2 */
    String mo16674J2() throws RemoteException;

    /* renamed from: L4 */
    List mo16675L4(String str, String str2) throws RemoteException;

    /* renamed from: N5 */
    void mo16676N5(String str, String str2, IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: O4 */
    String mo16677O4() throws RemoteException;

    /* renamed from: O5 */
    void mo16678O5(String str) throws RemoteException;

    /* renamed from: Q4 */
    void mo16679Q4(Bundle bundle) throws RemoteException;

    /* renamed from: V6 */
    void mo16680V6(String str) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    /* renamed from: d4 */
    Map mo16681d4(String str, String str2, boolean z) throws RemoteException;

    /* renamed from: e1 */
    void mo16682e1(Bundle bundle) throws RemoteException;

    /* renamed from: g2 */
    String mo16683g2() throws RemoteException;

    /* renamed from: l4 */
    String mo16684l4() throws RemoteException;

    /* renamed from: m0 */
    void mo16685m0(String str, String str2, Bundle bundle) throws RemoteException;

    /* renamed from: o4 */
    String mo16686o4() throws RemoteException;

    /* renamed from: s2 */
    Bundle mo16687s2(Bundle bundle) throws RemoteException;

    /* renamed from: z4 */
    void mo16688z4(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException;
}
