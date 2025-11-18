package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public interface zzzk extends IInterface {
    /* renamed from: B */
    boolean mo16341B() throws RemoteException;

    /* renamed from: C2 */
    void mo16342C2(zzyd zzydVar) throws RemoteException;

    /* renamed from: C3 */
    void mo16343C3(zzaqt zzaqtVar, String str) throws RemoteException;

    /* renamed from: C5 */
    zzyd mo16344C5() throws RemoteException;

    /* renamed from: H6 */
    void mo16345H6(zzado zzadoVar) throws RemoteException;

    /* renamed from: I4 */
    zzzs mo16346I4() throws RemoteException;

    /* renamed from: J4 */
    boolean mo16347J4(zzxz zzxzVar) throws RemoteException;

    /* renamed from: L0 */
    void mo16348L0(zzyz zzyzVar) throws RemoteException;

    /* renamed from: P5 */
    void mo16349P5(zzzs zzzsVar) throws RemoteException;

    /* renamed from: S0 */
    IObjectWrapper mo16350S0() throws RemoteException;

    /* renamed from: U5 */
    void mo16351U5(zzaqn zzaqnVar) throws RemoteException;

    /* renamed from: W6 */
    void mo16352W6(zzacd zzacdVar) throws RemoteException;

    /* renamed from: X5 */
    void mo16353X5(zzaax zzaaxVar) throws RemoteException;

    /* renamed from: c0 */
    String mo16354c0() throws RemoteException;

    void destroy() throws RemoteException;

    /* renamed from: f6 */
    String mo16355f6() throws RemoteException;

    Bundle getAdMetadata() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    zzaar getVideoController() throws RemoteException;

    /* renamed from: h0 */
    void mo16356h0(zzatb zzatbVar) throws RemoteException;

    /* renamed from: k4 */
    void mo16357k4() throws RemoteException;

    /* renamed from: m4 */
    void mo16358m4(String str) throws RemoteException;

    /* renamed from: p0 */
    boolean mo16359p0() throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    void setImmersiveMode(boolean z) throws RemoteException;

    void setUserId(String str) throws RemoteException;

    void showInterstitial() throws RemoteException;

    /* renamed from: t1 */
    void mo16360t1(boolean z) throws RemoteException;

    /* renamed from: v4 */
    void mo16361v4(zzzy zzzyVar) throws RemoteException;

    /* renamed from: w4 */
    void mo16362w4(zzyw zzywVar) throws RemoteException;

    /* renamed from: x5 */
    zzyz mo16363x5() throws RemoteException;

    /* renamed from: x6 */
    void mo16364x6() throws RemoteException;

    /* renamed from: z0 */
    void mo16365z0(zzzp zzzpVar) throws RemoteException;
}
