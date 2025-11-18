package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzclb extends zzatl implements zzbsm {

    /* renamed from: f */
    private zzatk f24663f;

    /* renamed from: g */
    private zzbsn f24664g;

    /* renamed from: h */
    private zzbvo f24665h;

    @Override // com.google.android.gms.internal.ads.zzatk
    /* renamed from: F1 */
    public final synchronized void mo15303F1(IObjectWrapper iObjectWrapper, int i2) throws RemoteException {
        zzatk zzatkVar = this.f24663f;
        if (zzatkVar != null) {
            zzatkVar.mo15303F1(iObjectWrapper, i2);
        }
        zzbvo zzbvoVar = this.f24665h;
        if (zzbvoVar != null) {
            zzbvoVar.mo15112a(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    /* renamed from: G6 */
    public final synchronized void mo15304G6(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzatk zzatkVar = this.f24663f;
        if (zzatkVar != null) {
            zzatkVar.mo15304G6(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    /* renamed from: Y3 */
    public final synchronized void mo15305Y3(IObjectWrapper iObjectWrapper, zzato zzatoVar) throws RemoteException {
        zzatk zzatkVar = this.f24663f;
        if (zzatkVar != null) {
            zzatkVar.mo15305Y3(iObjectWrapper, zzatoVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    /* renamed from: Y5 */
    public final synchronized void mo15306Y5(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzatk zzatkVar = this.f24663f;
        if (zzatkVar != null) {
            zzatkVar.mo15306Y5(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    /* renamed from: a2 */
    public final synchronized void mo15307a2(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzatk zzatkVar = this.f24663f;
        if (zzatkVar != null) {
            zzatkVar.mo15307a2(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    /* renamed from: b5 */
    public final synchronized void mo15308b5(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzatk zzatkVar = this.f24663f;
        if (zzatkVar != null) {
            zzatkVar.mo15308b5(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    /* renamed from: c3 */
    public final synchronized void mo15309c3(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzatk zzatkVar = this.f24663f;
        if (zzatkVar != null) {
            zzatkVar.mo15309c3(iObjectWrapper);
        }
        zzbvo zzbvoVar = this.f24665h;
        if (zzbvoVar != null) {
            zzbvoVar.onInitializationSucceeded();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    /* renamed from: e4 */
    public final synchronized void mo15310e4(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzatk zzatkVar = this.f24663f;
        if (zzatkVar != null) {
            zzatkVar.mo15310e4(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    /* renamed from: f1 */
    public final synchronized void mo15311f1(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzatk zzatkVar = this.f24663f;
        if (zzatkVar != null) {
            zzatkVar.mo15311f1(iObjectWrapper);
        }
    }

    /* renamed from: i7 */
    public final synchronized void m18862i7(zzatk zzatkVar) {
        this.f24663f = zzatkVar;
    }

    /* renamed from: j7 */
    public final synchronized void m18863j7(zzbvo zzbvoVar) {
        this.f24665h = zzbvoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    /* renamed from: n6 */
    public final synchronized void mo18315n6(zzbsn zzbsnVar) {
        this.f24664g = zzbsnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    /* renamed from: q2 */
    public final synchronized void mo15312q2(IObjectWrapper iObjectWrapper, int i2) throws RemoteException {
        zzatk zzatkVar = this.f24663f;
        if (zzatkVar != null) {
            zzatkVar.mo15312q2(iObjectWrapper, i2);
        }
        zzbsn zzbsnVar = this.f24664g;
        if (zzbsnVar != null) {
            zzbsnVar.onAdFailedToLoad(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    /* renamed from: w3 */
    public final synchronized void mo15313w3(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzatk zzatkVar = this.f24663f;
        if (zzatkVar != null) {
            zzatkVar.mo15313w3(iObjectWrapper);
        }
        zzbsn zzbsnVar = this.f24664g;
        if (zzbsnVar != null) {
            zzbsnVar.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final synchronized void zzb(Bundle bundle) throws RemoteException {
        zzatk zzatkVar = this.f24663f;
        if (zzatkVar != null) {
            zzatkVar.zzb(bundle);
        }
    }
}
