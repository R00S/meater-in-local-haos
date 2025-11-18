package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzzw extends zzfn implements zzzv {
    public zzzw() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 1:
                zzzk zzzkVarZza = zza(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), (zzyd) zzfo.m19948b(parcel, zzyd.CREATOR), parcel.readString(), zzamq.m16696h7(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, zzzkVarZza);
                return true;
            case 2:
                zzzk zzzkVarZzb = zzb(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), (zzyd) zzfo.m19948b(parcel, zzyd.CREATOR), parcel.readString(), zzamq.m16696h7(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, zzzkVarZzb);
                return true;
            case 3:
                zzzf zzzfVarZza = zza(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), parcel.readString(), zzamq.m16696h7(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, zzzfVarZza);
                return true;
            case 4:
                zzaab zzaabVarZzg = zzg(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, zzaabVarZzg);
                return true;
            case 5:
                zzaem zzaemVarZzc = zzc(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, zzaemVarZzc);
                return true;
            case 6:
                zzasw zzaswVarZza = zza(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), zzamq.m16696h7(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, zzaswVarZza);
                return true;
            case 7:
                zzaqq zzaqqVarZzh = zzh(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, zzaqqVarZzh);
                return true;
            case 8:
                zzaqg zzaqgVarZzf = zzf(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, zzaqgVarZzf);
                return true;
            case 9:
                zzaab zzaabVarZza = zza(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, zzaabVarZza);
                return true;
            case 10:
                zzzk zzzkVarZza2 = zza(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), (zzyd) zzfo.m19948b(parcel, zzyd.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, zzzkVarZza2);
                return true;
            case 11:
                zzaer zzaerVarZza = zza(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, zzaerVarZza);
                return true;
            case 12:
                zzatt zzattVarZzb = zzb(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), parcel.readString(), zzamq.m16696h7(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, zzattVarZzb);
                return true;
            default:
                return false;
        }
    }
}
