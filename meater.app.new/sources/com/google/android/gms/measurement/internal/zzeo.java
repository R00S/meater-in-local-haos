package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzc;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public abstract class zzeo extends zzc implements zzel {
    public zzeo() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.zzc
    /* renamed from: H */
    protected final boolean mo22099H(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 1:
                mo23086Z5((zzan) com.google.android.gms.internal.measurement.zzb.m21491a(parcel, zzan.CREATOR), (zzm) com.google.android.gms.internal.measurement.zzb.m21491a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                mo23087b4((zzkj) com.google.android.gms.internal.measurement.zzb.m21491a(parcel, zzkj.CREATOR), (zzm) com.google.android.gms.internal.measurement.zzb.m21491a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                mo23094s6((zzm) com.google.android.gms.internal.measurement.zzb.m21491a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                mo23091j6((zzan) com.google.android.gms.internal.measurement.zzb.m21491a(parcel, zzan.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                mo23085U3((zzm) com.google.android.gms.internal.measurement.zzb.m21491a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                List<zzkj> listMo23080I1 = mo23080I1((zzm) com.google.android.gms.internal.measurement.zzb.m21491a(parcel, zzm.CREATOR), com.google.android.gms.internal.measurement.zzb.m21495e(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo23080I1);
                return true;
            case 9:
                byte[] bArrMo23084T1 = mo23084T1((zzan) com.google.android.gms.internal.measurement.zzb.m21491a(parcel, zzan.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrMo23084T1);
                return true;
            case 10:
                mo23090j3(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String strMo23082P4 = mo23082P4((zzm) com.google.android.gms.internal.measurement.zzb.m21491a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(strMo23082P4);
                return true;
            case 12:
                mo23089h2((zzv) com.google.android.gms.internal.measurement.zzb.m21491a(parcel, zzv.CREATOR), (zzm) com.google.android.gms.internal.measurement.zzb.m21491a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                mo23083R6((zzv) com.google.android.gms.internal.measurement.zzb.m21491a(parcel, zzv.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                List<zzkj> listMo23088f3 = mo23088f3(parcel.readString(), parcel.readString(), com.google.android.gms.internal.measurement.zzb.m21495e(parcel), (zzm) com.google.android.gms.internal.measurement.zzb.m21491a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo23088f3);
                return true;
            case 15:
                List<zzkj> listMo23081K1 = mo23081K1(parcel.readString(), parcel.readString(), parcel.readString(), com.google.android.gms.internal.measurement.zzb.m21495e(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo23081K1);
                return true;
            case 16:
                List<zzv> listMo23079A2 = mo23079A2(parcel.readString(), parcel.readString(), (zzm) com.google.android.gms.internal.measurement.zzb.m21491a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo23079A2);
                return true;
            case 17:
                List<zzv> listMo23093r3 = mo23093r3(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo23093r3);
                return true;
            case 18:
                mo23092r2((zzm) com.google.android.gms.internal.measurement.zzb.m21491a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
