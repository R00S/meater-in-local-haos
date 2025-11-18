package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzzx extends zzfm implements zzzv {
    zzzx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzk zza(IObjectWrapper iObjectWrapper, zzyd zzydVar, String str, zzamp zzampVar, int i2) throws RemoteException {
        zzzk zzzmVar;
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        zzfo.m19950d(parcelM19944H, zzydVar);
        parcelM19944H.writeString(str);
        zzfo.m19949c(parcelM19944H, zzampVar);
        parcelM19944H.writeInt(i2);
        Parcel parcelM19945P = m19945P(1, parcelM19944H);
        IBinder strongBinder = parcelM19945P.readStrongBinder();
        if (strongBinder == null) {
            zzzmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzzmVar = iInterfaceQueryLocalInterface instanceof zzzk ? (zzzk) iInterfaceQueryLocalInterface : new zzzm(strongBinder);
        }
        parcelM19945P.recycle();
        return zzzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzk zzb(IObjectWrapper iObjectWrapper, zzyd zzydVar, String str, zzamp zzampVar, int i2) throws RemoteException {
        zzzk zzzmVar;
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        zzfo.m19950d(parcelM19944H, zzydVar);
        parcelM19944H.writeString(str);
        zzfo.m19949c(parcelM19944H, zzampVar);
        parcelM19944H.writeInt(i2);
        Parcel parcelM19945P = m19945P(2, parcelM19944H);
        IBinder strongBinder = parcelM19945P.readStrongBinder();
        if (strongBinder == null) {
            zzzmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzzmVar = iInterfaceQueryLocalInterface instanceof zzzk ? (zzzk) iInterfaceQueryLocalInterface : new zzzm(strongBinder);
        }
        parcelM19945P.recycle();
        return zzzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzaem zzc(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        zzfo.m19949c(parcelM19944H, iObjectWrapper2);
        Parcel parcelM19945P = m19945P(5, parcelM19944H);
        zzaem zzaemVarM16474h7 = zzaen.m16474h7(parcelM19945P.readStrongBinder());
        parcelM19945P.recycle();
        return zzaemVarM16474h7;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzaqg zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        Parcel parcelM19945P = m19945P(8, parcelM19944H);
        zzaqg zzaqgVarZzac = zzaqh.zzac(parcelM19945P.readStrongBinder());
        parcelM19945P.recycle();
        return zzaqgVarZzac;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzf zza(IObjectWrapper iObjectWrapper, String str, zzamp zzampVar, int i2) throws RemoteException {
        zzzf zzzhVar;
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        parcelM19944H.writeString(str);
        zzfo.m19949c(parcelM19944H, zzampVar);
        parcelM19944H.writeInt(i2);
        Parcel parcelM19945P = m19945P(3, parcelM19944H);
        IBinder strongBinder = parcelM19945P.readStrongBinder();
        if (strongBinder == null) {
            zzzhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (iInterfaceQueryLocalInterface instanceof zzzf) {
                zzzhVar = (zzzf) iInterfaceQueryLocalInterface;
            } else {
                zzzhVar = new zzzh(strongBinder);
            }
        }
        parcelM19945P.recycle();
        return zzzhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzatt zzb(IObjectWrapper iObjectWrapper, String str, zzamp zzampVar, int i2) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        parcelM19944H.writeString(str);
        zzfo.m19949c(parcelM19944H, zzampVar);
        parcelM19944H.writeInt(i2);
        Parcel parcelM19945P = m19945P(12, parcelM19944H);
        zzatt zzattVarM16944h7 = zzatu.m16944h7(parcelM19945P.readStrongBinder());
        parcelM19945P.recycle();
        return zzattVarM16944h7;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzasw zza(IObjectWrapper iObjectWrapper, zzamp zzampVar, int i2) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        zzfo.m19949c(parcelM19944H, zzampVar);
        parcelM19944H.writeInt(i2);
        Parcel parcelM19945P = m19945P(6, parcelM19944H);
        zzasw zzaswVarM16929h7 = zzasx.m16929h7(parcelM19945P.readStrongBinder());
        parcelM19945P.recycle();
        return zzaswVarM16929h7;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzaab zza(IObjectWrapper iObjectWrapper, int i2) throws RemoteException {
        zzaab zzaadVar;
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        parcelM19944H.writeInt(i2);
        Parcel parcelM19945P = m19945P(9, parcelM19944H);
        IBinder strongBinder = parcelM19945P.readStrongBinder();
        if (strongBinder == null) {
            zzaadVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (iInterfaceQueryLocalInterface instanceof zzaab) {
                zzaadVar = (zzaab) iInterfaceQueryLocalInterface;
            } else {
                zzaadVar = new zzaad(strongBinder);
            }
        }
        parcelM19945P.recycle();
        return zzaadVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzzk zza(IObjectWrapper iObjectWrapper, zzyd zzydVar, String str, int i2) throws RemoteException {
        zzzk zzzmVar;
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        zzfo.m19950d(parcelM19944H, zzydVar);
        parcelM19944H.writeString(str);
        parcelM19944H.writeInt(i2);
        Parcel parcelM19945P = m19945P(10, parcelM19944H);
        IBinder strongBinder = parcelM19945P.readStrongBinder();
        if (strongBinder == null) {
            zzzmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (iInterfaceQueryLocalInterface instanceof zzzk) {
                zzzmVar = (zzzk) iInterfaceQueryLocalInterface;
            } else {
                zzzmVar = new zzzm(strongBinder);
            }
        }
        parcelM19945P.recycle();
        return zzzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final zzaer zza(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        zzfo.m19949c(parcelM19944H, iObjectWrapper2);
        zzfo.m19949c(parcelM19944H, iObjectWrapper3);
        Parcel parcelM19945P = m19945P(11, parcelM19944H);
        zzaer zzaerVarM16476h7 = zzaes.m16476h7(parcelM19945P.readStrongBinder());
        parcelM19945P.recycle();
        return zzaerVarM16476h7;
    }
}
