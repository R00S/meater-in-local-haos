package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public interface zzamv extends IInterface {
    /* renamed from: F0 */
    void mo16717F0(zzafe zzafeVar, String str) throws RemoteException;

    /* renamed from: I6 */
    void mo16718I6() throws RemoteException;

    /* renamed from: R */
    void mo16719R(int i2) throws RemoteException;

    /* renamed from: b1 */
    void mo16720b1() throws RemoteException;

    /* renamed from: k1 */
    void mo16721k1(zzamy zzamyVar) throws RemoteException;

    /* renamed from: m3 */
    void mo16722m3(String str) throws RemoteException;

    /* renamed from: n0 */
    void mo16723n0() throws RemoteException;

    void onAdClicked() throws RemoteException;

    void onAdClosed() throws RemoteException;

    void onAdFailedToLoad(int i2) throws RemoteException;

    void onAdImpression() throws RemoteException;

    void onAdLeftApplication() throws RemoteException;

    void onAdLoaded() throws RemoteException;

    void onAdOpened() throws RemoteException;

    void onAppEvent(String str, String str2) throws RemoteException;

    void onVideoPause() throws RemoteException;

    void onVideoPlay() throws RemoteException;

    /* renamed from: t5 */
    void mo16724t5(zzato zzatoVar) throws RemoteException;

    /* renamed from: v0 */
    void mo16725v0(zzatq zzatqVar) throws RemoteException;

    void zzb(Bundle bundle) throws RemoteException;
}
