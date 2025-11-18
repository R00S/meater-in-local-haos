package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public interface zzams extends IInterface {
    /* renamed from: F2 */
    zzafe mo16697F2() throws RemoteException;

    /* renamed from: G4 */
    void mo16698G4(IObjectWrapper iObjectWrapper, zzaiq zzaiqVar, List<zzaiw> list) throws RemoteException;

    /* renamed from: H4 */
    void mo16699H4(IObjectWrapper iObjectWrapper, zzatk zzatkVar, List<String> list) throws RemoteException;

    /* renamed from: M3 */
    void mo16700M3(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, String str2, zzamv zzamvVar, zzady zzadyVar, List<String> list) throws RemoteException;

    /* renamed from: P1 */
    zzang mo16701P1() throws RemoteException;

    /* renamed from: Q2 */
    void mo16702Q2(zzxz zzxzVar, String str, String str2) throws RemoteException;

    /* renamed from: Y2 */
    void mo16703Y2(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, zzamv zzamvVar) throws RemoteException;

    /* renamed from: a4 */
    void mo16704a4(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: b7 */
    zzana mo16705b7() throws RemoteException;

    /* renamed from: c6 */
    void mo16706c6(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, String str2, zzamv zzamvVar) throws RemoteException;

    void destroy() throws RemoteException;

    /* renamed from: e6 */
    zzand mo16707e6() throws RemoteException;

    /* renamed from: f2 */
    void mo16708f2(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, zzamv zzamvVar) throws RemoteException;

    Bundle getInterstitialAdapterInfo() throws RemoteException;

    zzaar getVideoController() throws RemoteException;

    /* renamed from: h4 */
    void mo16709h4(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, zzatk zzatkVar, String str2) throws RemoteException;

    boolean isInitialized() throws RemoteException;

    /* renamed from: o6 */
    void mo16710o6(zzxz zzxzVar, String str) throws RemoteException;

    void pause() throws RemoteException;

    /* renamed from: r4 */
    Bundle mo16711r4() throws RemoteException;

    void resume() throws RemoteException;

    /* renamed from: s4 */
    void mo16712s4(IObjectWrapper iObjectWrapper, zzyd zzydVar, zzxz zzxzVar, String str, String str2, zzamv zzamvVar) throws RemoteException;

    void setImmersiveMode(boolean z) throws RemoteException;

    void showInterstitial() throws RemoteException;

    void showVideo() throws RemoteException;

    /* renamed from: w0 */
    void mo16713w0(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: x1 */
    IObjectWrapper mo16714x1() throws RemoteException;

    /* renamed from: x3 */
    boolean mo16715x3() throws RemoteException;

    /* renamed from: y2 */
    void mo16716y2(IObjectWrapper iObjectWrapper, zzyd zzydVar, zzxz zzxzVar, String str, zzamv zzamvVar) throws RemoteException;

    Bundle zzsh() throws RemoteException;
}
